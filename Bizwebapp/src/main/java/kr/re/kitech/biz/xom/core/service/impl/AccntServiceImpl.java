package kr.re.kitech.biz.xom.core.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.xom.base.enums.LdapMenuType;
import kr.re.kitech.biz.xom.base.enums.LoginType;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.core.dao.AccntDao;
import kr.re.kitech.biz.xom.core.dao.AccntRepository;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.vo.RoleCheckVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;


/**
 * 계정계 서비스 구현체
 * 	- 권한, 서비스, 사용자, 조직 관련 서비스를 구현한다.
 *
 * @author James
 * @since 2022. 2. 16.
 */
@Service("accntServiceImpl")
public class AccntServiceImpl extends EgovAbstractServiceImpl implements AccntService {

    @Resource(name="accntRepository")
    private AccntRepository accntRepository;
    
    @Resource(name="accntDao")
    private AccntDao accntDao;    

    @Resource(name = "menuServiceImpl")
    private MenuService menuService;
    
	
	/**
     * 전체 매뉴 조회
	 * 계층적적인 정렬 문제를 해결하기 위해 LdapTemplate 를 바로 사용하지 못하고 LdapContext 의 SortControl 을 사용한다.
 	 * Tree 자료형을 사용하면 LdapTemplate 로 가능하지만 조회만 사용할 것이므로 재귀함수를 이용하여 간단하게 처리.
     */    
	@Override
    public boolean authenticate(String username, String password) {
        AppLog.info("__debug James, username: " + username + ", password: " + password);

        UserVo user = accntRepository.findUserByUid(username);

        AppLog.info("__debug James, password matches: " + password.equals(user.getUserPassword()));
        return (password.equals(user.getUserPassword()));
    }

	/**
	 * 사용자 아이디에 해당하는 단건 데이터 조회
	 */
	@Override
    public UserVo findUserByUsername(String username) {
        AppLog.info("__debug James, authenticate useranem: " + username);
        return accntRepository.findUserByUid(username);
    }
    
	/**
	 * 다건 롤코드에 해당하는 다건 데이터 조회
	 */    
	@Override
    public List<UserVo> findUsersByRoleCodes(String[] roleCode) {
        AppLog.info("__debug James, findUsersByRoleCode roleCode: " + roleCode);
        return accntRepository.findUsersByRoleCodes(roleCode);
    }
    
    /**
     * 롤코드에 해당하는 서비스그룹의 서비스코드 셋을 조회한다.
     */
    public SortedSet<String> findGroupsServiceCodesByRoleCode(String roleCodes) {
    	return this.accntRepository.findGroupsServiceCodesByRoleCode(roleCodes);
	}
	
	
	@Override
	public boolean isAllowService(String roleCode, String serviceCode) {
    	// AppLog.debug("사용자Role: "+ roleCode +", 서비스Code: "+ serviceCode);

		// serviceNewUrl 에 해당하는serviceCode가 없으면 아예 확인하지 않고 통과
		if (StringUtils.isBlank(roleCode) || StringUtils.isBlank(serviceCode)) {
			return false;
		}
		// 1. 사용자의 roleCode 리스트 조회 (세션에서 가져옴)
		List<String> roles = Arrays.stream(roleCode.split("#")).filter(s -> !s.isEmpty()).collect(Collectors.toList());		

		// 2. serviceCode(1번)가 해당 해당 roleCode의 serviceCode에 존재하면 ==> 통과
		return accntRepository.matchedRolesAndServices(roles, serviceCode);
	}
	
	@Override
	public List<UserVo> findActiveUsers() {	
		return accntRepository.findActiveUsers();
	}
	
	@Override
	public Map<String,Set<String>> findAtiveRoleServiceMap(){
		return accntRepository.findAtiveRoleServiceMap();
	}
	
