package kr.re.kitech.biz.fin.fnd.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.fnd.dao.FndCardDAO;
import kr.re.kitech.biz.fin.fnd.service.FndCardService;
import kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

@Service("FndCardServiceImpl")
public class FndCardServiceImpl  extends EgovAbstractServiceImpl implements FndCardService {

	@Resource(name="FndCardDAO")
    private FndCardDAO fndDAO;
    
	@Resource(name="mailSender")
	private MailSender mailSender;

	@Resource(name = "generationServiceImpl")
    private GenerationService generationService;
    
	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;

    @Resource(name="attachDAO")
    private AttachDAO attachDAO;

	@Override
	public List<FndCardVo> selectList(FndCardVo vo) throws ElException {
		List<FndCardVo> list = fndDAO.selectList(vo);
		return list;
	}

	@Override
	public List<FndCardUseSelectVo> selectCardUseList(FndCardUseSelectVo FndVo) throws ElException {
		AppLog.debug("fndVo", FndVo);
		List<FndCardUseSelectVo> resultVO = fndDAO.selectFndCardNtSlip(FndVo);			
		AppLog.debug("resultVO", resultVO);
		return resultVO;
	}
	
	@Override
	public FndCardVo selectSingleItem(FndCardVo FndVo) throws ElException {
		FndCardVo resultVO = fndDAO.selectSingleItem(FndVo);			
		return resultVO;
	}

	@Override
	public String saveItem(FndCardVo vo) throws ElException {
		String rowStatus = vo.getRowStatus();
		 
		if (StringUtils.equals(rowStatus, "C")) {
			String gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "F45");
			vo.setReq_no(gen);
			fndDAO.insertItem(vo);
			apprCommonService.createAprInterface(gen, "F745", KitechContextUtil.getUserId());
		} else if (StringUtils.equals(rowStatus, "U")) {
			fndDAO.updateItem(vo);
		}
		
		if (StringUtils.equals(vo.getIsApproval(), "Y")) {
			AprVo aprVo 	= new AprVo();
			
			aprVo.setReqNo(vo.getReq_no());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			aprVo.setUiId("F745");
			aprVo.setInfoCd(vo.getIssu_cause_nm());
			aprVo.setExt1Cd(vo.getAccnt_no());
			
			// 2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
			AttachVo attachVo = new AttachVo();
			// 첨부파일 번호로 첨부파일 리스트 조회
			attachVo.setAttach_file_no(vo.getAttach_file_no());
			vo.setAttachVo1(attachDAO.selectListAttach(vo.getAttach_file_no()));
			
			// 3. 전자결재 기능 메소드 호출 (결재신청)
			apprFuncService.approvalRequest(aprVo, vo);
		}
		
		return vo.getReq_no() == null ? "" : vo.getReq_no();
	}

	@Override
	public int updateItem(FndCardVo vo) throws ElException {
		int result = fndDAO.updateItem(vo);
		return result;
	}

	@Override
		public int deleteItem(FndCardVo fndVo) throws ElException {
		if (fndVo == null || StringUtils.equals(fndVo.getReq_no(), "")) {
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.apr.com.0004");
		}
		
		apprFuncService.formRemove(fndVo.getReq_no());
		return fndDAO.deleteItem(fndVo);
	}

	@Override
	public void fndMailSend(FndCardVo fndVo) throws ElException {
//		MailTemplateVo templateVo = new MailTemplateVo();
//		Map<String, String> templateVar = new HashMap<String, String>();
//		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
//	
//		
//		templateVar.put("@data@", fndVo.getDataName());
//		
//		String subject = "subject";
//		String templatePath = "fin/TemplateMailName";
//		String syspayno = siteUserHeader.getSession().getSn();
//		String toAddr = fndDAO.selectReqPsnEmail(fndVo).getEmail();
//		String sender = siteUserHeader.getSession().getUid() + "@kitech.re.kr";
//		
//		templateVo.setContentVar(templateVar);
//		List<MailTemplateVo> templateVars = new ArrayList<>();
//		templateVars.add(templateVo);
//		
//		mailSender.sendMessage(
//			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
//			new BizMail.Builder(syspayno, Business.FIN, true)
//				.senderEmail(sender.trim())
//				.toAddr(toAddr.trim())
//				//.ccAddr(ccAddress)
//				.subject(subject)
//				.savesent(false)	// 받은 편지함 저장 여부
//				.logging(true)	// 로그 저장 여부
//				.templatePath(templatePath)
//				.templateVars(templateVars)
//			.build());
	}
	
	@Override
	public int updateMailYn(FndCardVo vo) throws ElException {
		ArrayList<String> reqNoList = (ArrayList<String>)vo.getReqNoList().get("list");
		FndCardVo updVo = new FndCardVo();
		int result = 0;
		
		for (String reqNo : reqNoList) {
			updVo.setReq_no(reqNo);
			result += fndDAO.updateMailYn(updVo); 
		}
		
		return result;
	}


}
