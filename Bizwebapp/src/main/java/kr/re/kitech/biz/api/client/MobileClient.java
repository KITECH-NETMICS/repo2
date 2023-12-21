/**
 * 
 */
package kr.re.kitech.biz.api.client;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.vo.MbiRequest;
import kr.re.kitech.biz.api.client.vo.MbiResult;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 
 * @author James
 * @since 2022. 11. 18.
 */
public interface MobileClient {

	/**
	 * API Endpoint를 생성한다.
	 * @param url
	 * @param instId
	 * @return
	 */
	public String makeEndPoint(MbiRequest req);
	
	/**
	 * POS 요청의 경우 API Body 를 구성한다.
	 * @param req
	 * @return
	 * @throws JsonProcessingException
	 */
	public RequestBody buildBody(MbiRequest req);
	
	/**
	 * 요청 객체를 생성한다.
	 * @param csr
	 * @return
	 * @throws IOException
	 */
	public Request getRequest(MbiRequest req);
	
	/**
	 * 요청을 처리한다.
	 * @param req
	 * @return
	 * @throws Exception 
	 * @throws IOException
	 */
	public Response sendRequest(Request request);
	
	/**
	 * 응답 객체를 파싱한다.
	 * @param jobject
	 * @return
	 * @throws IOException
	 */
	public MbiResult parseResponse(String resString);
	
	/**
	 * 실제 전송처리를 담당하는 메소드
	 * 
	 * @param csr
	 * @return
	 * @throws Exception 
	 */
	default public MbiResult execute(MbiRequest req) throws MsgException {
		MbiResult result = null;
		Request request = null;
		Response response = null;
		String resString = "";
		try {
			// 1. Request Data 구성
			request = this.getRequest(req);

			// 2. Request 전송
			response = this.sendRequest(request);

			if (!response.isSuccessful()) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "MOBIE 전송에 실패하였습니다.");
			}

			// 3. 응답 공통 예외처리 
			resString = response.body().string();
			if (StringUtils.isEmpty(resString) || 0 > resString.indexOf("status")) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "MOBIE 응답 데이터가 비정상 입니다.");
			}

			// 4. 응답 데이터 객체로 파싱
			result = this.parseResponse(resString);

		} catch (MsgException ex) {
			AppLog.error("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.error("MOBIE -MsgException 연계모듈 오류 - StackTrace", ex);
			throw ex;
		} catch (Exception ex) {
			AppLog.error("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.error("MOBIE -Exception 연계모듈 오류 - StackTrace", ex);
			ex.printStackTrace(System.err);
			throw new MsgException(Exceptions.ERROR, Business.XOM, "MOBIE 연계 모듈에서 알수 없는 에러가 발생하였습니다.");
		} finally {
			if (null != response) response.close();
		}
		return result;
	}
}