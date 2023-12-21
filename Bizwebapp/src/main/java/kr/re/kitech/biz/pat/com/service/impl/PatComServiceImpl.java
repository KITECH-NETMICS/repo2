package kr.re.kitech.biz.pat.com.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.server.dao.PatProcessDAO;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprManageService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjHisVo;
import kr.re.kitech.biz.pat.app.vo.PatSrcVo;
import kr.re.kitech.biz.pat.app.vo.PatStakeRtHisVo;
import kr.re.kitech.biz.pat.com.dao.PatComDAO;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.com.vo.EmpTableVo;
import kr.re.kitech.biz.pat.com.vo.PatComWFBizVo;
import kr.re.kitech.biz.pat.com.vo.PatMastrVo;
import kr.re.kitech.biz.pat.com.vo.PatRightMntVo;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo;
import kr.re.kitech.biz.pat.mail.service.PatMailSendService;
import kr.re.kitech.biz.pat.pop.vo.PatCrtMngmtNoVo;
import kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import  kr.re.kitech.biz.xom.base.util.pks.StringUtil;
/**
 * @ClassSubJect 지재권 공통작업 ServiceImpl
 * @Class Name PatComServiceImpl.java
 * @Description 지재권 공통작업 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/20      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/20
 * @version 1.0
 * @see
 * 
 */
@Service("patComService")
public class PatComServiceImpl extends EgovAbstractServiceImpl implements PatComService {
	Logger log = LoggerFactory.getLogger(PatComServiceImpl.class);
	
	@Resource(name="apprManagerService")
	private ApprManageService apprMngService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;
	
	@Resource(name="patMailSendService")
	private PatMailSendService mailService;
	
	@Resource(name="patComDAO")
	private PatComDAO dao;
	
	@Resource(name="patProcessDAO")
	private PatProcessDAO patProcessDao;
	
	/**
    * 관리항목 구하기
    * @param String reqNo, String natCd
    * @return String mngmtNo
    * @author LeeYH
    * @since 2022.07.21.
    */
	public String getMngmtNo(String reqNo, String natCd) throws ElException{
		String currYear = "";
		if("I".equals(reqNo.substring(0,1))){
			currYear = reqNo.substring(3,7);
		}else{
			currYear = reqNo.substring(0,4);
		}
		
		String seq = dao.selectMngmtNoSeq(natCd+currYear);
		String mngmtNo = natCd+currYear + StringUtil.lPad(seq, 4, '0');
		return mngmtNo;
	}
	
	/**
    * 발명신고서 결재완료 후 지재권 데이터 생성을 위한 전처리 작업
    * @param String reqNo
    * @return String mngmtNo
    * @author LeeYH
    * @since 2022.07.20.
    */
	@Override
	public void createPatMastrPreWrk(String reqNo) throws ElException{
		// 1) 지재권마스터 저장을 위한 조회
		this.createPatMastr(dao.selectPatAppMastr(reqNo), 1);
	}
	
	/**
    * 발명신고서 관리번호 생성
    * @param PatCrtMngmtNoVo
    * @author LeeYH
    * @since 2023.08.03.
    */
	public void createPatMstrMngmtNo(PatCrtMngmtNoVo vo) throws ElException{
		// 조회
		PatMastrVo mstrVo = dao.selectPatAppMastr(vo.getReq_no());
		
		mstrVo.setSmitapp_natn_cd(vo.getSmitapp_hope_natn_cd());
		mstrVo.setSmitapp_natn_nm(vo.getSmitapp_hope_natn_nm());
		mstrVo.setPatofic_cd(vo.getPatofic_cd());
		mstrVo.setPatofic_nm(vo.getPatofic_nm());
		mstrVo.setPatofic_charg_id(vo.getPatofic_charg_id());
		mstrVo.setPatofic_charg_nm(vo.getPatofic_charg_nm());
		mstrVo.setPatofic_contac_loc(vo.getPatofic_contac_loc());
		mstrVo.setPct_chk("");
		
		String[] natCds = mstrVo.getSmitapp_natn_cd().split(",");
		int cnt = ("PNT020".equals(vo.getDom_oversea_clsf()))? natCds.length : vo.getCnt();
		
		String[] mngmtNos = this.createPatMastr(mstrVo, cnt);
		
		for(String mngmtNo : mngmtNos){
			ResSmlRvewDVo rvewVo = new ResSmlRvewDVo();
			rvewVo.setKey_1(vo.getReq_no());
			rvewVo.setKey_2(mngmtNo);
			rvewVo.setSeq(1);
			rvewVo.setBiz_clsf("RBS008"); // 해외출원
			rvewVo.setItem_clsf("LBL002"); // 심의안건
			rvewVo.setRvew_objct(mstrVo.getInvnt_krn_nm());
			rvewVo.setCmt_clsf("P");
			rvewVo.setChrg_psn(mstrVo.getCharg_syspayno());
			
			patProcessDao.updateResSuperRvewD(rvewVo);
		}
	}

