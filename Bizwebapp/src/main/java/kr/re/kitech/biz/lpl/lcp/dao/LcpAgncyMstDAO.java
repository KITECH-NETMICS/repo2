package kr.re.kitech.biz.lpl.lcp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo;
import kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo;
import kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LcpAgncyMstDAO.java
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
@Repository("lcpAgncyMstDAO")
public class LcpAgncyMstDAO extends BizDefaultAbstractDAO {

  private static final String NAMESPACE = "kr.re.kitech.biz.lpl.lcp.";

  /**
   * 리스트 조회
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<LcpAgncyMstVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpAgncyMstVo> selectList01(LcpAgncyMstVo vo) throws KitechException {
    return (List<LcpAgncyMstVo>)list(NAMESPACE + "selectLcpAgncyMst", vo);
  }

  /**
   * 대외협력조회 기관헤더조회 및 목록별 건수조회
   * 
   * @author 
   * @param LcpAgncyMstFormVo
   * @return LcpAgncyMstFormVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public LcpAgncyMstFormVo selectLcpAgncyMstForm(LcpAgncyMstFormVo vo) throws KitechException {
    return (LcpAgncyMstFormVo) selectByPk(NAMESPACE + "selectLcpAgncyMstForm", vo);
  }
  
  /**
   * 대외협력기관조회 (국내협약조회)
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<LcpMouDomTabVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouDomTabVo> selectLcpMouDomTab(LcpAgncyMstVo vo) throws KitechException {
    return (List<LcpMouDomTabVo>)list(NAMESPACE + "selectLcpMouDomTab", vo);
  }
  
  /**
   * 대외협력기관조회(공동연구)
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<ResinpMastTabVo>
   * @throws KitechException
   * @since 2023.11.27.
   */
  public List<ResinpMastTabVo> selectResinpMastTab(LcpAgncyMstVo vo) throws KitechException {
    return (List<ResinpMastTabVo>)list(NAMESPACE + "selectResinpMastTab", vo);
  }
  /**
   * 대외기관협력(해외, 주재국 출장조회)
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<CtrOverTabVo>
   * @throws KitechException
   * @since 2023.11.27.
   */
  public List<CtrOverTabVo> selectCtrOverTab(LcpAgncyMstVo vo) throws KitechException {
    return (List<CtrOverTabVo>)list(NAMESPACE + "selectCtrOverTab", vo);
  }
  /**
   * 대외협력기관조회 (귀빈조회)
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<LosVipTabVo>
   * @throws KitechException
   * @since 2023.11.27.
   */
  public List<LosVipTabVo> selectLosVipTab(LcpAgncyMstVo vo) throws KitechException {
    return (List<LosVipTabVo>)list(NAMESPACE + "selectLosVipTab", vo);
  }
  /**
   * 대외협력기관조회 (행사조회)
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<LcpEventTabVo>
   * @throws KitechException
   * @since 2023.11.27.
   */
  public List<LcpEventTabVo> selectLcpEventTab(LcpAgncyMstVo vo) throws KitechException {
    return (List<LcpEventTabVo>)list(NAMESPACE + "selectLcpEventTab", vo);
  }              
  /**
   * 등록
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertOne01(LcpAgncyMstVo vo) throws KitechException {
    return insert(NAMESPACE + "insertLcpAgncyMst", vo);
  }

}
