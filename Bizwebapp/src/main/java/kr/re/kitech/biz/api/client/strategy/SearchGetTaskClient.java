/**
 * 
 */
package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.view.ElMappingJacksonObjectMapper;

import kr.re.kitech.biz.api.client.SearchClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.vo.ScRequest;
import kr.re.kitech.biz.api.client.vo.SearchVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 
 * @author James
 * @since 2023. 3. 29.
 */
@Component("searchGetTask")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SearchGetTaskClient implements SearchClient{

	public static String SERVICE = "/search1/searchTask.jsp";
    
    @Value("${api.proten.url}")
    private String baseUrl;
    
    @Autowired
    private OkHttpClient apiClient;    
    
    @Autowired
    private ElMappingJacksonObjectMapper jsonMapper;
        
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.SearchClient#makeEndPoint(kr.re.kitech.biz.api.client.vo.ScRequest)
	 */
	@Override
	public String makeEndPoint(ScRequest req) {
		HttpUrl template = HttpUrl.parse(this.baseUrl + SERVICE);
		HttpUrl.Builder builder = template.newBuilder();
		
		builder.addQueryParameter("index", req.getIndex());
		builder.addQueryParameter("query", req.getQuery());
		
		return builder.build().toString();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.SearchClient#buildBody(kr.re.kitech.biz.api.client.vo.ScRequest)
	 */
	@Override
	public RequestBody buildBody(ScRequest req) {
		return null;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.SearchClient#getRequest(kr.re.kitech.biz.api.client.vo.ScRequest)
	 */
	@Override
	public Request getRequest(ScRequest req) {
		// URL 구성: API 종류에 따른 처리
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.addHeader("Content-Type", ApiClientConfig.JSON.toString())
			.addHeader("Connection", "close")			
		.build();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.SearchClient#sendRequest(okhttp3.Request)
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
			throw new MsgException(Exceptions.ERROR, Business.XOM, "통합검색 서버와의 연결에 실패하였습니다.");
		}
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.SearchClient#parseResponse(org.json.JSONObject)
	 */
	@Override
	public SearchVo parseResponse(JSONObject jobject) {
		SearchVo apiResult = new SearchVo();
    	try {
    		JSONArray jarray = jobject.getJSONArray("result");
    		if (null == jarray) {
    			// 결과값 알수 없는 경우
    			throw new JSONException("통합검색의 응답값이 없습니다.");
    		}
    		if (1 == jarray.length()) {
    			// 정상 결과인 경우.
	    		apiResult = this.jsonMapper.readValue(jarray.getJSONObject(0).toString(), SearchVo.class);
    		} 
    		
			apiResult.setSuccess(true);
			apiResult.setReturnMsg(jobject.getString("returnMsg"));    		
		} catch (JSONException | IOException ex) {
			AppLog.error("파싱오류 발생", ex);
			apiResult.setSuccess(false);
			apiResult.setReturnMsg("통합검색 응답 데이터 파싱에 실패하였습니다.");
		}	
		return apiResult;
	}

}
