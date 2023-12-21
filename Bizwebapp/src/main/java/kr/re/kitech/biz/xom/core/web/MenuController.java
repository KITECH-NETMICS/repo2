package kr.re.kitech.biz.xom.core.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.meta.ElCustomNotifyUtil;

import kr.re.kitech.biz.xom.base.manager.MenuCacheManager;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 메뉴 관련 서비스
 *  
 * @author James
 * @since 2022. 2. 15.
 */
@Controller
public class MenuController {
    @Resource(name = "menuServiceImpl")
    private MenuService menuService;
    
    @Resource(name="accntServiceImpl")
    private AccntService accntService;    
    
	@Resource(name = "messageSource")
	private MessageSource messageSource;
    
	/**
	 * 전체 메뉴를 계층형으로 정렬하여 조회한다.
	 * @param menuVo 사원정보 ServiceVo
	 * @param model 결과정보를 담을 Model
	 * @return 이동할 URL 정보
	 * @throws Exception
	 */
	@ElService(key = "SvcAllMenuList")
    @RequestMapping(value = "SvcAllMenuList")    
    @ElDescription(sub = "전체메뉴조회", desc = "전체 메뉴를 계층형으로 정렬하여 조회한다.")
	@ElValidator(errUrl = "")               
    public ServiceListVo selectAllMenuList(ServiceVo menuVo) throws Exception {          
        
    	AppLog.debug("전체 메뉴 목록 조회: " + menuVo);            

        List<ServiceVo> menus = menuService.findActiveServices();

		ServiceListVo retServices = new ServiceListVo();
		retServices.setServiceVoList(menus); 
        return retServices;
    } 
    
	/**
	 * 사용자 권한 메뉴를 계층형으로 정렬하여 조회한다.
	 * @param menuVo 메뉴 정보 ServiceVo
	 * @param model 결과정보를 담을 Model
	 * @return 이동할 URL 정보
	 * @throws Exception
	 */
	@ElService(key = "SvcMenuList")
    @RequestMapping(value = "SvcMenuList")    
    @ElDescription(sub = "사용자메뉴조회", desc = "사용자 메뉴를 계층형으로 정렬하여 조회한다.")
	@ElValidator(errUrl = "")               
    public ServiceListVo selectMenuList(UserVo user) throws Exception {
		List<ServiceVo> menus = MenuCacheManager.getInstance().getMenusBySession(KitechContextUtil.getSession());
		ServiceListVo retServices = new ServiceListVo();
		retServices.setServiceVoList(menus); 

        return retServices;
    }     


	/**
	 * 단건 메뉴(서비스) 정보를 조회한다.
	 * @param menuVo 메뉴 정보 ServiceVo
	 * @param model 결과정보를 담을 Model
	 * @return 이동할 URL 정보
	 * @throws Exception
	 */
	@ElService(key = "SvcGetMenu")
    @RequestMapping(value = "SvcGetMenu")    
    @ElDescription(sub = "사용자 단건 메뉴조회", desc = "사용자 단건 메뉴를 조회한다.")
	@ElValidator(errUrl = "")               
    public ServiceVo getMenu(ServiceVo service) throws Exception {
		// String syspayno = KitechContextUtil.getSyspayno();
     
		// TODO: 권한 체크 및 예외 처리 필요.
    	AppLog.debug("사용자 메뉴 단건 조회", service.getServiceID());
    	
        return accntService.findServiceByServiceId(service.getServiceID());
    }
    
    /**
     * 그룹 코드 별 코드 리스트 조회
	 */
	@ElService(key = "SvcReloadMenus")
    @RequestMapping(value = "SvcReloadMenus")    
    @ElDescription(sub = "메뉴 리로딩", desc = "메뉴를 계층형으로 정렬하여 리로딩한다.")
	@ElValidator(errUrl = "")               
    public void reloadCodes(ServiceVo serviceVo) throws Exception {
		AppLog.debug("메뉴 리로딩 시작 SC: " + serviceVo);    
		ElCustomNotifyUtil.reloadCustomCacheManager(MenuCacheManager.class);
		AppLog.debug("메뉴 리로딩 시작 종료");		
    }
    
    
}
