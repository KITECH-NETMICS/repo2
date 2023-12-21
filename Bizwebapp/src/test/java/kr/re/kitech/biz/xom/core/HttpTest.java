/**
 * 
 */
package kr.re.kitech.biz.xom.core;

import java.io.IOException;
import java.util.Base64;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inswave.elfw.view.ElMappingJacksonObjectMapper;

import kr.re.kitech.biz.api.client.fw.ApiLoggingInterceptor;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 
 * @author James
 * @since 2022. 11. 15.
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
public class HttpTest {
	Logger log = LoggerFactory.getLogger(HttpTest.class);
	
    @Autowired
    private ElMappingJacksonObjectMapper jsonMapper;	
	
	private String buildParameters() {
		final String PARAM_DELI = "=";
		
		// 	idx=1112&delegatorcode=sybae&startdate=20201230&enddate=20201231&ischkdate=1&isactivated=1&worktype=I
			
		// 기본 파라이터 구성
		StringBuilder builder = new StringBuilder();
		builder.append("idx").append(PARAM_DELI).append("1111");
		builder.append("&delegatorcode").append(PARAM_DELI).append("sybae");
		builder.append("&startdate").append(PARAM_DELI).append("20201114");
		builder.append("&enddate").append(PARAM_DELI).append("20201115");
		builder.append("&ischkdate").append(PARAM_DELI).append("1");
		builder.append("&isactivated").append(PARAM_DELI).append("1");
		builder.append("&worktype").append(PARAM_DELI).append("D");			// 등록 ("I") | 삭제 ("D")
		builder.append("&loginId").append(PARAM_DELI).append("mklee");

		return Base64.getEncoder().encodeToString(builder.toString().getBytes());
	}
	
	@Test
	public void test() throws IOException {
	
	
		OkHttpClient client = new OkHttpClient().newBuilder()	        
			.retryOnConnectionFailure(false)
        	.addInterceptor(new ApiLoggingInterceptor())
        	.build();
		MediaType mediaType = MediaType.Companion.parse("multipart/form-data");
		
	
		String param = this.buildParameters();
		log.debug("param: {}", param);

		Request request = new Request.Builder()
		  .url("https://kdoc.kitech.re.kr/xclickr3_kitech/gate/dispatcherAppRep.jsp?_xcsparam=" + param)
		  .addHeader("Cookie", "WMONID=jHcae-ekW7K; JSESSIONID_KDOC=0000D5uGI5Zi8J_JKkkRs5Wo77k:1epn5le3l")
		  .build();
		  
		Response response = client.newCall(request).execute();	
		if (HttpStatus.OK.value() != response.code()){
			throw new RuntimeException("응답이 200이 아님!!");
		}
		String resString = response.body().string();

	    JSONObject jsonObject = new JSONObject(resString);
	    
	    AppvDelegatorVo apiResult = this.jsonMapper.readValue(resString, AppvDelegatorVo.class);
		
		log.debug("jsonObject: {}", jsonObject);
		log.debug("jsonObject: {}", apiResult);
	}
}
