package kr.re.kitech.biz.fin.fnd.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.FibkAccntHisVo;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.fnd.dao.FndDepstReqDAO;
import kr.re.kitech.biz.fin.fnd.service.FndDepstReqMntService;
import kr.re.kitech.biz.fin.fnd.vo.FinDepstAprVo;
import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;
import kr.re.kitech.biz.res.exc.service.ResDepstReqService;
import kr.re.kitech.biz.res.exc.vo.ResDemndSlipVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 예금입금의뢰를 처리
 * @Class Name FndDepstReqMntServiceImpl.java
 * @Description 예금입금의뢰를 처리하는 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/05/18     이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/05/18
 * @version 1.0
 * @see
 * 
 */
@Service("fndDepstReqMntService")
public class FndDepstReqMntServiceImpl extends EgovAbstractServiceImpl implements FndDepstReqMntService {
	@Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstComService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="fndDepstReqDAO")
	private FndDepstReqDAO dao;
	
	@Resource(name="attachDAO")
	private AttachDAO attachDao;
	
	@Resource(name="resDepstReqService")
	private ResDepstReqService resDepstService;
	
	/**
     * 예금입금의뢰 Ⅱ 목록 조회
     * @param FndDepstSrcVo
     * @return List<FibkAccntHisVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.11.10.
     */
	public List<FibkAccntHisVo> selectFibkAcctHisList(FndDepstSrcVo vo) throws KitechException{
		return dao.selectFibkAcctHisList(vo);
	}
	
	/**
    * 입금의뢰팝업 및 예금입금의뢰2 상세화면 (조회)
    * @param FndDepstSrcVo
    * @author LeeYH
    * @since 2023.05.16.
    */
	public List<FcpDepstReqVo> selectFcpDepstReqInfo(FndDepstSrcVo vo) throws KitechException{
		if(vo.getReq_no() != null && !"".equals(vo.getReq_no())){
			FibkAccntHisVo acctHisVo = dao.selectFibkAcctHisForDepst(vo.getReq_no());
			vo.setAcct_txday(acctHisVo.getAcct_txday());
			vo.setAcct_txday_seq(acctHisVo.getAcct_txday_seq());
			vo.setAcct_no(acctHisVo.getBankaccnt_no());				
		}
		
		return dao.selectFcpDepstReq(vo);
	}
	
	/**
    * 입금의뢰2 저장
    * @param FcpDepstReqVo
    * @author LeeYH
    * @since 2022.03.31.
    */
	@Override
	public String saveFcpDepstReq(FcpDepstReqVo vo) throws Exception{
		String reqNo = vo.getReq_no();
		
		if("C".equals(vo.getCud_type())){
			reqNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "F41"); 
			
			vo.setReq_no(reqNo);
			
			// 입금의뢰 공통모듈 호출
			vo.setDepst_ymd(vo.getAcct_txday());
			depstComService.saveDepstReq(vo);
			
			// TODO 인터페이스테이블 저장
			apprFuncService.formInit(reqNo, "F741", KitechContextUtil.getUserId(), vo.getRmk());
			
			// 전자증빙
			FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
			paramVo.setDoc_id("F41");
			paramVo.setReq_no(reqNo);
			List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo); // R014 입금의뢰서(req_no,depst_req_no)
			
			for(FspEvidAttachVo evidVo : evidVoList){
				evidVo.setReq_no(reqNo);
				evidVo.setKey_val(reqNo + "," + reqNo);
			}
			
			attachService.saveFspEvidAttach(evidVoList);
			
		}else if("U".equals(vo.getCud_type())){
			// 입금의뢰 공통모듈 호출
			depstComService.saveDepstReq(vo);
		}
		
		if(vo.isApproval()){
			this.approvalFinDepstReq(vo);
		}
		
		return reqNo;
	}
	
	/**
	* 예금입금의뢰 결재신청
	* @param FcpDepstReqVo
	* @throws Exception
	* @author LeeYoungHee
	* @since 2023.11.14.
	*/
	private void approvalFinDepstReq(FcpDepstReqVo vo) throws Exception{
		// 결의삭제
		if(vo.getUnslip_no() != null && !"".equals(vo.getUnslip_no())){		
			resDepstService.deleteDepstReqSlipMnt(vo.getUnslip_no(), vo.getReq_no());
		}
		// 결의생성
		vo.setUnslip_no(this.saveDepstReqSlipMnt(vo));
		
		// 계정정보 조회
		Map<String,String> map = dao.selectAccntNoInfoForDepst(vo.getAccnt_no());
		vo.setEmp_nm(map.get("emp_nm"));
		vo.setStart_ymd(map.get("start_ymd"));
		vo.setCls_ymd(map.get("cls_ymd"));
		vo.setPrj_no(map.get("prj_no"));
		vo.setPosi_nm(map.get("posi_nm"));
		vo.setDept_nm(map.get("dept_nm"));
		
		// 공통코드
		vo.setDepst_clsf(CodeCacheManager.getInstance().getCode("FBD", vo.getDepst_clsf()).getComNm());
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setUiId("F741");
		aprVo.setInfoCd(vo.getRemark());
		aprVo.setExt1Cd(vo.getAccnt_no());		
		
		FinDepstAprVo depstAprVo = new FinDepstAprVo();
		depstAprVo.setDepstVo(vo);
		
		if(StringUtils.isNotBlank(vo.getAttach_file_no())){
			depstAprVo.setFileList(attachDao.selectListAttach(vo.getAttach_file_no()));
		}
		
		apprFuncService.approvalRequest(aprVo, depstAprVo);
	}
	
	/**
    * 입금의뢰2 삭제
    * @param FcpDepstReqVo
    * @author LeeYH
    * @since 2023.11.13.
    */
	public void deleteFinDepstReq(FcpDepstReqVo vo) throws KitechException{		
		// 결의삭제
		if(vo.getUnslip_no() != null && !"".equals(vo.getUnslip_no())){		
			resDepstService.deleteDepstReqSlipMnt(vo.getUnslip_no(), vo.getReq_no());
		}
		// 입금의뢰 및 잔액생성 반제금액 수정
		vo.setCud_type("D");
		depstComService.deleteDepstReq(vo);
		
		// 결재인터페이스 삭제
		apprFuncService.formRemove(vo.getReq_no());		
	}
	
	/**
    * 연구비 입금결의 생성(기술료, 예금입금의뢰2)
    * @param FcpDepstReqVo
	* @return String unslipNo
	* @throws Exception
    * @author LeeYoungHee
    * @since 2023.11.14.
    */
	public String saveDepstReqSlipMnt(FcpDepstReqVo vo) throws KitechException{
		
		String rmk = vo.getRmk() + "/" + vo.getAccnt_no();
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		String unslipNo = this.saveUnslipH(vo.getSlip_ymd(), rmk, vo.getReq_no(), "425");
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
		String depstClsfNm = CodeCacheManager.getInstance().getCode("FBD", vo.getDepst_clsf()).getComNm();
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();

		FspSlipDVo dVo = null;
		
		slipVo.setSlip_ymd(vo.getSlip_ymd());
		
		int seq = 1;
		
		dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9910");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("1");
		dVo.setAccnt_no("FF030001");
		dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
		dVo.setFomat_unit(acctmVo.getFomat_unit());
		dVo.setAccnt_cd("21017911"); // 회계코드(온라인 가수)
		dVo.setExpns_cd("999");
		dVo.setUnslip_amt(vo.getDepst_liq());
		
		dVo.setEvid_cd("FAH999");
		if("FBD081".equals(vo.getDepst_clsf())){
			int month = Integer.parseInt(vo.getAcct_txday().substring(4,6));
			int year = Integer.parseInt(vo.getAcct_txday().substring(0,4));
			if(month == 1){
				month = 13;
				year = year -1;
			}
			dVo.setRmk_1(year + "-" + (month-1) + "월분 " + depstClsfNm);
		}else{
			dVo.setRmk_1(depstClsfNm + "입금(" + vo.getAcct_txday() + "," + vo.getRmk() + "/" + vo.getAccnt_no() + ")");
		}
		dVo.setRmk_2(vo.getVend_abbr());
		dVo.setReq_no(vo.getReq_no());
		dVo.setRegst_req_psn(vo.getReq_psn());
		dVo.setOccr_slip_no(vo.getSlip_no());
		dVo.setOccr_slip_odr(vo.getSlip_odr());
		dVo.setBill_no(vo.getRecv_bill_no());
		dVo.setAttach_file_no(vo.getAttach_file_no());		
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("bankaccnt_no", vo.getBankaccnt_no());
		map.put("occr_ymd", vo.getAcct_txday());
		map.put("mngmt_2060_nm", vo.getVend_abbr());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 잔액정산
		slipVo.setRamtVo(this.setRamtCreat(dVo));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		// 2-2. fcpdepstreq 에 결의번호 업데이트
		depstComService.updateFcpDepstReqUnslipNo(unslipNo, seq, vo.getReq_no());	
		
		// 2-3. 신청서단에서 생성된 증빙데이터에 결의번호 입력
		attachService.updateFspEvidAttachUnslipNo(vo.getReq_no(), unslipNo, seq);
		
		// 2-4.입금내역확인증 증빙 신규생성
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList(vo.getReq_no().substring(0,3), "N");
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			attachVo.setKey_val(unslipNo);
		}
		
		attachService.saveFspEvidAttach(attachList);
		
		//=============================================
		//위탁기관 중소벤처기업부 선수금 차변생성
		//=============================================
		if(this.getConsignOrg(vo.getAccnt_no())){
			if(vo.getSuply_value() > 0){
				seq+= 2;
				
				ResDemndSlipVo demndVo = new ResDemndSlipVo();
				demndVo.setUnslip_no(unslipNo);
				demndVo.setReq_ymd(vo.getSlip_ymd());
				demndVo.setSuply_value(vo.getSuply_value());
				demndVo.setReq_no(vo.getReq_no());
				demndVo.setVend_abbr(vo.getVend_abbr());
				demndVo.setReq_psn(vo.getReq_psn());
				demndVo.setAccnt_no("FF030001");
				demndVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
				demndVo.setFomat_unit(acctmVo.getFomat_unit());
				
				this.createConsignOrgSlip(demndVo, seq);
			}
		}	
		
		// 2-5. 계산서 헤더 수정
		if(StringUtils.isNotBlank(vo.getRecv_bill_no())){
			depstComService.updateFtxBillHUnslipNo(vo.getRecv_bill_no(), unslipNo);
		}		
		
		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //			
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(vo.getSlip_ymd());
		
		seq= 2;
		
		dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		// 기술료, 통근버스급여공제, FBD083 교육비환급 일때는 입금의뢰시의 계정번호를 결의서테이블에 입력
		// 20150205 기숙사비(FBD084) 추가
		if(vo.getDepst_clsf().matches("FBD033|FBD081|FBD083|FBD084")){
			dVo.setAccnt_no(vo.getAccnt_no());
			dVo.setAccnt_rspns(vo.getAccnt_rspns());
			dVo.setFomat_unit(vo.getFomat_unit());
		}else{
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());			
		}
		
		dVo.setAccnt_cd(depstComService.getDepstMntAccntCd(vo.getDepst_clsf(), vo.getAccnt_no(), vo.getSlip_ymd()));
		dVo.setExpns_cd("999");	
		if(vo.getTaxamt() > 0){
			dVo.setUnslip_amt(vo.getSuply_value());
		}else{
			dVo.setUnslip_amt(vo.getDepst_liq());
		}
		dVo.setEvid_cd("FAH999");
		if("FBD081".equals(vo.getDepst_clsf())){
			int month = Integer.parseInt(vo.getAcct_txday().substring(4,6));
			int year = Integer.parseInt(vo.getAcct_txday().substring(0,4));
			if(month == 1){
				month = 13;
				year = year -1;
			}
			dVo.setRmk_1(year + "-" + (month-1) + "월분 " + depstClsfNm);
		}else if("FBD082".equals(vo.getDepst_clsf())){ // 기업부담금
			dVo.setRmk_1(vo.getRmk());
		}else{
			dVo.setRmk_1(depstClsfNm + "입금/" + vo.getAccnt_no());
		}
		dVo.setRmk_2(vo.getVend_abbr());
		dVo.setReq_no(vo.getReq_no());
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("mngmt_accnt_no", vo.getAccnt_no());
		map.put("mngmt_2060_nm", vo.getAccnt_no());
		map.put("vend_cd", vo.getVend_cd());
		map.put("vend_nm", vo.getVend_abbr());		
		map.put("bankaccnt_no", vo.getBankaccnt_no());
		map.put("bill_no", vo.getRecv_bill_no());
		map.put("occr_ymd", vo.getAcct_txday());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		if(vo.getTaxamt() > 0){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(vo.getSlip_ymd());
			
			seq+= 2;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setAccnt_no("FF030001");	
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());		
			dVo.setAccnt_cd("21025100"); // 부가세예수금
			dVo.setExpns_cd("999");	
			dVo.setUnslip_amt(vo.getTaxamt());
			
			dVo.setEvid_cd("FAH999");
			if("FBD081".equals(vo.getDepst_clsf())){
				int month = Integer.parseInt(vo.getAcct_txday().substring(4,6));
				int year = Integer.parseInt(vo.getAcct_txday().substring(0,4));
				if(month == 1){
					month = 13;
					year = year -1;
				}
				dVo.setRmk_1(year + "-" + (month-1) + "월분 " + depstClsfNm);
			}else if("FBD082".equals(vo.getDepst_clsf())){ // 기업부담금
				dVo.setRmk_1(vo.getRmk());
			}else{
				dVo.setRmk_1(depstClsfNm + "/" + vo.getAccnt_no());
			}
			dVo.setRmk_2(vo.getVend_abbr());
			dVo.setReq_no(vo.getReq_no());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			map = new HashMap<String,String>();
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", vo.getAccnt_no());
			map.put("bill_no", vo.getRecv_bill_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);				
		}
		
		// 인터페이스 저장
		apprFuncService.formInit(unslipNo, "F203", KitechContextUtil.getUserId(), rmk);
		
		// 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	}
	
	/**
     * 연구비 청구결의 헤더 저장
     * @param ResPrjInfoVo
	 * @return boolean
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private String saveUnslipH(String slipYmd, String rmk, String reqNo, String slipTypCd) throws KitechException{
		FspSlipHVo hVo = new FspSlipHVo();
		hVo.setSlip_ymd(slipYmd);		
		hVo.setSlip_typ_cd(slipTypCd);		
		hVo.setRmk(rmk);
		
		return finSlipService.saveAutoSlipH(reqNo, hVo);	
	}
	
	/**
    * 잔액생성 Vo setting
    * @param FspSlipDVo
    * @return FspRamtCreatVo
    * @author LeeYH
    * @since 2023.05.12.
    */
	private FspRamtCreatVo setRamtCreat(FspSlipDVo vo) throws KitechException{
		FspRamtCreatVo ramtVo = new FspRamtCreatVo();
		ramtVo.setUnslip_no(vo.getUnslip_no());
		ramtVo.setUnslip_odr(vo.getUnslip_odr());
		ramtVo.setAccnt_no(vo.getAccnt_no());
		ramtVo.setAccnt_cd(vo.getAccnt_cd());
		ramtVo.setExpns_cd(vo.getExpns_cd());
		ramtVo.setBase_debit_cr(vo.getBase_debit_cr());			
		ramtVo.setUnslip_amt(vo.getUnslip_amt());
		ramtVo.setRmk_1(vo.getRmk_1());
		ramtVo.setRmk_2(vo.getRmk_2());
		ramtVo.setSlip_no(vo.getOccr_slip_no());
		ramtVo.setSlip_odr(vo.getOccr_slip_odr());
		
		return ramtVo;
	}
	
	/**
     * 위탁기관 중소벤처기업부 여부
     * @param ResPrjInfoVo
	 * @return boolean
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private boolean getConsignOrg(String accntNo) throws KitechException{
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk(accntNo);
		
		return "RCA020".equals(acctmVo.getPrj_kind())  
				&& "040000000".equals(acctmVo.getBsns_cd_ofic()) 
				&& "RHA001".equals(acctmVo.getBsns_cd_inout()) 
				&& "FTX001".equals(acctmVo.getTax_cd())
				&& "FAJ005".equals(acctmVo.getCard_use_ex())
				&& acctmVo.getStart_ymd().compareTo("20190301") >= 0;
	}
	
	/**
     * 위탁기관 중소벤처기업부 선수금 차변생성
     * @param ResDemndReqVo
	 * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.27.
     */
	private void createConsignOrgSlip(ResDemndSlipVo vo, int seq) throws KitechException{
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(vo.getReq_ymd());

		FspSlipDVo dVo = new FspSlipDVo();
		dVo.setUnslip_no(vo.getUnslip_no());
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9910");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("1");		
		dVo.setAccnt_no("FF030001");
		dVo.setAccnt_rspns(vo.getAccnt_rspns());
		dVo.setFomat_unit(vo.getFomat_unit());
		dVo.setAccnt_cd("21021041"); // 선수금-국가연구개발사업
		dVo.setExpns_cd("999");
		//위탁기관 중소벤처기업부 결의생성 분기
		dVo.setUnslip_amt(vo.getSuply_value());		
		dVo.setEvid_cd("FAH999");
		dVo.setReq_no(vo.getReq_no());
		dVo.setRmk_1("중기부 위탁과제 공급가액(RCMS)/ " + vo.getAccnt_no());
		dVo.setRmk_2(vo.getVend_abbr());
		dVo.setRegst_req_psn(vo.getReq_psn());
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", vo.getUnslip_no());
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("mngmt_accnt_no", vo.getAccnt_no());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
	}	
}
