package kr.re.kitech.biz.pat.psr.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPsrMailLService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
public interface PatPsrMailLService {
  
  /**
   * 출원업무 메일 이력 조회
   * 
   * @author Chris
   * @param PatPsrMailLVo
   * @return List<PatPsrMailLVo>
   * @throws KitechException
   * @since 2023.10.04.   
   */
  public List<PatPsrMailLVo> selectList01(PatPsrMailLVo vo) throws KitechException;

  /**
   * 출원업무 프로세스 상태 조회
   * 
   * @author Chris
   * @param PatPsrStaVo
   * @return PatPsrStaVo
   * @throws KitechException
   * @since 2023.10.04.   
   */
  public PatPsrStaVo selectItem01(PatPsrStaVo vo) throws KitechException;

}
  