/**
 * 
 */
package kr.re.kitech.biz.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.api.client.MobileClient;
import kr.re.kitech.biz.api.client.enums.MobChnlType;
import kr.re.kitech.biz.api.client.vo.MbiRequest;
import kr.re.kitech.biz.api.client.vo.MbiResult;

/**
 * 모바일 알림(채널 이용) 테스트
 *   결재대기 / 결재반려 / 결재완료
 * @author James
 * @since 2022. 12. 14.
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
public class MobileClientTest {

	Logger log = LoggerFactory.getLogger(MobileClientTest.class);

	@Resource(name="mobileNotice")
	private MobileClient mobileNotice;
	
	@Test
	public void test() {

		// 2022-002 => kitech02
		// 2022-008 => kitech08 <-- 
		List<String> syspaynos = new ArrayList<>();
//		syspaynos.add("20130576");
//		syspaynos.add("20160348");
		syspaynos.add("2022-008");

		MbiResult res = mobileNotice.execute(new MbiRequest.Builder(MobChnlType.NOTICE_APR_COMPLATE)
			.title("JUnitTestSubject")
			.content("JUnitTestBody")
			.chnlUserIds(syspaynos)
		.build());
		
		log.debug("=============");
		log.debug("result : {}", res);
		log.debug("=============");
	}
	
	public static void main(String[] args) {
		System.out.println(NumberUtils.toInt(""));
	}
}
