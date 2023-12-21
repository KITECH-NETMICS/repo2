/**
 * 
 */
package kr.re.kitech.biz.ccs.ctr.service;

import java.util.List;

import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripCheckVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripReqVo;
import kr.re.kitech.biz.ccs.ctr.vo.DayOffInfoVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;

/**
* 국내출장 CtrDomTripService
* @author LeeYH
* @since 2022.06.08.
*/
public interface CtrDomTripService {
	/**
    * 국내출장신청서 조회
    */ 
	public CtrTripReqVo selectCtrDomTrip(CtrTripSrcVo vo);
	
	/**
    * 국내출장 휴일내역 조회
    */ 
	public DayOffInfoVo selectCtrBizTripRstList(CtrTripSrcVo vo);
	
	/**
    * 국내출장 운임 조회
    */ 
	public List<CtrDomPathVo> selectFareFee(List<CtrDomPathVo> pathList);
	
	/**
    * 기타경비 조회
    */
	public CtrDomFeeVo selectEtcFee(CtrTripSrcVo vo);
	
	/**
    * 국내출장 저장
    */
	public CtrTripSrcVo saveDomTrip(CtrTripReqVo vo) throws Exception;
	
	/**
    * 국내출장 삭제
    */
	public void deleteDomTrip(CtrTripSrcVo vo) throws Exception;
	
	/**
    * 국내출장 결재신청전 체크
    */
	public CtrDomTripCheckVo checkCtrDomTrip(CheckSrcVo vo);
	
	/**
    * 국내출장 결재신청
    */
	//public void approvalDomTripReq(CtrTripReqVo vo) throws Exception;
	
	/**
    * 출장자 중에 이공계인턴쉽이 있는경우 (posi_cd = 353010) 월중 출장비 지급내역
    */
	public List<CtrDomPayVo> selectCtrDomPayPosi(CtrTripSrcVo vo);
	
	/**
    * 국내출장 저장(결재 후 담당자 저장) - 출장신청 일부내용과 활동내역만 저장가능
    */
	public void saveDomTripPostApr(CtrTripReqVo vo);
}
