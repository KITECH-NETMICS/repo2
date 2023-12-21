package kr.re.kitech.biz.uss.ath.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.uss.ath.dao.UssAthRoleMntDAO;
import kr.re.kitech.biz.uss.ath.service.UssAthRoleMntService;
import kr.re.kitech.biz.uss.ath.vo.UserSrcVo;
import kr.re.kitech.biz.uss.ath.vo.XomxUserScrnAuthVo;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AccntRepository;
import kr.re.kitech.biz.xom.core.vo.CodeVo;
import kr.re.kitech.biz.xom.core.vo.RoleVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**  
 * @ClassSubJect 권한관리(롤관리,사용자관리)
 * @Class Name UssAthRoleMntServiceImpl.java
 * @Description 권한관리(롤관리,사용자관리) 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/11/15   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/11/15
 * @version 1
 * @see
 * 
 */
@Service("ussAthRoleMntService")
public class UssAthRoleMntServiceImpl extends EgovAbstractServiceImpl implements UssAthRoleMntService{

	@Resource(name="accntRepository")
    private AccntRepository accntRepository;
    
    @Resource(name="ussAthRoleMntDAO")
    private UssAthRoleMntDAO dao;
    
    private static final int DIGITS = 2;	// serviceCode 분할 자리수        
    
    /**
	* 롤관리 및 사용자관리 시스템 구분 조회
	* @param ServiceVo
	* @return List<ServiceVo>
	* @author LeeYoungHee
	* @since 2023.11.15.
	*/
    public List<ServiceVo> findServiceTopDivCode(ServiceVo vo){
    	List<ServiceVo> serviceList = accntRepository.findServiceTopDivCode(vo);
    	Collections.sort(serviceList, Comparator.comparing(ServiceVo::getServiceCode));
    	return serviceList;
    }
    
    /**
	* 롤관리 및 사용자관리 사용자(콤보박스) 조회
	* @param UserSrcVo
	* @return List<UserVo>
	* @author LeeYoungHee
	* @since 2023.11.15.
	*/
    public List<UserVo> findUsers(UserSrcVo vo) {	
    	vo.setAttribute("cn,sn,uid");
    	vo.setFilter("useYN=*");
    	vo.setBase("cn=resident,cn=users");
    	
		return accntRepository.findUsers(vo);
	}
	
	/**
	* 사용자별 롤등록관리 - 사용자리스트 조회
	* @param UserSrcVo
	* @return List<UserVo>
	* @author LeeYoungHee
	* @since 2023.11.16.
	*/
    public List<UserVo> findUserList(UserSrcVo vo) {	
    	vo.setAttribute("cn,sn,uid,ou,ouCode,ouLevel,area,roleCode,serviceCode,useYN");
    	
    	String filter=null;
    	if(StringUtils.isNotBlank(vo.getCn()) && StringUtils.isBlank(vo.getOuCode())){
    		filter = "(&(cn=" + vo.getCn() + "*)(workDiv=" + vo.getWorkDiv() + "))";
    	}else if(StringUtils.isNotBlank(vo.getCn()) && StringUtils.isNotBlank(vo.getOuCode())){
    		filter = "(&(cn=" + vo.getCn() + "*)(ouCode=" + vo.getOuCode() + "*)(workDiv=" + vo.getWorkDiv() + "))";
    	}else if(StringUtils.isBlank(vo.getCn()) && StringUtils.isNotBlank(vo.getOuCode())){
    		filter = "(&(ouCode=" + vo.getOuCode() + "*)(workDiv=" + vo.getWorkDiv() + "))";
    	}else{
    		filter = "(workDiv=" + vo.getWorkDiv() + ")";
    	}
    	
    	vo.setFilter(filter);
    	String pdn = "cn=users";
    	if("1".equals(vo.getWorkDiv())){ // 내부 사용자(등록자)
    		pdn = "cn=resident," + pdn;
    	}else if("2".equals(vo.getWorkDiv())){ // 내부 사용자 (미등록자)
    		pdn = "cn=nonresident," + pdn;
    	}else if("3".equals(vo.getWorkDiv())){ // 외부 사용자
    		pdn = "cn=outside," + pdn;
    	}    	
    	vo.setBase(pdn);
    	
		return accntRepository.findUsers(vo);
	}
	
	/**
	* 사용자별 롤등록관리 - 사용자별 롤 등록리스트 조회
	* @param UserSrcVo
	* @return List<RoleVo>
	* @author LeeYoungHee
	* @since 2023.11.16.
	*/
	public List<RoleVo> findUserRoleList(UserSrcVo vo){
		vo.setAttribute("cn,roleLevel,roleCode,cnRoleFullName");
		vo.setBase("cn=groups");
		
		String[] roleCodes = vo.getRoleCode().split("#");
		String filter = "";
		for(String code : roleCodes){
			filter += "(roleCode=" + code + ")";
		}
		vo.setFilter("(|" + filter + ")");

		List<RoleVo> roleList = accntRepository.findUserRoleList(vo);
		for(RoleVo roleVo : roleList){
			String[] rName = roleVo.getCnRoleFullName().split(" ");
			roleVo.setRoleName(rName[rName.length -1]);
		}
	
		return roleList;
	}
	
