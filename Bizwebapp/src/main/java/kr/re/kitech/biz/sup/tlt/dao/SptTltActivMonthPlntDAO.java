package kr.re.kitech.biz.sup.tlt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 익월목표 DAO
 * @Class Name SptTltActivMonthPlntDAO.java
 * @Description 익월목표 관련 처리를 담당하는 DAO
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
@Repository("sptTltActivMonthPlnDAO")
public class SptTltActivMonthPlntDAO extends BizDefaultAbstractDAO {
  
  /**
   * 익월목표 목록 조회
   * @author 손태화
   * @param SptTltActivMonthPlnVo 상세조회 : 보고서번호
   * @return SptTltActivMonthPlnVo 익월목표
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptTltActivMonthPlnVo> selectList(SptTltActivMonthPlnVo vo) throws ElException {
    return list("kr.re.kitech.biz.sup.tlt.selectSptTltActivMonthPlnList", vo);
  }
  
  /**
   * 익월목표 목록 등록(수정)
   * @author 손태화
   * @param SptTltActivMonthPlnVo 익월목표
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeDetail(SptTltActivMonthPlnVo vo) throws ElException {
	  return update("kr.re.kitech.biz.sup.tlt.mergeSptTltActivMonthPln", vo);
  }
  
  /**
   * 익월목표 목록 삭제
   * @author 손태화
   * @param SptTltActivMonthPlnVo 보고서번호
   * @return 
   * @throws KitechException 공통예외
   */
  public int deletePartDetail(SptTltActivMonthPlnVo vo) throws ElException {
	  return delete("kr.re.kitech.biz.sup.tlt.deleteSptTltActivMonthPln", vo);
  }

}
