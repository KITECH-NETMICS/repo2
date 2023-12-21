package kr.re.kitech.biz.bud.frc.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.bud.frc.service.BudAuditService;
import kr.re.kitech.biz.bud.frc.vo.BudAuditListVo;
import kr.re.kitech.biz.bud.frc.vo.BudAuditVo;

@Controller
public class BudAuditController {
	
	@Resource(name = "budAuditServiceImpl")
	BudAuditService budAuditService;
	
    @ElService(key = "SvcBUDFRCAUDR01")    
    @RequestMapping(value = "SvcBUDFRCAUDR01")
    @ElDescription(sub = "감사내역 조회", desc = "감사내역을 조회한다. ")
    @ElValidator(errUrl = "")    
    public BudAuditListVo selectBudAuditList(BudAuditVo vo) throws Exception {
    	BudAuditListVo retVo = new BudAuditListVo();
    	
    	retVo.setBudAuditVoList(budAuditService.selectBudAuditList(vo));
    	return retVo;
    }
    
    @ElService(key = "SvcBUDFRCAUDC01")    
    @RequestMapping(value = "SvcBUDFRCAUDC01")
    @ElDescription(sub = "감사전자결재내역 집계", desc = "감사전자결재내역 집계 ")
    @ElValidator(errUrl = "")    
    public void aggregateAuditDetls(BudAuditVo vo) throws Exception {
    	budAuditService.aggregateAuditDetls(vo);
    }
	
}
