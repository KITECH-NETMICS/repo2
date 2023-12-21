package kr.re.kitech.biz.lpl.lcp.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.lpl.lcp.dao.LcpEventDAO;
import kr.re.kitech.biz.lpl.lcp.service.LcpEventService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : LcpEventServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.15.      author    최초생성
 * 
 * @author 
 * @since 2023.11.15.
 * @version 1.0
 * @see
 * 
 */
@Service("lcpEventServiceImpl")
public class LcpEventServiceImpl extends EgovAbstractServiceImpl implements LcpEventService {
  @Resource(name="lcpEventDAO")
  private LcpEventDAO lcpDAO;

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;

  @Resource(name="apprFuncServiceImpl")
  private ApprFuncService apprFuncService;

  @Resource(name="generationServiceImpl")
  private GenerationService genService;
    
  /**
   * 국가 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  @Override
  public List<LcpEventVo> selectList01(LcpEventVo vo) throws KitechException {
    List<LcpEventVo> list = lcpDAO.selectList01(vo);	
    return list;
  }
  
  /**
   * 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  @Override
  public List<LcpEventVo> selectList02(LcpEventVo vo) throws KitechException {
    List<LcpEventVo> list = lcpDAO.selectList02(vo);
    
	// audenc_no를 기준으로 맵을 생성하여 중복 항목을 더하고 저장
	Map<String, LcpEventVo> resultMap = new HashMap<>();
	for (LcpEventVo item : list) {
	    String eventNo = item.getEvent_no();
	    if (resultMap.containsKey(eventNo)) {
	        LcpEventVo existingItem = resultMap.get(eventNo);
	        existingItem.setKrchar_agncy_nm(existingItem.getKrchar_agncy_nm() + ", " + item.getKrchar_agncy_nm());
	    } else {
	        resultMap.put(eventNo, item);
	    }
	}
	
	// 중복 항목을 제거한 결과 리스트
	List<LcpEventVo> result = new ArrayList<>(resultMap.values());
	
	// 각 항목의 마지막 콤마 제거
	for (LcpEventVo item : result) {
	    item.setKrchar_agncy_nm(removeLastComma(item.getKrchar_agncy_nm()));
	}	    	
    return result;
  }

// 마지막 콤마를 제거하는 메서드
  private String removeLastComma(String str) {
	  if (!str.isEmpty() && str.endsWith(", ")) {
		  return str.substring(0, str.length() - 2);
	  }
	  return str;
  }
  
  /**
   * 상세 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  @Override
  public LcpEventVo selectLcpEventDetail(LcpEventVo vo) throws KitechException {
    LcpEventVo list = lcpDAO.selectLcpEventDetail(vo);	
    return list;
  }
  
  /**
   * 비용 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  @Override
  public List<LcpEventVo> selectLcpEventExpen(LcpEventVo vo) throws KitechException {
    List<LcpEventVo> list = lcpDAO.selectLcpEventExpen(vo);	
    return list;
  }
  
  /**
   * 기관 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  @Override
  public List<LcpEventVo> selectLcpEventAgncy(LcpEventVo vo) throws KitechException {
    List<LcpEventVo> list = lcpDAO.selectLcpEventAgncy(vo);	
    return list;
  }
  
  /**
   * 행사비용 조회 팝업
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.16.
   */
  @Override
  public List<LcpEventVo> selectLcpEventPop(LcpEventVo vo) throws KitechException {
	if ("lcp".equals(vo.getFlag())) {	
		List<LcpEventVo> list = lcpDAO.selectLcpEventPop(vo);	
		return list;		
	} else {
		List<LcpEventVo> list = lcpDAO.selectLcpOverseas(vo);
		return list;
	}
  }            

  /**
   * 단건 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return LcpEventVo
   * @throws KitechException
   * @since 2023.11.15.
   */
  @Override
  public LcpEventVo selectOne01(LcpEventVo vo) throws KitechException {
    LcpEventVo resultVO = lcpDAO.selectOne01(vo);			
      return resultVO;
  }

