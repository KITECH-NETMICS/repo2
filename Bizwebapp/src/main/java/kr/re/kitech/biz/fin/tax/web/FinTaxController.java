package kr.re.kitech.biz.fin.tax.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.tax.service.FinTaxService;
import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillHListVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillHVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillInfoVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsInfoVo;

/**  
 * @ClassSubJect 세무관리 Controller
 * @Class Name : FinTaxController.java
 * @Description : 세무관리를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/12   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/08/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class FinTaxController {
	@Resource(name="finTaxService")
	private FinTaxService taxService;
	
	@ElService(key = "SvcFINTAXR01")
	@RequestMapping(value = "SvcFINTAXR01")
	@ElDescription(sub = "매출계산서 목록 조회", desc = "매출계산서, 매출계산서(관), 매출계산서 조회팝업에서 계산서목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FtxBillHVo> selectFtxBillHList(FinTaxSearchVo vo) throws Exception{
		return taxService.selectFtxBillHList(vo);
	}
	
	@ElService(key = "SvcFINTAXR02")
	@RequestMapping(value = "SvcFINTAXR02")
	@ElDescription(sub = "매출계산서 조회(등록팝업)", desc = "매출계산서등록 팝업에서 계산서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public FtxBillInfoVo selectFtxBillH(FinTaxSearchVo vo) throws Exception{
		return taxService.selectFtxBillH(vo);
	}
	
	@ElService(key = "SvcFINTAXR03")
	@RequestMapping(value = "SvcFINTAXR03")
	@ElDescription(sub = "전자계산서 발송현황 조회(팝업)", desc = "전자계산서 발송현황과 재전송현황을 조회한다.")
	@ElValidator(errUrl = "")
	public FtxBillSendPrcsInfoVo selectFtxBillSendPrcs(FinTaxSearchVo vo) throws Exception{
		return taxService.selectFtxBillSendPrcs(vo);
	}
	
	@ElService(key = "SvcFINTAXM01")
	@RequestMapping(value = "SvcFINTAXM01")
	@ElDescription(sub = "매출계산서 저장", desc = "매출(세금)계산서 마스터 및 품목내역을 저장한다.")
	@ElValidator(errUrl = "")
	public FinTaxSearchVo saveFtxBillInfo(FtxBillInfoVo vo) throws Exception{
		FinTaxSearchVo retVo = new FinTaxSearchVo();
		retVo.setTax_bill_no(taxService.saveFtxBillInfo(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcFINTAXM02")
	@RequestMapping(value = "SvcFINTAXM02")
	@ElDescription(sub = "매출(세금)계산서 전자발행(저장 및 국세청전송)", desc = "매출(세금)계산서를 저장하고 국세청에 전송한다.")
	@ElValidator(errUrl = "")
	public FinTaxSearchVo saveFtxBillSend(FtxBillInfoVo vo) throws Exception{
		FinTaxSearchVo retVo = new FinTaxSearchVo();
		retVo.setTax_bill_no(taxService.saveFtxBillSend(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcFINTAXM03")
	@RequestMapping(value = "SvcFINTAXM03")
	@ElDescription(sub = "매출 수정계산서 발행", desc = "매출 수정계산서를 발행한다.(기재사항 정정 또는 계약의 해제의 경우)")
	@ElValidator(errUrl = "")
	public FinTaxSearchVo saveAmndFtxBill(FtxBillInfoVo vo) throws Exception{
		FinTaxSearchVo retVo = new FinTaxSearchVo();
		retVo.setTax_bill_no(taxService.saveAmndFtxBill(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcFINTAXM04")
	@RequestMapping(value = "SvcFINTAXM04")
	@ElDescription(sub = "매출계산서 재전송", desc = "매출계산서 재전송시 공급받는자 이메일 주소를 저장한다.")
	@ElValidator(errUrl = "")
	public void saveResendData(FtxBillHVo vo) throws Exception{
		taxService.saveResendData(vo);
	}
	
	@ElService(key = "SvcFINTAXR04")
	@RequestMapping(value = "SvcFINTAXR04")
	@ElDescription(sub = "매출계산서 이관대상 조회", desc = "국세청에서 발행한 계산서를 이관하기위한 대상을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FtxBillHVo> selectItisIssuMstNotFtx(FinTaxSearchVo vo) throws Exception{
		return taxService.selectItisIssuMstNotFtx(vo);
	}
	
	@ElService(key = "SvcFINTAXM05")
	@RequestMapping(value = "SvcFINTAXM05")
	@ElDescription(sub = "국세청발행 매출계산서 이관", desc = "국세청에서 발행한 매출계산서를 이관한다.")
	@ElValidator(errUrl = "")
	public void moveItisToFtx(FtxBillHListVo vo) throws Exception{
		taxService.moveItisToFtx(vo.getBillList());
	}
	
	@ElService(key = "SvcFINTAXU01")
	@RequestMapping(value = "SvcFINTAXU01")
	@ElDescription(sub = "국세청발행계산서 수정", desc = "국세청발행계산서를 수정한다.(계정번호, 계산서구분, 담당자등 수정)")
	@ElValidator(errUrl = "")
	public void updateFtxBillH(FtxBillHVo vo) throws Exception{
		taxService.updateFtxBillH(vo);
	}
	
	@ElService(key = "SvcFINTAXD01")
	@RequestMapping(value = "SvcFINTAXD01")
	@ElDescription(sub = "매출계산서 삭제(폐기) 또는 복구", desc = "매출계산서를 삭제(폐기) 또는 복구한다.")
	@ElValidator(errUrl = "")
	public void deleteFtxBill(FtxBillHVo vo) throws Exception{
		taxService.deleteFtxBill(vo);
	}
	
	@ElService(key = "SvcFINTAXU02")
	@RequestMapping(value = "SvcFINTAXU02")
	@ElDescription(sub = " 매출계산서(관) 헤더 수정(계정번호,계산서구분,비고,결의번호 등)", desc = " 매출계산서(관)화면에서 계산서헤더를 수정한다.(계정번호,계산서구분,비고,결의번호 등)")
	@ElValidator(errUrl = "")
	public void saveFtxBillMnt(FtxBillHVo vo) throws Exception{
		taxService.saveFtxBillMnt(vo);
	}
	
	@ElService(key = "SvcFINTAXR05")
	@RequestMapping(value = "SvcFINTAXR05")
	@ElDescription(sub = "매출계산서(관) 미확인조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FinBillUnConfirmVo> selectFtxBillUnConfirm(FinTaxSearchVo vo) throws Exception{
		return taxService.selectFtxBillUnConfirm(vo);
	}
}
