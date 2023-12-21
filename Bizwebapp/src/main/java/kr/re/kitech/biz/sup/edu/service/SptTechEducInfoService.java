package kr.re.kitech.biz.sup.edu.service;

import java.util.List;

import kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoDetailVo;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술세미나실적등록/교육실적등록 Service
 * @Class Name SptTechEducInfoService.java
 * @Description 기술세미나실적등록/교육실적등록 관련 처리를 담당하는 Service
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/04   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/04
 * @version 1
 * @see
 * 
 */
public interface SptTechEducInfoService {

  /**
   * 기술세미나실적 목록
   * @author 손태화
   * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 개최시작일자 , 개최종료일자 , 실적부서 , 세미나명 , 등록자 , 참여기업 , 신청상태 , 교육/세미나 구분 , find_clsf 
   * @return List<SptTechEducInfoVo> 기술세미나실적 목록
   * @throws KitechException 공통예외
   */
  public List<SptTechEducInfoVo> selectSmnrList(SptTechEducInfoVo vo) throws KitechException;

  /**
   * 기술세미나실적/교육실적 상세 조회
   * @author 손태화
   * @param SptTechEducInfoVo 상세조회 : 신청번호 , 관리번호 , 교육/세미나 구분
   * @return SptTechEducInfoDetailVo 세미나/교육 상세 , 참여자 목록 , 주요프로그램 목록 , 소요예산 목록 , 기여자 목록
   * @throws KitechException 공통예외
   */
  public SptTechEducInfoDetailVo selectDetail(SptTechEducInfoVo vo) throws KitechException;

  /**
   * 기술세미나실적/교육실적 등록(수정)
   * @author 손태화
   * @param SptTechEducInfoDetailVo 세미나/교육 상세 , 참여자 목록 , 주요프로그램 목록 , 소요예산 목록 , 기여자 목록
   * @return SptTechEducInfoVo 신청번호 , 관리번호
   * @throws Exception 예외
   */
  public SptTechEducInfoVo saveDetail(SptTechEducInfoDetailVo vo) throws Exception;

  /**
   * 기술세미나실적/교육실적 삭제
   * @author 손태화
   * @param SptTechEducInfoDetailVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  public void deleteDetail(SptTechEducInfoDetailVo vo) throws KitechException;

  /**
   * 교육실적 목록
   * @author 손태화
   * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 교육시작일자 , 교육종료일자 , 교육과정 , 등록자 , 실적부서 , 신청상태 , 교육/세미나 구분  
   * @return List<SptTechEducInfoVo> 교육실적 목록
   * @throws KitechException 공통예외
   */
  public List<SptTechEducInfoVo> selectEducList(SptTechEducInfoVo vo) throws KitechException;

}
