/**
 * 
 */
package kr.re.kitech.biz.api;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
 * <(\w*)\s*(value="(.*)")/> ====> <$1>$3</$1>
 *
 * @author James
 * @since 2022. 5. 31.
 */
public class XsltXmlToHtmlParser{

	private static final String XML_FILENAME = "src/test/java/kr/re/kitech/biz/api/xsl/CgsVacaReqData.xml";
    private static final String XSLT_FILENAME = "src/test/java/kr/re/kitech/biz/api/xsl/CgsVacaReqTemplate.xsl";
    private static final String HTML_FILENAME = "src/test/java/kr/re/kitech/biz/api/xsl/CgsVacaReqSnap.html";

    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try (InputStream is = new FileInputStream(XML_FILENAME)) {

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);
           
            System.out.println("===============================] EIP2 XML [=================================");
            System.out.println(documentToString(doc));
            
            System.out.println("===============================] EIP3 JSON [================================");
            JSONObject json = XML.toJSONObject(documentToString(doc));
            System.out.println(json);
            
            System.out.println("===============================] FINAL XML [================================");
            String xml = prettyPrintByTransformer(XML.toString(json), 2, true);
            System.out.println(xml);

            doc = builder.parse(new InputSource(new StringReader(xml)));

            // transform xml to html via a xslt file
            try (FileOutputStream output = new FileOutputStream( HTML_FILENAME)) {
                transform(doc, output);
            }
            
            // output
			Path path = Paths.get( HTML_FILENAME);
			try (Stream<String> lines = Files.lines(path)) {
				String data = lines.collect(Collectors.joining("\n"));
				System.out.println(data);
			}
			
//			BufferedReader reader = Files.newBufferedReader(path);
//			String line = reader.readLine();

        } catch (IOException | ParserConfigurationException | SAXException | TransformerException e) {
            e.printStackTrace();
        }

    }
    
	/**
	 * xml to String
	 * @param xmlString
	 * @param indent
	 * @param ignoreDeclaration
	 * @return
	 */
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
     * document to string
     *
     * @param doc
     * @return
     * @throws TransformerException
     */
    public static String documentToString(Document doc) throws TransformerException {
	    DOMSource domSource = new DOMSource(doc);
	    StringWriter writer = new StringWriter();
	    StreamResult result = new StreamResult(writer);
	    TransformerFactory tf = TransformerFactory.newInstance();
	    Transformer transformer = tf.newTransformer();
	    transformer.transform(domSource, result);
	    return writer.toString();
	}

    /**
     * 변환
 	 * 
	 * @param doc
     * @param output
     * @throws TransformerException
     */
    private static void transform(Document doc, OutputStream output) throws TransformerException {

        TransformerFactory tFactory = TransformerFactory.newInstance();
        StreamSource source = new StreamSource(new File(XSLT_FILENAME));
        // StreamSource source = new InputSource(new StringReader(xmlString));

        // add XSLT in Transformer
        Transformer transformer = tFactory.newTransformer( source);
        transformer.transform(new DOMSource(doc), new StreamResult(output));
    }
}