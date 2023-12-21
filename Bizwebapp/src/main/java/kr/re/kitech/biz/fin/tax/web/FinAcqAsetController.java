package kr.re.kitech.biz.fin.tax.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.tax.service.FinAcqAsetService;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanVo;

/**  
 * @ClassSubJect 인수자산 수익관리 Controller
 * @Class Name : FinAcqAsetController.java
 * @Description : 인수자산 수익관리를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/19		전재우		최초생성
 * 
 * @author 전재우
 * @since 2022/09/19
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class FinAcqAsetController {
	@Resource(name="finAcqAsetServiceImpl")
	private FinAcqAsetService finAcqAsetService;
	
	/**
     * 인수자산의 리스트 목록을 조회합니다.
     * @param finAcqAsetPlanMstrVo
     * @return 목록조회 결과
     * @throws Exception
     */

	@ElService(key = "SvcFINTAXACQ01")
	@RequestMapping(value = "SvcFINTAXACQ01")
	@ElDescription(sub = "인수자산 수익관리 목록 조회", desc = "인수자산 수익관리 목록 조회")
	@ElValidator(errUrl = "")
	public FinAcqAsetPlanVo selectListFinAcqAset(FinAcqAsetPlanMstrVo finAcqAsetPlanMstrVo) {
		FinAcqAsetPlanVo finAcqAsetPlanMstrListVo = new FinAcqAsetPlanVo();
		finAcqAsetPlanMstrListVo.setFinAcqAsetPlanMstrListVo(finAcqAsetService.selectListFinAcqAset(finAcqAsetPlanMstrVo));
		return finAcqAsetPlanMstrListVo;
    }
    
    /**
     * 인수자산 계획정보를 조회한다.
     * @param finAcqAsetPlanMstrVo
     * @return 단건조회 결과
     * @throws Exception
     */
    
    @ElService(key = "SvcFINTAXACQ02")
	@RequestMapping(value = "SvcFINTAXACQ02")
	@ElDescription(sub = "인수자산 계획정보 조회", desc = "인수자산 계획정보 조회")
	@ElValidator(errUrl = "")
	public FinAcqAsetPlanVo selectTaxAcqAset(FinAcqAsetPlanVo finAcqAsetPlanVo) {
		return finAcqAsetService.selectTaxAcqAset(finAcqAsetPlanVo);
    }
    
    /**
     * 인수자산 수익계획을 생성한다.
     * @param finAcqAsetPlanMstrVo
     * @return 
     * @throws Exception
     */
     
    @ElService(key = "SvcFINTAXACQ03")
	@RequestMapping(value = "SvcFINTAXACQ03")
	@ElDescription(sub = "인수자산 수익 계획생성", desc = "인수자산 수익 계획생성")
	@ElValidator(errUrl = "")
	public FinAcqAsetPlanVo createTaxAcqAsetPlan(FinAcqAsetPlanVo finAcqAsetPlanVo) {
		return finAcqAsetService.createTaxAcqAsetPlan(finAcqAsetPlanVo);
    }
    
    /**
     * 인수자산 수익 결의생성 리스트를 조회한다.
     * @param finAcqAsetPlanDtlVo
     * @return FinAcqAsetPlanVo
     * @throws Exception
     */
    @ElService(key = "SvcFINTAXACQ04")
	@RequestMapping(value = "SvcFINTAXACQ04")
	@ElDescription(sub = "인수자산 결의생성 리스트 조회", desc = "인수자산 결의생성 리스트 조회")
	@ElValidator(errUrl = "")
	public FinAcqAsetPlanVo selectListFinAcqAsetPlan(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
    	FinAcqAsetPlanVo finAcqAsetPlanDtlListVo = new FinAcqAsetPlanVo();
		finAcqAsetPlanDtlListVo.setFinAcqAsetPlanDtlListVo(finAcqAsetService.selectListFinAcqAsetPlan(finAcqAsetPlanDtlVo));
		return finAcqAsetPlanDtlListVo;
    }
    
    @ElService(key = "SvcFINTAXACQ05")
	@RequestMapping(value = "SvcFINTAXACQ05")
	@ElDescription(sub = "인수자산 부가세 결의생성", desc = "인수자산 부가세 결의생성")
	@ElValidator(errUrl = "")
	public void createSlip(FinAcqAsetPlanVo finAcqAsetPlanVo) {
    	finAcqAsetService.createSlip(finAcqAsetPlanVo.getFinAcqAsetPlanDtlListVo());
    }
    
    @ElService(key = "SvcFINTAXACQ06")
	@RequestMapping(value = "SvcFINTAXACQ06")
	@ElDescription(sub = "계산서 번호 업데이트", desc = "계산서 번호 업데이트")
	@ElValidator(errUrl = "")
	public FinAcqAsetPlanDtlVo updateBillNo(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		return finAcqAsetService.updateBillNo(finAcqAsetPlanDtlVo);
    }
    
    @ElService(key = "SvcFINTAXACQ07")
	@RequestMapping(value = "SvcFINTAXACQ07")
	@ElDescription(sub = "인수자산 부가세 결의취소", desc = "인수자산 부가세 결의취소")
	@ElValidator(errUrl = "")
	public void cancelSlip(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
    	finAcqAsetService.cancelSlip(finAcqAsetPlanDtlVo);
    }
}
