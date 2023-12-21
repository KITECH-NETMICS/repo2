package kr.re.kitech.biz.pat.pap.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPapManReqInvDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      Chris    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPapManReqInvDAO")
public class PatPapManReqInvDAO extends BizDefaultAbstractDAO {

  /**
   * 출원지시 요청 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public PatPapManReqInvVo selectItem01(PatPapManReqInvVo vo) throws KitechException {
    return (PatPapManReqInvVo) selectByPk("kr.re.kitech.biz.pat.pap.selectPatPapManReqInvSS01", vo);
  }

  /**
   * 출원지시 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public PatPapManReqInvVo selectItem02(PatPapManReqInvVo vo) throws KitechException {
    return (PatPapManReqInvVo) selectByPk("kr.re.kitech.biz.pat.pap.selectPatPapReqInvSS01", vo);
  }

  /**
   * 출원지시 의뢰 결과 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public PatPapManReqInvVo selectItem03(PatPapManReqInvVo vo) throws KitechException {
    return (PatPapManReqInvVo) selectByPk("kr.re.kitech.biz.pat.pap.selectPatPapReeInvSS01", vo);
  }

  /**
   * 동적 등록
   * 
   * @author 
   * @param sqlMapId, PatPapManReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public int executeDynamicInsert(String sqlMapId, PatPapManReqInvVo vo) throws KitechException {
	  return insert(sqlMapId, vo);
  }

  /**
   * 동적 수정
   * 
   * @author 
   * @param sqlMapId, PatPapManReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public int executeDynamicUpdate(String sqlMapId, PatPapManReqInvVo vo) throws KitechException {
	  return update(sqlMapId, vo);
  }


}
