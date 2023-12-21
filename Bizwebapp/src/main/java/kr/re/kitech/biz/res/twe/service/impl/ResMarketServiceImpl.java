package kr.re.kitech.biz.res.twe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.res.twe.dao.ResMarketDAO;
import kr.re.kitech.biz.res.twe.service.ResMarketService;
import kr.re.kitech.biz.res.twe.vo.ResDownHistVo;
import kr.re.kitech.biz.res.twe.vo.ResMarketVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : ResMarketServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.20.      author    최초생성
 * 
 * @author 
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */

@Service("ResMarketServiceImpl")
public class ResMarketServiceImpl  extends EgovAbstractServiceImpl implements ResMarketService {
  @Resource(name="ResMarketDAO")
  private ResMarketDAO pbdMarketDAO;
  
  @Resource(name = "generationServiceImpl")
  private GenerationService generationService;
  
  @Resource(name = "apprCommonServiceImpl")
  private ApprCommonService apprCommonService;
	
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService;

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;
    
  @Override
  public List<ResMarketVo> selectMarketList(ResMarketVo vo) throws KitechException {
    List<ResMarketVo> list = pbdMarketDAO.selectList(vo);
    return list;
  }
  
  @Override
  public List<ResDownHistVo> selectDownHistList(ResDownHistVo vo) throws KitechException {
    List<ResDownHistVo> list = pbdMarketDAO.selectDownHistList(vo);
    return list;
  }
  
  @Override
  public ResMarketVo selectMarketSingleItem(ResMarketVo FndVo) throws ElException {
	  ResMarketVo resultVO = pbdMarketDAO.selectSingleItem(FndVo);			
	  return resultVO;
  }
  
  @Override
  public String saveMarketItem(ResMarketVo vo) throws ElException {
	  String rowStatus = vo.getRowStatus();
	  if (StringUtils.equals(rowStatus, "C")) {
		  pbdMarketDAO.insertItem(vo);
	  } else if (StringUtils.equals(rowStatus, "U")) {
		  pbdMarketDAO.updateItem(vo);
	  }
	  return vo.getReg_no() == null ? "" : vo.getReg_no();
  }
  
  @Override
  public String saveDownHistItem(ResDownHistVo vo) throws ElException {
	  String rowStatus = vo.getRowStatus();
	  if (StringUtils.equals(rowStatus, "C")) {
		  pbdMarketDAO.insertDownHistItem(vo);
	  } else if (StringUtils.equals(rowStatus, "U")) {
		  pbdMarketDAO.updateDownHistItem(vo);
	  }
	  return vo.getReg_no() == null ? "" : vo.getReg_no();
  }
  
  @Override
  public int updateMarketItem(ResMarketVo vo) throws ElException {
	  int result = pbdMarketDAO.updateItem(vo);
	  return result;
  }
  
  @Override
  public int deleteMarketItem(ResMarketVo fndVo) throws ElException {
	  if (fndVo == null || StringUtils.equals(fndVo.getReg_no(), "")) {
		  throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.apr.com.0004");
	  }
	  return pbdMarketDAO.deleteItem(fndVo);
  }
}
