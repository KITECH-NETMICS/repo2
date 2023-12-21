package kr.re.kitech.biz.ccs.ctr.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo;

public interface CtrBiztripFareService {
  // List Select All
  //public List<CtrBiztripFareVo> selectList() throws ElException;
  // List Select Param
  public List<CtrBiztripFareVo> selectListCtrBiztripFare(CtrBiztripFareVo ctrBiztripFareVo) throws ElException;
  
  // Insert
  public int insertItem01(CtrBiztripFareVo vo) throws Exception;
  
  
  
  // Insert
  public int insertItem(CtrBiztripFareVo CtrVo) throws Exception;
  // Update
  public int updateItem(CtrBiztripFareVo CtrVo) throws Exception;
  // Delete
  public int deleteItem(CtrBiztripFareVo CtrVo) throws Exception;
  // Mail
  public void ctrMailSend(CtrBiztripFareVo CtrVo) throws ElException;
  
}
