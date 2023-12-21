package kr.re.kitech.biz.pat.pre.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pre.vo.PatPreRecInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreReqInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("patPreRerInvDAO")
  public class PatPreRerInvDAO extends BizDefaultAbstractDAO {
  
  /**
    * 등록결정보고 조회
    * @author 
    * @since 2023.08.24.
    */
  public PatPreRerInvVo selectItem01(PatPreRerInvVo vo) throws ElException {
    return (PatPreRerInvVo) selectByPk("kr.re.kitech.biz.pat.pre.selectPatPreRerInv", vo);
  }

  /**
    * OA 대응 상태 진행중 확인
    * @author 
    * @since 2023.08.24.
    */
    public int selectPatPreGetOA(PatPreRecInvVo vo) throws ElException {
      return (int) selectByPk("kr.re.kitech.biz.pat.pre.selectPatPreGetOA", vo);
    }

  /**
    * 등록지시 결과 조회
    * @author 
    * @since 2023.09.05.
    */
  public PatPreRecInvVo selectItem02(PatPreRecInvVo vo) throws ElException {
    return (PatPreRecInvVo) selectByPk("kr.re.kitech.biz.pat.pre.selectPatPreRecInv", vo);
  }

  /**
    * 등록지시 의뢰 조회
    * @author 
    * @since 2023.09.05.
    */
    public PatPreReqInvVo selectItem03(PatPreReqInvVo vo) throws ElException {
      return (PatPreReqInvVo) selectByPk("kr.re.kitech.biz.pat.pre.selectPatPreRecInv", vo);
    }

  /**
    * 등록지시 확인 등록
    * @author 
    * @since 2023.08.24.
    */
  public int updateItem01(PatPreRerInvVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.pre.selectPatPreReqInv", vo);
  }

  /**
    * 등록지시 의뢰 등록
    * @author 
    * @since 2023.09.05.
    */
  public int updatePatPreRecInvSU01(PatPreRecInvVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.pre.updatePatPreRecInvSU01", vo);
  }

  /**
    * 등록지시 의뢰 등록
    * @author 
    * @since 2023.09.06.
    */
  public int updatePatPreReqInvSU01(PatPreReqInvVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.pre.updatePatPreReqInvSU01", vo);
  }
  
  /**
    * 등록지시결과확인 조회
    * @author 
    * @since 2023.12.08.
    */
  public PatPreRerInvVo selectResultCheck(PatPreRecInvVo vo) throws ElException {
    return (PatPreRerInvVo) selectByPk("kr.re.kitech.biz.pat.pre.selectResultCheck", vo);
  }


  
  /**
    * 등록지시결과확인 등록
    * @author 
    * @since 2023.12.08.
    */
  public int insertResultCheck(PatPreRerInvVo vo) throws ElException {
    return insert("kr.re.kitech.biz.pat.pre.insertResultCheck", vo);
  } 
}
