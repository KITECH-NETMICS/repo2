package kr.re.kitech.biz.ccs.cwl.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 상조회대출신청 interface
 * @ClassName : CwlFwLoanReqService.java
 * @Description 상조회대출신청 interface
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
public interface CwlFwLoanReqService {
  
  /**
   * 상조회대출신청 목록 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return List<CwlFwLoanReqVo>
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public List<CwlFwLoanReqVo> selectList(CwlFwLoanReqVo vo) throws KitechException;

  /**
   * 상조회대출신청 상세 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectItem(CwlFwLoanReqVo vo) throws KitechException;
  
  /**
   * 상조회대출신청 등록
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo insertItem(CwlFwLoanReqVo vo) throws KitechException;
  
  /**
   * 상조회대출신청 삭제
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public void deleteItem(CwlFwLoanReqVo vo) throws KitechException;

  /**
   * 대출금마스터-기대출금 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectloanRamtInfo(CwlFwLoanReqVo vo) throws KitechException;
  
  
  /**
   * 급여계좌정보 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectHumBankBasicInfo(CwlFwLoanReqVo vo) throws KitechException;
  
  /**
   * 확정내역 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public CwlFwLoanReqVo selectDecideInfo(CwlFwLoanReqVo vo) throws KitechException;
  
  /**
   * 대출금마스터 등록
   * 
   * @author 
   * @param CwlLoanPopVo
   * @return void
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public void insertCwlLoanMaster(CwlLoanMasterVo vo) throws KitechException;
  
  
  /**
   * 상조회대출신청 승인, 반려 처리 
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public void cwlFwLoanReqProcApr(CwlFwLoanReqVo vo) throws KitechException;
  
}
  