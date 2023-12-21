package kr.re.kitech.biz.epu.ord.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.server.vo.biz.ApiEpuVo;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.epu.com.service.EpuComService;
import kr.re.kitech.biz.epu.ord.dao.EpuOrdPlanDAO;
import kr.re.kitech.biz.epu.ord.service.EpuOrdPlanService;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdCheckVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdDelVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLstVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdMastrVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanInfoVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdSrcVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo;
import kr.re.kitech.biz.epu.req.vo.PurReqComVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("epuOrdPlanService")
public class EpuOrdPlanServiceImpl extends EgovAbstractServiceImpl implements EpuOrdPlanService {

	@Resource(name = "epuOrdPlanDAO")
	private EpuOrdPlanDAO ordDAO;

	@Resource(name = "attachDAO")
	private AttachDAO attachDAO;

	@Resource(name = "apprFuncServiceImpl")
	private ApprFuncService apprFuncService;

	@Resource(name = "generationServiceImpl")
	private GenerationService genService;

	@Resource(name = "epuComService")
	private EpuComService epuComService;

	/**
	 * 발주계획관리 목록조회
	 * 
	 * @param EpuOrdSrcVo
	 * @return List<EpuOrdLstVo>
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.07.
	 */
	public List<EpuOrdLstVo> selectEpuOrdMastrList(EpuOrdSrcVo vo) throws KitechException {
		return ordDAO.selectEpuOrdMastrList(vo);
	}

	/**
	 * G2B ID 조회
	 * 
	 * @param EpuOrdSrcVo
	 * @return List<EpuOrdLstVo>
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.07.
	 */
	@Override
	public String selectG2bId(EpuOrdSrcVo vo) throws KitechException {
		return ordDAO.selectG2bId(vo.getSyspayno());
	}

	/**
	 * G2B ID 조회
	 * 
	 * @param EpuOrdSrcVo
	 * @return List<EpuOrdLstVo>
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.07.
	 */
	@Override
	public EpuOrdPlanInfoVo selectOrderPlans(EpuOrdSrcVo vo) throws ElException {
		EpuOrdPlanInfoVo retVo = new EpuOrdPlanInfoVo();
		// 1) 발주계획 조회
		retVo.setMastrVo(ordDAO.selectEpuOrdMastr(vo));

		// 2) 발주계획 품목내역 조회
		retVo.setItemList(ordDAO.selecEpuOrdReqItem(vo));

		// 3) 지명업체내역 조회
		retVo.setVendList(ordDAO.selectEpuOrnomVend(vo));

		// 4) 지역제한 조회
		retVo.setAreaList(ordDAO.selectOrdLimitArea(vo));

		// 5) 업종제한 조회
		retVo.setCtgrList(ordDAO.selectEpuOrdLimitClsf(vo));
		
		if("EGF030".equals(vo.getPur_clsf_cd())){
			// 6) 공종별 전체 지분율 조회(공사)
			retVo.setConstClsfList(ordDAO.selectEpuOrdLimitConstClsf(vo));
		}

		return retVo;
	}

	/**
	 * 구매요구품목 조회(구매요구번호 클릭해서 발주계획화면 이동시)
	 * 
	 * @param EpuOrdSrcVo
	 * @return List<EpuOrdReqItemVo>
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.21.
	 */
	public List<EpuOrdReqItemVo> selectPurReqItemOrdPlan(EpuOrdSrcVo vo) throws ElException {
		return ordDAO.selectPurReqItemOrdPlan(vo);
	}

