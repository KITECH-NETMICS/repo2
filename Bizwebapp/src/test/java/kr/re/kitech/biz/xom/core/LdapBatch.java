/**
 * 
 */
package kr.re.kitech.biz.xom.core;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author James
 * @since 2023. 2. 24.
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
public class LdapBatch {
	Logger log = LoggerFactory.getLogger(LdapBatch.class);
	
	@Resource
	private LdapTemplate ldapTemplate;
		
	
	
	/**
	 * LDAP 메뉴 URL 일괄등록 (도서관리 서비스 오픈)
	 */
	@Test
	public void test() {
	
		List<Service> services = new ArrayList<>();
		services.add(new Service( "K62D", "/ui/kbk/etc/KBK_ETC_K62D_00L.xml"));
		services.add(new Service( "K600", "/ui/kbk/bmg/KBK_BMG_K600_00L.xml"));
		services.add(new Service( "K61F", "/ui/kbk/bmg/KBK_BMG_K61F_00L.xml"));
		services.add(new Service( "K62F", "/ui/kbk/bmg/KBK_BMG_K62F_00L.xml"));
		services.add(new Service( "K630", "/ui/kbk/lib/KBK_LIB_K630_00L.xml"));
		services.add(new Service( "K628", "/ui/kbk/lib/KBK_LIB_K628_00L.xml"));
		services.add(new Service( "K623", "/ui/kbk/lib/KBK_LIB_K623_00L.xml"));
		services.add(new Service( "K620", "/ui/kbk/lib/KBK_LIB_K620_01D.xml"));
		services.add(new Service( "K621", "/ui/kbk/lib/KBK_LIB_K621_02D.xml"));
		services.add(new Service( "K622", "/ui/kbk/etc/KBK_ETC_K622_00L.xml"));
		services.add(new Service( "K625", "/ui/kbk/etc/KBK_ETC_K625_00L.xml"));
		services.add(new Service( "K631", "/ui/kbk/brw/KBK_BRW_K631_00L.xml"));
		services.add(new Service( "K633", "/ui/kbk/brw/KBK_BRW_K633_00L.xml"));
		services.add(new Service( "K634", "/ui/kbk/brw/KBK_BRW_K634_00L.xml"));
		services.add(new Service( "K616", "/ui/kbk/inv/KBK_INV_K616_00L.xml"));
		services.add(new Service( "K601", "/ui/kbk/inv/KBK_INV_K601_00L.xml"));
		services.add(new Service( "K604", "/ui/kbk/inv/KBK_INV_K604_00R.xml"));
		services.add(new Service( "K605", "/ui/kbk/inv/KBK_INV_K605_00R.xml"));
		services.add(new Service( "K606", "/ui/kbk/inv/KBK_INV_K606_00L.xml"));
		services.add(new Service( "K60A", "/ui/kbk/inv/KBK_INV_K60A_00L.xml"));
		services.add(new Service( "K610", "/ui/kbk/inv/KBK_INV_K610_00L.xml"));
		services.add(new Service( "K61A", "/ui/kbk/inv/KBK_INV_K61A_00L.xml"));
		services.add(new Service( "K61C", "/ui/kbk/inv/KBK_INV_K61C_00L.xml"));
		services.add(new Service( "K612", "/ui/kbk/inv/KBK_INV_K612_00L.xml"));
		services.add(new Service( "K651", "/ui/kbk/inv/KBK_INV_K610_00D.xml"));
		services.add(new Service( "K652", "/ui/kbk/inv/KBK_INV_K612_02D.xml"));
		services.add(new Service( "K602", "/ui/kbk/pop/KBK_POP_K600_01P.xml"));

		services.forEach( service -> {
		    LdapQuery query = LdapQueryBuilder.query().where("serviceId").is(service.serviceId);
	        DirContextOperations context = ldapTemplate.searchForContext(query);
	        context.setAttributeValue("serviceNewUrl", service.serviceNewUrl);
	        context.setAttributeValue("betaServiceYN", "Y");
	        
	        log.debug("context: {}", context);
	        ldapTemplate.modifyAttributes(context);
		});
	}
	
	class Service {
		public String serviceId;
		public String serviceNewUrl;
		
		public Service(String id, String url) {
			this.serviceId = id;
			this.serviceNewUrl = url;
		}
	}
	
}
