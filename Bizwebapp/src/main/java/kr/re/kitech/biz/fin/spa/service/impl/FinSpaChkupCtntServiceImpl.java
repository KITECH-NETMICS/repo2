package kr.re.kitech.biz.fin.spa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.SfcChmclsSafeVo;
import kr.re.kitech.biz.epu.req.service.PurDomReqService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.spa.dao.FinSpaChkupCtntDAO;
import kr.re.kitech.biz.fin.spa.service.FinSpaChkupCtntService;
import kr.re.kitech.biz.fin.spa.vo.FinCheckUpSrcVo;
import kr.re.kitech.biz.fin.spa.vo.FinCheckupSlipInfoVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaChkupCtntVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmCheckupSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmChkUpInfoVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmInstlRegionVo;
import kr.re.kitech.biz.fin.spm.service.FinExpnsSlipMntService;
import kr.re.kitech.biz.fin.spm.vo.CardInfoVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**
 * @ClassSubJect 소액물품검수
 * @Class Name FinSpaChkupCtntServiceImpl.java
 * @Description 소액물품검수 관련 처리 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/09/01      홍성민             최초생성
 * 
 * @author 홍성민
 * @since 2022/09/01
 * @version 1.0
 * @see
 * 
 */
@Service("finSpaChkupCtntServiceImpl")
public class FinSpaChkupCtntServiceImpl implements FinSpaChkupCtntService {

	@Resource(name="finSpaChkupCtntDAO")
	FinSpaChkupCtntDAO dao;
	
	@Resource(name="attachDAO")
	private AttachDAO attachDao;

	@Resource(name = "generationServiceImpl")
    public GenerationService genService;

	@Resource(name = "apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService slipService;
	
	@Resource(name = "finComService")
	private FinComService finComService;
	
	@Resource(name="purDomReqService")
	private PurDomReqService purReqService;
	
	@Resource(name="finExpnsSlipService")
	private FinExpnsSlipMntService expnsService;
	
	/**
     * 소액물품검수관리 조회
     * @param FinCheckUpSrcVo
     * @return List<FinSpaChkupCtntVo>
     * @throws Exception
     */
	@Override
	public List<FinSpaChkupCtntVo> selectChkupCtntList(FinCheckUpSrcVo vo) throws KitechException {
		return dao.selectChkupCtntList(vo);
	}
	
	/**
     * 소액물품검수신청 조회
     * @param FinCheckUpSrcVo
     * @return FspSmlItmChkUpInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.02.27.
     */
	@Override
	public FspSmlItmChkUpInfoVo selectSmlItemCheckupReq(FinCheckUpSrcVo vo) throws KitechException {
		FspSmlItmChkUpInfoVo retVo = new FspSmlItmChkUpInfoVo();
		// 폼내역 조회
		FinSpaChkupCtntVo chekcVo = dao.selectChkupCtnt(vo);
		
		// 연구담당자 조회
		if("FF21".equals(chekcVo.getAccnt_no().substring(0,4)) && !"FF210001".equals(chekcVo.getAccnt_no())){
			chekcVo.setRes_man(dao.selectXodrDeptResMan(chekcVo.getCheck_psn()));
		}else{
			chekcVo.setRes_man(dao.selectXodrDeptResMan(chekcVo.getAccnt_rspns()));
		}
		
		retVo.setMastVo(chekcVo);
		
		// 물품내역조회
		retVo.setItemList(dao.selectFspSmlItmCheckUpD(vo));
		return retVo;
	}

	/**
     * 소액물품검수신청 모바일 저장
     * @param FinSpaChkupCtntVo
     * @throws Exception
     */
	@Override
	public String saveChkupCtntMob(FinSpaChkupCtntVo vo) throws KitechException {
		if ("C".equals(vo.getRowStatus())){
			String gen = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F27");
			vo.setCheck_no(gen);
			dao.insertFspSmlItmCheckupH(vo);
			// Xomxintfatab 신규저장 (신청번호, 서비스ID(KitechContextUtil.getServiceId()), 시작자)
			apprFuncService.formInit(gen, "F428", KitechContextUtil.getUserId());
		} else if ("U".equals(vo.getRowStatus())) {
			dao.updateChkupCtnt(vo);
		}
		
		return vo.getCheck_no() == null ? "" : vo.getCheck_no();		
	}
	
	/**
     * 최근 소액물품 설치지역 조회
     * @param FspSmlItmInstlRegionVo
	 * @return List<FspSmlItmInstlRegionVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.28.
     */	
	public List<FspSmlItmInstlRegionVo> selectRecntInstlRegion(FspSmlItmInstlRegionVo vo) throws KitechException{
		return dao.selectRecntInstlRegion(vo.getCheck_psn_nm());
	}
	
	/**
     * 소액물품 검수신청 저장
     * @param FspSmlItmChkUpInfoVo
	 * @return FinCheckUpSrcVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.03.07.
     */	
	public FinCheckUpSrcVo saveFinSmlItemCheckup(FspSmlItmChkUpInfoVo vo) throws Exception{
		// return
		FinCheckUpSrcVo retVo = new FinCheckUpSrcVo();		
		
		// 소액물품검수신청 헤더 Vo
		FinSpaChkupCtntVo mastVo = vo.getMastVo();
		String checkNo = mastVo.getCheck_no();
		
		// 01.소액물품 헤더 저장
		if("C".equals(mastVo.getRowStatus())){
			checkNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F27");
			mastVo.setCheck_no(checkNo);
			
			if(dao.insertFspSmlItmCheckupH(mastVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"소액물품검수헤더저장"});
			}
			
			// xomxintfatab 저장
			apprFuncService.formInit(checkNo, "F428", KitechContextUtil.getUserId(), mastVo.getRmk());			
		}else{
			if(dao.updateFspSmlItmCheckupH(mastVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"소액물품검수헤더저장"});
			}
		}		
		
