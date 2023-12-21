package kr.re.kitech.biz.api.client;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import kr.re.kitech.biz.xom.core.vo.AttachVo;
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
public interface SynapClient {

	/**
	 * API Endpoint를 생성한다.
	 * @param url
	 * @param instId
	 * @return
	 */
	public String makeEndPoint(AttachVo attachvo);
	
	/**
	 * API Body 를 구성한다.
	 * @param csr
	 * @return
	 */
	public RequestBody buildBody(AttachVo attachvo);
	
	/**
	 * 요청 객체를 생성한다.
	 * @param csr
	 * @return
	 * @throws IOException
	 */
	public Response sendRequest(AttachVo attachvo) throws IOException;
	
	
	/**
	 * 응답 객체를 파싱한다.
	 * @param jobject
	 * @return
	 * @throws IOException
	 */
	public String parseResponse(JSONObject jobject) throws IOException;
	
		
	/**
	 * 실제 전송처리를 담당하는 메소드
	 * 
	 * @param csr
	 * @return
	 */
	default public String execute(AttachVo attachvo) {
		String result = "";
		Response response = null;
		try {
			response = this.sendRequest(attachvo);
			if (response.isSuccessful()) {
				String jsonData = response.body().string();
				JSONObject jobject = new JSONObject(jsonData);
				result = this.parseResponse(jobject);
			}
		} catch (JSONException je) {
			AppLog.error("OkHttp3 결과 파싱 오류", je);
			throw new MsgException(Exceptions.ERROR, Business.XOM, "문서뷰어 결과 데이터 파싱에 실패하였습니다.");
		} catch (MsgException ke) {
			AppLog.error("MsgException 오류", ke);
			throw ke;
		} catch (Exception ex) {
			AppLog.error("OkHttp3 코어 오류", ex);
			throw new MsgException(Exceptions.ERROR, Business.XOM, "문서뷰어 연계 모듈에서 알수 없는 오류가 발생하였습니다.");
		} finally {
			if (null != response) response.close();
		}
		return result;
	}
}
