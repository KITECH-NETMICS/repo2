package kr.re.kitech.biz.pat.chr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo;
import kr.re.kitech.biz.pat.chr.vo.PatMastrVo;
import kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo;
import kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo;
import kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo;
import kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo;
import kr.re.kitech.biz.pat.chr.vo.PatSmitappVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("patChrCasRegstDAO")
  public class PatChrCasRegstDAO extends BizDefaultAbstractDAO {
  
  /**
    * 우선권주장번호 조회
    * @author 
    * @since 2023.08.21.
    */
  public List<PatPrioritySmitappVo> selectList01(PatPrioritySmitappVo vo) throws ElException {
    return (List<PatPrioritySmitappVo>)list("kr.re.kitech.biz.pat.chr.selectPatPrioritySmitapp", vo);
  }

  /**
    * 등록내역 조회
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasRegstVo selectChrCasRegst(PatChrCasRegstVo vo) throws ElException {
    return (PatChrCasRegstVo) selectByPk("kr.re.kitech.biz.pat.chr.selectPatChrCasRegst", vo);
  }

  /**
    * 상태값 조회
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasRegstVo selectItem02(PatChrCasRegstVo vo) throws ElException {
    return (PatChrCasRegstVo) selectByPk("kr.re.kitech.biz.pat.chr.selectPatChrCasHistory", vo);
  }

  /**
    * 등록확인
    * @author 
    * @since 2023.08.21.
    */
  public PatChrCasRegstVo selectItem03(PatChrCasRegstVo vo) throws ElException {
    return (PatChrCasRegstVo) selectByPk("kr.re.kitech.biz.pat.chr.selectPatChrCasRegstStatus", vo);
  }

  /**
    * 사건조회 출원사항탭 소연심의결과
    * @author 
    * @since 2023.08.21.
    */
  public PatRneCmtVo selectItem04(PatRneCmtVo vo) throws ElException {
    return (PatRneCmtVo) selectByPk("kr.re.kitech.biz.pat.chr.selectPatRneCmt", vo);
  }

  /**
    * 사건조회 출원사항 출원지시정보
    * @author 
    * @since 2023.08.21.
    */
  public PatSmitappVo selectItem05(PatSmitappVo vo) throws ElException {
    return (PatSmitappVo) selectByPk("kr.re.kitech.biz.pat.chr.selectPatSmitapp", vo);
  }

  /**
    * 사건조회 출원사항탭 출원완료보고정보
    * @author 
    * @since 2023.08.21.
    */
  public PatMastrVo selectItem06(PatMastrVo vo) throws ElException {
    return (PatMastrVo) selectByPk("kr.re.kitech.biz.pat.chr.selectPatMastr", vo);
  }

  /**
    * 등록 삽입
    * @author 
    * @since 2023.08.21.
    */
  public int insertItem01(PatRegstInsertVo vo) throws ElException {
    return insert("kr.re.kitech.biz.pat.chr.insertPatRegst", vo);
  }

  /**
    * 발명신고서 수정
    * @author 
    * @since 2023.08.21.
    */
  public int updateItem01(PatChrCasRegstVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.chr.updatePatChrCasRegst", vo);
  }

  /**
    * 특허마스터 수정
    * @author 
    * @since 2023.08.21.
    */
  public int updateItem02(PatChrCasRegstVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.chr.updatePatChrCasMastr", vo);
  }

  /**
    * 등록 수정
    * @author 
    * @since 2023.08.21.
    */
  public int updateItem03(PatRegstUpdateVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.chr.updatePatRegst", vo);
  }

  /**
    * 등록삭제
    * @author 
    * @since 2023.08.21.
    */
  public int deleteItem01(PatChrCasRegstVo vo) throws ElException {
    return delete("kr.re.kitech.biz.pat.chr.deletePatChrCasRegst", vo);
  }

}
