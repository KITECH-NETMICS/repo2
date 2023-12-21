package kr.re.kitech.biz.ccs.cgs.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.cgs.service.CgslappService;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappAnalVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappPsnViewVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappReqInfoVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;


/**  
 * @ClassSubJect 휴가원 관련 처리른 하는 컨트롤러
 * @Class Name CgslappController.java
 * @Description 휴가원 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/03     박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/05/03
 * @version 1.0
 * @see
 * 
 */

@Controller
public class CgslappController {
	
    /** CgslappService */
    @Resource(name = "cgslappServiceImpl")
    private CgslappService cgslappService;
	
    /**
     * 휴가원 목록을 조회합니다.
     * @param cgslappVo 휴가원 CgslappVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSVACR01")
    @RequestMapping(value="SvcCCSCGSVACR01")    
    @ElDescription(sub="휴가원 목록조회",desc="페이징을 처리하여 휴가원 목록 조회를 한다.")               
    public List<CgslappVo> selectListCgslapp(CgslappSchVo cgslappSchVo) throws Exception {   
        return cgslappService.selectListCgslapp(cgslappSchVo);            
    }  
        
    /**
     * 휴가원을 단건 조회 처리 한다.
     * @param cgslappVo 휴가원 CgslappVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCGSVACR02")    
    @RequestMapping(value="SvcCCSCGSVACR02") 
    @ElDescription(sub = "휴가원 갱신 폼을 위한 조회", desc = "휴가원 갱신 폼을 위한 조회를 한다.")    
    public CgslappReqInfoVo selectCgslapp(CgslappSchVo vo) throws Exception {
        return cgslappService.selectCgslapp(vo);
    }
    
    
    @ElService(key = "SvcCCSCGSVACR05")
	@RequestMapping(value = "SvcCCSCGSVACR05")
	@ElDescription(sub = "개인연차잔여일수 조회(팝업)", desc = "개인연차조회팝업에서 개인연차잔여일수를 조회한다.")
	@ElValidator(errUrl = "")
	public CgslappAnalVo selectRemidrAnalQtyPop(CgslappSchVo cgslappSchVo) throws Exception {
    	return cgslappService.selectRemidrAnalQtyPop(cgslappSchVo);
    }
    
    /**
     * 개인 잔여연차일수, 미승인 연차일수, 보상연차일수 조회
     * @param cgslappSchVo 시스템사번 cgslappSchVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCGSVACR04")
    @RequestMapping(value = "SvcCCSCGSVACR04")
    @ElDescription(sub = "개인 잔여연차일수 조회", desc = "개인 잔여연차일수 조회를 한다.")
	@ElValidator(errUrl = "")    
    public CgslappAnalVo selectRemidrAnalQty(CgslappSchVo cgslappSchVo) throws Exception {
        return cgslappService.selectRemidrAnalQty(cgslappSchVo);
    }
    
    /**
     * 워크데이 조회
     * @param cgslappSchVo 시스템사번 cgslappSchVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCGSVACR06")
    @RequestMapping(value="SvcCCSCGSVACR06")
    @ElDescription(sub = "워크데이 조회", desc = "워크데이 조회를 한다.")    
    public Map<String,String> searchWorkDays(CgslappSchVo cgslappSchVo, Model model) throws Exception {
    	Map<String,String> map = new HashMap<>();
    	map.put("work_days", String.valueOf(cgslappService.selectWorkDays(cgslappSchVo)));
        return map;
    }
    
    /**
     * 연차조회 처리 한다.
     * @param cgslappSchVo 휴가원 cgslappSchVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCGSVACR10")    
    @RequestMapping(value = "SvcCCSCGSVACR10") 
    @ElDescription(sub = "연차사용내역(팝업)", desc = "개인의 연차사용내역을 조회한다.(팝업)")
	@ElValidator(errUrl = "")    
    public CgslappPsnViewVo selectPsnHoliInfo(CgslappSchVo cgslappSchVo, Model model) throws Exception {
        return cgslappService.selectPsnHoliInfo(cgslappSchVo);
    }
	
	/**
     * 미처리현황 조회
     * @param cgslappSchVo 시스템사번 cgslappSchVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCGSVACR15")
    @RequestMapping(value="SvcCCSCGSVACR15")
    @ElDescription(sub = "미처리현황 조회", desc = "미처리현황 조회를 한다.")    
    public Map<String,String> selectLappNoFileCnt(CgslappSchVo cgslappSchVo, Model model) throws Exception {
    	Map<String,String> map = new HashMap<>();
    	map.put("no_file_cnt", String.valueOf(cgslappService.selectLappNoFileCnt(cgslappSchVo)));
        return map;
    }
 
    @ElService(key = "SvcCCSCGSVACM01")
	@RequestMapping(value = "SvcCCSCGSVACM01")
	@ElDescription(sub = "휴가원신청 저장", desc = "휴가원신청을 저장한다.")
	@ElValidator(errUrl = "")
	public CgslappSchVo saveCgsLapp(CgslappReqInfoVo vo) throws Exception {    
    	return cgslappService.saveCgsLapp(vo);
    }

    @ElService(key = "SvcCCSCGSVACU01")    
    @RequestMapping(value = "SvcCCSCGSVACU01")    
    @ElValidator(errUrl = "/cgslapp/cgslappRegister", errContinue = true)
    @ElDescription(sub = "휴가원 증빙자료 저장", desc = "휴가원 증빙자료를 저장한다.(팝업)")    
    public void updateCgsLappEvid(CgslappVo cgslappVo , Model model) throws Exception { 
    	cgslappService.updateCgsLappEvid(cgslappVo);                                            
    }
    
    @ElService(key = "SvcCCSCGSVACU02")
	@RequestMapping(value = "SvcCCSCGSVACU02")
	@ElDescription(sub = "개인연차조회 팝업에서 저장연차 업데이트", desc = "개인연차조회 팝업에서 저장연차를 업데이트한다.")
	@ElValidator(errUrl = "")
	public void updateCgsLappSaveAnal(CgslappVo vo) throws Exception{
    	cgslappService.updateCgsLappSaveAnal(vo);
    }

    /**
     * 휴가원를 삭제 처리한다.
     * @param cgslappVo 휴가원 CgslappVo     
     * @throws Exception
     */
    @ElService(key = "SvcCCSCGSVACD01")    
    @RequestMapping(value="SvcCCSCGSVACD01")
    @ElDescription(sub = "휴가원 삭제처리", desc = "휴가원를 삭제 처리한다.")    
    public void deleteCgslapp(CgslappSchVo vo) throws Exception {
        cgslappService.deleteCgslapp(vo);
    }
    
    @ElService(key = "SvcCCSCGSVACR03")
	@RequestMapping(value = "SvcCCSCGSVACR03")
	@ElDescription(sub = "휴가원증빙자료 조회", desc = "휴가원증빙자료(팝업)를 조회한다.")
	@ElValidator(errUrl = "")
	public CgslappReqInfoVo selectCgsLappEvid(CgslappSchVo vo) throws Exception{
    	return cgslappService.selectCgsLappEvid(vo);
    }
   
}
