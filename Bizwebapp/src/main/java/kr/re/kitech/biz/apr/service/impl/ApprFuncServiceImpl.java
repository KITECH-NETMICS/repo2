package kr.re.kitech.biz.apr.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.BpmClient;
import kr.re.kitech.biz.api.client.enums.BpmServiceType;
import kr.re.kitech.biz.api.client.model.ApiCountResult;
import kr.re.kitech.biz.api.client.model.ApiGetResult;
import kr.re.kitech.biz.api.client.model.ApiPostResult;
import kr.re.kitech.biz.api.client.model.ApiWorkResult;
import kr.re.kitech.biz.api.client.model.AppLineInfo;
import kr.re.kitech.biz.api.client.model.ApprovalLineInfo;
import kr.re.kitech.biz.api.client.model.CurrentActivity;
import kr.re.kitech.biz.api.client.model.MasterAppLineInfo;
import kr.re.kitech.biz.api.client.model.NextWork;
import kr.re.kitech.biz.api.client.model.ProcessRole;
import kr.re.kitech.biz.api.client.model.ProcessVariable;
import kr.re.kitech.biz.api.client.model.Role;
import kr.re.kitech.biz.api.client.model.RoleMapping;
import kr.re.kitech.biz.api.client.model.Worklineinfo;
import kr.re.kitech.biz.api.client.vo.ApiResult;
import kr.re.kitech.biz.api.client.vo.BpmRequest;
import kr.re.kitech.biz.api.client.vo.BpmResult;
import kr.re.kitech.biz.api.server.service.BpmPostService;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.apr.dao.ApprCommonDAO;
import kr.re.kitech.biz.apr.dao.ApprFuncDAO;
import kr.re.kitech.biz.apr.enums.AprAction;
import kr.re.kitech.biz.apr.enums.AprMapper;
import kr.re.kitech.biz.apr.enums.AprSearch;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.AprBugtCtrlService;
import kr.re.kitech.biz.apr.vo.AprConstraint;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprTaskListVo;
import kr.re.kitech.biz.apr.vo.AprTaskVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.AprWorkVo;
import kr.re.kitech.biz.apr.vo.ElecappinfoVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.com.enums.ExceptKind;
import kr.re.kitech.biz.com.service.ExceptService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.BpmException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.ext.BaseUrlProperty;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.LoggingService;
import kr.re.kitech.biz.xom.core.util.AprUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;
import kr.re.kitech.biz.xom.core.vo.MailVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 결재신청 공통 서비스 구현체
 * 
 * @author 박병목
 * @since 2022. 6. 21.
 */
@Service("apprFuncServiceImpl")
public class ApprFuncServiceImpl implements ApprFuncService {

	@Resource(name = "bpmGetInst")
	private BpmClient bpmGetInstance;

	@Resource(name = "bpmPostInst")
	private BpmClient bpmPostInstance;

	@Resource(name = "bpmPostInstReject")
	private BpmClient bpmPostInstanceReject;

	@Resource(name = "bpmPostInstAsisReject")
	private BpmClient bpmPostInstanceAsisReject;

	@Resource(name = "bpmGetWorks")
	private BpmClient bpmGetWorks;

	@Resource(name = "bpmGetInsts")
	private BpmClient bpmGetInstances;

	@Resource(name = "bpmRemoveInst")
	private BpmClient bpmRemoveInst;

	@Resource(name = "bpmGetRunWorks")
	private BpmClient bpmGetRunWorks;

	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService apprCommonService;

	@Resource(name = "apprFuncDAO")
	private ApprFuncDAO apprFuncDAO;

	@Resource(name = "apprCommonDAO")
	private ApprCommonDAO apprCommonDAO;

	@Resource(name = "accntServiceImpl")
	private AccntService accntService;

	@Resource(name = "bpmPostService")
	private BpmPostService bpmPostService;

	@Resource(name = "aprBugtCtrlService")
	private AprBugtCtrlService aprBugtCtrlService;

	@Resource(name = "exceptService")
	private ExceptService exceptService;

	@Resource(name = "loggingServiceImpl")
	private LoggingService loggingService;
	
	@Autowired
	private MailSender mailSender;


	/**
	 * BPM 경합일 경우 결재자 한명만 세팅하여 발송
	 * 
	 * @param roles
	 * @param aprVo
	 * @return
	 * @throws KitechException,
	 *             BpmException
	 */
	private List<ProcessRole> processRoleMapperForRacing(List<ProcessRole> roles, Role roleRace) throws KitechException, BpmException {
		List<RoleMapping> newRoleMappings = new ArrayList<>();
		if (null != roleRace) {
			for (ProcessRole role : roles) {
				if (StringUtils.equalsIgnoreCase(role.getName(), roleRace.getName())) {
					List<RoleMapping> orgRoleMappings = role.getRoleMapping();
					if (null != orgRoleMappings && 0 < orgRoleMappings.size()) {
						for (RoleMapping mapping : orgRoleMappings) {
							if (StringUtils.equalsIgnoreCase(mapping.getEndpoint(), roleRace.getRoleMapping().get(0).getEndpoint())) {
								newRoleMappings.add(mapping);
							}
						}
					}
					role.setRoleMapping(newRoleMappings);
				}
			}
		}
		return roles;
	}

	/**
	 * BPM Initiator 경합일 경우 결재자 본인만 세팅하여 변경
	 * 
	 * @param roles
	 * @param aprVo
	 * @return
	 * @throws KitechException,
	 *             BpmException
	 */
	private List<ProcessRole> processRoleMapperForRacingInti(List<ProcessRole> roles, Role roleRace) throws KitechException, BpmException {
		List<RoleMapping> newRoleMappings = new ArrayList<>();
		if (null != roleRace) {
			for (ProcessRole role : roles) {
				// role.getName() processRoles 명 roleRace.getName() currentActivity의 명
				if (StringUtils.equalsIgnoreCase(role.getName(), roleRace.getName()) && StringUtils.equalsIgnoreCase("Initiator", roleRace.getName())) {
					AppLog.info("processRoleMapperForRacingInti(Initiator) role.getName(): [" + role.getName() + "] roleRace.getName(): [" + roleRace.getName() + "]");
					// processRoles Initiator 경합인 사람들을 추출
					List<RoleMapping> orgRoleMappings = role.getRoleMapping();
					if (null != orgRoleMappings && 0 < orgRoleMappings.size()) {
						for (RoleMapping mapping : orgRoleMappings) {
							// 로그인 한 사람만 processRoles 세팅(여러명일경우 한명만 세팅)
							if (StringUtils.equalsIgnoreCase(mapping.getEndpoint(), KitechContextUtil.getUserId())) {
								AppLog.info("processRoleMapperForRacingInti(newRoleMappings) mapping.getEndpoint() : [" + mapping.getEndpoint()
										+ "] KitechContextUtil.getUserId(): [" + KitechContextUtil.getUserId() + "]");
								newRoleMappings.add(mapping);
							}
						}
					}
					role.setRoleMapping(newRoleMappings);
				}
			}
		}
		return roles;
	}

	/**
	 * BPM 사용자 세팅
	 * 
	 * @param roles
	 * @param aprVo
	 * @return
	 * @throws KitechException,
	 *             BpmException
	 */
	private List<ProcessRole> processRoleMapper(List<ProcessRole> roles, AprVo aprVo) throws KitechException, BpmException {

		for (ProcessRole role : roles) {
			Field[] declaredFields = aprVo.getClass().getDeclaredFields();
			for (Field field : declaredFields) {
				String loggingSyspayno = "";
				try {
					field.setAccessible(true);
					if (null != field.get(aprVo) && StringUtils.equalsIgnoreCase(role.getName(), field.getName())) {
						// 사번이 여러명일 경우 전체 세팅한다.
						String[] syspaynos = ((String) field.get(aprVo)).split(";");
						if (null != syspaynos) {
						
							// 프로세스롤에 매핑된 항목의 담당자가 다건인지 설정
							// boolean isMultiAuth = (1 < syspaynos.length); 
						
							List<RoleMapping> roleMappings = new ArrayList<>();
							for (String syspayno : syspaynos) {
								loggingSyspayno = syspayno;
								// 사번이 존재 한 경우만 넣어 준다. (empno 를 사용할 수 있으므로 6자리 이상)
								if (StringUtils.isNotEmpty(syspayno) && 6 <= syspayno.trim().length()) {
									// UserVo user = accntService.findUserIdBySyspayno(sysPayno);

									UserVo user;
									try { 
										user = accntService.findUserIdBySyspayno(syspayno);
										if (null == user) throw new Exception();
									} catch (Exception ex) {
										AppLog.error("LDAP 사번 존재하지 않음, call findUserByExpireSyspaynoInDB()", syspayno);
										// DB 에서 주민번호가 같은 최신 사번을 가져와서 LDAP 을 재조회한다.
										user = accntService.findUserByExpireSyspaynoInDB(syspayno);
									}

									if (null == user || StringUtils.isBlank(user.getUid())){
										throw new RuntimeException("LDAP & DB 에서 담당자 조회실패!");
									}

									// TODO: 확인필요 > 담당자 사번이 여러개 넘어왔을 때 방어 로직 추가 필요 여부
									/*
									if (null == user || StringUtils.isBlank(user.getSn())){
										if (isMultiAuth) {  
											// ignore: 다른사람은 있을 수 있으므로 
											continue;
										} else {
											// 한명의 담당자가도 설정하지 못하는 경우이므로 오류 처리 !!
											throw new RuntimeException("LDAP & DB 에서 담당자 조회실패!");
										} 
									}*/
									
									// 예산통제 Y일때 자동결재
									String autoYn = (StringUtils.equals("BudgetController", role.getName()) && StringUtils.equals("Y", aprVo.getAutoControlYn())) ? "Y" : "N";
									roleMappings.add(new RoleMapping().withAssignType(0).withEndpoint(user.getUid()).withEndpointName(user.getCn()).withAutoApproval(autoYn));
									AppLog.info("roleName: [" + role.getName() + "] field: [" + field.getName() + "]\t autoYn: [" + autoYn + "]\t syspayno: [" + user.getSn() + "]");
								}
							}
							role.setRoleMapping(roleMappings);
						}
					}
				} catch (Exception ex) {
					AppLog.error("BPM 프로세스 사용자(ProcessRole) 파싱 오류 - role.getName() [" + role.getName() + "] --- syspayno : [" + loggingSyspayno + "]\n", ex);
					throw new KitechException(Exceptions.ERROR, Business.APR, "담당자 정보 조회에 실패하였습니다.(" + role.getName() + ": " + loggingSyspayno + ")", ex);
				}
			}
		}
		return roles;
	}

	/**
	 * 자동결재 세팅(시작자와 계정책임자가 같을경우 자동결재)
	 * 
	 * @param roles
	 * @return List<ProcessRole>
	 * @throws KitechException,
	 *             BpmException
	 */
	private List<ProcessRole> processRoleMapperNextAccount(List<ProcessRole> roles) throws KitechException, BpmException {
		for (ProcessRole role : roles) {
			try {
				if ("AccountCharger".equals(role.getName()) || "Researcher".equals(role.getName())) {
					for (RoleMapping roleMapping : role.getRoleMapping()) {
						if (StringUtils.equals(roleMapping.getEndpoint(), KitechContextUtil.getUserId())) { // 시작자와 계정책임자가 같을경우 자동결재
							roleMapping.setAutoApproval("Y");
						}
					}
				}
			} catch (Exception ex) {
				throw new KitechException(Exceptions.ERROR, Business.APR, "BPM 프로세스 롤(ProcessRole) 파싱 오류 발생", ex);
			}
		}
		return roles;
	}

	/**
	 * 자동결재 세팅(차상위자 ID와 판별)
	 * 
	 * @param roles
	 * @param aprVo
	 * @return
	 * @throws KitechException,
	 *             BpmException
	 */
	private List<ProcessRole> processRoleMapperNextAuto(List<ProcessRole> roles, String nextApprSyspayNo) throws KitechException, BpmException {
		for (ProcessRole role : roles) {
			try {
				UserVo user = accntService.findSyspaynoByUid(nextApprSyspayNo);
				if ("AccountCharger".equals(role.getName()) || "Researcher".equals(role.getName())) {
					for (RoleMapping roleMapping : role.getRoleMapping()) {
						if (StringUtils.equals(roleMapping.getEndpoint(), user.getUid())) { // 계정책임자가 차상위자와 같을때 자동결재
							roleMapping.setAutoApproval("Y");
						}
					}
				}
			} catch (Exception ex) {
				throw new KitechException(Exceptions.ERROR, Business.APR, "BPM 프로세스 롤(ProcessRole) 파싱 오류 발생", ex);
			}
		}
		return roles;
	}

	/**
	 * 자동결재 세팅(AutoCmpltMan으로 되어 있는 사람은 자동 결재)
	 * 
	 * @param roles
	 * @return List<ProcessRole>
	 * @throws KitechException,
	 *             BpmException
	 */
	private List<ProcessRole> processRoleAutoCmpltMan(List<ProcessRole> roles) throws KitechException, BpmException {
		for (ProcessRole role : roles) {
			try {
				if ("autoCmpltMan".equals(role.getName()) && null != role.getRoleMapping()) {
					for (RoleMapping roleMapping : role.getRoleMapping()) {
						roleMapping.setAutoApproval("Y");
					}
				}
			} catch (Exception ex) {
				throw new KitechException(Exceptions.ERROR, Business.APR, "BPM 프로세스 롤(ProcessRole) 파싱 오류 발생", ex);
			}
		}
		return roles;
	}

	/**
	 * BPM 변수값 세팅
	 * 
	 * @param variables
	 * @param aprVo
	 * @return
	 * @throws KitechException,
	 *             BpmException
	 */
	private List<ProcessVariable> processVariableMapper(List<ProcessVariable> variables, AprVo aprVo) throws KitechException, BpmException {

		for (ProcessVariable variable : variables) {
			Field[] declaredFields = aprVo.getClass().getDeclaredFields();
			for (Field field : declaredFields) {
				try {
					field.setAccessible(true);
					if (null != variable.getName() && StringUtils.equalsIgnoreCase(variable.getName(), field.getName())) {
						String value = (String) field.get(aprVo);
						if (!StringUtils.isEmpty(value)) {
							String[] values = (null != value && value.contains(",")) ? value.split(",") : new String[] { value };
							variable.setValues(values);
							AppLog.info("varName: [" + variable.getName() + "] field: [" + field.getName() + "]\t value: [" + Arrays.toString(values) + "]");
						}
					}
				} catch (Exception ex) {
					AppLog.error("BPM 프로세스 변수(ProcessVariable) 파싱 오류 >>> " + field.getName());
					throw new KitechException(Exceptions.ERROR, Business.APR, "BPM 프로세스 변수(ProcessVariable) 파싱 오류 발생", ex);
				}
			}
		}
		;
		return variables;
	}

