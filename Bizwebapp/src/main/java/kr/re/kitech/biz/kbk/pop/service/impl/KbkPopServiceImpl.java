package kr.re.kitech.biz.kbk.pop.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.kbk.pop.dao.KbkPopDAO;
import kr.re.kitech.biz.kbk.pop.service.KbkPopService;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopBookDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopBookTransVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJournalDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopSearchVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

@Service("kbkPopServiceImpl")
public class KbkPopServiceImpl implements KbkPopService {

	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
    @Resource(name="kbkPopDAO")
    private KbkPopDAO kbkPopDAO;
	
	@Resource(name="mailSender")
	private MailSender mailSender;
	
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;

	@Override
	public KbkPopBookDetailVo selectBookDetail(KbkPopSearchVo searchVo) throws ElException {
		return kbkPopDAO.selectBookDetail(searchVo);
	}
	
	/**
     * 단행본 저장
     * @param KbkPopBookDetailVo
     * @return String
     * @throws Exception
     */
	@Override
	public String saveBookDetail(KbkPopBookDetailVo bookDtlVo) throws ElException {
		String rowStatus = bookDtlVo.getRowStatus();		
		String regst_no = "";
		if (rowStatus.equals("C")) {
			regst_no = kbkPopDAO.insertBook(bookDtlVo);
			
		} else if (rowStatus.equals("U")) {
			kbkPopDAO.updateBook(bookDtlVo);
			regst_no = bookDtlVo.getRegst_no();
		}
		
		if(bookDtlVo.isApproval()){
			this.approvalBookDetail(bookDtlVo);
		}
		
		return regst_no;
	}
	
	/**
     * 단행본 삭제
     * @param KbkPopBookDetailVo
     * @return String
     * @throws Exception
     */
	@Override
	public void deleteBookDetail(KbkPopBookDetailVo bookDtlVo) throws ElException {
		kbkPopDAO.deleteBookDetail(bookDtlVo);
	}
	
	/**
     * 단행본 등재완료
     * @param KbkPopBookDetailVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.21.
     */
	private void approvalBookDetail(KbkPopBookDetailVo vo) throws ElException {
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getCheckup_req_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		
		apprFuncService.formAccept(aprVo);
	}
	
	@Override
	public KbkPopReportDetailVo selectReportDetail(KbkPopSearchVo searchVo) throws ElException {
		// TODO Auto-generated method stub
		return kbkPopDAO.selectReportDetail(searchVo);
	}
	
	@Override
	public void saveReportDetail(KbkPopReportDetailVo reportDtlVo) throws ElException {
		String rowStatus = reportDtlVo.getRowStatus();
		if (rowStatus.equals("C")) {
			kbkPopDAO.insertReport(reportDtlVo);
		} else if (rowStatus.equals("U")) {
			kbkPopDAO.updateReport(reportDtlVo);
		}
		
		
	}
	
	@Override
	public void deleteReportDetail(KbkPopReportDetailVo reportDtlVo) throws ElException {
		kbkPopDAO.deleteReport(reportDtlVo);
	}
	
	/**
     * 단행본 폐기/이관 또는 복구
     * @param KbkPopBookTransVo
     * @throws Exception
     */
	@Override
	public void saveBookTrans(KbkPopBookTransVo bookTransVo) throws ElException {
		// TODO 폐기/이관 삭제 로직 추가 필요
		String rowStatus = bookTransVo.getRowStatus();
		KbkPopBookDetailVo bookDtlVo = new KbkPopBookDetailVo();
		if (rowStatus.equals("C")) {
			bookDtlVo.setRegst_no(bookTransVo.getRegst_no());
			// AppLog.debug(bookTransVo.toString());
			kbkPopDAO.insertBookTrans(bookTransVo);
			kbkPopDAO.deleteBookDetail(bookDtlVo);
		} else {
			bookDtlVo = kbkPopDAO.selectBookTrans(bookTransVo);
			kbkPopDAO.deleteBookTrans(bookTransVo);
			kbkPopDAO.insertBook(bookDtlVo);
		}
	}
	
	@Override
	public List<KbkPopReportDetailVo> selectReportList(KbkPopReportDetailVo searchVo) throws ElException {
		return kbkPopDAO.selectReportList(searchVo);
	}
	
	@Override
	public KbkPopJournalDetailVo selectJournal(KbkPopJournalDetailVo vo) throws ElException {
		return kbkPopDAO.selectJournal(vo);
	}
	
	@Override
	public KbkPopPaperDetailVo selectPaper(KbkPopPaperDetailVo vo) throws ElException {
		return kbkPopDAO.selectPaper(vo);
	}
	
