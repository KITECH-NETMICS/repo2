package kr.re.kitech.biz.lpl.lcp.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.lpl.lcp.dao.LcpVipAudencDAO;
import kr.re.kitech.biz.lpl.lcp.service.LcpVipAudencService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpVipAudencServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.08.      author    최초생성
 * 
 * @author 
 * @since 2023.11.08.
 * @version 1.0
 * @see
 * 
 */
@Service("lcpVipAudencServiceImpl")
public class LcpVipAudencServiceImpl  extends EgovAbstractServiceImpl implements LcpVipAudencService {
  @Resource(name="lcpVipAudencDAO")
  private LcpVipAudencDAO lcpDAO;
  
  @Resource(name="generationServiceImpl")
  private GenerationService genService;  
    
  /**
   * 국외귀빈 목록 조회
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  @Override
  public List<LcpVipAudencVo> selectVipAudencList(LcpVipAudencVo vo) throws KitechException {
    List<LcpVipAudencVo> list = lcpDAO.selectVipAudencList(vo);
    
	// audenc_no를 기준으로 맵을 생성하여 중복 항목을 더하고 저장
	Map<String, LcpVipAudencVo> resultMap = new HashMap<>();
	for (LcpVipAudencVo item : list) {
	    String audencNo = item.getAudenc_no();
	    if (resultMap.containsKey(audencNo)) {
	        LcpVipAudencVo existingItem = resultMap.get(audencNo);
	        existingItem.setReprs_psn_nm(existingItem.getReprs_psn_nm() + ", " + item.getReprs_psn_nm());
	        existingItem.setCmpy_nm_krchar(existingItem.getCmpy_nm_krchar() + ", " + item.getCmpy_nm_krchar());
	    } else {
	        resultMap.put(audencNo, item);
	    }
	}
	
	// 중복 항목을 제거한 결과 리스트
	List<LcpVipAudencVo> result = new ArrayList<>(resultMap.values());
	
	// 각 항목의 마지막 콤마 제거
	for (LcpVipAudencVo item : result) {
	    item.setReprs_psn_nm(removeLastComma(item.getReprs_psn_nm()));
	    item.setCmpy_nm_krchar(removeLastComma(item.getCmpy_nm_krchar()));
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
   * 국외귀빈접견 상세조회
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return LcpVipAudencListVo
   * @throws KitechException
   * @since 2023.11.08.   
   */
  @Override
  public LcpVipAudencListVo selectVipAudencDetail(LcpVipAudencVo vo) throws KitechException {
    LcpVipAudencVo formVo = lcpDAO.selectVipAudencDetail(vo);
    List<LcpVipAudencVo> listVo = lcpDAO.selectLcpVipAudencAgncy(vo);	
    LcpVipAudencListVo resultVO = new LcpVipAudencListVo();
    resultVO.setLcpVipAudencVo(formVo);
    resultVO.setLcpVipAudencVoList(listVo);
    			
      return resultVO;
  }
   
  /**
   * 기관찾기팝업(국가트리조회)
   * 
   * @author 
   * @param
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  @Override
  public List<LcpVipAudencVo> selectVipAudencPopTree(LcpVipAudencVo vo) throws KitechException {
    List<LcpVipAudencVo> list = lcpDAO.selectVipAudencPopTree(vo);	
    return list;
  }
  
  /**
   * 기관찾기팝업(기관목록조회)
   * 
   * @author 
   * @param
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.09.   
   */
  @Override
  public List<LcpVipAudencVo> selectVipAudencPopAgency(LcpVipAudencVo vo) throws KitechException {
    List<LcpVipAudencVo> list = lcpDAO.selectVipAudencPopAgency(vo);	
    return list;
  }
  
  /**
   * 기관찾기팝업(조회결과)
   * 
   * @author 
   * @param
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.09.   
   */
  @Override
  public List<LcpVipAudencVo> selectVipAudencPopSearch(LcpVipAudencVo vo) throws KitechException {
    List<LcpVipAudencVo> list = lcpDAO.selectVipAudencPopSearch(vo);	
    return list;
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
	public LcpVipAudencVo CrudLcpVipAudenc(LcpVipAudencListVo vo) throws KitechException {
	  String reqNo = vo.getLcpVipAudencVo().getAudenc_no();
	  String cudType = "";
	  String saveClsf = vo.getLcpVipAudencVo().getCud_type();
	  String delRowFlag = vo.getLcpVipAudencVo().getRow_flag();
	  String delRowOdrs = vo.getLcpVipAudencVo().getDel_row_odr();
	  if ("I".equals(saveClsf)) {
		  //신청번호 채번
		  reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "L19");
		  vo.getLcpVipAudencVo().setAudenc_no(reqNo);		  
		  lcpDAO.insertLcpVipAudenc(vo.getLcpVipAudencVo());
	  } else if ("U".equals(saveClsf) ) {
		  lcpDAO.updateLcpVipAudenc(vo.getLcpVipAudencVo());
	  } else if ("D".equals(saveClsf) ) { 
		  vo.getLcpVipAudencVo().setDel_odr("");
		  lcpDAO.deleteLcpVipAudencAgncy(vo.getLcpVipAudencVo()); // 그리드 목록 전체 삭제
		  lcpDAO.deleteLcpVipAudenc(vo.getLcpVipAudencVo());
	  }
	  if (!"D".equals(saveClsf)) {
		  if ("D".equals(delRowFlag)) {
			  String[] delRowOdrArray = delRowOdrs.split("\\s+");
			  ArrayList<String> delRowOdr = new ArrayList<>(Arrays.asList(delRowOdrArray));
			  for (String delOdr : delRowOdr) { 
				  vo.getLcpVipAudencVo().setDel_odr(delOdr);
				  lcpDAO.deleteLcpVipAudencAgncy(vo.getLcpVipAudencVo()); // 그리드 목록 단일 삭제
			  }
		  }
	  }
	  for (int i = 0; i < vo.getLcpVipAudencVoList().size(); i++) {
		  LcpVipAudencVo audencVo = new LcpVipAudencVo();
		  audencVo = vo.getLcpVipAudencVoList().get(i);
		  cudType = audencVo.getCud_type();

		  if ("I".equals(saveClsf)) {
			  audencVo.setRegst_psn_syspayno(vo.getLcpVipAudencVo().getCharg_syspayno());
			  audencVo.setAudenc_no(reqNo);
			  lcpDAO.insertLcpVipAudencAgncy(audencVo); 	
		  } else {
			  if ("C".equals(cudType)) {
				  audencVo.setRegst_psn_syspayno(vo.getLcpVipAudencVo().getCharg_syspayno());
				  audencVo.setAudenc_no(reqNo);
				  lcpDAO.insertLcpVipAudencAgncy(audencVo); 
			  } else if ("U".equals(cudType)) {   			
				  lcpDAO.updateLcpVipAudencAgncy(audencVo);    			
			  }   	
		  }    	
	  }    
	  return vo.getLcpVipAudencVo();
	}
}
