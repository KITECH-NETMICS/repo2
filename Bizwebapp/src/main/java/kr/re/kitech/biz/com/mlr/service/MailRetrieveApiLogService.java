package kr.re.kitech.biz.com.mlr.service;

import java.io.IOException;
import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo;

public interface MailRetrieveApiLogService {
  // 메일 조회
  public List<MailRetrieveApiLogVo> selectListItem(MailRetrieveApiLogVo MailVo) throws ElException;

  // 메일 회수
  public Boolean retrieveMail(MailRetrieveApiLogVo MailVo) throws ElException;

  // 메일로그 저장
  int insertItem(MailRetrieveApiLogVo vo) throws ElException, IOException;
}
