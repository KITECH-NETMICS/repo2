package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect : 직인/인감신청 관리 DAO
 * @Class Name : CgsSealUseDAO.java
 * @Description : 직인/인감신청 DAO
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
@Repository("cgsSealUseDAO")
public class CgsSealUseDAO extends BizDefaultAbstractDAO {
  
  /**
   * 직인/인감신청 목록 조회
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return List<CgsSealUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSealUseVo> selectList(CgsSealUseVo vo) throws ElException {
    return (List<CgsSealUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsSealUse", vo);
  }

  /**
   * 직인/인감신청 상세 조회
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return CgsSealUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public CgsSealUseVo selectItem(CgsSealUseVo vo) throws ElException {
    return (CgsSealUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsSealUse", vo);
  }

  /**
   * 직인/인감신청 등록
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int insertItem(CgsSealUseVo vo) throws ElException {
    return insert("kr.re.kitech.biz.ccs.cgs.insertCgsSealUse", vo);
  }

  /**
   * 직인/인감신청 수정
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int updateItem(CgsSealUseVo vo) throws ElException {
    return update("kr.re.kitech.biz.ccs.cgs.updateCgsSealUse", vo);
  }

  /**
   * 직인/인감신청 삭제
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int deleteItem(CgsSealUseVo vo) throws ElException {
    return delete("kr.re.kitech.biz.ccs.cgs.deleteCgsSealUse", vo);
  }
  
  /**
   * 사용(직인/인감)인수증 목록조회(팝업)
 	 * 
 	 * @author lsh
   * @param  CgsSealUseVo
   * @return List<CgsSealUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSealUseVo> selectListPop(CgsSealUseVo vo) throws ElException {
    return (List<CgsSealUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectCgsSealUsePop", vo);
  }

  /**
   * 사용(직인/인감)인수증 수정(팝업)
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.30.   
   */
  public int updateItemPop(CgsSealUseVo vo) throws ElException {
    return update("kr.re.kitech.biz.ccs.cgs.updateCgsSealUsePop", vo);
  }
}
