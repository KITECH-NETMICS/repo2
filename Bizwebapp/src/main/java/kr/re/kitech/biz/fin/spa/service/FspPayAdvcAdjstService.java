package kr.re.kitech.biz.fin.spa.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstListVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo;

public interface FspPayAdvcAdjstService {
  
  /**
    * 가지급금/전도금정산(신청결의내역조회)리스트
    * @author 
    * @since 2023.09.15.
    */
  public List<FspPayAdvcAdjstVo> selectFspPayAdvcAdjstList(FspPayAdvcAdjstVo vo) throws ElException;

  /**
    * 가지급금 및 전도금신청 내역을 조회한다.
    * @author 
    * @since 2023.08.29.
    */
  public FspPayAdvcAdjstListVo selectFspPayAdvcAdjst(FspPayAdvcAdjstVo vo) throws ElException;

  /**
    * 가지급금 및 전도금정산 입력내역을 저장한다. 
    * @author 
    * @since 2023.08.29.
    */
  public FspPayAdvcAdjstVo insertFspPayAdvcAdjst(FspPayAdvcAdjstListVo vo) throws Exception;
  
  /**
    * 가지급금 및 전도금정산 입력내역을 삭제한다. 
    * @author 
    * @since 2023.08.29.
    */
  public FspPayAdvcAdjstVo deleteFspPayAdvcAdjst(FspPayAdvcAdjstListVo vo) throws Exception;  

}
