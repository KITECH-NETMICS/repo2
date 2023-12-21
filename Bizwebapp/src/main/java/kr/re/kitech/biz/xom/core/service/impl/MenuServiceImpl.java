package kr.re.kitech.biz.xom.core.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.Control;
import javax.naming.ldap.LdapContext;
import javax.naming.ldap.SortControl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AccntRepository;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;


/**
 * 메뉴 서비스 구현체
 *
 * @author James
 * @since 2023. 2. 15.
 */
@Service("menuServiceImpl")
public class MenuServiceImpl extends EgovAbstractServiceImpl implements MenuService {

    @Resource(name="accntRepository")
    private AccntRepository accntRepository;

    @Resource(name="accntServiceImpl")
    private AccntService accntService;
	
	/**
     * 메뉴 매퍼: ldap 속성을 맵에 매팽한다.
     */
    private ServiceVo menuMapper(SearchResult result) throws Exception {
   
    	ServiceVo menu = new ServiceVo();
        Attributes attr = result.getAttributes();

        try{
	        menu.setServiceCode((String) attr.get("serviceCode").get());
	        menu.setParentDivCode((String) attr.get("parentDivCode").get());
	        menu.setChildNode((String) attr.get("childNode").get());
	        menu.setServiceID((String) attr.get("serviceID").get());
	        menu.setUseYN((String) attr.get("useYN").get());        
	        menu.setCn((String) attr.get("cn").get());
	        menu.setServiceUrl((String) attr.get("serviceUrl").get());
	        if (null != attr.get("serviceLevel")) {
	        	String strServiceLevel = (String) attr.get("serviceLevel").get();
	        	if (StringUtils.isNumeric(strServiceLevel)) {
	        		menu.setServiceLevel( Integer.parseInt(strServiceLevel));
        		}
	        }
	        
	        if (null != attr.get("serviceOrder")) {
	        	String strServiceOrder = (String) attr.get("serviceOrder").get();
	        	if (StringUtils.isNumeric(strServiceOrder)) {
	        		menu.setServiceOrder( Integer.parseInt(strServiceOrder));
        		}
	        }
	        if (null != attr.get("serviceNewUrl")){
		        menu.setServiceNewUrl((String) attr.get("serviceNewUrl").get());
	        }
	        if (null != attr.get("betaServiceYN")){
		        menu.setBetaServiceYN((String) attr.get("betaServiceYN").get());
	        }
	    } catch (Exception ex) {
	    	AppLog.error("menuMapper.exception", ex);
	    	throw ex;
	    }

        return menu;
    }


	/**
     * 전체 매뉴 조회
	 * 계층적적인 정렬 문제를 해결하기 위해 LdapTemplate 를 바로 사용하지 못하고 LdapContext 의 SortControl 을 사용한다.
 	 * Tree 자료형을 사용하면 LdapTemplate 로 가능하지만 조회만 사용할 것이므로 재귀함수를 이용하여 간단하게 처리.
     */    
	@Override
	public List<ServiceVo> findActiveServices() {

		// 설정의 단일화를 휘애 LdapTemplate 객체에서 Context 를 가져온다.
        LdapContext context = accntRepository.getLdapContext();
		List<ServiceVo> services = null;
		try {
			context.setRequestControls(new Control[]{
				// Create the critical Sort control that sorts based on "serviceOrder"
			    new SortControl(new String[]{"serviceOrder"}, Control.CRITICAL)
			});
			
			// 공용코드의 serviceCode 조회: 딜리미터(#) 으로 구성 됨
			String publicSvcCd = accntRepository.findGroupsServiceCodeByRoleCode(new String[]{"1000001"});
			
			// 루트 노드부터 시작하여 각 노드의 자식들을 재귀적으로 호출함으로써 계층적인 메뉴 구조를 생성
			services = this.getServices(context, new ArrayList<>(), ROOT_SVC_CD, publicSvcCd);

			// 자식노드가 없는데 childNode=Y 속성이 잘 못 설정되어 있는 노드 보정 (삭제)
			ArrayList<ServiceVo> clonedList = services.stream().map(ServiceVo::new).collect(Collectors.toCollection(ArrayList::new));
			services.removeIf(service -> 
				1 < service.getServiceLevel() && "Y".equals(service.getChildNode()) && 
				!this.isContainServiceByParentID(service.getServiceCode(), clonedList)
			);

		} catch(Exception e) {
			AppLog.error("MenuService-Exception", e);
			e.printStackTrace();
			throw new KitechException(Exceptions.ERROR, Business.XOM, "ERR.CORE.MENU.0003", e);  // 기타 에러 메시지....
		}
		return services;
	}
	


