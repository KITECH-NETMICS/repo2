package kr.re.kitech.biz.fin.fnd.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardVo;

public interface FndCardService {
  // List Select Param
  public List<FndCardVo> selectList(FndCardVo vo) throws ElException;
  // Single Select
  public FndCardVo selectSingleItem(FndCardVo FndVo) throws ElException;
  
  public List<FndCardUseSelectVo> selectCardUseList(FndCardUseSelectVo FndVo) throws ElException;
  // Insert
  public String saveItem(FndCardVo FndVo) throws ElException;
  // Update
  public int updateItem(FndCardVo FndVo) throws ElException;
  // Delete
  public int deleteItem(FndCardVo FndVo) throws ElException;
  // Mail
  public void fndMailSend(FndCardVo FndVo) throws ElException;
  public int updateMailYn(FndCardVo vo) throws ElException;

}
