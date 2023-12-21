package kr.re.kitech.biz.hum.apy.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApySvrService;
import kr.re.kitech.biz.hum.apy.vo.AssetsVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCompanListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrSaveVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrVo;


/**  
 * @ClassSubJect 퇴직신청 관련 처리른 하는 컨트롤러
 * @Class Name HumApySvrController.java
 * @Description 퇴직신청 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/27     박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/05/27
 * @version 1.0
 * @see
 * 
 */

@Controller
public class HumApySvrController {
	
    /** HumApySvrService */
    @Resource(name = "humApySvrServiceImpl")
    private HumApySvrService humApySvrService;
	
    
    /**
     * 퇴직신청 목록을 조회합니다.
     * @param humApySvrVo 퇴직신청 HumApySvrVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYSVRR01")
    @RequestMapping(value="SvcHUMAPYSVRR01")    
    @ElDescription(sub="퇴직신청 목록조회",desc="페이징을 처리하여 퇴직신청 목록 조회를 한다.")               
    public HumApySvrListVo selectListHumApySvr(HumApySvrVo humApySvrVo) throws Exception {    	   	

        List<HumApySvrVo> humApySvrList = humApySvrService.selectListHumApySvr(humApySvrVo);                  
       //long totCnt = humApySvrService.selectListCountHumApySvr(humApySvrVo);
	
		HumApySvrListVo retHumApySvrList = new HumApySvrListVo();
		retHumApySvrList.setHumApySvrVoList(humApySvrList); 
		//retHumApySvrList.setTotalCount(totCnt);

        return retHumApySvrList;            
    }
    
    /**
     * 퇴직신청시 관련부서 확인사항
     * @param HumApyDeptChkVo 퇴직신청 HumApyDeptChkVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRR03")
    @RequestMapping(value = "SvcHUMAPYSVRR03")    
    @ElDescription(sub = "퇴직신청시 관련부서 확인사항", desc = "퇴직신청시 관련부서 확인사항")
	@ElValidator(errUrl = "")               
    public HumApyDeptChkListVo selectListDeptChk(HumApyDeptChkVo humApyDeptChkVo) throws Exception {    	   	

        List<HumApyDeptChkVo> depChecklist = humApySvrService.selectListDeptChk(humApyDeptChkVo);                  
       //long totCnt = humApySvrService.selectListCountHumApySvr(humApySvrVo);
	
		HumApyDeptChkListVo humApyDeptChkListVo = new HumApyDeptChkListVo();
		humApyDeptChkListVo.setHumApyDeptChkVoList(depChecklist);
		humApyDeptChkListVo.setTotalCount(Long.valueOf(depChecklist.size()));
			


        return humApyDeptChkListVo;            
    }
    
    /**
     * 반려자목록
     * @param humApySvrVo 퇴직신청 HumApySvrVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYSVRR04")
    @RequestMapping(value="SvcHUMAPYSVRR04")    
    @ElDescription(sub="반려자 목록",desc="반려자 목록")               
    public HumApyCompanListVo selectCompanionList(HumApyCompanVo vo) throws Exception {    	   	

        List<HumApyCompanVo> companionList = humApySvrService.selectCompanionList(vo);                  
       //long totCnt = humApySvrService.selectListCountHumApySvr(humApySvrVo);
	
		HumApyCompanListVo humApyCompanVoList = new HumApyCompanListVo();
		humApyCompanVoList.setTotalCount(Long.valueOf(companionList.size()));
		humApyCompanVoList.setHumApyCompanVoList(companionList);
		//retHumApySvrList.setTotalCount(totCnt);

        return humApyCompanVoList;            
    }
   
    
    /**
     * 퇴직신청을 단건 조회 처리 한다.
     * @param humApySvrVo 퇴직신청 HumApySvrVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRR02")    
    @RequestMapping(value="SvcHUMAPYSVRR02") 
    @ElDescription(sub = "퇴직신청 갱신 폼을 위한 조회", desc = "퇴직신청 갱신 폼을 위한 조회를 한다.")    
    public HumApySvrListVo selectHumApySvr(HumApySvrVo humApySvrVo, Model model) throws Exception {
    	HumApySvrVo selectHumApySvrVo = humApySvrService.selectHumApySvr(humApySvrVo);    	    
		
		HumApySvrListVo retHumApySvrList = new HumApySvrListVo();
		
		retHumApySvrList.setHumApySvrVo(selectHumApySvrVo);
		
        return retHumApySvrList;
    }  
    
    /**
     * 담당자조회
     * @param humApySvrVo 담당자조회 HumApySvrVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRR05")    
    @RequestMapping(value="SvcHUMAPYSVRR05") 
    @ElDescription(sub = "담당자조회", desc = "담당자조회")    
    public HumApySvrListVo selectManger(HumApySvrVo humApySvrVo, Model model) throws Exception {
    	HumApySvrVo selectHumApySvrVo = humApySvrService.selectManger(humApySvrVo);    	    
		
		HumApySvrListVo retHumApySvrList = new HumApySvrListVo();
		
		retHumApySvrList.setHumApySvrVo(selectHumApySvrVo);
		
        return retHumApySvrList;
    }
    
    /**
     * 중복체크
     * @param humApySvrVo 중복체크 HumApySvrVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRR06")    
    @RequestMapping(value="SvcHUMAPYSVRR06") 
    @ElDescription(sub = "중복체크", desc = "중복체크")    
    public Map selectDuplCheck(HumApySvrVo humApySvrVo, Model model) throws Exception {
    	
        return humApySvrService.selectDuplCheck(humApySvrVo);
    }   
        
 
    /**
     * 퇴직신청를 등록 처리 한다.
     * @param humApySvrVo 퇴직신청 HumApySvrVo
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYSVRM01")    
    @RequestMapping(value="SvcHUMAPYSVRM01")
    @ElDescription(sub="퇴직신청 등록처러",desc="퇴직신청를 등록 처리 한다.")
    public HumApySvrVo saveHumApySvr(HumApySvrSaveVo humApySvrSaveVo, Model model) throws Exception {
    	HumApySvrVo humApySvrVo = humApySvrSaveVo.getHumApySvrVo();
    	if (humApySvrVo.isApproval()) {
    		humApySvrService.humMailSend(humApySvrVo);
    	}
    	return humApySvrService.saveHumApySvr(humApySvrSaveVo);
    	
    }
       
    /**
     * 퇴직신청를 삭제 처리한다.
     * @param humApySvrVo 퇴직신청 HumApySvrVo     
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRD01")    
    @RequestMapping(value="SvcHUMAPYSVRD01")
    @ElDescription(sub = "퇴직신청 삭제처리", desc = "퇴직신청를 삭제 처리한다.")    
    public void deleteHumApySvr(HumApySvrVo humApySvrVo) throws Exception {
        humApySvrService.deleteHumApySvr(humApySvrVo);
    }
    
     /**
     * 결제미처리현황 목록을 조회합니다.
     * @param humApySvrVo 퇴직신청 HumApySvrVo
     * @return 결제미처리현황 결과
     * @throws Exception
     */
    @ElService(key="SvcHUMAPYSVRR07")
    @RequestMapping(value="SvcHUMAPYSVRR07")    
    @ElDescription(sub="퇴직신청 목록조회",desc="페이징을 처리하여 퇴직신청 목록 조회를 한다.")               
    public HumApySvrListVo selectListPcs(HumApySvrVo humApySvrVo) throws Exception {    	   	

        List<HumApySvrVo> humApySvrList = humApySvrService.selectListPcs(humApySvrVo);                  
       //long totCnt = humApySvrService.selectListCountHumApySvr(humApySvrVo);
	
		HumApySvrListVo retHumApySvrList = new HumApySvrListVo();
		retHumApySvrList.setHumApySvrVoList(humApySvrList); 
		//retHumApySvrList.setTotalCount(totCnt);

        return retHumApySvrList;            
    }
    
