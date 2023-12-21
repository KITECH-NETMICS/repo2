package kr.re.kitech.biz.fin.ena.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.ena.vo.FinGrantReqListVo;
import kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo;

public interface FinGrantReqService {
  
  /**
    * 교부금신청 목록 조회
    * @author 
    * @since 2023.10.18.
    */
  public List<FinGrantReqVo> selectList01(FinGrantReqVo vo) throws ElException;

  /**
    * 교부금신청 조회
    * @author 
    * @since 2023.10.18.
    */
  public FinGrantReqListVo selectFinGrantReq(FinGrantReqVo vo) throws ElException;

  /**
    * 국가보조금 교부신청
    * @author 
    * @since 2023.10.19.
    */
  public FinGrantReqVo saveEnaraGrantReq(FinGrantReqListVo vo) throws Exception;

  /**
    * 국가보조금 교부신청 삭제
    * @author 
    * @since 2023.10.19. 
    */
  public void deleteEnaraGrantReq(FinGrantReqListVo vo) throws Exception;
  
  /**
    * 국가보조금 교부신청 결의생성
    * @author 
    * @since 2023.10.23.
    */
  public FinGrantReqVo createSlipEnaraGrant(FinGrantReqListVo vo) throws Exception;  

  /**
    * 국가보조금 교부신청 결의취소
    * @author 
    * @since 2023.10.23. 
    */
  public FinGrantReqVo cancelSlipEnaraGrant(FinGrantReqListVo vo) throws Exception;
   
}
