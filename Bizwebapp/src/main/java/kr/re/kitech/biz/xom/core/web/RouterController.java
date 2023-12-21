package kr.re.kitech.biz.xom.core.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

@Controller
public class RouterController {
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Resource(name = "accntServiceImpl")
	private AccntService accntService;	
	
	/**
     * 라우터 서비스 조회
	 */
	@ElService(key = "SvcRouteInfo")
    @RequestMapping(value = "SvcRouteInfo")    
    @ElDescription(sub = "서비스 정보 조회", desc = "서비스ID 로 서비스 정보 조회한다.")
	@ElValidator(errUrl = "")               
    public void service(ServiceVo serviceSc, HttpServletResponse response) throws Exception {
    
		AppLog.debug("Redirect URL 조회 로그 테스트 SC: " + serviceSc);
		
		String serviceId = serviceSc.getServiceID();
		if (null == serviceId || ("").equals(serviceId) || 4 > serviceId.length()){
			new KitechException(Exceptions.ERROR, Business.XOM, "");
		}
		
		// TODO: 검증로직 필요.
		BizUserHeader header = (BizUserHeader)ControllerContextUtil.getUserHeader();
		String syspayno = header.getUserId();
		
		// 유효한 서비스 아이디라면
		if (true) {		
			
			// return void 로 처리해면 Rest로 동작해서 document 가 반환되는데 이것을  
			response.sendRedirect("/ui/zam/sample/attachFile.xml");
			
			// 스트림 열어서 이렇게 처리해야 하는가요? 
//			response.getWriter().write("xml 파일 읽은 문자열");

			
			// return String 으로 처리하고 WEB-INF 아래로 옮겨야 하는지
//			return "/ui/zam/sample/attachFile.xml";
			
		} else {
			
//			return "/comm/error";
		}		
    }
    
}
