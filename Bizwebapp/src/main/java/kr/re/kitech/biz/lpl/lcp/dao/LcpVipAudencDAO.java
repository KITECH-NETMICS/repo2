package kr.re.kitech.biz.lpl.lcp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LcpVipAudencDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.08.      author    최초생성
 * 
 * @author 
 * @since 2023.11.08.
 * @version 1.0
 * @see
 * 
 */
@Repository("lcpVipAudencDAO")
public class LcpVipAudencDAO extends BizDefaultAbstractDAO {
  
  /**
   * 국외귀빈 목록 조회
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public List<LcpVipAudencVo> selectVipAudencList(LcpVipAudencVo vo) throws KitechException {
    return (List<LcpVipAudencVo>)list("kr.re.kitech.biz.lpl.lcp.selectVipAudencList", vo);
  }

  /**
   * 국외귀빈접견 상세조회
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return LcpVipAudencVo
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public LcpVipAudencVo selectVipAudencDetail(LcpVipAudencVo vo) throws KitechException {
    return (LcpVipAudencVo) selectByPk("kr.re.kitech.biz.lpl.lcp.selectVipAudencDetail", vo);
  }
  
  /**
   * 국외귀빈접견 상세조회(그리드)
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public List<LcpVipAudencVo> selectLcpVipAudencAgncy(LcpVipAudencVo vo) throws KitechException {
    return (List<LcpVipAudencVo>)list("kr.re.kitech.biz.lpl.lcp.selectLcpVipAudencAgncy", vo);
  }
  
  /**
   * 기관찾기팝업(기관목록조회)
   * 
   * @author 
   * @param 
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.09.   
   */
  public List<LcpVipAudencVo> selectVipAudencPopAgency(LcpVipAudencVo vo) throws KitechException {
    return (List<LcpVipAudencVo>)list("kr.re.kitech.biz.lpl.lcp.selectVipAudencPopAgency", vo);
  }
  
  /**
   * 기관찾기팝업(조회결과)
   * 
   * @author 
   * @param 
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.09.   
   */
  public List<LcpVipAudencVo> selectVipAudencPopSearch(LcpVipAudencVo vo) throws KitechException {
    return (List<LcpVipAudencVo>)list("kr.re.kitech.biz.lpl.lcp.selectVipAudencPopSearch", vo);
  }  
  
  /**
   * 기관찾기팝업(국가트리조회)
   * 
   * @author 
   * @param 
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public List<LcpVipAudencVo> selectVipAudencPopTree(LcpVipAudencVo vo) throws KitechException {
    return (List<LcpVipAudencVo>)list("kr.re.kitech.biz.lpl.lcp.selectVipAudencPopTree", "");
  }      

  /**
   * 그리드 등록
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.   
   */
  public int insertLcpVipAudencAgncy(LcpVipAudencVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.insertLcpVipAudencAgncy", vo);
  }
  
  /**
   * 등록
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.   
   */
  public int insertLcpVipAudenc(LcpVipAudencVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.insertLcpVipAudenc", vo);
  }  
  
  /**
   * 수정
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.   
   */
  public int updateLcpVipAudenc(LcpVipAudencVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.updateLcpVipAudenc", vo);
  }
  
  /**
   * 그리드 수정
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.   
   */
  public int updateLcpVipAudencAgncy(LcpVipAudencVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.lpl.lcp.updateLcpVipAudencAgncy", vo);
  }
  
  /**
   * 그리드 삭제
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.11.   
   */
  public int deleteLcpVipAudencAgncy(LcpVipAudencVo vo) throws KitechException {
    return delete("kr.re.kitech.biz.lpl.lcp.deleteLcpVipAudencAgncy", vo);
  }
  
  /**
   * 삭제
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.13.   
   */
  public int deleteLcpVipAudenc(LcpVipAudencVo vo) throws KitechException {
    return delete("kr.re.kitech.biz.lpl.lcp.deleteLcpVipAudenc", vo);
  }           
}
