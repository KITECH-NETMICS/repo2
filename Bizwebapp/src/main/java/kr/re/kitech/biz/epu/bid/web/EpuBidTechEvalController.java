package kr.re.kitech.biz.epu.bid.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.epu.bid.service.EpuBidTechEvalService;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalListVo;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalSrchVo;


/**  
 * @ClassSubJect 기술평가요청 관련 컨트롤러
 * @Class Name EpuBidTecEvalController.java
 * @Description 기술평가요청 관련 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/10/17     석원탁             최초생성
 * 
 * @author 
 * @since 2023/10/17
 * @version 1.0
 * @see
 * 
 */
@Controller
public class EpuBidTechEvalController {
	
    @Resource(name = "epuBidTechEvalServiceImpl")
    private EpuBidTechEvalService epuBidTechEvalService;

    @ElService(key = "SvcEPUBIDTECHEVALR01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALR01")    
    @ElDescription(sub = "기술평가 목록조회", desc = "기술평가 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalList(EpuBidTechEvalSrchVo vo) throws Exception {    	   	
        return epuBidTechEvalService.selectEpuBidTechEvalList(vo);            
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALMASR01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALMASR01")    
    @ElDescription(sub = "기술평가요청(규격심사) 상세조회(입찰개요)", desc = "기술평가요청(규격심사) 상세조회(입찰개요)를 한다.")
	@ElValidator(errUrl = "")               
    public EpuBidTechEvalInfoVo selectEpuBidTechEvalMasInfo(EpuBidTechEvalSrchVo vo) throws Exception {    	   	
        return epuBidTechEvalService.selectEpuBidTechEvalMasInfo(vo);            
    }
       
    @ElService(key = "SvcEPUBIDTECHEVALCOMR01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALCOMR01")    
    @ElDescription(sub = "기술평가요청(규격심사) 상세조회(업체조회)", desc = "기술평가요청(규격심사) 상세조회(업체조회)를 한다.")
	@ElValidator(errUrl = "")               
    public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalComInfo(EpuBidTechEvalSrchVo vo) throws Exception {    	   	
        return epuBidTechEvalService.selectEpuBidTechEvalComInfo(vo);            
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALINFOI01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALINFOI01")    
    @ElDescription(sub = "기술평가요청(규격심사) 저장", desc = "기술평가요청(규격심사) 저장을 한다.")
	@ElValidator(errUrl = "")               
    public EpuBidTechEvalInfoVo insertEpuBidTechEvalInfo(EpuBidTechEvalListVo vo) throws Exception {    	   	
        EpuBidTechEvalInfoVo retVo = new EpuBidTechEvalInfoVo();
        retVo.setTech_eval_doc_no(epuBidTechEvalService.insertEpuBidTechEvalInfo(vo));
        return retVo;
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALINFOU01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALINFOU01")    
    @ElDescription(sub = "기술평가요청(규격심사) 수정", desc = "기술평가요청(규격심사) 수정을 한다.")
	@ElValidator(errUrl = "")               
    public EpuBidTechEvalInfoVo updateEpuBidTechEvalInfo(EpuBidTechEvalListVo vo) throws Exception {    	   	
        EpuBidTechEvalInfoVo retVo = new EpuBidTechEvalInfoVo();
        retVo.setTech_eval_doc_no(epuBidTechEvalService.updateEpuBidTechEvalInfo(vo));
        return retVo;
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALAPRM01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALAPRM01")    
    @ElDescription(sub = "기술평가요청(규격심사) 결재신청", desc = "기술평가요청(규격심사) 결재신청을 한다.")
    @ElValidator(errUrl = "")               
    public void aprEpuBidTechEvalInfo(EpuBidTechEvalInfoVo vo) throws Exception {    	   	
    	epuBidTechEvalService.aprEpuBidTechEvalInfo(vo);
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALACM01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALACM01")    
    @ElDescription(sub = "기술평가요청(규격심사) 결재승인", desc = "기술평가요청(규격심사) 결재승인을 한다.")
    @ElValidator(errUrl = "")               
    public void formAccept(EpuBidTechEvalInfoVo vo) throws Exception {    	   	
    	epuBidTechEvalService.formAccept(vo);
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALRJM01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALRJM01")    
    @ElDescription(sub = "기술평가요청(규격심사) 결재반려", desc = "기술평가요청(규격심사) 결재반려를 한다.")
    @ElValidator(errUrl = "")               
    public void formReject(EpuBidTechEvalInfoVo vo) throws Exception {    	   	
    	epuBidTechEvalService.formReject(vo);
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALAPRM02")
    @RequestMapping(value = "SvcEPUBIDTECHEVALAPRM02")    
    @ElDescription(sub = "기술평가요청(규격심사) 결재신청(스냅샷)", desc = "기술평가요청(규격심사) 결재신청(스냅샷)을 한다.")
    @ElValidator(errUrl = "")               
    public void aprEpuBidTechEvalInfoSnap(EpuBidTechEvalListVo vo) throws Exception {    	   	
    	epuBidTechEvalService.aprEpuBidTechEvalInfoSnap(vo);
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALMNGR01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALMNGR01")    
    @ElDescription(sub = "기술평가요청(규격심사) 결재신청 시 manager 조회", desc = "기술평가요청(규격심사) 결재신청 시 manager 조회를 한다.")
    @ElValidator(errUrl = "")               
    public EpuBidTechEvalInfoVo selectDeptToManager(EpuBidTechEvalSrchVo vo) throws Exception {    	   	
    	return epuBidTechEvalService.selectDeptToManager(vo);
    }
    
    @ElService(key = "SvcEPUBIDTECHEVALENDPNTR01")
    @RequestMapping(value = "SvcEPUBIDTECHEVALENDPNTR01")    
    @ElDescription(sub = "기술평가요청(규격심사) 결재 최종담당자 정보 조회", desc = "기술평가요청(규격심사) 결재 최종담당자 정보 조회를 한다.")
    @ElValidator(errUrl = "")               
    public EpuBidTechEvalInfoVo selectEpuBidTechEvalEndPoint(EpuBidTechEvalSrchVo vo) throws Exception {    	   	
    	return epuBidTechEvalService.selectEpuBidTechEvalEndPoint(vo);
    }
    

}
