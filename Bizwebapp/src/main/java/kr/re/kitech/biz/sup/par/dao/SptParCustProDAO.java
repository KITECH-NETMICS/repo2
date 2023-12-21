package kr.re.kitech.biz.sup.par.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.par.vo.SptParCustProVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기업지원프로그램 정보 DAO
 * @Class Name SptParCustProDAO.java
 * @Description 기업지원프로그램 정보 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/28   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/28
 * @version 1
 * @see
 * 
 */
@Repository("sptParCustProDAO")
public class SptParCustProDAO extends BizDefaultAbstractDAO {
  
  /**
   * 파트너기업유지심사서 상세 조회2
   * @author 손태화
   * @param SptParCustProVo 상세조회 : 파트너기업지정번호
   * @return List<SptParCustProVo> 기업지원프로그램 목록
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptParCustProVo> selectSptParCustProList(SptParCustProVo vo) throws KitechException {
	  return list("kr.re.kitech.biz.sup.par.selectSptParCustProList",vo);
  }

}