	/**
	 * 자동결재 여부체크 ProcessVariable의 NxtWrkAuto가 Y로 오는지 체크(기안자, 계정책임자 자동결재 사용)
	 * 
	 * @param List<ProcessVariable>
	 * @param String
	 * @return
	 * @throws KitechException,
	 *             BpmException
	 */
	private String procWrkAutoVarMap(List<ProcessVariable> variables) {
		String wrkAuto = "";
		for (ProcessVariable variable : variables) {
			if (null != variable.getName() && StringUtils.equalsIgnoreCase(variable.getName(), "NxtWrkAuto")) {
				String value = String.valueOf(variable.getValues());
				if (!StringUtils.isEmpty(value)) {
					wrkAuto = value;
				}
			}
		}
		return wrkAuto;
	}

	/**
	 * WorkList 상세데이터(GET API) 호출전 데이터 세팅
	 * 
	 * @param AprScVo
	 * @return BpmRequest
	 * @throws KitechException,
	 *             BpmException
	 */
	private BpmRequest getWorkList(AprScVo aprScVo) throws KitechException, BpmException {
		return new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instStatus(aprScVo.getInstStatus()).instName(aprScVo.getReqNo())
				.taskExt1(aprScVo.getTaskExt1()).taskExt3(aprScVo.getTaskExt3()).instStatus(aprScVo.getInstStatus()).proc("").taskStatus(aprScVo.getTaskStatus())
				.pageNum(aprScVo.getPageIndex()).pageSize(10).build();
	}

	/**
	 * BPM 보상 API 호출
	 *
	 * @param postResult
	 * @param bpmReq
	 */
	private void sendRoleBack(String cancelKey, BpmRequest bpmReq) {

		// BPM 체크 후 오류일경우 보상으로 호출 한다.
		if (null != bpmReq && null != cancelKey) {
			// request 정보에 캔슬키를 넣어 전송한다.
			ApiGetResult reqResult = (ApiGetResult) bpmReq.getApiResult();

			// 요청 파라미터 갱신
			reqResult.setCancelKey(cancelKey);
			bpmReq.setServiceType(BpmServiceType.CANCEL_CHANGE);
			bpmReq.setApiResult(reqResult);

			this.bpmPostInstance.execute(bpmReq);
		}
	}

	/**
	 * 기안자 아이디 가져오기
	 * 
	 * @param apiResult
	 * @return
	 */
	private String getInitiator(ApiGetResult apiResult) {
		String initiator = "";
		if (null != apiResult.getAppLineInfo()) {
			AppLineInfo appLineInfo = apiResult.getAppLineInfo();
			/** 결재 라인 추가 */
			List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
			if (null != approvalLineInfos) {
				ApprovalLineInfo approvalLineInfo = approvalLineInfos.get(0);
				initiator = approvalLineInfo.getRole().getRoleMapping().get(0).getEndpoint();
			}

			// 수신결재일경우에는 최초 initiator 보기
			if (StringUtils.equals("recieve", appLineInfo.getLinetype())) {
				List<ProcessRole> processRoles = apiResult.getProcessRoles();
				if (null != processRoles) {
					initiator = processRoles.get(0).getRoleMapping().get(0).getEndpoint();
				}
			}
		} else {
			List<ProcessRole> processRoles = apiResult.getProcessRoles();
			if (null != processRoles) {
				initiator = processRoles.get(0).getRoleMapping().get(0).getEndpoint();
			}
		}
		return initiator;
	}

