package kr.re.kitech.biz.fin.std.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo;
import kr.re.kitech.biz.fin.std.vo.FinPartAccntVo;

public interface FbaApartAccntReqService {
  // List Select All
  public List<FbaApartAccntReqVo> selectList() throws ElException;
  // 별도계좌 목록 조회
  public List<FbaApartAccntReqVo> selectListItem(FbaApartAccntReqVo vo) throws ElException;
  // 별도 계좌 신청전 기본 데이터 조회 
  public FbaApartAccntReqVo selectSingleItem(FbaApartAccntReqVo vo) throws ElException;
  // 별도계좌 승인
  public FbaApartAccntReqVo approvalItem(FbaApartAccntReqVo vo) throws Exception;
  // 별도계좌 반려
  public FbaApartAccntReqVo rejectItem(FbaApartAccntReqVo vo) throws Exception;
  // 별도계좌 신청
  public FbaApartAccntReqVo mergeItem(FbaApartAccntReqVo vo) throws Exception;
  // 별도계좌 삭제
  public int deleteItem(FbaApartAccntReqVo vo) throws Exception;
  // 별도계좌 조회
  public List<FbaApartAccntReqVo> selectListItem2(FbaApartAccntReqVo vo) throws ElException;
  // 별도계좌 form 조회 
  public FbaApartAccntReqVo selectSingleItem2(FbaApartAccntReqVo vo) throws ElException;
  // 별도계좌 cnt 조회 
  public FbaApartAccntReqVo selectSingleItem3(FbaApartAccntReqVo vo) throws ElException;
  // 별도계좌 등록,수정,삭제 
  public FbaApartAccntReqVo mergeItem2(FbaApartAccntReqVo vo) throws ElException;
  // 별도계좌 집행 조회
  public List<FinPartAccntVo> selectList01(FinPartAccntVo vo) throws ElException;          
}
