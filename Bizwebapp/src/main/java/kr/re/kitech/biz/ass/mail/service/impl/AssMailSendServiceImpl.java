package kr.re.kitech.biz.ass.mail.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ass.mail.dao.AssMailSendDAO;
import kr.re.kitech.biz.ass.mail.service.AssMailSendService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**
 * MailSendServiceImpl 자산관리 메일발송 ServiceImpl
 * 
 * @author JeonJW
 * @since 2022.07.29.
 */
 @Service("assMailSendService")
public class AssMailSendServiceImpl extends EgovAbstractServiceImpl implements AssMailSendService {

	@Resource(name="mailSender")
	private MailSender mailSender;
	
	@Resource(name="assMailSendDAO")
	private AssMailSendDAO mailDao;
	
	/**
    * 자산이동신청(A13), 자산외부설치(A14) 결재완료 후 메일발송
    * @param String reqNo, String syspayNo, String reqNoSub
    * @author JeonJW
    * @since 2022.07.29.
    */
	@Override
	public void mailSendAssMove(String reqNo, String syspayNo, String reqNoSub) {
		// 1) 메일 수신자 조회 및 세팅
		List<Map<String,String>> assMoveMailRecList_1 = mailDao.selectAssMoveMailRec_1(reqNo);
		List<Map<String,String>> assMoveMailRecList_2 = mailDao.selectAssMoveMailRec_2(syspayNo);
		List<String> toAddrList = new ArrayList<String>();
		
		for(Map<String,String> assMoveMailRecMap_1 : assMoveMailRecList_1){
			toAddrList.add(assMoveMailRecMap_1.get("email"));
		}		
		for(Map<String,String> assMoveMailRecMap_2 : assMoveMailRecList_2){
			toAddrList.add(assMoveMailRecMap_2.get("email"));
		}
		
//		AppLog.debug("\n ############# toAddrList : " + toAddrList.toString());
		// TODO test
//		toAddrList = new ArrayList<String>();
//		toAddrList.add("eipleeyh@kitech.re.kr");
		
		// 2) 메일 발신자 조회 및 세팅
		String assMoveMailSen = "";
		if("A13".equals(reqNoSub)){ // 자산이동신청
			assMoveMailSen = mailDao.selectAssMoveMailSen("AGA010");
		}else if("A14".equals(reqNoSub)){ // 자산외부설치
			assMoveMailSen = mailDao.selectAssMoveMailSen("AGA020");
		}
		
		// 3) 자산이동신청, 자산외부설치 정보 조회 및 세팅
		List<Map<String,String>> assMoveInfo = mailDao.selectAssMoveInfo(reqNo);
		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		
		if("A13".equals(reqNoSub)){ // 자산이동신청
			for(Map<String,String> assMoveInfoMap : assMoveInfo){
				String brin_schdl_ymd = assMoveInfoMap.get("brin_schdl_ymd");
				String tout_schdl_ymd = assMoveInfoMap.get("tout_schdl_ymd");
				String brin_schdl_ymd_format = brin_schdl_ymd.substring(0, 4) + "년" + brin_schdl_ymd.substring(4, 6) + "월" + brin_schdl_ymd.substring(6, 8) + "일";
				String tout_schdl_ymd_format = tout_schdl_ymd.substring(0, 4) + "년" + tout_schdl_ymd.substring(4, 6) + "월" + tout_schdl_ymd.substring(6, 8) + "일";
				
				templateVar.put("@ReqNo@", assMoveInfoMap.get("req_no"));
				templateVar.put("@BrinSchdlYmd@", brin_schdl_ymd_format);
				templateVar.put("@ToutSchdlYmd@", tout_schdl_ymd_format);
				templateVar.put("@UserNm@", assMoveInfoMap.get("user_nm"));
				templateVar.put("@UserEmpno@", assMoveInfoMap.get("user_empno"));
				templateVar.put("@PosiNm@", assMoveInfoMap.get("posi_nm"));
			}
		}else if("A14".equals(reqNoSub)){ // 자산외부설치
			for(Map<String,String> assMoveInfoMap : assMoveInfo){
				String out_instl_ymd_st = assMoveInfoMap.get("out_instl_ymd_st");
				String out_instl_ymd_ed = assMoveInfoMap.get("out_instl_ymd_ed");
				String out_instl_ymd_st_format = out_instl_ymd_st.substring(0, 4) + "년" + out_instl_ymd_st.substring(4, 6) + "월" + out_instl_ymd_st.substring(6, 8) + "일";
				String out_instl_ymd_ed_format = out_instl_ymd_ed.substring(0, 4) + "년" + out_instl_ymd_ed.substring(4, 6) + "월" + out_instl_ymd_ed.substring(6, 8) + "일";
				
				templateVar.put("@ReqNo@", assMoveInfoMap.get("req_no"));
				templateVar.put("@UserNm@", assMoveInfoMap.get("user_nm"));
				templateVar.put("@UserEmpno@", assMoveInfoMap.get("user_empno"));
				templateVar.put("@Cause@", assMoveInfoMap.get("cause"));
				templateVar.put("@InputPrjNm@", assMoveInfoMap.get("prj_nm"));
				templateVar.put("@InputInstlVend@", assMoveInfoMap.get("instl_vend_nm"));
				templateVar.put("@OutInstlYmdSt@", out_instl_ymd_st_format);
				templateVar.put("@OutInstlYmdEd@", out_instl_ymd_ed_format);
				templateVar.put("@asetNo@", assMoveInfoMap.get("aset_no"));
				templateVar.put("@asetNm@", assMoveInfoMap.get("aset_nm"));
			}
		}
		
		// 4) 제목 및 템플릿 경로 세팅
		String subject = "";
		String templatePath = "";
		if("A13".equals(reqNoSub)){ // 자산이동신청
			subject = "물품반출 승인 안내";
			templatePath = "ass/AssAppMoveAck";
		}else if("A14".equals(reqNoSub)){ // 자산외부설치
			subject = "외부설치, 운영 안내";
			templatePath = "ass/AssAppOutInstAck";
		}
		
		templateVo.setContentVar(templateVar);		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);

		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(syspayNo, Business.ASS, true)
				.senderEmail(assMoveMailSen)
				.toAddr(toAddrList)
				//.ccAddr(ccAddress)
				.subject(subject)
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath(templatePath)
				.templateVars(templateVars)
			.build());
	}
}
