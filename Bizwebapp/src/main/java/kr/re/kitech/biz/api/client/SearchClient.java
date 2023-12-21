/**
 * 
 */
package kr.re.kitech.biz.api.client;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.vo.ScRequest;
import kr.re.kitech.biz.api.client.vo.SearchVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 통합검색(Proten) API 연계 클라이언트 최상위 인터페이스.
 * Strategy 패턴 및 Template Method 패턴 을 결합하여 추가 API 연계 건 발생시 해당 인터페이스를 별도 클래스로 구현한다.
 * execute 메소드는 모든 자식 클래스에서 공용으로 사용하는 템플릿 메소드이며 이외의 메소드는 요건에 따라 별도로 구현한다.
 * 모든 구현 클래스는 Singletone 으로 지정하여서는 안된다. (쓰래드간 Response 공유 문제 발생)
 *
 * @author James
 * @since 2023. 3. 29.
 */
public interface SearchClient {

	public static final String RES_COL_NAME_RESULT = "result";
	public static final String RES_COL_NAME_DATA = "apiResult";
	public static final String RES_COL_NAME_SUCCESS = "success";
	public static final String RES_COL_NAME_FAILURE = "failure";
	public static final String RES_COL_NAME_MESSAGE = "msg";	
	public static final String RES_COL_ERROR_MESSAGE = "errMessge";

	/**
	 * API Endpoint를 생성한다.
	 * @param url
	 * @param instId
	 * @return
	 */
	public String makeEndPoint(ScRequest req);
	
	/**
	 * API Body 를 구성한다.
	 * @param req
	 * @return
	 * @throws JsonProcessingException
	 */
	public RequestBody buildBody(ScRequest req);
	
	/**
	 * 요청 객체를 생성한다.
	 * @param csr
	 * @return
	 * @throws IOException
	 */
	public Request getRequest(ScRequest req);
	
	
	/**
	 * 응답 객체를 파싱한다.
	 * @param jobject
	 * @return
	 * @throws IOException
	 */
	public SearchVo parseResponse(JSONObject jobject);
	
	
	/**
	 * 요청을 처리한다.
	 * @param req
	 * @return
	 * @throws Exception 
	 * @throws IOException
	 */
	public Response sendRequest(Request request);


	/**
	 * 실제 전송처리를 담당하는 메소드
	 * 
	 * @param csr
	 * @return
	 * @throws Exception 
	 */
	default SearchVo execute(ScRequest req) throws MsgException {
		SearchVo result = null;
		Request request = null;
		Response response = null;
		String resString = "";
		try {
			// 1. Request Data 구성
			request = this.getRequest(req);

			// 2. Request 전송
			response = this.sendRequest(request);
			if (!response.isSuccessful()) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "통합검색 전송에 실패하였습니다.");
			}

			// 3. 응답 공통 예외처리 
			resString = response.body().string();
			if (StringUtils.isEmpty(resString) || 0 > resString.indexOf(RES_COL_NAME_RESULT)) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "통합검색 응답 데이터가 비정상 입니다.");
			}

			// 4. 응답 데이터 객체로 파싱
			result = this.parseResponse(new JSONObject(resString));
			// 5. 응답 개별 예외처리
			if (!result.isSuccess()) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "통합검색: " + result.getReturnMsg());
			}

		} catch (MsgException ex) {
			AppLog.error("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.error("통합검색 -MsgException 연계모듈 오류 - StackTrace", ex);
			throw ex;
		} catch (Exception ex) {
			AppLog.error("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.error("통합검색 -Exception 연계모듈 오류 - StackTrace", ex);

			throw new MsgException(Exceptions.ERROR, Business.XOM, "통합검색 연계 모듈에서 알수 없는 에러가 발생하였습니다.");
		} finally {
			if (null != response) response.close();
		}
		return result;
	}
}
