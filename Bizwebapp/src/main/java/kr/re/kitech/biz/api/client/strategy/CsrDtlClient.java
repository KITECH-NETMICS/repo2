package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.inswave.elfw.util.ElMsgUtil;

import kr.re.kitech.biz.api.client.CsrClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.AttachListVo;
import kr.re.kitech.biz.xom.core.vo.AttachVo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * CSR 문서 생성을 위한 형상관리 API 연계 클라이언트 구현체
 * Endpoint를 분기하여 라우팅 한다.
 *
 * @author James
 * @since 2022. 5. 3.
 */
@Service("csrDtlClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CsrDtlClient implements CsrClient {
	public static String DTL_SERVICE = "/rest/v1/wf/detail/";
	
    @Value("${api.csr.key}")
    private String apiKey;
    
    @Value("${api.csr.url}")
    private String baseUrl;

    @Autowired
    private OkHttpClient apiClient;
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#makeEndPoint(java.lang.String)
	 */
	@Override
	public String makeEndPoint(CsrVo csr){
		return this.baseUrl + DTL_SERVICE + csr.getInstId();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#buildBody(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public RequestBody buildBody(CsrVo csr){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#sendRequest(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public Request getRequest(CsrVo req) {
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.JSON.toString())
			.addHeader("X-CustomAuthToken", this.apiKey)
			.addHeader("Connection", "close")	
		.build();
	}
	
	@Override 
	public Response sendRequest(Request request){
		try {
			Response response = apiClient.newCall(request).execute();
			if (HttpStatus.OK.value() != response.code()){
				throw new IOException();
			}
			return response;
		} catch (Exception ex) {
			// "CSR 서버와의 연결에 실패하였습니다.";
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.client.csr.001");
		}
	}
		
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#parseResponse(org.json.JSONObject)
	 */
	@Override
	public CsrVo parseResponse(JSONObject jobject) {
		CsrVo csr = new CsrVo();
		try {
			// 하드코딩 하지 않을 방법 찾아야함 ex) Keyset 을 활용한 Method Invoke
	    	JSONObject temp = new JSONObject(jobject.get("RESULT").toString());
	    	Map<String,Object> result = temp.toMap();
	    	JSONArray attachArr = (JSONArray)temp.get("ATTACH");
	    	
	    	csr.setSuccessYn("Y");
	    	csr.setInstId((int)result.get("INST_ID"));
	    	csr.setBizNm((String)result.get("BIZ_NM"));
	    	csr.setChangeTitle((String)result.get("CHANGE_TITLE"));
	    	csr.setChangeReason(replaceTags((String)result.get("CHANGE_REASON")));
	    	csr.setWriteDt((String)result.get("WRITE_DT"));
	    	csr.setExpectedDt((String)result.get("EXPECTED_DT"));
	    	csr.setStatusDt((String)result.get("STATUS_DT"));
	    	csr.setWorkResult(replaceTags((String)result.get("WORK_RESULT")));
	    	csr.setMidCategory((String)result.get("MID_CATEGORY_NM"));
	    	csr.setSyspayno(String.valueOf(result.get("REQUEST_USER_ID")));
	    	csr.setExpectedEffect(replaceTags((String)result.get("EXPECTED_EFFECT")));
	    	String status = (String)result.get("STATUS");
	    	String statusNm = "";
	    	
			if (status == null) {
	    		statusNm = "요청";
	    	} else if (status.equals("ACTIVE")) {
	    		statusNm = "진행중";
	    	} else if (status.equals("FINISHED")) {
	    		statusNm = "완료";
	    		String satisfaction = (String)result.get("SATISFACTION");
	    		csr.setSatisfaction(satisfaction == null ? 0 : Integer.parseInt((String)satisfaction));
	    	}
	    	csr.setStatus(status);
	    	csr.setStatusNm(statusNm);
	    	
	    	if (attachArr != null && attachArr.length() > 0 ) {
		    	List<AttachVo> listTemp = new ArrayList<>();
		    	for (int i = 0; i < attachArr.length(); i++) {
		    		JSONObject att = attachArr.getJSONObject(i);
		    		AttachVo attTemp = new AttachVo();
		    		attTemp.setFile_nm(att.getString("ATTACH_NM"));
		    		attTemp.setAttach_file_no(att.getString("ATTACH_ID"));
		    		attTemp.setPath(att.getString("LINK").replaceAll("re.kr", "re.kr:8443"));
		    		attTemp.setEtc(att.getString("ATTACH_GROUP"));
		    		listTemp.add(attTemp);
		    	}
		    	AttachListVo attListTemp = new AttachListVo();
		    	attListTemp.setAttachVoList(listTemp);
		    	csr.setAttachVoList(listTemp);
	    	}
	    } catch (KitechException ex) {
	        throw ex;
		} catch (Exception ex) {
			String msg = "CSR 응답 데이터 파싱에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.csr.005"); } catch (Exception e) {}			
			csr.setSuccessYn("N");
			csr.setErrMsg(msg);
		}    	
		return csr;
	}
	
	private String replaceTags(String str) {
		if (str == null) return null;
		String retStr;
		retStr = str.replaceAll("&lt;p&gt;|&lt;&#x2F;p&gt;", "");
		retStr = retStr.replaceAll("&lt;br&gt;", "\n");
		return retStr;
	}
	
}
