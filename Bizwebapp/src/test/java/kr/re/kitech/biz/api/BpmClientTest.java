/**
 * 
 */
package kr.re.kitech.biz.api;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.api.client.BpmClient;
import kr.re.kitech.biz.api.client.enums.BpmServiceType;
import kr.re.kitech.biz.api.client.model.ApiGetResult;
import kr.re.kitech.biz.api.client.model.ApiWorkResult;
import kr.re.kitech.biz.api.client.model.AppLineInfo;
import kr.re.kitech.biz.api.client.model.ApprovalLineInfo;
import kr.re.kitech.biz.api.client.model.NextWork;
import kr.re.kitech.biz.api.client.model.Role;
import kr.re.kitech.biz.api.client.model.RoleMapping;
import kr.re.kitech.biz.api.client.model.WorkInfo;
import kr.re.kitech.biz.api.client.vo.ApiResult;
import kr.re.kitech.biz.api.client.vo.BpmRequest;
import kr.re.kitech.biz.api.client.vo.BpmResult;
import kr.re.kitech.biz.xom.core.vo.UserVo;

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
public class BpmClientTest {
	Logger log = LoggerFactory.getLogger(BpmClientTest.class);
			
	
	@Resource(name="bpmGetInst")
	private BpmClient bpmGetInstance;
	
    @Resource(name="bpmPostInst")
	private BpmClient bpmPostInstance;

	@Resource(name="bpmGetWorks")
	private BpmClient bpmGetWorks;
	