    /**
     * 퇴직신청를 전자결제 승인(화면)
     * @param humApySvrVo 전자결제 승인 humApySvrVo
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRU01")    
    @RequestMapping(value = "SvcHUMAPYSVRU01")
    @ElDescription(sub = "퇴직신청 담당자 승인", desc = "퇴직신청 담당자 승인")
	@ElValidator(errUrl = "")
    public void formAccept(HumApySvrSaveVo vo, Model model) throws Exception {    	 
    	humApySvrService.formAccept(vo);
    }
    
    /**
     * 퇴직신청를 전자결제 반려(화면)
     * @param humApySvrVo 전자결제 반려 humApySvrVo
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRU02")    
    @RequestMapping(value = "SvcHUMAPYSVRU02")
    @ElDescription(sub = "퇴직신청 담당자 반려", desc = "퇴직신청 담당자 반려")
	@ElValidator(errUrl = "")
    public void formReject(HumApySvrSaveVo vo, Model model) throws Exception {    	 
    	humApySvrService.formReject(vo);
    }
    
    /**
     * 퇴직신청를 전자결제 최종승인(화면)
     * @param humApySvrVo 전자결제 승인 humApySvrVo
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRU03")    
    @RequestMapping(value = "SvcHUMAPYSVRU03")
    @ElDescription(sub = "퇴직신청 담당자 최종승인", desc = "퇴직신청 담당자 최종승인")
	@ElValidator(errUrl = "")
    public void formComAccept(HumApySvrSaveVo vo, Model model) throws Exception {    	 
    	humApySvrService.insertHumThst(vo);
    	humApySvrService.formComAccept(vo);
    }
    
     /**
     * 보유자산 리스트
     * @param vo 퇴직신청 AssetsVo
     * @return 사원목록  List<AssetsVo>
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRR09")
    @RequestMapping(value = "SvcHUMAPYSVRR09")    
    @ElDescription(sub = "보유자산 리스트", desc = "보유자산 리스트")
	@ElValidator(errUrl = "")               
    public HumApySvrListVo selectAssetsList(AssetsVo vo) throws Exception {    	   	

        List<AssetsVo> assetsVo = humApySvrService.selectAssetsList(vo);                  
       //long totCnt = humApySvrService.selectListCountHumApySvr(humApySvrVo);
	
		HumApySvrListVo retHumApySvrList = new HumApySvrListVo();
		retHumApySvrList.setAssetsVoList(assetsVo); 
		//retHumApySvrList.setTotalCount(totCnt);

        return retHumApySvrList;          
    }
    
    /**
     * 업무인수자 퇴직자 부서 겸직여부 조회
     * @param humApySvrVo 겸직여부 조회 HumApySvrVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYSVRR10")
	@RequestMapping(value = "SvcHUMAPYSVRR10")
	@ElDescription(sub = "업무인수자 퇴직자 부서 겸직여부 조회", desc = "업무인수자 퇴직자 부서 겸직여부 조회")
	@ElValidator(errUrl = "")
	public HumApySvrListVo selectAdJobChk(HumApySvrVo humApySvrVo, Model model) throws Exception {
    	HumApySvrVo selectAdJobChk = humApySvrService.selectAdJobChk(humApySvrVo);  	    
		
		HumApySvrListVo retHumApySvrList = new HumApySvrListVo();
		
		retHumApySvrList.setHumApySvrVo(selectAdJobChk);
		
        return retHumApySvrList;
    }
   
}
