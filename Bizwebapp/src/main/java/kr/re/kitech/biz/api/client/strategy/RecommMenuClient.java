package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.RecommClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import kr.re.kitech.biz.xom.core.vo.UserVo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service("recommMenuClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RecommMenuClient implements RecommClient {
	public static String RECOMM_SERVICE = "/search1/menuRecommend.jsp?";
	
    @Value("${api.proten.url}")
    private String baseUrl;

    @Autowired
    private OkHttpClient apiClient;

	@Override
	public String makeEndPoint(UserVo user) {
		return new StringBuilder().append(this.baseUrl)
				   .append(RECOMM_SERVICE)
				   .append("userId=").append(user.getSn())
				   .append("&dept_cd=").append(user.getOuCode())
				   .append("&filter=dept_cd:").append(user.getOuCode())
			   .toString();
	}

	@Override
	public RequestBody buildBody(UserVo user) {
		return null;
	}

	@Override
	public Response sendRequest(UserVo user) throws IOException {
		Request request = new Request.Builder()
			.url(this.makeEndPoint(user))
			.addHeader("Connection", "close")
			.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.JSON.toString())
		.build();
		
		// URL 구성: API 종류에 따른 처리
		try {
			Response response = apiClient.newCall(request).execute();
			if (HttpStatus.OK.value() != response.code()){
				throw new IOException("HTTP 응답이 200 이 아님!!");
			}
			return response;
		} catch (Exception ex) {
			throw new MsgException(Exceptions.ERROR, Business.APR, "Search 서버의 응답이 올바르지 않습니다.");
		}
	}

	@Override
	public JSONObject parseResponse(JSONObject jobject) throws IOException {
		boolean isOk = jobject.getBoolean("isOk");
		JSONObject result = null;
		
    	AppLog.debug("========== createDocument ===========\n"); 	// 응답결과
    	
    	if (isOk) {
    		result = jobject.getJSONArray("result").getJSONObject(0);
    	} else {
    		throw new KitechException(Exceptions.ERROR, Business.XOM, "추천 메뉴 불러오는 중 에러 발생.");
    	}
    	
		return result;
	}
}
