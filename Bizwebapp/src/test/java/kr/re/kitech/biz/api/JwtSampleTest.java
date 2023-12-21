/**
 * 
 */
package kr.re.kitech.biz.api;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import kr.re.kitech.biz.xom.core.security.JwtProvider;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 
 * @author James
 * @since 2022. 7. 25.
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
public class JwtSampleTest {
	Logger log = LoggerFactory.getLogger(JwtSampleTest.class);
	
	// secret key가 짧으면 에러가 난다
	private final String secretKey = "secretKey-test-authorization-jwt-manage-token";
	
	@Resource(name="jwtProvider")
	private JwtProvider jwtProvider;	
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	/**
	 * Success Test
	 */
	@Test
	public void successTest() {
		// given
		// JwtProvider jwtProvider = new JwtProvider(secretKey, 1L, 60L);
		// JwtProvider jwtProvider = new JwtProvider(secretKey);

		// when
		String username = "mklee";
		String accessToken = this.jwtProvider.generateAccessToken(username);
		log.debug("accessToken = " + accessToken);

		Claims claims = jwtProvider.validTokenAndReturnBody(accessToken);
		log.debug("claims = " + claims);
		String findUsername = claims.get("username", String.class);
		log.debug("findUsername = " + findUsername);

		// then
		assertEquals(username, jwtProvider.getName(accessToken));
		assertEquals(username, findUsername);
	}

	/**
	 * Time Over
	 * @throws InterruptedException
	 */
	//@Test(expected = ExpiredJwtException.class)
	public void expireTokenTest() throws InterruptedException {
		// given
		// JwtProvider jwtProvider = new JwtProvider(secretKey, 1l, 60l);
		String username = "testuser-1";
		String accessToken = jwtProvider.generateAccessToken(username);

		// 2초 딜레이
		Thread.sleep(2000l);

		// when
		exceptionRule.expect(ExpiredJwtException.class);
		exceptionRule.expectMessage("유효하지 않은 토큰입니다");
		
		Claims claim = jwtProvider.validTokenAndReturnBody(accessToken);
		System.out.println(claim);
	}
	
	//@Test
	public void clientTest() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder()
		  .build();
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, "{    \r\n    \"reqMeta\": {},\r\n    \"elData\": {\r\n        \"reqNo\" : \"C55202200001\",\r\n        \"alias\" : \"C55\",\r\n        \"syapayno\" : \"20170701\",\r\n        \"snap\": {\r\n            \"title\" : \"휴가원신청서(테스트)\",\r\n            \"req_psn\" : \"20170701\",\r\n            \"req_nm\" : \"박정일\",\r\n            \"start_dt\" : \"2022-07-18\",\r\n            \"close_dt\" : \"2022-07-24\"\r\n        }\r\n    }\r\n}\r\n");
		Request request = new Request.Builder()
		  .url("http://bizdev.kitech.re.kr/ApiRegacyFR.pwkjson")
		  .method("POST", body)
		  .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6ImVpcHBhcmtqaSIsImlhdCI6MTY1ODgxNjMyNSwiZXhwIjoxNjU4ODE4MTI1fQ.iqI7rWUdcTdvvbJBKz0VkABx3RhhUYMoDn04XXP7R3s")
		  .addHeader("Content-Type", "application/json")
		  .build();
		Response response = client.newCall(request).execute();
		if (HttpStatus.OK.value() != response.code()){
			throw new IOException("HTTP 응답이 200 이 아님!!");
		}
		
		String jsonData = response.body().string();
		JSONObject jobject = new JSONObject(jsonData);
		System.out.println(jobject.toString(4));
	
	}
}