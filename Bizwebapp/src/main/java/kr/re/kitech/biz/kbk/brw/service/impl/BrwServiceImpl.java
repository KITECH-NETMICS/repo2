package kr.re.kitech.biz.kbk.brw.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.kbk.brw.dao.BrwDAO;
import kr.re.kitech.biz.kbk.brw.service.BrwService;
import kr.re.kitech.biz.kbk.brw.vo.KbkBookLoanVo;
import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

@Service("brwService")
public class BrwServiceImpl extends EgovAbstractServiceImpl implements BrwService {
	
	@Resource(name="brwDAO")
	BrwDAO brwDAO;
	
	@Resource(name="mailSender")
	private MailSender mailSender;
	
	
	@Override
	public List<KbkBookLoanVo> selectKbkBrwRetrnMnt(KbkBookLoanVo kbkBookLoanVo) throws Exception {
		return brwDAO.selectKbkBrwRetrnMnt(kbkBookLoanVo);
	}
	
	@Override
	public int updateKbkBookLoanRetrn(KbkBookLoanVo kbkBookLoanVo) throws Exception {
		return brwDAO.updateKbkBookLoanRetrn(kbkBookLoanVo);
	}
	
	@Override
	public List<KbkBookLoanVo> selectKbkLoanList(KbkBookLoanVo kbkBookLoanVo) throws Exception {
		return brwDAO.selectKbkLoanList(kbkBookLoanVo);
	}
	
	@Override
	public List<KbkBookLoanVo> selectKbkBrwMailList(KbkBookLoanVo kbkBookLoanVo) throws Exception {
		return brwDAO.selectKbkBrwMailList(kbkBookLoanVo);
	}
	
	@Override
	public void selectKbkBrwMailSend(LinkedList<LinkedHashMap<String, Object>> list) throws Exception {
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		
		String syspayno = siteUserHeader.getSession().getSn();
		String sender = siteUserHeader.getSession().getEmail();
		String toAddr = null;
		String subject = "대출도서안내";
		String templatePath = "kbk/KbkBorrowMailSend";
		StringBuilder format = new StringBuilder("");
		format.append(" <div id='kitech-mailer-template-row'>");
		format.append(" <div id='kitech-mailer-template-data1'>%s</div> ");
		format.append(" <div id='kitech-mailer-template-data2'>%s</div> ");
		format.append(" <div id='kitech-mailer-template-data3'>%s</div> ");
		format.append(" </div> ");
		
		
		Set<String> key = new LinkedHashSet<String>();
		for(LinkedHashMap<String, Object> map : list)
			key.add(map.get("loan_psn_nm").toString());
		
		
		List<MailTemplateVo> templateVars = null;
		MailTemplateVo templateVo = null;
		Map<String, String> templateVar = null;
		StringBuilder data = null;
		for(String elt : key) {
			templateVars = new ArrayList<MailTemplateVo>();
			data = new StringBuilder("");
			for(LinkedHashMap<String, Object> map : list) {
				if(map.get("loan_psn_nm").equals(elt)) {
					templateVo = new MailTemplateVo();
					
					data.append(String.format(format.toString(), map.get("loan_no"), map.get("loan_book_nm"), map.get("loan_psn_nm")));
					toAddr = map.get("loan_psn_email") != null ? map.get("loan_psn_email").toString().trim() : null;
				}
			}
			
			if(toAddr != null) {
				templateVar = new LinkedHashMap<String, String>();
				templateVar.put("@@data@", data.toString());
				
				templateVo.setContentVar(templateVar);
				templateVars.add(templateVo);
				
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
			}
		}
	}
	
	/**
     * 도서대출 팝업 조회 
     * @param KbkBookLoanVo
     * @return KbkBookLoanVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.04.
     */
    public KbkBookLoanVo selectKbkBookLoan(InvAccntBookVo vo) throws KitechException{
    	return brwDAO.selectKbkBookLoan(vo);
    }
    
    /**
     * 도서대출 팝업 정보 저장
     * @param KbkBookLoanVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.04.
     */
    public void saveKbkBookLoan(KbkBookLoanVo vo) throws KitechException{
    	if("C".equals(vo.getCud_type())){
    		// 신규대출시 기존 대출정보 사용구분(valid_yn) 업데이트
    		brwDAO.updateKbkBookLoanValidYn(vo.getLoan_book_no());
    		
    		// 대출정보 등록
    		brwDAO.insertKbkBookLoan(vo);
    	}else{
    		// 대출정보 수정
    		brwDAO.updateKbkBookLoan(vo);
    	}
    }
    
    /**
     * 도서대출 정보 삭제
     * @param KbkBookLoanVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.04.
     */
    public void deleteKbkBookLoan(String loanNo) throws KitechException{
    	brwDAO.deleteKbkBookLoan(loanNo);
    }
}