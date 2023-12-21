/**
 * 
 */
package kr.re.kitech.biz.api.client.fw;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;

/**
 * 공통 Http 로깅 처리를 담당하는 AOP 클래스
 * - 해당 클래스 이후 AppLog 객체의 생성되므로 F/W 표준 로거로 로그레벨을 분리할 수 없어 F/W 프로퍼티를 이용하여  slf4j 구현체로 별도 처리함
 * 
 * @author James
 * @since 2022. 5. 18.
 */
public class ApiLoggingInterceptor implements Interceptor {
	Logger log = LoggerFactory.getLogger(ApiLoggingInterceptor.class);
	
	private boolean isValidJson(String jsonString) {
	    try {
	        new JSONObject(jsonString);
	    } catch (JSONException e) {
	        return false;
	    }
	    return true;
	}

	private String utf8ToUTF8(String str) {
		int position =  str.lastIndexOf("utf-8");
		if (-1 < position) {
			String temp =  str.substring(0, position);
			 str = temp +  str.substring(position).toUpperCase();
		}
		return  str;
	}
	
		
	@SuppressWarnings("unchecked")
	private String planToPretty(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Map<String,String> map = mapper.readValue(json, Map.class);	
		return mapper.writer().withDefaultPrettyPrinter().writeValueAsString(map);
	}
	
	/* (non-Javadoc)
	 * @see okhttp3.Interceptor#intercept(okhttp3.Interceptor.Chain)
	 */
	@Override
	public Response intercept(Chain chain) throws IOException {

		final Request request = chain.request();
		log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
		log.debug("Intercepted requst method: [{}] from URL: [{}]", request.method(), request.url());
		if (request.method().equals(HttpMethod.POST.name())) {		
			log.debug("Intercepted requst headers: \n{}\n", request.headers());	
			final Request requestCopy = request.newBuilder().build();
	        final Buffer buffer = new Buffer();
	        requestCopy.body().writeTo(buffer);			
	        final String param = buffer.readUtf8();

			String contentType = this.utf8ToUTF8( request.header("Content-Type"));
			log.debug("Intercepted requst contentType: \n{}\n", contentType);	
			switch(contentType){
				case MediaType.APPLICATION_JSON_VALUE:
				case MediaType.APPLICATION_JSON_UTF8_VALUE:
					log.debug("Intercepted requst body: \n{}\n", this.planToPretty(param));
					break;
				case MediaType.TEXT_HTML_VALUE:
					log.debug("Intercepted requst body: \n{}\n", param);
				case MediaType.APPLICATION_FORM_URLENCODED_VALUE:
				case MediaType.MULTIPART_FORM_DATA_VALUE:
				default:
			}
		}

		final Response response = chain.proceed(request);        
		log.debug("Intercepted resposne headers: [{}], Http Status: [{}]", response.headers(), HttpStatus.valueOf(response.code()).name());
		if (HttpStatus.OK.value() == response.code()) {
			String resData = "";
			String contentType = response.header("Content-Type");
			if (null != contentType && (-1 < contentType.indexOf("json") || -1 < contentType.indexOf("text"))) {
				resData = response.peekBody(Long.MAX_VALUE).string();
				if (this.isValidJson(resData)) {
					log.debug("Intercepted json response body: \n{}\n", this.planToPretty(resData));
				} else {
					log.debug("Intercepted text response body: \n{}\n", resData);
				}
			} 
		} else {
			log.debug("HttpStatus: {}",  response.code());
			if (null != response) {
				log.debug(response.peekBody(Long.MAX_VALUE).string());
			}
		}

		return response;
	}

}
