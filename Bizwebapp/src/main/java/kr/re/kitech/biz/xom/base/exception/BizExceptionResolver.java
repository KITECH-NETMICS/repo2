package kr.re.kitech.biz.xom.base.exception;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.core.ElHeader;
import com.inswave.elfw.core.UserHeader;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.exception.ElExceptionResolver;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.ErrorType;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;


/**
 * 모든 예외를 케치하여 일관된 방식으로 모델 설정 및 뷰를 반환한다.
 * org.springframework.web.servlet.HandlerExceptionResolver 구현체
 * 
 * @author James
 * @since 2022. 3. 02.
 */
public class BizExceptionResolver extends ElExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exception) {
    	
    	ModelAndView mav = super.resolveException(request, response, obj, exception);  // 필수 
    	
    	Map<String, Object> modelMap = mav.getModel();
    	AppLog.debug(" ==============] BizExceptionResolver - Model [==============\n" + modelMap);
    	ElHeader elHeader = (ElHeader)modelMap.get(ElConstants.EL_HEADER_STRING);
    	UserHeader userHeader = (UserHeader)modelMap.get(ElConstants.USER_HEADER_STRING);
    	
    	// UI 레이어의 일관된 에러 처리를 위해 UserHeader 객체를 BizUserHeader 객체로 바꿔치기 힌다.
    	BizUserHeader bizUserHeader = (userHeader instanceof BizUserHeader) ? (BizUserHeader)userHeader : new BizUserHeader();
    	
	    AppLog.debug("- ElHeader:" + elHeader);
	    AppLog.debug("- UserHeader:" + userHeader);
	    AppLog.debug("- BizUserHeader:" + bizUserHeader);
	    
    	if (exception != null) {
    		if (exception instanceof BpmException) {
	    		BpmException bpmEx = (BpmException) exception;
    			AppLog.error("- BpmException", bpmEx);

	    		bizUserHeader.setErrCode(bpmEx.getClass().getName());
	    		bizUserHeader.setErrMag(bpmEx.getMessage());
	    		bizUserHeader.setErrKind(Exceptions.ERROR.name());
	    		bizUserHeader.setErrBusiness(Business.APR.getTitle());
	    		bizUserHeader.setErrType(ErrorType.BUSINESS.getName());

	    		// 2.0 반려 제약 메시지 등 연계를 위해 프로토콜 정의
	    		bizUserHeader.setSucYn("Y");

	    	} else if (exception instanceof KitechException) {
	    		KitechException kitechEx = (KitechException) exception;
	    		AppLog.error("- KitechException", kitechEx);
	    		
	    		bizUserHeader.setErrCode(elHeader.getResCode());
	    		bizUserHeader.setErrMag(elHeader.getResMsg());
	    		bizUserHeader.setErrKind(kitechEx.getExceptions().getName());
	    		bizUserHeader.setErrBusiness(kitechEx.getBusiness().getTitle());
	    		bizUserHeader.setErrType(ErrorType.BUSINESS.getName());
	    		
	    		if (null != bizUserHeader.getBpmCancelKey()) {
	    			// BPM 캔슬 로직 수행
	    			AppLog.error("BpmCancelKey >>>>>>" + bizUserHeader.getBpmCancelKey());
	    			
	    		}
	    	} else if (exception instanceof ElException) {
	    		ElException elEx = (ElException) exception;
	    		AppLog.error("- ElException", elEx);
	    		
	    		bizUserHeader.setErrCode(elEx.getMessageKey());
	    		bizUserHeader.setErrMag(elEx.getMessage());
	    		bizUserHeader.setErrKind(Exceptions.ERROR.getCode());
	    		bizUserHeader.setErrBusiness(Business.XOM.getTitle());
	    		bizUserHeader.setErrType(ErrorType.SYSTEM.name());
	    	
	    	} else {
	    		AppLog.error("- Exception : "+ exception.getClass().getName(), exception);

	    		bizUserHeader.setErrCode(exception.getClass().getName());
	    		bizUserHeader.setErrMag(exception.getMessage());
	    		bizUserHeader.setErrKind(Exceptions.ERROR.name());
	    		bizUserHeader.setErrType(ErrorType.SYSTEM.name());
	    	}
    	}
    	
    	// 헤더를 bizUserHeader 로 변환 후 모델 갱신 및 반환
		modelMap.put(ElConstants.USER_HEADER_STRING, bizUserHeader);
		modelMap.put(ElConstants.EL_DATA_STRING, null);	// 에러 발생시 target 의 vo 클래스 찾는 문제 임시 방편
		mav.addAllObjects(modelMap);
		
		AppLog.info("Final Error", mav);
		
    	return mav;
    }
}
