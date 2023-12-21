package kr.re.kitech.biz.fin.com.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.dao.FinComDAO;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BBlBugtActRsltVo;
import kr.re.kitech.biz.fin.com.vo.BblEnfrcDelVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcOldVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.BugtChkVo;
import kr.re.kitech.biz.fin.com.vo.BugtRamtVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.com.vo.FinComAmtChkVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo;
import kr.re.kitech.biz.fin.com.vo.LogBugCtrlMdlVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo;
import kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo;
import kr.re.kitech.biz.fin.std.vo.ResBgAcctMVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;

/**
 * FinComServiceImpl
 * 재무공통 ServiceImpl
 * @author LeeYH-PC
 * @since 2022.03.07.
 */
@Service("finComService")
public class FinComServiceImpl extends EgovAbstractServiceImpl implements FinComService {
	@Resource(name="finComDAO")
	private FinComDAO comDao;
	
	@Resource(name = "generationServiceImpl")
	private GenerationService generationService;
	
	/**
    * 계정종료일자, 상태 체크
    * @param String 계정번호, 결의일자, 체크조건
    * @return ResBgAcctmVO
    * @author LeeYH
    * @since 2022.03.08.
    */
	@Override
	public ResBgAcctmVo chkClsYmd(String accntNo, String slipYmd, String chkConf) throws ElException {
		ResBgAcctmVo acctmVo = comDao.selectResBgAcctmChk(accntNo);
		if(acctmVo ==  null){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.fw.error.base.sys.003");
		}
		
		if(!"no_check".equals(chkConf)){
			String clsYmd = acctmVo.getCls_ymd();
			String startYmd = acctmVo.getStart_ymd();
			
			if ("month".equals(chkConf)) {
				if(clsYmd.substring(0, 6).compareTo(slipYmd.substring(0,6))< 0){
					throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0006");
				}
			}else{
				if(slipYmd.compareTo(clsYmd) > 0){
					throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0007");
				}
			}
			
			if(!acctmVo.getAccnt_state().matches("RAK031|RAK041|RAK061")){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0008", new String[]{accntNo, "결의생성"});
			}
			
			if(startYmd.compareTo(slipYmd) > 0){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0009");
			}
		}
		
		return acctmVo;
	}	
	
	/**
    * 계정정보 조회
    * @param String 계정번호, 결의일자, 체크조건
    * @return ResBgAcctmVO
    * @author LeeYH
    * @since 2022.03.08.
    */
	public ResBgAcctmVo selectResBgAcctmChk(String accntNo) throws ElException{
		return comDao.selectResBgAcctmChk(accntNo);
	}
	
	/**
    * 신청서 또는 결의서 작성 후 예산통제모듈 호출(bblenfrc입력, 통제번호생성 등)
    * @param BblenfrcVo
    # @return BblenfrcVo
    * @author LeeYH
    * @since 2022.03.18.
    */
	public void budEnfrcMnt01(BblenfrcVo vo) throws ElException{
		String etcYn = "N"; // 예실 또는 기타예실 구분
		String reqNoSub = vo.getReq_no().substring(0,3);
		int result = 0;
		
		if(vo.getReq_no() == null || "".equals(vo.getReq_no())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0022", new String[]{"신청번호"});
		}
		
//		if(vo.getReq_seq() == 0){
//			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0022", new String[]{"신청순번"});
//		}
		
		if(vo.getAccnt_no() == null || "".equals(vo.getAccnt_no())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0022", new String[]{"계정번호"});
		}
		
		if(vo.getAccnt_cd() == null || "".equals(vo.getAccnt_cd())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0022", new String[]{"회계코드"});
		}
		
		if(vo.getReq_clsf() == null || "".equals(vo.getReq_clsf())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0022", new String[]{"신청구분"});
		}
		
		// 예산년도
		vo.setBugt_yr(vo.getReq_ymd().substring(0,4));
		
		// 01. 예산통제자 , 계정그룹구분(mngmt_item_2) 조회, bblenfrc.ctrl_no 조회
		String oldCtrlNoYn = "N"; // 이전 통제번호가 있는지 유무
		
		BblenfrcOldVo oldVo = comDao.selectBblEnfrcChk1(vo);
		vo.setOld_req_amt(oldVo.getReq_amt());
		
		if(StringUtil.isEmpty(vo.getFomat_unit())){
			vo.setFomat_unit(oldVo.getFomat_unit());
		}
		
		// 계정번호 또는 회계코드가 변경이 있을 경우 기존 예실 차감 및 집행내역 삭제
		if((oldVo.getAccnt_no() != null && !vo.getAccnt_no().equals(oldVo.getAccnt_no())) ||(oldVo.getAccnt_cd() != null && !vo.getAccnt_cd().equals(oldVo.getAccnt_cd()))){
			DelBblEnfrcVo delVo = new DelBblEnfrcVo();
			delVo.setReq_no(vo.getReq_no());
			delVo.setReq_seq(String.valueOf(vo.getReq_seq()));
			
			this.deleteBudEnfrcMnt(delVo);
			
			// 예실 및 기타예실에 기존 금액 삭제 후 다시 입력이므로 old_req_amt =0으로 해줘야 함
			vo.setOld_req_amt(0);
			// 통제번호 새로 채번을 위하여 빈값으로 셋팅
			vo.setCtrl_no("");
		}else{
			if(oldVo.getCtrl_no() != null && !"".equals(oldVo.getCtrl_no())){
				oldCtrlNoYn = "Y";
			}
			vo.setCtrl_no(oldVo.getCtrl_no());
		}
		
		vo.setCtrl_psn(oldVo.getCtrl_psn());
		
		if(oldVo.getMngmt_item_2().matches("D|L")){
			etcYn = "Y"; // 기타 예실에 반영
		}		
		
		// 02. 예산금액, 원인행위금액, 집행금액 조회
		BugtRamtVo ramtVo = this.selectBugtRamtChk(vo, etcYn);
		vo.setBugt_ctrl_way(ramtVo.getBugt_ctrl_way());
		vo.setCtrl_ymd(ramtVo.getBugt_ctrl_ymd());	
		
		long remidrAmt = 0;
		// 03. 예산잔액 계산
		if("FAF021".equals(ramtVo.getBugt_ctrl_way())){
			remidrAmt = -1;
		}else{
			remidrAmt = ramtVo.getBugt_amt() - ramtVo.getCause_amt() - ramtVo.getEnfrc_amt();
			// 기존 신청금액 반납(+) 새신청금액 차감 (-)
			// 통제번호가 없을 경우 예산잔액-신청금액
			if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
				remidrAmt = remidrAmt - vo.getReq_amt();
			}else{
				remidrAmt = remidrAmt + vo.getOld_req_amt() - vo.getReq_amt();
			}
		}
		
