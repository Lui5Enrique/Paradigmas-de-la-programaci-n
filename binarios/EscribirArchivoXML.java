package binarios;

import java.io.File;
import java.io.FileOutputStream;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EscribirArchivoXML {
    public static void main(String[] args) {
        try {
            // Create an XML document constructor factory
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

           // Create an XML document constructor
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Create a new XML document
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("usuarios");
            doc.appendChild(rootElement);

            // First user
            Element usuario1 = doc.createElement("usuario");
            rootElement.appendChild(usuario1);

            // First user name
            Element nombre1 = doc.createElement("nombre");
            nombre1.appendChild(doc.createTextNode("Miguel Rodriguez"));
            usuario1.appendChild(nombre1);

            // Age of first user
            Element edad1 = doc.createElement("edad");
            edad1.appendChild(doc.createTextNode("21"));
            usuario1.appendChild(edad1);

            // Configure the XML transformation
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            // Specify the output file
            File archivoXML = new File("usuarios.xml");
            FileOutputStream archivo = new FileOutputStream(archivoXML);
            StreamResult result = new StreamResult(archivo);

            // Apply the transformation and write the content to the XML file
            transformer.transform(source, result);

            System.out.println("El archivo XML fue creado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}