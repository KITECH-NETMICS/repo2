package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 회의실신청 관련 처리를 담당하는 인터페이스
 * @Class Name : CgsMRoomReqService.java
 * @Description : 회의실신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/13   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/04/13
 * @version 1.0
 * @see
 * 
 */
public interface CgsMRoomReqService {
	
	/**
	 * 회의실신청 페이징 처리하여 목록을 조회한다.
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @return  회의실신청 목록 List<CgsMRoomReqVo>
	 * @throws Exception
	 */
	public List<CgsMRoomReqVo> selectListCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @return 조회한 회의실신청 전체 카운트
	 * @throws Exception
	 */
	public long selectListCountCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	 * 회의실신청 상세조회를 한다.
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @return 사원상세정보 CgsMRoomReqVo
	 * @throws Exception
	 */
	public CgsMRoomReqVo selectCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
		
	/**
	 * 회의실신청를 등록한다.
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @return 사번
	 * @throws Exception
	 */
	public int insertCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	 * 회의실신청를 갱신한다.
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @throws Exception
	 */
	public int updateCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	 * 회의실신청를 삭제한다.
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @throws Exception
	 */
	public int deleteCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	 * 회의실 페이징 처리하여 목록을 조회한다.
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @return  회의실신청 목록 List<CgsMRoomReqVo>
	 * @throws Exception
	 */
	public List<CgsMRoomReqVo> selectListCgsMRoom(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	 * 회의실부대장비 페이징 처리하여 목록을 조회한다.
	 * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
	 * @return  회의실신청 목록 List<CgsMRoomReqVo>
	 * @throws Exception
	 */
	public List<CgsMRoomReqVo> selectListCgsMRoomInfo(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
     * 모바일 잔여 회의실을 조회합니다
     * @param CgsMRoomReqVo
     * @throws Exception
     */
	public List<Object> selectListCgsMRoomMob(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	*	회의실신청를 전자결제 승인(화면)
	*	@param CgsMRoomReqVo
	*	@throws KitechException
	**/
	public void formAccept(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	/**
	*	회의실신청를 전자결제 반려(화면)
	*	@param CgsMRoomReqVo
	*	@throws KitechException
	**/
	public void formReject(CgsMRoomReqVo cgsMRoomReqVo) throws Exception;
	
	
		/**
	*	회의실신청 중복조회
	*	@param CgsMRoomReqVo
	*	@throws KitechException
	**/
	public String selectCgsMroomDupOverlap(CgsMRoomReqVo cgsMRoomReqVo) throws KitechException;
	
	/**
	*	메일발송
	*	@param CgsMRoomReqVo
	*	@throws ElException
	**/
	public void cgsMailSend(CgsMRoomReqVo cgsMRoomReqVo) throws ElException;
}
