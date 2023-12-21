package kr.re.kitech.biz.pat.psr.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPsrInquiryManageDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.01.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.01.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPsrInquiryManageDAO")
public class PatPsrInquiryManageDAO extends BizDefaultAbstractDAO {
  
  /**
   * 지재권 목록 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public List<PatPsrInquiryManageVo> selectPatPsrLst01(PatPsrInquiryManageVo vo) throws KitechException {
    return (List<PatPsrInquiryManageVo>)list("kr.re.kitech.biz.pat.psr.selectPatPsrLst01", vo);
  }

  /**
   * 단건 조회
   * 
   * @author Chris
   * @param sqlMapId, PatPsrInquiryManageVo
   * @return PatPsrInquiryManageVo
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public PatPsrInquiryManageVo executeDynamicSelect(String sqlMapId, PatPsrInquiryManageVo vo) throws KitechException {
    return (PatPsrInquiryManageVo) selectByPk("kr.re.kitech.biz.pat.psr." + sqlMapId, vo);
  }

  /**
   * 다건 조회
   * 
   * @author Chris
   * @param sqlMapId, PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public List<PatPsrInquiryManageVo> executeDynamicSelectList(String sqlMapId, PatPsrInquiryManageVo vo) throws KitechException {
    return (List<PatPsrInquiryManageVo>)list("kr.re.kitech.biz.pat.psr." + sqlMapId, vo);
  }

  /**
   * 단건 수정
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return int
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public int executeDynamicUpdate(String sqlMapId, PatPsrInquiryManageVo vo) throws KitechException {
    return update("kr.re.kitech.biz.pat.psr." + sqlMapId, vo);
  }

}
