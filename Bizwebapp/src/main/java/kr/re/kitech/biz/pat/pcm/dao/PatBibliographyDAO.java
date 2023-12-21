package kr.re.kitech.biz.pat.pcm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

  @Repository("patBibliographyDAO")
  public class PatBibliographyDAO extends BizDefaultAbstractDAO {
  
  /**
    * 선행기술조사서 단건 조회
    * @author Chris
    * @since 2023.08.01.
    */
  @SuppressWarnings("unchecked")
  public PatBibliographyVo selectSingle(PatBibliographyVo vo) throws KitechException {
	// 메서드 이름 확인
	Object resultObj = (List < PatBibliographyVo > ) list("kr.re.kitech.biz.pat.pcm.selectPatBibliography", vo);
	
	// 반환 타입 안정성 체크
	if (!(resultObj instanceof List)) {
	    throw new KitechException(Exceptions.ERROR, Business.RSP, "Expected a List as a result but received: " + resultObj.getClass().getName());
	}
	
	List < PatBibliographyVo > results = (List < PatBibliographyVo > ) resultObj;
	
	if (results == null || results.isEmpty()) {
	    return null;
	}
	
	if (results.size() > 1) {
	    AppLog.debug("Expected a single result for query id kr.re.kitech.biz.pat.pcm.selectPatBibliography, but received " + results.size() + " results. Returning the first one.");
	}
	
	return results.get(0); // 첫 번째 row 반환
  }

}
