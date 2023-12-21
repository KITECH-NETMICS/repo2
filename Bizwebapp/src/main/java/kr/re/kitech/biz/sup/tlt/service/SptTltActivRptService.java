package kr.re.kitech.biz.sup.tlt.service;

import java.util.List;

import kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptDetailVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 활동보고서 Service
 * @Class Name SptTltActivRptService.java
 * @Description 활동보고서 관련 처리를 담당하는 Service
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/14   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/14
 * @version 1
 * @see
 * 
 */
public interface SptTltActivRptService {
  
  /**
   * 활동보고서 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 사용자 , 검색년월 , 작성여부
   * @return List<SptTltActivRptVo> 활동보고서 목록
   * @throws KitechException 공통예외
   */
  public List<SptTltActivRptVo> selectSptTltActivRptList(SptTltActivRptVo vo) throws KitechException;
  
  /**
   * 기업 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 사용자(작성자)
   * @return SptTltActivRptDetailVo 기업 목록
   * @throws KitechException 공통예외
   */
  public SptTltActivRptDetailVo selectSptDisPatchPrcondList(SptTltActivRptVo vo) throws KitechException;
  
  /**
   * 기술지원직정보 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 참여기업
   * @return SptTltActivRptVo 기술지원직정보 목록
   * @throws KitechException 공통예외
   */
  public SptTltActivRptVo selectSkilHumBasIcInfo(SptTltActivRptVo vo) throws KitechException;
  
  /**
   * 활동보고서 상세 조회
   * @author 손태화
   * @param SptTltActivRptVo 상세조회 : 보고서번호
   * @return SptTltActivRptDetailVo 활동보고서정보 , 당월실적 , 익월목표
   * @throws KitechException 공통예외
   */
  public SptTltActivRptDetailVo selectSptTltActivRptDetail(SptTltActivRptVo vo) throws KitechException;

  /**
   * 활동보고서 등록(수정)
   * @author 손태화
   * @param SptTltActivRptDetailVo 활동보고서정보 , 당월실적 , 익월목표
   * @return SptTltActivRptVo 신청번호
   * @throws Exception 예외
   */
  public SptTltActivRptVo mergeSptTltActivRpt(SptTltActivRptDetailVo vo) throws Exception;

  /**
   * 활동보고서 삭제
   * @author 손태화
   * @param SptTltActivRptVo 관리번호
   * @return  
   * @throws KitechException 공통예외
   */
  public void deleteSptTltActivRpt(SptTltActivRptVo vo) throws KitechException;
  
  /**
   * 부서 목록
   * @author 손태화
   * @param 
   * @return SptTltActivRptDetailVo 부서 목록
   * @throws KitechException 공통예외
   */
  public SptTltActivRptDetailVo selectSptTltXodhDeptList(SptTltActivRptVo vo) throws KitechException;
  
  /**
   * 대상인원
   * @author 손태화
   * @param SptTltActivRptDetailVo 기업 목록
   * @return SptTltActivRptDetailVo 기업 대상인원 목록
   * @throws KitechException 공통예외
   */
  public SptTltActivRptDetailVo selectSptTltSendList(SptTltActivRptDetailVo vo) throws KitechException;

}
