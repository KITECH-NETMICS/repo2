package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.CsrClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * CSR 문서 생성을 위한 형상관리 API 연계 클라이언트 구현체
 * Endpoint를 분기하여 라우팅 한다.
 *
 * @author James
 * @since 2022. 5. 3.
 */
@Service("csrSatClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CsrSatClient implements CsrClient {
	public static String SAT_SERVICE = "/rest/v1/wf/satisfaction/{instId}/{satisfaction}";
	
    @Value("${api.csr.key}")
    private String apiKey;
    
    @Value("${api.csr.url}")
    private String baseUrl;

    @Autowired
    private OkHttpClient apiClient;
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#makeEndPoint(java.lang.String)
	 */
	@Override
	public String makeEndPoint(CsrVo csr){
		HttpUrl template = HttpUrl.parse(this.baseUrl + SAT_SERVICE );
		HttpUrl.Builder builder = template.newBuilder();
		builder.setPathSegment( ArrayUtils.indexOf(template.pathSegments().toArray(), "{instId}"), String.valueOf(csr.getInstId()) );
		builder.setPathSegment( ArrayUtils.indexOf(template.pathSegments().toArray(), "{satisfaction}"), String.valueOf(csr.getSatisfaction()) );
		return builder.build().toString();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#buildBody(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public RequestBody buildBody(CsrVo csr){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("INST_ID", "" + csr.getInstId());
        return RequestBody.Companion.create(jsonObject.toString(), ApiClientConfig.JSON);
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#sendRequest(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public Request getRequest(CsrVo req) {
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.post(this.buildBody(req))
			.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.JSON.toString())
			.addHeader("X-CustomAuthToken", this.apiKey)
			.addHeader("Connection", "close")		
		.build();
	}
	
	
	@Override 
	public Response sendRequest(Request request){
		try {
			Response response = apiClient.newCall(request).execute();
			if (HttpStatus.OK.value() != response.code()){
				throw new IOException();
			}
			return response;
		} catch (Exception ex) {
			// "CSR 서버와의 연결에 실패하였습니다.";
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.client.csr.001");
		}
	}
		
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#parseResponse(org.json.JSONObject)
	 */
	@Override
	public CsrVo parseResponse(JSONObject jobject) {
		CsrVo csr = new CsrVo();
    	Map<String,Object> result = jobject.toMap();
    	AppLog.debug("========== createDocument ===========\n" + result); 	// 응답결과
    	Object successYn = (String)result.get("SUCCESS_YN");
    	if (null != successYn && ("Y").equals(successYn)) {
    		csr.setSuccessYn(jobject.getString("SUCCESS_YN"));  
        } else {
        	csr.setSuccessYn("N");
        	csr.setErrMsg((String)result.get("ERR_MSG"));
        }
        return csr;
	}
}