	/**
	 * 계약방법에 따른 발주계획 마스터 셋팅
	 * 
	 * @param EpuOrdMastrVo
	 * @return EpuOrdMastrVo
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.23.
	 */
	private void setEpuOrdMastr(EpuOrdMastrVo ordVo) throws KitechException {
		if ("Y".equals(ordVo.getCheck_bid_succ()) || "Y-PRB".equals(ordVo.getCheck_bid_succ())) {
			// 계약 및 입찰방식
			ordVo.setSucc_pivot("");
			ordVo.setSucc_type(""); // 낙찰방법
			ordVo.setSucc_min_rate("0"); // 낙찰하한율
			ordVo.setPq_eval_yn(""); // PQ 심사여부
			ordVo.setPq_score(""); // PQ 기준점수
			ordVo.setBid_expl_yn(""); // 입찰설명회여부
			ordVo.setBid_expl_loc(""); // 입찰설명회장소
			ordVo.setApply_lic_remark(""); // 입찰참가자격

			if ("Y-PRB".equals(ordVo.getCheck_bid_succ())) {
				ordVo.setContrct_method(""); // 계약방법(1)
				ordVo.setBid_succ_method(""); // 계약방법(2)
				ordVo.setBid_succ_type(""); // 입찰방식
			}
			// 입찰집행
			ordVo.setBid_expl_ymd(""); // 입찰설명회 일시
			ordVo.setBid_start_ymd(""); // 입찰서접수 개시일시
			ordVo.setBid_end_ymd(""); // 입찰서접수 마감일시
			ordVo.setOpen_ymd(""); // 개찰일시
			ordVo.setBid_apply_end_ymd(""); // 입찰참가등록 마감일시
			ordVo.setBid_gurnt_fin_ymd(""); // 입찰보증서접수마감일시
			ordVo.setJoin_possible_yn(""); // 공동수급협정서접수 및 구성방식(1)
			ordVo.setJoin_method(""); // 공동수급협정서접수 및 구성방식(2)
			ordVo.setSame_suc_lot_program_yn(""); // 동가입찰 낙찰자 자동추첨프로그

			// 투찰제한 - 일반
			ordVo.setLimit_loc(""); // 지역제한
			ordVo.setTender_yn(""); // 지역제한(지사/지점)
			ordVo.setLimit_category(""); // 업종제한
			ordVo.setItem_limit_yn(""); // 물품분류제한여부
			ordVo.setVend_limit_yn(""); // 제조업체로 제한
			ordVo.setJoin_mem_loc_limit_yn(""); // 공동수급체 구성원 지역제한적용여부
		}
		
		if("PRB050".equals(ordVo.getBid_clsf_cd())){ // 외자직거래
			ordVo.setNoti_ymd("");
			ordVo.setNoti_last_ymd("");
		}
	}

