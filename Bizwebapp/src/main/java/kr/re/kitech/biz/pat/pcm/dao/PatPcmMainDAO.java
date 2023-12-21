package kr.re.kitech.biz.pat.pcm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : PatPcmMainDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.04.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.04.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPcmMainDAO")
public class PatPcmMainDAO extends BizDefaultAbstractDAO {
  
  /**
   * 출원업무공통탭 파라미터 조회
   * 
   * @author 
   * @param sqlMapId, PatPcmMainVo
   * @return PatPcmMainVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @SuppressWarnings("unchecked")
  public PatPcmMainVo selectPatPcmMain(String sqlMapId, PatPcmMainVo vo) throws KitechException {
      // 메서드 이름 확인
      Object resultObj = (List < PatPcmMainVo > ) list(sqlMapId, vo);

      // 반환 타입 안정성 체크
      if (!(resultObj instanceof List)) {
          throw new KitechException(Exceptions.ERROR, Business.RSP, "Expected a List as a result but received: " + resultObj.getClass().getName());
      }

      List < PatPcmMainVo > results = (List < PatPcmMainVo > ) resultObj;

      if (results == null || results.isEmpty()) {
          return null;
      }

      if (results.size() > 1) {
          AppLog.debug("Expected a single result for query id " + sqlMapId + ", but received " + results.size() + " results. Returning the first one.");
      }

      return results.get(0); // 첫 번째 row 반환
  }
  
  public PatPcmMainVo selectPatPcmMainSS21(PatPcmMainVo vo) throws KitechException {
    return (PatPcmMainVo) selectByPk("kr.re.kitech.biz.pat.pcm.selectPatPcmMainSS21", vo);
  }
  
  public PatPcmMainVo selectPatPcmMainSS23(PatPcmMainVo vo) throws KitechException {
    return (PatPcmMainVo) selectByPk("kr.re.kitech.biz.pat.pcm.selectPatPcmMainSS23", vo);
  }
  
  public PatPcmMainVo selectPatTodoWorkId(PatPcmMainVo vo) throws KitechException {
    return (PatPcmMainVo) selectByPk("kr.re.kitech.biz.pat.pcm.selectPatTodoWorkId", vo);
  }
  
  @SuppressWarnings("unchecked")
  public List<PatPcmMainVo> selectPatTodoMainKey(PatPcmMainVo vo) throws KitechException {
    return (List<PatPcmMainVo>) list("kr.re.kitech.biz.pat.pcm.selectPatTodoMainKey", vo);
  }

}
