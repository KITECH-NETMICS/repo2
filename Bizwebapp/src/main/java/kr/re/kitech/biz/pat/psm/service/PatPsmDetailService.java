package kr.re.kitech.biz.pat.psm.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailListVo;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPsmDetailService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.08.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.08.
 * @version 1.0
 * @see
 * 
 */
public interface PatPsmDetailService {
  
  /**
   * 소연심의 상세조회
   * 
   * @author Chris
   * @param PatPsmDetailVo
   * @return PatPsmDetailVo
   * @throws KitechException
   * @since 2023.11.08.
   */
  public PatPsmDetailListVo retrieveExamDtl(PatPsmDetailVo vo) throws KitechException;

  /**
   * 첨부파일 수정
   * 
   * @author Chris
   * @param PatPsmDetailVo
   * @return int
   * @throws KitechException
   * @since 2023.11.08.
   */
	public int saveExamAttach(PatPsmDetailVo vo) throws KitechException;

  /**
   * 첨부파일 다운로드
   * 
   * @author Chris
   * @param PatPsmDetailVo
   * @return PatPsmDetailVo
   * @throws KitechException
   * @since 2023.11.08.
   */
	public PatPsmDetailVo patFileSearch(PatPsmDetailVo vo) throws KitechException;

}
  