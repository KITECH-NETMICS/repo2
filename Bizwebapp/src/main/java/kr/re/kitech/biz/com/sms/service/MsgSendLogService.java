package kr.re.kitech.biz.com.sms.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.com.sms.vo.MsgSendLogVo;

public interface MsgSendLogService {
  // List Select All
  public List<MsgSendLogVo> selectList() throws ElException;
  // List Select Param
  public List<MsgSendLogVo> selectListItem(MsgSendLogVo SmsVo) throws ElException;
  // Single Select
  public MsgSendLogVo selectSingleItem(MsgSendLogVo SmsVo) throws ElException;
  // Insert
  public int insertItem(MsgSendLogVo SmsVo) throws Exception;
  // Update
  public int updateItem(MsgSendLogVo SmsVo) throws Exception;
  // Delete
  public int deleteItem(MsgSendLogVo SmsVo) throws Exception;
  // Mail
  public void smsMailSend(MsgSendLogVo SmsVo) throws ElException;
}
