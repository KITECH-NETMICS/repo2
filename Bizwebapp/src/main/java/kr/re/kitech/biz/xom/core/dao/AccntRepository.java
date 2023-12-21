package kr.re.kitech.biz.xom.core.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.ldap.LdapContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.ContextMapper;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.AbstractContextMapper;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.filter.LikeFilter;
import org.springframework.ldap.filter.OrFilter;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.stereotype.Repository;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.uss.ath.vo.UserSrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.enums.LdapMenuType;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.MenuCacheManager;
import kr.re.kitech.biz.xom.core.vo.RoleVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;


/**
 * 계정계 레퍼지토리 
 *	- LDAP 저장소(권한, 서비스, 사용자, 조직)
 *
 * @author James
 * @since 2022. 2. 16.
 */
@Repository("accntRepository")
public class AccntRepository {

	private static final String SVC_CD = "serviceCode";
	private static final String NON_SVC_CD = "nonServiceCode";
	private static final String ROLE_CD = "roleCode";
	 

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
	
	private static final int DIGITS = 2;	// serviceCode 분할 자리수        
    private static final int MAX = 5;		// serviceCode 분할 수
    
    public LdapContext getLdapContext() {
    	return (LdapContext)this.template.getContextSource().getReadOnlyContext();
    }

    /**
 	 * LDAP 사용자 키(uid) 속성에 해당하는 사용자 정보를 반환한다
	 */	
    public UserVo findUserByUid(String username) {
        List<UserVo> users = template.search( LdapQueryBuilder.query().where("uid").is(username), userMapper());
        if (null != users && !users.isEmpty()) {
        	return users.get(0);
        }
        return null;
    }
    
    public UserVo findUserIdBySyspayno(String syspayno) {
        List<UserVo> users = template.search( LdapQueryBuilder.query().where("sn").is(syspayno), userMapper());
        if (null != users && !users.isEmpty()) {
        	return users.get(0);
        }
        return null;
    }
    
    public List<UserVo> findUserIdsBySyspaynos(String[] syspaynos) {
    	String filter = "(|(sn=" + StringUtils.join(syspaynos, ")(sn=") + "))";
    	return template.search( LdapQueryBuilder.query().base("cn=users").filter(filter), userMapper());
        
    }
    
        
    
    /**
 	 * LDAP 권한코드(roleCode) 배열에 해당하는 사용자 정보를 반환한다
	 */	
    public List<UserVo> findUsersByRoleCodes(String[] roleCodes) {
    	String filter = "(&(|(roleCode=*" + StringUtils.join(roleCodes, "*)(roleCode=*") + "*))(useYN=Y))";
    	return template.search( LdapQueryBuilder.query().base("cn=users").filter(filter), userMapper());
    }
    
    /**
 	 * LDAP 업무 서비스ID(ServiceId) 속성에 해당하는 서비스 정보를 반환한다.
	 */
 