	/**
     * BPM 신청서를 가져와서(신규 작성-양식함 또는 수정-작성중문서함,업무 리스트 페이지) 결재선과 담당자롤을 지정하여 상신하는 샘플 모델
     *
	 * @throws Exception
	 */
	@Test
	public void bpmGetAndStartAndComplete() throws Exception {

		// 1. 양식함/저장함이나 업무리스트 페이지에서 작성화면 진입시:
		// GetInstace 호출하여 프로세스 정보를 조회하여 상세 페이지 백그라운드에 저장
		System.out.println("=====================================================================================================================================================");
		System.out.println("1. 양식함/저장함이나 업무리스트 페이지에서 작성화면 진입시:  프로세스 정보를 조회하여 상세 페이지 백그라운드에 저장");
		BpmRequest bpmReq = new BpmRequest.Builder("C55").endpoint("mklee").build();
		BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
		assertTrue("1. Get is Success", getRes.isResult());
		
		// 2. 결재신청 버튼 클릭시: 
		// 2-1. PostInstace START 호출하여 인스턴스를 발행
		System.out.println("=====================================================================================================================================================");
		System.out.println("2-1. 결재신청 버튼 클릭시: PostInstace START 호출하여 인스턴스를 발행");
		bpmReq.setServiceType(BpmServiceType.START);
		bpmReq.setApiResult( getRes.getApiResult());		
		BpmResult postRes = this.bpmPostInstance.execute(bpmReq);
		assertTrue("2-1. START(결재신청) is Success", postRes.isResult());

		// 2-2. 발행된 인스턴스정보(NextWork[instanceId, taskId, trcTag])를 이용하여 프로세스 정보를 재조회 스냅샷 백그라운드에 저장
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("2-2. 발행된 인스턴스정보(NextWork[instanceId, taskId, trcTag])를 이용하여 프로세스 정보를 재조회 스냅샷 백그라운드에 저장");
		bpmReq.setNextWork(postRes.getNextWork());
		getRes = this.bpmGetInstance.execute(bpmReq);
		assertTrue("2-2. Re-Get is Success", getRes.isResult());
		
		// 3. 상신 버튼 클릭시:
		// 3-1. 앞서 백그라운드에 세팅한 프로세스 정보에 결재선 정보와 업무담당자 정보를 설정하여 상신
		System.out.println("=====================================================================================================================================================");
		System.out.println("3. 결재 스냅샷 화면에서 상신 버튼 클릭시: 앞서 백그라운드에 세팅한 프로세스 정보에 결재선 정보와 업무담당자 정보를 설정하여 상신");
		ApiGetResult apiResult = (ApiGetResult)getRes.getApiResult();

		
		AppLineInfo appLineInfo = apiResult.getAppLineInfo();		
		assertNotNull("AppLineInfo 객체가 Null 이 될 수 있는지 확인 필요.", appLineInfo);

		/** 결재 라인 추가 */
		List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
		List<RoleMapping> roleMappings = new ArrayList<>();
		
		List<UserVo> users = new ArrayList<>();
		UserVo user1 = new UserVo(); user1.setUid("kitak"); user1.setCn("김기탁");
		UserVo user2 = new UserVo(); user2.setUid("mklee"); user2.setCn("이민기");
		users.add(user1);
		users.add(user2);
		
		AtomicInteger atom = new AtomicInteger();
		users.forEach( user -> {
			roleMappings.add(new RoleMapping().withAssignType(atom.incrementAndGet()).withEndpoint(user.getUid()).withEndpointName(user.getCn()));
		});
		
		approvalLineInfos.add(new ApprovalLineInfo().withApprType("approval").withRole(new Role().withRoleMapping(roleMappings)));
		

		
		/** 아래 로직은 BPM 담당자 설정 로직이 처리되지 않아서 작성한 샘플 로직 */
		List<WorkInfo> workInfors = appLineInfo.getWorkInfos();
		if (CollectionUtils.isNotEmpty(workInfors)) {
			WorkInfo workInfo = workInfors.get(0);
			Role role = workInfo.getRole();
			assertNotNull("WorkInfos.get(0).Role 객체가 Null 이 될 수 있는지 확인 필요.", role);

			List<RoleMapping> roleMapping = role.getRoleMapping();
			if (null == roleMapping) {
				roleMapping = new ArrayList<>();
				// AssignType: 0:개인 | 2: 부서
				roleMapping.add(new RoleMapping().withAssignType(0).withEndpoint("yoonminl").withEndpointName("이윤민"));
				role.setRoleMapping(roleMapping);
			}
		}
		appLineInfo.setWorkInfos(workInfors);

				
		bpmReq.setApiResult(apiResult);		
		bpmReq.setServiceType(BpmServiceType.COMPLET);
		postRes = this.bpmPostInstance.execute(bpmReq);
		assertTrue("3. Re-Post(상신) is Success", postRes.isResult());
	}
	
	
	/**
     * 결재자가 결재대기함 리스트를 조회하여 첫번째 건을 선택하여 결재하는 샘플 모델
     *
	 * @throws Exception
	 */
	//@Test
	public void bpmGetWorksAndComplete() throws Exception {

		// 1. 결재대기함 메뉴 클릭시: 결재대기함 리스트를 페이징해서 가져온다.
		System.out.println("=====================================================================================================================================================");
		System.out.println("1. 결재자가 결재대기함 리스트를 조회");
		BpmRequest bpmReq = new BpmRequest.Builder("C55").endpoint("kitak").pageNum(1L).pageSize(10).build();
		BpmResult getRes = this.bpmGetWorks.execute(bpmReq);
		assertTrue("1. Get-Worklist is Success", getRes.isResult());

		// 2. 결재대기함 리스트에서 특정 인스턴스 클릭시: GetInstace 호출하여 프로세스 정보를 조회하여 결재(업무) 상세 페이지 백그라운드에 저장
		System.out.println("=====================================================================================================================================================");
		System.out.println("2. 결재대기함 리스트에서 첫번째 요소를 선택하여 결재(업무) 상세화면으로 진입한다.");
		List<ApiResult> apiResults = getRes.getApiResults();
		ApiWorkResult workResult = (ApiWorkResult)apiResults.stream().findFirst().orElseThrow(()->new Exception("WorkList 가 존재하지 않음"));
		bpmReq.setNextWork( new NextWork().withInstId(workResult.getInstId()).withTaskId(workResult.getTaskId()).withTrctag(workResult.getTrctag()));
			
		getRes = this.bpmGetInstance.execute(bpmReq);
		assertTrue("2. Get is Success", getRes.isResult());
		
		// 3. 결재 스냅샷 화면이나 업무화면에서 결재 버튼 클릭시: 앞서 상세 페이지의 백그라운드에 세팅한 프로세스 정보로 결재 처리.
		System.out.println("=====================================================================================================================================================");
		System.out.println("3. 결재 스냅샷 화면이나 업무화면에서 결재 버튼 클릭시: 앞서 백그라운드에 세팅한 프로세스 정보에 결재선 정보를 설정하여 결재");
		ApiGetResult getResult = (ApiGetResult)getRes.getApiResult();
				
		bpmReq.setApiResult(getResult);
		bpmReq.setServiceType(BpmServiceType.COMPLET);
		BpmResult postRes = this.bpmPostInstance.execute(bpmReq);
		assertTrue("3. Post(결재완료) is Success", postRes.isResult());
	}
	
	
	/**
     * 담당자가 결재대기함 리스트를 조회하여 첫번째 건을 선택하여 결재하는 샘플 모델
     *
	 * @throws Exception
	 */
	//@Test
	public void bpmGetWorksAndAuthComplete() throws Exception {

		// 1. 결재대기함 메뉴 클릭시: 결재대기함 리스트를 페이징해서 가져온다.
		System.out.println("=====================================================================================================================================================");
		System.out.println("1. 담당자가 결재대기함 리스트를 조회");
		BpmRequest bpmReq = new BpmRequest.Builder("C55").endpoint("yoonminl").pageNum(1L).pageSize(10).build();
		BpmResult getRes = this.bpmGetWorks.execute(bpmReq);
		assertTrue("1. Get-Worklist is Success", getRes.isResult());

		// 2. 결재대기함 리스트에서 특정 인스턴스 클릭시: GetInstace 호출하여 프로세스 정보를 조회하여 결재(업무) 상세 페이지 백그라운드에 저장
		System.out.println("=====================================================================================================================================================");
		System.out.println("2. 결재대기함 리스트에서 첫번째 요소를 선택하여 결재(업무) 상세화면으로 진입한다.");
		List<ApiResult> apiResults = getRes.getApiResults();
		ApiWorkResult workResult = (ApiWorkResult)apiResults.stream().findFirst().orElseThrow(()->new Exception("WorkList 가 존재하지 않음"));
		bpmReq.setNextWork( new NextWork().withInstId(workResult.getInstId()).withTaskId(workResult.getTaskId()).withTrctag(workResult.getTrctag()));
			
		getRes = this.bpmGetInstance.execute(bpmReq);
		assertTrue("2. Get is Success", getRes.isResult());
		
		// 3. 결재 스냅샷 화면이나 업무화면에서 결재 버튼 클릭시: 앞서 상세 페이지의 백그라운드에 세팅한 프로세스 정보로 결재 처리.
		System.out.println("=====================================================================================================================================================");
		System.out.println("3. 결재 스냅샷 화면이나 업무화면에서 결재 버튼 클릭시: 앞서 백그라운드에 세팅한 프로세스 정보에 결재선 정보를 설정하여 결재");
		ApiGetResult getResult = (ApiGetResult)getRes.getApiResult();
				
		bpmReq.setApiResult(getResult);		
		bpmReq.setServiceType(BpmServiceType.COMPLET);
		BpmResult postRes = this.bpmPostInstance.execute(bpmReq);
		assertTrue("3. Post(결재완료) is Success", postRes.isResult());
				
	}
	
	
	/**
	 * templatePattern : approval => 결재 | general => 결재가 아닌 일반 업무
	 * 전결 : "apprType" : "arvitery"
	 * 반려 : "apprType" : "approval"
     * 회수 : api 제공 => serviceType : 
	 * 전달 : api 제공 => serviceType : delegate , currentActivity -> role -> roleMapping
	 * 접수 : api 제공 => serviceType : accept , currentActivity -> role -> roleMapping
	 * @throws Exception
	 */
	//@Test
	public void bpmETC() throws Exception {

		// 1. 결재대기함 메뉴 클릭시: 결재대기함 리스트를 페이징해서 가져온다.
		System.out.println("=====================================================================================================================================================");
		System.out.println("1. 담당자가 결재대기함 리스트를 조회");
		BpmRequest bpmReq = new BpmRequest.Builder("C55").endpoint("yoonminl").pageNum(1L).pageSize(10).build();
		BpmResult getRes = this.bpmGetWorks.execute(bpmReq);
		assertTrue("1. Get-Worklist is Success", getRes.isResult());

		// 2. 결재대기함 리스트에서 특정 인스턴스 클릭시: GetInstace 호출하여 프로세스 정보를 조회하여 결재(업무) 상세 페이지 백그라운드에 저장
		System.out.println("=====================================================================================================================================================");
		System.out.println("2. 결재대기함 리스트에서 첫번째 요소를 선택하여 결재(업무) 상세화면으로 진입한다.");
		List<ApiResult> apiResults = getRes.getApiResults();
		ApiWorkResult workResult = (ApiWorkResult)apiResults.stream().findFirst().orElseThrow(()->new Exception("WorkList 가 존재하지 않음"));
		bpmReq.setNextWork( new NextWork().withInstId(workResult.getInstId()).withTaskId(workResult.getTaskId()).withTrctag(workResult.getTrctag()));
			
		getRes = this.bpmGetInstance.execute(bpmReq);
		assertTrue("2. Get is Success", getRes.isResult());
		
		// 3. 결재 스냅샷 화면이나 업무화면에서 결재 버튼 클릭시: 앞서 상세 페이지의 백그라운드에 세팅한 프로세스 정보로 결재 처리.
		System.out.println("=====================================================================================================================================================");
		System.out.println("3. 결재 스냅샷 화면이나 업무화면에서 결재 버튼 클릭시: 앞서 백그라운드에 세팅한 프로세스 정보에 결재선 정보를 설정하여 결재");
		ApiGetResult getResult = (ApiGetResult)getRes.getApiResult();
				
		bpmReq.setApiResult(getResult);		
		bpmReq.setServiceType(BpmServiceType.COMPLET);
		BpmResult postRes = this.bpmPostInstance.execute(bpmReq);
		assertTrue("3. Post(결재완료) is Success", postRes.isResult());
				
	}
	
}