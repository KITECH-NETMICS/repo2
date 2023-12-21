package kr.re.kitech.biz.api.client.strategy;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ElMsgUtil;

import kr.re.kitech.biz.api.client.CsrClient;
import kr.re.kitech.biz.api.client.enums.CsrType;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.xom.base.enums.Attaches;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.service.AttachService;
import kr.re.kitech.biz.xom.core.vo.AttachVo;
import okhttp3.MultipartBody;
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
@Service("csrCrtClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CsrCrtClient implements CsrClient {
	public static String CRT_SERVICE = "/rest/v1/wf/create/";

	
    @Value("${api.csr.key}")
    private String apiKey;
    
    @Value("${api.csr.url}")
    private String baseUrl;
    
    /** AttachService */
    @Lazy
    @Resource(name = "attachServiceImpl")
    private AttachService attachService;    

    @Autowired
    private OkHttpClient apiClient;
    
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#makeEndPoint(java.lang.String)
	 */
	@Override
	public String makeEndPoint(CsrVo csr){
		AppLog.debug(this.baseUrl + CRT_SERVICE + CsrType.valueOf(csr.getCsrType()).getCode());
		return this.baseUrl + CRT_SERVICE + CsrType.valueOf(csr.getCsrType()).getCode();
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#buildBody(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public RequestBody buildBody(CsrVo csr){
	
		// 기본 파라이터 구성
		MultipartBody.Builder body = new MultipartBody.Builder().setType(MultipartBody.FORM)
			.addFormDataPart("CHANGE_TITLE", csr.getChangeTitle())
			.addFormDataPart("CHANGE_REASON", csr.getChangeReason())
			.addFormDataPart("EXPECTED_DT", csr.getExpectedDt())
			.addFormDataPart("NEXT_LOGIN_ID", csr.getNextLoginId())
			.addFormDataPart("USER_LOGIN_ID", csr.getUserLoginId())
			.addFormDataPart("USER_DEP_ID", csr.getUserDepId())
			.addFormDataPart("MID_CATEGORY", csr.getMidCategory());
			
		// 첨부파일 파라미터 구성
		if (null != csr.getAttachFileNo()){
			List<AttachVo> attaches = attachService.selectListAttach(csr.getAttachFileNo());
			if (null != attaches && 0 < attaches.size()){
				AtomicInteger index = new AtomicInteger();
				attaches.forEach(attach -> {
					String realPath = StringUtils.cleanPath( Attaches.BIZ_STORAGE_ROOT.getCode() + File.separator + attach.getAttachFullPath());
					int i = index.incrementAndGet();
					AppLog.debug("ATTACH["+i+"]" + realPath);
					body.addFormDataPart("ATTACH" + i
						, attach.getOrgFile()
						, RequestBody.Companion.create( new File(realPath), ApiClientConfig.MULTIPART)
					);
		        });
	        }
        }
        
        return body.build();
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.client.CsrClient#sendRequest(kr.re.kitech.biz.xom.core.client.vo.CsrVo)
	 */
	@Override
	public Request getRequest(CsrVo req) {
		return new Request.Builder()
			.url(this.makeEndPoint(req))
			.post(this.buildBody(req))
			.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.MULTIPART.toString())
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
	public CsrVo parseResponse(JSONObject jobject)  {
		CsrVo csr = new CsrVo();
		try {
	    	Map<String,Object> result = jobject.toMap();
	    	String successYn = null != result.get("SUCCESS_YN") ? (String)result.get("SUCCESS_YN") : "N";
	        csr.setSuccessYn(org.apache.commons.lang3.StringUtils.equals(successYn, "Y") ? "Y" : "N"); 
	        csr.setInstId(jobject.getInt("INST_ID"));             
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
