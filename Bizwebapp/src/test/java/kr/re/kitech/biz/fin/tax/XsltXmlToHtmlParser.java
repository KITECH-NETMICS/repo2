/**
 * 
 */
package kr.re.kitech.biz.fin.tax;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.xalan.xsltc.trax.TransformerFactoryImpl;
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

	private static final String XML_FILENAME = "src/test/java/kr/re/kitech/biz/fin/tax/xml/tax-sample.xml";

    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try (InputStream is = new FileInputStream(XML_FILENAME)) {

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);
           
            System.out.println("===============================] EIP2 XML [=================================");
            String xmlString = documentToString(doc);
            System.out.println(xmlString);


//            System.out.println("===============================] EIP3 JSON [================================");
//            JSONObject json = XML.toJSONObject(documentToString(doc));
//            System.out.println(json);
//            
//            System.out.println("===============================] FINAL XML [================================");
//            String xml = prettyPrintByTransformer(XML.toString(json), 2, true);
//            System.out.println(xml);


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

    
}