    public ServiceVo findServiceByServiceId(String serviceId) {
    	List<ServiceVo> services = template.search(LdapQueryBuilder.query().where("ServiceId").is(serviceId), this.serviceMapper());
        if (null != services && !services.isEmpty()) {
        	return services.get(0);
        } 	
    	return null;
    }

    
    /**
 	 * LDAP 권한그룹  키(roleCode)들의 속성에 해당하는 서비스코드(serviceCode) 정보를 반환한다.
	 * 롤코드에 해당하는 서비스그룹의 서비스코드 셋을 조회한다. (유일한 정렬값)
	 */	    
    public SortedSet<String> findGroupsServiceCodesByRoleCode(String roleCodes) {
    
        SortedSet<String> result = new TreeSet<>();
		
		String[] arryRoleCode = roleCodes.split("[#]");
        if (0 < arryRoleCode.length) {
			String filter = "(|(roleCode=" + StringUtils.join(arryRoleCode, ")(roleCode=") + "))";
	        List<String> list = template.search( LdapQueryBuilder.query().base("cn=groups").filter(filter), new AbstractContextMapper<String>() {
	            @Override
	            protected String doMapFromContext(DirContextOperations ctx) {
	                return ctx.getStringAttribute("serviceCode");
	            }
	        });
	
	        // LDAP 질의의 결과값이 #으로 구분된 문자열 List 이므로 파싱해서 하나의 serviceCode가 독립적인 요소로 구성된 결과로 가공한다.  
	        list.forEach(serviceCodes -> {
	        	for(String serviceCode : serviceCodes.split("[#]")){
	        		// 2자리로 분할된 서비스 코드 리스트 생성
	        		List<String> codeList = this.getPartsByServiceCode(serviceCode);
		        
	        		// 자신 노드부터 ROOT 노드까지의 서비스 코드 생성
			        int level = (-1 != codeList.indexOf("00")) ? codeList.indexOf("00") : MAX;
			        result.addAll( this.getParentServiceCode( new TreeSet<>(), codeList, level));
			        
			        // 말단 서비스가 아닌 경우의 예외 처리
			        // parents.add( serviceCode.replaceAll( "(00)*00$", ".*"));
	        	}
	    	});
    	}

        return result;
    }

    /**
 	 * LDAP 권한그룹  키(roleCode)들의 속성에 해당하는 서비스코드(serviceCode) 정보를 반환한다.
	 * 파라미터와 반환값은 딜리미터(#)로 구분된 문자열
	 */	    
    public String findGroupsServiceCodeByRoleCode(String [] arryRoleCode) throws Exception {		
        if (0 == arryRoleCode.length) {
        	throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.ldap.0003");  // Ldap Core error		
        }

		String filter = "(|(roleCode=" + StringUtils.join(arryRoleCode, ")(roleCode=") + "))";
        List<String> result = template.search( LdapQueryBuilder.query().base("cn=groups").filter(filter), new AbstractContextMapper<String>() {
            @Override
            protected String doMapFromContext(DirContextOperations ctx) {
            	// String serviceCode = ctx.getStringAttribute("serviceCode").replaceAll("[^\\d#]", "").trim();
                return ctx.getStringAttribute("serviceCode");
            }
        });
        
        // LDAP 질의의 결과값이 #으로 구분된 문자열 List 이므로 하나의 문자열로 합성한다.  
        StringBuilder builder = new StringBuilder();
        result.forEach(serviceCodes -> {
        	builder.append(serviceCodes);
        	
    	});

        return builder.toString();
    }
    
    /**
	 * 해당 URL에 해당하는 서비스가 Leaf 노드로 존재하는지 판별한다.
     * @param url
     * @return
     */
    public Boolean isExistLeafServiceByUrl(String url) {
    	List<ServiceVo> service = template.search( LdapQueryBuilder.query().where("childNode").is("N").and("ServiceNewUrl").is(url), this.serviceMapper());
        return (null != service && 0 < service.size());
    }
    
    /**
	 * URL 에 해당하는 serviceCode 리스트 조회
	 * 
     * @param url
     * @return
     */
    public List<String> findServiceCodesByUrl(String url) {
    	// leaf 메뉴의 서비스 코드만 조회한다.
    	LdapQuery ldapQuery = LdapQueryBuilder.query()
    			.base("cn=services")
    			.attributes("serviceCode")
    			.where("childNode").is("N").and("serviceNewUrl").is(url);
        return template.search( ldapQuery, new AbstractContextMapper<String>() {
            @Override
            protected String doMapFromContext(DirContextOperations ctx) {
	        	return ctx.getStringAttribute("serviceCode");
            }
        });
    }
    
    
    /**
	 * 특정 dn 의 속성의 값을 가지고 있는지 체크
	 *
     * @param baseDn
     * @param attributeName
     * @param valueToCheck
     * @return
     */
    public Boolean hasAttributeValue(String baseDn, String attributeName, List<String> valuesToCheck) {
    	OrFilter orFilter = new OrFilter();
    	for (String valueToCheck : valuesToCheck){
    		orFilter.or(new LikeFilter(attributeName, "*"+ valueToCheck +"*"));
    	}

    	try {
	    	return template.searchForObject(baseDn, orFilter.encode(), new ContextMapper<Boolean>() {
				@Override
				public Boolean mapFromContext(Object ctx) throws NamingException {
					DirContextAdapter adapter = (DirContextAdapter)ctx;
					return adapter.attributeExists(attributeName);
				}
			});
		} catch (EmptyResultDataAccessException ex) {
			// 결과가 없다면 false 반환한다.
			return false;
		}
    }
    
