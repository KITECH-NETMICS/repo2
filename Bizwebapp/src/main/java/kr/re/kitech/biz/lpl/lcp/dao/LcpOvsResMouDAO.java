package kr.re.kitech.biz.lpl.lcp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo;
import kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo;
import kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo;
import kr.re.kitech.biz.res.agr.vo.ResInpPacoVo;
import kr.re.kitech.biz.res.agr.vo.ResInpPareVo;
import kr.re.kitech.biz.res.agr.vo.ResInpTgctVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LcpOvsResMouDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.01.      author    최초생성
 * 
 * @author 
 * @since 2023.11.01.
 * @version 1.0
 * @see
 * 
 */
@Repository("lcpOvsResMouDAO")
public class LcpOvsResMouDAO extends BizDefaultAbstractDAO {
  
  /**
   * 국제공동연구과제조회 비교 조회
   * 
   * @author 
   * @param LcpOvsResMouVo
   * @return List<LcpOvsResMouVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public List<LcpOvsResMouVo> selectLcpOvsResMouEz(LcpOvsResMouVo vo) throws KitechException {
    return (List<LcpOvsResMouVo>)list("kr.re.kitech.biz.lpl.lcp.selectLcpOvsResMouEz", vo);
  }
  
  /**
   * 국제공동연구과제조회
   * 
   * @author 
   * @param LcpOvsResMouVo
   * @return List<LcpOvsResMouVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public List<LcpOvsResMouVo> selectLcpOvsResMou(LcpOvsResMouVo vo) throws KitechException {
    return (List<LcpOvsResMouVo>)list("kr.re.kitech.biz.lpl.lcp.selectLcpOvsResMou", vo);
  }
  
  /**
   * 과제정보팝업-과제현황
   * 
   * @author 
   * @param ResInpMastVo
   * @return List<ResInpMastVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public List<ResInpMastStatusVo> selectPrjStatus(ResInpMastVo vo) throws KitechException {
    return (List<ResInpMastStatusVo>)list("kr.re.kitech.biz.lpl.lcp.selectPrjStatus", vo);
  }
  
  /**
   * 과제정보팝업-기준정보
   * 
   * @author 
   * @param ResInpMastVo
   * @return List<ResInpMastVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public ResInpMastStandardVo selectPrjStandard(ResInpMastVo vo) throws KitechException {
    return (ResInpMastStandardVo) selectByPk("kr.re.kitech.biz.lpl.lcp.selectPrjStandard", vo);
  }      
  
  /**
   * 과제정보팝업-개발목표 내역
   * 
   * @author 
   * @param ResInpMastVo
   * @return ResInpTgctVo
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public ResInpTgctVo selectPrgGoal(ResInpMastVo vo) throws KitechException {
    return (ResInpTgctVo) selectByPk("kr.re.kitech.biz.lpl.lcp.selectPrgGoal", vo);
  }
  
  /**
   * 과제정보팝업-참여연구원
   * 
   * @author 
   * @param ResInpMastVo
   * @return List<ResInpPareVo>
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public List<ResInpPareVo> selectPrgResearcher(ResInpMastVo vo) throws KitechException {
    return (List<ResInpPareVo>)list("kr.re.kitech.biz.lpl.lcp.selectPrgResearcher", vo);
  }
  
  /**
   * 과제정보팝업-참여업체직원
   * 
   * @author 
   * @param ResInpMastVo
   * @return List<ResInpPacoEmpVo
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public List<ResInpPacoEmpVo> selectPrgCompaniesEmp(ResInpMastVo vo) throws KitechException {
    return (List<ResInpPacoEmpVo>)list("kr.re.kitech.biz.lpl.lcp.selectPrgCompaniesEmp", vo);
  }
  
  /**
   * 과제정보팝업-참여업체
   * 
   * @author 
   * @param ResInpMastVo
   * @return List<ResInpPacoVo>
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public List<ResInpPacoVo> selectPrgCompanies(ResInpMastVo vo) throws KitechException {
    return (List<ResInpPacoVo>)list("kr.re.kitech.biz.lpl.lcp.selectPrgCompanies", vo);
  }
  
  /**
   * 과제정보팝업-연구기자재
   * 
   * @author 
   * @param ResInpMastVo
   * @return List<ResInpMatePrjVo>
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public List<ResInpMatePrjVo> selectPrgEquipment(ResInpMastVo vo) throws KitechException {
    return (List<ResInpMatePrjVo>)list("kr.re.kitech.biz.lpl.lcp.selectPrgEquipment", vo);
  }
  
  /**
   * 과제정보팝업-개발성과
   * 
   * @author 
   * @param ResInpMastVo
   * @return List<ResInpMatePrjVo>
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public List<ResAppOtgtVo> selectPrgAchievements(ResInpMastVo vo) throws KitechException {
    return (List<ResAppOtgtVo>)list("kr.re.kitech.biz.lpl.lcp.selectPrgAchievements", vo);
  }                  

}