  /**
   * 국외귀빈 저장, 수정, 삭제
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.   
   */
  @Override
	public LcpEventVo CrudLcpEventAudenc(LcpEventListVo vo) throws KitechException {
	  String reqNo = vo.getLcpEventVo().getEvent_no();
	  String cudType = "";
	  String saveClsf = vo.getLcpEventVo().getCud_type();
	  String ExpDelRowFlag = vo.getLcpEventVo().getExp_row_flag();
	  String ExpDelRowOdrs = vo.getLcpEventVo().getExp_del_row_odr();
	  String AgyDelRowFlag = vo.getLcpEventVo().getAgy_row_flag();
	  String AgyDelRowOdrs = vo.getLcpEventVo().getAgy_del_row_odr();	  
	  if ("I".equals(saveClsf)) {
		  //신청번호 채번
		  reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "L12");
		  vo.getLcpEventVo().setEvent_no(reqNo);		  
		  lcpDAO.insertLcpEventAudenc(vo.getLcpEventVo());
	  } else if ("U".equals(saveClsf) ) {
		  lcpDAO.updateLcpEvent(vo.getLcpEventVo());
	  } else if ("D".equals(saveClsf) ) { 
		  vo.getLcpEventVo().setAgy_del_odr("");
		  vo.getLcpEventVo().setExp_del_odr("");
		  lcpDAO.deleteLcpAgncyEvent(vo.getLcpEventVo()); // 협력기관 그리드 목록 전체 삭제
		  lcpDAO.deleteLcpExpnsEvent(vo.getLcpEventVo()); // 국제행사비용 그리드 목록 전체 삭제
		  lcpDAO.deleteLcpEvent(vo.getLcpEventVo());
	  }
	  if (!"D".equals(saveClsf)) {
		  if ("D".equals(AgyDelRowFlag)) {// 협력기관 단건 삭제
			  String[] AgyDelRowOdrArray = AgyDelRowOdrs.split("\\s+");
			  ArrayList<String> AgyDelRowOdr = new ArrayList<>(Arrays.asList(AgyDelRowOdrArray));
			  for (String AgyDelOdr : AgyDelRowOdr) { 
				  vo.getLcpEventVo().setAgy_del_odr(AgyDelOdr);
				  lcpDAO.deleteLcpAgncyEvent(vo.getLcpEventVo()); // 그리드 목록 단일 삭제
			  }
		  }
		  if ("D".equals(ExpDelRowFlag)) {// 행사비용 단건 삭제
			  String[] ExpDelRowOdrArray = ExpDelRowOdrs.split("\\s+");
			  ArrayList<String> ExpDelRowOdr = new ArrayList<>(Arrays.asList(ExpDelRowOdrArray));
			  for (String ExpDelOdr : ExpDelRowOdr) { 
				  vo.getLcpEventVo().setExp_del_odr(ExpDelOdr);
				  lcpDAO.deleteLcpExpnsEvent(vo.getLcpEventVo()); // 그리드 목록 단일 삭제
			  }
		  }		  
	  }
	  //행사비용
	  for (int i = 0; i < vo.getLcpEventExpnsVoList().size(); i++) {
		  LcpEventExpnsVo expVo = new LcpEventExpnsVo();
		  expVo = vo.getLcpEventExpnsVoList().get(i);
		  cudType = expVo.getCud_type();

		  if ("I".equals(saveClsf)) {
			  expVo.setEvent_no(reqNo);
			  lcpDAO.insertLcpEventExpAgncy(expVo); 	
		  } else {
			  if ("C".equals(cudType)) {
				  expVo.setEvent_no(reqNo);
				  lcpDAO.insertLcpEventExpAgncy(expVo); 
			  } else if ("U".equals(cudType)) {   			
				  lcpDAO.updateLcpEventExpns(expVo);    			
			  }   	
		  }    	
	  }
	  
	  for (int i = 0; i < vo.getLcpEventVoList().size(); i++) {
		  LcpEventVo audencVo = new LcpEventVo();
		  audencVo = vo.getLcpEventVoList().get(i);
		  cudType = audencVo.getCud_type();

		  if ("I".equals(saveClsf)) {
			  audencVo.setEvent_no(reqNo);
			   audencVo.setRegst_psn_syspayno(vo.getLcpEventVo().getCharg_syspayno());
			  lcpDAO.insertLcpEventAudencAgncy(audencVo); 	
		  } else {
			  if ("C".equals(cudType)) {
				  audencVo.setEvent_no(reqNo);
				  audencVo.setRegst_psn_syspayno(vo.getLcpEventVo().getCharg_syspayno());
				  lcpDAO.insertLcpEventAudencAgncy(audencVo); 
			  } else if ("U".equals(cudType)) {
				  audencVo.setUpdt_psn_syspayno(vo.getLcpEventVo().getUpdt_psn_syspayno());
				  lcpDAO.updateLcpEventAgncy(audencVo);    			
			  }   	
		  }    	
	  } 	  
	      
	  return vo.getLcpEventVo();
	}

}
