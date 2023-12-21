package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyPizService;
import kr.re.kitech.biz.hum.apy.vo.HumApyPizInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPizSrchVo;


/**  
 * @ClassSubJect 포상경력신청 관련 컨트롤러
 * @Class Name HumApyPrsController.java
 * @Description 포상경력신청 관련 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/25     석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/25
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumApyPizController {
	
    @Resource(name = "humApyPizServiceImpl")
    private HumApyPizService humApyPizService;

    @ElService(key = "SvcHUMAPYPIZR01")
    @RequestMapping(value = "SvcHUMAPYPIZR01")    
    @ElDescription(sub = "포상경력신청 목록조회", desc = "포상경력신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyPizInfoVo> selectHumApyPizList(HumApyPizSrchVo vo) throws Exception {    	   	
    	//포상경력신청 목록조회
        return humApyPizService.selectHumApyPizList(vo);            
    }

    @ElService(key = "SvcHUMAPYPIZINFOR01")
    @RequestMapping(value = "SvcHUMAPYPIZINFOR01")    
    @ElDescription(sub = "포상경력신청 상세조회", desc = "포상경력신청 상세 조회를 한다.")
	@ElValidator(errUrl = "")               
    public HumApyPizInfoVo selectHumApyPizInfo(HumApyPizSrchVo vo) throws Exception {    	   	
    	//포상경력신청 목록조회
        return humApyPizService.selectHumApyPizInfo(vo);            
    }

    @ElService(key = "SvcHUMAPYPIZM01")
    @RequestMapping(value = "SvcHUMAPYPIZM01")    
    @ElDescription(sub = "포상경력신청 저장, 수정, 결재신청", desc = "포상경력신청 저장, 수정, 결재신청을 한다.")
	@ElValidator(errUrl = "")               
    public HumApyPizInfoVo saveHumApyPiz(HumApyPizInfoVo vo) throws Exception {    	   	
    	//포상경력신청 저장, 수정, 결재신청
		HumApyPizInfoVo retVo = new HumApyPizInfoVo();
		retVo.setReq_no(humApyPizService.saveHumApyPiz(vo));
    	//신청번호 리턴
        return retVo;
    }

    @ElService(key = "SvcHUMAPYPIZD01")
    @RequestMapping(value = "SvcHUMAPYPIZD01")    
    @ElDescription(sub = "포상경력신청 삭제", desc = "포상경력신청 신청서를 삭제 한다.")
	@ElValidator(errUrl = "")               
    public void deleteHumApyPiz(HumApyPizInfoVo vo) throws Exception {    	   	
    	//포상경력신청 삭제
        humApyPizService.deleteHumApyPiz(vo);
    }

   
    @ElService(key = "SvcHUMAPYPIZRJM01")
    @RequestMapping(value = "SvcHUMAPYPIZRJM01")    
    @ElDescription(sub = "포상경력신청 반려", desc = "포상경력신청 반려한다.")
    @ElValidator(errUrl = "")               
    public void formReject(HumApyPizInfoVo vo) throws Exception {    	  
    	humApyPizService.formReject(vo);
    }

    @ElService(key = "SvcHUMAPYPIZACM01")
    @RequestMapping(value = "SvcHUMAPYPIZACM01")    
    @ElDescription(sub = "포상경력신청 처리", desc = "포상경력신청 처리한다.")
    @ElValidator(errUrl = "")               
    public void formAccept(HumApyPizInfoVo vo) throws Exception {    	  
    	humApyPizService.formAccept(vo);
    }

}
