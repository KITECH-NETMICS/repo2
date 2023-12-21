package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ElMsgUtil;

import kr.re.kitech.biz.api.client.BpmClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.model.ApiPostResult;
import kr.re.kitech.biz.api.client.vo.BpmRequest;
import kr.re.kitech.biz.api.client.vo.BpmResult;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.BpmException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * CSR 문서 접수를 위한 형상관리 API 연계 클라이언트 구현체.
 * PathVariable 을 이용하여 라우팅 한다.
 *
 * @author James
 * @since 2022. 5. 3.
 */
@Component("bpmPostInstReject")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BpmPostInstRejectClient implements BpmClient {
	public static String SERVICE= "/rest/bpm/process-instances/complete/reject";
    
    @Value("${api.bpm.url}")
    private String baseUrl;
    
    @Autowired
    private OkHttpClient apiClient;
    
	public String makeEndPoint(BpmRequest req){
		HttpUrl template = HttpUrl.parse(this.baseUrl + SERVICE);
		HttpUrl.Builder builder = template.newBuilder();
		return builder.build().toString();
	}

	@Override 
	public RequestBody buildBody(BpmRequest req) {
        try {
			return RequestBody.Companion.create( new ObjectMapper().writeValueAsString(req.getApiResult()), ApiClientConfig.JSON); 
		} catch (Exception ex) {
			String msg = "BPM 요청 데이터 생성에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.bpm.004"); } catch (Exception e) {}					
			throw new BpmException(Exceptions.ERROR, Business.APR, msg);
		}
	}

	@Override
	public Request getRequest(BpmRequest req) {
		// URL 구성: API 종류에 따른 처리
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.post(this.buildBody(req))
			.addHeader("Content-Type", ApiClientConfig.JSON.toString())
			.addHeader("Authorization", req.getToken())			
			.addHeader("Connection", "close")	
		.build();
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.BpmClient#sendRequest(okhttp3.Request)
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
			String msg = "BPM 서버와의 연결에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.bpm.001"); } catch (Exception e) {}
			throw new BpmException(Exceptions.ERROR, Business.APR, msg);
		}
	}

	@Override
	public BpmResult parseResponse(JSONObject jobject) {
		try {
			ApiPostResult apiResult = new ObjectMapper().readValue(jobject.get(RES_COL_NAME_DATA).toString(), ApiPostResult.class);
    		return new BpmResult.Builder(true).apiResult(apiResult).build();
		} catch (JSONException | IOException ex) {
			String msg = "BPM 응답 데이터 파싱에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.bpm.005"); } catch (Exception e) {}			
			return new BpmResult.Builder(false).errMessge(msg).build();
		}	
	}
}