	/**
     * 메뉴를 계층적으로 가져오기 위한 재귀 함수 (하드한 방식)
     */
    private List<ServiceVo> getServices(
    		LdapContext context, List<ServiceVo> list, String serviceCode, String publicSvcCd) throws Exception {
        NamingEnumeration<SearchResult> children = context.search(
        	  "cn=services" 
            , "(&(parentDivCode="+serviceCode+")(useYN=Y))"
            , new SearchControls(SearchControls.SUBTREE_SCOPE, 0, 0, MENU_ATTR, false, false)
        );
        
        while (null != children && children.hasMore()) {
            ServiceVo menu = this.menuMapper(children.next());
            menu.setPublicMenu( publicSvcCd.contains(menu.getServiceCode()));
            list.add(menu);
            // 자식노드가 있다면 재귀호출
            if ("Y".equals(menu.getChildNode())) {
                this.getServices( context, list, menu.getServiceCode(), publicSvcCd);
            }
        }
        return list;
    }
    	
	/**
     * 메뉴를 정렬하기 위한 재귀 함수 
     */
    private List<ServiceVo> getServiceRecursiveForSort( List<ServiceVo> context, List<ServiceVo> list, String serviceCode) {

		List<ServiceVo> results = context.stream()
			.filter( service -> service.getParentDivCode().equals(serviceCode))
			.sorted(Comparator.comparing(ServiceVo::getServiceOrder))
			.collect(Collectors.toList());
		
        for (ServiceVo menu : results) {
            list.add(menu);
            // 자식노드가 있다면 재귀호출
            if ("Y".equals(menu.getChildNode())) {
                this.getServiceRecursiveForSort( context, list, menu.getServiceCode());
            }
        }
        return list;
    }	
	
	/**
     * 메뉴를 최하위부터 각 메뉴별 최상위까지 계층적으로 가져오기 위한 재귀 함수
     */
	 private List<ServiceVo> getServiceByIdDesc( LdapContext context, List<ServiceVo> list, String serviceId, String serviceCode, String[] attrServices) throws Exception {
		NamingEnumeration<SearchResult> results = context.search(
			  "cn=services"
			  ,"(|(ServiceID="+ serviceId +")(serviceCode="+ serviceCode +"))" 
			//, "(parentDivCode="+serviceCode+")"            
			//, "(&(parentDivCode="+serviceCode+")(useYN=Y))"
			, new SearchControls(SearchControls.SUBTREE_SCOPE, 0, 0, attrServices, false, false)
		);
		while (results != null && results.hasMore()) {
			ServiceVo menu = this.menuMapper(results.next());
			if (!list.stream().anyMatch(service -> service.getServiceCode().equals(menu.getServiceCode()))) {
				
				list.add(menu);
			}
			// 상위노드가 있다면 재귀호출
			if ( !("1000000000".equals(menu.getParentDivCode())) ) {
				this.getServiceByIdDesc( context, list, "", menu.getParentDivCode(), attrServices);
			}
		}
		return list;
	}

	 private boolean isContainServiceByParentID(String serviceId, List<ServiceVo> services) {
		 return services.stream().anyMatch(service -> StringUtils.equals(serviceId, service.getParentDivCode())); 
	 }

