//taken from: http://www.codecoffee.com/articles/xml1.html

package com.DL;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.*;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Parser{

    public static void main (String argv []){
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("MstCards_151021.plist"));

            // normalize text representation
            doc.getDocumentElement ().normalize ();
            System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());

            NodeList listOfCards = doc.getElementsByTagName("dict");
            int totalCards = listOfCards.getLength();
            System.out.println("Total no of Cards : " + totalCards);

            for(int s=0; s<totalCards; s++){

                Node firstCardNode = listOfCards.item(s);
                System.out.println(listOfCards.item(s));

                if(firstCardNode.getNodeType() == Node.ELEMENT_NODE){

                    Element firstPersonElement = (Element)firstCardNode;

                    //-------
                    NodeList firstNameList = firstPersonElement.getElementsByTagName("imageName");
                    Element firstNameElement = (Element)firstNameList.item(0);

                    NodeList textFNList = firstNameElement.getChildNodes();
                    System.out.println("First Name : " + textFNList.item(0).getNodeValue().trim());

                    //-------
                    NodeList lastNameList = firstPersonElement.getElementsByTagName("last");
                    Element lastNameElement = (Element)lastNameList.item(0);

                    NodeList textLNList = lastNameElement.getChildNodes();
                    System.out.println("Last Name : " + textLNList.item(0).getNodeValue().trim());

                    //----
                    NodeList ageList = firstPersonElement.getElementsByTagName("age");
                    Element ageElement = (Element)ageList.item(0);

                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("Age : " + textAgeList.item(0).getNodeValue().trim());
                }//end of if clause
            }//end of for loop with s var

        }catch (SAXParseException err) {
            System.out.println ("** Parsing error" + ", line " + err.getLineNumber () + ", uri " + err.getSystemId ());
            System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
            Exception x = e.getException ();
            ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
            t.printStackTrace ();
        }
        //System.exit (0);
    }//end of main
}