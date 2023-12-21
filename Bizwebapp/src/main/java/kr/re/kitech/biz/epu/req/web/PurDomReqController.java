package kr.re.kitech.biz.epu.req.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo;
import kr.re.kitech.biz.epu.req.service.PurDomReqService;
import kr.re.kitech.biz.epu.req.vo.PurReqInfoVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrMngVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrVo;
import kr.re.kitech.biz.epu.req.vo.PurSrcVo;

/**  
 * @ClassSubJect 구매요구관리 컨트롤러
 * @Class PurDomReqController.java
 * @Description 구매요구관리 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/11/24     이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/11/24
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PurDomReqController {
	@Resource(name="purDomReqService")
	private PurDomReqService reqService;
	
	@ElService(key = "SvcEPUPURREQR01")
	@RequestMapping(value = "SvcEPUPURREQR01")
	@ElDescription(sub = "구매요구관리조회", desc = "구매요구관리 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<PurReqMastrMngVo> selectPurReqMastrList(PurSrcVo vo) throws Exception{
		return reqService.selectPurReqMastrList(vo);
	}
	
	@ElService(key = "SvcEPUPURREQR02")
	@RequestMapping(value = "SvcEPUPURREQR02")
	@ElDescription(sub = "내자구매요구조회", desc = "내자구매요구(마스터, 품목내역, 계정내역)정보를 조회한다.")
	@ElValidator(errUrl = "")
	public PurReqInfoVo selectPurReqDomInfo(PurSrcVo vo) throws Exception{
		return reqService.selectPurReqDomInfo(vo);
	}
	
	@ElService(key = "SvcEPUPURREQM01")
	@RequestMapping(value = "SvcEPUPURREQM01")
	@ElDescription(sub = "특정구매사유서 저장", desc = "특정구매사유서 저장 및 결재신청을 한다.")
	@ElValidator(errUrl = "")
	public Map<String,String> savePurReqSpcfic(PurReqSpcficVo vo) throws Exception{
		Map<String, String> map = new HashMap<>();
		map.put("elecapp_docu_no", reqService.savePurReqSpcfic(vo));
		return map;
	}
	
	@ElService(key = "SvcEPUPURREQM02")
	@RequestMapping(value = "SvcEPUPURREQM02")
	@ElDescription(sub = "구매요구서 저장", desc = "구매요구서(마스터, 계정내역, 품목내역)을 저장한다.")
	@ElValidator(errUrl = "")
	public PurSrcVo savePurReqInfo(PurReqInfoVo vo) throws Exception{
		PurSrcVo retVo = new PurSrcVo();
		retVo.setPur_req_no(reqService.savePurReqInfo(vo));
		return retVo;
	}
	
	@ElService(key = "SvcEPUPURREQD01")
	@RequestMapping(value = "SvcEPUPURREQD01")
	@ElDescription(sub = "구매요구 삭제", desc = "구매요구내역 및 결재정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deletePurReqInfo(PurSrcVo vo) throws Exception{
		reqService.deletePurReqInfo(vo);
	}
	
	@ElService(key = "SvcEPUPURREQU01")
	@RequestMapping(value = "SvcEPUPURREQU01")
	@ElDescription(sub = "계속연차확인서 저장", desc = "계속연차확인서에 대한 저장 및 결재신청을 처리한다.")
	@ElValidator(errUrl = "")
	public void savePurContAnnlReq(PurContAnnlReqVo vo) throws Exception{
		reqService.savePurContAnnlReq(vo);
	}
	
	@ElService(key = "SvcEPUPURREQD02")
	@RequestMapping(value = "SvcEPUPURREQD02")
	@ElDescription(sub = "계속연차 확인서 삭제", desc = "계속연차 확인서정보와 그 결재정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deletePurContAnnlReq(PurContAnnlReqVo vo) throws Exception{
		reqService.deletePurContAnnlReq(vo);
	}
	
	@ElService(key = "SvcEPUPURREQD03")
	@RequestMapping(value = "SvcEPUPURREQD03")
	@ElDescription(sub = "특정물품구매사유서를 삭제한다.", desc = "신청서양식함에서 작성한 특정물품구매사유서를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deletePurReqSpcfic(PurSrcVo vo) throws Exception{
		reqService.deletePurReqSpcfic(vo);
	}
	
	@ElService(key = "SvcEPUPURREQU02")
	@RequestMapping(value = "SvcEPUPURREQU02")
	@ElDescription(sub = "결재 후 담당자 저장", desc = "결재 후 담당자가 구매요구 일부항목을 저장한다.(항목 추가가능)")
	@ElValidator(errUrl = "")
	public void updatePurReqMastrPostApr(PurReqMastrVo vo) throws Exception{
		reqService.updatePurReqMastrPostApr(vo);
	}
}