	/**
	 * 해당 URL이 사용자가 접근할 수 있는 URL인지 확인한다. 
	 */
	@Override
	public Boolean isPermissionError(String uid, String roleCode, String serviceUrl) {

    	AppLog.debug("사용자: "+ uid +", 서비스URL: "+ serviceUrl, "roleCode: " + roleCode);
    	
		// 0. serviceNewUrl 로 serviceCode 조회
		List<String> serviceCodes = accntRepository.findServiceCodesByUrl(serviceUrl);
		
		// serviceNewUrl 에 해당하는serviceCode가 없으면 아예 확인하지 않고 통과
		if (null == serviceCodes || serviceCodes.isEmpty()) {
			return false;
		}

		// 1. 사용자의 roleCode 리스트 조회 (세션에서 가져옴)
		// UserVo user = accntRepository.findUserByUid(uid);
		List<String> roles = Arrays.stream(roleCode.split("#")).filter(s -> !s.isEmpty()).collect(Collectors.toList());

		
		// 3. 사용자의 serviceCode에 존재하면 ==> 통과
		boolean isExistsServiceCode = accntRepository.hasAttributeValue("uid="+ uid +",cn=resident,cn=users", "serviceCode", serviceCodes);
		if (isExistsServiceCode) {
			return false;
		}

		// 4. 사용자의 nonServiceCode 에 존재하면 ==> 권한 에러
		boolean isExistsNonServiceCode = accntRepository.hasAttributeValue("uid="+ uid +",cn=resident,cn=users", "nonServiceCode", serviceCodes);
		if (isExistsNonServiceCode) {
			return true;
		}

		// 2. serviceCode(1번)가 해당 해당 roleCode의 serviceCode에 존재하면 ==> 통과
		boolean isExistsRoleServiceCode = accntRepository.matchedRolesAndServices(roles, serviceCodes);
		if (isExistsRoleServiceCode) {
			return false;
		}
				
		return false;
	}

	/**
	 * 사용자 아이디에 해당하는 단건 데이터 조회
	 */
	@Override
	public SessionUserHeader findSessionDataByUsernameAndLoginType(String username, LoginType loginType) {
		UserVo user = accntRepository.findUserByUid(username);
		
		SessionUserHeader session = new SessionUserHeader();
		session.setUid(user.getUid());
		session.setCn(user.getCn());
		session.setSn(user.getSn());
		session.setRoleCode(user.getRoleCode());
		session.setPhone(user.getCelphoneNumber());
		session.setEmail(user.getMail());
		session.setAreaCode(user.getArea());
		session.setDeptLevel(user.getOuLevel());
		session.setEmpno(user.getSn().substring(2));
		session.setDeptName(user.getOu());
		
		// LDAP 에 있는 페이지 관련 데이터 url 변경시 동적으로 변경되어야할 데이터
//		ServiceVo service = accntRepository.findServiceByServiceId(serviceId);
//		session.setServiceId(service.getServiceID());		// 서비스 아이디, 4자리
//		session.setRedirectUrl(service.getServiceUrl());	// 서비스 아이디에 매핑 된 URL
		
		// DB 에 있는 데이터는 따로 Dao 클래스 생성 후 질의 및 값 세팅 필요.
		session.setDocId("");		// 신청서 아이디, 3자리(전자결재 신청번호 prefix)
		session.setPermission("");	// 페이지 권한 코드	

		// Session 의 RDB 항목 및 betaService 관련 예외 처리 
		if (user.getSn().equals("99993060") || user.getSn().equals("99993061")) {
			// rpabot1, rpabot2 계정은 개발자(bassysoprpsn) 테이블 기준으로 nbiztester 에서 질의함.
			Map<String,String> rpaBot = accntDao.getSessionBotBetaServieByKey(user.getSn());
			// 데이터 자체가 없다면 기본적으로 개발자와 같은 동작으로 처리된다.
			session.setBetaService(null == rpaBot ? "all" : rpaBot.get("betaService"));
			return session;
		} else if (user.getSn().startsWith("99")) {
			// 시스템 운영팀/개발팀 및 운영지원 계정이라면 추가 세션 데이터를 DB에서 질의하지 않음
			session.setBetaService("all");
			return session;
		}
		
		// 로그인 타입이 API 인증 관련 호출이라면 추가 세션 데이터를 DB에서 질의하지 않음
		if (loginType.isApiAuthorization() && !loginType.getName().equals("MBI")) {		
			return session;
		}
		
		// DB 에 있는 데이터는 따로 Dao 클래스 생성 후 질의 및 값 세팅 필요.
		Map<String,String> data = accntDao.getSessionEtcDataByKey(user.getSn());
		AppLog.debug("\n -------------------- Login data : " + data);
		// 인사정보에 등록되지 않은 계정이 있으므로 예외 처리
		if (null != data) {
			// 테스터 여부 추가
			session.setBetaService(data.get("betaService"));
			session.setEmpno(data.get("empno"));
			session.setWorkClsf(data.get("workClsf"));
			session.setDeptCode(data.get("deptCode"));
			session.setDeptName(data.get("deptName"));
			session.setDeptNewYmd(data.get("deptNewYmd"));
			
			session.setDvsnCode(data.get("dvsnCode"));
			session.setDvsnName(data.get("dvsnName"));
			session.setDvsnNewYmd(data.get("dvsnNewYmd"));		
			
			session.setPosiCode(data.get("posiCode"));
			session.setPosiName(data.get("posiName"));
			session.setDutyCode(data.get("dutyCode"));
			session.setDutyName(data.get("dutyName"));
			session.setCmmtCode(data.get("cmmtCode"));
			session.setCmmtName(data.get("cmmtName"));
			session.setAreaCode(data.get("areaCode"));
			session.setAreaName(data.get("areaName"));
		}
		return session;
	}

