package kr.re.kitech.biz.api.server.service.process;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.server.dao.CcsProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.CgsAnnlHoliVo;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.ccs.cgs.service.CgsVacaService;
import kr.re.kitech.biz.ccs.mail.service.CcsMailSendService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;

/**
 * 
 * @author James
 * @since 2022. 6. 29.
 * @ClassSubJect 총무보안 BPM 사후처리
 * @Class Name CcsProcess.java
 * @Description 총무보안 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/04      전재우             최초생성
 * 
 * @author JeonJW
 * @since 2022/08/04
 * @version 1.0
 * @see
 * 
 */
@Component 
public class CcsProcess implements BpmPostProcess {
	@Resource(name = "ccsProcessDAO")
	private CcsProcessDAO dao;

	@Resource(name = "finComAttachService")
	private FinComAttachService attachService;

	@Resource(name = "finAutoSlipService")
	private FinAutoSlipService autoSlipService;

	@Resource(name = "ccsMailSendService")
	private CcsMailSendService mailService;

	@Resource(name = "cgsVacaService")
	private CgsVacaService vacaService;

	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService aprService;

	/**
    * 총무보안 BPM 사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author LeeYH
    * @since 2022.08.08.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) throws KitechException{
		AppLog.info("CcsProcess ApiBpmVo - vo.getReqNo() ["+ vo.getReqNo() +"] --- vo.getAprState() : ["+ vo.getAprState() +"]");
		String reqNoSub = vo.getReqNo().substring(0, 3);
		String aprState = vo.getAprState();
		
		switch(reqNoSub){
			case "C55" :
				if(AprState.COMPLATE.getCode().equals(aprState) || AprState.WAIT_REJECT.getCode().equals(aprState) || AprState.WAIT_WITHDRAW.getCode().equals(aprState)){
					CgsAnnlHoliVo holiVo = dao.selectCgsLappApr(vo.getReqNo());
		
					// 신청자의 연차생성 실행
					holiVo.setRegst_syspayno(vo.getSyspayno());
					vacaService.createYmHol(holiVo);
				}
				break;
			case "C87" : // 국내출장정산
			case "C90" : // 해외출장정산
				this.ccsCtrTripProcess(vo);
				break;
			case "C74" : // 해외출장신청서
				if(AprState.COMPLATE.getCode().equals(aprState)){ // XAD100
					EvidAttachVo attachVo = new EvidAttachVo();
					attachVo.setReq_no(vo.getReqNo()); 
					attachService.executeProcess(attachVo);
				}
				break;
			case "C75" : // 해외출장복명서
				if(AprState.COMPLATE.getCode().equals(aprState)){ // XAD100
					// 부실 추정 학회일때 안내메일 발송
					if(dao.selectCtrOverRepCompnCnt(vo.getReqNo()) > 0){
						mailService.mailSendOverTripApr(vo);
					}
				}
				break;
				
			default : break;			
		}
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}	
	
	/**
    * 국내출장정산(C87), 해외출장정산(C90) 결재 후 사후작업
    * @param ApiBpmVo
    * @author JeonJW
    * @since 2022.08.04.
    */
	private void ccsCtrTripProcess(ApiBpmVo vo) throws KitechException{
		String unslipNo = dao.selectUnslipNo(vo.getReqNo());	
		
		if(AprState.COMPLATE.getCode().equals(vo.getAprState())){ // XAD100
			// 결의서 결재테이블 결재상태 결재완료로 업데이트			
			this.aprService.modifyAprInterface(unslipNo, "XAD100", vo.getSyspayno());
			
			// 전자증빙 가결의 번호 셋팅
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setUnslip_no(unslipNo); 
			attachService.executeProcess(attachVo);
			
		}else if(vo.getAprState().matches("XAD015|XAD013")){
			if(!StringUtil.isEmpty(unslipNo)){
				ComReqVo comVo = new ComReqVo();
				comVo.setReq_no(vo.getReqNo());
				comVo.setUnslip_no(unslipNo);
				autoSlipService.deleteFinTripAdjstSlipMnt(comVo);
			}
		}
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getBusiness()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.CCS;
	}
}