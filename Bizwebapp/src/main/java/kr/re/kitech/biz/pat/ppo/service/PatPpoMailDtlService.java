package kr.re.kitech.biz.pat.ppo.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPpoMailDtlService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.25.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.25.
 * @version 1.0
 * @see
 * 
 */
public interface PatPpoMailDtlService {
  
  /**
   * 지식재산권 메일 상세 조회
   * 
   * @author Chris
   * @param PatPpoMailDtlVo
   * @return PatPpoMailDtlListVo
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public PatPpoMailDtlListVo retrieve(PatPpoMailDtlVo vo) throws KitechException;

  /**
   * 지식재산권 관련첨부파일 조회
   * 
   * @author Chris
   * @param PatPpoRefFileLstVo
   * @return PatPpoRefFileLstListVo
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public PatPpoRefFileLstListVo retrieveFileLst(PatPpoRefFileLstVo vo) throws KitechException;

  /**
   * 지식재산권 메일 발송대상 조회
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return PatPpoMailSaveListVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  public PatPpoMailSaveListVo retrieveMailTargetUserLst(PatPpoMailSaveVo vo) throws KitechException;

  /**
   * 지식재산권 메일 내용 저장
   * 
   * @author Chris
   * @param PatPpoMailSaveListVo
   * @return PatPpoMailSaveVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  public PatPpoMailSaveVo mailSave(PatPpoMailSaveListVo vo) throws KitechException;

}
  