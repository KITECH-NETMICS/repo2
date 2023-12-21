package kr.re.kitech.biz.ccs.cws.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 인터페이스
 * @Class Name : CwsOutWorkService.java
 * @Description : 재택근무신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
public interface CwsOutWorkService {
	
	/**
	 * 재택근무신청 페이징 처리하여 목록을 조회한다.
	 * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
	 * @return  재택근무신청 목록 List<CwsOutWorkVo>
	 * @throws Exception
	 */
	public List<CwsOutWorkVo> selectListCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException;
	
	/**
	 * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
	 * @return 조회한 재택근무신청 전체 카운트
	 * @throws Exception
	 */
	public long selectListCountCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException;
	
	/**
	 * 재택근무신청 상세조회를 한다.
	 * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
	 * @return 사원상세정보 CwsOutWorkVo
	 * @throws Exception
	 */
	public CwsOutWorkVo selectCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException;
		
	/**
	 * 재택근무신청를 등록한다.
	 * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
	 * @return 사번
	 * @throws Exception
	 */
	public int insertCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException;
	
	/**
	 * 재택근무신청를 갱신한다.
	 * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
	 * @throws Exception
	 */
	public int updateCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException;
	
	/**
	 * 재택근무신청를 삭제한다.
	 * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
	 * @throws Exception
	 */
	public int deleteCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws Exception;
	
	public String saveCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws Exception;
	
	public void selectCwsOutWorkDupCheck(CwsOutWorkVo cwsOutWorkVo) throws KitechException;
	
	public void selectCwsOutWorkValidCheck(CwsOutWorkVo cwsOutWorkVo) throws KitechException;
}
