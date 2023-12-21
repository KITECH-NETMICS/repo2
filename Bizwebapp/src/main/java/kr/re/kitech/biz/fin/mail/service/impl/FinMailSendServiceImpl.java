package kr.re.kitech.biz.fin.mail.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.mail.dao.FinMailSendDAO;
import kr.re.kitech.biz.fin.mail.service.FinMailSendService;
import kr.re.kitech.biz.fin.mail.vo.FinBillEmailSendVo;
import kr.re.kitech.biz.fin.mail.vo.SmlItmCheckMailVo;
import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**
 * @ClassSubJect 재무관리 메일발송 SERVICEIMPL
 * @Class Name FinMailSendServiceImpl.java
 * @Description 재무관리 메일발송 
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/04
 * @version 1.0
 * @see
 * 
 */
@Service("finMailSendService")
public class FinMailSendServiceImpl extends EgovAbstractServiceImpl implements FinMailSendService {
	@Autowired
	private MailSender mailSender;
	
	@Resource(name="finMailSendDAO")
	private FinMailSendDAO mailDao;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
	
	/**
    * 소액물품결의(119) 결재완료 후 메일발송
    * @param String reqNo, String sysPayNo
    * @author LeeYH
    * @since 2022.08.04.
    */
	public void mailSendSmlItemApr(String unslipNo, String sysPayNo){
		SmlItmCheckMailVo chkVo = mailDao.selectFspSmlItmCheckupHMail(unslipNo);
		
		if(chkVo == null) return;
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		
		Map<String,String> templateVar = new HashMap<String,String>();
		templateVar.put("@checkupReqNo@", chkVo.getCheck_no());
		templateVar.put("@contrctNm@", chkVo.getRmk());
		templateVar.put("@contrctTotAmt@", StringUtil.toCurrency(String.valueOf(chkVo.getCheck_amt())));
		templateVar.put("@accntNm@", chkVo.getAccnt_expns());
		templateVar.put("@delvrYmd@", DateUtil.formatDate(chkVo.getDelvr_ymd(), "-"));
		templateVar.put("@checkYmd@", DateUtil.formatDate(chkVo.getCheck_ymd(), "-"));
		
		MailTemplateVo templateVo = new MailTemplateVo();
		templateVo.setContentVar(templateVar);
		templateVars.add(templateVo);		
		
		// 수신자
		HashSet <String> set = new HashSet<String>();		
		set.add(chkVo.getCheck_psn_email());
		set.add(chkVo.getEntsch_check_psn_email());
		String[] chgrEmails = chkVo.getChgr_psn_email().split(",");
		for(String chgrEmail : chgrEmails){
			set.add(chgrEmail);
		}		
		
		List<String> toAddress = new ArrayList<String>();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			toAddress.add(iter.next());
		}
		
		AppLog.debug("\n ----------------------------- toAddress : " + toAddress.toString());
		// test
//		toAddress = new ArrayList<String>();
//		toAddress.add("eipleeyh@kitech.re.kr");
					
		// from address setting
//		String roleCode = "1015208"; // 자산담당자(원본부)
//		if("143".equals(chkVo.getExpns_cd())){
//			roleCode = "1013201"; // 총무안전보안실(연구도서)
//		}
		
//		List<UserVo> userList = accntService.findUsersByRoleCodes(new String[]{roleCode});
//		String fromAddress = "";
		//AppLog.debug("\n ----------------------------- userList : " + userList.toString());
		
		// 롤코드 권한의 첫번째만 조회하고있어 하드코딩 처리함.
		/*for(UserVo userVo : userList){
			fromAddress = userVo.getCn() + " <" + userVo.getMail()+ ">";
			if(!"".equals(fromAddress)) break;
		}*/
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(sysPayNo, Business.FIN, true)
//				.senderEmail("안건호 <aghmot@kitech.re.kr>")
				.senderEmail("")
				.toAddr(toAddress)
				//.ccAddr(ccAddress)
				.subject("소액물품 " + chkVo.getCheck_no() + " 의 자산등재를 요청드립니다")
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath("fin/ChkupComplete")
				.templateVars(templateVars)
			.build());
			
	}
	
	/**
     * 매출계산서(관) 미처리이메일전송
     * @param FinTaxSearchVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.05.
     */
	public void sendFtxBillUnprcsEmail(FinTaxSearchVo vo) throws KitechException{
		List<FinBillEmailSendVo> mailList = mailDao.selectFtxBillForEmail(vo);
		
		if(mailList == null || mailList.size() == 0) return;
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		Map<String,String> templateVar = null;
		// 수신자
		HashSet <String> set = new HashSet<String>();	
		
		String contents = "";
		for(FinBillEmailSendVo mailVo : mailList){
			contents += "<tr style='margin:0;padding:0;font-size:13px;color:#3d3d3d;font-family:\"Apple SD Gothic Neo\", \"Malgun Gothic\", Sans-Serif;'>";
			contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getBill_no() + "</td>"; // 계산서번호
			contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getAccnt_no() + "</td>"; // 계정번호
			contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getVend_abbr() + "</td>"; // 거래처
			contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getBsns_psn_regst_no() + "</td>"; // 사업자등록번호
			contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getIssu_ymd() + "</td>"; // 작성일자
			contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:right;'>" + StringUtil.toCurrency(mailVo.getSuply_value()) + "</td>"; // 공급가액
			contents += "</tr>";
			
			set.add(mailVo.getEmail());
		}
		
		templateVar = new HashMap<String,String>();
		templateVar.put("@@data@", contents);
		
		MailTemplateVo templateVo = new MailTemplateVo();
		templateVo.setContentVar(templateVar);
		templateVars.add(templateVo);	
		
		// 수신자
		List<String> toAddress = new ArrayList<String>();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			toAddress.add(iter.next());
		}
		
		AppLog.debug("\n ----------------------------- toAddress : " + toAddress.toString());
		// test