	@Override
	public UserVo findSyspaynoByUid(String uid) {
		return this.accntRepository.findUserByUid(uid);
	}
	
	@Override
	public UserVo findUserIdBySyspayno(String syspayno) {
		return this.accntRepository.findUserIdBySyspayno(syspayno);
	}

	@Override
	public List<UserVo> findUserIdsBySyspaynos(String[] syspaynos) {
		return this.accntRepository.findUserIdsBySyspaynos(syspaynos);
	}
	@Override
	public List<UserVo> findUserIdsBySyspaynos(String syspaynos) {
		return this.accntRepository.findUserIdsBySyspaynos(syspaynos.split(","));
	}
	
	@Override
	public Boolean isExistLeafServiceByUrl(String serviceUrl) {
		return this.accntRepository.isExistLeafServiceByUrl(serviceUrl);
	}
	
	@Override
	public ServiceVo findServiceByServiceId(String serviceId) {
		ServiceVo serviceVo = this.accntRepository.findServiceByServiceId(serviceId);
		return serviceVo;
	}	
	
	public RoleCheckVo checkRole(String serviceId, String roleCodes) throws Exception{
		RoleCheckVo retVo = new RoleCheckVo();
		
		String[] arryRoleCode = roleCodes.split("[#]");
		HashSet<String> roleSet = new HashSet<>();
		for(int i=0; i<arryRoleCode.length; i++){
			if(!"".equals(arryRoleCode[i].trim()) && !"1000001".equals(arryRoleCode[i].trim())){
				roleSet.add(arryRoleCode[i]);
			}
		}
		arryRoleCode = roleSet.toArray(new String[0]);
		if(arryRoleCode.length == 0){
			retVo.setIsRoleYn(false);;
			return retVo;
		}
		
		// serviceCode List 조회
		String serviceCodes = this.accntRepository.findGroupsServiceCodeByRoleCode(arryRoleCode);
		
		// Service 조회
		ServiceVo serviceVo = this.accntRepository.findServiceByServiceId(serviceId);
		String serviceCode = serviceVo.getServiceCode();
		String bigServiceCode = serviceCode.substring(0, 4) + "000000";
		String midServiceCode = serviceCode.substring(0, 6) + "0000";
		if(serviceCodes.indexOf(serviceCode) > -1 || serviceCodes.indexOf(bigServiceCode) > -1 || serviceCodes.indexOf(midServiceCode) > -1){
			retVo.setIsRoleYn(true);;
		}else{
			retVo.setIsRoleYn(false);;
		}
		
		return retVo;
	}
	
	@Override
	public List<ServiceVo> getMenuListForTreeByUidSch(String uid, String keyword) throws Exception {
		return accntRepository.getMenuListForTreeByUid(uid, LdapMenuType.WORD_MENU, keyword);
	}

	@Override
	public UserVo findUserByExpireSyspaynoInDB(String syspayno) {
		String dbSyspayno = this.accntDao.getSyspaynoByExpireSyspaynoInDB(syspayno);
		AppLog.debug("DB에서 조회한 최신 사번", dbSyspayno);
		return this.findUserIdBySyspayno(dbSyspayno);
	}
	
	@Override
	public UserVo findDirectSupervisorBySyspaynoInDB(String syspayno) {
		String dbSyspayno = this.accntDao.findDirectSupervisorBySyspaynoInDB(syspayno);
		AppLog.debug("DB에서 조회한 차상위자 사번", dbSyspayno);
		return this.findUserIdBySyspayno(dbSyspayno);
	}
}
