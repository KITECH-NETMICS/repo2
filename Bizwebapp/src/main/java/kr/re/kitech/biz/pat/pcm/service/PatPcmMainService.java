package kr.re.kitech.biz.pat.pcm.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPcmMainService.java
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
public interface PatPcmMainService {
  

  /**
   * 출원업무공통탭 파라미터 조회
   * 
   * @author 
   * @param PatPcmMainVo
   * @return PatPcmMainVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  public PatPcmMainVo selectParam(PatPcmMainVo vo) throws KitechException;

}
  