package kr.re.kitech.biz.lpl.lcp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo;
import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LplCustBaseInfoDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.06.      author    최초생성
 * 
 * @author 
 * @since 2023.11.06.
 * @version 1.0
 * @see
 * 
 */
@Repository("lplCustBaseInfoDAO")
public class LplCustBaseInfoDAO extends BizDefaultAbstractDAO {
  
  /**
   * 기관정보 목록 조회
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return List<LplCustBaseInfoVo>
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public List<LplCustBaseInfoVo> selectList01(LplCustBaseInfoVo vo) throws KitechException {
    return (List<LplCustBaseInfoVo>)list("kr.re.kitech.biz.lpl.lcp.selectLplCustBaseInfo", vo);
  }

  /**
   * 기관정보 상세 조회
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return LplCustBaseInfoVo
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public LplCustBaseInfoVo selectLplCustBaseInfoDetal(LplCustBaseInfoVo vo) throws KitechException {
    return (LplCustBaseInfoVo) selectByPk("kr.re.kitech.biz.lpl.lcp.selectLplCustBaseInfoDetal", vo);
  }
  
  /**
   * 기관중복 검사
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return List<LplCustBaseInfoVo>
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public List<LplCustBaseInfoVo> selectLplCustBaseInfoChk(LplCustBaseInfoVo vo) throws KitechException {
    return (List<LplCustBaseInfoVo>)list("kr.re.kitech.biz.lpl.lcp.selectLplCustBaseInfoChk", vo);
  }  

  /**
   * 기관기본정보 등록
   * 
   * @author 
   * @param LplCustBaseInfoMerVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public int insertLplCustBaseInfo(LplCustBaseInfoMerVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.insertLplCustBaseInfoMer", vo);
  }
  
  /**
   * 기관기본정보 수정
   * 
   * @author 
   * @param LplCustBaseInfoMerVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public int updateLplCustBaseInfo(LplCustBaseInfoMerVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.updateLplCustBaseInfoMer", vo);
  }  

}
