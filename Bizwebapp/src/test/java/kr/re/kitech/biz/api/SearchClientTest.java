/**
 * 
 */
package kr.re.kitech.biz.api;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.api.client.SearchClient;
import kr.re.kitech.biz.api.client.enums.SearchIndex;
import kr.re.kitech.biz.api.client.vo.ScRequest;
import kr.re.kitech.biz.api.client.vo.SearchVo;

/**
 * 
 * @author James
 * @since 2023. 3. 29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
public class SearchClientTest {
	Logger log = LoggerFactory.getLogger(SearchClientTest.class);
			
	
	@Resource(name="searchGetTask")
	private SearchClient searchGetTask;
	
	@Test
	public void test1() {
		log.debug("=====================================================================================================================================================");
		log.debug("1. 가결의 통합검색");
		ScRequest scReq = new ScRequest.Builder(SearchIndex.FIN_SLIP_TASK).query("이민기").build();
		SearchVo scResult = this.searchGetTask.execute(scReq);
		assertTrue("1. Get is Success", scResult.isSuccess());
	}

	@Test
	public void test2() {
		log.debug("=====================================================================================================================================================");
		log.debug("2. 구매 통합검색");
		ScRequest scReq = new ScRequest.Builder(SearchIndex.PUR_REQ_TASK).query("EIP").build();
		SearchVo scResult = this.searchGetTask.execute(scReq);
		assertTrue("2. Get is Success", scResult.isSuccess());
	}
	
	@Test
	public void test3() {
		log.debug("=====================================================================================================================================================");
		log.debug("3. 국내출장 통합검색");
		ScRequest scReq = new ScRequest.Builder(SearchIndex.CTR_DOME_TASK).query("이민기").build();
		SearchVo scResult = this.searchGetTask.execute(scReq);
		assertTrue("2. Get is Success", scResult.isSuccess());
	}
	
	
	@Test
	public void test4() {
		log.debug("=====================================================================================================================================================");
		log.debug("4. 해외출장 통합검색");
		ScRequest scReq = new ScRequest.Builder(SearchIndex.CTR_OVER_TASK).query("이민기").build();
		SearchVo scResult = this.searchGetTask.execute(scReq);
		assertTrue("2. Get is Success", scResult.isSuccess());
	}
}
