package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyLndService;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndSrchVo;


/**  
 * @ClassSubJect 휴복직신청 관련 컨트롤러
 * @Class Name HumApyLndController.java
 * @Description 휴복직신청 관련 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/15     석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/15
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumApyLndController {
	
    @Resource(name = "humApyLndServiceImpl")
    private HumApyLndService humApyLndService;

    @ElService(key = "SvcHUMAPYLNDR01")
    @RequestMapping(value = "SvcHUMAPYLNDR01")    
    @ElDescription(sub = "휴복직신청 목록조회", desc = "휴복직신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyLndInfoVo> selectHumApyLndList(HumApyLndSrchVo vo) throws Exception {    	   	
        return humApyLndService.selectHumApyLndList(vo);            
    }
    
    @ElService(key = "SvcHUMAPYLNDINFOR01")
    @RequestMapping(value = "SvcHUMAPYLNDINFOR01")    
    @ElDescription(sub = "휴복직신청 상세조회", desc = "휴복직신청 신청서를 상세 조회 한다.")
    @ElValidator(errUrl = "")               
    public HumApyLndInfoVo selectHumApyLndInfo(HumApyLndSrchVo vo) throws Exception {    	   	
    	return humApyLndService.selectHumApyLndInfo(vo);            
    }
    
    @ElService(key = "SvcHUMAPYLNDD01")
    @RequestMapping(value = "SvcHUMAPYLNDD01")    
    @ElDescription(sub = "휴복직신청 신청서 삭제", desc = "휴복직신청 신청서를 삭제 한다.")
    @ElValidator(errUrl = "")               
    public void deleteHumApyLnd(HumApyLndSrchVo vo) throws Exception {    	   	
    	humApyLndService.deleteHumApyLnd(vo);            
    }
    
    @ElService(key = "SvcHUMAPYLNDI01")
    @RequestMapping(value = "SvcHUMAPYLNDI01")    
    @ElDescription(sub = "휴복직신청 신청서 저장, 수정, 결재신청", desc = "휴복직신청 신청서를 저장, 수정, 결재신청 한다.")
    @ElValidator(errUrl = "")               
    public HumApyLndInfoVo saveHumApyLnd(HumApyLndInfoVo vo) throws Exception {    	   	
    	//휴복직신청 신청서. 저장, 수정, 결재신청
    	HumApyLndInfoVo retVo = new HumApyLndInfoVo();
    	retVo.setReq_no(humApyLndService.saveHumApyLnd(vo));
    	return retVo;
    }
   
    @ElService(key = "SvcHUMAPYLNDRJM01")
    @RequestMapping(value = "SvcHUMAPYLNDRJM01")    
    @ElDescription(sub = "휴복직신청 신청서 반려", desc = "휴복직신청 신청서 반려한다.")
    @ElValidator(errUrl = "")               
    public void formReject(HumApyLndInfoVo vo) throws Exception {    	  
    	humApyLndService.formReject(vo);
    }
   
    @ElService(key = "SvcHUMAPYLNDACM01")
    @RequestMapping(value = "SvcHUMAPYLNDACM01")    
    @ElDescription(sub = "휴복직신청 신청서 처리", desc = "휴복직신청 신청서 처리한다.")
    @ElValidator(errUrl = "")               
    public void formAccept(HumApyLndListVo vo) throws Exception {    	  
    	humApyLndService.formAccept(vo);
    }

}
