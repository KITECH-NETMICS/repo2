package kr.re.kitech.biz.apr.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.underscore.lodash.U;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ElDataConvertUtil;

import kr.re.kitech.biz.api.client.BpmClient;
import kr.re.kitech.biz.api.client.enums.BpmServiceType;
import kr.re.kitech.biz.api.client.model.ApiGetLineResult;
import kr.re.kitech.biz.api.client.model.ApiGetResult;
import kr.re.kitech.biz.api.client.model.ApiPostResult;
import kr.re.kitech.biz.api.client.model.ApiWorkResult;
import kr.re.kitech.biz.api.client.model.AppLineInfo;
import kr.re.kitech.biz.api.client.model.ApprovalLineInfo;
import kr.re.kitech.biz.api.client.model.MasterAppLineInfo;
import kr.re.kitech.biz.api.client.model.ProcessRole;
import kr.re.kitech.biz.api.client.model.ProcessVariable;
import kr.re.kitech.biz.api.client.model.RoleMapping;
import kr.re.kitech.biz.api.client.model.Worklineinfo;
import kr.re.kitech.biz.api.client.vo.ApiResult;
import kr.re.kitech.biz.api.client.vo.BpmRequest;
import kr.re.kitech.biz.api.client.vo.BpmResult;
import kr.re.kitech.biz.apr.dao.ApprCommonDAO;
import kr.re.kitech.biz.apr.enums.AprMapper;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.vo.AppFormVo;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.apr.vo.PostAprVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.BpmException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.dao.ApprvConfigDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.AprUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.ApprvConfigVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

/**
 * 전자결재 공통 서비스 구현체
 * @author James
 * @since 2022. 6. 21.
 */
 @Service("apprCommonServiceImpl")
public class ApprCommonServiceImpl implements ApprCommonService {
    
    @Value("${apr.snapshot.base}")
    private String snapshotBase;

    @Value("${apr.xsl.base}")
    private String xslBase;

    @Resource(name="apprCommonDAO")
    private ApprCommonDAO apprCommonDAO;
    
    @Resource(name="apprvConfigDAO")
	private ApprvConfigDAO apprvConfigDAO;

	@Resource(name="accntServiceImpl")
	private AccntService accntService;
        
    @Resource(name="bpmGetInst")
	private BpmClient bpmGetInst;
	
	@Resource(name="bpmGetInsts")
	private BpmClient bpmGetInsts;	
    
    @Resource(name="bpmGetAsisInst")
	private BpmClient bpmGetAsisInst;
	
    @Resource(name="bpmGetRunWorks")
	private BpmClient bpmGetRunWorks;
	
    @Resource(name="bpmGetWorks")
	private BpmClient bpmGetWorks;
		
    @Resource(name="bpmPostInst")
	private BpmClient bpmPostInst;
		
	@Resource(name="bpmRemoveInst")
	private BpmClient bpmRemoveInst;	

	/**
	 * 스냅샷 경로를 RDB 에서 조회한다.
	 *
	 * @param reqNo
	 * @return String
	 * @throws Exception
	 */
    public String getSnapshotLinkurl(String reqNo) throws Exception {
    	return this.apprCommonDAO.getSnapshotLinkurl(reqNo);
    }
    
	/**
	 * 스토리지에 저장된 스냅샷을 읽어서 반환한다.
	 *
	 * @param AprScVo
	 * @return String
	 * @throws Exception
	 */
    public String getSnapshot(AprScVo sc) throws Exception {
    	// 저장 경로 조회
    	String linkurl = this.apprCommonDAO.getSnapshotLinkurl(sc.getReqNo());

		// 스냅샷 문자열 읽음
		return AprUtil.readSnapshot( snapshotBase + linkurl);
    }
    