    public Boolean hasAttributeValue(String baseDn, String attributeName, String valueToCheck) {
    	try {
	    	return template.searchForObject(baseDn, "("+attributeName+"="+valueToCheck+")", new ContextMapper<Boolean>() {
				@Override
				public Boolean mapFromContext(Object ctx) throws NamingException {
					DirContextAdapter adapter = (DirContextAdapter)ctx;
					return adapter.attributeExists(attributeName);
				}
			});
		} catch (EmptyResultDataAccessException ex) {
			// 결과가 없다면 false 반환한다.
			return false;
		}
    }
    
    /**
     * @param roles
     * @param serviceCodes
     * @return
     */
    public Boolean matchedRolesAndServices(List<String> roles, List<String> serviceCodes) {
        OrFilter orFilter = new OrFilter();
        for (String role : roles) {
            orFilter.or(new EqualsFilter("roleCode", role));
        }

        List<Boolean> result = template.search("cn=groups", orFilter.encode(), new AttributesMapper<Boolean>() {
            @Override
            public Boolean mapFromAttributes(Attributes attributes) throws NamingException {
                Attribute roleServiceCode = attributes.get("serviceCode");
                for (String serviceCode : serviceCodes) {
                	// role 의 serviceCode 는 딜리미터(#) 로 구분되어 있으므로 String 으로 변환 후 확인하여야 한다.
                    if (roleServiceCode != null && ((String)roleServiceCode.get()).contains(serviceCode)) {
                        return true;
                    }
                }
                return false;
            }
        });

        return result.stream().anyMatch(found -> found);
    }

    
    /**
	 * 단건 서비스가 해당 롤들에 포함되어 있는지 체크한다
     * @param roles
     * @param serviceCode
     * @return
     */
    public Boolean matchedRolesAndServices(List<String> roles, String serviceCode) {
        return this.matchedRolesAndServices(roles, Arrays.asList(new String[]{serviceCode}));
    }
    
    public List<UserVo> findActiveUsers() {
    	return template.search( 
    		  LdapQueryBuilder.query().base("cn=resident,cn=users").where("useYN").is("Y")
			, this.userMapper()
		);
    }


