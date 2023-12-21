package kr.re.kitech.biz.ccs.cws.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 비상근 업무일지 관련 처리를 담당하는 인터페이스
 * @Class Name : CwsPartTimerJorService.java
 * @Description : 비상근 업무일지 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/07   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/04/07
 * @version 1.0
 * @see
 * 
 */
public interface CwsPartTimerJorService {
	
	/**
	 * 비상근 업무일지 페이징 처리하여 목록을 조회한다.
	 * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
	 * @return  비상근 업무일지 목록 List<CwsPartTimerJorVo>
	 * @throws KitechException
	 */
	public List<CwsPartTimerJorVo> selectListCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException;
	
	/**
	 * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
	 * @return 조회한 비상근 업무일지 전체 카운트
	 * @throws KitechException
	 */
	public long selectListCountCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException;
	
	/**
	 * 비상근 업무일지 상세조회를 한다.
	 * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
	 * @return 사원상세정보 CwsPartTimerJorVo
	 * @throws KitechException
	 */
	public CwsPartTimerJorVo selectCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException;
		
	/**
	 * 비상근 업무일지를 등록한다.
	 * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
	 * @return 사번
	 * @throws KitechException
	 */
	public int insertCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException;
	
	/**
	 * 비상근 업무일지를 갱신한다.
	 * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
	 * @throws KitechException
	 */
	public int updateCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException;
	
	/**
	 * 비상근 업무일지를 삭제한다.
	 * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
	 * @throws KitechException
	 */
	public int deleteCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws Exception;
	
	public CwsWorkTimeVo selectCwsWorkTime(CwsWorkTimeVo cwsWorkTimeVo) throws KitechException;
	
	public String saveCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws Exception;
	
	public void selectCwsPartTimerJorCheck(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException;
	
}
