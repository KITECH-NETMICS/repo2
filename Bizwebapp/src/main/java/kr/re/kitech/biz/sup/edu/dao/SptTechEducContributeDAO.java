package kr.re.kitech.biz.sup.edu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 소요예산 DAO
 * @Class Name SptTechEducContributeDAO.java
 * @Description 소요예산 관련 처리를 담당하는 DAO
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
@Repository("sptTechEducContributeDAO")
public class SptTechEducContributeDAO extends BizDefaultAbstractDAO {
  
  /**
   * 주요프로그램 목록
   * @author 손태화
   * @param SptTechEducContributeVo 목록조회 : 관리번호 , 교육/세미나 구분 
   * @return List<SptTechEducContributeVo> 기여자 목록
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptTechEducContributeVo> selectList(SptTechEducContributeVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.edu.selectSptTechEducContributeList", vo);
  }

  /**
    * 주요프로그램 수정
   * @author 손태화
   * @param SptTechEducContributeVo 기여자 목록
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeDetail(SptTechEducContributeVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.edu.mergeSptTechEducContribute", vo);
  }
  
  /**
   * 주요프로그램 삭제
   * @author 손태화
   * @param SptTechEducContributeVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  public int deletePartDetail(SptTechEducContributeVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.sup.edu.deletePartSptTechEducContribute", vo);
  }

}