		// rmk_3 정의[통제번호가 없는경우 잔액체크 후 Warning내용을 집행내역rmk_3에 넣어준다.]
		// [잔액통제] 예실 잔액이 부족합니다. 11
		// [비목통제] 비목 예실잔액이 부족합니다. 31
		// [내역통제] 내역통제 비목데이타 입니다. 21
		// [입금확인] 입금금액이 부족합니다.
		
		String rmk3 = "";
		String bugtChk = "Y";
		if("Y".equals(etcYn)){
			if(remidrAmt < 0){
				rmk3 = "[기타예실] 기타예실잔액이 부족합니다. (잔액 " + remidrAmt + "원, 신청(결의)금액 " + vo.getReq_amt() + ")";
			}
		}else{
			if ("FAF021".equals(ramtVo.getBugt_ctrl_way())) { // 내역통제
				rmk3 = "[내역통제] 내역통제 비목데이타 입니다.";
			}else if ("FAF011".equals(ramtVo.getBugt_ctrl_way()) && remidrAmt < 0) { // 잔액통제인 경우 잔액체크
				rmk3 = "잔액통제] 잔액통제 비목데이타 입니다. (잔액 " + remidrAmt + "원, 신청(결의)금액 " + vo.getReq_amt() + ")";
			}else if ("FAF031".equals(ramtVo.getBugt_ctrl_way()) && remidrAmt < 0) { 
				rmk3 = "[비목통제] 비목 예실잔액이 부족합니다. (잔액 " + remidrAmt + "원, 신청(결의)금액 " + vo.getReq_amt() + ")";
			}
			
			// ctrn_yn = Y인 경우 (업무적으로 잔액부족시 저장을 하지 말아야 할 경우 Exception 처리)
			if(!"FAF021".equals(ramtVo.getBugt_ctrl_way()) && "Y".equals(vo.getCtrn_yn()) && remidrAmt < 0){ // 예실잔액이 부족합니다.
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0040", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
			}
			
			// 04. 예실 전체잔액 체크 및 입금내역 확인
			BugtRamtVo totlRamtVo = new BugtRamtVo();
			long t_ramtAmt = 0;
			if("118".equals(reqNoSub)){
				totlRamtVo = comDao.selectBblBugtActRsltSS22(vo);
			}else{
				totlRamtVo = comDao.selectBblBugtActRsltSS24(vo);
			}
			
			t_ramtAmt = totlRamtVo.getBugt_amt() - totlRamtVo.getCause_amt() - totlRamtVo.getEnfrc_amt();
			
			if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
				t_ramtAmt = t_ramtAmt - vo.getReq_amt();
			}else{
				// 통제번호가 있을 경우 예산잔액+이전신청금액-신청금액
				t_ramtAmt = t_ramtAmt + vo.getOld_req_amt() - vo.getReq_amt();
			}
			
