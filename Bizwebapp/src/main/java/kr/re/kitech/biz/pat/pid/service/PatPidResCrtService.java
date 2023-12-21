package kr.re.kitech.biz.pat.pid.service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface PatPidResCrtService {
  
  /**
    * IDS제출 단건 조회
    * @author Chris
    * @since 2023.08.02.
    */
  public PatPidResCrtVo selectSingle(PatPidResCrtVo vo) throws ElException;


  /**
   * IDS 제출보고 조회
   * 
   * @author Chris
   * @param PatPidResCrtVo
   * @return PatPidResCrtVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public PatPidResCrtVo selectItem01(PatPidResCrtVo vo) throws KitechException;


  /**
    * IDS 제출보고 검토 등록 (주발명자)
    * @author Chris
    * @since 2023.08.02.
    */
  public int updateItem(PatPidResCrtVo vo) throws Exception;

}
