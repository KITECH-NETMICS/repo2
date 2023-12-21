package kr.re.kitech.biz.fin.fnd.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo;

public interface FinCardUseAmtUpReqService {
  

  /**
    * 법인카드 한도증액 신청 목록
    * @author 
    * @since 2023.08.08.
    */
  public List<FinCardUseAmtUpReqVo> selectList(FinCardUseAmtUpReqVo vo) throws ElException;

  /**
    * 법인카드 한도증액 신청에 상세정보
    * @author 
    * @since 2023.08.08.
    */
  public FinCardUseAmtUpReqVo selectSingle(FinCardUseAmtUpReqVo vo) throws ElException;

  /**
    * 셀렉트박스용 법인카드 목록
    * @author 
    * @since 2023.08.16.
    */
  public List<FndCardSelectVo> selectCardList(FndCardSelectVo vo) throws ElException;

  /**
    * 법인카드 한도증액 신청 저장, 수정, 삭제
    * @author 
    * @since 2023.08.16.
    */
  public FinCardUseAmtUpReqVo insertItem(FinCardUseAmtUpReqVo vo) throws Exception;
 
  /**
    * 법인카드 한도증액 결제 신청
    * @author 
    * @since 2023.08.17.
    */
  public FinCardUseAmtUpReqVo paymentRequest(FinCardUseAmtUpReqVo vo) throws Exception;
  
  /**
    * 법인카드 한도증액 승인 및 반려
    * @author 
    * @since 2023.08.17.
    */
  public FinCardUseAmtUpReqVo apyConfORrejt(FinCardUseAmtUpReqVo vo) throws Exception;    


}
