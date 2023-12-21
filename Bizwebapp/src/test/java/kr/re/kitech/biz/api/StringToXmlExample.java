/**
 * 
 */
package kr.re.kitech.biz.api;

import java.io.File;

/**
 * 
 * @author James
 * @since 2022. 5. 30.
 */
 
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class StringToXmlExample {
	public static void main(String[] args) {
	    final String xmlStr = "\n" +
	    			"<employees>\n" + 
	                "	<employee id=\"101\">\n" + 
	                "		<name>Lokesh Gupta</name>\n" + 
	                "		<title>Author</title>\n" + 
	                "	</employee>\n" + 
	                "	<employee id=\"102\">\n" + 
	                "		<name>Brian Lara</name>\n" + 
	                "		<title>Cricketer</title>\n" + 
	                "	</employee>\n" + 
	                "</employees>\n";
	    
	    final String xmlFilePath = "employees.xml";


		// Use method to convert XML string content to XML Document object
		Document doc = convertStringToXMLDocument(xmlStr);

		// Verify XML document is build correctly
		System.out.println(doc.getFirstChild().getNodeName());
		
		// Use method to convert XML document object to XML string
		String str = documentToString(doc);
		System.out.println(str);
		
		JSONObject json = XML.toJSONObject(str);
		String jsonStr = json.toString(4);
		System.out.println(jsonStr);
		
		
	}

	/**
	 * String -> Document
	 * @param xmlString
	 * @return
	 */
	private static Document convertStringToXMLDocument(String xmlString) {
		// Parser that produces DOM object trees from XML content
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// API to obtain DOM Document instance
		DocumentBuilder builder = null;
		try {
			// Create DocumentBuilder with default configuration
			builder = factory.newDocumentBuilder();

			// Parse the content to Document object
			Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * File -> Document
	 * @param filePath
	 * @return
	 */
	private static Document convertXMLFileToXMLDocument(String filePath) {
		// Parser that produces DOM object trees from XML content
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// API to obtain DOM Document instance
		DocumentBuilder builder = null;
		try {
			// Create DocumentBuilder with default configuration
			builder = factory.newDocumentBuilder();

			// Parse the content to Document object
			Document doc = builder.parse(new File(filePath));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Document -> String
	 * @param doc
	 * @return
	 */
	public static String documentToString(Document doc) {
		try {
			StringWriter clsOutput = new StringWriter();
			Transformer transformer = TransformerFactory.newInstance().newTransformer();

			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

			transformer.transform(new DOMSource(doc), new StreamResult(clsOutput));

			return clsOutput.toString();
		} catch (Exception ex) {
			return "";
		}
	}	
}
 