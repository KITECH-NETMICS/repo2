package kr.re.kitech.biz.sup.par.service;

import java.util.List;

import kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghListVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 파트너기업 정보변경 신청 관련 처리를 담당하는 인터페이스
 * @ClassName : SupParCustMentrchnghService.java
 * @Description : 파트너기업 정보변경 신청 관련 처리를 담당하는 인터페이스
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
public interface SupParCustMentrChnghService {
  
  /**
   * 파트너기업 정보변경 신청 목록 조회
   * 
   * @author 
   * @param SupParCustMentrChnghVo
   * @return List<SupParCustMentrchnghListVo>
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public List<SupParCustMentrChnghVo> selectList(SupParCustMentrChnghVo vo) throws KitechException;

  /**
   * 파트너기업 정보변경 신청 목록 소연심의 저장
   * 
   * @author 
   * @param SupParCustMentrchnghListVo
   * @return int
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public void insertItem(SupParCustMentrChnghListVo vo) throws KitechException;

  /**
   * 파트너기업 정보변경 신청 상세 조회
   * 
   * @author 
   * @param SupParCustMentrChnghVo
   * @return SupParCustMentrChnghVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public SupParCustChargChngdVo select(SupParCustMentrChnghVo vo) throws KitechException;
  
  /**
   * 파트너기업 정보변경 신청 상세 삭제
   * @param vo 파트너기업 정보변경 신청 상세 SupParCustMentrChnghVo
   * @throws KitechException
  */
  public void deleteSupParPart(SupParCustMentrChnghVo vo) throws KitechException;     
  
  /**
   * 파트너기업 정보변경 신청 등록 및 저장
   * 
   * @author 
   * @param SupParCustMentrchnghListVo
   * @return int
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public SupParCustMentrChnghVo saveParInfoAll(SupParCustChargChngdVo vo) throws KitechException;     
  
  /**
   * 파트너기업 정보변경 신청 - 사업지원 실장 조회
   * 
   * @author 
   * @param SupParCustMentrChnghVo
   * @return int
   * @throws KitechException
   * @since 2023.10.10.   
   */
  public SupParCustMentrChnghVo selectSupportPsn(SupParCustMentrChnghVo vo) throws KitechException;     
}
  