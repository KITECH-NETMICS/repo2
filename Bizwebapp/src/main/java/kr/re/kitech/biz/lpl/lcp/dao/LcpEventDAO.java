package kr.re.kitech.biz.lpl.lcp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LcpEventDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.15.      author    최초생성
 * 
 * @author 
 * @since 2023.11.15.
 * @version 1.0
 * @see
 * 
 */
@Repository("lcpEventDAO")
public class LcpEventDAO extends BizDefaultAbstractDAO {

  private static final String NAMESPACE = "kr.re.kitech.biz.lpl.lcp.";

  /**
   * 국가 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectList01(LcpEventVo vo) throws KitechException {
    return (List<LcpEventVo>)list(NAMESPACE + "selectLcpEventNan", vo);
  }
  
  /**
   * 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectList02(LcpEventVo vo) throws KitechException {
    return (List<LcpEventVo>)list(NAMESPACE + "selectLcpEvent", vo);
  }

  /**
   * 상세조회
   * 
   * @author 
   * @param LcpEventVo
   * @return LcpEventVo
   * @throws KitechException
   * @since 2023.11.15.
   */
  public LcpEventVo selectLcpEventDetail(LcpEventVo vo) throws KitechException {
    return (LcpEventVo)selectByPk(NAMESPACE + "selectLcpEventDetail", vo);
  }
  
  /**
   * 비용조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectLcpEventExpen(LcpEventVo vo) throws KitechException {
    return (List<LcpEventVo>)list(NAMESPACE + "selectLcpEventExpen", vo);
  }
  
  /**
   * 기관조회조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectLcpEventAgncy(LcpEventVo vo) throws KitechException {
    return (List<LcpEventVo>)list(NAMESPACE + "selectLcpEventAgncy", vo);
  }
  
  /**
   * 행사비용조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.16.
   */
  public List<LcpEventVo> selectLcpEventPop(LcpEventVo vo) throws KitechException {
    return (List<LcpEventVo>)list(NAMESPACE + "selectLcpEventPop", vo);
  }
  
  /**
   * 해외사무소 예산등록 원장 팝업 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.16.
   */
  public List<LcpEventVo> selectLcpOverseas(LcpEventVo vo) throws KitechException {
    return (List<LcpEventVo>)list(NAMESPACE + "selectLcpOverseas", vo);
  }              

  /**
   * 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return LcpEventVo
   * @throws KitechException
   * @since 2023.11.15.
   */
  public LcpEventVo selectOne01(LcpEventVo vo) throws KitechException {
    return (LcpEventVo) selectByPk(NAMESPACE + "selectLcpEvent", vo);
  }

  /**
   * 등록
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.17.   
   */
  public int insertLcpEventAudenc(LcpEventVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.insertLcpEventAudenc", vo);
  }
  
  /**
   * 행사비용 그리드 등록
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.   
   */
  public int insertLcpEventExpAgncy(LcpEventExpnsVo	 vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.insertLcpEventExpAgncy", vo);
  }
  
  /**
   * 협력기관 그리드 등록
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.17.   
   */
  public int insertLcpEventAudencAgncy(LcpEventVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.insertLcpEventAudencAgncy", vo);
  }
  
  /**
   * 수정
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.17.   
   */
  public int updateLcpEvent(LcpEventVo vo) throws KitechException {
    return update("kr.re.kitech.biz.lpl.lcp.updateLcpEvent", vo);
  }
  
  /**
   * 행사비용 수정
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.17.   
   */
  public int updateLcpEventExpns(LcpEventExpnsVo vo) throws KitechException {
    return update("kr.re.kitech.biz.lpl.lcp.updateLcpEventExpns", vo);
  }
  
  /**
   * 협력기관 수정
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.17.   
   */
  public int updateLcpEventAgncy(LcpEventVo vo) throws KitechException {
    return update("kr.re.kitech.biz.lpl.lcp.updateLcpEventAgncy", vo);
  }    

  /**
   * 협력기관 삭제
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.20.   
   */
  public int deleteLcpAgncyEvent(LcpEventVo vo) throws KitechException {
    return delete("kr.re.kitech.biz.lpl.lcp.deleteLcpAgncyEvent", vo);
  }
  /**
   * 국제행사비용 삭제
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.20.   
   */
  public int deleteLcpExpnsEvent(LcpEventVo vo) throws KitechException {
    return delete("kr.re.kitech.biz.lpl.lcp.deleteLcpExpnsEvent", vo);
  }
  /**
   * 국제행사 삭제
   * 
   * @author 
   * @param LcpEventVo
   * @return int
   * @throws KitechException
   * @since 2023.11.20.   
   */
  public int deleteLcpEvent(LcpEventVo vo) throws KitechException {
    return delete("kr.re.kitech.biz.lpl.lcp.deleteLcpEvent", vo);
  }               
}
