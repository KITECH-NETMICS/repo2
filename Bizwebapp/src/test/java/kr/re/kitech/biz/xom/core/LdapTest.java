package kr.re.kitech.biz.xom.core;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.Resource;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.LdapContext;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.AbstractContextMapper;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AccntRepository;
import kr.re.kitech.biz.xom.core.ext.ExposedMessageSource;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;


/**
 * 계정계 LDAP 관련 단위 테스트
 *
 * @author James
 * @since 2023. 2. 15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		  "file:src/main/resources/inswave/spring/context-common.xml"
		, "file:src/main/resources/inswave/spring/context-properties.xml"
		, "file:src/main/resources/inswave/spring/context-sqlMap.xml"
		, "file:src/main/resources/inswave/spring/context-transaction.xml"
		, "file:src/main/resources/inswave/spring/context-validator.xml"
		, "file:src/main/resources/inswave/spring/mybatis-config.xml"
		, "file:src/test/resources/inswave/spring/context-datasource.xml"
		, "file:src/test/resources/inswave/spring/context-inswave.xml"
		, "file:src/main/webapp/WEB-INF/config/**/*.xml"
})
public class LdapTest {
	
	Logger log = LoggerFactory.getLogger(LdapTest.class);

	private static final String SVC_CD = "serviceCode";
	private static final String NON_SVC_CD = "nonServiceCode";
	private static final String ROLE_CD = "roleCode";
	private static final String ROLE_SVC_CD = "roleServiceCode";
	

	@Autowired
	private LdapTemplate template;

	@Value("${ldap.url}")
	private String providerUrl;

	@Value("${ldap.base}")
	private String baseDn;
	
	@Value("${ldap.userDn}")
	private String securityPrincipal;
	
	@Value("${ldap.password}")
	private String securityCredentials;	

	@Resource
	private LdapTemplate ldapTemplate;
	
	@Resource
	private AccntRepository accntRepository;

	@Resource
	private MenuService menuService;	
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;		

    private ServiceVo menuMapper(SearchResult result) throws NamingException {
    
    	ServiceVo menu = new ServiceVo();

        Attributes attr = result.getAttributes();
        menu.setServiceCode((String) attr.get("serviceCode").get());
        menu.setParentDivCode((String) attr.get("parentDivCode").get());
        menu.setChildNode((String) attr.get("childNode").get());
        menu.setServiceLevel(Integer.parseInt((String) attr.get("serviceLevel").get()));
        menu.setServiceOrder(Integer.parseInt((String) attr.get("serviceOrder").get()));
        menu.setServiceID((String) attr.get("serviceID").get());
        menu.setUseYN((String) attr.get("useYN").get());
        menu.setCn((String) attr.get("cn").get());

        return menu;
    }


    private List<ServiceVo> getMenus( LdapContext context, List<ServiceVo> list, String serviceCode, String[] attrServices) throws NamingException, IOException {
        NamingEnumeration<SearchResult> results = context.search(
              "cn=services" 
            , "(&(parentDivCode="+serviceCode+")(useYN=Y))"
            , new SearchControls(SearchControls.SUBTREE_SCOPE, 0, 0, attrServices, false, false)
        );
        while (results != null && results.hasMore()) {
            ServiceVo menu = this.menuMapper(results.next());
            list.add(menu);
            // 자식노드가 있다면 재귀호출
            if ("Y".equals(menu.getChildNode())) {
                this.getMenus( context, list, menu.getServiceCode(), attrServices);
            }
        }
        return list;
    }
    
    
	private Map<String, Map<String,String>> getMessages(Locale locale) {

		Properties properties = ((ExposedMessageSource)this.messageSource).getMessages(locale);		
		Map<String, String> mssgeMap = new TreeMap<>();
		Map<String, String> labelMap = new TreeMap<>();
		for (Map.Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey() != null && entry.getValue() != null) {
				String key = entry.getKey().toString();
				String value = entry.getValue().toString();
				if (key.startsWith("label.")) {
					labelMap.put( key, value);
				} else {
					mssgeMap.put( key, value);				
				}
			}
		}
		Map<String, Map<String,String>> resultMap = new HashMap<>();
		resultMap.put("message", mssgeMap);
		resultMap.put("label", labelMap);
		return resultMap;
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
	
	
	 private boolean isContainServiceByParentID(String serviceId, List<ServiceVo> services) {
		 return services.stream().anyMatch(service -> StringUtils.equals(serviceId, service.getParentDivCode())); 
	 }
	 
