package kr.re.kitech.biz.lpl.lcp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.lpl.lcp.dao.LplCustBaseInfoDAO;
import kr.re.kitech.biz.lpl.lcp.service.LplCustBaseInfoService;
import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo;
import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LplCustBaseInfoServiceImpl.java
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
@Service("lplCustBaseInfoServiceImpl")
public class LplCustBaseInfoServiceImpl  extends EgovAbstractServiceImpl implements LplCustBaseInfoService {
  @Resource(name="lplCustBaseInfoDAO")
  private LplCustBaseInfoDAO lcpDAO;
  @Resource(name="generationServiceImpl")
  private GenerationService genService;  
    
  /**
   * 기관정보 목록 조회
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return List<LplCustBaseInfoVo>
   * @throws KitechException
   * @since 2023.11.06.   
   */
  @Override
  public List<LplCustBaseInfoVo> selectList01(LplCustBaseInfoVo vo) throws KitechException {
    List<LplCustBaseInfoVo> list = lcpDAO.selectList01(vo);	
    return list;
  }

  /**
   * 기관정보 상세 조회
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return LplCustBaseInfoVo
   * @throws KitechException
   * @since 2023.11.06.   
   */
  @Override
  public LplCustBaseInfoVo selectLplCustBaseInfoDetal(LplCustBaseInfoVo vo) throws KitechException {
    LplCustBaseInfoVo resultVO = lcpDAO.selectLplCustBaseInfoDetal(vo);			
      return resultVO;
  }
  
  /**
   * 기관중복검사
   * 
   * @author 
   * @param LplCustBaseInfoVo
   * @return List<LplCustBaseInfoVo>
   * @throws KitechException
   * @since 2023.11.06.   
   */
  @Override
  public List<LplCustBaseInfoVo> selectLplCustBaseInfoChk(LplCustBaseInfoVo vo) throws KitechException {
    List<LplCustBaseInfoVo> list = lcpDAO.selectLplCustBaseInfoChk(vo);	
    return list;
  }  

  /**
   * 기관기본정보등록,수정
   * 
   * @author 
   * @param LplCustBaseInfoMerVo
   * @return LplCustBaseInfoMerVo
   * @throws KitechException
   * @since 2023.11.06.   
   */
  @Override
	public LplCustBaseInfoMerVo merLplCustBaseInfo(LplCustBaseInfoMerVo vo) throws KitechException {
	  if ("I".equals(vo.getCud_type())) {
		  vo.setCust_no(genService.getVendCode());
		  lcpDAO.insertLplCustBaseInfo(vo);	
		  vo.setNew_vend_cd(vo.getCust_no());
	  } else if ("U".equals(vo.getCud_type())) {
		  lcpDAO.updateLplCustBaseInfo(vo);
	  }
    return vo;
	}
}
