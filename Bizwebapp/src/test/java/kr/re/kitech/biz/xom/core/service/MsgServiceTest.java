/**
 * 
 */
package kr.re.kitech.biz.xom.core.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author James
 * @since 2022. 3. 28.
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
public class MsgServiceTest {
	Logger log = LoggerFactory.getLogger(MsgServiceTest.class);
			
	@Autowired
	private MsgService msgService;
	

	
	/**
	 * 플랜 텍스트 단건 발송 테스트
	 */
	@Test
	public void planText() throws Exception {

		String templateCont = msgService.getContentStrByTemplateCode("bizp_2019121423321030063559493");


		System.out.println(templateCont);
	}
	
}