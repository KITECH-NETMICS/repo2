package kr.re.kitech.biz.xom.base;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.inswave.elfw.adapter.AdapterException;
import com.inswave.elfw.core.UserHeader;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.session.SessionDataAdapter;
import com.inswave.elfw.util.ControllerContextUtil;
import com.inswave.elfw.util.ElBeanUtils;

import kr.re.kitech.biz.api.client.AuthClient;
import kr.re.kitech.biz.xom.base.enums.LoginType;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @Class Name : BizSessionDataAdapter.java
 * @Description : 프로젝트 세션 데이터 어댑터 - 로그인 후 사용자 헤더 정보를 Setting 한다. 
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2019.08.01   EL개발팀             최초생성
 * 
 * @author EL개발팀
 * @since 2013.08.01
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by Inswave All right reserved. 
 */
public class BizSessionDataAdapter extends SessionDataAdapter {

	/**
	 * SessionAdapter 생성자이다.
	 * 
	 * @param adapterInfoMap Adapter 정보
	 */
	public BizSessionDataAdapter(Map<String, Object> adapterInfoMap) {
		super(adapterInfoMap);
	}


	/**
	 * 세션 터이터의 로드를 담당하는 구현체 메소드.
	 * - 프레임워크 SessionDataAdapter 추상클래스의 세션 데이터를 Set 하는 구현체 메소드
	 * - 프로젝트에 필요한 헤더 정보를 세팅한다. 
	 * -  해당 헤더 정보는 로그인 후에 사용가능하다. 
	 * 
	 * @param request HttpServletRequest
	 * @param id
	 * @param obj 기타 동적 파라미터에 추가할 수 있다.(ex. 서비스 구현체 )
	 * @return BizUserHeader
	 * @throws AdapterException
	 */
	@Override
	public BizUserHeader setSessionData(HttpServletRequest request, final String username, final Object... params) throws AdapterException{
		AppLog.debug("[ADAPTER] ==============] setSessionData [===============");
		// 로그인 후에 id 기반으로 세션 정보를 세팅하여 반환한다.		
		BizUserHeader userHeader = new BizUserHeader();
		userHeader.setUserId( username);
		
		try{
			AppLog.debug("username => [" + username + "]");
			if (null != params){
				for(Object o : params){
					AppLog.debug("param => [" + o + "]");
				}
			}
			// 세션 데이터 조회
			final LoginType loginType = (LoginType)params[1];
			AccntService accntService = (AccntService)ElBeanUtils.getBean("accntServiceImpl");
			SessionUserHeader session = accntService.findSessionDataByUsernameAndLoginType(username, loginType);
			if( session == null ) {
				throw new AdapterException("EL.ERROR.LOGIN.0004", new String[]{username});
			}
			
			// API 토큰 정보를 사용자 세션 객체에 설정 
			AuthClient authClient = (AuthClient)ElBeanUtils.getBean("authClient");
			session.setBpmToken(authClient.getApiBpmClientToken());
			session.setEipToken(authClient.getApiEipClientToken());
			
			SessionUserHeader oldSession = KitechContextUtil.getSession();
			if(null != oldSession && StringUtils.equals(oldSession.getSn(), session.getSn())) {
				session.setServiceId( oldSession.getServiceId());
			}
			AppLog.debug("oldSession => [" + oldSession + "]");
			AppLog.debug("newSession => [" + session + "]");		
			
			// 사용자 세션을 UserHeader 에 설정
			userHeader.setSession(session);
			UserHeader header = ControllerContextUtil.getUserHeader();
			AppLog.debug("- UserHeader header: " + header);

		}catch(ElException e){
			AppLog.error("setSessionData Error1",e);
			throw e;
		}catch(Exception e){
			AppLog.error("setSessionData Error2",e);
			throw new AdapterException("EL.ERROR.LOGIN.0005");
		}
		
		return userHeader;
	}

}
