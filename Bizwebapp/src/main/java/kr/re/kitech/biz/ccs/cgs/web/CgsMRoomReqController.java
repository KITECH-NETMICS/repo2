package kr.re.kitech.biz.ccs.cgs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.ccs.cgs.service.CgsCommService;
import kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 회의실신청 관련 처리른 하는 컨트롤러
 * @Class Name CgsMRoomReqController.java
 * @Description 회의실신청 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/13     박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/04/13
 * @version 1.0
 * @see
 * 
 */

@Controller
public class CgsMRoomReqController {
	
    /** CgsMRoomReqService */
    @Resource(name = "cgsMRoomReqServiceImpl")
    private CgsMRoomReqService cgsMRoomReqService;
    
    @Resource(name = "cgsCommServiceImpl")
    private CgsCommService cgsCommService;
    
    @Resource(name = "generationServiceImpl")
	private GenerationService generationService;
	
	@Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;
    
	
    
    /**
     * 회의실신청 목록을 조회합니다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSMRRR01")
    @RequestMapping(value="SvcCCSCGSMRRR01")    
    @ElDescription(sub="회의실신청 목록조회",desc="페이징을 처리하여 회의실신청 목록 조회를 한다.")               
    public CgsMRoomReqListVo selectListCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {    	   	

        List<CgsMRoomReqVo> cgsMRoomReqList = cgsMRoomReqService.selectListCgsMRoomReq(cgsMRoomReqVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsMRoomReqListVo retCgsMRoomReqList = new CgsMRoomReqListVo();
		retCgsMRoomReqList.setCgsMRoomReqVoList(cgsMRoomReqList); 
		//retCgsMRoomReqList.setTotalCount(totCnt);

        return retCgsMRoomReqList;            
    }  
        
    /**
     * 회의실신청을 단건 조회 처리 한다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCGSMRRR02")    
    @RequestMapping(value="SvcCCSCGSMRRR02") 
    @ElDescription(sub = "회의실신청 갱신 폼을 위한 조회", desc = "회의실신청 갱신 폼을 위한 조회를 한다.")    
    public CgsMRoomReqListVo selectCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo, Model model) throws Exception {
    	CgsMRoomReqVo selectCgsMRoomReqVo = cgsMRoomReqService.selectCgsMRoomReq(cgsMRoomReqVo);    	    
		
		CgsMRoomReqListVo cgsMroomReqDetail = new CgsMRoomReqListVo();
		
		cgsMroomReqDetail.setCgsMRoomReqVo(selectCgsMRoomReqVo);
		
        return cgsMroomReqDetail;
    } 
 
    /**
     * 회의실신청를 등록 처리 한다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSMRRC01")    
    @RequestMapping(value="SvcCCSCGSMRRC01")
    @ElDescription(sub="회의실신청 등록처러",desc="회의실신청를 등록 처리 한다.")
    public void insertCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo, Model model) throws Exception {

		
    	cgsMRoomReqService.insertCgsMRoomReq(cgsMRoomReqVo);   
    }
       
    /**
     * 회의실신청를 갱신 처리 한다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSMRRU01")    
    @RequestMapping(value="SvcCCSCGSMRRU01")    
    @ElValidator(errUrl="/cgsMRoomReq/cgsMRoomReqRegister", errContinue=true)
    @ElDescription(sub="회의실신청 갱신처러",desc="회의실신청를 갱신 처리 한다.")    
    public void updateCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo , Model model) throws Exception {  
 
    	cgsMRoomReqService.updateCgsMRoomReq(cgsMRoomReqVo);                                            
    }


    /**
     * 회의실신청를 삭제 처리한다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo     
     * @throws Exception1
     */
    @ElService(key = "SvcCCSCGSMRRD01")    
    @RequestMapping(value="SvcCCSCGSMRRD01")
    @ElDescription(sub = "회의실신청 삭제처리", desc = "회의실신청를 삭제 처리한다.")    
    public void deleteCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
        cgsMRoomReqService.deleteCgsMRoomReq(cgsMRoomReqVo);
    }
    
    
     /**
     * 회의실 목록을 조회합니다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSMRRR03")
    @RequestMapping(value="SvcCCSCGSMRRR03")    
    @ElDescription(sub="회의실 목록조회",desc="페이징을 처리하여 회의실 목록 조회를 한다.")               
    public CgsMRoomReqListVo selectListCgsMRoom(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {   
     	   	
    	cgsMRoomReqVo.setUse_yn("Y");
    		
        List<CgsMRoomReqVo> cgsMRoomList = cgsMRoomReqService.selectListCgsMRoom(cgsMRoomReqVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsMRoomReqListVo retCgsMRoomList = new CgsMRoomReqListVo();
		retCgsMRoomList.setCgsMRoomReqVoList(cgsMRoomList); 
		//retCgsMRoomList.setTotalCount(totCnt);

        return retCgsMRoomList;            
    } 
    
     /**
     * 회의실 부재장비 목록을 조회합니다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSMRRR04")
    @RequestMapping(value="SvcCCSCGSMRRR04")    
    @ElDescription(sub="회의실 부대장비 조회",desc="회의실 부대장비 조회")               
    public CgsMRoomReqListVo selectListCgsMRoomInfo(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {   
    		
        List<CgsMRoomReqVo> cgsMRoomList = cgsMRoomReqService.selectListCgsMRoomInfo(cgsMRoomReqVo);                  

		CgsMRoomReqListVo retCgsMRoomList = new CgsMRoomReqListVo();
		retCgsMRoomList.setCgsMRoomReqVoList(cgsMRoomList); 
		//retCgsMRoomList.setTotalCount(totCnt);

        return retCgsMRoomList;            
    } 
    
    /**
     * 회의실 신청할 경우 중복체크와 종료시간과 시작시간이 겹치는 상황 조회을 조회합니다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSMRRR05")
    @RequestMapping(value="SvcCCSCGSMRRR05")    
    @ElDescription(sub="회의실 중복, 종료와 시작시간 중복 조회",desc="회의실 신청할 경우 중복체크와 종료시간과 시작시간이 겹치는 상황 조회을 조회합니다.")               
    public CgsMRoomReqVo selectCgsMroomDupOverlap(CgsMRoomReqVo cgsMRoomReqVo) throws KitechException {
    	CgsMRoomReqVo ret = new CgsMRoomReqVo();
    	String result = cgsMRoomReqService.selectCgsMroomDupOverlap(cgsMRoomReqVo);
    	ret.setRmk(result);
    	return ret;
    } 
    
    @ElService(key = "SvcCCSCGSCOMR01")    
    @RequestMapping(value = "SvcCCSCGSCOMR01")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "근무자정보 조회", desc = "근무자정보 조회")    
    public CgsMRoomReqListVo selectEmp(CgsCommVo cgsCommVo) throws Exception {
    		
    	CgsCommVo vo = (CgsCommVo)cgsCommService.selectEmp(cgsCommVo);
    	
    	CgsMRoomReqListVo cvo = new CgsMRoomReqListVo();
    	
    	cvo.setCgsCommVo(vo);
    	
    	return cvo;
    }
     
    
    /**
     * 모바일 잔여 회의실을 조회합니다
     * @param CgsMRoomReqVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSMRMR03")
    @RequestMapping(value="SvcCCSCGSMRMR03")    
    @ElDescription(sub="잔여회의실 조회",desc="=모바일 잔여 회의실 조회를 한다")               
    public List<Object> selectListCgsMRoomMob(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
        return cgsMRoomReqService.selectListCgsMRoomMob(cgsMRoomReqVo);            
    }
    
    /**
     * 회의실신청를 승인 처리한다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo     
     * @throws Exception1
     */
    @ElService(key = "SvcCCSCGSMRRU02")    
    @RequestMapping(value="SvcCCSCGSMRRU02")
    @ElDescription(sub = "회의실신청를 승인", desc = "회의실신청를 승인 처리한다.")    
    public void formAccept(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
        cgsMRoomReqService.formAccept(cgsMRoomReqVo);
        cgsMRoomReqService.cgsMailSend(cgsMRoomReqVo);
    }
    
    /**
     * 회의실신청를 반려 처리한다.
     * @param cgsMRoomReqVo 회의실신청 CgsMRoomReqVo     
     * @throws Exception1
     */
    @ElService(key = "SvcCCSCGSMRRU03")    
    @RequestMapping(value="SvcCCSCGSMRRU03")
    @ElDescription(sub = "회의실신청를 반려 처리", desc = "회의실신청를 반려 처리한다.")    
    public void formReject(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
    	cgsMRoomReqService.formReject(cgsMRoomReqVo);
        cgsMRoomReqService.cgsMailSend(cgsMRoomReqVo);
    }
}
