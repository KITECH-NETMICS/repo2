package kr.re.kitech.biz.xom.core.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.xom.core.service.ApprvConfigService;
import kr.re.kitech.biz.xom.core.vo.ApprMapVo;
import kr.re.kitech.biz.xom.core.vo.ApprvConfigVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo;
import kr.re.kitech.biz.xom.core.vo.UserAppvConfigVo;

/**  
 * @ClassSubJect 환경설정 
 * @Class Name : ApprvConfigController.java
 * @Description : 환경설정을 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/16   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/08/16
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class ApprvConfigController {
	@Resource(name="apprvConfigService")
	private ApprvConfigService configService;
	
	@ElService(key = "SvcXOMCORER01")
	@RequestMapping(value = "SvcXOMCORER01")
	@ElDescription(sub = "사용자 환경설정 조회", desc = "사용자 환경설정을 조회한다.")
	@ElValidator(errUrl = "")
	public UserAppvConfigVo selectApprvConfig(ApprvConfigVo vo) throws Exception{
		return configService.selectApprvConfig(vo);
	}
	
	@ElService(key = "SvcXOMCOREM01")
	@RequestMapping(value = "SvcXOMCOREM01")
	@ElDescription(sub = "환경설정 저장", desc = "사용자의 환경설정을 저장한다.")
	@ElValidator(errUrl = "")
	public void saveApprvConfig(ApprvConfigVo vo) throws Exception{
		configService.saveApprvConfig(vo);
	}
	
	@ElService(key = "SvcXOMCORER02")
	@RequestMapping(value = "SvcXOMCORER02")
	@ElDescription(sub = "결재 양식명 트리 조회", desc = "결재 양식명 트리 조회")
	@ElValidator(errUrl = "")
	public List<ApprMapVo> selectAppvMapList(ApprvConfigVo vo) throws Exception{
		return configService.selectAppvMapList(vo);
	}
	
	@ElService(key = "SvcXOMCORER03")
	@RequestMapping(value = "SvcXOMCORER03")
	@ElDescription(sub = "대결설정 조회", desc = "대결설정 및 상세내역을 조회한다.")
	@ElValidator(errUrl = "")
	public UserAppvConfigVo selectApprvDlgt(AppvDelegatorVo vo) throws Exception{
		return configService.selectApprvDlgt(vo);
	}
	
	@ElService(key = "SvcXOMCOREM02")
	@RequestMapping(value = "SvcXOMCOREM02")
	@ElDescription(sub = "대결설정 저장", desc = "대결설정 및 상세설정을 저장한다.")
	@ElValidator(errUrl = "")
	public void saveAppvDelegator(UserAppvConfigVo vo) throws Exception{
		configService.saveAppvDelegator(vo);
	}
	
	@ElService(key = "SvcXOMCORED01")
	@RequestMapping(value = "SvcXOMCORED01")
	@ElDescription(sub = "대결설정 삭제", desc = "대결설정 및 상세내역을 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteAppvDelegator(AppvDelegatorDetailVo vo) throws Exception{
		configService.deleteAppvDelegator(vo);
	}
	
	@ElService(key = "SvcXOMCORED02")
	@RequestMapping(value = "SvcXOMCORED02")
	@ElDescription(sub = "대결설정 전체 삭제", desc = "특정사용자의 전체 대결설정 및 상세내역을 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteAppvDelegatorAll(AppvDelegatorDetailVo vo) throws Exception{
		configService.deleteAppvDelegatorAll(vo.getSyspayno());
	}
}
