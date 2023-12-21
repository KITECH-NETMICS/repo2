/**
 * 
 */
package kr.re.kitech.biz.xom.core.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.CsrClient;
import kr.re.kitech.biz.api.client.enums.CsrType;
import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * 
 * @author James
 * @since 2022. 5. 3.
 */
@Controller
public class CsrController {
	@Resource(name="csrCrtClient")
	private CsrClient csrCrtClient;
	
    @Resource(name="csrAppClient")
	private CsrClient csrAppClient;
	
    @Resource(name="csrDtlClient")
	private CsrClient csrDtlClient;
	
    @Resource(name="csrLstClient")
	private CsrClient csrLstClient;
	
    @Resource(name="csrSatClient")
	private CsrClient csrSatClient;
	
	@Resource(name="csrEndClient")
	private CsrClient csrEndClient;
	
	
	/**
     * 시스템문의 등록
	 */
	@ElService(key = "SvcSendCsr")
    @RequestMapping(value = "SvcSendCsr")    
    @ElDescription(sub = "시스템문의를 등록한다.", desc = "시스템문의를 등록 및 SR 접수 처리한다.")
	@ElValidator(errUrl = "")               
    public CsrVo sendCsr(CsrVo csr) throws Exception {	
    
		csr.setNextLoginId(KitechContextUtil.getUserId());
		csr.setUserLoginId(KitechContextUtil.getUserId());
		csr.setUserDepId(KitechContextUtil.getDeptCd());
		try {
			csr = csrCrtClient.execute(csr);
			
			if ("Y".equals( csr.getSuccessYn()) && 0 < csr.getInstId()){
		        csr.setCsrType( CsrType.APPROVAL_FIRST.name());
		        csr = csrAppClient.execute(csr);
	
		        AppLog.debug("결과: " + csr);
		        if (("Y").equals(csr.getSuccessYn())) {
		        	AppLog.debug("최종 성공: ");
		        	
		        }		
			}
		} catch (Exception e) {
			throw e;
		}
		
		return csr;
    }
    
     @ElService(key = "SvcSelectCsrList")
     @RequestMapping(value = "SvcSelectCsrList")    
     @ElDescription(sub = "시스템문의 목록 조회", desc = "시스템문의 목록을 조회한다.")
     @ElValidator(errUrl = "")               
     public CsrVo selectCsrList(CsrVo csr) throws Exception {	
    	 CsrVo ret = csrLstClient.execute(csr);
         return ret;
     }

     @ElService(key = "SvcSelectCsr")
     @RequestMapping(value = "SvcSelectCsr")    
     @ElDescription(sub = "시스템문의 상세 조회", desc = "시스템문의 상세 정보를 조회한다.")
     @ElValidator(errUrl = "")               
     public CsrVo selectCsr(CsrVo csr, HttpServletRequest request) throws Exception {	
          // TODO : 세부 내용을 지우거나 API의 응답 내용을 보충해야함
    	 csr = csrDtlClient.execute(csr);
    	 
         return csr;
     }
    
     @ElService(key = "SvcSaveSatis")
     @RequestMapping(value = "SvcSaveSatis")    
     @ElDescription(sub = "시스템문의 만족도 저장", desc = "시스템문의 만족도를 저장한다.")
     @ElValidator(errUrl = "")               
     public CsrVo saveSatisfaction(CsrVo csr, HttpServletRequest request) throws Exception {	
         // TODO : 만족도 조사 저장할 시 의견을 받는 부분도 필요함
         CsrVo result = null;
    	 result = csrSatClient.execute(csr);
    	 if (result.getSuccessYn().equals("N")) {
    		 throw new KitechException();
    	 }
    	 result = csrEndClient.execute(csr);
    	 if (result.getSuccessYn().equals("N")) {
    		 throw new KitechException();
    	 }
    	 
         return csr;
     }
    
}
