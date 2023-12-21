package kr.re.kitech.biz.pat.ptl.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPtlResWorkDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.12.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.12.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPtlResWorkDAO")
public class PatPtlResWorkDAO extends BizDefaultAbstractDAO {
  
  /**
   * 번역 제출보고 조회
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return PatPtlResWorkVo
   * @throws KitechException
   * @since 2023.09.12.   
   */
  public PatPtlResWorkVo selectItem01(PatPtlResWorkVo vo) throws KitechException {
    return (PatPtlResWorkVo) selectByPk("kr.re.kitech.biz.pat.ptl.selectPatPtlResCrtSS01", vo);
  }

  /**
   * 번역 제출보고 상세 조회
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return PatPtlResWorkVo
   * @throws KitechException
   * @since 2023.09.12.   
   */
  public PatPtlResWorkVo selectItem02(PatPtlResWorkVo vo) throws KitechException {
    return (PatPtlResWorkVo) selectByPk("kr.re.kitech.biz.pat.ptl.selectPatPtlResDtlSS01", vo);
  }

  /**
   * 번역 제출보고 검토 등록 (주발명자)
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return int
   * @throws KitechException
   * @since 2023.09.12.   
   */
  public int updatePatPtlResCrtSU01(PatPtlResWorkVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ptl.updatePatPtlResCrtSU01", vo);
  }

}