	/**
	 * 발주계획 저장
	 * 
	 * @param EpuOrdPlanInfoVo
	 * @return EpuOrdSrcVo
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.22.
	 */
	public EpuOrdSrcVo saveEpuOrdPlan(EpuOrdPlanInfoVo vo) throws Exception {
		EpuOrdSrcVo retVo = new EpuOrdSrcVo();
		EpuOrdMastrVo ordVo = vo.getMastrVo();
		String bidOrdNo = ordVo.getBid_ord_no();

		// 계약방법에 따른 발주계획 마스터 셋팅
		this.setEpuOrdMastr(ordVo);
		// 01. 발주계획 마스터 저장
		if ("C".equals(ordVo.getCud_type())) {
			if ("2".equals(ordVo.getInout_psn_clsf_cd())) {
				bidOrdNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P82"); // 외자
			} else {				
				bidOrdNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P81"); // 내자
			}

			ordVo.setBid_ord_no(bidOrdNo);
			ordVo.setElec_docu_no(bidOrdNo + "-" + ordVo.getChg_no());

			// 구매담당자
			ApiEpuVo chrgVo = epuComService.selectChrgPsnDeptInfo(KitechContextUtil.getSyspayno());
			ordVo.setCharg_dept_cd(chrgVo.getCharg_dept_cd());
			ordVo.setCharg_dept_new_ymd(chrgVo.getCharg_dept_new_ymd());
			ordVo.setCharg_region_clsf(chrgVo.getCharg_region_clsf());
			ordVo.setCharg_divsn_dept(chrgVo.getCharg_divsn_dept());

			if (ordVo.getOrg_bid_ord_no() == null || "".equals(ordVo.getOrg_bid_ord_no())) {
				ordVo.setOrg_bid_ord_no(bidOrdNo);
				ordVo.setOrg_chg_no(ordVo.getChg_no());
			}

			ordDAO.insertEpuOrdMastr(ordVo);
			
			String serviceId = "";
			switch(ordVo.getPur_clsf_cd()){
				case "EGF010" : serviceId = "P302"; break;
				case "EGF020" : serviceId = "P345"; break;
				case "EGF030" : serviceId = "P303"; break;
			}

			// 결재 인터페이스 저장
			apprFuncService.formInit(ordVo.getElec_docu_no(), serviceId, KitechContextUtil.getUserId(), ordVo.getBid_title());
		} else {
			ordDAO.updateEpuOrdMastr(ordVo);
		}

		// 발주계획 삭제를 위하여 셋팅
		EpuOrdDelVo delVo = new EpuOrdDelVo();
		delVo.setBid_ord_no(bidOrdNo);
		delVo.setChg_no(ordVo.getChg_no());

		// 02.발주계획 구매요구 등록
		List<EpuOrdReqItemVo> itemList = vo.getItemList();
		String purReqNos = "";
		for (EpuOrdReqItemVo itemVo : itemList) {

			if ("C".equals(itemVo.getCud_type())) {
				itemVo.setBid_ord_no(bidOrdNo);
				itemVo.setChg_no(ordVo.getChg_no());

				// 중앙조달의뢰 인 경우 발주계획 다시 작성 가능하도록 수정 2021-09-24
				if ("PRB020".equals(ordVo.getBid_clsf_cd())) {
					itemVo.setOrder_cd("");
				} else {
					itemVo.setOrder_cd("10");
				}

				ordDAO.insertEpuOrdReqItem(itemVo);

				// 발주등록시 구매요구상태 수정
				ordDAO.updatePurreqItemOrderCd(itemVo);

				// 구매담당자 수정
				if (purReqNos.indexOf(itemVo.getPur_req_no()) < 0) {
					ApiEpuVo chrgVo = new ApiEpuVo();
					chrgVo.setCharg_syspayno(KitechContextUtil.getSyspayno());
					chrgVo.setPur_req_no(itemVo.getPur_req_no());
					ordDAO.updatePurchaseManager(chrgVo);

					purReqNos += itemVo.getPur_req_no() + ",";
				}
			} else if ("U".equals(itemVo.getCud_type())) {
				ordDAO.updateEpuOrdReqItem(itemVo);
			} else if ("D".equals(itemVo.getCud_type())) {
				delVo.setItem_odr(itemVo.getItem_odr());

				ordDAO.deleteEpuOrdReqItem(delVo);
			}
		}

		// 03.지명업체 정보 등록 및 삭제(수정없음)
		List<EpuOrnomVendVo> vendList = vo.getVendList();
		if (vendList != null && vendList.size() > 0) {
			for (EpuOrnomVendVo vendVo : vendList) {
				if ("C".equals(vendVo.getCud_type())) {
					vendVo.setBid_ord_no(bidOrdNo);
					vendVo.setChg_no(ordVo.getChg_no());
					
					if(vendVo.getVend_cd() != null && !"".equals(vendVo.getVend_cd().trim())){
						ordDAO.insertEpuOrnomVend(vendVo);
					}
				} else if ("D".equals(vendVo.getCud_type())) {
					delVo.setVend_cd(vendVo.getVend_cd());

					ordDAO.deleteEpuOrnomVend(delVo);
				}
			}
		}

		// 04.지역제한 정보 등록(삭제 후 저장)
		if (!"C".equals(ordVo.getCud_type())) {
			ordDAO.deleteEpuOrdLimitArea(delVo);
		}

		List<EpuOrdLimitAreaVo> areaList = vo.getAreaList();
		if (areaList != null && areaList.size() > 0) {
			int cnt = 1;
			for (EpuOrdLimitAreaVo areaVo : areaList) {
				areaVo.setBid_ord_no(bidOrdNo);
				areaVo.setChg_no(ordVo.getChg_no());
				areaVo.setOdr(cnt);

				ordDAO.insertEpuOrdLimitArea(areaVo);

				cnt++;
			}
		}

		// 05. 업종제한 정보(삭제 후 저장)
		if (!"C".equals(ordVo.getCud_type())) {
			ordDAO.deleteEpuOrdLimitClsf(delVo);
		}
		List<EpuOrdLimitClsfVo> clsfList = vo.getCtgrList();
		if (clsfList != null && clsfList.size() > 0) {
			int cnt = 1;
			for (EpuOrdLimitClsfVo clsfVo : clsfList) {
				clsfVo.setBid_ord_no(bidOrdNo);
				clsfVo.setChg_no(ordVo.getChg_no());
				clsfVo.setOdr(cnt);

				ordDAO.insertEpuOrdLimitClsf(clsfVo);

				cnt++;
			}
		}		
		
		// 06.공종별 전체 지분율
		if("EGF030".equals(ordVo.getPur_clsf_cd())){
			if (!"C".equals(ordVo.getCud_type())) {
				ordDAO.deleteEpuOrdLimitConstClsf(delVo);
			}
			List<EpuOrdLimitConstClsfVo> constList = vo.getConstClsfList();
			if(constList != null && constList.size() > 0){
				int cnt = 1;
				for(EpuOrdLimitConstClsfVo clsfVo : constList){
					clsfVo.setBid_ord_no(bidOrdNo);
					clsfVo.setChg_no(ordVo.getChg_no());
					clsfVo.setOdr(cnt);
	
					ordDAO.insertEpuOrdLimitConstClsf(clsfVo);
	
					cnt++;
				}
			}
		}
		
		retVo.setBid_ord_no(bidOrdNo);
		retVo.setChg_no(ordVo.getChg_no());

		// 결재신청
		if (ordVo.isApproval()) {
			this.approvalEpOrdPlan(vo);
		}

		return retVo;
	}

