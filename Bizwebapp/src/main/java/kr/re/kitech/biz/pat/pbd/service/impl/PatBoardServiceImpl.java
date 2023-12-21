package kr.re.kitech.biz.pat.pbd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.pbd.dao.PatFaqDAO;
import kr.re.kitech.biz.pat.pbd.dao.PatFrmDAO;
import kr.re.kitech.biz.pat.pbd.dao.PatNoticeDAO;
import kr.re.kitech.biz.pat.pbd.dao.PatQnaDAO;
import kr.re.kitech.biz.pat.pbd.service.PatBoardService;
import kr.re.kitech.biz.pat.pbd.vo.PatFaqVo;
import kr.re.kitech.biz.pat.pbd.vo.PatFrmVo;
import kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo;
import kr.re.kitech.biz.pat.pbd.vo.PatQnaVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : PatNoticeServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.11.      작업자    최초생성
 * 
 * @author 김주열
 * @since 2023.09.11.
 * @version 1.0
 * @see
 * 
 */
@Service("PatBoardServiceImpl")
public class PatBoardServiceImpl  extends EgovAbstractServiceImpl implements PatBoardService {
  @Resource(name="PatNoticeDAO")
  private PatNoticeDAO pbdNoticeDAO;
  
  @Resource(name="PatFaqDAO")
  private PatFaqDAO pbdFaqDAO;
  
  @Resource(name="PatFrmDAO")
  private PatFrmDAO pbdFrmDAO;
  
  @Resource(name="PatQnaDAO")
  private PatQnaDAO pbdQnaDAO;
  
  @Resource(name = "generationServiceImpl")
  private GenerationService generationService;
  
  @Resource(name = "apprCommonServiceImpl")
  private ApprCommonService apprCommonService;
	
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService;
  
  @Resource(name="generationServiceImpl")
  private GenerationService genService;  

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;
    
  @Override
  public List<PatNoticeVo> selectNoticeList(PatNoticeVo vo) throws KitechException {
    List<PatNoticeVo> list = pbdNoticeDAO.selectList(vo);
    return list;
  }
  
  @Override
  public List<PatFaqVo> selectFaqList(PatFaqVo vo) throws KitechException {
    List<PatFaqVo> list = pbdFaqDAO.selectList(vo);
    return list;
  }
  
  @Override
  public List<PatFrmVo> selectFrmList(PatFrmVo vo) throws KitechException {
    List<PatFrmVo> list = pbdFrmDAO.selectList(vo);
    return list;
  }
  
  @Override
  public List<PatQnaVo> selectQnaList(PatQnaVo vo) throws KitechException {
    List<PatQnaVo> list = pbdQnaDAO.selectList(vo);
    return list;
  }
  
  @Override
  public PatNoticeVo selectNoticeSingleItem(PatNoticeVo FndVo) throws ElException {
	  PatNoticeVo resultVO = pbdNoticeDAO.selectSingleItem(FndVo);			
	  return resultVO;
  }
  
  @Override
  public PatFaqVo selectFaqSingleItem(PatFaqVo FndVo) throws ElException {
	  PatFaqVo resultVO = pbdFaqDAO.selectSingleItem(FndVo);			
	  return resultVO;
  }
  
  @Override
  public PatFrmVo selectFrmSingleItem(PatFrmVo FndVo) throws ElException {
	  PatFrmVo resultVO = pbdFrmDAO.selectSingleItem(FndVo);			
	  return resultVO;
  }
  
  @Override
  public PatQnaVo selectQnaSingleItem(PatQnaVo FndVo) throws ElException {
	  PatQnaVo resultVO = pbdQnaDAO.selectSingleItem(FndVo);			
	  return resultVO;
  }
  
  @Override
  public PatQnaVo selectreqUserInfo(PatQnaVo FndVo) throws ElException {
	  PatQnaVo resultVO = pbdQnaDAO.selectreqUserInfo(FndVo);			
	  return resultVO;
  }  
	
  @Override
  public String saveNoticeItem(PatNoticeVo vo) throws ElException {
	  String rowStatus = vo.getRowStatus();
	  if (StringUtils.equals(rowStatus, "C")) {
		  pbdNoticeDAO.insertItem(vo);
	  } else if (StringUtils.equals(rowStatus, "U")) {
		  pbdNoticeDAO.updateItem(vo);
	  }
	  return vo.getNotice_id() == null ? "" : vo.getNotice_id();
  }
  
