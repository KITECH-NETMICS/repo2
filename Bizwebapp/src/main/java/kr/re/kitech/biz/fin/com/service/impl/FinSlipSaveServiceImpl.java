/**
f * @Class Name :
 * @Description :
 * @author :
 * @since :
 */
package kr.re.kitech.biz.fin.com.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.dao.FinSlipSaveDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FcpPrmsntVo;
import kr.re.kitech.biz.fin.com.vo.FinComAmtChkVo;
import kr.re.kitech.biz.fin.com.vo.FinComBillCheckVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FinSaveSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDCrVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.com.vo.SlipBaseVo;
import kr.re.kitech.biz.fin.spa.vo.FinAutoSlipCrtVo;
import kr.re.kitech.biz.fin.spm.vo.CardInfoVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillHVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * FinSlipSaveServiceImpl 일반결의, 경비결의 결의생성
 * 
 * @author LeeYH-PC
 * @since 2022.03.07.
 */
@Service("finSlipSaveService")
public class FinSlipSaveServiceImpl extends EgovAbstractServiceImpl implements FinSlipSaveService {
	@Resource(name = "generationServiceImpl")
	private GenerationService generationService;

	@Resource(name = "finComService")
	private FinComService finComService;

	@Resource(name = "finSlipSaveDAO")
	private FinSlipSaveDAO slipDao;
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;
	
	private String slipYmd;
	
