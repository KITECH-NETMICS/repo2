package kr.re.kitech.biz.fin.spa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo;
import kr.re.kitech.biz.fin.spa.vo.FibkAcctHisAdjustVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("fspPayAdvcAdjstDAO")
  public class FspPayAdvcAdjstDAO extends BizDefaultAbstractDAO {
  
  /**
    * 모든 컬럼 조회
    * @author 
    * @since 2023.08.29.
    */
  public List<FspPayAdvcAdjstVo> selectListAll() throws ElException {
    List<FspPayAdvcAdjstVo> result = (List<FspPayAdvcAdjstVo>)list("kr.re.kitech.biz.fin.spa.selectListAllFspPayAdvcAdjst"); 
    return result;
  }

  /**
    * 가지급금/전도금정산(신청결의내역조회)리스트
    * @author 
    * @since 2023.09.15.
    */
  public List<FspPayAdvcAdjstVo> selectFspPayAdvcAdjstList(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FspPayAdvcAdjstVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstList", vo);
  }

  /**
    * 가지급금 및 전도금신청 내역을 조회(폼)
    * @author 
    * @since 2023.08.29.
    */
  public FspPayAdvcAdjstVo selectFspPayAdvcAdjst(FspPayAdvcAdjstVo vo) throws ElException {
    return (FspPayAdvcAdjstVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjst", vo);
  }

  /**
    * 가지급금 및 전도금신청 내역을 조회(그리드)
    * @author 
    * @since 2023.08.29.
    */
  public List<FspPayAdvcAdjstGridVo> selectFspPayAdvcAdjstGrid(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FspPayAdvcAdjstGridVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstGrid", vo);
  }
  
  /**
    * 잔액입금내역 그리드
    * @author 
    * @since 2023.08.29.
    */
  public List<FcpDepstDetlsVo> selectFcpDepstDetls(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FcpDepstDetlsVo>)list("kr.re.kitech.biz.fin.spa.selectFcpDepstDetls", vo);
  }

  /**
    * 정산계정추가내역 그리드
    * @author 
    * @since 2023.08.29.
    */
  public List<FspPayAdvcAdjstAddVo> selectFspPayAdvcAdjstAdd(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FspPayAdvcAdjstAddVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstAdd", vo);
  }  
  
  /**
    * 가지급금정산 폼데이타 조회(결재함에서 넘어왔을 때 조회)
    * @author 
    * @since 2023.08.29.
    */
  public FspPayAdvcAdjstVo selectFspPayAdvcAdjstAppr(FspPayAdvcAdjstVo vo) throws ElException {
    return (FspPayAdvcAdjstVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstAppr", vo);
  }  
  
  /**
    * 가지급금정산 계정내역 조회(가지급금전도금신청내역조회)(결재함에서 넘어왔을 때 조회)
    * @author 
    * @since 2023.08.29.
    */
  public List<FspPayAdvcAdjstGridVo> selectFspPayAdvcAdjstGridAppr(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FspPayAdvcAdjstGridVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstGridAppr", vo);
  }  
  
  /**
    * 가지급금정산 잔액입금내역 조회(결재함에서 넘어왔을 때 조회)
    * @author 
    * @since 2023.08.29.
    */
  public List<FcpDepstDetlsVo> selectFcpDepstDetlsAppr(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FcpDepstDetlsVo>)list("kr.re.kitech.biz.fin.spa.selectFcpDepstDetlsAppr", vo);
  }  
    
  /**
    * 가지급금전도금정산 입력
    * @author 
    * @since 2023.08.29.
    */
  public int insertFspPayAdvcAdjst(FspPayAdvcAdjstVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspPayAdvcAdjst", vo);
  }

  /**
    * 가지급금전도금정산(입금내역수정)
    * @author 
    * @since 2023.08.29.
    */
  public int updateFspPayAdvcAdjst(FspPayAdvcAdjstVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcAdjst", vo);
  }

  /**
    * 가지급금정산계정내역 등록
    * @author 
    * @since 2023.08.29.
    */
  public int insertFspPayAdvcAdjstAccnt(FspPayAdvcAdjstGridVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspPayAdvcAdjstAccnt", vo);
  }
  
  /**
    * 가지급금정산계정내역 수정
    * @author 
    * @since 2023.08.29.
    */
  public int updateFspPayAdvcAdjstAccnt(FspPayAdvcAdjstGridVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcAdjstAccnt", vo);
  }
  
  /**
    * 가지급금전도금정산(입금내역신규입력)
    * @author 
    * @since 2023.08.29.
    */
  public int insertFcpDepstDetls(FcpDepstDetlsVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFcpDepstDetls", vo);
  }
  
  /**
    * 온라인입금정보 조회(조회키:가수결의번호)
    * @author 
    * @since 2023.08.29.
    */
  public FibkAcctHisAdjustVo selectFibkAcctHisAdjst(FibkAcctHisAdjustVo vo) throws ElException {
    return (FibkAcctHisAdjustVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFibkAcctHisAdjst", vo);
  }    
  
  /**
    * 가지급금전도금정산(입금내역수정)
    * @author 
    * @since 2023.08.29.
    */
  public int updateFcpDepstDetls(FcpDepstDetlsVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFcpDepstDetls", vo);
  }  
    
  /**
    * 가지급금전도금정산(입금내역삭제)
    * @author 
    * @since 2023.08.29. 
    */
  public int deleteFcpDepstDetls(FcpDepstDetlsVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFcpDepstDetls", vo);
  }
  
  /**
    * 가지급금정산 추가계정내역 등록
    * @author 
    * @since 2023.08.29.
    */
  public int insertFspPayAdvcAdjstAddAccnt(FspPayAdvcAdjstAddVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspPayAdvcAdjstAddAccnt", vo);
  }  
  
  /**
    * 온라인입금정보 조회(조회키:가수결의번호)
    * @author 
    * @since 2023.08.29. 
    */
  public FspPayAdvcAdjstAddVo selectFspPayAdvcAdjstAddAccnt(FspPayAdvcAdjstAddVo vo) throws ElException {
    return (FspPayAdvcAdjstAddVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstAddAccnt", vo);
  }

  /**
    * 가지급금정산 추가계정내역 수정
    * @author 
    * @since 2023.08.29.
    */
  public int updateFspPayAdvcAdjstAdd(FspPayAdvcAdjstAddVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcAdjstAdd", vo);
  }   

  /**
    * 가지급금정산 추가계정내역 조회(기존내역과 수정내역 비교를 위한 조회)
    * @author 
    * @since 2023.08.29. 
    */
  public FspPayAdvcAdjstAddVo selectFspPayAdvcAdjstAddCheck(FspPayAdvcAdjstAddVo vo) throws ElException {
    return (FspPayAdvcAdjstAddVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstAddCheck", vo);
  }   
  
  
  /**
    * 송금의뢰내역 조회 - 가지급금정산결의
    * @author 
    * @since 2023.08.29. 
    */
  public List<FspSendReqVo> selectFspSendReqS(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FspSendReqVo>)list("kr.re.kitech.biz.fin.spa.selectFspSendReqS", vo);
  }   
  
  /**
    * 가지급금정산 추가계정내역 삭제
    * @author 
    * @since 2023.08.29. 
    */
  public int deleteFspPayAdvcAdjstAdd(FspPayAdvcAdjstAddVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspPayAdvcAdjstAdd", vo); 
  }
  
  /**
    * 가지급금전도금정산(가지급금전도금신청 정산신청번호update)
    * @author 
    * @since 2023.08.29.
    */
  public int updateFspPayAdvcReqNo(FspPayAdvcAdjstVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcReqNo", vo);
  }
  
  /**
    * 가지급금전도금정산(가지급금전도금신청 정산신청번호 초기화)
    * @author 
    * @since 2023.08.29.
    */
  public int updateFspPayAdvcReqReset(FspPayAdvcAdjstVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcReqReset", vo);
  }  
  
  /**
    * 가지급금정산계정내역 삭제
    * @author 
    * @since 2023.08.29. 
    */
  public int deleteFspPayAdvcAdjstAccnt(FspPayAdvcAdjstVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspPayAdvcAdjstAccnt", vo); 
  }         
  
  /**
    * 가지급금전도금정산(입금내역전체삭제)
    * @author 
    * @since 2023.08.29. 
    */
  public int deleteFspPayAdvcAdjst(FspPayAdvcAdjstVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspPayAdvcAdjst", vo);  
  }
  
  /**
    * 가지급금전도금정산결의(가지급금전도금정산내역조회)
    * @author 
    * @since 2023.08.29.
    */
  public List<FspPayAdvcAdjstVo> selectFspPayAdvcAdjstApr(FspPayAdvcAdjstVo vo) throws ElException {
    return (List<FspPayAdvcAdjstVo>)list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstApr", vo);
  }       
  
  /**
    * 가지급금정산결의생성 시, 결의번호를 정산신청테이블에 넣기
    * @author 
    * @since 2023.08.29.
    */
  public int updateFspPayAdvcAdjstApr(FspPayAdvcAdjstVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcAdjstApr", vo);
  }   

}