  @Override
  public String saveFaqItem(PatFaqVo vo) throws ElException {
	  String rowStatus = vo.getRowStatus();
	  if (StringUtils.equals(rowStatus, "C")) {
		  pbdFaqDAO.insertItem(vo);
	  } else if (StringUtils.equals(rowStatus, "U")) {
		  pbdFaqDAO.updateItem(vo);
	  }
	  return vo.getFaq_id() == null ? "" : vo.getFaq_id();
  }
  
  @Override
  public String saveFrmItem(PatFrmVo vo) throws ElException {
	  String rowStatus = vo.getRowStatus();
	  if (StringUtils.equals(rowStatus, "C")) {
		  pbdFrmDAO.insertItem(vo);
	  } else if (StringUtils.equals(rowStatus, "U")) {
		  pbdFrmDAO.updateItem(vo);
	  }
	  return vo.getFrm_id() == null ? "" : vo.getFrm_id();
  }
  
  @Override
  public String saveQnaItem(PatQnaVo vo) throws ElException {
	  String rowStatus = vo.getRowStatus();
	  if (StringUtils.equals(rowStatus, "C")) {
		  pbdQnaDAO.insertItem(vo);
	  } else if (StringUtils.equals(rowStatus, "U")) {
		  pbdQnaDAO.updateItem(vo);
	  }
	  return vo.getQna_id() == null ? "" : vo.getQna_id();
  }
  
  //TO-DO
  @Override
  public String saveSystemReq(PatQnaVo vo) throws ElException {
	  AppLog.info("Vo----->"+vo);
	  String CUMode = vo.getCUMode();
	  String demnd_item_mngmt_no = "";
	  if ("insert".equals(CUMode)) {
		  // 일련번호 채번 : 요구 사항 관리(지정실)
		  demnd_item_mngmt_no = genService.getGenNumber(Numberings.DOCUMENT.getName(), "XC2");
		  vo.setDemnd_item_mngmt_no(demnd_item_mngmt_no);
		  pbdQnaDAO.insertPatQna(vo);
		  pbdQnaDAO.insertPatQnaDetail(vo);
		  pbdQnaDAO.updatePatPbdQnaDtl(vo);
		  	  
	  } else {
		  demnd_item_mngmt_no = vo.getDemnd_item_mngmt_no();
	  }

	  return vo.getQna_id() == null ? "" : vo.getQna_id();
  }  

  @Override
  public int updateNoticeItem(PatNoticeVo vo) throws ElException {
	  int result = pbdNoticeDAO.updateItem(vo);
	  return result;
  }
  
  @Override
  public int updateFaqItem(PatFaqVo vo) throws ElException {
	  int result = pbdFaqDAO.updateItem(vo);
	  return result;
  }
  
  @Override
  public int updateFrmItem(PatFrmVo vo) throws ElException {
	  int result = pbdFrmDAO.updateItem(vo);
	  return result;
  }
  
  @Override
  public int updateQnaItem(PatQnaVo vo) throws ElException {
	  int result = pbdQnaDAO.updateItem(vo);
	  return result;
  }

  @Override
  public int deleteNoticeItem(PatNoticeVo fndVo) throws ElException {
	  if (fndVo == null || StringUtils.equals(fndVo.getNotice_id(), "")) {
		  throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.apr.com.0004");
	  }
	  return pbdNoticeDAO.deleteItem(fndVo);
  }
  
  @Override
  public int deleteFaqItem(PatFaqVo fndVo) throws ElException {
	  if (fndVo == null || StringUtils.equals(fndVo.getFaq_id(), "")) {
		  throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.apr.com.0004");
	  }
	  return pbdFaqDAO.deleteItem(fndVo);
  }
  
  @Override
  public int deleteFrmItem(PatFrmVo fndVo) throws ElException {
	  if (fndVo == null || StringUtils.equals(fndVo.getFrm_id(), "")) {
		  throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.apr.com.0004");
	  }
	  return pbdFrmDAO.deleteItem(fndVo);
  }
  
  @Override
  public int deleteQnaItem(PatQnaVo fndVo) throws ElException {
	  if (fndVo == null || StringUtils.equals(fndVo.getQna_id(), "")) {
		  throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.apr.com.0004");
	  }
	  return pbdQnaDAO.deleteItem(fndVo);
  }
}
