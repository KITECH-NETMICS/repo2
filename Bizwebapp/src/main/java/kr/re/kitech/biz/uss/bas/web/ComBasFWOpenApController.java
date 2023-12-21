package kr.re.kitech.biz.uss.bas.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.uss.bas.service.ComBasFWOpenApService;
import kr.re.kitech.biz.uss.bas.vo.ComBasFWOpenInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * @ClassSubJect 
 * @ClassName : ComBasFWOpenApController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.19.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.19.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ComBasFWOpenApController {
	@Resource(name = "comBasFWOpenApServiceImpl")
	private ComBasFWOpenApService basService;

	/**
	 * 방화벽오픈신청 리스트 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return List<ComBasFWOpenInfoVo>
	 * @throws KitechException
	 * @since 2023.09.19.   
	 */	
	@ElService(key="SvcCOMBASFWOPMR01")
	@RequestMapping(value="SvcCOMBASFWOPMR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="방화벽오픈신청 리스트 조회",desc="방화벽오픈신청 리스트를 조회한다.")
	public List<ComBasFWOpenInfoVo> selectList(ComBasFWOpenInfoVo basVo) throws KitechException { 	 
		return basService.selectList(basVo);
	}	


	/**
	 * 방화벽오픈신청서 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
	 */	
	@ElService(key="SvcCOMBASFWOPSR01")
	@RequestMapping(value="SvcCOMBASFWOPSR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="방화벽오픈신청서 조회",desc="방화벽오픈신청서를 조회한다.")
	public ComBasFWOpenInfoVo select(ComBasFWOpenInfoVo basVo) throws KitechException { 	 
		return basService.select(basVo);
	}	
	
	/**
	 * LDAP담당자 정보조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return List<UserVo>
	 * @throws KitechException
	 * @since 2023.09.19.   
	 */	
	@ElService(key="SvcCOMBASFWOPSR02")
	@RequestMapping(value="SvcCOMBASFWOPSR02")
	@DataCollection(ref="", target="")
	@ElDescription(sub="LDAP담당자 정보조회",desc="LDAP담당자 정보를 조회한다.")
	public List<UserVo> selectManagerList(ComBasFWOpenInfoVo basVo) throws KitechException { 	 
		return basService.selectManagerList(basVo);
	}	

    /**
     * 방화벽오픈신청서 등록/수정/결재요청 합니다.
     * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */	     
    @ElService(key = "SvcCOMBASFWOPSI01")
    @RequestMapping(value = "SvcCOMBASFWOPSI01")
    @DataCollection(ref="", target="")
    @ElDescription(sub = "방화벽오픈신청서 등록/수정/결재요청", desc = "방화벽오픈신청서 등록/수정/결재요청 한다.")
	@ElValidator(errUrl = "")
    public ComBasFWOpenInfoVo save(ComBasFWOpenInfoVo basVo) throws Exception {
        return basService.save(basVo);
    }
  
    /**
     * 방화벽오픈신청서 정보, 전자결재를 삭제합니다.
     * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */	
	@ElService(key = "SvcCOMBASFWOPSD01")
	@RequestMapping(value = "SvcCOMBASFWOPSD01")
	@ElDescription(sub = "방화벽오픈신청서 삭제", desc = "방화벽오픈신청서 정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void delete(ComBasFWOpenInfoVo basVo) throws KitechException {
		basService.delete(basVo);
	} 	

    /**
     * 방화벽오픈신청서 전자결제 승인(화면)
     * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
    @ElService(key = "SvcCOMBASFWOPSM01")    
    @RequestMapping(value = "SvcCOMBASFWOPSM01")
	@DataCollection(ref="", target="")    
    @ElDescription(sub = "방화벽오픈신청서 전자결재 처리(화면)", desc = "방화벽오픈신청서 전자결재 처리(화면)")
    public void formAccept(ComBasFWOpenInfoVo basVo, Model model) throws KitechException {    	 
    	basService.formConfirm(basVo);
    }
        
    /**
     * 방화벽오픈신청서 전자결제 반려(화면)
     * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
    @ElService(key = "SvcCOMBASFWOPSM02")    
    @RequestMapping(value = "SvcCOMBASFWOPSM02")
	@DataCollection(ref="", target="") 
    @ElDescription(sub = "방화벽오픈신청서 전자결재 반려(화면)", desc = "방화벽오픈신청서 전자결재 반려(화면)")
    public void formReject(ComBasFWOpenInfoVo basVo, Model model) throws KitechException {    	 
    	basService.formReject(basVo);
    }  
}
