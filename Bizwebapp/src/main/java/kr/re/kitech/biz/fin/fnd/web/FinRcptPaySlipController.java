package kr.re.kitech.biz.fin.fnd.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.fnd.service.FinRcptPaySlipService;
import kr.re.kitech.biz.fin.fnd.vo.FinRcptPaySlipInfoVo;
import kr.re.kitech.biz.fin.fnd.vo.FinRcptPaySlipVo;
import kr.re.kitech.biz.fin.fnd.vo.PaySlipSrcVo;

/**
 * @ClassSubJect 출금결의생성
 * @ClassName  FinRcptPaySlipController.java
 * @Description 출금결의생성 Controller
 * @Modification    
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.   이영희    최초생성
 * 
 * @author 
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class FinRcptPaySlipController {
	@Resource(name="finRcptPaySlipService")
	private FinRcptPaySlipService paySlipService;
	
	@ElService(key = "SvcFINFNDSLPR01")
	@RequestMapping(value = "SvcFINFNDSLPR01")
	@ElDescription(sub = "출금결의생성 목록 조회", desc = "출금결의생성 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FinRcptPaySlipVo> selectFinRcptPaySlipList(PaySlipSrcVo vo) throws Exception{
		return paySlipService.selectFinRcptPaySlipList(vo);
	}
	
	@ElService(key = "SvcFINFNDSLPU01")
	@RequestMapping(value = "SvcFINFNDSLPU01")
	@ElDescription(sub = "출금결의생성 계좌체크", desc = "개인지급일 경우 계좌체크를 한다.")
	@ElValidator(errUrl = "")
	public List<FinRcptPaySlipVo> checkBankAccnt(FinRcptPaySlipInfoVo vo) throws Exception{
		return paySlipService.checkBankAccnt(vo.getSlipList());
	}
	
	@ElService(key = "SvcFINFNDSLPD01")
	@RequestMapping(value = "SvcFINFNDSLPD01")
	@ElDescription(sub = "출금결의취소", desc = "출금결의서, 전자증빙을 삭제하고 지급결의번호를 초기화한다.")
	@ElValidator(errUrl = "")
	public void deleteFinRcptPaySlip(PaySlipSrcVo vo) throws Exception{
		paySlipService.deleteFinRcptPaySlip(vo);
	}
	
	@ElService(key = "SvcFINFNDSLPM01")
	@RequestMapping(value = "SvcFINFNDSLPM01")
	@ElDescription(sub = "출금결의생성", desc = "출금결의를 생성한다.(송금내역 업데이트, 전자증빙생성)")
	@ElValidator(errUrl = "")
	public PaySlipSrcVo saveFinRcptPaySlip(FinRcptPaySlipInfoVo vo) throws Exception{
		PaySlipSrcVo retVo = new PaySlipSrcVo();
		retVo.setPay_unslip_no(paySlipService.saveFinRcptPaySlip(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINFNDSLPR02")
	@RequestMapping(value = "SvcFINFNDSLPR02")
	@ElDescription(sub = "출금조회 목록 ", desc = "출금조회 목록 ")
	@ElValidator(errUrl = "")
	public List<FinRcptPaySlipVo> selectFinRcptPaySendList(PaySlipSrcVo vo) throws Exception{
		return paySlipService.selectFinRcptPaySendList(vo);
	}
}
