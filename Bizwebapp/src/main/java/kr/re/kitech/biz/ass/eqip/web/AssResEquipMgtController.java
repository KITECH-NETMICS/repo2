/**
 * 
 */
package kr.re.kitech.biz.ass.eqip.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ass.eqip.service.AssResEquipFeeService;
import kr.re.kitech.biz.ass.eqip.service.AssResEquipMgtService;
import kr.re.kitech.biz.ass.eqip.vo.AssEquipSrcVo;
import kr.re.kitech.biz.ass.eqip.vo.AssSearchVo;
import kr.re.kitech.biz.ass.eqip.vo.NtisRegNoListVo;
import kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo;
import kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisInfoVo;
import kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo;

/**  
 * @ClassSubJect 경비결의(카드) Controller
 * @Class Name : FinExpnsSlipController.java
 * @Description : 경비결의(카드)를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/12   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/04/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class AssResEquipMgtController {
	@Resource(name="assResEquipService")
	private AssResEquipMgtService equipService;
	
	@Resource(name="assResEquipFeeService")
	private AssResEquipFeeService equipFeeService;
	
	@ElService(key = "SvcASSEQPR01")
	@RequestMapping(value = "SvcASSEQPR01")
	@ElDescription(sub = "제우스장비(내부장비) 검색", desc = "결의서 관리항목입력을 위해서 제우스장비(내부장비)를 조회한다.")
	@ElValidator(errUrl = "")
	public NtisRegNoListVo selectNtisRegNoList(AssSearchVo vo) throws Exception{
		NtisRegNoListVo retVo = new NtisRegNoListVo();
		retVo.setEquipList(equipService.selectNtisRegNoList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcASSEQPR02")
	@RequestMapping(value = "SvcASSEQPR02")
	@ElDescription(sub = "제우스 (외부)장비번호 조회", desc = "결의서 관리항목입력을 위하여 제우스장비번호(외부장비)를 검색한다.")
	@ElValidator(errUrl = "")
	public NtisRegNoVo selectNtisRegNo(AssSearchVo vo) throws Exception{
		return equipService.selectNtisRegNo(vo);
	}
	
    @ElService(key = "SvcASSEQPR03")
	@RequestMapping(value = "SvcASSEQPR03")
	@ElDescription(sub = "연구장비비 통합관리 한도금액 조회", desc = "연구장비비 통합관리 한도금액을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResEquipLimitAmtVo> selectNtisRegNo(ResEquipLimitAmtVo vo) throws Exception {
		return equipService.selectResEquipLimitAmt(vo);
	}
	
	@ElService(key = "SvcASSEQPR04")
	@RequestMapping(value = "SvcASSEQPR04")
	@ElDescription(sub = "통합관리계정 변경이력 조회", desc = "통합관리계정 변경이력을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResBgAcctmHisVo> selectResBgAcctmHis(AssEquipSrcVo vo) throws Exception{
		return equipService.selectResBgAcctmHis(vo);
	}
	
	@ElService(key = "SvcASSEQPM01")
	@RequestMapping(value = "SvcASSEQPM01")
	@ElDescription(sub = "통합관리계정변경이력을 저장한다.", desc = "통합관리계정변경이력을 저장한다.(변경 후 계정마스터수정)")
	@ElValidator(errUrl = "")
	public void saveAssIntgrAccntInfo(ResBgAcctmHisInfoVo vo) throws Exception{
		equipService.saveAssIntgrAccntInfo(vo.getHisList());
	}
	
	@ElService(key = "SvcASSEQPR05")
	@RequestMapping(value = "SvcASSEQPR05")
	@ElDescription(sub = "연구장비비집행내역 목록조회", desc = "연구장비비집행내역 목록조회")
	@ElValidator(errUrl = "")
	public List<ResEquipFeeReqVo> selectAssResEquipFeeReqList(ResEquipFeeReqVo vo) throws Exception{
		return equipFeeService.selectAssResEquipFeeReqList(vo);
	}
	
	@ElService(key = "SvcASSEQPR06")
	@RequestMapping(value = "SvcASSEQPR06")
	@ElDescription(sub = "연구시설장비집행요청 단건 조회", desc = "연구시설장비집행요청 단건 조회")
	@ElValidator(errUrl = "")
	public ResEquipFeeReqVo selectAssResEquipFeeReq(ResEquipFeeReqVo vo) throws Exception{
		return equipFeeService.selectAssResEquipFeeReq(vo);
	}
	
	@ElService(key = "SvcASSEQPD01")
	@RequestMapping(value = "SvcASSEQPD01")
	@ElDescription(sub = "연구시설장비비집행요청 삭제", desc = "연구시설장비비집행요청 삭제")
	@ElValidator(errUrl = "")
	public void deleteAssResEquipFeeReq(ResEquipFeeReqVo vo) throws Exception{
		equipFeeService.deleteAssResEquipFeeReq(vo);
	}
	
	@ElService(key = "SvcASSEQPU01")
	@RequestMapping(value = "SvcASSEQPU01")
	@ElDescription(sub = "연구시설장비집행요청 단건 저장", desc = "연구시설장비집행요청 단건 저장")
	@ElValidator(errUrl = "")
	public ResEquipFeeReqVo saveAssResEquipFeeReq(ResEquipFeeReqVo vo) throws Exception{	
		ResEquipFeeReqVo reqNoVo = new ResEquipFeeReqVo();
		reqNoVo.setReq_no(equipFeeService.saveAssResEquipFeeReq(vo));
		return reqNoVo;		
	}
	
	@ElService(key = "SvcASSEQPU02")
	@RequestMapping(value = "SvcASSEQPU02")
	@ElDescription(sub = "연구시설장비비결재신청", desc = "연구시설장비비결재신청")
	@ElValidator(errUrl = "")
	public void saveAssResEquipFeeReqApr(ResEquipFeeReqVo vo) throws Exception{	
		equipFeeService.saveAssResEquipFeeReqApr(vo);	
	}
	
	@ElService(key = "SvcASSEQPR07")
	@RequestMapping(value = "SvcASSEQPR07")
	@ElDescription(sub = "연구통합관리비계정 연구책임자 조회", desc = "연구통합관리비계정 연구책임자 보유건 조회")
	@ElValidator(errUrl = "")
	public ResEquipFeeReqVo selectResEquipFeeAccnt(ResEquipFeeReqVo vo) throws Exception{
		return equipFeeService.selectResEquipFeeAccnt(vo);
	}
}
