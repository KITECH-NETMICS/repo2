package kr.re.kitech.biz.res.mail.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.server.dao.ResProcessDAO;
import kr.re.kitech.biz.api.server.vo.biz.ResSmlRvewDRstVo;
import kr.re.kitech.biz.res.mail.dao.MailSendDAO;
import kr.re.kitech.biz.res.mail.service.ResMailSendService;
import kr.re.kitech.biz.res.tec.vo.ResPstCrtPagrVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.ext.BaseUrlProperty;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.AttachVo;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * MailSendServiceImpl 연구관리 메일발송 ServiceImpl
 * 
 * @author LeeYH
 * @since 2022.03.31.
 */
 @Service("resMailSendService")
public class ResMailSendServiceImpl extends EgovAbstractServiceImpl implements ResMailSendService {
	@Autowired
	private MailSender mailSender;
	
	@Resource(name="resMailSendDAO")
	private MailSendDAO mailDao;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
	
	@Resource(name="resProcessDAO")
	private ResProcessDAO resProcessDAO;

	/**
    * 기술이전 계약 결재 후 메일 발송
    * @param String reqNo, String syspayno
    * @author LeeYH
    * @since 2022.07.06.
    */
	@Override
	public void sendMailTechApr(String reqNo) throws KitechException{
		// 1) 마스터 정보 조회
		Map<String, String> mstMap = mailDao.selectResPstMast(reqNo);
		
		// 2) 협약정보 조회
		List<ResPstCrtPagrVo> vendList = mailDao.selectResPstCrtPagr(reqNo);
		String vendNm = "";
		String contentVend = "";
		String TechFee = "";
		int cnt =0;
		for(ResPstCrtPagrVo vendVo : vendList){
			if(cnt == 0){
				vendNm = vendVo.getVend_nm();
			}else{
				vendNm += "," + vendVo.getVend_nm();
			}
			
			if(cnt == 0) {
				contentVend += vendVo.getVend_nm().trim() + " (대표 : " + vendVo.getReprs_psn_nm() + ")";
			} else {
				contentVend += "<br/>";
				contentVend += vendVo.getVend_nm().trim() + " (대표 : " + vendVo.getReprs_psn_nm() + ")";
			}
			if (mstMap.get("tech_prj_clsf").matches("RFL001|RFL002|RFL004")) { // 정부연구과제 미래부 추가
				TechFee = "기술료(총액) : " + StringUtil.toCurrency(String.valueOf(vendVo.getFxd_tech_fee())) + "원 / 기술료(원금) : " + StringUtil.toCurrency(String.valueOf(vendVo.getFxd_tech_suply_value()))
						+ "원 / 기술료(부가세) : " + StringUtil.toCurrency(String.valueOf(vendVo.getFxd_tech_tax_fee())) + "원 <br/>";
			} else {
				TechFee = "기술료(총액) : " + StringUtil.toCurrency(String.valueOf(vendVo.getAdvnc_fee())) + "원 / 기술료(원금) : " + StringUtil.toCurrency(String.valueOf(vendVo.getAdvnc_suply_value()))
						+ "원 / 기술료(부가세) : " + StringUtil.toCurrency(String.valueOf(vendVo.getAdvnc_tax_fee())) + "원 <br/>";
			}			
			cnt++;
		}
		
		// 3) 출원번호정보 조회(지식재산권일 경우 해당정보 추가)
		String contentPat = "";
		List<Map<String,String>> smitList = mailDao.selectResPstAply(reqNo);		
		if(smitList == null || smitList.size() ==0){
			contentPat = "해당없음";
		}else{
			for(int i=0; i<smitList.size(); i++ ){
				Map<String,String> smitMap = smitList.get(i);
				
				if(i==0){
					contentPat += smitMap.get("smitapp_nm") + "/ <br/>" + smitMap.get("invnt_krn_nm");
				}else{
					contentPat += "<br/>" + smitMap.get("smitapp_nm") + "/ <br/>" + smitMap.get("invnt_krn_nm");
				}
			}
		}		
		
		// 4) 첨부파일
		String attachInfo = "";
		if(mstMap.get("attach_file_no") != null && !"".equals(mstMap.get("attach_file_no"))){
			AttachVo attachVo = new AttachVo();
			attachVo.setAttach_file_no(mstMap.get("attach_file_no"));
			
			List<AttachVo> fileList = mailDao.selectListAttach(attachVo);			
			for(AttachVo fileVo : fileList){
				attachInfo += "<span style='margin-left:20px;'><a href ='"+BaseUrlProperty.newBizUrl+"/SvcAttachDown.do?fileName="+ fileVo.getAttach_file_no() + fileVo.getSeq() +"&orgName=&bizKind=XAA016' > " + fileVo.getOrgFile() + "</a></span> <br/>";
			}
		}			
		
		MailTemplateVo templateVo = new MailTemplateVo();
		
		Map<String, String> templateVar = new HashMap<String, String>();
		templateVar.put("@techNm@", mstMap.get("tech_nm"));
		templateVar.put("@trnsRspns@", mstMap.get("nm").trim() + "(" + mstMap.get("dept_nm") + ")");
		templateVar.put("@relatPrj@", mstMap.get("accnt_no") + "(" + mstMap.get("accnt_no_nm") + ")");
		templateVar.put("@@relatPat@", contentPat);
		templateVar.put("@vendInfo@", contentVend);
		String startYmd = mstMap.get("contrct_start_ymd");
		String clsYmd = mstMap.get("contrct_cls_ymd");
		String contrctPrd = startYmd.substring(0, 4) + "년" + startYmd.substring(4, 6) + "월" + startYmd.substring(6, 8) + "일 ~ "
						+ clsYmd.substring(0, 4) + "년" + clsYmd.substring(4, 6) + "월" + clsYmd.substring(6, 8) + "일";
		templateVar.put("@contrctPrd@", contrctPrd);
		templateVar.put("@mouClsfNm@", mstMap.get("mou_clsf_nm") + "이전·전수 (" + mstMap.get("permit_clsf_nm") + ")");
		templateVar.put("@@techFee@", TechFee);
		
		templateVar.put("@mouContrctYmd@", DateUtil.formatDate(mstMap.get("mou_contrct_ymd"), "."));	
		templateVar.put("@@contrctAttach@", attachInfo);
		templateVo.setContentVar(templateVar);		
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);
		
