package kr.re.kitech.biz.lpl.lcp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.lpl.lcp.dao.LcpOvsResMouDAO;
import kr.re.kitech.biz.lpl.lcp.service.LcpOvsResMouService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastListVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpOvsResMouServiceImpl.java
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
@Service("lcpOvsResMouServiceImpl")
public class LcpOvsResMouServiceImpl  extends EgovAbstractServiceImpl implements LcpOvsResMouService {
  @Resource(name="lcpOvsResMouDAO")
  private LcpOvsResMouDAO lcpDAO;
    
  /**
   * 다건 조회
   * 
   * @author 
   * @param LcpOvsResMouVo
   * @return List<LcpOvsResMouVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  @Override
  public List<LcpOvsResMouVo> selectList01(LcpOvsResMouVo vo) throws KitechException {
	String ez_srch = vo.getEz_srch();
	if (ez_srch.equals("1")) {
		List<LcpOvsResMouVo> list = lcpDAO.selectLcpOvsResMouEz(vo);		
		return list;
	} else {
		List<LcpOvsResMouVo> list = lcpDAO.selectLcpOvsResMou(vo);
		return list;
	}
  }
  
  /**
   * 과제정보 팝업
   * 
   * @author 
   * @param ResInpMastVo
   * @return ResInpMastListVo
   * @throws KitechException
   * @since 2023.11.01.   
   */
  @Override
  public ResInpMastListVo selectPrjList(ResInpMastVo vo) throws KitechException {
	  ResInpMastListVo prjVoList = new ResInpMastListVo();
	  prjVoList.setResInpMastStandardVo(lcpDAO.selectPrjStandard(vo));
	  prjVoList.setResInpMastStatusVoList(lcpDAO.selectPrjStatus(vo));
	  
	  return prjVoList;
  }
  
  /**
   * 과제정보 팝업 탭 조회
   * 
   * @author 
   * @param ResInpMastVo
   * @return ResInpMastListVo
   * @throws KitechException
   * @since 2023.11.02.   
   */
  @Override
  public ResInpMastListVo selectTabList(ResInpMastVo vo) throws KitechException {
	  ResInpMastListVo prjVoList = new ResInpMastListVo();
	  switch (vo.getTab_id()) {
	  	case "tab01": // 개발목표
	  		prjVoList.setResInpTgctVo(lcpDAO.selectPrgGoal(vo));
			return prjVoList;
		case "tab02": // 참여연구원
			prjVoList.setResInpPareVoList(lcpDAO.selectPrgResearcher(vo));
			return prjVoList;
		case "tab03": // 참여업체
			prjVoList.setResInpPacoVoList(lcpDAO.selectPrgCompanies(vo));
			prjVoList.setResInpPacoEmpVoList(lcpDAO.selectPrgCompaniesEmp(vo));
			return prjVoList;
		case "tab04": // 연구기자재
			prjVoList.setResInpMatePrjVoList(lcpDAO.selectPrgEquipment(vo));
			return prjVoList;
		case "tab05": // 개발성과
			prjVoList.setResAppOtgtVoList(lcpDAO.selectPrgAchievements(vo));
			return prjVoList;
		default:
			return null;
	}
  }     
}
