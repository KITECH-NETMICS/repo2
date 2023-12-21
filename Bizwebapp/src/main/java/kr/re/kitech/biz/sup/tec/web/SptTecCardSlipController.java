package kr.re.kitech.biz.sup.tec.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.service.SptTecCardSlipService;
import kr.re.kitech.biz.sup.tec.vo.SptCardSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipCrtVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;

/**  
 * @ClassSubJect 기술지원카드결의 DAO
 * @Class Name SptTecCardSlipDAO.java
 * @Description 기술지원카드결의 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/12/04   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/12/04
 * @version 1
 * @see
 * 
 */
@Controller
public class SptTecCardSlipController {
	@Resource(name="sptTecCardSlipService")
	private SptTecCardSlipService cardSlipService;
	
	@ElService(key = "SvcSPTTECCRDR01")
	@RequestMapping(value = "SvcSPTTECCRDR01")
	@ElDescription(sub = "외부기술지원 카드처리내역 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<SptTranTableVo> selectSptTranCardPrcs(SptCardSlipSrcVo vo) throws Exception{
		return cardSlipService.selectSptTranCardPrcs(vo);
	}
	
	@ElService(key = "SvcSPTTECCRDU01")
	@RequestMapping(value = "SvcSPTTECCRDU01")
	@ElDescription(sub = "카드처리내역 접수번호 수정", desc = "")
	@ElValidator(errUrl = "")
	public void updateSptTranCard(SptTranTableVo vo) throws Exception{
		cardSlipService.updateSptTranCard(vo);
	}
	
	@ElService(key = "SvcSPTTECCRDR02")
	@RequestMapping(value = "SvcSPTTECCRDR02")
	@ElDescription(sub = "기술지원카드 미수(취소)결의생성 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<SptTecCardSlipVo> selectSptTecCardSlip(SptCardSlipSrcVo vo) throws Exception{
		return cardSlipService.selectSptTecCardSlip(vo);
	}
	
	@ElService(key = "SvcSPTTECCRDM01")
	@RequestMapping(value = "SvcSPTTECCRDM01")
	@ElDescription(sub = "기술지원 카드결의생성", desc = "")
	@ElValidator(errUrl = "")
	public Map<String,String> saveSptTecCardSlip(SptTecCardSlipCrtVo vo) throws Exception{
		Map<String,String> retMap = new HashMap<>();
		retMap.put("unslip_no", cardSlipService.saveSptTecCardSlip(vo));
		
		return retMap;
	}
	
	@ElService(key = "SvcSPTTECCRDD01")
	@RequestMapping(value = "SvcSPTTECCRDD01")
	@ElDescription(sub = "기술지원 카드결의 삭제", desc = "")
	@ElValidator(errUrl = "")
	public void deleteSptTecCardSlip(SptTecSlipSrcVo vo) throws Exception{
		cardSlipService.deleteSptTecCardSlip(vo);
	}
	
	@ElService(key = "SvcSPTTECCRDR03")
	@RequestMapping(value = "SvcSPTTECCRDR03")
	@ElDescription(sub = "기술지원 카드정산결의 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<SptTecCardSlipVo> selectSptCardAdjstSlip(SptCardSlipSrcVo vo) throws Exception{
		return cardSlipService.selectSptCardAdjstSlip(vo);
	}
	
	@ElService(key = "SvcSPTTECCRDM02")
	@RequestMapping(value = "SvcSPTTECCRDM02")
	@ElDescription(sub = "기술지원 카드정산결의 생성", desc = "")
	@ElValidator(errUrl = "")
	public Map<String,String> saveSptTecCardAdjstSlip(SptTecCardSlipCrtVo vo) throws Exception{
		Map<String,String> retMap = new HashMap<>();
		retMap.put("unslip_no", cardSlipService.saveSptTecCardAdjstSlip(vo));
		
		return retMap;
	}
	
	@ElService(key = "SvcSPTTECCRDR04")
	@RequestMapping(value = "SvcSPTTECCRDR04")
	@ElDescription(sub = "기술지원 카드수수료결의 목록 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<SptTecCardSlipVo> selectSptTecCardFeeSlip(SptCardSlipSrcVo vo) throws Exception{
		return cardSlipService.selectSptTecCardFeeSlip(vo);
	}
	
	@ElService(key = "SvcSPTTECCRDM03")
	@RequestMapping(value = "SvcSPTTECCRDM03")
	@ElDescription(sub = "기술지원 카드수수료 결의생성", desc = "")
	@ElValidator(errUrl = "")
	public Map<String,String> saveSptTecCardFeeSlip(SptTecCardSlipCrtVo vo) throws Exception{
		Map<String,String> retMap = new HashMap<>();
		retMap.put("unslip_no", cardSlipService.saveSptTecCardFeeSlip(vo));
		
		return retMap;
	}
	
	@ElService(key = "SvcSPTTECCRDD02")
	@RequestMapping(value = "SvcSPTTECCRDD02")
	@ElDescription(sub = "기술지원 카드수수료 결의 삭제", desc = "")
	@ElValidator(errUrl = "")
	public void deleteSptTecCardFeeSlip(SptCardSlipSrcVo vo) throws Exception{
		cardSlipService.deleteSptTecCardFeeSlip(vo);
	}
}
