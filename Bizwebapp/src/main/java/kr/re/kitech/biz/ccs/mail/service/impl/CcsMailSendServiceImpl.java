package kr.re.kitech.biz.ccs.mail.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.ccs.mail.dao.CcsMailSendDAO;
import kr.re.kitech.biz.ccs.mail.service.CcsMailSendService;
import kr.re.kitech.biz.ccs.mail.vo.CtrOverTripMailVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.core.ext.BaseUrlProperty;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * @ClassSubJect 총무관리 메일발송 SERVICEIMPL
 * @Class Name CcsMailSendServiceImpl.java
 * @Description 총무관리 메일발송 
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/09      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/09
 * @version 1.0
 * @see
 * 
 */
@Service("ccsMailSendService")
public class CcsMailSendServiceImpl extends EgovAbstractServiceImpl implements CcsMailSendService {
	@Autowired
	private MailSender mailSender;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
	
	@Resource(name="ccsMailSendDAO")
	private CcsMailSendDAO dao;

	/**
    *  해외출장복명서(C75) 결재완료 후 메일발송
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.08.09.
    */
	@Override
	public void mailSendOverTripApr(ApiBpmVo vo) {
		// 출장신청 정보내용
		CtrOverTripMailVo mailVo = dao.selectCtrOverRepMail(vo.getReqNo());
		
		Map<String, String> templateVar = new HashMap<String, String>();
		templateVar.put("@biztripReqNo@", mailVo.getBiztrip_req_no());
		templateVar.put("@@reqNo@", "<a href='"+BaseUrlProperty.newBizUrl+"/websquare/popup.html?w2xPath=/ui/apr/layoutSimple.xml&reqNo=" + mailVo.getBiztrip_req_no() + "&viewMode=read"
				+ "'>" + mailVo.getBiztrip_req_no() + "</a>");// 해외출장신청번호
		templateVar.put("@@repReqNo@", "<a href='"+BaseUrlProperty.newBizUrl+"/websquare/popup.html?w2xPath=/ui/apr/layoutSimple.xml&reqNo=" + mailVo.getRep_req_no() + "&viewMode=read"
				+ "'>" + mailVo.getRep_req_no() + "</a>");// 해외출장복명서번호
		templateVar.put("@@rcptNo@", "<a href='"+BaseUrlProperty.newBizUrl+"/websquare/popup.html?w2xPath=/ui/com/pop/COM_F203_11P.xml&req_no=" + mailVo.getBiztrip_req_no() + "&view_yn=Y'>"
				+ mailVo.getRcpt_no() + "</a>");// Pool등록번호
		templateVar.put("@biztripPsnNm@", mailVo.getBiztrip_psn_nm());// 출장자
		templateVar.put("@biztripRegionNm@", mailVo.getBiztrip_region_nm());// 출장지
		templateVar.put("@biztripDays@", mailVo.getBiztrip_days());// 출장일
		
		// 수신자
		String toAddress = "";
		List<UserVo> userList = accntService.findUsersByRoleCodes(new String[]{"1001222"}); // 연구실적담당자
		for(UserVo userVo : userList){
			toAddress = userVo.getCn() + " <" + userVo.getMail()+ ">";
		}		
		// TODO TEST
		//toAddress = "eipleeyh@kitech.re.kr";
		
		MailTemplateVo templateVo = new MailTemplateVo();
		templateVo.setContentVar(templateVar);
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(vo.getSyspayno(), Business.CCS, true)
				.senderEmail("")
				.toAddr(toAddress)
				//.ccAddr(ccAddress)
				.subject("해외출장신청번호 : " + mailVo.getBiztrip_req_no() + " 부실 추정 학회 안내")
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath("ccs/CtrTripOverConfPoolCheck")
				.templateVars(templateVars)
			.build());
	}

}
