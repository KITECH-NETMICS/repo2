package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
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
import kr.re.kitech.biz.api.client.vo.CsrListVo;
import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
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
@Service("csrLstClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CsrLstClient implements CsrClient {
//	public static String LST_SERVICE = "/rest/v1/wf/reqlist/";
	
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
//		return this.baseUrl + LST_SERVICE + csr.getUserLoginId();
		return this.baseUrl + "/JSONServlet?Action@@@=com.gtone.site.actions.work.SiteGetDocListAction";
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#buildBody(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public RequestBody buildBody(CsrVo csr){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("INST_DT_FROM", csr.getStart_ymd());
		jsonObject.put("INST_DT_TO", csr.getCls_ymd());
//		jsonObject.put("ACT_ID", "");
		jsonObject.put("ADMIN_YN", "Y");
//		jsonObject.put("BIZ_ID", "");
		jsonObject.put("CALL_TYPE", "SEARCH_ROLE_DOC");
		jsonObject.put("DATE_GUBUN", "START");
		jsonObject.put("DOC_NO", csr.getInstId() == 0 ? "": csr.getInstId() + "");
		jsonObject.put("FIRST_GUBUN", "1");
		jsonObject.put("HEADER_ID", "SearchDocList");
		jsonObject.put("INST_NAME", csr.getChangeTitle());
		jsonObject.put("INST_START_USER_NAME", csr.getNm());
//		jsonObject.put("INST_STATUS_CD", "");
//		jsonObject.put("PROC_ID", "");
		jsonObject.put("SET_DATE", "1W");
		jsonObject.put("USER_ID", "0");
        
        return RequestBody.Companion.create(jsonObject.toString(), ApiClientConfig.JSON);
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#sendRequest(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public Request getRequest(CsrVo req) {
		long now = System.currentTimeMillis();
		long timeout = 28800000;
		long expriryTime = now + timeout;

		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.post(this.buildBody(req))
			.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.JSON.toString())
			.addHeader("X-CustomAuthToken", this.apiKey)
			.addHeader("Connection", "close")			
			.addHeader("Cookie", "DWRSESSIONID=jPQa6ISUoJdA5J7~jb331Qcvo9tMQaFLq6o;" 
				+ "auth=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJkb29yYXkiLCJzbiI6Ijk5OTkxMTMwIiwiaWF0IjoxNjU4MTAzODMzLCJ1cmwiOiJodHRwczpcL1wva2l0ZWNoLmdvdi1kb29yYXkuY29tIn0.ZpDRRavEGkgIhct39-XqJq7PrYmgzgSV2g6dkcshaNpZqICWndMM_sIMSRzA-dq6nYtw5eQZQnFm4pQWgfwtFQ;" 
				+ "sys=99991130;"
				+ "JSESSIONID=9F7F7DE7F595E92A9DB0951563229266;" 
				+ "clientTimeOffset=72868;" 
				+ "latestTouch=" + now + ";"
				+ "sessionExpiry=" + expriryTime + ";" 
				+ "remainTime=" + (now - expriryTime))
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
    		JSONArray csrList = (JSONArray)jobject.get("GRID_DATA");
    		List<CsrListVo> listTemp = new ArrayList<>();
    		
	    	if (csrList != null && csrList.length() > 0 ) {
	    		Map<String, Object> map = null;
	    		for (int i = 0; i < csrList.length(); i++) {
		    		JSONObject csrJson = csrList.getJSONObject(i);
		    		map = csrJson.toMap();
		    		CsrListVo csrTemp = new CsrListVo();
		    		csrTemp.setInst_id((int)map.get("INST_ID"));
		    		csrTemp.setInst_dt(((String)map.get("INST_START_DT")).substring(0, 8));
		    		csrTemp.setNm((String)map.get("INST_START_NM"));
		    		csrTemp.setRcpt_nm((String)map.get("PARTICIPANT_NAME"));
		    		csrTemp.setChange_title((String)map.get("INST_NAME"));
		    		csrTemp.setStatus_nm((String)map.get("DISPLAY_ACT_NAME"));
		    		listTemp.add(csrTemp);
		    	}
		    	listTemp.sort(new Comparator<CsrListVo>() {
		    		@Override
		    		public int compare(CsrListVo o1, CsrListVo o2) {
		    			int instId1 = o1.getInst_id();
		    			int instId2 = o2.getInst_id();
		    			
		    			if (instId1 == instId2) return 0;
		    			else if (instId1 > instId2) return -1;
		    			else return 1;
		    		}
				});
	    	}
	    	csr.setCsrVoList(listTemp);
	    	return csr;
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

	
}
