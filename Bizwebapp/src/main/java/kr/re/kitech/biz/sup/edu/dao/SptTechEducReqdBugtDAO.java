package kr.re.kitech.biz.sup.edu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 소요예산 DAO
 * @Class Name SptTechEducReqdBugtDAO.java
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
@Repository("sptTechEducReqdBugtDAO")
public class SptTechEducReqdBugtDAO extends BizDefaultAbstractDAO {
  
  /**
    * 소요예산 목록 조회
   * @author 손태화
   * @param SptTechEducReqdBugtVo 목록조회 : 관리번호 , 교육/세미나 구분
   * @return List<SptTechEducReqdBugtVo> 소요예산 목록
   * @throws KitechException 공통예외
   */ 
  @SuppressWarnings("unchecked")
  public List<SptTechEducReqdBugtVo> selectList(SptTechEducReqdBugtVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.edu.selectSptTechEducReqdBugtList", vo);
  }

  /**
    * 소요예산 수정
   * @author 손태화
   * @param SptTechEducReqdBugtVo 소요예산 목록
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeDetail(SptTechEducReqdBugtVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.edu.mergeSptTechEducReqdBugt", vo);
  }
  
  /**
   * 소요예산 삭제
   * @author 손태화
   * @param SptTechEducReqdBugtVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  public int deletePartDetail(SptTechEducReqdBugtVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.sup.edu.deletePartSptTechEducReqdBugt", vo);
  }

}
