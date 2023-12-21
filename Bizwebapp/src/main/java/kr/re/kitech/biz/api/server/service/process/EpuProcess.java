package kr.re.kitech.biz.api.server.service.process;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.dao.EpuProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.ApiEpuVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.epu.mail.service.EpuMailSendService;
import kr.re.kitech.biz.epu.req.vo.PurAccntChngDVo;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.BBlBugtActRsltVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;

@Component
public class EpuProcess implements BpmPostProcess {

	@Resource(name="epuProcessDAO")
	private EpuProcessDAO epuDao;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;		
	
	@Resource(name="finAutoSlipService")
	private FinAutoSlipService autoSlipService;	
	
	@Resource(name="epuMailSendService")
	private EpuMailSendService mailService;
	
	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService aprService;

	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) throws ElException{				
		String subReqNo = vo.getReqNo().substring(0,3);
		
		// 외자구매는 구매부서 내부결재 진행이 없으므로 구매담당자 결재(수신(접수)) 시 구매담당자 정보 및 구매진행상태 등록
		if("P23".equals(subReqNo) && "XAD100".equals(vo.getAprState())) {
			this.setPurChrgSysPayNo(vo);
			
		}else if ("P22".equals(subReqNo) && "XAD060".equals(vo.getAprState())) { // 구매업무담당자 정보 생성
			// 내자구매는 구매담당자 결재(수신(접수)) 시 구매담당자 정보 및 구매진행상태 등록
			this.setPurChrgSysPayNo(vo);
			
		}else if (subReqNo.matches("P71|P72|P74|P75")) { // 일시불, 기성(분할), 외자, 수수료
			this.processPurPayReq(vo, subReqNo);
			
		}else{
			if("XAD100".equals(vo.getAprState())){				
				switch(subReqNo){
					case "P26" : // 계정변경신청
						this.executeAccntChng(vo);
						break;
					case "P93" : // 적격심사 결과 심사부서결재						
					case "P86" : // 평가 결과 승인일경우 통보일자 등록
					case "P87" : 
						epuDao.updateEpuNotiTechEvalMastrApr(vo);
						break;
					case "P91" : // 기술협상 통보일자 등록
						epuDao.updateEpuNotiTechNego(vo);
						break;
					case "P7E" : // 결재승인(계약해지)일경우 계약 상태값 수정
						epuDao.updateEpuContrctMastrCnsl(vo);
						break;
					case "P81" :
					case "P82" : // 발주계획
						mailService.sendMailBidApr(vo.getReqNo());
						break;
				}
			
			}else if("XAD015".equals(vo.getAprState())){
				switch(subReqNo){
					case "P85" :
					case "P32" :
					case "P33" :
						this.updateProgrssState(vo, subReqNo);
						break;
					
				}
			}
		}		
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}
	
	/**
    * 외자/내자구매 구매담당자 셋팅
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.06.
    */
	private void setPurChrgSysPayNo (ApiBpmVo vo) throws ElException{
		ApiEpuVo epuVo = new ApiEpuVo();		
			
		// 구매담당자 조회
		String chrgSysPayNo = "";
		if("P23".equals(vo.getReqNo().substring(0,3))){
			chrgSysPayNo = epuDao.selectPurChrgSysPayNo(vo.getReqNo());
		}else{
			chrgSysPayNo = vo.getSyspayno();
		}
		
		// 구매진행상태 등록
		epuVo.setPur_req_no(vo.getReqNo());
		epuVo.setState_cd("PAA060");
		epuVo.setCharg_syspayno(chrgSysPayNo);
		epuDao.mergeXodpPorgrsState(epuVo);
		
		// 구매담당자 부서정보 조회
		if(!StringUtil.isEmpty(chrgSysPayNo)){
			epuVo = epuDao.selectChrgPsnDeptInfo(epuVo.getCharg_syspayno());
			epuVo.setPur_req_no(vo.getReqNo());
			
			epuDao.updatePurReqMastrChrg(epuVo);		
		}		
	}
	
	/**
    * 외자/내자구매 계정변경신청 결재완료시 예실반영 호출
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.06.
    */
	private void executeAccntChng(ApiBpmVo vo) throws ElException{
		// 계정변경신청 내역이 존재하여도 원래 정보는 수정하지 않음(2012.05.21)
		// String contrctAccntUpdateID = "kitech.pur.req.xda.PurContrctAccntSU01"; // 구매계약계정내역 수정하기
		List<PurAccntChngDVo> chngList = epuDao.selectPurAccntChngHApr(vo.getReqNo());
		BBlBugtActRsltVo ctrlVo = null;
		
		for (PurAccntChngDVo chngVo : chngList) {			
			String chngReqNo = chngVo.getReq_no(); // 계정변경신청 신청번호
			String aftrAccntNo = chngVo.getChng_aftr_accnt_no().trim(); // 변경후 계정번호
			
			ctrlVo = new BBlBugtActRsltVo();
			
			// 변경 후 계정정보가 존재하는 정보만 구매요구번호의 집행내역, 예실 반영을 함(2012.05.22)
			// 계정변경신청을 여러번 했을 경우 신청번호가 같으면 구매요구번호의 원인행위금액을 정리, 그렇지 않으면
			// 2016.03.31 통합발주를 고려했을 때 req_seq와 accnt_odr불일치할 경우 있으므로 나누어서 req_seq setting
			if(!StringUtil.isEmpty(aftrAccntNo)) {
				if (chngReqNo.equals(vo.getReqNo())) {
					ctrlVo.setReq_no(chngVo.getPur_req_no()); // 구매요구번호
					ctrlVo.setReq_seq(chngVo.getAccnt_odr());
				} else {
					ctrlVo.setReq_no(chngReqNo);
					ctrlVo.setReq_seq(chngVo.getReq_seq()); // 계정변경신청 신청순번
				}
				
				ctrlVo.setBugt_yr(chngVo.getReq_ymd().substring(0,4));
				ctrlVo.setBiz_clsf("pur_accnt_chng");
				
				// 예실반영 - 원인행위금액 정리
				finComService.setBblBugtCauseAmt(ctrlVo, "");
			}
		}	
	}
	
	/**
    * 예가, 계약 반려시 상태값 수정
    * @param ApiBpmVo, String
    * @author LeeYH
    * @since 2022.07.18.
    */
	private void updateProgrssState(ApiBpmVo vo, String subReqNo) throws ElException{
		if("P85".equals(subReqNo)){
			epuDao.updateEpuNotiEstipr(vo);
			
		}else if(subReqNo.matches("P32|P33")){
			String[] arr = vo.getReqNo().split("-");
			Map<String,String> map = new HashMap<String,String>();
			map.put("contrct_no", arr[0]);
			map.put("chng_seq", arr[1]);
			map.put("progress_state", "3");
			map.put("updt_syspayno", vo.getSyspayno());
			
			epuDao.updateEpuContrctMastrApr(map);
		}
	}
	
	/**
    * P71, P72, P74, P75 일시불, 기성(분할), 외자, 수수료
    * @param ApiBpmVo, String
    * @author LeeYH
    * @since 2022.07.18.
    */
	private void processPurPayReq(ApiBpmVo vo, String subReqNo) throws ElException{
		if(subReqNo.matches("P71|P72|P75")){
			// 1) 결의번호 조회
			String unslipNo = epuDao.selectUnslipNo(vo.getReqNo());
				
			if("XAD100".equals(vo.getAprState())){ // 결재완료
				
				// 2) 결의서 결재테이블 결재상태 결재완료로 업데이트
				aprService.modifyAprInterface(unslipNo, "XAD100", "");
				
				// 3) 전자증빙
				EvidAttachVo attachVo = new EvidAttachVo();
				attachVo.setUnslip_no(unslipNo); // 
				attachService.executeProcess(attachVo);
				
			}else if(vo.getAprState().matches("XAD015|XAD013")){ // 반려 또는 회수
				autoSlipService.deletePurPayReqSlip(unslipNo);
			}
		}
		
		if("XAD100".equals(vo.getAprState())){
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setReq_no(vo.getReqNo()); // 가결의 번호 셋팅
			attachService.executeProcess(attachVo);
		}
	}
	

	@Override
	public AprProcess getAprProcess() {
		return AprProcess.EPU;
	}
}