	/**
	 * 발주계획 삭제
	 * 
	 * @param EpuOrdDelVo
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.23.
	 */
	public void deleteEpuOrderPlan(EpuOrdPlanInfoVo vo) throws ElException {
		EpuOrdDelVo delVo = vo.getDelVo();
		// 수수료지급신청 여부 체크
		if (ordDAO.selectPurPayReqMastrCnt(delVo) > 0) {
			throw new KitechException(Exceptions.ALERT, Business.EPU, "해당 발주번호로 수수료가 지급된 건이 존재하므로 삭제할 수 없습니다.");
		}

		// 01. 발주계획삭제
		ordDAO.deleteEpuOrdMastr(delVo);

		// 02. 발주계획 구매품목내역삭제
		// 02-1. 구매요구 품목내역 ord_cd 초기화
		List<EpuOrdReqItemVo> itemList = vo.getItemList();
		if (itemList != null) {
			for (EpuOrdReqItemVo itemVo : itemList) {
				itemVo.setOrder_cd("");
				ordDAO.updatePurreqItemOrderCd(itemVo);
			}
		}
		// 2-2. 구매품목내역 삭제
		ordDAO.deleteEpuOrdReqItem(delVo);

		// 03.지명업체 삭제
		ordDAO.deleteEpuOrnomVend(delVo);
		// 04. 지역제한 삭제
		ordDAO.deleteEpuOrdLimitArea(delVo);
		// 05.업종제한 삭제
		ordDAO.deleteEpuOrdLimitClsf(delVo);

		// 06.전자결재 삭제
		apprFuncService.formRemove(delVo.getBid_ord_no() + "-" + delVo.getChg_no());
	}

