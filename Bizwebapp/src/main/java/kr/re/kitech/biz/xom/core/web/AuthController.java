package kr.re.kitech.biz.xom.core.web;

import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.login.LoginInfo;
import com.inswave.elfw.login.LoginProcessor;
import com.ksign.access.api.SSORspData;
import com.ksign.access.api.SSOService;

import kr.re.kitech.biz.xom.base.enums.LoginType;
import kr.re.kitech.biz.xom.core.ext.BaseUrlProperty;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.LoginVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 임시 인증 컨트롤러, 추후 SSO 전환 처리
 *  
 * @author James
 */
@Controller
@PropertySource("classpath:/inswave/properties/common.properties")
public class AuthController {

	@Value("${auth.kind}")
	private String authKind;	
	
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
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Resource(name = "accntServiceImpl")
	private AccntService accntService;	
		
	/**
	 * 로그인을 처리합니다.
	 * @param request HttpServletRequest
	 * @throws Exception
	 */
	@ElService(key = "SvcComLogin")    
    @RequestMapping(value = "SvcComLogin")   
    @ElDescription(sub = "로그인 ", desc = "로그인을 처리합니다.")
	@ElValidator(errUrl = "")           
    public LoginInfo login(LoginVo loginVo ,HttpServletRequest request) throws Exception {
		AppLog.debug("- Login 페이지 : " + loginVo);
		String apiKey = "";
		LoginType loginType = LoginType.codeOf(loginVo.getTp());
		switch (loginType) {
			case BIZ: apiKey = this.bizApiKey; break;
			case BPM: apiKey = this.bpmApiKey; break;
			case EIP: apiKey = this.eipApiKey; break;
			case MBI: apiKey = this.mbiApiKey; break;
		}
		
    	LoginInfo info = loginProcess.processLogin(request, loginVo.getId(), loginVo.getPw(), loginType, apiKey);
    	AppLog.debug("- Login 정보 : " + info.toString());    
    	
    	return info;	
    }
	
	/**
	 * 로그아웃을 처리합니다..
	 * @param request HttpServletRequest
	 * @throws Exception
	 */
	@ElService(key = "SvcComLogout")    
    @RequestMapping(value = "SvcComLogout")   
    @ElDescription(sub = "로그아웃", desc = "로그아웃을 처리합니다.")
	@ElValidator(errUrl = "")           
    public String logout(HttpServletRequest request, Model model) throws Exception {
		String id = KitechContextUtil.getUserId();
		AppLog.debug("- Loginout id : " + id);
		LoginInfo info = loginProcess.processLogout(request, id);
		
		AppLog.debug("- Loginout authKind : " + this.authKind);    
		model.addAttribute(ElConstants.EL_DATA_STRING, this.authKind);
    	AppLog.debug("- Loginout return info : ", info);
    	if (!"SSO".equalsIgnoreCase(this.authKind)) {
    		return "redirect:/";
    	}
    	
    	return "redirect:" + UriComponentsBuilder.fromHttpUrl( BaseUrlProperty.ssoSrvUrl + "/sso/pmi-logout-url.html")
           .queryParam("pmi-logout-url", BaseUrlProperty.ssoSrvUrl + "/sso/pmi-logout.html")
           .queryParam("returl", BaseUrlProperty.doorayUrl +"/auth/signout?nextUrl="+ BaseUrlProperty.ssoPxyUrl +"/sso/logout/biz3")
           .build()
           .toString();
    }
    
    
    /**
     * SSO 인증을 연계한다.
	 * 
     * @param request
     * @param empVo
     * @param model
     * @throws Exception
     */
    @ElService(key = "SvcSsoLoginPost")    
    @RequestMapping(value = "SvcSsoLoginPost")
    @ElDescription(sub = "SSO 세션연계 서비스", desc = "SSO 세션연계 서비스")
	@ElValidator(errUrl = "")
    public String loginPost(HttpServletRequest request) throws Exception {  

		AppLog.debug("- Login 페이지 : " + request);
		Enumeration<String> keys = request.getParameterNames();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			AppLog.debug("[" + key + "] ===> " + request.getParameter(key));
		}
        AppLog.debug("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+");
        AppLog.debug("\t\tSSO loginPost");
        AppLog.debug("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+");
        SSOService ssoService = SSOService.getInstance();
        SSORspData rspData = ssoService.ssoGetLoginData(request);
        String syspayno = rspData.getSSN();
        AppLog.debug("sso loginPost : {}", rspData);
        AppLog.debug("sso loginPost.uid : {}", rspData.getUID());
        AppLog.debug("sso loginPost.sn : {}", syspayno);
        AppLog.debug("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+");


        // if (null != syspayno && (this.allows.contains(syspayno.substring(2)) || syspayno.startsWith("99"))) {	        
        String apiKey = "";
        
		// 위에 등록된 사용자거나 99 로 시작하는 시스템 사번인 경우만 로그인 후 index 페이지로 리다이렉션 처리
		UserVo resUserVo = accntService.findUserByUsername(rspData.getUID());	// 사용자 조회
		LoginInfo info = loginProcess.processLogin(request, resUserVo.getUid(), resUserVo.getUserPassword(), LoginType.SSO, apiKey);
    	AppLog.debug("- SSO 세션연계 서비스 Login 정보 : " + info.toString());
    	
    	String returnUrl = request.getParameter("returnurl");
    	return "redirect:" + (StringUtils.isNotEmpty(returnUrl) ? returnUrl : "/") ;
    }
}
