package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
/**
 * @ClassSubJect : 인장사용관리 DAO
 * @Class Name : CgsSignUseDAO.java
 * @Description : 직인/인감 날인 신청 DAO
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
@Repository("cgsSignUseDAO")
public class CgsSignUseDAO extends BizDefaultAbstractDAO {
  
  /**
   * 날인신청 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return List<CgsSignUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSignUseVo> selectList(CgsSignUseVo vo) throws ElException {
    return (List<CgsSignUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsSignUse", vo);
  }

  /**
   * 날인신청 상세 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public CgsSignUseVo selectSingle(CgsSignUseVo vo) throws ElException {
    return (CgsSignUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsSignUse", vo);
  }

  /**
   * 날인신청 등록
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int insertItem(CgsSignUseVo vo) throws ElException {
    return insert("kr.re.kitech.biz.ccs.cgs.insertCgsSignUse", vo);
  }

  /**
   * 날인신청 수정
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int updateItem(CgsSignUseVo vo) throws ElException {
    return update("kr.re.kitech.biz.ccs.cgs.updateCgsSignUse", vo);
  }

  /**
   * 날인신청 삭제
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int deleteItem(CgsSignUseVo vo) throws ElException {
    return delete("kr.re.kitech.biz.ccs.cgs.deleteCgsSignUse", vo);
  }
  
  /**
   * 날인신청 주소 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public CgsSignUseVo selectListAddr(CgsSignUseVo vo) throws ElException {
	  return (CgsSignUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectListCgsSignUseAddr", vo);
  }
  
  /**
   * 날인신청관리 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return List<CgsSignUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSignUseVo> selectListMnt(CgsSignUseVo vo) throws ElException {
    return (List<CgsSignUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectListItemCgsSignUseMnt", vo);
  }
  
  /**
   * 날인신청관리 수정
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int updateItemMnt(CgsSignUseVo vo) throws ElException {
	  return update("kr.re.kitech.biz.ccs.cgs.updateCgsSignUseMnt", vo);
  }

}
