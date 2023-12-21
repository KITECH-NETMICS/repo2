/**
 * 
 */
package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ElMsgUtil;
import com.inswave.elfw.view.ElMappingJacksonObjectMapper;

import kr.re.kitech.biz.api.client.MobileClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.vo.MbiRequest;
import kr.re.kitech.biz.api.client.vo.MbiResult;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 
 * @author James
 * @since 2022. 11. 23.
 */
@Component("mobileNotice")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS) 
public class MobileNoticeClient implements MobileClient {

	public static String SERVICE = "/mobChnl";
    
    @Value("${api.mobile.url}")
    private String baseUrl;
    
    @Autowired
    private OkHttpClient apiClient;
    
    @Autowired
    private ElMappingJacksonObjectMapper jsonMapper;
        
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.MobileClient#makeEndPoint(kr.re.kitech.biz.api.client.vo.MbiRequest)
	 */
	@Override
	public String makeEndPoint(MbiRequest req) {
		return this.baseUrl + SERVICE;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.MobileClient#buildBody(kr.re.kitech.biz.api.client.vo.MbiRequest)
	 */
	@Override
	public RequestBody buildBody(MbiRequest req) {
		return new FormBody.Builder()
			.add("board_id", req.getChannelType().getCode())
			.add("title", req.getChannelType().getTitle() + " " + req.getTitle())
			.add("content", req.getContent())
			.add("chnlUserIds", req.getChnlUserIdToString())	// 사번
		.build();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.MobileClient#getRequest(kr.re.kitech.biz.api.client.vo.MbiRequest)
	 */
	@Override
	public Request getRequest(MbiRequest req) {
		// URL 구성: API 종류에 따른 처리
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.post(this.buildBody(req))
			.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.FORM.toString())
			.addHeader(HttpHeaders.CONNECTION, "close")
		.build();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.MobileClient#sendRequest(okhttp3.Request)
	 */
	@Override
	public Response sendRequest(Request request) {
		try {
			Response response = apiClient.newCall(request).execute();
			if (HttpStatus.OK.value() != response.code()){
				AppLog.info("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
				AppLog.info("HttpStatus.OK 가 아님 : ", response);
				AppLog.info("=============================================================================================================================");			
				throw new IOException();
			}
			return response;
		} catch (Exception ex) {
			throw new MsgException(Exceptions.ERROR, Business.APR, "MOBILE 서버의 응답이 올바르지 않습니다.");
		}
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.MobileClient#parseResponse(java.lang.String)
	 */
	@Override
	public MbiResult parseResponse(String resString) {
    	try {
    		MbiResult mbiResult = this.jsonMapper.readValue(resString, MbiResult.class);
    		mbiResult.setResult(HttpStatus.OK.value() == mbiResult.getStatus());    		
    		return mbiResult;
		} catch (JSONException | IOException ex) {
			String msg = "모바일 알림 등록 응답 데이터 파싱에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.bpm.005"); } catch (Exception e) {}						
			return new MbiResult(false, msg);
		}
	}
}
