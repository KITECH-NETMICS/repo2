package kr.re.kitech.biz.xom.core.web;

import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.log.BizAccessLog;
import kr.re.kitech.biz.xom.base.log.MbiAccessLog;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

/**
 * Access Log 를 저장한다.
 *
 * @author James
 * @since 2022. 9. 21.
 */
@Controller 
public class AccessController { 

	@Resource(name="accntServiceImpl")
	private AccntService accntService;

	/**
	 * serviceId 별 Access 로그를 저장한다. (업무결재 / 모바일 대응: 포털은 별도 처리한다.)
	 */
	@ElService(key = "SvcAccessLogging")
    @RequestMapping(value = "SvcAccessLogging")    
    @ElDescription(sub = "Access 로그를 저장한다.", desc = "serviceId 별 Access 로그를 저장한다.")
	@ElValidator(errUrl = "")               
    public void saveAccessLogging(ServiceVo service, HttpServletRequest request) throws Exception { 
		AppLog.info("서비스ID 전송: " + service.getServiceID());
		if (null != service && null != service.getServiceID() && 4 == service.getServiceID().trim().length()) {
			// 세션 서비스 ID 갱신
			KitechContextUtil.setServiceId(service.getServiceID());
							
			// 서비스 데이터 조회
			service = accntService.findServiceByServiceId(service.getServiceID());
			if (null != service && null != service.getCn()) {

				// 세션 데이터 조회
				SessionUserHeader ses = KitechContextUtil.getSession();
				
				String message = String.format("|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s"
					, request.getRemoteHost()
					, request.getRequestedSessionId()
					, ses.getSn()
					, ses.getCn()   
					, ses.getUid()
					, ses.getDeptCode()
					, service.getServiceID()
					, service.getUseYN()	// 메뉴 여부
					, !StringUtils.isEmpty(service.getServiceNewUrl())
					, service.getCn()
					, StringUtils.isEmpty(service.getServiceNewUrl()) ? service.getServiceUrl() : service.getServiceNewUrl()
				);

				// 메타 데이터의 모바일에서 호출 여부를 판단하여 로깅한다.
				String isMbi = request.getHeader("isMbi");
				Enumeration emumer = request.getHeaderNames();
				while (emumer.hasMoreElements()) {
					String hName = (String)emumer.nextElement();
					AppLog.info(hName, request.getHeader(hName));
				}
				AppLog.info(isMbi);
				boolean mbiSvc = (isMbi != null && isMbi.equals("true"));
				
				if (mbiSvc) {
					MbiAccessLog.write(message);
				} else {
					BizAccessLog.write(message);
				}
			}
		}
    }
}