	/**
	 * 전자결재 완료/반려 메일 발송
	 *
	 * @param initiator
	 * @param apiResult
	 * @param vo
	 */
	private void sendAprMail(String initiator, ApiGetResult apiResult, AprScVo aprScVo) {
		if (StringUtils.isNotEmpty(initiator)) {

			String subjectType; // 제목 구분
			String rejectComment; // 결재 의견
			String templatePath; // 템플릿 경로
			String serviceid; // 문서함 서비스 ID
			String linkUrl = BaseUrlProperty.newBizUrl;
			if (StringUtils.equals("Y", aprScVo.getRejectYN())) {
				subjectType = "결재반려";
				rejectComment = aprScVo.getComments();
				templatePath = "apr/RejectAPR";
				serviceid = "A009"; // 결재반려함

				// 반려 메일의 경우에는 화면으로 처리한다.
				linkUrl += ("?serviceid=" + serviceid + "&reqNo=" + apiResult.getName());
			} else {
				subjectType = "결재완료";
				rejectComment = null;
				templatePath = "apr/CompleteAPR";
				serviceid = "A006"; // 완료함

				// 완료 메일의 경우에는 스냅샷 있는 양식인 경우 결재완료문서 없는 양식인 경우 화면으로 분기한다.
				AprWorkVo aprWorkVo = new AprWorkVo();
				aprWorkVo.setInstAlias(aprScVo.getProcDefAlias());
				aprWorkVo.setInstName(aprScVo.getReqNo());
				String snapYn = this.isSnapYn(aprWorkVo);

				linkUrl += (snapYn.equals("Y") ? "/pop.jsp?w2xPath=/ui/apr/layoutSimple.xml&viewMode=read&reqNo=" + apiResult.getName() + "&snapYn=" + snapYn
						: "?serviceid=" + serviceid + "&reqNo=" + apiResult.getName() + "&snapYn=" + snapYn);
			}

			String toAddress = initiator += "@kitech.re.kr";

			Map<String, String> subjectVar = new HashMap<>();
			subjectVar.put("@reqNo@", apiResult.getName());
			subjectVar.put("@reqNm@", apiResult.getDefName());

			Map<String, String> contentVar = new HashMap<>();
			contentVar.put("@reqInfo@", apiResult.getInfo());
			contentVar.put("@reqNm@", apiResult.getDefName());
			if (StringUtils.equals(apiResult.getDefName(), "증명서신청")) {
				linkUrl = linkUrl + "&prt=1";
			}
			contentVar.put("@reqNo@", apiResult.getName());
			contentVar.put("@actorName@", StringUtils.isNotEmpty(aprScVo.getActorName()) ? aprScVo.getActorName() : KitechContextUtil.getName());
			if (null != rejectComment) {
				contentVar.put("@@rejectComment@", rejectComment.replaceAll("\n", "</br>"));
			}
			contentVar.put("@@snapShot@", "<a href='" + linkUrl + "' target='_blank' > 완료결재 원문보기 </a>");

			MailTemplateVo templateVo = new MailTemplateVo();
			templateVo.setContentVar(contentVar);
			templateVo.setSubjectVar(subjectVar);

			List<MailTemplateVo> templateVars = new ArrayList<>();
			templateVars.add(templateVo);
			
			try {
				// 전자결재 완료/반려 메일 발송
				this.mailSender.sendMessage(
					// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
					new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.APR, false)
						.subject("[전자결재] " + subjectType + " : @reqNm@ - @reqNo@")
						.templatePath(templatePath)
						.templateVars(templateVars)
						.toAddr(toAddress)
						.savesent(false) // 받은 편지함 저장 여부
						.logging(true) // 로그 저장 여부
					.build());
			} catch (Exception ex) {
				AppLog.error("메일전송오류>>>", ex);
				// TODO: DB 저장 로직 구현, 별도 배치 잡에서 재송신 처리, text 타입 문제 처리 필요.
				try {
					MailVo mail = new MailVo();
					mail.setSubject( "[전자결재] " + subjectType + " : @reqNm@ - @reqNo@");
					mail.setContent( this.mailSender.buildContent(templatePath, contentVar));
					mail.setFromAddr( this.mailSender.getSenderEmail());
					mail.setToAddr( toAddress);
					mail.setBusiness( Business.APR.getCode());
					mail.setRegst_syspayno( KitechContextUtil.getSyspayno());			
					loggingService.insertMailFailLog( mail);
				} catch (Exception e) {}
			}
		}
	}

	/**
	 * BPM 상세데이터(GET API) 호출전 데이터 세팅
	 * 
	 * @param AprScVo
	 * @param InstId
	 * @param TaskId
	 * @param Trctag
	 * @return BpmRequest
	 * @throws KitechException,
	 *             BpmException
	 */
	public BpmRequest getDetailData(AprScVo aprScVo, String instId, String taskId, String trctag) throws KitechException, BpmException {
		// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
		BpmRequest bpmReqInit = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(instId).taskId(taskId).trcTag(trctag).build();
		return bpmReqInit;
	}

	/**
	 * apiResult 초기값 세팅
	 * 
	 * @param BpmResult,
	 *            AprVo
	 * @return ApiGetResult
	 * @throws KitechException,
	 *             BpmException
	 */
	public ApiGetResult apiResultSet(ApiGetResult apiResult, AprVo aprVo) throws KitechException, BpmException {
		if (StringUtils.equals("F61", aprVo.getReqNo())) {
			apiResult.setName(null != aprVo && StringUtils.isNotEmpty(aprVo.getSlipNo()) ? aprVo.getSlipNo() : apiResult.getName()); // reqNo
		} else {
			apiResult.setName(null != aprVo && StringUtils.isNotEmpty(aprVo.getReqNo()) ? aprVo.getReqNo() : apiResult.getName()); // reqNo
		}
		apiResult.setInfo(null != aprVo && StringUtils.isNotEmpty(aprVo.getInfoCd()) ? aprVo.getInfoCd() : apiResult.getInfo()); // 제목
		apiResult.setInstExt1(null != aprVo && StringUtils.isNotEmpty(aprVo.getExt1Cd()) ? aprVo.getExt1Cd() : apiResult.getInstExt1()); // 계정번호
		// 전결타입 및 금액 예비값에 넣기
		apiResult.setInstExt4(null != aprVo && StringUtils.isNotEmpty(aprVo.getRuleType()) ? aprVo.getRuleType() : apiResult.getInstExt4());
		apiResult.setInstExt5(null != aprVo && StringUtils.isNotEmpty(aprVo.getRuleMoney()) ? aprVo.getRuleMoney() : apiResult.getInstExt5());
		return apiResult;
	}

	/**
	 * aprVo 조회값 추출
	 * 
	 * @param AprVo
	 * @return BpmResult(JSON DATA)
	 * @throws KitechException,
	 *             BpmException
	 */
	public BpmResult getBaseBpmReqToResult(AprScVo aprScVo) throws KitechException, BpmException {

		String removeInstId = "";
		String tempReqNo = aprScVo.getReqNo(); // 추후에 메인키로 start 후 돌려야 함.

		// 결의확정 결재(F61)는 변경
		if ("F61".equals(aprScVo.getReqNo())) {
			aprScVo.setReqNo(aprScVo.getSlipNo());
		}
		IntfatabVo intfatabVo = apprCommonService.getXomxintfatab(aprScVo.getReqNo());

		// 통합프로세스일경우 DefAlias에 'M'붙이기
		aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(tempReqNo.substring(0, 3)));
		BpmRequest bpmReq = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).build();

		/** (/rest/bpm/process-worklist) : taskStatus = Draft 조회 */
		BpmRequest bpmReqInit = getWorkList(aprScVo);
		BpmResult getResInit = this.bpmGetWorks.execute(bpmReqInit);
		// 조회된 결과값 세팅
		List<ApiResult> apiResults = getResInit.getApiResults();

		if (null == apiResults || 1 < apiResults.size()) {
			// 결과가 Null 이거나 2건 이상일 경우에는 오류 예외처리 한다.
			throw new KitechException(Exceptions.ERROR, Business.APR, "message.alert.apr.com.0003", new String[] { aprScVo.getReqNo() });
		}

		if (apiResults.size() == 0) { // 신규
			// 메인키가 존재하고 메인키 reqNo와 다를경우 서브프로레스 xomxintfatab가 특정값일경우 메인키 기준으로 조회 한다.
			if (null != aprScVo.getMainKey() && !aprScVo.getMainKey().equals(aprScVo.getReqNo())) {
				IntfatabVo intfatabVoMain = apprCommonService.getXomxintfatab(aprScVo.getMainKey());
				if ((AprState.COMPLATE.getCode().equals(intfatabVoMain.getAprState()) || !"XAD".equals(intfatabVoMain.getAprState().substring(0, 3)))
						&& AprState.isWait(intfatabVo.getAprState())) {

					aprScVo.setReqNo(aprScVo.getMainKey());
					aprScVo.setTaskStatus(AprMapper.TASK_NEW.getCode());
					// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
					bpmReqInit = getWorkList(aprScVo);

					/** (/rest/bpm/process-worklist) : taskStatus = New 조회 */
					getResInit = this.bpmGetWorks.execute(bpmReqInit);
					apiResults = getResInit.getApiResults();

					// 없으면 서브키 NEW 값 실행(메인키가 이미 한번 실행되면 서브키 NEW 찾아서 진행 필요)
					if (null != apiResults && apiResults.size() == 0) {
						aprScVo.setReqNo(tempReqNo);
						bpmReqInit = getWorkList(aprScVo);
						getResInit = this.bpmGetWorks.execute(bpmReqInit);
						apiResults = getResInit.getApiResults();
					}

					if (apiResults.size() > 0) {
						// 재조회 기존 만들어진 REQ_NO가 존재 할 경우 InstId, TaskId, Trctag 값을 시작전에 넣어줘야 재성성을 막음
						ApiWorkResult workResult = (ApiWorkResult) apiResults.get(0);
						bpmReq = getDetailData(aprScVo, workResult.getInstId().toString(), workResult.getTaskId().toString(), workResult.getTrctag());
					}
				}
			}
		} else if (apiResults.size() == 1) { // 재생성
			// 기존 만들어진 REQ_NO가 존재 할 경우 InstId, TaskId, Trctag 값을 시작전에 넣어줘야 재성성을 막음
			ApiWorkResult workResult = (ApiWorkResult) apiResults.get(0);
			bpmReq = getDetailData(aprScVo, workResult.getInstId().toString(), workResult.getTaskId().toString(), workResult.getTrctag());
		}

		// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
		// taskId, trcTag 값 입력후 호출
		BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
		if (!"".equals(removeInstId))
			getRes.setRemoveInstId(removeInstId);
		return getRes;
	}

	/**
	 * apiResult 초기값 세팅
	 * 
	 * @param BpmResult,
	 *            AprVo
	 * @return ApiGetResult
	 * @throws KitechException,
	 *             BpmException
	 */
	public void setElecappinfo(String reqNo, AppLineInfo appLineInfo, MasterAppLineInfo mstLineInfo) throws KitechException, BpmException {
		/** 결재 라인 추가 */
		List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
		List<Worklineinfo> worklineinfos = appLineInfo.getWorklineinfos();

		String appLinetype = "master";
		if (StringUtils.equals("recieve", appLineInfo.getLinetype())) {
			appLinetype = "recieve";
		}

		// XAD100가 되면서 elecappinfo 테이블에 한번에 INSERT
		List<AprUserVo> aprUsers = new ArrayList<>();

		// 마스터가 있는 경우 먼저 추가
		if (null != mstLineInfo) {
			// 수신결재인경우 마스터에 결재라인이 존재
			List<ApprovalLineInfo> approvalMstLineInfos = mstLineInfo.getApprovalLineInfos();
			List<Worklineinfo> workMstlineinfos = mstLineInfo.getWorklineinfos();

			for (ApprovalLineInfo approvalLineInfo : approvalMstLineInfos) {
				String apprType = approvalLineInfo.getName(); // 결재타입
				String jikname = approvalLineInfo.getRole().getDisplayName(); // 직무
				if (StringUtils.equals("기안", jikname)) { // 결의신청일경우 결재로 변경
					apprType = "결재";
				}
				if (StringUtils.isNotEmpty(apprType)) {
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
			}

			// worklineinfos 업무단이 없을경우 예외
			if (null != worklineinfos) {
				for (Worklineinfo Worklineinfo : workMstlineinfos) {
					String apprType = "업무"; // 결재타입(업무결재자들은 따로 관리)
					String jikname = Worklineinfo.getRole().getDisplayName(); // 직무

					if (StringUtils.isNotEmpty(apprType)) {
						List<RoleMapping> roles = Worklineinfo.getRole().getRoleMapping();
						if (null != roles && 0 < roles.size()) {
							String endpointName = roles.get(0).getEndpointName(); // 결재자이름
							String endpoint = roles.get(0).getEndpoint(); // 결재자ID
							String autoApproval = roles.get(0).getAutoApproval(); // 자동결재유무
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
						}
					}
				}
			}

		}

		for (ApprovalLineInfo approvalLineInfo : approvalLineInfos) {
			String apprType = approvalLineInfo.getName(); // 결재타입
			String jikname = approvalLineInfo.getRole().getDisplayName(); // 직무
			if (StringUtils.equals("기안", jikname)) { // 결의신청일경우 결재로 변경
				apprType = "결재";
			}

			if (StringUtils.equals("recieve", appLinetype)) {
				apprType = "수신";
			}

			if (StringUtils.isNotEmpty(apprType)) {
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
		}

		// worklineinfos 업무단이 없을경우 예외
		if (null != worklineinfos) {
			for (Worklineinfo Worklineinfo : worklineinfos) {
				String apprType = "업무"; // 결재타입(업무결재자들은 따로 관리)
				String jikname = Worklineinfo.getRole().getDisplayName(); // 직무

				if (StringUtils.equals("recieve", appLinetype)) {
					apprType = "수신";
				}

				if (StringUtils.isNotEmpty(apprType)) {
					List<RoleMapping> roles = Worklineinfo.getRole().getRoleMapping();
					if (null != roles && 0 < roles.size()) {
						String endpointName = roles.get(0).getEndpointName(); // 결재자이름
						String endpoint = roles.get(0).getEndpoint(); // 결재자ID
						String autoApproval = roles.get(0).getAutoApproval(); // 자동결재유무
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
					}
				}
			}
		}

		// apprFuncDAO.insertElecappinfo 넣기전에 일괄삭제 후 다시 저장
		apprFuncDAO.deleteElecappinfo(reqNo);

		ElecappinfoVo elecappinfoVo = new ElecappinfoVo();
		int numAppr = 0; // 결재
		int numAUD = 0; // 협조
		int numCOO = 0; // 감사
		int numWork = 0; // 업무
		int numSu = 0; // 수신
		int odr = 0;
		for (int i = 0; i < aprUsers.size(); i++) {
			switch (aprUsers.get(i).getApld_apltype()) {
			case "결재":
				numAppr++;
				odr = numAppr;
				break;
			case "협조":
				numAUD++;
				odr = numAUD;
				break;
			case "업무":
				numWork++;
				odr = numWork;
				break;
			case "감사":
				numCOO++;
				odr = numCOO;
				break;
			case "수신":
				numSu++;
				odr = numSu;
				break;
			default:
				break;
			}
			// aprUsers를 이용해ㅁ elecappinfo에 넣어준다
			elecappinfoVo.setReq_no(reqNo);
			elecappinfoVo.setApprvl_clsf(aprUsers.get(i).getApld_apltype());
			elecappinfoVo.setOdr(odr);
			elecappinfoVo.setRoll_nm(aprUsers.get(i).getJikname());
			elecappinfoVo.setApprvl_shape("");
			if (aprUsers.get(i).getEndTime() != null) {
				elecappinfoVo.setComplt_daytm(aprUsers.get(i).getEndTime().substring(0, 19));
			} else {
				elecappinfoVo.setComplt_daytm("");
			}

			// 자동결재 체크
			if (StringUtils.equals("Y", aprUsers.get(i).getAutoApproval())) {
				elecappinfoVo.setSign_info(BaseUrlProperty.oldBizUrl + "/sign/auto.gif");
			} else {
				elecappinfoVo.setSign_info(BaseUrlProperty.oldBizUrl + "/sign/" + aprUsers.get(i).getEmpsn() + ".gif");
			}

			elecappinfoVo.setRegst_syspayno(aprUsers.get(i).getEmpsn());
			elecappinfoVo.setUpdt_syspayno(aprUsers.get(i).getEmpsn());
			// elecappinfo 테이블에 결재정보를 저장한다.
			apprFuncDAO.insertElecappinfo(elecappinfoVo);
		}
	}

	/**
	 * 차상위 결재자 ID, 성명 찾기
	 * 
	 * @param BpmResult,
	 *            AprVo
	 * @return ApiGetResult
	 * @throws KitechException,
	 *             BpmException
	 */
	public String getUpApprSyspayNo(List<ApprovalLineInfo> approvalLineInfos) throws KitechException, BpmException {
		String syspayno = "";

		// 기안자가 아니고 다음 결재자는 차상위 결재자
		for (ApprovalLineInfo ApprovalInfo : approvalLineInfos) {
			if (("approval".equals(ApprovalInfo.getApprType()) || "arbitrary_decision".equals(ApprovalInfo.getApprType()) || "approvalstrat".equals(ApprovalInfo.getApprType()))
					&& !"Initiator".equals(ApprovalInfo.getRole().getName())) {
				syspayno = ApprovalInfo.getRole().getRoleMapping().get(0).getEndpoint();
				break;
			}
		}

		return syspayno;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * kr.re.kitech.biz.apr.service.ApprFuncService#approvalRequest(kr.re.kitech.biz
	 * .apr.vo.AprVo)
	 */
	@Override
	public void approvalRequest(AprVo aprVo) throws KitechException, BpmException {
		this.approvalRequest(aprVo, null);
	}

	/**
	 * 단계진행을 위한 포스트 파라미터 세팅
	 *
	 * @param AprVo
	 *            aprVo, Object model
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	@Override
	public BpmRequest approvalForward(AprVo aprVo, BpmServiceType bpmType) throws KitechException, BpmException {
		BpmRequest bpmReq = null;

		AprScVo aprScVo = AprUtil.buildSc(aprVo);

		// 결재신청일 경우 2건을 막기 위해 instStatus -> Running, taskStatus -> DRAFT로 설정
		aprScVo.setInstStatus(AprMapper.INST_RUNNING.getCode());
		aprScVo.setTaskStatus(AprMapper.TASK_DRAFT.getCode());

		// TaskExt1에 화면ID를 넣어 병렬일경우 특정건을 필터링 한다.
		aprScVo.setTaskExt1(StringUtils.isNotEmpty(aprVo.getTaskExt1()) ? aprVo.getTaskExt1() : aprVo.getUiId());

		// BPM WorkList후 상세 데이터 추출
		BpmResult getRes = this.getBaseBpmReqToResult(aprScVo);
		ApiGetResult apiResult = (ApiGetResult) getRes.getApiResult();
		apiResult = apiResultSet(apiResult, aprVo);

		// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
		if (null != apiResult && null != apiResult.getAppLineInfo()) {
			// 부서결재를 위하여 데이터 편집
			AppLineInfo appLineInfo = apiResult.getAppLineInfo();
			if (null != appLineInfo.getApprEditable() && appLineInfo.getApprEditable()) {
				// 결재라인
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
				if (null != approvalLineInfos) {
					// 차상위자 넣기
					aprVo.setNextApprSyspayNo(getUpApprSyspayNo(approvalLineInfos));

					// 시작자를 제외한 모든 사람 초기화
					ApprovalLineInfo approvalLineInfo = approvalLineInfos.get(0);
					approvalLineInfos.removeAll(approvalLineInfos);
					approvalLineInfos.add(approvalLineInfo);
				}
			}
		}

		// 프로세스 Role
		if (apiResult.getProcessRoles() != null) {
			List<ProcessRole> processRoles = this.processRoleMapper(apiResult.getProcessRoles(), aprVo);
			apiResult.setProcessRoles(processRoles);
		}

		// 프로세스 Variable
		if (apiResult.getProcessVariables() != null) {
			List<ProcessVariable> ProcessVariables = this.processVariableMapper(apiResult.getProcessVariables(), aprVo);
			apiResult.setProcessVariables(ProcessVariables);
		}

		// 현재업무가 경합일 경우 체크
		if (null != apiResult.getCurrentActivity()) {
			CurrentActivity currentActivity = apiResult.getCurrentActivity();
			// TRUE 일경우 현재 경합상태 이므로 나머지 사용자는 제거
			if (currentActivity.getIsRacing()) {
				// 프로세스 Manager만 변경
				if (null != apiResult.getProcessRoles()) {
					List<ProcessRole> processRoles = this.processRoleMapperForRacingInti(apiResult.getProcessRoles(), currentActivity.getRolee());
					apiResult.setProcessRoles(processRoles);
				}
			}
		}

		// 시작자와 계정책임자 세팅
		if (apiResult.getProcessVariables() != null && apiResult.getProcessRoles() != null) {
			if (StringUtils.equals("[Y]", this.procWrkAutoVarMap(apiResult.getProcessVariables()))) {
				apiResult.setProcessRoles(this.processRoleMapperNextAccount(apiResult.getProcessRoles()));
			}
		}

		// AutoCmpltMan 자동결재
		apiResult.setProcessRoles(this.processRoleAutoCmpltMan(apiResult.getProcessRoles()));

		if (!"".equals(getRes.getRemoveInstId()))
			apiResult.setRemoveInstanceId(getRes.getRemoveInstId());

		// 값 세팅 후 POST /rest/bpm/process-instances/{serviceType} 호출
		bpmReq = this.getWorkList(aprScVo);
		bpmReq.setServiceType(bpmType);
		bpmReq.setApiResult(apiResult);

		return bpmReq;
	}

	public List<AprWorkVo> searchAprList(AprScVo sc) throws KitechException, BpmException {
		List<AprWorkVo> aprListVo = new ArrayList<AprWorkVo>();
		String alias = "";

		if (StringUtils.equals("system", sc.getEndpoint())) {
			// 담당자완료함일경우에는 세션 사번 넣는거 제외
			if (StringUtils.equals("alias", sc.getProcClsf())) {
				alias = apprFuncDAO.searchAliasList(KitechContextUtil.getUserId());
				if (alias == null) {
					alias = "temp";
				}
			}

			if (StringUtils.isNotEmpty(sc.getReqNo())) {
				if (sc.getProcDefAlias() == null || "".equals(sc.getProcDefAlias())) {
					alias = apprCommonDAO.selectGetMainKey(sc.getReqNo().substring(0, 3));
					// 통프일경우 'M'제거
					if (StringUtils.isNotEmpty(alias))
						alias = alias.substring(0, 3);
				} else {
					alias = sc.getProcDefAlias();
				}

				// 결의확정 결재(F61)는 변경
				if ("F61".equals(sc.getReqNo())) {
					sc.setReqNo(sc.getSlipNo());
					alias = "F61";
				}
			}
		} else {
			sc.setEndpoint(!StringUtils.isEmpty(sc.getEndpoint()) ? sc.getEndpoint() : KitechContextUtil.getUserId());
		}

		// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
		BpmRequest bpmReqInit = new BpmRequest.Builder(alias).endpoint(sc.getEndpoint()).taskStatus(sc.getTaskStatus()).tool(sc.getTool()).status(sc.getStatus())
				.procClsf(sc.getProcClsf()).pageNum(sc.getPageIndex()).pageSize(sc.getPageUnit()).proc("").instName(sc.getReqNo()).instStartDateFrom("").instStartDateTo("")
				.instFinishedDateFrom(sc.getInstStartYmd()).instFinishedDateTo(sc.getInstEndYmd()).instStatus(sc.getInstStatus()).defName(sc.getAppname())
				.prevEndpoint(sc.getPrevEndpoint()).instInfo(sc.getInfoCd()).orderBy(sc.getOrderBy()).initepName(sc.getInitiatorNm()).instExt1(sc.getExt1Cd())
				.totalSearch(sc.getTotalSearch()).budgetControl(sc.getBudgetControl()).build();

		BpmResult getResInit = (AprMapper.FORM_RUNNING.getCode().equals(sc.getStatus()) || AprMapper.FORM_COMPLETE.getCode().equals(sc.getStatus())
				|| AprMapper.FORM_ALIAS.getCode().equals(sc.getStatus())) ? this.bpmGetRunWorks.execute(bpmReqInit) : this.bpmGetWorks.execute(bpmReqInit);

		List<ApiResult> apiResults = getResInit.getApiResults();

		for (ApiResult vo : apiResults) {
			aprListVo.add(((ApiWorkResult) vo).toModel());
		}
		return aprListVo;
	}

	/**
	 * 예산통제 집행가능 카운트
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 이대훈
	 * @since 2023.05.30.
	 */
	public int searchRakCnt(AprScVo sc) throws KitechException, BpmException {
		return this.apprFuncDAO.searcBudgetRakCnt(sc);
	}

	/**
	 * 결재대기함, 업무대기함, 결재진행함, 담당자완료함, 결재완료함, 대결완료함
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.07.13.
	 */
	public int searchTotCnt(AprScVo sc) throws KitechException, BpmException {
		int cnt = 0;
		String alias = "";

		if (StringUtils.equals("system", sc.getEndpoint())) {
			// 담당자완료함일경우에는 세션 사번 넣는거 제외
			if (StringUtils.equals("alias", sc.getProcClsf())) {
				alias = apprFuncDAO.searchAliasList(KitechContextUtil.getUserId());
				if (alias == null) {
					alias = "temp";
				}
			}

			if (StringUtils.isNotEmpty(sc.getReqNo())) {
				if (sc.getProcDefAlias() == null || "".equals(sc.getProcDefAlias())) {
					alias = apprCommonDAO.selectGetMainKey(sc.getReqNo().substring(0, 3));
					// 통프일경우 'M'제거
					if (StringUtils.isNotEmpty(alias))
						alias = alias.substring(0, 3);
				} else {
					alias = sc.getProcDefAlias();
				}

				// 결의확정 결재(F61)는 변경
				if ("F61".equals(sc.getReqNo())) {
					sc.setReqNo(sc.getSlipNo());
					alias = "F61";
				}
			}
		} else {
			sc.setEndpoint(!StringUtils.isEmpty(sc.getEndpoint()) ? sc.getEndpoint() : KitechContextUtil.getUserId());
		}

		// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
		BpmRequest bpmReqInit = new BpmRequest.Builder(alias)
			.endpoint(sc.getEndpoint())
			.taskStatus(sc.getTaskStatus())
			.tool(sc.getTool())
			.status(sc.getStatus())
			.procClsf(sc.getProcClsf())
			.instStatus(sc.getInstStatus())
			.instName(sc.getReqNo())
			.defName(sc.getAppname())
			.instInfo(sc.getInfoCd())
			.initepName(sc.getInitiatorNm())
			.instExt1(sc.getExt1Cd())
			.instStartDateFrom("")
			.instStartDateTo("")
			.instFinishedDateFrom(sc.getInstStartYmd())
			.instFinishedDateTo(sc.getInstEndYmd())
			.prevEndpoint(sc.getPrevEndpoint())
			.taskName(sc.getTaskName())
			.budgetControl(sc.getBudgetControl())
			.proc("getTotalWorklistCnt")
			.totalSearch(sc.getTotalSearch())
			.pageNum(sc.getPageIndex()).pageSize(sc.getPageUnit())
		.build();

		BpmResult getResInit = (
			AprMapper.FORM_RUNNING.getCode().equals(sc.getStatus()) || 
			AprMapper.FORM_COMPLETE.getCode().equals(sc.getStatus()) || 
			AprMapper.FORM_ALIAS.getCode().equals(sc.getStatus())
		) ? this.bpmGetRunWorks.execute(bpmReqInit) : this.bpmGetWorks.execute(bpmReqInit);

		ApiCountResult apiResults = (ApiCountResult) getResInit.getApiResult();
		cnt = apiResults.getCount();
		return cnt;
	}

	/**
	 * 결재대기함, 업무대기함, 결재진행함, 담당자완료함, 결재완료함, 대결완료함 검색조건으로 상세리스트
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.09.14.
	 */
	public List<AprWorkVo> searchClsfAprList(AprScVo sc) throws Exception {
		switch (AprSearch.codeOf(sc.getSearchClsf())) {
		case APP_NAME:
			sc.setAppname(sc.getSearchData());
			break;
		case REQ_NO:
			sc.setReqNo(sc.getSearchData());
			break;
		case TITLE:
			sc.setInfoCd(sc.getSearchData());
			break;
		case INITIATOR:
			sc.setInitiatorNm(sc.getSearchData());
			break;
		case ACCNT_NO:
			sc.setExt1Cd(sc.getSearchData());
			break;
		case ALL_SRCH:
			sc.setTotalSearch(sc.getSearchData());
			break; // 전체검색
		default:

		}
		List<AprWorkVo> aprListVo = searchAprList(sc);
		return aprListVo;
	}

	/**
	 * 결재대기함, 업무대기함, 결재진행함, 담당자완료함, 결재완료함, 대결완료함 총 카운트
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.09.14.
	 */
	public int searchClsfTotCnt(AprScVo sc) throws KitechException, BpmException {
		switch (sc.getSearchClsf()) {
		case "appName":
			sc.setAppname(sc.getSearchData());
			break;
		case "docId":
			sc.setReqNo(sc.getSearchData());
			break;
		case "title":
			sc.setInfoCd(sc.getSearchData());
			break;
		case "initiator":
			sc.setInitiatorNm(sc.getSearchData());
			break;
		case "accntNo":
			sc.setExt1Cd(sc.getSearchData());
			break;
		default:
			sc.setTotalSearch(sc.getSearchData());
			break;
		}
		int cnt = searchTotCnt(sc);
		return cnt;
	}

	/**
	 * 결재반려함, 작성중문서함
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.07.13.
	 */
	public List<IntfatabVo> searchWorkList(AprScVo sc) throws KitechException, BpmException {
		if (StringUtils.isEmpty(sc.getEndpoint())) {
			sc.setEndpoint(KitechContextUtil.getUserId());
		}
		return this.apprFuncDAO.searchWorkList(sc);
	}

	/**
	 * 결재반려함, 작성중문서함(count)
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.07.13.
	 */
	public int searchWorkTotCnt(AprScVo sc) throws KitechException, BpmException {
		if (StringUtils.isEmpty(sc.getEndpoint())) {
			sc.setEndpoint(KitechContextUtil.getUserId());
		}
		return this.apprFuncDAO.searchWorkTotCnt(sc);
	}

	/**
	 * 결재반려함, 작성중문서함 검색조건
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.09.14.
	 */
	public List<IntfatabVo> searchClsfWorkList(AprScVo sc) throws KitechException, BpmException {
		switch (sc.getSearchClsf()) {
		case "appName":
			sc.setAppname(sc.getSearchData());
			break;
		case "docId":
			sc.setReqNo(sc.getSearchData());
			break;
		case "title":
			sc.setInfoCd(sc.getSearchData());
			break;
		case "initiator":
			sc.setInitiatorNm(sc.getSearchData());
			break;
		case "accntNo":
			sc.setExt1Cd(sc.getSearchData());
			break;
		case "all":
			sc.setReqNo(sc.getSearchData());
			sc.setInfoCd(sc.getSearchData());
			break;
		default:
			// 전체검색
			break;
		}
		if (StringUtils.isEmpty(sc.getEndpoint())) {
			sc.setEndpoint(KitechContextUtil.getUserId());
		}
		return this.apprFuncDAO.searchWorkList(sc);
	}

	/**
	 * 결재반려함, 작성중문서함 검색조건(count)
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.09.14.
	 */
	public int searchClsfWorkTotCnt(AprScVo sc) throws KitechException, BpmException {
		switch (sc.getSearchClsf()) {
		case "appName":
			sc.setAppname(sc.getSearchData());
			break;
		case "docId":
			sc.setReqNo(sc.getSearchData());
			break;
		case "title":
			sc.setInfoCd(sc.getSearchData());
			break;
		case "initiator":
			sc.setInitiatorNm(sc.getSearchData());
			break;
		case "accntNo":
			sc.setExt1Cd(sc.getSearchData());
			break;
		case "all":
			sc.setReqNo(sc.getSearchData());
			sc.setInfoCd(sc.getSearchData());
			break;
		default:
			// 전체검색
			break;
		}
		if (StringUtils.isEmpty(sc.getEndpoint())) {
			sc.setEndpoint(KitechContextUtil.getUserId());
		}
		return this.apprFuncDAO.searchWorkTotCnt(sc);
	}

	/**
	 * BPM 상세조회(Get)를 하기 위한 파라미터를 설정하여 반환한다. - BPM Key (instId, taskId, trcTag) 가 없는
	 * 경우 WorkList 조회하여 반환 - 존재한다면 BpmRequest 객체로 빌더하여 반환
	 * 
	 * @param aprScVo
	 * @return
	 * @throws Exception
	 */
	public BpmRequest getParameterForGet(AprScVo aprScVo) throws Exception {

		BpmRequest result = null;

		// 화면에서 InstId, TaskId, Trctag 가져 왔으면 해당 값으로 조회 한다.
		if (StringUtils.isEmpty(aprScVo.getInstId()) || StringUtils.isEmpty(aprScVo.getTaskId()) || StringUtils.isEmpty(aprScVo.getTrctag())) {
			// 기존 만들어진 REQ_NO가 존재 할 경우 InstId, TaskId, Trctag 값을 시작전에 넣어줘야 재성성을 막음
			BpmResult getResInit = this.bpmGetWorks.execute(this.getWorkList(aprScVo));
			List<ApiResult> apiResults = getResInit.getApiResults();

			if (CollectionUtils.isEmpty(apiResults)) {
				throw new BpmException(Exceptions.ERROR, Business.APR, "시스템 오류: WorkList 조회의 응답 데이터가 없음!!");
			}

			ApiWorkResult workResult = (ApiWorkResult) apiResults.stream().findFirst()
					.orElseThrow(() -> new BpmException(Exceptions.ERROR, Business.APR, "시스템 오류: WorkList 항목이 존재하지 않음!!"));
			result = this.getDetailData(aprScVo, workResult.getInstId().toString(), workResult.getTaskId().toString(), workResult.getTrctag());

		} else {
			// 화면에서 InstId, TaskId, Trctag 가져 왔으면 해당 값으로 조회 한다.
			result = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(aprScVo.getInstId()).taskId(aprScVo.getTaskId())
					.trcTag(aprScVo.getTrctag()).build();
		}
		return result;
	}

	/**
	 * 결재 라인수 확인
	 * 
	 * @param
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	public int getApprovalLineConunt(AprWorkVo aprWorkVo) throws KitechException, BpmException {
		try {
			// 기존 만들어진 REQ_NO가 존재 할 경우 InstId, TaskId, Trctag 값을 시작전에 넣어줘야 재성성을 막음
			AprScVo aprScVo = new AprScVo();

			// BPM 코어 파라미터 객체 생성
			String procDefAlias = null;
			if (StringUtils.equals("F61", aprWorkVo.getInstAlias())) {
				procDefAlias = "F61";
			} else {
				procDefAlias = apprCommonDAO.selectGetMainKey(aprWorkVo.getInstName().substring(0, 3));
			}

			if (StringUtils.isEmpty(procDefAlias))
				procDefAlias = "F61"; // Null일경우 넣어주기(InstId, TaskId, Trctag 으로 결정되기때문에 큰 의미가 없음) 에러 방지
			aprScVo.setProcDefAlias(procDefAlias);
			aprScVo.setEndpoint(aprWorkVo.getEndpoint());
			BpmRequest bpmReq = getDetailData(aprScVo, Integer.toString(aprWorkVo.getInstId()), Integer.toString(aprWorkVo.getTaskId()), aprWorkVo.getTrctag());

			// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
			// taskId, trcTag 값 입력후 호출
			BpmResult getRes = this.bpmGetInstance.execute(bpmReq);

			ApiGetResult apiResult = (ApiGetResult) getRes.getApiResult();

			AppLineInfo appLineInfo = apiResult.getAppLineInfo();
			// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
			if (null != appLineInfo) {
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
				return null == approvalLineInfos ? 0 : approvalLineInfos.size();
			}
		} catch (Exception ex) {
			AppLog.error("ApprFuncServiceImpl-Exception", ex);
			throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0004", ex); // 기타 에러 메시지....
		}
		return 0;

	}

	/**
	 * 모바일 작성중문서함(count)
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.07.13.
	 */
	public int searchMbiWorkTotCnt(AprScVo sc) throws KitechException, BpmException {
		if (StringUtils.isEmpty(sc.getEndpoint())) {
			sc.setEndpoint(KitechContextUtil.getUserId());
		}

		return this.apprFuncDAO.searchMbiWorkTotCnt(sc);
	}

	/**
	 * 모바일 작성중문서함
	 * 
	 * @param AprScVo
	 * @return int
	 * @author 박병목
	 * @since 2022.07.13.
	 */
	public List<IntfatabVo> searchMbiWorkList(AprScVo sc) throws KitechException, BpmException {
		if (StringUtils.isEmpty(sc.getEndpoint())) {
			sc.setEndpoint(KitechContextUtil.getUserId());
		}

		return this.apprFuncDAO.searchMbiWorkList(sc);
	}

	public void formInit(String reqNo) throws KitechException, BpmException {
		this.formInit(reqNo, null, null);
	}

	public void formInit(String reqNo, String serviceId, String userid) throws KitechException, BpmException {
		this.apprCommonService.createAprInterface(reqNo, serviceId, userid);
	}
	
	public void formInit(String reqNo, String serviceId, String userid, String infoCd) throws KitechException, BpmException {
		this.apprCommonService.createAprInterface(reqNo, serviceId, userid, infoCd);
	}
	
	public int formRemove(String reqNo) throws KitechException, BpmException {
		return this.formRemove(reqNo, false);
	}

	public int formRemove(String reqNo, boolean isEln) throws KitechException, BpmException {
		return this.apprCommonService.deleteApr(reqNo, isEln, true);
	}

	public int formRemove(String reqNo, boolean isEln, boolean isBpm) throws KitechException, BpmException {
		return this.apprCommonService.deleteApr(reqNo, isEln, isBpm);
	}

	public String isSnapYn(AprWorkVo aprWorkVo) throws KitechException, BpmException {
		String xslYn = "N";

		// BPM 코어 파라미터 객체 생성
		if (StringUtils.equals("F61", aprWorkVo.getInstAlias())) {
			aprWorkVo.setDefAlias("F61");
		} else {
			aprWorkVo.setDefAlias(apprCommonDAO.selectGetMainKey(aprWorkVo.getInstName().substring(0, 3)));
		}

		Map<String, String> xslMap = this.apprCommonDAO.searchXslUrl(aprWorkVo.getDefAlias().substring(0, 3));
		if (null != xslMap && StringUtils.isNotEmpty(xslMap.get("xslUrl"))) {
			xslYn = "Y";
		}
		return xslYn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * kr.re.kitech.biz.apr.service.ApprFuncService#approvalScreen(kr.re.kitech.biz.
	 * apr.vo.AprVo)
	 */
	@Override
	public void approvalScreen(AprVo aprVo) throws KitechException, BpmException {
		this.approvalScreen(aprVo, aprVo.getSnap());

	}

	/**
	 * 결재 승인 다건 처리 인터페이스 메소드
	 *
	 * @param aprWorkListVo
	 * @throws KitechException
	 * @throws BpmException
	 */
	@Override
	public void formAccepts(AprTaskListVo aprTaskListVo) throws KitechException, BpmException {

		if (null != aprTaskListVo && CollectionUtils.isNotEmpty(aprTaskListVo.getAprTaskVoList())) {
			for (AprTaskVo aprTaskVo : aprTaskListVo.getAprTaskVoList()) {

				// AprVo 데이터 설정
				AprVo aprVo = new AprVo();
				aprVo.setReqNo(aprTaskVo.getReqNo());
				aprVo.setEndpoint(aprTaskVo.getEndPoint());

				// AprScVo 데이터 설정
				AprScVo aprScVo = new AprScVo();
				aprScVo.setReqNo(aprTaskVo.getReqNo());
				aprScVo.setEndpoint(aprTaskVo.getEndPoint());
				aprScVo.setProcDefAlias(aprTaskVo.getAlias());

				// BPM 키 데이터 설정
				aprScVo.setInstId(aprTaskVo.getInstanceId());
				aprScVo.setTaskId(aprTaskVo.getTaskId());
				aprScVo.setTrctag(aprTaskVo.getTrcTag());

				this.formAccept(aprVo, aprScVo);
			}
		}
	}

	/**
	 * 결재 승인 인터페이스 메소드
	 * 
	 * @param AprVo
	 *            aprVo
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	@Override
	public void formAccept(AprVo aprVo) throws KitechException, BpmException {
		this.formAccept(aprVo, null);
	}

	/**
	 * 결재신청
	 * 
	 * @param AprVo
	 *            aprVo, Object model
	 * @return String
	 * @author parkbm
	 * @throws BpmException
	 * @since 2022.07.13.
	 */
	@Override
	public void approvalRequest(AprVo aprVo, Object model) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		try {
			String reqNoOri = aprVo.getReqNo();
			bpmReq = this.approvalForward(aprVo, BpmServiceType.START);
			postRes = this.bpmPostInstance.execute(bpmReq);

			// 서브 ReqNo로 다시 변경(메인키가 변경 될 경우 예외처리)
			aprVo.setReqNo(reqNoOri);

			IntfatabVo intfatabVoInst = apprCommonService.getXomxintfatab(aprVo.getReqNo());

			// 인터페이스 테이블 데이터 없을 때의 보강 로직
			if (null == intfatabVoInst || StringUtils.isEmpty(intfatabVoInst.getReqNo())) {
				this.formInit(aprVo.getReqNo());
				intfatabVoInst = apprCommonService.getXomxintfatab(aprVo.getReqNo());
			}

			// 결재신청 할 경우 결재반려함, 결재회수일경우 intfatab 변경하지 않음
			if (!AprState.WAIT_WITHDRAW.getCode().equals(intfatabVoInst.getAprState()) && !AprState.WAIT_REJECT.getCode().equals(intfatabVoInst.getAprState())) {
				// intfatab 저장
				this.apprCommonService.modifyAprInterfaceAddInfo(aprVo.getReqNo(), AprState.WAIT_WRITE.getCode(), aprVo.getEndpoint(), aprVo.getInfoCd());
			}

			if (null != model) {
				if (StringUtils.equals("P81", aprVo.getReqNo().substring(0, 3)) || StringUtils.equals("P32", aprVo.getReqNo().substring(0, 3))) {
					// 스냅샷 생성 makeSnapshot - AprScVo 직접적으로 호출
					AprScVo aprScVo = new AprScVo();
					aprScVo.setReqNo(aprVo.getReqNo());
					aprScVo.setOrderType(aprVo.getOrderType());
					aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprVo.getReqNo().substring(0, 3)));
					aprScVo.setMergeXsl(aprVo.isMergeXsl());
					this.apprCommonService.makeSnapshot(aprScVo, model);
				} else {
					// 스냅샷 생성
					this.apprCommonService.makeSnapshot(aprVo.getReqNo(), model);
				}
			}

		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-approvalRequest()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0003", ex);
			}
		}
	}

	/**
	 * 결재신청(Type2)
	 * 
	 * @param AprVo
	 *            aprVo, Object model
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	@Override
	public void approvalScreen(AprVo aprVo, Object model) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		try {

			// 인터페이스 테이블 데이터 없을 때의 보강 로직
			IntfatabVo intfatabVoInst = apprCommonService.getXomxintfatab(aprVo.getReqNo());
			if (null == intfatabVoInst || StringUtils.isEmpty(intfatabVoInst.getReqNo())) {
				this.formInit(aprVo.getReqNo());
			}

			if (StringUtils.equals(aprVo.getMainKey(), aprVo.getReqNo()) || aprVo.isExistSnap()) {
				bpmReq = this.approvalForward(aprVo, BpmServiceType.START);
				postRes = this.bpmPostInstance.execute(bpmReq);

				if (null != model && aprVo.isExistSnap()) {
					this.apprCommonService.makeSnapshot(aprVo.getReqNo(), model);
				}
			}

			bpmReq = this.approvalForward(aprVo, BpmServiceType.COMPLET);
			postRes = this.bpmPostInstance.execute(bpmReq);

			// 다음 없무가 없을 경우에는 XAD100을 넣는 로직 추가
			ApiPostResult result = (ApiPostResult) postRes.getApiResult();

			List<NextWork> nextWorks = result.getNextWorks();
			if (nextWorks == null && StringUtils.equals("Completed", result.getInstStatus())) {
				aprVo.setAprState(AprState.COMPLATE.getCode());
				// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
				ApiGetResult apiResultT = (ApiGetResult) bpmReq.getApiResult();
				if (null != apiResultT.getAppLineInfo()) {
					// Eleacainfo 최신 조회 후 저장
					BpmRequest bpmReqElec = new BpmRequest.Builder(aprVo.getProcDefAlias()).endpoint(aprVo.getEndpoint()).instanceId(apiResultT.getInstanceId())
							.taskId(apiResultT.getCurrentActivity().getTaskId()).trcTag(apiResultT.getCurrentActivity().getTrcTag()).build();
					BpmResult getResElec = this.bpmGetInstance.execute(bpmReqElec);
					ApiGetResult apiResultElec = (ApiGetResult) getResElec.getApiResult();
					setElecappinfo(aprVo.getReqNo(), apiResultElec.getAppLineInfo(), apiResultElec.getMasterAppLineInfo());
				}

				// TODO 통프 종료시 후처리 발생되는 이슈 해결 필요(서브랑 같이 후처리 2번 진행)
				// if (null != apiResultT.getAlias() && apiResultT.getAlias().length() < 4) { //
				// 통프일경우에는 제외
				// 결재최종완료 후처리
				ApiBpmVo param = new ApiBpmVo();
				param.setReqNo(aprVo.getReqNo());
				param.setAprState(AprState.COMPLATE.getCode());
				param.setSyspayno(KitechContextUtil.getSyspayno());
				this.bpmPostService.executePostProcess(param);

				String initiator = this.getInitiator(apiResultT);

				// 완료 메일 발송
				// AprScVo 데이터 설정
				AprScVo aprScVo = new AprScVo();
				aprScVo.setReqNo(aprVo.getReqNo());
				aprScVo.setProcDefAlias(apiResultT.getAlias());
				this.sendAprMail(initiator, apiResultT, aprScVo);
				// }
			} else {
				if (null != nextWorks) {
					// 다음 업무가 있을 경우 Endpoint를 넣어준다.(Endpoint는 모든 사람들을 넣어준다. ex)user1;user2;user3;)
					String endpointNext = "";
					for (NextWork nextWork : nextWorks) {
						if (endpointNext.equals("")) {
							endpointNext = nextWork.getEndpoint();
						} else {
							endpointNext = endpointNext + ";" + nextWork.getEndpoint();
						}
					}
					aprVo.setEndpoint(endpointNext);
					aprVo.setAprState(nextWorks.get(0).getTaskExt2());
				}
			}

			if (null == aprVo.getAprState()) {
				// throw new KitechException(Exceptions.ERROR, Business.APR,
				// "message.error.apr.com.0001");
				throw new Exception();
			}

			// 결의확정 결재(F61)는 변경
			if ("F61".equals(aprVo.getReqNo())) {
				aprVo.setReqNo(aprVo.getSlipNo());
			}

			// intfatab 저장
			this.apprCommonService.modifyAprInterfaceAddInfo(aprVo.getReqNo(), aprVo.getAprState(), aprVo.getEndpoint(), aprVo.getInfoCd());
		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-approvalScreen()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0003", ex);
			}
		}
	}

	/**
	 * 결재 상신
	 * 
	 * @param AprSnapReqVo(AprVo,
	 *            List<UserVo>) 결지기본정보(AprVo aprVo), 결제선 사용자 정보(List<UserVo> users)
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	public void formSubmit(AprScVo aprScVo, List<AprUserVo> users) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		ApiGetResult apiResult = null;
		try {
			// 1. BPM 코어 파라미터 객체 생성
			if (aprScVo.getProcDefAlias() == null || "".equals(aprScVo.getProcDefAlias())) {
				aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprScVo.getReqNo().substring(0, 3)));
			}

			// 상신 제약 처리
			AprConstraint constraint = AprUtil.getConstaint(AprAction.SUBMIT, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
			if (constraint.isExist()) {
				throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
			}

			// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
			BpmRequest bpmReqInit = getWorkList(aprScVo);
			BpmResult getResInit = this.bpmGetWorks.execute(bpmReqInit);
			List<ApiResult> apiResults = getResInit.getApiResults();

			// 기존 만들어진 REQ_NO가 존재 할 경우 InstId, TaskId, Trctag 값을 시작전에 넣어줘야 재성성을 막음
			if (apiResults.size() > 0) {
				ApiWorkResult workResult = (ApiWorkResult) apiResults.stream().findFirst().orElseThrow(() -> new Exception("WorkList 가 존재하지 않음"));
				bpmReq = getDetailData(aprScVo, workResult.getInstId().toString(), workResult.getTaskId().toString(), workResult.getTrctag());
				// Eleacainfo 등록시 InstId, TaskId, Trctag 값을 넣고 재조회시 필요
				aprScVo.setInstId(workResult.getInstId().toString());
				aprScVo.setTaskId(workResult.getTaskId().toString());
				aprScVo.setTrctag(workResult.getTrctag());
			}
			// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
			// taskId, trcTag 값 입력후 호출
			BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
			apiResult = (ApiGetResult) getRes.getApiResult();

			// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
			if (null != apiResult.getAppLineInfo()) {
				AppLineInfo appLineInfo = apiResult.getAppLineInfo();
				/** 결재 라인 추가 */
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();

				if (null != approvalLineInfos) {
					// 시작자를 제외한 모든 사람 초기화
					ApprovalLineInfo approvalLineInfo = approvalLineInfos.get(0);
					approvalLineInfos.removeAll(approvalLineInfos);
					approvalLineInfos.add(approvalLineInfo);
				}

				int index = 0;
				int indexAuto = 0;
				for (AprUserVo user : users) {
					if (index > 0) { // 최초는 Initiator이기 때문에 두번째부터 적용
						String str = AprMapper.APPROVAL.getCode();
						String autoYn = null;
						String reqNo = aprScVo.getReqNo();
						
						switch (user.getApld_apltype()) {
						case "AUDIT": // 감사일 경우
							// 외부강의신고서(대외활동신고서) 일 경우 감사는 행동강령책임관으로 변경 2023.12.19 이민기 팀장 요청
							if (reqNo != null && StringUtils.contains(reqNo.substring(0, 3), "C68")) {
								str = AprMapper.CONDUCT.getCode();
							} else {
								str = AprMapper.AUDIT.getCode();
							}
							break;
						case "COOPERATION": // 협조일 경우
							str = AprMapper.COOPERATION.getCode();
							break;
						case "CONDUCT": // 행동강령책임관일 경우
							str = AprMapper.CONDUCT.getCode();
							break;
						case "ARBITRARY_DECISION": // 전결일경우는 APPROVAL에 AutoApproval만 변경(두번째부터 Y 적용)
							if (indexAuto > 0) {
								autoYn = "Y";
							}
							indexAuto++;
							break;
						default:
							break;
						}
						List<RoleMapping> roleMappings = new ArrayList<>();
						roleMappings.add(new RoleMapping().withAssignType(0).withEndpoint(user.getEmpcode()).withEndpointName(user.getEmpname()).withAutoApproval(autoYn));
						approvalLineInfos.add(new ApprovalLineInfo().withApprType(str).withRole(new Role().withRoleMapping(roleMappings)));
					}
					index++;
				}
			}

			// 현재업무가 경합일 경우 체크
			if (null != apiResult.getCurrentActivity()) {
				CurrentActivity currentActivity = apiResult.getCurrentActivity();
				// TRUE 일경우 현재 경합상태 이므로 나머지 사용자는 제거
				if (currentActivity.getIsRacing()) {
					// 프로세스 Manager만 변경
					if (null != apiResult.getProcessRoles()) {
						List<ProcessRole> processRoles = this.processRoleMapperForRacing(apiResult.getProcessRoles(), currentActivity.getRole());
						apiResult.setProcessRoles(processRoles);
					}
				}
			}

			// 시작자와 계정책임자 세팅
			if (apiResult.getProcessVariables() != null && apiResult.getProcessRoles() != null) {
				if (StringUtils.equals("[Y]", this.procWrkAutoVarMap(apiResult.getProcessVariables()))) {
					apiResult.setProcessRoles(this.processRoleMapperNextAccount(apiResult.getProcessRoles()));
				}
			}

			// AutoCmpltMan 자동결재
			apiResult.setProcessRoles(this.processRoleAutoCmpltMan(apiResult.getProcessRoles()));

			String nextApprSyspayNo = null;
			if (null != apiResult.getAppLineInfo()) {
				AppLineInfo appLineInfo = apiResult.getAppLineInfo();
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
				if (null != approvalLineInfos) {
					// 차상위자 넣기
					nextApprSyspayNo = getUpApprSyspayNo(approvalLineInfos);
				}
			}

			// 프로세스 Role
			if (!StringUtils.isEmpty(nextApprSyspayNo) && apiResult.getProcessRoles() != null) {
				List<ProcessRole> processRoles = this.processRoleMapperNextAuto(apiResult.getProcessRoles(), nextApprSyspayNo);
				apiResult.setProcessRoles(processRoles);
			}

			// 값 세팅 후 POST /rest/bpm/process-instances/{serviceType} 호출
			bpmReq = getWorkList(aprScVo);
			bpmReq.setServiceType(BpmServiceType.COMPLET);
			bpmReq.setApiResult(apiResult);
			postRes = this.bpmPostInstance.execute(bpmReq);

			// 다음 없무 넣기
			ApiPostResult result = (ApiPostResult) postRes.getApiResult();

			// 결재의견이 존재 할 경우 결재의견을 doc_comments에 INSERT
			UserVo user = accntService.findUserByUsername(aprScVo.getEndpoint());
			if (!StringUtils.isEmpty(aprScVo.getComments())) {
				apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), aprScVo.getComments(), "top", aprScVo.getEndpoint(), user.getCn(), "", aprScVo.getEndpoint(),
						aprScVo.getEndpoint());
			} else {
				apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), "상신", "top", aprScVo.getEndpoint(), user.getCn(), "", aprScVo.getEndpoint(), aprScVo.getEndpoint());
			}

			List<NextWork> nextWorks = result.getNextWorks();

			if (nextWorks == null && StringUtils.equals("Completed", result.getInstStatus())) {
				aprScVo.setAprState(AprState.COMPLATE.getCode());
				// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
				if (null != apiResult.getAppLineInfo()) {
					// Eleacainfo 최신 조회 후 저장
					BpmRequest bpmReqElec = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(aprScVo.getInstId())
							.taskId(aprScVo.getTaskId()).trcTag(aprScVo.getTrctag()).build();
					BpmResult getResElec = this.bpmGetInstance.execute(bpmReqElec);
					ApiGetResult apiResultElec = (ApiGetResult) getResElec.getApiResult();
					setElecappinfo(aprScVo.getReqNo(), apiResultElec.getAppLineInfo(), apiResultElec.getMasterAppLineInfo());
				}

				// TODO 통프 종료시 후처리 발생되는 이슈 해결 필요(서브랑 같이 후처리 2번 진행)
				// if (null != apiResult.getAlias() && apiResult.getAlias().length() < 4) { //
				// 통프일경우에는 제외
				// 결재최종완료 후처리
				ApiBpmVo param = new ApiBpmVo();
				param.setReqNo(aprScVo.getReqNo());
				param.setAprState(AprState.COMPLATE.getCode());
				param.setSyspayno(KitechContextUtil.getSyspayno());
				this.bpmPostService.executePostProcess(param);

				String initiator = this.getInitiator(apiResult);

				// 완료 메일 발송
				this.sendAprMail(initiator, apiResult, aprScVo);
				// }

			} else {
				if (nextWorks != null) {
					// 다음 업무가 있을 경우 Endpoint를 넣어준다.(Endpoint는 모든 사람들을 넣어준다. ex)user1;user2;user3;)
					String endpointNext = "";
					for (NextWork nextWork : nextWorks) {
						if (endpointNext.equals("")) {
							endpointNext = nextWork.getEndpoint();
						} else {
							endpointNext = endpointNext + ";" + nextWork.getEndpoint();
						}
					}
					aprScVo.setEndpoint(endpointNext);
					aprScVo.setAprState(nextWorks.get(0).getTaskExt2());
				}
			}

			// 결의확정 결재(F61)는 변경
			if ("F61".equals(aprScVo.getReqNo())) {
				aprScVo.setReqNo(aprScVo.getSlipNo());
			}

			// intfatab 저장
			this.apprCommonService.modifyAprInterfaceAddInfo(aprScVo.getReqNo(), aprScVo.getAprState(), aprScVo.getEndpoint(), aprScVo.getInfoCd());
		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formSubmit()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0004", ex);
			}
		}
	}

	/**
	 * 예외 #1: 세션의 사용자로 강제 전달 처리 및 WorkList 재조회
	 * 
	 * @param aprScVo
	 * @return
	 * @throws Exception
	 * @author James
	 */
	private List<ApiResult> getWorksAfterFormDelegate(AprScVo aprScVo) throws Exception {

		// 1. endpoint 제거후 조회
		aprScVo.setEndpoint("");
		BpmResult response = this.bpmGetWorks.execute(this.getWorkList(aprScVo));
		List<ApiResult> apiResults = response.getApiResults();
		ApiWorkResult workResult = (ApiWorkResult) apiResults.stream().findFirst().orElseThrow(() -> new Exception("WorkList 가 존재하지 않음"));

		// 2. endpoint 세션 ID로 재설정 후 해당 사용자로 강제 전달 처리
		List<AprTaskVo> list = new ArrayList<>();
		AprTaskVo aprTaskVo = new AprTaskVo();
		aprTaskVo.setReqNo(aprScVo.getReqNo());
		aprTaskVo.setEndPoint(workResult.getEndpoint());
		aprTaskVo.setInstanceId(workResult.getInstId().toString());
		aprTaskVo.setTaskId(workResult.getTaskId().toString());
		aprTaskVo.setTrcTag(workResult.getTrctag());
		list.add(aprTaskVo);
		AprTaskListVo aprTaskListVo = new AprTaskListVo();

		// 2-1) 위임받을 대상자 지정
		aprTaskListVo.setEmpcode(KitechContextUtil.getUserId());
		aprTaskListVo.setEmpname(KitechContextUtil.getName());

		// 2-2) 위에서 조회한 위임할 건 지정
		aprTaskListVo.setAprTaskVoList(list);

		AppLog.info("+:+:+:+:+:+:+:+:+:+:+ [자동위임처리] +:+:+:+:+:+:+:+:+:+:+\n", aprTaskVo);
		this.formDelegate(aprTaskListVo);

		// 3. WorkList 재조회 : endpoint 가 세션사용자임
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		response = this.bpmGetWorks.execute(this.getWorkList(aprScVo));
		return response.getApiResults();
	}
	
	/**
	 * 예외 #2: 기본파라미터 + InstanceStatus=Completed 로 BPM 완료된 건이 있는지 확인
	 * @param aprScVo
	 * @return
	 * @throws Exception
	 */
	private boolean isExistComplateInstance(AprScVo aprScVo, String prevUid) throws Exception {
		BpmResult bpmResult = this.bpmGetWorks.execute(
			new BpmRequest.Builder(aprScVo.getProcDefAlias())
			.endpoint(prevUid).instName(aprScVo.getReqNo())
			.taskStatus(AprMapper.TASK_COMPLATE.getCode())
			.proc("").pageNum(aprScVo.getPageIndex()).pageSize(10).build()
		);
		if (null != bpmResult && CollectionUtils.isNotEmpty(bpmResult.getApiResults())) {
		
			List<ApiWorkResult> tasks = new ArrayList<>();
			List<ApiResult> results = bpmResult.getApiResults();
			results.forEach( result -> {
				tasks.add((ApiWorkResult)result);
			});
			
			return tasks.stream().filter( task -> task.getInstId().equals(task.getRootInstId())).findFirst().isPresent();
		}
		
		return false;
	}

	/**
	 * 결재 승인 처리를 위한 내부 메소드
	 * 
	 * @param aprVo
	 * @param aprScVo
	 * @throws KitechException
	 * @throws BpmException
	 */
	private void formAccept(AprVo aprVo, AprScVo aprScVo) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		ApiGetResult apiResult = null;
		try {
			// 1. BPM 코어 파라미터 객체 생성
			if (aprVo.getProcDefAlias() == null || "".equals(aprVo.getProcDefAlias())) {
				aprVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprVo.getReqNo().substring(0, 3)));
			}

			// 결의확정 결재(F61)는 변경
			if ("F61".equals(aprVo.getReqNo())) {
				aprVo.setReqNo(aprVo.getSlipNo());
			}

			// 공통값 세팅 후 AprScVo에 검색VO 담기
			aprScVo = null == aprScVo ? AprUtil.buildSc(aprVo) : aprScVo;

			// 승인 제약 처리
			AprConstraint constraint = AprUtil.getConstaint(AprAction.ACCEPT, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
			if (constraint.isExist()) {
				throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
			}

			// TaskExt1에 화면ID를 넣어 병렬일경우 특정건만 complete 될 수 있도록 한다.
			aprScVo.setTaskExt1(StringUtils.isNotEmpty(aprVo.getTaskExt1()) ? aprVo.getTaskExt1() : aprVo.getUiId());
			// 퇴직신청 조회값 추가
			if (StringUtils.isNotEmpty(aprVo.getTaskExt3()))
				aprScVo.setTaskExt3(aprVo.getTaskExt3());
			aprScVo.setTaskStatus(AprMapper.TASK_NEW.getCode());

			// 화면에서 InstId, TaskId, Trctag 가져 왔으면 해당 값으로 조회 한다.
			if (StringUtils.isNotEmpty(aprScVo.getInstId()) && StringUtils.isNotEmpty(aprScVo.getTaskId()) && StringUtils.isNotEmpty(aprScVo.getTrctag())) {
				bpmReq = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(aprScVo.getInstId()).taskId(aprScVo.getTaskId())
						.trcTag(aprScVo.getTrctag()).build();
			} else {
				// 기존 만들어진 REQ_NO가 존재 할 경우 InstId, TaskId, Trctag 값을 시작전에 넣어줘야 재성성을 막음
				BpmResult getResInit = this.bpmGetWorks.execute(getWorkList(aprScVo));
				List<ApiResult> apiResults = getResInit.getApiResults();

				// 워크리스트가 없을 때 예외 처리 대상이 된다.
				if (CollectionUtils.isEmpty(apiResults)) {

					// 2023-06-26, James, BPM 스킵 예외 대상인지 확인, 서로 상충되는 부분이 있어 아래 로직과 순서 변경을 금지한다.
					if (exceptService.isExcept(ExceptKind.AUTO_BPM_SKIP, aprVo.getUiId(), aprScVo.getReqNo().substring(0, 3))) {
						if (0 < this.apprFuncDAO.getBpmInstComplateCount(aprScVo)) {
							// 해당 인스턴번호로 이미 완료된 건이 존재하면 즉시 종료 
							return;
						}
					}

					// 2023-05-26, James, 자동전달신청서 예외 대상인지 확인 -> 세션 사용자로 전달 후 재조회
					if (exceptService.isExcept(ExceptKind.AUTO_DELEGATE, aprVo.getUiId(), aprScVo.getReqNo().substring(0, 3))) {
						apiResults = this.getWorksAfterFormDelegate(aprScVo);
						aprScVo.setEndpoint(KitechContextUtil.getUserId());
					}
				}

				ApiWorkResult workResult = (ApiWorkResult) apiResults.stream().findFirst().orElseThrow(() -> new Exception("WorkList 가 존재하지 않음"));
				bpmReq = this.getDetailData(aprScVo, workResult.getInstId().toString(), workResult.getTaskId().toString(), workResult.getTrctag());
				// Eleacainfo 등록시 InstId, TaskId, Trctag 값을 넣고 재조회시 필요
				aprScVo.setInstId(workResult.getInstId().toString());
				aprScVo.setTaskId(workResult.getTaskId().toString());
				aprScVo.setTrctag(workResult.getTrctag());
			}

			// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
			// taskId, trcTag 값 입력후 호출
			BpmResult getRes = this.bpmGetInstance.execute(bpmReq);

			apiResult = (ApiGetResult) getRes.getApiResult();
			apiResult = apiResultSet(apiResult, aprVo);
			
			// 현재업무가 경합일 경우 체크
			if (null != apiResult.getCurrentActivity()) {
				CurrentActivity currentActivity = apiResult.getCurrentActivity();
				// TRUE 일경우 현재 경합상태 이므로 나머지 사용자는 제거
				if (currentActivity.getIsRacing()) {
					// 프로세스 Manager만 변경
					if (null != apiResult.getProcessRoles()) {
						List<ProcessRole> processRoles = this.processRoleMapperForRacing(apiResult.getProcessRoles(), currentActivity.getRole());
						apiResult.setProcessRoles(processRoles);
					}
				}
			}

			if (null != apiResult.getAppLineInfo()) {
				AppLineInfo appLineInfo = apiResult.getAppLineInfo();
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
				if (null != approvalLineInfos) {
					for (ApprovalLineInfo approvalLineInfo : approvalLineInfos) {
						if (StringUtils.equals("감사", approvalLineInfo.getName())) {
							approvalLineInfo.setApprType("audit");
						}
					}

					// 차상위자 넣기
					aprVo.setNextApprSyspayNo(getUpApprSyspayNo(approvalLineInfos));
				}
			}

			// 프로세스 Role
			if (apiResult.getProcessRoles() != null) {
				List<ProcessRole> processRoles = this.processRoleMapper(apiResult.getProcessRoles(), aprVo);
				apiResult.setProcessRoles(processRoles);
			}

			// 반려가 된 상태가 있을 수 있으므로 반려 상태는 승인일시에 무조건 'N'으로 초기화
			aprVo.setRejectYN("N");

			// 프로세스 Variable
			if (apiResult.getProcessVariables() != null) {
				List<ProcessVariable> ProcessVariables = this.processVariableMapper(apiResult.getProcessVariables(), aprVo);
				apiResult.setProcessVariables(ProcessVariables);
			}

			bpmReq.setServiceType(BpmServiceType.COMPLET);
			bpmReq.setApiResult(apiResult);
			postRes = this.bpmPostInstance.execute(bpmReq);

			// 예통자 반려 XAD040일때 실행
			IntfatabVo intfatabVo = apprCommonService.getXomxintfatab(aprVo.getReqNo());
			if (StringUtils.equals(AprState.ING_CTRL.getCode(), intfatabVo.getAprState())) {
				aprBugtCtrlService.updateDecsnReject(aprVo.getReqNo(), "Y");
			}

			// 결재의견이 존재 할 경우 결재의견을 doc_comments에 INSERT
			if (!StringUtils.isEmpty(aprVo.getComments())) {
				UserVo user = accntService.findUserByUsername(aprVo.getEndpoint());
				apprCommonService.insertDocCommentsStr("", aprVo.getReqNo(), aprVo.getComments(), "report", aprVo.getEndpoint(), user.getCn(), "", aprVo.getEndpoint(),
						aprVo.getEndpoint());
			}

			// 다음 없무가 없을 경우에는 XAD100을 넣는 로직 추가
			ApiPostResult result = (ApiPostResult) postRes.getApiResult();

			List<NextWork> nextWorks = result.getNextWorks();
			if (nextWorks == null && StringUtils.equals("Completed", result.getInstStatus())) {
				aprVo.setAprState(AprState.COMPLATE.getCode());
				// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
				if (null != apiResult.getAppLineInfo()) {
					// Eleacainfo 최신 조회 후 저장
					BpmRequest bpmReqElec = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(aprScVo.getInstId())
							.taskId(aprScVo.getTaskId()).trcTag(aprScVo.getTrctag()).build();
					BpmResult getResElec = this.bpmGetInstance.execute(bpmReqElec);
					ApiGetResult apiResultElec = (ApiGetResult) getResElec.getApiResult();
					setElecappinfo(aprVo.getReqNo(), apiResultElec.getAppLineInfo(), apiResultElec.getMasterAppLineInfo());
				}


				// 통프 종료시 후처리 발생되는 이슈 해결 (서브랑 같이 후처리 2번 진행되는 부분 예외 처리)
				if (aprVo.getProcDefAlias().matches("^.{3}M$") && apiResult.isMainProcess()) {
					// alias 가 없을 수 있는 사이드 이펙트가 있을 수 있으므로 통프만 예외 처리
					AppLog.info("톻프 완료 > 후처리 예외", "rootInstance: "+apiResult.getHiddenRootInstanceId() +", instance: "+apiResult.getHiddenInstanceId());

				} else {

					// 결재최종완료 후처리
					ApiBpmVo param = new ApiBpmVo();
					param.setReqNo(aprScVo.getReqNo());
					param.setAprState(AprState.COMPLATE.getCode());
					param.setSyspayno(KitechContextUtil.getSyspayno());
					this.bpmPostService.executePostProcess(param);

					String initiator = this.getInitiator(apiResult);

					// 완료 메일 발송
					this.sendAprMail(initiator, apiResult, aprScVo);
				}

			} else {
				if (null != nextWorks) {
					// 다음 업무가 있을 경우 Endpoint를 넣어준다.(Endpoint는 모든 사람들을 넣어준다. ex)user1;user2;user3;)
					String endpointNext = "";
					for (NextWork nextWork : nextWorks) {
						if (endpointNext.equals("")) {
							endpointNext = nextWork.getEndpoint();
						} else {
							endpointNext = endpointNext + ";" + nextWork.getEndpoint();
						}
					}
					aprVo.setEndpoint(endpointNext);
					aprVo.setAprState(nextWorks.get(0).getTaskExt2());
				}
			}

			if (aprVo.getAprState() == null) {
				aprVo.setAprState(AprState.ING_APPROVAL.getCode());
			}

			// 다음업무의 XAD로 시작 할 경우에만 modifyAprInterfaceAddInfo 실행 (XAD로 시작 하지 않을 경우 변경하지 않음)
			if (StringUtils.equals("XAD", aprVo.getAprState().substring(0, 3))) {
				// intfatab 저장
				this.apprCommonService.modifyAprInterfaceAddInfo(aprVo.getReqNo(), aprVo.getAprState(), aprVo.getEndpoint(), apiResult.getInfo());
			}
		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formAccept()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0005", ex);
			}
		}
	}

	/**
	 * 결재승인(라인편집)을 진행
	 * 
	 * @param AprSnapReqVo(AprVo,
	 *            List<UserVo>) 결지기본정보(AprVo aprVo), 결제선 사용자 정보(List<UserVo> users)
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	public void formAcceptLineSet(AprScVo aprScVo, List<AprUserVo> users) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		ApiGetResult apiResult = null;
		try {
			// 화면에서 InstId, TaskId, Trctag 가져 왔으면 해당 값으로 조회 한다.
			bpmReq = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(aprScVo.getInstId()).taskId(aprScVo.getTaskId())
					.trcTag(aprScVo.getTrctag()).build();

			// 승인 제약 처리
			AprConstraint constraint = AprUtil.getConstaint(AprAction.ACCEPT, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
			if (constraint.isExist()) {
				throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
			}

			// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
			// taskId, trcTag 값 입력후 호출
			BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
			apiResult = (ApiGetResult) getRes.getApiResult();

			// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
			if (null != apiResult.getAppLineInfo()) {
				AppLineInfo appLineInfo = apiResult.getAppLineInfo();
				/** 결재 라인 추가 */
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();

				if (null != approvalLineInfos) {
					// 시작자를 제외한 모든 사람 초기화
					ApprovalLineInfo approvalLineInfo = approvalLineInfos.get(0);
					approvalLineInfos.removeAll(approvalLineInfos);
					approvalLineInfos.add(approvalLineInfo);
				}

				int index = 0;
				int indexAuto = 0;
				for (AprUserVo user : users) {
					if (index > 0) { // 최초는 Initiator이기 때문에 두번째부터 적용
						String str = AprMapper.APPROVAL.getCode();
						String autoYn = null;
						switch (user.getApld_apltype()) {
						case "ARBITRARY_DECISION": // 전결일경우는 APPROVAL에 AutoApproval만 변경(두번째부터 Y 적용)
							if (indexAuto > 0) {
								autoYn = "Y";
							}
							indexAuto++;
							break;
						default:
							break;
						}
						List<RoleMapping> roleMappings = new ArrayList<>();
						roleMappings.add(new RoleMapping().withAssignType(0).withEndpoint(user.getEmpcode()).withEndpointName(user.getEmpname()).withAutoApproval(autoYn));
						approvalLineInfos.add(new ApprovalLineInfo().withApprType(str).withRole(new Role().withRoleMapping(roleMappings)));
					}
					index++;
				}
			}

			// 결재의견이 존재 할 경우 결재의견을 doc_comments에 INSERT
			if (!StringUtils.isEmpty(aprScVo.getComments())) {
				UserVo user = accntService.findUserByUsername(aprScVo.getEndpoint());
				apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), aprScVo.getComments(), "report", aprScVo.getEndpoint(), user.getCn(), "", aprScVo.getEndpoint(),
						aprScVo.getEndpoint());
			}

			bpmReq.setServiceType(BpmServiceType.COMPLET);
			bpmReq.setApiResult(apiResult);
			postRes = this.bpmPostInstance.execute(bpmReq);

			// 다음 없무가 없을 경우에는 XAD100을 넣는 로직 추가
			ApiPostResult result = (ApiPostResult) postRes.getApiResult();

			List<NextWork> nextWorks = result.getNextWorks();
			if (nextWorks == null && StringUtils.equals("Completed", result.getInstStatus())) {
				aprScVo.setAprState(AprState.COMPLATE.getCode());
				// 결재프로세스가 없는 경우 값을 받지 않아 예외처리
				if (null != apiResult.getAppLineInfo()) {
					setElecappinfo(aprScVo.getReqNo(), apiResult.getAppLineInfo(), apiResult.getMasterAppLineInfo());
				}

				// TODO 통프 종료시 후처리 발생되는 이슈 해결 필요(서브랑 같이 후처리 2번 진행)
				// if (null != apiResult.getAlias() && apiResult.getAlias().length() < 4) { //
				// 통프일경우에는 제외
				// 결재최종완료 후처리
				ApiBpmVo param = new ApiBpmVo();
				param.setReqNo(aprScVo.getReqNo());
				param.setAprState(AprState.COMPLATE.getCode());
				param.setSyspayno(KitechContextUtil.getSyspayno());
				this.bpmPostService.executePostProcess(param);
				// }

			} else {
				if (null != nextWorks) {
					// 다음 업무가 있을 경우 Endpoint를 넣어준다.(Endpoint는 모든 사람들을 넣어준다. ex)user1;user2;user3;)
					String endpointNext = "";
					for (NextWork nextWork : nextWorks) {
						if (endpointNext.equals("")) {
							endpointNext = nextWork.getEndpoint();
						} else {
							endpointNext = endpointNext + ";" + nextWork.getEndpoint();
						}
					}
					aprScVo.setEndpoint(endpointNext);
					aprScVo.setAprState(nextWorks.get(0).getTaskExt2());
				}
			}

			if (aprScVo.getAprState() == null) {
				// throw new KitechException(Exceptions.ERROR, Business.APR,
				// "message.error.apr.com.0001");
				throw new Exception();
			}

			// 다음업무의 XAD로 시작 할 경우에만 modifyAprInterfaceAddInfo 실행 (XAD로 시작 하지 않을 경우 변경하지 않음)
			if (StringUtils.equals("XAD", aprScVo.getAprState().substring(0, 3))) {
				// intfatab 저장
				this.apprCommonService.modifyAprInterfaceAddInfo(aprScVo.getReqNo(), aprScVo.getAprState(), aprScVo.getEndpoint(), apiResult.getInfo());
			}
		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formAcceptLineSet()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0015", ex);
			}
		}
	}

	/**
	 * 결재 회수
	 * 
	 * @param AprVo
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	public void formCompensate(AprScVo aprScVo) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		ApiGetResult apiResult = null;
		try {
			// 1. BPM 코어 파라미터 객체 생성
			// TO-DO 공통에서 처리
			// 공통값 세팅 후 AprScVo에 검색VO 담기
			if (aprScVo.getProcDefAlias() == null || "".equals(aprScVo.getProcDefAlias())) {
				aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprScVo.getReqNo().substring(0, 3)));
			}

			// 회수 제약 처리
			AprConstraint constraint = AprUtil.getConstaint(AprAction.WITHDRAW, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
			if (constraint.isExist()) {
				throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
			}

			if (StringUtils.isEmpty(aprScVo.getInstId()) || StringUtils.isEmpty(aprScVo.getTaskId()) || StringUtils.isEmpty(aprScVo.getTrctag())) {
				// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
				BpmRequest bpmReqInit = getWorkList(aprScVo);
				BpmResult getResInit = this.bpmGetWorks.execute(bpmReqInit);
				List<ApiResult> apiResults = getResInit.getApiResults();

				if (null != apiResults && !apiResults.isEmpty()) {
					// InstId, TaskId, Trctag 값이 존재 하므로 시작전에 넣어줘야 재성성을 막음
					ApiWorkResult workResult = (ApiWorkResult) apiResults.stream().findFirst().orElseThrow(() -> new Exception("WorkList 가 존재하지 않음"));
					bpmReq = getDetailData(aprScVo, workResult.getInstId().toString(), workResult.getTaskId().toString(), workResult.getTrctag());
				}
			} else {
				bpmReq = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(aprScVo.getInstId()).taskId(aprScVo.getTaskId())
						.trcTag(aprScVo.getTrctag()).build();
			}

			// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
			// taskId, trcTag 값 입력후 호출
			BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
			apiResult = (ApiGetResult) getRes.getApiResult();

			// GET데이터 기준으로 COMPENSATE값 넣고 실행
			bpmReq.setServiceType(BpmServiceType.COMPENSATE);
			bpmReq.setApiResult(apiResult);
			postRes = this.bpmPostInstance.execute(bpmReq);

			// 회수가 될 경우 initiator로 되돌림
			String initiator = "";
			if (null != apiResult.getAppLineInfo()) {
				AppLineInfo appLineInfo = apiResult.getAppLineInfo();

				/** 결재 라인 추가 */
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
				if (null != approvalLineInfos) {
					ApprovalLineInfo approvalLineInfo = approvalLineInfos.get(0);
					initiator = approvalLineInfo.getRole().getRoleMapping().get(0).getEndpoint();
				}
			} else {
				List<ProcessRole> processRoles = apiResult.getProcessRoles();
				if (null != processRoles) {
					initiator = processRoles.get(0).getRoleMapping().get(0).getEndpoint();
				}
			}

			// 회수 후처리
			ApiBpmVo param = new ApiBpmVo();
			param.setReqNo(aprScVo.getReqNo());
			param.setAprState(AprState.WAIT_WITHDRAW.getCode());
			param.setSyspayno(KitechContextUtil.getSyspayno());
			this.bpmPostService.executePostProcess(param);

			// 회수 시 기존 doc_comment 삭제
			apprCommonService.deleteDocComments(aprScVo.getReqNo());

			// intfatab 저장
			this.apprCommonService.modifyAprInterfaceAddInfo(aprScVo.getReqNo(), AprState.WAIT_WITHDRAW.getCode(), initiator, aprScVo.getInfoCd());

		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formCompensate()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0010", ex);
			}
		}
	}

	/**
	 * 위임(전달) 처리
	 * 
	 * @param AprVo
	 * @return String
	 * @since 2022.07.13.
	 */
	@Override
	public void formDelegate(AprTaskListVo aprTaskListVo) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		ApiGetResult apiResult = null;
		try {

			for (AprTaskVo aprTaskVo : aprTaskListVo.getAprTaskVoList()) {
				// 1. BPM 코어 파라미터 객체 생성
				// TO-DO 공통에서 처리
				// 공통값 세팅 후 AprScVo에 검색VO 담기

				AprScVo aprScVo = new AprScVo();
				if (StringUtils.equals("F61", aprTaskVo.getAlias())) {
					aprScVo.setProcDefAlias("F61");
				} else {
					aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprTaskVo.getReqNo().substring(0, 3)));
				}
				aprScVo.setReqNo(aprTaskVo.getReqNo());

				// 위임 제약 처리
				AprConstraint constraint = AprUtil.getConstaint(AprAction.DELEGATE, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
				if (constraint.isExist()) {
					throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
				}

				// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
				aprScVo.setEndpoint(aprTaskVo.getEndPoint());

				bpmReq = getDetailData(aprScVo, aprTaskVo.getInstanceId(), aprTaskVo.getTaskId(), aprTaskVo.getTrcTag());

				// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
				// taskId, trcTag 값 입력후 호출
				BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
				apiResult = (ApiGetResult) getRes.getApiResult();

				// 전달 처리
				CurrentActivity current = apiResult.getCurrentActivity();
				Role refRole = current.getRolee();
				List<RoleMapping> newRoleMappings = new ArrayList<>();
				List<RoleMapping> refRoleMappings = refRole.getRoleMapping();

				List<String> endPoints = new ArrayList<>();
				for (RoleMapping roleMapping : refRoleMappings) {
					if (aprTaskVo.getEndPoint().equals(roleMapping.getEndpoint())) {
						roleMapping.setEndpoint(aprTaskListVo.getEmpcode());
						roleMapping.setEndpointName(aprTaskListVo.getEmpname());
					}

					// 신규 생성된 롤매핑에 적제한다.
					newRoleMappings.add(roleMapping);

					// 인터페이스의 endpoint 업데이트를 위한 처리.
					endPoints.add(roleMapping.getEndpoint());
				}

				// 전달자를 설정한다.
				current.getRole().setRoleMapping(newRoleMappings);

				// GET데이터 기준으로 COMPENSATE값 넣고 실행
				bpmReq.setServiceType(BpmServiceType.DELEGATE);
				bpmReq.setApiResult(apiResult);
				postRes = this.bpmPostInstance.execute(bpmReq);

				// 예외처리 필요.

				// 공통 인터페이스 테이블 업데이트: EndPoint를 변경한다.
				IntfatabVo vo = new IntfatabVo();
				vo.setReqNo(apiResult.getName());
				vo.setEndpoints(StringUtils.join(endPoints, ";"));
				apprCommonService.modXomxintfatab(vo);

				// 전달 의견 저장 : 객체로 변경 필요.
				// apprCommonService.insertDocCommentsStr("", vo.getReqNo(), "전달", "transfer",
				// aprTaskListVo.getEmpcode(), aprTaskListVo.getEmpname(), "",
				// aprTaskListVo.getEmpcode(), aprTaskListVo.getEmpcode());

				UserVo user = accntService.findUserByUsername(KitechContextUtil.getUserId());
				apprCommonService.insertDocCommentsStr("", vo.getReqNo(), "전달", "transfer", user.getUid(), user.getCn(), "", user.getUid(), user.getUid());

			}
		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formDelegate()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0013", ex);
			}
		}
	}

	/**
	 * 결재 반려
	 * 
	 * @param AprVo
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	public void formReject(AprScVo aprScVo) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		ApiGetResult apiResult = null;
		try {
			// 1. BPM 코어 파라미터 객체 생성
			if (aprScVo.getProcDefAlias() == null || "".equals(aprScVo.getProcDefAlias())) {
				aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprScVo.getReqNo().substring(0, 3)));
			}

			// 결의확정 결재(F61)는 변경
			if ("F61".equals(aprScVo.getReqNo())) {
				aprScVo.setReqNo(aprScVo.getSlipNo());
			}

			// 반려 제약 처리
			AprConstraint constraint = AprUtil.getConstaint(AprAction.REJECT, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
			if (constraint.isExist()) {
				throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
			}

			// BPM 인스턴스NAME로 InstId, TaskId, Trctag 값이 있는지 조회
			aprScVo.setTaskStatus(AprMapper.TASK_NEW.getCode());
			BpmRequest bpmReqInit = getWorkList(aprScVo);
			BpmResult getResInit = this.bpmGetWorks.execute(bpmReqInit);
			List<ApiResult> apiResults = getResInit.getApiResults();

			if (apiResults.size() > 0) {
				// InstId, TaskId, Trctag 값이 존재 하므로 시작전에 넣어줘야 재성성을 막음
				ApiWorkResult workResult = (ApiWorkResult) apiResults.stream().findFirst().orElseThrow(() -> new Exception("WorkList 가 존재하지 않음"));
				bpmReq = getDetailData(aprScVo, workResult.getInstId().toString(), workResult.getTaskId().toString(), workResult.getTrctag());
			}

			// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
			// taskId, trcTag 값 입력후 호출
			BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
			bpmReq.setServiceType(BpmServiceType.COMPLET);

			apiResult = (ApiGetResult) getRes.getApiResult();

			AprVo aprVo = new AprVo();
			aprVo.setRejectYN("Y");
			// 프로세스 Variable
			if (apiResult.getProcessVariables() != null) {
				List<ProcessVariable> ProcessVariables = this.processVariableMapper(apiResult.getProcessVariables(), aprVo);
				apiResult.setProcessVariables(ProcessVariables);
			}

			// 반려가 될 경우 initiator로 되돌림
			String initiator = this.getInitiator(apiResult);

			// 여기서 값 넣어주기
			CurrentActivity currentActivity = apiResult.getCurrentActivity();
			currentActivity.setApprType("reject");

			bpmReq.setApiResult(apiResult);
			postRes = this.bpmPostInstance.execute(bpmReq);
			ApiPostResult result = (ApiPostResult) postRes.getApiResult();

			// 예통자 반려 XAD040일때 실행
			IntfatabVo intfatabVo = apprCommonService.getXomxintfatab(aprScVo.getReqNo());
			if (StringUtils.equals(AprState.ING_CTRL.getCode(), intfatabVo.getAprState())) {
				aprBugtCtrlService.updateDecsnReject(aprScVo.getReqNo(), "N");
			}

			// 반려 후처리
			ApiBpmVo param = new ApiBpmVo();
			param.setReqNo(aprScVo.getReqNo());
			param.setAprState(AprState.WAIT_REJECT.getCode());
			param.setSyspayno(KitechContextUtil.getSyspayno()); // 반려자사번? 반려후처리사사번?
			param.setPrevAprState(intfatabVo.getAprState());	// 결재상태
			param.setRejectComment(aprScVo.getComments());		// 반려의견
			
			this.bpmPostService.executePostProcess(param);

			// 반려 메일 발송
			aprScVo.setRejectYN("Y");
			this.sendAprMail(initiator, apiResult, aprScVo);

			boolean intfatabSaveYn = true;
			if ("Running".equals(result.getInstStatus())) {
				List<NextWork> nextWorks = result.getNextWorks();
				if (nextWorks != null) {
					// 다음 업무가 있을 경우 Endpoint를 넣어준다.(Endpoint는 모든 사람들을 넣어준다. ex)user1;user2;user3;)
					String endpointNext = "";
					for (NextWork nextWork : nextWorks) {
						if (endpointNext.equals("")) {
							endpointNext = nextWork.getEndpoint();
						} else {
							endpointNext = endpointNext + ";" + nextWork.getEndpoint();
						}
					}
					initiator = endpointNext;
					// XAD로 시작 하지 않으면 modifyAprInterfaceAddInfo 실행하지 않는다.
					if (!"XAD".equals(nextWorks.get(0).getTaskExt2().substring(0, 3))) {
						intfatabSaveYn = false;
					}
				}
			}

			if (intfatabSaveYn) {
				this.apprCommonService.modifyAprInterfaceAddInfo(aprScVo.getReqNo(), AprState.WAIT_REJECT.getCode(), initiator, aprVo.getInfoCd());
			}

			// 결재의견이 존재 할 경우 결재의견을 doc_comments에 INSERT
			UserVo user = accntService.findUserByUsername(aprScVo.getEndpoint());
			if (!StringUtils.isEmpty(aprScVo.getComments())) {
				apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), aprScVo.getComments(), "rejecttop", aprScVo.getEndpoint(), user.getCn(), "", aprScVo.getEndpoint(),
						aprScVo.getEndpoint());
			} else {
				apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), "반려", "rejecttop", aprScVo.getEndpoint(), user.getCn(), "", aprScVo.getEndpoint(),
						aprScVo.getEndpoint());
			}
		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formReject()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0009", ex);
			}
		}
	}

	/**
	 * 결재 담당자반려
	 * 
	 * @param AprVo
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	public void formAuthReject(AprScVo aprScVo) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		ApiGetResult apiResult = null;
		try {
			// 1. BPM 코어 파라미터 객체 생성
			if (aprScVo.getProcDefAlias() == null || "".equals(aprScVo.getProcDefAlias())) {
				aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprScVo.getReqNo().substring(0, 3)));
			}

			// 반려 제약 처리
			AprConstraint constraint = AprUtil.getConstaint(AprAction.REJECT, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
			if (constraint.isExist()) {
				throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
			}

			// 결의확정 결재(F61)는 변경
			if ("F61".equals(aprScVo.getReqNo())) {
				aprScVo.setReqNo(aprScVo.getSlipNo());
			}

			AppLog.debug("formAuthReject >>> ", aprScVo);
			if (StringUtils.isEmpty(aprScVo.getInstId()) || StringUtils.isEmpty(aprScVo.getTaskId()) || StringUtils.isEmpty(aprScVo.getTrctag())) {
				// Type2 담당자반려시 화면에서 InstId, TaskId, Trctag 가 누락되어 있으므로 Instance 조회를 통해 BPM 키 값을
				// 가져온다.
				aprScVo.setEndpoint("system");
				aprScVo.setSearchClsf(AprSearch.REQ_NO.getCode());
				aprScVo.setSearchData(aprScVo.getReqNo());
				aprScVo.setProcClsf(AprMapper.FORM_ALIAS.getCode());
				aprScVo.setStatus(AprMapper.INST_COMPLETE.getCode());

				AprWorkVo aprWork = this.searchClsfAprList(aprScVo).stream().findFirst()
						.orElseThrow(() -> new BpmException(Exceptions.ERROR, Business.APR, "시스템 오류: InstList 항목이 존재하지 않음!!"));

				// 키값 설정
				aprScVo.setInstId(String.valueOf(aprWork.getInstId()));
				aprScVo.setTaskId(String.valueOf(aprWork.getTaskId()));
				aprScVo.setTrctag(aprWork.getTrctag());
			}

			bpmReq = new BpmRequest.Builder(aprScVo.getProcDefAlias()).endpoint(aprScVo.getEndpoint()).instanceId(aprScVo.getInstId()).taskId(aprScVo.getTaskId())
					.trcTag(aprScVo.getTrctag()).build();

			// GET /rest/bpm/process-instances/{alias}/get : alias, endpoint, instanceId,
			// taskId, trcTag 값 입력후 호출
			BpmResult getRes = this.bpmGetInstance.execute(bpmReq);
			bpmReq.setServiceType(BpmServiceType.COMPLET);

			apiResult = (ApiGetResult) getRes.getApiResult();

			// 반려가 될 경우 initiator로 되돌림
			String initiator = "";
			if (null != apiResult.getAppLineInfo()) {
				AppLineInfo appLineInfo = apiResult.getAppLineInfo();
				/** 결재 라인 추가 */
				List<ApprovalLineInfo> approvalLineInfos = appLineInfo.getApprovalLineInfos();
				if (null != approvalLineInfos) {
					ApprovalLineInfo approvalLineInfo = approvalLineInfos.get(0);
					initiator = approvalLineInfo.getRole().getRoleMapping().get(0).getEndpoint();
				}
			} else {
				List<ProcessRole> processRoles = apiResult.getProcessRoles();
				if (null != processRoles) {
					initiator = processRoles.get(0).getRoleMapping().get(0).getEndpoint();
				}
			}

			bpmReq.setApiResult(apiResult);
			postRes = this.bpmPostInstanceReject.execute(bpmReq);

			// 담당자반려 후처리
			IntfatabVo intfatabVo = apprCommonService.getXomxintfatab(aprScVo.getReqNo());
			ApiBpmVo param = new ApiBpmVo();
			param.setReqNo(aprScVo.getReqNo());
			param.setAprState(AprState.WAIT_REJECT.getCode());
			param.setSyspayno(KitechContextUtil.getSyspayno());
			param.setPrevAprState(intfatabVo.getAprState());	// 결재상태
			param.setRejectComment(aprScVo.getComments());		// 반려의견			
			this.bpmPostService.executePostProcess(param);

			// 반려 메일 발송
			aprScVo.setRejectYN("Y");
			this.sendAprMail(initiator, apiResult, aprScVo);

			// intfatab 저장(반려될 경우 최초 Initiator 아이디로 세팅)
			this.apprCommonService.modifyAprInterfaceAddInfo(aprScVo.getReqNo(), AprState.WAIT_REJECT.getCode(), initiator, apiResult.getInfo());

			// 결재의견이 존재 할 경우 결재의견을 doc_comments에 INSERT
			UserVo user = accntService.findUserByUsername(KitechContextUtil.getUserId());
			apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), StringUtils.isNotEmpty(aprScVo.getComments()) ? aprScVo.getComments() : "반려", "rejecttop", user.getUid(),
					user.getCn(), "", user.getUid(), user.getUid());

		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formAuthReject()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0014", ex);
			}
		}
	}

	/**
	 * AS-IS 결재 담당자반려
	 * 
	 * @param AprVo
	 * @return String
	 * @author parkbm
	 * @since 2022.07.13.
	 */
	public void formAuthAsisReject(AprScVo aprScVo) throws KitechException, BpmException {
		BpmRequest bpmReq = null;
		BpmResult postRes = null;
		try {
			// 1. BPM 코어 파라미터 객체 생성
			if (aprScVo.getProcDefAlias() == null || "".equals(aprScVo.getProcDefAlias())) {
				aprScVo.setProcDefAlias(apprCommonDAO.selectGetMainKey(aprScVo.getReqNo().substring(0, 3)));
			}

			// 반려 제약 처리
			AprConstraint constraint = AprUtil.getConstaint(AprAction.REJECT, aprScVo.getProcDefAlias(), aprScVo.getReqNo());
			if (constraint.isExist()) {
				throw new BpmException(Exceptions.ERROR, Business.APR, constraint.getMessage());
			}

			// 담당자반려 후처리
			ApiBpmVo param = new ApiBpmVo();
			param.setReqNo(aprScVo.getReqNo());
			param.setAprState(AprState.WAIT_REJECT.getCode());
			param.setSyspayno(KitechContextUtil.getSyspayno());
			this.bpmPostService.executePostProcess(param);

			postRes = this.bpmPostInstanceAsisReject.execute(new BpmRequest.Builder("").instanceId(aprScVo.getInstId()).instName(aprScVo.getReqNo()).build());

			// 반려가 될 경우 initiator로 되돌림
			String initiator = accntService.findUserIdBySyspayno(aprScVo.getInItEmpcode()).getUid();

			// intfatab 저장(반려될 경우 최초 Initiator 아이디로 세팅)
			this.apprCommonService.modifyAprInterfaceAddInfo(aprScVo.getReqNo(), AprState.WAIT_REJECT.getCode(), initiator, null);

			// 결재의견이 존재 할 경우 결재의견을 doc_comments에 INSERT
			UserVo user = accntService.findUserByUsername(KitechContextUtil.getUserId());
			if (!StringUtils.isEmpty(aprScVo.getComments())) {
				apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), aprScVo.getComments(), "rejecttop", user.getUid(), user.getCn(), "", user.getUid(), user.getUid());
			} else {
				apprCommonService.insertDocCommentsStr("", aprScVo.getReqNo(), "반려", "rejecttop", user.getUid(), user.getCn(), "", user.getUid(), user.getUid());
			}

		} catch (Exception ex) {
			// 실패시 BPM 롤백
			if (null != postRes && null != postRes.getApiResult() && postRes.getApiResult() instanceof ApiPostResult) {
				AppLog.warn("ApprFuncServiceImpl-sendRoleBack()", ex);
				ApiPostResult result = (ApiPostResult) postRes.getApiResult();
				this.sendRoleBack(result.getCancelKey(), bpmReq);
			}
			// 예외 처리
			if (ex instanceof BpmException) {
				throw (BpmException) ex;
			} else if (ex instanceof KitechException) {
				throw (KitechException) ex;
			} else {
				AppLog.error("ApprFuncServiceImpl-formAuthAsisReject()", ex);
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0009", ex);
			}
		}
	}
}