package kr.re.kitech.biz.ass.app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ass.app.service.AssAppUnUseService;
import kr.re.kitech.biz.ass.app.vo.AssMastrBVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseListVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseSrcVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;

/**  
 * @ClassSubJect 자산 불용신청 
 * @Class Name : AssAppUnUseController.java
 * @Description : 자산 불용신청 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/25   이영희                  최초생성
 * 
 * @author LeeYh
 * @since 2023/07/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@SuppressWarnings("unused")
@Controller
public class AssAppUnUseController{
	@Resource(name="assAppUnUseService")
	AssAppUnUseService unuseService;
	
	 /**
     * 불용신청 목록을 조회합니다.
     * @param vo 불용자산 vo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcASSAPPCGCR01")
    @RequestMapping(value = "SvcASSAPPCGCR01")    
    @ElDescription(sub = "불용신청 목록조회", desc = "페이징을 처리하여 불용신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<AssUnUseVo> selectListAssUnUse(AssUnUseSrcVo vo) throws Exception {   
        return unuseService.selectListAssUnUseList(vo);            
    }  
    
     /**
     * 불용자산 신청 상세 조회합니다.
     * @param vo 불용자산 vo
     * @return 상세보기
     * @throws Exception
     */
	
	@ElService(key = "SvcASSAPPASSSR01")
	@RequestMapping(value = "SvcASSAPPASSSR01")
	@ElDescription(sub = "불용자산신청 자산목록 조회", desc = "불용자산신청 자산목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<AssUnUseVo> selectAssUnUseList(AssUnUseVo vo) throws Exception{
		return unuseService.selectAssUnUseList(vo);
	}
	
	 /**
     * 불용자산 신청 자산목록상세 조회합니다.
     * @param vo 불용자산 vo
     * @return 상세보기
     * @throws Exception
     */
	
	@ElService(key = "SvcASSAPPLISTR01")
	@RequestMapping(value = "SvcASSAPPLISTR01")
	@ElDescription(sub = "불용자산신청 자산목록 조회", desc = "불용자산신청 자산목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<AssMastrBVo> selectAssUnUseCList(AssMastrBVo vo) throws Exception{
		return unuseService.selectAssUnUseCList(vo);
	}
	
	 /**
     * 불용자산 신청을 저장합니다.
     * @param vo 불용자산 vo
     * @return 상세보기
     * @throws Exception
     */
	
	@ElService(key = "SvcASSAPPASSSI01")
	@RequestMapping(value = "SvcASSAPPASSSI01")
	@ElDescription(sub = "불용자산신청 저장", desc = "불용자산신청을 저장한다.")
	@ElValidator(errUrl = "")
		public AssUnUseVo saveAsetUnUse(AssUnUseListVo vo) throws Exception{
		
		AssUnUseVo retVo = new AssUnUseVo();
		retVo.setReq_no(unuseService.saveAsetUnUse(vo));
		
		return retVo;
	}
	
	 /**
     * 불용자산 신청을 삭제합니다.
     * @param vo 불용자산 vo
     * @throws Exception
     */
	@ElService(key = "SvcASSAPPASSCD01")
	@RequestMapping(value = "SvcASSAPPASSCD01")
	@ElDescription(sub = "불용자산신청 삭제", desc = "불용자산신청을 삭제한다.")
	@ElValidator(errUrl = "")
		public void deleteAsetUnUse(AssUnUseVo vo) throws Exception{
		unuseService.deleteAsetUnUse(vo);
		
	}
	
	  /**
     * 불용자산 상세보기 단건 조회 처리 한다.
     * @param 
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcASSAPPASSR02")    
    @RequestMapping(value = "SvcASSAPPASSR02") 
    @ElDescription(sub = "불용신청 상세 보기를 조회한다.", desc = "불용신청 상세 보기를 조회한다.")
	@ElValidator(errUrl = "")    
    public AssUnUseDetailVo selectAssUnUseDtl(AssUnUseDetailVo vo) throws Exception {
        return unuseService.selectAssUnUseDtl(vo);
    }
    
    /**
     * 불용자산 상세보기 수정을 저장합니다.
     * @param vo 불용자산 vo
     * @throws Exception
     */
	
	@ElService(key = "SvcASSAPPASSU01")
	@RequestMapping(value = "SvcASSAPPASSU01")
	@ElDescription(sub = "불용자산신청 상세보기 저장", desc = "불용자산신청 상세보기를 수정 후 저장한다.")
	@ElValidator(errUrl = "")
		public void updateAsetUnUseDtl(AssUnUseListVo vo) throws Exception{
		unuseService.updateAsetUnUseDtl(vo);
	}
	
	/**
	 * 불용자산 신청구분을 수정합니다.
	 * @param vo 불용자산 vo
	 * @throws Exception
	 */
	@ElService(key = "SvcASSAPPASSU02")
	@RequestMapping(value = "SvcASSAPPASSU02")
	@ElDescription(sub = "불용자산신청 신청구분 수정", desc = "불용자산신청 신청구분을 수정한다.")
	public void updateRstrt(AssUnUseVo vo) throws Exception{
		unuseService.updateRstrt(vo);
		
	}
}
