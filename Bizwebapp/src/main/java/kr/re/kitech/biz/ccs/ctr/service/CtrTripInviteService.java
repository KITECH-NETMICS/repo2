package kr.re.kitech.biz.ccs.ctr.service;

import java.util.List;

import kr.re.kitech.biz.ccs.ctr.vo.CtrCvnTripSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo;
import kr.re.kitech.biz.ccs.ctr.vo.CvnTripAprVo;
import kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo;

/**  
 * @ClassSubJect 외부강의신고 관련 처리를 담당하는 인터페이스
 * @Class Name : CtrTripInviteService.java
 * @Description : 외부강의신고 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/04   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/05/04
 * @version 1.0
 * @see
 * 
 */
public interface CtrTripInviteService {
	
	/**
	 * 외부강의신고 페이징 처리하여 목록을 조회한다.
	 * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
	 * @return  외부강의신고 목록 List<CtrTripInviteVo>
	 * @throws Exception
	 */
	public List<CtrTripInviteVo> selectCtrCvnTripReqList(CtrCvnTripSrcVo vo);
	
	/**
	 * 외부강의신고 페이징 처리하여 목록을 조회한다.
	 * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
	 * @return  외부강의신고 목록 List<CtrTripInviteVo>
	 * @throws Exception
	 */
	public List<CtrTripInviteVo> selectCtrUpdateList(CtrCvnTripSrcVo vo);
	
	
	/**
	 * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
	 * @return 조회한 외부강의신고 전체 카운트
	 * @throws Exception
	 */
	public long selectListCountCtrTripInvite(CtrTripInviteVo ctrTripInviteVo);
	
	/**
	 * 대외활동신고 상세 조회 상세조회를 한다.
	 */
	public CvnTripAprVo selectCtrTripInvite(CtrCvnTripSrcVo vo);
		
	/**
	 * 외부강의신고를 등록한다.
	 * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
	 * @return 사번
	 * @throws Exception
	 */
	public CtrCvnTripSrcVo saveCvnTripReq(CtrTripInviteVo vo) throws Exception;	
	
	/**
	 * 외부강의신고를 삭제한다.
	 * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
	 * @throws Exception
	 */
	public void deleteCtrTripInvite(CtrCvnTripSrcVo vo) throws Exception;
	
	/**
    * 외부강의신고 월간 누적횟수 및 시간 조회
    */
	public CtrTripInviteVo selectInviteYearMonth(CtrCvnTripSrcVo vo);
	
	/**
	 * 외부강의신고 페이징 처리하여 목록을 조회한다.
	 * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
	 * @return  외부강의신고 목록 List<CtrTripInviteVo>
	 * @throws Exception
	 */
	public List<CvnTripReqMonthVo> selectCtrMonthList(CtrCvnTripSrcVo vo);
	
}
