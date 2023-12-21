package kr.re.kitech.biz.sup.tlt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 당월실적 DAO
 * @Class Name SptTltActivMonthRptDAO.java
 * @Description 당월실적 관련 처리를 담당하는 DAO
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
@Repository("sptTltActivMonthRptDAO")
public class SptTltActivMonthRptDAO extends BizDefaultAbstractDAO {
  
  /**
   * 당월실적 목록 조회
   * @author 손태화
   * @param SptTltActivMonthRptVo 상세조회 : 보고서번호
   * @return SptTltActivMonthRptVo 당월실적
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptTltActivMonthRptVo> selectList(SptTltActivMonthRptVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.tlt.selectSptTltActivMonthRptList", vo);
  }
  
  /**
   * 당월실적 목록 등록(수정)
   * @author 손태화
   * @param SptTltActivMonthRptVo 당월실적
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeDetail(SptTltActivMonthRptVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.tlt.mergeSptTltActivMonthRpt", vo);
  }
  
  /**
   * 당월실적 목록 삭제
   * @author 손태화
   * @param SptTltActivMonthRptVo 보고서번호
   * @return 
   * @throws KitechException 공통예외
   */
  public int deletePartDetail(SptTltActivMonthRptVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.sup.tlt.deleteSptTltActivMonthRpt", vo);
  }

}
