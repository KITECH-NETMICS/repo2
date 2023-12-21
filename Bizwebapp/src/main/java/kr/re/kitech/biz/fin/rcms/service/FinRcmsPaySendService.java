package kr.re.kitech.biz.fin.rcms.service;

import java.util.List;
import java.util.Map;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendListVo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo;
import kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo;


public interface FinRcmsPaySendService {

  public List<FinRcmsPaySendVo> selectListItem(FinRcmsPaySendVo rcmsVo) throws ElException;
  
  public List<FinRcmsPaySendVo> selectErrorListItem(FinRcmsPaySendVo rcmsVo) throws ElException;

  public List<FinRcmsPaySend04Vo> selectReturnList(FinRcmsPaySend04Vo rcmsVo) throws ElException;

  public List<ResBgacCtmVo> selectAccountPopup(ResBgacCtmVo rcmsVo) throws ElException;
  
  public Map<String, Object> rcmsSend(FinRcmsPaySendListVo rcmsVo) throws Exception;
  
  public int cancelFinRcmsPaySend(FinRcmsPaySendListVo rcmsVo) throws Exception;

  public int updateUnsentForced(FinRcmsPaySendVo rcmsVo) throws Exception;

  /*public boolean sendToRCMS(SendRcmsVo rcmsVo) throws Exception;

  public boolean sendCancelRCMS(SendRcmsVo rcmsVo) throws Exception;*/
  
}
