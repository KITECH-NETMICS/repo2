package kr.re.kitech.biz.fin.rcms.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.rcms.dao.FinRcmsPaySendDAO;
import kr.re.kitech.biz.fin.rcms.vo.BeaipaVo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo;
import kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo;
import kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo;

@Service("FinRcmsPaySendBizImpl")
public class FinRcmsPaySendBizImpl {
	Logger log = LoggerFactory.getLogger(FinRcmsPaySendBizImpl.class);

	@Resource(name = "FinRcmsPaySendDAO")
	private FinRcmsPaySendDAO rcmsDAO;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	private SaveBeitpaVo saveVo;
	
	public Map<String, Object> saveFinRcmsPaySend010(FinRcmsPaySendVo vo, List<FinRcmsPaySendVo> listVo){
		Map<String, Object> result = new HashMap<String, Object>();
	
		for (FinRcmsPaySendVo list: listVo) {
			
		}
		
		
		return result;
	}
	
	public Map<String, Object> saveFinRcmsPaySend020(FinRcmsPaySendVo vo, List<FinRcmsPaySendVo> listVo) throws Exception{
		log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
		log.debug("선집행 전송 시작 saveFinRcmsPaySend020");
		log.debug("vo : [{}], listVo : [{}]", vo, listVo);
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		String cardUeEx = vo.getCard_use_ex();
		String sendType = vo.getSend_type(); // S : 전송, E : 재전송
		String lnkRegDt = vo.getLnk_reg_dt(); // 연계 등록 일자
		
		String rcmsPayClsf = vo.getRcms_pay_clsf(); // FDC010 : 직지급, FDC020 : 선집행, FDC030 : 카드 선집행
		String erpSendNo = vo.getErp_send_no(); // RCMS 전송 번호
		String telNo = vo.getTel_no(); // rcms 담당자
		String empNm = vo.getEmp_nm();
		
		
		if ("S".equals(sendType)) {
			// 전송 번호
			if ("FAJ005".equals(cardUeEx)) { // rcms
				erpSendNo = genService.getGenNumber(Numberings.RCMS.getName(), "F60"); 
			} else { // point
				erpSendNo = genService.getGenNumber(Numberings.RCMS.getName(), "F62");
			}
		}
		
		// 1. 협약기관 사업자등록번호
		vo.setVend_cd("100000");
		FinRcmsPaySendVo retVo = rcmsDAO.selectSingleItem01(vo); // kitech.fin.fin.fnd.xda.FinRcmsPaySendSS04
		String bsnsPsnRegstNo = retVo.getBsns_psn_regst_no().replaceAll("-", "").trim();
		String reprsPsnNm = retVo.getReprs_psn_nm();
		
		// 2.깡통 계좌 정보(I-RND은행코드로 변환) : 연구비계좌은행코드
		// if_rnd_agin_l_a.rch_exp_acct_no : 연구비계좌번호(과제협약계좌 번호)
		if ("FAJ005".equals(cardUeEx)) { // rcms
			vo.setAccnt_no("PKM00000"); // 391-003560-04-473
		} else { // point
			vo.setAccnt_no("PSE00000"); // 391-003560-04-481
		}
		
		FinRcmsPaySendVo retVo02 = rcmsDAO.selectSingleItem02(vo); // kitech.fin.fin.fnd.xda.FinRcmsPaySendSS02
		String rchExpAcctBnkCd = retVo02.getBank();
		
		// 3. 입금은행 계좌 정보(공통코드 cd_clsf = 'FAA' , mngmt_item_5)
		// 선집행 : 391-003560-04-384(화면에 셋팅)
		// vo.setRcv_bank(rcv_bank);
		
		FinRcmsPaySendVo retVo03 = rcmsDAO.selectSingleItem03(vo); // kitech.fin.fin.fnd.xda.FinRcmsPaySendSS03
		String rcvBnkCd = retVo03.getBank();
		String rcvAcctNo = vo.getRcv_acct_no();
		String owacNm = vo.getOwac_nm();		
		String rcvBankNm = vo.getRcv_bank_nm();
		
		// 2. 전송 정보
		String[] beaiPaArr = { "172", "270", "116", "310", "171", "272", "118" }; // 사업비 부가정보 입력가능 결의
		// 사업비비목연구시설장비내역
		String[] expnsArr = { "141", "241", "148" }; // 비용코드 배열
		String[] slipArr = { "110", "113", "117", "119", "115" }; // 결의서 타입
		String[] accntArr = { "51120030", "51120031", "51120070", "51120090", "51125030", "51125031", "51127070", "51125090" };
		

		for (FinRcmsPaySendVo list: listVo) {
		
			log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
			log.debug("선집행 전송 반복문 시작 ");
			log.debug("listVo : [{}]", list);
			
			String instSbjtNo = list.getInst_sbjt_no(); // 기관과제번호
			long transAmt = Long.parseLong(list.getTrans_amt());			
			
			if (StringUtils.isEmpty(instSbjtNo)) {
				throw new IllegalArgumentException("계정번호 " + list.getAccnt_no() + "에 대한 RCMS기관과제번호가 존재하지 않습니다.");
			}
			
			String slipNoOdr = list.getSlip_no_odr();
			String slipNo = slipNoOdr.substring(0, slipNoOdr.indexOf("-"));
			int slipOdr = Integer.parseInt(slipNoOdr.substring(slipNoOdr.indexOf("-") + 1));
			
			if (transAmt > 0) {
				
				list.setSlip_no(slipNo);
				list.setSlip_no_odr_int(slipOdr);
				
				// 계정대체결의확정여부 확인
				FinRcmsPaySendVo retVo04 = rcmsDAO.selectSingleItem04(list); // kitech.fin.fin.fnd.xda.if_rnd_beex_l_aSS01
				if (retVo04.getCnt() > 0) {
					throw new IllegalArgumentException("확정결의번호[" + slipNoOdr + "]은 계정대체결의가 확정되지 않았습니다.");
				}
				
				if ("".equals(retVo04.getTrans_unslip_no())) {
				
					list.setTrans_amt_long(transAmt);
					list.setUpdt_syspayno("rcmssend");
					
					result.put("count", rcmsDAO.updateSingleItem01(list));  // kitech.fin.fin.spa.xda.FspSlipDecsndSU01					
				}
			}
			
			// 사업비집행원장 셋팅
			list.setLnk_reg_dt(lnkRegDt);	
			list.setBz_exp_exctn_proc_st("0"); // 사업비집행처리상태					
			list.setRch_exp_acct_bnk_cd(rchExpAcctBnkCd); // 연구비계좌은행코드			
			list.setRcv_bnk_cd(rcvBnkCd); // 입금은행
			list.setRcv_bnk_nm(rcvBankNm);
			list.setRcv_acct_no(rcvAcctNo);
			
			// 지급용도
			String paymUsag = list.getPaym_usag();
			paymUsag = paymUsag.replaceAll("['`\"]", "");			
			list.setPaym_usag(paymUsag); // 거래처계좌 예금주명			
			list.setOwac_nm(owacNm); // 거래처계좌 예금주명
			
			if ("FAJ005".equals(cardUeEx)) {
				list.setRch_exp_acct_rcv_psbk_prt_ctt(slipNoOdr); // 연구비계좌입금통장인쇄내용
				list.setRch_exp_acct_wdrw_psbk_prt_ctt(slipNoOdr); // 연구비계좌출금통장인쇄내용004
			} else {
				if (slipNoOdr.length() > 9) {
					slipNoOdr = slipNoOdr.substring(0, 8);
				}
				list.setRch_exp_acct_rcv_psbk_prt_ctt(slipNoOdr); // 연구비계좌입금통장인쇄내용
				list.setRch_exp_acct_wdrw_psbk_prt_ctt(slipNoOdr); // 연구비계좌출금통장인쇄내용004
			}
			
			log.debug("erpSendNo : [{}]", erpSendNo);
			if(erpSendNo.length() < 12) erpSendNo = list.getErp_send_no();
			list.setBzaq_acct_rcv_psbk_prt_ctt(erpSendNo.substring(5, 12)); // 거래처계좌입금통장인쇄내용
			long trnsAmt = Long.parseLong(list.getUnslip_amt()) - transAmt;
			
			list.setTrns_amt_long(trnsAmt);
			list.setSply_amt(trnsAmt);
			list.setVat_amt(0);
			list.setSrv_amt(0); // 봉사료
			list.setComm(0); // 수수료
			list.setTel_no(telNo); // RCMS관리자 연락처
			
			// 자계좌이체사유 및 기타증빙사유코드
			// - 카드결의 117이면서 선집행일때는 기타증빙사유코드를 6(기타전자증빙)으로..
			// - 자계좌이체사유를 협약전사용금액으로 20151209 구본준요청
			String billNo = list.getBill_no().trim();
			// 자계좌이체사유 및 기타증빙사유코드
			String evidCd = list.getEvid_cd().trim();
			String reqNo = list.getReq_no();
			String lnkRegSeq = list.getLnk_reg_seq();
			String unslipNo = lnkRegSeq.substring(0, 10);
			int unslipOdr = Integer.parseInt(lnkRegSeq.substring(10));
			String cropUnslipNo = unslipNo.substring(0, 3);
			
			//2017.08.25. 자계좌이체사유가 없을 경우에만 셋팅 하도록 수정
			if ("".equals(list.getFrc_trsc_yn().trim())) {
				if ("FAH500".equals(evidCd)) {
					list.setFrc_trsc_yn("6"); // 협약전사용금액					
				} else if ("FAH999".equals(evidCd)) {
					if (!"".equals(billNo)) {
						list.setFrc_trsc_yn("3");
					}
				}

				if ("".equals(list.getRcms_pay_clsf())) {				
					list.setFrc_trsc_yn("6"); // 협약전 사용금액
				}

				if ("230".equals(cropUnslipNo) && "P74".equals(reqNo.substring(0, 3))) { // 외자구매
					list.setFrc_trsc_yn("2"); // 외자구매
				}

				if ("115".equals(cropUnslipNo) && Arrays.asList(accntArr).contains(list.getAccnt_cd())) {
					list.setFrc_trsc_yn("6"); // 협약전 사용금액
				}
			}
			
			String etcEvdcRsnCd = "";
			if ("".equals(list.getEtc_evdc_rsn_cd().trim())) {
				if ("FAH500".equals(evidCd)) {
					list.setEtc_evdc_rsn_cd("6"); // 기타전자증빙
				} else if ("FAH999".equals(evidCd)) {
					list.setEtc_evdc_rsn_cd("7");
				} else {
					// 기타증빙사유코드
					if (!"".equals(evidCd)) {
						list.setCd(evidCd);						
						String reqNoSub = reqNo;
						if(reqNo != ""){
							reqNoSub = reqNo.substring(0, 3);
						}
						list.setReq_type(reqNoSub);						
						FinRcmsPaySendVo retVo05 = rcmsDAO.selectSingleItem05(list); // kitech.fin.fin.fnd.xda.FinRcmsPaySendSS05
						etcEvdcRsnCd = retVo05.getEtc_evdc_rsn_cd();						
						if ("210".equals(cropUnslipNo)) { // 내부시험분석의뢰
							list.setEtc_evdc_rsn_cd("5"); // 기타증빙사유코드(내부시험분석의뢰)
						} else {
							list.setEtc_evdc_rsn_cd(etcEvdcRsnCd);
						}
					}
				}
			}

			list.setRcms_dctc_reg_yn("N"); // RCMS직접등록여부
			list.setEvdc_dv("E");
			if ("FAH500".equals(evidCd)) {
				list.setElec_evdc_dv("C");
			}
			list.setLnk_dv("R"); // 연계구분
			list.setAgrmt_inst_bz_reg_no(bsnsPsnRegstNo); // 협약기관사업자등록번호
			
			// 공급자정보(기타증빙일 경우 입력)
			if ("FAH500".equals(evidCd)) {// 카드지급
				list.setUnslip_no(unslipNo);
				list.setUnslip_seq(unslipOdr);
				
				FinRcmsPaySendVo retVo06 = rcmsDAO.selectSingleItem06(list); // kitech.fin.fin.fnd.xda.CardUseInfoSS01

				if (retVo06 != null) {
					list.setSplr_bz_reg_no(retVo06.getSplr_bz_reg_no()); // 공급자 사업자 등록 번호
					list.setSplr_repr_nm(retVo06.getSplr_repr_nm()); // 공급자 대표명
					list.setSplr_co_nm(retVo06.getSplr_co_nm()); // 공급자 회사명
					list.setSplr_tpbz_nm(retVo06.getSplr_tpbz_nm()); // 공급자 업종명
					list.setSplr_tpop_nm("기타"); // 공급자 업태명
					list.setSplr_adr(retVo06.getSplr_adr()); // 공급자 주소
					list.setElec_evdc_no(retVo06.getApprno()); // 전자증빙번호				
					list.setWrtg_dt(retVo06.getRectime()); // 작성일자
				} else {
					if ("".equals(list.getSplr_bz_reg_no().trim())) {
						list.setSplr_bz_reg_no("0000000000"); // 공급자 사업자 등록 번호
					}
					list.setSplr_repr_nm("기타"); // 공급자 대표명
					list.setSplr_co_nm(list.getRmk_2()); // 공급자 회사명
					list.setSplr_tpbz_nm("기타"); // 공급자 업종명
					list.setSplr_tpop_nm("기타"); // 공급자 업태명
					list.setSplr_adr("기타"); // 공급자 주소
					list.setElec_evdc_no(""); // 전자증빙번호				
					list.setWrtg_dt(""); // 작성일자
				}
			} else { // 카드지급외
			
				if (!"".equals(billNo)) {
					list.setIssu_seqno(billNo);
					KtxIssuMstrVo retVo07 = rcmsDAO.selectSingleItem07(list); // kitech.fin.fin.fnd.xda.Ktx_Issu_MstrSS02
					list.setDtls_ncnt(Integer.parseInt(retVo07.getBill_cnt())); // 상세 건수

					String selrCorpNo = retVo07.getSelr_corp_no();

					if ("0000000000".equals(selrCorpNo)) {
						if (!"".equals(list.getSplr_bz_reg_no().trim())) {
							selrCorpNo = list.getSplr_bz_reg_no();
						}
					}
 
					list.setSplr_bz_reg_no(selrCorpNo); // 공급자 사업자 등록 번호
					list.setSplr_co_nm(retVo07.getSelr_corp_nm()); // 공급자 회사명
					list.setSplr_repr_nm(retVo07.getSelr_ceo()); // 공급자 대표명
					list.setSplr_tpbz_nm(retVo07.getSelr_buss_cons()); // 공급자 업종명
					list.setSplr_tpop_nm(retVo07.getSelr_buss_type()); // 공급자 업태명
					list.setSplr_adr(retVo07.getSelr_addr()); // 공급자 주소
					
					// 기타증빙사유가 면세사업자전자계산서(2) 또는 세금계산서(개인사업자)(3)인 경우 작성일자 필수
					list.setWrtg_dt(retVo07.getRegs_date());

					// 2017.09.01. 협약전사용금액은 직지급을 선집행으로 처리- 전자세금계산서일경우 기타증빙사유코드 ,전자증빙구분, 전자증빙번호입력
					if (billNo.length() > 15) {
						list.setElec_evdc_dv("C");
						list.setElec_evdc_no(billNo); // 전자증빙번호
					}

				} else {
					if ("310".equals(cropUnslipNo) || "270".equals(cropUnslipNo) || "272".equals(cropUnslipNo)) {
						list.setDtls_ncnt(0); // 상세 건수
						list.setSplr_bz_reg_no(bsnsPsnRegstNo); // 공급자 사업자 등록 번호
						list.setSplr_co_nm("한국생산기술연구원"); // 공급자 회사명
						list.setSplr_tpbz_nm(list.getRmk_2()); // 공급자 업종명
						list.setSplr_tpop_nm("기타"); // 공급자 업태명
						list.setSplr_repr_nm(reprsPsnNm); // 공급자 대표명
						list.setSplr_adr("기차"); // 공급자 주소
					} else {
						list.setDtls_ncnt(0); // 상세 건수
						if ("".equals(list.getSplr_bz_reg_no().trim())) {
							list.setSplr_bz_reg_no("0000000000"); // 공급자 사업자 등록 번호
						}
						list.setSplr_co_nm(list.getRmk_2()); // 공급자 회사명
						list.setSplr_tpbz_nm(list.getRmk_2()); // 공급자 업종명
						list.setSplr_tpop_nm("기타"); // 공급자 업태명
						list.setSplr_repr_nm("기타"); // 공급자 대표명
						list.setSplr_adr("기타"); // 공급자 주소
					}
				}
			}
			list.setSplr_prsn_yn("N"); // 개인거래여부
			
			if ("0000000000".equals(list.getSplr_bz_reg_no())) {
				
				list.setUnslip_no(unslipNo);
				list.setUnslip_odr_int(unslipOdr);
				
				FinRcmsPaySendVo retVo08 = rcmsDAO.selectSingleItem08(list); // kitech.fin.fin.fnd.xda.FspSlipdSS01
				
				if (retVo08 != null && "FAX010".equals(retVo08.getPay_clsf())) {
					list.setSplr_prsn_yn("Y");
				}
			}
			list.setErp_cd_1(unslipNo); // 해당 결의서 번호
			list.setErp_cd_2(String.valueOf(unslipOdr)); // 해당 결의서 순번
			list.setErp_cd_3(list.getAccnt_no()); // 해당 결의서 계정 번호
			list.setErp_cd_4(list.getSlip_no_odr()); // 확정결의번호
			list.setErp_send_no(erpSendNo); // 전송 번호
			list.setErp_send_nm(empNm); // 전송자 전송담당자 성명
			list.setLnk_st("A"); // 연계상태

			if ("S".equals(sendType)) {
				list.setRprcs_ncnt(0); // 재처리횟수
				result.put("count", rcmsDAO.mergeItem01(list)); // kitech.fin.fin.fnd.xda.if_rnd_beex_l_aSI01
			} else {
				list.setRprcs_ncnt(1); // 재처리횟수
				result.put("count", rcmsDAO.updateSingleItem02(list)); // kitech.fin.fin.fnd.xda.if_rnd_beex_l_aSU01
			}
			
			// 02. 사업비비목내역 저장(if_rnd_beit_p_a)
			result.put("count", saveBeit_p_a(list, sendType, rcmsPayClsf));
			
			//03. 사업비비목부가정보내역 저장(if_rnd_beai_p_a) 172 연구수당, 270 인건비 배부결의, 610 원인행위미지급금 결의(51120180 연구수당) 310 연구비집행결의, 171 아르바이트 비용신청결의, 272 학생인건비 결의
			// 2018.07.12 RCMS 사업비비목부가정보내역 저장(if_rnd_beai_p_a) 대상 변경
			// 연구수당(B0203001), 내부인건비(B0101001, B0204002), 외부인건비(B0102001, B0204003), 학생인건비(B0205001)
			
			List<FinRcmsPaySendVo> retList = rcmsDAO.selectListBeitpaMs(list); // kitech.fin.fin.rcms.xda.if_rnd_beit_p_aMS01

			if (retList.size() != 0) {
				for (FinRcmsPaySendVo beitList: retList) {
				
					if ("G".equals(beitList.getPms_flag())) {
						if ("B0101001".equals(beitList.getItxp_cd()) || "B0102001".equals(beitList.getItxp_cd())
								|| "B0203001".equals(beitList.getItxp_cd()) || "B0204002".equals(beitList.getItxp_cd())
								|| "B0204003".equals(beitList.getItxp_cd()) || "B0205001".equals(beitList.getItxp_cd())
								|| "B0204501".equals(beitList.getItxp_cd())) {
							list.setItxp_reg_seq(beitList.getItxp_reg_seq());
							result.put("count", saveBeai_p_a(list, sendType));
						}
					} else if (Arrays.asList(beaiPaArr).contains(beitList.getUnslip_type())
							|| ("610".equals(beitList.getUnslip_type()) && "51120180".equals( beitList.getAccnt_cd() ))) {
						list.setItxp_reg_seq(beitList.getItxp_reg_seq());
						result.put("count", saveBeai_p_a(list, sendType));
					}
					
				}
			}
			 // 04. 사업비비목연구시설장비내역 저장(if_rnd_biet_p_a)
			String expnsCd = list.getExpns_cd();			
			String accntCd = list.getAccnt_cd();
						
			
			/*
			List<String> accntList = Arrays.asList(accntArr);

			boolean accntContains = false;
			for(String accnt : accntList) {
			  if(accnt.equals(accntCd)) {
			    accntContains = true;
			    break;
			  }
			}
			
			if ((("230".equals(cropUnslipNo) || "235".equals(cropUnslipNo)) && Arrays.asList(expnsArr).contains(expnsCd))
			     || (Arrays.asList(slipArr).contains(cropUnslipNo) && accntContains)) {
			  result.put("count", saveBiet_p_a(list, sendType));
			}*/
			
			if ((("230".equals(cropUnslipNo) || "235".equals(cropUnslipNo)) && Arrays.asList(expnsArr).contains(expnsCd))
					|| (Arrays.asList(slipArr).contains(cropUnslipNo) && Arrays.asList(accntArr).contains(accntCd))) {
				result.put("count", saveBiet_p_a(list, sendType));
			}
		}
		
		result.put("erp_send_no", erpSendNo);
		return result;
	}
	
	
	public Map<String, Object> saveFinRcmsPaySend030(FinRcmsPaySendVo vo, List<FinRcmsPaySendVo> listVo){
		Map<String, Object> result = new HashMap<String, Object>();
		
		for (FinRcmsPaySendVo list: listVo) {
			
		}
		
		return result;
	}
	
