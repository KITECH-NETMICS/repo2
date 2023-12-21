package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyCertListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCertVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyOutVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 증명서발급신청 관련 처리를 담당하는 인터페이스
 * @Class Name : HumApyCertService.java
 * @Description : 증명서발급신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/31
 * @version 1.0
 * @see
 * 
 */
public interface HumApyCertService {
	
	/**
	 * 증명서발급신청 페이징 처리하여 목록을 조회한다.
	 * @param humApyCertVo 증명서발급신청 HumApyCertVo
	 * @return  증명서발급신청 목록 List<HumApyCertVo>
	 * @throws KitechException
	 */
	public List<HumApyCertVo> selectListHumApyCert(HumApyOutVo humApyCertVo) throws KitechException;
	
	/**
	 * @param humApyCertVo 증명서발급신청 HumApyCertVo
	 * @return 조회한 증명서발급신청 전체 카운트
	 * @throws KitechException
	 */
	public long selectListCountHumApyCert(HumApyOutVo humApyCertVo) throws KitechException;
	
	/**
	 * 증명서발급신청 상세조회를 한다.
	 * @param humApyCertVo 증명서발급신청 HumApyCertVo
	 * @return 사원상세정보 HumApyCertVo
	 * @throws KitechException
	 */
	public HumApyCertVo selectHumApyCert(HumApyCertVo humApyCertVo) throws KitechException;
		
	/**
	 * 증명서발급신청를 등록한다.
	 * @param humApyCertVo 증명서발급신청 HumApyCertVo
	 * @return 사번
	 * @throws KitechException
	 */
	public int insertHumApyCert(HumApyCertVo humApyCertVo) throws KitechException;
	
	public String saveHumApyCert(HumApyCertVo humApyCertVo) throws Exception;
	
	/**
	 * 증명서발급신청를 갱신한다.
	 * @param humApyCertVo 증명서발급신청 HumApyCertVo
	 * @throws KitechException
	 */
	public int updateHumApyCert(HumApyCertVo humApyCertVo) throws KitechException;
	
	/**
	 * 증명서발급신청를 삭제한다.
	 * @param humApyCertVo 증명서발급신청 HumApyCertVo
	 * @throws KitechException
	 */
	public int deleteHumApyCert(HumApyCertVo humApyCertVo) throws KitechException;
	
	/**
	*	증명서발급신청을 조회한다.
	*	@param humApyOutVo
	*	@throws KitechException
	**/
	public HumApyOutVo selectHumApyOutVo(HumApyOutVo humApyOutVo) throws KitechException;
	
		/**
	*	증명서발급신청를 전자결제 승인(화면)
	*	@param humApyOutVo
	*	@throws KitechException
	**/
	public void formAccept(HumApyCertVo humApyCertVo) throws Exception;
	
		/**
	*	증명서발급신청를 전자결제 반려(화면)
	*	@param humApyOutVo
	*	@throws KitechException
	**/
	public void formReject(HumApyCertVo humApyCertVo) throws Exception;
	
	/**
	*	증명서발급관리 목록을 조회한다.
	*	@param HumApyCertVo
	*	@throws KitechException
	**/
	public List<HumApyCertVo> selectHumApyCertList(HumApyCertVo vo);

	/**
	*	증명서발급관리 비고를 저장한다.
	*	@param HumApyCertVo
	*	@throws KitechException
	**/
	public void saveHumApyCertList(HumApyCertListVo vo);
	
	/**
	*	증명서발급관리 내역을 삭제한다.
	*	@param HumApyCertVo
	*	@throws KitechException
	**/
	public void deleteHumApyCertList(HumApyCertListVo vo);
	
	/**
	*	증명서발급관리 담당자가 저장한다.
	*	@param HumApyCertVo
	*	@throws KitechException
	**/
	public String adminSaveHumApyCert(HumApyCertVo humApyCertVo);
}