	/**
     * 사용자 매뉴 조회 (롤코드 기반)
	 * @throws Exception 
	 * @Deprecated LDAP 데이터의 메뉴 계층 데이터의 정합성이 깨져 있어 처리 할 수 없음
     */  	
	@Override
	public List<ServiceVo> selectMenu(String uid) {
	
		// 1. 권한 정보 조회를 위해 사용자 조회 
		UserVo user = accntService.findUserByUsername(uid);
		String roleCodes = user.getRoleCode();
		
		// 2. 사용자의 롤코드에 해당하는 서비스코드 리스트 조회
		SortedSet<String> serviceCodes = accntService.findGroupsServiceCodesByRoleCode(roleCodes);
						
		// 3. 전체 메뉴 조회
		List<ServiceVo> services = this.findActiveServices();
					
		// 4. 전체 메뉴에서 사용자 서비스코드 목록에 존재하는 건만 추출
		List<ServiceVo> result = new ArrayList<>();
		services.forEach(service -> {
			serviceCodes.forEach(serviceCode -> {
				if (serviceCode.contains(service.getServiceCode())){
				// if (Pattern.matches(serviceCodePattern, service.getServiceCode())){
					result.add(service);				
				}
			});
		});
		
		return result;
	}
	
	/**
     * 사용자 매뉴 조회 (롤코드 기반)
	 * @throws Exception 
     */  	
	@Override
	public List<ServiceVo> getMenuListForTree(String uid) {
		List<ServiceVo> services = null;
		try {
			AppLog.info(LocalDateTime.now() + " <===== FIRST START");
			
			List<ServiceVo> context = accntRepository.getMenuListForTreeByUid(uid);
			AppLog.info(LocalDateTime.now() + " <===== SERVICE LDAP CLOSE");
			
			services = this.getServiceRecursiveForSort(context, new ArrayList<>(), "1000000000");
			AppLog.info(LocalDateTime.now() + " <===== SORT CLOSE");
			services.removeIf(service -> service.getServiceLevel() > 1 
								&&	("Y".equals(service.getChildNode()) 
								&& !(this.isContainServiceByParentID(service.getServiceCode(), context))));
			AppLog.info(LocalDateTime.now() + " <===== LAST(REMOVE EMPTY FOLDER) CLOSE");

		} catch(KitechException ue) {
			AppLog.error("getMenuListForTree-KitechException", ue);
			throw ue;
		} catch(Exception e) {
			AppLog.error("getMenuListForTree-Exception", e);
			e.printStackTrace();
			throw new KitechException(Exceptions.ERROR, Business.XOM, "ERR.CORE.MENU.0003", e);  // 기타 에러 메시지....
		}
		return services;
	}
	


	@Override
	public List<ServiceVo> selectSmartMenu(String syspayno) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ServiceVo> selectMyMenu(String syspayno) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void appendMyMenu(ServiceListVo menuListVo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteMyMenu(ServiceListVo menuListVo) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<ServiceVo> selectServicesByIds(String[] serviceIds) {
		// 설정의 단일화를 휘애 LdapTemplate 객체에서 Context 를 가져온다.
        LdapContext context = accntRepository.getLdapContext();
		List<ServiceVo> services = new LinkedList<>();
		try {
			context.setRequestControls(new Control[]{
				// Create the critical Sort control that sorts based on "serviceOrder"
			    new SortControl(new String[]{"serviceOrder"}, Control.CRITICAL)
			});
			for (String serviceId : serviceIds) {
				services = this.getServiceByIdDesc(context, services, serviceId, "", new String[] {
						"serviceCode", "parentDivCode", "childNode", "serviceLevel", "serviceOrder", "serviceID", "useYN", "cn", "cnServiceFullName", "serviceUrl", "serviceNewUrl"
				});
			}
		} catch(KitechException ue) {
			AppLog.error("MenuService-KitechException", ue);
			throw ue;
		} catch(Exception e) {
			AppLog.error("MenuService-Exception", e);
			e.printStackTrace();
			throw new KitechException(Exceptions.ERROR, Business.XOM, "ERR.CORE.MENU.0003", e);  // 기타 에러 메시지....
		}
		return services;
	}
	
	@Override
	public List<ServiceVo> findServicesByTopDivCode(ServiceVo vo) throws Exception {
		return accntRepository.findServicesByTopDivCode(vo);
	}
	
	@Override
	public List<ServiceVo> findServicesByServiceIds(String[] serviceIds) throws Exception {
		return accntRepository.findServicesByServiceIds(serviceIds);
	}
	
	@Override
	public void updateBetaService(ServiceVo vo) throws Exception {
		accntRepository.updateBetaService(vo);
	}
	
}
