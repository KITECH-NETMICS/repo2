package kr.re.kitech.biz.lpl.lcp.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.lpl.lcp.dao.LcpMouDomDAO;
import kr.re.kitech.biz.lpl.lcp.service.LcpMouDomService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : LcpMouDomServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      author    최초생성
 * 
 * @author 
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
@Service("lcpMouDomServiceImpl")
public class LcpMouDomServiceImpl extends EgovAbstractServiceImpl implements LcpMouDomService {
  @Resource(name="lcpMouDomDAO")
  private LcpMouDomDAO lcpDAO;

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;

  @Resource(name="apprFuncServiceImpl")
  private ApprFuncService apprFuncService;

  @Resource(name="generationServiceImpl")
  private GenerationService genService;
    
  /**
   * 다건 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public List<LcpMouDomVo> selectList01(LcpMouDomVo vo) throws KitechException {
    List<LcpMouDomVo> list = lcpDAO.selectList01(vo);	
    return list;
  }
  
  /**
   * 액셀 리스트 조회
   * 
   * @author 
   * @param LcpMouDomExcelVo
   * @return List<LcpMouDomExcelVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public List<LcpMouDomExcelVo> selectList02(LcpMouDomVo vo) throws KitechException {
    List<LcpMouDomExcelVo> list = lcpDAO.selectList02(vo);	
    return list;
  }
  
  /**
   * 실무자 그리드 셋팅  조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public List<LcpMouDomVo> selectLcpMouDomUserGrid(LcpMouDomVo vo) throws KitechException {
    List<LcpMouDomVo> list = lcpDAO.selectLcpMouDomUserGrid(vo);	
    return list;
  }
  
  /**
   * 실무자 유저  조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouUserVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public List<LcpMouUserVo> selectLcpMouDomUser(LcpMouDomVo vo) throws KitechException {
    List<LcpMouUserVo> list = lcpDAO.selectLcpMouDomUser(vo);	
    return list;
  }      

  /**
   * 단건 조회
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return LcpMouDomVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public LcpMouDomFormVo selectLcpMouDomForm(LcpMouDomVo vo) throws KitechException {
    LcpMouDomFormVo resultVO = lcpDAO.selectLcpMouDomForm(vo);			
      return resultVO;
  }
  
  /**
   * 국내협약 사후관리 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomAftrVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public List<LcpMouDomAftrVo> selectLcpMouDomAfter(LcpMouDomVo vo) throws KitechException {
    List<LcpMouDomAftrVo> list = lcpDAO.selectLcpMouDomAfter(vo);	
    return list;
  }
  
  /**
   * 국내협약 사후관리 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomAgencyVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public List<LcpMouDomAgencyVo> selectLcpMouDomAgy(LcpMouDomVo vo) throws KitechException {
    List<LcpMouDomAgencyVo> list = lcpDAO.selectLcpMouDomAgy(vo);	
    return list;
  }    

  /**
   * 국내협약사후저장, 수정, 삭제
   * 
   * @author 
   * @param LcpMouAfactListVo
   * @return LcpMouDomFormVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
	public LcpMouDomFormVo crudInfoDom(LcpMouDomListVo vo) throws KitechException {
	  String reqNo = vo.getLcpMouDomFormVo().getMou_no();
	  String cudType = "";
	  String saveClsf = vo.getLcpMouDomFormVo().getCud_type();
	  String AfcDelRowFlag = vo.getLcpMouDomFormVo().getAfc_row_flag();
	  String AfcDelRowOdrs = vo.getLcpMouDomFormVo().getAfc_del_row_odr();
	  String AgyDelRowFlag = vo.getLcpMouDomFormVo().getAgy_row_flag();
	  String AgyDelRowOdrs = vo.getLcpMouDomFormVo().getAgy_del_row_odr();
	  if ("I".equals(saveClsf)) {
		  //신청번호 채번
		  reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "L1B");
		  vo.getLcpMouDomFormVo().setMou_no(reqNo);		  
		  lcpDAO.insertLcpMouDomForm(vo.getLcpMouDomFormVo());
		  List<LcpMouUserVo> LcpMouUserVoList = vo.getLcpMouUserVoList();
		  for (LcpMouUserVo userVo : LcpMouUserVoList) {//국내협약사용자
			  userVo.setMou_no(reqNo);
			  lcpDAO.insertLcpMouUser(userVo);
		  }
	  } else if ("U".equals(saveClsf) ) {
		  lcpDAO.updateLcpMouDomForm(vo.getLcpMouDomFormVo());
		  List<LcpMouUserVo> LcpMouUserVoList = vo.getLcpMouUserVoList();
		  for (LcpMouUserVo userVo : LcpMouUserVoList) {//국내협약사용자
			  userVo.setMou_no(reqNo);
			  lcpDAO.updateLcpMouUser(userVo);
		  }		  
	  } else if ("D".equals(saveClsf) ) { 
		  vo.getLcpMouDomFormVo().setAgy_del_odr("");
		  vo.getLcpMouDomFormVo().setAfc_del_odr("");
		  lcpDAO.deleteLcpMouDomAftr(vo.getLcpMouDomFormVo()); // 사후관리 그리드 목록 전체 삭제
		  lcpDAO.deleteLcpMouDomAgency(vo.getLcpMouDomFormVo()); // 국내협약긴관정보 그리드 목록 전체 삭제
		  lcpDAO.deleteLcpMouDomForm(vo.getLcpMouDomFormVo());
		  lcpDAO.deleteLcpMouUserForm(vo.getLcpMouDomFormVo()); //국내협약 사용자 삭제
	  }
	  if (!"D".equals(saveClsf)) {
		  if ("D".equals(AgyDelRowFlag)) {// 협약기관 단건 삭제
			  String[] AgyDelRowOdrArray = AgyDelRowOdrs.split("\\s+");
			  ArrayList<String> AgyDelRowOdr = new ArrayList<>(Arrays.asList(AgyDelRowOdrArray));
			  for (String AgyDelOdr : AgyDelRowOdr) { 
				  vo.getLcpMouDomFormVo().setAgy_del_odr(AgyDelOdr);
				  lcpDAO.deleteLcpMouDomAgency(vo.getLcpMouDomFormVo()); // 그리드 목록 단일 삭제
			  }
		  }
		  if ("D".equals(AfcDelRowFlag)) {// 사후관리 단건 삭제
			  String[] AfcDelRowOdrArray = AfcDelRowOdrs.split("\\s+");
			  ArrayList<String> AfcDelRowOdr = new ArrayList<>(Arrays.asList(AfcDelRowOdrArray));
			  for (String AfcDelOdr : AfcDelRowOdr) {
				  vo.getLcpMouDomFormVo().setAfc_del_odr(AfcDelOdr);
				  lcpDAO.deleteLcpMouDomAftr(vo.getLcpMouDomFormVo()); // 그리드 목록 단일 삭제
			  }
		  }		  
	  }	
	  //사후관리
	  for (int i = 0; i < vo.getLcpMouDomAftrVoList().size(); i++) {
		  LcpMouDomAftrVo afcVo = new LcpMouDomAftrVo();
		  afcVo = vo.getLcpMouDomAftrVoList().get(i);
		  cudType = afcVo.getCud_type();

		  if ("I".equals(saveClsf)) {
			  afcVo.setMou_no(reqNo);
			  lcpDAO.insertLcpMouDomAftr(afcVo); 	
		  } else {
			  if ("C".equals(cudType)) {
				  afcVo.setMou_no(reqNo);
				  lcpDAO.insertLcpMouDomAftr(afcVo); 
			  } else if ("U".equals(cudType)) {   			
				  lcpDAO.updateLcpMouDomAftr(afcVo);    			
			  }   	
		  }    	
	  }	  
	  for (int i = 0; i < vo.getLcpMouDomAgencyVoList().size(); i++) {
		  LcpMouDomAgencyVo audencVo = new LcpMouDomAgencyVo();
		  audencVo = vo.getLcpMouDomAgencyVoList().get(i);
		  cudType = audencVo.getCud_type();

		  if ("I".equals(saveClsf)) {
			  audencVo.setMou_no(reqNo);
			  lcpDAO.insertLcpMouDomAgcy(audencVo); 	
		  } else {
			  if ("C".equals(cudType)) {
				  audencVo.setMou_no(reqNo);
				  lcpDAO.insertLcpMouDomAgcy(audencVo); 	
			  } else if ("U".equals(cudType)) {
				  lcpDAO.updateLcpMouDomAgcy(audencVo);    			
			  }   	
		  }    	
	  } 	  	      
	  return vo.getLcpMouDomFormVo();
	}
}
