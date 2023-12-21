package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApySemaService;
import kr.re.kitech.biz.hum.apy.vo.HumApySemaInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySemaAprVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**
 * @ClassSubJect 적립형공제신청
 * @Class Name HumApySemaController.java
 * @Description 적립형공제신청 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.09.25.     김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.09.25.
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class HumApySemaController {

	@Resource(name = "humApySemaServiceImpl")
	private HumApySemaService apyService;
	
    /**
     * 적립형공제신청 목록을 조회합니다.
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return List<HumApySemaInfoVo>
	 * @throws KitechException
	 * @since 2023.09.25.  
     */
	@ElService(key = "SvcHUMAPYSEMAR01")
	@RequestMapping(value = "SvcHUMAPYSEMAR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "적립형공제신청 목록을 조회", desc = "적립형공제신청 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<HumApySemaInfoVo> selectList(HumApySemaInfoVo apyVo) throws KitechException {
	    return apyService.selectList(apyVo);
	}
	
    /**
     * 적립형공제신청 정보 조회 
     * 
     * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return HumApySemaVo
	 * @throws KitechException
	 * @since 2023.09.25. 
     */	
	@ElService(key = "SvcHUMAPYSEMASS01")
	@RequestMapping(value = "SvcHUMAPYSEMASS01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "적립형공제신청 상세 조회", desc = "적립형공제신청 상세를 조회한다.")
	@ElValidator(errUrl = "")
	public HumApySemaAprVo select(HumApySemaInfoVo apyVo) throws KitechException {
	    return apyService.select(apyVo);
	}
    /**
     * 신규 신청으로 진입시 결재진행 중인 적립형공제신청건 유무 조회
     * 
     * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
     */	
	@ElService(key = "SvcHUMAPYSEMASS02")
	@RequestMapping(value = "SvcHUMAPYSEMASS02")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "결재진행중인 적립공제신청건 유무 조회", desc = "결재진행중인 적립공제신청건 유무를 조회한다.")
	@ElValidator(errUrl = "")
	public HumApySemaInfoVo selectHumApySemaDupCheck(HumApySemaInfoVo apyVo) throws KitechException {
	    return apyService.selectHumApySemaDupCheck(apyVo);
	}

    /**
     * 적립형공제신청 사용자 정보 조회
     * 
     * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
     */	
	@ElService(key = "SvcHUMAPYSEMASS03")
	@RequestMapping(value = "SvcHUMAPYSEMASS03")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "적립형공제신청 사용자 정보 조회", desc = "적립형공제신청 사용자의 정보를 조회한다.")
	@ElValidator(errUrl = "")
	public HumApySemaInfoVo selectEmpInfo(HumApySemaInfoVo apyVo) throws KitechException {
	    return apyService.selectEmpInfo(apyVo);
	}

	/**
     * 적립형공제신청 등록/수정/결재요청 합니다.
     * 
     * @author 김상미
	 * @param HumApySemaInfoVo
     * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25.  
     */	
	@ElService(key = "SvcHUMAPYSEMASI01")
	@RequestMapping(value = "SvcHUMAPYSEMASI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "적립형공제신청 등록/수정/결재요청", desc = "적립형공제신청 등록/수정/결재요청을 처리한다.")
	@ElValidator(errUrl = "")
	public HumApySemaInfoVo save(HumApySemaInfoVo apyVo) throws KitechException {
	    return apyService.save(apyVo);
	}
  
	/**
     * 적립형공제신청 정보 삭제
     * 
     * @author 김상미
	 * @param HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25.  
     */	
	@ElService(key = "SvcHUMAPYSEMASD01")
	@RequestMapping(value = "SvcHUMAPYSEMASD01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "적립형공제신청 정보 삭제", desc = "적립형공제신청 정보를 삭제 처리한다.")
	@ElValidator(errUrl = "")
	public void delete(HumApySemaInfoVo apyVo) throws KitechException {
	    apyService.delete(apyVo);
	}  

	/**
     * 적립형공제신청 전자결제 승인(화면)
     * 
     * @author 김상미
	 * @param HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
     */
    @ElService(key = "SvcHUMAPYSEMASM01")    
    @RequestMapping(value = "SvcHUMAPYSEMASM01")
    @ElDescription(sub = "적립형공제신청 전자결재 처리(화면)", desc = "적립형공제신청 전자결재 처리(화면)")
	@ElValidator(errUrl = "")
    public void formAccept(HumApySemaInfoVo apyVo, Model model) throws Exception {    	 
    	apyService.formConfirm(apyVo);
    }
    
	/**
     * 적립형공제신청 전자결제 반려(화면)
     * 
     * @author 김상미
	 * @param HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
     */
    @ElService(key = "SvcHUMAPYSEMASM02")    
    @RequestMapping(value = "SvcHUMAPYSEMASM02")
    @ElDescription(sub = "적립형공제신청 전자결재 반려(화면)", desc = "적립형공제신청 전자결재 반려(화면)")
	@ElValidator(errUrl = "")
    public void formReject(HumApySemaInfoVo apyVo, Model model) throws Exception {    	 
    	apyService.formReject(apyVo);
    } 
}
