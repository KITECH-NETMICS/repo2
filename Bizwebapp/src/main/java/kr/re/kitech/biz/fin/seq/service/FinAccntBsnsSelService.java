package kr.re.kitech.biz.fin.seq.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo;


/**
 * @ClassSubJect 계정별사업수행현황
 * @ClassName : FinAccntBsnsSelService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.      이지훈    최초생성
 * 
 * @author 이지훈
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
public interface FinAccntBsnsSelService {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param FinAccntBsnsSelVo
   * @return List<FinAccntBsnsSelVo>
   * @throws KitechException
   * @since 2023.10.04.   
   */
  public List<FinAccntBsnsSelVo> selectList01(FinAccntBsnsSelVo vo) throws KitechException;



}
  