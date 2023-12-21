package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyAccService;
import kr.re.kitech.biz.hum.apy.vo.HumApyAccInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAccSrchVo;


/**  
 * @ClassSubJect 급여계좌신청 관련 컨트롤러
 * @Class Name HumApyAccController.java
 * @Description 급여계좌신청 관련 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/21     석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/21
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumApyAccController {
	
    @Resource(name = "humApyAccServiceImpl")
    private HumApyAccService humApyAccService;

    @ElService(key = "SvcHUMAPYACCR01")
    @RequestMapping(value = "SvcHUMAPYACCR01")    
    @ElDescription(sub = "급여계좌신청 목록조회", desc = "급여계좌신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyAccInfoVo> selectHumApyAccList(HumApyAccSrchVo vo) throws Exception {    	   	
        return humApyAccService.selectHumApyAccList(vo);            
    }
    
    @ElService(key = "SvcHUMAPYACCAPRCHKR01")
    @RequestMapping(value = "SvcHUMAPYACCAPRCHKR01")    
    @ElDescription(sub = "급여계좌신청 작성중 문서 유효성 체크", desc = "급여계좌신청 작성중 문서 유효성 체크한다.")
    @ElValidator(errUrl = "")               
    public HumApyAccInfoVo selectHumApyAccAprChk(HumApyAccSrchVo vo) throws Exception {    	   	
    	return humApyAccService.selectHumApyAccAprChk(vo);            
    }
 
    @ElService(key = "SvcHUMAPYACCBSCINFOR01")
    @RequestMapping(value = "SvcHUMAPYACCBSCINFOR01")    
    @ElDescription(sub = "급여계좌신청 신청전 기본 계좌 정보 조회(신규)", desc = "급여계좌신청 신청전 기본 계좌 정보(신규)를 조회한다.")
	@ElValidator(errUrl = "")               
    public HumApyAccInfoVo selectHumApyAccBscInfo(HumApyAccSrchVo vo) throws Exception {    	   	
        return humApyAccService.selectHumApyAccBscInfo(vo);            
    }
 
    @ElService(key = "SvcHUMAPYACCINFOR01")
    @RequestMapping(value = "SvcHUMAPYACCINFOR01")    
    @ElDescription(sub = "급여계좌신청 신청계좌정보 조회(상세)", desc = "급여계좌신청 신청계좌정보 조회(상세)를 조회한다.")
	@ElValidator(errUrl = "")               
    public HumApyAccInfoVo selectHumApyAccInfo(HumApyAccSrchVo vo) throws Exception {    	   	
        return humApyAccService.selectHumApyAccInfo(vo);            
    }
    
    @ElService(key = "SvcHUMAPYACCD01")
    @RequestMapping(value = "SvcHUMAPYACCD01")    
    @ElDescription(sub = "급여계좌신청 신청서 삭제", desc = "급여계좌신청 신청서를 삭제한다.")
    @ElValidator(errUrl = "")               
    public void deleteHumApyAcc(HumApyAccSrchVo vo) throws Exception {    	   	
    	humApyAccService.deleteHumApyAcc(vo);            
    }
    
    @ElService(key = "SvcHUMAPYACCI01")
    @RequestMapping(value = "SvcHUMAPYACCI01")    
    @ElDescription(sub = "급여계좌신청 신청서 저장, 수정, 결재신청", desc = "급여계좌신청 신청서 저장, 수정, 결재신청한다.")
    @ElValidator(errUrl = "")               
    public HumApyAccInfoVo saveHumApyAcc(HumApyAccInfoVo vo) throws Exception {    	   	
    	//급여계좌신청 신청서. 저장, 수정, 결재신청
    	HumApyAccInfoVo retVo = new HumApyAccInfoVo();
    	retVo.setReq_no(humApyAccService.saveHumApyAcc(vo));
    	return retVo;            
    }
    
    @ElService(key = "SvcHUMAPYACCRJM01")
    @RequestMapping(value = "SvcHUMAPYACCRJM01")    
    @ElDescription(sub = "급여계좌신청 반려", desc = "급여계좌신청 반려한다.")
    @ElValidator(errUrl = "")               
    public void formReject(HumApyAccInfoVo vo) throws Exception {    	  
    	humApyAccService.formReject(vo);
    }

    @ElService(key = "SvcHUMAPYACCACM01")
    @RequestMapping(value = "SvcHUMAPYACCACM01")    
    @ElDescription(sub = "급여계좌신청 처리 (+신청자 계좌번호 update)", desc = "급여계좌신청 처리 (+신청자 계좌번호 update)한다.")
    @ElValidator(errUrl = "")               
    public void formAccept(HumApyAccInfoVo vo) throws Exception {    	  
    	humApyAccService.formAccept(vo);
    }

}
