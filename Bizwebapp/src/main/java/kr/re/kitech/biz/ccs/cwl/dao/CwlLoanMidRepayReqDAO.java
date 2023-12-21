package kr.re.kitech.biz.ccs.cwl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 대출중도상환신청 DAO
 * @ClassName : CwlLoanMidRepayReqDAO.java
 * @Description 대출중도상환신청 DAO
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.08.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.09.08.
 * @version 1.0
 * @see
 * 
 */
@Repository("cwlLoanMidRepayReqDAO")
public class CwlLoanMidRepayReqDAO extends BizDefaultAbstractDAO {
  
  /**
   * 대출중도상환신청 목록 조회
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return List<CwlLoanMidRepayReqVo>
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public List<CwlLoanMidRepayReqVo> selectList(CwlLoanMidRepayReqVo vo) throws KitechException {
    return (List<CwlLoanMidRepayReqVo>)list("kr.re.kitech.biz.ccs.cwl.selectListCwlLoanMidRepayReq", vo);
  }

  /**
   * 대출중도상환신청 상세 조회
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return CwlLoanMidRepayReqVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public CwlLoanMidRepayReqVo selectItem(CwlLoanMidRepayReqVo vo) throws KitechException {
    return (CwlLoanMidRepayReqVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCwlLoanMidRepayReq", vo);
  }

  /**
   * 대출중도상환신청 등록
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public int insertItem(CwlLoanMidRepayReqVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.ccs.cwl.insertCwlLoanMidRepayReq", vo);
  }
  
  /**
   * 대출중도상환신청 수정
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void updateItem(CwlLoanMidRepayReqVo vo) throws KitechException {
	  update("kr.re.kitech.biz.ccs.cwl.updateCwlLoanMidRepayReq", vo);
  }
  
  /**
   * 대출중도상환신청 확정,취소 수정 - 
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void updateLoanMidRepayConfirmAndCancel(CwlLoanMidRepayReqVo vo) throws KitechException {
	  update("kr.re.kitech.biz.ccs.cwl.updateLoanMidRepayConfirmAndCancel", vo);
  }
  
  /**
   * 대출중도상환신청 삭제
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void deleteItem(CwlLoanMidRepayReqVo vo) throws KitechException {
	  delete("kr.re.kitech.biz.ccs.cwl.deleteCwlLoanMidRepayReq", vo);
  }
  
  /**
   * 대출금마스터 - 이자율, 대출잔액 조회 (이자계산에 사용)
   * 
   * @author lsh
   * @param CwlLoanMasterVo
   * @return CwlLoanMasterVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public CwlLoanMasterVo selectCwlLoanForCalculate(CwlLoanMasterVo vo) throws KitechException {
    return (CwlLoanMasterVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCwlLoanForCalculate", vo);
  }

  /**
   * 대출중도상환신청 이력 등록
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void insertCwlLoanMidWayRepay(CwlLoanMidRepayReqVo vo) throws KitechException {
	  insert("kr.re.kitech.biz.ccs.cwl.insertCwlLoanMidWayRepay", vo);
  }
  
  /**
   * 대출금마스터 수정(중도상환 신청시)
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void updateCwlLoanMaster(CwlLoanMasterVo vo) throws KitechException {
	  update("kr.re.kitech.biz.ccs.cwl.updateCwlLoanMaster", vo);
  }
  
  /**
   * 중도상환이자 이력테이블 삭제
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void deleteCwlLoanMidWayRepay(CwlLoanMidRepayReqVo vo) throws KitechException {
	  delete("kr.re.kitech.biz.ccs.cwl.deleteCwlLoanMidWayRepay", vo);
  }
  
  /**
   * 중도상환건에 대하여 삭제시 마스터데이터와  중도상환데이터의 싱크를 맞추기 위한 자료
   * 
   * @author lsh
   * @param CwlLoanMasterVo
   * @return List<CwlLoanMasterVo>
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public List<CwlLoanMasterVo> selectCwlLoanForSync(CwlLoanMasterVo vo) throws KitechException {
    return (List<CwlLoanMasterVo>)list("kr.re.kitech.biz.ccs.cwl.selectCwlLoanForSync", vo);
  }
  
  /**
   * 상환건 삭제시 마스터데이터와 중도상환데이터의 싱크작업을위한 자료(이전 상환이자)
   * 
   * @author lsh
   * @param CwlLoanMasterVo
   * @return List<CwlLoanMasterVo>
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public List<CwlLoanMasterVo> selectCwlLoanMidWayRepay(CwlLoanMasterVo vo) throws KitechException {
	  return (List<CwlLoanMasterVo>)list("kr.re.kitech.biz.ccs.cwl.selectCwlLoanMidWayRepay", vo);
  }
}
