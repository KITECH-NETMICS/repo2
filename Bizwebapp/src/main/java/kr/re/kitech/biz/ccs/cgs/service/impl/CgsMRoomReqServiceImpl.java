package kr.re.kitech.biz.ccs.cgs.service.impl;

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

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cgs.dao.CgsMRoomReqDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.GenerationParamVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;


/**  
 * @ClassSubJect 회의실신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CgsMRoomReqServiceImpl.java
 * @Description 회의실신청  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/13   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/04/13
 * @version 1.0
 * @see
 * 
 */
@Service("cgsMRoomReqServiceImpl")
public class CgsMRoomReqServiceImpl  extends EgovAbstractServiceImpl implements CgsMRoomReqService {

    @Resource(name="cgsMRoomReqDAO")
    private CgsMRoomReqDAO cgsMRoomReqDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
    @Resource(name = "generationServiceImpl")
	private GenerationService generationService;
	
	@Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;
	
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="mailSender")
	private MailSender mailSender;	
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService#selectListCgsMRoomReq(kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)
	 */
	public List<CgsMRoomReqVo> selectListCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		List<CgsMRoomReqVo> list = cgsMRoomReqDAO.selectListCgsMRoomReq(cgsMRoomReqVo);	
	
		return list;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService#selectListCountCgsMRoomReq(kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)
	 */
	public long selectListCountCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		return cgsMRoomReqDAO.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService#selectCgsMRoomReq(kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)
	 */
	public CgsMRoomReqVo selectCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		CgsMRoomReqVo resultVO = cgsMRoomReqDAO.selectCgsMRoomReq(cgsMRoomReqVo);			
        
        return resultVO;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService#insertCgsMRoomReq(kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)
	 */
	public int insertCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		int result = 0;
    	String req_no = cgsMRoomReqVo.getReq_no();
		if(req_no == null || "".equals(req_no)){			
			GenerationParamVo genNoVo = new GenerationParamVo();
			genNoVo.setNumbering(Numberings.DOCUMENT.getName());
			genNoVo.setPrefix("C49");
			req_no = generationService.getGenNumber(genNoVo);
			cgsMRoomReqVo.setReq_no(req_no);
			
			result = cgsMRoomReqDAO.insertCgsMRoomReq(cgsMRoomReqVo);
		}
		
		apprCommonService.createAprInterface(req_no, "C210", KitechContextUtil.getUserId());
		//전자결제(화면결제)
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(cgsMRoomReqVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(cgsMRoomReqVo.getApr_state());
		aprVo.setManager(cgsMRoomReqVo.getCharg_syspayno());
		aprVo.setUiId("C210");
		aprVo.setInfoCd(cgsMRoomReqVo.getInfo_cd());
		
		apprFuncService.approvalScreen(aprVo);
	
		return result;	
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService#updateCgsMRoomReq(kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)
	 */
	public int updateCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {			
	
		
		//전자결제(화면결제)
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(cgsMRoomReqVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(cgsMRoomReqVo.getApr_state());
		aprVo.setManager(cgsMRoomReqVo.getCharg_syspayno());
		aprVo.setUiId("C210");
		aprVo.setInfoCd(cgsMRoomReqVo.getInfo_cd());
			
		apprFuncService.approvalScreen(aprVo);
		
	
		return cgsMRoomReqDAO.updateCgsMRoomReq(cgsMRoomReqVo);	   		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cgs.service.CgsMRoomReqService#deleteCgsMRoomReq(kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)
	 */
	public int deleteCgsMRoomReq(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		apprFuncService.formRemove(cgsMRoomReqVo.getReq_no());
		return cgsMRoomReqDAO.deleteCgsMRoomReq(cgsMRoomReqVo);
	}
	
	@Override
	public List<CgsMRoomReqVo> selectListCgsMRoom(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		List<CgsMRoomReqVo> list = cgsMRoomReqDAO.selectListCgsMRoom(cgsMRoomReqVo);
		return list;
	}
	
	@Override
	public List<CgsMRoomReqVo> selectListCgsMRoomInfo(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		List<CgsMRoomReqVo> list = cgsMRoomReqDAO.selectListCgsMRoomInfo(cgsMRoomReqVo);
		return list;
	}
	
	@Override
	public void formAccept(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		// 3. BPM 완료
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(cgsMRoomReqVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		
		AppLog.debug("apraprapraprapr"  +cgsMRoomReqVo.getApr_state());
		aprVo.setAprState(cgsMRoomReqVo.getApr_state());
		aprVo.setTaskExt1("C210");
		apprFuncService.formAccept(aprVo);
		
		cgsMRoomReqDAO.updateCgsMRoomReq(cgsMRoomReqVo);
		
	}
	
	@Override
	public void formReject(CgsMRoomReqVo cgsMRoomReqVo) throws Exception {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(cgsMRoomReqVo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setAprState(cgsMRoomReqVo.getApr_state());
		aprScVo.setComments(cgsMRoomReqVo.getComments());
		if ( AprState.isComplate(cgsMRoomReqVo.getApr_state()) ) {
			aprScVo.setEndpoint("system");
			apprFuncService.formAuthReject(aprScVo);
		} else {
			apprFuncService.formReject(aprScVo);
		}
		
		cgsMRoomReqDAO.updateCgsMRoomReq(cgsMRoomReqVo);	
	}
	
	/**
     * 모바일 잔여 회의실을 조회합니다
     * @param CgsMRoomReqVo
     * @throws Exception
     */
	@Override
	public List<Object> selectListCgsMRoomMob(CgsMRoomReqVo param) throws Exception {
		return cgsMRoomReqDAO.selectListCgsMRoomMob(param);
	}
	
	@Override
	public String selectCgsMroomDupOverlap(CgsMRoomReqVo cgsMRoomReqVo) throws KitechException {
		CgsMRoomReqVo validVo = null;
		String result = "";
		validVo = cgsMRoomReqDAO.selectCgsMroomDup(cgsMRoomReqVo);
		if (validVo != null && !validVo.getReq_no().equals("")) {
			String meetYmd = validVo.getMeet_ymd();
			String formatMeetYmd = new StringBuilder(meetYmd.substring(0, 4))
										.append("년")
										.append(meetYmd.substring(4, 6))
										.append("월")
										.append(meetYmd.substring(6, 8))
										.append("일").toString();
			String[] exceptionString = { formatMeetYmd, validVo.getUse_orign_time(), validVo.getUse_cls_time(), validVo.getMeet_ofic_nm() };
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.ccs.cgs.0003", exceptionString);
		}
		
		validVo = cgsMRoomReqDAO.selectCgsMroomDup2(cgsMRoomReqVo);
		if (validVo != null && !validVo.getReq_no().equals("")) {
			String meetYmd = validVo.getMeet_ymd();
			String formatMeetYmd = new StringBuilder(meetYmd.substring(0, 4))
										.append("년")
										.append(meetYmd.substring(4, 6))
										.append("월")
										.append(meetYmd.substring(6, 8))
										.append("일").toString();
			String[] exceptionString = { formatMeetYmd, validVo.getUse_orign_time(), validVo.getUse_cls_time(), validVo.getMeet_ofic_nm() };
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.ccs.cgs.0003", exceptionString);
		}
		
		validVo = cgsMRoomReqDAO.selectCgsMroomTimeOverlap(cgsMRoomReqVo);
		if (validVo != null && !validVo.getReq_no().equals("")) {
			result = "time";
		}
		return result;
	}
	
	@Override
	public void cgsMailSend(CgsMRoomReqVo cgsMRoomReqVo) throws ElException {
		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		String reqState = cgsMRoomReqVo.getReq_state();
		String templatePath = "";
		String subject = "";
		String meetYmd = cgsMRoomReqVo.getMeet_ymd();
//		String ymd = cgsMRoomReqVo.getMeet_ymd()+", "+cgsMRoomReqVo.getUse_orign_time()+"~ "+cgsMRoomReqVo.getUse_cls_time();
		String ymd = meetYmd.substring(0, 4)+"-"+meetYmd.substring(4, 6)+"-"+meetYmd.substring(6, 8)+", "+cgsMRoomReqVo.getUse_orign_time()+"~ "+cgsMRoomReqVo.getUse_cls_time();
		String rmk = cgsMRoomReqVo.getRmk();
		//승인
		if("RVC004".equals(reqState)){
		templatePath = "ccs/CgsMeetRoomReqMail";
		subject = "회의실신청 승인 안내";
		
		templateVar.put("@meetYmdTm@", ymd);
		templateVar.put("@region@", cgsMRoomReqVo.getRegion_name());
		templateVar.put("@meetOficNm@", cgsMRoomReqVo.getMeet_ofic_nm());
		templateVar.put("@reqPsnNm@", cgsMRoomReqVo.getReq_psn_syspayno_nm());
		templateVar.put("@rmk@", rmk);
		}
		//반려
		else if("RVC005".equals(reqState)){
		templatePath = "ccs/CgsMeetRoomReqRtnMail";
		subject = "회의실신청 반려 안내";
		
		templateVar.put("@useYmdTm@", ymd);
		templateVar.put("@rmk@", rmk);
		}
		
		String syspayno = siteUserHeader.getSession().getSn();
		String toAddr = cgsMRoomReqVo.getReq_psn_email();
		String sender = siteUserHeader.getSession().getUid() + "@kitech.re.kr";
		
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
