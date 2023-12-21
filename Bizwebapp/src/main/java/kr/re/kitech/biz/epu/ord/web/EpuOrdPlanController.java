package kr.re.kitech.biz.epu.ord.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.epu.ord.service.EpuOrdPlanService;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLstVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdMastrVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanInfoVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdSrcVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;
/**
 * @ClassSubJect 발주계획관리
 * @Class Name EpuOrdPlanController
 * @Description 발주계획관리 Contoller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/08/07      이영희             수정작성
 * 
 * @author 이영희
 * @since 2023/08/07 
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class EpuOrdPlanController {

	@Resource(name = "epuOrdPlanService")
	private EpuOrdPlanService ordService;
	
	@ElService(key = "SvcEPUORDLSTR01")
	@RequestMapping(value = "SvcEPUORDLSTR01")
	@ElDescription(sub = "발주계획목록 조회", desc = "발주계획목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<EpuOrdLstVo> selectEpuOrdMastrList(EpuOrdSrcVo vo) throws Exception{
		return ordService.selectEpuOrdMastrList(vo);
	}
	
	@ElService(key = "SvcEPUORDREGR01")
	@RequestMapping(value = "SvcEPUORDREGR01")
	@ElDescription(sub = "g2B ID 조회", desc = "g2B ID를 조회한다.")
	@ElValidator(errUrl = "")
	public Map<String,String> selectG2bId(EpuOrdSrcVo vo) throws Exception {
		Map<String,String> map = new HashMap<>();
		map.put("g2b_regst_id", ordService.selectG2bId(vo));
		return map;
	}
  
  @ElService(key = "SvcEPUORDPLNR01")
  @RequestMapping(value = "SvcEPUORDPLNR01")
  @ElDescription(sub = "발주계획조회", desc = "발주계획(상세내역, 구매요구내역, 지명업체,지역제한,업종제한)을 조회한다.")
@ElValidator(errUrl = "")
  public EpuOrdPlanInfoVo selectOrderPlans(EpuOrdSrcVo vo) throws Exception{
      return ordService.selectOrderPlans(vo);
  }
  
  @ElService(key = "SvcEPUORDPLNR02")
@RequestMapping(value = "SvcEPUORDPLNR02")
@ElDescription(sub = "구매요구품목 조회(구매요구번호 클릭해서 발주계획화면 이동시)", desc = "구매요구번호를 클릭한 후 발주계획이동시 구매요구내역을 조회한다.")
@ElValidator(errUrl = "")
  public List<EpuOrdReqItemVo> selectPurReqItemOrdPlan(EpuOrdSrcVo vo) throws Exception{
	  return ordService.selectPurReqItemOrdPlan(vo);
  }

  @ElService(key = "SvcEPUORDPLNM01")
  @RequestMapping(value = "SvcEPUORDPLNM01")
  @DataCollection(ref="", target="")
  @ElDescription(sub = "발주계획등록", desc = "발주계획마스터, 지명업체, 지역제한, 업종제한을 저장한다.")
@ElValidator(errUrl = "")
  public EpuOrdSrcVo saveEpuOrdPlan(EpuOrdPlanInfoVo vo) throws Exception {
	  return ordService.saveEpuOrdPlan(vo); 
  }

  @ElService(key = "SvcEPUORDPLND01")
  @RequestMapping(value = "SvcEPUORDPLND01")
  @DataCollection(ref="", target="")
  @ElDescription(sub = "발주계획 삭제", desc = "발주계획(마스터,품목내역,지명업체, 지역제한,업종제한등)을 삭제한다.")
@ElValidator(errUrl = "")
  public void deleteEpuOrderPlan(EpuOrdPlanInfoVo vo) throws Exception {
      ordService.deleteEpuOrderPlan(vo);
  }

  @ElService(key="SvcEPUORDPLNAPR1")
  @RequestMapping(value="SvcEPUORDPLNAPR1")
  @DataCollection(ref="", target="")
  @ElDescription(sub="excuteApproval",desc="결재신청")
  public EpuOrdSrcVo excuteApproval(EpuOrdMastrVo vo) throws Exception {
//      String result = ordService.excuteApproval(vo); 
//      return result;
 return null;
  }

}