//		toAddress = new ArrayList<String>();
//		toAddress.add("eipleeyh@kitech.re.kr");
//		toAddress.add("eipahnhy@kitech.re.kr");
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.FIN, true)
				.senderEmail(KitechContextUtil.getName() + "<" + KitechContextUtil.getUserId() +"@kitech.re.kr>")
				.toAddr(toAddress)
				//.ccAddr(ccAddress)
				.subject("매출계산서 미처리내역 (" + vo.getFrom_ymd() + "~" + vo.getTo_ymd() + ")")
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부				
				.templatePath("fin/FinBillRegstSel2")
				.templateVars(templateVars)
			.build());
	}
	
	/**
     * 매입계산서(관) 미처리이메일전송
     * @param FinPurTaxSrcVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.05.
     */
	public void sendKtxBillUnprcsEmail(FinPurTaxSrcVo vo) throws KitechException{
		List<FinBillEmailSendVo> mailList = mailDao.selectKtxBillForEmail(vo);
		
		// 조회건수가 있을 경우에만 메일 발송
		if(mailList != null && mailList.size() > 0){
			List<MailTemplateVo> templateVars = new ArrayList<>();
			Map<String,String> templateVar = null;
			// 수신자
			HashSet <String> set = new HashSet<String>();	
			
			String contents = "";
			for(FinBillEmailSendVo mailVo : mailList){
				contents += "<tr style='margin:0;padding:0;font-size:12px;color:#3d3d3d;font-family:\"Apple SD Gothic Neo\", \"Malgun Gothic\", Sans-Serif;'>";
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getBill_no() + "</td>"; // 계산서번호
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getVend_abbr() + "</td>"; // 거래처
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getBsns_psn_regst_no() + "</td>"; // 사업자등록번호
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getIssu_ymd() + "</td>"; // 작성일자
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:right;'>" + StringUtil.toCurrency(mailVo.getSuply_value()) + "</td>"; // 공급가액
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + StringUtil.toCurrency(mailVo.getTax_amt()) + "</td>"; // 세액
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + StringUtil.toCurrency(mailVo.getTotl_amt()) + "</td>"; // 합계금액
				contents += "<td style='height:30px;line-height:30px;border:1px solid #DDDDDD;padding:0 10px;background-color:#fff;text-align:left;'>" + mailVo.getWrte_psn_nm() + "</td>"; // 비고						
				contents += "</tr>";
				
				set.add(mailVo.getEmail());
			}
			
			templateVar = new HashMap<String,String>();
			templateVar.put("@@data@", contents);
			
			MailTemplateVo templateVo = new MailTemplateVo();
			templateVo.setContentVar(templateVar);
			templateVars.add(templateVo);	
			
			// 수신자
			List<String> toAddress = new ArrayList<String>();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()){
				toAddress.add(iter.next());
			}
			
			AppLog.debug("\n ----------------------------- toAddress : " + toAddress.toString());
			// test
	//		toAddress = new ArrayList<String>();
	//		toAddress.add("eipleeyh@kitech.re.kr");
	//		toAddress.add("eipahnhy@kitech.re.kr");
			
			mailSender.sendMessage(
				// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
				new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.FIN, true)
					.senderEmail(KitechContextUtil.getName() + "<" + KitechContextUtil.getUserId() +"@kitech.re.kr>")
					.toAddr(toAddress)
					//.ccAddr(ccAddress)
					.subject("매입계산서 미처리내역 (" + vo.getFrom_ymd() + "~" + vo.getTo_ymd() + ")")
					.savesent(false)	// 받은 편지함 저장 여부
					.logging(true)	// 로그 저장 여부				
					.templatePath("fin/FinBillDetlsKwanSel")
					.templateVars(templateVars)
				.build());
		}
	}
}
