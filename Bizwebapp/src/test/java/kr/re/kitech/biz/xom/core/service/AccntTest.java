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

import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 
 * @author James
 * @since 2023. 9. 22.
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
public class AccntTest {
	Logger log = LoggerFactory.getLogger(AccntTest.class);
			
	@Autowired
	private AccntService accntService;
	
	@Test
	public void test() {
		String syspayno = "20200636";	// 조현래
		UserVo user = accntService.findDirectSupervisorBySyspaynoInDB(syspayno);
		log.debug("User==>{}", user);
	}

}
