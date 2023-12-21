package kr.re.kitech.biz.apr.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprStatusVo;
import kr.re.kitech.biz.apr.vo.IntfatabListVo;

/**
 * 
 * @author 박병목
 * @since 2022. 6. 24.
 */
@Controller
public class ApprCountController {
	
	@Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    /**
     * 예산통제 대기함
     *
     * @param AprScVo
     * @throws Exception
     */
    @ElService(key="SvcBudgetWaitTot")    
    @RequestMapping(value = { "SvcBudgetWaitTot" })
    @ElDescription(sub="예산통제 업무대기 카운팅",desc="예산통제 업무대기 카운팅")
    @ElValidator(errUrl="")    
    public IntfatabListVo SvcBudgetWaitTot(AprScVo vo) throws Exception {
    	IntfatabListVo intfatabListVo = new IntfatabListVo();
    	int totCount = 0;
    	totCount = apprFuncService.searchTotCnt(vo);
    	intfatabListVo.setTotalCount(totCount);
    	return intfatabListVo;
    }
    
    
    /**
     * 예산통제 집행가능 카운팅
     *
     * @param AprScVo
     * @throws Exception
     */
    @ElService(key="SvcBudgetWaitCnt")    
    @RequestMapping(value = { "SvcBudgetWaitCnt" })
    @ElDescription(sub="예산통제 집행가능 카운팅",desc="예산통제 집행가능 카운팅")
    @ElValidator(errUrl="")    
    public IntfatabListVo SvcBudgetWaitCnt(AprScVo vo) throws Exception {
    	IntfatabListVo intfatabListVo = new IntfatabListVo();
    	int totCount = 0;
    	totCount = apprFuncService.searchRakCnt(vo);
    	intfatabListVo.setTotalCount(totCount);
    	return intfatabListVo;
    }
    
    /**
     * 업무대기함, 결재대기함 카운팅
     *
     * @param AprScVo
     * @throws Exception
     */
    @ElService(key="SvcAprWaitTot")    
    @RequestMapping(value = { "SvcAprWaitTot" })
    @ElDescription(sub="업무대기함, 결재대기함 카운팅",desc="업무대기함, 결재대기함 카운팅")
    @ElValidator(errUrl="")    
    public IntfatabListVo searchTotCnt(AprScVo vo) throws Exception {
    	IntfatabListVo intfatabListVo = new IntfatabListVo();
    	int totCount = 0;
    	totCount = apprFuncService.searchTotCnt(vo);
    	intfatabListVo.setTotalCount(totCount);
    	return intfatabListVo;
    }
	
	/**
     * 결재반려함 카운팅
     *
     * @param AprScVo
     * @throws Exception
     */
    @ElService(key="SvcAprRejectTot")    
    @RequestMapping(value = { "SvcAprRejectTot" })
    @ElDescription(sub="결재반려함 카운팅",desc="결재반려함 카운팅")
    @ElValidator(errUrl="")    
    public IntfatabListVo searchWorkTotCnt(AprScVo vo) throws Exception {
    	IntfatabListVo intfatabListVo = new IntfatabListVo();
    	int totCount = 0;
    	
    	String[] StatusList = vo.getStatus().split(",");
    	List<AprStatusVo> aprList = new ArrayList<AprStatusVo>();
		for(String Status : StatusList){
			AprStatusVo statusVo = new AprStatusVo();
			statusVo.setApr_state(Status);
			aprList.add(statusVo);
		}
		vo.setAprStatusVo(aprList);
		totCount = apprFuncService.searchWorkTotCnt(vo);
		intfatabListVo.setTotalCount(totCount);
    	return intfatabListVo;
    }
}
