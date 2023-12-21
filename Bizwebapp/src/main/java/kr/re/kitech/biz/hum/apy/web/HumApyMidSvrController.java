package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyMidSvrService;
import kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrVo;
import kr.re.kitech.biz.hum.apy.vo.HumslBasInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**
 * @ClassSubJect 퇴직금중간정산신청
 * @Class Name HumApyMidSvrController.java
 * @Description 퇴직금중간정산신청 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.31.     김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class HumApyMidSvrController {

    @Resource(name = "humApyMidSvrServiceImpl")
    private HumApyMidSvrService apyService; 
	
    /**
     * 퇴직금중간정산신청 리스트조회
	 * 
	 * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @return List<HumApyMidSvrInfoVo>
     * @throws KitechException
     * @since 2023.08.31.
     */
    @ElService(key="SvcHUMAPYMIDMR01")
    @RequestMapping(value="SvcHUMAPYMIDMR01")
    @DataCollection(ref="", target="")
    @ElDescription(sub="퇴직금중간정산신청 리스트 조회",desc="퇴직금중간정산신청 리스트를 조회한다.")
    public List<HumApyMidSvrInfoVo> selectList(HumApyMidSvrInfoVo apyVo) throws KitechException {
        return apyService.selectList(apyVo);
    }
	
    /**
     * 퇴직금중간정산신청 상세를 조회합니다.
	 *
     * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @return HumApyMidSvrVo
     * @throws KitechException
     * @since 2023.08.31.
     */	    
    @ElService(key="SvcHUMAPYMIDSR01")
    @RequestMapping(value="SvcHUMAPYMIDSR01")
    @DataCollection(ref="", target="")
    @ElDescription(sub="퇴직금중간정산신청 정보 조회",desc="퇴직금중간정산신청 정보를 조회한다.")
    public HumApyMidSvrVo select(HumApyMidSvrInfoVo apyVo) throws KitechException {
        HumApyMidSvrVo vo = apyService.select(apyVo); 
        return vo;
    }
	
    /**
     * 퇴직금중간정산신청 대상여부 조회
	 *
     * @author 김상미
     * @param HumslBasInfoVo
     * @return HumslBasInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */	        
    @ElService(key = "SvcHUMAPYMIDSR02")
    @RequestMapping(value = "SvcHUMAPYMIDSR02")
    @DataCollection(ref="", target="")
    @ElDescription(sub = "퇴직금중간정산신청 대상여부 조회", desc = "퇴직금중간정산신청 대상여부를 조회한다.")
	@ElValidator(errUrl = "")
    public HumslBasInfoVo selectEmpState(HumslBasInfoVo apyVo) throws KitechException {
        return apyService.selectEmpState(apyVo);
    }
	
    /**
     * 퇴직금중간정산신청 결재정보 조회
	 *
     * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @return HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */	     
    @ElService(key = "SvcHUMAPYMIDSR03")
    @RequestMapping(value = "SvcHUMAPYMIDSR03")
    @DataCollection(ref="", target="")
    @ElDescription(sub = "퇴직금중간정산신청 결재정보 조회", desc = "퇴직금중간정산신청 결재정보를 조회한다.")
	@ElValidator(errUrl = "")
    public HumApyMidSvrInfoVo selectApr(HumApyMidSvrInfoVo apyVo) throws KitechException {
        return apyService.selectApr(apyVo);
    } 	
	
    /**
     * 퇴직금중간정산 신청자 기본정보 조회
	 *
     * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @return HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */	     
    @ElService(key = "SvcHUMAPYMIDSR04")
    @RequestMapping(value = "SvcHUMAPYMIDSR04")
    @DataCollection(ref="", target="")
    @ElDescription(sub = "퇴직금중간정산신청자 정보 조회", desc = "퇴직금중간정산신청자 정보를 조회한다.")
	@ElValidator(errUrl = "")
    public HumApyMidSvrInfoVo selectEmpInfo(HumApyMidSvrInfoVo apyVo) throws KitechException {
        return apyService.selectEmpInfo(apyVo);
    }
	
    /**
     * 퇴직금중간정산신청 건수 조회
	 *
     * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @return HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */	   
    @ElService(key = "SvcHUMAPYMIDSR05")
    @RequestMapping(value = "SvcHUMAPYMIDSR05")
    @DataCollection(ref="", target="")
    @ElDescription(sub = "퇴직금중간정산신청 건수 조회", desc = "퇴직금중간정산신청 건수를 조회한다.")
	@ElValidator(errUrl = "")
    public HumApyMidSvrInfoVo selectReqCount(HumApyMidSvrInfoVo apyVo) throws KitechException {
        return apyService.selectReqCount(apyVo);
    }        

    /**
     * 퇴직금중간정산신청을 위한 급여기본정보 조회
	 *
     * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @return HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */	    
    @ElService(key = "SvcHUMAPYMIDSR06")
    @RequestMapping(value = "SvcHUMAPYMIDSR06")
    @DataCollection(ref="", target="")
    @ElDescription(sub = "퇴직금중간정산신청자 급여기본정보 조회", desc = "퇴직금중간정산신청자 급여기본정보를 조회한다.")
	@ElValidator(errUrl = "")
    public HumApyMidSvrInfoVo selectSalBasicInfo(HumApyMidSvrInfoVo apyVo) throws KitechException {
        return apyService.selectSalBasicInfo(apyVo);
    } 
        	
    /**
     * 퇴직금중간정산신청 등록/수정/결재요청 합니다.
	 *
     * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @return HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */	     
    @ElService(key = "SvcHUMAPYMIDSI01")
    @RequestMapping(value = "SvcHUMAPYMIDSI01")
    @DataCollection(ref="", target="")
    @ElDescription(sub = "퇴직금중간정산신청 등록/수정/결재요청", desc = "퇴직금중간정산신청 등록/수정/결재요청 한다.")
	@ElValidator(errUrl = "")
    public HumApyMidSvrInfoVo save(HumApyMidSvrInfoVo apyVo) throws KitechException {
        return apyService.save(apyVo);
    }
  
    /**
     * 퇴직금중간정산신청 정보, 전자결재를 삭제합니다.
     * @author 김상미
     * @param HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */	
	@ElService(key = "SvcHUMAPYMIDSD01")
	@RequestMapping(value = "SvcHUMAPYMIDSD01")
	@ElDescription(sub = "퇴직금중간정산신청 삭제", desc = "퇴직금중간정산신청 정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void delete(HumApyMidSvrInfoVo apyVo) throws Exception {
		apyService.delete(apyVo);
	}  	
  
    /**
     * 퇴직금중간정산신청 전자결제 승인(화면)
     * @param HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */
    @ElService(key = "SvcHUMAPYMIDSM01")    
    @RequestMapping(value = "SvcHUMAPYMIDSM01")
    @ElDescription(sub = "퇴직금중간정산신청 전자결재 처리(화면)", desc = "퇴직금중간정산신청 전자결재 처리(화면)")
	@ElValidator(errUrl = "")
    public void formAccept(HumApyMidSvrInfoVo apyVo, Model model) throws KitechException {    	 
    	apyService.formConfirm(apyVo);
    }
        
    /**
     * 퇴직금중간정산신청 전자결제 반려(화면)
     * @param HumApyMidSvrInfoVo
     * @throws KitechException
     * @since 2023.08.31.
     */
    @ElService(key = "SvcHUMAPYMIDSM02")    
    @RequestMapping(value = "SvcHUMAPYMIDSM02")
    @ElDescription(sub = "퇴직금중간정산신청 전자결재 반려(화면)", desc = "퇴직금중간정산신청 전자결재 반려(화면)")
	@ElValidator(errUrl = "")
    public void formReject(HumApyMidSvrInfoVo apyVo, Model model) throws KitechException {    	 
    	apyService.formReject(apyVo);
    }    

}
