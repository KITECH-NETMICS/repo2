package kr.re.kitech.biz.fin.std.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo;
import kr.re.kitech.biz.fin.std.vo.FinPartAccntVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("fbaApartAccntReqDAO")
public class FbaApartAccntReqDAO extends BizDefaultAbstractDAO {
  
  public List<FbaApartAccntReqVo> selectList() throws ElException {
    List<FbaApartAccntReqVo> result = (List<FbaApartAccntReqVo>)list("kr.re.kitech.biz.fin.std.selectListFbaApartAccntReq"); 
    return result;
  }
  
  //별도 계좌 목록 조회
  public List<FbaApartAccntReqVo> selectListItem(FbaApartAccntReqVo vo) throws ElException {
    return (List<FbaApartAccntReqVo>)list("kr.re.kitech.biz.fin.std.selectListItemFbaApartAccntReq", vo);
  }  
  //기본 계좌 조회
  public FbaApartAccntReqVo selectSingleItem(FbaApartAccntReqVo vo) throws ElException {
    return (FbaApartAccntReqVo) selectByPk("kr.re.kitech.biz.fin.std.selectSingleItemFbaApartAccntReq", vo);
  }  
  //신청전 기본 데이터 조회
  public FbaApartAccntReqVo selectBeforeSingleItem(FbaApartAccntReqVo vo) throws ElException {
    return (FbaApartAccntReqVo) selectByPk("kr.re.kitech.biz.fin.std.selectBeforeSingleItemHumBasicInfo", vo);
  }
  //별도계좌 신규 저장
  public int insertItem(FbaApartAccntReqVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.std.insertItemFbaApartAccntReq", vo);
  } 
  //별도계좌 승인
  public int approvalItemItem(FbaApartAccntReqVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.std.updateListItemFbaApartAccntReq", vo);
  }   
  //별도계좌 저장
  public int updateItem(FbaApartAccntReqVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.std.updateItemFbaApartAccntReq", vo);
  }
  //별도계좌 삭제
  public int deleteItem(FbaApartAccntReqVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.std.deleteItemFbaApartAccntReq", vo);
  }
  //별도계좌 조회
  public List<FbaApartAccntReqVo> selectListItem2(FbaApartAccntReqVo vo) throws ElException {
    return (List<FbaApartAccntReqVo>)list("kr.re.kitech.biz.fin.std.selectFbaApartAccntGrid", vo);
  }  
  //별도계좌 form 조회
  public FbaApartAccntReqVo selectSingleItem2(FbaApartAccntReqVo vo) throws ElException {
    return (FbaApartAccntReqVo) selectByPk("kr.re.kitech.biz.fin.std.selectFbaApartAccntForm", vo);
  }   
  //별도계좌 cnt 조회
  public FbaApartAccntReqVo selectSingleItem3(FbaApartAccntReqVo vo) throws ElException {
    return (FbaApartAccntReqVo) selectByPk("kr.re.kitech.biz.fin.std.selectFbaApartAccntCnt", vo);
  }
  //별도계좌 담당자 등록
  public int insertFbaApartAccnt(FbaApartAccntReqVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.std.insertFbaApartAccnt", vo);
  }
  //별도계좌 담당자 수정
  public int updateFbaApartAccnt(FbaApartAccntReqVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.std.updateFbaApartAccnt", vo);
  }         
  //별도계좌 담당자 삭제
  public int deleteFbaApartAccnt(FbaApartAccntReqVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.std.deleteFbaApartAccnt", vo);
  }
  //별도계좌 집행 조회
  public List<FinPartAccntVo> selectList01(FinPartAccntVo vo) throws ElException {
    return (List<FinPartAccntVo>)list("kr.re.kitech.biz.fin.std.selectFinPartAccnt", vo);
  }    
}