	/**
    * 발명신고서 결재완료 후 지재권 데이터 생성
    * @param String reqNo
    * @return String mngmtNo
    * @author LeeYH
    * @since 2022.07.20.
    */
	private String[] createPatMastr(PatMastrVo mstrVo, int cnt) throws ElException{
		String reqNo = mstrVo.getReq_no();
		
		String tmpNatCd = mstrVo.getSmitapp_natn_cd();
		String tmpNatNm = mstrVo.getSmitapp_natn_nm();
		
		// 2) 관련과제 입력
		dao.insertPatRelatReschPrj(mstrVo);	
		
		// PCT 진입인 경우 관리번호 생성을 위해 추가.
		if("P".equals(mstrVo.getPct_chk())){
			tmpNatCd = "PC," + tmpNatCd;
			tmpNatNm = "PCT," + tmpNatNm;
		}
		
		// 출원희망국가
		String[] natCds = tmpNatCd.split(",");
		String[] natNms = tmpNatNm.split(",");
		
		// ============================================================ //
		// 관리 번호 생성
		// 관리 번호 : 출원 희망 국가(2) + 출원 지시 년도 (4) + 일련 번호 (4) //
		// ============================================================ //
		String natCd = "";
		String [] mngmtNos = new String[cnt];		
		
		for(int i=0; i< cnt; i++){
			natCd = natCds[i].trim();
			if("".equals(natCd)) continue;
	
			mstrVo.setMngmt_no(this.getMngmtNo(reqNo, natCd));
			mngmtNos[i] = mstrVo.getMngmt_no();
			
			mstrVo.setState("P0119"); // 발명신고서 결재완료 상태
			
			if("KR".equals(natCd)){
				mstrVo.setDom_oversea_clsf("PNT010");
				mstrVo.setSmitapp_occr_clsf("PPT010");
			}else{
				mstrVo.setDom_oversea_clsf("PNT020");
				if("P".equals(mstrVo.getPct_chk())){
					mstrVo.setSmitapp_occr_clsf("PPT090");
				}else{
					mstrVo.setSmitapp_occr_clsf("PPT070");
				}
			}
			
			mstrVo.setSmitapp_natn_cd(natCd);
			mstrVo.setSmitapp_natn_nm(natNms[i]);
			mstrVo.setEval_act_yn("Y"); // 심의 대상 유무
			
			if(StringUtil.isEmpty(mstrVo.getMandate_psn_syspayno())){
				mstrVo.setMandate_psn_syspayno(mstrVo.getInvnt_syspayno());
			}
			
			// 3) 지재권 마스터 저장
			if(dao.insertPatMastr(mstrVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"지재권마스터 저장"});
			}
			
			// 4) 공동 발명자 저장
			if(dao.insertPatCoInvntPsnList(mstrVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"지재권 공동발명자 저장"});
			}
			
