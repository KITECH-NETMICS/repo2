package kr.re.kitech.biz.ccs.pop.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlHumFamyInfoPopVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlLoanPopVo;

public interface CcsPopService {
	/**
    * 출장신청번호 검색 팝업 조회
	*/
	public List<CtrTripPopVo> selectPopCtrDomList(CtrTripSrcVo vo);
	
	/**
    * 병가 휴가원신청중 증빙 미등록내역 조회(팝업)
	*/
	public List<CgslappVo> selectSickVaccNoFileList(CgslappSchVo vo);
	
	/**
    * 항공마일리지관리번호 검색(팝업)
	*/
	public List<CtrAirMileUseVo> selectCtrAirMileUseList(CtrTripSrcVo vo);
	
	/**
	 * 대출중도산환신청 - 대출내역조회(팝업)
	 */
	public List<CwlLoanPopVo> selectCwlLoanPopList(CwlLoanPopVo vo);
	
	/**
	 * 학자금융자신청 - 부양가족조회(팝업)
	 */
	public List<CwlHumFamyInfoPopVo> selectHumFamyInfoList(CwlHumFamyInfoPopVo vo);
}

