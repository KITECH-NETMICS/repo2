package kr.re.kitech.biz.epu.mail.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.epu.mail.dao.EpuMailSendDAO;
import kr.re.kitech.biz.epu.mail.service.EpuMailSendService;
import kr.re.kitech.biz.epu.mail.vo.BidMailSendVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**
 * @ClassSubJect 구매조달 메일발송 SERVICEIMPL
 * @Class Name EpuMailSendServiceImpl.java
 * @Description 구매조달 메일발송 
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/19      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/19
 * @version 1.0
 * @see
 * 
 */
@Service("epuMailSendService")
public class EpuMailSendServiceImpl extends EgovAbstractServiceImpl implements EpuMailSendService {
	@Autowired
	private MailSender mailSender;
	
	@Resource(name="epuMailSendDAO")
	private EpuMailSendDAO mailDao;

	/**
    * 발주계획 결재완료 후 메일발송
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.06.
    */
	@Override
	public void sendMailBidApr(String reqNo) {
		String[] arr = reqNo.split("-");
		if(arr.length != 2){
			throw new KitechException(Exceptions.ERROR, Business.EPU, "message.xom.co.com.0007", new String[]{"발주계획번호"});
		}
		BidMailSendVo bidVo = new BidMailSendVo();
		bidVo.setBid_ord_no(arr[0]);
		bidVo.setChg_no(arr[1]);
		
		// 발주내역 조회
		bidVo = mailDao.selectEpuOrdMastrForMail(bidVo);		
		
		// 2020.09.07 계약방법 수의(총액) - 수의(총액)소액수의 나라장터 견적요청 공고 안내 메일 발송
		// 2023.01.17 최초 발송 이후 발송되지 않도록 수정
		if((("4100".equals(bidVo.getContrct_method()) && "4101".equals(bidVo.getBid_succ_method())) 
		        || ("EGF030".equals(bidVo.getPur_clsf_cd()) && "42050".equals(bidVo.getContrct_method()))) && !"Y".equals(bidVo.getApr_mail_send_yn()) ){
			
			List<MailTemplateVo> templateVars = new ArrayList<>();
			
			// mail content
			Map<String, String> templateVar = new HashMap<String, String>();
			templateVar.put("@purReqNo@", bidVo.getPur_req_no());
			templateVar.put("@bidTitle@", bidVo.getBid_title());
			templateVar.put("@purReqNm@", bidVo.getDelvr_plc_nm());
			templateVar.put("@notiLastYmd@", bidVo.getNoti_last_ymd());
			templateVar.put("@chargeNm@", bidVo.getCharg_nm());
			
			MailTemplateVo templateVo = new MailTemplateVo();
			templateVo.setContentVar(templateVar);
			templateVars.add(templateVo);
			
			// 수신자
			List<String> toAddress = new ArrayList<String>();
			toAddress.add(bidVo.getReq_psn_email());
			toAddress.add(bidVo.getAccnt_rspns_email());
			
			//AppLog.debug("\n --------------------------- toAddress : " + toAddress.toString());
			// TODO TEST
//			toAddress = new ArrayList<String>();
//			toAddress.add("eipleeyh@kitech.re.kr");
			
			try{			
				mailSender.sendMessage(
					// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
					new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.EPU, true)
						.senderEmail(bidVo.getCharg_email())
						//.senderEmail("") // test
						.toAddr(toAddress)
						//.ccAddr(ccAddress)
						.subject("[구매장비관리실] 나라장터 견적요청 공고 안내 (" + bidVo.getBid_title() + " / " + bidVo.getNoti_last_ymd() + " 마감")
						.savesent(true)	// 받은 편지함 저장 여부
						.logging(true)	// 로그 저장 여부
						.templatePath("epu/BidiComplete")
						.templateVars(templateVars)
					.build());
			}catch(Exception e){
				AppLog.debug("\n ------------------------ 구매 메일 발송 오휴 발생 : " + reqNo);
			}
			
			mailDao.updateEpuOrdMastrAprMailSendYn(bidVo);
		}
		
