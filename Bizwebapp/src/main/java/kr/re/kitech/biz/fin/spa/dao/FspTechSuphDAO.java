package kr.re.kitech.biz.fin.spa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.spa.vo.FbaItmAccntVo;
import kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo;
import kr.re.kitech.biz.fin.spa.vo.ResBgacCtmSpaVo;
import kr.re.kitech.biz.fin.spa.vo.XodxComMVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("fspTechSuphDAO")
  public class FspTechSuphDAO extends BizDefaultAbstractDAO {
  

  /**
    * 내부 장비 활용 내역 목록
    * @author 
    * @since 2023.10.25.
    */
  public List<FspTechSuphVo> selectList(FspTechSuphVo vo) throws ElException {
    return (List<FspTechSuphVo>)list("kr.re.kitech.biz.fin.spa.selectFspTechSuphList", vo);
  }
  
  /**
    * 내부 장비 활용 내역 액셀상세
    * @author 
    * @since 2023.10.25.
    */
  public List<FspTechSuphExcelVo> selectFspTechSuphExcel(FspTechSuphExcelVo vo) throws ElException {
    return (List<FspTechSuphExcelVo>)list("kr.re.kitech.biz.fin.spa.selectFspTechSuphExcel", vo);
  }  

  /**
    * 내부 장비 활용 내역
    * @author 
    * @since 2023.10.26.
    */
  public FspTechSuphVo fspTechSuph(FspTechSuphVo vo) throws ElException {
    return (FspTechSuphVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspTechSuph", vo);
  }
  
  /**
    * 내부 장비 활용 상세
    * @author 
    * @since 2023.10.26.
    */
  public List<FspTechSupdVo> fspTechSupd(FspTechSuphVo vo) throws ElException {
    return (List<FspTechSupdVo>)list("kr.re.kitech.biz.fin.spa.selectFspTechSupd", vo);
  }
  
  /**
    * 내부 장비 활용 장비사용실적
    * @author 
    * @since 2023.10.26.
    */
  public List<FspEquipUseVo> fspEquipUse(FspTechSuphVo vo) throws ElException {
    return (List<FspEquipUseVo>) list("kr.re.kitech.biz.fin.spa.selectFspEquipUse", vo);
  }     

  /**
    * 내부 장비 활용 재료 사용 내용
    * @author 
    * @since 2023.10.26.
    */
  public List<FspTechSupMatrlVo> fspTechSupMatrl(FspTechSuphVo vo) throws ElException {
    return (List<FspTechSupMatrlVo>) list("kr.re.kitech.biz.fin.spa.selectFspTechSupMatrl", vo);
  }

  /**
    * 내부 장비 활용 지원 인력
    * @author 
    * @since 2023.10.26.
    */
  public List<FspTechSupPsnVo> fspTechSupPsn(FspTechSuphVo vo) throws ElException {
    return (List<FspTechSupPsnVo>) list("kr.re.kitech.biz.fin.spa.selectFspTechSupPsn", vo);
  }

  /**
    * 내부기술지원신청 해더 확인 
    * @author 
    * @since 2023.08.08.
    */
  public FspTechSuphVo fspTechSuphCnt(FspTechSuphVo vo) throws ElException {
    return (FspTechSuphVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspTechSuphCnt", vo);
  }
        
  /**
    * 내부기술지원신청 해더 등록
    * @author 
    * @since 2023.08.08.
    */
  public int insertFspTechSuph(FspTechSuphVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspTechSuph", vo);
  }
  
  /**
    * 신청서 삭제시 결의확정상태 조회 
    * @author 
    * @since 2023.08.08.
    */
  public FspTechSuphVo selectFspSlipD(FspTechSuphVo vo) throws ElException {
    return (FspTechSuphVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspSlipD", vo);
  }
    
  /**
    * 비용 코드 확인 
    * @author 
    * @since 2023.08.08.
    */
  public XodxComMVo selectXodxComM(XodxComMVo vo) throws ElException {
    return (XodxComMVo) selectByPk("kr.re.kitech.biz.fin.spa.selectXodxComM", vo);
  }

  /**
    * 비목해소기준
    * @author 
    * @since 2023.08.08.
    */
  public ResBgacCtmSpaVo selectResBgacCtm(ResBgacCtmSpaVo vo) throws ElException {
    return (ResBgacCtmSpaVo) selectByPk("kr.re.kitech.biz.fin.spa.selectResBgacCtm", vo);
  }
  
  /**
    * 비목해소기준과 비용코드로 회계코드조회
    * @author 
    * @since 2023.08.08.
    */
  public FbaItmAccntVo selectFbaItmAccnt(FbaItmAccntVo vo) throws ElException {
    return (FbaItmAccntVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFbaItmAccnt", vo);
  }
  
     
  /**
    * 내부기술지원 접수전호 채번
    * @author 
    * @since 2023.08.08.
    */
  public FspTechSuphVo selectFspTechNumSuph(FspTechSuphVo vo) throws ElException {
    return (FspTechSuphVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspTechNumSuph", vo);
  }  

  /**
    * 내부기술지원신청 해더 등록
    * @author 
    * @since 2023.08.08.
    */
  public int updateFspTechSuph(FspTechSuphVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspTechSuph", vo);
  }
  
  /**
    * 기술지원신청 수정(예산통제모듈에서 사용)
    * @author 
    * @since 2023.10.27.
    */
  public int updateFspTechSuphBblenfrc(BblenfrcVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspTechSuphBblenfrc", vo);
  }  

  /**
    * 내부기술지원신청 상세 등록
    * @author 
    * @since 2023.08.08.
    */
  public int insertFspTechSupd(FspTechSupdVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspTechSupd", vo);
  }

  /**
    * 내부기술지원신청 상세 삭제
    * @author 
    * @since 2023.10.30.
    */
  public int deleteFspTechSupd(String reqNo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspTechSupd", reqNo);
  }

  /**
    * 장비사용내역조회(일괄삭제)
    * @author 
    * @since 2023.10.30.
    */
  public int deleteFspEquipUse(String reqNo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspEquipUse", reqNo);
  }
  
  /**
    * 장비사용신청 신규입력시 max순번가져오기 
    * @author 
    * @since 2023.08.08.
    */
  public FspEquipUseVo selectFspEquipUseMax(FspEquipUseVo vo) throws ElException {
    return (FspEquipUseVo) selectByPk("kr.re.kitech.biz.fin.spa.selectFspEquipUseMax", vo);
  }
  
  
  /**
    * 장비사용내역등록
    * @author 
    * @since 2023.08.08.
    */
  public int insertFspEquipUse(FspEquipUseVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspEquipUse", vo);
  }        

  /**
    * 내부기술지원신청재료 삭제
    * @author 
    * @since 2023.08.08.
    */
  public int deleteFspTechSupMatrl(FspTechSupMatrlVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspTechSupMatrl", vo);
  }

  /**
    * 내부기술지원신청재료 등록
    * @author 
    * @since 2023.08.08.
    */
  public int insertFspTechSupMatrl(FspTechSupMatrlVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspTechSupMatrl", vo);
  }
  
  /**
    * 내부기술지원신청 인원 삭제
    * @author 
    * @since 2023.10.30.
    */
  public int deleteFspTechSupPsn(String reqNo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspTechSupPsn", reqNo);
  }   

  /**
    * 내부기술지원신청재료 등록
    * @author 
    * @since 2023.08.08.
    */
  public int insertFspTechSupPsn(FspTechSupPsnVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.spa.insertFspTechSupPsn", vo);
  }
  
  /**
    * 내부기술지원의뢰(내부기술지원신청헤드삭제)
    * @author 
    * @since 2023.08.08.
    */
  public int deleteFspTechSuph(FspTechSuphVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.spa.deleteFspTechSuph", vo);
  }
  
  /**
    * 성적관리 내부 기술 저장
    * @author 
    * @since 2023.10.30.
    */
  public int updateFspTechSaveSuph(FspTechSuphVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspTechSaveSuph", vo);
  }
  
  /**
    * 내부기술지원의뢰(내부기술지원신청디테일 수정)
    * @author 
    * @since 2023.08.08.
    */
  public int updateFspTechSupd(FspTechSupdVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.spa.updateFspTechSupd", vo);
  }       

}
