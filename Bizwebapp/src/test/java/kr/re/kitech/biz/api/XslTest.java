/**
 * 
 */
package kr.re.kitech.biz.api;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * 
 * @author James
 * @since 2022. 5. 30.
 */
public class XslTest {
	Logger log = LoggerFactory.getLogger(XslTest.class);
	
	private static final String XML_FILE = "src/test/java/kr/re/kitech/biz/api/xsl/_C55202203E95.snap";


	
	/*
	private String readXmlFileToString(String filePath, int indent, boolean ignoreDeclaration) {
	    try {
	        // InputSource src = new InputSource(new StringReader(xmlString));
	        StreamSource source = new StreamSource(new File(filePath));
	        Transformer transformer = TransformerFactory.newInstance().newTransformer( source);
	
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
	}*/
	
	
    /**
     * Document to String
 	 * 
	 * @param doc
     * @return
     * @throws TransformerException
     */
    public static String serializer(Document doc) throws TransformerException {
    	StringWriter writer = new StringWriter();
	    Transformer transformer = TransformerFactory.newInstance().newTransformer();
	    transformer.transform(new DOMSource(doc), new StreamResult(writer));
	    return writer.toString();
	}	
	

	@Test
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException, XPathExpressionException{
		
		// Base XPath
		final String XPATH = "/data/content";

		// Read XML Document
		String xml = new String(Files.readAllBytes(Paths.get( XML_FILE)), StandardCharsets.UTF_8);	 // Charset.forName("windows-1252")
		
		// TODO: 기존 스냅샷이 대문자로되어있는 경우가 있으므로 올바른 xpath 경로를 찾기 위한 처리 필요, 아래 방법은 태그 이외도 변경하므로 태그만 변경하는 로직 필요.
		// xml = StringUtil.toLowerCaseAfterTrim(xml);
		
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document orgDoc = builder.parse( new InputSource(new StringReader(xml)));

		// 타이틀 삭제
		XPath delPath = XPathFactory.newInstance().newXPath();
		Node delNode1 = (Node)delPath.evaluate( "/data/content/div[@class='document_title']", orgDoc, XPathConstants.NODE);
		if (null != delNode1) {
			delNode1.getParentNode().removeChild(delNode1);
		} else {
			Node delNode2 = (Node)delPath.evaluate( "/data/content/DIV[@class='document_title']", orgDoc, XPathConstants.NODE);
			if (null != delNode2) {
				delNode2.getParentNode().removeChild(delNode2);
			}
		}

		// xpath 생성        
		XPath xpath = XPathFactory.newInstance().newXPath();
		Node node = (Node)xpath.evaluate( XPATH, orgDoc, XPathConstants.NODE);
		

		
		// Create HTML Document 
		Document newDoc = builder.newDocument();
		Node importedNode = newDoc.importNode( node, true);
		newDoc.appendChild(importedNode);
		
		// Rename Root Node 
		newDoc.renameNode( importedNode, importedNode.getNamespaceURI(), "html");
		
		System.out.println(serializer(newDoc));
	}	
}
