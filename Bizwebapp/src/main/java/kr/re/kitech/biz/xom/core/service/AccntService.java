package kr.re.kitech.biz.xom.core.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import kr.re.kitech.biz.xom.base.enums.LoginType;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.core.vo.RoleCheckVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 계정계 서비스
 */
public interface AccntService {
	public boolean authenticate(String username, String password);
	public UserVo findUserByUsername(String username);
	public UserVo findSyspaynoByUid(String uid);
	public UserVo findUserIdBySyspayno(String syspayno);
	public List<UserVo> findUserIdsBySyspaynos(String[] syspaynos);
	public List<UserVo> findUserIdsBySyspaynos(String syspaynos);
	public List<UserVo> findUsersByRoleCodes(String[] roleCode);
	public SessionUserHeader findSessionDataByUsernameAndLoginType(String username, LoginType loginType);
	public SortedSet<String> findGroupsServiceCodesByRoleCode(String roleCodes);
	public Boolean isPermissionError(String uid, String roleCode, String serviceUrl);
	public Boolean isExistLeafServiceByUrl(String serviceUrl);
	public ServiceVo findServiceByServiceId(String serviceId);
	public RoleCheckVo checkRole(String serviceId, String roleCodes) throws Exception;
	public List<ServiceVo> getMenuListForTreeByUidSch(String uid, String keyword) throws Exception;
	public UserVo findUserByExpireSyspaynoInDB(String syspayno);
	public UserVo findDirectSupervisorBySyspaynoInDB(String syspayno);
	
	/**
	 * 롤코드 집합에 해당하는 서비스 리스트에 해당 서비스가 존재하는지 확인
	 * @param roleCode
	 * @param serviceCode
	 * @return
	 */
	public boolean isAllowService(String roleCode, String serviceCode);
	
	
	/**
	 * 활성 사용자 전체 리스트를 조회한다.
	 * @return
	 */
	public List<UserVo> findActiveUsers();
	
	/**
	 * 활성 롤에 맵핑된 모든서비스코드
	 * @return
	 */
	public Map<String,Set<String>> findAtiveRoleServiceMap();
}
