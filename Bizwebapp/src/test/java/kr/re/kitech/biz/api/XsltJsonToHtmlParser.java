/**
 * 
 */
package kr.re.kitech.biz.api;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.xalan.xsltc.trax.TransformerFactoryImpl;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 * XML -> XSLT -> Other formats
 * @author James
 * @since 2022. 5. 31.
 */
public class XsltJsonToHtmlParser{

	private static final String JSON_FILENAME = "src/test/java/kr/re/kitech/biz/api/xsl/CgsVacaReqData.json";
    private static final String XSLT_FILENAME = "src/test/java/kr/re/kitech/biz/api/xsl/CgsVacaReqTemplate.xsl";
    private static final String HTML_FILENAME = "src/test/java/kr/re/kitech/biz/api/xsl/CgsVacaReqSnap.html";

    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
        
        
            // output
            String jsonString = "";
			Path jsonPath = Paths.get( JSON_FILENAME);
			try (Stream<String> lines = Files.lines(jsonPath)) {
				jsonString = lines.collect(Collectors.joining("\n"));
				System.out.println(jsonString);
			}        	
        
			// create instance of JSONObject by passing jsonString to the constructor  
	        JSONObject jsonObject = new JSONObject(jsonString);  
	        System.out.println(jsonObject);
	        
	 
	        // use XML.toString() method to convert JSON into XML and store the result into a string  
	        // String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<"+root+">" + XML.toString(jsonObject) + "</"+root+">";  
	        String xml = prettyPrintByTransformer(XML.toString(jsonObject), 2, true);        
	        
	        
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xml);

            // transform xml to html via a xslt file
            try (FileOutputStream output = new FileOutputStream( HTML_FILENAME)) {
                transform(doc, output);
            }
            
            // output
			Path htmPath = Paths.get( HTML_FILENAME);
			try (Stream<String> lines = Files.lines(htmPath)) {
				String data = lines.collect(Collectors.joining("\n"));
				System.out.println(data);
			}
			
//			BufferedReader reader = Files.newBufferedReader(path);
//			String line = reader.readLine();

        } catch (IOException | ParserConfigurationException | SAXException | TransformerException e) {
            e.printStackTrace();
        }

    }
    
	public static String prettyPrintByTransformer(String xmlString, int indent, boolean ignoreDeclaration) {
	    try {
	        InputSource src = new InputSource(new StringReader(xmlString));
	        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src);
	
	        TransformerFactory transformerFactory = new TransformerFactoryImpl();
	        transformerFactory.setAttribute("indent-number", indent);
	        Transformer transformer = transformerFactory.newTransformer();
	        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, ignoreDeclaration ? "yes" : "no");
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	
	        Writer out = new StringWriter();
	        transformer.transform(new DOMSource(document), new StreamResult(out));
	        return out.toString();
	    } catch (Exception e) {
	    	System.out.println(e);
	        throw new RuntimeException("Error occurs when pretty-printing xml:\n" + xmlString, e);
	    }
	}

    /**
     * XSLT 변환
 	 * 
	 * @param doc
     * @param output
     * @throws TransformerException
     */
    private static void transform(Document doc, OutputStream output)
            throws TransformerException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource source = new StreamSource(new File(XSLT_FILENAME));
        
        // StreamSource source = new InputSource(new StringReader(xmlString));
        // add XSLT in Transformer
        Transformer transformer = transformerFactory.newTransformer( source);
        transformer.transform(new DOMSource(doc), new StreamResult(output));
    }
    
    

}