    @Override
    public String makeSnapshot(String reqNo, Object data) throws Exception {
    	AprScVo aprScVo = new AprScVo();
    	aprScVo.setReqNo(reqNo);
    	aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(reqNo.substring(0,3)));
    	return makeSnapshot(aprScVo, data);
    }

	/**
	 * 스냅샷을 생성 후 스냅샷을 문자열로 반환한다.
	 * 
	 * @param sc 전자결재 공통 검색 객체
	 * @param data 데이터 오브젝트
	 * @return String
	 * @throws Exception
	 */
	 @Override
     public String makeSnapshot(AprScVo aprScVo, Object data) throws Exception {
    
    	// 1. 저장할 xml 경로 생성: _신청번호.snap: ex) 2022/6/_C55202200123.snap
    	String fileBase =  String.format("%s_%s.snap", com.inswave.elfw.util.DateUtil.getNow("yyyy/M/"), aprScVo.getReqNo());
		String saveXmlUrl = snapshotBase + fileBase;
		
		// 스냅샷 생성시 DB(appv_snapshot_final)에 insert 추후 스냅샷 상세파일 저장 위치 
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("reqno", aprScVo.getReqNo());
		hashmap.put("linkurl", fileBase);
		mergeSnapShotFileUrl(hashmap);
    	
    	// 서비스ID, xslUrl, xslUrlReady(베타xslUrl)을 가져온다.
    	Map<String,String> xslMap = this.apprCommonDAO.searchXslUrl(aprScVo.getProcDefAlias().substring(0, 3));
    	String servcieId = xslMap.get("serviceId");
    	String xslUrl = xslMap.get("xslUrl");
    	String xslUrlReady = xslMap.get("xslUrlReady");

    	// 사용자 세션의 [베타테스트 serviceIds] 와 요청한 서비스를 조회한다.
    	ServiceVo service = accntService.findServiceByServiceId(servcieId);
    	String betaServiceIds = KitechContextUtil.getBetaService();
    	AppLog.info( "====================] makeSnapshot [======================");
    	AppLog.info( "betaServiceYN(서비스)", service.getBetaServiceYN());
    	AppLog.info( "betaServiceID(사용자)", betaServiceIds);
    	AppLog.info( "====================] makeSnapshot [======================");

    	// 사용자 세션의 베타 테스트 서비스IDS 에 'all' 문자열이 포함되어있거나 현재 요청한 serviceID 가 포함되어 있다면..
    	boolean isNewXsl = false;
    	if (betaServiceIds.contains("all") || betaServiceIds.contains(service.getServiceID())) {
    		if (StringUtils.equals(service.getBetaServiceYN(), "Y")){
    			xslUrl = xslUrlReady; // _new.xsl
    			isNewXsl = true;
    		}
    	}

    	// 이중 운영을 위해  newXsl을 가져오지 못하는  경우(레거시) && 업무단에서 mergeXsl = true 로 보내지 않는 경우만 아래 로직 처리
    	if (false == isNewXsl && false == aprScVo.isMergeXsl()) {
    		// 구매발주 물품/공사/용역 분리
	    	if (StringUtils.equals("P81", aprScVo.getProcDefAlias().substring(0, 3))) {	
	    		// /ui/apr/xsl/epu/EpuOrdPlanGoodsRgt.xsl	// 물품은 appv_applicationmap 테이블에서 이미 가져옴
	    		if (StringUtils.equals("EGF020", aprScVo.getOrderType())) {
	    			xslUrl = "/ui/apr/xsl/epu/EpuOrdPlanServiceRgt.xsl";	// 용역 
	    		} else if (StringUtils.equals("EGF030", aprScVo.getOrderType())) {
	    			xslUrl = "/ui/apr/xsl/epu/EpuOrdPlanConstRgt.xsl";		// 공사 
	    		}
	    	}
	    	
    		// 구매계약 물품/공사/용역 분리
	    	if (StringUtils.equals("P32", aprScVo.getProcDefAlias().substring(0, 3))) {
	    		// /ui/apr/xsl/epu/EpuConConclsMnt.xsl	// 물품은 appv_applicationmap 테이블에서 이미 가져옴
	    		if (StringUtils.equals("EGF020", aprScVo.getOrderType())) {
	    			xslUrl = "/ui/apr/xsl/epu/EpuConConclsServiceMnt.xsl";	// 용역
	    		} else if (StringUtils.equals("EGF030", aprScVo.getOrderType())) {
	    			xslUrl = "/ui/apr/xsl/epu/EpuConConclsConstMnt.xsl";	// 공사
	    		}
	    	}
    	}

    	// 2. 읽을 xsl 경로 조회 (양식함 조회)
    	String readXslUrl = xslBase + xslUrl;
    	
		// 3. Data 오브젝트를 맵으로 변환 후 xml 문자열로 변환
		Map<?, ?> map = (null != data && data instanceof Map) ? (Map<?,?>)data : ElDataConvertUtil.convertValue(data, Map.class);		
		String xml = U.toXml(map);
		AppLog.info("=================================================================================================");
		AppLog.info("xml: " + xml);
		AppLog.info("=================================================================================================");
			
    	// 4. 생성
    	return AprUtil.makeSnapshot(saveXmlUrl, readXslUrl, xml);
    }
    
    /**
	 * BPM에서 감자사 찾기
     * @param roles
     * @param aprVo
     * @return
     * @throws KitechException, BpmException
     */
    private String processRoleMapperAudit(List<ProcessRole> roles) throws KitechException, BpmException {
		String sysPaynos = "";
    	for (ProcessRole role : roles) {
    		// processRoles 돌면서 auditRole(감사) 찾음
    		if (StringUtils.equalsIgnoreCase(role.getName(), "auditRole")) {
    			List<RoleMapping> orgRoleMappings = role.getRoleMapping();
    			if (null != orgRoleMappings && 0 < orgRoleMappings.size()) {
    				for (RoleMapping mapping : orgRoleMappings) {
    					if(StringUtils.isEmpty(sysPaynos)) {
    						sysPaynos =  mapping.getEndpoint();
    					} else {
    						sysPaynos += ";" + mapping.getEndpoint();
    					}
    					
    				}
    			}
    		}
    	}
    	return sysPaynos;
    }
    
    /**
	 * 스냅샷 초기정보(작성중, 반려, 회수) Simple페이지에서 REQ 값으로만 BPM에서 조회후 반환
	 *
	 * @param AprScVo
	 * @return AppFormVo
	 */
	 @Override 
	 public AppFormVo getSnapshotBaseInfo(AprScVo aprScVo) {
		AppFormVo appFormVo = new AppFormVo();
		try {
			// 인터페이스 테이블의 상태값으로 파라미터 구성
			IntfatabVo intfatab = this.getXomxintfatab(aprScVo.getReqNo());
			String schEndpoint = aprScVo.getEndpoint();
			if (StringUtils.equals(schEndpoint, "system") 
					&& (intfatab.getEndpoints() != null && !intfatab.getEndpoints().trim().equals(""))) {
				AppLog.info("=======================================Input System=================================");
				schEndpoint = intfatab.getEndpoints().split(";")[0];
				aprScVo.setEndpoint(schEndpoint);
			}
			try {
				String status = (AprState.isComplate( intfatab.getAprState())) ? AprMapper.FORM_COMPLETE.getCode() : AprMapper.FORM_RUNNING.getCode();

				// AS-IS 여부를 가져오기 위한 처리 필요.
				BpmResult bpmResult = this.bpmGetRunWorks.execute(new BpmRequest.Builder("")
					.pageNum(1L).pageSize(1)				// 필수: 페이지넘버, 페이지사이즈
					.instName(aprScVo.getReqNo())			// 필수: 신청번호 
					.endpoint(intfatab.getEndpoints())		// 필수: 현재 담당자
					.status(status)							// 필수: 상태 - (Complete | Running)
					.proc("")
				.build());

				ApiWorkResult apiResult = (ApiWorkResult)bpmResult.getApiResults().stream().findFirst().orElseThrow(()->new Exception("ASIS 인스턴스 확인을 위한 List 가 존재하지 않음"));
				aprScVo.setAsistype( apiResult.getAsistype());
				aprScVo.setTaskName( apiResult.getTaskName());
				if (StringUtils.isEmpty( aprScVo.getInstId())) aprScVo.setInstId( String.valueOf( apiResult.getInstId()));
				if (StringUtils.isEmpty( aprScVo.getTaskId())) aprScVo.setTaskId( String.valueOf( apiResult.getTaskId()));
				if (StringUtils.isEmpty( aprScVo.getTrctag())) aprScVo.setTrctag( apiResult.getTrctag());
				
			} catch (Exception ex) {
				AppLog.error("* ASIS 데이터 확인 로직 에러 - 스킵: endpoint: " + aprScVo.getEndpoint() + ", reqNo: " + aprScVo.getReqNo() + ", status: " + aprScVo.getStatus());
			}

			if (StringUtils.equals("1", aprScVo.getAsistype())) { 
				// 마이그레이션 데이터: GET /rest/bpm/process-instances/asis/complete/get : reqNo 값 입력후 호출 ->InstId, TaskId, Trctag 값 조회
				BpmResult getRes = this.bpmGetAsisInst.execute(new BpmRequest.Builder(aprScVo.getProcDefAlias())
	    				.instName(aprScVo.getReqNo())
	    				.proc("")
					.build());
				List<ApiResult> apiResults = getRes.getApiResults();
				
				List<AprUserVo> aprUsers = new ArrayList<>();
				for (ApiResult apiResult : apiResults) {
					ApiGetLineResult apiLineResult = (ApiGetLineResult) apiResult;
					
					AprUserVo aprUserVo = new AprUserVo();
					aprUserVo.setApld_apltype(apiLineResult.getApprvlClsf());
					aprUserVo.setJikname(apiLineResult.getRollNm());
					aprUserVo.setEmpcode("");
					aprUserVo.setEmpsn(apiLineResult.getRegstSyspayno());
					aprUserVo.setEmpname(apiLineResult.getEmpName());
					aprUserVo.setEndTime(apiLineResult.getCompltDaytm());
					aprUserVo.setAutoApproval("");
					aprUsers.add(aprUserVo);
				}
				appFormVo.setAprUserVo(aprUsers);
			} else {
	    		
				// BPM 코어 파라미터 객체 생성
				aprScVo.setProcDefAlias( StringUtils.equals("F61", aprScVo.getInstAlias()) ? "F61" : apprCommonDAO.selectGetMainKey(aprScVo.getReqNo().substring(0, 3)));
				
	    		// 화면에서 InstId, TaskId, Trctag 가져 왔으면 해당 값으로 조회 한다.
	    		if (StringUtils.isEmpty(aprScVo.getInstId()) || StringUtils.isEmpty(aprScVo.getTaskId()) || StringUtils.isEmpty(aprScVo.getTrctag())) {
	    			BpmResult getResInit = this.bpmGetWorks.execute(new BpmRequest.Builder(aprScVo.getProcDefAlias())
	    				.endpoint(aprScVo.getEndpoint())
	    				.instName(aprScVo.getReqNo())
	    				.instStatus(aprScVo.getInstStatus())
	    				.taskStatus(aprScVo.getTaskStatus()) // 초기 상태는 DRAFT
	    				.proc("")
	    				.pageNum(aprScVo.getPageIndex()).pageSize(1)
					.build());
					
		    		ApiWorkResult aprWork = (ApiWorkResult) getResInit.getApiResults().stream().findFirst()
						.orElseThrow(() -> new BpmException(Exceptions.ERROR, Business.APR, "시스템 오류: WorkList 항목이 존재하지 않음!!"));
	
		    		// 키값 설정
		    		aprScVo.setInstId(String.valueOf(aprWork.getInstId()));
		    		aprScVo.setTaskId(String.valueOf(aprWork.getTaskId()));
		    		aprScVo.setTrctag(aprWork.getTrctag());					    			
	    		}

	    		// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId, taskId, trcTag 값 입력후 호출
				BpmResult getRes = this.bpmGetInst.execute(new BpmRequest.Builder(aprScVo.getProcDefAlias())
					.endpoint(aprScVo.getEndpoint())
					.instanceId(aprScVo.getInstId())
					.taskId(aprScVo.getTaskId())
					.trcTag(aprScVo.getTrctag())
				.build());
				
				ApiGetResult apiResult = (ApiGetResult)getRes.getApiResult();
				
				// 양식함명 GET 데이터 이용
				appFormVo.setAppname(apiResult.getDefName());
				appFormVo.setWithDrawYn("Y");
				
				// 문서양식, 인스턴스, 타스크, 전결타입, 전결금액 넣기
	    		appFormVo.setProcDefAlias(apiResult.getAlias());
	    		appFormVo.setRuleType(apiResult.getInstExt4());
	    		appFormVo.setRuleMoney(apiResult.getInstExt5());
	    		
	    		// 프로세스 Role
	    		if (apiResult.getProcessRoles() != null) {
	    			// 감사자 찾기
	    			appFormVo.setAuditRolesSn(this.processRoleMapperAudit(apiResult.getProcessRoles()));
	    		}
				
				List<AprUserVo> aprUsers = new ArrayList<>();
				// 수신일경우 마스터
				if (null != apiResult.getMasterAppLineInfo()) {
					// apiResult의 유저 가져오기
					MasterAppLineInfo masterAppLineInfo = apiResult.getMasterAppLineInfo();
		
					// 결재선 편집여부 확인
					appFormVo.setApprEditable(null != masterAppLineInfo.getApprEditable() && masterAppLineInfo.getApprEditable() ? true : false);
		
					/** 결재 라인 추가 */
					List<ApprovalLineInfo> approvalLineInfos = masterAppLineInfo.getApprovalLineInfos();
					List<Worklineinfo> worklineinfos = masterAppLineInfo.getWorklineinfos();
					
					
					for (ApprovalLineInfo approvalLineInfo : approvalLineInfos) {
						String apprType = approvalLineInfo.getName(); // 결재타입
						String jikname = approvalLineInfo.getRole().getDisplayName(); // 직무
						
						List<RoleMapping> roles = approvalLineInfo.getRole().getRoleMapping();
						
						if (null != roles && 0 < roles.size()) {
							String endpointName = roles.get(0).getEndpointName(); // 결재자이름
							String endpoint = roles.get(0).getEndpoint(); // 결재자ID
							String autoApproval = roles.get(0).getAutoApproval(); // 자동결재유무
							String endTime = approvalLineInfo.getEndTime(); // 결재시간
						
							AprUserVo aprUserVo = new AprUserVo();
							aprUserVo.setApld_apltype(apprType);
							aprUserVo.setJikname(jikname);
							aprUserVo.setEmpcode(endpoint);
							aprUserVo.setEmpsn(accntService.findSyspaynoByUid(endpoint).getSn());
							aprUserVo.setEmpname(endpointName);
							aprUserVo.setEndTime(endTime);
							aprUserVo.setAutoApproval(autoApproval);
							// 결재라인 넣기
							aprUsers.add(aprUserVo);
						}
						
					}
					// worklineinfos 업무단이 없을경우 예외
					if (null != worklineinfos) {
						for (Worklineinfo Worklineinfo : worklineinfos) {
							String apprType = "업무"; // 결재타입(업무결재자들은 따로 관리)
							String jikname = Worklineinfo.getRole().getDisplayName(); // 직무
							
							List<RoleMapping> roles = Worklineinfo.getRole().getRoleMapping();
							if (null != roles && 0 < roles.size()) {
								for (RoleMapping role : roles) {
									String endpointName = role.getEndpointName(); // 결재자이름
									String endpoint = role.getEndpoint(); // 결재자ID
									String autoApproval = role.getAutoApproval(); // 자동결재유무
									String endTime = Worklineinfo.getEndTime(); // 결재시간
									
									AprUserVo aprUserVo = new AprUserVo();
									aprUserVo.setApld_apltype(apprType);
									aprUserVo.setJikname(jikname);
									aprUserVo.setEmpcode(endpoint);
									aprUserVo.setEmpsn(accntService.findSyspaynoByUid(endpoint).getSn());
									aprUserVo.setEmpname(endpointName);
									aprUserVo.setEndTime(endTime);
									aprUserVo.setAutoApproval(autoApproval);
									// 업무라인 넣기
									aprUsers.add(aprUserVo);
									
									if (null != Worklineinfo.getRole().getForeach() && !Worklineinfo.getRole().getForeach()) {
										break;
									}
								}
							}
						}
					}
				}
				
				// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
				if (null != apiResult.getAppLineInfo()) {
					// apiResult의 유저 가져오기
					AppLineInfo appLineInfo = apiResult.getAppLineInfo();
		
					// 결재선 편집여부 확인
					appFormVo.setApprEditable(null != appLineInfo.getApprEditable() && appLineInfo.getApprEditable() ? true : false);
					
					// 현단계가 수신단계일경우 체크
					appFormVo.setLinetype(appLineInfo.getLinetype());
		
					/** 결재 라인 추가 */
					List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
					List<Worklineinfo> worklineinfos = appLineInfo.getWorklineinfos();
					
					
					for (ApprovalLineInfo approvalLineInfo : approvalLineInfos) {
						String apprType = approvalLineInfo.getName(); // 결재타입
						
						// 해당 값이 존재 할 경우 수신결재임
						if (null != apiResult.getMasterAppLineInfo()) {
							apprType = "수신";
						}
						
						String jikname = approvalLineInfo.getRole().getDisplayName(); // 직무
						String approvalName = approvalLineInfo.getRole().getName();
						List<RoleMapping> roles = approvalLineInfo.getRole().getRoleMapping();
						
						if (null != roles && 0 < roles.size()) {
							String endpointName = roles.get(0).getEndpointName(); // 결재자이름
							String endpoint = roles.get(0).getEndpoint(); // 결재자ID
							String autoApproval = roles.get(0).getAutoApproval(); // 자동결재유무
							String endTime = approvalLineInfo.getEndTime(); // 결재시간
							
							if (!StringUtils.equals("Initiator", approvalName) && StringUtils.isNotEmpty(endTime)) { // 기안자가 아니면서 결재가 이뤄진게 있으면 회수 불가
								appFormVo.setWithDrawYn("N");
							}
						
							AprUserVo aprUserVo = new AprUserVo();
							aprUserVo.setApld_apltype(apprType);
							aprUserVo.setJikname(jikname);
							aprUserVo.setEmpcode(endpoint);
							aprUserVo.setEmpsn(accntService.findSyspaynoByUid(endpoint).getSn());
							aprUserVo.setEmpname(endpointName);
							aprUserVo.setEndTime(endTime);
							aprUserVo.setAutoApproval(autoApproval);
							// 결재라인 넣기
							aprUsers.add(aprUserVo);
							if (StringUtils.equals("recieve", appLineInfo.getLinetype()) && StringUtils.equals("기안", jikname) && StringUtils.isEmpty(endTime)) {
								break;
							}
						}
					}
					// worklineinfos 업무단이 없을경우 예외
					if (null != worklineinfos) {
						for (Worklineinfo Worklineinfo : worklineinfos) {
							String apprType = "업무"; // 결재타입(업무결재자들은 따로 관리)
							String jikname = Worklineinfo.getRole().getDisplayName(); // 직무
							
							List<RoleMapping> roles = Worklineinfo.getRole().getRoleMapping();
							if (null != roles && 0 < roles.size()) {
								for (RoleMapping role : roles) {
									String endpointName = role.getEndpointName(); // 결재자이름
									String endpoint = role.getEndpoint(); // 결재자ID
									String autoApproval = role.getAutoApproval(); // 자동결재유무
									String endTime = Worklineinfo.getEndTime(); // 결재시간
									
									if (!StringUtils.equals("Y", autoApproval) && StringUtils.isNotEmpty(endTime)) { // 기안자가 아니면서 결재가 이뤄진게 있으면 회수 불가(자동결재건은 회수조건에서 제외)
										appFormVo.setWithDrawYn("N");
									}
									
									AprUserVo aprUserVo = new AprUserVo();
									aprUserVo.setApld_apltype(apprType);
									aprUserVo.setJikname(jikname);
									aprUserVo.setEmpcode(endpoint);
									aprUserVo.setEmpsn(accntService.findSyspaynoByUid(endpoint).getSn());
									aprUserVo.setEmpname(endpointName);
									aprUserVo.setEndTime(endTime);
									aprUserVo.setAutoApproval(autoApproval);
									// 업무라인 넣기
									aprUsers.add(aprUserVo);
									
									if (null != Worklineinfo.getRole().getForeach() && !Worklineinfo.getRole().getForeach()) {
										break;
									}
								}
								
							}
						}
					}
				}
				appFormVo.setAprUserVo(aprUsers);
				
				// 소액 화학물질로 인하여 가져오기
				if (StringUtils.equals("F27M", appFormVo.getProcDefAlias())) { // 소액물품일경우
					if (null != apiResult.getCurrentActivity() && StringUtils.equals("검수자 처리", apiResult.getCurrentActivity().getName())) {	// 현대 담당자가 검수일경우
						appFormVo.setTaskname(apiResult.getCurrentActivity().getName());
						if (StringUtils.equals("[Y]", this.processRoleSafeYn(apiResult.getProcessVariables()))) {	// 사전안전성검토유무 확인 필요
							appFormVo.setSafeYn("Y");
						}
					}
				}
				
				if (StringUtils.equals(aprScVo.getEndpoint(), "system")) {
					appFormVo.setApprvConfigYn("N");
				} else {
					ApprvConfigVo retVo = new ApprvConfigVo();
					retVo.setSyspayno(accntService.findSyspaynoByUid(aprScVo.getEndpoint()).getSn());
					retVo = apprvConfigDAO.selectApprvConfig(retVo);
					appFormVo.setApprvConfigYn(null != retVo ? retVo.getAuto_rule_yn() : "N");
				}
				
				// BPM 코어 파라미터 객체 생성
	    		appFormVo.setRegulationUrl(this.apprCommonDAO.selectRegulationUrl(aprScVo.getProcDefAlias().substring(0, 3)));
			}
		}catch (Exception ex) {
			AppLog.error("MenuService-Exception", ex);
			throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0002", ex);  // 기타 에러 메시지....
		}
		
	    return appFormVo;
    }
    
    /**
	 * 사전안전성검토유무 확인(소액물품일경우 확인)
     * @param List<ProcessVariable>
     * @return String
     * @throws KitechException, BpmException
     */
    private String processRoleSafeYn(List<ProcessVariable> variables) throws KitechException, BpmException {
    	String safeYn = "";
    	for (ProcessVariable variable : variables){
			if (null!= variable.getName() && StringUtils.equalsIgnoreCase(variable.getName(), "SafeYn")) {
				String value = String.valueOf(variable.getValues()); 
				if (!StringUtils.isEmpty(value)) {
					safeYn = value;							
				}
			}
		}
    	return safeYn;
    }
    
	/**
	 * 인터페이스 테이블 단건 조회
	 *
	 * @param reqNo
	 * @return IntfatabVo
	 */
	 @Override 
	public IntfatabVo getXomxintfatab(String reqNo) {
	    return apprCommonDAO.getXomxintfatab(reqNo);
    }    

	/**
	 * 인터페이스 테이블 삽업
	 *
	 * @param vo
	 * @return int
	 */
	 @Override 
	public int putXomxintfatab(IntfatabVo vo) {
	     return this.apprCommonDAO.putXomxintfatab(vo);
    }    

	/**
	 * 인터페이스 테이블 수정
	 *
	 * @param vo
	 * @return int
	 */
	 @Override 
	public int modXomxintfatab(IntfatabVo vo) {
	    return this.apprCommonDAO.modXomxintfatab(vo);
    }     

	/**
	 * 인터페이스 테이블 삭제
	 *
	 * @param reqNo
	 * @return int
	 */
	 @Override 
	public int delXomxintfatab(String reqNo) {
	    return this.apprCommonDAO.delXomxintfatab(reqNo);
    }



	/**
     * Xomxintfatab 저장(String reqNo)
     * @param reqNo
     * @return 
     * @author 박병목
     * @since 2022.07.15.
     */
	 @Override 
	public void createAprInterface(String reqNo){
		this.createAprInterface(reqNo, null, null);
	}
	
	/**
     * Xomxintfatab 저장
     * @param String reqNo, String serviceId, String userid
     * @return 
     * @author 박병목
     * @since 2022.07.15.
     */
	 @Override 
	public void createAprInterface(String reqNo, String serviceId, String userid){
		this.createAprInterface(reqNo, serviceId, userid, null);
	}
	
	/**
     * Xomxintfatab 저장
     * @param String reqNo, String serviceId, String userid, String infoCd
     * @return 
     * @author 박병목
     * @since 2022.07.15.
     */
	 @Override 
	public void createAprInterface(String reqNo, String serviceId, String userid, String infoCd){
		IntfatabVo vo = new IntfatabVo();
		try {
			vo.setReqNo(reqNo);
			vo.setAprState(AprState.WAIT_SAVE.getCode());
			vo.setUiId((!StringUtils.isEmpty(serviceId)) ? serviceId : KitechContextUtil.getServiceId());
			vo.setEndpoints((!StringUtils.isEmpty(userid)) ? userid : KitechContextUtil.getUserId());
			vo.setInfoCd((!StringUtils.isEmpty(infoCd)) ? infoCd : "");

			this.apprCommonDAO.putXomxintfatab(vo);
		} catch (Exception ex) {
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.error.apr.com.0006", ex);  // 기타 에러 메시지....
		}
	}

	/**
     * Xomxintfatab 수정
     * @param String reqNo, String serviceId, String userid
     * @return 
     * @author 박병목
     * @since 2022.07.15.
     */
	 @Override 
	public void modifyAprInterface(String reqNo, String aprState, String userid) {
		this.modifyAprInterfaceAddInfo(reqNo, aprState, userid, null);
	}
	
	/**
     * Xomxintfatab 수정
     * @param String reqNo, String serviceId, String userid
     * @return 
     * @author 박병목
     * @since 2022.07.15.
     */
	 @Override 
	public void modifyAprInterfaceAddInfo(String reqNo, String aprState, String userid, String infoCd) {
		IntfatabVo vo = new IntfatabVo();
		try {
			if (null == infoCd) {
				infoCd = "";
			}
			vo.setReqNo(reqNo);
			vo.setAprState(aprState);
			vo.setEndpoints(userid);
			vo.setInfoCd(infoCd);
			this.apprCommonDAO.modXomxintfatab(vo);
		} catch (Exception ex) {
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.error.apr.com.0007", ex);  // 기타 에러 메시지....
		}
	}

	@Override
	public int deleteApr(String reqNo) throws KitechException, BpmException {
		return this.deleteApr(reqNo, false, true);
	}

   /**
    * 신청화면 삭제시
    * @param IntfatabVo
    * @return int
    * @author parkbm
    * @since 2022.07.13.
    */
	 @Override 
	public int deleteApr(String reqNo, boolean isEln, boolean isBpm) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		int resultCnt = 0;
		
		try {
			// BPM 삭제만 할 수 있게 구분 처리
			if (isBpm) {
				IntfatabVo intfatabVo = new IntfatabVo();
				// 신청번호로 인터테이스 테이블 조회
				intfatabVo = this.apprCommonDAO.getXomxintfatab(reqNo);
				
				if (StringUtils.isEmpty(intfatabVo.getReqNo())) {
					throw new KitechException(Exceptions.ERROR, Business.APR, "message.alert.apr.com.0004", new String[]{reqNo});
				}
				
				if (!isEln && AprState.isIng(intfatabVo.getAprState())) {
					throw new KitechException(Exceptions.ERROR, Business.APR, "message.alert.apr.com.0002", new String[]{intfatabVo.getReqNo()});
				}
				
				// 인터페이스 테이블 삭제
				resultCnt = this.apprCommonDAO.delXomxintfatab(intfatabVo.getReqNo());
				// 현재는 xomxintfatab에 삭제 되지 않았으면 오류로 간주
				if (1 > resultCnt) {
					throw new KitechException(Exceptions.ERROR, Business.APR, "message.alert.apr.com.0001", new String[]{reqNo});
				}
			}
			
			// ReqNo로 인스턴스 ID 조회
    		BpmRequest bpmReqInit = new BpmRequest.Builder(null).instName(reqNo).build();
    		BpmResult getResInit = this.bpmGetInsts.execute(bpmReqInit);
    		List<ApiResult> apiResults = getResInit.getApiResults();
    		
    		if (apiResults.size() == 1) {
    			ApiWorkResult workResult = (ApiWorkResult)apiResults.get(0);
    			// 삭제시에 인스턴스ID가 필요
    			String instId = workResult.getInstId().toString();
    			
    			// DELETE /rest/bpm/process-instances/remove/{instanceid} : instanceId값 입력후 호출
    			bpmReq = new BpmRequest.Builder(null).instName(instId).build();
				postRes = this.bpmRemoveInst.execute(bpmReq);
    		} else if (1 < apiResults.size()) {
    			// 2건 이상일 경우에는 오류 예외처리 한다. 
    			throw new KitechException(Exceptions.ERROR, Business.APR, "message.alert.apr.com.0003", new String[]{reqNo});
    		}
		} catch (BpmException | KitechException ex) {
			throw ex;
		} catch (Exception ex) {
			// BPM 체크 후 오류일경우 보상으로 호출 한다.
			if (null != postRes) {
				ApiPostResult result = (ApiPostResult)postRes.getApiResult();
				bpmReq.setServiceType(BpmServiceType.CANCEL_CHANGE);
				bpmReq.setApiResult(result);		
				this.bpmPostInst.execute(bpmReq);
			}

			AppLog.error("ApprFuncServiceImpl-Exception", ex);
			throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0008", ex);  // 기타 에러 메시지....
		}
		return resultCnt;
	}


	/**
    * 사후결재 여부 조회
    * @param PostAprVo
    * @return PostAprVo
    * @author LeeYH
    * @since 2022.07.04.
    */

	public PostAprVo confirmPostApr(PostAprVo vo) throws ElException{
		PostAprVo retVo = apprCommonDAO.selectXomxAprMgr(vo);		
		String actionYmd = vo.getAction_ymd();
		if(actionYmd == null){
			throw new KitechException(Exceptions.ALERT, Business.APR, "message.xom.co.apr.0001");
		}
			
		if(retVo != null){
			// 액션 시작일자와 신청일자(현재일자) 채취한다.
			String reqYmd = DateUtil.getCurrentDate();
			int diffDays = DateUtil.getDaysBetween(actionYmd, reqYmd);
			if(retVo.getAllow_days() < diffDays){
				retVo.setIs_apr_after(true);
				
				retVo.setReq_ymd(reqYmd);
				retVo.setAction_ymd(actionYmd);
				retVo.setReq_no(vo.getReq_no());
				retVo.setSyspayno(vo.getSyspayno());	
			}else{
				retVo.setIs_apr_after(false);
			}	
		}else{
			retVo = new PostAprVo();
			retVo.setIs_apr_after(false);
		}
		
		return retVo;
	}
	
	/**
    * 사후결재 사유 조회
    * @param String
    * @return PostAprVo
    * @author LeeYH
    * @since 2022.07.04.
    */
	public PostAprVo selectAprAfterReason(String reqNo) throws ElException {
		return apprCommonDAO.selectAprAfterReason(reqNo);
	}
	
	/**
    * 사후결재 사유 저장
    * @param PostAprVo
    * @author LeeYH
    * @since 2022.07.04.
    */
	public void saveAprAfterReason(PostAprVo vo) throws ElException {
		if(apprCommonDAO.mergeAprAfterReason(vo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"사후결재 사유 저장"});
		}
	}
	
	/**
	 * 결재읜견 저장
	 *
	 * @param DocCommentsVo
	 * @return int
	 */
	public int insertDocComments(DocCommentsVo vo) throws ElException {
	    return this.apprCommonDAO.insertDocComments(vo);
    }


	/**
	 * 결재읜견 저장(Str)
	 *
	 * @param
	 * @return int
	 */
	public void insertDocCommentsStr(String instance_id, String req_no, String contents, String opt_type, String empno,
			String empname, String emptitle, String created_by, String updated_by) throws ElException {
			DocCommentsVo docCommentsVo = new DocCommentsVo();
			docCommentsVo.setInstance_id(instance_id); // 인스턴스 번호
			docCommentsVo.setReq_no(req_no); // 신청번호
			docCommentsVo.setEmpno(empno); // uid
			docCommentsVo.setCreated_by(created_by); // 등록자
			docCommentsVo.setUpdated_by(updated_by); // 수정자
			docCommentsVo.setEmpname(empname); // 성명
			docCommentsVo.setContents(contents); // 내용
			docCommentsVo.setOpt_type(opt_type); // 타입
			docCommentsVo.setEmptitle(emptitle); // 직무명
			insertDocComments(docCommentsVo);
	}
	
	/**
	 * 결재의견 조회
	 *
	 * @param String
	 * @return DocCommentsVo
	 */
	public List<DocCommentsVo> selectDocComments(DocCommentsVo vo) throws ElException {
		return this.apprCommonDAO.selectDocComments(vo);
	}
	
	/**
     * 생성되는 스냅샷 파일 위치를 머지 한다
     * @param String
     * @throws Exception
     */
	public void mergeSnapShotFileUrl(HashMap<String, String> map) {
		this.apprCommonDAO.mergeSnapShotFileUrl(map);
	}
	
	/**
	 * 결재의견 삭제(회수시)
	 *
	 * @param String
	 * @return req_no
	 */
	public int deleteDocComments(String req_no) throws ElException {
	    return this.apprCommonDAO.deleteDocComments(req_no);
    }
}
