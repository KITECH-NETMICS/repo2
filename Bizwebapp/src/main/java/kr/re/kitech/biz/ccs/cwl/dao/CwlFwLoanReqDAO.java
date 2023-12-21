package kr.re.kitech.biz.ccs.cwl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 상조회대출신청 DAO
 * @ClassName : CwlFwLoanReqDAO.java
 * @Description 상조회대출신청 DAO
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.04.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.09.04.
 * @version 1.0
 * @see
 * 
 */
@Repository("cwlFwLoanReqDAO")
public class CwlFwLoanReqDAO extends BizDefaultAbstractDAO {
  
  /**
   * 상조회대출신청 목록 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return List<CwlFwLoanReqVo>
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public List<CwlFwLoanReqVo> selectList(CwlFwLoanReqVo vo) throws KitechException {
    return (List<CwlFwLoanReqVo>)list("kr.re.kitech.biz.ccs.cwl.selectListCwlFwLoanReq", vo);
  }

  /**
   * 상조회대출신청 상세 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectItem(CwlFwLoanReqVo vo) throws KitechException {
    return (CwlFwLoanReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCwlFwLoanReq", vo);
  }

  /**
   * 상조회대출신청 등록
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public int insertItem(CwlFwLoanReqVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.ccs.cwl.insertCwlFwLoanReq", vo);
  }
  
  /**
   * 상조회대출신청 수정
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public int updateItem(CwlFwLoanReqVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.ccs.cwl.updateCwlFwLoanReq", vo);
  }
  
  /**
   * 상조회대출신청 삭제
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public void deleteItem(CwlFwLoanReqVo vo) throws KitechException {
	  delete("kr.re.kitech.biz.ccs.cwl.deleteCwlFwLoanReq", vo);
  }
  
  /**
   * 대출금마스터-기대출금 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectloanRamtInfo(CwlFwLoanReqVo vo) throws KitechException {
    return (CwlFwLoanReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectloanRamtInfo", vo);
  }
  
  /**
   * 퇴직금 조회 - 퇴직연금 가입시 연금공제이력 합계로 퇴직금
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectHumSlmmPayCd(CwlFwLoanReqVo vo) throws KitechException {
	  return (CwlFwLoanReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectHumSlmmPayCd", vo);
  }
  
  /**
   * 퇴직금 조회 - 퇴직연금 미가입시 퇴직충당금
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectHumSlmmPayAmt(CwlFwLoanReqVo vo) throws KitechException {
	  return (CwlFwLoanReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectHumSlmmPayAmt", vo);
  }
  
  /**
   * 전별금 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectCwlFriHpScaRwl(CwlFwLoanReqVo vo) throws KitechException {
	  return (CwlFwLoanReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCwlFriHpScaRwl", vo);
  }
  
  /**
   * 급여계좌정보 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectHumBankBasicInfo(CwlFwLoanReqVo vo) throws KitechException {
	  return (CwlFwLoanReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectHumBankBasicInfo", vo);
  }
  
  /**
   * 확정내역 조회 
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectDecideInfo(CwlFwLoanReqVo vo) throws KitechException {
	  return (CwlFwLoanReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectDecideInfo", vo);
  }
  
  /**
   * 이자율 조회 
   * 
   * @author 
   * @param CwlLoanPopVo
   * @return CwlLoanMasterVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlLoanMasterVo selectCwlLoanRts(CwlLoanMasterVo vo) throws KitechException {
	  return (CwlLoanMasterVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCwlLoanRts", vo);
  }
  
    /**
   * 대출금마스터 등록
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public int insertCwlLoanMaster(CwlLoanMasterVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.ccs.cwl.insertCwlLoanMaster", vo);
  }

}
