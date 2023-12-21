package kr.re.kitech.biz.sup.tec.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.api.client.vo.EasyPaySMSVo;
import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;
import kr.re.kitech.biz.sup.pop.vo.EasyPayInfoVo;
import kr.re.kitech.biz.sup.tec.service.SptTecMntService;
import kr.re.kitech.biz.sup.tec.vo.SptCardPaymntVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecChkVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptBillVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDetlVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptRegVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;

/**  
 * @ClassSubJect 기술지원내역등록(S306)
 * @Class Name SptTecMntController.java
 * @Description 기술지원내역등록 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/07   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/07
 * @version 1
 * @see
 * 
 */
@Controller
public class SptTecMntController {
	@Resource(name="sptTecMntService")
	private SptTecMntService service;
	
	@ElService(key = "SvcSPTTECR01")
	@RequestMapping(value = "SvcSPTTECR01")
	@ElDescription(sub = "실험실담당자 확인", desc = "로그인사용자가 실험실 담당자인지여부를 확인한다.")
	@ElValidator(errUrl = "")
	public SptTecChkVo selectSptLabHedcnt(SptTecSrcVo vo) throws Exception{
		return service.selectSptLabHedcnt(vo.getSyspayno());
	}
	
	@ElService(key = "SvcSPTTECR02")
	@RequestMapping(value = "SvcSPTTECR02")
	@ElDescription(sub = "외부기술지원(유상) 목록 조회", desc = "외부기술지원(유상) 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptTecRcptInfoVo> selectSptTecRcptInfoList(SptTecSrcVo vo) throws Exception{
		return service.selectSptTecRcptInfoList(vo);
	}
	
	@ElService(key = "SvcSPTTECR03")
	@RequestMapping(value = "SvcSPTTECR03")
	@ElDescription(sub = "외부기술지원(유상)내역 조회", desc = "외부기술지원(유상)내역(상세내역, 기술지원실적, 기술지원 장비실적 등)을 조회한다.")
	@ElValidator(errUrl = "")
	public SptTecRcptRegVo selectSptTecRcptInfo(SptTecSrcVo vo) throws Exception{
		return service.selectSptTecRcptInfo(vo);
	}
	
	@ElService(key = "SvcSPTTECR04")
	@RequestMapping(value = "SvcSPTTECR04")
	@ElDescription(sub = "외부기술지원(유상) - 제우스 예약현황 상세정보 조회", desc = "외부기술지원(유상) - 제우스 예약현황 상세정보를 조회하여 기술지원내역을 작성한다.")
	@ElValidator(errUrl = "")
	public SptTecRcptRegVo selectSptZeusResvMst(SptTecSrcVo vo) throws Exception{
		return service.selectSptZeusResvMst(vo);
	}
	
	@ElService(key = "SvcSPTTECR05")
	@RequestMapping(value = "SvcSPTTECR05")
	@ElDescription(sub = "청구계산서발행내역 조회", desc = "기술지원내역등록에서 고객번호 조회시 청구계산서발행내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptTecRcptBillVo> selectSptTecChrgBillInfo(SptTecSrcVo vo) throws Exception{
		return service.selectSptTecChrgBillInfo(vo);
	}
	
	@ElService(key = "SvcSPTTECR06")
	@RequestMapping(value = "SvcSPTTECR06")
	@ElDescription(sub = "기술지원내역등록-장비검색팝업 조회", desc = "기술지원내역등록-장비검색팝업에서 자산정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<AssMastrHPopVo> selectSptLabEquipInfoAsetPop(AssMastrHPopVo vo) throws Exception{
		return service.selectSptLabEquipInfoAsetPop(vo);
	}
	