		if("P82".equals(reqNo.substring(0,3))){
			// 1)수신자 및 발신자 조회
			List<BidMailSendVo> rsvList = mailDao.selectEpuOrdMastrForMail2(bidVo);
			
			// 2) 발신자
			String fromAddress = rsvList.get(0).getBid_regst_email();
			
			// 3) 수신자
			List<String> toAddress = new ArrayList<String>();
			
			for(BidMailSendVo vo : rsvList){
				if(!toAddress.contains(vo.getMain_email())){
					toAddress.add(vo.getMain_email());
				}
				if(!toAddress.contains(vo.getSub_email())){
					toAddress.add(vo.getSub_email());
				}
				if(!toAddress.contains(vo.getReq_psn_email())){
					toAddress.add(vo.getReq_psn_email());
				}
			}
			
			//AppLog.debug("\n --------------------------- toAddress P82 : " + toAddress.toString());
			// TODO TEST
//			toAddress = new ArrayList<String>();
//			toAddress.add("eipleeyh@kitech.re.kr");
			
			// 4) 메일내용 조회
			bidVo = mailDao.selectEpuOrdMastrForMailCont(bidVo);
			if(bidVo == null){
				//AppLog.debug("\n --------------------------- 메일내용 조회  없음");
				return;
			}
			
			String bidApplyEndYmd = bidVo.getBid_apply_end_ymd();
			String tmpBidApplyEndYmd = bidApplyEndYmd.substring(0, 4) + "년 " + bidApplyEndYmd.substring(4, 6) + "월 " + bidApplyEndYmd.substring(6, 8) + "일 ";
			tmpBidApplyEndYmd += bidApplyEndYmd.substring(8, 10) + ":" + bidApplyEndYmd.substring(10, 12) + " 까지";
			
			// 개찰일시
			String openYmd = bidVo.getOpen_ymd();
			String tmpOpenYmd = openYmd.substring(0, 4) + "년 " + openYmd.substring(4, 6) + "월 " + openYmd.substring(6, 8) + "일";
			
			// 공고일자
			String notiYmd = bidVo.getNoti_ymd();
			String tmpNotiYmd = notiYmd.substring(0, 4) + "년 " + notiYmd.substring(4, 6) + "월 " + notiYmd.substring(6, 8) + "일";
			
			List<MailTemplateVo> templateVars = new ArrayList<MailTemplateVo>();
			
			Map<String, String> templateVar = new HashMap<String, String>();
			templateVar.put("@purReqNo@", bidVo.getPur_req_no());
			templateVar.put("@bidTitle@", bidVo.getBid_title());
			templateVar.put("@bidApplyEndYmd@", tmpBidApplyEndYmd); // 입찰 참가자격 등록마감일시
			
			templateVar.put("@chargeNm@", bidVo.getCharg_nm()); // 구매담당자
			templateVar.put("@extNo@", bidVo.getExt_no()); // 구매담당자 전화번호
			templateVar.put("@openPrd@", tmpNotiYmd + " ~ " + tmpOpenYmd); // 공고서 게시기간
			templateVar.put("@openYmd@", tmpOpenYmd + " " + openYmd.substring(8, 10) + ":" + openYmd.substring(10, 12) + " 이후"); // 개찰일시
			templateVar.put("@bidNotiNo@", bidVo.getBid_ord_no());
			templateVar.put("@chgNo@", bidVo.getOrd_chg_no());
			templateVar.put("@@links@", "");
			
			MailTemplateVo templateVo = new MailTemplateVo();
			templateVo.setContentVar(templateVar);
			templateVars.add(templateVo);
			
			try{
				mailSender.sendMessage(
					// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
					new BizMail.Builder(KitechContextUtil.getSyspayno(), Business.EPU, true)
						.senderEmail(fromAddress)
						//.senderEmail("") // test
						.toAddr(toAddress)
						//.ccAddr(ccAddress)
						.subject("입찰공고 게시안내 [" + bidVo.getBid_title() + "(" + bidVo.getPur_req_no() + ")")
						.savesent(true)	// 받은 편지함 저장 여부
						.logging(true)	// 로그 저장 여부
						.templatePath("epu/BidNotiComplete")
						.templateVars(templateVars)
					.build());
			}catch(Exception e){
				AppLog.debug("\n ------------------------ 구매 메일 발송 오휴 발생(P82) : " + reqNo);
			}
			
			// 5) 입찰공고테이블 메일발송여부 Y 업데이트
			mailDao.updateEpuNotiMastrMailSendYn(bidVo);		
		}
	}

}