	/**
	* 사용자별 롤등록관리 - 롤 조회
	* @param UserSrcVo
	* @return List<RoleVo>
	* @author LeeYoungHee
	* @since 2023.11.16.
	*/
	public List<RoleVo> findRoleList(UserSrcVo vo){
		vo.setAttribute("cn,parentGroupCode,roleLevel,roleCode,roleOrder,cnRoleFullName,serviceCode");
		vo.setBase("cn=groups");		
		
		String filter = "(&(!(cn=wcmadmins))(!(cn=wpsadmins))(!(cn=wpsContentAdministrators))(!(cn=wpsDocReviewer))";
		if(StringUtils.isBlank(vo.getRoleLevel())){
			if(StringUtils.isBlank(vo.getRoleCode())){
				filter += ")";
			}else{
				filter += "(roleCode=" + vo.getRoleCode() + "*))";
			}
		}else{
			if(StringUtils.isBlank(vo.getRoleCode())){
				filter += "(roleLevel=" + vo.getRoleLevel() + "))";
			}else{
				filter += "(roleLevel=" + vo.getRoleLevel() + ")(roleCode=" + vo.getRoleCode() + "*))";
			}
		}
		vo.setFilter(filter);		
		
		List<RoleVo> roleList = accntRepository.findUserRoleList(vo);
		for(RoleVo roleVo : roleList){
			String[] rName = roleVo.getCnRoleFullName().split(" ");
			roleVo.setRoleName(rName[rName.length -1]);
		}
	
		return roleList;
	}
	
	/**
	* 사용자별 롤등록관리 - 사용자롤 저장
	* @param UserVo
	* @author LeeYoungHee
	* @since 2023.11.22.
	*/
	public void saveUserRole(UserVo vo) throws Exception{
		// 01. 전체 사용자권한 서비스 삭제
		dao.deleteXomxUserScrnAuth(vo.getSn());
		
		// 02.ldap 수정된 롤코드 저장
		UserSrcVo srcVo = new UserSrcVo();
		String pdn = "cn=users";
		switch(vo.getWorkDiv()){
			case "1" : pdn= "cn=resident," + pdn; break;
			case "2" : pdn= "cn=nonresident," + pdn; break;
			case "3" : pdn= "cn=outside," + pdn; break;
		}
		
		srcVo.setBase(pdn);
		srcVo.setFilter("(uid=" + vo.getUid() + ")");
		srcVo.setRoleCode(vo.getRoleCode());
		
		accntRepository.updateUserRole(srcVo);
		
		//---------------------------------------------------------------------------//
		// 롤코드에 해당하는 서비스 정보 저장
		//---------------------------------------------------------------------------//		
		String[] roleCodes = vo.getRoleCode().split("#");	
		List<CodeVo> codeList = CodeCacheManager.getInstance().getCode("XAA");
		
		for(String roleCode : roleCodes){
			if("1000001".equals(roleCode)) continue;
			
			srcVo.setBase("cn=groups");
			srcVo.setAttribute("serviceCode,roleLevel");
			srcVo.setFilter("(roleCode=" + roleCode + ")");
			
			// 03.롤코드로 서비스정보 조회
			RoleVo roleVo = accntRepository.findUserRoleList(srcVo).get(0);
			//AppLog.info("-------------------- serviceCode : "  + roleVo.getServiceCode());
			List<ServiceVo> serviceList = accntRepository.findServiceInfo(roleVo.getServiceCode());

			if(serviceList != null  && serviceList.size() > 0){
				// 04.xomxuserscrnauth 테이블 저장
				XomxUserScrnAuthVo authVo = null;
				for(ServiceVo srVo : serviceList){
					if(srVo.getServiceID().contains("#")) continue;
					
					authVo = new XomxUserScrnAuthVo();
					authVo.setSys_pay_no(vo.getSn());
					authVo.setScrn_id(srVo.getServiceID());
					authVo.setScrn_nm(srVo.getCn());
			
					String[] fulNm = srVo.getCnServiceFullName().split(" ");
					
					if(fulNm.length > 0){
						if("기술지원".equals(fulNm[0])){
							authVo.setSys_bigclsf_cd("SUP");
						}else{
							for(CodeVo codeVo : codeList){
								if(codeVo.getComNm().trim().contains(fulNm[0].trim())){
									authVo.setSys_bigclsf_cd(codeVo.getMngmtItem1());
									break;
								}
							}
						}
						authVo.setSys_bigclsf_nm(fulNm[0]);
					}
					authVo.setLdap_svr_id(srVo.getServiceCode());
					authVo.setLinkurl("http://biz.kitech.re.kr/websquare/websquare.jsp?w2xPath=" + srVo.getServiceUrl());
					authVo.setC_right_yn("1");
					authVo.setU_right_yn("1");
					authVo.setD_right_yn("1");
					authVo.setE_right_yn("1");
					authVo.setP_right_yn("1");
					
					String r1_right_yn = "0"; // default value "0"
					String r2_right_yn = "0";
					String r3_right_yn = "0"; 
					String r4_right_yn = "0"; 
					
					switch(roleVo.getRoleLevel()){
						case "1" : r1_right_yn = "1"; break;
						case "2" : r2_right_yn = "1"; break;
						case "3" : r3_right_yn = "1"; break;
						case "4" : r4_right_yn = "1"; break;
					}
					
					authVo.setR1_right_yn(r1_right_yn);
					authVo.setR2_right_yn(r2_right_yn);
					authVo.setR3_right_yn(r3_right_yn);
					authVo.setR4_right_yn(r4_right_yn);
					
					dao.mergeXomxUserScrnAuth(authVo);
				}
			}
		}
	}
}
	