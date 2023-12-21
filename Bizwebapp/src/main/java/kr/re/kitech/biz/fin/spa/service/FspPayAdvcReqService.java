package kr.re.kitech.biz.fin.spa.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqBankVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqListVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface FspPayAdvcReqService {
  

  /**
   * 가지급금신청서 목록 조회
   * 
   * @author 
   * @param FspPayAdvcReqVo
   * @return List<FspPayAdvcReqVo>
   * @throws KitechException
   * @since 2023.10.06.   
   */
  public List<FspPayAdvcReqVo> selectList01(FspPayAdvcReqVo vo) throws KitechException;


  /**
    * 가지급금신청서 조회
    * @author 
    * @since 2023.10.06.
    */
  public FspPayAdvcReqListVo selectFspPayAdvcReq(FspPayAdvcReqVo vo) throws ElException;
  
  /**
    * 신청구분선택시회계코드,계정번호,계정책임자가져오기
    * @author 
    * @since 2023.10.12.
    */
  public FspPayAdvcReqVo selectFspPayAdvcReqClsf(FspPayAdvcReqVo vo) throws ElException;
  
  /**
    * 지급구분이 개인일 경우 별도계좌정보가져오기
    * @author 
    * @since 2023.10.10.
    */
  public FspPayAdvcReqBankVo selectFspPayAdvcReqBank(FspPayAdvcReqVo vo) throws ElException;
     
  /**
    * 가지급금/전도금신청등록(Insert)
    * @author 
    * @since 2023.10.10.
    */
  public FspPayAdvcReqVo insertFspPayAdvcReq(FspPayAdvcReqListVo vo) throws Exception;

  /**
    * 가지급금/전도금신청(삭제)
    * @author 
    * @since 2023.10.16.
    */
  public FspPayAdvcReqVo deleteFspPayAdvcReq(FspPayAdvcReqListVo vo) throws Exception; 
  
}
