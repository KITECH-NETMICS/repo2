package kr.re.kitech.biz.epu.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.epu.cnt.vo.BblenfrcVo;
import kr.re.kitech.biz.epu.cnt.vo.CtrlAmtProcVo;
import kr.re.kitech.biz.epu.com.service.EpuComService;
import kr.re.kitech.biz.epu.com.vo.EpuComCodeG2bVo;
import kr.re.kitech.biz.epu.com.vo.PurAprVo;

/**  
 * @ClassSubJect 구매 공통 Controller
 * @Class Name : EpuComController.java
 * @Description : 구매 공통을 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/02/10   이영희          최초생성 
 * 
 * @author 이영희
 * @since 2023/02/10
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class EpuComController {
	@Resource(name="epuComService")
	private EpuComService comService;
	
	@ElService(key = "SvcEPUCOMR01")
	@RequestMapping(value = "SvcEPUCOMR01")
	@ElDescription(sub = "구매 원인행위금액 조회", desc = "통제금액 정리를 위하여 원인행위금액을 조회한다.")
	@ElValidator(errUrl = "")
	public List<BblenfrcVo> selectBblenfrcChngAmt(BblenfrcVo vo) throws Exception{
    	return comService.selectBblenfrcChngAmt(vo);
    }
    
    @ElService(key = "SvcEPUCOMM01")
	@RequestMapping(value = "SvcEPUCOMM01")
	@ElDescription(sub = "구매요구 원인행위금액 정리", desc = "구매요구(관) 원인행위금액을 정리한다.")
	@ElValidator(errUrl = "")
	public void processCauseAmt(CtrlAmtProcVo vo) throws Exception{
    	comService.processCauseAmt(vo);
    }
    
    @ElService(key = "SvcEPUCOMM02")
	@RequestMapping(value = "SvcEPUCOMM02")
	@ElDescription(sub = "구매프로세스 정리", desc = "구매 BPM프로세스를 종료처리한다.")
	@ElValidator(errUrl = "")
	public void processPurApr(PurAprVo vo) throws Exception{
    	comService.processPurApr(vo);
    }
    
    @ElService(key = "SvcEPUCOMR02")
	@RequestMapping(value = "SvcEPUCOMR02")
	@ElDescription(sub = "G2b 공통코드 조회", desc = "G2b 공통코드를 조회한다.")
	@ElValidator(errUrl = "")
	public List<EpuComCodeG2bVo> selectEpuComCodeG2b(EpuComCodeG2bVo vo) throws Exception{
    	return comService.selectEpuComCodeG2b(vo);
    }
}
