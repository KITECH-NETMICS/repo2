package kr.re.kitech.biz.fin.std.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ass.eqip.service.AssResEquipMgtService;
import kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.std.dao.ResBgAcctMDAO;
import kr.re.kitech.biz.fin.std.service.ResBgAcctMService;
import kr.re.kitech.biz.fin.std.vo.ResBgAcctMVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

@Service("resBgAcctMServiceImpl")
public class ResBgAcctMServiceImpl extends EgovAbstractServiceImpl implements ResBgAcctMService {
	@Resource(name = "resBgAcctMDAO")
	private ResBgAcctMDAO stdDAO;

	@Resource(name = "mailSender")
	private MailSender mailSender;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="assResEquipService")
	private AssResEquipMgtService equipService;

	/**
	 * 계정번호관리(그리드) 다건 조회
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	@Override
	public List<ResBgAcctMVo> selectResBgAcctMList(ResBgAcctMVo vo) throws ElException {
		return stdDAO.selectResBgAcctMList(vo);
	}

	/**
	 * 계정번호관리 상세 단건 등록, 수정
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	@Override
	public ResBgAcctMVo saveResBgAcctM(ResBgAcctMVo vo) throws ElException {
		int result = 0;
		String accntNo = "";
		
		try {
			if ("C".equals(vo.getRowStatus())){
				String startYmd = vo.getStart_ymd();
				String serviceId = vo.getServiceId();
	
				// 재무관리>기준정보>계정번호관리에서만 계정번호생성
				if ("F112".equals(serviceId)) {
					String startYear = startYmd.substring(2, 4);
					accntNo = genService.getResBgAcctMGenNo(startYear, vo.getAccnt_grp());
					
					if (accntNo.trim().length() != 8) {
						throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정정보 저장"});
					} else {
						vo.setAccnt_no(accntNo);
					}
				} else {
					accntNo = vo.getAccnt_no();
				}
	
				result = stdDAO.insertResBgAcctM(vo);
				
				if (result == 0) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정정보 저장"});
				}
	
				// 연구비통합계정 생성시 계정변경이력 저장(2022.02.04. 이영희)
				if ("FF21".equals(accntNo.substring(0, 4)) && !"FF210001".equals(accntNo)) {
					ResBgAcctmHisVo ResHisVo = new ResBgAcctmHisVo();
					BeanUtils.copyProperties(ResHisVo, vo);
					
					equipService.saveResBgAcctmHis(ResHisVo, true);
				}
	
				vo.setAccnt_no(accntNo);
			} else {
				accntNo = vo.getAccnt_no();
				Map<String,String> map = stdDAO.selectResBgAcctMCd(vo); // 일반/기타 예실 여부 구분
				
				if (map != null && !map.isEmpty()) {
					String mngmtItem2 = map.get("mngmt_item_2");
					
					if (!"L".equals(mngmtItem2) && !"D".equals(mngmtItem2)) { // 기타 및 재무관리계정번호 제외
						// 연마감이 끝난 계정번호는 수정안되게 로직추가(2014.04.22)
						// 연마감후에 계정 종료일자가 변경되어서 월결산에 오류가 생김
						finComService.chkClsYear(vo);
					}
				}
	
				result = stdDAO.updateResBgAcctM(vo);
				
				if (result == 0) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정정보 저장(수정)"});
				}
	
				// 계정변경이력 저장
				if (!"FF21".equals(accntNo.substring(0, 4))) {
					try {
						vo.setRelat_no(vo.getAccnt_rspns());
					} catch (KitechException ex) {
						vo.setRelat_no("");
					}
				} else {
					if (!"FF210001".equals(accntNo)) {
						vo.setRelat_no(accntNo.substring(2, 8));
					}
				}
	
				// FF210001 계정번호는 기타예실에서 가져와야 하므로 relat_no설정불가, 그리고 계정책임자는 기타예실의 relat_no, 예산통제자는 통합관리계정이력에서 수정가능
				if (!"FF210001".equals(accntNo)) {
					ResBgAcctmHisVo ResHisVo = new ResBgAcctmHisVo();
					BeanUtils.copyProperties(ResHisVo, vo);
					
					equipService.saveResBgAcctmHis(ResHisVo, true);
				}
			}
		} catch (IllegalAccessException e) {
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정정보 저장(수정)"});
		} catch (InvocationTargetException e) {
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정정보 저장(수정)"});
		}
		return vo;
	}

	/**
	 * 계정번호 단건 삭제
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	@Override
	public void deleteResBgAcctM(ResBgAcctMVo vo) throws Exception {
		try {
			ResBgAcctmHisVo ResHisVo = new ResBgAcctmHisVo();
			BeanUtils.copyProperties(ResHisVo, vo);
			String accntNo = vo.getAccnt_no();
			
			stdDAO.deleteResBgAcctM(vo);
			
			if (!"FF21".equals(accntNo.substring(0, 4))) {
				try {
					ResHisVo.setRelat_no(vo.getAccnt_rspns().substring(2, 8));
				} catch (KitechException ex) {
					ResHisVo.setRelat_no("");
				}
			} else {
				if (!"FF210001".equals(accntNo)) {
					ResHisVo.setRelat_no(accntNo.substring(2, 8));
				}
			}
	
			// FF210001 계정번호는 기타예실에서 가져와야 하므로 relat_no설정불가, 그리고 계정책임자는 기타예실의 relat_no,
			// 예산통제자는 통합관리계정이력에서 수정가능
			if (!"FF210001".equals(accntNo)) {
				// 계정변경이력 저장
				ResHisVo.setRmk("계정번호삭제");
				ResHisVo.setBugt_ctrl_psn("");	// 계정번호 삭제 merge문에서 update가 아닌 insert를 하기 위한 세팅
				
				equipService.saveResBgAcctmHis(ResHisVo, true);
			}
		} catch (KitechException ex){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정정보 삭제"});
		}
	}

	// 메일 전송
	@Override
	public void stdMailSend(ResBgAcctMVo vo) throws ElException {
		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		BizUserHeader siteUserHeader = (BizUserHeader) ControllerContextUtil.getUserHeader();

		// templateVar.put("@data@", vo.getDataName());

		String subject = "subject";
		String templatePath = "fin/TemplateMailName";
		String syspayno = siteUserHeader.getSession().getSn();
		// String toAddr = stdDAO.selectReqPsnEmail(vo).getEmail();
		String sender = siteUserHeader.getSession().getUid() + "@kitech.re.kr";

		templateVo.setContentVar(templateVar);
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);

		mailSender.sendMessage(
				// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
				new BizMail.Builder(syspayno, Business.FIN, true).senderEmail(sender.trim())
						// .toAddr(toAddr.trim())
						// .ccAddr(ccAddress)
						.subject(subject).savesent(false) // 받은 편지함 저장 여부
						.logging(true) // 로그 저장 여부
						.templatePath(templatePath).templateVars(templateVars).build());
	}
}
