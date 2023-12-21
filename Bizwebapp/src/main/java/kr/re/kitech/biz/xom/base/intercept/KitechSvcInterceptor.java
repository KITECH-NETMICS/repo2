/**
 * 
 */
package kr.re.kitech.biz.xom.base.intercept;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;

import com.inswave.elfw.intercept.ElServiceInterceptor;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Transitions;
import kr.re.kitech.biz.xom.base.model.BizCommVO;
import kr.re.kitech.biz.xom.core.service.AttachService;

/**
 * 
 * @author James
 * @since 2022. 4. 18.
 */
public class KitechSvcInterceptor extends ElServiceInterceptor {
      /** AttachService */
    @Resource(name = "attachServiceImpl")
    private AttachService attachService;
    
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// 서비스 메소드 실행 
		Object value = super.invoke(methodInvocation);
		
		// 서비스 메소드 실행 후처리
		// 첨부파일 유효성 컬럼(comm_yn) 자동 업데이트
		String name = methodInvocation.getMethod().getName();
		if (Transitions.isCreated(name)) {
			AppLog.debug("=============================] SVC INTERCEPTOR [===========================");
			AppLog.debug("Method Name: "+ name);			
			Object[] args = methodInvocation.getArguments();
			if (null != args) {
				for (Object arg : args) {
					if (null != arg && arg instanceof BizCommVO) {
						BizCommVO commVo = (BizCommVO) arg;
	
						String validAttachNo = commVo.getValidAttachNo();
						if (null != validAttachNo){
							String[] attachNos = validAttachNo.split(",");
							if (null != attachNos && 0 < attachNos.length){
								// 로깅
								for (String attachNo : attachNos){
									AppLog.debug(attachNo);
								}
								// 첨부파일 유효성 컬럼 업데이트 서비스 호출
								// attachService.updateAttachForValid(Arrays.asList(attachNos));
							}
						}
					}
				}
			}
		}
		
		return value;
	}
	
}
