/**
 * 
 */
package kr.re.kitech.biz.api;


import java.util.NoSuchElementException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.api.server.dao.EpuProcessDAO;
import kr.re.kitech.biz.api.server.dao.SptTrpProcessDAO;
import kr.re.kitech.biz.api.server.service.BpmPostService;
import kr.re.kitech.biz.api.server.service.process.EpuProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.SptRstBookVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 
 * @author James
 * @since 2022. 3. 28.
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
public class ProcessTest {
	Logger log = LoggerFactory.getLogger(ProcessTest.class);

    @Autowired
    private EpuProcess epuPro;
    
	@Resource(name="epuProcessDAO")
	private EpuProcessDAO epuDao;
	
	@Resource(name="sptTrpProcessDAO")
	private SptTrpProcessDAO sptDao;	
	
	
    @Resource(name="bpmPostService")
    private BpmPostService bpmPostService; 
	
	private ApiBpmVo apiBpmVo = new ApiBpmVo();
	
	// @Test
	public void testProcess() throws Exception {
		try {
			ApiBpmVo param = new ApiBpmVo();
			param.setReqNo("R71202200004");
			param.setAprState("XAD100");
			param.setSyspayno("20120467");
		
			ApiBpmVo result = this.bpmPostService.executePostProcess(param);
			log.debug(result.toString());
		}  catch (NoSuchElementException enumException) {
        	throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류 3: 업무 구분 코드가 올바르지 않습니다.");
        }
	}
	
	@Test
	public void testTrpProcess() throws Exception {
		try {
			SptRstBookVo param = new SptRstBookVo();
			param.setMis_pk("");
			
			int result = this.sptDao.updatePdfResource(param);
			log.debug("성공 : {}", result);
		}  catch (Exception ex) {
			log.error("오류 발생", ex);
        	throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류 3: 업무 구분 코드가 올바르지 않습니다.");
        }
	}	
	
}