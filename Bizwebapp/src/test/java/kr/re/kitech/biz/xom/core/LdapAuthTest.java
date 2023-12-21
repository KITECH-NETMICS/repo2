/**
 * 
 */
package kr.re.kitech.biz.xom.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.xom.core.dao.AccntRepository;

/**
 * 
 * @author James
 * @since 2023. 4. 28.
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
public class LdapAuthTest {
	Logger log = LoggerFactory.getLogger(LdapAuthTest.class);
	
	@Resource
	private AccntRepository accntRepository;
	
	public boolean isPermissionError() {
		String url = "/ui/fin/spm/FIN_SPM_F203_00D.xml";
		String uid = "mklee";
		String roleCode = "1000001#1001001#1010001#1001201#1010102#1019201#1003144#1003002#1001215#1015117#1004107#1016102#";
		
		// 0. serviceNewUrl 로 serviceCode 조회
		List<String> serviceCodes = accntRepository.findServiceCodesByUrl(url);
		System.out.println(serviceCodes);
		
		
		// serviceNewUrl 에 해당하는serviceCode가 없으면 아예 확인하지 않음
		if (null == serviceCodes || serviceCodes.isEmpty()) {
			return false;
		}

		// 1. 사용자의 roleCode 리스트 조회 (세션에서 가져옴)
		// UserVo user = accntRepository.findUserByUid(uid);
		List<String> roles = Arrays.stream(roleCode.split("#")).filter(s -> !s.isEmpty()).collect(Collectors.toList());


		// 2. serviceCode(1번)가 해당 해당 roleCode의 serviceCode에 존재하는지 확인 (LOOP)
		boolean isExistsRoleServiceCode = accntRepository.matchedRolesAndServices(roles, serviceCodes);
		System.out.println(isExistsRoleServiceCode);
		
		// 3. 사용자의 serviceCode에 존재하는지 확인
		boolean isExistsServiceCode = accntRepository.hasAttributeValue("uid="+ uid +",cn=resident,cn=users", "serviceCode", serviceCodes);
		System.out.println(isExistsServiceCode);
		
		// 4. 사용자의 nonServiceCode 에 존재하는지 확인
		boolean isExistsNonServiceCode = accntRepository.hasAttributeValue("uid="+ uid +",cn=resident,cn=users", "nonServiceCode", serviceCodes);
		System.out.println(isExistsNonServiceCode);
		
		// accntRepository.findUsersByRoleCodes(roleCodes)
		
		// 3. 서비스가 
		return false;
	}
	
	@Test
	public void test() {
		System.out.println("isPermissionError: " + this.isPermissionError());
		
	}

}
