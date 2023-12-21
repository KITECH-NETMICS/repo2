/**
 * 
 */
package kr.re.kitech.biz.api.client;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * KDOC API 연계 클라이언트 최상위 인터페이스.
 * @author James
 * @since 2022. 11. 8.
 */
public interface KdocClient{

	/**
	 * API Endpoint를 생성한다.
	 * @param url
	 * @param instId
	 * @return
	 */
	public String makeEndPoint(AppvDelegatorVo req);
	
	/**
	 * POS 요청의 경우 API Body 를 구성한다.
	 * @param req
	 * @return
	 * @throws JsonProcessingException
	 */
	public RequestBody buildBody(AppvDelegatorVo req);
	
	/**
	 * 요청 객체를 생성한다.
	 * @param csr
	 * @return
	 * @throws IOException
	 */
	public Request getRequest(AppvDelegatorVo req);
	
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
	public AppvDelegatorVo parseResponse(String resString);
	
	/**
	 * 실제 전송처리를 담당하는 메소드
	 * 
	 * @param csr
	 * @return
	 * @throws Exception 
	 */
	default public AppvDelegatorVo execute(AppvDelegatorVo req) throws MsgException {
		AppvDelegatorVo result = null;
		Request request = null;
		Response response = null;
		String resString = "";
		try {
			// 1. Request Data 구성
			request = this.getRequest(req);
			AppLog.info("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.info("KDOC REQUEST", request);
			AppLog.info("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");

			// 2. Request 전송
			response = this.sendRequest(request);
			AppLog.info("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.info("KDOC RESPONSE", response);
			AppLog.info("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");			

			if (!response.isSuccessful()) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "KDOC 전송에 실패하였습니다.");
			}

			// 3. 응답 공통 예외처리 
			resString = response.body().string();
			if (StringUtils.isEmpty(resString) || 0 > resString.indexOf("resultcd")) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "KDOC 응답 데이터가 비정상 입니다.");
			}

			// 4. 응답 데이터 객체로 파싱
			result = this.parseResponse(resString);

			// 5. 응답 개별 예외처리
			if (!StringUtils.equals("1", result.getResultcd())) {
				throw new MsgException(Exceptions.ERROR, Business.XOM, "KDOC: " + result.getResultmsg());
			}

		} catch (MsgException ex) {
			AppLog.error("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.error("KDOC -MsgException 연계모듈 오류 - StackTrace", ex);
			throw ex;
		} catch (Exception ex) {
			AppLog.error("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.error("KDOC -Exception 연계모듈 오류 - StackTrace", ex);

			throw new MsgException(Exceptions.ERROR, Business.XOM, "KDOC 연계 모듈에서 알수 없는 에러가 발생하였습니다.");
		} finally {
			if (null != response) response.close();
		}
		return result;
	}
}