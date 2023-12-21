/**
 * 
 */
package kr.re.kitech.biz.api;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.api.client.AuthClient;
import kr.re.kitech.biz.api.client.vo.NoticeResult;

/**
 * 
 * @author James
 * @since 2022. 8. 2.
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
public class AuthClientTest {
	Logger log = LoggerFactory.getLogger(AuthClientTest.class);

    @Resource(name = "authClient")
    private AuthClient authClient;
    
	//@Test
	public void getApiBpmClientToken() {
		String token = this.authClient.getApiBpmClientToken();
		System.out.println(token);
	}

	@Test
	public void getNoticeInfo() {
		NoticeResult result = this.authClient.getNoticeInfo("127.0.0.1");
		System.out.println(result);
	}
}
