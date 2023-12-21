/**
 * 
 */
package kr.re.kitech.biz.fin.com;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inswave.elfw.util.DateUtil;

import kr.re.kitech.biz.api.server.dao.StdProcessDAO;
import kr.re.kitech.biz.fin.com.vo.FspSlipRjctVo;
import kr.re.kitech.biz.xom.core.LdapTest;

/**
 * 
 * @author James
 * @since 2023. 7. 28.
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
public class RejectTest {
	
	Logger log = LoggerFactory.getLogger(LdapTest.class);

	@Resource(name="stdProcessDAO")
	private StdProcessDAO dao;
	
	@Test
	public void test() {
		// 연구비적정집행모니터링 검색서버 수집을 위해 결재반려시 로그저장
		FspSlipRjctVo vo = new FspSlipRjctVo();
		vo.setUnslip_no("1302370002");
		vo.setRct_content("테스트 반려");
		vo.setAttach_no("1302370002_" + DateUtil.getNow("yyyyMMddhhssmm"));
		vo.setApr_state("XAD070");
		vo.setRegst_syspayno("99999995");
		vo.setRegst_daytm("2023-07-28 00:00:00");

		log.info("reject_no1: {}", vo.getReject_no());
		dao.insertFspSlipRjct(vo);
		log.info("reject_no1: {}", vo.getReject_no());
	}

}
