package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyStuService;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuSrchVo;


/**  
 * @ClassSubJect 학생연구원활용예정확인서 관련 컨트롤러
 * @Class Name HumApyStuController.java
 * @Description 학생연구원활용예정확인서 관련 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/07     석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/07
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumApyStuController {
	
    @Resource(name = "humApyStuServiceImpl")
    private HumApyStuService humApyStuService;

    @ElService(key = "SvcHUMAPYSTUR01")
    @RequestMapping(value = "SvcHUMAPYSTUR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 목록조회", desc = "학생연구원활용예정확인서 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyStuInfoVo> selectHumApyStuList(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 목록조회
        return humApyStuService.selectHumApyStuList(vo);            
    }

    @ElService(key = "SvcHUMAPYSTURCMDU01")
    @RequestMapping(value = "SvcHUMAPYSTURCMDU01")    
    @ElDescription(sub = "학생연구원활용예정확인서 추천서 발급번호 생성", desc = "학생연구원활용예정확인서 추천서 발급번호 생성을 한다.")
	@ElValidator(errUrl = "")               
    public void updateHumApyStuRcmd(HumApyStuListVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 추천서 발급번호 생성
         humApyStuService.updateHumApyStuRcmd(vo);            
    }

    @ElService(key = "SvcHUMAPYSTUMAILU01")
    @RequestMapping(value = "SvcHUMAPYSTUMAILU01")    
    @ElDescription(sub = "학생연구원활용예정확인서 메일발송 여부 수정", desc = "학생연구원활용예정확인서 메일발송 여부 수정 한다.")
	@ElValidator(errUrl = "")               
    public void updateEmailYn(HumApyStuListVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 추천서 발급번호 생성
         humApyStuService.updateEmailYn(vo);            
    }

    @ElService(key = "SvcHUMAPYSTUPRJR01")
    @RequestMapping(value = "SvcHUMAPYSTUPRJR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 연수책임자 과제 현황 목록 조회", desc = "학생연구원활용예정확인서 연수책임자 과제 현황 목록을 조회 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyStuInfoVo> selectHumApyStuPrjList(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 연수책임자 과제 현황 목록 조회
        return humApyStuService.selectHumApyStuPrjList(vo);
    }

    @ElService(key = "SvcHUMAPYSTUSTUR01")
    @RequestMapping(value = "SvcHUMAPYSTUSTUR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 연수책임자 지도 학생 연구원 현황 목록 조회", desc = "학생연구원활용예정확인서 연수책임자 지도 학생 연구원 현황 목록을 조회 한다.")
	@ElValidator(errUrl = "")               
    public List<HumApyStuInfoVo> selectHumApyStuStuList(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 연수책임자 지도 학생 연구원 현황 목록 조회
        return humApyStuService.selectHumApyStuStuList(vo);
    }
    
    @ElService(key = "SvcHUMAPYSTUEXPNSR01")
    @RequestMapping(value = "SvcHUMAPYSTUEXPNSR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 연수책임자 학생인건비 현황 조회", desc = "학생연구원활용예정확인서 연수책임자 학생인건비 현황을 조회 한다.")
    @ElValidator(errUrl = "")               
    public List<HumApyStuInfoVo> selectHumApyStuExpns(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 연수책임자 학생인건비 현황 조회
    	return humApyStuService.selectHumApyStuExpns(vo);
    }    
    
    @ElService(key = "SvcHUMAPYSTUINFOR01")
    @RequestMapping(value = "SvcHUMAPYSTUINFOR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 신청서 상세조회", desc = "학생연구원활용예정확인서 신청서 내 정보를 상세조회 한다.")
    @ElValidator(errUrl = "")               
    public HumApyStuInfoVo selectHumApyStuInfo(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 신청서 상세조회
    	return humApyStuService.selectHumApyStuInfo(vo);
    }    
    
    @ElService(key = "SvcHUMAPYSTUINFOLISTR01")
    @RequestMapping(value = "SvcHUMAPYSTUINFOLISTR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 학생연구원 정보 목록 조회", desc = "학생연구원활용예정확인서 상세조회 시 학생연구원 정보 목록을 조회 한다.")
    @ElValidator(errUrl = "")               
    public List<HumApyStuInfoVo> selectHumApyStuInfoList(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 학생연구원 정보 목록 조회
    	return humApyStuService.selectHumApyStuInfoList(vo);
    }    
    
    @ElService(key = "SvcHUMAPYSTUSALINSURR01")
    @RequestMapping(value = "SvcHUMAPYSTUSALINSURR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 보험율 산정 방식 조회", desc = "학생연구원활용예정확인서 보험율 산정 방식을 조회 한다.")
    @ElValidator(errUrl = "")               
    public HumApyStuInfoVo selectHumApyStuSalInsur(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 보험율 산정 방식
    	return humApyStuService.selectHumApyStuSalInsur(vo);
    }    
    
    @ElService(key = "SvcHUMAPYSTUSALANUPAYR01")
    @RequestMapping(value = "SvcHUMAPYSTUSALANUPAYR01")    
    @ElDescription(sub = "학생연구원활용예정확인서 학생연구원 급여기준표 급여 조회", desc = "학생연구원활용예정확인서 학생연구원 급여기준표로 급여를 조회 한다.")
    @ElValidator(errUrl = "")               
    public HumApyStuInfoVo selectHumApyStuSalAnuPay(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 학생연구원 급여기준표 급여 조회
    	return humApyStuService.selectHumApyStuSalAnuPay(vo);
    }    
    
    @ElService(key = "SvcHUMAPYSTUI01")
    @RequestMapping(value = "SvcHUMAPYSTUI01")    
    @ElDescription(sub = "학생연구원활용예정확인서 저장, 수정, 결재신청", desc = "학생연구원활용예정확인서 신청서의 저장, 수정, 결재신청 기능을 한다.")
    @ElValidator(errUrl = "")               
    public HumApyStuInfoVo saveHumApyStu(HumApyStuListVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 저장, 수정, 결재신청
		HumApyStuInfoVo retVo = new HumApyStuInfoVo();
		retVo.setReq_no(humApyStuService.saveHumApyStu(vo));
    	return retVo;
    }
    
    @ElService(key = "SvcHUMAPYSTUD01")
    @RequestMapping(value = "SvcHUMAPYSTUD01")    
    @ElDescription(sub = "학생연구원활용예정확인서 신청서 삭제", desc = "학생연구원활용예정확인서 신청서 삭제를 한다.")
    @ElValidator(errUrl = "")               
    public void deleteHumApyStu(HumApyStuSrchVo vo) throws Exception {    	   	
    	//학생연구원활용예정확인서. 신청서 삭제
    	humApyStuService.deleteHumApyStu(vo);
    }
    
}
