package kr.re.kitech.biz.api.server.service.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.dao.PatProcessDAO;
import kr.re.kitech.biz.api.server.dao.ResProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.PatMastrUpdVo;
import kr.re.kitech.biz.api.server.vo.biz.PatSpecVo;
import kr.re.kitech.biz.api.server.vo.biz.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.api.server.vo.biz.ResBgAcctmAprVo;
import kr.re.kitech.biz.api.server.vo.biz.ResSmlRvewDRstVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.pat.app.vo.PatComVo;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.res.ape.service.ResPrjEndService;
import kr.re.kitech.biz.res.exc.service.ResDepstReqService;
import kr.re.kitech.biz.res.mail.service.ResMailSendService;
import kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 연구관리 BPM 사후처리
 * @Class Name ResProcess.java
 * @Description 연구관리 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/05      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/05
 * @version 1.0
 * @see
 * 
 */
@Component
public class ResProcess implements BpmPostProcess {
	@Resource(name="resProcessDAO")
	private ResProcessDAO resProcessDAO;
	
	@Resource(name="patProcessDAO")
	private PatProcessDAO patProcessDao;
	
	@Resource(name="resMailSendService")
	private ResMailSendService mailService;
	
	@Resource(name="finAutoSlipService")
	private FinAutoSlipService autoSlipService;	
	
	@Resource(name="resDepstReqService")
	private ResDepstReqService depstService;
	
	@Resource(name="resPrjEndService")
	private ResPrjEndService prjEndService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService aprService;
	
