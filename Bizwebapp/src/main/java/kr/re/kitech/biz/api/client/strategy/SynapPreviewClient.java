package kr.re.kitech.biz.api.client.strategy;

import java.io.File;
import java.io.IOException;

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

import kr.re.kitech.biz.api.client.SynapClient;
import kr.re.kitech.biz.api.client.fw.ApiClientConfig;
import kr.re.kitech.biz.xom.base.enums.Attaches;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.MsgException;
import kr.re.kitech.biz.xom.core.service.AttachService;
import kr.re.kitech.biz.xom.core.vo.AttachVo;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service("synapPreviewClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SynapPreviewClient implements SynapClient {
	public static String PRE_SERVICE = "/jobFileJson";
	
    @Value("${api.synap.url}")
    private String baseUrl;

    @Autowired
    private OkHttpClient apiClient;
    
    /** AttachService */
    @Lazy
    @Resource(name = "attachServiceImpl")
    private AttachService attachService;  

	@Override
	public String makeEndPoint(AttachVo attachvo) {
		return baseUrl + PRE_SERVICE;
	}

	@Override
	public RequestBody buildBody(AttachVo attachvo) {
		MultipartBody.Builder body = new MultipartBody.Builder().setType(MultipartBody.FORM)
			.addFormDataPart("fid", attachvo.getAttach_file_no() + attachvo.getSeq());
			
		// 첨부파일 파라미터 구성
		if (null != attachvo.getAttach_file_no()){
			attachvo = attachService.selectAttach(attachvo);
			
			String realPath = StringUtils.cleanPath( Attaches.BIZ_STORAGE_ROOT.getCode() + File.separator + attachvo.getAttachFullPath());
			AppLog.debug("ATTACH PATH : " + realPath);
			File file = new File(realPath);
			
			if (!file.isFile()) {
				realPath = StringUtils.cleanPath( Attaches.PAT_STORAGE_ROOT.getCode() + File.separator + attachvo.getAttachFullPath());
				file = new File(realPath);
			}
			
			body.addFormDataPart("file"
				, attachvo.getOrgFile()
				, RequestBody.Companion.create( file, ApiClientConfig.MULTIPART)
			);
        }
        return body.build();
	}

	@Override
	public Response sendRequest(AttachVo attachvo) throws IOException {
		Request request =new Request.Builder()
				.url(this.makeEndPoint(attachvo))
				.post(this.buildBody(attachvo))
				.addHeader("Connection", "close")				
				.addHeader(HttpHeaders.CONTENT_TYPE, ApiClientConfig.MULTIPART.toString())
				.build();
				
		try {
			Response response = apiClient.newCall(request).execute();	
			if (HttpStatus.OK.value() != response.code()){
				if (HttpStatus.BAD_REQUEST.value() == response.code()) {
					throw new MsgException(Exceptions.ERROR, Business.XOM, "파일이 손상되었거나 빈 파일입니다.");
				} else {
					throw new IOException("HTTP 응답이 200 이 아님!!");
				}
			}
			return response;
		} catch (Exception ex) {
			throw new MsgException(Exceptions.ERROR, Business.XOM, "Synap 서버의 응답이 올바르지 않습니다.");
		}
	}

	@Override
	public String parseResponse(JSONObject jobject) throws IOException {
		return baseUrl + "/" + jobject.getString("viewUrlPath");
	}
}
