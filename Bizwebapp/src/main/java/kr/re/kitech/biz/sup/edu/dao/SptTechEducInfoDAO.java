package kr.re.kitech.biz.sup.edu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술세미나실적등록/교육실적등록 DAO
 * @Class Name SptTechEducInfoDAO.java
 * @Description 기술세미나실적등록/교육실적등록 관련 처리를 담당하는 DAO
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
@Repository("sptTechEducInfoDAO")
public class SptTechEducInfoDAO extends BizDefaultAbstractDAO {
  
  /**
   * 기술세미나실적 목록
   * @author 손태화
   * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 개최시작일자 , 개최종료일자 , 실적부서 , 세미나명 , 등록자 , 참여기업 , 신청상태 , 교육/세미나 구분 , find_clsf 
   * @return List<SptTechEducInfoVo> 기술세미나실적 목록
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptTechEducInfoVo> selectSmnrList(SptTechEducInfoVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.edu.selectSptTechEducInfoSmnrList", vo);
  }

  /**
   * 기술세미나실적/교육실적 상세 조회
   * @author 손태화
   * @param SptTechEducInfoVo 상세조회 : 신청번호
   * @return SptTechEducInfoVo 세미나/교육 상세
   * @throws KitechException 공통예외
   */
  public SptTechEducInfoVo selectDetail(SptTechEducInfoVo vo) throws KitechException {
    return (SptTechEducInfoVo)selectByPk("kr.re.kitech.biz.sup.edu.selectSptTechEducInfoDetail", vo);
  }

  /**
   * 관리번호 조회
   * @author 손태화
   * @param 
   * @return SptTechEducInfoVo 관리번호
   * @throws KitechException 공통예외
   */
  public SptTechEducInfoVo selectMngmtNo(SptTechEducInfoVo vo) throws KitechException {
    return (SptTechEducInfoVo)selectByPk("kr.re.kitech.biz.sup.edu.selectSptTechEducNextMngmtNo", vo);
  }
 
  /**
   * 기술세미나실적/교육실적 등록(수정)
   * @author 손태화
   * @param SptTechEducInfoVo 세미나/교육 상세
   * @return  
   * @throws KitechException 공통예외
   */
  public int mergeDetail(SptTechEducInfoVo vo) throws KitechException{
	  return update("kr.re.kitech.biz.sup.edu.mergeSptTechEducInfo", vo);
  } 
  
  /**
   * 기술세미나실적/교육실적 삭제
   * @author 손태화
   * @param SptTechEducInfoVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  public int deleteDetail(SptTechEducInfoVo vo) throws KitechException{
	  return delete("kr.re.kitech.biz.sup.edu.deleteSptTechEducInfo", vo);
  } 
  
  /**
   * 교육실적 목록
   * @author 손태화
   * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 개최시작일자 , 개최종료일자 , 실적부서 , 세미나명 , 등록자 , 참여기업 , 신청상태 , 교육/세미나 구분 , find_clsf 
   * @return List<SptTechEducInfoVo> 교육실적 목록
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptTechEducInfoVo> selectEducList(SptTechEducInfoVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.edu.selectSptTechEducInfoEducList", vo);
  }

}
