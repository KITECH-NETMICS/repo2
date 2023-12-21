package kr.re.kitech.biz.pat.app.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeListVo;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeVo;


/**
 * @ClassSubJect 
 * @ClassName : PatAppChangeService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
public interface PatAppChangeService {
  
  /**
   * 변경신청 조회
   * 
   * @author Chris
   * @param PatAppChangeVo
   * @return List<PatAppChangeVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<PatAppChangeVo> selectChangeList(PatAppChangeVo vo) throws KitechException;

  /**
   * 변경신청 상세 조회
   * 
   * @author Chris
   * @param PatAppChangeVo
   * @return PatAppChangeListVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public PatAppChangeListVo selectChngInfo(PatAppChangeVo vo) throws KitechException;

  
  /**
   * 공동발명자, 출원인, 연구과제 변경신청 저장
   * 
   * @author Chris
   * @param PatAppChangeListVo
   * @return PatAppChangeVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public PatAppChangeVo savePatChngHis(PatAppChangeListVo vo) throws KitechException;

  /**
   * 변경이력 삭제
   * 
   * @author Chris
   * @param PatAppChangeListVo
   * @return int
   * @throws KitechException
   * @since 2023.11.22.
   */
  public int deletePatChngHis(PatAppChangeVo vo) throws KitechException;

  /**
   * 변경(공동발명자 지분율)내역 조회
   * 
   * @author Chris
   * @param PatAppChangeListVo
   * @return PatAppChangeListVo
   * @throws KitechException
   * @since 2023.11.22.
   */
  public PatAppChangeListVo selectHisResult(PatAppChangeVo vo) throws KitechException;

  /**
   * 출원인 변경신청시 공동발명자 조회
   * 
   * @author Chris
   * @param PatAppChangeVo
   * @return List<PatAppChangeVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<PatAppChangeVo> getInvenPsn(PatAppChangeVo vo) throws KitechException;

  /**
   * 연구과제 변경신청시 주발명자 조회
   * 
   * @author Chris
   * @param PatAppChangeVo
   * @return PatAppChangeVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public PatAppChangeVo getMainInvenPsn(PatAppChangeVo vo) throws KitechException;

  /**
   * 변경 결재 신청
   * 
   * @author Chris
   * @param PatAppChangeListVo
   * @return PatAppChangeVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public PatAppChangeVo approval(PatAppChangeListVo vo) throws KitechException;

  /**
   * 지재권 기본 정보 조회
   * 
   * @author Chris
   * @param PatAppChangeVo
   * @return PatAppChangeVo
   * @throws KitechException
   * @since 2023.11.23.
   */
  public PatAppChangeVo selectBasicInfo(PatAppChangeVo vo) throws KitechException;

}
  