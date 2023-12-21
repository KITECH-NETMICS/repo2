package kr.re.kitech.biz.pat.mail.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.com.vo.PatComWFBizVo;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.mail.dao.PatMailDAO;
import kr.re.kitech.biz.pat.mail.service.PatMailSendService;
import kr.re.kitech.biz.pat.mail.vo.MessageTemplateVo;
import kr.re.kitech.biz.pat.mail.vo.PatMailRecvVo;
import kr.re.kitech.biz.pat.mail.vo.PatMailVo;
import kr.re.kitech.biz.pat.mail.vo.PatSMSMainVo;
import kr.re.kitech.biz.pat.mail.vo.PatSMSRecvVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;

/**
 * @ClassSubJect 지재권 메일발송 SERVICEIMPL
 * @Class Name PatMailSendServiceImpl.java
 * @Description 지재권 메일발송 
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/21      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/21
 * @version 1.0
 * @see
 * 
 */
@Service("patMailSendService")
public class PatMailSendServiceImpl extends EgovAbstractServiceImpl implements PatMailSendService {
	@Autowired
	private MailSender mailSender;
	
	@Resource(name="patMailDAO")
	private PatMailDAO dao;

	/**
    * 발명신고서 결재완료 후 메일발송(프로그램,디자인,상표)
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.21.
    */
	@Override
	public void sendMailPatApr(Map<String,String> map) {
		String content ="";
		content = "<html>";
		content += "    <head>";
		content += "        <title> [한국생산기술연구원] 발명신고서 결재 완료 안내 메일 </title>";
		content += "       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\">";
		content += "       <style type=\"text/css\">";
		content += "            body    {" + "font-size:13px; " + "}                                                ";
		content += "            td      {" + "padding: 3px; " + "}                                                  ";
		content += "        </style>                                                                                ";
		content += "    </head>                                                                                     ";
		content += "    <body>                                                                                      ";
		content += "        <p style=\"height:10px; \" > </p>               										";
		content += "        <p>    *** " + map.get("pat_clsf_nm") + " 관련 발명신고서가 결재 완료되었기에 알려드립니다. ***</p>   	";
		content += "        <p style=\"height:10px; \" > </p>               										";
		content += "        <table border=1 style=\"padding:0px; margin:0px; font-size:12px; \" >                   ";
		content += "            <tr>                                                                                ";
		content += "                <td style=\"width:100px; height:25px; \" >신청번호</td>                      		";
		content += "                <td style=\"width:500px; \" > " + map.get("req_no") + " </td>                   ";
		content += "            </tr>                                                                               ";
		content += "            <tr>                                                                                ";
		content += "                <td style=\"height:25px; \">발명의 명칭</td>                                 		";
		content += "                <td> " + map.get("invnt_krn_nm") + " </td>                                      ";
		content += "            </tr>                                                                               ";
		content += "        </table>                                                                                ";
		content += "    </body>                                                                                     ";
		content += "</html>                                                                                         ";
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder("20130576", Business.PAT, true) // KitechContextUtil.getSyspayno()
				.senderEmail("") 
				.toAddr("patent@kitech.re.kr") // update by SoO 2012.03.19 방초하씨 요청으로 대표메일로 수정함
				//.toAddr("eipleeyh@kitech.re.kr") // test
				//.ccAddr(ccAddress)
				.subject("발명신고서 [" + map.get("req_no") + "] 결재 완료 메일")
				.content(content)
				.savesent(true)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
			.build());
	}
	
	/**
    * PatComService.executePatComWFBiz에서 메일발송 호출(메일 DB에 넣어 놓고 스케쥴 처리함)
    * @param PatToDoVo, PatComWFBizVo
    * @author LeeYH
    * @since 2022.08.01.
    */
	public void sendMailWFBiz(PatToDoVo vo, PatComWFBizVo bizVo){
		AppLog.debug("\n ################## sendMailWFBiz > PatToDoVo : " + vo );
		AppLog.debug("\n ##################3333333333333333333 sendMailWFBiz > PatComWFBizVo : " + bizVo );
		String subject = "";
		String templatePath = "";
		String reqUserNm = "";
		
		PatMailVo mailVo = new PatMailVo();
		//수신자
		List<PatMailRecvVo> recvList = new ArrayList<>();
		PatMailRecvVo toAddrVo = new PatMailRecvVo();
		
		if(!"P0219".equals(vo.getNext_state_cd())){ // P0219 선행기술조사 완료			
			if("2".equals(vo.getTodo_auth())){
				subject = "[생산기술연구원]" + vo.getJob_title() + " " + vo.getTodo_title() + " 요청";
			}else{
				subject = "[지식재산권]" + vo.getJob_title() + " " + vo.getTodo_title() + " 요청";
			}
			
			templatePath = "pat/WorkFlow";
			
			if("0".equals(vo.getAlarm_from())){ 
				reqUserNm = bizVo.getInvnt_nm();
				
				// 송신자
				mailVo.setSend_person_id(bizVo.getInvnt_syspayno());
				mailVo.setSend_addr(bizVo.getInvnt_email());
				mailVo.setSend_name(bizVo.getInvnt_nm());				
				
			}else if("1".equals(vo.getAlarm_from())){
				reqUserNm = "[한국생산기술연구원] 특허대표메일";
				
				// 송신자
				mailVo.setSend_person_id("");
				mailVo.setSend_addr("patent@kitech.re.kr");
				mailVo.setSend_name("[한국생산기술연구원] 특허대표메일");
								
			}else{
				reqUserNm = bizVo.getLogin_nm();
				
				// 송신자
				mailVo.setSend_person_id(bizVo.getLogin_syspayno());
				mailVo.setSend_addr(bizVo.getLogin_email());
				mailVo.setSend_name(bizVo.getLogin_nm());
			}
			
			// 수신자
			if("0".equals(vo.getTodo_auth())){ // 발명자
				toAddrVo.setRecv_addr(bizVo.getInvnt_email());
				toAddrVo.setRecv_name(bizVo.getInvnt_nm());
				toAddrVo.setRecv_person_id(bizVo.getInvnt_syspayno());
				
				recvList.add(toAddrVo);
				
				if(!StringUtil.isEmpty(bizVo.getMandate_psn_syspayno()) && !bizVo.getInvnt_syspayno().equals(bizVo.getMandate_psn_syspayno())){
					toAddrVo = new PatMailRecvVo();
					toAddrVo.setRecv_addr(bizVo.getMandate_email());
					toAddrVo.setRecv_name(bizVo.getMandate_nm());
					toAddrVo.setRecv_person_id(bizVo.getMandate_psn_syspayno());
					
					recvList.add(toAddrVo);
				}
				
			}else if("1".equals(vo.getTodo_auth())){ // 특허팀
				toAddrVo.setRecv_addr("patent@kitech.re.kr");
				toAddrVo.setRecv_name("[한국생산기술연구원] 특허대표메일");
				toAddrVo.setRecv_person_id("");
				
				recvList.add(toAddrVo);
				
			}else if("2".equals(vo.getTodo_auth())){ // 사무소
				toAddrVo.setRecv_addr(bizVo.getPatofic_charg_email());
				toAddrVo.setRecv_name(bizVo.getPatofic_charg_nm());
				toAddrVo.setRecv_person_id(bizVo.getPatofic_charg_id());
				
				recvList.add(toAddrVo);
				
				// 특허사무소 인 경우 대표메일로도 가게 수정.
				toAddrVo = new PatMailRecvVo();
				toAddrVo.setRecv_addr(bizVo.getPatofic_email());
				toAddrVo.setRecv_name(bizVo.getPatofic_nm());
				toAddrVo.setRecv_person_id("");
				
				recvList.add(toAddrVo);
			}
			
		}else{
			subject = "[생산기술연구원]선행기술조사 완료 안내";			
			templatePath = "pat/TechComp"; // 템플릿 경로
			
			reqUserNm = bizVo.getResch_respn_nm();
			// 송신자
			mailVo.setSend_addr(bizVo.getPatofic_charg_email());
			mailVo.setSend_name(bizVo.getPatofic_charg_nm());
			
			// 수신자
			toAddrVo.setRecv_addr(bizVo.getResch_respn_syspayno());
			toAddrVo.setRecv_name(bizVo.getResch_respn_nm());
			toAddrVo.setRecv_person_id(bizVo.getResch_respn_email());
			
			recvList.add(toAddrVo);
		}
		
		mailVo.setMail_subject(subject);
		mailVo.setReq_no(bizVo.getReq_no());
		mailVo.setMngmt_no(bizVo.getMngmt_no());		
		
		Map<String, String> templateVar = new HashMap<String, String>();
		templateVar.put("@req_no@", bizVo.getReq_no());
		templateVar.put("@mngmt_no@", bizVo.getMngmt_no());
		templateVar.put("@job_title@", vo.getJob_title());
		templateVar.put("@link_url@", "");
		templateVar.put("@subject@", vo.getJob_title() + " " + vo.getTodo_title());
		templateVar.put("@pat_clsf_nm@", bizVo.getPat_clsf_nm());
		templateVar.put("@smitapp_natn_nm@", bizVo.getSmitapp_natn_nm());
		templateVar.put("@invnt_krn_nm@", bizVo.getInvnt_krn_nm());
		templateVar.put("@invnt_nm@", bizVo.getInvnt_nm());
		templateVar.put("@invnt_mobile@", this.phoneFormat(bizVo.getInvnt_mobile()));
		templateVar.put("@invnt_email@", bizVo.getInvnt_email());
		templateVar.put("@mandate_nm@", bizVo.getMandate_nm());
		templateVar.put("@mandate_mobile@", this.phoneFormat(bizVo.getMandate_mobile()));
		templateVar.put("@mandate_email@", bizVo.getMandate_email());
		templateVar.put("@patofic_nm@", bizVo.getPatofic_nm());
		templateVar.put("@patofic_charg_nm@", bizVo.getPatofic_charg_nm());
		templateVar.put("@patofic_charg_mobile@", this.phoneFormat(bizVo.getPatofic_charg_mobile()));
		templateVar.put("@patofic_charg_email@", bizVo.getPatofic_charg_email());
		templateVar.put("@req_user_nm@", reqUserNm);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		templateVar.put("@req_date@", df.format(new Date()));
		
		String reqDueDate = bizVo.getReq_due_date();
		if(StringUtil.isEmpty(reqDueDate)){
			reqDueDate = DateUtil.formatDate(vo.getTodo_due_date(), "-");
		}
		templateVar.put("@due_date@", reqDueDate);	
		
		try {
			mailVo.setMail_contents(mailSender.buildContent(templatePath, templateVar));
			
			// mailmain 저장
			String mailId = dao.selectMailId(vo);
			// mail 저장
			mailVo.setMail_id(mailId);
			dao.insertPatMailMain(mailVo);
			
			// 수신자 저장
			for(PatMailRecvVo recVo : recvList){
				recVo.setMail_id(mailId);
				dao.insertPatMailRecv(recVo);
			}
		
		} catch (Exception ex) {
			AppLog.error("메일 기타 시스템 오류", ex);
			//throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.send.mail.error", ex);	
		}		
	}
	
	/**
    * PatComService.executePatComWFBiz에서 SMS발송 호출(메일 DB에 넣어 놓고 스케쥴 처리함)
    * @param PatToDoVo, PatComWFBizVo
    * @author LeeYH
    * @since 2022.08.02.
    */
	public void sendSMSWFBiz(PatToDoVo vo, PatComWFBizVo bizVo){
		String subject = "";
		if("2".equals(vo.getTodo_auth())){
			subject = "[생산기술연구원]";
		}else{
			subject = "[지식재산권]";
		}
		subject += vo.getJob_title() + " " + vo.getTodo_title() + " 요청";
		
		// mail template 조회
		MessageTemplateVo tmpVo = dao.selectMessageTemplate("bizp_2019110816423022317910387");
		String content = tmpVo.getTemplate_cont();
		
		content = content.replaceAll("\\#\\{업무단계\\}", vo.getJob_title());
		content = content.replaceAll("\\#\\{세부단계\\}", vo.getTodo_title());
		content = content.replaceAll("\\#\\{신청번호\\}", bizVo.getReq_no());
		content = content.replaceAll("\\#\\{관리번호\\}", bizVo.getMngmt_no());
		content = content.replaceAll("\\#\\{발명의명칭\\}", bizVo.getInvnt_krn_nm());
		
		PatSMSMainVo mainVo = new PatSMSMainVo();
		if("0".equals(vo.getAlarm_from())){
			mainVo.setSend_person_id(bizVo.getInvnt_syspayno());
			mainVo.setSend_number(bizVo.getInvnt_mobile());
			mainVo.setSend_name(bizVo.getInvnt_nm());
			
		}else if("1".equals(vo.getAlarm_from())){
			mainVo.setSend_person_id("20140560");
			mainVo.setSend_number("01035492700");
			mainVo.setSend_name("김훈");
			
		}else{
			mainVo.setSend_person_id(bizVo.getLogin_syspayno());
			mainVo.setSend_number(bizVo.getLogin_mobile());
			mainVo.setSend_name(bizVo.getLogin_nm());
		}
		
		content = content.replaceAll("\\#\\{발신자정보\\}", mainVo.getSend_name());
		
		mainVo.setSend_contents(content);
		mainVo.setSend_subject(subject);
		mainVo.setReq_no(bizVo.getReq_no());
		mainVo.setMngmt_no(bizVo.getMngmt_no());
		
		// 수신자
		PatSMSRecvVo recVo = new PatSMSRecvVo();
		
		if("0".equals(vo.getTodo_auth())){ // 발명자
			recVo.setRecv_number(bizVo.getInvnt_mobile());
			recVo.setRecv_name(bizVo.getInvnt_nm());
			recVo.setRecv_person_id(bizVo.getInvnt_syspayno());
			
		}else if("1".equals(vo.getTodo_auth())){ // 특허팀
			recVo.setRecv_number("01035492700");
			recVo.setRecv_name("김훈");
			recVo.setRecv_person_id("20140560");
			
		}else if("2".equals(vo.getTodo_auth())){
			recVo.setRecv_number(bizVo.getPatofic_charg_mobile());
			recVo.setRecv_name(bizVo.getPatofic_charg_nm());
			recVo.setRecv_person_id(bizVo.getPatofic_charg_id());
		}
		
		// 수신자가 존재할 경우에만 전송
		if(!StringUtil.isEmpty(recVo.getRecv_number())){
			String smsId = dao.selectMailId(vo);
			try{
				// smsMain 저장
				mainVo.setSms_id(smsId);
				dao.insertPatSmsMain(mainVo);
				
				// 수신자 저장
				recVo.setSms_id(smsId);
				dao.insertPatSmsRecv(recVo);			
			}catch(Exception e){
				AppLog.error(e.getMessage());
			}
		}
		
	}
	
	/**
	 * 전화번호 포맷팅
	 */
	public String phoneFormat(String phoneNo) {

		if (phoneNo == null || phoneNo.length() == 0) {
			return phoneNo;
		}

		String strTel = phoneNo;
		String[] strDDD = { "02", "031", "032", "033", "041", "042", "043", "051", "052", "053", "054", "055", "061", "062", "063", "064", "010", "011", "012", "013", "015",
				"016", "017", "018", "019", "070" };

		if (strTel.length() < 9) {
			return strTel;
		} else if (strTel.substring(0, 2).equals(strDDD[0])) {
			strTel = strTel.substring(0, 2) + '-' + strTel.substring(2, strTel.length() - 4) + '-' + strTel.substring(strTel.length() - 4, strTel.length());
		} else {
			for (int i = 1; i < strDDD.length; i++) {
				if (strTel.substring(0, 3).equals(strDDD[i])) {
					strTel = strTel.substring(0, 3) + '-' + strTel.substring(3, strTel.length() - 4) + '-' + strTel.substring(strTel.length() - 4, strTel.length());
				}
			}
		}

		return strTel;
	} 

}