	/**
	 * 발주계획 결재신청
	 * 
	 * @param EpuOrdPlanInfoVo
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.23.
	 */
	private void approvalEpOrdPlan(EpuOrdPlanInfoVo vo) throws Exception {
		EpuOrdMastrVo ordVo = vo.getMastrVo();
		// 통합발주여부 체크
		EpuOrdSrcVo srcVo = new EpuOrdSrcVo();
		srcVo.setBid_ord_no(ordVo.getBid_ord_no());
		srcVo.setChg_no(ordVo.getChg_no());
		
		// 발주계획 구매요구 품목내역 재조회(저장시 수정이 된것만 가지고 오기 때문에)
		vo.setItemList(ordDAO.selecEpuOrdReqItem(srcVo));
		// 지명업체내역 조회
		vo.setVendList(ordDAO.selectEpuOrnomVend(srcVo));			
		// 구매계정내역 조회
		vo.setAccntList(ordDAO.selectPurReqAccntApr(srcVo));	
		
		EpuOrdCheckVo chkVo = vo.getChkVo();
		chkVo.setDiv_yn(ordDAO.selectCombBidOrdYn(srcVo).getDiv_yn());		

		// 구매번호 리스트
		List<EpuOrdReqItemVo> itemList = vo.getItemList();
		Set<String> set = new HashSet<>();
		for (EpuOrdReqItemVo itemVo : itemList) {
			set.add(itemVo.getPur_req_no());
		}
		
		Iterator<String> it = set.iterator();
		List<PurReqComVo> purReqList = new ArrayList<>();
		PurReqComVo comVo = null;
		while(it.hasNext()){
			comVo = new PurReqComVo();
			comVo.setPur_req_no(it.next());
			purReqList.add(comVo);
		}
		vo.setPurReqList(purReqList);
	
		// 원가계산 근거 첨부파일
		if(!"".equals(ordVo.getEstipr_attach_file_no())){
			vo.setFileList_A(attachDAO.selectListAttach(ordVo.getEstipr_attach_file_no())); 
		}
		
		// 첨부서류
		if(!"".equals(ordVo.getAttach_file_no())){
			vo.setFileList_B(attachDAO.selectListAttach(ordVo.getAttach_file_no())); 
		}

		AprVo aprVo = new AprVo();
		aprVo.setReqNo(ordVo.getElec_docu_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setMainKey(ordVo.getElec_docu_no());
		if("2".equals(ordVo.getInout_psn_clsf_cd())){
			aprVo.setUiId("P410");
			aprVo.setDcFcType("2");
		}else{
			aprVo.setUiId("P302");
			aprVo.setDcFcType("1");
		}
		
		aprVo.setBiddingType(ordVo.getBid_succ_type()); // 입찰방식
		// 공고진행방법이 견적요청인 경우에 PRB060 이지만 PRB040 으로 전문을 넘긴다.
		aprVo.setBiddingTypeMain(("PRB060".equals(ordVo.getBid_clsf_cd()))? "PRB040" : ordVo.getBid_clsf_cd());
		aprVo.setEstimatedPriceType(ordVo.getMulti_esti_pr_yn()); // 예가종류(복수,단수,비예가)
		aprVo.setEstimatedOnoff(ordVo.getEsti_online_yn()); // 예가종류(온,오프라인)
		aprVo.setManualContractYn(("PRB040".equals(ordVo.getBid_clsf_cd()))? "Y" : "N"); // 수기계약 (외자-직거래)유무
		aprVo.setBidPresentationYn((ordVo.getBid_expl_yn().matches("2|3"))? "Y" : "N"); // 입찰설명회 개최여부
		aprVo.setPqReviewYn(ordVo.getPq_eval_yn()); // PQ 심사 여부
		aprVo.setContractType(ordVo.getContract_type_cd());
		aprVo.setOrderType(ordVo.getPur_clsf_cd()); // 발주종류 (물품 - EGF010, 용역 - EGF020, 공사 - EGF030)
		aprVo.setPurRequestor(itemList.get(0).getUser_sub_syspayno()); // 구매요구자 사번
		aprVo.setCharger(KitechContextUtil.getSyspayno()); // 구매당담자
		aprVo.setInfoCd(ordVo.getBid_title());
		aprVo.setMergeXsl(true);

		// 3. 전자결재 기능 메소드 호출 (전문, 스냅샷)
		apprFuncService.approvalRequest(aprVo, vo);
	}
}
