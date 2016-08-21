// This file demonstates a simple use of the parser and DOM API.
// The XML file that is given to the application is parsed and the
// elements and attributes in the document are printed.
// The use of setting the parser options is demonstrated.
//

import java.io.*;
import java.net.*;
import org.w3c.dom.*;
import org.w3c.dom.Node;

import oracle.xml.parser.v2.*;

public class DOMSample
{
    static public void main(String[] argv)
    {
        try
        {
            if (argv.length != 1)
            {
                // Must pass in the name of the XML file.
                System.err.println("Usage: java DOMSample filename");
                System.exit(1);
            }

            // Get an instance of the parser
            DOMParser parser = new DOMParser();

            // Generate a URL from the filename.
            URL url = createURL(argv[0]);

            // Set various parser options: validation on,
            // warnings shown, error stream set to stderr.
            parser.setErrorStream(System.err);
            parser.setValidationMode(true);
            parser.showWarnings(true);

            // Parse the document.
            parser.parse(url);

            // Obtain the document.
            XMLDocument doc = parser.getDocument();

            // Print document elements
            System.out.print("The elements are: ");
            printElements(doc);

            // Print document element attributes
            System.out.println("The attributes of each element are: ");
            printElementAttributes(doc);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    static void printElements(Document doc)
    {
        NodeList nl = doc.getElementsByTagName("*");
        Node n;

        for (int i=0; i<nl.getLength(); i++)
        {
            n = nl.item(i);
            System.out.print(n.getNodeName() + " ");
        }

        System.out.println();
    }

    static void printElementAttributes(Document doc)
    {
        NodeList nl = doc.getElementsByTagName("*");
        Element e;
        Node n;
        NamedNodeMap nnm;

        String attrname;
        String attrval;
        int i, len;

        len = nl.getLength();

        for (int j=0; j < len; j++)
        {
            e = (Element)nl.item(j);
            System.out.println(e.getTagName() + ":");
            nnm = e.getAttributes();

            if (nnm != null)
            {
                for (i=0; i<nnm.getLength(); i++)
                {
                    n = nnm.item(i);
                    attrname = n.getNodeName();
                    attrval = n.getNodeValue();
                    System.out.print(" " + attrname + " = " + attrval);
                }
            }
            System.out.println();
        }
    }

    static URL createURL(String fileName)
    {
        URL url = null;
        try
        {
            url = new URL(fileName);
        }
        catch (MalformedURLException ex)
        {
            File f = new File(fileName);
            try
            {
                String path = f.getAbsolutePath();
                String fs = System.getProperty("file.separator");
                if (fs.length() == 1)
                {
                    char sep = fs.charAt(0);
                    if (sep != '/')
                        path = path.replace(sep, '/');
                    if (path.charAt(0) != '/')
                        path = '/' + path;
                }
                path = "file://" + path;
                url = new URL(path);
            }
            catch (MalformedURLException e)
            {
                System.out.println("Cannot create url for: " + fileName);
                System.exit(0);
            }
        }
        return url;
    }
}
