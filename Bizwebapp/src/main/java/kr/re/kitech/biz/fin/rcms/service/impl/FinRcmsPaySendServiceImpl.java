package kr.re.kitech.biz.fin.rcms.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.rcms.dao.FinRcmsPaySendDAO;
import kr.re.kitech.biz.fin.rcms.service.FinRcmsPaySendService;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendListVo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo;
import kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo;

@Service("FinRcmsPaySendServiceImpl")
public class FinRcmsPaySendServiceImpl extends EgovAbstractServiceImpl implements FinRcmsPaySendService {
  Logger log = LoggerFactory.getLogger(FinRcmsPaySendServiceImpl.class);

  @Resource(name = "FinRcmsPaySendDAO")
  private FinRcmsPaySendDAO rcmsDAO;
  
  @Resource(name = "FinRcmsPaySendBizImpl")
  private FinRcmsPaySendBizImpl finRcmsPaySendBizImpl;

  @Override
  public List<FinRcmsPaySendVo> selectListItem(FinRcmsPaySendVo vo) throws ElException {
    List<FinRcmsPaySendVo> list = rcmsDAO.selectListItem(vo);
    return list;
  }
  
  @Override
  public List<FinRcmsPaySendVo> selectErrorListItem(FinRcmsPaySendVo vo) throws ElException {
    List<FinRcmsPaySendVo> list = rcmsDAO.selectErrorListItem(vo);
    return list;
  }
  
  @Override
  public List<FinRcmsPaySend04Vo> selectReturnList(FinRcmsPaySend04Vo vo) throws ElException {
    List<FinRcmsPaySend04Vo> list = rcmsDAO.selectReturnList(vo);
    return list;
  }
  
  public List<ResBgacCtmVo> selectAccountPopup(ResBgacCtmVo vo) throws ElException {
    List<ResBgacCtmVo> list = rcmsDAO.selectAccountPopup(vo);
    return list;
  }

  public int updateUnsentForced(FinRcmsPaySendVo vo) throws ElException, IOException {
    int result = rcmsDAO.updateUnsentForced(vo);
    return result;
  }
  
  public int cancelFinRcmsPaySend(FinRcmsPaySendListVo vo) throws Exception {
	  FinRcmsPaySendVo infoVo = vo.getFinRcmsPaySendVo();
	  List<FinRcmsPaySendVo> listVo = vo.getFinRcmsPaySendVoList();
	  
	  log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
	  log.debug("선집행 전송취소 cancelFinRcmsPaySend");
	  log.debug("infoVo : [{}]", infoVo);
	  log.debug("listVo : [{}]", listVo);
	  
	  int result = finRcmsPaySendBizImpl.cancelFinRcmsPaySend(infoVo, listVo);
	  return result;
  }
  
  public Map<String, Object> rcmsSend(FinRcmsPaySendListVo vo) throws Exception {
	  Map<String, Object> result = new HashMap<String, Object>();
	  
	  FinRcmsPaySendVo infoVo = vo.getFinRcmsPaySendVo();
	  List<FinRcmsPaySendVo> listVo = vo.getFinRcmsPaySendVoList();
	  
	  String rcmsPayClsf = infoVo.getRcms_pay_clsf();
	  
	  log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
	  log.debug("선집행 전송 서비스 rcmsSend");
	  log.debug("infoVo : [{}]", infoVo);
	  log.debug("listVo : [{}]", listVo);
	  log.debug("rcmsPayClsf : [{}]", rcmsPayClsf);
	  
	  if("FDC020".equals(rcmsPayClsf)){ // 선집행
	  
		  result = finRcmsPaySendBizImpl.saveFinRcmsPaySend020(infoVo, listVo);
		  
	  }else if("FDC010".equals(rcmsPayClsf)){ // 직지급
	  
		  result = finRcmsPaySendBizImpl.saveFinRcmsPaySend010(infoVo, listVo);
		  
	  }else if("FDC030".equals(rcmsPayClsf)){ // 카드 선집행
	  
		  result = finRcmsPaySendBizImpl.saveFinRcmsPaySend030(infoVo, listVo);
		  
	  }
	  
    return result;
  }
}
