package kr.re.kitech.biz.ccs.pop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;
import kr.re.kitech.biz.ccs.pop.service.CcsPopService;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripPopListVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlHumFamyInfoPopVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlLoanPopVo;

/**  
 * @ClassSubJect 총무보안팝업 Controller
 * @Class Name : CtrTripPopController.java
 * @Description : 총무보안팝업 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/12   이영희                최초생성
 * @ 2023/09/13   lsh        대출내역조회 추가
 * 
 * @author 이영희
 * @since 2022/04/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
 
@Controller
public class CcsPopController {
	@Resource(name="ccsPopService")
	private CcsPopService ccsPopService;
	
	/**
    * 국내출장신청 검색 팝업 목록조회
    */
	@ElService(key = "SvcCCSPOPCTRR01")
	@RequestMapping(value = "SvcCCSPOPCTRR01")
	@ElDescription(sub = "출장신청번호 검색 팝업 조회", desc = "출장신청번호 검색 팝업의 리스트를 조회한다")
	@ElValidator(errUrl = "")
	public CtrTripPopListVo selectPopCtrDomList(CtrTripSrcVo vo) throws Exception{
		CtrTripPopListVo retVo = new CtrTripPopListVo();
		retVo.setGridList(ccsPopService.selectPopCtrDomList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcCCSPOPCGSR01")
	@RequestMapping(value = "SvcCCSPOPCGSR01")
	@ElDescription(sub = "병가 증빙 미처리 현황(팝업) 조회", desc = "휴가원결재신청 전 팝업에서 병가 증빙 미처리 현황을 조회한다.")
	@ElValidator(errUrl = "")
	public List<CgslappVo> selectSickVaccNoFileList(CgslappSchVo vo) throws Exception{
		return ccsPopService.selectSickVaccNoFileList(vo);
	}
	
	@ElService(key = "SvcCCSPOPCTRR02")
	@RequestMapping(value = "SvcCCSPOPCTRR02")
	@ElDescription(sub = "항공마일리지관리번호 검색(팝업)", desc = "국내출장정산에서 항공마일리지관리번호를 검색한다.")
	@ElValidator(errUrl = "")
	public List<CtrAirMileUseVo> selectCtrAirMileUseList(CtrTripSrcVo vo) throws Exception{
		return ccsPopService.selectCtrAirMileUseList(vo);
	}
	
	@ElService(key = "SvcCCSPOPCWLR01")
	@RequestMapping(value = "SvcCCSPOPCWLR01")
	@ElDescription(sub = "대출내역조회(팝업)", desc = "대출중도산환신청서에서 대출내역조회를 검색한다.")
	@ElValidator(errUrl = "")
	public List<CwlLoanPopVo> selectCwlLoanPopList(CwlLoanPopVo vo) throws Exception{
		return ccsPopService.selectCwlLoanPopList(vo);
	}
	
	@ElService(key = "SvcCCSPOPCWLR02")
	@RequestMapping(value = "SvcCCSPOPCWLR02")
	@ElDescription(sub = "부양가족조회(팝업)", desc = "학자금융자신청에서 부양가족을 조회한다.")
	@ElValidator(errUrl = "")
	public List<CwlHumFamyInfoPopVo> selectHumFamyInfoList(CwlHumFamyInfoPopVo vo) throws Exception{
		return ccsPopService.selectHumFamyInfoList(vo);
	}

}