	/**
    * 일반결의, 경비결의(일반, 카드) 생성(디테일 단건씩 생성)
    * @param FinSaveSlipVo
    * @return unslipNo
    * @author LeeYH
    */
	@Override
	public FinSlipSearchVo saveSlip(FinSaveSlipVo vo) throws KitechException {
		FspSlipHVo slipHVo = vo.getSlipHVo(); // 결의서 헤더
		FspSlipDVo slipDVo = vo.getSlipDVo(); // 결의서 디테일
		List<FspSlipMngmtVo> mngmtVoList = vo.getMngmtList(); // 결의서 관리항목
		List<FspSendReqVo> sendVoList = vo.getSendList(); // 송금내역
				
		// ==========================================================
		// 01.결의서 헤더 생성
		// ==========================================================
		if(slipHVo.getSlip_ymd() == null || "".equals(slipHVo.getSlip_ymd()) || slipHVo.getSlip_ymd().length() != 8){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"결의일자"});
		}
		
		if(slipHVo.getCud_type() == null || "".equals(slipHVo.getCud_type())){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"결의서 헤더의 cud type"});
		}
				
		this.slipYmd = slipHVo.getSlip_ymd();
		String unslipNo = this.saveSlipH(slipHVo);
		
		// 자동결의시에는 저장하지 않고 리턴한다.
		FinSlipSearchVo retVo = new FinSlipSearchVo();		
		retVo.setUnslip_no(unslipNo);
		
		// 자동결의시 첨부파일 등 수정
		String journCd = slipDVo.getJourn_cd();
		if(journCd.matches("Fn9910|Fn9920")){ 
			slipDao.updateFspSlipD(slipDVo);
			
			// 05.전자증빙(자동결의도 증빙파일 첨부 후 전자증빙 새로 말아야 하므로 추가)
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setUnslip_no(unslipNo); 
			attachService.executeProcess(attachVo);	
		
			return retVo;
		}

		// ==========================================================
		// 02.결의서 디테일 생성
		// ==========================================================
		// 01. 결의번호 셋팅		
		slipDVo.setUnslip_no(unslipNo);
		
		// 02. 필수값 체크
		if(slipDVo.getCud_type() == null || "".equals(slipDVo.getCud_type())){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"결의서 디테일의 cud type"});
		}
		
		// 03. 결의순번	
		int unslipOdr = slipDVo.getUnslip_odr();		
		String cardUseEx = "";
		
		// 04. 필수값 체크 및 계정종료일자 체크
		String accntNo = slipDVo.getAccnt_no();
		if (accntNo == null || "".equals(accntNo)) {
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"계정번호"});
		}	
		
		if (slipDVo.getAccnt_rspns() == null || "".equals(slipDVo.getAccnt_rspns())) {
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"계정책임자"});
		}	
		
		// 계정종료일자 체크 및 계정정보 조회
		ResBgAcctmVo acctmVo = new ResBgAcctmVo();
		if (!accntNo.equals("FF030001") && !"FF21".equals(accntNo.substring(0, 4))) {
			 String chkConf = "";
			 if(slipDVo.getJourn_cd().matches("Fn0120|Fn0126")){
				 chkConf = "no_check";
			 }
			 acctmVo = finComService.chkClsYmd(accntNo, slipHVo.getSlip_ymd(), chkConf);
			 cardUseEx = acctmVo.getCard_use_ex();
		}
		
		if ("C".equals(slipDVo.getCud_type())){		
			// 결의순번 조회
			if(unslipOdr == 0){
				FinSlipSearchVo srvVo = new FinSlipSearchVo();
				srvVo.setUnslip_no(unslipNo);
				srvVo.setSlip_typ_cd(slipHVo.getSlip_typ_cd());
				srvVo.setBase_debit_cr(slipDVo.getBase_debit_cr());
				
				if(slipHVo.getSlip_typ_cd().matches("113|117")){					
					unslipOdr = slipDao.selectExpnsUnslipOdr(srvVo);
				}else{
					unslipOdr = slipDao.selectUnslipOdr(srvVo);
				}
			}
			
			slipDVo.setUnslip_odr(unslipOdr);
			slipDVo.setJourn_odr(unslipOdr);
		}
		
		// 05. 잔액관리항목 셋팅 (117결의는 화면에서 카드종류에 따라서 셋팅해서 가져옴)
		if(!"117".equals(unslipNo.substring(0,3))){
			Map<String, String> ramtMap = slipDao.selectRamtMngmtItem(slipDVo.getAccnt_cd());
			if(ramtMap != null){
				if(mngmtVoList.size() > 0){
					for(FspSlipMngmtVo mngmtVo : mngmtVoList){
						// 잔액관리항목 1
						if(ramtMap.get("mngmt_item_cd_1").equals(mngmtVo.getMngmt_item_cd())){
							// 관리항목
							if("Y".equals(mngmtVo.getEssen_ex()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_cd()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_nm())) {
								throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"관리항목[" + mngmtVo.getMngmt_item_nm() + "]"});
							}
							
							if(mngmtVo.getMngmt_detls_cd() == null || "".equals(mngmtVo.getMngmt_detls_cd())){
								slipDVo.setRamt_mngmt_1(mngmtVo.getMngmt_detls_nm());
							}else{
								slipDVo.setRamt_mngmt_1(mngmtVo.getMngmt_detls_cd());
							}
							
						// 잔액관리항목 2	
						}else if(ramtMap.get("mngmt_item_cd_2").equals(mngmtVo.getMngmt_item_cd())){
							// 관리항목
							if("Y".equals(mngmtVo.getEssen_ex()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_cd()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_nm())) {
								throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"관리항목[" + mngmtVo.getMngmt_item_nm() + "]"});
							}
							
							if(mngmtVo.getMngmt_detls_cd() == null || "".equals(mngmtVo.getMngmt_detls_cd())){
								slipDVo.setRamt_mngmt_2(mngmtVo.getMngmt_detls_nm());
							}else{
								slipDVo.setRamt_mngmt_2(mngmtVo.getMngmt_detls_cd());
							}
						}
					}
				}
			}
		}
		
		// 06. 결의서 디테일 저장
		this.saveSlipD(slipDVo, slipHVo, cardUseEx);
		
		// ==========================================================
		// 03.결의서 관리항목 생성
		// ==========================================================
		if(mngmtVoList != null && mngmtVoList.size() > 0){
			for(FspSlipMngmtVo mngmtVo : mngmtVoList){
				if(mngmtVo.getCud_type() == null || "".equals(mngmtVo.getCud_type())){
					throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"결의서 관리항목의 cud type"});
				}
				
				// 결의번호, 결의순번 셋팅
				if("C".equals(mngmtVo.getCud_type())){
					mngmtVo.setUnslip_no(unslipNo);
					mngmtVo.setUnslip_odr(unslipOdr);
				}
				
				this.saveSlipMngmt(mngmtVo);
			}
		}
		
		// ==========================================================
		// 04.결의서 송금내역 생성
		// ==========================================================
		// 일반결의 카드결의 처리일 경우 송금내역 자동입력
		if("Fn0300".equals(slipDVo.getJourn_cd()) && !"D".equals(slipDVo.getCud_type())){
			FspSendReqVo sendVo = new FspSendReqVo();
			sendVo.setCud_type(slipDVo.getCud_type());
			sendVo.setUnslip_no(slipDVo.getUnslip_no());
			sendVo.setUnslip_odr(slipDVo.getUnslip_odr());
			sendVo.setSend_odr(1);
			sendVo.setSend_req_amt(slipDVo.getTotal_amt());
			sendVo.setPay_clsf("FAX900");
			sendVo.setBank("");
			sendVo.setBankaccnt_no("");
			sendVo.setDepstr_nm("");	
			sendVo.setCard_no(slipDVo.getCard_no());
			sendVo.setUse_ymd(slipDVo.getUse_ymd());
			sendVo.setApprvl_no(slipDVo.getApprvl_no());
			sendVo.setJoinsto_nm(slipDVo.getRmk_2());
			
			if(sendVoList == null){
				sendVoList = new ArrayList<FspSendReqVo>();
			}
			sendVoList.add(sendVo);			
		}
		
		if(sendVoList != null && sendVoList.size() > 0){
			for(FspSendReqVo sendVo : sendVoList){
				if(sendVo.getCud_type() == null || "".equals(sendVo.getCud_type())){
					throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"송금내역의 cud type"});
				}
				
				if("C".equals(sendVo.getCud_type())){
					sendVo.setUnslip_no(unslipNo);
					sendVo.setUnslip_odr(unslipOdr);
				}
				
				// 경비 카드결의일경우 결의서 저장시에 send_amt입력, 일반결의 또는 일반경비결의는 결의확정시에 입력
				if("117".equals(unslipNo.substring(0,3))){
					sendVo.setSend_amt(sendVo.getSend_req_amt());
				}
				
				this.saveFspSendReq(sendVo);
			}
		}else{
			if("117".equals(unslipNo.substring(0,3))){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"송금내역"});
			}
		}
	
		// 05.전자증빙
		EvidAttachVo attachVo = new EvidAttachVo();
		attachVo.setUnslip_no(unslipNo); 
		attachService.executeProcess(attachVo);		
		
		// 저장 후 결의번호 리턴
		retVo.setUnslip_odr(unslipOdr);
		return retVo;
	}	
	
	/**
    * 결의서 삭제
    */
	public void deleteSlip(FspSlipDVo vo) throws Exception {
		String unslipNo = vo.getUnslip_no().trim();
		/// 자동결의 차변, 대변은 일반결의에서 삭제할 수 없음
		if(vo.getJourn_cd().matches("Fn9910|Fn9920")){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0018");
		}
		
		// 1)결의서 디테일 삭제(결의내역 대체처리는 결의서가 삭제된 후의 금액을 업데이트해야 하므로 순서유지해야 함)
		this.deleteSlipD(vo);	
		
		// 2) 분개별로 처리
		SlipBaseVo basVo = new SlipBaseVo();
		basVo.setUnslip_no(unslipNo);
		AppLog.info("\n -------------------------- deleteSlip >> journ_cd :" + vo.getJourn_cd());
		switch(vo.getJourn_cd()){
			case "Fn0115" : this.saveFspSlipDecsnd(vo); break; // 결의내역대체처리(Fn0115) - 결의확정테이블 수정 
			case "Fn0120" : //통제내역 결의처리(Fn0120)
				// 집행내역 금액 차감 및 결의번호 초기화
				slipDao.updateBblEnfrcDel(vo);
				break;
			case "Fn0126" : //통제내역 지급결의(RCMS/POINT)
				AppLog.info("\n -------------------------- deleteSlip >> req_no :" + vo.getReq_no() + ", req_seq :" + vo.getReq_no());
				
				// 집행내역 금액 차감 및 결의번호 초기화
				slipDao.updateBblEnfrcDel(vo);				
				break; 
			
			case "Fn0196" : // 어음부도처리(Fn0196)				
				//자동생성 대변 삭제		
				basVo.setUnslip_odr(vo.getUnslip_odr() + 1);	
				
				if (slipDao.deleteFspSlipD(basVo) == 0) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"어음부도처리 차변삭제"});
				}
				
				this.saveFcpPrmsnt(vo); // 어음테이블 수정
				break;
			case "Fn0300" :
				this.saveCardSlip(vo);
				break;
			case "Fn0105" : // On-Line입금(가수반제)(Fn0105)
			case "Fn0100" : // 채무반제처리
			case "Fn0090" : // 채권반제처리
				AppLog.info("\n -------------------------- deleteSlip >> occr_slip_no :" + vo.getOccr_slip_no() + ", occr_slip_odr :" + vo.getOccr_slip_odr());				
				FspRamtCreatVo ramtVo = new FspRamtCreatVo();
				ramtVo.setSlip_no(vo.getOccr_slip_no());
				ramtVo.setSlip_odr(vo.getOccr_slip_odr());
				ramtVo.setUnslip_amt(vo.getUnslip_amt());
				ramtVo.setUnslip_no(unslipNo);
				ramtVo.setUnslip_odr(vo.getUnslip_odr());
				
				if(depstService.deleteRamtAdjst(ramtVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액정산데이터 삭제 "});
				}
				break; // 잔액정산 삭제
		}			
		
		// 3) 카드결의
		if("117".equals(unslipNo.substring(0,3))){
			// 3-1) 카드내역 결의번호 초기화
			vo.setCud_type("D"); // 혹시 몰라서
			this.saveCardSlip(vo);
			
			// 3-2) 입금일 경우 잔액정산 초기화
			if("FF030001".equals(vo.getAccnt_no()) && !"11149015".equals(vo.getAccnt_cd())){ // 입금인 경우
				FspRamtCreatVo ramtVo = new FspRamtCreatVo();
				ramtVo.setSlip_no(vo.getOccr_slip_no());
				ramtVo.setSlip_odr(vo.getOccr_slip_odr());
				ramtVo.setUnslip_amt(vo.getUnslip_amt());
				ramtVo.setUnslip_no(vo.getUnslip_no());
				ramtVo.setUnslip_odr(vo.getUnslip_odr());
				
				if(depstService.deleteRamtAdjst(ramtVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액정산데이터 삭제 "});
				}
			}			
		}
		
		// 4) TODO 전자증빙테이블 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(vo.getUnslip_no());
		evidVo.setUnslip_odr(vo.getUnslip_odr());
		
		evidVo.setRqst_no(vo.getUnslip_no()); // 크리스피드 전자증빙 삭제로직 호출 위해 셋팅
		attachService.deleteFspAttchEvid(evidVo);		
		
		// 5) 결의서 헤더 삭제 여부 체크
		if(slipDao.selectFspSlipDTCnt(basVo) == 0){			
			slipDao.deleteFspSlipH(basVo);
			
			// 재무결의가 아닐 경우 인터페이스 삭제 및 결재 스냅샷 삭제
			if(!"150".equals(vo.getUnslip_no().substring(0,3))){
				this.aprComService.deleteApr(vo.getUnslip_no());
			}
		}else{
			// 삭제  후 대변 생성
			if(vo.getUnslip_no().substring(0,3).matches("113|117")){
				String cardNo = ("117".equals(vo.getUnslip_no().substring(0,3)))? vo.getCard_no() : "";
				this.saveFinExpnsSlipCr(vo.getUnslip_no(), cardNo);
			}
		}
	}

	/**
	 * 결의서 헤더 저장
	 */
	public String saveSlipH(FspSlipHVo slipHVo) throws KitechException {
		
		// 결의번호생성
		String unslipNo = slipHVo.getUnslip_no();
		this.slipYmd = slipHVo.getSlip_ymd();
		
		if ("C".equals(slipHVo.getCud_type())) {
			int month = Integer.parseInt(slipHVo.getSlip_ymd().substring(4, 6));
			String mon = "";
			if (month < 10) {
				mon = String.valueOf(month);
			} else if (month == 10) {
				mon = "A";
			} else if (month == 11) {
				mon = "B";
			} else if (month == 12) {
				mon = "C";
			}			
			unslipNo = generationService.getGenNumber(Numberings.SLIP.getName(), slipHVo.getSlip_typ_cd(), slipHVo.getSlip_ymd().substring(2, 4), mon);		
			
			if (unslipNo.length() != 10) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0002"); 
			}
			slipHVo.setUnslip_no(unslipNo);	
			
			if (slipDao.insertFspSlipH(slipHVo) == 0) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 헤더 생성"});
			}

			// xomxintfatab table 저장
			if (unslipNo.substring(0, 3).matches("113|117|110")) {
				String serviceId = "";
				switch(unslipNo.substring(0, 3)){
					case "113" : serviceId = "F201"; break;
					case "117" : serviceId = "F202"; break;
					case "110" : serviceId = "F203"; break;
				}
				this.aprComService.createAprInterface(unslipNo, serviceId, KitechContextUtil.getUserId(), slipHVo.getRmk());
			}
		}else if ("U".equals(slipHVo.getCud_type())) { // 결의서 헤더 수정
			slipDao.updateFspSlipH(slipHVo);
		}		

		return unslipNo;
	}
	

	/**
	 * 결의서 디테일 저장
	 */
	private void saveSlipD(FspSlipDVo vo, FspSlipHVo hVo, String cardUseEx) throws KitechException {
		int result = 0;

		if ("C".equals(vo.getCud_type())) {		
			vo.setAccnt_no_clsf(cardUseEx);
			
			if (cardUseEx != null && cardUseEx.matches("FAJ004|FAJ005|FAJ006|FAJ008|FAJ009")) { // POINT, RCMS, e나라도움(신한(국고보조금)), 보탬e-예치, 보탬e-비예치 인 경우
				// rcms check
				this.checkRcmsInfo(vo, cardUseEx);
			}
			
			// 01. 채권발생처리 (Fn0070), 채무발생처리(Fn0080), 채권반제처리(Fn0090), On-Line입금(가수반제)(Fn0105), 재무처리차변(Fn0130), 재무처리대변(Fn0140)일 경우 회계코드 체크
			if(vo.getJourn_cd().matches("Fn0070|Fn0080|Fn0090|Fn0105|Fn0130|Fn0140")){
				this.checkAccntCdPerJournCd(vo.getAccnt_cd(), vo.getJourn_cd());				
			}						

			// 02. 결의서 디테일 저장
			if(vo.getJourn_cd().matches("Fn0120|Fn0126")){ // 통제내역결의처리, 통제내역 지급결의(RCMS/POINT)일 경우 occr_slip_odr에 req_seq저장
				if("".equals(vo.getReq_no()) || vo.getReq_seq() == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"집행내역의 신청번호"});
				}
				vo.setOccr_slip_odr(vo.getReq_seq());;		
			}
			result = slipDao.insertFspSlipD(vo);
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 디테일생성"});
			}
			
			// 03. 20141219 세액있는경우 차변을 하나더 생성함(11149015 부가세대급금, FF030001, 999)
			if (vo.getTax_amt() > 0) {
				this.saveSlipDTax(vo);
			}			
			
		}else if ("U".equals(vo.getCud_type())) { // 결의서 디테일 수정
			
			// 02. 결의서 디테일 저장
			AppLog.info("\n ############### slipDVo : " + vo);
			// 첨부파일 번호가 공백으로 업데이트되는 오류가 있어서 수정(2022.11.14.)
			if(StringUtil.isEmpty(vo.getAttach_file_no())){
				vo.setAttach_file_no(slipDao.selectSlipAttachFileNo(vo));
				AppLog.info("\n ############### attach_file_no : " + vo.getAttach_file_no());
			}
			if(slipDao.updateFspSlipD(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 디테일 수정"});
			}
			
			// 03. 일반결의, 경비결의 수정시 부가세 결의서 삭제 후 재저장
			this.saveSlipDTax(vo);	
		}
		
		// 04. 분개유형별 호출
		switch(vo.getJourn_cd()){
			case "Fn0090" : // 채권반제처리(Fn0090)
			case "Fn0100" : // 채무반제처리(Fn0100)
			case "Fn0105" : this.saveSlipRamtAdjst(vo); break; // On-Line입금(가수반제)(Fn0105) - 잔액정산 저장
			case "Fn0014" :  // 경비발생(카드)-현업
			           if("FF030001".equals(vo.getAccnt_no()) && !"11149015".equals(vo.getAccnt_cd())){
			        	   this.saveSlipRamtAdjst(vo);
			           }
			           			           
					   this.saveCardSlip(vo);
			           break;
			case "Fn0064" : this.saveCardSlip(vo); break; // 수탁지원비(카드)-현업
			case "Fn0115" : this.saveFspSlipDecsnd(vo); break; // 결의내역대체처리(Fn0115) - 결의확정테이블 수정 
			case "Fn0120" : // 통제내역 결의처리(Fn0120) 
			case "Fn0126" : this.updateBblEnfrc(vo); break; // 통제내역 지급결의(RCMS/POINT) - bblenfrc 수정
			case "Fn0190" :   // 어음회수처리(Fn0190)
			case "Fn0196" : this.saveFcpPrmsnt(vo); break; // 어음부도처리(Fn0196)
			case "Fn0300" :  // 카드결의처리
						if(vo.getCard_no() != null && !"".equals(vo.getCard_no())){
							this.saveCardSlip(vo);
						}
						break;
			default : break;
		}
	
		// 05.예산통제모듈 호출(budEnfrcMnt01)
		if("1".equals(vo.getBase_debit_cr()) && !"FF030001".equals(vo.getAccnt_no())
				&& (vo.getJourn_cd().matches("Fn0011|Fn0065") || vo.getUnslip_no().substring(0,3).matches("113|117"))){			
			
			this.enfrcComBugt(vo, hVo);
		}
		
		if(null != vo.getBill_no() && StringUtils.isNotEmpty(vo.getBill_no().trim())){
			if(!"F10".equals(vo.getBill_no().substring(0,3))){
				this.updateKtxIssuMstr(vo);
				
			}else if("110".equals(vo.getUnslip_no().substring(0,3)) && "99A".equals(vo.getExpns_cd()) && "F10".equals(vo.getBill_no().substring(0,3))){
				// 06.계산서 update(비용코드 99A일 경우에는 매출계산서번호를 입력하므로)
				FtxBillHVo billVo = new FtxBillHVo();
				billVo.setUnslip_no(vo.getUnslip_no());
				billVo.setTax_bill_no(vo.getBill_no());
				slipDao.updateFtxBillHUnslipNo(billVo);
			}
		}
		
		// 07. 통제내역 지급결의(RCMS/POINT) 일 때 대변 자동생성
		if("Fn0126".equals(vo.getJourn_cd())){
			this.saveSlipDCr(vo);
		
		// 07-2. 어음부도처리(대변)(Fn0196), 어음유동성대체(대변)(Fn0197) 일 때 차변 자동생성
		}else if(vo.getJourn_cd().matches("Fn0196|Fn0197")){
			this.saveSlipDDr(vo);
		}
				
		
		// 08. 113, 117 결의일때 대변 자동생성
		if(vo.getUnslip_no().substring(0,3).matches("113|117")){
			String cardNo = ("117".equals(vo.getUnslip_no().substring(0,3)))? vo.getCard_no() : "";
			this.saveFinExpnsSlipCr(vo.getUnslip_no(), cardNo);
		}		
	}	
	
	/**
    * 예산통제모듈 호출
    * @param FspSlipDVo, FspSlipHVo
    * @author LeeYH
    * @since 2023.03.28.
    */
	private void enfrcComBugt(FspSlipDVo vo, FspSlipHVo hVo) throws KitechException{
		BblenfrcVo enfrcVo = new BblenfrcVo();
										
		enfrcVo.setReq_no(vo.getUnslip_no());
		enfrcVo.setReq_seq(vo.getUnslip_odr());
		enfrcVo.setUnslip_no(vo.getUnslip_no());
		enfrcVo.setUnslip_odr(vo.getUnslip_odr());
		enfrcVo.setReq_clsf("FBJ011");
		enfrcVo.setReq_ymd(hVo.getSlip_ymd());
		enfrcVo.setReq_psn(hVo.getWrte_psn());
		enfrcVo.setReq_dept(hVo.getWrte_dept());
		enfrcVo.setReq_dept_new_ymd(hVo.getWrte_dept_new_ymd());
		enfrcVo.setFomat_unit(vo.getFomat_unit());
		enfrcVo.setAccnt_no(vo.getAccnt_no());
		enfrcVo.setAccnt_cd(vo.getAccnt_cd());
		enfrcVo.setExpns_cd(vo.getExpns_cd());
		enfrcVo.setReq_amt(vo.getUnslip_amt());
		enfrcVo.setUnslip_amt(vo.getUnslip_amt());
		enfrcVo.setRmk(vo.getRmk_1());
		enfrcVo.setRmk_2(vo.getRmk_2());
		enfrcVo.setPart_all_clsf(vo.getPart_all_clsf());
		
		// 연구장비통합계정 중 FF210001을 제외하고는 계정번호 뒤 6자리				
		if("FF210001".equals(vo.getAccnt_no())){
			enfrcVo.setRelat_no(vo.getRamt_mngmt_1().trim());
		}else{
			enfrcVo.setRelat_no(vo.getAccnt_rspns().substring(2,8));
		}
		
		// 통제내역 호출
		finComService.budEnfrcMnt01(enfrcVo);
		// 통제번호 업데이트
		slipDao.updateFspSlipDCtrlNo(enfrcVo);
	}

	/**
	 * 결의서 디테일 저장 시 RCMS과제 여부 체크
	 */
	private void checkRcmsInfo(FspSlipDVo vo, String cardUseEx) throws KitechException {
		String evidCd = vo.getEvid_cd();
		String accntNo = vo.getAccnt_no();
		String unslipNo = vo.getUnslip_no();
		String subUnslipNo = unslipNo.substring(0, 3);

		// FAH411 영수증, FAH611 지로, FAH999 기타, FAH612 개인카드(국내), FAH613 개인카드(국외), FAH400
		// 현금영수증
		if (evidCd.matches("FAH411|FAH611|FAH999|FAH612|FAH613|FAH400")) {
			vo.setPay_accnt_cd("21009010");
			vo.setRcms_pay_clsf("FDC020");

			// 자계좌이체사유 체크
			// 2017.08.28. 통제내역결의처리-RCMS는 자계좌이체사유 체크로직 제외
			// 2017.09.11. 계정대체결의는 대체사유구분이 기타일 경우에만 자계좌허용비목
			// 체크(fspaccnttransreason.frc_trsc_yn 컬럼추가)
			String checkYn = "N";
			if (subUnslipNo.matches("115|116")) {
				// 계정대체 사유서조회
				Map<?, ?> map1 = slipDao.selectFspAccntTransResson(unslipNo);

				if ("9".equals(map1.get("frc_trsc_yn"))) {
					checkYn = "Y";
				}

			} else if ("118".equals(subUnslipNo)) {
				checkYn = "N";
			} else {
				if (!"150".equals(subUnslipNo) && !"Fn0126".equals(vo.getJourn_cd())) {
					checkYn = "Y";
				}
			}

			if ("Y".equals(checkYn)) {
				if ("FAJ005".equals(cardUseEx)) {
					Map<String, String> paramMap = new HashMap<String, String>();
					paramMap.put("accnt_no", accntNo.substring(0, 7) + "0");
					paramMap.put("accnt_expns_cd", vo.getAccnt_cd() + "/" + vo.getExpns_cd());
					paramMap.put("accnt_cd", vo.getAccnt_cd());

					Map<?, ?> map1 = slipDao.selectFrcmsItm(paramMap);					
					
					if(map1 != null && String.valueOf(map1.get("cnt")).compareTo("0") > 0) {
						if (map1.get("self_trsc_yn") != null && "N".equals(map1.get("self_trsc_yn"))) {
							throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0004");
						}
					}
				}
			}

		} else if (evidCd.equals("FAH500")) {// 카드
			vo.setRcms_pay_clsf("FDC030");

			if ("FAI001".equals(vo.getCard_clsf())) {
				vo.setPay_accnt_cd("21009030"); // 미지급(법인카드)

			} else if ("FAI003".equals(vo.getCard_clsf())) {
				vo.setPay_accnt_cd("21009060"); // 미지급(연구비카드)
			}

			// 카드등록 조회
			if ("FAJ005".equals(cardUseEx)) {
				Map<String, String> paramMap = new HashMap<String, String>();
				paramMap.put("accnt_no", accntNo.substring(0, 7) + "0");
				paramMap.put("crd_no", vo.getCard_no().replace("-", ""));

				int cnt = slipDao.selectIfRndCbaeLA02(paramMap);
				if (cnt == 0) {
					throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0005");
				}
			}
		} else {
			vo.setRcms_pay_clsf("FDC010");
			if ("FAJ006".equals(cardUseEx)) {
				// 2018.12.13. 시작년도가 2019년도이상일 경우에만 적용
				vo.setPay_accnt_cd("21009090"); // 미지급(e나라도움)
			} else if ("FAJ008".equals(cardUseEx)) {
				vo.setPay_accnt_cd("21009110"); // 미지급(보탬e) - 예치
			} else if ("FAJ009".equals(cardUseEx)) {
				vo.setPay_accnt_cd("21009010"); // 미지급(당좌) - 비예치
			} else {
				vo.setPay_accnt_cd("21009070"); // 미지급(CMS)
			}
		}		
	}

	/**
	 * 결의서 디테일 부가세 대급금 저장
	 */
	private void saveSlipDTax(FspSlipDVo slipDvo) throws KitechException {
		int result = 0;
		FspSlipDVo vo = (FspSlipDVo)slipDvo.clone();
		
		// 일반결의, 경비결의 수정시 부가세 결의서 삭제 후 재저장
		if("U".equals(vo.getCud_type())){
			SlipBaseVo basVo = new SlipBaseVo();
			basVo.setUnslip_no(vo.getUnslip_no());	
			basVo.setUnslip_odr(vo.getUnslip_odr() + 1);
			
			// 부가세 내역 존재여부 조회
			int cnt = slipDao.selectFspSlipDCnt(basVo);
			if(cnt == 1){
			    // 결의서 디테일 삭제
				result = slipDao.deleteFspSlipD(basVo);
				if (result == 0) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"부가세 결의서 디테일 삭제"});
				}
				
				// 결의서 관리항목 삭제
				result = slipDao.deleteFspSlipMngmt(basVo);
				if (result == 0) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"부가세 결의서 관리항목 삭제"});
				}
			}
			
			// 과세금액이 있을 경우 다시 재저장 위해 cud_type = C로 수정
			if (vo.getTax_amt() > 0) {
				vo.setCud_type("C");
			}
		}		
		
		if ("C".equals(vo.getCud_type())) {
			FspSlipDVo taxVo = new FspSlipDVo();
			taxVo.setUnslip_no(vo.getUnslip_no());
			taxVo.setUnslip_odr(vo.getUnslip_odr() + 1);
			
			String msg = "";
			if(vo.getJourn_cd().matches("Fn0115")){ // 결의내역 대체처리(Fn0115)
				taxVo.setJourn_cd("Fn9920");
				taxVo.setBase_debit_cr("2");
				taxVo.setAccnt_cd("11149015"); // 부가세대급금
				msg = "부가세대급금 대변생성";
				
			}else if(vo.getJourn_cd().matches("Fn0080|Fn0160")){ // Fn0080 채무발생처리, Fn0160 수입처리
				taxVo.setJourn_cd("Fn9920");
				taxVo.setBase_debit_cr("2");
				taxVo.setAccnt_cd("21025100"); // 부가세예수금
				msg = "부가세예수금 대변생성";
				
			}else{
				taxVo.setJourn_cd("Fn9910");
				taxVo.setBase_debit_cr("1");
				taxVo.setAccnt_cd("11149015"); // 부가세대급금
				msg = "부가세대급금 차변생성";
			}
			
			taxVo.setJourn_odr(vo.getUnslip_odr() + 1);
			
			// 계정책임자 조회
			taxVo.setAccnt_no("FF030001");
			ResBgAcctmVo accntVo = finComService.selectResBgAcctmChk(taxVo.getAccnt_no());
			taxVo.setAccnt_rspns(accntVo.getAccnt_rspns());
			taxVo.setFomat_unit(accntVo.getFomat_unit());
			
			taxVo.setExpns_cd("999");
			taxVo.setTotal_amt(0);
			taxVo.setUnslip_amt(vo.getTax_amt());
			taxVo.setEvid_cd(vo.getEvid_cd());
			taxVo.setPay_clsf(vo.getPay_clsf());
			
			taxVo.setRmk_1(vo.getRmk_1());
			taxVo.setRmk_2(vo.getRmk_2());
			taxVo.setRamt_mngmt_1(vo.getAccnt_no());
			taxVo.setReq_no(vo.getUnslip_no());
			taxVo.setBill_no(vo.getBill_no());			

			result = slipDao.insertFspSlipD(taxVo);
			if (result == 0) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{msg});
			}

			// 관리항목 저장
			FspSlipMngmtVo mngmtVo = new FspSlipMngmtVo();
			mngmtVo.setUnslip_no(vo.getUnslip_no());
			mngmtVo.setUnslip_odr(vo.getUnslip_odr() + 1);
			if("11149015".equals(taxVo.getAccnt_cd())){
				mngmtVo.setMngmt_item_cd("1200"); // 관련계정
			}else{
				mngmtVo.setMngmt_item_cd("8005"); // 관련계정
			}
			
			mngmtVo.setMngmt_detls_cd(vo.getAccnt_no());
			mngmtVo.setCud_type("C");
			this.saveSlipMngmt(mngmtVo);
			
			mngmtVo.setMngmt_item_cd("2090"); // 계산서번호
			mngmtVo.setMngmt_detls_cd(vo.getBill_no());
			this.saveSlipMngmt(mngmtVo);
		}
	}
	
	/**
	 * 결의서 디테일 관리항목 저장
	 */
	private void saveSlipMngmt(FspSlipMngmtVo vo) throws KitechException{
		int result = 0;
		if("D".equals(vo.getCud_type())){
			SlipBaseVo basVo = new SlipBaseVo();
			
			basVo.setUnslip_no(vo.getUnslip_no());
			basVo.setUnslip_odr(vo.getUnslip_odr());
			slipDao.deleteFspSlipMngmt(basVo);
			
		}else{
			if("C".equals(vo.getCud_type())){
				result = slipDao.insertFspSlipMngmt(vo);
			}else if("U".equals(vo.getCud_type())){
				result = slipDao.updateFspSlipMngmt(vo);
			}
			
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 관리항목 저장"});
			}
		}
	}
	
	/**
	 * 결의서 디테일, 관리항목 삭제
	 */
	private void deleteSlipD(FspSlipDVo vo) throws Exception{
		String unslipNoSub = vo.getUnslip_no().substring(0, 3);
		
		Map<String, String> map1 = slipDao.selectFspSlipHDecsnEx(vo.getUnslip_no());
		// 01. 결의확정여부에 따라 삭제 가능 체크
		if("Y".equals(map1.get("decsn_ex"))){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0003", new String[]{"해당 결의서는 " + map1.get("accnt_ymd") + " 일자로 확정 완료되어"});
		}
		
		SlipBaseVo basVo = new SlipBaseVo();
		basVo.setUnslip_no(vo.getUnslip_no());	
		
		// 20141212 부가세 결의서 디테일여부 확인
		if(vo.getTax_amt() > 0 && !"F".equals(vo.getPart_all_clsf())){ // 전체삭제가 아닐 경우
			basVo.setUnslip_odr(vo.getUnslip_odr() + 1);
			int cnt = slipDao.selectFspSlipDCnt(basVo);
			if(cnt == 1){
			    // 결의서 디테일 삭제
				if (slipDao.deleteFspSlipD(basVo) == 0) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"부가세 결의서 디테일 삭제"});
				}
				
				// 결의서 관리항목 삭제
				slipDao.deleteFspSlipMngmt(basVo);
			}
		}
		
		// 02. 결의서 디테일 삭제
		// 1) TODO 집행내역 삭제모듈 삭제 모듈 호출(deleteBudEnfrcMnt)
		// 일반결의 Fn0011, Fn0065일 경우에만 호출		
		if("1".equals(vo.getBase_debit_cr()) && !"FF030001".equals(vo.getAccnt_no()) && (vo.getJourn_cd().matches("Fn0011|Fn0065") || unslipNoSub.matches("113|117"))){
			DelBblEnfrcVo delVo = new DelBblEnfrcVo();
			delVo.setReq_no(vo.getUnslip_no());
			delVo.setReq_seq(String.valueOf(vo.getUnslip_odr())); // req_seq =0인 경우가 있어서 
			
			finComService.deleteBudEnfrcMnt(delVo);
		}
		
		// 2) 결의서 디테일 삭제
		// 2-1) 경비결의 일반에서 차변삭제시 같은 증빙으로 공제 내역이 있는지 조회
		if(unslipNoSub.matches("113")){
			if("1".equals(vo.getBase_debit_cr()) && vo.getBill_no() != null && !"".equals(vo.getBill_no())){
				basVo.setBill_no(vo.getBill_no());
				if(slipDao.selectFspSlipDBillNoCnt(basVo) > 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0019", new String[]{vo.getBill_no()});
				}
			} 
		}	
			
		AppLog.info("\n ############## deleteSlipD >> unslip_no : " + vo.getUnslip_no() + ", part_all_clsf : "  + vo.getPart_all_clsf());
		if(!"F".equals(vo.getPart_all_clsf())){ // 전체삭제가 아닐 경우
			basVo.setUnslip_odr(vo.getUnslip_odr());
			
			// 2-2) 통제내역 지급결의(RCMS/POINT) 자동생성 대변 삭제
			if("Fn0126".equals(vo.getJourn_cd())){
				basVo.setUnslip_odr(vo.getUnslip_odr() + 2);
				if (slipDao.deleteFspSlipD(basVo) == 0) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"통제내역결의처리 대변삭제"});
				}
			}
		}
		
		int result = slipDao.deleteFspSlipD(basVo);
		if (result == 0 || (!"F".equals(vo.getPart_all_clsf()) && result > 1)) {
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서디테일 삭제 [순번 : " + vo.getUnslip_odr() + "]"});
		}	
		
		// 2-3) 회의록 관련 삭제일 경우 fspmeetevidh에 결의번호 초기화
		if(vo.getReq_no() != null && !"".equals(vo.getReq_no()) && "F25".equals(vo.getReq_no().substring(0, 3))){
			slipDao.updateFspMeetEvidDel(vo);
		}
		
		// 3) 계산서 테이블 정리
		if(null != vo.getBill_no() && StringUtils.isNotEmpty(vo.getBill_no().trim())){
			if(!"F10".equals(vo.getBill_no().substring(0,3))){
				basVo.setUnslip_odr(vo.getUnslip_odr());
				basVo.setUnslip_amt(vo.getTotal_amt());
				basVo.setIssu_seqno(vo.getBill_no());		
				
				this.deleteKtxIssuMstrSlip(basVo);	
				
			}else if("110".equals(unslipNoSub) && "99A".equals(vo.getExpns_cd()) && "F10".equals(vo.getBill_no().substring(0,3))){
				// 비용코드 99A일 경우 매출계산서
				FtxBillHVo billVo = new FtxBillHVo();
				billVo.setUnslip_no("");
				billVo.setTax_bill_no(vo.getBill_no());
				slipDao.updateFtxBillHUnslipNo(billVo);
			}
		}	
		
		// 4) 증빙(fspitmeviddetls)- (구)이지바로과제 회의록  삭제
		if("Y".equals(vo.getEvid_yn())){
			// 결의번호,결의순번은 일치하고 비용코드가 다른 증빙이 존재할 경우 삭제
			basVo.setUnslip_odr(vo.getUnslip_odr());
			basVo.setExpns_cd(vo.getExpns_cd());
			if(slipDao.selectFspItmEvidDetlsCnt(basVo) > 0){
				slipDao.deleteFspItmEvidDetls(basVo);
			}
			
			if(vo.getExpns_cd().matches("410|411")){
				// 2017.10.24. 이지바로과제일 경우 회의록 참조하여 fspitmeviddetls저장, 비용코드 410, 411일 때
				FinSlipSearchVo srcVo = new FinSlipSearchVo();
				srcVo.setUnslip_no(vo.getUnslip_no());
				slipDao.insertFspItmEvidDetlsBySel(srcVo);			
			}
		}
		
		// 5) 관리항목 삭제
		if("F".equals(vo.getPart_all_clsf())){ // 전체삭제일 경우
			basVo.setUnslip_odr(0);
		}
		slipDao.deleteFspSlipMngmt(basVo);
		
		// 5-1) 송금내역 삭제
		if("F".equals(vo.getPart_all_clsf())){ // 전체삭제일 경우
			basVo.setUnslip_odr(0);
		}
		slipDao.deleteFspSendReq(basVo);		
	}
	
	 /**
     * 결의취소시 매입계산서 내역 수정
     * @param String billNo
     * @return int
     * @throws Exception
     */
	public void deleteKtxIssuMstrSlip(SlipBaseVo vo) throws KitechException{
		if (slipDao.updateKixIssuMstrForDel(vo) == 0) {
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 삭제시 계산서 [" + vo.getBill_no() + "]수정"});
		}
	}
	
	/**
    * 송금의뢰내역 저장
    */
	private void saveFspSendReq(FspSendReqVo vo) throws KitechException{
		int result = 0;
		
		if(vo.getPay_clsf() == null || "".equals(vo.getPay_clsf())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"지급구분"});
		}
	
		if("C".equals(vo.getCud_type())){
			result = slipDao.insertFspSendReq(vo);			
			
		}else if("U".equals(vo.getCud_type())){
			result = slipDao.updateFspSendReq(vo);
			
		}else if("D".equals(vo.getCud_type())){
			SlipBaseVo basVo = new SlipBaseVo();
			
			basVo.setUnslip_no(vo.getUnslip_no());
			basVo.setUnslip_odr(vo.getUnslip_odr());
			basVo.setSend_odr(vo.getSend_odr());
			result = slipDao.deleteFspSendReq(basVo);
		}
		
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 송금내역 처리"});
		}
	}
	
	/**
    * 분개유형별 회계코드 체크
    */
	private void checkAccntCdPerJournCd(String accntCd, String journCd) throws KitechException{
		Map<String, String> map = slipDao.selectXodfAccntChk(accntCd);
		
		String caseByAdjstEx = map.get("caseby_adjst_ex"); // 건별정산유무
		String bondDebtClsf = map.get("bond_debt_clsf"); // 채권채무구분
		if ("Y".equals(caseByAdjstEx)) {
			// 재무처리(차변), 재무처리(대변)에서는 건별정산유무가 Y인 회계코드는 사용할 수 없음
			if(journCd.matches("Fn0130|Fn0140")){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0011", new String[]{accntCd});
				
			}else if(journCd.matches("Fn0070|Fn0090")){
				// 채권발생처리, 채권반제처리인 경우에는 채권채무구분이 1 이어야 함
				if("2".equals(bondDebtClsf)) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0012", new String[]{accntCd});
				}
			}else if(journCd.matches("Fn0105|Fn0080")){
				// On-Line입금가수반제, 채무발생처리 경우에는 채권채무구분이 2 이어야 함
				if("1".equals(bondDebtClsf)) {
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0013", new String[]{accntCd});
				}
			}
		}else if ("N".equals(caseByAdjstEx)) {
			// On-Line입금가수반제, 채권발생처리, 채무발생처리, 채권반제처리에서는 건별정산유무가 N인 회계코드는 사용할 수 없음
			if(journCd.matches("Fn0105|Fn0070|Fn0080|Fn0090")){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0014", new String[]{accntCd});
			}
		}
	}
	
	/**
    * 계산서 수정
    */
	private void updateKtxIssuMstr(FspSlipDVo vo) throws KitechException{		
		FinComBillCheckVo chkVo = slipDao.selectKtxIssuMstrChk(vo);
		AppLog.info("\n #################### updateKtxIssuMstr >> FinComBillCheckVo : " + chkVo);
		// 2023.11.08. 임자경요청(XC22023029E3) 부가세신고확인인 경우 결의생성이 안되도록 수정
		if(chkVo.getTax_returns_yn().matches("Y|E")){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "수정 발행된 계산서입니다. 최종 발행된 계산서로 결의를 진행하여 주시기 바랍니다.");
		}
		
		if("F".equals(chkVo.getTotl_amt_chk())){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0010", new String[]{chkVo.getUnslip_no()});
		}
		
		AppLog.info("\n #################### updateKtxIssuMstr >> bf_total_amt : " + vo.getBf_total_amt());
		AppLog.info("\n #################### updateKtxIssuMstr >> total_amt : " + vo.getTotal_amt());
		// 위와 똑같은 체크로직
		if(chkVo.getTrans_amt() - vo.getBf_total_amt() + vo.getTotal_amt() > chkVo.getTotl_amt()){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0010", new String[]{chkVo.getUnslip_no()});
		}				

		int result = slipDao.updateKtxIssuMstr(vo);

		if (result == 0) {
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계산서에 결의번호를 업데이트"});
		}
	}
	
	/**
    * 잔액정산 정산 데이터 생성
    */
	private void saveSlipRamtAdjst(FspSlipDVo vo) throws KitechException{
		FspRamtCreatVo ramtVo = new FspRamtCreatVo();
					
		ramtVo.setSlip_no(vo.getOccr_slip_no().trim());
		ramtVo.setSlip_odr(vo.getOccr_slip_odr());
		ramtVo.setUnslip_no(vo.getUnslip_no());
		ramtVo.setUnslip_odr(vo.getUnslip_odr());
		ramtVo.setAccnt_no(vo.getAccnt_no());
		ramtVo.setAccnt_cd(vo.getAccnt_cd());
		ramtVo.setExpns_cd(vo.getExpns_cd());
		ramtVo.setRmk_1(vo.getRmk_1());
		ramtVo.setRmk_2(vo.getRmk_2());
		ramtVo.setBase_debit_cr(vo.getBase_debit_cr());
		ramtVo.setWon_occr_amt(vo.getTotal_amt()); // 잔액정산	
		ramtVo.setUnslip_amt(vo.getTotal_amt()); // 잔액생성
		ramtVo.setFinal_adjst_ymd(this.slipYmd);
		
		if("C".equals(vo.getCud_type())){
			ramtVo.setBefore_amt(0);
			ramtVo.setCud_type("C");			
			
		}else if("U".equals(vo.getCud_type())){
			ramtVo.setBefore_amt(vo.getBf_total_amt());
			ramtVo.setCud_type("U");
		}	
			
		depstService.saveRamtAdjst(ramtVo);
	}
	
	/**
    * 결의내역 대체처리 확정테이블 수정
    */
	private void saveFspSlipDecsnd(FspSlipDVo vo) throws KitechException{
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("occr_slip_no", vo.getOccr_slip_no());
		paramMap.put("occr_slip_odr", vo.getOccr_slip_odr());
		paramMap.put("trans_unslip_no", vo.getUnslip_no());
		paramMap.put("updt_syspayno", vo.getUpdt_syspayno());
		
		int result = 0;
		if("C".equals(vo.getCud_type())){
			result = slipDao.updateFspSlipDecsnd(paramMap);
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서확정테이블 수정"});
			}
		}else if("U".equals(vo.getCud_type())){
			result = slipDao.updateFspSlipDecsnd(paramMap);
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"수정전 결의서확정테이블 수정"});
			}
			
			if(vo.getBf_occr_slip_no() != null 
			    && (vo.getOccr_slip_no().equals(vo.getBf_occr_slip_no()) || vo.getOccr_slip_odr() != vo.getBf_occr_slip_odr())){	
			    // 이전 발생결의번호로 확정테이블 업데이트
			    paramMap.put("occr_slip_no", vo.getBf_occr_slip_no());
			    paramMap.put("occr_slip_odr", vo.getBf_occr_slip_odr());
			    
			    result = slipDao.updateFspSlipDecsndDel(paramMap);
			}
		}else if("D".equals(vo.getCud_type())){
			result = slipDao.updateFspSlipDecsndDel(paramMap);
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서확정테이블 대체금액초기화"});
			}
		}
	}
	
	/**
    * 통제내역 결의처리 집행내역테이블 수정
    */
	private void updateBblEnfrc(FspSlipDVo vo) throws KitechException{
		// 원인행위 금액 체크
		if("".equals(vo.getReq_no()) || vo.getReq_seq() == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"집행내역의 신청번호"});
		}
		
		// 원인행위금액 수정		
		int result = slipDao.updateBblEnfrc(vo);
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"집행내역테이블 수정"});
		}
		
		FinComAmtChkVo chkVo = slipDao.selectBblEnfrcChk(vo);		
		if(chkVo.getRamt_amt() < 0 ){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0017", new String[]{String.valueOf(vo.getUnslip_amt()), String.valueOf(chkVo.getRamt_amt())});
		}	
	}
	
	/**
    * 통제내역 지급결의(RCMS/POINT) 대변 자동생성
    */
	private void saveSlipDCr(FspSlipDVo vo) throws KitechException{
		FspSlipDVo crVo = new FspSlipDVo();
		crVo.setUnslip_no(vo.getUnslip_no());
		crVo.setUnslip_odr(vo.getUnslip_odr() + 2);	
		
		crVo.setTotal_amt(vo.getTotal_amt());
		crVo.setUnslip_amt(vo.getTotal_amt());
		crVo.setTax_amt(0);
		crVo.setRmk_1(vo.getRmk_1());
		crVo.setRmk_2(vo.getRmk_2());		
		
		if("C".equals(vo.getCud_type())){
			crVo.setJourn_cd("Fn9920");
			crVo.setBase_debit_cr("2");		
			crVo.setJourn_odr(vo.getJourn_odr());
			
			// 계정책임자 조회
			crVo.setAccnt_no("FF030001");
			ResBgAcctmVo accntVo = finComService.selectResBgAcctmChk(crVo.getAccnt_no());
	
			crVo.setAccnt_rspns(accntVo.getAccnt_rspns());
			crVo.setFomat_unit(accntVo.getFomat_unit());			
			
			String payAccntCd = vo.getPay_accnt_cd();
			if(payAccntCd == null){
				payAccntCd = "21009010";
			}
			crVo.setAccnt_cd(payAccntCd); 
			crVo.setExpns_cd("999");
			crVo.setReq_no(vo.getReq_no());
		
			if (slipDao.insertFspSlipD(crVo) == 0) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"대변 자동생성"});
			}
		}else if("U".equals(vo.getCud_type())){
			if(slipDao.updateFspSlipD(crVo) == 0) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"대변수정"});
			}
		}
	}
	
	/**
    * 어음부도처리(Fn0196), 어음유동성대체(대변)(Fn0197) 차변 자동생성
    */
	private void saveSlipDDr(FspSlipDVo vo) throws KitechException{
		FspSlipDVo drVo = new FspSlipDVo();
		drVo.setUnslip_no(vo.getUnslip_no());
		drVo.setUnslip_odr(vo.getUnslip_odr() + 1);				
		drVo.setBase_debit_cr("1");		
		drVo.setJourn_odr(vo.getJourn_odr());
		
		drVo.setAccnt_no(vo.getAccnt_no());
		drVo.setAccnt_rspns(vo.getAccnt_rspns());
		drVo.setFomat_unit(vo.getFomat_unit());		
		
		if("Fn0197".equals(vo.getJourn_cd())){
			drVo.setAccnt_cd(vo.getAccnt_cd()); 
			drVo.setRmk_2("어음유동성 계정대체");
			drVo.setJourn_cd("Fn9910"); // 분개코드(자동결의(차변))
		}else{
			drVo.setAccnt_cd("11113030"); // 부도어음
			drVo.setRmk_2("어음부도 계정대체");
			drVo.setJourn_cd("Fn9195"); // 분개코드(어음부도처리(차변))
		}
		
		drVo.setExpns_cd("999");
		drVo.setEvid_cd("FAH999");
		drVo.setTotal_amt(vo.getTotal_amt());
		drVo.setUnslip_amt(vo.getTotal_amt());
		drVo.setTax_amt(0);
		
		drVo.setRmk_1(vo.getRmk_1());
		
		drVo.setRamt_mngmt_1(vo.getRamt_mngmt_1());
		drVo.setRamt_mngmt_2(vo.getRamt_mngmt_2());
		
		if("C".equals(vo.getCud_type())){
			if (slipDao.insertFspSlipD(drVo) == 0) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"차변 자동생성"});
			}
		}else if("U".equals(vo.getCud_type())){
			if(slipDao.updateFspSlipD(drVo) == 0) {
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"차변수정"});
			}
		}
	}
	
	/**
    * 어음회수처리(Fn0190)
    */
	private void saveFcpPrmsnt(FspSlipDVo vo) throws KitechException{
		if(vo.getPrmsnt_no() == null || "".equals(vo.getPrmsnt_no())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"어음번호"});
		}
		
		FcpPrmsntVo prmsntVo = slipDao.selectFcpPrmsnt(vo.getPrmsnt_no());
		
		if("C".equals(vo.getCud_type())){
			prmsntVo.setContpat_accnt_cd(vo.getAccnt_cd());
			
			if("Fn0196".equals(vo.getJourn_cd())){ // 어음부도처리
				prmsntVo.setContpat_accnt_cd("11113030");
				prmsntVo.setPrmsnt_state_cd("FAQ052"); // 부도결의
				prmsntVo.setUnslip_cr_amt(prmsntVo.getUnslip_cr_amt() + vo.getUnslip_amt());
				
			}else if("Fn0197".equals(vo.getJourn_cd())){ //어음유동성대체(대변)
				String contPatAccntCd = "";
				// FBD011(연구비), FBD021(기술지원비), FBD099(기타)
				if(prmsntVo.getDepst_clsf().matches("FBD011|FBD021|FBD099")){
					if("FAO002".equals(prmsntVo.getPrmsnt_clsf())){
						contPatAccntCd = prmsntVo.getMngmt_item_3();
					}else{
						contPatAccntCd = prmsntVo.getMngmt_item_1();
					}
				}
				
				prmsntVo.setContpat_accnt_cd(contPatAccntCd);
			
			}else{
				if(prmsntVo.getAmt() == prmsntVo.getTimes_liq() + prmsntVo.getUnslip_amt() + vo.getUnslip_amt()){
					prmsntVo.setPrmsnt_state_cd("FAQ022"); // 만기결의
				}
				
				prmsntVo.setUnslip_cr_amt(prmsntVo.getUnslip_cr_amt() - vo.getUnslip_amt());
			}			
						
		}else if("U".equals(vo.getCud_type())){
			if("Fn0196".equals(vo.getJourn_cd())){ // 어음부도처리
				prmsntVo.setUnslip_cr_amt(prmsntVo.getUnslip_cr_amt() + vo.getUnslip_amt() - vo.getBf_unslip_amt());
			}else{
				prmsntVo.setContpat_accnt_cd("11113030");
				prmsntVo.setUnslip_cr_amt(prmsntVo.getUnslip_cr_amt() - vo.getUnslip_amt() + vo.getBf_unslip_amt());
				
				if(prmsntVo.getAmt() == prmsntVo.getTimes_liq() + prmsntVo.getUnslip_amt() + vo.getUnslip_amt() - vo.getBf_unslip_amt()){
					prmsntVo.setPrmsnt_state_cd("FAQ022"); // 만기결의
				}
			}
		}else if("D".equals(vo.getCud_type())){
			prmsntVo.setPrmsnt_state_cd("FAQ013"); // 입금결의확정
			
			if("Fn0196".equals(vo.getJourn_cd())){ // 어음부도처리
				prmsntVo.setUnslip_cr_amt(prmsntVo.getUnslip_cr_amt() - vo.getUnslip_amt());
			}else{
				prmsntVo.setUnslip_cr_amt(prmsntVo.getUnslip_cr_amt() + vo.getUnslip_amt());
			}
		}
		
		if(slipDao.updateFcpprmsnt(prmsntVo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"받을어음내역 수정"});
		}
	}
	
	/**
    * 카드결의처리
    */
	private void saveCardSlip(FspSlipDVo vo) throws KitechException{		
		if(vo.getTotal_amt() == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"결의금액"});
		}
		
		if("117".equals(vo.getUnslip_no().substring(0,3))){
			if(StringUtil.isEmpty(vo.getUse_ymd()) || StringUtil.isEmpty(vo.getApprvl_no())){
				if(StringUtil.isEmpty(vo.getCard_no())){
					vo.setCard_no(vo.getRamt_mngmt_2().trim());
					CardInfoVo cardVo = slipDao.selectCardInfo(vo);
					if(cardVo != null){
						vo.setApprvl_no(cardVo.getApprvl_no());
						vo.setUse_ymd(cardVo.getUse_ymd());
						vo.setCard_clsf(cardVo.getCard_clsf());
						vo.setCard_knd(cardVo.getCard_knd());
					}
				}
			}
		}
		
		if(vo.getUse_ymd() == null || "".equals(vo.getUse_ymd())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"사용일자"});
		}
		
		if(vo.getApprvl_no() == null || "".equals(vo.getApprvl_no())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"승인번호"});
		}		
		
		if(vo.getCard_clsf() == null || "".equals(vo.getCard_clsf())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"카드종류"});
		}
		
		if(vo.getCard_knd() == null || "".equals(vo.getCard_knd())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0001", new String[]{"카드구분"});
		}
			
		int result = 0;
		
		if("D".equals(vo.getCud_type())){
			this.deleteCardSlipInfo(vo);
		}else{		
			// 카드결의 잔액 체크
			Map<String, String> map = slipDao.selectCardUseCheck(vo);
			if("N".equals(map.get("chk_amt"))){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0010");
			}
			
			// 117결의일때 동일한 카드내역에 결의생성된 건이 존재하는지 체크
			// 110 카드처리일 경우에도 동일한 카드사용내역을 쪼갤 수 없도록 체크(2023.04.18. 이민기확인)
			if("C".equals(vo.getCud_type())){
				//AppLog.info("\n ------------------- unslip_no : " + map.get("unslip_no"));
				if(map.get("unslip_no") != null && !"".equals(map.get("unslip_no").trim()) && !vo.getUnslip_no().equals(map.get("unslip_no"))){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0021", new String[]{map.get("unslip_no")});
				}
			}
			
			// conf_accnt_cd setting(확정일 때 회계코드 넣어줌)
			//vo.setConf_accnt_cd(vo.getAccnt_cd());
			
			// 법인카드 OR 보탬e-예치 OR 보탬e-비예치
			if("FAI001".equals(vo.getCard_clsf()) || ("FAI003".equals(vo.getCard_clsf()) && vo.getCard_knd().matches("FAJ008|FAJ009"))){
				result = slipDao.updateFbcRecogn(vo);
			}else{ // 연구비카드				
				switch(vo.getCard_knd()){
					case "FAJ002" : result= slipDao.updateFbcRndAuth(vo); break; // 연구비 BC
					case "FAJ003" :        										// 신한(연구재단)
					case "FAJ006" : result= slipDao.updateFlgRndRecogn(vo); break; // 신한(국고보조금)
					case "FAJ007" : result= slipDao.updateEzCardOrgn(vo); break; // 신한(통합이지바로)
					default : break;
				}	
			}
			
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"카드승인내역의 결의금액 업데이트"});
			}
		}
	}
	
	/**
    * 카드결의정보 삭제
    * @param FspSlipDVo
    * @author LeeYH
    * @since 2022.07.19.
    */
	public void deleteCardSlipInfo(FspSlipDVo vo) throws KitechException{
		int result = 0;
			
		AppLog.info("\n ##################### deleteCardSlipInfo>>>> unslip_no, card_no, apprval_no : ",vo.getUnslip_no() + "," + vo.getCard_no() + "," + vo.getApprvl_no());
		 // 법인카드 OR 보탬e-예치 OR 보탬e-비예치
		if("FAI001".equals(vo.getCard_clsf()) || ("FAI003".equals(vo.getCard_clsf()) && vo.getCard_knd().matches("FAJ008|FAJ009"))){
			result = slipDao.updateFbcRecognDel(vo);
		}else{ // 연구비카드
			switch(vo.getCard_knd()){
				case "FAJ002" : result= slipDao.updateFbcRndAuthDel(vo); break; // 연구비 BC
				case "FAJ003" :        											// 신한(연구재단)
				case "FAJ006" : result= slipDao.updateFlgRndRecognDel(vo); break; // 신한(국고보조금)
				case "FAJ007" : result= slipDao.updateEzCardOrgnDel(vo); break; // 신한(통합이지바로)
				default : break;
			}	
		}
		
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"카드승인내역의 결의금액 삭제"});
		}
	}
	
	/**
    * 경비결의시 대변 자동생성
    */
	private void saveFinExpnsSlipCr(String unslipNo, String cardNo) throws KitechException{
		
		String unslipNoSub = unslipNo.substring(0, 3);
		//01. 경비결의 998, 999 대변삭제
		//    카드결의 996, 997, 998, 999 대변삭제
		int unslipOdr = 998;
		int loop = 2;
		if("117".equals(unslipNoSub)){
			 unslipOdr = 995; // 995 보탬e카드 삭제, 996 통합이지바로카드 삭제, 997 미지급(연구비)카드 삭제 -- 신한, 998 미지급(연구비)카드 삭제 -- BC, 999 미지급(법인)카드 삭제
			 loop = 5;
		}
		
		for (int i = 0; i < loop; i++) {
			SlipBaseVo basVo = new SlipBaseVo();
			basVo.setUnslip_no(unslipNo);
			basVo.setUnslip_odr(unslipOdr);
			unslipOdr++;
			
			slipDao.deleteFspSlipD(basVo);
		}
		
		
		// 02. 대변생성을 위한 조회
		List<FspSlipDCrVo> crVoList = null;
		if("117".equals(unslipNoSub)){
			Map<String,String> map = new HashMap<>();
			map.put("unslip_no", unslipNo);
			map.put("card_no", cardNo);
			crVoList = slipDao.selectExpnsSlipCardCr(map);
		}else{ // 113 결의
			crVoList = slipDao.selectExpnsSlipDForCr(unslipNo);
		}
		
		if(crVoList == null || crVoList.size() == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0020");
		}
		
		// 03. 대변 계정책임자 조회
		ResBgAcctmVo accntVo = finComService.selectResBgAcctmChk("FF030001");
		
		int iCnt = crVoList.get(0).getCnt();
		String hRmk = crVoList.get(0).getRmk();
		
		FspSlipDVo slipDVo = null;
		for(FspSlipDCrVo crVo : crVoList){			
			slipDVo = new FspSlipDVo();
			slipDVo.setUnslip_no(crVo.getUnslip_no());
			slipDVo.setUnslip_odr(crVo.getUnslip_odr());
			slipDVo.setJourn_cd("Fn9920");
			slipDVo.setJourn_odr(crVo.getUnslip_odr());
			slipDVo.setBase_debit_cr("2");
			slipDVo.setAccnt_no("FF030001");
			slipDVo.setAccnt_rspns(accntVo.getAccnt_rspns());
			slipDVo.setFomat_unit(accntVo.getFomat_unit());
			slipDVo.setAccnt_cd(crVo.getAccnt_cd());
			slipDVo.setExpns_cd("999");
			slipDVo.setUnslip_amt(crVo.getUnslip_amt());
			slipDVo.setRmk_1(crVo.getRmk_1());
			slipDVo.setRmk_2(crVo.getRmk_2());
			slipDVo.setRamt_mngmt_1(crVo.getRamt_mngmt_1());
			
			if(slipDao.insertFspSlipD(slipDVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"경비결의 대변생성"});
			}
		}
		
		// 03-1. 대변생성금액 체크
		if("117".equals(unslipNoSub)){
			FinComAmtChkVo chkVo = slipDao.selectCrUnslipAmtChk(unslipNo);
			if(chkVo.getRamt_amt() != 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0031 ", new String[]{String.valueOf(chkVo.getDr_amt()), String.valueOf(chkVo.getCr_amt())});
			}
		}	
		
		// 04. 결의서 헤더 적요 수정
		FspSlipHVo hVo = new FspSlipHVo();
		hVo.setUnslip_no(unslipNo);
		
		if(iCnt > 1){
			hRmk = hRmk + "외 " + (iCnt - 1);
		}
		hVo.setRmk(hRmk);
		
		slipDao.updateFspSlipH(hVo);	
	}
	
	/**
    * 자동결의 결의서 헤더 저장(단건 신청번호일 경우)
    * @param String, FspSlipHVo
    * @return unslipNo
    * @author LeeYH
    */
	public String saveAutoSlipH(String reqNo, FspSlipHVo hVo) throws KitechException{
		return this.saveAutoSlipH(reqNo, null, hVo);
	}
	
	/**
    * 자동결의 결의서 헤더 저장(단건 또는 다건 신청번호일 경우)
    * @param String, List, FspSlipHVo
    * @return unslipNo
    * @author LeeYH
    * @since 2023.03.22.
    */
	public String saveAutoSlipH(String reqNo, List<ComReqVo> reqNoList, FspSlipHVo hVo) throws KitechException{
		// 신청번호로 해당 결의서가 있는지 체크
		AppLog.info("\n ------------------- reqNo=" + reqNo + ",reqNoList=" + reqNoList);
		if(!"".equals(reqNo) || (reqNoList != null && reqNoList.size()>0)){
			FinAutoSlipCrtVo crtVo = new FinAutoSlipCrtVo();
		
			if(!"".equals(reqNo)){
				crtVo.setReq_no(reqNo);
			}else if(reqNoList != null && reqNoList.size() > 0){
				crtVo.setReqNoList(reqNoList);
				reqNo = reqNoList.toString();
			}
			
			crtVo.setSlip_typ_cd(hVo.getSlip_typ_cd());
			
			crtVo = slipDao.selectDupSlipCrtCnt(crtVo);
			if(crtVo.getCnt() > 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0037", new String[]{reqNo, crtVo.getUnslip_no()}); 
			}		
		}
		
		hVo.setWrte_dept(KitechContextUtil.getDeptCd());
		hVo.setWrte_dept_new_ymd(KitechContextUtil.getSession().getDeptNewYmd());
		hVo.setWrte_psn(KitechContextUtil.getSyspayno());
		hVo.setCud_type("C");
		
		return this.saveSlipH(hVo);
	}
	
	/**
    * 자동결의 (디테일 다건 생성)
    * @param FinComSlipVo
    * @return unslipNo
    * @author LeeYH
    */
	public void saveAutoSlip(FinComSlipVo vo) throws KitechException{	
		// 결의서 관리항목
		List<FspSlipMngmtVo> mngmtVoList = vo.getMngmtList(); 			
		
		int result = 0;
		
		//===========================================
		// 02. 결의서 디테일 저장
		//===========================================
		FspSlipDVo dVo = vo.getSlipDVo();
		String unslipNoSub = dVo.getUnslip_no().substring(0, 3);
		
		// 잔액관리항목
		Map<String, String> ramtMap = slipDao.selectRamtMngmtItem(dVo.getAccnt_cd());
		if(ramtMap != null){
			if(mngmtVoList != null && mngmtVoList.size() > 0){
				for(FspSlipMngmtVo mngmtVo : mngmtVoList){
					// 잔액관리항목 1
					if(dVo.getUnslip_odr() == mngmtVo.getUnslip_odr() && ramtMap.get("mngmt_item_cd_1").equals(mngmtVo.getMngmt_item_cd())){
						// 관리항목
						if("Y".equals(mngmtVo.getEssen_ex()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_cd()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_nm())) {
							throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"관리항목[" + mngmtVo.getMngmt_item_nm() + "]"});
						}
						
						if(mngmtVo.getMngmt_detls_cd() == null || "".equals(mngmtVo.getMngmt_detls_cd())){
							dVo.setRamt_mngmt_1(mngmtVo.getMngmt_detls_nm());
						}else{
							dVo.setRamt_mngmt_1(mngmtVo.getMngmt_detls_cd());
						}
						
					// 잔액관리항목 2	
					}else if(dVo.getUnslip_odr() == mngmtVo.getUnslip_odr() && ramtMap.get("mngmt_item_cd_2").equals(mngmtVo.getMngmt_item_cd())){
						// 관리항목
						if("Y".equals(mngmtVo.getEssen_ex()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_cd()) && StringUtil.isEmpty(mngmtVo.getMngmt_detls_nm())) {
							throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"관리항목[" + mngmtVo.getMngmt_item_nm() + "]"});
						}
						
						if(mngmtVo.getMngmt_detls_cd() == null || "".equals(mngmtVo.getMngmt_detls_cd())){
							dVo.setRamt_mngmt_2(mngmtVo.getMngmt_detls_nm());
						}else{
							dVo.setRamt_mngmt_2(mngmtVo.getMngmt_detls_cd());
						}
					}
				}
			}
		} // 잔액관리항목 끝
		
		// 02. 결의서 디테일 저장		
		// 계정종료일자 체크 및 계정정보 조회
		ResBgAcctmVo acctmVo = new ResBgAcctmVo();
		String accntNo = dVo.getAccnt_no();
		if("1".equals(dVo.getBase_debit_cr())){
			if (!accntNo.equals("FF030001")) {	
				if(!"FF21".equals(accntNo.substring(0, 4))){
					 acctmVo = finComService.chkClsYmd(accntNo, vo.getSlip_ymd(), "");
					 String cardUseEx = acctmVo.getCard_use_ex();
					 dVo.setAccnt_no_clsf(cardUseEx);
					 dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
					 dVo.setFomat_unit(acctmVo.getFomat_unit());
					
					if (cardUseEx != null && cardUseEx.matches("FAJ004|FAJ005|FAJ006|FAJ008|FAJ009")) { // POINT, RCMS, e나라도움(신한(국고보조금)), 보탬e-예치, 보탬e-비예치 인 경우
						// rcms check
						this.checkRcmsInfo(dVo, cardUseEx);
					}
				}
			}			
		}
		
		// FF030001 이고 계정책임자가 없을 경우 계정책임자, 편성단위 조회
		if (accntNo.equals("FF030001") && (dVo.getAccnt_rspns() == null || "".equals(dVo.getAccnt_rspns()))){
			acctmVo = finComService.selectResBgAcctmChk(dVo.getAccnt_no());
			
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());
		}
		
		result = slipDao.insertFspSlipD(dVo);
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 디테일생성"});
		}	
		
		// 소액물품결의, 기술지원 카드수수료
		// 차변이고 계정번호가 FF030001이 아닐 경우 예산통제모듈 호출
		if(unslipNoSub.matches("119|216")){
			if("1".equals(dVo.getBase_debit_cr()) && !"FF030001".equals(dVo.getAccnt_no())){
				this.enfrcComBugt(dVo, vo.getSlipHVo());
			}
		}
			
		// 119(소액물품), 223(인수자산부가세) 결의, 173 연구비송금, 230,235 구매결의, 178 지재권 비용 결의, 216 기술지원카드수수료결의
		if(unslipNoSub.matches("119|223|173|178|230|235|216")){
			if("FAH500".equals(dVo.getEvid_cd())){ // 카드증빙일경우 카드정보 수정
				this.saveCardSlip(dVo);
			}else if(null != dVo.getBill_no() && StringUtils.isNotEmpty(dVo.getBill_no().trim())){ // 계산서 증빙
				this.updateKtxIssuMstr(dVo);
			}
		}
		
		//===========================================
		// 03. 결의서 관리항목 저장
		//===========================================
		if(mngmtVoList != null){
			for(FspSlipMngmtVo mngmtVo : mngmtVoList){				
				mngmtVo.setCud_type("C");
				this.saveSlipMngmt(mngmtVo);
			}
		}
		
		//===========================================
		// 04. 송금의뢰 저장
		//===========================================
		List<FspSendReqVo> sendList = vo.getSendList();
		if(sendList != null){
			for(FspSendReqVo sendVo : sendList){
				sendVo.setCud_type("C");
				this.saveFspSendReq(sendVo);
			}
		}
		
		//===========================================
		// 05. 잔액정산 저장 및 잔액생성 수정
		//===========================================
		FspRamtCreatVo ramtVo = vo.getRamtVo();
		if(ramtVo != null){
			depstService.saveRamtAdjstForDepst(ramtVo);
		}
	}
	
	/**
    * 결의번호로 결의서삭제(자동결의)
    * @param unslip_no
    * @author LeeYH
    * @since 2022.03.31.
    */
	public void deleteFspSlip(String unslipNo) throws KitechException{
		this.deleteFspSlip(unslipNo, "", false);
	}
	
	/**
    * 결의번호로 결의서삭제 및 계산서초기화, 예산통제모듈 삭제
    * @param unslip_no
	* @throws Exception
    * @author LeeYH
    * @since 2023.12.12.
    */
	public void deleteFspSlip(String unslipNo, String billNo, boolean ctrlYn) throws KitechException{
		Map<String, String> map = slipDao.selectFspSlipHDecsnEx(unslipNo);
				
		// 01. 결의확정여부에 따라 삭제 가능 체크
		if("Y".equals(map.get("decsn_ex"))){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0003", new String[]{"결의서가 확정되었으므로"});
		}		
		
		SlipBaseVo vo = new SlipBaseVo();
		vo.setUnslip_no(unslipNo);
		
		// 관리항목 삭제
		slipDao.deleteFspSlipMngmt(vo);
		
		// 송금내역 삭제
		slipDao.deleteFspSendReq(vo);
		
		// 결의서 디테일 삭제
		if(slipDao.deleteFspSlipD(vo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 디테일 삭제"});
		}
		
		// 결의서 헤더 삭제
		int result = slipDao.deleteFspSlipH(vo);
		if(result == 0 || result > 1){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"결의서 헤더 삭제"});
		}
		
		// 예산통제 모듈 삭제
		if(ctrlYn){
			DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
			enfrcVo.setReq_no(vo.getUnslip_no());		
			finComService.deleteBudEnfrcMnt(enfrcVo);
		}
		
		// 매입계산서 결의번호 초기화
		if(!"".equals(billNo)){
			slipDao.updateKixIssuMstrAutoDel(unslipNo);
		}
	}
	
	/**
    * 자동결의외에 수정된 건이 있는지 조사
    * @param unslip_no
    * @author LeeYH
    * @since 2022.07.02.
    */
	public void selectAutoSlipCnt(String unslipNo) throws KitechException{
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		if(slipDao.selectAutoSlipCnt(unslipNo) > 0){ 
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0032", new String[]{unslipNo});
		}
	}	
	
	/**
    * 결의서 디테일 카드정보 누락시 다시 조회
    * @param FspSlipDVo
    * @author LeeYH
    * @since 2022.12.02.
    */
	public CardInfoVo selectCardInfo(FspSlipDVo vo) throws KitechException{
		return slipDao.selectCardInfo(vo);
	}
	
	/**
    * 자동결의 삭제시 매입계산서 정보 또는 카드 정보 삭제
    * @param FspSlipDVo
    * @author LeeYH
    * @since 2022.12.02.
    */
	public void deleteCardOrBillInfo(FspSlipDVo vo) throws KitechException{
		if(vo.getCard_no() != null && !"".equals(vo.getCard_no().trim())){
			this.deleteCardSlipInfo(vo);
			
		}else if(vo.getBill_no() != null && !"".equals(vo.getBill_no().trim())){
			SlipBaseVo basVo = new SlipBaseVo();
			basVo.setUnslip_odr(vo.getUnslip_odr());
			basVo.setUnslip_amt(vo.getTotal_amt());
			basVo.setIssu_seqno(vo.getBill_no());		
				
			this.deleteKtxIssuMstrSlip(basVo);				
		}
	}	
}
