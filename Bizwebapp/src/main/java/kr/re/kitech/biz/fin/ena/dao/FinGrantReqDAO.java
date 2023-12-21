package kr.re.kitech.biz.fin.ena.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.ena.vo.FinGrantReqUpdateVo;
import kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo;
import kr.re.kitech.biz.fin.ena.vo.FinGrantResBgacCtmVo;
import kr.re.kitech.biz.fin.ena.vo.FinRcmsPaySlipVo;
import kr.re.kitech.biz.fin.ena.vo.FspEnaSliphVo;
import kr.re.kitech.biz.fin.ena.vo.UpdatedeleteFileVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("finGrantReqDAO")
  public class FinGrantReqDAO extends BizDefaultAbstractDAO {
  

  /**
    * 교부금 목록 조회
    * @author 
    * @since 2023.10.18.
    */
  public List<FinGrantReqVo> selectList01(FinGrantReqVo vo) throws ElException {
    return (List<FinGrantReqVo>)list("kr.re.kitech.biz.fin.ena.selectFinGrantReqList", vo);
  }

  /**
    * 교부금신청 조회
    * @author 
    * @since 2023.10.18.
    */
  public FinGrantReqVo selectFinGrantReq(FinGrantReqVo vo) throws ElException {
    return (FinGrantReqVo) selectByPk("kr.re.kitech.biz.fin.ena.selectFinGrantReq", vo);
  }
  
  /**
    * 교부금신청 저장중 문서함 조회
    * @author 
    * @since 2023.10.18.
    */
  public FinGrantReqVo selectFinGrantReqApr(FinGrantReqVo vo) throws ElException {
    return (FinGrantReqVo) selectByPk("kr.re.kitech.biz.fin.ena.selectFinGrantReqApr", vo);
  }  

  /**
    * 국가보조금 교부신청
    * @author 
    * @since 2023.10.19.
    */
  public int saveEnaraGrantReq(FinGrantReqVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.ena.updateFinGrantReq", vo);
  }


  /**
    * 국가보조금 삭제
    * @author 
    * @since 2023.10.19.
    */
  public int updatedeleteFile(UpdatedeleteFileVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.ena.updatedeleteFile", vo);
  }
  
  /**
    * 계정책임자 확인
    * @author 
    * @since 2023.08.24.
    */
  public FinGrantResBgacCtmVo selectResBgAccTm(FinGrantResBgacCtmVo vo) throws ElException {
    return (FinGrantResBgacCtmVo) selectByPk("kr.re.kitech.biz.fin.ena.selectResBgAccTm", vo);
  }  


  /**
    * 부서신설일 조회
    * @author 
    * @since 2023.08.24.
    */
  public FinRcmsPaySlipVo selectFinRcmsPaySlip(FinRcmsPaySlipVo vo) throws ElException {
    return (FinRcmsPaySlipVo) selectByPk("kr.re.kitech.biz.fin.ena.selectFinRcmsPaySlip", vo);
  }
  
  
  /**
    * 가지급금/전도금신청결의생성(결의번호생성쿼리)
    * @author 
    * @since 2023.10.23.
    */
  public FspEnaSliphVo selectFspEnaSliph(FspEnaSliphVo vo) throws ElException {
    return (FspEnaSliphVo) selectByPk("kr.re.kitech.biz.fin.ena.selectFspEnaSliph", vo);
  }   
  
  /**
    * 교부금신청 업데이트(신청번호, 신청자, 결의번호)
    * @author 
    * @since 2023.10.23.
    */
  public int updateFinGrantReqNum(FinGrantReqUpdateVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.ena.updateFinGrantReqNum", vo);
  }  
  
}
