/**
 * 
 */
/**
 * @author user
 *
 */
package kr.re.kitech.biz.ccs.cgs.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.cgs.dao.CgsDormReqDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsDormReqService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;


@Service("cgsDormReqServiceImpl")
public class CgsDormReqServiceImpl  extends EgovAbstractServiceImpl implements CgsDormReqService {

	@Resource(name="cgsDormReqDAO")
    private CgsDormReqDAO cgsDormReqDAO;
    
    @Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
	@Resource(name="mailSender")
	private MailSender mailSender;

	@Override
	public List<CgsDormReqVo> selectListCgsDormReq(CgsDormReqVo cgsDormReqVo) throws ElException {
	 	List<CgsDormReqVo> list = cgsDormReqDAO.selectListCgsDormReq(cgsDormReqVo);	
	 	return list;
	}
	
	@Override
	public CgsDormReqVo selectHoliyday(CgsDormReqVo cgsDormReqVo) throws ElException {
		CgsDormReqVo resultVO = cgsDormReqDAO.selectHoliyday(cgsDormReqVo);			
        return resultVO;
	}
	
	@Override
	public List<CgsDormVo> selectListCgsDorm(CgsDormVo cgsDormVo) throws ElException {
		List<CgsDormVo> list = cgsDormReqDAO.selectListCgsDorm(cgsDormVo);	
	 	return list;
	}
	
	@Override
	public List<CgsDormVo> selectListCgsDormNo(CgsDormVo cgsDormVo) throws ElException {
		List<CgsDormVo> list = cgsDormReqDAO.selectListCgsDormNo(cgsDormVo);	
	 	return list;
	}
	
	@Override
	public List<CgsDormReqVo> selectListCgsDormApprovDate(CgsDormReqVo cgsDormReqVo) throws ElException {
			List<CgsDormReqVo> list = cgsDormReqDAO.selectListCgsDormApprovDate(cgsDormReqVo);	
	 	return list;
	}
	
	@Override
	public List<CgsDormReqVo> selectListHoliday(CgsDormReqVo cgsDormReqVo) throws ElException {
			List<CgsDormReqVo> list = cgsDormReqDAO.selectListHoliday(cgsDormReqVo);	
	 	return list;
	}
	
	@Override
	public List<CgsDormReqVo> selectListPosi() throws ElException {
			List<CgsDormReqVo> list = cgsDormReqDAO.selectListPosi();	
	 	return list;
	}
	
	@Override
	public int insertCgsDorm(CgsDormReqVo cgsDormReqVo) throws Exception {
	
	    String reqNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C4F");
    
    cgsDormReqVo.setReq_no(reqNo);
	
		int result = cgsDormReqDAO.insertCgsDorm(cgsDormReqVo);
        return result;
	}
	
	@Override
	public int insertCgsDormStand(CgsDormReqVo cgsDormReqVo) throws Exception {
		 String reqNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C4F");
    
    	cgsDormReqVo.setReq_no(reqNo);
    	
	
		int result = cgsDormReqDAO.insertCgsDormStand(cgsDormReqVo);
        return result;
	}
		
	@Override
	public int deleteCgsDorm(CgsDormReqVo cgsDormReqVo) throws Exception {
		int result = cgsDormReqDAO.deleteCgsDorm(cgsDormReqVo);
        return result;
	}
	
	@Override
	public void cgsMailSend(CgsDormReqVo cgsDormReqVo) throws ElException {
		//신청정보 구하기
		CgsDormReqVo resultVO = cgsDormReqDAO.selectDormReq(cgsDormReqVo.getReq_no());
		
		//메일보내기
		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
	
		String dormClsfNm = "기숙사";
		if (resultVO.getDorm_clsf().equals("CAC001")) dormClsfNm = "구기숙사";
		else if (resultVO.getDorm_clsf().equals("CAC002")) dormClsfNm = "신기숙사";
		
		templateVar.put("@dormClsfNm@", dormClsfNm);
		
		String useRoomNo = resultVO.getUse_room_no();
		String useYmd = resultVO.getUse_ymd();
		String regionNm = resultVO.getRegion_nm();
		String usePsnNm = resultVO.getUse_psn_nm();
		String reqResn = resultVO.getReq_resn();

		
		templateVar.put("@useRegion@", regionNm);
		templateVar.put("@roomnoNo@", useRoomNo);		
		templateVar.put("@reqYmd@", useYmd);
		templateVar.put("@usePsnNm@", usePsnNm);
		templateVar.put("@textareaRmk@", reqResn);
		
		String subject = "기숙사신청 승인 안내";
		String templatePath = "ccs/CgsDormShortReqMail";
		String syspayno = siteUserHeader.getSession().getSn();
		String toAddr = cgsDormReqVo.getUse_psn_mail();
		String sender = resultVO.getMngmt_psn_email();
		templateVar.put("@dormClsfNm@", dormClsfNm);
		templateVo.setContentVar(templateVar);
		List<MailTemplateVo> templateVars = new ArrayList<>();		
		templateVars.add(templateVo);

		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(syspayno, Business.CCS, true)
				.senderEmail(sender.trim())
				.toAddr(toAddr.trim())
				//.ccAddr(ccAddress)
				.subject(subject)
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath(templatePath)
				.templateVars(templateVars)
			.build());
			
			
	}
	

	

}