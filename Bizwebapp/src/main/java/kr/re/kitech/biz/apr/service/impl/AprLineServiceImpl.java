package kr.re.kitech.biz.apr.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.apr.dao.AprLineDAO;
import kr.re.kitech.biz.apr.service.AprLineService;
import kr.re.kitech.biz.apr.vo.AprDeptVo;
import kr.re.kitech.biz.apr.vo.AprLineDescVo;
import kr.re.kitech.biz.apr.vo.AprLineVo;
import kr.re.kitech.biz.apr.vo.AprRuleVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.ApprvConfigDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.vo.ApprvConfigVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 결재신청 공통 서비스 구현체
 * @author 박병목
 * @since 2022. 6. 21.
 */
 @Service("aprLineServiceImpl")
public class AprLineServiceImpl implements AprLineService {
    
    @Resource(name="aprLineDAO")
    private AprLineDAO aprLineDAO;
    
    @Resource(name="apprvConfigDAO")
	private ApprvConfigDAO apprvConfigDAO;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
    
    /**
     * 개인별 결재선 리스트 저장
     * @param AprLineVo
     * @author 박병목
     * @since 2022.07.29.
     */
	public void insertAprLine(AprLineVo vo, List<AprLineDescVo> listVo) throws KitechException {
		String maxNum = this.aprLineDAO.selectAprLineMaxNum();
		
		vo.setApl_id(maxNum);
		this.aprLineDAO.insertAprLine(vo);
		int num = listVo.size();
		for (AprLineDescVo descVo: listVo) {
			descVo.setApld_order(Integer.toString(num));
			// 순번 줄임
			num = num - 1;
			descVo.setApld_aplid(maxNum);
			if (!"상신".equals(descVo.getApld_apltype())) {
				this.aprLineDAO.insertAprLineData(descVo);
			}
		}
	}

	/**
     * 개인별 결재선 리스트 수정
     * @param AprLineVo
     * @author 박병목
     * @since 2022.07.29.
     */
	public void updateAprLine(AprLineVo vo, List<AprLineDescVo> listVo) throws KitechException {
		this.aprLineDAO.updateAprLine(vo);
		this.aprLineDAO.deleteAprLineData(vo);
		int num = listVo.size();
		for (AprLineDescVo descVo: listVo) {
			descVo.setApld_aplid(vo.getApl_id());
			descVo.setApld_order(Integer.toString(num));
			// 순번 줄임
			num = num - 1;
			this.aprLineDAO.insertAprLineData(descVo);
		}
	}

	/**
     * 개인별 결재선 리스트 삭제
     * @param AprLineVo
     * @author 박병목
     * @since 2022.07.29.
     */
	public void deleteAprLine(AprLineVo vo) throws KitechException {
		this.aprLineDAO.deleteAprLine(vo);
		this.aprLineDAO.deleteAprLineData(vo);
	}    		

	/**
     * 개인별 결재선 리스트 조회
     * @param UserVo
     * @return AprLineListVo
     * @author 박병목
     * @since 2022.07.27.
     */
	public List<AprLineVo> selectAprLineList(AprUserVo vo) throws KitechException {
		return this.aprLineDAO.selectAprLineList(vo);
	}

	/**
     * 개인별 결재선 선택 리스트 조회
     * @param UserVo
     * @return AprLineListVo
     * @author 박병목
     * @since 2022.07.27.
     */
	public List<AprLineDescVo> selectAprLineDescList(AprLineVo vo) throws KitechException {
		return this.aprLineDAO.selectAprLineDescList(vo);
	}

