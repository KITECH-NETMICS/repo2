package kr.re.kitech.biz.ccs.cwl.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqListVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 대출중도상환신청 service
 * @ClassName : CwlLoanMidRepayReqService.java
 * @Description 대출중도상환신청 interface 
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
public interface CwlLoanMidRepayReqService {
  
  /**
   * 대출중도상환신청 목록 조회
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return List<CwlLoanMidRepayReqVo>
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public List<CwlLoanMidRepayReqVo> selectList(CwlLoanMidRepayReqVo vo) throws KitechException;

  /**
   * 대출중도상환신청 상세 조회
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return CwlLoanMidRepayReqVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public CwlLoanMidRepayReqVo selectItem(CwlLoanMidRepayReqVo vo) throws KitechException;

  /**
   * 대출중도상환신청 등록
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return CwlLoanMidRepayReqVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public CwlLoanMidRepayReqVo insertItem(CwlLoanMidRepayReqVo vo) throws KitechException;

  /**
   * 대출중도상환신청 수정
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void updateItem(CwlLoanMidRepayReqVo vo) throws KitechException;
  
  /**
   * 대출중도상환신청 승인
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void cwlLoanMidRepayAgree(CwlLoanMidRepayReqVo vo) throws KitechException;
  
  /**
   * 대출중도상환신청 반려
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void cwlLoanMidRepayReject(CwlLoanMidRepayReqVo vo) throws KitechException;
  
  /**
   * 대출중도상환신청 확정
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void updateLoanMidRepayConfirm(CwlLoanMidRepayReqListVo vo) throws KitechException;
  
  /**
   * 대출중도상환신청 확정취소
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqListVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void updateLoanMidRepayCancel(CwlLoanMidRepayReqListVo vo) throws KitechException;
  
  /**
   * 대출중도상환신청 삭제
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public void deleteItem(CwlLoanMidRepayReqVo vo) throws KitechException;

  /**
   * 중도상환 이자계산 처리
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return CwlLoanMidRepayReqVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public CwlLoanMidRepayReqVo processInterestCalculation(CwlLoanMidRepayReqVo vo) throws KitechException;
  
}
  