	@Resource(name="patComService")
	private PatComService patComService;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	/**
    * 연구관리 BPM사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author LeeYH
    * @since 2022.07.05.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) throws Exception{	
		String reqNoSub = vo.getReqNo().substring(0, 3);
		String aprState = vo.getAprState();
		
		// 전자결재 상태에 따라 각 업무에서 상태 update 적용 프로시저 콜
		resProcessDAO.selectResElecResultSP(vo);		
			
		if("XAD015".equals(aprState)){ // 반려시
			// 연구수당(R22), 논문(R52), 학회발표(R53)는 프로시저 srp_res_elec_result에 구현
			if(reqNoSub.matches("R96|R97|R98")){ //성과지표제출(R96, R97, R98)  반려 시
				this.returnResRt(reqNoSub, vo);
				
			}else if(reqNoSub.matches("R78|R08|R31|R06|R05|R09")){ 
				this.deleteSlip(reqNoSub, vo);
			}
		}else if("XAD013".equals(aprState)){ // 회수시
			if(reqNoSub.matches("R78|R08|R31|R06|R05|R09")){ 
				this.deleteSlip(reqNoSub, vo);
			}
		}else if("XAD100".equals(aprState)){ // 결재완료
			String unslipNo = "";
			if(reqNoSub.matches("R05|R06|R08|R09|R31|R78")){ // R05 연구비입금, R09 연구비 미수반제, R06 연구비송금신청, R08 연구비청구의뢰, R31 종료연차정산, R78 기술료입금
				// 결의번호 조회
				unslipNo = resProcessDAO.selectUnslipNo(vo.getReqNo());	
				
				// 결의서 결재테이블 결재상태 결재완료로 업데이트			
				aprService.modifyAprInterface(unslipNo, "XAD100", "");
				
				// 전자증빙(크리스피드) 가결의번호 셋팅
				EvidAttachVo attachVo = new EvidAttachVo();
				attachVo.setUnslip_no(unslipNo); // 삭제신청번호셋팅
				attachService.executeProcess(attachVo);
			}
			
			if("R71".equals(reqNoSub)){ 
				// 기술이전계약 완료 메일 발송
				mailService.sendMailTechApr(vo.getReqNo());
				
			}else if("R78".equals(reqNoSub)){ // 기술료입금(2015.12.08)결재완료 후 기여율 연구책임자 100% 입력
				this.saveResCrtContrbtRt(vo);
				
			}else if(reqNoSub.matches("R23|R24")){ // 실행예산편성(프로젝트 포함) 결재완료 후 자동으로 예실반영
				this.saveBblBugtAct(reqNoSub, vo);
				
			}else if(reqNoSub.matches("R61|R77|R95")){ // R61 연구관리 시작품, R77 기술료 인센티브, R95 학술대회 Pool 결재완료시 소연심의 저장
				this.saveResSmlRevwD(reqNoSub, vo);
				
			}else if(reqNoSub.matches("R26|R16")){ // 소연심위결과보고,사업조정회의 결재완료시 총괄위 안건저장
				this.saveResSuperRevwD(reqNoSub, vo);	
				
			}else if(reqNoSub.matches("R05|R09")){ // R05 연구비입금, R09 연구비 미수반제
				depstService.updateResBgRectlDepstState(vo.getReqNo(), "RDF004", unslipNo);
				
			}else if(reqNoSub.matches("R85")){ // R85 기술이전 기여자 보상금
				ResSmlRvewDVo rstVo = null;
				double rwdInctAmt006 = resProcessDAO.selectResCrtPstpRwdInctAmt006(vo.getReqNo()); // 기술료금액 조회
				
				rstVo = resProcessDAO.selectResCrtPstpRwdApr(vo.getReqNo());
				rstVo.setKey_2("");
				rstVo.setItem_clsf("LBL002"); // 심의안건
				
				// 공급가액(3천만원) 미만일 경우 소연심의 안건제출 PASS => 총괄위원회(기술료보상 평가위원회) 등록
				if(rwdInctAmt006 < 30000000){
					rstVo.setSeq(1);
					rstVo.setCmt_clsf("R"); // 상위위원회(R => 기술료보상평가위원회)
					resProcessDAO.updateResSuperRvewD(rstVo);
					resProcessDAO.updateResCrtPstpRwdCompltYn(vo.getReqNo()); // rescrtpstprwdh 테이블 complt_yn 컬럼 X 로 세팅 ( Y => 심의완료 , N 미완료 , X 심의 미처리 )
					 
				//  공급가액(3천만원) 초과일 경우 소연심의 안건제출 등록 
				} else{ 
					resProcessDAO.updateResSmlRvewD(rstVo);
				}
			}else if(reqNoSub.matches("R98")){ // R98 조직기여도 제출
				this.updateResOutCtrbtEvalInfo(vo);		
			}
		}			
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}
	
	/**
    * 반려시 성과지표 상태 초기화(R96, R97, R98)
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.06.
    */
	private void returnResRt(String reqNoSub, ApiBpmVo vo) throws ElException{
		// 성과지표제출(R96, R97, R98)
		resProcessDAO.updateResAchIndMst(vo);
	}
	
	/**
    * 실행예산편성(프로젝트 포함) 결재완료 후 자동으로 예실반영(R23, R24)
    * @param String, ApiBpmVo
    * @author LeeYH
    * @since 2022.07.07.
    */
	private void saveBblBugtAct(String reqNoSub, ApiBpmVo vo) throws ElException{		
		ResBgAcctmAprVo accntVo = resProcessDAO.selectResBgAcctmApr(vo.getReqNo());
		// RAK061 미입금집행승인, RAK051 집행불가능일 경우외에는 예실반영
		if(!accntVo.getAccnt_state().matches("RAK051|RAK061")){	
			if("R23".equals(reqNoSub)){
				resProcessDAO.selectSrpResBBlReflect(accntVo);
			}else{ // 프로젝트 계정 예산편성(R24)
				resProcessDAO.selectSrpResPrjBBlReflect(accntVo);
			}
			
			if("FAJ007".equals(accntVo.getCard_use_ex())){
				// 수정예산등록정보
				resProcessDAO.updateEzbaroRebgInfo(accntVo);
				// 수정예산 요청 상태 등록 (송신대기 : 10 송신완료 : 11)
				resProcessDAO.updateEzbaroRebgReq(accntVo);
			}	
		}		
	}
	