	/**
	 * 결재 사용자 조회
	 *
	 * @param AprUserVo
	 * @return AprUserVo
	 */
	public List<AprUserVo> selectAprUserList(AprUserVo vo) throws KitechException {
		return this.aprLineDAO.selectAprUserList(vo);
	}
	
	
	public List<AprUserVo> selectBaseAprLineAll(AprVo aprVo, String auditYn) throws KitechException {
		List<AprUserVo> aprAuditUsers = new ArrayList<AprUserVo>();
		AprUserVo aprUserVo = new AprUserVo();
		aprUserVo.setEmpcode(aprVo.getEndpoint());
		aprAuditUsers = aprLineDAO.selectBaseAprLine(aprUserVo);
		
		// 감사자 넣기
		if (StringUtils.isEmpty(auditYn)) {
			aprAuditUsers = insertAuditRole(aprAuditUsers, aprVo.getAuditRolesSn(), aprVo.getReqnum());
		}
		
		return aprAuditUsers;
	}
		
	
	public List<AprUserVo> insertAuditRole(List<AprUserVo> aprUserVos, String auditRolesSn) throws KitechException {
		return this.insertAuditRole(aprUserVos, auditRolesSn, "");
	}
	
	/**
     * 감사라인 추가
     * @param AprUserVo
     * @return AprLineListVo
     * @author 박병목
     * @since 2022.07.27.
     */
	public List<AprUserVo> insertAuditRole(List<AprUserVo> aprUserVos, String auditRolesSn, String reqnum) throws KitechException {
		List<AprUserVo> aprAuditUsers = aprUserVos;
		
		// 마지막 부서결재자 넣기
		AprUserVo userVoLast = new AprUserVo();
		userVoLast = aprAuditUsers.get(aprAuditUsers.size() -1);
		
		aprAuditUsers.remove(aprAuditUsers.size() -1);
		
		if (StringUtils.isNotEmpty(auditRolesSn)) {
			String auditRoles[] = auditRolesSn.split(";");
			for (String auditRole : auditRoles) {
				UserVo userVo = new UserVo();
				AprUserVo aprAuditUser = new AprUserVo();
				userVo = accntService.findSyspaynoByUid(auditRole);
				// 외부강의신고서(대외활동신고서) 일 경우 감사는 행동강령책임관으로 변경 2023.12.19 이민기 팀장 요청
				if (StringUtils.contains(reqnum, "C68")) {
					aprAuditUser.setApld_apltype("CONDUCT");
				} else {
					aprAuditUser.setApld_apltype("AUDIT");
				}
				aprAuditUser.setJikname("*");
				aprAuditUser.setEmpcode(auditRole);
				aprAuditUser.setPartname(userVo.getOu());
				aprAuditUser.setEmpname(userVo.getCn());
				aprAuditUser.setEndTime("");
				aprAuditUser.setAutoApproval("");
				aprAuditUsers.add(aprAuditUser);
			}
		}
		
		// 감사 넣고 마지막 결재자 다시 넣음
		aprAuditUsers.add(userVoLast);
		return aprAuditUsers;
	}
	
