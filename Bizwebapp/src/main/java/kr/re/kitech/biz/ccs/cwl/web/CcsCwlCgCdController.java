package kr.re.kitech.biz.ccs.cwl.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.cwl.service.CcsCwlCgCdService;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlBeforeCgCdInfoVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdDtlVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdFeeVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdListVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdMntVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdSrchVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlHumSlBscInfoVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlSvCgCdVo;

/**  
 * @ClassSubJect 경조사비 신청 컨트롤러
 * @Class Name CcsCwlCgCdController.java
 * @Description 경조사비 신청 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/27   석원탁                 최초생성
 * 
 * @author 
 * @since 2023/07/27
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CcsCwlCgCdController {

	@Resource(name = "ccsCwlCgCdServiceImpl")
	private CcsCwlCgCdService ccsCwlCgCdservice;

	@ElService(key = "SvcCCSCWLCGCDSR01")
	@RequestMapping(value = "SvcCCSCWLCGCDSR01")
	@ElDescription(sub = "경조사비 신청 목록 조회", desc = "경조사비 신청 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public CcsCwlCgCdListVo selectCcsCwlCgCdList(CcsCwlCgCdSrchVo vo) throws Exception{
		//경조사비 신청 목록 다건 조회
		List<CcsCwlCgCdVo> ccsCwlCgCdList = ccsCwlCgCdservice.selectCcsCwlCgCdList(vo);
		
		CcsCwlCgCdListVo retCcsCwlList = new CcsCwlCgCdListVo();
		retCcsCwlList.setCcsCwlCgCdVoList(ccsCwlCgCdList);
		
		return retCcsCwlList;
	}
	
	@ElService(key = "SvcCCSCWLHUMSLBSCINFOSR01")
	@RequestMapping(value = "SvcCCSCWLHUMSLBSCINFOSR01")
	@ElDescription(sub = "급여계좌정보 조회", desc = "경조사비 신청 내 급여계좌정보를 조회한다.")
	@ElValidator(errUrl = "")
	public CcsCwlHumSlBscInfoVo selectHumSlBscInfo(CcsCwlCgCdSrchVo vo) throws Exception{
		//급여계좌 단건 조회
		return ccsCwlCgCdservice.selectHumSlBscInfo(vo);
	}
	
	@ElService(key = "SvcCCSCWLCGCDFEESR01")
	@RequestMapping(value = "SvcCCSCWLCGCDFEESR01")
	@ElDescription(sub = "경조금액 조회", desc = "경조사비 신청 내 경조금액을 조회한다.")
	@ElValidator(errUrl = "")
	public CcsCwlCgCdFeeVo selectCwlCgCdFee(CcsCwlCgCdSrchVo vo) throws Exception{
		//경조금액 단건 조회
		return ccsCwlCgCdservice.selectCwlCgCdFee(vo);
	}
	
	@ElService(key = "SvcCCSCWLBEFOREINFOSR01")
	@RequestMapping(value = "SvcCCSCWLBEFOREINFOSR01")
	@ElDescription(sub = "경조사비 신청 중복 조회", desc = "경조사비 신청 시 중복을 조회한다.")
	@ElValidator(errUrl = "")
	public CcsCwlCgCdListVo selectCwlBeforeCgCdInfo(CcsCwlCgCdSrchVo vo) throws Exception{
		//경조사비 신청 중복 조회
		List<CcsCwlCgCdVo> ccsCwlCgCdList = ccsCwlCgCdservice.selectCwlBeforeCgCdInfo(vo);
		
		CcsCwlCgCdListVo retCcsCwlList = new CcsCwlCgCdListVo();
		retCcsCwlList.setCcsCwlCgCdVoList(ccsCwlCgCdList);
		
		return retCcsCwlList;
	}
	
	@ElService(key = "SvcCCSCWLBEFOREINFOSR02")
	@RequestMapping(value = "SvcCCSCWLBEFOREINFOSR02")
	@ElDescription(sub = "경조사비 신청 중복 조회2 (회갑, 칠순, 팔순, 구순 각 1회 신청가능 검증)", desc = "경조사비 신청 시 (회갑, 칠순, 팔순, 구순 각 1회) 신청가능 여부를 조회한다.")
	@ElValidator(errUrl = "")
	public List<CcsCwlBeforeCgCdInfoVo> selectCwlBeforeCgCdInfo2(CcsCwlCgCdSrchVo vo) throws Exception{
		//경조사비 신청 중복 조회
		return ccsCwlCgCdservice.selectCwlBeforeCgCdInfo2(vo);
	}
	
	@ElService(key = "SvcCCSCWLCGCDM01")
	@RequestMapping(value = "SvcCCSCWLCGCDM01")
	@ElDescription(sub = "경조사비 신청 등록", desc = "경조사비 신청 정보를 등록한다.")
	@ElValidator(errUrl = "")
	public CcsCwlCgCdSrchVo insertCwlCgCd(CcsCwlSvCgCdVo vo) throws Exception{
		//경조사비 신청 등록
		return ccsCwlCgCdservice.insertCwlCgCd(vo);
	}
	
	@ElService(key = "SvcCCSCWLCGCDDTLR01")
	@RequestMapping(value = "SvcCCSCWLCGCDDTLR01")
	@ElDescription(sub = "경조사비 신청 상세조회", desc = "경조사비 신청. 상세 조회한다.")
	@ElValidator(errUrl = "")
	public CcsCwlCgCdDtlVo selectCcsCwlCgCdDtl(CcsCwlCgCdSrchVo vo) throws Exception{
		//경조사비 신청 상세조회
		return ccsCwlCgCdservice.selectCcsCwlCgCdDtl(vo);
	}
	
	@ElService(key = "SvcCCSCWLCGCDD01")
	@RequestMapping(value = "SvcCCSCWLCGCDD01")
	@ElDescription(sub = "경조사비 신청 삭제", desc = "경조사비 신청 정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteCwlCgCd(CcsCwlCgCdSrchVo vo) throws Exception{
		//경조사비 신청 삭제
		ccsCwlCgCdservice.deleteCwlCgCd(vo);
	}
	
	@ElService(key = "SvcCCSCWLCGCDMNTR01")
	@RequestMapping(value = "SvcCCSCWLCGCDMNTR01")
	@ElDescription(sub = "경조수정내역 상세조회", desc = "경조수정내역 시 상세 조회한다.")
	@ElValidator(errUrl = "")
	public CcsCwlCgCdMntVo selectCcsCwlCgCdMnt(CcsCwlCgCdSrchVo vo) throws Exception{
		//경조수정내역 상세조회
		return ccsCwlCgCdservice.selectCcsCwlCgCdMnt(vo);
	}
	
	@ElService(key = "SvcCCSCWLCGCDU01")
	@RequestMapping(value = "SvcCCSCWLCGCDU01")
	@ElDescription(sub = "경조수정내역 수정", desc = "경조수정내역을 수정한다.")
	@ElValidator(errUrl = "")
	public void updateCwlCgCd(CcsCwlSvCgCdVo vo) throws Exception{
		//경조수정내역 수정
		ccsCwlCgCdservice.updateCwlCgCd(vo);
	}
	
	@ElService(key = "SvcCCSCWLCGCDDTLU01")
	@RequestMapping(value = "SvcCCSCWLCGCDDTLU01")
	@ElDescription(sub = "경조사비 신청 결재상태 수정", desc = "경조사비 신청 내 결재상태를 수정한다.")
	@ElValidator(errUrl = "")
	public void updateCwlCgCdDtl(CcsCwlSvCgCdVo vo) throws Exception{
		//경조사비 신청 결재상태 수정
		ccsCwlCgCdservice.updateCwlCgCdDtl(vo);
	}	
	
	
}