    /**
	 * 활성화된 모든 권한 하위의 서비스들을 셋으로 매핑하여 조회한다.
	 * 	- 검색 성능에 중점을 둔 자료형이므로 서비스리스트는 HashSet 구현체를 사용한다. 
     * @return
     */
    public Map<String,Set<String>> findAtiveRoleServiceMap(){
        List<Map<String,Set<String>>> codeList = template.search( LdapQueryBuilder.query()
    		.attributes("roleCode", "serviceCode")
    		.base("cn=groups")
    		.where("objectClass").isPresent(), new AbstractContextMapper<Map<String,Set<String>>>() {
    		
		    /**
			 * 10글자로 이루어진 서비스코드를 2글자로 분할하여 5개의 크기를 갖는 리스트로 반환한다.
			 */
		    private List<String> getPartsByServiceCode(String serviceCode){
		    	// 상위노드를 생성하기 위해 2자리 수 배열로 파싱한다. 
		        assert serviceCode.length() % DIGITS == 0;
		        List<String> codeList = new ArrayList<>();
		        for (int index = 0; index < serviceCode.length() / DIGITS; index++){
		            codeList.add( serviceCode.substring(index * DIGITS, index * DIGITS + DIGITS));
		        }
		        return codeList;
		    }

		    /**
		     * 부모 노드가 없는 자식노드는 있을 수 없으므로 상위 노드 생성한다.
			 * 자신의 레벨 부터 ROOT 노드까지 재귀적으로 처리하며 비교 대상군이므로 중복을 배제한 Set Collection 으로 처리한다.
		     */
			private SortedSet<String> getParentServiceCode( SortedSet<String> parents, List<String> codeList, int level){
		        String serviceCode = "";
		        for (int index = 0; index < codeList.size(); index++){
		        	serviceCode += (level > index) ? codeList.get(index) : "00";
		        }
		        parents.add(serviceCode);
		        // 재귀 호출
		        if (1 < level){
		        	this.getParentServiceCode( parents, codeList, --level);
		        }
		        return parents;
			}

		    /**
			 * 상위메뉴의 권한이 있다면 하위 메뉴 전부의 권한을 가진다.
			 * 자신의 노드 하위의 노드를 재귀적으로 LDAP 에 질의하여 Set 으로 구성한다.
		     * @param set
		     * @param serviceCode
		     * @param attrServices
		     * @return
		     */
		    private HashSet<String> getChildServices( HashSet<String> set, String serviceCode, String...attrServices){

	    		List<ServiceVo> services = template.search( LdapQueryBuilder.query()
		    			.attributes(attrServices)
		    			.base("cn=services")
		    			.where("useYN").is("Y").and("parentDivCode").is(serviceCode), new AbstractContextMapper<ServiceVo>() {
		            @Override
		            protected ServiceVo doMapFromContext(DirContextOperations ctx) { 
		            	ServiceVo service = new ServiceVo();
				        if (null != ctx) {
				        	service.setServiceCode(ctx.getStringAttribute(attrServices[0]));
					        service.setParentDivCode(ctx.getStringAttribute(attrServices[1]));
					        service.setChildNode(ctx.getStringAttribute(attrServices[2]));
				        }   
			        	return service;
		            }
		        });
		        Iterator<ServiceVo> results = services.iterator();														
		        while (null != results && results.hasNext()) {
		        	ServiceVo menu = results.next();
		        	set.add(menu.getServiceCode());
		        	 if ("Y".equals(menu.getChildNode())) {
		        		 this.getChildServices( set, menu.getServiceCode(), attrServices);
		        	 }
		        }

		    	return set;
		    }

            @Override
            protected Map<String,Set<String>> doMapFromContext(DirContextOperations ctx) {
            
            	Map<String,Set<String>> result = new HashMap<>();
            	String roleCoe = ctx.getStringAttribute("roleCode");
            	String serviceCode = ctx.getStringAttribute("serviceCode");
            	if (null == roleCoe || null == serviceCode) {
            		return result;
            	}

            	Set<String> services = new HashSet<>();
            	serviceCode = serviceCode.replaceAll("^[^\\d]*|[^\\d]*$", "").trim();

		        // LDAP 질의의 결과값이 #으로 구분된 문자열 List 이므로 파싱해서 하나의 serviceCode가 독립적인 요소로 구성된 결과로 가공한다.
	        	for(String code : serviceCode.split("#")){

			        // 1. 하위트리 생성: 자신 노드 하위 모든 서비스 코드를 생성
			        services.addAll( this.getChildServices( new HashSet<>(), code, "serviceCode", "parentDivCode", "childNode"));

	        		// 2. 상위트리 생성: 자신 노드부터 ROOT 노드까지의 서비스 코드 생성
	        		List<String> codeParts = this.getPartsByServiceCode(code); // 2자리로 분할된 서비스 코드 리스트 생성
			        int level = (-1 != codeParts.indexOf("00")) ? codeParts.indexOf("00") : MAX;
			        services.addAll( this.getParentServiceCode( new TreeSet<>(), codeParts, level));

			        // 3. 현재 노드 저장: 위 삽입 순서를 변경하면 안됨
			        services.add(code);
	        	}

		        result.put( roleCoe, services);
                return result;
            }
        });
        
        Map<String,Set<String>> result = new HashMap<>();
		for (Map<String, Set<String>> code : codeList) {
		    for (Map.Entry<String, Set<String>> entry : code.entrySet()) {
		    	// key가 없거나 빈요소만으로 이유어진 value 제외
    			if (StringUtils.isNotBlank(entry.getKey()) && null != entry.getValue() && entry.getValue().stream().anyMatch(StringUtils::isNotBlank)) {
    				result.computeIfAbsent(entry.getKey(), k -> new HashSet<>()).addAll(entry.getValue());
				}
		    }
		}
    	return result;
    }
    

    
    /**
     * 부모 노드가 없는 자식노드는 있을 수 없으므로 상위 노드 생성한다.
	 * 자신의 레벨 부터 ROOT 노드까지 재귀적으로 처리하며 비교 대상군이므로 중복을 배제한 Set Collection 으로 처리한다.
     */
	private SortedSet<String> getParentServiceCode( SortedSet<String> parents, List<String> codeList, int level){
        String serviceCode = "";
        for (int index = 0; index < codeList.size(); index++){
        	serviceCode += (level > index) ? codeList.get(index) : "00";
        }
        parents.add(serviceCode);
        // 재귀 호출
        if (1 < level){
        	this.getParentServiceCode( parents, codeList, --level);
        }
        return parents;
	}

    
    /**
	 * 10글자로 이루어진 서비스코드를 2글자로 분할하여 5개의 크기를 갖는 리스트로 반환한다.
	 */    
    private List<String> getPartsByServiceCode(String serviceCode){
    	// 상위노드를 생성하기 위해 2자리 수 배열로 파싱한다. 
        assert serviceCode.length() % DIGITS == 0;
        List<String> codeList = new ArrayList<>();
        for (int index = 0; index < serviceCode.length() / DIGITS; index++){
            codeList.add( serviceCode.substring(index * DIGITS, index * DIGITS + DIGITS));
        }
        return codeList;
    }
    
    
    /**
	 * 사용자 정보 매퍼
	 */
    private AbstractContextMapper<UserVo> userMapper(){
    	return new AbstractContextMapper<UserVo>() {
            @Override
            protected UserVo doMapFromContext(DirContextOperations ctx) {
                UserVo user = new UserVo();
                 if (null != ctx && null != ctx.getStringAttribute("uid")) {
	                user.setUid(ctx.getStringAttribute("uid"));
	                user.setSn(ctx.getStringAttribute("sn"));
	                user.setCn(ctx.getStringAttribute("cn"));
	                user.setOu(ctx.getStringAttribute("ou"));
	                user.setOuLevel(ctx.getStringAttribute("oulevel"));
	                user.setCelphoneNumber(ctx.getStringAttribute("celphoneNumber"));
	                user.setMail(ctx.getStringAttribute("mail"));
	                user.setArea(ctx.getStringAttribute("area"));
	                user.setRoleCode(ctx.getStringAttribute("roleCode"));
	                user.setOuCode(ctx.getStringAttribute("ouCode"));
	                user.setUseYN(ctx.getStringAttribute("useYN"));
	                
	                user.setServiceCode(ctx.getStringAttribute("serviceCode"));
	                user.setNonServiceCode(ctx.getStringAttribute("nonServiceCode"));
	                if(ctx.getObjectAttribute("userPassword") != null){
	                	user.setUserPassword(new String((byte[]) ctx.getObjectAttribute("userPassword")));
	                }
                }
                return user;
            }
        };
    }
    
