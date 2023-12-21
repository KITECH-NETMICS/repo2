package kr.re.kitech.biz.sup.edu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 주요프로그램 DAO
 * @Class Name SptTechEducSchedDAO.java
 * @Description 주요프로그램 관련 처리를 담당하는 DAO
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
@Repository("sptTechEducSchedDAO")
public class SptTechEducSchedDAO extends BizDefaultAbstractDAO {
  
  /**
    * 주요프로그램 목록 조회
   * @author 손태화
   * @param SptTechEducSchedVo 목록조회 : 관리번호 , 교육/세미나 구분
   * @return List<SptTechEducSchedVo> 주요프로그램 목록
   * @throws KitechException 공통예외
   */ 
  @SuppressWarnings("unchecked")
  public List<SptTechEducSchedVo> selectList(SptTechEducSchedVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.edu.selectSptTechEducSchedList", vo);
  }


  /**
    * 주요프로그램 목록 수정
   * @author 손태화
   * @param SptTechEducSchedVo 주요프로그램 목록
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeDetail(SptTechEducSchedVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.edu.mergeSptTechEducSched", vo);
  }
  
  /**
   * 주요프로그램 목록 삭제
   * @author 손태화
   * @param SptTechEducSchedVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  public int deletePartDetail(SptTechEducSchedVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.sup.edu.deletePartSptTechEducSched", vo);
  }

}
