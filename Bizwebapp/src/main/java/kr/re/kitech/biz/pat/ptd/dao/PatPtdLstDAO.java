package kr.re.kitech.biz.pat.ptd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 클래스 제목
 * @ClassName : PatPtdLstDAO.java
 * @Description : 클래스 설명
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      작업자    최초생성
 * 
 * @author 작업자
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPtdLstDAO")
public class PatPtdLstDAO extends BizDefaultAbstractDAO {
  
  /**
   * 출원업무대기함 업무공통탭 조회
   * 
   * @author 
   * @param PatPtdLstVo
   * @return List<PatPtdLstVo>
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public List<PatPtdLstVo> selectList01(PatPtdLstVo vo) throws KitechException {
    return (List<PatPtdLstVo>)list("kr.re.kitech.biz.pat.ptd.selectPatPtdLst", vo);
  }

  /**
   * 마스터 정보 조회
   * 
   * @author 
   * @param PatPtdLstVo
   * @return PatPtdLstVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public PatPtdLstVo selectPatPsrMstInfoSS01(PatPtdLstVo vo) throws KitechException {
    return (PatPtdLstVo) selectByPk("kr.re.kitech.biz.pat.ptd.selectPatPsrMstInfoSS01", vo);
  }

  /**
   * 선행기술조사 자동 의뢰
   * 
   * @author 
   * @param PatPtdLstVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int insertPatComMstSrhReqSI01(PatPtdLstVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ptd.insertPatComMstSrhReqSI01", vo);
  }

  /**
   * 지심의 결과등록 후 명세서 데이터 작성
   * 
   * @author 
   * @param PatPtdLstVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int insertPatPseRstSI01(PatPtdLstVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ptd.insertPatPseRstSI01", vo);
  }

  /**
   * 명세서 보완요청 결과 등록 후 출원 데이터 작성
   * 
   * @author 
   * @param PatPtdLstVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int insertPatPtsRecSI01(PatPtdLstVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ptd.insertPatPtsRecSI01", vo);
  }

  /**
   * 우선심사 의뢰 대기 상태 생성
   * 
   * @author 
   * @param PatPtdLstVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int insertPatComMstPEInfoSI01(PatPtdLstVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ptd.insertPatComMstPEInfoSI01", vo);
  }

  /**
   * 출원지시 결과작성 완료 후 심사청구 등록
   * 
   * @author 
   * @param PatPtdLstVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int insertPatPapReeSI01(PatPtdLstVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ptd.insertPatPapReeSI01", vo);
  }

  /**
   * 지재권 상태 업데이트
   * 
   * @author 
   * @param PatPtdLstVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int updatePatComMstStateSU01(PatPtdLstVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ptd.updatePatComMstStateSU01", vo);
  }

}
