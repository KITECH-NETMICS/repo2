package kr.re.kitech.biz.pat.chr.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.chr.vo.PatChrCasInfoVo;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstListVo;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo;
import kr.re.kitech.biz.pat.chr.vo.PatMastrVo;
import kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo;
import kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo;
import kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo;
import kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo;
import kr.re.kitech.biz.pat.chr.vo.PatSmitappVo;

public interface PatChrCasRegstService {
  
  /**
    * 우선권주장번호 조회
    * @author 
    * @since 2023.08.21.
    */
  public List<PatPrioritySmitappVo> selectList01(PatPrioritySmitappVo vo) throws ElException;

  /**
    * 등록내역 조회
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasRegstVo selectChrCasRegst(PatChrCasRegstVo vo) throws ElException;

  /**
    * 상태값 조회
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasRegstVo selectItem02(PatChrCasRegstVo vo) throws ElException;

  /**
    * 등록확인
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasRegstVo selectItem03(PatChrCasRegstVo vo) throws ElException;

  /**
    * 사건조회 출원사항탭 소연심의결과
    * @author 
    * @since 2023.08.21.
    */
  public PatRneCmtVo selectItem04(PatRneCmtVo vo) throws ElException;

  /**
    * 사건조회 출원사항 출원지시정보
    * @author 
    * @since 2023.08.21.
    */
  public PatSmitappVo selectItem05(PatSmitappVo vo) throws ElException;

  /**
    * 사건조회 출원사항탭 출원완료보고정보
    * @author 
    * @since 2023.08.21.
    */
  public PatMastrVo selectItem06(PatMastrVo vo) throws ElException;

  /**
    * 등록 삽입
    * @author 
    * @since 2023.08.21.
    */
  public int insertItem01(PatRegstInsertVo vo) throws Exception;

  /**
    * 발명신고서 수정
    * @author 
    * @since 2023.08.21.
    */
  public int updateItem01(PatChrCasRegstVo vo) throws Exception;

  /**
    * 특허마스터 수정
    * @author 
    * @since 2023.08.21.
    */
  public int updateItem02(PatChrCasRegstVo vo) throws Exception;

  /**
    * 등록 수정
    * @author 
    * @since 2023.08.21.
    */
  public int updateItem03(PatRegstUpdateVo vo) throws Exception;

  /**
    * 등록삭제
    * @author 
    * @since 2023.08.21.
    */
  public int deleteItem01(PatChrCasRegstVo vo) throws Exception;

  /**
   * 등록 결재신청
   * @author 
   * @since 2023.08.21.
   */
  public PatChrCasRegstVo excuteApproval(PatChrCasRegstListVo vo) throws Exception;

  /**
    * 등록내역 저장 삭제
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasRegstVo savePatChrRegst(PatChrCasRegstListVo vo) throws Exception;

  
  /**
    * 출원내역조회
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasInfoVo selectChrCasPatSmitappMaster(PatChrCasRegstListVo vo) throws Exception;

}
