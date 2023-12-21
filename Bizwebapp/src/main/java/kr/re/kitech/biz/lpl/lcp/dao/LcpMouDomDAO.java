package kr.re.kitech.biz.lpl.lcp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LcpMouDomDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      author    최초생성
 * 
 * @author 
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
@Repository("lcpMouDomDAO")
public class LcpMouDomDAO extends BizDefaultAbstractDAO {

  private static final String NAMESPACE = "kr.re.kitech.biz.lpl.lcp.";

  /**
   * 리스트 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouDomVo> selectList01(LcpMouDomVo vo) throws KitechException {
    return (List<LcpMouDomVo>)list(NAMESPACE + "selectLcpMouDom", vo);
  }
  
  /**
   * 액셀 리스트 조회
   * 
   * @author 
   * @param LcpMouDomExcelVo
   * @return List<LcpMouDomExcelVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouDomExcelVo> selectList02(LcpMouDomVo vo) throws KitechException {
    return (List<LcpMouDomExcelVo>)list(NAMESPACE + "selectLcpMouDomExcel", vo);
  }
  
  /**
   * 실무자 그리드 셋팅  조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouDomVo> selectLcpMouDomUserGrid(LcpMouDomVo vo) throws KitechException {
    return (List<LcpMouDomVo>)list(NAMESPACE + "selectLcpMouDomUserGrid", vo);
  }
  
  /**
   * 실무자 유저  조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouUserVo> selectLcpMouDomUser(LcpMouDomVo vo) throws KitechException {
    return (List<LcpMouUserVo>)list(NAMESPACE + "selectLcpMouDomUser", vo);
  }      

  /**
   * 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return LcpMouDomFormVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public LcpMouDomFormVo selectLcpMouDomForm(LcpMouDomVo vo) throws KitechException {
    return (LcpMouDomFormVo) selectByPk(NAMESPACE + "selectLcpMouDomForm", vo);
  }
  
  /**
   * 국내 협약 사후관리 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomAftrVo>
   * @throws KitechException
   * @since 2023.11.22.
   */
  public List<LcpMouDomAftrVo> selectLcpMouDomAfter(LcpMouDomVo vo) throws KitechException {
    return (List<LcpMouDomAftrVo>)list(NAMESPACE + "selectLcpMouDomAfter", vo);
  }
  
  /**
   * 국내협약긴관정보조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomAgencyVo>
   * @throws KitechException
   * @since 2023.11.22.
   */
  public List<LcpMouDomAgencyVo> selectLcpMouDomAgy(LcpMouDomVo vo) throws KitechException {
    return (List<LcpMouDomAgencyVo>)list(NAMESPACE + "selectLcpMouDomAgy", vo);
  }      

  /**
   * 등록
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertLcpMouDomForm(LcpMouDomFormVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpMouDomForm", vo);
  }
  
  /**
   * 국내협약 사용자정보 입력
   * 
   * @author 
   * @param LcpMouUserVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertLcpMouUser(LcpMouUserVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpMouUser", vo);
  }
 
  /**
   * 국내협약결과 수정
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int updateLcpMouDomForm(LcpMouDomFormVo vo) throws KitechException {
    return update(NAMESPACE + "updateLcpMouDomForm", vo);
  }

  /**
   * 국내협약사용자 수정
   * 
   * @author 
   * @param LcpMouUserVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int updateLcpMouUser(LcpMouUserVo vo) throws KitechException {
    return update(NAMESPACE + "updateLcpMouUser", vo);
  }
  
  /**
   * 국내협약 삭제
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int deleteLcpMouDomForm(LcpMouDomFormVo vo) throws KitechException {
    return delete(NAMESPACE + "deleteLcpMouDomForm", vo);
  } 
  
  /**
   * 국내협약 사용자 삭제
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int deleteLcpMouUserForm(LcpMouDomFormVo vo) throws KitechException {
    return delete(NAMESPACE + "deleteLcpMouUserForm", vo);
  }   

  /**
   * 국내협약사후관리 삭제
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int deleteLcpMouDomAftr(LcpMouDomFormVo vo) throws KitechException {
    return delete(NAMESPACE + "deleteLcpMouDomAftr", vo);
  }
  
  /**
   * 국내협약사후관리 입력
   * 
   * @author 
   * @param LcpMouDomAftrVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertLcpMouDomAftr(LcpMouDomAftrVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpMouDomAftr", vo);
  }        
  
  /**
   * 국내협약사후관리 수정
   * 
   * @author 
   * @param LcpMouDomAftrVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int updateLcpMouDomAftr(LcpMouDomAftrVo vo) throws KitechException {
    return update(NAMESPACE + "updateLcpMouDomAftr", vo);
  }  
  
  /**
   * 국내협약긴관정보삭제
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int deleteLcpMouDomAgency(LcpMouDomFormVo vo) throws KitechException {
    return delete(NAMESPACE + "deleteLcpMouDomAgency", vo);
  }  
  
  /**
   * 국내협약긴관정보등록
   * 
   * @author 
   * @param LcpMouDomAgencyVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertLcpMouDomAgcy(LcpMouDomAgencyVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpMouDomAgcy", vo);
  }  
  
  /**
   * 국내협약기관정보 수정
   * 
   * @author 
   * @param LcpMouDomAgencyVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int updateLcpMouDomAgcy(LcpMouDomAgencyVo vo) throws KitechException {
    return update(NAMESPACE + "updateLcpMouDomAgcy", vo);
  }  

}
