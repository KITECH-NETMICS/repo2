package kr.re.kitech.biz.xom.base;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.login.LoginAdapter;
import com.inswave.elfw.login.LoginException;
import com.inswave.elfw.login.LoginInfo;
import com.inswave.elfw.util.ElBeanUtils;

import kr.re.kitech.biz.xom.base.enums.LoginType;
import kr.re.kitech.biz.xom.core.security.JwtProvider;
import kr.re.kitech.biz.xom.core.security.PasswordEncoder;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.vo.UserVo;


/**  
 * @Class Name : BizLoginAdapter.java
 * @Description : 프로젝트 로그인 어댑터
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/01/06   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/01/06
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by Inswave All right reserved. 
 */
public class BizLoginAdapter extends LoginAdapter {

	/**
	 * 데모용 로그인 어댑터의 생성자
	 * @param adapterInfoMap Adapter 정보
	 */
	public BizLoginAdapter(Map<String, Object> adapterInfoMap){
		super(adapterInfoMap);
	}
	
   /**
     * SSO 서버 호출을 통해 직접 SSO 토큰 가져오려고 하였으나 SSO 연동이 필요없는 것으로 파악되어 중지
     * @param user
     * @return
     */
    private String getToken(String username, String password){

        // HttpHeader 생성
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

        // HttpBody 생성
        MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
        params.add("cn", "resident");
        params.add("uid", username);
        params.add("j_username", username);
        params.add("password", password);
        params.add("j_password", username + password);

        // Http Request : 토큰 요청
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response = template.exchange(
            "https://sso.kitech.re.kr/sso/pmi-sso-login-uid-password2.jsp"
            , HttpMethod.POST
            , new HttpEntity<>(params, headers)
            , String.class
        );

        AppLog.info("===================] response sso [=======================");
        AppLog.info(response.getBody());

        return response.getBody();
    }	

	/**
	 * ID/PW 인증 처리를 담당한다.
	 *
	 * 프레임워크 DefaultLoginAdapter 추상클래스의 로그인 구현체 메소드
	 *
	 * @param request
	 * @param id
	 * @param params 기타 동적 파라미터에 추가할 수 있다.(ex. 서비스 구현체 )
	 * @return LoginInfo
	 * @throws LoginException
	 */
	@Override
	public LoginInfo login(HttpServletRequest request, String username, final Object... params) throws LoginException {
		AppLog.debug("[ADAPTER] ====================] login [=====================");

		LoginInfo info = new LoginInfo();		
		try{
			// 기본 데이터 필드 설정
			final String password = (String)params[0];
			final LoginType loginType = (LoginType)params[1];
			final String apiKey = (String)params[2];
			
			if (loginType.isApiAuthorization()) {
				// API 타입이라면 서버의 API 키와 파라미터로 넘어온 비밀번호(API키)를 검증한다. (대칭키: Secret Key)
				AppLog.info("API login 요청 ====> 서버 API 키: [" + apiKey +"], 파라미터키 API 키: [" + password +"]"+ ", loginType: [" +loginType + "]");
				if (!StringUtils.equals(password, apiKey)) {
					MessageSource messageSource = (MessageSource)ElBeanUtils.getBean("messageSource");
					throw new LoginException(messageSource, "message.xom.fw.error.login.004", new String[]{loginType.getTitle()});
				}
				
				// API 타입인  경우 키 검증 후 토큰 생성  외에는 의 경우 키 생성 (JWT)
				JwtProvider jwtProvider = (JwtProvider)ElBeanUtils.getBean("jwtProvider");				
				switch (loginType) {
					case BIZ: info.setMsg( jwtProvider.generateAccessToken(username)); break;
					case BPM: info.setMsg( jwtProvider.generateAccessToken("sysbpm")); break;
					case EIP: info.setMsg( jwtProvider.generateAccessToken("sysadmin")); break;
					case MBI: info.setMsg( jwtProvider.generateAccessToken(username)); break;
					default:
				}
			} else {
				// API 타입이 아닌 (SS0/SESSON) 검증이라면 아이디 패스워드 일치 여부 판별 
				AppLog.info("SS0/SESSON login 요청 ====> username: [" + username + "], password: [" + password + "], loginType: [" +loginType + "]"); 
				AccntService accntService = (AccntService)ElBeanUtils.getBean("accntServiceImpl");
				UserVo resUserVo = accntService.findUserByUsername(username);

				if( resUserVo == null) {
					throw new LoginException("message.xom.fw.error.login.0001");
				} else if(LoginType.SESSION == loginType && !PasswordEncoder.matches(password, resUserVo.getUserPassword())){
					throw new LoginException("message.xom.fw.error.login.0002");
				} else if(LoginType.SSO == loginType && !password.equals(resUserVo.getUserPassword())){
					throw new LoginException("message.xom.fw.error.login.0002");
				}
			}

			
			// 3. 로그인 성공 설정 
			AppLog.debug("[Login] Biz Login 성공.....");
			info.setSuc(true);

		} catch(Exception ex) {
			AppLog.error("BizLoginAdapter.login Error", ex);
			throw new LoginException("message.xom.fw.error.login.003");
		}

		return info;
	}

	/**
	 * 데모용 로그아웃 처리를 담당하는 구현체 메소드.
	 * 프레임워크 DefaultLoginAdapter 추상클래스의 로그아웃 구현체 메소드
	 * @param request
	 * @param id
	 * @param params 기타 동적 파라미터에 추가할 수 있다.
	 * @return LoginInfo
	 * @throws LoginException
	 */
	@Override
	public LoginInfo logout(HttpServletRequest request, String id, Object... params) throws LoginException {
		LoginInfo info = new LoginInfo();
		try{			
			// 1. 로그아웃 처리로직 추가
			request.getSession().invalidate();
			
			// 2. 로그아웃 성공 설정 
			info.setSuc(true);
			info.setMsg("SSO 로그아웃");
			AppLog.debug("[Logout] Biz Logout 성공.....");
			
		}catch(Exception e){
			throw new LoginException(e);
		}		
		return info;
	}

}