	/**
    * R61 연구관리 시작품, R77 기술료 인센티브, R95 학술대회 Pool 결재완료시 소연심의 저장
    * @param String reqNo
    * @author LeeYH
    * @since 2022.07.07.
    */
	private void saveResSmlRevwD(String reqNoSub, ApiBpmVo vo) throws ElException{
		ResSmlRvewDVo rstVo = null;
		
		if("R61".equals(reqNoSub)){ // 연구관리 시작품
			rstVo = resProcessDAO.selectResTrialGoodsMstr(vo.getReqNo());
			rstVo.setKey_2("");
			rstVo.setItem_clsf("LBL002"); // 심의안건
			
		}else if("R77".equals(reqNoSub)){ // 기술료 인센티브
			rstVo = resProcessDAO.selectResCrtPstpictApr(vo.getReqNo());
			rstVo.setKey_2("");
			rstVo.setItem_clsf("LBL001"); // 보고안건
			
		}else if("R95".equals(reqNoSub)){ // 학술대회 Pool
			rstVo = resProcessDAO.selectResConfPoolApr(vo.getReqNo());
			rstVo.setItem_clsf("LBL002"); // 심의안건
		}
		
		resProcessDAO.updateResSmlRvewD(rstVo) ;		
	}
	
	/**
    * R16 사업조정회의 시작품, R26 소연심위결과보고 결재완료시 총괄위 저장
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.07.
    */
	private void saveResSuperRevwD(String reqNoSub, ApiBpmVo vo) throws Exception{ 
		if("R16".equals(reqNoSub)){ // 사업조정회의 
			ResAppBsnsAdjstVo rstVo = resProcessDAO.selectResAppBsnsAdjstApr(vo.getReqNo());
						
			// 주관기관일 경우 중복체크
			if("RCA017".equals(rstVo.getPrj_knd())){
				List<Map<String,String>> chkList = resProcessDAO.selectResAppBsnsAdjstChk(rstVo);
				
				if(chkList != null && chkList.size() == 0){
				
					for(Map<String,String> chkMap : chkList){
						if("RII001".equals(chkMap.get("consider"))){ // Y
							// 1) 사업조정회의 여부 수정
							chkMap.put("consider", "RII002"); // RII002 조정진행중
							chkMap.put("updt_syspayno", vo.getSyspayno());
							resProcessDAO.updateResAppMastApr(chkMap);
													
							// 2) 사업신청번호 초기화
							chkMap.put("bsns_req_no", "");
							resProcessDAO.updateResAppBsnsAdjst(chkMap);
							
						}
						
						// 3) 중복일 경우 기존에 등록된 안건의 신청번호 초기화 및 심의안건으로 변경
						ResSmlRvewDVo updVo = new ResSmlRvewDVo();
						updVo.setKey_1(chkMap.get("req_no"));
						updVo.setKey_2("");
						updVo.setSeq(1);
						resProcessDAO.updateResSuperRvewdDel(updVo);					
					}
				}				
			}
			
			// 총괄위 안건등록
			rstVo.setSeq(1);
			rstVo.setItem_clsf("LBL001");
			rstVo.setRvew_objct(rstVo.getBsns_nm());
			
			resProcessDAO.updateResSuperRvewD(rstVo);
			
		}else{ // R26 소연심위결과보고			
			List<ResSmlRvewDRstVo> rstList = resProcessDAO.selectResSmlRvewDApr(vo.getReqNo());
			if(rstList == null || rstList.size()== 0){
				throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.co.com.0010");
			}
			
			// 지재권 사후처리에 넘겨줌
			List<ResSmlRvewDRstVo> patList = new ArrayList<ResSmlRvewDRstVo>();
			// 메일발송
			List<ResSmlRvewDRstVo> mailList = new ArrayList<ResSmlRvewDRstVo>();
			
			for(ResSmlRvewDRstVo rstVo : rstList){
				if(rstVo.getRvew_rst_cd().matches("PME010|PME030|PME033|PME034|PME035|PME038")){
					mailList.add(rstVo);
					
					// 총괄위 안건등록
					resProcessDAO.updateResSuperRvewD(rstVo);
					
					// 안건내역 학술대회 번호 및 심의결과가 원안접수 시 학술대회신청->학술대회 마스터 복사입력
					if("R95".equals(rstVo.getKey_1().substring(0,3))){
						resProcessDAO.insertResConfPoolMastr(rstVo.getKey_1());
					}
					
					if("P".equals(rstVo.getMngmt_item_2())){
						patList.add(rstVo);
					}
				 // 소연심의 결과보고 결재완료시 부결건 재입력(필요시 주석해제)
				}else if("PME020".equals(rstVo.getRvew_rst_cd())){
					//resProcessDAO.insertResSmlRvewD(rstVo);
				}		
			}
			
			// 발명신고서 사후처리
			if(patList.size() > 0){
				this.processPatBiz(patList, vo.getSyspayno());	
			}
			
			// 메일발송
			if(mailList.size()>0){
				mailService.sendRvewRstMail(mailList);
			}
		}
	}
	
