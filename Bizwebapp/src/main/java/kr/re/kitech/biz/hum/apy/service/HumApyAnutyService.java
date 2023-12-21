package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyAnutyInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAnutyVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 과학기술인연금신청 관련 처리를 담당하는 인터페이스
 * @Class Name : HumApyAnutyService.java
 * @Description : 과학기술인연금신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023.08.25.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.25.
 * @version 1.0
 * @see
 * 
 */ 
public interface HumApyAnutyService {

	/**
	 * 과학기술인연금신청 리스트 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return List<HumApyAnutyInfoVo>
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	public List<HumApyAnutyInfoVo> selectList(HumApyAnutyInfoVo vo) throws KitechException;
	
	/**
	 * 과학기술인연금신청 상세 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return List<HumApyAnutyInfoVo>
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	public HumApyAnutyVo select(HumApyAnutyInfoVo vo) throws KitechException;
	
	/**
	 * 과학기술인연금신청 등록/결재요청/수정
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	public HumApyAnutyInfoVo save(HumApyAnutyInfoVo vo) throws KitechException;
	
	/**
	 * 과학기술인연금신청 삭제
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	public void delete(HumApyAnutyInfoVo vo) throws KitechException;
	
	/**
	 * 과학기술인연금신청 결재상태 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	public HumApyAnutyInfoVo selectApr(HumApyAnutyInfoVo vo) throws KitechException;
  
	/**
	 * 과학기술인연금신청 신청 전자결제 처리(화면)
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	public void formConfirm(HumApyAnutyInfoVo vo) throws KitechException;

	/**
	 * 과학기술인연금신청 신청 전자결제 반려(화면)
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	public void formReject(HumApyAnutyInfoVo vo) throws KitechException;  
}
