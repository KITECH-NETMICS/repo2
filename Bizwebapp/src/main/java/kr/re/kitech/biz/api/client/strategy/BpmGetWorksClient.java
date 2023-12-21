package kr.re.kitech.biz.api.client.strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ElMsgUtil;

import kr.re.kitech.biz.api.client.BpmClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.model.ApiCountResult;
import kr.re.kitech.biz.api.client.model.ApiWorkResult;
import kr.re.kitech.biz.api.client.vo.ApiResult;
import kr.re.kitech.biz.api.client.vo.BpmRequest;
import kr.re.kitech.biz.api.client.vo.BpmResult;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.BpmException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * BPM 결재리스트를 다건 조회 API 연계 클라이언트 구현체. (타스크 단위 리스트: 업무대기함, 결재대기함)
 *
 * @author James
 * @since 2022. 5. 20.
 */
@Component("bpmGetWorks")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BpmGetWorksClient implements BpmClient {
	public static String SERVICE = "/rest/bpm/process-worklist";
    
    @Value("${api.bpm.url}")
    private String baseUrl;
      
    @Autowired
    private OkHttpClient apiClient;    
    
    private String proc;

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.BpmClient#makeEndPoint(kr.re.kitech.biz.api.client.vo.BpmReqVo)
	 */
	public String makeEndPoint(BpmRequest req){
    	this.proc = req.getProc();
    	    	
		HttpUrl template = HttpUrl.parse(this.baseUrl + SERVICE + (StringUtils.isNotEmpty(this.proc) ? "/{proc}" : ""));
		HttpUrl.Builder builder = template.newBuilder();
		if (StringUtils.isNotEmpty(this.proc)) {
			builder.setPathSegment( ArrayUtils.indexOf(template.pathSegments().toArray(), "{proc}"), this.proc);
		}
		
		builder.addQueryParameter("endpoint",req.getEndpoint());
		if (StringUtils.isNotEmpty(req.getInstName())) builder.addQueryParameter("instName",req.getInstName());
		if (StringUtils.isNotEmpty(req.getInstSatus())) builder.addQueryParameter("instStatus",req.getInstSatus());
		if (StringUtils.isNotEmpty(req.getTaskStatus())) builder.addQueryParameter("taskStatus",req.getTaskStatus());
		if (StringUtils.isNotEmpty(req.getTaskExt1())) builder.addQueryParameter("taskExt1",req.getTaskExt1());
		if (StringUtils.isNotEmpty(req.getTaskExt3())) builder.addQueryParameter("taskExt3",req.getTaskExt3());
		if (StringUtils.isNotEmpty(req.getTool())) builder.addQueryParameter("tool",req.getTool());
		if (StringUtils.isNotEmpty(req.getDefName())) builder.addQueryParameter("defName",req.getDefName());
		if (StringUtils.isNotEmpty(req.getInstInfo())) builder.addQueryParameter("instInfo",req.getInstInfo());
		if (StringUtils.isNotEmpty(req.getInitepName())) builder.addQueryParameter("initepName",req.getInitepName());
		if (StringUtils.isNotEmpty(req.getInstStartDateFrom())) builder.addQueryParameter("instStartedDateFrom",req.getInstStartDateFrom());
		if (StringUtils.isNotEmpty(req.getInstStartDateTo())) builder.addQueryParameter("instStartedDateTo",req.getInstStartDateTo());
		if (StringUtils.isNotEmpty(req.getInstFinishedDateFrom())) builder.addQueryParameter("instFinishedDateFrom",req.getInstFinishedDateFrom());
		if (StringUtils.isNotEmpty(req.getInstFinishedDateTo())) builder.addQueryParameter("instFinishedDateTo",req.getInstFinishedDateTo());
		if (StringUtils.isNotEmpty(req.getInstExt1())) builder.addQueryParameter("instExt1",req.getInstExt1());
		if (StringUtils.isNotEmpty(req.getOrderBy())) builder.addQueryParameter("orderBy",req.getOrderBy());
		if (null != req.getPageNum()) builder.addQueryParameter("pageNum",req.getPageNum().toString());
		if (null != req.getPageSize()) builder.addQueryParameter("pageSize",req.getPageSize().toString());
		if (StringUtils.isNotEmpty(req.getTotalSearch())) builder.addQueryParameter("totalSearch",req.getTotalSearch());	// 전체검색
		if (StringUtils.isNotEmpty(req.getTaskName())) builder.addQueryParameter("taskName",req.getTaskName());
		if (StringUtils.isNotEmpty(req.getBudgetControl())) builder.addQueryParameter("budgetControl",req.getBudgetControl());

		return builder.build().toString();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.BpmClient#buildBody(kr.re.kitech.biz.api.client.vo.BpmReqVo)
	 */
	@Override 
	public RequestBody buildBody(BpmRequest csr){
        return null;
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.BpmClient#sendRequest(kr.re.kitech.biz.api.client.vo.BpmReqVo)
	 */
	@Override
	public Request getRequest(BpmRequest req) {
		// URL 구성: API 종류에 따른 처리
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.addHeader("Content-Type", ApiClientConfig.JSON.toString())
			.addHeader("Authorization", req.getToken())
			.addHeader("Connection", "close")	
		.build();
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.BpmClient#sendRequest(okhttp3.Request)
	 */
	@Override
	public Response sendRequest(Request request) {
		try {
			Response response = apiClient.newCall(request).execute();
			if (HttpStatus.OK.value() != response.code()){
				AppLog.info("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
				AppLog.info("HttpStatus.OK 가 아님 : ", response);
				AppLog.info("=============================================================================================================================");
				throw new IOException();
			}

			return response;
		} catch (Exception ex) {
			String msg = "BPM 서버와의 연결에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.bpm.001"); } catch (Exception e) {}
			throw new BpmException(Exceptions.ERROR, Business.APR, msg);
		}
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.client.BpmClient#parseResponse(org.json.JSONObject)
	 */
	@Override
	public BpmResult parseResponse(JSONObject jobject) {
		try {
			List<ApiResult> apiResults = null;
			ApiResult apiResult = null;		
			if (StringUtils.isEmpty(this.proc)) {
				TypeFactory tFac = TypeFactory.defaultInstance();
				apiResults = new ObjectMapper().readValue(
						  jobject.get(RES_COL_NAME_DATA).toString()
						, tFac.constructCollectionType( ArrayList.class, ApiWorkResult.class)
				);
	        } else {
	        	ApiCountResult apiCountResult = new ApiCountResult();
	        	apiCountResult.setCount(jobject.getInt(RES_COL_NAME_DATA));
	        	apiResult = apiCountResult;
	        }
	        return new BpmResult.Builder(true).apiResults(apiResults).apiResult(apiResult).build();
		} catch (JSONException | IOException ex) {
			String msg = "BPM 응답 데이터 파싱에 실패하였습니다.";
			try { msg = ElMsgUtil.getMessage("message.xom.co.client.bpm.005"); } catch (Exception e) {}			
			return new BpmResult.Builder(false).errMessge(msg).build();
		}
	}
}
