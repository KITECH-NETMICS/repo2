package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.CooconClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.vo.AccountVerfVo;
import kr.re.kitech.biz.xom.core.vo.CodeVo;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 계좌검증 API 연계 클라이언트 구현체.
 *
 * @author 이영희
 * @since 2022. 8. 18.
 */
@Service("cooconClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class KitechCooconClient implements CooconClient {	
	private static final boolean isReal = true;
	
	private static final String USER_AGENT = "Mozilla/5.0";
	private static final String COMMON_API_ENDPOINT = isReal ? "https://gw.coocon.co.kr" : "https://dev2.coocon.co.kr:8443" ;	
	private static final String COMMON_API_TOKEN	= isReal ? "TnOrVLer2BDGiOssTrNg" : "TnOrVLer2BDGiOssTrNg" ;
	private static final String COMMON_API_PREFIX = "";
	
	// 예금주
	private static final String API_GET_MEMBER 	= "/sol/gateway/acctnm_rcms_wapi.jsp";

    @Autowired
    private OkHttpClient apiClient;
    
	/**
    * 계좌검증
    * @param AccountVerfVo
    * @return CooconVerfVo
    * @author LeeYH
    * @since 2022.08.18.
    */
	@Override
	public AccountVerfVo getAccountInfo(AccountVerfVo vo) {
		Response response = null;
		try {
			response = this.sendRequest(vo);
			String result = response.body().string();
			
			AppLog.debug("\n ########### respense1 : " + result);
			
			JSONObject respenseObject = new JSONObject(result);
			
			if ("정상처리".equals(respenseObject.getString("RSLT_MSG"))){
				JSONObject json = respenseObject.getJSONArray("RESP_DATA").getJSONObject(0);
							
				vo.setRes_data(json.getString("ACCT_NM"));	
				vo.setResult(respenseObject.getString("RSLT_CD"));
				vo.setSuccess("완료");
			} else {
				vo.setRes_data(respenseObject.getString("RSLT_MSG"));
				vo.setResult(respenseObject.getString("RSLT_CD"));
				vo.setSuccess("미완료");
			}
		} catch (IOException e) {
			e.printStackTrace();
			vo.setSuccess("실패");
		} finally {
			if (null != response) response.close();
		}
		return vo;
	}
	
	private String makeUrl(AccountVerfVo vo){
		HttpUrl template = HttpUrl.parse(COMMON_API_ENDPOINT + API_GET_MEMBER);
		HttpUrl.Builder builder = template.newBuilder();
		
		JSONObject json = new JSONObject();
		json.put("SECR_KEY", COMMON_API_TOKEN);
		json.put("KEY", "ACCTNM_RCMS_WAPI");
		json.put("CHAR_SET", "euc-kr");		
		
		JSONArray jsonArr = new JSONArray();
		JSONObject json2 = new JSONObject();
		CodeVo codeVo = CodeCacheManager.getInstance().getCode("FAA", vo.getBank_cd());				
		json2.put("BANK_CD", codeVo.getMngmtItem1());
		//json2.put("BANK_CD", vo.getBank_cd());
		json2.put("SEARCH_ACCT_NO", vo.getBankaccnt_no());
		json2.put("ACNM_NO", "");
		if(vo.getIche_amt() > 0){
			json2.put("ICHE_AMT", String.valueOf(vo.getIche_amt()));
		}else{
			json2.put("ICHE_AMT", "1");
		}
		json2.put("TRSC_SEQ_NO", vo.getTrsc_seq_no());
		jsonArr.put(json2);
		
		json.put("REQ_DATA", jsonArr);
		
		builder.addQueryParameter("JSONData", json.toString());		
		return builder.build().toString();
	}
	
	public Response sendRequest(AccountVerfVo vo) throws IOException {
		// URL 구성: API 종류에 따른 처리
		Request request = new Request.Builder()
			.url(this.makeUrl(vo))			
			.addHeader("User-Agent", USER_AGENT)	
			.addHeader("Content-Type", ApiClientConfig.JSON.toString())	
			.addHeader("Authorization", COMMON_API_PREFIX+COMMON_API_TOKEN)			
			.addHeader("Connection", "close")				
		.build();

		try {
			Response response = apiClient.newCall(request).execute();
			if (HttpStatus.OK.value() != response.code()){
				throw new IOException("HTTP 응답이 200 이 아님!!");
			}
			return response;
		} catch (Exception ex) {
			throw new MsgException(Exceptions.ERROR, Business.APR, "KDOC 서버와의 연결에 실패하였습니다.");
		}
	}
}