	public int saveBeit_p_a(FinRcmsPaySendVo list, String sendType, String rcmsPayClsf) throws Exception {
	
		log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
		log.debug("선집행 전송  saveBeit_p_a");
		log.debug("sendType : [{}] list : [{}]", sendType, list);
		log.debug("rcmsPayClsf : [{}]", rcmsPayClsf);
	
		int result = 0;
		
		saveVo = new SaveBeitpaVo();
		
		log.debug("list Lnk_reg_dt : [{}]", list.getLnk_reg_dt());
				
		saveVo.setLnk_reg_dt(list.getLnk_reg_dt());
		saveVo.setLnk_reg_seq(list.getLnk_reg_seq());
		saveVo.setCash_spot_dv("0"); // 현금현물구분
		saveVo.setUse_dt(list.getAccnt_ymd()); // 사용일자
		String unslipNo = list.getErp_cd_1();		
		String cropUnslipNo = unslipNo.substring(0, 3);
		saveVo.setVat_amt(list.getVat_amt()); // 부가가치세액
		saveVo.setSrv_amt(0); // 봉사료
		saveVo.setComm(0); // 수수료
		saveVo.setQnt(1); // 수량
		saveVo.setNrm("기타");

		saveVo.setAcco_cd_1(list.getAccnt_cd()); // 회계코드1
		saveVo.setAcco_cd_2(list.getExpns_cd()); // 회계코드2
		saveVo.setLnk_st("A");
		saveVo.setErp_cd_1(unslipNo);
		
		// 20141110 중기청 방침 - 비목내역 mitm, rmk값 10자이상 50자미만으로 전송되도록 적용
		// 127 국내출장정산 결의, 132 해외출장정산 결의, 165 가지급금(전도금)정산 결의, 272 급여 결의
		if ("127".equals(cropUnslipNo) || "132".equals(cropUnslipNo) || "155".equals(cropUnslipNo) || "165".equals(cropUnslipNo) || "270".equals(cropUnslipNo)
				|| "272".equals(cropUnslipNo) || "310".equals(cropUnslipNo)) {
			saveVo.setMitm(list.getPaym_usag()); // 품목
			saveVo.setRmk(list.getPaym_usag()); // 비고(지급용도)
		} else {
			saveVo.setMitm(list.getPaym_usag() + " / " + list.getRmk_2()); // 적요 / 거래처
			saveVo.setRmk(list.getPaym_usag() + " / " + list.getRmk_2()); // 적요 / 거래처
		}
		
		
		// 카드선집행시 1개의 증빙에 대하여 분할비목으로 처리
		// unslip_odr
		if (list.getUnslip_odr_list() == null) {
		    list.setUnslip_odr_list("");
		}
		String strUnslipOdr = list.getUnslip_odr_list();
		String[] arrUnslipOdr = strUnslipOdr.split(",");
		int arrLen = arrUnslipOdr.length;
		
		Map<String, Object> paramMap = new HashMap<String, Object>();

		if ("FDC030".equals(rcmsPayClsf)) {
			paramMap.put("unslip_no", unslipNo);
			for (int i = 0; i < arrLen; i++) {
				saveVo.setItxp_reg_seq((i + 1));
				paramMap.put("unslip_odr", Integer.parseInt(arrUnslipOdr[i]));
				// 사용금액구분코드 추가 01:본예산, 02:이월금, 03:본예산+이월금 (계좌번호 마지막이 Z로 끝나는경우 이월금)
				FinRcmsPaySendVo retVo09 = rcmsDAO.selectSingleItem09(paramMap); // kitech.fin.fin.fnd.xda.FspSlipdSS02
				saveVo.setUse_amt_se_cd(retVo09.getUse_amt_se_cd());

				if (arrLen == 1) {
					saveVo.setUse_amt(list.getTrns_amt_long());
					saveVo.setSply_amt(list.getSply_amt()); // 공급금액
					saveVo.setUprc(list.getSply_amt()); // 단가
				} else {
					// 사용금액 조회
					FinRcmsPaySendVo retVo10 = rcmsDAO.selectSingleItem10(paramMap); // kitech.fin.fin.fnd.xda.FspSlipdSS01
					saveVo.setUse_amt(Long.parseLong(retVo10.getUse_amt())); // 사용금액
					saveVo.setSply_amt(Long.parseLong(retVo10.getUse_amt())); // 공급금액
					saveVo.setUprc(Long.parseLong(retVo10.getUse_amt())); // 단가
				}
				saveVo.setErp_cd_2(arrUnslipOdr[i]);

				// 비목코드 조회
				paramMap.put("agrmt_seq_no", list.getInst_sbjt_no());
				FinRcmsPaySendVo retVo11 = rcmsDAO.selectSingleItem11(paramMap); // kitech.fin.fin.rcms.xda.FrcmsItmSS01
				if ("".equals(retVo11.getItxp_cd())) {
					throw new Exception("결의번호[" + unslipNo + "/" + arrUnslipOdr[i] + "]에 대하여 연계비목코드가 존재하지 않습니다. 확인바랍니다.");
				}
				saveVo.setItxp_cd(retVo11.getItxp_cd());

				if ("S".equals(sendType)) {
					result = rcmsDAO.mergeItem02(saveVo); // kitech.fin.fin.fnd.xda.if_rnd_beit_p_aSI01

					// fspslipd 수정
					paramMap.clear();
					paramMap.put("rcms_rmk", list.getErp_send_no());
					paramMap.put("updt_syspayno", "rcmssend");
					paramMap.put("unslip_no", unslipNo);
					paramMap.put("unslip_odr", Integer.parseInt(arrUnslipOdr[i]));
					result = rcmsDAO.updateSingleItem03(paramMap); // kitech.fin.fin.fnd.xda.FspSlipdSU01
				} else {
					result = rcmsDAO.updateSingleItem04(saveVo); // kitech.fin.fin.fnd.xda.if_rnd_beit_p_aSU01
				}
			}
		} else {
			saveVo.setItxp_reg_seq(1); // 비목등록순번
			saveVo.setItxp_cd(list.getItxp_cd()); // 비목코드
			saveVo.setUse_amt(list.getTrns_amt_long()); // 사용금액
			saveVo.setSply_amt(list.getSply_amt()); // 공급금액
			saveVo.setUprc(list.getSply_amt()); // 단가
			saveVo.setErp_cd_2(list.getErp_cd_2());

			paramMap.put("unslip_no", unslipNo);
			paramMap.put("unslip_odr", Integer.parseInt(list.getErp_cd_2()));
			// 사용금액구분코드 추가 01:본예산, 02:이월금, 03:본예산+이월금 (계좌번호 마지막이 Z로 끝나는경우 이월금)
			FinRcmsPaySendVo retVo12 = rcmsDAO.selectSingleItem09(paramMap); // kitech.fin.fin.fnd.xda.FspSlipdSS02
			saveVo.setUse_amt_se_cd(retVo12.getUse_amt_se_cd()); // 02
			if ("S".equals(sendType)) {
				result = rcmsDAO.mergeItem02(saveVo); // kitech.fin.fin.fnd.xda.if_rnd_beit_p_aSI01

				// fspslipd 수정
				paramMap.clear();
				paramMap.put("rcms_rmk", list.getErp_send_no());
				paramMap.put("updt_syspayno", "rcmssend");
				paramMap.put("unslip_no", unslipNo);
				paramMap.put("unslip_odr", Integer.parseInt(list.getErp_cd_2()));
				result = rcmsDAO.updateSingleItem03(paramMap); // kitech.fin.fin.fnd.xda.FspSlipdSU01
			} else {
				result = rcmsDAO.updateSingleItem04(saveVo); // kitech.fin.fin.fnd.xda.if_rnd_beit_p_aSU01
			}
		}
		return result;
	}
	
	
	public int saveBeai_p_a(FinRcmsPaySendVo list, String sendType) throws Exception {
	
		log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
		log.debug("선집행 전송  saveBeai_p_a");
		log.debug("sendType : [{}] list : [{}]", sendType, list);
		
		int result = 0;

		String lnkRegDt = list.getLnk_reg_dt();
		String lnkRegSeq = list.getLnk_reg_seq();
		int itxpReqSeq = Integer.parseInt(list.getItxp_reg_seq());
		String unslipNo = list.getErp_cd_1();			
		String pmsId = list.getPms_id();
		int unslipOdr = Integer.parseInt(list.getErp_cd_2());
		String cropUnslipNo = unslipNo.substring(0, 3);

		// 조회조건 setting
		Map<String, Object> paramMap = new HashMap<String, Object>();			
		paramMap.put("unslip_no", unslipNo);
		paramMap.put("unslip_odr", unslipOdr);
		
		if ("S".equals(sendType)) {
			// 연구수당결의
			if ("172".equals(cropUnslipNo)) {
				// resbgallow 테이블조회하여 연구원정보가지고 온다.
				List<BeaipaVo> retList = rcmsDAO.selectListBeaipaMs(paramMap); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aMS01

				// 사업비비목부가정보내역 등록
				if (retList.size() != 0) {
					int idx = 0;
					for (BeaipaVo saveDoc: retList) {
						
						saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
						saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
						saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번

						// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
						// 2017.10.30 중소기업청 추가
						if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
							String residNo = saveDoc.getRes_reg_no();
							saveDoc.setRes_reg_no(residNo.substring(0, 6));
						}
						saveDoc.setAdtn_info_reg_seq(idx + 1);  // 부가정보등록순번
						saveDoc.setCash_spot_dv("0"); // 현금현물구분
						saveDoc.setLnk_st("A"); // 연계상태

						result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
						idx++;
					}
				}

			// 인건비 배부결의
			} else if ("270".equals(cropUnslipNo)) {
				// fsapsnexpnsdistr(인건비배부)테이블조회하여 연구원정보가지고 온다.
				paramMap.put("expns_cd", list.getExpns_cd());
				List<BeaipaVo> retList = rcmsDAO.selectListBeaipaMs02(paramMap); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aMS02

				// 사업비비목부가정보내역 등록
				if (retList.size() != 0) {
					int idx = 0;
					for (BeaipaVo saveDoc: retList) {
						saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
						saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
						saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
						saveDoc.setAdtn_info_reg_seq(idx + 1); // 부가정보등록순번

						// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
						// 2017.10.30 중소기업청 추가
						if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
							String residNo = saveDoc.getRes_reg_no();								
							saveDoc.setRes_reg_no(residNo.substring(0, 6));
						}

						saveDoc.setCash_spot_dv("0"); // 현금현물구분
						saveDoc.setLnk_st("A"); // 연계상태

						result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
						idx++;
					}						
				}
				
			// 원인행위미지급금 결의(연구수당), 연구수당반납결의(182) 추가
			} else if (("610".equals(cropUnslipNo) || "182".equals(cropUnslipNo)) && "51120180".equals(list.getAccnt_cd())) {
				String startAccntYmd = list.getLnk_reg_dt();
				startAccntYmd = startAccntYmd.substring(0, 4) + "0101";

				paramMap.put("accnt_no", list.getAccnt_no());
				paramMap.put("startYmd", startAccntYmd);
				paramMap.put("endYmd", list.getLnk_reg_dt());

				// fsapsnexpnsdistr(인건비배부)테이블조회하여 연구원정보가지고 온다.
				List<BeaipaVo> retList = rcmsDAO.selectListBeaipaMs04(paramMap); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aMS04
				
				// 사업비비목부가정보내역 등록
				if (retList.size() != 0) {
					int idx = 0;
					for (BeaipaVo saveDoc: retList) {
						saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
						saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
						saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
						saveDoc.setAdtn_info_reg_seq(idx + 1); // 부가정보등록순번

						// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
						// 2017.10.30 중소기업청 추가
						if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
							String residNo = saveDoc.getRes_reg_no();
							saveDoc.setRes_reg_no(residNo.substring(0, 6));
						}
						saveDoc.setCash_spot_dv("0"); // 현금현물구분
						saveDoc.setLnk_st("A"); // 연계상태

						result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
						idx++;
					}
				}

