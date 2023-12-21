package kr.re.kitech.biz.fin.tax.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.tax.service.FinPurTaxService;
import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrListVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrVo;

/**  
 * @ClassSubJect 세무관리 매입계산서 Controller
 * @Class Name : FinPurTaxController.java
 * @Description : 세무관리 매입계산서를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/23   이영희          최초생성
 * 
 * @author 이영희
 * @since 2023/05/23
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class FinPurTaxController {
	@Resource(name="finPurTaxService")
	private FinPurTaxService taxService;
	
	@ElService(key = "SvcFINPURTAXR01")
	@RequestMapping(value = "SvcFINPURTAXR01")
	@ElDescription(sub = "매입계산서(관) 조회", desc = "매입계산서 또는 매입계산서(관) 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<KtxIssuMstrVo> selectKtxIssuMstrList(FinPurTaxSrcVo vo) throws Exception{
		return taxService.selectKtxIssuMstrList(vo);
	}
	
	@ElService(key = "SvcFINPURTAXR02")
	@RequestMapping(value = "SvcFINPURTAXR02")
	@ElDescription(sub = "매입계산서(관) 미확인 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FinBillUnConfirmVo> selectKtxBillUnConfirm(FinPurTaxSrcVo vo) throws Exception{
		return taxService.selectKtxBillUnConfirm(vo);
	}
	
	@ElService(key = "SvcFINPURTAXU01")
	@RequestMapping(value = "SvcFINPURTAXU01")
	@ElDescription(sub = "매출/매입계산서 확인 저장", desc = "")
	@ElValidator(errUrl = "")
	public void updateFspSlipDecsnHConfirmYn(FinBillUnConfirmVo vo) throws Exception{
		taxService.updateFspSlipDecsnHConfirmYn(vo);
	}
	
	@ElService(key = "SvcFINPURTAXR03")
	@RequestMapping(value = "SvcFINPURTAXR03")
	@ElDescription(sub = "미확인계산서 반송이메일 팝업 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<KtxIssuMstrVo> selectKtxIssuMstrRetnMail(FinPurTaxSrcVo vo) throws Exception{
		return taxService.selectKtxIssuMstrRetnMail(vo);
	}
	
	@ElService(key = "SvcFINPURTAXU02")
	@RequestMapping(value = "SvcFINPURTAXU02")
	@ElDescription(sub = "부가세신고 확인 저장", desc = "")
	@ElValidator(errUrl = "")
	public void updateKtxTaxReturnsYn(FinPurTaxSrcVo vo) throws Exception{
		taxService.updateKtxTaxReturnsYn(vo);
	}
	
	@ElService(key = "SvcFINPURTAXD01")
	@RequestMapping(value = "SvcFINPURTAXD01")
	@ElDescription(sub = "매입계산서(관) 거래증빙(F24) 다건 삭제", desc = "")
	@ElValidator(errUrl = "")
	public void deleteKtxIssuMstrMulti(KtxIssuMstrListVo vo) throws Exception{
		taxService.deleteKtxIssuMstrMulti(vo.getKtxIssuList());
	}
	
	@ElService(key = "SvcFINPURTAXU03")
	@RequestMapping(value = "SvcFINPURTAXU03")
	@ElDescription(sub = "매입계산서(관) 등록자 변경", desc = "")
	@ElValidator(errUrl = "")
	public void saveKtxIssuWrtePsn(KtxIssuMstrListVo vo) throws Exception{
		taxService.saveKtxIssuWrtePsn(vo.getKtxIssuList());
	}
	
	@ElService(key = "SvcFINPURTAXR04")
	@RequestMapping(value = "SvcFINPURTAXR04")
	@ElDescription(sub = "매입계산서(관) 등록자 변경이력 건수 조회", desc = "")
	@ElValidator(errUrl = "")
	public Map<String, String> selectFspTaxRpsnHisCnt(FinPurTaxSrcVo vo) throws Exception{
		Map<String, String> retMap = new HashMap<>();
		retMap.put("cnt", String.valueOf(taxService.selectFspTaxRpsnHisCnt(vo.getIssu_seqno())));
		return retMap;
	}
	
	@ElService(key = "SvcFINPURTAXR05")
	@RequestMapping(value = "SvcFINPURTAXR05")
	@ElDescription(sub = "매입계산서(관) 등록자 변경이력 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<KtxIssuMstrComVo> selectFspTaxRpsnHis(FinPurTaxSrcVo vo) throws Exception{
		return taxService.selectFspTaxRpsnHis(vo.getIssu_seqno());
	}
	
	@ElService(key = "SvcFINPURTAXR06")
	@RequestMapping(value = "SvcFINPURTAXR06")
	@ElDescription(sub = "자동대사 - 국세청데이터 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<KtxIssuMstrVo> selectKtxAattDetb(FinPurTaxSrcVo vo) throws Exception{
		return taxService.selectKtxAattDetb(vo);
	}
	
	@ElService(key = "SvcFINPURTAXR07")
	@RequestMapping(value = "SvcFINPURTAXR07")
	@ElDescription(sub = "자동대사 - 매입계산서 데이터 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<KtxIssuMstrVo> selectKtxIssuMstrMove(FinPurTaxSrcVo vo) throws Exception{
		return taxService.selectKtxIssuMstrMove(vo);
	}
	
	@ElService(key = "SvcFINPURTAXI01")
	@RequestMapping(value = "SvcFINPURTAXI01")
	@ElDescription(sub = "자동대사 - 전체(선택)이관", desc = "국세청 자료를 매입계산서 테이블로 이관한다.")
	@ElValidator(errUrl = "")
	public void moveAllDetIssuToKtx(FinPurTaxSrcVo vo) throws Exception{
		taxService.moveDetIssuToKtx(vo);
	}
}
