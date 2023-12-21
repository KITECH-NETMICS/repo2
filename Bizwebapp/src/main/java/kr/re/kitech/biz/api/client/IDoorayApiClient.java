package kr.re.kitech.biz.api.client;

import java.io.IOException;
import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.Response;

public interface IDoorayApiClient {

	/**
	 * 두레이 회원을 검색하고 해당 회원에 대한 아이디 반환
	 * 
	 * @param username 이메일 주소를 포함하는 문자열
	 * @param params   검색에 사용될 추가 매개변수를 포함하는 Map 객체
	 * @return Response 검색된 회원에 아이디 반환
	 * @throws IOException 요청 또는 응답 처리 중 발생한 IO 오류
	 */
    Response searchMember(String username, Map<String, Object> params) throws IOException;

    /**
	 * 두레이 회원의 메일을 회수하고 결과에 대한 응답반환
	 * 
	 * @param memberId  메일을 회수할 회원의 ID
	 * @param params    메일 회수에 사용될 추가 매개변수를 포함하는 Map 객체
	 * @return Response 메일 회수에 대한 응답 객체를 반환
	 * @throws IOException 요청 또는 응답 처리 중 발생한 IO 오류
	 */
    Response retrieveMail(String memberId, Map<String, Object> params) throws IOException;

    /**
	 * 주어진 URL과 HTTP 메서드를 사용하여 요청을 전송하고 응답반환
	 * 
	 * @param url       요청 보낼 URL
	 * @param method    사용할 HTTP 메서드 ("GET" 또는 "POST")
	 * @param requestBody 요청 본문에 사용할 RequestBody 객체 (POST 요청에만 필요)
	 * @return Response 응답 객체를 반환
	 * @throws IOException 요청 또는 응답 처리 중 발생한 IO 오류
	 */
    Response sendRequest(String url, String method, RequestBody requestBody) throws IOException;
}
