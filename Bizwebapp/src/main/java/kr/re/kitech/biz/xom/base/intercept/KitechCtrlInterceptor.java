/**
 * 
 */
package kr.re.kitech.biz.xom.base.intercept;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.InitializingBean;

import com.inswave.elfw.core.UserHeader;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.xom.base.enums.Transitions;
import kr.re.kitech.biz.xom.base.model.BizCommVO;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;


/**
 * 컨트롤러 인터셉터 구현체
 * 메소드 네임의 prefix 가 Transitions 열거형에 해당한다면 공통 VO의 사번 관련 필드 및 시각 관련 필드를 자동 설정한다.
 *
 * @author James
 * @since 2022. 3. 25.
 * @see kr.re.kitech.biz.xom.base.enums.Transitions
 */
public class KitechCtrlInterceptor implements MethodInterceptor, InitializingBean {
    
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// 메소드 네임의 prefix 가 Transitions 열거형에 해당한다면..
		String name = methodInvocation.getMethod().getName();
		
		// 로그성 DB 컬럼 데이터 자동 세팅	
		if (Transitions.hasContains(name)){
	    	AppLog.debug("=============================] CTRL INTERCEPTOR [===========================");
			AppLog.debug("Method Name: "+ name);
			Object[] args = methodInvocation.getArguments();
    		if (null != args){
	    		for (Object arg : args) {
	    			if (null != arg && arg instanceof BizCommVO){
	    				BizCommVO commVo = (BizCommVO)arg;
	    				UserHeader userHeader = ControllerContextUtil.getUserHeader();
	    				if (null != userHeader && userHeader instanceof BizUserHeader)  {
	    					BizUserHeader bizUserHeader = (BizUserHeader)userHeader;
	    					SessionUserHeader session = bizUserHeader.getSession();
	    					String now = DateUtil.getCurrentDate("yyyy-MM-dd hh:mm:ss");
	    					if (Transitions.isCreated(name)) {
	    						commVo.setRegst_syspayno(session.getSn());  // 입력 파라미터 VO 에 값 설정
	    						commVo.setRegst_daytm(now);
	    					}
	    					commVo.setUpdt_syspayno(session.getSn());  // 입력 파라미터 VO 에 값 설정
	    					commVo.setUpdt_daytm(now);	    					
	    				}
    				}
    			}
    		}
    	}
    	return methodInvocation.proceed();
    }
    
    @Override
    public void afterPropertiesSet() {
    }    
}
