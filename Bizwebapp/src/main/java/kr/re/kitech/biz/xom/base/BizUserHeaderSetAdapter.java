package kr.re.kitech.biz.xom.base;

import java.util.Map;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.adapter.AdapterException;
import com.inswave.elfw.core.ElHeader;
import com.inswave.elfw.core.UserHeader;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.session.UserHeaderSetAdapter;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.xom.base.model.BizUserHeader;

/**
 * 클라이언트의 Request / Response 시점에 프로젝트 UserHeader의 값 별도 설정을 처리한다.
 *
 * @author James
 * @since 2022. 1. 7.
 */
public class BizUserHeaderSetAdapter extends UserHeaderSetAdapter{

	public BizUserHeaderSetAdapter(Map<String, Object> adapterInfoMap) {
		super(adapterInfoMap);
	}

	/**
	 * 최초 클라이언트 요청 후 업무 Controller 호출 직전에 동작되며 프로젝트의 UserHeader 의 값을 설정하여 업무에 전달한다.
	 * 
	 * @see com.inswave.elfw.session.UserHeaderSetAdapter#setInputUserHeader(com.inswave.elfw.core.UserHeader)
	 */
	public void setInputUserHeader(UserHeader userHeader) throws AdapterException {
		AppLog.debug("[ADAPTER] ==============] setInputUserHeader [===============");
		BizUserHeader inputUserHeader = (BizUserHeader) userHeader;
		if (inputUserHeader != null) {
			// Input 에서 들어온 헤더 값으로 Context 의 UserHeader 값을 설정하여 Controller로 전달한다.( 필요한 값만 - 변조 위험 항목 제외 )
			BizUserHeader contextUserHeader = null;
			try {
			    contextUserHeader = (BizUserHeader) ControllerContextUtil.getUserHeader();
            }catch(Exception e){}
            
			if (contextUserHeader != null) {
				userHeader.setUserId(contextUserHeader.getUserId());
				userHeader.setUserGroupNo(contextUserHeader.getUserGroupNo());
				userHeader.setMenuGroupNo(contextUserHeader.getMenuGroupNo());
			} else {
			    contextUserHeader = new BizUserHeader();
			}
			
			// 아래 컨텍스트 변경 
			contextUserHeader.setSvcId(inputUserHeader.getSvcId());
			contextUserHeader.setImplExcel(inputUserHeader.isImplExcel());
			contextUserHeader.setExcel(inputUserHeader.isExcel());
			contextUserHeader.setBpmCancelKey(null);						// BPM Cancel Key 초기화
			contextUserHeader.setMbiSvc(inputUserHeader.isMbiSvc());	// 모바일 인앱에서 호출 여부
			ControllerContextUtil.setUserHeader(contextUserHeader);
			
			AppLog.debug("" + ControllerContextUtil.getUserHeader());			
		}
	}

	/**
	 * Cotroller 의 업무 처리가 정상 처리된 완료된 경우 클라이언트에 보낼 프로젝트 UserHeader 에 값의 설정이 필요한 경우
	 *
	 * @see com.inswave.elfw.session.UserHeaderSetAdapter#getOutputUserHeader(java.lang.String, com.inswave.elfw.core.ElHeader, com.inswave.elfw.core.UserHeader, java.lang.Object)
	 */
	public UserHeader getOutputUserHeader(String outputType, ElHeader elHeader, UserHeader userHeader, Object obj) throws AdapterException {
		AppLog.debug("[ADAPTER] ==============] getOutputUserHeader [===============");
		AppLog.debug("outputType : " + outputType);
	    BizUserHeader paramUserHeader = new BizUserHeader();
	    try {
		    paramUserHeader = (BizUserHeader)userHeader;
		} catch (Exception e) {
        	AppLog.error("paramUserHeader = (BizUserHeader)userHeader: " + e);
        	throw e;			
		}
		
		if (outputType != null && ElConstants.OUTPUT_FLD.equals(outputType)) {			
			if (paramUserHeader != null ) {				
				byte[] bb = (byte [])obj;
				if (bb != null ) {
					paramUserHeader.setFldLen(bb.length + paramUserHeader.getFixedTotalLength());				
				}
			}
		} 

		if (paramUserHeader != null) {
			if (elHeader.isResSuc() == false) {
			
				// 2.0 반려 제약 메시지 등 연계를 위해 프로토콜 정의를 위해 주석
				// paramUserHeader.setSucYn("N");
				paramUserHeader.setErrCode(elHeader.getResCode());
				paramUserHeader.setErrMag(elHeader.getResMsg());
			} else {
				paramUserHeader.setSucYn("Y");
			}
		}
		return paramUserHeader;
	}

	/** 
 	 * Controller 처리 중에 에러가 발생한 경우 클라이언트에 보낼 프로젝트 UserHeader 의 값에 값의 설정이 필요한 경우 
	 * 
	 * @see com.inswave.elfw.session.UserHeaderSetAdapter#getExceptionOutputUserHeader(java.lang.String, com.inswave.elfw.core.ElHeader)
	 */
	public UserHeader getExceptionOutputUserHeader(String outputType, ElHeader elHeader) throws AdapterException {
		AppLog.debug("[ADAPTER] ==========] getExceptionOutputUserHeader [===========");
		BizUserHeader userHeader = new BizUserHeader();
		
		AppLog.debug("outputType: " + outputType);
		AppLog.debug("elHeader: " + elHeader);

		// 아래 예제
		userHeader.setSucYn("N");

		if (elHeader != null) {
			// 아래 예제
			userHeader.setFldLen(userHeader.getFixedTotalLength());
			userHeader.setErrCode(elHeader.getResCode());
			userHeader.setErrMag(elHeader.getResMsg());
		}

		return userHeader;
	}
	
		
}
