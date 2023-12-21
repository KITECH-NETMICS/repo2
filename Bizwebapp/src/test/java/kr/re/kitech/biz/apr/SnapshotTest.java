/**
 * 
 */
package kr.re.kitech.biz.apr;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.underscore.lodash.U;
import com.inswave.elfw.util.ElDataConvertUtil;
import com.inswave.elfw.util.PropUtil;

import kr.re.kitech.biz.apr.enums.AprAction;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.vo.AprConstraint;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.xom.core.util.AprUtil;
import kr.re.kitech.biz.zam.emp.vo.EmpListVo;
import kr.re.kitech.biz.zam.emp.vo.EmpVo;

/**
 * 
 * @author James
 * @since 2022. 5. 30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		  "file:src/main/resources/inswave/spring/context-common.xml"
		, "file:src/main/resources/inswave/spring/context-properties.xml"
		, "file:src/main/resources/inswave/spring/context-sqlMap.xml"
		, "file:src/main/resources/inswave/spring/context-transaction.xml"
		, "file:src/main/resources/inswave/spring/context-validator.xml"
		, "file:src/main/resources/inswave/spring/mybatis-config.xml"
		, "file:src/test/resources/inswave/spring/context-datasource.xml"
		, "file:src/test/resources/inswave/spring/context-inswave.xml"
		, "file:src/main/webapp/WEB-INF/config/**/*.xml"
})
public class SnapshotTest {
	Logger log = LoggerFactory.getLogger(SnapshotTest.class);
	
	private static final String BASE_DIR = "F:\\Tools\\InswaveTool\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\BizWebApp\\snapshot\\";
	private static final String XML_FILE = "src/test/java/kr/re/kitech/biz/apr/xsl/";
	
    @Resource(name="apprCommonServiceImpl")
    private ApprCommonService apprCommonService;


	@Test
	public void rejectQuery() throws Exception {
		AprConstraint constraint = AprUtil.getConstaint(AprAction.REJECT, "I08", "C55202203E95");
		System.out.println("Constraint Info: " + constraint);
	}	

	
	//@Test
	public void readSnapshot() throws Exception {
		AprScVo sc = new AprScVo();
		// 1. symbolic link 가 존재하는 context path  
		sc.setReqNo("C55202203E95");
		//sc.setSnapBaseDir(BASE_DIR);
		System.out.println("AprScVo: " + sc);
		
		// 2. 스냅샷 디렉토리에서 동적으로 조회
		String html = this.apprCommonService.getSnapshot(sc);
		System.out.println(html);
	}	
	
	//@Test
	public void makeSnapshot() {
		String xmlUrl = "_C55202200000.snap";
		String xslUrl = "CgsVacaReqTemplate.xsl";
		
		String snapshot = AprUtil.makeSnapshot( XML_FILE + xmlUrl, XML_FILE + xslUrl, null);
        System.out.println(snapshot);
	}
	
	//@Test
    public void objectToXMLTest() throws IOException {
		PropUtil.getPropValue("common.properties", "");
		
    
        ObjectMapper mapper = new XmlMapper();
        TypeFactory typeFactory = mapper.getTypeFactory();

        AprScVo sc = new AprScVo();
        sc.setAppname("테스트");

		Map<?, ?> map = new ObjectMapper().convertValue( sc, Map.class);
		String xmlString = U.toXml(map);
		System.out.println("xml: " + xmlString);        
        
//        String xmlString = mapper.writeValueAsString(sc);
//        System.out.println(" XML: " + xmlString);
        
        AprScVo sc1 = mapper.readValue(xmlString, AprScVo.class);
        System.out.println(" Object: " + sc1);

        // 객체 리스트 생성
//        List<AprScVo> posts = Arrays.asList(new Post[]{
//                new Post(1, 1, "1", "1"),
//                new Post(2, 2, "2", "2"),
//                new Post(3, 3, "3", "3")
//        });
//
//        String xmlArrayString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(posts);
//
//        List<Post> posts1 = mapper.readValue(xmlArrayString, typeFactory.constructCollectionType(List.class, Post.class));
//        assertEquals(3, posts.size());

    }
    
	//@Test	
	public void proworksTest() {
		// TODO FormatConverter test start
		System.out.println("====================================");
		System.out.println(" XML test ");
		System.out.println("====================================");
		
		EmpVo vo = new EmpVo();
		vo.setEname("이름");
		
		System.out.println(vo);
		
		// 단건
		Map<?, ?> map = ElDataConvertUtil.convertValue(vo, Map.class);
		String xml = U.toXml(map);
		System.out.println("xml: " + xml);
		
		Map<?, ?> map2 = U.fromXml(xml);
		EmpVo vo2 = ElDataConvertUtil.convertValue(map2, EmpVo.class);
		System.out.println("vo2: " + vo2);
		
		EmpListVo retEmpVoList = new EmpListVo();
		retEmpVoList.setEmpVo(vo);
		
		// 다건
		Map<?, ?> map3 = ElDataConvertUtil.convertValue(retEmpVoList, Map.class);
		String xml3 = U.toXml(map3);
		System.out.println("xml3: " + xml3);
		
		Map<?, ?> map4 = U.fromXml(xml);
		EmpListVo vo4 = ElDataConvertUtil.convertValue(map4, EmpListVo.class);
		System.out.println("vo4: " + vo4);
		// TODO FormatConverter test end
		
	}    
}
