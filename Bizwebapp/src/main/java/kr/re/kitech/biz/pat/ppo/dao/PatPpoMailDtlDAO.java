package kr.re.kitech.biz.pat.ppo.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo;

/**
 * @ClassSubJect 
 * @ClassName : PatPpoMailDtlDAO.java
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
@Repository("patPpoMailDtlDAO")
public class PatPpoMailDtlDAO extends BizDefaultAbstractDAO {
  
  /**
   * 메일 상세 조회
   * 
   * @author Chris
   * @param PatPpoMailDtlVo
   * @return List<PatPpoMailDtlVo>
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public List<PatPpoMailDtlVo> selectList01(PatPpoMailDtlVo vo) throws KitechException {
    return (List<PatPpoMailDtlVo>)list("kr.re.kitech.biz.pat.ppo.selectPatPpoMailDtlSS02", vo);
  }

  /**
   * 메일 상세 조회
   * 
   * @author Chris
   * @param PatPpoMailDtlVo
   * @return List<PatPpoMailDtlVo>
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public List<PatPpoMailDtlVo> selectList02(PatPpoMailDtlVo vo) throws KitechException {
    return (List<PatPpoMailDtlVo>)list("kr.re.kitech.biz.pat.ppo.selectPatPpoMailDtlSS03", vo);
  }

  /**
   * 메일 상세 조회
   * 
   * @author Chris
   * @param PatPpoMailDtlVo
   * @return PatPpoMailDtlVo
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public PatPpoMailDtlVo selectItem01(PatPpoMailDtlVo vo) throws KitechException {
    return (PatPpoMailDtlVo) selectByPk("kr.re.kitech.biz.pat.ppo.selectPatPpoMailDtlSS01", vo);
  }

  /**
   * 서지사항 조회
   * 
   * @author Chris
   * @param PatPpoRefFileLstVo
   * @return PatPpoRefFileLstVo
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public PatPpoRefFileLstVo selectItem02(PatPpoRefFileLstVo vo) throws KitechException {
    return (PatPpoRefFileLstVo) selectByPk("kr.re.kitech.biz.pat.ppo.selectPatBibliographySS01", vo);
  }

  /**
   * 관련첨부파일 조회
   * 
   * @author Chris
   * @param PatPpoRefFileLstVo
   * @return List<PatPpoRefFileLstVo>
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public List<PatPpoRefFileLstVo> selectList03(PatPpoRefFileLstVo vo) throws KitechException {
    return (List<PatPpoRefFileLstVo>)list("kr.re.kitech.biz.pat.ppo.selectPatPpoRefFileLstSS01", vo);
  }

  /**
   * 국내 관련 파일 조회
   * 
   * @author Chris
   * @param PatPpoRefFileLstVo
   * @return List<PatPpoRefFileLstVo>
   * @throws KitechException
   * @since 2023.10.25.   
   */
  public List<PatPpoRefFileLstVo> selectList04(PatPpoRefFileLstVo vo) throws KitechException {
    return (List<PatPpoRefFileLstVo>)list("kr.re.kitech.biz.pat.ppo.selectPatPpoKRRefFileLstSS01", vo);
  }

  /**
   * 국내 관련 파일 조회
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return List<PatPpoMailSaveVo>
   * @throws KitechException
   * @since 2023.10.26.   
   */
  public List<PatPpoMailSaveVo> selectList05(PatPpoMailSaveVo vo) throws KitechException {
    return (List<PatPpoMailSaveVo>)list("kr.re.kitech.biz.pat.ppo.selectPatPpoMailTargetUserLstSS01", vo);
  }

  /**
   * 서지사항 조회
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return PatPpoMailSaveVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  public PatPpoMailSaveVo selectItem03(PatPpoMailSaveVo vo) throws KitechException {
    return (PatPpoMailSaveVo) selectByPk("kr.re.kitech.biz.pat.ppo.selectPatPpoMailInfoSS01", vo);
  }

  /**
   * 메일 정보 조회
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return PatPpoMailSaveVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  public PatPpoMailSaveVo selectItem04(PatPpoMailSaveVo vo) throws KitechException {
    return (PatPpoMailSaveVo) selectByPk("kr.re.kitech.biz.pat.ppo.selectPatPpoMailSaveSS01", vo);
  }

  /**
   * 메일 메인 저장
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return PatPpoMailSaveVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  public int insertItem01(PatPpoMailSaveVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ppo.insertPatPpoMailSaveSI01", vo);
  }

  /**
   * 메일 수신자 저장
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return PatPpoMailSaveVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  public int insertItem02(PatPpoMailSaveVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.ppo.insertPatPpoMailSaveSI02", vo);
  }

}
