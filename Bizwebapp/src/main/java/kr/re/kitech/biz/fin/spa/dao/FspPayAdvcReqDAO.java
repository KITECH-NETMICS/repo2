package kr.re.kitech.biz.fin.spa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqBankVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

  @Repository("fspPayAdvcReqDAO")
  public class FspPayAdvcReqDAO extends BizDefaultAbstractDAO {
   
  /**
   * 
   * 
   * @author 
   * @param 가지급금신청서  목록 조회
   * @return List<FspPayAdvcReqVo>
   * @throws KitechException
   * @since 2023.10.06.   
   */
  public List<FspPayAdvcReqVo> selectFspPayAdvcReqList(FspPayAdvcReqVo vo) throws KitechException {
    return (List<FspPayAdvcReqVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReqList", vo);
  }  

  /**
    * 가지급금신청서  그리드 조회
    * @author 
    * @since 2023.10.06.
    */
  public List<FspPayAdvcReqVo> selectFspPayAdvcReqGrid(FspPayAdvcReqVo vo) throws ElException {
    return (List<FspPayAdvcReqVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReqGrid", vo);
  }
  
  /**
    * 가지급금신청서 결의 데이터 조회
    * @author 
    * @since 2023.08.24.
    */
  public List<FspPayAdvcReqVo> selectFspPayAdvcReqSlip(FspPayAdvcReqVo vo) throws ElException {
    return (List<FspPayAdvcReqVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReqSlip", vo);
  }  

  /**
    * 가지급금/전도금신청결의생성(가지급전도금신청가결의번호UPDATE)
    * @author 
    * @since 2023.10.16.
    */
  public int updateFspPayAdvcSlipReq(FspPayAdvcReqVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcSlipReq", vo);
  }

  /**
    * 가지급금신청서  폼 조회
    * @author 
    * @since 2023.10.06.
    */
  public FspPayAdvcReqVo selectFspPayAdvcReq(FspPayAdvcReqVo vo) throws ElException {
    return (FspPayAdvcReqVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReq", vo);
  }
  
  /**
    * 신청구분선택시회계코드,계정번호,계정책임자가져오기
    * @author 
    * @since 2023.10.10.
    */
  public FspPayAdvcReqVo selectFspPayAdvcReqClsf(FspPayAdvcReqVo vo) throws ElException {
    return (FspPayAdvcReqVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReqClsf", vo); 
  }
  
    /**
    * 지급구분이 개인일 경우 별도계좌정보가져오기
    * @author 
    * @since 2023.10.10.
    */
  public FspPayAdvcReqBankVo selectFspPayAdvcReqBank(FspPayAdvcReqVo vo) throws ElException {
    return (FspPayAdvcReqBankVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReqBank", vo); 
  }  


  /**
    * 가지급금신청팝업화면(fsppayadvcreq등록)
    * @author 
    * @since 2023.10.10.
    */
  public int insertFspPayAdvcReq(FspPayAdvcReqVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspPayAdvcReq", vo);
  }

  /**
    * 가지급금신청팝업화면(fsppayadvcreq수정)
    * @author 
    * @since 2023.10.10.
    */
  public int updateFspPayAdvcReq(FspPayAdvcReqVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcReq", vo);
  }
  
  /**
    * 가지급금신청계정 등록
    * @author 
    * @since 2023.10.10.
    */
  public int insertFspPayAdvcReqAccnt(FspPayAdvcReqVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspPayAdvcReqAccnt", vo);
  }  

  /**
    * 가지급금신청 계정내역수정(fsppayadvcreqaccnt수정)_F05
    * @author 
    * @since 2023.10.10.
    */
  public int updateFspPayAdvcReqAccnt(BblenfrcVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcReqAccnt", vo);
  }

  /**
    * 가지급금신청팝업화면(fsppayadvcreqaccnt삭제)
    * @author 
    * @since 2023.10.16.
    */
  public int deleteFspPayAdvcReqAccnt(FspPayAdvcReqVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspPayAdvcReqAccnt", vo);
  }
  
  /**
    * 신청순번을 가지고 온다
    * @author 
    * @since 2023.08.24.
    */
  public FspPayAdvcReqVo selectFspPayAdvcReqAccnt(FspPayAdvcReqVo vo) throws ElException {
    return (FspPayAdvcReqVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReqAccnt", vo);
  }
  
  /**
    * 가지급금정산계정내역 수정
    * @author 
    * @since 2023.08.24.
    */
  public int updateFspPayAdvcCalReqAccnt(FspPayAdvcReqVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcCalReqAccnt", vo);
  }
  
  /**
    * 계정번호, 회계코드 변경 여부 체크
    * @author 
    * @since 2023.08.24.
    */
  public FspPayAdvcReqVo selectFspPayAdvcReqCheckAccnt(FspPayAdvcReqVo vo) throws ElException {
    return (FspPayAdvcReqVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcReqCheckAccnt", vo);
  }
  
  /**
    * 가지급금/전도금신청(삭제)
    * @author 
    * @since 2023.08.29.
    */
  public int deleteFspPayAdvcReq(FspPayAdvcReqVo vo) throws ElException { 
    return delete("kr.re.kitech.biz.fin.spa.deleteFspPayAdvcReq", vo);
  }
          
}
