package kr.re.kitech.biz.ass.app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ass.app.service.AssAppChaReqService;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqListVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqVo;
import kr.re.kitech.biz.ass.app.vo.AssMastrVo;

/**  
 * @ClassSubJect 자산이동 > 인수인계신청 
 * @Class Name : AssAppChaReqController.java
 * @Description : 인수인계신청 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/01   이정호                  최초생성
 * 
 * @author LeeJh
 * @since 2023/09/01
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@SuppressWarnings("unused")
@Controller
public class AssAppChaReqController{
	@Resource(name="assAppChaReqService")
	AssAppChaReqService chaReqService;

	@ElService(key = "SvcASSAPPCHAREQR01")
	@RequestMapping(value = "SvcASSAPPCHAREQR01")
	@ElDescription(sub = "자산 인수인계 목록 조회", desc = "자산 인수인계 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<AssAppChaReqVo> selectAssAppChaReqList(AssAppChaReqSrchVo vo) throws Exception {
		return chaReqService.selectAssAppChaReqList(vo);
	}

	@ElService(key = "SvcASSAPPCHAREQDR01")
	@RequestMapping(value = "SvcASSAPPCHAREQDR01")
	@ElDescription(sub = "자산 수량 인수인계 상세 조회", desc = "자산 수량 인수인계 상세를 조회한다.")
	@ElValidator(errUrl = "")
	public AssAppChaReqListVo selectAssAppChaReqDetailList(AssAppChaReqSrchVo vo) throws Exception {
		List<AssAppChaReqDetailVo> list = chaReqService.selectAssAppChaReqDetailList(vo);
		AssAppChaReqListVo List = new AssAppChaReqListVo();

		List.setAssAppChaReqDetailVoList(list);
		return List;
	}

	@ElService(key = "SvcASSAPPCHAREQI01")
	@RequestMapping(value = "SvcASSAPPCHAREQI01")
	@ElDescription(sub = "자산 수량 인수인계 저장", desc = "자산 수량 인수인계를 저장한다")
	@ElValidator(errUrl = "")
	public AssAppChaReqDetailVo saveAssAppChaReq(AssAppChaReqListVo vo) throws Exception {
		AssAppChaReqDetailVo appChaReqDetailVo = new AssAppChaReqDetailVo();
		appChaReqDetailVo.setReq_no(chaReqService.saveAssAppChaReq(vo));

		return appChaReqDetailVo;
	}

	@ElService(key = "SvcASSAPPCHAREQD01")
	@RequestMapping(value = "SvcASSAPPCHAREQD01")
	@ElDescription(sub = "자산 수량 인수인계 삭제", desc = "자산 수량 인수인계를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteAssAprInfo(AssAppChaReqDetailVo vo) throws Exception {
		chaReqService.deleteAssAppChaReq(vo);
	}

	@ElService(key = "SvcEPUCOMXODMR01")
	@RequestMapping(value = "SvcEPUCOMXODMR01")
	@ElDescription(sub = "구매, 검수 권한 담당자 조회", desc = "구매, 검수 권한 담당자를 조회한다.")
	@ElValidator(errUrl = "")
	public AssAppChaReqVo selectDeptManager(AssAppChaReqSrchVo vo) throws Exception {
		return chaReqService.selectDeptManager(vo);
	}

	@ElService(key = "SvcASSAPPCHAREQU01")
	@RequestMapping(value = "SvcASSAPPCHAREQU01")
	@ElDescription(sub = "반려 처리", desc = "반려 처리한다.")
	@ElValidator(errUrl = "")
	public void aprReject(AssAppChaReqDetailVo vo) throws Exception {
		chaReqService.formReject(vo);
	}

	@ElService(key = "SvcASSAPPCHAREQU02")
	@RequestMapping(value = "SvcASSAPPCHAREQU02")
	@ElDescription(sub = "승인 처리", desc = "승인 처리한다.")
	@ElValidator(errUrl = "")
	public void aprAccept(AssAppChaReqListVo vo) throws Exception {
		chaReqService.formAccept(vo);
	}

	@ElService(key = "SvcASSAPPCHAREQI02")
	@RequestMapping(value = "SvcASSAPPCHAREQI02")
	@ElDescription(sub = "자산위치 일괄 변경", desc = "자산위치 일괄 변경한다")
	@ElValidator(errUrl = "")
	public void saveAssReceiptTransPosi(AssAppChaReqListVo vo) throws Exception {
		chaReqService.saveAssReceiptTransPosi(vo);
	}

	@ElService(key = "SvcASSAPPASSMR01")
	@RequestMapping(value = "SvcASSAPPASSMR01")
	@ElDescription(sub = "결재 신청 대상 자산/수량 조회", desc = "결재 신청 대상 자산/수량을 조회한다")
	@ElValidator(errUrl = "")
	public List<AssMastrVo> selectAssetList(AssMastrVo vo) throws Exception {
		return chaReqService.selectAssetList(vo);
	}
}
