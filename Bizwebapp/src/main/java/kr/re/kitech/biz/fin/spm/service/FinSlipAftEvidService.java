package kr.re.kitech.biz.fin.spm.service;

import java.util.List;

import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidListVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : FinSlipAftEvidService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      작업자    최초생성
 * 
 * @author
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
public interface FinSlipAftEvidService {
  /**
   * 다건 조회
   * 
   * @author 
   * @param FspSlipDecsnHVo
   * @return List<FspSlipDecsnHVo>
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public List<FinSlipAftEvidListVo> selectSlipAftEvidInfoList(FinSlipAftEvidVo finVo);
  
  /**
   * 저장
   * 
   * @author 
   * @param FspSlipDecsnHVo
   * @return List<FspSlipDecsnHVo>
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public FinSlipAftEvidListVo updateSlipAftEvidInfo(FinSlipAftEvidVo finVo);
}
  