		// 02.소액물품 디테일 저장
		if("U".equals(mastVo.getRowStatus())){
			dao.deleteFspSmlItmCheckupD(checkNo);
		}
		
		List<FspSmlItemCheckupDVo> itemList = vo.getItemList();
		if(itemList.size() > 0){
			int odr = 1;
			for(FspSmlItemCheckupDVo itemVo : itemList){
				itemVo.setCheck_no(checkNo);
				itemVo.setCheck_odr(odr);
				
				dao.insertFspSmlItmCheckupD(itemVo);
				odr++;
			}
		}
		
		// 03.사전 안전성 검토 저장
		if(!StringUtils.isEmpty(mastVo.getSafe_req_no())){
			purReqService.updateSfcChmclsSafeDcdfprInfo(mastVo.getSafe_req_no(), checkNo);
		}
		
		// 04. 전자증빙
		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setDoc_id("F27");
		paramVo.setReq_no(checkNo);		
		List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
		
		for(FspEvidAttachVo evidVo : evidVoList){
			evidVo.setReq_no(checkNo);
			evidVo.setKey_val(checkNo);
		}
		retVo.setEvid_mngmt_no(attachService.saveFspEvidAttach(evidVoList));
		retVo.setCheck_no(checkNo);			
		
		// 결재신청
		if(mastVo.isApproval()){
			this.approvalFinSmlItmCheckup(vo);
		}
		
