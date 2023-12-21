package kr.re.kitech.biz.lpl.lpr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 언론보도신청 
 * @Class Name AprBugtCtrlDAO.java
 * @Description 언론보도신청 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.21.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.21.
 * @version 1.0
 * @see
 * 
 */

  @Repository("lplLprPressPrDAO")
  public class LplLprPressPrDAO extends BizDefaultAbstractDAO {

	/**
     * 언론보도신청 목록 조회
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return List<LplLprPressPrInfoVo>
	 * @throws KitechException
	 * @since 2023.08.21.
     */
	public List<LplLprPressPrInfoVo> selectList(LplLprPressPrInfoVo vo) throws KitechException {
	  return (List<LplLprPressPrInfoVo>)list("kr.re.kitech.biz.lpl.lpr.selectLplLprPressPrList", vo);
	}
	
	/**
     * 언론보도신청 상세 조회
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return LplLprPressPrInfoVo
	 * @throws KitechException
	 * @since 2023.08.21.
     */
	public LplLprPressPrInfoVo select(LplLprPressPrInfoVo vo) throws KitechException {
	  return (LplLprPressPrInfoVo) selectByPk("kr.re.kitech.biz.lpl.lpr.selectLplLprPressPrInfo", vo);
	}
	
	/**
     * 언론보도신청 등록
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.21.
     */
	public int insert(LplLprPressPrInfoVo vo) throws KitechException {
	  return insert("kr.re.kitech.biz.lpl.lpr.insertLplLprPressPr", vo);
	}
	
	/**
     * 언론보도신청 수정
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.21.
     */
	public int update(LplLprPressPrInfoVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.lpl.lpr.updateLplLprPressPr", vo);
	}
	
	/**
     * 언론보도신청 삭제
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.21.
     */
	public int delete(LplLprPressPrInfoVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.lpl.lpr.deleteLplLprPressPr", vo);
	}

}