	@ElService(key = "SvcSPTTECM01")
	@RequestMapping(value = "SvcSPTTECM01")
	@ElDescription(sub = "외부기술지원내역 저장", desc = "외부기술지원 내역 및 실적, 장비실적등을 저장한다.")
	@ElValidator(errUrl = "")
	public SptTecSrcVo saveSptTecRcptInfo(SptTecRcptRegVo vo) throws Exception{
		SptTecSrcVo retVo = new SptTecSrcVo();
		retVo.setTech_supt_req_no(service.saveSptTecRcptInfo(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcSPTTECU01")
	@RequestMapping(value = "SvcSPTTECU01")
	@ElDescription(sub = "외부기술지원 확정 저장", desc = "외부기술지원 확정여부를 저장한다.")
	@ElValidator(errUrl = "")
	public void saveSptTechRcptDecideYn(SptTecRcptDetlVo vo) throws Exception{
		service.saveSptTechRcptDecideYn(vo);
	}
	
	@ElService(key = "SvcSPTTECR07")
	@RequestMapping(value = "SvcSPTTECR07")
	@ElDescription(sub = "바우처가입여부 조회", desc = "")
	@ElValidator(errUrl = "")
	public SptTecChkVo selectCustVoucherYn(SptTecSrcVo vo) throws Exception{
		return service.selectCustVoucherYn(vo.getVend_cd());
	}
	
	@ElService(key = "SvcSPTTECD01")
	@RequestMapping(value = "SvcSPTTECD01")
	@ElDescription(sub = "외부기술지원 내역등록 삭제", desc = "외부기술지원 내역, 실적, 장비실적 및 장비일지를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteSptTecRcptInfo(SptTecRcptInfoVo vo) throws Exception{
		service.deleteSptTecRcptInfo(vo);
	}
	
	@ElService(key = "SvcSPTTECM02")
	@RequestMapping(value = "SvcSPTTECM02")
	@ElDescription(sub = "기술지원 지원취소 저장", desc = "기술지원내역에 상태값을 업데이트하고 장비실적및사용일지를 삭제한다.")
	@ElValidator(errUrl = "")
	public void saveTechSuptCancel(SptTecSrcVo vo) throws Exception{
		service.saveTechSuptCancel(vo);
	}
	
	@ElService(key = "SvcSPTTECM03")
	@RequestMapping(value = "SvcSPTTECM03")
	@ElDescription(sub = "카드결제 후 저장", desc = "카드결제 후 승인내역저장 및 기술지원접수 업데이트, 통프를 진행한다.")
	@ElValidator(errUrl = "")
	public void saveCardPaymnt(SptCardPaymntVo vo) throws Exception{
		service.saveCardPaymnt(vo);
	}
	
	@ElService(key = "SvcSPTTECM04")
	@RequestMapping(value = "SvcSPTTECM04")
	@ElDescription(sub = "외부기술지원접수 기술내역저장", desc = "외부기술지원접수 수정 및 기술내역을 저장한다.")
	@ElValidator(errUrl = "")
	public void saveSptTecRcptInfoPost(SptTecRcptRegVo vo) throws Exception{
		service.saveSptTecRcptInfoPost(vo);
	}
	
	@ElService(key = "SvcSPTTECM05")
	@RequestMapping(value = "SvcSPTTECM05")
	@ElDescription(sub = "이지페이 SMS결제요청", desc = "이지페이 SMS결제요청")
	@ElValidator(errUrl = "")
	public EasyPayInfoVo sendEasyPaySMS(EasyPaySMSVo vo, HttpServletRequest request){
		vo.setClient_ip(request.getRemoteAddr());
		//vo.setClient_ip("10.250.109.96");
		EasyPayInfoVo retVo = service.sendEasyPaySMS(vo);
		return retVo;
	}
	
	@ElService(key = "SvcSPTTECU02")
	@RequestMapping(value = "SvcSPTTECU02")
	@ElDescription(sub = "외부기술지원(유상) - 카드처리내역 팝업 저장", desc = "외부기술지원(유상) - 카드처리내역 팝업에서 카드승인정보를 저장한다.")
	@ElValidator(errUrl = "")
	public void updateSptTecRcptInfoCard(SptTecRcptInfoVo vo) throws Exception{
		service.updateSptTecRcptInfoCard(vo);
	}
	
	@ElService(key = "SvcSPTTECU03")
	@RequestMapping(value = "SvcSPTTECU03")
	@ElDescription(sub = "RPA Update", desc = "RPA 수행여부")
	@ElValidator(errUrl = "")
	public void updateRpaYn(SptTecRcptInfoVo vo) throws Exception{
		service.updateRpaYn(vo);
	}
	
	
}
