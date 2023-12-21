package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyCertService;
import kr.re.kitech.biz.hum.apy.vo.HumApyCertListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCertVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyOutVo;


/**  
 * @ClassSubJect 증명서발급신청 관련 처리른 하는 컨트롤러
 * @Class Name HumApyCertController.java
 * @Description 증명서발급신청 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31     개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/31
 * @version 1.0
 * @see
 * 
 */

@Controller
public class HumApyController {
	
    /** HumApyCertService */
    @Resource(name = "humApyCertServiceImpl")
    private HumApyCertService humApyCertService;
	
    
    /**
     * 증명서발급신청 목록을 조회합니다.
     * @param humApyCertVo 증명서발급신청 HumApyCertVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYCRTR01")
    @RequestMapping(value="SvcHUMAPYCRTR01")    
    @ElDescription(sub="증명서발급신청 목록조회",desc="페이징을 처리하여 증명서발급신청 목록 조회를 한다.")               
    public HumApyCertListVo selectListHumApyCert(HumApyOutVo humApyOutVo) throws Exception {    	   	

        List<HumApyCertVo> humApyCertList = humApyCertService.selectListHumApyCert(humApyOutVo);                  
        long totCnt = humApyCertService.selectListCountHumApyCert(humApyOutVo);
	
		HumApyCertListVo retHumApyCertList = new HumApyCertListVo();
		retHumApyCertList.setHumApyCertVoList(humApyCertList); 
		retHumApyCertList.setTotalCount(totCnt);

        return retHumApyCertList;            
    }  
        
    /**
     * 증명서발급신청을 단건 조회 처리 한다.
     * @param humApyCertVo 증명서발급신청 HumApyCertVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYCRTR02")    
    @RequestMapping(value="SvcHUMAPYCRTR02") 
    @ElDescription(sub = "증명서발급신청 갱신 폼을 위한 조회", desc = "증명서발급신청 갱신 폼을 위한 조회를 한다.")    
    public HumApyCertVo selectHumApyCert(HumApyCertVo humApyCertVo, Model model) throws Exception {
    	HumApyCertVo selectHumApyCertVo = humApyCertService.selectHumApyCert(humApyCertVo);    	    
		
        return selectHumApyCertVo;
    }
    
   /**
     * 증명서발급신청를 등록 처리 한다.
     * @param humApyCertVo 증명서발급신청 HumApyCertVo
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYCRTM01")    
    @RequestMapping(value="SvcHUMAPYCRTM01")
    @ElDescription(sub="증명서발급신청 분기",desc="증명서발급신청 분기점")
    public HumApyCertVo saveHumApyCert(HumApyCertVo humApyCertVo, Model model) throws Exception {    	 
    	String req_no = humApyCertService.saveHumApyCert(humApyCertVo);
    	humApyCertVo.setReq_no(req_no);  
    	return humApyCertVo;
    }
    
    /**
     * 증명서발급신청를 전자결제 승인(화면)
     * @param humApyCertVo 전자결제 승인 HumApyCertVo
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYCRTU01")    
    @RequestMapping(value="SvcHUMAPYCRTU01")
    @ElDescription(sub="증명서발급신청를 전자결제 승인(화면)",desc="증명서발급신청를 전자결제 승인(화면)")
    public void formAccept(HumApyCertVo humApyCertVo, Model model) throws Exception {    	 
    	humApyCertService.formAccept(humApyCertVo);
    }
    
    /**
     * 증명서발급신청를 전자결제 반려(화면)
     * @param humApyCertVo 전자결제 반려 HumApyCertVo
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYCRTU02")    
    @RequestMapping(value="SvcHUMAPYCRTU02")
    @ElDescription(sub="증명서발급신청를 전자결제 반려(화면)",desc="증명서발급신청를 전자결제 반려(화면)")
    public void formReject(HumApyCertVo humApyCertVo, Model model) throws Exception {    	 
    	humApyCertService.formReject(humApyCertVo);
    }
    
    /**
     * 증명서발급관리 목록을 조회합니다.
     * @param humApyCertVo 증명서발급신청 HumApyCertVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMBASCERTR01")
    @RequestMapping(value = "SvcHUMBASCERTR01")    
    @ElDescription(sub = "증명서발급신청 목록조회", desc = "페이징을 처리하여 증명서발급신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyCertVo> selectHumApyCertList(HumApyCertVo vo) throws Exception {    	   	
        return humApyCertService.selectHumApyCertList(vo);
    }
    
    /**
     * 증명서발급관리 목록을 저장합니다.
     * @param humApyCertVo 증명서발급신청 HumApyCertVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMBASCERTI01")
    @RequestMapping(value = "SvcHUMBASCERTI01")    
    @ElDescription(sub = "증명서발급신청 비고 저장", desc = "페이징을 처리하여 증명서발급신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public void saveHumApyCertList(HumApyCertListVo vo) throws Exception {    	   	
        humApyCertService.saveHumApyCertList(vo);
    }
    
    /**
     * 증명서발급관리 내역을 삭제한다.
     * @param humApyCertVo 증명서발급신청 HumApyCertVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMBASCERTD01")
    @RequestMapping(value = "SvcHUMBASCERTD01")    
    @ElDescription(sub = "증명서발급신청 신청내역 삭제", desc = "페이징을 처리하여 증명서발급신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public void deleteHumApyCertList(HumApyCertListVo vo) throws Exception {    	   	
        humApyCertService.deleteHumApyCertList(vo);
    }
    
    /**
     * 증명서발급신청를 등록 처리 한다.
     * @param humApyCertVo 증명서발급신청 HumApyCertVo
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYCRTAI01")    
    @RequestMapping(value = "SvcHUMAPYCRTAI01")
    @ElDescription(sub = "증명서발급신청 담당자저장", desc = "증명서발급신청 담당자저장")
	@ElValidator(errUrl = "")
    public HumApyCertVo adminSaveHumApyCert(HumApyCertVo humApyCertVo, Model model) throws Exception {    	 
    	String req_no = humApyCertService.adminSaveHumApyCert(humApyCertVo);
    	humApyCertVo.setReq_no(req_no);  
    	return humApyCertVo;
    }
}
