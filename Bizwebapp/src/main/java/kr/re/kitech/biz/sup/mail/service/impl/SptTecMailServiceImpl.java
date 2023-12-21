package kr.re.kitech.biz.sup.mail.service.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.sup.mail.dao.SptTecMailDAO;
import kr.re.kitech.biz.sup.mail.service.SptTecMailService;
import kr.re.kitech.biz.sup.mail.vo.SptUnPaidMailVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**  
 * @ClassSubJect 기술지원 메일발송
 * @Class Name SptTecMailServiceImpl.java
 * @Description 기술지원 메일발송 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/01   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/08/01
 * @version 1
 * @see
 * 
 */
@Service("sptTecMailService")
public class SptTecMailServiceImpl extends EgovAbstractServiceImpl implements SptTecMailService {
	@Autowired
	private MailSender mailSender;
	
	@Resource(name="sptTecMailDAO")
	private SptTecMailDAO dao;
	
	/**
     * 미수수탁정산결의 정산신청 메일발송
     * @param List<SptTecAdjstSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.01.
     */
	@Override
	public void sendSptUnpaidReq(List<SptTecAdjstSlipVo> slipList) throws Exception {	
		// 01. 송신자
		BizUserHeader userHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		String sender = userHeader.getSession().getCn() + "<" +userHeader.getSession().getEmail() + ">";
		AppLog.debug("\n ----------------------------- sender : " + sender);
		
		List<MailTemplateVo> templateVars = null;
		Map<String,String> templateVar = null;
		
		DecimalFormat df1 = new DecimalFormat("#,###");
		
		for(SptTecAdjstSlipVo adjstVo : slipList){
			templateVars = new ArrayList<MailTemplateVo>();
			
			SptUnPaidMailVo mailSrcVo = new SptUnPaidMailVo();
			mailSrcVo.setUnslip_no(adjstVo.getChrg_unslip_no());
			mailSrcVo.setUnslip_odr(adjstVo.getChrg_unslip_odr());
			mailSrcVo.setBill_no(adjstVo.getBill_no());
			
			List<SptUnPaidMailVo> mailList = dao.selectSptTecRcptInfoMail(mailSrcVo);			
			
			for(SptUnPaidMailVo mailVo : mailList){
				templateVar = new HashMap<String,String>();
				templateVar.put("@UnslipNo@", mailVo.getUnslip_no());
				templateVar.put("@VendAbbr@", adjstVo.getVend_nm());
				templateVar.put("@AccntNo@", adjstVo.getAccnt_no());
				templateVar.put("@AccntRspnsNm@", mailVo.getAccnt_rspns_nm());
				templateVar.put("@KolasNo@", mailVo.getKolas_no());
				templateVar.put("@DecsnAmt@", df1.format(mailVo.getDecsn_amt()));
				
				templateVar.put("@BillIssuYmd@", mailVo.getBill_issu_ymd());
				templateVar.put("@BillNo@", mailVo.getBill_no());
				templateVar.put("@BillIssuAmt@", df1.format(adjstVo.getDecsn_amt()));
				
				MailTemplateVo templateVo = new MailTemplateVo();
				templateVo.setContentVar(templateVar);
				templateVars.add(templateVo);	
				
				String toAddress = mailVo.getRcpt_psn_nm() + "<" + mailVo.getRcpt_psn_email() + ">";
				//AppLog.debug("\n ----------------------------- toAddress : " + toAddress);
				//toAddress = "eipleeyh@kitech.re.kr";
				
				mailSender.sendMessage(
					// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
					new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.SUP, true)
						.senderEmail(sender)
						//.senderEmail("")
						.toAddr(toAddress)
						.subject("미수수탁정산을 신청요청")
						.savesent(false)	// 받은 편지함 저장 여부
						.logging(true)	// 로그 저장 여부
						.templatePath("spt/CnsnmtAdjstSlipReqMail")
						.templateVars(templateVars)
					.build()
				);
			} // end for
		} // end for
	}

}
