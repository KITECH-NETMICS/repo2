package kr.re.kitech.biz.pat.ipd.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivListVo;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo;


/**
 * @ClassSubJect 
 * @ClassName : PatIpdRightDivService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.29.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.29.
 * @version 1.0
 * @see
 * 
 */
public interface PatIpdRightDivService {

  /**
   * 우선권/분할 신청서 조회
   * 
   * @author Chris
   * @param PatIpdRightDivVo
   * @return List<PatIpdRightDivVo>
   * @throws KitechException
   * @since 2023.11.29.
   */
  public List<PatIpdRightDivVo> patIpdRightDivSelectList(PatIpdRightDivVo vo) throws KitechException;
  
  /**
   * 우선권/분할 신청서 조회
   * 
   * @author Chris
   * @param PatIpdRightDivVo
   * @return PatIpdRightDivListVo
   * @throws KitechException
   * @since 2023.11.29.
   */
  public PatIpdRightDivListVo retrieveDraftInfo(PatIpdRightDivVo vo) throws KitechException;

  /**
   * 우선권/분할 신청서 임시저장
   * 
   * @author Chris
   * @param PatIpdRightDivListVo
   * @return PatIpdRightDivVo
   * @throws KitechException
   * @since 2023.11.29.
   */
  public PatIpdRightDivVo patIpdtempSave(PatIpdRightDivListVo vo) throws KitechException;

  
  /**
   * 신청서 삭제
   * 
   * @author Chris
   * @param PatIpdRightDivVo
   * @return int
   * @throws KitechException
   * @since 2023.11.29.
   */
	public int deletePatAprInfo(PatIpdRightDivVo vo) throws KitechException;

  /**
   * 우선권/분할 결재 신청
   * 
   * @author Chris
   * @param PatIpdRightDivListVo
   * @return PatIpdRightDivVo
   * @throws KitechException
   * @since 2023.11.29.
   */
  public PatIpdRightDivVo approval(PatIpdRightDivListVo vo) throws KitechException;

}
  