	/**
    * R78 기술료입금(2015.12.08)결재완료 후 처리
    * @param String reqNo
    * @author LeeYH
    * @since 2022.07.12.
    */
	private void saveResCrtContrbtRt(ApiBpmVo vo) throws ElException{
		// 1) 기여율 연구책임자 100% 입력
		resProcessDAO.insertResCtrContrbtRt(vo);
		
		// 2) 기술료 입금의뢰 테이블 입금상태 수정
		Map<String,String> map = new HashMap<String,String>();
		map.put("req_no", vo.getReqNo());
		map.put("depst_state", "RDF004"); // 결의처리
		map.put("updt_syspayno", vo.getSyspayno());
		resProcessDAO.updateResPsRectlDepstState(map);	
	}
	
	/**
    * 반려시 결의서 삭제 및 해당테이블 업데이트
    * @param String reqNo
    * @author LeeYH
    * @since 2022.07.12.
    */
	private void deleteSlip(String reqNoSub, ApiBpmVo vo) throws ElException{
		//1) 결의번호 조회
		String unslipNo = resProcessDAO.selectUnslipNo(vo.getReqNo());
		if(unslipNo == null || "".equals(unslipNo)){
			throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.co.com.0007", new String[]{"결의번호"});
		}
		
		switch(reqNoSub){
			case "R77" : // 기술료 인센티브
				autoSlipService.deleteFinpstpictSlipMnt(unslipNo);
				break;
				
			case "R78" :
				if("426".equals(unslipNo.substring(0,3))){ // 기술료 청구결의
					depstService.deleteDemndReqSlipMnt(unslipNo, vo.getReqNo());
				}else{
					depstService.deleteDepstReqSlipMnt(unslipNo, vo.getReqNo()); // 기술료 입금, 주식및어음
				}
				break;
				
			case "R08" : // 연구비청구의뢰 결의삭제
				depstService.deleteDemndReqSlipMnt(unslipNo, vo.getReqNo());
				break;
				
			case "R05" : // 연구비입금 결의삭제
			case "R09" : // 연구비미수반제 결의삭제
				depstService.deleteDepstReqSlipMnt(unslipNo, vo.getReqNo());
				break;
				
			case "R06" : // 연구비송금 결의삭제
				autoSlipService.deleteFinReschSendSlipMnt(vo.getReqNo());
				break;

			case "R31" : // 연구비잔액반납 결의삭제
				prjEndService.deleteResPrjEndSlip(unslipNo, vo.getReqNo());
				break;
		}
		
	}
	
