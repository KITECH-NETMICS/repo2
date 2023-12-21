package kr.re.kitech.biz.xom.base;

import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.inswave.elfw.core.UserHeader;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.login.LoginInfo;
import com.inswave.elfw.login.LoginProcessor;
import com.inswave.elfw.util.ControllerContextUtil;
import com.ksign.access.api.SSORspData;
import com.ksign.access.api.SSOService;

import io.jsonwebtoken.Claims;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.enums.LoginType;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.security.JwtProvider;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.HeaderJsonConverter;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 세션 체크
 */
@Component
public class BizAuthProcess {

	@Value("${api.server.bpm.key}")
	private String bpmApiKey;

	@Value("${api.server.biz.key}")
	private String bizApiKey;

	@Value("${api.server.eip.key}")
	private String eipApiKey;
	
	@Value("${api.server.mbi.key}")
	private String mbiApiKey;	
	
    @Resource(name = "loginProcess")
	protected LoginProcessor loginProcess;

	@Resource(name = "accntServiceImpl")
	private AccntService accntService;	
	
	@Resource(name = "jwtProvider")
	private JwtProvider jwtProvider;	

	public BizAuthProcess(){
	
	}

	
	/**
	 * 토큰 유효성 확인 및 유효한 토큰으로 직접 인증 처리
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	private UserHeader jwtLogin(HttpServletRequest request, LoginType loginType, String apiKey) throws Exception{

		String token = request.getHeader("Authorization");
		AppLog.info("JWT: " + token);
		if (StringUtils.isEmpty(token) || !token.startsWith("Bearer ")) {
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.auth.jwt.0003"); // "헤더에 JWT 가 존재 하지 않음 !!"
		}
		
		Claims claims = jwtProvider.validTokenAndReturnBody(token.replace("Bearer ", ""));
		String username = claims.get("username", String.class);
		AppLog.debug("claims = " + claims);

		// JWT 인증이 완료되었으므로 패스워드에 Api 키를 넘겨 인증을 우회 처리한다.
		UserVo resUserVo = accntService.findUserByUsername(username);
		LoginInfo info = loginProcess.processLogin(request, resUserVo.getUid(), apiKey, loginType, apiKey);
		AppLog.debug("- JWT 세션 연계 서비스 Login 정보 : " + info.toString());	
		
		return ControllerContextUtil.getUserHeader();
	}

	/**
	 * 인증 체크
	 * @param request
	 * @param svcId
	 * @param inputData obj[0] 패스워드, obj[1] 인증타입, obj[2] apiKey 
	 * @throws Exception
	 */
	public void checkAuth(HttpServletRequest request, String svcId, String inputData) throws Exception{
		if (null == svcId) {
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.wq.001");
		}
		
		UserHeader userHeader = ControllerContextUtil.getUserHeader();
		String mbiSvc = request.getHeader("mbiSvc");
		AppLog.debug("- UserHeader : " + userHeader);
		
		// 인증관련 서블릿 URL 제거
		if (Arrays.asList(new String[]{"SvcComLogin","SvcSsoLoginPost","AdminEL/reloadNotify"}).contains(svcId) || svcId.startsWith("ApiEip")){
			return;
		}

		// API 토큰 유효성 체크 및 세션 강제 설정
		if (svcId.startsWith("Api")) {
			// 내부 API 호출인 경우 별도 인증 처리 하지 않음
			if (null == userHeader || null == userHeader.getUserId()){
				if (svcId.startsWith("ApiRegacy")) {
					userHeader = this.jwtLogin(request, LoginType.BIZ, this.bizApiKey);
				} else if (svcId.startsWith("ApiBpm")) {
					userHeader = this.jwtLogin(request, LoginType.BPM, this.bpmApiKey);
				} else if (svcId.startsWith("ApiEip")) {
					userHeader = this.jwtLogin(request, LoginType.EIP, this.eipApiKey);
				}
			}
		} else if (null != inputData || null != mbiSvc) {
			BizUserHeader bizUserHeader = HeaderJsonConverter.jsonToHeader(inputData, BizUserHeader.class);
			// 모바일 웹에서 호출한 서비스 인증 체크
			if (bizUserHeader.isMbiSvc() || (null != mbiSvc && mbiSvc.equals("true"))){
				userHeader = this.jwtLogin(request, LoginType.MBI, this.mbiApiKey);
			}
		}
		
		if (null == userHeader || null == userHeader.getUserId()){
			AppLog.info("USER HEADER CHECK: ", userHeader);
	        SSOService ssoService = SSOService.getInstance();
	        SSORspData rspData = ssoService.ssoGetLoginData(request);
	        
	        if (null != rspData && StringUtils.isNotEmpty(rspData.getUID())) {
				UserVo resUserVo = accntService.findUserByUsername(rspData.getUID());	// 사용자 조회
				LoginInfo info = loginProcess.processLogin(request, resUserVo.getUid(), resUserVo.getUserPassword(), LoginType.SSO, "");
				AppLog.info("================ SSO 세션이 살아 있으므로 재로그인 처리 ===============", info);
				
			} else {

				throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.wq.001");  // Ldap Core error
			}
		}
	}
}
