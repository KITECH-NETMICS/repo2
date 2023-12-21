package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 콘도기본정보 DAO
 * @Class Name : CgsCondoMasterDAO.java
 * @Description : 콘도기본정보 DAO
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Repository("cgsCondoMasterDAO")
public class CgsCondoMasterDAO extends BizDefaultAbstractDAO {
  

  /**
   * 콘도기본정보 목록 조회
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return List<CgsCondoMasterVo>
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<CgsCondoMasterVo> selectList(CgsCondoMasterVo vo) throws KitechException {
    return (List<CgsCondoMasterVo>)list("kr.re.kitech.biz.ccs.cgs.selectCgsCondoMaster", vo);
  }

  /**
   * 콘도기본정보 등록
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return int
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public int insertItem(CgsCondoMasterVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.ccs.cgs.insertCgsCondoMaster", vo);
  }
  
  /**
   * 콘도기본정보 수정
   * 
   * @author lsh
   * @param CgsCondoMasterVo
   * @return int
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public int updateItem(CgsCondoMasterVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.ccs.cgs.updateCgsCondoMaster", vo);
  }
  
  /**
   * 콘도기본정보 삭제
   * 
   * @author lsh
   * @param CgsCondoMasterVo
   * @return int
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public int deleteItem(CgsCondoMasterVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.ccs.cgs.deleteCgsCondoMaster", vo);
  }

  /**
   * 콘도명 셀렉트박스 목록 조회
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return List<CgsCondoMasterVo>
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<CgsCondoMasterVo> selectCondoList(CgsCondoMasterVo vo) throws KitechException {
    return (List<CgsCondoMasterVo>)list("kr.re.kitech.biz.ccs.cgs.selectCondoList", vo);
  }
  
  /**
   * 지역명 셀렉트박스 목록 조회
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return List<CgsCondoMasterVo>
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<CgsCondoMasterVo> selectRegionList(CgsCondoMasterVo vo) throws KitechException {
    return (List<CgsCondoMasterVo>)list("kr.re.kitech.biz.ccs.cgs.selectRegionList", vo);
  }

}