	/**
    * R26 소연심위결과보고 결재완료시 지재권 처리(ResProcess에서 호출)
    * @param ResSmlRvewDRstVo
    * @author LeeYH
    * @since 2022.07.07.
    */
	private void processPatBiz(List<ResSmlRvewDRstVo> rstList, String sysPayNo) throws Exception{
		List<PatToDoVo> aprList = new ArrayList<PatToDoVo>();
		
		PatToDoVo todoVo = null;
		for(ResSmlRvewDRstVo vo : rstList){			
			if("RBS010".equals(vo.getBiz_clsf())){ // 발명자, 출원인, 연구과제 변경신청 소연심위 완료 후 지재권 데이터 변경
				patComService.saveResSmlRvewDPatReq(vo.getKey_1(), vo.getElecapp_docu_no().substring(0,3));
				
			}else if ("RBS006".equals(vo.getBiz_clsf())) {// 자유발명신고서는 지재권을 생성하지 않으므로 patmastr 수정필요없음(2021.11.02. 이영희)
			
			}else{
				// PME010:원안의결, PME030 수정의결, PME033 원안접수, PME034 원안수정접수, PME035 조건부의결, PME038 원안일부의결가 아닐 경우 중단조치 
				// PAT050 심의결과 완료 후 중단변경시 (프로그램)은 제외(2020.03.16.)
				if(!vo.getRvew_rst_cd().matches("PME010|PME030|PME033|PME034|PME035|PME038") && !"PAT050".equals(vo.getPat_clsf())){
					PatComVo comVo = new PatComVo();
					comVo.setReq_no(vo.getKey_1());
					comVo.setMngmt_no(vo.getKey_2());
					comVo.setState("P7000");
					patProcessDao.updatePatMastrApr(comVo);
					
				}else{
					String jobStateCd = "P0329"; // 소연심의 완료
					String nextStateCd = "";
						
					PatMastrUpdVo updVo = new PatMastrUpdVo();
					updVo.setReq_no(vo.getKey_1());
					updVo.setMngmt_no(vo.getKey_2());
					
					// RBS007 : 특허외지식재산권이 아니고 보고안건이 아닌 경우 명세서작성 의뢰대기(2023.01.10. 보고안건제외 추가)			
					if(!"RBS007".equals(vo.getBiz_clsf()) && !"LBL001".equals(vo.getItem_clsf())){
						jobStateCd = "P0410";
						nextStateCd = "P0410";
						
						PatSpecVo specVo = new PatSpecVo();
						specVo.setReq_no(vo.getKey_1());
						specVo.setMngmt_no(vo.getKey_2());
						
						// 명세서 중복 생성 방지
						if(patProcessDao.selectPatSpecCnt(specVo) == 0){
							specVo.setSpec_id(genService.getGenNumber(Numberings.DOCUMENT.getName(), "I13"));
							specVo.setJob_state_cd(jobStateCd);
							specVo.setReq_psn_syspayno(sysPayNo);
							
							// 소연심의 결과등록 후 명세서 데이터 작성
							patProcessDao.insertPatSpec(specVo);
							
							// TODO결재완료단계 프로세스
							todoVo = new PatToDoVo();						
							todoVo.setReq_no(specVo.getReq_no());
							todoVo.setMngmt_no(specVo.getMngmt_no());
							todoVo.setMain_key(vo.getElecapp_docu_no());
							todoVo.setCurr_state_cd("");
							todoVo.setNext_state_cd(nextStateCd);
							todoVo.setSyspayno(sysPayNo);
							todoVo.setRef_key(specVo.getSpec_id());
							todoVo.setInit("Y");
			
							aprList.add(todoVo);
						}
						
						updVo.setState(jobStateCd);
						if("PME030".equals(vo.getRvew_rst_cd())){ // 수정의결
							updVo.setRvw_rslt("1");
						}else{
							updVo.setRvw_rslt("0"); // 원안의결
						}
						
						// patmastr 수정(state, rvw_rslt)
						patProcessDao.updatePatMastrApr2(updVo);
					}
				}
			}
		}
		
		if(aprList.size() > 0){
			patComService.executePatComWFBiz(aprList);
		}		
		
	}
	
	/**
    * R98 조직기여도 제출(2023.11.30.)결재완료 후 처리
    * @param String reqNo
    * @author LeeYM
    * @since 2023.11.30.
    */
	private void updateResOutCtrbtEvalInfo(ApiBpmVo vo) throws ElException{
		// 적용여부, 접수자 정보 업데이트
		String rcptno = vo.getReqNo();
		resProcessDAO.updateResOutCtrbtEvalRcptInfo(rcptno);
	}
	

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getBusiness()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.RES;
	}
}
