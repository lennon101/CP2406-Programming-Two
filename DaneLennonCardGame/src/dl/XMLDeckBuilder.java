
package dl;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.io.File;

public class XMLDeckBuilder implements DeckBuilder {

    private String _filePath;
    private Deck _deck;
    private boolean _hasBeenRead = false;

    public XMLDeckBuilder(String filePath) {
        _filePath = filePath;
        _deck = new BasicDeck();
    }

    @Override
    public Deck deck() {
        if (!_hasBeenRead) {
            readXMLFile();
            _hasBeenRead = true;
        }
        return _deck;
    }

    private void stripEmptyLines(Document doc) {
        try {
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPathExpression xpathExp = xpathFactory.newXPath().compile("//text()[normalize-space(.) = '']");
            NodeList emptyTextNodes = (NodeList) xpathExp.evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i < emptyTextNodes.getLength(); i++) {
                Node emptyTextNode = emptyTextNodes.item(i);
                emptyTextNode.getParentNode().removeChild(emptyTextNode);
            }
        } catch (XPathExpressionException e) {
            System.out.println("XPath Expression Issue");
        }
    }

    private void readXMLFile() {
        try {
            File inputFile = new File(_filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            stripEmptyLines(doc);

            XPath xPath = XPathFactory.newInstance().newXPath();
            NodeList cardList = (NodeList) xPath.evaluate("/plist/dict[key='cards']/array/dict", doc.getDocumentElement(), XPathConstants.NODESET);

            for (int index = 0; index < cardList.getLength(); index++) {
                try {
                    _deck.add(extractCard(cardList.item(index).getChildNodes()));
                } catch (CardNotFoundException ex) {
                    System.out.println("Card not found for specific dict key");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class CardNotFoundException extends Exception {

    }

    private Card extractCard(NodeList list) throws CardNotFoundException {
        //function is passed list = cardList.item(index).getChildNodes()

        boolean foundCard = false;
        boolean foundPlayCard = false;
        boolean foundTrumpCard = false;
        boolean foundRuleCard = false;

        String cardTitle = "";
        String fileName = "";
        String imageName = "";

        for (int i = 1; i < list.getLength(); i++) {
            Node xmlNode = list.item(i);

            if (xmlNode.getPreviousSibling().getTextContent().equals("card_type") && xmlNode.getTextContent().equals("play")) {
                System.out.println("found play card");
                foundPlayCard = true;
            } else if (xmlNode.getPreviousSibling().getTextContent().equals("card_type") && xmlNode.getTextContent().equals("trump")) {
                System.out.println("found trump card");
                foundTrumpCard = true;
            } else if (xmlNode.getPreviousSibling().getTextContent().equals("card_type") && xmlNode.getTextContent().equals("rule")) {
                System.out.println("found rule card");
                foundRuleCard = true;
            }

            if (foundPlayCard){
                extractPlayCard(list);
            } else if (foundTrumpCard){
                extractTrumpCard
            }

            if (xmlNode.getPreviousSibling().getTextContent().equals("fileName") && xmlNode.getNodeName().equals("string")) {
                foundCard = true;
                fileName = xmlNode.getTextContent();
            } else if (xmlNode.getPreviousSibling().getTextContent().equals("imageName") && xmlNode.getNodeName().equals("string")) {
                imageName = xmlNode.getTextContent();
            } else if (xmlNode.getPreviousSibling().getTextContent().equals("title") && xmlNode.getNodeName().equals("string")) {
                cardTitle = xmlNode.getTextContent();
            }

        }

        if (foundCard) {
            return new BasicCard(cardTitle, imageName, fileName);
        } else {
            throw new CardNotFoundException();
        }
    }
}
