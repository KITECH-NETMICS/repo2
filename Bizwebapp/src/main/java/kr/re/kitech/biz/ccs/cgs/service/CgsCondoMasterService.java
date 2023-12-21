package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 콘도기본정보 ervice interface
 * @Class Name : CgsCondoMasterService.java
 * @Description : 콘도기본정보 서비스
 * @Modification :   
 *     수정일        lsh     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      작업자    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
public interface CgsCondoMasterService {
  

  /**
   * 콘도기본정보 목록 조회
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return List<CgsCondoMasterVo>
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<CgsCondoMasterVo> selectList(CgsCondoMasterVo vo) throws KitechException;
  
  /**
   * 콘도기본정보 등록
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return int
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public void insertItem(CgsCondoMasterListVo listVo) throws KitechException;
  
  /**
   * 콘도명 셀렉트박스 목록 조회
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return List<CgsCondoMasterVo>
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<CgsCondoMasterVo> selectCondoList(CgsCondoMasterVo vo) throws KitechException;
  
    /**
   * 지역명 셀렉트박스 목록 조회
	 * 
	 * @author lsh
   * @param CgsCondoMasterVo
   * @return List<CgsCondoMasterVo>
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<CgsCondoMasterVo> selectRegionList(CgsCondoMasterVo vo) throws KitechException;
}
