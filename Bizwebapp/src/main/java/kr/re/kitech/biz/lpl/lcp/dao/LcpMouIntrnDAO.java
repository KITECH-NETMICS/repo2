package kr.re.kitech.biz.lpl.lcp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LcpMouIntrnDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.20.      author    최초생성
 * 
 * @author 
 * @since 2023.11.20.
 * @version 1.0
 * @see
 * 
 */
@Repository("lcpMouIntrnDAO")
public class LcpMouIntrnDAO extends BizDefaultAbstractDAO {

  private static final String NAMESPACE = "kr.re.kitech.biz.lpl.lcp.";

  /**
   * 리스트 조회
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return List<LcpMouIntrnVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  public List<LcpMouIntrnVo> selectList01(LcpMouIntrnVo vo) throws KitechException {
    return (List<LcpMouIntrnVo>)list(NAMESPACE + "selectLcpMouIntrn", vo);
  }

  /**
   * 국제협약상세조회
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return LcpMouIntrnVo
   * @throws KitechException
   * @since 2023.11.20.
   */
  public LcpMouIntrnVo selectLcpMouIntrnDetail(LcpMouIntrnVo vo) throws KitechException {
    return (LcpMouIntrnVo) selectByPk(NAMESPACE + "selectLcpMouIntrnDetail", vo);
  }
  
  /**
   * 국내협약긴관정보조회
   * 
   * @author 
   * @param LcpMouDomAgencyVo
   * @return List<LcpMouDomAgencyVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  public List<LcpMouDomAgencyVo> selectLcpMouDomAgency(LcpMouDomAgencyVo vo) throws KitechException {
    return (List<LcpMouDomAgencyVo>) list(NAMESPACE + "selectLcpMouDomAgency", vo);
  }

  /**
   * 국제협약사후관리조회
   * 
   * @author 
   * @param LcpMouAfactVo
   * @return List<LcpMouAfactVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  public List<LcpMouAfactVo> selectLcpMouAfact(LcpMouAfactVo vo) throws KitechException {
    return (List<LcpMouAfactVo>) list(NAMESPACE + "selectLcpMouAfact", vo);
  }    

  /**
   * 국제협약체결정보 신청 등록
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertLcpMouIntrn(LcpMouIntrnVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpMouIntrn", vo);
  }
  /**
   * 국제협약체결정보 신청 수정
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int updateLcpMouIntrn(LcpMouIntrnVo vo) throws KitechException {
    return update(NAMESPACE + "updateLcpMouIntrn", vo);
  }
  /**
   * 국제협약체결정보 삭제
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int deleteLcpMouIntrn(LcpMouIntrnVo vo) throws KitechException {
    return delete(NAMESPACE + "deleteLcpMouIntrn", vo);
  }
  /**
   * 국제협약사후관리삭제
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int deleteLcpMouAfcIntrn(LcpMouIntrnVo vo) throws KitechException {
    return delete(NAMESPACE + "deleteLcpMouAfcIntrn", vo);
  } 
  
  /**
   * 국제협약사후관리등록
   * 
   * @author 
   * @param LcpMouAfactVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertLcpMouAfact(LcpMouAfactVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpMouAfact", vo);
  }
  /**
   * 국제협약사후관리업데이트
   * 
   * @author 
   * @param LcpMouAfactVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int updateLcpMouAfact(LcpMouAfactVo vo) throws KitechException {
    return update(NAMESPACE + "updateLcpMouAfact", vo);
  }
  /**
   * 국내협약긴관정보삭제
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int deleteLcpMouAgyIntrn(LcpMouIntrnVo vo) throws KitechException {
    return delete(NAMESPACE + "deleteLcpMouAgyIntrn", vo);
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
  public int insertLcpMouDomAgency(LcpMouDomAgencyVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpMouDomAgency", vo);
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
  public int updateLcpMouDomAgency(LcpMouDomAgencyVo vo) throws KitechException {
    return update(NAMESPACE + "updateLcpMouDomAgency", vo);
  }      
}
