package kr.re.kitech.biz.lpl.lpr.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 언론보도신청 관련 처리를 담당하는 인터페이스
 * @Class Name : LplLprPressPrService.java
 * @Description : 언론보도신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023.08.21.   김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.21.
 * @version 1.0
 * @see
 * 
 */ 
 
public interface LplLprPressPrService {

    /**
     * 언론보도신청 목록조회 
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return List<LplLprPressPrInfoVo>
	 * @throws KitechException
	 * @since 2023.08.21.
	 */
	public List<LplLprPressPrInfoVo> selectList(LplLprPressPrInfoVo vo) throws KitechException;
	
	/**
	 * 언론보도신청 상세 조회
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return LplLprPressPrInfoVo
	 * @throws KitechException
	 * @since 2023.08.21.
	 */
	public LplLprPressPrInfoVo select(LplLprPressPrInfoVo vo) throws KitechException;
	
	/**
	 * 언론보도신청 등록
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return LplLprPressPrInfoVo
	 * @throws KitechException
	 * @since 2023.08.21.
	 */
	public LplLprPressPrInfoVo save(LplLprPressPrInfoVo vo) throws KitechException;
	
	/**
	 * 언론보도신청 정보 삭제
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @throws KitechException
	 * @since 2023.08.21.
	 */
	public void delete(LplLprPressPrInfoVo vo) throws KitechException;
}
