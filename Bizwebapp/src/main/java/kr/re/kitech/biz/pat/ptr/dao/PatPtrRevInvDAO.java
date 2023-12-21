package kr.re.kitech.biz.pat.ptr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : PatPtrRevInvDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPtrRevInvDAO")
public class PatPtrRevInvDAO extends BizDefaultAbstractDAO {

  /**
   * 발명신고서 서지사항 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public PatPtrRevInvVo selectItem01(PatPtrRevInvVo vo) throws KitechException {
    return (PatPtrRevInvVo) selectByPk("kr.re.kitech.biz.pat.ptr.selectPatAppBibliographySS01", vo);
  }

  /**
   * 선행기술조사서 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public PatPtrRevInvVo selectItem02(PatPtrRevInvVo vo) throws KitechException {
    return (PatPtrRevInvVo) selectByPk("kr.re.kitech.biz.pat.ptr.selectPatPtrRevInvSS01", vo);
  }

  /**
   * 선행기술조사 보완요청 보완요청결과 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public PatPtrRevInvVo selectItem03(PatPtrRevInvVo vo) throws KitechException {
    return (PatPtrRevInvVo) selectByPk("kr.re.kitech.biz.pat.ptr.selectPatPtrReeInvSS02", vo);
  }

  /**
   * 선행기술조사 의뢰 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @SuppressWarnings("unchecked")
  public PatPtrRevInvVo selectItem04(PatPtrRevInvVo vo) throws KitechException {
    // 메서드 이름 확인
    Object resultObj = (List < PatPtrRevInvVo > ) list("kr.re.kitech.biz.pat.ptr.selectPatPtrReqInvSS01", vo);

    // 반환 타입 안정성 체크
    if (!(resultObj instanceof List)) {
        throw new KitechException(Exceptions.ERROR, Business.RSP, "Expected a List as a result but received: " + resultObj.getClass().getName());
    }

    List < PatPtrRevInvVo > results = (List < PatPtrRevInvVo > ) resultObj;

    if (results == null || results.isEmpty()) {
        return null;
    }

    if (results.size() > 1) {
        AppLog.debug("Expected a single result for query id kr.re.kitech.biz.pat.ptr.selectPatPtrReqInvSS01, but received " + results.size() + " results. Returning the first one.");
    }

    return results.get(0); // 첫 번째 row 반환
  }

  /**
   * 선행기술조사서 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public PatPtrRevInvVo selectItem05(PatPtrRevInvVo vo) throws KitechException {
    return (PatPtrRevInvVo) selectByPk("kr.re.kitech.biz.pat.ptr.selectPatPtrReeInvSS01", vo);
  }

  /**
   * 선행기술조사서 의뢰내용 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public PatPtrRevInvVo selectItem06(PatPtrRevInvVo vo) throws KitechException {
    return (PatPtrRevInvVo) selectByPk("kr.re.kitech.biz.pat.ptr.selectPatPtrReeInvSS03", vo);
  }

  /**
   * 보완요청 select box 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return List<PatPtrRevInvVo>
   * @throws KitechException
   * @since 2023.09.11.   
   */
  @SuppressWarnings("unchecked")
  public List<PatPtrRevInvVo> selectList01(PatPtrRevInvVo vo) throws KitechException {
    return (List<PatPtrRevInvVo>)list("kr.re.kitech.biz.pat.ptr.selectPatPtrReeCntSS01", vo);
  }

  /**
   * 선행기술조사서 검토 결과 등록 동적 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public PatPtrRevInvVo executeDynamicSelectQuery(String sqlMapId, PatPtrRevInvVo vo) throws KitechException {
	  return (PatPtrRevInvVo) selectByPk(sqlMapId, vo);
  }

  /**
   * 선행기술조사서 검토 결과 등록 동적 수정
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public int executeDynamicUpdateQuery(String sqlMapId, PatPtrRevInvVo vo) throws KitechException {
	  return update(sqlMapId, vo);
  }

  /**
   * 선행기술조사 의뢰 등록
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public int insertPatPtrReqSI01(PatPtrRevInvVo vo) throws KitechException {
	  return insert("kr.re.kitech.biz.pat.ptr.insertPatPtrReqSI01", vo);
  }

  /**
   * 선행기술조사 의뢰 등록
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public int updatePatPtrReqSI02(PatPtrRevInvVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.pat.ptr.updatePatPtrReqSI02", vo);
  }

  /**
   * 특허 마스터 상태변경
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public int updatePatPtrReqMasterSU01(PatPtrRevInvVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.pat.ptr.updatePatPtrReqMasterSU01", vo);
  }
  
  /**
   * 지식재산권 첨부파일 수정
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public int updateAttachmentFilesBySrhId(PatPtrRevInvVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.pat.ptr.updateAttachmentFilesBySrhId", vo);
  }
  

}
