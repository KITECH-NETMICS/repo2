package kr.re.kitech.biz.ccs.ctr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.ctr.service.CtrDomTripService;
import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripCheckVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripReqVo;
import kr.re.kitech.biz.ccs.ctr.vo.DayOffInfoVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;

/**  
 * @ClassSubJect 국내출장
 * @Class Name CtrDomTripController.java
 * @Description 국내출장 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/06/10     이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/06/10
 * @version 1.0
 * @see
 * 
 */
 @Controller
public class CtrDomTripController {
	 @Resource(name="ctrDomTripService")
	 private CtrDomTripService tripService;
	 
	 @ElService(key = "SvcCCSCTRDOMR01")
	@RequestMapping(value = "SvcCCSCTRDOMR01")
	@ElDescription(sub = "국내출장신청서 조회", desc = "국내출장신청서, 동반자, 출장경로,활동내역, 방문처 등을 조회한다.")
	@ElValidator(errUrl = "")
	public CtrTripReqVo selectCtrDomTrip(CtrTripSrcVo vo) throws Exception{
		 return tripService.selectCtrDomTrip(vo);
	}
	
	 @ElService(key = "SvcCCSCTRDOMR02")
	@RequestMapping(value = "SvcCCSCTRDOMR02")
	@ElDescription(sub = "국내출장 휴일내역 조회", desc = "국내출장 휴일내역을 조회한다.")
	@ElValidator(errUrl = "")
	public DayOffInfoVo selectCtrBizTripRstList(CtrTripSrcVo vo) throws Exception{
		 return tripService.selectCtrBizTripRstList(vo);
	 }
	 
	 @ElService(key = "SvcCCSCTRDOMR03")
	@RequestMapping(value = "SvcCCSCTRDOMR03")
	@ElDescription(sub = "운임 및 기타경비 조회", desc = "국내출장에서 출발지변경시 운임 및 기타경비를 재조회한다.")
	@ElValidator(errUrl = "")
	public List<CtrDomPathVo> selectFareFee(CtrTripReqVo vo) throws Exception{		
//		ObjectMapper mapper = new ObjectMapper();
//		List<CtrDomPathVo> paramList = mapper.readValue(mapper.writeValueAsString(param), new TypeReference<List<CtrDomPathVo>>(){});
		 return tripService.selectFareFee(vo.getPathList());
	 }
	 
	 @ElService(key = "SvcCCSCTRDOMR04")
	@RequestMapping(value = "SvcCCSCTRDOMR04")
	@ElDescription(sub = "기타경비조회", desc = "출장자 직급구분변경시 기타경비를 재조회한다.")
	@ElValidator(errUrl = "")
	public CtrDomFeeVo selectEtcFee(CtrTripSrcVo vo) throws Exception{
		 return tripService.selectEtcFee(vo);
	 }
	 
	@ElService(key = "SvcCCSCTRDOMM01")
	@RequestMapping(value = "SvcCCSCTRDOMM01")
	@ElDescription(sub = "국내출장저장", desc = "국내출장,동반자,경로,활동내역,계정내역등을 저장한다.")
	@ElValidator(errUrl = "")
	public CtrTripSrcVo saveDomTrip(CtrTripReqVo vo) throws Exception{
		return tripService.saveDomTrip(vo);
	}
	
	@ElService(key = "SvcCCSCTRDOMD01")
	@RequestMapping(value = "SvcCCSCTRDOMD01")
	@ElDescription(sub = "국내출장 삭제", desc = "국내출장정보, 동반자, 출장경로, 활동내역, 계정내역등을 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteDomTrip(CtrTripSrcVo vo) throws Exception{
		tripService.deleteDomTrip(vo);
	}
	
	@ElService(key = "SvcCCSCTRDOMR05")
	@RequestMapping(value = "SvcCCSCTRDOMR05")
	@ElDescription(sub = "국내출장 결재전 체크", desc = "국내출장 결재신청전 기간중복, 복명서확인, 타업종사, 정부수탁과제여부등을 검사한다.")
	@ElValidator(errUrl = "")
	public CtrDomTripCheckVo selectCtrDomTripAprChk(CheckSrcVo vo) throws Exception{
		return tripService.checkCtrDomTrip(vo);
	}
	
	@ElService(key = "SvcCCSCTRDOMR06")
	@RequestMapping(value = "SvcCCSCTRDOMR06")
	@ElDescription(sub = "출장자 중에 이공계인턴쉽이 있는경우 월중 지급내역 조회", desc = "출장자 중에 이공계인턴쉽((posi_cd = 353010))이 있는경우 월중 지급내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<CtrDomPayVo> selectCtrDomPayPosi(CtrTripSrcVo vo) throws Exception{
		return tripService.selectCtrDomPayPosi(vo);
	}
	
	@ElService(key = "SvcCCSCTRDOMU01")
	@RequestMapping(value = "SvcCCSCTRDOMU01")
	@ElDescription(sub = "국내출장신청 결재 후 담당자 저장", desc = "결재후 담당자가 국내출장신청 정보 중 일부와 활동내역을 저장한다.")
	@ElValidator(errUrl = "")
	public void saveDomTripPostApr(CtrTripReqVo vo) throws Exception{
		tripService.saveDomTripPostApr(vo);
	}
}
