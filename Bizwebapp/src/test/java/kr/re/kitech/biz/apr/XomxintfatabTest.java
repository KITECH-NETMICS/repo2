/**
 * 
 */
package kr.re.kitech.biz.apr;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.vo.IntfatabVo;

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
public class XomxintfatabTest {
	Logger log = LoggerFactory.getLogger(XomxintfatabTest.class);
	
	private final String reqNo = "C55202200000";
	
	private IntfatabVo paramVo;
	
    @Resource(name="apprCommonServiceImpl")
    private ApprCommonService apprCommonService;    
    


	@Before
	public void setup() {		
		log.debug("*************** JUnit Setup Started ****************");
		
		paramVo = new IntfatabVo();
		paramVo.setReqNo("C55202200000");
		paramVo.setAprState("XAD005");
		paramVo.setUiId("X999");		// paramVo.setUiId(KitechContextUtil.getServiceId());
		paramVo.setEndpoints("james");	// paramVo.setEndpoints(KitechContextUtil.getUserId());

		log.debug("*************** JUnit Setup Finished ***************");
	}
	

	@Test
	public void tests() throws Exception{
		// 삽입
		this.apprCommonService.putXomxintfatab(this.paramVo);
		
		// 조회
		IntfatabVo afterPutVo = this.apprCommonService.getXomxintfatab(reqNo);
		System.out.println("삽입 후: " + afterPutVo);
		
		// 수정
		this.paramVo.setAprState("XAD010");
		this.paramVo.setEndpoints("mklee");
		this.apprCommonService.modXomxintfatab(this.paramVo);
		
		// 재조회
		IntfatabVo afterModVo = this.apprCommonService.getXomxintfatab(reqNo);
		System.out.println("수정 후: " + afterModVo);

		
		// 삭제
		Integer result = this.apprCommonService.delXomxintfatab(reqNo);
		assertTrue("정상삭제", 1 == result);
		
		
	}	
}