		AppLog.debug("\n ------------------ templateVo : " + templateVo.toString());
		
		// 5) 수신자
		List<String> toAddress = new ArrayList<String>(); 
		toAddress.add(mstMap.get("nm") +" <" + mstMap.get("email")+ ">");
		// TODO TEST
		//toAddress.add("홍성민 <eip3bz.dev2@kitech.re.kr>");
		AppLog.debug("\n ------------------ toAddress : " + StringUtil.listToString(toAddress, ","));
		
		// 6) 참조자 설정(기술이전담당, ip경영실)
		List<String> ccAddress = new ArrayList<String>();
		List<UserVo> userList = accntService.findUsersByRoleCodes(new String[]{"1016121"});
		for(UserVo userVo : userList){
			ccAddress.add(userVo.getCn() + " <" + userVo.getMail()+ ">");
		}
				
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(mstMap.get("nego_rspns"), Business.RES, true)
				.senderEmail(mstMap.get("sender_nm")+" <" + mstMap.get("sender_email")+ ">")
//				.senderEmail("")
				.toAddr(toAddress)
				//.ccAddr(ccAddress)
				.subject("[기술사업화실]" + mstMap.get("mou_clsf_nm") + " 기술이전 계약체결 통보_" + vendNm + "_" + mstMap.get("nm") + " 박사님")
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath("tec/ResTecTrnsMouReg")
				.templateVars(templateVars)
			.build());
	}
	
	/**
    * 소연심의 결과 후 메일 발송 test
    * @param String reqNo, String syspayno
    * @author LeeYH
    * @since 2022.07.06.
    */
	public void sendRvewRstMailtest() throws KitechException{
		List<ResSmlRvewDRstVo> rstList = resProcessDAO.selectResSmlRvewDApr("R26202200041");
		this.sendRvewRstMail(rstList);
	}
	
	/**
    * 소연심의 결과 후 메일 발송
    * @param String reqNo, String syspayno
    * @author LeeYH
    * @since 2022.07.06.
    */
	public void sendRvewRstMail(List<ResSmlRvewDRstVo> voList) throws KitechException{
		String fromAddr = "eipadmin@kitech.re.kr";
		String fromNm = "시스템";
		
		// 1) 수신자
		List<String> toAddrList = new ArrayList<String>(); 
		
		// 2) 메일 내용
		String contents = "<table style='width:100%;margin:10px 0;border-collapse:collapse;border:1px solid #629e21;'>"
				+ "<caption style='height:30px;line-height:30px;text-align:left'><span style='color:#f3ae19'>◈</span>소연심 목차 및 결과</caption>"
				+ "<colgroup><col width='100px'><col width='80px'><col width='70px'><col width='150px'><col width='300px'><col width='80px'><col></colgroup>"
				+ "<tr><th>신청번호</th><th>신청자</th><th>안건구분</th><th>안건제목</th><th>안건내용</th><th>심의결과</th><th>세부의견</th></tr>";
		
		int patCnt = 0;
		int resCnt = 0;
		int assCnt = 0;
		int partCnt = 0;	
		
		String rvewSbj = voList.get(0).getRvew_sbj();	
		System.out.println("\n ------------------ rvewSbj : " + rvewSbj);	
		for(ResSmlRvewDRstVo vo : voList){
			if("P".equals(vo.getMngmt_item_2())){
				patCnt++;
			}else{
				resCnt++;
			}
			
			if("RBS003".equals(vo.getBiz_clsf())){ // 연구관리시작품
				assCnt++;
			}
			
			if("RBT001".equals(vo.getSub_biz_clsf())){ // 파트너기업
				partCnt++;
			}
			
			contents += " <tr style='height:25px;'> ";
			contents += " <td style='text-align:center'>" + vo.getKey_1() + "</td> ";
			contents += " <td style='text-align:center'>" + vo.getReq_psn_nm() + "</td> ";
			contents += " <td style='text-align:center'>" + vo.getItem_clsf_seq() + "</td> ";
			contents += " <td > " + vo.getRvew_objct() + "</td> ";
			contents += " <td > " + vo.getRmk() + " </td> ";
			contents += " <td style='text-align:center'> " + vo.getRvew_rst_nm() + " </td> ";
			contents += " <td style='text-align:left'> " + vo.getRvew_rst() + " </td> ";
			contents += " </tr>";			
			
			String toAddr = vo.getEmail_01();
			if (toAddr != null && !"".equals(toAddr) && !toAddrList.contains(toAddr)) { // 주요대상자
				toAddrList.add(toAddr);
			}
			
			// 발명신고서 위임담당자 또는 기술료 담당자
			toAddr = vo.getEmail_02();
			if(toAddr != null && !"".equals(toAddr) && !toAddrList.contains(toAddr)){
				toAddrList.add(toAddr);
			}
			
			// 발명신고서 작성자
			toAddr = vo.getEmail_03();
			if(toAddr != null && !"".equals(toAddr) && !toAddrList.contains(toAddr)){
				toAddrList.add(toAddr);
			}
			
			// 작성자
			toAddr = vo.getEmail_04();
			if(toAddr != null && !"".equals(toAddr) && !toAddrList.contains(toAddr)){
				toAddrList.add(toAddr);
			}
		}
		
		contents += "</table>";
		
		// 연구총괄심의위원회담당 email 조회
		List<UserVo> userList = null;
		if (resCnt > 0) {
			userList = accntService.findUsersByRoleCodes(new String[]{"1001234"});		
			if(userList != null && userList.size() > 0){
				for(UserVo userVo : userList){
					if(!toAddrList.contains(userVo.getMail())){
						toAddrList.add(userVo.getMail());
					}
				}
			}
		}
		
		// 지식재산권심의위원회담당 email 조회
		if (patCnt > 0) {
			userList = accntService.findUsersByRoleCodes(new String[]{"1016233"});
			if(userList != null && userList.size() > 0){
				for(UserVo userVo : userList){
					if(!toAddrList.contains(userVo.getMail())){
						toAddrList.add(userVo.getMail());
					}
				}
			}
		}
		
		// 자산담당자
		if (assCnt > 0) {
			userList = accntService.findUsersByRoleCodes(new String[]{"1015208"});
			if(userList != null && userList.size() > 0){
				for(UserVo userVo : userList){
					if(!toAddrList.contains(userVo.getMail())){
						toAddrList.add(userVo.getMail());
					}
				}
			}
		}
		
		// 파트너기업 담당자
		if(partCnt > 0) {
			userList = accntService.findUsersByRoleCodes(new String[]{"1005235"});
			if(userList != null && userList.size() > 0){
				for(UserVo userVo : userList){
					if(!toAddrList.contains(userVo.getMail())){
						toAddrList.add(userVo.getMail());
					}
				}
			}
		}
		
		System.out.println("\n ---------------- toAddr : " + toAddrList.toString());	
//		String fromNm = "";
//		String fromAddr = "";
			
		// TODO TEST
//		toAddrList = new ArrayList<String>();
//		toAddrList.add("eipleeyh@kitech.re.kr");	
		
		MailTemplateVo templateVo = new MailTemplateVo();		
		Map<String, String> templateVar = new HashMap<String, String>();
		templateVar.put("@rvewSbj@", rvewSbj);
		templateVar.put("@@data@", contents);
		templateVo.setContentVar(templateVar);
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.RES, true)
				.senderEmail(fromNm +" <" + fromAddr + ">")
				.toAddr(toAddrList)
				.subject(rvewSbj + "결과")
				.savesent(false)	// 받은 편지함 저장 여부		
				.logging(true)	// 로그 저장 여부
				.templatePath("res/ResSmlRvewRst")
				.templateVars(templateVars)
			.build());
	}
	
	/**
    * 사업신청 사업선정 후 메일 발송
    * @param Map
    * @author LeeYH
    * @since 2022.12.28.
    */
	public void sendBsnsSeltRst(Map<String,String> map) throws KitechException{
		MailTemplateVo templateVo = new MailTemplateVo();		
		Map<String, String> templateVar = new HashMap<String, String>();
		templateVar.put("@prjNm@", map.get("prj_nm"));
		templateVar.put("@resPsnNm@", map.get("resch_rspns_main_nm"));
		templateVar.put("@prjTerm@", map.get("tot_resch_prd_orign_ymd") + "~" + map.get("tot_resch_prd_cls_ymd"));
		templateVo.setContentVar(templateVar);
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);
		
		String fromAddr = KitechContextUtil.getUserId() + "@kitech.re.kr";
		String fromNm = KitechContextUtil.getName();
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.RES, true)
				.senderEmail(fromNm +" <" + fromAddr + ">")
				.toAddr(map.get("resch_rspns_main_mail"))
				.subject("[연구관리] 최종 확정 사업계획서 등록 안내")
				.savesent(false)	// 받은 편지함 저장 여부		
				.logging(true)	// 로그 저장 여부
				.templatePath("res/ResBsnsAplyReq")
				.templateVars(templateVars)
			.build());
	}
}
