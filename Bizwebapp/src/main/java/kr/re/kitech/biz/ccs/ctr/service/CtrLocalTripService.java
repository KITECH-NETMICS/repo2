package kr.re.kitech.biz.ccs.ctr.service;

import java.util.List;

import kr.re.kitech.biz.ccs.ctr.vo.BizTripFareVo;
import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripVO;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripCurStnVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;

/**
 * @ClassSubJect 근거리출장 관련 처리 컨트롤러
 * @Class Name CtrTripInviteController.java
 * @Description 근거리출장 관련 처리 컨트롤러
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/05/13      김태균             최초생성
 * 
 * @author 김태균
 * @since 2022/05/13
 * @version 1.0
 * @see
 * 
 */
public interface CtrLocalTripService {
	
	/**
     * 여비금을 조회 한다
     * @param Object
     * @throws Exception
     */
	public List<BizTripFareVo> selectCtrTrafcFee(CtrTripSrcVo param);
	
	/**
     * 근거리출장을 생성 한다
     * @param Object
     * @throws Exception
     */
	public CtrTripSrcVo saveCtrLocalTrip(CtrLocalTripVO param);	
    
    /**
     * 근거리출장을 삭제 한다
     * @param CtrLocalTripInfoVO
     * @throws Exception
     */
    public void deleteCtrLocalTrip(CtrTripSrcVo param) throws Exception;
	
	/**
     * 근거리출장을 조회 한다
     * @param CtrLocalTripInfoVO
     * @throws Exception
     */
	public CtrLocalTripVO selectCtrLocalTrip(CtrTripSrcVo param);	
	
	/**
     * 최근계정을 조회
     * @param Object
     * @throws Exception
     */
	public List<Object> selectRecntAccnt(Object param);
	
	/**
     * 출장일수를 조회 한다
     * @param Object
     * @throws Exception
     */
    public List<CtrTripCurStnVo> selectTripPsnCount(CtrTripCurStnVo param);
    
    /**
     * 회계코드조회
     */
    public CheckSrcVo getLocalTripAccntCd(CheckSrcVo vo);
    
    /**
     * 근거리출장 결재신청
     */
    //public void approvalLocalTripReq(CtrLocalTripVO vo) throws Exception;
}