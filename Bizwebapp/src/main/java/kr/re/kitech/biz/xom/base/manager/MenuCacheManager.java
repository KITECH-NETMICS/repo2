/**
 * 
 */
package kr.re.kitech.biz.xom.base.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.meta.ElAbstractCacheManager;
import com.inswave.elfw.util.ElBeanUtils;

import kr.re.kitech.biz.com.enums.ExceptKind;
import kr.re.kitech.biz.com.service.ExceptService;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 전체 서비스를 정적 메모리 공간에 적재하여 캐시용도로 사용한다.
 *   - 최초 개발서버 반영 (2023-10-31)
 *
 * @author James
 * @since 2023. 4. 28.
 */
public class MenuCacheManager extends ElAbstractCacheManager {

	private static MenuCacheManager instance;	
	private List<ServiceVo> services = null;
	
	private static boolean IS_LOCAL;
	private final String PUBLIC_ROLECODE = "1000001"; 

    static {
        // Properties 로드
        Properties props = new Properties();
        try {
            props.load(MenuCacheManager.class.getClassLoader().getResourceAsStream("inswave/properties/common.properties"));
            IS_LOCAL = new Boolean(props.getProperty("system.isLocal", "false"));

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }	 

	public MenuCacheManager() {
		this.services = new ArrayList<>();
	}
	
	public synchronized static MenuCacheManager getInstance() {
		if (null == instance) instance = new MenuCacheManager();
		return instance;
	}
	

	/**
	 * 사번이 Accessors 컬렉션에 존재하는 메뉴 리스트를 반환한다.
	 *
	 * @param sn
	 * @return
	 * @throws Exception 
	 */
	public List<ServiceVo> getMenusBySession(SessionUserHeader session) throws Exception {
		AppLog.info("sn : " + session.getSn() + ", cn : " + session.getCn()+ ", uid : " + session.getUid());
		
		ExceptService exceptService = (ExceptService)ElBeanUtils.getBean("exceptService");
		boolean isExcept = exceptService.isExcept(ExceptKind.MENU_CACHE, "T006", session.getSn());
		boolean isOpen = exceptService.isExcept(ExceptKind.MENU_CACHE, "T006", "", false);
		AppLog.info("isExcept : ", isExcept);
		AppLog.info("isOpen : ", isOpen);
		// 임시 예외처리 추가: 특정사용자는 메뉴 캐시에서 조회되도록 ㅊ리
		if (IS_LOCAL || !(isExcept || isOpen)) { 
			MenuService menuService = (MenuService)ElBeanUtils.getBean("menuServiceImpl");
			return menuService.getMenuListForTree(session.getUid());
		} else {
			synchronized (this.services) {
				if (null == this.services){
					// 현재 WAS 기동시 공통 코드를 로드하는데 첫 거래시 로딩이 필요하다면 이 지점에서 load() 메소드를 호출한다.
					return null;
				}
				// 반환 자료 구조형으로 래핑하여 반환 
				List<ServiceVo> menus = new ArrayList<>();
				
				if (!StringUtils.contains(session.getRoleCode(), PUBLIC_ROLECODE)) {
					return menus;
				}
				
				for (ServiceVo service : this.services) {
					if (service.isPublicMenu() || service.getAccessors().contains(session.getSn())) {
						// Deep Copy 를 위한 복사 생성자 정의
						menus.add(new ServiceVo(service));
					}
				}
				
				ArrayList<ServiceVo> clonedList = menus.stream().map(ServiceVo::new).collect(Collectors.toCollection(ArrayList::new));
				menus.removeIf(service -> 
						1 < service.getServiceLevel() 
						&& "Y".equals(service.getChildNode())
						&& !this.isContainServiceByParentID(service.getServiceCode(), clonedList)
				);
				
				return menus;
			}
		}
	}
	
	private boolean isContainServiceByParentID(String serviceId, List<ServiceVo> services) {
		return services.stream().anyMatch(service -> StringUtils.equals(serviceId, service.getParentDivCode())); 
	}
	
	/**
	 * 메뉴를 수정한다.(베타 서비스 여부 와 서비스URL, 병행운영관리에서 사용)
	 * @param vo
	 */
	public void modifyMenu(ServiceVo vo) {
		for (ServiceVo service : this.services) {
			if (StringUtils.equals(service.getServiceID(), vo.getServiceID())) {
				service.setBetaServiceYN(vo.getBetaServiceYN());
				service.setServiceNewUrl(vo.getServiceNewUrl());
			}
		}
	}
	
	
	/** 
     * 매핑하는 코드 Vo 조회
     * @param String serviceId
     * @return ServiceVo
	 */
	public ServiceVo getService(String serviceId){
		synchronized (this.services) {
			for(ServiceVo vo : services){
				if (StringUtils.isNotBlank(vo.getServiceID()) && serviceId.equals(vo.getServiceID())){
					return vo;
				}
			}
		}
		return null;
	}

	/**
	 * @throws ElException
	 */
	@Override
	public void load() throws ElException {
		try {
	        if (IS_LOCAL) { 
	        	AppLog.info("MenuCacheManager.not.loaded......");
	        	return;
	        }
	        AccntService accntService = (AccntService)ElBeanUtils.getBean("accntServiceImpl");
	        MenuService menuService = (MenuService)ElBeanUtils.getBean("menuServiceImpl");	        
	
			long startTime = 0L;
			long endTime = 0L;
	
			// 1. 전체 활성 메뉴 조회
			startTime = System.currentTimeMillis();  
	        List<ServiceVo> serviceVoList = menuService.findActiveServices();
	        endTime = System.currentTimeMillis();
	        AppLog.info("times: " + (endTime - startTime) + ", 메뉴 개수: " + serviceVoList.size());
	        
	        // 2. 전체 활성 사용자 조회
	        startTime = System.currentTimeMillis();
	        final List<UserVo> users = accntService.findActiveUsers();
	        endTime = System.currentTimeMillis();
	        AppLog.info("times: " + (endTime - startTime) + ", 사용자 수: " + users.size());
	        
	        // 3. 롤코드별  서비코드 리스트 맵을 미리 생성
	        startTime = System.currentTimeMillis();
	        final Map<String,Set<String>> role = accntService.findAtiveRoleServiceMap();
	        endTime = System.currentTimeMillis();
	        AppLog.info("times: " + (endTime - startTime) + ", 권한 수: " + role.size());
	
	        // 4. 메뉴에 Accessor 추가
	        startTime = System.currentTimeMillis();
	        for (ServiceVo service : serviceVoList){
	        	for (UserVo user : users){
	    			// 공용 메뉴가 아니고 해당 메뉴가 사용자 권한에 포함된 메뉴인지 식별 
	        		if (!service.isPublicMenu() && this.isAllowService(user.getRoleCode(), service.getServiceCode(), role)) {
	        			service.addAccessor(user.getSn());
	        		}
	        	}
	        }
	        endTime = System.currentTimeMillis();
	        AppLog.info("times: " + (endTime - startTime) + ", 서비스에 Accessor 추가 완료!");
			synchronized (this.services) {
				this.services.clear();
				this.services.addAll(serviceVoList);
			}
			AppLog.info("MenuCacheManager.loading......");  
			
		} catch (Exception ex) {
			AppLog.info("MenuCacheManager.Exception......");
			throw new ElException("ERROR.SYS.003", ex);
		}
	}
	

	/**
	 * @param roleCode
	 * @param serviceCode
	 * @param role
	 * @return
	 */
	private boolean isAllowService(String roleCode, String serviceCode, Map<String, Set<String>> role) {
		String[] roleCodes = roleCode.replaceAll("^[^\\d]*|[^\\d]*$", "").trim().split("#");
		for (String code : roleCodes) {
			Set<String> services = role.get(code);
			if (null != services && services.contains(serviceCode)) {
				return true;
			}
		}
		return false;
	}
}
