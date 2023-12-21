package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kr.re.kitech.biz.api.client.ZeusClient;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service("zeusFindClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ZeusFindClient implements ZeusClient {
	private static final String USER_AGENT = "Mozilla/5.0";
	// 제우스 URL 고정
	private static final String ZEUS_API_URL = "https://api.zeus.go.kr";
	// 제우스 KEY 고정
	private static final String ZEUS_API_KEY = "80f93f9d-b354-423a-bb8e-ba3866e84339";
	
	@Autowired
    private OkHttpClient apiClient;

	public String sendRequestMnt(String path, Map<String,Object> params) throws Exception{
    	return null;
    }
    
    public String sendRequestMnt(String asetNo) throws Exception{
    	return sendRequestFind(asetNo);
    }
    
    /**
     * 자산번호로 단건 데이터 조회
     * @param String, Map
	 * @return
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.21.
     */
    public String sendRequestFind(String equipNo) throws Exception{
    	String url = ZEUS_API_URL + "/api/eq/equips/" + ZEUS_API_KEY + "?keywords=" + equipNo;
    	Response response = null;
    	try {
    		response = this.sendRequest(url, "GET", null);
    		return response.body().string();
		} finally {
			if (null != response) response.close();
		}
    }
    
    /**
     * 제우스에 상태 및 데이타 전송 처리
     * @param String, RequestBody
	 * @return Response
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.22.
     */
	private Response sendRequest(String url, String method, RequestBody requestBody) throws Exception {
		Request.Builder requestBuilder = new Request.Builder().url(url)
			.addHeader("User-Agent", USER_AGENT)
			.addHeader("Content-Type", "application/json")
			.addHeader("Authorization", ZEUS_API_KEY)
			.addHeader("Connection", "close");

		if ("POST".equals(method)) {
			requestBuilder.post(requestBody);
		} else if ("GET".equals(method)) {
			requestBuilder.get();
		} else {
			throw new IllegalArgumentException("Invalid HTTP method");
		}

		Request request = requestBuilder.build();
		try {
			Response response = apiClient.newCall(request).execute();
			if (response.code() != HttpStatus.OK.value()) {
				String errorMessage = String.format("HTTP 응답오류: %d, 메시지: %s", response.code(), response.message());
				throw new IOException(errorMessage);
			}
			return response;
		} catch (Exception ex) {
			throw new MsgException(Exceptions.ERROR, Business.XOM, "Zeus 서버의 응답이 올바르지 않습니다.");
		}
	}

}
