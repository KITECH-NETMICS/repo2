/**
 * 
 */
package kr.re.kitech.biz.api;


import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.api.client.CsrClient;
import kr.re.kitech.biz.api.client.RecommClient;
import kr.re.kitech.biz.api.client.SynapClient;
import kr.re.kitech.biz.api.client.enums.CsrType;
import kr.re.kitech.biz.api.client.vo.CsrVo;
import kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.service.AttachService;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.service.RecomMenuService;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

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
public class CsrClientTest {
	Logger log = LoggerFactory.getLogger(CsrClientTest.class);
			
	
	@Resource(name="csrCrtClient")
	private CsrClient csrCrtClient;
	
    @Resource(name="csrAppClient")
	private CsrClient csrAppClient;
	
	@Resource(name="csrSatClient")
	private CsrClient csrSatClient;
	
	@Resource(name="csrEndClient")
	private CsrClient csrEndClient;
	
	@Resource(name="csrDtlClient")
	private CsrClient csrDtlClient;
	
	@Resource(name="csrCntClient")
	private CsrClient csrCntClient;
	
	@Resource(name="csrLstClient")
	private CsrClient csrLstClient;
	
	@Resource(name="recommMenuClient")
	private RecommClient recommMenuClient;
	
	@Resource(name="recomMenuServiceImpl")
	private RecomMenuService recomMenuServiceImpl;
	
    @Resource(name = "cgsMRoomReqServiceImpl")
    private CgsMRoomReqService cgsMRoomReqService;
	
	@Resource(name="synapPreviewClient")
	private SynapClient synapPreviewClient;
	
	
	/**
	 * 플랜 텍스트 단건 발송 테스트
	 */
	public void receiptCsr() throws Exception {
		CsrVo csr = new CsrVo();
		csr.setChangeTitle( "API 문서 생성 테스트-James");
		csr.setChangeReason( "안녕하세요, 123, abc, @@@");
		csr.setUserLoginId("cmadmin");
		csr.setNextLoginId("cmadmin");
		csr.setUserDepId("H650");
		csr.setMidCategory("XAA020");
		csr.setAttachFileNo("X9512022000CD");
		csr.setExpectedDt(DateUtil.addDay(DateUtil.getCurrentDate(), 7));
		csr.setCsrType(CsrType.CREATE_PRG_IMP.name());
//		
		CsrVo temp = csrCrtClient.execute(csr);
//		csr.setNextLoginId("mklee");
		csr.setSuccessYn(temp.getSuccessYn());
		csr.setInstId(temp.getInstId());
		System.out.println(csr);
		assertEquals("1. Get is Success", "Y", csr.getSuccessYn());
////		csr.setSuccessYn("Y");
////		csr.setInstId(326);
//
//
		if ("Y".equals( csr.getSuccessYn()) && 0 < csr.getInstId()){
	        csr.setCsrType( CsrType.APPROVAL_FIRST.name());
	        String isSuccess = csrAppClient.execute(csr).getSuccessYn();
	        
	        csr.setSuccessYn(isSuccess);
	        System.out.println("결과: " + csr);
	        if (("Y").equals(csr.getSuccessYn())) {
	        	System.out.println("최종 성공: ");
	        	
	        }		
		}
	}	
	
	public void approve() throws Exception {
	
		CsrVo csr = new CsrVo();
		csr.setCsrType( CsrType.APPROVAL_FIRST.name());
	 	csr.setInstId(284);
	 	csr.setUserLoginId("mklee");
	 	csr.setNextLoginId("mklee");
	 	csr.setMidCategory("XAA007");
	 	csr.setChangeReason("안녕하세요");
	 	csr.setChangeTitle("API 문서 생성 테스트");
	 	csr.setUserDepId("");
	 	csr.setExpectedDt("20220505");
	 	csrAppClient.execute(csr);
	
	}
	
	public void selectDetail() throws Exception {
		CsrVo csr = new CsrVo();
		csr.setInstId(33);
		csr = csrDtlClient.execute(csr);
		if (csr.getSuccessYn().equals("Y")) {
			log.debug(csr.toString());
			log.debug("성공");
		} else {
			log.warn("실패");
		}
	}
	
	public void selectCountUser() throws Exception {
		CsrVo csr = new CsrVo();
		csr.setUserLoginId("mklee");
		try {
			csr = csrCntClient.execute(csr);
			log.debug("성공");
		} catch (Exception e) {
			log.warn("에러발생 : " + e);
		}
	}
	public void updateSatisfaction() throws Exception {
		CsrVo csr = new CsrVo();
		csr.setInstId(396);
		//csr.setSatisfaction(1);
		csr.setUserLoginId("kinglsy");
		
		try {
			//csrSatClient.execute(csr);
			csrEndClient.execute(csr);
		} catch (Exception e) {
			log.debug("에러발생!!!!!!!!!!");
		}
		
	}
	
    @Resource(name = "attachServiceImpl")
    private AttachService attachService; 
    
	@Resource(name="menuServiceImpl")
	MenuService menuServiceImpl;

    @Test
	public void selectCsrList() throws Exception {
    	List<ServiceVo> temp = recomMenuServiceImpl.selectRecommendMenuList();
    	
//    	String[] str = {"C21A", "C20A", "weoi"};
//    	
//    	List<ServiceVo> temp = menuServiceImpl.selectServicesByIds(str);
    	
    	log.debug(temp + "");

//    	CgsMRoomReqVo vo = new CgsMRoomReqVo();
//    	vo.setMeet_ymd("20220922");
//    	vo.setMroom_cd("A01010");
//    	vo.setUse_orign_time("09:00");
//    	vo.setUse_cls_time("11:00");
//    	cgsMRoomReqService.selectCgsMroomDupOverlap(vo);
    	
//    	UserVo user = new UserVo();
//    	user.setSn("20211106");
//    	user.setOuCode("H650");
//		JSONObject result = recommMenuClient.execute(user);
//		
//		// 2. 추천 메뉴 서비스코드 리스트 추출
//		SortedSet<String> serviceCodes =  new TreeSet<>();
//		
//		JSONArray menuGroups = result.getJSONArray("menuGroups");
//		JSONArray top30Menus = new JSONArray();
//		for (int i = 0; (i < menuGroups.length() && i < 30); i++) {
//			serviceCodes.add( menuGroups.getJSONObject(i).getString("serviceid") );
//		}
//		JSONArray items = result.getJSONArray("items");
//		
//		log.debug("====================== sortedSet =====================" + serviceCodes);
	}
	
}