			// 5) 공동 출원업체 저장
			if(dao.insertPatCoSmitappVendList(mstrVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"지재권 공동 출원업체 저장"});
			}			
		}
		
		return mngmtNos;
	}
	
	/**
    * 지식재산권 공통업무(AS IS : PatComWFBiz.execute) - 소연심의 결과보고에서 다건 호출
    * @param List<PatToDoVo>
    * @author LeeYH
    * @since 2022.08.01.
    */
	public void executePatComWFBiz(List<PatToDoVo> voList) throws Exception{
		for(PatToDoVo vo : voList){
			this.executePatComWFBiz(vo);
		}
	}
	
	
	public void executePatComWFBiz(PatToDoVo vo) throws Exception{
		this.executePatComWFBiz(null, vo);
	}
	
	/**
    * 지식재산권 공통업무(AS IS : PatComWFBiz.execute)
    * @param Map
    * @author LeeYH
    * @since 2022.07.27.
    */
	public void executePatComWFBiz(PatMastrVo rstVo, PatToDoVo vo) throws Exception{
		if(rstVo != null){
			AppLog.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ rstVo : " + rstVo);
		}
		String currStateCd = vo.getCurr_state_cd();
		String nextStateCd = vo.getNext_state_cd();
		
		// 1) 키정보 조회
		PatComWFBizVo bizVo = dao.selectPatComWfInfo(vo);
		
		if(StringUtil.isEmpty(vo.getInit())){
			vo.setInit("N");
		}
		
		// 2) 현재상태 존재시 .TO-do 제거
		if(!StringUtil.isEmpty(currStateCd)){
			dao.updatePatToDoDel(vo);
		}
		
		// 3) 다음 상태가 미존재 할시 끝
		if(StringUtil.isEmpty(nextStateCd)) return;
		
		// 4) 우선심사 결재 완료로 의뢰 단계로 넘어 갈시
		// 심사청구 완료가 아닌 심사청구 단계에 있는건들 찾아서 todo, bpm 삭제 처리
		if("P1210".equals(nextStateCd)){ // 우선심사청구 의뢰대기
			List<PatToDoVo> toDoList = dao.selectPatToDoDel(vo);
			for(PatToDoVo toDoVo : toDoList){
				// pattodo 삭제
				dao.deletePatToDo(toDoVo);
				toDoVo.setSyspayno(vo.getSyspayno());
				
				//this.sendProc(toDoVo, bizVo);
				// 2022.10.04. 이민기 선임과 협의 : eip3.0 완료 후 다시 협의하기 전까지는 bpm:bpm_procinst 직접 수정하여 bpm 삭제처리
				apprMngService.removeBpmProcInst(toDoVo.getRef_key());
			}
		}	
		
		if("END".equals(vo.getNext_state_cd())){
			vo.setApr_state("XAD100");
			vo.setTodo_auth("0");
			AppLog.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ 290 라인 : " + bizVo.getBpm_yn());
			if("Y".equals(bizVo.getBpm_yn())){
				this.sendProc(vo, bizVo);
			}
			
			return;
		}
		
		if(rstVo != null){	
			if( "PAT040".equals( rstVo.getPat_clsf() ) && "PNT010".equals( rstVo.getDom_oversea_clsf() ) ){
				// 특허구분(pat_clsf) 디자인(PAT040)이고 국외구분(dom_oversea_clsf)이 국내(PNT010)일때
			    nextStateCd = "P0411";
			}
		}
		
		List<PatToDoVo> todoList = dao.selectPatTotoCd(nextStateCd);
		for(PatToDoVo toDoVo : todoList){
			// todo 저장
			if("Y".equals(toDoVo.getTodo_yn())){
				toDoVo.setReq_no(vo.getReq_no());
				toDoVo.setMngmt_no(vo.getMngmt_no());
				toDoVo.setMain_key(vo.getMain_key());
				toDoVo.setWork_id(vo.getRef_key());
				
				if(toDoVo.getTodo_day() > 0){
					Calendar cal = Calendar.getInstance();
					cal.setTime(new Date());
					cal.add(Calendar.DATE, toDoVo.getTodo_day());
					
					// 특정 형태의 날짜로 값을 뽑기
					DateFormat df = new SimpleDateFormat("yyyyMMdd");
					toDoVo.setTodo_due_date(df.format(cal.getTime()));
				}				
				dao.insertPatToDo(toDoVo);
			}
			
			// 출원지시 요청시에 국내건이 아니면 메일과 문자를 보내지 않는다.
			if("P0500".equals(nextStateCd) && !"KR".equals(vo.getMngmt_no())){
				toDoVo.setMail_yn("N");
				toDoVo.setSms_yn("N");
			}
			
			// 메일 전송
			// 선행기술조사완료시 메일발송 20210419
			if("Y".equals(toDoVo.getMail_yn()) || "P0219".equals(nextStateCd)){
				mailService.sendMailWFBiz(toDoVo, bizVo);
			}
			
			// 문자 전송
			if("Y".equals(toDoVo.getSms_yn())){
				mailService.sendSMSWFBiz(toDoVo, bizVo);
			}
			
			if("Y".equals(toDoVo.getBpm_yn()) && "Y".equals(StringUtil.nullStringCheck(bizVo.getBpm_yn()))){
				vo.setApr_state(toDoVo.getApr_state());
				vo.setJob_title(toDoVo.getJob_title());
				vo.setTodo_auth(toDoVo.getTodo_auth());
			}
		}
		
		this.sendProc(vo, bizVo);
	
	}
	
	/**
    * BPM 연계
    * @param PatToDoVo todoVo, PatComWFBizVo bizVo
    * @author LeeYH
    * @since 2022.07.27.
    */
	private void sendProc(PatToDoVo todoVo, PatComWFBizVo bizVo) throws Exception{	
		String loginId = "";
		String loginSyspayNo = bizVo.getLogin_syspayno();
		
		if(!StringUtil.isEmpty(bizVo.getLogin_email())){
			loginId = bizVo.getLogin_email().split("@")[0];
		}
		
		if("Y".equals(todoVo.getInit()) || "0".equals(todoVo.getTodo_auth())){
			loginId = bizVo.getInvnt_email().split("@")[0];
			loginSyspayNo = bizVo.getInvnt_syspayno();
		}		
		
		if("D".equals(todoVo.getInit())){
//			AprScVo aprScVo = new AprScVo();
//			aprScVo.setReqNo(todoVo.getRef_key());
//			aprScVo.setEndpoint(KitechContextUtil.getUserId());
//			apprFormService.formReject(aprScVo);
			
		}else{	
			AprVo aprVo = new AprVo();
			aprVo.setLoginUserId(loginId); // 신청자 ID
			aprVo.setReqNo(todoVo.getRef_key()); // 문서 ID		
		
			String researcherId = bizVo.getInvnt_syspayno();		
			if(!researcherId.equals(bizVo.getMandate_psn_syspayno())){
				researcherId += ";" + bizVo.getMandate_psn_syspayno();
			}
		
			aprVo.setReporterId(loginSyspayNo); // 신청자 시스템개인번호
			aprVo.setResearcher(researcherId.trim()); 	// 신청자 시스템개인번호
			aprVo.setUiId("IF99"); // EIP내에서는 탭화면으로 봄
			aprVo.setEndpoint(loginId);
		
			// 특허팀권한 정보 조회
			List<EmpTableVo> empList = dao.selectRoleUserTableList("1016121");
			String managerId = "";
			for(EmpTableVo empVo : empList){
				managerId += empVo.getEmpsn() + ";";
			}
			managerId = managerId.substring(0, managerId.lastIndexOf(";"));			
			
			if("P1210".equals(todoVo.getNext_state_cd())){ // P1210	우선심사청구 의뢰대기
				aprVo.setManagerId(managerId);
			}			
			
			if(todoVo.getNext_state_cd().matches("P0214|P0414|P1412")){ //P0214 선행기술조사 보완요청, P0414 명세서작성 보완요청, P1412 OA의견안 보완요청
				aprVo.setApprove("N"); 
				
			}else if(todoVo.getNext_state_cd().matches("P0219|P0419|P1415")){ //P0219 선행기술조사 완료, P0419 명세서작성 완료, P1415 OA대응 진행
				aprVo.setApprove("Y"); 
			}
			
			if("P1110".equals(todoVo.getNext_state_cd())){ // P1110 심사청구 의뢰대기
				aprVo.setCheck("Y"); // IP실검토여부
			}
			
			if(StringUtil.isEmpty(todoVo.getCurr_state_cd()) && "P1111".equals(todoVo.getNext_state_cd())){ // P1111 심사청구 의뢰완료
				aprVo.setCheck("Y"); // IP실검토여부
			}
			
			if("Y".equals(todoVo.getInit())){ 
				if(todoVo.getNext_state_cd().matches("P1110|P1111")){ // P1110 심사청구 의뢰대기, P1111 의뢰완료
					aprVo.setManagerId(managerId);
				}
				
				aprVo.setInfoCd("[" + bizVo.getReq_no() + "][" + bizVo.getMngmt_no() + "]" + bizVo.getInvnt_krn_nm());
				aprVo.setPatoffice("20169999");
				
				if("P0210".equals(todoVo.getNext_state_cd())){ // P0210 선행기술조사 의뢰대기
					aprVo.setAbroad("Y");
				}else if("P0211".equals(todoVo.getNext_state_cd())){ // P0211 선행기술조사 의뢰완료
					aprVo.setAbroad("N");
				}
				
				// 인터페이스 저장
				aprComService.createAprInterface(todoVo.getRef_key(), "IF99", loginId);
				
				// 결재서비스 호출
//				apprFormService.approvalScreen(aprVo);
				
			}else{
//				apprFormService.formAccept(aprVo);
			}
		}		
	}
	
	/**
    * I07 발명자 변경신청, I08 출원인 변경신청, I09 연구과제변경신청 결재완료시 또는 소연심의 결과 결재완료시 변경정보 지재권등록
    * @param String reqNo, String resNo(소연심의 결과 결재완료시  결재완료 번호)
    * @author LeeYH
    * @since 2022.07.07.
    */
	public void saveResSmlRvewDPatReq(String reqNo, String resNo) throws ElException{
		String reqNoSub = reqNo.substring(0,3);
		
		PatSrcVo srcVo = new PatSrcVo();
		srcVo.setElecapp_docu_no(reqNo);			
		
		// 변경신청 정보 조회
		if(reqNoSub.matches("I07|I08")){			
			List<PatStakeRtHisVo> hisList = patProcessDao.selectPatStakeRtHisList(srcVo);	
			int cnt = 0;
			for(PatStakeRtHisVo hisVo : hisList){
				// 출원전 지재권 데이터 변경(소연심의 없음) 또는 소연심결과보고 후
				if(StringUtil.isEmpty(hisVo.getSmitapp_ymd()) || "R26".equals(resNo)){
					if("I07".equals(reqNoSub)){
						// 저장전 patcoinvntpsn 삭제
						if(cnt ==0){
							dao.deletePatCoInvntPsn(hisVo);
						}
						
						// 공동발명자 저장
						dao.updatePatCoinvntPsn(hisVo);
							
						// patmastr 주발명자 수정
						if("1".equals(hisVo.getInvnt_psn_clsf())){
							hisVo.setInvnt_syspayno(hisVo.getSyspayno());
							patProcessDao.updatePatMastrApr(hisVo);
						}		
					}else if("I08".equals(reqNoSub)){
						// 저장전 patcosmitappvend 삭제
						if(cnt ==0){
							dao.deletePatCosmitAppVend(hisVo);
						}
						
						// patcosmitappvend 저장
						dao.updatePatCoSmitappVend(hisVo);
						
						if(hisList.size() > 1 && cnt ==0){
							hisVo.setCo_smitapp_ex("Y");
							patProcessDao.updatePatMastrApr(hisVo);
						}
					}
				}else{
					// 출원후 소연심의 안건상정(key_1, key_2, biz_clsf, item_clsf, rvew_objct, chrg_psn
					this.saveResSmlRvewD(hisVo.getElecapp_docu_no(), "", "RBS010", "LBL002", hisVo.getAcdt_unusual_item(), hisVo.getCharg_syspayno(), hisVo.getRegst_syspayno(), "");							
				}				
				
				cnt++;
			}
						
		}else{ //I09 연구과제변경신청
			List<PatRelatReschPrjHisVo> hisList = patProcessDao.selectPatRelatReschPrjHisList(srcVo);
			int cnt = 0;
			for(PatRelatReschPrjHisVo hisVo : hisList){	
				// 출원전 지재권 데이터 변경(소연심의 없음) 또는 소연심결과보고 후
				if(StringUtil.isEmpty(hisVo.getSmitapp_ymd()) || "R26".equals(resNo)){
					if (cnt == 0){
						dao.deletePatRelatReschPrj(hisVo.getReq_no());
					}
					
					// patrelatreschprj 저장
					dao.insertPatRelatReschPrj(hisVo);
				}else{
					// 출원후 소연심의 안건상정(key_1, key_2, biz_clsf, item_clsf, rvew_objct, chrg_psn
					this.saveResSmlRvewD(hisVo.getElecapp_docu_no(), "", "RBS010", "LBL002", hisVo.getAcdt_unusual_item(), hisVo.getCharg_syspayno(),hisVo.getRegst_syspayno(), "");	
				}
			}	
		}	
	}
	
	/**
    * I07 발명자 변경신청, I08 출원인 변경신청, I09 연구과제변경신청, I01 발명신고서 결재완료시 소연심의 저장
    * @param String key1, String key2, String bizClsf, String itemClsf, String rvewObjct, String chrgPsn
    * @author LeeYH
    * @since 2022.07.07.
    */
	public void saveResSmlRvewD(String key1, String key2, String bizClsf, String itemClsf, String rvewObjct, String chrgPsn, String syspayno, String accntNo) throws ElException{
		ResSmlRvewDVo rvewVo = new ResSmlRvewDVo();
		rvewVo.setKey_1(key1);
		rvewVo.setKey_2(key2);
		rvewVo.setBiz_clsf(bizClsf);
		rvewVo.setItem_clsf(itemClsf);
		rvewVo.setRvew_objct(rvewObjct);
		rvewVo.setChrg_psn(chrgPsn);
		rvewVo.setSyspayno(syspayno);
		rvewVo.setAccnt_no(accntNo);
		
		dao.updateResSmlRvewD(rvewVo);
	}
	
	
	
	/**
	 * 특허마스터 저장
	 * @param PatMastrVo
	 * @author Chris
	 * @since 2023.08.02.
	 */
	 public void savePatPatMastr(PatMastrVo vo) throws Exception{
	     List<PatMastrVo> ret = dao.selectPatMastr(vo);
	     if(ret.isEmpty()){
	         // insert
	         dao.insertPatMastr(vo);
	     }else{
	         // update
	         dao.updatePatMastr(vo);
	     }
	 }
	
	 
	 /**
	 * 권리유지 저장
	 * @param PatRightMntVo
	 * @author Chris
	 * @since 2023.08.02.
	 */
	 public String savePatRightMnt(PatRightMntVo vo) throws Exception{
	     String cudType = vo.getCud_type();
	     int result = 0;
	     int cnt = 0;
	     int succCnt = 0;
	     List<PatRightMntVo> ret = dao.selectPatRightMnt(vo);
	     cnt = ret.size();
	     if(ret.isEmpty()){
	         // insert
	         result = dao.insertPatRightMnt(vo);
	     }else{
	         // update
	         result = dao.updatePatRightMnt(vo);
	     }
	
	     // update
	     if ("U".equals(cudType)) {
	         if (cnt == 1) {
	             result = dao.updatePatRightMnt(vo);
	         } else {
	             succCnt = -1;
	         }
	     }
	
	     // delete
	     if ("D".equals(cudType)) {
	         if (cnt == 1) {
	             result = dao.deletePatRightMnt(vo);
	         } else {
	             succCnt = -1;
	         }
	     }
	     if (succCnt == 0 && result == 1) {
	         // 저장 성공
	         return String.valueOf(succCnt);
	     } else {
	         throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"권리유지 저장"});
	     }
	       
	 }
	
	 /**
	 * 전체사건내역 저장
	 * @param PatTotAcdtHisVo
	 * @author Chris
	 * @since 2023.08.02.
	 */
	 public void savePatTotAcdtHis(PatTotAcdtHisVo vo) throws Exception{
	     String cudType = vo.getCud_type();
	     int result = 0;
	     int cnt = 0;
	
	     List<PatTotAcdtHisVo> ret = dao.selectPatTotAcdtHis(vo);
	     cnt = ret.size();
	     // 저장
	     if (!"D".equals(cudType)) {
	         if (cnt == 1) {
	             result = dao.updatePatTotAcdtHis(vo);
	         } else {
	             result = dao.insertPatTotAcdtHis(vo);
	         }
	     }
	     // 삭제
	     if ("D".equals(cudType)) {
	         if (cnt == 1) {
	             result = dao.deletePatTotAcdtHis(vo);
	         }
	     }
	     log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
	     log.debug("전체사건내역 저장 result : [{}]", result);
	 }
 
 
}
