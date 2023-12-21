package kr.re.kitech.biz.api.client;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.UserVo;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 추천메뉴 API 연계 클라이언트 최상위 인터페이스.
 * Strategy 패턴 및 Template Method 패턴 을 결합하여 추가 API 연계 건 발생시 해당 인터페이스를 별도 클래스로 구현한다.
 * execute 메소드는 모든 자식 클래스에서 공용으로 사용하는 템플릿 메소드이며 이외의 메소드는 요건에 따라 별도로 구현한다.
 * 
 * @author James
 * @since 2022. 5. 2.
 * @see kr.re.kitech.biz.xom.core.web.RecommMenuController.java
 */
public interface RecommClient {

	/**
	 * API Endpoint를 생성한다.
	 * @param url
	 * @param instId
	 * @return
	 */
	public String makeEndPoint(UserVo user);
	
	/**
	 * API Body 를 구성한다.
	 * @param user
	 * @return
	 */
	public RequestBody buildBody(UserVo user);
	
	/**
	 * 요청 객체를 생성한다.
	 * @param user
	 * @return
	 * @throws IOException
	 */
	public Response sendRequest(UserVo user) throws IOException;
	
	
	/**
	 * 응답 객체를 파싱한다.
	 * @param jobject
	 * @return
	 * @throws IOException
	 */
	public JSONObject parseResponse(JSONObject jobject) throws IOException;
	
		
	/**
	 * 실제 전송처리를 담당하는 메소드
	 * 
	 * @param user
	 * @return
	 */
	default public JSONObject execute(UserVo user) {
		JSONObject result = null;
		Response response = null;
		try {
			response = this.sendRequest(user);
			if (response.isSuccessful()) {
				String jsonData = response.body().string();
				JSONObject jobject = new JSONObject(jsonData);
				result = this.parseResponse(jobject);
			}
		} catch (JSONException je) {
			AppLog.error("OkHttp3 결과 파싱 오류", je);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.client.sch.002", je);
		} catch (KitechException ke) {
			AppLog.error("KitechException 오류", ke);
			throw ke;
		} catch (Exception ex) {
			AppLog.error("OkHttp3 코어 오류", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.client.sch.001", ex);
		} finally {
			if (null != response) response.close();
		}
		return result;
	}
}