		return retVo;
	}
	
	/**
     * 소액물품 검수신청 결재신청
     * @param FspSmlItmChkUpInfoVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.03.08.
     */	
	private void approvalFinSmlItmCheckup(FspSmlItmChkUpInfoVo vo) throws Exception{
		// 01.소액물품 검수신청 헤더
		FinSpaChkupCtntVo mastVo = vo.getMastVo();
		if(!StringUtils.isEmpty(mastVo.getInstl_posi_region_cd())){
			mastVo.setInstl_posi_region_cd(CodeCacheManager.getInstance().getCode("HBX", mastVo.getInstl_posi_region_cd()).getComNm());
		}
		if(!StringUtils.isEmpty(mastVo.getInstl_posi_build_cd())){
			mastVo.setInstl_posi_build_cd(CodeCacheManager.getInstance().getCode("APA", mastVo.getInstl_posi_build_cd()).getComNm());
		}
		
		// 02.사전안전성 검토 관리 조회
		if(!StringUtils.isEmpty(mastVo.getSafe_req_no())){
			SfcChmclsSafeVo safeVo = new SfcChmclsSafeVo();
			safeVo.setReq_no(mastVo.getSafe_req_no());
			safeVo.setPur_req_no(mastVo.getCheck_no());
			vo.setSafeList(dao.selectSfcChmclsSafeDcdfprDetail(safeVo));
		}
		
		// 03.첨부파일
		if(!"".equals(mastVo.getAttach_file_no())){
			vo.setFileList_A(attachDao.selectListAttach(mastVo.getAttach_file_no()));
		}
		// 사진첨부
		if(!"".equals(mastVo.getAttach_photo_file())){
			vo.setFileList_B(attachDao.selectListAttach(mastVo.getAttach_photo_file()));
		}
		
		// 전자증빙
		List<AttachVo> evidFileList = dao.selectFspEvidAttachApr(mastVo.getCheck_no());
		if(evidFileList != null && evidFileList.size() > 0){
			vo.setEvidFileList(evidFileList);
		}
		
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());		
		aprVo.setReqNo(mastVo.getCheck_no());
		aprVo.setMainKey(mastVo.getCheck_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("F428");
		aprVo.setManager(mastVo.getEntsch_check_psn());
		aprVo.setFinManager(mastVo.getFin_manager());		
		
		// 자산등재여부(141~149, 329 비용코드 입력 검수건에 한하여 꼭 자산등재여부 상관없이 지역 자산담당자 결재 필수) - 2023.03.08. 안건호요청
		if(mastVo.getExpns_cd().matches("141|142|143|144|145|146|147|148|149|329")){
			aprVo.setRegAstYn("Y"); 
		}else{
			aprVo.setRegAstYn(mastVo.getAset_reg());
		}
		
		if(mastVo.getExpns_cd().matches("281|282") && mastVo.getCheck_amt() >= 3000000){
			aprVo.setChkPsnYn("Y");
			aprVo.setAccountManager(mastVo.getInspect_psn());
		}else{
			aprVo.setChkPsnYn("N");
		}
		
		// 사전안전성검토유무
		aprVo.setSafeYn(mastVo.getMsds_yn());
		// 연구실책임자
		if(!StringUtils.isEmpty(mastVo.getSafe_req_no())){
			aprVo.setLabResearcher(vo.getSafeList().get(0).getMain_secrt_rspns_syspayno());
		}else{
			aprVo.setLabResearcher("");
		}
		
		aprVo.setInfoCd(mastVo.getRmk());
		aprVo.setExt1Cd(mastVo.getAccnt_no());

		// 04. 결재프로세스 호출
		AppLog.info("\n =================== aprVo : " + aprVo);
		apprFuncService.approvalRequest(aprVo, vo);		
	}
	
	/**
     * 소액물품 검수결의 조회
     * @param FinCheckUpSrcVo
     * @return FinCheckupSlipInfoVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.03.27.
     */	
	public FinCheckupSlipInfoVo selectFinSmlItmCheckupSlip(FinCheckUpSrcVo vo) throws KitechException{
		FinCheckupSlipInfoVo retVo = new FinCheckupSlipInfoVo();
		
		// 소액물품 결의 지급내역 조회
		FspSmlItmCheckupSlipVo chkVo = dao.selectFspSmlItmCheckSlip(vo);
		 
		if(chkVo.getUnslip_no() == null || "".equals(chkVo.getUnslip_no().trim())){
			// 카드사용내역 조회
			if(chkVo.getCard_no().trim() != null && !"".equals(chkVo.getCard_no().trim())) {
				FinSlipSearchVo srcVo = new FinSlipSearchVo();
				srcVo.setCard_no(chkVo.getCard_no());
				srcVo.setApprvl_no(chkVo.getApprvl_no());
				srcVo.setFrom_ymd(chkVo.getUse_ymd().substring(0,8));
				srcVo.setTo_ymd(chkVo.getUse_ymd().substring(0,8));
				
				List<CardInfoVo> cardList = expnsService.selectFinExpnsSlipCardList(srcVo);
				if(!cardList.isEmpty()) {
					chkVo.setCard_clsf(cardList.get(0).getCard_clsf());
					chkVo.setCard_knd(cardList.get(0).getCard_knd());
					chkVo.setVend_nm(cardList.get(0).getJoinsto_nm());
					chkVo.setPay_clsf("FAX900");
					chkVo.setEvid_cd("FAH500");
					
					if("FTX001".equals(chkVo.getTax_cd())){
						chkVo.setUnslip_amt(cardList.get(0).getSupply_amt());
						chkVo.setTax_amt(cardList.get(0).getTax_amt());
					}else{
						chkVo.setUnslip_amt(chkVo.getCheck_amt());
						chkVo.setTax_amt(0);
					}
					chkVo.setTotal_amt(chkVo.getCheck_amt());
				}
			} else if(chkVo.getBill_no() != null && !"".equals(chkVo.getBill_no().trim())){
				// 계산서 세팅
				if(!"FTX001".equals(chkVo.getTax_cd())){
					chkVo.setUnslip_amt(chkVo.getCheck_amt());
					chkVo.setTax_amt(0);
				}
			}
		}
		retVo.setCheckVo(chkVo);
		
		// 결의서 헤더 조회
		String unslipNo = retVo.getCheckVo().getUnslip_no();
		if(unslipNo != null && !"".equals(unslipNo)){
			retVo.setSlipHVo(dao.selectFspSlipH(unslipNo));
		}
		
		return retVo;
	}
	
	
	
	/**
     * 소액물품검수 결의생성
     * @param FinCheckupSlipInfoVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.03.27.
     */
	public String saveFinSmlItmCheckupSlip(FinCheckupSlipInfoVo vo) throws KitechException{
		FspSmlItmCheckupSlipVo checkVo = vo.getCheckVo();
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = null;	
		
		String unslipNo = "";
		String evidClsf = (checkVo.getCard_no() != null && !"".equals(checkVo.getCard_no().trim()))? "Card" :"Bill";
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //	
		FspSlipHVo hVo = vo.getSlipHVo();
		
		hVo.setRmk(dao.selectCheckupSlipRmk(checkVo.getCheck_no()));
		hVo.setCud_type("C");	
		
		unslipNo = slipService.saveAutoSlipH(checkVo.getCheck_no(), hVo);
		
		// 인터페이스 테이블 저장
		apprFuncService.formInit(unslipNo, "F429", KitechContextUtil.getUserId());
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //	
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());		
		slipVo.setSlipHVo(hVo);
		
		// 2-1. 디테일 저장
		int seq = 1;
		FspSlipDVo dVo = (FspSlipDVo)checkVo.clone();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);		
		dVo.setJourn_cd("Fn9910");	
		dVo.setJourn_odr(seq);				
		dVo.setBase_debit_cr("1");
		dVo.setRmk_1(checkVo.getRmk());
		dVo.setRmk_2(checkVo.getVend_nm());
		dVo.setReq_no(checkVo.getCheck_no());
		if("Card".equals(evidClsf)){
			dVo.setPay_clsf("FAX900");
		}else{
			dVo.setPay_clsf("");
		}
		
		if("Y".equals(checkVo.getAttach_yn())){
			dVo.setAttach_file_no(checkVo.getAttach_file_no());
		}else{
			dVo.setAttach_file_no("");
		}
		
		slipVo.setSlipDVo(dVo);			
		
		// 2-2. 관리항목
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("unslip_no", unslipNo);
		map1.put("unslip_odr", String.valueOf(seq));
		map1.put("accnt_cd", dVo.getAccnt_cd());
		map1.put("base_debit_cr", dVo.getBase_debit_cr());			
		map1.put("pur_req_no", checkVo.getCheck_no());
		map1.put("req_no", checkVo.getCheck_no());
		map1.put("bill_no", checkVo.getBill_no());
		map1.put("mngmt_accnt_no", checkVo.getAccnt_no());
		map1.put("vend_cd", checkVo.getVend_cd());
		map1.put("vend_nm", checkVo.getVend_nm());
		map1.put("dept_nm", checkVo.getEntsch_check_dept_nm());
		if("FF21".equals(checkVo.getAccnt_no().substring(0, 4))){
			map1.put("ntis_reg_no", checkVo.getNtis_reg_no());
			
			if("FF210001".equals(checkVo.getAccnt_no())){
				map1.put("relat_no", checkVo.getAccnt_rspns().substring(2, 8));
			}else{
				map1.put("relat_no", checkVo.getAccnt_no().substring(2, 8));
			}
		}else{
			map1.put("relat_no", checkVo.getAccnt_rspns().substring(2, 8));
		}
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map1));	
		
		// 2.3 송금내역생성 
		List<FspSendReqVo> sendList = new ArrayList<>();
		FspSendReqVo sendVo = new FspSendReqVo();					
		sendVo.setUnslip_no(unslipNo);
		sendVo.setUnslip_odr(seq);
		sendVo.setSend_odr(1);
		sendVo.setPay_clsf(checkVo.getPay_clsf());
		sendVo.setSend_req_amt(checkVo.getCheck_amt());
		sendVo.setSend_amt(0);		
		
		if("Card".equals(evidClsf)){
			sendVo.setCard_no(checkVo.getCard_no());
			sendVo.setUse_ymd(checkVo.getUse_ymd());
			sendVo.setApprvl_no(checkVo.getApprvl_no());
			sendVo.setJoinsto_nm(checkVo.getVend_nm()); // 가맹점명
			sendVo.setBankaccnt_no("");
			sendVo.setBank("");
			sendVo.setDepstr_nm("");
			sendVo.setVend_cd("");
			sendVo.setVend_nm("");
			sendVo.setSyspayno("");
			sendVo.setBsns_psn_regst_no("");
		}else{
			sendVo.setVend_cd(checkVo.getVend_cd());
			sendVo.setVend_nm(checkVo.getVend_nm());
			
			if("FAX020".equals(checkVo.getPay_clsf())){ // 거래처지급
				sendVo.setBsns_psn_regst_no(checkVo.getBsns_psn_regst_no());
			}else if("FAX010".equals(checkVo.getPay_clsf())){
				sendVo.setSyspayno(checkVo.getSyspayno());
			}
			
			sendVo.setBank(checkVo.getBank());
			sendVo.setBankaccnt_no(checkVo.getBankaccnt_no());
			sendVo.setDepstr_nm(checkVo.getDepstr_nm());
			sendVo.setUse_ymd(checkVo.getIssu_ymd());	
		}
		
		sendVo.setRmk(checkVo.getRmk());
		sendList.add(sendVo);
		
		slipVo.setSendList(sendList);	
		
		// 2-4.결의생성 호출
		slipService.saveAutoSlip(slipVo);
		
		String payAccntCd = dVo.getPay_accnt_cd(); // 지급회계코드(대변회계셋팅을 위해 필요)
		
		// ============================================================
		// 통제내역을 끌어온 경우
		// ============================================================
		if(checkVo.getReq_no() != null && !"".equals(checkVo.getReq_no().trim())){
			FspSlipDVo ctrlVo = (FspSlipDVo)dVo.clone();
			ctrlVo.setReq_no(checkVo.getReq_no());
			ctrlVo.setReq_seq(checkVo.getReq_seq());
			dao.updateBblenfrcAutoSlip(ctrlVo);
		}
		
		// ==================================================== //
		// 3.소액물품검수 헤더 결의번호 업데이트, 부가세 대급금추가
		//   - 예산통제는 공통모듈에서 처리
		// ==================================================== //	
		checkVo.setUnslip_no(unslipNo);
		checkVo.setUnslip_odr(seq);
		dao.updateFspSmlItmCheckupHSlipNo(checkVo);
		
		// 3-1. 전자증빙 결의번호 업데이트 
		FinSpaSlipUpdVo evidVo = new FinSpaSlipUpdVo();
		evidVo.setUnslip_no(unslipNo);
		evidVo.setUnslip_odr(seq);
		evidVo.setReq_no(checkVo.getCheck_no());
		attachService.updateFspEvidAttach(evidVo);
		
		// 3-2. 부가세 대급금추가
		if("FTX001".equals(checkVo.getTax_cd()) && checkVo.getTax_amt() > 0){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());		
	
			FspSlipDVo taxVo = new FspSlipDVo();
			seq++;
			
			taxVo.setUnslip_no(unslipNo);
			taxVo.setUnslip_odr(seq);		
			taxVo.setJourn_cd("Fn9910");	
			taxVo.setJourn_odr(seq);				
			taxVo.setBase_debit_cr("1");
			taxVo.setAccnt_no("FF030001");
			taxVo.setRmk_1(checkVo.getRmk());
			taxVo.setRmk_2(checkVo.getVend_nm());
			taxVo.setReq_no(checkVo.getCheck_no());
			taxVo.setAccnt_cd("11149015");
			taxVo.setExpns_cd("999");
			taxVo.setTotal_amt(0);
			taxVo.setUnslip_amt(checkVo.getTax_amt());
			taxVo.setTax_amt(0);
			
			slipVo.setSlipDVo(taxVo);			
			
			// 2-2. 관리항목
			map1 = new HashMap<String,String>();
			map1.put("unslip_no", unslipNo);
			map1.put("unslip_odr", String.valueOf(seq));
			map1.put("accnt_cd", taxVo.getAccnt_cd());
			map1.put("base_debit_cr", taxVo.getBase_debit_cr());			

			map1.put("mngmt_accnt_no", checkVo.getAccnt_no());
			map1.put("bill_no", checkVo.getBill_no());
			map1.put("req_no", checkVo.getCheck_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map1));	
			
			// 2-4.결의생성 호출
			slipService.saveAutoSlip(slipVo);
		}		
		
		// ==================================================== //
		// 4. 결의서 디테일(대변저장)
		// ==================================================== //	
		seq = 900;
		
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());	
					
		FspSlipDVo crVo = new FspSlipDVo();
				
		crVo.setUnslip_no(unslipNo);			
		crVo.setJourn_cd("Fn9920");			
		crVo.setBase_debit_cr("2");
		crVo.setAccnt_no("FF030001");
		crVo.setPay_clsf(checkVo.getPay_clsf());
		crVo.setExpns_cd("999");
		crVo.setRmk_1(checkVo.getRmk());
		crVo.setRmk_2(checkVo.getVend_nm());
		
		/***************************************************************
 		 * 부가세가 있는 경우 대변 저장(RCMS과제이고 카드증빙이 아닌 경우)
		 ***************************************************************/ 
		if("FTX001".equals(checkVo.getTax_cd()) && checkVo.getTax_amt() > 0 && !"FAH500".equals(checkVo.getEvid_cd()) && "FAJ005".equals(checkVo.getCard_use_ex())){
			// ----------------------------------   4-1. 대변 저장(부가세)			
			seq++;
			crVo.setUnslip_odr(seq);	
			crVo.setJourn_odr(seq);	
			
			crVo.setAccnt_cd("21009010"); // 미지급당좌
			crVo.setUnslip_amt(checkVo.getTax_amt());
			crVo.setTax_amt(0);
			crVo.setTotal_amt(0);
			
			slipVo.setSlipDVo(crVo);
		
			// 관리항목
			Map<String, String> map2 = new HashMap<String,String>();
			map2.put("unslip_no", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", crVo.getAccnt_cd());
			map2.put("base_debit_cr", crVo.getBase_debit_cr());		
			
			if("Card".equals(evidClsf)){
				map2.put("occr_ymd", checkVo.getUse_ymd().substring(0,8));
			}else{
				map2.put("occr_ymd", checkVo.getIssu_ymd());
			}
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 결의생성 호출
			slipService.saveAutoSlip(slipVo);
			
			// --------------------------------------------------    4-2. 부가세 제외 대변
			seq++;
			crVo.setUnslip_odr(seq);	
			crVo.setJourn_odr(seq);	
			
			if(payAccntCd == null || "".equals(payAccntCd)){
				crVo.setAccnt_cd(this.getAccntCd(checkVo.getEvid_cd(), checkVo.getCard_clsf()));
			}else{
				crVo.setAccnt_cd(payAccntCd);
			}
			
			crVo.setUnslip_amt(checkVo.getUnslip_amt());
			crVo.setTax_amt(0);
			crVo.setTotal_amt(0);
			
			slipVo.setSlipDVo(crVo);
		
			// 관리항목
			map2 = new HashMap<String,String>();
			map2.put("unslip_no", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", crVo.getAccnt_cd());
			map2.put("base_debit_cr", crVo.getBase_debit_cr());		
			if("Card".equals(evidClsf)){
				map2.put("occr_ymd", checkVo.getUse_ymd().substring(0,8));
				
				map2.put("card_no", checkVo.getCard_no());				
				map2.put("card_knd", this.getCardKnd(checkVo.getCard_knd()));
			}else{
				map2.put("occr_ymd", checkVo.getIssu_ymd());
			}
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 결의생성 호출
			slipService.saveAutoSlip(slipVo);
		}else{
			/***************************************************************
 		     * 부가세가 없거나, RCMS과제가 아니거나 카드증빙인  경우
		     ***************************************************************/ 
			seq++;
			crVo.setUnslip_odr(seq);	
			crVo.setJourn_odr(seq);	
			
			if(payAccntCd == null || "".equals(payAccntCd)){
				crVo.setAccnt_cd(this.getAccntCd(checkVo.getEvid_cd(), checkVo.getCard_clsf()));
			}else{
				crVo.setAccnt_cd(payAccntCd);
			}
			
			if(crVo.getAccnt_cd() == null || "".equals(crVo.getAccnt_cd())){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"회계코드"});
			}
			
			crVo.setUnslip_amt(checkVo.getTotal_amt());
			crVo.setTax_amt(0);
			crVo.setTotal_amt(checkVo.getTotal_amt());
			
			slipVo.setSlipDVo(crVo);
		
			// 관리항목
			Map<String, String> map2 = new HashMap<String,String>();
			map2.put("unslip_no", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", crVo.getAccnt_cd());
			map2.put("base_debit_cr", crVo.getBase_debit_cr());	
			
			if("Card".equals(evidClsf)){
				map2.put("occr_ymd", checkVo.getUse_ymd().substring(0,8));
				
				map2.put("card_no", checkVo.getCard_no());				
				map2.put("card_knd", this.getCardKnd(checkVo.getCard_knd()));
			}else{
				map2.put("occr_ymd", checkVo.getIssu_ymd());
			}
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 결의생성 호출
			slipService.saveAutoSlip(slipVo);
		}		
		
		// 전자증빙(크리스피드)
		EvidAttachVo attachVo = new EvidAttachVo();			
		attachVo.setUnslip_no(unslipNo);
		attachService.executeProcess(attachVo);		
		
		// 2023.06.15 소액물품 전면오픈으로 인한 분기 처리 
		String proChkReqNo = checkVo.getCheck_no();
		if("F27202303798".compareTo(proChkReqNo) <= 0) {
		//if ("F27202300000".compareTo(proChkReqNo) <= 0) {
			// 결의생성 후 통프 종료
			AprVo aprVo = new AprVo();
			aprVo.setReqNo(checkVo.getCheck_no());
			aprVo.setMainKey(checkVo.getCheck_no());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setUiId("F429");
			
			apprFuncService.formAccept(aprVo);
		}
		
		return unslipNo;
	}
	
	/**
     * 카드증빙 회계코드 조회
     * @param String evidCd, String cardClsf
     * @return String accntCd
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.03.29.
     */
	private String getAccntCd(String evidCd, String cardClsf) throws KitechException{
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
     * 카드증빙 관리항목(1008) whghl
     * @param String cardKnd
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.03.29.
     */
	private String getCardKnd(String cardKnd) throws KitechException{
		String cardKndDesc = "";
		switch(cardKnd){
			case "FAJ002" : cardKndDesc = "BC"; break;
			case "FAJ003" : cardKndDesc = "LG"; break;
			case "FAJ004" : cardKndDesc = "POINT"; break;
			case "FAJ005" : cardKndDesc = "RCMS"; break;
			case "FAJ006" : cardKndDesc = "신한(국고보조금)"; break;
			case "FAJ007" : cardKndDesc = "신한(통합이지바로)"; break;
			case "FAJ008" : cardKndDesc = "BC(보탬e-예치)"; break;            
			case "FAJ009" : cardKndDesc = "BC(보탬e-비예치)"; break;
		}
		
		return cardKndDesc;
	}
	
	/**
     * 소액물품검수신청 삭제(헤더 및 검수_기술장비등록)
     * @param String
     * @return int
     * @throws Exception
     */	
    public void deleteFspSmlItmCheckup(FinCheckUpSrcVo vo) throws KitechException{
    	// 검수신청 헤더 및 검수_기술장비등록 삭제
    	dao.deleteFspSmlItmCheckup(vo.getCheck_no());
    	// 검수신청 디테일 삭제
    	dao.deleteFspSmlItmCheckupD(vo.getCheck_no());
    	
    	// 사전안전성검토 구매번호 초기화
		purReqService.updateSfcChmclsSafeDcdfprInfoDel(vo.getCheck_no());
		
		// 결재내역 삭제
		apprFuncService.formRemove(vo.getCheck_no());
    }
    
    /**
    * 소액물품검수결의삭제
    * @param FspSmlItmCheckupSlipVo
    * @throws Exception
    * @author LeeYH
    * @since 2023.03.30.
    */
	public void deleteSmpItemCheckupSlip(FspSmlItmCheckupSlipVo vo) throws KitechException{
		String unslipNo = vo.getUnslip_no();
		
		// 1) 결의서 삭제
		slipService.deleteFspSlip(vo.getUnslip_no());
		
		// 2) 계산서 및 카드정보 삭제
		FspSlipDVo dVo = (FspSlipDVo)vo.clone();
		slipService.deleteCardOrBillInfo(dVo);
		
		// 3) 예산통제모듈 삭제
		DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
		enfrcVo.setReq_no(vo.getUnslip_no());		
		finComService.deleteBudEnfrcMnt(enfrcVo);
		
		// 4) fspsmlitmcheckuph - unslip_no 초기화
		vo.setUnslip_no("");
		vo.setUnslip_odr(0);
		// 결의취소시 결제정보 남기기 위해  unslip_no, odr만 삭제하는것으로 변경
		dao.updateFspSmlItmCheckupHSlipNo(vo);
		
		// 5) 전자증빙 - 결의번호 초기화
		FinSpaSlipUpdVo attachVo = new FinSpaSlipUpdVo();
	    attachVo.setRqst_no(unslipNo);
	    attachVo.setUnslip_no("");
	    attachVo.setReq_no(vo.getCheck_no());
	    attachService.updateFspEvidAttach(attachVo);
		
		// 6) 결재정보 삭제
		apprFuncService.formRemove(unslipNo);
	}
	
	/**
     * 소액물품 검수신청 결재후 담당자저장
     * @param FinSpaChkupCtntVo
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.09.
     */
	public void postSaveFinSmlItemCheckup(FinSpaChkupCtntVo vo) throws KitechException{
		dao.updateFspSmlItmChkPostSave(vo);
	}
}
