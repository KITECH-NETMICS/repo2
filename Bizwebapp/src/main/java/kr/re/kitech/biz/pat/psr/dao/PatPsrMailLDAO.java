package kr.re.kitech.biz.pat.psr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : PatPsrMailLDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPsrMailLDAO")
public class PatPsrMailLDAO extends BizDefaultAbstractDAO {
  
  /**
   * 출원업무 메일 이력 조회
   * 
   * @author Chris
   * @param PatPsrMailLVo
   * @return List<PatPsrMailLVo>
   * @throws KitechException
   * @since 2023.10.04.   
   */
  public List<PatPsrMailLVo> selectList01(PatPsrMailLVo vo) throws KitechException {
    return (List<PatPsrMailLVo>)list("kr.re.kitech.biz.pat.psr.selectPatPsrMailL", vo);
  }

  /**
   * 출원업무 프로세스 상태 조회
   * 
   * @author Chris
   * @param PatPsrStaVo
   * @return PatPsrStaVo
   * @throws KitechException
   * @since 2023.10.04.   
   */
  @SuppressWarnings("unchecked")
  public PatPsrStaVo selectItem01(PatPsrStaVo vo) throws KitechException {
    // 메서드 이름 확인
    Object resultObj = (List < PatPsrStaVo > ) list("kr.re.kitech.biz.pat.psr.selectPatPsrSta", vo);

    // 반환 타입 안정성 체크
    if (!(resultObj instanceof List)) {
        throw new KitechException(Exceptions.ERROR, Business.RSP, "Expected a List as a result but received: " + resultObj.getClass().getName());
    }

    List < PatPsrStaVo > results = (List < PatPsrStaVo > ) resultObj;

    if (results == null || results.isEmpty()) {
        return null;
    }

    if (results.size() > 1) {
        AppLog.debug("Expected a single result for query id kr.re.kitech.biz.pat.psr.selectPatPsrSta, but received " + results.size() + " results. Returning the first one.");
    }

    return results.get(0); // 첫 번째 row 반환
  }
}
