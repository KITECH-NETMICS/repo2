package kr.re.kitech.biz.pat.dft.service;

import java.util.List;

import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionListVo;
import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect
 * @ClassName : PatFreeInventionService.java
 * @Description
 * @Modification :
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.10.      Chris    최초생성
 *
 * @author Chris
 * @since 2023.11.10.
 * @version 1.0
 * @see
 *
 */
public interface PatFreeInventionService {
  /**
   * 발명 신고서 작성 조회
   *
   * @author Chris
   * @param PatFreeInventionListVo
   * @return PatFreeInventionVo
   * @throws KitechException
   * @since 2023.11.13.
   */
  public PatFreeInventionListVo selectPatAppFreeInvnt(PatFreeInventionVo vo) throws KitechException;

  /**
   * 발명 신고서 작성 저장
   *
   * @author Chris
   * @param PatFreeInventionListVo
   * @return PatFreeInventionVo
   * @throws KitechException
   * @since 2023.11.10.
   */
  public PatFreeInventionVo savePatAppFreeInvnt(PatFreeInventionListVo vo) throws KitechException;

  /**
   * 발명 신고서 삭제 (결재 중)
   *
   * @author Chris
   * @param PatFreeInventionListVo
   * @return int
   * @throws KitechException
   * @since 2023.11.13.
   */
  public int deletePatDftInfo(PatFreeInventionVo vo) throws KitechException;

  /**
   * 직무발명자 기본정보 조회
   *
   * @author Chris
   * @param PatFreeInventionVo
   * @return List<PatFreeInventionVo>
   * @throws KitechException
   * @since 2023.11.13.
   */
  public List<PatFreeInventionVo> getInvntPsn(PatFreeInventionVo vo) throws KitechException;

  /**
   * 자유발명신고서 조회
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return List<PatFreeInventionVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  public List<PatFreeInventionVo> getGridResult(PatFreeInventionVo vo) throws KitechException;

  /**
   * 구매 검수 권한 담당자 조회
   *
   * @author Chris
   * @param PatFreeInventionVo
   * @return PatFreeInventionVo
   * @throws KitechException
   * @since 2023.11.13.
   */
  public PatFreeInventionVo getDeptToManager(PatFreeInventionVo vo) throws KitechException;

  /**
   * 발명 신고서 결재 신청
   * 
   * @author Chris
   * @param PatFreeInventionListVo
   * @return PatFreeInventionVo
   * @throws KitechException
   * @since 2023.11.13.
   */
  public PatFreeInventionVo approval(PatFreeInventionListVo vo) throws KitechException;
  
}
