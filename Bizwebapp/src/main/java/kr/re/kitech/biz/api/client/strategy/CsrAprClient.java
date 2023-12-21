package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.inswave.elfw.util.ElMsgUtil;

import kr.re.kitech.biz.api.client.CsrClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.service.AttachService;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * CSR 문서 접수를 위한 형상관리 API 연계 클라이언트 구현체
 * PathVariable 을 이용하여 라우팅 한다.
 *
 * @author James
 * @since 2022. 5. 3.
 */
@Service("csrAppClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CsrAprClient implements CsrClient {
	public static String APR_SERVICE= "/rest/v1/wf/approve/{instId}/REQ01";

    @Value("${api.csr.key}")
    private String apiKey;
    
    @Value("${api.csr.url}")
    private String baseUrl;

    /** AttachService */
    @Resource(name = "attachServiceImpl")
    private AttachService attachService;   

    @Lazy
    @Autowired
    private OkHttpClient apiClient;
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#makeEndPoint(java.lang.String)
	 */
	public String makeEndPoint(CsrVo csr){
		HttpUrl template = HttpUrl.parse(this.baseUrl + APR_SERVICE );
		HttpUrl.Builder builder = template.newBuilder();
		builder.setPathSegment( ArrayUtils.indexOf(template.pathSegments().toArray(), "{instId}"), String.valueOf(csr.getInstId()));
		return builder.build().toString();
	}


	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#buildBody(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override 
	public RequestBody buildBody(CsrVo csr){
		// 기본 파라이터 구성
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("CHANGE_TITLE", csr.getChangeTitle());
		jsonObject.put("CHANGE_REASON", csr.getChangeReason());
		jsonObject.put("EXPECTED_DT", csr.getExpectedDt());
		jsonObject.put("USER_LOGIN_ID", csr.getUserLoginId());
		jsonObject.put("NEXT_LOGIN_ID", csr.getNextLoginId());
		jsonObject.put("USER_DEP_ID", csr.getUserDepId());
		jsonObject.put("MID_CATEGORY", csr.getMidCategory());
        
        return RequestBody.Companion.create(jsonObject.toString(), ApiClientConfig.JSON);
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#sendRequest(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public Request getRequest(CsrVo csr) {
		return new Request.Builder()
			.url(this.makeEndPoint(csr))
			.post(this.buildBody(csr))
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
		try {
	    	Map<String,Object> result = jobject.toMap();
	    	String successYn = null != result.get("SUCCESS_YN") ? (String)result.get("SUCCESS_YN") : "N";
	        csr.setSuccessYn(StringUtils.equals(successYn, "Y") ? "Y" : "N");
	    } catch (KitechException ex) {
	        throw ex;	        
		} catch (Exception ex) {
			String msg = "CSR 응답 데이터 파싱에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.csr.005"); } catch (Exception e) {}			
			csr.setSuccessYn("N");
			csr.setErrMsg(msg);
		}
		return csr;
	}

}
