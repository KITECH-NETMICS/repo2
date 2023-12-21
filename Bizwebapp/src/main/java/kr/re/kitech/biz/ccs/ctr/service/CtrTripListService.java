package kr.re.kitech.biz.ccs.ctr.service;

import java.util.List;

import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripListVO;

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
public interface CtrTripListService {
	
	/**
     * 출장현황을 조회 한다
     * @param Object
     * @throws Exception
     */
	public List<CtrTripListVO> selectCtrTripList(Object param);
	
	/*
 	 * 출장정산현황 조회
	 */
	public List<CtrTripListVO> selectCtrTripAdList(CtrTripAdSrcVo vo);
}