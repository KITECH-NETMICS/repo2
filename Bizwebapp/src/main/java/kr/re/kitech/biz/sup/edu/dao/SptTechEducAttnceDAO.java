package kr.re.kitech.biz.sup.edu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 참여자 DAO
 * @Class Name SptTechEducAttnceDAO.java
 * @Description 참여자 관련 처리를 담당하는 DAO
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
@Repository("sptTechEducAttnceDAO")
public class SptTechEducAttnceDAO extends BizDefaultAbstractDAO {

  /**
   * 기술세미나실적 참여자 목록 조회
   * @author 손태화
   * @param SptTechEducAttnceVo 목록조회 : 관리번호 , 교육/세미나 구분
   * @return List<SptTechEducAttnceVo> 참여자 목록
   * @throws KitechException 공통예외
   */ 
  @SuppressWarnings("unchecked")
  public List<SptTechEducAttnceVo> selectSmnrList(SptTechEducAttnceVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.edu.selectSptTechSmnrAttnceList", vo);
  }
  
  /**
   * 교육실적 참여자 목록 
   * @author 손태화
   * @param SptTechEducInfoVo 상세조회 : 관리번호 , 교육/세미나 구분
   * @return List<SptTechEducAttnceVo> 참여자 목록
   * @throws KitechException 공통예외
   */ 
  @SuppressWarnings("unchecked")
  public List<SptTechEducAttnceVo> selectEducList(SptTechEducAttnceVo vo) throws KitechException {
	  return list("kr.re.kitech.biz.sup.edu.selectSptTechEducAttnceList", vo);
  }

  /**
   * 참여자 목록 등록(수정)
   * @author 손태화
   * @param SptTechEducAttnceVo 참여자 목록
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeDetail(SptTechEducAttnceVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.edu.mergeSptTechEducAttnce", vo);
  }

  /**
   * 참여자 목록 삭제
   * @author 손태화
   * @param SptTechEducAttnceVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  public int deletePartDetail(SptTechEducAttnceVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.sup.edu.deletePartSptTechEducAttnce", vo);
  }

}
