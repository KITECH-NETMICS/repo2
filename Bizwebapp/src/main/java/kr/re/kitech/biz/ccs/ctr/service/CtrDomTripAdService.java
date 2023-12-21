package kr.re.kitech.biz.ccs.ctr.service;

import java.util.List;
import java.util.Map;

import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdFormVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdInfoVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;

/**
 * @author LeeYH-PC
 * 국내출장정산
 */
public interface CtrDomTripAdService {
    /*
     * 국내출장정산 조회
	 */
	public CtrDomAdInfoVo selectCtrDomAd(CtrTripAdSrcVo vo);	
		
	/**
    * 국내출장정산을 위한 국내출장정보 조회
    */
	public CtrDomAdInfoVo selectCtrDomTripForAd(CtrTripSrcVo vo);
	
	/**
    * 국내출장 정산 위치 인증내역 조회
    */
	public List<CtrTripGpsVo> selectGpsInfoData(CtrTripAdSrcVo vo);
	
	/**
    * 국내출장 정산 저장
    */
	public String saveCtrDomTripAdInfo(CtrDomAdInfoVo vo) throws Exception;
	
	/**
    * 국내출장 정산 삭제
    */
	public void deleteCtrDomTripAd(CtrTripAdSrcVo vo);
	
	/**
    * 업무대기함 호출시 출장정산 여부 체크
    */
	public Map<String,String> selectCtrDomAdExistsYn(CtrTripSrcVo vo);
	
	/**
    * 출장담당자 출장정산서 수정
    */
	public void updateCtrDomAdMng(CtrDomAdFormVo vo);
}