	/**
     * 개인별 초기 결재라인 세팅
     * @param AprUserVo
     * @return AprLineListVo
     * @author 박병목
     * @since 2022.07.27.
     */
	public List<AprUserVo> selectBaseAprLine(AprVo aprVo) throws KitechException {
		List<AprUserVo> aprUserVoList = new ArrayList<AprUserVo>();
		
		// 사용자별 전결 조건을 조회 후 Y일 경우만 직무조건 조회 하여 라인 세팅 아닐 경우 전체 보여주기
		String ruleJikcd = "";
		ApprvConfigVo retVo = null;
		AprRuleVo aprRuleVo = null;
		
		// system 예외처리
		if (StringUtils.equals(aprVo.getEndpoint(), "system") ) {
			retVo = new ApprvConfigVo();
			retVo.setAuto_rule_yn("N");
		} else {
			ApprvConfigVo parmVo = new ApprvConfigVo();
			parmVo.setSyspayno(accntService.findSyspaynoByUid(aprVo.getEndpoint()).getSn());
			retVo = apprvConfigDAO.selectApprvConfig(parmVo);
			if (null == retVo) {
				retVo = new ApprvConfigVo();
				retVo.setAuto_rule_yn("N");
			}
		}
		
		if (StringUtils.equals("Y", retVo.getAuto_rule_yn()) || StringUtils.equals("Y", aprVo.getRuleAutoYn())) {
			aprRuleVo = aprLineDAO.selectArbitrarilyRule(aprVo);
			
			if (aprRuleVo != null) {
				ruleJikcd = aprRuleVo.getRule_jikcd();
			} else {
				ruleJikcd = "";
			}
			
		} else {
			ruleJikcd = "";
		}
		
		aprUserVoList = this.selectBaseAprLineAll(aprVo, "All");
		List<AprUserVo> aprUserVoListGet = new ArrayList<AprUserVo>(); 
		
		if (ruleJikcd != null) {
			int count = 0;
			// 직무코드에 따라 기본세팅
			switch (ruleJikcd) {
			case "ADP010":
			
				boolean isExist = false;
				List<String> habCds = Arrays.asList(new String[]{"HAB012", "HAB013", "HAB018", "HAB064", "HAB361", "HAB030"});
				for (AprUserVo aprUser : aprUserVoList) {
					if (habCds.stream().anyMatch(habCd -> StringUtils.equals( aprUser.getJikcd(), habCd))) {
						isExist = true;
						break;
					}
				}
				
				if (!isExist) {
					habCds = new ArrayList<>();
					habCds.add("HAB011");
				}
							
				for (AprUserVo aprUser : aprUserVoList) {
					aprUserVoListGet.add(aprUser);
					String jikCd = aprUser.getJikcd();
					
					if (habCds.stream().anyMatch(habCd -> StringUtils.equals( aprUser.getJikcd(), habCd) && habCd.indexOf(jikCd) != -1)) {
						break;
					}
	
				}

				// "HAB012", "HAB013", "HAB018", "HAB064", "HAB361", "HAB030"
				break;
			case "ADP020": 
			case "ADP080":
				loop:
				for (AprUserVo aprUser : aprUserVoList) {
					aprUserVoListGet.add(aprUser);
					String jikCd = aprUser.getJikcd();
//					String habCd[] = {"HAB023", "HAB025", "HAB026", "HAB027", "HAB033", "HAB036", "HAB040", "HAB048", "HAB065", "HAB060", "HAB091"};
					String habCd[] = aprRuleVo.getRuleHabCds().split(",");
					for (int i = 0; i < habCd.length ; i++) {
						if(!"".equals(jikCd) && habCd[i].indexOf(jikCd) != -1) {
							break loop;
						}
					}
				}
				// "HAB023", "HAB025", "HAB026", "HAB027", "HAB033", "HAB036", "HAB040", "HAB048", "HAB065", "HAB060", "HAB091"
				break;
			case "ADP030":
				// 자신보다 다음 한건
				count = 2;
				for (AprUserVo aprUser : aprUserVoList) {
					aprUserVoListGet.add(aprUser);
					count--;
					if (count == 0) {
						break;
					}
				}
				//aprUserVoListGet.add(aprUserVoList.get(0));
				//aprUserVoListGet.add(aprUserVoList.get(1));
				break;
			case "ADP040":
				// 자신보다 다음 두건
				count = 3;
				for (AprUserVo aprUser : aprUserVoList) {
					aprUserVoListGet.add(aprUser);
					count--;
					if (count == 0) {
						break;
					}
				}
				//aprUserVoListGet.add(aprUserVoList.get(0));
				//aprUserVoListGet.add(aprUserVoList.get(1));
				//aprUserVoListGet.add(aprUserVoList.get(2));
				break;
			case "ADP050":
				loop:
				for (AprUserVo aprUser : aprUserVoList) {
					AppLog.debug("---------------aprUser : " + aprUser);
					aprUserVoListGet.add(aprUser);
					String jikCd = aprUser.getJikcd();
//					String habCd[] = {"HAB010"};
					String habCd[] = aprRuleVo.getRuleHabCds().split(",");
					for (int i = 0; i < habCd.length ; i++) {
						if(!"".equals(jikCd) && habCd[i].indexOf(jikCd) != -1) {
							break loop;
						}
					}
				}
				// "HAB010"
				break;
			case "ADP060":
				loop:
				for (AprUserVo aprUser : aprUserVoList) {
					aprUserVoListGet.add(aprUser);
					String jikCd = aprUser.getJikcd();
//					String habCd[] = {"HAB011"};
					String habCd[] = aprRuleVo.getRuleHabCds().split(",");
					for (int i = 0; i < habCd.length ; i++) {
						if(!"".equals(jikCd) && habCd[i].indexOf(jikCd) != -1) {
							break loop;
						}
					}
				}
				// "HAB011"
				break;
			case "ADP070":
				loop:
				for (AprUserVo aprUser : aprUserVoList) {
					aprUserVoListGet.add(aprUser);
					String jikCd = aprUser.getJikcd();
//					String habCd[] = {"HAB030"};
					String habCd[] = aprRuleVo.getRuleHabCds().split(",");
					for (int i = 0; i < habCd.length ; i++) {
						if(!"".equals(jikCd) && habCd[i].indexOf(jikCd) != -1) {
							break loop;
						}
					}
				}
				// "HAB030"
				break;
			case "ADP090":
				loop:
				for (AprUserVo aprUser : aprUserVoList) {
					aprUserVoListGet.add(aprUser);
					String jikCd = aprUser.getJikcd();
//					String habCd[] = {"HAB023","HAB030","HAB310","HAB320","HAB330","HAB065"};
					String habCd[] = aprRuleVo.getRuleHabCds().split(",");
					for (int i = 0; i < habCd.length ; i++) {
						if(!"".equals(jikCd) && habCd[i].indexOf(jikCd) != -1) {
							break loop;
						}
					}
				}
				// "HAB023","HAB030","HAB310","HAB320","HAB330","HAB065"
				break;
			default:
				aprUserVoListGet.addAll(aprUserVoList);
				break;
			}
		} else {
			// 기본 직무가 존재 하지 않을 경우
			aprUserVoListGet.addAll(aprUserVoList);
			retVo.setAuto_rule_yn("N");
		}
		
		// 감사자 넣기
		aprUserVoListGet = insertAuditRole(aprUserVoListGet, aprVo.getAuditRolesSn(), aprVo.getReqnum());
		
		return aprUserVoListGet;
	}
	
