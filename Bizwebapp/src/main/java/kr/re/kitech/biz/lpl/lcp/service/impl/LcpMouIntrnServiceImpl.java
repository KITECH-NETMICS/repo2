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
import kr.re.kitech.biz.lpl.lcp.dao.LcpMouIntrnDAO;
import kr.re.kitech.biz.lpl.lcp.service.LcpMouIntrnService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : LcpMouIntrnServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.20.      author    최초생성
 * 
 * @author 
 * @since 2023.11.20.
 * @version 1.0
 * @see
 * 
 */
@Service("lcpMouIntrnServiceImpl")
public class LcpMouIntrnServiceImpl extends EgovAbstractServiceImpl implements LcpMouIntrnService {
  @Resource(name="lcpMouIntrnDAO")
  private LcpMouIntrnDAO lcpDAO;

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
   * @param LcpMouIntrnVo
   * @return List<LcpMouIntrnVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  @Override
  public List<LcpMouIntrnVo> selectList01(LcpMouIntrnVo vo) throws KitechException {
    List<LcpMouIntrnVo> list = lcpDAO.selectList01(vo);	
    return list;
  }

  /**
   * 국제협약 상세 조회
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return LcpMouIntrnVo
   * @throws KitechException
   * @since 2023.11.20.
   */
  @Override
  public LcpMouIntrnVo selectItem01(LcpMouIntrnVo vo) throws KitechException {
    LcpMouIntrnVo resultVO = lcpDAO.selectLcpMouIntrnDetail(vo);			
      return resultVO;
  }
  
  /**
   * 국내협약기관정보 다건 조회
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return List<LcpMouIntrnVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  @Override
  public List<LcpMouDomAgencyVo> selectList02(LcpMouDomAgencyVo vo) throws KitechException {
    List<LcpMouDomAgencyVo> list = lcpDAO.selectLcpMouDomAgency(vo);	
    return list;
  }
  
  /**
   * 국제협약사후관리조회 다건 조회
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return List<LcpMouIntrnVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  @Override
  public List<LcpMouAfactVo> selectList03(LcpMouAfactVo vo) throws KitechException {
    List<LcpMouAfactVo> list = lcpDAO.selectLcpMouAfact(vo);	
    return list;
  }     

  /**
   * 국제협약사후저장, 수정, 삭제
   * 
   * @author 
   * @param LcpMouAfactListVo
   * @return LcpMouIntrnVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
	public LcpMouIntrnVo crudInfo(LcpMouIntrnListVo vo) throws KitechException {
	  String reqNo = vo.getLcpMouIntrnVo().getMou_no();
	  String cudType = "";
	  String saveClsf = vo.getLcpMouIntrnVo().getCud_type();
	  String AfcDelRowFlag = vo.getLcpMouIntrnVo().getAfc_row_flag();
	  String AfcDelRowOdrs = vo.getLcpMouIntrnVo().getAfc_del_row_odr();
	  String AgyDelRowFlag = vo.getLcpMouIntrnVo().getAgy_row_flag();
	  String AgyDelRowOdrs = vo.getLcpMouIntrnVo().getAgy_del_row_odr();
	  if ("I".equals(saveClsf)) {
		  //신청번호 채번
		  reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "L15");
		  vo.getLcpMouIntrnVo().setMou_no(reqNo);		  
		  lcpDAO.insertLcpMouIntrn(vo.getLcpMouIntrnVo());
	  } else if ("U".equals(saveClsf) ) {
		  lcpDAO.updateLcpMouIntrn(vo.getLcpMouIntrnVo());
	  } else if ("D".equals(saveClsf) ) { 
		  vo.getLcpMouIntrnVo().setAgy_del_odr("");
		  vo.getLcpMouIntrnVo().setAfc_del_odr("");
		  lcpDAO.deleteLcpMouAfcIntrn(vo.getLcpMouIntrnVo()); // 사후관리 그리드 목록 전체 삭제
		  lcpDAO.deleteLcpMouAgyIntrn(vo.getLcpMouIntrnVo()); // 국내협약긴관정보 그리드 목록 전체 삭제
		  lcpDAO.deleteLcpMouIntrn(vo.getLcpMouIntrnVo());
	  }
	  if (!"D".equals(saveClsf)) {
		  if ("D".equals(AgyDelRowFlag)) {// 협약기관 단건 삭제
			  String[] AgyDelRowOdrArray = AgyDelRowOdrs.split("\\s+");
			  ArrayList<String> AgyDelRowOdr = new ArrayList<>(Arrays.asList(AgyDelRowOdrArray));
			  for (String AgyDelOdr : AgyDelRowOdr) { 
				  vo.getLcpMouIntrnVo().setAgy_del_odr(AgyDelOdr);
				  lcpDAO.deleteLcpMouAgyIntrn(vo.getLcpMouIntrnVo()); // 그리드 목록 단일 삭제
			  }
		  }
		  if ("D".equals(AfcDelRowFlag)) {// 사후관리 단건 삭제
			  String[] AfcDelRowOdrArray = AfcDelRowOdrs.split("\\s+");
			  ArrayList<String> AfcDelRowOdr = new ArrayList<>(Arrays.asList(AfcDelRowOdrArray));
			  for (String AfcDelOdr : AfcDelRowOdr) {
				  vo.getLcpMouIntrnVo().setAfc_del_odr(AfcDelOdr);
				  lcpDAO.deleteLcpMouAfcIntrn(vo.getLcpMouIntrnVo()); // 그리드 목록 단일 삭제
			  }
		  }		  
	  }	
	  //사후관리
	  for (int i = 0; i < vo.getLcpMouAfactVoList().size(); i++) {
		  LcpMouAfactVo afcVo = new LcpMouAfactVo();
		  afcVo = vo.getLcpMouAfactVoList().get(i);
		  cudType = afcVo.getCud_type();

		  if ("I".equals(saveClsf)) {
			  afcVo.setMou_no(reqNo);
			  lcpDAO.insertLcpMouAfact(afcVo); 	
		  } else {
			  if ("C".equals(cudType)) {
				  afcVo.setMou_no(reqNo);
				  lcpDAO.insertLcpMouAfact(afcVo); 
			  } else if ("U".equals(cudType)) {   			
				  lcpDAO.updateLcpMouAfact(afcVo);    			
			  }   	
		  }    	
	  }
	  
	  for (int i = 0; i < vo.getLcpMouDomAgencyVoList().size(); i++) {
		  LcpMouDomAgencyVo audencVo = new LcpMouDomAgencyVo();
		  audencVo = vo.getLcpMouDomAgencyVoList().get(i);
		  cudType = audencVo.getCud_type();

		  if ("I".equals(saveClsf)) {
			  audencVo.setMou_no(reqNo);
			  lcpDAO.insertLcpMouDomAgency(audencVo); 	
		  } else {
			  if ("C".equals(cudType)) {
				  audencVo.setMou_no(reqNo);
				  lcpDAO.insertLcpMouDomAgency(audencVo); 	
			  } else if ("U".equals(cudType)) {
				  lcpDAO.updateLcpMouDomAgency(audencVo);    			
			  }   	
		  }    	
	  } 	  	      
	  return vo.getLcpMouIntrnVo();
	}

}