			if(t_ramtAmt < 0){
				rmk3 = "[계정 합계잔액 부족]" + rmk3;
				bugtChk = "N";
			}			
		}
		
		// bblenfrc.rmk_3 setting
		vo.setRmk_3(rmk3);
		
		// 05. 예실(기타예실)반영
		FinComAmtChkVo amtVo = new FinComAmtChkVo();
		if("Y".equals(etcYn)){ // 기타예실
			// 통제번호 생성
			// 잔액이 있고 내역 통제가 아닌 경우(내역통제는 예산통제자에 의해 예산통제번호 생성됨)
			if (remidrAmt >= 0 && !"FAF021".equals(ramtVo.getBugt_ctrl_way())){
				if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
				    // 통제번호 생성
					vo.setCtrl_no(generationService.getGenNumber(Numberings.CTRNO.getName()));
				}
			}
			
			// 기타예실 수정
			if(vo.getCtrl_no() != null && !"".equals(vo.getCtrl_no())){
				amtVo.setOld_req_amt(vo.getOld_req_amt());
				amtVo.setReq_amt(vo.getReq_amt());
				amtVo.setBugt_yr(vo.getBugt_yr());
				amtVo.setAccnt_no(vo.getAccnt_no());
				amtVo.setRelat_no(vo.getRelat_no());
				
				result = comDao.updateBblBugtActRsltEtc(amtVo);
				
				if(result == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0027");
				}
			}
		}else{ // 일반예실에 반영
			// 잔액이 있고 내역 통제가 아닌 경우(내역통제는 예산통제자에 의해 예산통제번호 생성됨)
			// 계정전체잔액 > 0(bugtChk = Y), 입금금액 >(집행금액+원인행위금액)보다 클경우 통제번호 생성
			if(remidrAmt >=0 && "Y".equals(bugtChk) && !"FAF021".equals(ramtVo.getBugt_ctrl_way())){
				if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
					// 통제번호 생성
					vo.setCtrl_no(generationService.getGenNumber(Numberings.CTRNO.getName()));	
				}		
			}	
			
			// 예실수정을 위한 셋팅
			amtVo.setAccnt_no(vo.getAccnt_no());
			amtVo.setAccnt_cd(vo.getAccnt_cd());
			
			// 통제번호가 없을 경우 req_amt 수정
			if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
				amtVo.setOld_req_amt(vo.getOld_req_amt());
				amtVo.setReq_amt(vo.getReq_amt());
				amtVo.setOld_cause_amt(0);
				amtVo.setCause_amt(0);
			}else{
				// 이전 통제번호가 없을 경우 req_amt 차감, cause_amt 증액
				if("N".equals(oldCtrlNoYn)){
					amtVo.setOld_req_amt(vo.getOld_req_amt());
					amtVo.setReq_amt(0);
					amtVo.setOld_cause_amt(0);
				}else{
					amtVo.setOld_req_amt(0);
					amtVo.setReq_amt(0);
					amtVo.setOld_cause_amt(vo.getOld_req_amt());
				}	
				amtVo.setCause_amt(vo.getReq_amt());
			}			
			
			// 예실수정
			result = comDao.updateBblBugtActRslt(amtVo);
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0028", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
			}	
		}
		
		if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
			vo.setEnfrc_amt_cause(0);
			vo.setCtrl_state("FAV002"); // 신청
		}else{
			vo.setEnfrc_amt_cause(vo.getReq_amt());
			vo.setCtrl_state("FAV003"); // 통제처리
		}
		
		// TODO 2016.07.07. 예실잔액이 부족한 경우 계정변경완료 후 집행금액 복구하는 경우임에도 원인행위 금액이 초기화되는 오류로 인하여 추가
		String bizFlag = ""; 
		if (bizFlag.equals("pur_chng_app")) {
			vo.setEnfrc_amt_cause(vo.getReq_amt());
		}
		
		// 07.집행내역 저장
		if(StringUtil.isEmpty(vo.getUnslip_no())){ // 결의번호 null로 저장되지 않도록 추가(2022.11.09. eip2.0에서의 혼용으로 인해)
			vo.setUnslip_no("");
		}
		if(comDao.mergeBblenfrc(vo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0026");
		}		
		
		// 08.log 저장
		LogBugCtrlMdlVo logVo = new LogBugCtrlMdlVo();
		this.setLogVo(vo, logVo);
		
		if(vo.getOld_req_amt() == 0){
			logVo.setJob_clsf("C1");
			logVo.setJob_nm("생성");
		}else{
			logVo.setJob_clsf("U1");
			logVo.setJob_nm("수정");
		}	
		
		if("Y".equals(etcYn)){
			logVo.setBugt_clsf("기타예실");
		}else{
			logVo.setBugt_clsf("일반예실");
		}	
		
		logVo.setCurr_req_tot_amt(vo.getOld_req_amt());
		logVo.setCurr_cause_tot_amt(ramtVo.getCause_amt());
		logVo.setCause_amt(vo.getEnfrc_amt_cause());
		logVo.setFun_nm("FinComServiceImpl.budEnfrcMnt01");
		logVo.setBefr_req_amt(vo.getOld_req_amt());
		logVo.setBefr_cause_amt(amtVo.getOld_cause_amt());
		
		comDao.insertLogBugCtrlMdl(logVo);
	}
	
	/**
    * budEnfrcMnt01저장 후 log 저장
    * @param BblenfrcVo, LogBugCtrlMdlVo
    * @author LeeYH
    * @since 2022.03.22.
    */
	private void setLogVo (BblenfrcVo vo, LogBugCtrlMdlVo logVo) throws ElException{
		logVo.setReq_no(vo.getReq_no());
		logVo.setReq_no(vo.getReq_no());				
		logVo.setReq_seq(vo.getReq_seq());						
		logVo.setReq_clsf(vo.getReq_clsf());
		logVo.setReq_ymd(vo.getReq_ymd());
		logVo.setReq_psn(vo.getReq_psn());
		logVo.setReq_dept(vo.getReq_dept());
		logVo.setCtrl_no(vo.getCtrl_no());
		logVo.setCtrl_psn(vo.getCtrl_psn());
		logVo.setBugt_ctrl_way(vo.getBugt_ctrl_way());
		logVo.setCtrl_ymd(vo.getCtrl_ymd());
		logVo.setAccnt_no(vo.getAccnt_no());
		logVo.setAccnt_cd(vo.getAccnt_cd());
		logVo.setExpns_cd(vo.getExpns_cd());
		logVo.setReq_amt(vo.getReq_amt());
		logVo.setUnslip_amt(vo.getUnslip_amt());
		logVo.setUnslip_no(vo.getUnslip_no());
		logVo.setUnslip_odr(vo.getUnslip_odr());
		logVo.setCtrl_state(vo.getCtrl_state());
		logVo.setRmk(vo.getRmk());
		logVo.setRmk_2(vo.getRmk_2());
		logVo.setRmk_3(vo.getRmk_3());
		logVo.setRelat_no(vo.getRelat_no());
	}
	
	/**
    * 결의확정시 호출됨
    * @param BblenfrcVo, String etcYn(기타예실, 예실 구분)
    * @author LeeYH
    * @since 2022.03.18.
    */
	public void budEnfrcMnt02(BBlBugtActRsltVo vo) throws ElException{
		long unslipAmt = vo.getUnslip_amt();
		// 확정 :1/취소 :2
		if(vo.getDecsn_cancel() == 2){
			unslipAmt = unslipAmt * (-1);
		}
		
		// 01. 통제유무조회
		if("N".equals(comDao.selectXodfAccntCtrlYn(vo.getAccnt_cd()))) return;
		
		// 02. 일반예실, 기타 예실 구분
		String mngmtItem2 = comDao.selectXodxCommstEtcYn(vo.getAccnt_no());
		String etcYn = "N";
		if(mngmtItem2.matches("L|D")){
			etcYn = "Y";
		}
				
		// 차변인 경우만 실행
		if("1".equals(vo.getBase_debit_cr())){
			//통제내역결의처리(Fn0120), 통제내역지급결의(RCMS)-Fn0126, 구매지급결의, 165 가지급금(전도금)정산 결의
			if(vo.getJourn_cd().matches("Fn0120|Fn0126") || vo.getUnslip_no().substring(0,3).matches("230|235|165")){
				this.setBblBugtCauseAmt(vo, etcYn);
			}
		}	
		
		if("N".equals(etcYn)){ // 일반예실인 경우
			if("1".equals(vo.getBase_debit_cr())){
				vo.setCause_amt(unslipAmt);
				vo.setEnfrc_amt(unslipAmt);
			}else if("2".equals(vo.getBase_debit_cr())){
				vo.setCause_amt(0);
				vo.setEnfrc_amt(unslipAmt);
			}
			
			if(comDao.updateBblBugtActRsltDecsn(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0034", new String[]{vo.getAccnt_no()});
			}
			
		}else{ // 기타예실
			if ("L".equals(mngmtItem2)) {
				if("1".equals(vo.getBase_debit_cr())){
					vo.setCause_amt(unslipAmt);
					vo.setEnfrc_amt(unslipAmt);
						
					if("FF130005".equals(vo.getAccnt_no()) && vo.getUnslip_no().substring(0,3).matches("270|272") && vo.getAccnt_cd().matches("21091050|21091051")){
						if(comDao.updateBblBugtActRsltEtcDecsn(vo) == 0){
							throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0035", new String[]{vo.getAccnt_no(), vo.getRelat_no()});
						}					
					}else if(("FF130005".equals(vo.getAccnt_no()) && vo.getAccnt_cd().startsWith("2") && vo.getUnslip_no().substring(0,3).matches("270|272"))
							 || "PA".equals(vo.getAccnt_no().substring(0,2))
							 || "FF21".equals(vo.getAccnt_no().substring(0,4)) 
					       ){
						if(comDao.updateBblBugtActRsltEtcEnfrcAmt(vo) == 0){
							throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0035", new String[]{vo.getAccnt_no(), vo.getRelat_no()});
						}
					}
				}
			}else if ("D".equals(mngmtItem2)) {
				if("1".equals(vo.getBase_debit_cr())){
					vo.setCause_amt(unslipAmt);
					vo.setEnfrc_amt(unslipAmt);
				}else if("2".equals(vo.getBase_debit_cr())){
					vo.setCause_amt(0);
					vo.setEnfrc_amt(unslipAmt);
				}
				
				if(comDao.updateBblBugtActRsltEtcEnfrcAmt(vo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0035", new String[]{vo.getAccnt_no(), vo.getRelat_no()});
				}
			}
		}	
		
		LogBugCtrlMdlVo logVo = new LogBugCtrlMdlVo();		
		logVo.setJob_clsf("C1");
		logVo.setJob_nm("저장");
		logVo.setUnslip_amt(unslipAmt);
		logVo.setCause_amt(vo.getCause_amt());
		logVo.setFun_nm("FinComServiceImpl.budEnfrcMnt02");
		
		comDao.insertLogBugCtrlMdl(logVo);
	}
	
	/**
    * 예산통제자 결재시 호출
    * @param BBlBugtActRsltVo
    * @author LeeYH
    * @since 2022.08.28.
    */
	public void budEnfrcMnt04(BblenfrcVo vo) throws ElException{
		// 01. 일반예실, 기타 예실 구분
		String mngmtItem2 = comDao.selectXodxCommstEtcYn(vo.getAccnt_no());
		String etcYn = "N";
		if(mngmtItem2.matches("L|D")){
			etcYn = "Y";
		}
		
		
		String f_crtCtrlNo = "N";
		AppLog.debug("\n #################### ctrl_no : " + vo.getCtrl_no() + "###############");
		if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
			// 02. 통제번호 생성
			vo.setCtrl_no(generationService.getGenNumber(Numberings.CTRNO.getName()));
			if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0036", new String[]{vo.getReq_no(), String.valueOf(vo.getReq_seq())});
			}
			
			//03. 통제방법 조회
			Map<String,String> map = comDao.selectBblBugtActRsltSS01(vo);
			vo.setBugt_ctrl_way(map.get("bugt_ctrl_way"));
			vo.setCtrl_ymd(map.get("bugt_ctrl_ymd"));
			vo.setEnfrc_amt_cause(vo.getReq_amt());
			vo.setCtrl_ymd(map.get("bugt_ctrl_ymd"));
			vo.setCtrl_state("FAV003");
			
			// 05. 집행내역 저장
			if(comDao.mergeBblenfrc(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0026");
			}	
			
			// 06. 예실 수정
			FinComAmtChkVo amtVo = new FinComAmtChkVo();
			amtVo.setAccnt_no(vo.getAccnt_no());			
			
			if("N".equals(etcYn)){
				amtVo.setAccnt_cd(vo.getAccnt_cd());
				amtVo.setOld_req_amt(vo.getOld_req_amt());
				amtVo.setReq_amt(0);
				amtVo.setOld_cause_amt(0);
				amtVo.setCause_amt(vo.getReq_amt());
				
				if(comDao.updateBblBugtActRslt(amtVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0028", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
				}
			}else{
				amtVo.setOld_req_amt(0);
				amtVo.setReq_amt(vo.getReq_amt());
				amtVo.setBugt_yr(vo.getBugt_yr());
				amtVo.setAccnt_no(vo.getAccnt_no());
				amtVo.setRelat_no(vo.getRelat_no());				
				
				if(comDao.updateBblBugtActRsltEtc(amtVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0027");
				}
			}
			
			f_crtCtrlNo = "Y";			
		}
		
		// 08.log 저장
		LogBugCtrlMdlVo logVo = new LogBugCtrlMdlVo();
		this.setLogVo(vo, logVo);
		
		if("N".equals(f_crtCtrlNo)){
			logVo.setJob_nm("예산통제자승인 후(기 체번됨)");
		}else{
			logVo.setJob_nm("예산통제자승인 후(새로 체번됨)");
		}
		logVo.setFun_nm("FinComServiceImpl.budEnfrcMnt04");
		logVo.setBefr_req_amt(vo.getOld_req_amt());
		logVo.setCause_amt(vo.getReq_amt());
		logVo.setBefr_cause_amt(vo.getOld_enfrc_amt_cause());		
		logVo.setCtrl_no(vo.getCtrl_no());				
		
		comDao.insertLogBugCtrlMdl(logVo);
	}
	
	/**
    * 통제내역결의,구매결의,계정변경신청시 part_all_clsf = F일 경우 원인행위금액 정리
    * @param BblenfrcVo, String etcYn(기타예실, 예실 구분)
    * @author LeeYH
    * @since 2022.03.18.
    */
	public void setBblBugtCauseAmt(BBlBugtActRsltVo vo, String etcYn) throws ElException{
		
		// 01. (원인행위금액 - 결의금액) 차액조회
		FinComAmtChkVo chkVo = comDao.selectBblEnfrcAmt(vo);
		if(chkVo == null){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0033", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
		}	
		
		// 통제번호가 없을 경우 원인행위금액 정리 필요없음
		if(StringUtil.isEmpty(chkVo.getCtrl_no())) return;
		
		// 02. 기타예실 구분
		if(etcYn == null || "".equals(etcYn)){
			if(comDao.selectXodxCommstEtcYn(chkVo.getAccnt_no()).matches("D|L")){
				etcYn = "Y";
			}else{
				etcYn = "N";
			}
		}	
		
		// 03. 집행내역의 부분전체구분이 '완료'이거나 구매계정변경신청 결재완료시 변경전 신청서 원인행위 금액 정리
		if("pur_accnt_chng".equals(vo.getBiz_clsf()) || "F".equals(chkVo.getPart_all_clsf())){
			if(chkVo.getRamt_amt() > 0){
				// 집행내역 원인행의정리
				chkVo.setPart_all_clsf("F");
				if(comDao.updateBblEnfrcCauseAmt(chkVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"[" + vo.getAccnt_no()+ "," + vo.getAccnt_cd() +"] 집행내역 원인행위금액 차감"});
				}
				
				if("N".equals(etcYn)){ //일반예실인 경우		
					// 예실 원인행위 정리
					chkVo.setOld_cause_amt(chkVo.getRamt_amt());				
				
					if(comDao.updateBblBugtActRslt(chkVo) == 0){
						// cause_amt 정리(원인행위-집행금액 만큼 차감)
						// req_amt, old_req_amt, cause_amt = 0, old_cause_amt = ramt_amt로 셋팅해서 수정
						throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"[" + vo.getAccnt_no()+ "," + vo.getAccnt_cd() +"] 프로젝트예실 원인행위금액 차감"});
					}
				}else{ // 기타예실
					chkVo.setBugt_yr(vo.getBugt_yr());
					// 예실 원인행위 정리
					chkVo.setOld_req_amt(chkVo.getRamt_amt());
					
					// 기타예실
					// req_amt = 0, old_req_amt = ramt_amt로 셋팅해서 수정
					if(comDao.updateBblBugtActRsltEtc(chkVo) == 0){
						throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"[" + vo.getAccnt_no()+ "," + vo.getAccnt_cd() +"] 기타예실 원인행위금액 차감"});
					}
				}
			}
		}
	}
	
	/**
    * 예산잔액체크
    * @param BblenfrcVo, String etcYn(기타예실, 예실 구분)
    * @author LeeYH
    * @since 2022.03.18.
    */
	public BugtRamtVo selectBugtRamtChk(BblenfrcVo vo, String etcYn) throws ElException{
		// 기타예실(etcYn = Y), 일반예실(etcYn = N)
		BugtRamtVo ramtVo = new BugtRamtVo();
		if(etcYn == null || "".equals(etcYn)){
			if(comDao.selectXodxCommstEtcYn(vo.getAccnt_no()).matches("D|L")){
				etcYn = "Y";
			}else{
				etcYn = "N";
			}
		}
		
		if("Y".equals(etcYn)){ // 기타예실
			if(vo.getReq_no() != null && "272".equals(vo.getReq_no().substring(0,3))){
				ramtVo = comDao.selectBblBugtActRsltEtcSS22(vo);
			}else{
				ramtVo = comDao.selectBblBugtActRsltEtcSS21(vo);
			}
			
			if(ramtVo == null){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0023", new String[]{vo.getAccnt_no(), vo.getRelat_no()});
			}
		}else{
			// 통제방법 조회
			Map<String,String> map = comDao.selectBblBugtActRsltSS01(vo);
			if(map == null || map.get("bugt_ctrl_way") == null || "".equals(map.get("bugt_ctrl_way"))){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0024", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
			}
			
			// 잔액통제(FAF011), 내역통제(FAF021)
			if(map.get("bugt_ctrl_way").matches("FAF011|FAF021")){
				ramtVo = comDao.selectBblBugtActRsltSS22(vo);
				if(ramtVo == null){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0025", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
				}
			}
			// 비목통제
			else if("FAF031".equals(map.get("bugt_ctrl_way"))){
				ramtVo = comDao.selectBblBugtActRsltSS23(map);
				if(ramtVo == null){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0025", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
				}
			}else{
				ramtVo.setBugt_amt(0);
				ramtVo.setCause_amt(0);
				ramtVo.setEnfrc_amt(0);
				ramtVo.setReq_amt(0);
			}
			
			ramtVo.setBugt_ctrl_way(map.get("bugt_ctrl_way"));
			ramtVo.setBugt_ctrl_ymd(map.get("bugt_ctrl_ymd"));
			ramtVo.setItm_clsf(map.get("itm_clsf"));
			ramtVo.setItm_solve_base(map.get("itm_solve_base"));
		}
		
		return ramtVo;
	}
	
	/**
    * 집행내역 삭제를 위한 조회(deleteBudEnfrcMnt)
    * @param map(req_no, req_seq)
    * @author LeeYH
    * @since 2022.03.21.
    */
    @Override
	public void deleteBudEnfrcMnt(DelBblEnfrcVo basVo) throws ElException{
		List<BblEnfrcDelVo> voList = comDao.selectBblenfrcSS04(basVo);
		if(voList == null) return;
		
		int result = 0;
		for(BblEnfrcDelVo vo : voList){
			// 집행내역 삭제
			if(comDao.deleteBblEnfrc(vo) > 0){
				// 기타예실 삭제
				FinComAmtChkVo amtVo = new FinComAmtChkVo();
				
				if(vo.getMngmt_item_2().matches("D|L")){
					if(vo.getCtrl_no() != null && !"".equals(vo.getCtrl_no())){
						amtVo.setOld_req_amt(vo.getReq_amt());
						amtVo.setReq_amt(0);
						amtVo.setBugt_yr(vo.getBugt_yr());
						amtVo.setAccnt_no(vo.getAccnt_no());
						amtVo.setRelat_no(vo.getRelat_no());
						
						result = comDao.updateBblBugtActRsltEtc(amtVo);
						if(result == 0){
							throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0027");
						}
					}
				}else{ // 예실삭제
					amtVo.setAccnt_no(vo.getAccnt_no());
					amtVo.setAccnt_cd(vo.getAccnt_cd());
					
					if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
						amtVo.setReq_amt(0);
						amtVo.setOld_req_amt(vo.getReq_amt());
						amtVo.setCause_amt(0);
						amtVo.setOld_cause_amt(0);
					}else{		
						amtVo.setReq_amt(0);
						amtVo.setOld_req_amt(0);
						amtVo.setCause_amt(0);
						amtVo.setOld_cause_amt(vo.getReq_amt());
					}					
					result = comDao.updateBblBugtActRslt(amtVo);
					if(result == 0){
						throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0028", new String[]{vo.getAccnt_no(), vo.getAccnt_cd()});
					}
				}
				
				// log 저장
				LogBugCtrlMdlVo logVo = new LogBugCtrlMdlVo();
				logVo.setReq_no(vo.getReq_no());
				
				logVo.setReq_no(vo.getReq_no());
				logVo.setReq_no(vo.getReq_no());				
				logVo.setReq_seq(vo.getReq_seq());	
				logVo.setCtrl_no(vo.getCtrl_no());
				logVo.setAccnt_no(vo.getAccnt_no());
				logVo.setAccnt_cd(vo.getAccnt_cd());
				logVo.setRelat_no(vo.getRelat_no());
				logVo.setReq_amt(amtVo.getReq_amt());
				logVo.setBefr_req_amt(amtVo.getOld_req_amt());
				logVo.setCause_amt(amtVo.getCause_amt());
				logVo.setBefr_cause_amt(amtVo.getOld_cause_amt());
				logVo.setJob_clsf("D1");
			    logVo.setJob_nm("삭제");
				logVo.setFun_nm("FinComServiceImpl.deleteBudEnfrcMnt");				
				comDao.insertLogBugCtrlMdl(logVo);
			}
		}
	}
	
	/**
    * 회계코드별 관리항목 셋팅
    * @param Map
    * @return List<FspSlipMngmtVo>
    * @author LeeYH
    * @since 2022.03.31.
    */
	public List<FspSlipMngmtVo> getFspSlipMngmt(Map<String, String> map) throws ElException{
		// 회계코드별 관리항목코드 조회
		FbaAccntMngmtVo vo = new FbaAccntMngmtVo();
		vo.setAccnt_cd(map.get("accnt_cd"));
		vo.setDebit_cr_clsf(map.get("base_debit_cr"));
		List<FbaAccntMngmtVo> accntMngmtList = comDao.selectFbaAccntMngmtList(vo);
		
		List<FspSlipMngmtVo> mngmtList = new ArrayList<FspSlipMngmtVo>();
		FspSlipMngmtVo mngmtVo = null;
		for(FbaAccntMngmtVo accntMngmtNo : accntMngmtList){
			mngmtVo = new FspSlipMngmtVo();
			
			mngmtVo.setUnslip_no(map.get("unslip_no"));
			mngmtVo.setUnslip_odr(Integer.parseInt(map.get("unslip_odr")));
			mngmtVo.setMngmt_item_cd(accntMngmtNo.getMngmt_item_cd());
			mngmtVo.setMngmt_item_nm(accntMngmtNo.getMngmt_item_nm());
			mngmtVo.setEssen_ex(accntMngmtNo.getEssen_ex());
			mngmtVo.setCud_type("C");
			
			switch(accntMngmtNo.getMngmt_item_cd()){
				case "1001" : // 개인번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("relat_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "1002" : // 부서정보
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("dept_cd"));
					mngmtVo.setMngmt_detls_nm(map.get("dept_nm"));
					break;
				case "1003" : // 거래처정보
			    case "3001" : // 거래처정보
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("vend_cd"));
					mngmtVo.setMngmt_detls_nm(map.get("vend_nm"));
					break;
				case "1004" : // 은행정보
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("bank"));
					mngmtVo.setMngmt_detls_nm(map.get("bank_nm"));
					break;
				case "1005" : // 계좌번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("bankaccnt_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "1006" : // 어음번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("prmsnt_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "1007" : // 카드번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("card_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "1008" : // 카드종류
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("card_knd"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "1012" : // ZEUS 장비등록번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("ntis_reg_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "1200" : // 관련계정번호
				case "8005" : // 관련계정번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("mngmt_accnt_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "1300" : // 계정책임자정보
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("accnt_rspns"));
					mngmtVo.setMngmt_detls_nm(map.get("accnt_rspns_nm"));
					break;
				case "2020" : // 송금계좌번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("bankaccnt_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "2050" : // 출장신청번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("req_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "2051" : // 구매요청번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("pur_req_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "2052" : // 구매지급신청번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("req_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "2060" : // 관련내용
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd("");
					mngmtVo.setMngmt_detls_nm(map.get("mngmt_2060_nm"));
					break;
				case "2080" : // 관련통제번호
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("ctrl_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "2090" : // 계산서정보
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("bill_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				
				case "3003" : // 예금주명
				case "3005" : // 예금주명
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd("");
					mngmtVo.setMngmt_detls_nm(map.get("depstr_nm"));
					break;
				case "3006" : // 기업지원 kolas_no
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("kolas_no"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "4001" : // 발생일자
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("occr_ymd"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "4002" : // 만기일자
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("expir_ymd"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "4006" : // 계약일자
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("contrct_ymd"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "4031" : // 정산예정일자
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("adjst_schdl_ymd"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				case "6001" : // 미착비용코드
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd(map.get("expns_cd"));
					mngmtVo.setMngmt_detls_nm("");
					break;
				default :	
					mngmtVo.setMngmt_item_cd(mngmtVo.getMngmt_item_cd());
					mngmtVo.setMngmt_detls_cd("");
					mngmtVo.setMngmt_detls_nm("");
					break;
			}
			
			mngmtList.add(mngmtVo);
		}		
		
		return mngmtList;
	}	
	
	/**
    * selectbox 코드조회 
    * @param FinSlipSearchVo
    * @return List<FinCodeNmVo>
    * @author LeeYH
    * @since 2022.04.08.
    */
	public List<FinCodeNmVo> selectCodeList(FinCodeNmVo vo) throws ElException{
		return comDao.selectCodeList(vo);
	}	
	
	/**
    * 계정책임자/예산통제자와 예산자동통제
    * @param AutoBugtVo
    * @return AutoBugtVo
    * @author LeeYH
    * @since 2022.06.09.
    */
	public AutoBugtVo getAccntAutoBugtPsn(AutoBugtVo vo) throws ElException{			
		AutoBugtVo srcVo = new AutoBugtVo();
		srcVo.setReq_no(vo.getReq_no());	
		srcVo.setDocu_id(vo.getReq_no().substring(0,3));
		
		String accntPns = "";
		String bugtCtrlPns = "";
		
		List<AutoBugtVo> bugtList = comDao.selectAutoBugtPsn(srcVo);
		int i =0;
		String bugtAutoYn = "Y";
		for(AutoBugtVo bugtVo : bugtList){		
			if (i == 0) {
				// 계정책임자
				accntPns = bugtVo.getAccnt_rspns();
				// 예산통제자
				if(!StringUtil.isEmpty(bugtVo.getBugt_ctrl_psn())){
					bugtCtrlPns = bugtVo.getBugt_ctrl_psn();
				}
			} else {				
				if (accntPns.indexOf(bugtVo.getAccnt_rspns()) < 0) {
					accntPns = accntPns + ";" + bugtVo.getAccnt_rspns();
				}
				
				if(!StringUtil.isEmpty(bugtVo.getBugt_ctrl_psn())){
					if(bugtCtrlPns.indexOf(bugtVo.getBugt_ctrl_psn()) < 0){
						bugtCtrlPns = bugtCtrlPns + ";" + bugtVo.getBugt_ctrl_psn();
					}
				}
			}
			
			// 예산통제자와 예산자동통제 변수 재조정
			// 자동통제유무가 N과 Y가 혼합되어 있을 때 모두 예산통제할 수 있도록 조치
			if("".equals(bugtVo.getBugt_auto_yn()) || "N".equals(bugtVo.getBugt_auto_yn())){
				bugtAutoYn = "N";
			}
			
			i++;			
			AppLog.debug("\n --------------------- accntPns : " + accntPns);
		}
		
		// return vo
		vo = new AutoBugtVo();
		vo.setAccnt_rspns(accntPns);		
		vo.setBugt_ctrl_psn(bugtCtrlPns);
		vo.setBugt_auto_yn(bugtAutoYn);
		AppLog.debug("\n --------------------- return vo : " + vo);
		return vo;
	}
	
	/**
    * 계정책임자/예산통제자 (gfnAccntBugtPsn2)
    * @param String[] accntNos
    * @return AutoBugtVo
    * @author LeeYH
    * @since 2022.11.23.
    */
	public AutoBugtVo getAccntAutoBugtPsn2(AutoBugtVo vo) throws ElException{	
		List<ComResBgAcctmVo> accntList = new ArrayList<ComResBgAcctmVo>();
		
		String accntPns = "";
		String bugtCtrlPns = "";
		AppLog.info("\n -------------------------getAccntAutoBugtPsn2>>>> AutoBugtVo : " + vo);
		// 계정번호를 셋팅했을 경우		
		if(!StringUtil.isEmpty(vo.getAccnt_no())){
			String[] accntNos = vo.getAccnt_no().split(",");
			if(accntNos.length > 0){
				for(String accntNo : accntNos){
					ComResBgAcctmVo accntVo = new ComResBgAcctmVo();
					accntVo.setAccnt_no(accntNo);
					accntList.add(accntVo);
				}
				vo.setAccntList(accntList);
				
				List<AutoBugtVo> bugtList = comDao.selectComBugtCtrlPsn(vo);		
				
				int cnt =0;
				for(AutoBugtVo bugtVo : bugtList){		
					if (cnt == 0) {
						// 계정책임자
						accntPns = bugtVo.getAccnt_rspns();
						// 예산통제자
						if(!StringUtil.isEmpty(bugtVo.getBugt_ctrl_psn())){
							bugtCtrlPns = bugtVo.getBugt_ctrl_psn();
						}
					} else {				
						if (accntPns.indexOf(bugtVo.getAccnt_rspns()) < 0) {
							accntPns = accntPns + ";" + bugtVo.getAccnt_rspns();
						}
						
						if(!StringUtil.isEmpty(bugtVo.getBugt_ctrl_psn())){
							if(bugtCtrlPns.indexOf(bugtVo.getBugt_ctrl_psn()) < 0){
								bugtCtrlPns = bugtCtrlPns + ";" + bugtVo.getBugt_ctrl_psn();
							}
						}
					}
					cnt++;
				}
			}
		// 예산통제자와 계정책임자 셋팅한 경우
		}else if(!StringUtil.isEmpty(vo.getAccnt_rspns())){
			String[] accntRspns = vo.getAccnt_rspns().split(",");
			String[] bugtPsns = vo.getBugt_ctrl_psn().split(",");
			
			int cnt =0;
			for(String psn : accntRspns){
				if (cnt == 0) {
					// 계정책임자
					accntPns = psn;					
				} else {				
					if (accntPns.indexOf(psn) < 0) {
						accntPns = accntPns + ";" + psn;
					}
				}
				cnt++;
			}
			
			// 예산통제자
			cnt =0;
			for(String psn : bugtPsns){
				if (cnt == 0) {
					bugtCtrlPns = psn;					
				} else {				
					if (bugtCtrlPns.indexOf(psn) < 0) {
						bugtCtrlPns = bugtCtrlPns + ";" + psn;
					}
				}
				cnt++;
			}
		}
		
		vo.setAccnt_rspns(accntPns);		
		vo.setBugt_ctrl_psn(bugtCtrlPns);	
		AppLog.info("\n -------------------------getAccntAutoBugtPsn2 end ------->>>> AutoBugtVo : " + vo);
		return vo;
	}
	
	/**
    * 예실반영여부 체크(gfnBugtEtcChk)
    * @param BugtChkVo
    * @return BugtRamtVo
    * @author LeeYH
    * @since 2022.06.09.
    */
	public BugtRamtVo selectBugtEtcChk(BugtChkVo vo) throws ElException{
		BugtRamtVo retVo = comDao.selectBugtEtcChk(vo);		
		if(retVo == null){
			retVo = new BugtRamtVo();
			retVo.setBugt_amt(-999999); // 예산편성이 안되었을 경우에는 음수값 셋팅해서 체크가능하도록 해줌
		}
		
		return retVo;
	}
	
	/**
    * 계정마감년도, 수정여부 체크
    * @param ResBgAcctMVo 계정번호관리 vo
    * @return ResBgAcctMVo
    * @author timothee
    * @since 2023.09.25.
    */
	@Override
	public ResBgAcctMVo chkClsYear(ResBgAcctMVo vo) throws ElException {
		try {
			String mngmtItem1 = CodeCacheManager.getInstance().getCode("FCD", "FCD020").getMngmtItem1();
			BugtChkVo bugtVo = new BugtChkVo();

			bugtVo.setClose_yr(mngmtItem1);
			bugtVo = comDao.selectBblBugtActRslt(bugtVo);

			int bugtCnt = bugtVo.getBugt_cnt();
			int yrClsCnt = bugtVo.getYr_cls_cnt();
			
			if (bugtCnt > 0 && yrClsCnt == 0) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정번호[" + vo.getAccnt_no() + "]은/는 년마감이 끝났으므로 수정할 수 없습니다. 확인바랍니다."});
			}

		} catch (Exception e) {
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계정번호[" + vo.getAccnt_no() + "]은/는 년마감이 끝났으므로 수정할 수 없습니다. 확인바랍니다."});
		}
		
		return vo;
	}
	
	/**
	 * 자동결의 생성 후 차대변 금액 체크
	 * @param String unslipNo
	 * @return int
	 * @throws ElException
	 * @author LeeYoungHee
	 * @since 2023.11.17.
	 */
	public int selectUnslipAmtCheck(String unslipNo) throws ElException{
		return comDao.selectUnslipAmtCheck(unslipNo);
	}
	
	/**
     * 카드증빙 회계코드 조회(구매지급결의)
     * @param String evidCd, String cardClsf
     * @return String accntCd
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.05.
     */
	public String getAccntCd(String evidCd, String cardClsf) throws KitechException{
		String accntCd = "";
		if("FAH500".equals(evidCd)){
			if("FAI001".equals(cardClsf)){
				accntCd = "21009030";
			}else if("FAI003".equals(cardClsf)){
				accntCd = "21009060";
			}
		}else{
			accntCd = "21009010";
		}
		
		return accntCd;
	}
	
	/**
	 * 거래처 계좌번호 조회
	 * @param String vendCd
	 * @return XodfVendAccntVo
	 * @throws KitechException
	 * @author LeeYoungHee
	 * @since 2023.12.12.
	 */
	public XodfVendAccntVo selectXodfVendAccnt(String vendCd) throws KitechException{
		return comDao.selectXodfVendAccnt(vendCd);
	}
}
