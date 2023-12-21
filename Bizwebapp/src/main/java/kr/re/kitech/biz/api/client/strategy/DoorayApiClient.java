package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kr.re.kitech.biz.api.client.IDoorayApiClient;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service("doorayClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DoorayApiClient implements IDoorayApiClient {
	private static final boolean isReal = true;
	private static final String USER_AGENT = "Mozilla/5.0";
	private static final String API_KEY = isReal ? "mxk9pvjavpq0:TqSMFE0KQiKT4x39RvfEAA" : "mywch55ywwy1:iUqNVAtXTMGGm2To63a84g";
	private static final String SVC_BASE_URL = isReal ? "https://admin-api.gov-dooray.com" : "https://admin-api.dooray.com";
	private static final String SVC_PREFIX = "dooray-api ";

    // 맴버 목록 조회
    public static final String SVC_GET_MEMBER = "/admin/v1/members";
    // 메일회수
    public static final String SVC_POST_MAIL_RETRIEVE = "/admin/v1/services/mail/members/@memberid@/mails/retrieve";

    @Autowired
    private OkHttpClient apiClient;

	// Search member
	public Response searchMember(String username, Map<String, Object> params) throws IOException {
	    Response response = null;
	    String url = DoorayApiClient.SVC_BASE_URL + DoorayApiClient.SVC_GET_MEMBER + "?idProviderUserId=" + username;
	    
	    try {
	        response = sendGetRequest(url, params);
	        return response;
	    } catch (IOException e) {
	        throw new IOException(e);
	    } finally {
	        if (null != response) response.close();
	    }
	}

	// Retrieve mail
	public Response retrieveMail(String memberId, Map<String, Object> params) throws IOException {
	    Response response = null;
	    String url = SVC_BASE_URL + SVC_POST_MAIL_RETRIEVE.replaceAll("@memberid@", memberId);
	    
	    try {
	        response = sendPostRequest(url, params);
	        return response;
	    } catch (IOException e) {
	        throw new IOException(e);
	    } finally {
	        if (null != response) response.close();
	    }
	}
   
    private Response sendPostRequest(String url, Map < String, Object > params) throws IOException {
	  JSONObject jsonParams = new JSONObject(params);
	  MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
	  RequestBody requestBody = RequestBody.create(jsonParams.toString(), mediaType);
	  return sendRequest(url, "POST", requestBody);
	}

    private Response sendGetRequest(String url, Map < String, Object > params) throws IOException {
      HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
      for (Map.Entry < String, Object > entry: params.entrySet()) {
        urlBuilder.addQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
      }
      return sendRequest(urlBuilder.build().toString(), "GET", null);
    }


	public Response sendRequest(String url, String method, RequestBody requestBody) {
		Request.Builder requestBuilder = new Request.Builder()
			.url(url)
			.addHeader("User-Agent", USER_AGENT)
			.addHeader("Content-Type", "application/json")
			.addHeader("Authorization", SVC_PREFIX + API_KEY)
			.addHeader("Connection", "close");

		if ("POST".equalsIgnoreCase(method)) {
			requestBuilder.post(requestBody);
		} else if ("GET".equalsIgnoreCase(method)) {
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
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.client.dry.001");
		}
    }
}
