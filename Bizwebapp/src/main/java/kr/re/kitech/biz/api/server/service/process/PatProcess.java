package kr.re.kitech.biz.api.server.service.process;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.dao.PatProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.PatSpecVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.apl.vo.PatAppVo;
import kr.re.kitech.biz.pat.apl.vo.PatDvsPrrVo;
import kr.re.kitech.biz.pat.apl.vo.PatOaPrdChngReqVo;
import kr.re.kitech.biz.pat.apl.vo.PatPrityDemndVo;
import kr.re.kitech.biz.pat.apl.vo.PatSmitAppVo;
import kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo;
import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatComVo;
import kr.re.kitech.biz.pat.app.vo.PatGiveUpVo;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.com.vo.PatMastrVo;
import kr.re.kitech.biz.pat.com.vo.PatSrhVo;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.mail.service.PatMailSendService;
import kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;

/**
 * @ClassSubJect 지재권 BPM 사후처리
 * @Class Name PatProcess.java
 * @Description 지재권 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/11      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/11
 * @version 1.0
 * @see
 * 
 */
@Component
public class PatProcess implements BpmPostProcess {
	@Resource(name="patProcessDAO")
	private PatProcessDAO patDao;
		
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="patComService")
	private PatComService comService;
	
	@Resource(name="patMailSendService")
	private PatMailSendService mailService;
	
	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService aprService;

	/**
    * 지식재산권 BPM사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author LeeYH
    * @since 2022.07.11.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) throws Exception{
		String reqNoSub = vo.getReqNo().substring(0,3);
		if("XAD100".equals(vo.getAprState())){
			switch(reqNoSub){
				case "I01" : // 발명신고서
					this.saveAppPatData(vo.getReqNo());
					break;
				case "I02" : // 포기신청
					this.saveAppPatGiveup(vo.getReqNo());
					break;
				case "I06" : // 우선권주장/분할 신청
					this.savePatInfoDvsReq(vo);
					break;
				case "I05" : // 우선심사 청구
					this.savePrfrncExam(vo);
					break;
				case "I07" : //변경신청(발명자,출원인,연구과제)
				case "I08" :
				case "I09" :
					comService.saveResSmlRvewDPatReq(vo.getReqNo(), "");
					break;
				case "I12" : // 자유발명신고서
					this.saveAppPatFreeInvnt(vo);
					break;
				case "I19" : // OA기간연장신청서
					this.saveAppPatOaPrd(vo);
					break;
				
			}
		
		}else if("XAD015".equals(vo.getAprState())){
			switch(reqNoSub){
				case "I01" : // 발명신고서
				case "I12" : // 자유발명신고서
					this.saveAppRejectData(vo.getReqNo());
					break;
			}
		}
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		return vo;
	}	
	
	private void saveAppPatData(String reqNo) throws Exception{
		
		// 1) 발명신고 마스터 상태값 업데이트
		PatComVo comVo = new PatComVo();
		comVo.setReq_no(reqNo);
		comVo.setApp_yn("Y");
		comVo.setState("10200"); // 발명서 결재완료
		patDao.updatePatAppMastrState(comVo);
		
		// 2) 지재권 마스터 생성
		comService.createPatMastrPreWrk(reqNo);
		
		// 3) 지재권내역 조회
		List<PatMastrVo> rstList = patDao.selectPatMastrApr(reqNo);
		if(rstList == null || rstList.size() == 0){
			throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"지재권데이터 생성"});
		}
		
		String bizClsf = "";
		String itemClsf = "";
		String state = "";
		String patId = "";
		boolean isOversea = false;
		
		for(PatMastrVo rstVo : rstList){
			
			itemClsf = "LBL002"; // 심의
				
			// 국내출원
			if("PNT010".equals(rstVo.getDom_oversea_clsf())){
				if("Y".equals(rstVo.getCo_smitapp_ex())){
					bizClsf = "RBS009"; // 국내출원(공동)
				}else{
					bizClsf = "RBS001"; // 국내출원(단독)
				}
					
				//1) 인터뷰신청이 N일 때 ( 프로그램, 디자인, 상표는 등록 또는 출원완료일 경우 소연심등록으로 변경(2018.05.08.))
				if("N".equals(rstVo.getInterview_yn()) && !rstVo.getPat_clsf().matches("PAT030|PAT040|PAT050") ){
					comService.saveResSmlRvewD(rstVo.getReq_no(), rstVo.getMngmt_no(), bizClsf, itemClsf, rstVo.getInvnt_krn_nm(), rstVo.getCharg_syspayno(), rstVo.getInvnt_syspayno(), rstVo.getAccnt_no());				
				}
				
				// 2) 국내건 일 경우 자동으로 선행기술 조사 의뢰 (자유발명, 프로그램 제외)
				// 프로그램인 경우 모든 프로세스 안태우고 상태값만 등록지시 접수로 간다. 임자경(20171121)				
				if("PAT050".equals(rstVo.getPat_clsf())){ //PAT050 프로그램
					state = "P1611"; // P1611	등록지시 의뢰완료
				
				 // 특허설계지원사업 Flag 값이 Y 일 경우 선행기술조사 생략
				 // 아래함수에서 공동출원 조건 제외(이순영 사무원 요청번호 : XC2202200AAA) => !"Y".equals(coSmitappEx)	
				 // 2022.10.04. 특허설계지원사업 사용하지 않는다고 해서 삭제
				}else{
					if(!"PAT040".equals(rstVo.getPat_clsf())){ //PAT040 디자인		
						state = "P0211"; // P0211 선행기술조사 의뢰완료
						
						patId = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I11"); // 선행기술조사 의뢰 정보 자동 생성
						this.savePatSrh(rstVo, patId, state, "자동의뢰");
						
					}else{
						state = "P0410"; // P0410 명세서작성 의뢰대기
						
						patId =genService.getGenNumber(Numberings.DOCUMENT.getName(), "I13"); // 명세서 의뢰 정보 자동 생성
						this.savePatSpec(rstVo, patId, state);
					}
					
					// 7) 선행기술조사, 명세서 의뢰 단계 프로세스 처리
					this.executeApr(rstVo, reqNo, rstVo.getMngmt_no(), reqNo, state, rstVo.getInvnt_syspayno(), patId);
				}
				
				// 8) patmastr.state 업데이트
				rstVo.setState(state); 
				patDao.updatePatMastrApr(rstVo);				
				
			// 해외출원 지심위 저장
			}else if("PNT020".equals(rstVo.getDom_oversea_clsf())){
				bizClsf = "RBS008"; // 해외출원
				// 1) 지심위저장
				this.saveResSuperRvewD(rstVo.getReq_no(), rstVo.getMngmt_no(), bizClsf, itemClsf, rstVo.getInvnt_krn_nm(), rstVo.getCharg_syspayno());				
				
				if (!isOversea) {
					if(!"PAT040".equals(rstVo.getPat_clsf())){
					
						// 3)해외건의 직발서중 첫번째 건 : 선행기술조사 임시저장 상태로 대기함
						state = "P0210"; // P0210 선행기술조사 의뢰대기
						
						patId = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I11"); // 선행기술조사 의뢰 정보 자동 생성
						this.savePatSrh(rstVo, patId, state,"");					
					}else{
						state = "P0410";
						
						patId = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I13"); // 명세서 의뢰 정보 자동 생성
						this.savePatSpec(rstVo, patId, state);
					}
					
					// 4) 결재완료 단계 프로세스 처리
					this.executeApr(reqNo, rstVo.getMngmt_no(), reqNo, state, rstVo.getInvnt_syspayno(), patId);						
						
					isOversea = true;
				// 해외건의 직발서중 나머지건 : 선행기술조사중 홀드 상태 변경
				}else{
					state = "P0200"; // P0200 선행기술조사 진행중
				}	
				
				// 5) patmastr.state 업데이트
				rstVo.setState(state); 
				patDao.updatePatMastrApr(rstVo);				
			}
		}
		
		// 메일발송
		// 디자인, 프로그램의 경우, 내부결재후에 소연심의 거치지 않고 출원지시 ==> 출원 후 보고로 process바뀜 by by SoO 2012.03.07 방초하씨 요청사항
		// 상표도 추가, 내부결재후에 소연심의 거치지 않고 출원지시 ==> 출원 후 보고로 process바뀜 by SoO 2012.08.09 황다운씨 요청사항
		String patClsf = rstList.get(0).getPat_clsf();
		if(patClsf.matches("PAT030|PAT040|PAT050")){
			Map<String,String> map = new HashMap<String,String>();
			map.put("req_no", reqNo);
			map.put("invnt_krn_nm", rstList.get(0).getInvnt_krn_nm());
			map.put("req_no", reqNo);
			String patClsfNm = "";
			if("PAT030".equals(patClsf)){
				patClsfNm = "상표";
			}else if("PAT040".equals(patClsf)){
				patClsfNm = "디자인";
			}else{
				patClsfNm = "프로그램";
			}
			map.put("pat_clsf_nm", patClsfNm);
			
			mailService.sendMailPatApr(map);
		}
	}
	
	/**
    * I01 발명신고서 해외출원 결재완료시 지심의 저장
    * @param String key1, String key2, String bizClsf, String itemClsf, String rvewObjct, String chrgPsn
    * @author LeeYH
    * @since 2022.07.21.
    */
	private void saveResSuperRvewD(String key1, String key2, String bizClsf, String itemClsf, String rvewObjct, String chrgPsn) throws ElException{
		ResSmlRvewDVo rvewVo = new ResSmlRvewDVo();
		rvewVo.setKey_1(key1);
		rvewVo.setKey_2(key2);
		rvewVo.setSeq(1);
		rvewVo.setBiz_clsf(bizClsf);
		rvewVo.setItem_clsf(itemClsf);
		rvewVo.setRvew_objct(rvewObjct);
		rvewVo.setCmt_clsf("P");
		rvewVo.setChrg_psn(chrgPsn);
		
		patDao.updateResSuperRvewD(rvewVo);
	}
	
	/**
    * I01 발명신고서  결재반려 시 상태값 수정
    * @param String reqNo
    * @author LeeYH
    * @since 2022.07.21.
    */
	private void saveAppRejectData(String reqNo) throws ElException{
		// 1) 공동발명자 상태값 업데이트
		PatCoinvntPsnVo psnVo = new PatCoinvntPsnVo();
		psnVo.setReq_no(reqNo);
		psnVo.setCo_invnt_affir_ex("1");
		psnVo.setUpdt_syspayno("system");
		patDao.updatePatAppCoInvntPsnApr(psnVo);
		
		// 2) 발명신고서 수정
		psnVo.setState("10110"); // 10110, P0113 발명신고서 반려
		patDao.updatePatAppMastrState(psnVo);
	}
	
	/**
    * I02 포기신청 결재완료 후 처리
    * @param String reqNo
    * @author LeeYH
    * @since 2022.07.21.
    */
	private void saveAppPatGiveup(String reqNo) throws Exception{
		List<PatGiveUpVo> rstList = patDao.selectPatGiveUpAprList(reqNo);
		
		for(PatGiveUpVo vo : rstList){
			// 대상특허목록(IA69) 일괄포기 신청 시 전자결재완료 후에 포기처리X (관리자확정 처리 시 포기상태로 변경요청)
			if(!"Y".equals(vo.getMulti_app_yn())){
				// 1) 특허마스터 상태 업데이트
				vo.setState("P9000"); // P9000 포기
				patDao.updatePatMastrApr(vo);
				
				if(!StringUtil.isEmpty(vo.getWork_id())){
					// 2) TODO 결재 삭제
					aprService.deleteApr(vo.getWork_id());
				}
				
				// 3) 포기 시 TODO 데이터 삭제
				patDao.updatePatToDoDel(vo.getMngmt_no());
			}
		}
	}
	
	/**
    * I06 우선권 주장/분할 결재 완료 처리 출원일이 가장 빠른 지재권을 이용하여 신규 지재권 생성
    * @param String reqNo
    * @author LeeYH
    * @since 2022.07.21.
    */
	private void savePatInfoDvsReq(ApiBpmVo vo) throws Exception{
		String reqNo = vo.getReqNo();
		
		// 분할우선권 신청서 내역 조회
		PatDvsPrrVo dvsVo = patDao.selectPatDvsPrrApr(reqNo);
		
		// 처리 출원일이 가장 빠른 지재권 내역 조회
		PatMastrVo mstrVo = patDao.selectPatMastrForDvsReq(reqNo);
		// 공동발명자 조회
		List<PatCoinvntPsnVo> psnList = patDao.selectPatCoInvntPsnList(mstrVo);
		// 공동출원 업체 조회
		List<PatCoSmitappVendVo> vendList = patDao.selectPatCoSmitappVendList(mstrVo);
		
		// 1) 새로운 관리번호 구하기, 지재권 마스터 저장
		String mngmtNo = comService.getMngmtNo(mstrVo.getReq_no(), mstrVo.getSmitapp_natn_cd());
		mstrVo.setMngmt_no(mngmtNo);
		mstrVo.setState("P0500"); // 출원지시르 할수 있는 상태 (출원지시 의뢰대기)
		mstrVo.setSmitapp_occr_clsf(dvsVo.getDp_clsf()); // 신청구분(PPT)
		if(patDao.insertPatMastr(mstrVo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"지재권 마스터 저장"});
		}
		
		// 2) 지재권 발명자 복사
		for(PatCoinvntPsnVo psnVo : psnList){
			psnVo.setMngmt_no(mngmtNo);
			
			patDao.insertPatCoInvntPsn(psnVo);
		}
		
		// 3) 공동 출원업체 복사
		for(PatCoSmitappVendVo vendVo : vendList){
			vendVo.setMngmt_no(mngmtNo);
			
			patDao.insertPatCoSmitappVend(vendVo);
		}
		
		// 4) 생성된 지재권 출원지시 가능 상태로
		PatAppVo appVo = new PatAppVo();
		String appId = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I14");
		appVo.setApp_id(appId);
		appVo.setReq_no(mstrVo.getReq_no());
		appVo.setMngmt_no(mngmtNo);
		appVo.setJob_state_cd("P0500"); // P0500 출원지시 요청대기
		appVo.setReq_psn_syspayno(dvsVo.getDraft_syspayno());
		appVo.setReq_app_clsf(dvsVo.getDp_clsf());
		appVo.setReq_pub_yn("N");
		appVo.setReq_claim_yn("Y");
		appVo.setReq_comment(dvsVo.getDp_resn());
		appVo.setReq_attach_file(dvsVo.getAttach_file_no());
		appVo.setRegst_syspayno(dvsVo.getDraft_syspayno());
		
		if(patDao.insertPatApp(appVo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"출원정보 저장"});
		}
		
		// 5) 선출원 정보 복사
		List<PatSmitAppVo> appList = patDao.selectPatDvsPrrApp(reqNo);
		if(appList != null && appList.size() > 0){
			for(int i=0; i<appList.size(); i++){
				PatSmitAppVo smitAppVo = appList.get(i);			
				
				smitAppVo.setPr_req_no(smitAppVo.getReq_no()); // 이전신청번호
				smitAppVo.setPr_mngmt_no(smitAppVo.getMngmt_no()); // 이전 관리번호
				smitAppVo.setReq_no(mstrVo.getReq_no());
				smitAppVo.setMngmt_no(mngmtNo);
				smitAppVo.setSeq(String.valueOf(i+1));
				
				patDao.insertPatPrioritySmitApp(smitAppVo);
			}
		}
		
		// 6) 우선권주장/분할 신청서 상태 업데이트
		patDao.updatePatDvsPrrApr(vo);
		
		// 7) 결재완료 단계 프로세스 처리
		this.executeApr(mstrVo.getReq_no(), mngmtNo, reqNo, "P0500", dvsVo.getDraft_syspayno(), appId);
	}
	
	/**
    * I05 우선심사 의뢰
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.27.
    */
	private void savePrfrncExam(ApiBpmVo vo) throws Exception{
		// 1) 우선심사 결재 키정보 조회
		PatComVo comVo = patDao.selectPatPrityEvalReqApr(vo.getReqNo());
		
		// 2) 우선심사청구의뢰 저장
		PatPrityDemndVo demndVo = new PatPrityDemndVo();
		String state = "P1210";  // 우선심사 의뢰대기
		
		String demndId = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I16");
		
		demndVo.setPrity_demnd_id(demndId);
		demndVo.setReq_no(comVo.getReq_no());
		demndVo.setMngmt_no(comVo.getMngmt_no());
		demndVo.setJob_state_cd(state); 
		demndVo.setRegst_syspayno(comVo.getInvnt_syspayno());
		
		patDao.insertPatPrityDemnd(demndVo);
		
		// 2) patmastr.state 수정
		comVo.setState(state);
		patDao.updatePatMastrApr(comVo);
		
		// 3) 결재완료 단계 프로세스 처리
		this.executeApr(comVo.getReq_no(), comVo.getMngmt_no(), vo.getReqNo(), state, comVo.getInvnt_syspayno(), demndId);
	}
	
	/**
    * I12 자유발명신고서 결재완료 후 소연심의 저장
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.27.
    */
	private void saveAppPatFreeInvnt(ApiBpmVo vo) throws ElException{
		// 1) 기본정보조회
		PatMastrVo mstrVo = patDao.selectPatAppMastr(vo.getReqNo());
		
		// 2) 발명신고서 테이블과 마스터 테이블에 상태값 update
		mstrVo.setState("P0119"); // 발명신고서 결재완료
		mstrVo.setApp_yn("Y");
		patDao.updatePatAppMastrState(mstrVo);
		
		// 3) 소연심의 저장
		String itemClsf = "";
		if("PBT040".equals(mstrVo.getInvnt_clsf())){
			itemClsf = "LBL001"; // 보고
		}else{
			itemClsf = "LBL002"; // 심의
		}
		
		comService.saveResSmlRvewD(mstrVo.getReq_no(), "", "RBS006", itemClsf, mstrVo.getInvnt_krn_nm(), mstrVo.getCharg_syspayno(), mstrVo.getInvnt_syspayno(), mstrVo.getAccnt_no());
	}
	
	/**
    * I19 OA기간연장신청서
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.07.27.
    */
	private void saveAppPatOaPrd(ApiBpmVo vo) throws ElException{
		// 1) 기간마감신청 정보조회
		PatOaPrdChngReqVo chngVo = patDao.selectPatOaPrdChngReq(vo.getReqNo());
		
		// 2) OA마감일 업데이트
		patDao.updatePatOaRcptDueDate(chngVo);
		
		// 3) 비용마스터 저장
		chngVo.setWri_id(vo.getSyspayno());
		patDao.insertPatCostMaster(chngVo);
	}	
	
	/**
    * 발명신고서 결재완료 후 결재프로세스 처리
    * @param PatMastrVo, String patId, String state
    * @author LeeYH
    * @since 2022.07.20.
    */
	private void executeApr(PatMastrVo rstVo, String reqNo, String mngmtNo, String mainKey, String nextState, String syspayno, String refkey) throws Exception{
		// 선행기술조사, 명세서 의뢰 단계 프로세스 처리
		PatToDoVo todoVo = new PatToDoVo();
				
		todoVo.setReq_no(reqNo);
		todoVo.setMngmt_no(mngmtNo);
		todoVo.setMain_key(mainKey);
		todoVo.setCurr_state_cd("");
		todoVo.setNext_state_cd(nextState);
		todoVo.setSyspayno(syspayno);
		todoVo.setRef_key(refkey);
		todoVo.setInit("Y");
		
		comService.executePatComWFBiz(rstVo, todoVo);		
	}
	
	private void executeApr(String reqNo, String mngmtNo, String mainKey, String nextState, String syspayno, String refkey) throws Exception{
		// 선행기술조사, 명세서 의뢰 단계 프로세스 처리
		PatToDoVo todoVo = new PatToDoVo();
				
		todoVo.setReq_no(reqNo);
		todoVo.setMngmt_no(mngmtNo);
		todoVo.setMain_key(mainKey);
		todoVo.setCurr_state_cd("");
		todoVo.setNext_state_cd(nextState);
		todoVo.setSyspayno(syspayno);
		todoVo.setRef_key(refkey);
		todoVo.setInit("Y");
		
		comService.executePatComWFBiz(todoVo);		
	}
	
	/**
    * 발명신고서 결재완료 후 선행기술조사 저장
    * @param PatMastrVo, String patId, String state
    * @author LeeYH
    * @since 2022.07.20.
    */
	private void savePatSrh(PatMastrVo vo, String patId, String state, String comment) throws ElException{
		PatSrhVo srhVo = new PatSrhVo();
					
		srhVo.setSrh_id(patId);
		srhVo.setReq_no(vo.getReq_no());
		srhVo.setMngmt_no(vo.getMngmt_no());
		srhVo.setJob_state_cd(state); 
		srhVo.setReq_psn_syspayno(vo.getInvnt_syspayno());
		srhVo.setReq_patofic_cd(vo.getPatofic_cd());
		srhVo.setHope_patofic_charg_id(vo.getPatofic_charg_id());
		srhVo.setReq_comment(comment);
		srhVo.setRegst_syspayno(vo.getInvnt_syspayno());
		
		if(patDao.insertPatSrh(srhVo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"선행기술조사 저장"});
		}
	}
	
	/**
    * 발명신고서 결재완료 후 명세서 저장
    * @param PatMastrVo, String patId, String state
    * @author LeeYH
    * @since 2022.07.20.
    */
	private void savePatSpec(PatMastrVo vo, String patId, String state) throws ElException{
		PatSpecVo specVo = new PatSpecVo();
		specVo.setSpec_id(patId);
		specVo.setReq_no(vo.getReq_no());
		specVo.setMngmt_no(vo.getMngmt_no());
		specVo.setJob_state_cd(state); 
		specVo.setReq_psn_syspayno(vo.getInvnt_syspayno());
		specVo.setRegst_syspayno(vo.getInvnt_syspayno());
		
		if(patDao.insertPatSpec(specVo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"명세서 저장"});
		}
	}
	

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getAprProcess()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.PAT;
	}
}
