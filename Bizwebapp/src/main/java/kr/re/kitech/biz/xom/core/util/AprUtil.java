package kr.re.kitech.biz.xom.core.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

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
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.DBUtil;
import com.inswave.elfw.util.PropUtil;

import kr.re.kitech.biz.apr.enums.AprAction;
import kr.re.kitech.biz.apr.vo.AprConstraint;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * xml data 
 */
public class AprUtil {
	private static final String BASE_XPATH = "/data/content";					// Snapshot Base XPath
	private static final String TITLE_XPATH = "/div[@class='document_title']";	// Title Base XPath
	
	private static final String META_SQL = "SELECT query, message FROM appv_constraint WHERE is_use AND action_cd = ? AND alias = ?";
	private static final String CONSTRAINT_SQL = "query";
	private static final String CONSTRAINT_MSG = "message";
	
	
	/**
	 * @param document
	 * @param xsltURL
	 * @return
	 * @throws Exception
	 */
	public static String transform(Document document, String xslt) throws Exception {
		StringBuilder builder = new StringBuilder();

		try {
			TransformerFactory transFactory = TransformerFactory.newInstance();
			ByteArrayOutputStream bostream = new ByteArrayOutputStream();
			DOMSource source = new DOMSource(document);
			Transformer transformer = transFactory.newTransformer(new StreamSource(xslt));

			// xsl 페이지 인코딩 UTF-8로 변경시 결제 페이지에서 한글 깨지는 문제 수정. 출력 속성 인코딩 euc-kr 추가 - James
			transformer.transform(source, new StreamResult(bostream));

			builder.append(bostream.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return builder.toString();
	}



    /**
     * 내부 메소드 w3c.Document 를 lang.String으로 반환한다.
 	 * 
	 * @param doc
     * @return String
     * @throws TransformerException
     */
    private static String docToString(Document doc) throws TransformerException {
    	StringWriter writer = new StringWriter();
	    Transformer transformer = TransformerFactory.newInstance().newTransformer();
	    transformer.transform( new DOMSource(doc), new StreamResult(writer));
	    return writer.toString();
	}	
	

	/**
	 * 스냡샷 파일을 읽어 Document 로 변환 후 content 하위의 HTML 부분만 문자열로 반환한다.
 	 * 
	 * @param filename
	 * @return
	 */
	public static String readSnapshot(String linkurl) {
		
		String result = null;
		try {
			// Read XML Document
			String xml = new String(Files.readAllBytes(Paths.get(linkurl)), StandardCharsets.UTF_8);	 // Charset.forName("windows-1252")
			
			// TODO: 기존 스냅샷이 대문자로되어있는 경우가 있으므로 올바른 xpath 경로를 찾기 위한 처리 필요, 아래 방법은 태그 이외도 변경하므로 태그만 변경하는 로직 필요.
			// xml = StringUtil.toLowerCaseAfterTrim(xml);
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document orgDoc = builder.parse( new InputSource(new StringReader(xml)));

			// 타이틀 삭제 (Legacy 스냅샷을 위한 처리) : 대소문자 구분 방법을 알지 못하므로 우선 아래와 같이 처리
			XPath delPath = XPathFactory.newInstance().newXPath();
			Node delNode1 = (Node)delPath.evaluate( BASE_XPATH + TITLE_XPATH, orgDoc, XPathConstants.NODE);
			if (null != delNode1) {
				delNode1.getParentNode().removeChild(delNode1);
			} else {
				Node delNode2 = (Node)delPath.evaluate( BASE_XPATH + TITLE_XPATH, orgDoc, XPathConstants.NODE);
				if (null != delNode2) {
					delNode2.getParentNode().removeChild(delNode2);
				}
			}

			// xpath 생성        
			XPath xpath = XPathFactory.newInstance().newXPath();
			Node addNode = (Node)xpath.evaluate( BASE_XPATH, orgDoc, XPathConstants.NODE);

			// Create HTML Document (Legacy 스냅샷을 위한 처리)
			if (null != addNode) {
				Document newDoc = builder.newDocument();
				Node importedNode = newDoc.importNode( addNode, true);
				newDoc.appendChild(importedNode);
				
				// Rename Root Node 
				newDoc.renameNode( importedNode, importedNode.getNamespaceURI(), "html");
				orgDoc = newDoc;
			}
			
			result = AprUtil.docToString(orgDoc);
		} catch (SAXException | IOException | ParserConfigurationException | XPathExpressionException | TransformerException ex) {
			AppLog.error("스냅샷 파일 읽는 도중 오류 발생", ex);
			throw new KitechException( Exceptions.ERROR, Business.XOM, "message.xom.co.util.apr.001", ex);
		}
		
		
		return result;
	}	
	
	/**
	 * 스냡샷 파일을 읽어 Document 로 변환 후 content 하위의 HTML 부분만 문자열로 반환한다.
	 * 
	 * @param xmlUrl XML 경로명: 저장할 파일경로 및 파일명 (/2022/6/_C55202200123.snap)
	 * @param xslUrl XSL 경로명: 참조할 xsl 파일 경로명 (/ui/apr/xsl/ccs/CgsVacaReqTemplate.xsl)
	 * @param model xsl 파일과 바인딩 될 데이터 
	 * @return
	 */
	public static String makeSnapshot(String xmlUrl, String xslUrl, String xml) {
		String result = null;

		AppLog.info("xmlUrl: " + xmlUrl);
		AppLog.info("xslUrl: " + xslUrl);
		// 상위 디렉토리 전체 경로 생성
		try {
			Files.createDirectories(Paths.get(xmlUrl.substring(0, xmlUrl.lastIndexOf('_'))));
		} catch (IOException ex) {
			AppLog.error("디렉토리 생성 중 오류 발생", ex);
			throw new KitechException( Exceptions.ERROR, Business.XOM, "message.xom.co.util.apr.002", ex);
		}
		// 파일 처리
		try (FileOutputStream output = new FileOutputStream(new File(xmlUrl), false)){
			// 2. Data 오브젝트가 변환된 Xml 문자열을 w3c.Document 로 변환
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
			// read XSL
	        StreamSource source = new StreamSource(new File( xslUrl));
	        // add XSLT in Transformer
	        Transformer transformer = TransformerFactory.newInstance().newTransformer( source);
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.transform(new DOMSource(doc), new StreamResult(output));

	        // 확인용 로직
	        result = new String(Files.readAllBytes(Paths.get(xmlUrl)), StandardCharsets.UTF_8);
		} catch (Exception ex) {
			AppLog.error("스냅샷 파일 저장 중 오류 발생", ex);
			throw new KitechException( Exceptions.ERROR, Business.XOM, "message.xom.co.util.apr.003", ex);
		} 

		return result;
	}	
	
	public static AprScVo buildSc(AprVo aprVo) {
		AprScVo sc = new AprScVo();
		
		sc.setReqNo(aprVo.getReqNo());
		sc.setProcDefAlias(aprVo.getProcDefAlias());
		sc.setEndpoint(aprVo.getEndpoint());
		sc.setMainKey(aprVo.getMainKey());
		sc.setSlipNo(aprVo.getSlipNo());
		
		return sc;
	}


	
	/**
     * 업무 데이터 소스 명을 프로퍼티에서 가져온다.
	 */
	private static String getWorkSourceName() {
		String value = PropUtil.getMessage("EL_IMIS_WORK_DATASOURCE_NAME");
		if ((value == null) || ("".equals(value))) {
			value = "DS_EL_WORK";
		}
		return value;
	}
	

	/**
	 * 내부 메소드, 반려 제약 쿼리를 조회한다.
	 */
	private static Map<String,String> fetchQuery(AprAction action, String alias) {
		try (
			Connection con = DBUtil.getConnection( AprUtil.getWorkSourceName()); // 업무쪽 해당 DataSource명 문자열 
			PreparedStatement ps = con.prepareStatement(META_SQL)){
			ps.setString(1, action.getCode());	// 상신(APC010) | 반려(APC020) | 결재(APC030) | 회수(APC040)
			ps.setString(2, alias);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					Map<String,String> result = new HashMap<>();
					// 반려 제약 쿼리의 튜플은 항상 1이 되어야 함
					result.put(CONSTRAINT_SQL, rs.getString(CONSTRAINT_SQL));
					result.put(CONSTRAINT_MSG, rs.getString(CONSTRAINT_MSG));	
					return result;
				}
			}
		} catch (Exception ex) {
			AppLog.error("Fetch Query ERROR !",ex);
			throw new KitechException(
				Exceptions.ERROR, Business.XOM, "message.xom.co.util.apr.004", new String[]{action.getTitle()}, ex
			);
		} 
		return null;
	}
	
	
	/**
	 * 제약 조건 데이터를 조회한다.
	 *	- 현재  상신/반려/결재/수신결재/회수/위임 에 적용 중.
	 * 
	 * @param action 전자결재 Action 타임 (상신/반려/결재/회수/위임)
	 * @param alias 전자결재 alias
	 * @param reqNo 신청번호
	 * @return
	 */
	public static AprConstraint getConstaint(AprAction action, String alias, String reqNo){
	
		if (null == alias || StringUtils.isEmpty(alias)) {
			return new AprConstraint.Builder(false).build();
		}
		
		Map<String,String> fetch = AprUtil.fetchQuery(action, 3 < alias.length() ? alias.substring(0,3) : alias);
		if (null == fetch || StringUtils.isEmpty(fetch.get(CONSTRAINT_SQL))) {
			return new AprConstraint.Builder(false).build();
		}
		// alias 파라미터가 올바르지 않거나 해당 alias 에 쿼리가 존재하지 않는다면 제약을 체크 할수 없으므로 위와 같이 반환 처리.
		try (
			Connection con = DBUtil.getConnection( AprUtil.getWorkSourceName()); // 업무쪽 해당 DataSource명 문자열 
			PreparedStatement ps = con.prepareStatement(fetch.get(CONSTRAINT_SQL))){
			
			// try 블럭
			ParameterMetaData metaData = ps.getParameterMetaData();
			AppLog.debug("Number of statement parameters: " + metaData.getParameterCount());
			for (int index = 1; index <= metaData.getParameterCount(); index++) {
				String sqlType = metaData.getParameterTypeName(index);
				ps.setString(index, reqNo);
				
				// Get SQL type for each parameter
				AppLog.debug("SQL type of parameter " + index + " is " + sqlType + " : " + reqNo);
			}

			try (ResultSet rs = ps.executeQuery()) {
				rs.next();
				Integer count = rs.getInt(1);					
				AppLog.info("RESULT COUNT: " + count + ", is"+ action.name() +": " + (null != count && 0 < count));
				return new AprConstraint.Builder((null != count && 0 < count))
					.message(fetch.get(CONSTRAINT_MSG))
				.build();
			} 
		} catch (Exception ex) {
			AppLog.error("Physical ERROR !\n" + ex);
			throw new KitechException(
				Exceptions.ERROR, Business.XOM, "message.xom.co.util.apr.005", new String[]{action.getTitle()}, ex
			);
		}
	}
}
