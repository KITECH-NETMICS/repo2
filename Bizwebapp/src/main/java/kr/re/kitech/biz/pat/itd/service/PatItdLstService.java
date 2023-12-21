package kr.re.kitech.biz.pat.itd.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.itd.vo.PatItdLstVo;


/**
 * @ClassSubJect 
 * @ClassName : PatItdLstService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.30.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.30.
 * @version 1.0
 * @see
 * 
 */
public interface PatItdLstService {
  
  /**
   * 출원업무대기함 조회
   * 
   * @author Chris
   * @param PatItdLstVo
   * @return List<PatItdLstVo>
   * @throws KitechException
   * @since 2023.10.30.   
   */
  public List<PatItdLstVo> selectList01(PatItdLstVo vo) throws KitechException;

}
  