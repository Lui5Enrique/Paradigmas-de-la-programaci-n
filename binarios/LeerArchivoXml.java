package binarios;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;

public class LeerArchivoXml {
    public static void main(String[] args) {
        try {
            // Specify the XML file to read
            File archivoXML = new File("usuarios.xml");

            // Create an XML document constructor factory
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            // Create an XML document constructor
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Parse the XML file and get a Document object
            Document doc = dBuilder.parse(archivoXML);

            // Normalize the document (optional but recommended)
            doc.getDocumentElement().normalize();

            // Print the name of the root element of the XML document
            System.out.print("Identificación: " + doc.getDocumentElement().getNodeName());

            // Get the list of "user" nodes in the XML document
            NodeList nodeList = doc.getElementsByTagName("usuario");

            // Iterate through the list of "user" nodes
            for (int temp = 0; temp < nodeList.getLength(); temp++) {
                // Get the "user" element at position 'temp'
                Element usuario = (Element) nodeList.item(temp);

                // Get the content of the "name" and "age" elements within each "user"
                String nombre = usuario.getElementsByTagName("nombre").item(0).getTextContent();
                String edad = usuario.getElementsByTagName("edad").item(0).getTextContent();

                // Print user information to the console
                System.out.println("\nUsuario " + (temp + 1));
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
            }
        } catch (Exception e) {
            // Handle exceptions, such as problems reading the file or parsing the XML
            e.printStackTrace();
        }
    }
}