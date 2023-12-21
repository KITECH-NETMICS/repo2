/**
 * 
 */
package kr.re.kitech.biz.api.client;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.view.ElMappingJacksonObjectMapper;

import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.vo.NoticeResult;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 
 * @author James
 * @since 2022. 8. 2.
 */
@Service("authClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AuthClient {

	public static String APR_SERVICE= "/authenticate";
	
	public static String NOTICE_SERVICE= "/api/prop/notice/biz3";	
		
	@Value("${api.bpm.url}")
	private String baseBpmURl;

	@Value("${api.eip.url}")
	private String baseEipURl;
	
	@Value("${system.sso.proxy.url}")
	private String baseAuthURL;	
    
    @Autowired
    private OkHttpClient apiClient;

    @Autowired
    private ElMappingJacksonObjectMapper jsonMapper;
    	
	/**
	 * Bpm 인증 수행 및 토큰 문자열 반환
	 *
	 * @return Bearer JWT 문자열
	 */
	public String getApiBpmClientToken() {
		String result = null;
		Response response = null;
		try {	

			// 요청 객체 생성 및 요청 수행
			response = apiClient.newCall(new Request.Builder()
				.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.MULTIPART.toString())
				.addHeader(HttpHeaders.ACCEPT, "text/plain")
				.addHeader(HttpHeaders.CONNECTION, "close")
				.url( this.baseBpmURl + APR_SERVICE)
				.post( new MultipartBody.Builder().setType(MultipartBody.FORM)
					.addFormDataPart("user","flowctrl")
					.addFormDataPart("password","flowctrl")
					.build())
			.build()).execute();
			
			// 결과 값 처리  
			result = response.body().string();
			if (0 != result.indexOf("Bearer")) {
				throw new RuntimeException("Bearer 가 존재하지 않음");
			}
			result = result.replace("Bearer ", "");
		} catch (Exception ex) {
			AppLog.error("result", result);
			AppLog.error("BPM 토큰 조회시 오류 발생 !!!", ex);
			// throw new KitechException(Exceptions.ERROR, Business.XOM, "xom.", ex);
		} finally {
			if (null != response) response.close();
		}
		return result;
	}
	
	
	public NoticeResult getNoticeInfo(String clientIp) {
		NoticeResult noticeResult = null;
		Response response = null;
		try {
		
			HttpUrl template = HttpUrl.parse(this.baseAuthURL + NOTICE_SERVICE);
			HttpUrl.Builder builder = template.newBuilder();
			builder.addQueryParameter("clientIp", clientIp).build();

			// 요청 객체 생성 및 요청 수행
			response = apiClient.newCall(new Request.Builder()
				.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.JSON.toString())
				.addHeader(HttpHeaders.CONNECTION, "close")
				.url( builder.toString())
			.build()).execute();
			
			// 결과 값 처리  
			if (HttpStatus.OK.value() != response.code()){
				System.out.println("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
				System.out.println("HttpStatus.OK 가 아님 : " + response);
				System.out.println("=============================================================================================================================");
				throw new IOException();
			}
			System.out.println(response);
			String result = response.body().string();
			noticeResult = jsonMapper.readValue(result, NoticeResult.class);
		} catch (Exception ex) {
			System.out.println("result" + noticeResult);
			System.out.println("BPM 토큰 조회시 오류 발생 !!!" + ex);
			// throw new KitechException(Exceptions.ERROR, Business.XOM, "xom.", ex);
		} finally {
			if (null != response) response.close();
		}
		return noticeResult;
	}
	

	public String getApiEipClientToken() {
		return "TODO";
	}	
	
	
	
}
