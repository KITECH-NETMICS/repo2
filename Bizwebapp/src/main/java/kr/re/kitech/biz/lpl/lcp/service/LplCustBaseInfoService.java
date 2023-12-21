package kr.re.kitech.biz.lpl.lcp.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo;
import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LplCustBaseInfoService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.06.      author    최초생성
 * 
 * @author 
 * @since 2023.11.06.
 * @version 1.0
 * @see
 * 
 */
public interface LplCustBaseInfoService {
  
  /**
   * 기관정보 목록조회
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return List<LplCustBaseInfoVo>
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public List<LplCustBaseInfoVo> selectList01(LplCustBaseInfoVo vo) throws KitechException;

  /**
   * 기관정보 상세조회
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return LplCustBaseInfoVo
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public LplCustBaseInfoVo selectLplCustBaseInfoDetal(LplCustBaseInfoVo vo) throws KitechException;

  /**
   * 기관중복 검사
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return List<LplCustBaseInfoVo>
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public List<LplCustBaseInfoVo> selectLplCustBaseInfoChk(LplCustBaseInfoVo vo) throws KitechException;
  
  /**
   * 기관기본정보등록,수정
   * 
   * @author 
   * @param LplCustBaseInfoMerVo
   * @return LplCustBaseInfoMerVo
   * @throws KitechException
   * @since 2023.11.06.   
   */
  public LplCustBaseInfoMerVo merLplCustBaseInfo(LplCustBaseInfoMerVo vo) throws KitechException;

}
  