	@Override
	public KbkPopPaperDetailVo selectAttnceInfo(KbkPopPaperDetailVo vo) throws ElException {
		return kbkPopDAO.selectAttnceInfo(vo);
	}
	
	@Override
	public List<KbkPopPaperDetailVo> selectPaperPopList(KbkPopPaperDetailVo searchVo) throws ElException {
		return kbkPopDAO.selectPaperPopList(searchVo);
	}
	
	@Override
	public void deletePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException {
		kbkPopDAO.deletePaperDetail(paperDtlVo);
	}
	
	@Override
	public void savePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException {

		String rowStatus = paperDtlVo.getAction();
		
		if (rowStatus.equals("C")) {
			kbkPopDAO.insertPaperDetail(paperDtlVo);
		} else if (rowStatus.equals("U")) {
			kbkPopDAO.updatePaperDetail(paperDtlVo);
		}
		
	}

	@Override
	public KbkPopCopyVo selectCopyPop(KbkPopCopyVo vo) throws ElException {
		return kbkPopDAO.selectCopyPop(vo);
	}

	@Override
	public void deleteCopyPop(KbkPopCopyVo vo) throws ElException {
		kbkPopDAO.deleteCopyPop(vo);
	}

	@Override
	public void insertCopyPop(KbkPopCopyVo vo) throws ElException {
		kbkPopDAO.insertCopyPop(vo);
	}

	@Override
	public void updateCopyPop(KbkPopCopyVo vo) throws ElException {
		kbkPopDAO.updateCopyPop(vo);
	}


	@Override
	public void sendCopyMail(KbkPopCopyVo vo) throws ElException {
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		
		String subject = "원문복사신청 안내 메일";
		String toAddr = "aroma@kitech.re.kr";
		//String toAddr = "eip3da.dev1@kitech.re.kr"; // 테스트
       	
		String templatePath = "kbk/KbkOriginalCopyReg";
		String syspayno = siteUserHeader.getSession().getSn();
		String sender = siteUserHeader.getSession().getEmail();
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		
		// mail content
		Map<String, String> templateVar = new HashMap<String, String>();
		
		templateVar.put("@sinchangja@", vo.getReq_psn_syspaynm()+"("+vo.getReq_psn_syspayno()+")");
		templateVar.put("@sinchangkind@", vo.getOrigntxt_copy_typ());
		templateVar.put("@nonmonmeng@", vo.getJurnl_nm());
		templateVar.put("@jelermeng@", vo.getPaper_nm_pat());
		templateVar.put("@startpage@", vo.getOrign_page());
		templateVar.put("@acctno@", vo.getAccnt_no());
		
		if(vo.getFlag().equals("D")){
			subject="원문복사신청 취소 안내 메일";
			templateVar.put("@delete@","신청자가 원문복사 신청 내용을 삭제 하였습니다");
		}else{
			templateVar.put("@delete@","");
		}
		
		MailTemplateVo templateVo = new MailTemplateVo();
		templateVo.setContentVar(templateVar);
		templateVars.add(templateVo);

		try{	
			mailSender.sendMessage(
				new BizMail.Builder(syspayno, Business.KBK, true)
					.senderEmail(sender)
					.toAddr(toAddr)
					.subject(subject)
					.savesent(false)
					.logging(true)
					.templatePath(templatePath)
					.templateVars(templateVars)
			.build());
		}catch(Exception e){
			AppLog.debug("\n ------------------------ 원문복사 메일 오류 발생", e);
		}
	}
	
	
	@Override
	public List<KbkPopJurnlVo> selectJurlNoList(KbkPopJurnlVo searchVo) throws ElException {
		return kbkPopDAO.selectJurlNoList(searchVo);
	}	
	
	@Override
	public KbkPopJurnlDetailVo selectJurnlDetailList(KbkPopJurnlDetailVo vo) throws ElException {
		return kbkPopDAO.selectJurnlDetailList(vo);
	}
	
	@Override
	public void saveJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException {
	
		String rowStatus = vo.getRowStatus();
		
		if (rowStatus.equals("C")) {
			kbkPopDAO.insertJurnlDetail(vo);
		} else if (rowStatus.equals("U")) {
			kbkPopDAO.updateJurnlDetail(vo);
		}
	}
	
	@Override
	public void deleteJurnlDetail(KbkPopJurnlDetailVo paperDtlVo) throws ElException {
		kbkPopDAO.deleteJurnlDetail(paperDtlVo);
	}
	
}
