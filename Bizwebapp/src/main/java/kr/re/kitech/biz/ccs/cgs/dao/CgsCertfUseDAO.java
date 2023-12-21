package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 법인증명서발급신청 DAO 
 * @Class Name : CgsCertfUseDAO.java
 * @Description : 법인증명서발급신청 DAO
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
@Repository("cgsCertfUseDAO")
public class CgsCertfUseDAO extends BizDefaultAbstractDAO {
  

  /**
   * 법인증명서발급신청 목록 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return List<CgsCertfUseVo>
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public List<CgsCertfUseVo> selectList(CgsCertfUseVo vo) throws KitechException {
    return (List<CgsCertfUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsCertfUse", vo);
  }

  /**
   * 법인증명서발급신청 상세 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return CgsCertfUseVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public CgsCertfUseVo selectItem(CgsCertfUseVo vo) throws KitechException {
    return (CgsCertfUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsCertfUse", vo);
  }

  /**
   * 법인증명서발급신청 등록
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int insertItem(CgsCertfUseVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.ccs.cgs.insertCgsCertfUse", vo);
  }
  
  /**
   * 법인증명서발급신청 수정
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.31.   
   */
  public int updateItem(CgsCertfUseVo vo) throws ElException {
    return update("kr.re.kitech.biz.ccs.cgs.updateCgsCertfUse", vo);
  }  
  
  /**
   * 법인증명서발급신청 삭제
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return int
   * @throws ElException
   * @since 2023.08.31.   
   */
  public int deleteItem(CgsCertfUseVo vo) throws ElException {
    return delete("kr.re.kitech.biz.ccs.cgs.deleteCgsCertfUse", vo);
  }  
  
  /**
   * 법인증명서발급신청 주소 목록 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return CgsCertfUseVo
   * @throws ElException
   * @since 2023.08.31.   
   */
  public CgsCertfUseVo selectListAddr(CgsCertfUseVo vo) throws ElException {
	  return (CgsCertfUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsCertfUseAddr", vo);
  }

}
