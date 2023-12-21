package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyEduService;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduSrchVo;


/**  
 * @ClassSubJect 학력사항변경신청 관련 컨트롤러
 * @Class Name HumApyEduController.java
 * @Description 학력사항변경신청 관련 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/31     석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/31
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumApyEduController {
	
    @Resource(name = "humApyEduServiceImpl")
    private HumApyEduService humApyEduService;

    @ElService(key = "SvcHUMAPYEDUR01")
    @RequestMapping(value = "SvcHUMAPYEDUR01")    
    @ElDescription(sub = "학력사항변경신청 목록조회", desc = "학력사항변경신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyEduInfoVo> selectHumApyEduList(HumApyEduSrchVo vo) throws Exception {    	   	
    	//학력사항변경신청 목록조회
        return humApyEduService.selectHumApyEduList(vo);            
    }

    @ElService(key = "SvcHUMAPYEDUINFOR01")
    @RequestMapping(value = "SvcHUMAPYEDUINFOR01")    
    @ElDescription(sub = "학력사항변경신청 상세조회", desc = "학력사항변경신청 상세조회를 한다.")
	@ElValidator(errUrl = "")               
    public HumApyEduInfoVo selectHumApyEduInfo(HumApyEduSrchVo vo) throws Exception {    	   	
    	//학력사항변경신청 상세조회
        return humApyEduService.selectHumApyEduInfo(vo);            
    }

    @ElService(key = "SvcHUMAPYEDUINFOBFR01")
    @RequestMapping(value = "SvcHUMAPYEDUINFOBFR01")    
    @ElDescription(sub = "학력사항변경신청 변경전 학력사항 조회", desc = "학력사항변경신청 변경전 학력사항 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyEduInfoVo> selectHumApyEduInfoBefore(HumApyEduSrchVo vo) throws Exception {    	   	
    	//학력사항변경신청 변경전 학력사항 조회
        return humApyEduService.selectHumApyEduInfoBefore(vo);            
    }

    @ElService(key = "SvcHUMAPYEDUINFOAFTR01")
    @RequestMapping(value = "SvcHUMAPYEDUINFOAFTR01")    
    @ElDescription(sub = "학력사항변경신청 변경후 학력사항 조회", desc = "학력사항변경신청 변경후 학력사항 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyEduInfoVo> selectHumApyEduInfoAfter(HumApyEduSrchVo vo) throws Exception {    	   	
    	//학력사항변경신청 변경후 학력사항 조회
        return humApyEduService.selectHumApyEduInfoAfter(vo);            
    }

    @ElService(key = "SvcHUMAPYEDUD01")
    @RequestMapping(value = "SvcHUMAPYEDUD01")    
    @ElDescription(sub = "학력사항변경신청 삭제", desc = "학력사항변경신청 신청서 삭제를 한다.")
	@ElValidator(errUrl = "")               
    public void deleteHumApyEdu(HumApyEduSrchVo vo) throws Exception {    	   	
    	//학력사항변경신청. 신청서 삭제
        humApyEduService.deleteHumApyEdu(vo);            
    }

    @ElService(key = "SvcHUMAPYEDUM01")
    @RequestMapping(value = "SvcHUMAPYEDUM01")    
    @ElDescription(sub = "학력사항변경신청 저장, 결재신청", desc = "학력사항변경신청 신청서 작성 정보를 저장, 결재신청을 한다.")
	@ElValidator(errUrl = "")               
    public HumApyEduInfoVo saveHumApyEdu(HumApyEduListVo vo) throws Exception {    	   	
    	//학력사항변경신청. 저장, 결재신청
		HumApyEduInfoVo retVo = new HumApyEduInfoVo();
		retVo.setReq_no(humApyEduService.saveHumApyEdu(vo));
		return retVo;
    }

    @ElService(key = "SvcHUMAPYEDURJM01")
    @RequestMapping(value = "SvcHUMAPYEDURJM01")    
    @ElDescription(sub = "학력사항변경신청 반려", desc = "학력사항변경신청 반려한다.")
    @ElValidator(errUrl = "")               
    public void formReject(HumApyEduInfoVo vo) throws Exception {    	  
    	humApyEduService.formReject(vo);
    }

    @ElService(key = "SvcHUMAPYEDUACM01")
    @RequestMapping(value = "SvcHUMAPYEDUACM01")    
    @ElDescription(sub = "학력사항변경신청 처리", desc = "학력사항변경신청 처리한다.")
    @ElValidator(errUrl = "")               
    public void formAccept(HumApyEduListVo vo) throws Exception {    	  
    	humApyEduService.formAccept(vo);
    }




}