			// 인건비 계정대체결의
			} else if ("116".equals(cropUnslipNo)) {
				// fsapsnexpnsdistrsub(인건비배부)테이블조회하여 연구원정보가지고 온다.
				List<BeaipaVo> retList = rcmsDAO.selectListBeaipaMs03(paramMap); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aMS03
				
				if (retList.size() != 0) {
					int idx = 0;
					for (BeaipaVo saveDoc: retList) {
						saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
						saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
						saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
						saveDoc.setAdtn_info_reg_seq(idx + 1); // 부가정보등록순번
						// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
						// 2017.10.30 중소기업청 추가
						if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
							String residNo = saveDoc.getRes_reg_no();
							saveDoc.setRes_reg_no(residNo.substring(0, 6));
						}
						saveDoc.setCash_spot_dv("0"); // 현금현물구분
						saveDoc.setLnk_st("A"); // 연계상태

						result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
					}
				}					
			// 2012.03.14 추가 연구비집행결의(resbglcost에서 data 가져옴-내부인건비1만 가져옴)
			} else if ("310".equals(cropUnslipNo)) {
				// 조회조건 setting
				paramMap.put("accnt_no", list.getAccnt_no());
				paramMap.put("accnt_ymd", list.getAccnt_ymd());
				
				FinRcmsPaySendVo retVo12 = rcmsDAO.selectSingleItem12(paramMap); // kitech.fin.fin.fnd.xda.FsaAbsrpSS01
				
				String absrpClsf = "";
				if (retVo12 != null) {
					absrpClsf = retVo12.getAbsrp_clsf();
				}
				// 학생인건비를 흡수한 경우 부가정보를 입력하지 않음, 대신 272결의에서 부가정보입력
				if ("FBK035".equals(absrpClsf)) {
					// 2017.08.23. 서울통상산업진흥원, 한국해양과학기술진흥원 부가정보 조회해서 입력
					if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) { // 서울통상산업진흥원, 한국해양과학기술진흥원, 중소기업청
						List<BeaipaVo> retList = rcmsDAO.selectListResInpPareMS01(paramMap); // kitech.fin.fin.rcms.xda.ResInpPareMS01

						// ArrayList<Document> rstLst = XMLUtil.toArrayList(result);

						int trnsAmt = (int) list.getTrns_amt_long();
						int arrSize = retList.size();
						int paymAmtSum = 0;
						int payAmt = (int) Math.floor(trnsAmt / arrSize);
						
						if (retList.size() != 0) {
							int idx = 0;
							for (BeaipaVo saveDoc: retList) {
								saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
								saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
								saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
								saveDoc.setAdtn_info_reg_seq(idx + 1); // 부가정보등록순번
								// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
								// 2017.10.30 중소기업청 추가
								saveDoc.setRes_reg_no(saveDoc.getRes_reg_no().substring(0, 6));
									saveDoc.setCash_spot_dv("0"); // 현금현물구분
								if (idx == arrSize - 1) {
									payAmt = trnsAmt - paymAmtSum;
								}
								saveDoc.setPaym_amt(payAmt);
								paymAmtSum += payAmt;
								saveDoc.setLnk_st("A"); // 연계상태

								result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
							}
						}
						
						int idx = 0;
						for (BeaipaVo saveDoc: retList) {
							saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
							saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
							saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
							saveDoc.setAdtn_info_reg_seq(idx + 1); // 부가정보등록순번
							// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
							// 2017.10.30 중소기업청 추가
							saveDoc.setRes_reg_no(saveDoc.getRes_reg_no().substring(0, 6));
							saveDoc.setCash_spot_dv("0"); // 현금현물구분
							if (idx == arrSize - 1) {
									payAmt = trnsAmt - paymAmtSum;
							}
							saveDoc.setPaym_amt(payAmt);
							paymAmtSum += payAmt;
							saveDoc.setLnk_st("A"); // 연계상태

							result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
						}
						
					} else {
						/*
						 * RCMS 개편후 학생인건비 전송일경우 생성안함 2019.05.24 박병목 /* // 310결의일때 참여자 시작일과 종료일 정보 안넣어준 문제 수정 // 20151208 String startYmd = ""; if
						 * ("A".equals(unslipNo.substring(5, 6))) { startYmd = "20" + unslipNo.substring(3, 5) + "1001"; } else if ("B".equals(unslipNo.substring(5, 6))) {
						 * startYmd = "20" + unslipNo.substring(3, 5) + "1101"; } else if ("C".equals(unslipNo.substring(5, 6))) { startYmd = "20" + unslipNo.substring(3, 5) +
						 * "1201"; } else { startYmd = "20" + unslipNo.substring(3, 5) + "0" + unslipNo.substring(5, 6) + "01"; }
						 * 
						 * // for문마다 조회쿼리를 돌리지 않기 위하여 날짜가 같을때는 변수에 담아서 저장 if (!startDateTmp.equals(startYmd)) { Document lastDayDoc = XMLUtil.parse("<mdata/>");
						 * XMLUtil.setString(lastDayDoc, "slipday", startYmd);
						 * 
						 * result = xda.execute("kitech.fin.fin.fnd.xda.DualRcmsDateSS01", lastDayDoc); lastDate = XMLUtil.getString(result, "sliplastday"); } saveDoc =
						 * XMLUtil.parse("<mdata/>"); XMLUtil.setString(saveDoc, "ptcn_str_dt", startYmd); XMLUtil.setString(saveDoc, "ptcn_end_dt", lastDate);
						 * 
						 * XMLUtil.setString(saveDoc, "lnk_reg_dt", lnkRegDt); // 연계등록일자 XMLUtil.setString(saveDoc, "lnk_reg_seq", lnkRegSeq); // 연계등록순번 XMLUtil.setInt(saveDoc,
						 * "itxp_reg_seq", itxpReqSeq); // 비목등록순번 XMLUtil.setInt(saveDoc, "adtn_info_reg_seq", 1); // 부가정보등록순번 XMLUtil.setString(saveDoc, "cash_spot_dv", "0");
						 * // 현금현물구분 XMLUtil.setString(saveDoc, "res_reg_no", "9999999999999"); // 주민번호 XMLUtil.setString(saveDoc, "usr_nm", "학생인건비"); // 사용자명
						 * XMLUtil.setLong(saveDoc, "paym_amt", XMLUtil.getLong(doc, "trns_amt")); // 지급금액 XMLUtil.setInt(saveDoc, "ptcn_rt", 100); // 참여율
						 * XMLUtil.setString(saveDoc, "lnk_st", "A"); // 연계상태
						 * 
						 * result = xda.execute(insertId, saveDoc);
						 * 
						 * startDateTmp = startYmd;
						 */
					}
				} else {
					// resbglcost(참여인건비)테이블조회하여 연구원정보가지고 온다.
					paramMap.put("expns_cd", list.getExpns_cd());
					List<BeaipaVo> retList = rcmsDAO.selectListResbglcostMS01(paramMap); // kitech.fin.fin.fnd.xda.ResbglcostMS01
					int seq = 0;
					for (BeaipaVo saveDoc: retList) {
						seq++;							
						saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
						saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
						saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
						saveDoc.setAdtn_info_reg_seq(seq); // 부가정보등록순번
						
						// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
						// 2017.10.30 중소기업청 추가
						if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
							String residNo = saveDoc.getRes_reg_no();
							saveDoc.setRes_reg_no(residNo.substring(0, 6));
						}
						saveDoc.setCash_spot_dv("0"); // 현금현물구분
						saveDoc.setLnk_st("A"); // 연계상태

						result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
					}
				}

				// 2013.02.28 추가 아르바이트 비용신청결의
			} else if ("171".equals(cropUnslipNo)) {
				paramMap.put("accnt_no", list.getAccnt_no());

				// humapyarcost(아르바이트비용신청)테이블조회하여 아르바이트정보가지고 온다.
				List<BeaipaVo> retList = rcmsDAO.selectListHumApyArCostMS07(paramMap); // kitech.hum.apy.xda.HumApyArCostMS07
				int seq = 0;
				for (BeaipaVo saveDoc: retList) {
					seq++;
					saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
					saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
					saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
					saveDoc.setAdtn_info_reg_seq(seq); // 부가정보등록순번
					// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
					// 2017.10.30 중소기업청 추가
					if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
						String residNo = saveDoc.getRes_reg_no();
						saveDoc.setRes_reg_no(residNo.substring(0, 6));
					}
					saveDoc.setCash_spot_dv("0"); // 현금현물구분
					saveDoc.setLnk_st("A"); // 연계상태

					result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
				}
				// 2013.09.05 학생인건비 결의추가
			} else if ("272".equals(cropUnslipNo)) {
				paramMap.put("accnt_no", list.getAccnt_no());

				// resbglstucost(학생인건비지급신청)테이블조회
				List<BeaipaVo> retList = rcmsDAO.selectListResBglStuCostMS01(paramMap); // kitech.fin.fin.fnd.xda.ResBglStuCostMS01
				int seq = 0;
				for (BeaipaVo saveDoc: retList) {
					seq++;
					saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
					saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
					saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
					saveDoc.setAdtn_info_reg_seq(seq); // 부가정보등록순번

					// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
					// 2017.10.30 중소기업청 추가
					if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
						String residNo = saveDoc.getRes_reg_no();
						saveDoc.setRes_reg_no(residNo.substring(0, 6));
					}
					saveDoc.setCash_spot_dv("0"); // 현금현물구분
					saveDoc.setLnk_st("A"); // 연계상태

					result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01	
				}
				
			} else if ("118".equals(cropUnslipNo)) { // 내부인건비1계정대체 추가(2017.09.25.)
				List<BeaipaVo> retList = rcmsDAO.selectListRcmsResbglcostMS01(paramMap); // kitech.fin.fin.rcms.xda.ResbglcostMS01
				int seq = 0;
				for (BeaipaVo saveDoc: retList) {
					seq++;
					saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
					saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
					saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
					saveDoc.setAdtn_info_reg_seq(seq); // 부가정보등록순번
					
					// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
					// 2017.10.30 중소기업청 추가
					if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
						String residNo = saveDoc.getRes_reg_no();
						saveDoc.setRes_reg_no(residNo.substring(0, 6));
					}
					saveDoc.setCash_spot_dv("0"); // 현금현물구분
					saveDoc.setLnk_st("A"); // 연계상태

					result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
				}

			} else if ("155".equals(cropUnslipNo)) { // 내부인건비1계정대체 추가(2017.09.25.)
				List<BeaipaVo> retList = rcmsDAO.selectListResbglcostMS02(paramMap); // kitech.fin.fin.rcms.xda.ResbglcostMS02

				int seq = 0;
				for (BeaipaVo saveDoc: retList) {
					seq++;
					saveDoc.setLnk_reg_dt(lnkRegDt); // 연계등록일자
					saveDoc.setLnk_reg_seq(lnkRegSeq); // 연계등록순번
					saveDoc.setItxp_reg_seq(itxpReqSeq); // 비목등록순번
					saveDoc.setAdtn_info_reg_seq(seq); // 부가정보등록순번
					// 서울통상산업진흥원, 한국해양과학기술진흥원과제일 경우 주민번호는 앞의 6자리만 보내야함
					// 2017.10.30 중소기업청 추가
					if ("M01".equals(pmsId) || "C01".equals(pmsId) || "H01".equals(pmsId)) {
						String residNo = saveDoc.getRes_reg_no();
						saveDoc.setRes_reg_no(residNo.substring(0, 6));
					}
					saveDoc.setCash_spot_dv("0"); // 현금현물구분
					saveDoc.setLnk_st("A"); // 연계상태

					result = rcmsDAO.mergeItem03(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSI01
					
				}
			}
		} else {
			paramMap.put("lnk_reg_dt", lnkRegDt); // 연계등록일자
			paramMap.put("lnk_reg_seq", lnkRegSeq); // 연계등록순번
			paramMap.put("lnk_st", "A");
			result = rcmsDAO.updateSingleItem05(paramMap); // kitech.fin.fin.fnd.xda.if_rnd_beai_p_aSU01
		}
		return result;
	}
	
	/**
	 * [논리명] RCMS집행전송 2017.08.03. made by yhlee [개요] 사업비비목연구시설장비내역 저장
	 */
	public int saveBiet_p_a(FinRcmsPaySendVo list, String sendType) throws Exception {
	
		log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
		log.debug("선집행 전송  saveBiet_p_a");
		log.debug("sendType : [{}] list : [{}]", sendType, list);
		
		int result = 0;

		String prj_ymd_yn = list.getPrj_ymd_yn();
		String unslipNo = list.getErp_cd_1();		
		int unslipOdr = Integer.parseInt(list.getErp_cd_2());
		Map<String, Object> saveDoc = new HashMap<String, Object>();		
		saveDoc.put("lnk_reg_dt", list.getLnk_reg_dt());
		saveDoc.put("lnk_reg_seq", list.getLnk_reg_seq());
		saveDoc.put("lnk_st", "A");
		if ("S".equals(sendType)) {

			// etube id 조회
			Map<String, Object> paramDoc = new HashMap<String, Object>();
			paramDoc.put("unslip_no", unslipNo);
			paramDoc.put("unslip_odr", unslipOdr);

			// 구매계약금액 조회 - etube_id 입력 기준이 됨
			RndBietpaVo retVo13 = rcmsDAO.selectSingleItem13(paramDoc); // kitech.fin.fin.fnd.xda.if_rnd_biet_p_aSS02
			
			Long contrctAmt = 0L;
			Long finPayAmt = 0L;
			String mnyPayWay = "";
			String expnsClsf = "";
			String purGrpCd = "";
			
			if (retVo13 != null) {
			    contrctAmt = retVo13.getContrct_tot_amt() != null ? Long.parseLong(retVo13.getContrct_tot_amt()) : 0L; // 총계약금액
			    finPayAmt = retVo13.getAmt() != null ? Long.parseLong(retVo13.getAmt()) : 0L; // 외자구매 & 장비대금인 경우, 심의당시의 금액
			    mnyPayWay = retVo13.getMny_pay_way() != null ? retVo13.getMny_pay_way() : ""; // 구매지급신청 구분(4: 외자)
			    expnsClsf = retVo13.getExpns_clsf() != null ? retVo13.getExpns_clsf() : ""; // 구매 비용구분(PLA070 : 장비대금)
			    purGrpCd = retVo13.getPur_grp_cd() != null ? retVo13.getPur_grp_cd() : ""; // 구매 구분 (EGF030 : 공사)
			}
			
			// 외자구매이면서 장비대금, 물품대금, 용역대금일 때는 총계약금액 * 환율 금액을 검증기준으로 한다.
			if ("4".equals(mnyPayWay) && ("PLA070".equals(expnsClsf) || "PLA082".equals(expnsClsf) || "PLA083".equals(expnsClsf))) {
				contrctAmt = finPayAmt;
			}
			String eTubeID = "";
			if ("EGF030".equals(purGrpCd)) { // 공사인 경우 EtubeID XXX999997
				eTubeID = "XXX9999997";
			} else {
				if (contrctAmt < 1000000) { // 100만원 미만
					eTubeID = "XXX9999999";
				} else if (contrctAmt >= 1000000 && contrctAmt < 30000000) { // 100만원이상 3000만원미만
					eTubeID = "XXX9999998";
				} else { // 3000만원 이상 => 조회된 etub_id가 null일경우 XXX9999996으로 치환
					if (retVo13 != null) {
						eTubeID = retVo13.getEtub_id();
					}					
					if ("".equals(eTubeID) && !"Y".equals(prj_ymd_yn)) {
						throw new Exception("지급신청번호 [" + list.getReq_no() + "], 결의번호/순번 [" + unslipNo + "/" + unslipOdr + "]의 장비고유번호(etub_id)가 없습니다. 확인바랍니다.");
					}
				}
			}
			
			saveDoc.put("itxp_reg_seq", 1); // 비목등록순번
			saveDoc.put("etub_reg_seq", 1); // 장비등록순번
			saveDoc.put("etub_id", eTubeID); // 장비고유번호
			saveDoc.put("etub_paym_amt", list.getTrns_amt_long()); // 장비지급금액
			saveDoc.put("lnk_st", "A"); // 연계상태
			result = rcmsDAO.mergeItem04(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_biet_p_aSI01
		} else {
			result = rcmsDAO.updateSingleItem06(saveDoc); // kitech.fin.fin.fnd.xda.if_rnd_biet_p_aSU01
		}
		return result;
	}
	
	public int cancelFinRcmsPaySend(FinRcmsPaySendVo vo, List<FinRcmsPaySendVo> listVo) throws Exception {
	
		log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
		log.debug("선집행 전송취소  cancelFinRcmsPaySend");
		log.debug("vo : [{}] listVo : [{}]", vo, listVo);
	
		int result = 0;
		
		for (FinRcmsPaySendVo delDoc: listVo) {
			String unslipNo = delDoc.getLnk_reg_seq().substring(0, 10);
			// 전송취소(전송중일때는 연계상태가 'A'일때 삭제가능하고 오류일때는 연계상태에 관계없이 삭제가능)
			FinRcmsPaySendVo retVo = rcmsDAO.cancelFinRcmsPaySend01(delDoc);  // kitech.fin.fin.fnd.xda.if_rnd_beex_l_aSS02
			String lnkSt = "";
			String strUnslipOdr = "";
			String[] arrUnslipOdr = null;
			if(retVo.getLnk_st() != null) lnkSt = retVo.getLnk_st(); // 연계상태가져온다.
			if(retVo.getErp_cd_2() != null) strUnslipOdr = retVo.getErp_cd_2();
			if(retVo.getErp_cd_2() != null) arrUnslipOdr = strUnslipOdr.split(",");

			if (retVo != null && "0".equals(delDoc.getProc_state())) {
				if ("A".equals(lnkSt)) {
					// 사업비 집행원장 삭제
					result = rcmsDAO.cancelFinRcmsPaySendDelete(delDoc); // kitech.fin.fin.fnd.xda.if_rnd_beex_l_aSD01
				} else {
					// Rollback
					Exception e = new Exception("전송중이므로 취소할 수 없습니다.!");
					throw e;
				}
			} else if ("4".equals(delDoc.getProc_state())) {
				result = rcmsDAO.cancelFinRcmsPaySendUpdate(delDoc); // kitech.fin.fin.fnd.xda.if_rnd_beex_l_aSU02
			}

			// ======================================== //
			// 3.2 결의서 상세 RCMS_SEND_NO = "" 수정
			// ======================================== //
			if(arrUnslipOdr != null){
				for (int j = 0; j < arrUnslipOdr.length; j++) {
					Map<String, Object> saveDoc = new HashMap<String, Object>();
					saveDoc.put("rcms_rmk", "");
					saveDoc.put("updt_syspayno", vo.getSyspayno());
					saveDoc.put("unslip_no", unslipNo);
					saveDoc.put("unslip_odr", Integer.parseInt(arrUnslipOdr[j]));
					result = rcmsDAO.updateSingleItem03(saveDoc); // kitech.fin.fin.fnd.xda.FspSlipdSU01
				}
			}
		}
		return result;
	}
}
