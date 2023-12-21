/**
 * 
 */
package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;

import org.apache.geronimo.mail.util.Base64;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.inswave.elfw.view.ElMappingJacksonObjectMapper;

import kr.re.kitech.biz.api.client.KdocClient;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * KDOC 대결 연계 (등록/삭제) 구현체
 * @author James
 * @since 2022. 11. 8.
 */
@Component("kdocDelegate")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS) 
public class KdocDelegateClient implements KdocClient {
	public static String SERVICE= "/xclickr3_kitech/gate/dispatcherAppRep.jsp";
    
    @Value("${api.kdoc.url}")
    private String baseUrl;

    @Autowired
    private OkHttpClient apiClient;
    
    @Autowired
    private ElMappingJacksonObjectMapper jsonMapper;

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.KdocClient#makeEndPoint(kr.re.kitech.biz.api.client.vo.BpmReqVo)
	 */
	public String makeEndPoint(AppvDelegatorVo req){

		// 파라이터 구성
		final String PARAM_DELI = "=";
		StringBuilder sb = new StringBuilder();
		sb.append("idx").append(PARAM_DELI).append(req.getDlgt_sn());
		sb.append("&delegatorcode").append(PARAM_DELI).append(req.getDelegatorCode());
		sb.append("&startdate").append(PARAM_DELI).append(req.getStart_ymd());
		sb.append("&enddate").append(PARAM_DELI).append(req.getCls_ymd());
		sb.append("&ischkdate").append(PARAM_DELI).append(req.getIschkdate());
		sb.append("&isactivated").append(PARAM_DELI).append("1");
		sb.append("&worktype").append(PARAM_DELI).append(req.getState());			// 등록 ("I") | 삭제 ("D")
		sb.append("&loginId").append(PARAM_DELI).append(req.getActorCode());
		String param = new String( Base64.encode(sb.toString().getBytes()));
		
		// URL 구성
		HttpUrl template = HttpUrl.parse(this.baseUrl + SERVICE);
		HttpUrl.Builder builder = template.newBuilder();
		builder.addQueryParameter("_xcsparam", param);
		return builder.build().toString();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.KdocClient#buildBody(kr.re.kitech.biz.api.client.model.BpmRequest)
	 */
	@Override 
	public RequestBody buildBody(AppvDelegatorVo req) {
        return null;
	}


	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.KdocClient#sendRequest(kr.re.kitech.biz.api.client.vo.BpmReqVo)
	 */
	@Override
	public Request getRequest(AppvDelegatorVo req) {
		// URL 구성: API 종류에 따른 처리
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.addHeader("Connection", "close")
		.build();
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.KdocClient#sendRequest(okhttp3.Request)
	 */
	@Override
	public Response sendRequest(Request request) {
		try {
			Response response = apiClient.newCall(request).execute();
			if (HttpStatus.OK.value() != response.code()){
				throw new IOException();
			}
			return response;
		} catch (Exception ex) {
			throw new MsgException(Exceptions.ERROR, Business.APR, "KDOC 서버와의 연결에 실패하였습니다.");
		}
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.KdocClient#parseResponse(org.json.JSONObject)
	 */
	@Override
	public AppvDelegatorVo parseResponse(String resString) {
    	try {
    		AppvDelegatorVo apiResult = this.jsonMapper.readValue(resString, AppvDelegatorVo.class);
    		return apiResult;
		} catch (JSONException | IOException ex) {
			AppvDelegatorVo delegate = new AppvDelegatorVo();
			delegate.setResultcd("0");
			delegate.setResultmsg("KDOC 응답 데이터 파싱에 실패하였습니다.");
			return delegate;
		}	
	}
}
