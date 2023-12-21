/**
 * 
 */
package kr.re.kitech.biz.xom.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 메뉴 성능(캐시) 관련 단위 테스트 케이스
 * @author James
 * @since 2023. 10. 25.
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
public class MenuTest {
	
	@Resource
	private AccntService accntService;

	@Resource
	private MenuService menuService;	
	

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
	
	/**
	 * 사번이 Accessors 컬렉션에 존재하는 메뉴 리스트를 반환한다.
	 * 
	 * @param sn
	 * @param services
	 * @return
	 */
	private List<ServiceVo> findMenusBySn(String sn, List<ServiceVo> services) {
		List<ServiceVo> menus = new ArrayList<>();
		for (int index=0; index < services.size(); index++) {
			ServiceVo service = services.get(index);
			if (service.isPublicMenu() || service.getAccessors().contains(sn)) {
				// Deep Copy 를 위한 복사 생성자 정의
				menus.add(new ServiceVo(service));
			}
		}
		return menus;
	}
	
	private String blank(int level) {
		String result = "";
		for (int i= 1; i <= level; i++)
			result += "\t";
		return result;
	}

	
	@Test
	public void test() {
	
		long startTime = 0L;
		long endTime = 0L;

		// 1. 전체 활성 메뉴 조회
		startTime = System.currentTimeMillis();  
        List<ServiceVo> serviceVoList = menuService.findActiveServices();
        endTime = System.currentTimeMillis();
        System.out.println("times: " + (endTime - startTime) + ", 메뉴 개수: " + serviceVoList.size());
        
        // 2. 전체 활성 사용자 조회
        startTime = System.currentTimeMillis();
        final List<UserVo> users = accntService.findActiveUsers();
        endTime = System.currentTimeMillis();
        System.out.println("times: " + (endTime - startTime) + ", 사용자 수: " + users.size());
        
        // 3. 롤코드별  서비코드 리스트 맵을 미리 생성
        startTime = System.currentTimeMillis();
        final Map<String,Set<String>> role = accntService.findAtiveRoleServiceMap();
        endTime = System.currentTimeMillis();
        System.out.println("times: " + (endTime - startTime) + ", 권한 수: " + role.size());

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
        System.out.println("times: " + (endTime - startTime) + ", 서비스에 Accessor 추가 완료!");

        String syspayno1 = "20130576";
        String syspayno2 = "20170701";
        String syspayno3 = "20140328";
        String syspayno4 = "99999995";

        startTime = System.currentTimeMillis();  
        List<ServiceVo> menus = this.findMenusBySn(syspayno3, serviceVoList);
        endTime = System.currentTimeMillis();
        System.out.println("times: " + (endTime - startTime) + ", 사용자 별 서비스 조회 완료!");

        int index = 1; 
        for (ServiceVo menu : menus) {
        	System.out.println("[" + index + "]" + this.blank(menu.getServiceLevel()) + menu.getCn());
    		index ++;
        }

        UserVo user = users.stream()
           .filter(u -> syspayno3.equals(u.getSn()))
           .findFirst()
           .orElseThrow(() -> new NoSuchElementException("해당 조건에 맞는 사용자가 없습니다."));
        
        //List<ServiceVo> legacyMenu = menuService.getMenuListForTree(syspayno3);

        System.out.println("SN: "+ user.getSn() +", CN:"+ user.getCn() +", "+ user.getRoleCode());
        System.out.println("메뉴 개수: " + serviceVoList.size() + ", 사용자 수: " + users.size());
	}
}