    /**
	 * Role 정보 매퍼
	 */
    private AbstractContextMapper<RoleVo> roleMapper(){
    	return new AbstractContextMapper<RoleVo>() {
            @Override
            protected RoleVo doMapFromContext(DirContextOperations ctx) {
                RoleVo roleVo = new RoleVo();
                if (null != ctx) {
                	if(ctx.getStringAttribute("cn") != null){
                		roleVo.setCn(ctx.getStringAttribute("cn"));
                	}
	                roleVo.setRoleLevel(ctx.getStringAttribute("roleLevel"));
	                roleVo.setRoleCode(ctx.getStringAttribute("roleCode"));
	                roleVo.setCnRoleFullName(ctx.getStringAttribute("cnRoleFullName"));
	                roleVo.setParentGroupCode(ctx.getStringAttribute("parentGroupCode"));
	                roleVo.setRoleOrder(ctx.getStringAttribute("roleOrder"));
	                roleVo.setServiceCode(ctx.getStringAttribute("serviceCode"));
                }
                return roleVo;
            }
        };
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
			        service.setServiceLevel(NumberUtils.createInteger(ctx.getStringAttribute("serviceLevel")));
			        service.setServiceOrder(NumberUtils.toInt(ctx.getStringAttribute("serviceOrder")));
			        service.setCnServiceFullName(StringUtils.replace(ctx.getStringAttribute("cnServiceFullName"), "한국생산기술연구원 ", ""));
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
	public List<ServiceVo> getMenuListForTreeByUid(String uid, LdapMenuType type, String keyword) {
		try {
			
			// 사용자 - (roleCode,serviceCode,nonServiceCode)
			Map<String, String[]> userMap = this.getLdapUserMapByUid(uid);

			// 권한그룹 - serviceCode:  롤코드로 권한 그룹에서 서비스 코드 추출
			SortedSet<String> svcCodes = this.getLdapServiceCodeByRole(userMap.get(ROLE_CD));

			// 사용자 권한 기반 서비스코드 필터
			String roleSvcFilter = this.buildFilterByUserRole(svcCodes);

			// 사용자가 직접 가지고 있는 서비스코드 필터
			String svcFilter = this.buildFilterByUserSvcCode(userMap.get(SVC_CD));

			// 사용자가 직접 가지고 있는 제외 서비스코드 필터
			String nonSvcFilter = this.buildFilterByUserNonSvcCode(userMap.get(NON_SVC_CD));

			String filters;
			switch (type) {
				case UID_MENU:  filters = "(&(useYN="+ keyword +"))"; break;
				case URL_MENU:  filters = "(&(childNode=N))"+ "(|(serviceNewUrl="+ keyword + "))"; break;
				case WORD_MENU: filters = "(&(childNode=N))"+ "(|(cn=*" + keyword + "*)(serviceID=*"+ keyword + "*))"; break;
				default: throw new Exception("LDAP 서비스 조회 타입이 정의되지 않음!");
			}
			filters = "(&" + "(|" + roleSvcFilter + svcFilter + ")" + nonSvcFilter + filters +")";
			
			// 최종 메뉴 코드 조회
			return template.search( LdapQueryBuilder.query().base("cn=services").filter( filters), serviceMapper());
			
		} catch (Exception ex) {
			AppLog.error("메뉴 트리 조회시 오류 발생", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.menu.0001", ex);	
		} 
	}
	
	/**
	 * 사용자가 접근 가능한 메뉴에 해당하는 서비스만 리스트로 반환한다.
	 * @param uid
	 * @return
	 */
	public List<ServiceVo> getMenuListForTreeByUid(String uid) {
		return this.getMenuListForTreeByUid(uid, LdapMenuType.UID_MENU, "Y");
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
     * LDAP 대분류 별 서비스를 검색한다.
 	 * 중분류 메뉴는 표시되지 않는다.
	 * 
     */	
	public List<ServiceVo> findServicesByTopDivCode(ServiceVo vo) {
		try {
			String defaultFilter = "(&(childNode=N)(serviceLevel=*)"; // 필수필터
			
			if (StringUtils.isNotBlank(vo.getServiceCode())) {
				defaultFilter += "(topDivcode=" + vo.getServiceCode() + ")";
			}
			
			StringBuilder schFilter = new StringBuilder(defaultFilter); // 검색필터
			int filterCount = 0;	// 필터 카운트
			
			schFilter.append("(&");
			if (StringUtils.isNotBlank(vo.getCn())) {
				schFilter.append("(cn=*"+ vo.getCn() +"*)");
				filterCount++;
			}
			if (StringUtils.isNotBlank(vo.getServiceID())) {
				schFilter.append("(serviceID=*" + vo.getServiceID() +"*)");
				filterCount++;
			}
			if (StringUtils.isNotBlank(vo.getBetaServiceYN())) {
				switch (vo.getBetaServiceYN()) {
					case "Y" :
						schFilter.append("(betaServiceYN=" + vo.getBetaServiceYN() +")");
						break;
					case "3" :
						schFilter.append("(&(|(betaServiceYN=N)(!(betaServiceYN=*)))(serviceNewUrl=*))");
						break;
					case "2" :
						schFilter.append("(&(|(!(betaServiceYN=*))(betaServiceYN=N))(!(serviceNewUrl=*)))");
						break;
				}
				filterCount++;
			}
			if (StringUtils.isNotBlank(vo.getAlias())) {
				schFilter.append("(alias=*" + vo.getAlias() +"*)");
				filterCount++;
			}
			schFilter.append("))");
			
			if (filterCount <= 0) {
				int schFilterIndex = schFilter.indexOf("(&)");
				schFilter.delete(schFilterIndex, schFilterIndex + 3);
			}
			AppLog.debug("=================================================");
			AppLog.debug("Search Filter = " + schFilter.toString());
			AppLog.debug("=================================================");
	    	return template.search( LdapQueryBuilder.query().base("cn=services").filter(schFilter.toString()), serviceMapper());
    	//String searchFilter  = "(|(cn=*"+ vo.getCn() +"*)(serviceID=*" + vo.getServiceID() +"*)(betaServiceYN=" + vo.getServiceID() +"))";
    	} catch (Exception e) {
    		throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.ldap.0002", e);  // Ldap Core error
    	}
	}
	
	public List<ServiceVo> findServicesByServiceIds(String[] serviceIds) {
		String schFilter = this.buildFilterByServiceIds(serviceIds);
		AppLog.debug("=================================================");
		AppLog.debug("Search Filter = " + schFilter.toString());
		AppLog.debug("=================================================");
		return template.search( LdapQueryBuilder.query().base("cn=services").filter(schFilter), serviceMapper());
	};
	
	private String buildFilterByServiceIds(String[] serviceIds) {
		return (serviceIds.length <= 0) ? "" : "(|(serviceID=" + StringUtils.join(serviceIds, ")(serviceID=") + "))";
	}
	
	public void updateBetaService(ServiceVo vo) {
			LdapQuery query = LdapQueryBuilder.query().base("cn=services").filter("ServiceID=" + vo.getServiceID());
			DirContextOperations context = template.searchForContext(query);
			
			if (StringUtils.isNotBlank(vo.getServiceNewUrl()))
				context.setAttributeValue("serviceNewUrl", vo.getServiceNewUrl());
			if (StringUtils.isNotBlank(vo.getBetaServiceYN()))
				context.setAttributeValue("betaServiceYN", vo.getBetaServiceYN());
			
			template.modifyAttributes(context);
			
			MenuCacheManager.getInstance().modifyMenu(vo);
	}
	
	/**
	* 롤관리 및 사용자관리 시스템 구분 조회
	* @param ServiceVo
	* @return List<ServiceVo>
	* @author LeeYoungHee
	* @since 2023.11.15.
	*/
	public List<ServiceVo> findServiceTopDivCode(ServiceVo vo){
		return template.search( LdapQueryBuilder.query()
							.attributes("cn", "serviceCode", "serviceLevel", "serviceOrder", "serviceFullUrl", "serviceID")
							.base("cn=services")
							.filter("servicelevel=1"), serviceMapper());
	}
	
	/**
	* 롤관리 및 사용자관리 사용자 조회
	* @param ServiceVo
	* @return List<ServiceVo>
	* @author LeeYoungHee
	* @since 2023.11.15.
	*/
	public List<UserVo> findUsers(UserSrcVo vo){
		String[] attrs = vo.getAttribute().split(",");
		
		return template.search( LdapQueryBuilder.query()
							.attributes(attrs)
							.base(vo.getBase())
							.filter(vo.getFilter()), userMapper());
	}
	
	/**
	* 사용자별 롤등록관리 사용자별 롤 등록리스트 조회
	* @param ServiceVo
	* @return List<ServiceVo>
	* @author LeeYoungHee
	* @since 2023.11.15.
	*/
	public List<RoleVo> findUserRoleList(UserSrcVo vo){
		String[] attrs = vo.getAttribute().split(",");
		
		return template.search( LdapQueryBuilder.query()
							.attributes(attrs)
							.base(vo.getBase())
							.filter(vo.getFilter()), roleMapper());
	}
	
	/**
	* 사용자별 롤등록관리 사용자롤 수정
	* @param UserSrcVo
	* @author LeeYoungHee
	* @since 2023.11.22.
	*/
	public void updateUserRole(UserSrcVo vo) throws Exception{
		LdapQuery query = LdapQueryBuilder.query().base(vo.getBase()).filter(vo.getFilter());
		DirContextOperations context = template.searchForContext(query);		
		context.setAttributeValue("roleCode", vo.getRoleCode());		
		
		template.modifyAttributes(context);
	}	
	
	/**
	* 사용자별 롤 등록관리 서비스 조회
	* @param ServiceVo
	* @return List<ServiceVo>
	* @author LeeYoungHee
	* @since 2023.11.15.
	*/
	public List<ServiceVo> findServiceInfo(String serviceCode) throws Exception{
		// 서비스코드
		SortedSet<String> svcCodes = new TreeSet<>(Arrays.asList(serviceCode.split("[#]")));
        	
		// 사용자 권한 기반 서비스코드 필터
		List<ServiceVo> retList = null;
		SortedSet<String> ss = new TreeSet<>();
		if (null != svcCodes) {
			svcCodes.remove("");	// 빈 요소 제거
			Iterator<String> it1 = svcCodes.iterator();
			while (it1.hasNext()) {
				String svrCode = it1.next();
				// 서비스 코드를 5개 요소로 구성된 배열로 반환
				String[] levels = this.serviceCodeToFiveLevelArray(svrCode);
				
				// 5개 요소로 구성된 서비스 코드 배열에서 '00' 포함된 첫번째 인덱스 찾기
				int level = this.getlevelIndexInServiceCode(levels);
				if (level == -1) {
					// '00' 포함된 서비스 코드가 아닐 때
					ss.addAll( this.getSearchFilterLoop(levels, 6));
				} else {
					// '00' 포함된 서비스 코드일 때
					ss.addAll( this.getSearchFilterLoopLevelAstar(levels, level));
				}
			}
			
			String roleSvcFilter = (ss.isEmpty()) ? "" : "(|(serviceCode=" + StringUtils.join(ss.toArray(), ")(serviceCode=") + "))";
			
			// 최종 메뉴 코드 조회
			AppLog.info("-------------------- roleSvcFilter : "  + roleSvcFilter);
			if(!"".equals(roleSvcFilter)){
				retList = template.search( LdapQueryBuilder.query().base("cn=services").filter(roleSvcFilter), serviceMapper());
			}
		}
		return retList;
	}
}
