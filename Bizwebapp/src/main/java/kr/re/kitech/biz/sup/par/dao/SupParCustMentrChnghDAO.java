package kr.re.kitech.biz.sup.par.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 파트너기업 정보변경 신청
 * @ClassName : supParCustMentrchnghDAO.java
 * @Description : 파트너기업 정보변경 신청 DAO
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.      송선화    최초생성
 * 
 * @author 
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Repository("supParCustMentrChnghDAO")
public class SupParCustMentrChnghDAO extends BizDefaultAbstractDAO {
  
  /**
   * 파트너기업 정보변경 신청 목록 조회
   * @param SupParCustMentrChnghVo
   * @return List<SupParCustMentrChnghVo>
   * @throws KitechException
   */
	@SuppressWarnings("unchecked")
  public List<SupParCustMentrChnghVo> selectList(SupParCustMentrChnghVo vo) throws KitechException {
    return (List<SupParCustMentrChnghVo>)list("kr.re.kitech.biz.sup.par.selectSupParCustMentrChnghList", vo);
  }

  /**
   * 파트너기업 정보변경 신청 목록 소연심의 저장
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   */
  public int updateItem(SupParCustMentrChnghVo vo) throws KitechException {
    return update("kr.re.kitech.biz.sup.par.updateSupParCustMentrChngh", vo);
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 - 기본 기업 정보 조회(저장 전)
   * @param SupParCustMentrChnghVo
   * @return SupParCustMentrChnghVo
   * @throws KitechException
   */
  public SupParCustMentrChnghVo selectSupParCustBaseinfo(SupParCustMentrChnghVo vo) throws KitechException {
	  return (SupParCustMentrChnghVo) selectByPk("kr.re.kitech.biz.sup.par.selectSupParCustBaseinfo", vo);	  
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 - 신규신청서 멘토 조회
   * @param SupParCustMentrChnghVo
   * @return List<SupParPreCustMentoInfoVo>
   * @throws KitechException
   */
  public List<SupParCustMentoInfoVo> selectSupParCustMentoInfo(SupParCustMentrChnghVo vo) throws KitechException {
	  return (List<SupParCustMentoInfoVo>)list("kr.re.kitech.biz.sup.par.selectSupParCustMentoInfo", vo);	  
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 - 신규신청서 담당자 조회
   * @param SupParCustMentrChnghVo
   * @return List<SupParPreCustChngInfoVo>
   * @throws KitechException
   */
  public List<SupParCustChngInfoVo> selectSupParCustCharg(SupParCustMentrChnghVo vo) throws KitechException {
	  return (List<SupParCustChngInfoVo>)list("kr.re.kitech.biz.sup.par.selectSupParCustCharg", vo);	  
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 - 저장이후 멘토 조회
   * @param SupParCustMentrChnghVo
   * @return List<SupParCustMentoInfoVo>
   * @throws KitechException
   */
  public List<SupParCustMentoInfoVo> selectSupParCustMentrChngd(SupParCustMentrChnghVo vo) throws KitechException {
	  return (List<SupParCustMentoInfoVo>)list("kr.re.kitech.biz.sup.par.selectSupParCustMentrChngd", vo);	  
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 - 저장이후 담당자 조회
   * @param SupParCustMentrChnghVo
   * @return List<SupParCustChngInfoVo>
   * @throws KitechException
   */
  public List<SupParCustChngInfoVo> selectSupParCustChargChngd(SupParCustMentrChnghVo vo) throws KitechException {
	  return (List<SupParCustChngInfoVo>)list("kr.re.kitech.biz.sup.par.selectSupParCustChargChngd", vo);	  
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 - 기본 기업 정보 조회(저장이후)
   * @param SupParCustMentrChnghVo
   * @return SupParCustMentrChnghVo
   * @throws KitechException
   */
  public SupParCustMentrChnghVo selectSupParCustMentrChngh(SupParCustMentrChnghVo vo) throws KitechException {
	  return (SupParCustMentrChnghVo) selectByPk("kr.re.kitech.biz.sup.par.selectSupParCustMentrChngh", vo);	  
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 삭제
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   */
  public int deleteSupParPart(SupParCustMentrChnghVo vo) throws KitechException {
    return delete("kr.re.kitech.biz.sup.par.deleteSupParCustMentrChngh", vo);
  }
  
  /**
   * 파트너기업 정보변경 신청 - insertId01
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   */
  public int insertSupParCustMentrChngh(SupParCustMentrChnghVo vo) throws KitechException {
	  return insert("kr.re.kitech.biz.sup.par.insertSupParCustMentrChngh", vo);
  }
  
  /**
   * 파트너기업 정보변경 신청 - updateId01
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   */
  public int updateSupParCustMentrChngh01(SupParCustMentrChnghVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.par.updateSupParCustMentrChngh01", vo);
  }
  
  /**
   * 파트너기업 정보변경 신청 - deleteId02
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   */
  public int deleteSupParCustMentrChngd(SupParCustMentrChnghVo vo) throws KitechException {
	    return delete("kr.re.kitech.biz.sup.par.deleteSupParCustMentrChngd", vo);
	}
  
  /**
   * 파트너기업 정보변경 신청 - deleteId03
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   */
  public int deleteSupParCustChargEngd(SupParCustMentrChnghVo vo) throws KitechException {
	    return delete("kr.re.kitech.biz.sup.par.deleteSupParCustChargEngd", vo);
	}
  
  /**
   * 파트너기업 정보변경 신청 - insertId02
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   */
  public int updateSupParCustMentrChngd(SupParCustMentoInfoVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.par.updateSupParCustMentrChngd", vo);
  }
  
  /**
   * 파트너기업 정보변경 신청 - insertId03
   * @param SupParCustChngInfoVo
   * @return int
   * @throws KitechException
   */
  public int insertSupParCustChargEngd(SupParCustChngInfoVo vo) throws KitechException {
	  return insert("kr.re.kitech.biz.sup.par.insertSupParCustChargEngd", vo);
  }
  
  /**
   * 파트너기업 정보변경 신청 - 사업지원 실장 조회
   * @param SupParCustMentrChnghVo
   * @return SupParCustMentrChnghVo
   * @throws KitechException
   */
  public SupParCustMentrChnghVo selectSupportPsn(SupParCustMentrChnghVo vo) throws KitechException {
	  return (SupParCustMentrChnghVo) selectByPk("kr.re.kitech.biz.sup.par.selectXodhDeptinfo", vo);	  
  }
  
}