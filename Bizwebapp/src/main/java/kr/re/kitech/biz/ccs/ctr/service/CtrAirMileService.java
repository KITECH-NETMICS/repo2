package kr.re.kitech.biz.ccs.ctr.service;

import java.util.List;

import kr.re.kitech.biz.ccs.ctr.vo.AirMileSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileInfoVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;

public interface CtrAirMileService {
	/*
     * 항공사별 마일리지 신청서(신고서) 조회
     */
	public CtrAirMileInfoVo selectCtrAirMileUseList(AirMileSrcVo vo);
	
	/*
     * 개인별 마일리지 보유현황 조회
     */
	public List<CtrAirMileVo> selectCtrAirMileList(AirMileSrcVo vo);	
	
	/*
     * 항공마일리지 신청(신고)서 저장
     */
	public String saveCtrAirMileReqAndRep(CtrAirMileUseVo vo);
}