	/**
     * 부서 라인 세팅(APR)
     * @param AprDeptVo
     * @return AprDeptListVo
     * @author 박병목
     * @since 2022.07.27.
     */
	public List<AprDeptVo> selectBaseDeptLine(AprDeptVo vo) throws KitechException {
		return this.aprLineDAO.selectBaseDeptLine(vo);
	}
	
	/**
     * 부서별 사용자 세팅(APR)
     * @param AprDeptVo
     * @return AprUserVo
     * @author 박병목
     * @since 2022.07.27.
     */
	public List<AprUserVo> selectDeptToUserLine(AprDeptVo vo) throws KitechException {
		return this.aprLineDAO.selectDeptToUserLine(vo);
	}

	/**
     * 수신결재 차상위자 세팅
     * @param AprVo
     * @return AprLineListVo
     * @author 박병목
     * @since 2022.11.10.
     */
	public List<AprUserVo> selectSuSinAprLine(AprVo aprVo) throws KitechException {
		
		List<AprUserVo> aprUserVoList = new ArrayList<AprUserVo>();
		List<AprUserVo> aprUserVoListGet = new ArrayList<AprUserVo>();

		aprUserVoList = this.selectBaseAprLineAll(aprVo, "All");
		
		// 자신보다 다음 한건
		int count = 2;
		for (AprUserVo aprUser : aprUserVoList) {
			aprUserVoListGet.add(aprUser);
			count--;
			if (count == 0) {
				break;
			}
		}
		
		return aprUserVoListGet;
	}
}
