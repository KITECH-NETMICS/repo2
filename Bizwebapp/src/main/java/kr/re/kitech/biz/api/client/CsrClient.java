package kr.re.kitech.biz.api.client;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 시스템문의 API 연계 클라이언트 최상위 인터페이스.
 * Strategy 패턴 및 Template Method 패턴 을 결합하여 추가 API 연계 건 발생시 해당 인터페이스를 별도 클래스로 구현한다.
 * execute 메소드는 모든 자식 클래스에서 공용으로 사용하는 템플릿 메소드이며 이외의 메소드는 요건에 따라 별도로 구현한다.
 * 
 * @author James
 * @since 2022. 5. 2.
 * @see kr.re.kitech.biz.xom.core.CsrController.java
 */
public interface CsrClient {
	
	/**
	 * API Endpoint를 생성한다.
	 * @param url
	 * @param instId
	 * @return
	 */
	public String makeEndPoint(CsrVo csr);
	
	/**
	 * API Body 를 구성한다.
	 * @param csr
	 * @return
	 */
	public RequestBody buildBody(CsrVo csr);
	
	/**
	 * 요청 객체를 생성한다.
	 * @param csr
	 * @return
	 * @throws IOException
	 */
	public Request getRequest(CsrVo req);
	
	
	/**
	 * 응답 객체를 파싱한다.
	 * @param jobject
	 * @return
	 * @throws IOException
	 */
	public CsrVo parseResponse(JSONObject jobject);
	
	/**
	 * 요청을 처리한다.
	 * @param req
	 * @return
	 * @throws IOException
	 */
	public Response sendRequest(Request request);
	
		
	/**
	 * 실제 전송처리를 담당하는 메소드
	 * 
	 * @param csr
	 * @return
	 */
	default public CsrVo execute(CsrVo csr) {
		CsrVo result = null;
		Request request = null;
		Response response = null;
		String resString = "";
		try {
			// 1. Request Data 구성
			request = this.getRequest(csr);

			// 2. Request 전송
			response = this.sendRequest(request);
			if (!response.isSuccessful()) {
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.xom.co.client.csr.006");
			}
			
			// 3. 응답 공통 예외처리 #1
			resString = response.body().string();
			if (StringUtils.isEmpty(resString)) {
				// "Error: CSR 응답 데이터가 없습니다."
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.xom.co.client.csr.002");
			}
			
			// 4. 응답 공통 예외처리 #2
			JSONObject jobject = new JSONObject(resString);
	    	if (null != jobject.get("ERROR")) {
	    		JSONObject error = new JSONObject(jobject.getString("ERROR"));
	    		throw new KitechException(Exceptions.ERROR, Business.XOM, error.getString("description"));
	    	}
    	
			// 5. 응답 데이터 객체로 파싱
			result = this.parseResponse(jobject);
			result.setUserLoginId(csr.getUserLoginId());
			
		} catch (KitechException ke) {
			throw ke;
		} catch (Exception ex) {
			AppLog.error("OkHttp3 코어 오류", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.client.csr.001", ex);
		} finally {
			if (null != response) response.close();
		}
		return result;
	}
}
