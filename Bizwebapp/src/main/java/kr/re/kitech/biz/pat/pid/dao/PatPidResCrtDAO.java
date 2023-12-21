package kr.re.kitech.biz.pat.pid.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

  @Repository("patPidResCrtDAO")
  public class PatPidResCrtDAO extends BizDefaultAbstractDAO {
  

  /**
    * IDS제출 단건 조회
    * @author Chris
    * @since 2023.08.02.
    */
  public PatPidResCrtVo selectSingle(PatPidResCrtVo vo) throws ElException {
    return (PatPidResCrtVo) selectByPk("kr.re.kitech.biz.pat.pid.selectPatPidResCrt", vo);
  }

  
  /**
   * IDS 제출보고 조회
   * 
   * @author Chris
   * @param PatPidResCrtVo
   * @return PatPidResDtlVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public PatPidResCrtVo selectItem01(PatPidResCrtVo vo) throws KitechException {
    return (PatPidResCrtVo) selectByPk("kr.re.kitech.biz.pat.pid.selectPatPidResDtl", vo);
  }


  /**
    * IDS 제출보고 검토 등록 (주발명자)
    * @author Chris
    * @since 2023.08.02.
    */
  public int updateItem(PatPidResCrtVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.pid.updatePatPidResCrt", vo);
  }

}
