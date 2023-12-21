package kr.re.kitech.biz.hum.bas.service;

import java.util.List;

import kr.re.kitech.biz.hum.bas.vo.HumBasComCdListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo;
import kr.re.kitech.biz.hum.bas.vo.HumOccutypCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumPosiCdVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : HumBasEducMngmtService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      작업자    최초생성
 * 
 * @author
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
public interface HumBasEducMngmtService {
  
  /**
   * 교육훈련통합 조회
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return List<HumBasEducMngmtVo>
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public List<HumBasEducMngmtVo> selectEducMngmtList(HumBasEducMngmtVo basVo);
  
  /**
   * 직종코드 조회
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return List<HumOccutypCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  public List<HumOccutypCdVo> selectHumOccutypCdList(HumBasEducMngmtVo basVo);

  /**
   * 직급코드 조회
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return List<HumPosiCdListVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  public List<HumPosiCdVo> selectHumPosiCdList(HumBasEducMngmtVo basVo);

  /**
   * 교육훈련 코드조회
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  public List<HumBasComCdVo> selectHumComCdList(HumBasComCdVo basVo);

  /**
   * 교육훈련 코드저장
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  public void selectHumComCdSave(HumBasComCdListVo basVo);

  /**
   * 교육구분, 교육명 비교
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  public List<HumBasEducMngmtVo> selectHumCmpCdInfo(HumBasEducMngmtVo basVo);

  /**
   * 교육훈련 내역 저장
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.26.
   */
  public void saveEducMngmtInfo(HumBasEducMngmtListVo basVo);
  
  /**
   * (RPA) 직원명부 엑셀내리기
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.26.
   */
  public List<HumBasEducMngmtVo> selectEducMngmtInfoExcel_1(HumBasEducMngmtVo basVo);
  
  /**
   * (RPA) 교육결과 엑셀내리기
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.26.
   */
  public List<HumBasEducMngmtVo> selectEducMngmtInfoExcel_2(HumBasEducMngmtVo basVo);
}
  