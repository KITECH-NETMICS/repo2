package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyPrsService;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsSrchVo;


/**  
 * @ClassSubJect 지도교수(활용책임자) 변경신청 관련 컨트롤러
 * @Class Name HumApyPrsController.java
 * @Description 지도교수(활용책임자) 변경신청 관련 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/10     석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/10
 * @version 1.0
 * @see
 * 
 */

@Controller
public class HumApyPrsController {
	
    /** HumApySvrService */
    @Resource(name = "humApyPrsServiceImpl")
    private HumApyPrsService humApyPrsService;

    @ElService(key = "SvcHUMAPYPRSR01")
    @RequestMapping(value = "SvcHUMAPYPRSR01")    
    @ElDescription(sub = "지도교수(활용책임자) 목록조회", desc = "지도교수(활용책임자) 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyPrsInfoVo> selectHumApyPrsList(HumApyPrsSrchVo humApySvrVo) throws Exception {    	   	
    	//지도교수(활용책임자) 목록조회
        return humApyPrsService.selectHumApyPrsList(humApySvrVo);            
    }
   
    @ElService(key = "SvcHUMAPYPRSAPPRU01")
    @RequestMapping(value = "SvcHUMAPYPRSAPPRU01")    
    @ElDescription(sub = "지도교수(활용책임자) 승인", desc = "지도교수(활용책임자) 목록 내 데이터를 승인 한다.")
	@ElValidator(errUrl = "")               
    public void approvalHumApyPrs(HumApyPrsInfoVo vo) throws Exception {    	   	
    	//지도교수(활용책임자) 목록 내 승인
        humApyPrsService.approvalHumApyPrs(vo);            
    }
    
    @ElService(key = "SvcHUMAPYPRSD01")
    @RequestMapping(value = "SvcHUMAPYPRSD01")    
    @ElDescription(sub = "지도교수(활용책임자) 변경신청서 삭제", desc = "지도교수(활용책임자) 변경신청서 삭제를 한다.")
    @ElValidator(errUrl = "")               
    public void deleteHumApyPrs(HumApyPrsSrchVo humApySvrVo) throws Exception {    	  
    	//지도교수(활용책임자) 변경신청서. 삭제
    	humApyPrsService.deleteHumApyPrs(humApySvrVo);
    }
   
    @ElService(key = "SvcHUMAPYPRSINFOR01")
    @RequestMapping(value = "SvcHUMAPYPRSINFOR01")    
    @ElDescription(sub = "지도교수(활용책임자) 변경신청서 신규 작성시 지도교수 조회", desc = "지도교수(활용책임자) 변경신청서 신규 작성시 지도교수 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyPrsInfoVo> selectHumApyPrsInfo(HumApyPrsSrchVo humApySvrVo) throws Exception {    	  
    	//지도교수(활용책임자) 변경전 지도교수 조회
    	return humApyPrsService.selectHumApyPrsInfo(humApySvrVo);
    }
   
    @ElService(key = "SvcHUMAPYPRSDTLR01")
    @RequestMapping(value = "SvcHUMAPYPRSDTLR01")    
    @ElDescription(sub = "지도교수(활용책임자) 변경신청서 상세 조회", desc = "지도교수(활용책임자) 변경신청서 신청서에 대한 상세 조회를 한다.")
	@ElValidator(errUrl = "")               
    public HumApyPrsInfoVo selectHumApyPrsDtl(HumApyPrsSrchVo humApySvrVo) throws Exception {    	  
    	//지도교수(활용책임자) 변경전 지도교수 조회
    	return humApyPrsService.selectHumApyPrsDtl(humApySvrVo);
    }

    @ElService(key = "SvcHUMAPYPRSBFR01")
    @RequestMapping(value = "SvcHUMAPYPRSBFR01")    
    @ElDescription(sub = "변경전 지도교수(활용책임자) 조회", desc = "지도교수(활용책임자) 변경신청서. 상세 조회시 변경전 지도교수(활용책임자) 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyPrsInfoVo> selectHumApyPrsBefore(HumApyPrsSrchVo humApySvrVo) throws Exception {    	  
    	//변경전 지도교수(활용책임자) 조회
    	return humApyPrsService.selectHumApyPrsBefore(humApySvrVo);
    }
   
    @ElService(key = "SvcHUMAPYPRSAFR01")
    @RequestMapping(value = "SvcHUMAPYPRSAFR01")    
    @ElDescription(sub = "변경후 지도교수(활용책임자) 조회", desc = "지도교수(활용책임자) 변경신청서. 상세 조회시 변경후 지도교수(활용책임자) 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyPrsInfoVo> selectHumApyPrsAfter(HumApyPrsSrchVo humApySvrVo) throws Exception {    	  
    	//변경후 지도교수(활용책임자) 조회
    	return humApyPrsService.selectHumApyPrsAfter(humApySvrVo);
    }
    
	@ElService(key = "SvcHUMAPYPRSM01")
	@RequestMapping(value = "SvcHUMAPYPRSM01")
	@ElDescription(sub = "지도교수(활용책임자) 저장, 결재신청", desc = "지도교수(활용책임자) 신청서 작성 정보를 저장, 결재신청 한다.")
	@ElValidator(errUrl = "")
	public HumApyPrsInfoVo saveHumApyPrs(HumApyPrsListVo vo) throws Exception{
		HumApyPrsInfoVo retVo = new HumApyPrsInfoVo();
		retVo.setReq_no(humApyPrsService.saveHumApyPrs(vo));
		return retVo;
	}
    
    @ElService(key = "SvcHUMAPYPRSAFD01")
    @RequestMapping(value = "SvcHUMAPYPRSAFD01")    
    @ElDescription(sub = "지도교수(활용책임자) 변경후 지도교수(활용책임자) 삭제", desc = "지도교수(활용책임자) 변경후 지도교수(활용책임자)를 삭제 한다.")
    @ElValidator(errUrl = "")               
    public void deleteHumApyPrsAfter(HumApyPrsListVo vo) throws Exception {    	  
    	//지도교수(활용책임자) 변경신청서. 삭제
    	//list로 보내서 for문으로 삭제 처리하기
    	humApyPrsService.deleteHumApyPrsAfter(vo);
    }
   
    @ElService(key = "SvcHUMAPYPRSRJM01")
    @RequestMapping(value = "SvcHUMAPYPRSRJM01")    
    @ElDescription(sub = "지도교수(활용책임자) 변경신청서 반려", desc = "지도교수(활용책임자) 변경신청서 반려한다.")
    @ElValidator(errUrl = "")               
    public void formReject(HumApyPrsInfoVo vo) throws Exception {    	  
    	humApyPrsService.formReject(vo);
    }
   
    @ElService(key = "SvcHUMAPYPRSACM01")
    @RequestMapping(value = "SvcHUMAPYPRSACM01")    
    @ElDescription(sub = "지도교수(활용책임자) 변경신청서 처리", desc = "지도교수(활용책임자) 변경신청서 처리한다.")
    @ElValidator(errUrl = "")               
    public void formAccept(HumApyPrsInfoVo vo) throws Exception {    	  
    	humApyPrsService.formAccept(vo);
    }
   
   
}