	 private void printDuration(LocalDateTime start) {
	 
	 	LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);
        long diffInMilliseconds = duration.toMillis();

        System.out.println("시간 차이 (밀리초): " + diffInMilliseconds);
	 }
	 
	//@Test
	public void test(){
	
		try {
		
			
			int index = 0;
			String uid = "mklee";
			//String uid = "hhkim";
			//String uid = "jsr";
			//String uid = "yjcho";
			
			
			
			
//			LocalDateTime start1 = LocalDateTime.now();
//			System.out.println("Start: " + start1);
//			List<ServiceVo> services1 = this.menuService.getMenuListForTree(uid);
//			System.out.println("신규버전 메뉴 수: " + services1.size());
//			printDuration(start1);

			/*
			index = 0;
			for (ServiceVo service : services2) {
				//if ("1001070000".equals( service.getServiceCode()) || "1001070000".equals( service.getParentDivCode())) {
					
					System.out.println( (++index) + 
							  String.format("\t%s\t%s\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t%s"
							, service.getServiceCode()
							, service.getParentDivCode()
							, service.getChildNode()
							, service.getServiceLevel()
							, service.getServiceOrder()
							, service.getServiceID()
							, service.getUseYN()
							, service.getCn()));
				//}
			}*/


			
			

			
			
			

        
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	
	final static String uid = "jpkim";
	

	
	//@Test
	public void testNeo() {
		LocalDateTime start = LocalDateTime.now();
		System.out.println("신규 Start: " + start);
		List<ServiceVo> context = this.getAccessibleMenuListByUid( uid);
		List<ServiceVo> services = this.getServiceRecursiveForSort(context, new ArrayList<>(), "1000000000");
		
		services.removeIf(service -> service.getServiceLevel() > 1 
							&&	("Y".equals(service.getChildNode()) 
							&& !(this.isContainServiceByParentID(service.getServiceCode(), context))));
		System.out.println("신규버전 메뉴 수: " +services.size());
		printDuration(start);
	}
	
	private String getTabString(int level) {
		return IntStream.range(1, level).mapToObj(i -> "\t").collect(Collectors.joining());
	}
	
	@Test
	public void testAll() {
	
		int index = 0;
		List<ServiceVo> services = this.menuService.findActiveServices();
		for (ServiceVo service : services) {
			System.out.println( (++index) + 
				  String.format("\t%s\t%s\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t%s"
				, service.getServiceCode()
				, service.getParentDivCode()
				, service.getChildNode()
				, service.getServiceLevel()
				, service.getServiceOrder()
				, service.getServiceID()
				, service.getUseYN()
				, this.getTabString(service.getServiceLevel()) + service.getCn()))
			;
		}		

	}
	
	//@Test
	public void testLegacy() {

			
		LocalDateTime start = LocalDateTime.now();
		System.out.println("이전 Start: " + start);
		List<ServiceVo> context = this.getMenuListForTreeByUid( uid);
		List<ServiceVo> services = this.getServiceRecursiveForSort(context, new ArrayList<>(), "1000000000");
		services.removeIf(service -> service.getServiceLevel() > 1 
							&&	("Y".equals(service.getChildNode()) 
							&& !(this.isContainServiceByParentID(service.getServiceCode(), context))));
		System.out.println("이전버전 메뉴 수: " +services.size());
		printDuration(start);
		
		int index = 0;
		for (ServiceVo service : services) {
			System.out.println( (++index) + 
				  String.format("\t%s\t%s\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t%s"
				, service.getServiceCode()
				, service.getParentDivCode()
				, service.getChildNode()
				, service.getServiceLevel()
				, service.getServiceOrder()
				, service.getServiceID()
				, service.getUseYN()
				, service.getCn()))
			;
		}		
	}
	
    /**
	 * 서비스 정보 매퍼
	 */
    private AbstractContextMapper<ServiceVo> serviceMapper(){
    	return new AbstractContextMapper<ServiceVo>() {
            @Override
            protected ServiceVo doMapFromContext(DirContextOperations ctx) { 
            	
            	ServiceVo service = new ServiceVo();
		        if (null != ctx && null != ctx.getStringAttribute("serviceID")) {
		        
			        service.setServiceCode(ctx.getStringAttribute("serviceCode"));
			        service.setParentDivCode(ctx.getStringAttribute("parentDivCode"));
			        service.setChildNode(ctx.getStringAttribute("childNode"));
			        service.setServiceID(ctx.getStringAttribute("serviceID"));
			        service.setUseYN(ctx.getStringAttribute("useYN"));        
			        service.setCn(ctx.getStringAttribute("cn"));
			        service.setServiceUrl(ctx.getStringAttribute("serviceUrl"));
			        service.setServiceNewUrl(ctx.getStringAttribute("serviceNewUrl"));
			        service.setBetaServiceYN(ctx.getStringAttribute("betaServiceYN"));
			        service.setServiceLevel(Integer.valueOf(ctx.getStringAttribute("serviceLevel")));
			        service.setServiceOrder(Integer.valueOf(ctx.getStringAttribute("serviceOrder")));
		        }   
	        	
	        	return service;
            }
        };
    }
    
    /**
	 * 사용자가 접근 가능한 메뉴 리스트를 조회한다.
	 *
	 * @param uid
	 * @return List<ServiceVo> 서비스 리스트
	 */
	public List<ServiceVo> getMenuListForTreeByUid(String uid) {
		try {
			
			// 사용자 - (roleCode,serviceCode,nonServiceCode)
			Map<String, String[]> userMap = this.getLdapUserMapByUid(uid);
			System.out.println(LocalDateTime.now() + " <===== USER LDAP CLOSE");

			// 권한그룹 - serviceCode:  롤코드로 권한 그룹에서 서비스 코드 추출
			SortedSet<String> svcCodes = this.getLdapServiceCodeByRole(userMap.get(ROLE_CD));
			System.out.println(LocalDateTime.now() + " <===== ROLE LDAP CLOSE");

			// 사용자 권한 기반 서비스코드 필터
			String roleSvcFilter = this.buildFilterByUserRole(svcCodes);
			System.out.println("roleSvcFilter ====> " + roleSvcFilter);

			// 사용자가 직접 가지고 있는 서비스코드 필터
			String svcFilter = this.buildFilterByUserSvcCode(userMap.get(SVC_CD));
			System.out.println("roleSvcFilter ====> " + svcFilter);

			// 사용자가 직접 가지고 있는 제외 서비스코드 필터
			String nonSvcFilter = this.buildFilterByUserNonSvcCode(userMap.get(NON_SVC_CD));
			System.out.println("nonSvcFilter ====> " + nonSvcFilter);
			
			// 최종 메뉴 코드 조회
			System.out.println(LocalDateTime.now() + " <===== SERVCIE LDAP START");
			return template.search( LdapQueryBuilder.query().base("cn=services").filter(
				"(&" + "(|" + roleSvcFilter + svcFilter + ")" + nonSvcFilter + "(&(useYN=Y))" +")"
			), serviceMapper());
			
		} catch (Exception ex) {
			AppLog.error("메뉴 트리 조회시 오류 발생", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.ldap.0002", ex);	
		} 
	}

	/**
	 * 사용자에게 귀속된 롤코드, 서비스코드, 제외서비스코드를 조회한다.
	 *
	 * @param userid
	 * @return Map(roleCode, serviceCode, nonServiceCode)
	 */
	private Map<String, String[]> getLdapUserMapByUid(String userid) {
        List<Map<String,String[]>> list = template.search(LdapQueryBuilder.query().base("cn=users").where("uid").is(userid)
    		, new AbstractContextMapper<Map<String, String[]>>() {
	            @Override
	            protected Map<String, String[]> doMapFromContext(DirContextOperations ctx) {
	            	Map<String, String[]> map = new HashMap<>(); 
	            	String roleCodes = ctx.getStringAttribute(ROLE_CD);
	            	String serviceCodes = ctx.getStringAttribute(SVC_CD);
	            	String nonServiceCodes = ctx.getStringAttribute(NON_SVC_CD);
	            	
	            	map.put(ROLE_CD, roleCodes.split("[#]"));
					map.put(SVC_CD, serviceCodes.split("[#]"));
					map.put(NON_SVC_CD, nonServiceCodes.split("[#]"));
	                return map;
	            }
	        });
        return (null != list) ? list.get(0) : new HashMap<>();
    }
    
    /**
	 * 롤코드에 해당하는 서비스 코드 트리셋을 조회한다.
	 *
     * @param roleCodes
     * @return TreeSet 서비스코드
     */
    private SortedSet<String> getLdapServiceCodeByRole(String[] roleCodes){
		String filter = "(|(roleCode=" + StringUtils.join(roleCodes, ")(roleCode=") + "))";
        List<String> list = template.search( LdapQueryBuilder.query().base("cn=groups").filter(filter), new AbstractContextMapper<String>() {
            @Override
            protected String doMapFromContext(DirContextOperations ctx) {
                return ctx.getStringAttribute("serviceCode");
            }
        });
        SortedSet<String> set = new TreeSet<>();
        if (null != list) {
        	list.forEach(serviceCodes -> {
        		set.addAll(Arrays.asList(serviceCodes.split("[#]")));
        	});
        }
    	return set;
    }
    
    
	/**
	 * 사용자 RoleCode 에 속한 서비스코드 필터를 빌드한다.
	 * 
	 * @param serviceCodeSet 
	 * @return String 서비스코드 필터
	 */
	private String buildFilterByUserRole(SortedSet<String> serviceCodeSet) {
		SortedSet<String> ss = new TreeSet<>();
		if (null != serviceCodeSet) {
			serviceCodeSet.remove("");	// 빈 요소 제거
			Iterator<String> it1 = serviceCodeSet.iterator();
			while (it1.hasNext()) {
				String serviceCode = it1.next();
				// 서비스 코드를 5개 요소로 구성된 배열로 반환
				String[] levels = this.serviceCodeToFiveLevelArray(serviceCode);
				
				// 5개 요소로 구성된 서비스 코드 배열에서 '00' 포함된 첫번째 인덱스 찾기
				int level = this.getlevelIndexInServiceCode(levels);
				if (level == -1) {
					// '00' 포함된 서비스 코드가 아닐 때
					ss.addAll( this.getSearchFilterLoop(levels, 6));
				} else {
					// '00' 포함된 서비스 코드일 때
					ss.addAll( this.getSearchFilterLoop(levels, level));
					ss.addAll( this.getSearchFilterLoopLevelAstar(levels, level));
				}
			}
		}
		return (ss.isEmpty()) ? "" : "(|(serviceCode=" + StringUtils.join(ss.toArray(), ")(serviceCode=") + "))";
	}	

	
	/**
	 * 사용자가 직접 가지고 있는 serviceCode 로 필터를 빌드한다.  
	 * 
	 * @param svcCds
	 * @return String 서비스코드 필터
	 */
	private String buildFilterByUserSvcCode(String[] svcCds) {
		SortedSet<String> ss = new TreeSet<>();
		for (String serviceCode : svcCds) {
			String[] levels = this.serviceCodeToFiveLevelArray(serviceCode);
			int level = this.getlevelIndexInServiceCode(levels);
			ss.addAll( this.getSearchFilterLoop(levels, (-1 == level) ? 6 :  level + 1));
		}
		return (ss.isEmpty()) ? "" : "(|(serviceCode=" + StringUtils.join(ss.toArray(), ")(serviceCode=") + "))";
	}	
	
	
	/**
	 * 사용자가 직접 가지고 있는 nonServiceCode 로 필터를 빌드한다.
	 * @param nSvcCds
	 * @return String 서비스코드 필터
	 */
	private String buildFilterByUserNonSvcCode(String[] nSvcCds) {
		return (null != nSvcCds) ? "(!(|(serviceCode=" + StringUtils.join(nSvcCds, ")(serviceCode=") + ")))" : "";
	}
	

	/**
     * 서비스코드 10자리를 2글짜 단위로 파싱하여 String[5] 배열의 요소로 삽입 후 반환
     */
	private String[] serviceCodeToFiveLevelArray(String s) {
		return new String[]{s.substring(0,2), s.substring(2,4), s.substring(4,6), s.substring(6,8), s.substring(8,10)};
	}
	
	/**
     * 2자리 5개의 배열 요소중 '00' 이 존재하는 요소의 첫번째 인덱스 반환 
     */
	private int getlevelIndexInServiceCode(String[] levels) {
		int find = -1;
		for (int i = 0; i < 5; i++) {
			if ("00".equals(levels[i])) {
				find = i;
				break;
			}
		}
		return find;
	}	
	
	/** 
     * LDAP 서비스 코드 검색 핕터를 생성하여 반환한다.
	 * 
     * levels 2 digit 요소로 구성된 serviceCode
     * level 00 이 들어있는 index 1~4까지 없다면 6
     */
	private SortedSet<String> getSearchFilterLoop(String[] levels, int level) {
		SortedSet<String> ss = new TreeSet<>();
		//  4 -> 
		for (int i = 1; i < level; i++) {
			ss.addAll( this.getSearchFilterLoopLevel(levels, i));
		}
		return ss;
	}	

	
	private SortedSet<String> getSearchFilterLoopLevel(String[] levels, int level) {
		// 1, 2, 3
		SortedSet<String> ss = new TreeSet<>();
		String result = "";
		for (int i = 0; i < 5; i++) {
			if (i < level) {
				result += levels[i];
			} else {
				result += "00";
			}
		}
		ss.add(result);
		return ss;
	}
	
	/** 
     * LDAP 서비스 코드 검색 핕터를 생성하여 반환한다.
	 * 
     * levels 2 digit 요소로 구성된 serviceCode
     * level 00 이 들어있는 index 1~4까지 없다면 6
     */	
	private SortedSet<String> getSearchFilterLoopLevelAstar(String[] levels, int level) {
		SortedSet<String> ss = new TreeSet<>();
		String result = "";
		for (int i = 0; i < 5; i++) {
			if (i < level) {
				result += levels[i];
			} else {
				result += "*";
				break;
			}
		}
		ss.add(result);
		return ss;
	}
	

    /**
	 * 사용자가 접근 가능한 메뉴 리스트를 조회한다.
	 *
	 * @param uid
	 * @return List<ServiceVo> 서비스 리스트
	 */
	public List<ServiceVo> getAccessibleMenuListByUid(String uid) {
		try {
			
			// 사용자 - (roleCode,serviceCode,nonServiceCode)
			Map<String, String[]> userMap = this.getUserInfoByUid(uid);
			System.out.println(LocalDateTime.now() + " <===== USER LDAP CLOSE");

			// 권한그룹 - serviceCode:  롤코드로 권한 그룹에서 서비스 코드 추출
			SortedSet<String> svcCodes = this.getServiceCodeByRole(userMap.get(ROLE_CD));
			System.out.println(LocalDateTime.now() + " <===== ROLE LDAP CLOSE");

			// 사용자 권한 기반 서비스코드 필터
			String roleSvcFilter = this.createFilterByUserRole(svcCodes);

			// 사용자가 직접 가지고 있는 서비스코드 필터
			String svcFilter = this.createFilterBySvcCode(userMap.get(SVC_CD));

			// 사용자가 직접 가지고 있는 제외 서비스코드 필터
			String nonSvcFilter = this.createFilterByNonSvcCode(userMap.get(NON_SVC_CD));
			
			// 최종 메뉴 코드 조회
			System.out.println(LocalDateTime.now() + " <===== SERVCIE LDAP START");
			return template.search( LdapQueryBuilder.query().base("cn=services").filter(
				"(&" + "(|" + roleSvcFilter + svcFilter + ")" + nonSvcFilter + "(&(useYN=Y))" +")"
			), serviceMapper());
			
		} catch (Exception ex) {
			AppLog.error("메뉴 트리 조회시 오류 발생", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.ldap.0002", ex);	
		} 
	}

	/**
	 * 사용자에게 귀속된 롤코드, 서비스코드, 제외서비스코드를 조회한다.
	 *
	 * @param userid
	 * @return Map(roleCode, serviceCode, nonServiceCode)
	 */
	private Map<String, String[]> getUserInfoByUid(String userid) {
        List<Map<String,String[]>> list = template.search(LdapQueryBuilder.query().base("cn=users").where("uid").is(userid)
    		, new AbstractContextMapper<Map<String, String[]>>() {
	            @Override
	            protected Map<String, String[]> doMapFromContext(DirContextOperations ctx) {
	            	Map<String, String[]> map = new HashMap<>(); 
	            	String roleCodes = ctx.getStringAttribute(ROLE_CD);
	            	String serviceCodes = ctx.getStringAttribute(SVC_CD);
	            	String nonServiceCodes = ctx.getStringAttribute(NON_SVC_CD);
	            	
	            	map.put(ROLE_CD, roleCodes.split("[#]"));
					map.put(SVC_CD, serviceCodes.split("[#]"));
					map.put(NON_SVC_CD, nonServiceCodes.split("[#]"));
	                return map;
	            }
	        });
        return (null != list) ? list.get(0) : new HashMap<>();
    }
    
    /**
	 * 롤코드에 해당하는 서비스 코드 트리셋을 조회한다.
	 *
     * @param roleCodes
     * @return TreeSet 서비스코드
     */
    private SortedSet<String> getServiceCodeByRole(String[] roleCodes){
		String filter = "(|(roleCode=" + StringUtils.join(roleCodes, ")(roleCode=") + "))";
        List<String> list = template.search( LdapQueryBuilder.query().base("cn=groups").filter(filter), new AbstractContextMapper<String>() {
            @Override
            protected String doMapFromContext(DirContextOperations ctx) {
                return ctx.getStringAttribute("serviceCode");
            }
        });
        SortedSet<String> set = new TreeSet<>();
        if (null != list) {
        	list.forEach(serviceCodes -> {
        		set.addAll(Arrays.asList(serviceCodes.split("[#]")));
        	});
        }
    	return set;
    }
    
    
	/**
	 * 사용자 RoleCode 에 속한 서비스코드 필터를 빌드한다.
	 * 
	 * @param serviceCodeSet 
	 * @return String 서비스코드 필터
	 */
	private String createFilterByUserRole(SortedSet<String> serviceCodeSet) {
		SortedSet<String> ss = new TreeSet<>();
		if (null != serviceCodeSet) {
			serviceCodeSet.remove("");	// 빈 요소 제거
			Iterator<String> it1 = serviceCodeSet.iterator();
			while (it1.hasNext()) {
				String serviceCode = it1.next();
				// 서비스 코드를 5개 요소로 구성된 배열로 반환
				String[] levels = this.serviceCodeToArray(serviceCode);
				
				// 5개 요소로 구성된 서비스 코드 배열에서 '00' 포함된 첫번째 인덱스 찾기
				int level = this.getMaxLevel(levels);
				if (level == -1) {
					// '00' 포함된 서비스 코드가 아닐 때
					ss.addAll( this.getFilterLoop(levels, 6));
				} else {
					// '00' 포함된 서비스 코드일 때
					ss.addAll( this.getFilterLoop(levels, level));
					ss.addAll( this.getFilterLevelAstar(levels, level));
				}
			}
		}
		return (ss.isEmpty()) ? "" : "(|(serviceCode=" + StringUtils.join(ss.toArray(), ")(serviceCode=") + "))";
	}	

	
	/**
	 * 사용자가 직접 가지고 있는 serviceCode 로 필터를 빌드한다.  
	 * 
	 * @param svcCds
	 * @return String 서비스코드 필터
	 */
	private String createFilterBySvcCode(String[] svcCds) {
		SortedSet<String> ss = new TreeSet<>();
		for (String serviceCode : svcCds) {
			String[] levels = this.serviceCodeToArray(serviceCode);
			int level = this.getMaxLevel(levels);
			ss.addAll( this.getSearchFilterLoop(levels, (-1 == level) ? 6 :  level + 1));
		}
		return (ss.isEmpty()) ? "" : "(|(serviceCode=" + StringUtils.join(ss.toArray(), ")(serviceCode=") + "))";
	}	
	
	
	/**
	 * 사용자가 직접 가지고 있는 nonServiceCode 로 필터를 빌드한다.
	 * @param nSvcCds
	 * @return String 서비스코드 필터
	 */
	private String createFilterByNonSvcCode(String[] nSvcCds) {
		return (null != nSvcCds) ? "(!(|(serviceCode=" + StringUtils.join(nSvcCds, ")(serviceCode=") + ")))" : "";
	}
	

	/**
     * 서비스코드 10자리를 2글짜 단위로 파싱하여 String[5] 배열의 요소로 삽입 후 반환
     */
	private String[] serviceCodeToArray(String s) {
		return new String[]{s.substring(0,2), s.substring(2,4), s.substring(4,6), s.substring(6,8), s.substring(8,10)};
	}
	
	/**
     * 2자리 5개의 배열 요소중 '00' 이 존재하는 요소의 첫번째 인덱스 반환 
     */
	private int getMaxLevel(String[] levels) {
		int find = -1;
		for (int i = 0; i < 5; i++) {
			if ("00".equals(levels[i])) {
				find = i;
				break;
			}
		}
		return find;
	}	
	
	/** 
     * LDAP 서비스 코드 검색 핕터를 생성하여 반환한다.
	 * 
     * levels 2 digit 요소로 구성된 serviceCode
     * level 00 이 들어있는 index 1~4까지 없다면 6
     */
	private SortedSet<String> getFilterLoop(String[] levels, int level) {
		SortedSet<String> ss = new TreeSet<>();
		//  4 -> 
		for (int i = 1; i < level; i++) {
			ss.addAll( this.getFilterLevel(levels, i));
		}
		return ss;
	}	

	
	private SortedSet<String> getFilterLevel(String[] levels, int level) {
		// 1, 2, 3
		SortedSet<String> ss = new TreeSet<>();
		String result = "";
		for (int i = 0; i < 5; i++) {
			if (i < level) {
				result += levels[i];
			} else {
				result += "00";
			}
		}
		ss.add(result);
		return ss;
	}
	
	/** 
     * LDAP 서비스 코드 검색 핕터를 생성하여 반환한다.
	 * 
     * levels 2 digit 요소로 구성된 serviceCode
     * level 00 이 들어있는 index 1~4까지 없다면 6
     */	
	private SortedSet<String> getFilterLevelAstar(String[] levels, int level) {
		SortedSet<String> ss = new TreeSet<>();
		String result = "";
		for (int i = 0; i < 5; i++) {
			if (i < level) {
				result += levels[i];
			} else {
				result += "*";
				break;
			}
		}
		ss.add(result);
		return ss;
	}
	
/*
	public List<ServiceVo> getAccessibleMenuListByUid(String uid) {
		try {
			// 사용자 - (roleCode,serviceCode,nonServiceCode)
			Map<String, String[]> userMap = this.getUserAndRoleInfoByUid(uid);

			// 포함 서비스 필터 생성
			String roleSvcFilter = this.createSvcCodeFilter(userMap.get(ROLE_SVC_CD), true);
			String svcFilter = this.createSvcCodeFilter(userMap.get(SVC_CD), false);
			
			// 제외 서비스 필터 생성
			String[] nSvcCd= userMap.get(NON_SVC_CD);
			String nSvcCdFilter = (null != nSvcCd) ? "(!(|(serviceCode=" + StringUtils.join(nSvcCd, ")(serviceCode=") + ")))" : "";
			
			// 최종 메뉴 코드 조회
			return template.search( LdapQueryBuilder.query().base("cn=services").filter(
				"(&" + "(|" + roleSvcFilter + svcFilter + ")" + nSvcCdFilter + "(&(useYN=Y))" +")"
			), serviceMapper());
			
		} catch (Exception ex) {
			AppLog.error("메뉴 트리 조회시 오류 발생", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.ldap.0002", ex);	
		} 
	}


	private Map<String, String[]> getUserAndRoleInfoByUid(String userid) {
		LdapQuery query = LdapQueryBuilder.query().base("cn=users").where("uid").is(userid);
	    List<Map<String, String[]>> list = template.search( query, new AbstractContextMapper<Map<String, String[]>>() {
            @Override
            protected Map<String, String[]> doMapFromContext(DirContextOperations ctx) {
                Map<String, String[]> map = new HashMap<>();
                String roleCodes = ctx.getStringAttribute(ROLE_CD);
                String serviceCodes = ctx.getStringAttribute(SVC_CD);
                String nonServiceCodes = ctx.getStringAttribute(NON_SVC_CD);

                map.put(SVC_CD, serviceCodes.split("[#]"));
                map.put(NON_SVC_CD, nonServiceCodes.split("[#]"));

                // 권한코드로 서비스 코드 조회
                LdapQuery query = LdapQueryBuilder.query().base("cn=groups").filter(
            		"(|(roleCode=" + StringUtils.join(roleCodes.split("[#]"), ")(roleCode=") + "))"
        		);
                List<String[]> svcCodesList = template.search( query, new AbstractContextMapper<String[]>() {
                    @Override
                    protected String[] doMapFromContext(DirContextOperations ctx) {
                    	String serviceCodes = ctx.getStringAttribute(SVC_CD);
                        return serviceCodes.split("[#]");
                    }
                });
                SortedSet<String> set = new TreeSet<>();
                svcCodesList.forEach(svcCodes -> {
                    set.addAll(Arrays.asList(svcCodes));
                });

                map.put(ROLE_SVC_CD, set.toArray(new String[0]));

                return map;
            }
        });
	    return (null != list) ? list.get(0) : new HashMap<>();
	}
    

	private String createSvcCodeFilter(String[] serviceCodes, boolean forRoleCode) {
	    SortedSet<String> sortedSet = new TreeSet<>();
	    StringBuilder result = new StringBuilder();
	    // 주어진 서비스 코드 배열을 반복 처리
	    for (String s : serviceCodes) {
	        // 서비스 코드를 2자리씩 5개의 레벨로 분리
	        String[] codes = {
	            s.substring(0, 2), s.substring(2, 4), s.substring(4, 6), s.substring(6, 8), s.substring(8, 10)
	        };
	        // '00'이 아닌 최상위 자리수를 찾음
	        int maxDigit = 0;
	        while (maxDigit < 5 && !"00".equals(codes[maxDigit])) {
	            maxDigit++;
	        }
	        // 공통적으로 최상위 자리수까지 포함한 서비스 코드 조합을 생성
	        for (int i = 1; i <= maxDigit; i++) {
	            result.setLength(0);
	            for (int j = 0; j < 5; j++) {
	                result.append(j < i ? codes[j] : "00");
	            }
	            sortedSet.add(result.toString());	// 생성된 조합을 정렬된 집합에 추가
	        }
	        // 롤 코드에 기반한 서비스 코드 필터를 생성하는 경우는 와일드카드가 조합된 서비스 코드 조합을 생성
	        if (forRoleCode) {
	            result.setLength(0);
	            for (int i = 0; i < maxDigit; i++) {
	                result.append(codes[i]);
	            }
	            result.append("*");
	            sortedSet.add(result.toString());	// 생성된 조합을 정렬된 집합에 추가
	        }
	    }
	    // 정렬된 집합이 비어 있지 않은 경우 필터 문자열을 생성하고 반환
	    return sortedSet.isEmpty() ? "" : "(|(serviceCode=" + StringUtils.join(sortedSet.toArray(), ")(serviceCode=") + "))";
	}*/
}
