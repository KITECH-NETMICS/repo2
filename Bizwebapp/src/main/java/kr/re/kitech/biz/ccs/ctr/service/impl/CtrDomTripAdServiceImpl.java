package kr.re.kitech.biz.ccs.ctr.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.ccs.ctr.dao.CtrDomTripAdDAO;
import kr.re.kitech.biz.ccs.ctr.dao.CtrDomTripDAO;
import kr.re.kitech.biz.ccs.ctr.service.CtrDomTripAdService;
import kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdFormVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdInfoVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 국내출장정산
 * @Class Name CtrDomTripAdServiceImpl.java
 * @Description 국내출장정산 관련 처리 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/06/08      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/06/08
 * @version 1.0
 * @see
 * 
 */
@Service("ctrDomTripAdService")
public class CtrDomTripAdServiceImpl extends EgovAbstractServiceImpl implements CtrDomTripAdService{
	@Resource(name="ctroDomTripAdDAO")
	private CtrDomTripAdDAO dao;
	
	@Resource(name="ctrDomTripDAO")
	private CtrDomTripDAO tripDao;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprComService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;		
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService slipService;
	
	@Resource(name = "finComService")
	private FinComService finComService;

	/**
     * 국내출장정산 정보 조회
     * @param CtrTripAdSrcVo
     * @return CtrDomAdFormVo
     * @throws Exception
     */
	public CtrDomAdInfoVo selectCtrDomAd(CtrTripAdSrcVo vo) throws KitechException{
		CtrDomAdInfoVo retVo = new CtrDomAdInfoVo();
		// 1) 국내출장 정산 폼조회
		CtrDomAdFormVo formVo = dao.selectCtrDomAd(vo);
		if(formVo == null){
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.co.com.0007", new String[]{"출장정산내역"});
		}
		
		// 항공마일리지 번호 조회
		if(formVo.getBiztrip_way().matches("exprss|exMile")){
			formVo.setAir_mile_no(dao.selectCtrAirMileUseReqNo(formVo.getBiztrip_req_no()));
		}		
		retVo.setTripAdVo(formVo);
		
		// 정산번호 없을 경우 셋팅
		if(StringUtils.isEmpty(vo.getReq_no().trim())){
			vo.setReq_no(formVo.getReq_no());
		}
		vo.setBiztrip_req_no(formVo.getBiztrip_req_no());
		
		// 2) 동반자 조회
		retVo.setCompnList(dao.selectCtrDomRepCompnList(vo.getReq_no()));
		
		// 3) 출장정산경로 조회
		retVo.setPathList(dao.selectCtrDomPathAd(vo.getReq_no()));
		
		// 4) 출장신청 경로 조회
		CtrTripSrcVo srcVo = new CtrTripSrcVo();
		srcVo.setReq_no(vo.getBiztrip_req_no());
		retVo.setReqPathList(tripDao.selectCtrDomPathList(srcVo));
		
		//출장경비
		if(formVo.getExpns_cnt() > 0){
			// 6) 출장경비(실비, 정액)
			retVo.setExpnsList(dao.selectCtrDomExpnsList(vo.getReq_no()));
			
			// 7) 지급내역
			retVo.setPayList(dao.selectCtrDomAdPayList(vo.getReq_no()));
			
			// 8) 계정내역
			retVo.setAccntList(dao.selectCtrDomAdAccntList(vo.getReq_no()));
		}
		
		// 9) 기타경비조회
		if(retVo.getCompnList().size() > 0 && retVo.getPathList().size() > 0){
			srcVo.setPosi_clsf(retVo.getCompnList().get(0).getPosi_clsf());
			srcVo.setStart_region(retVo.getPathList().get(0).getStart_region());
			retVo.setFeeVo(tripDao.selectCtrBizTripFee(srcVo));
		}
		return retVo;
	}
	
	/**
    * 업무대기함 호출시 출장정산 여부 체크
    * @param CtrTripSrcVo
    * @return Map
    * @throws Exception
    * @author LeeYH
    * @since 2023.02.15.
    */
	public Map<String,String> selectCtrDomAdExistsYn(CtrTripSrcVo vo) throws ElException{
		return dao.selectCtrDomAdExistsYn(vo.getBiztrip_req_no());
	}
	
	/**
    * 국내출장정산을 위한 국내출장정보 조회
    * @param CtrTripSrcVo
    * @return CtrTripReqVo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.14.
    */
	public CtrDomAdInfoVo selectCtrDomTripForAd(CtrTripSrcVo vo) throws ElException{
		CtrDomAdInfoVo retVo = new CtrDomAdInfoVo();		
		vo.setReq_no(vo.getBiztrip_req_no());
		
		// 1) 출장정보 조회
		retVo.setTripAdVo(dao.selectCtrDomForAd(vo.getReq_no()));			
		
		// 2) 동반자 조회
		retVo.setCompnList(tripDao.selectCtrDomCompnList(vo.getReq_no()));			
		
		// 3) 출장경로 조회
		retVo.setPathList(tripDao.selectCtrDomPathList(vo));		
		
		// 4) 계정내역 조회
		retVo.setAccntList(tripDao.selectCtrDomAccntList(vo.getReq_no()));
		
		// 5) 국내출장신청서 지급내역 조회
		retVo.setPayList(dao.selectDomTripPayList(vo.getReq_no()));	
		
		// 6) 기타경비조회
		vo.setPosi_clsf(retVo.getCompnList().get(0).getPosi_clsf());
		// 정산에서는 숙박비는 따로 계산하므로 필요없지만 쿼리에서 필수값이어서 천안으로 넣어줌
		vo.setStart_region("FAU001");
		retVo.setFeeVo(tripDao.selectCtrBizTripFee(vo));	
		
		return retVo;
	}
	
	/**
    * 국내출장 정산 위치 인증내역 조회
    * @param CtrTripAdSrcVo
    * @return List<CtrTripGpsVo>
    * @author LeeYH
    * @since 2022.11.14.
    */
	public List<CtrTripGpsVo> selectGpsInfoData(CtrTripAdSrcVo vo) throws KitechException{
		String[] mails = vo.getPsn_syspayno().split(",");
		List<BiztripPsnVo> psnList = new ArrayList<BiztripPsnVo>();
		for(String psn : mails){
			BiztripPsnVo psnVo = new BiztripPsnVo();
			psnVo.setEmail(psn);;
			psnList.add(psnVo);
		}
		vo.setPsnList(psnList);
		
		return dao.selectGpsInfoData(vo);
	}
	
	/**
    * 국내출장 정산 저장
    * @param CtrDomAdInfoVo
    * @return String reqNo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.15.
    */
	public String saveCtrDomTripAdInfo(CtrDomAdInfoVo vo) throws Exception{
		CtrDomAdFormVo tripAdVo = vo.getTripAdVo();
		List<CtrDomPathVo> pathList = vo.getPathList(); // 출장 경로
		List<CtrDomExpnsVo> expnsList = vo.getExpnsList(); // 출장경비
		
		if(pathList == null){
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.co.com.0007", new String[]{"출장경로"});
		}
		
		int pathSize = pathList.size();
		
		tripAdVo.setBiztrip_start_region(pathList.get(0).getStart_region());		
		tripAdVo.setTruth_region(pathList.get(pathSize-1).getArriv_region());
		
		// 출장경비 셋팅
		this.setTripAdExpns(tripAdVo, expnsList);
		
		String reqNo = tripAdVo.getReq_no();
		
		if("C".equals(tripAdVo.getCud_type())){
			Map<String,String> map = dao.selectCtrDomAdExistsYn(tripAdVo.getBiztrip_req_no());
			if(map != null){
				throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.ccs.ctr.0011", new String[]{map.get("req_no"), map.get("nm"), map.get("empno")});
			}
			
			// 1) 복명서 저장
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "C87");
			tripAdVo.setReq_no(reqNo);
			tripAdVo.setWrte_psn_syspayno(KitechContextUtil.getSyspayno());
			
			if(dao.insertCtrDomRep(tripAdVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장복명서 저장"});
			}
			
			// 2) 국내출장정산 저장
			tripAdVo.setReq_psn_syspayno(KitechContextUtil.getSyspayno());
			tripAdVo.setReq_psn_dept_cd(KitechContextUtil.getDeptCd());
			tripAdVo.setReq_psn_dept_new_ymd(KitechContextUtil.getSession().getDeptNewYmd());
			
			if(dao.insertCtrDomAd(tripAdVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정산 저장"});
			}
			
			// 3) 전자증빙
			List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList("C87", "");
			
			for(FspEvidAttachVo evidVo : evidVoList){
				evidVo.setReq_no(reqNo);
				if("F037".equals(evidVo.getEvid_item_cd())){ // 국내출장 신청서
					evidVo.setKey_val(tripAdVo.getBiztrip_req_no());
				}else if("F036".equals(evidVo.getEvid_item_cd())){ // 국내출장정산서(신)
					evidVo.setKey_val(reqNo);
				}
			}
			attachService.saveFspEvidAttach(evidVoList);
			
			// 4) 결재
			String prd = DateUtil.formatDate(tripAdVo.getTruth_orign_ymd(), "-") + "~" 
						+ DateUtil.formatDate(tripAdVo.getTruth_cls_ymd(), "-");
			String infoCd = tripAdVo.getTruth_biztrip_goal() + "/" + prd + "/" + vo.getCompnList().get(0).getBiztrip_psn_nm();
			
			apprFuncService.formInit(reqNo, "C321", KitechContextUtil.getUserId(), infoCd);
		}else{
			// AprState 체크하는 공통 메소드호출
			try {
				apprValidService.isWaitStateAtIntfatab("C321", reqNo);
			} catch (KitechException ex) {
				throw ex;
			}
			// 1-2) 복명서 수정
			dao.updateCtrDomRep(tripAdVo);
			
			// 2-2) 정산서 수정
			dao.updateCtrDomAd(tripAdVo);
		}
		
		// 5) 복명서 동반자 저장
		List<CtrDomCompnVo> compnList = vo.getCompnList();
		String biztripPsnNm = "";
		if(compnList != null && compnList.size() > 0){
			biztripPsnNm = compnList.get(0).getBiztrip_psn_nm();
			
			for(CtrDomCompnVo compnVo : compnList){
				if("C".equals(compnVo.getCud_type())){
					compnVo.setReq_no(reqNo);
					compnVo.setBiztrip_req_no(tripAdVo.getBiztrip_req_no());
					
					if(dao.insertCtrDomRepCompn(compnVo) == 0){
						throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정산 출장자 저장"});
					}
				}else if("U".equals(compnVo.getCud_type())){
					dao.updateCtrDomRepCompn(compnVo);
				}
			}
		}
		
		// 6) 출장경로 저장
		if("U".equals(tripAdVo.getCud_type())){
			tripDao.deleteCtrDomPath(reqNo);
		}		
		int odr = 1;
		for(CtrDomPathVo pathVo : pathList){
			pathVo.setReq_no(reqNo);
			pathVo.setOdr(odr);
			
			if(dao.mergeCtrDomPath(pathVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정산 경로 저장"});
			}
			odr++;
		}
		
		// 7) 출장경비 저장
		if(expnsList != null){
			for(CtrDomExpnsVo expnsVo : expnsList){
				expnsVo.setReq_no(reqNo);
				
				if(dao.mergeCtrDomExpns(expnsVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정산 경비 저장"});
				}
			}
		}
		
		// 8) 지급내역 저장	
		List<CtrDomPayVo> payList = vo.getPayList();
		if(payList != null){
			// 8-1) 지급내역 삭제
			if("U".equals(tripAdVo.getCud_type())){
				dao.deleteCtrDomAdPay(reqNo);
			}
			
			// 8-2) 지급내역 저장
			int cnt = 1;
			for(CtrDomPayVo payVo : payList){
				payVo.setReq_no(reqNo);
				payVo.setPay_seq(cnt);
				
				if(dao.insertCtrDomAdPay(payVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정산 지급내역 저장"});
				}
				cnt++;
			}
		}
		
		// 9) 계정내역 저장
		List<CtrDomAccntVo> accntList = vo.getAccntList();
		if(accntList != null){
			for(CtrDomAccntVo accntVo : accntList){
				String rmk = tripAdVo.getTruth_biztrip_form() + "/" + biztripPsnNm + "/" + tripAdVo.getTruth_orign_ymd() + "~" + tripAdVo.getTruth_cls_ymd() + "/" + reqNo;
				accntVo.setRmk(rmk);
					
				if("C".equals(accntVo.getCud_type())){
					accntVo.setReq_no(reqNo);
					
					if(dao.insertCtrDomAdAccnt(accntVo) == 0){
						throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정산 계정내역 저장"});
					}
					
				}else if("U".equals(accntVo.getCud_type())){
					dao.updateCtrDomAdAccnt(accntVo);					
						
				}else if("D".equals(accntVo.getCud_type())){
					if(dao.deleteCtrDomAdAccnt(accntVo) == 0){
						throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정산 계정내역 삭제"});
					}
					
					// 원인행위 삭제
					this.deleteBudEnfrcMnt(accntVo.getReq_no(), String.valueOf(accntVo.getReq_seq()));
				}
			}
		}
		
		// 10) 마일리지 내역에 정산번호 업데이트
		if(!StringUtils.isEmpty(tripAdVo.getAir_mile_no())){
			dao.updateCtrAirMileUseTripNo(tripAdVo);
		}			
		
		// 11) 결재신청
		if(tripAdVo.isApproval()){
			this.approvalCtrDomTripAd(vo);
		}
		
		return reqNo;
	}
	
	/**
    * 국내출장 정산 저장을 위한 출장금액 셋팅
    * @param CtrDomAdFormVo, List<CtrDomExpnsVo>
    * @return CtrDomAdFormVo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.15.
    */
	private CtrDomAdFormVo setTripAdExpns(CtrDomAdFormVo formVo, List<CtrDomExpnsVo> expnsList) throws KitechException{
		if(expnsList.size() > 0){
			int fareFeeMax = 0;
			int fareFeePay = 0;
			int lodgFeeMax = 0;
			int lodgFeePay = 0;
			int ymdFeeMax = 0;
			int ymdFeePay = 0;
			int mealFeeMax = 0;
			int mealFeePay = 0;
			
			for(CtrDomExpnsVo expnsVo : expnsList){
				fareFeeMax += expnsVo.getFare_fee_max();
				fareFeePay += expnsVo.getFare_fee_pay();
				lodgFeeMax += expnsVo.getLodg_fee_max();
				lodgFeePay += expnsVo.getLodg_fee_pay();
				ymdFeeMax += expnsVo.getYmd_fee_max();
				ymdFeePay += expnsVo.getYmd_fee_pay();
				mealFeeMax += expnsVo.getMeal_fee_max();
				mealFeePay += expnsVo.getMeal_fee_pay();
			}
			
			formVo.setTruth_fare_fee(fareFeeMax);
			formVo.setAdjst_fare_fee(fareFeePay);
			formVo.setAdjst_fare_fee_rmk(expnsList.get(0).getFare_fee_rmk());
			
			formVo.setTruth_lodg_fee(lodgFeeMax);
			formVo.setAdjst_lodg_fee(lodgFeePay);
			formVo.setAdjst_lodg_fee_rmk(expnsList.get(0).getLodg_fee_rmk());
			
			formVo.setTruth_ymd_fee(ymdFeeMax);
			formVo.setAdjst_ymd_fee(ymdFeePay);
			formVo.setAdjst_ymd_fee_rmk(expnsList.get(0).getYmd_fee_rmk());
			
			formVo.setTruth_meal_fee(mealFeeMax);
			formVo.setAdjst_meal_fee(mealFeePay);
			formVo.setAdjst_meal_fee_rmk(expnsList.get(0).getMeal_fee_rmk());			
			
			formVo.setTruth_tot_expns(fareFeeMax + lodgFeeMax + ymdFeeMax + mealFeeMax);
			formVo.setAdjst_tot_expns(fareFeePay + lodgFeePay + ymdFeePay + mealFeePay); 
		}
		return formVo;
	}
	
	/**
    * 국내출장정산 예산통제모듈 호출
    * @param CtrDomAdFormVo, CtrDomAccntVo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.21.
    */
	private void enfrcComBugt(CtrDomAdFormVo mstVo, CtrDomAccntVo vo, int unslipOdr) throws ElException{
		BblenfrcVo enfrcVo = new BblenfrcVo();
		enfrcVo.setReq_no(vo.getReq_no()); 		
		enfrcVo.setReq_seq(vo.getReq_seq()); 			
		enfrcVo.setReq_clsf("FBJ021"); 			    
		enfrcVo.setReq_ymd(mstVo.getReq_ymd()); 	    
		enfrcVo.setReq_psn(mstVo.getReq_psn_syspayno());		
		enfrcVo.setReq_dept(mstVo.getReq_psn_dept_cd());	
		enfrcVo.setReq_dept_new_ymd(mstVo.getReq_psn_dept_new_ymd());
		enfrcVo.setFomat_unit(vo.getFomat_unit());	
		enfrcVo.setAccnt_no(vo.getAccnt_no());		
		enfrcVo.setAccnt_cd(vo.getAccnt_cd());		
		enfrcVo.setExpns_cd(vo.getExpns_cd());		
		enfrcVo.setReq_amt(vo.getTot_expns());		
		enfrcVo.setRmk(vo.getRmk());
		enfrcVo.setRelat_no(vo.getAccnt_respn_psn_syspayno().substring(2,8));
		// 결의서
		enfrcVo.setUnslip_no(mstVo.getUnslip_no());
		enfrcVo.setUnslip_odr(unslipOdr);
		enfrcVo.setUnslip_amt(vo.getTot_expns());
		enfrcVo.setPart_all_clsf("F");
		
		finComService.budEnfrcMnt01(enfrcVo);
		vo.setBugt_ctrl_no(enfrcVo.getCtrl_no());
		
		// 국내출장 정산 계정내역에 통제번호 업데이트
		dao.updateCtrDomAdAccntCtrlNo(enfrcVo);
	}
	
	/**
    * 국내출장 예산통제모듈 삭제
    * @param String reqNo, int reqSeq
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.21.
    */
	private void deleteBudEnfrcMnt(String reqNo, String reqSeq) throws KitechException{
		DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
		enfrcVo.setReq_no(reqNo);
		if(!StringUtils.isEmpty(reqSeq)){
			enfrcVo.setReq_seq(reqSeq);
		}
		finComService.deleteBudEnfrcMnt(enfrcVo);
	}
	
	/**
    * 국내출장 정산 결재신청
    * @param CtrDomAdInfoVo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.18.
    */
	private void approvalCtrDomTripAd(CtrDomAdInfoVo vo) throws Exception{
		CtrDomAdFormVo formVo = vo.getTripAdVo();
		String reqNo = formVo.getReq_no();	
		
		// 1) 수정내역만 가지고 와서 재조회
		// 동반자 조회
		vo.setCompnList(dao.selectCtrDomRepCompnList(reqNo));
		// 계정내역 조회
		List<CtrDomAccntVo> accntList = dao.selectCtrDomAdAccntList(reqNo);
		vo.setAccntList(accntList);
		// 출장경비내역
		List<CtrDomExpnsVo> expnsList = dao.selectCtrDomExpnsList(reqNo);
		vo.setExpnsList(expnsList);
		long fareFeeMaxSum = 0;
		long fareFeeSum = 0;
		long fareFeePaySum = 0;	
		for(CtrDomExpnsVo expnsVo : expnsList){
			// 결재를 위하여 셋팅
			fareFeeMaxSum += expnsVo.getSum_trip_fee_max();
			fareFeeSum += expnsVo.getSum_trip_fee();
			fareFeePaySum += expnsVo.getSum_trip_fee_pay();				
		}
		formVo.setTotl_fare_fee_max(fareFeeMaxSum);
		formVo.setTotl_fare_fee(fareFeeSum);
		formVo.setTotl_fare_fee_pay(fareFeePaySum);	
		
		// 항공마일리지 신고내역
		if(!StringUtils.isEmpty(formVo.getAir_mile_no())){
			vo.setMileList(dao.selectCtrAirMileUseList(formVo.getAir_mile_no()));
		}
		
		//-----------------------------------------------------------------------
		// 1) 결의서 생성
		//-----------------------------------------------------------------------
		// 1-1) 국내출장 결의가 존재할 경우 삭제
		String unslipNo = formVo.getUnslip_no().trim();
		CtrTripAdSrcVo srcVo = new CtrTripAdSrcVo();
		srcVo.setUnslip_no(unslipNo);
		srcVo.setReq_no(formVo.getReq_no());
		if(!StringUtils.isEmpty(unslipNo)){
			this.cancelDomTripSlip(srcVo);
			
			formVo.setUnslip_no("");
			formVo.setDecsn_ex("");
		}	
		
		// 1-2) 결의서 생성
		if(formVo.getAdjst_tot_expns() > 0){
			// 결의서 비고 셋텅(rmk_2)
			int cnt = vo.getCompnList().size();
			String rmk = vo.getCompnList().get(0).getBiztrip_psn_nm() + "," + String.valueOf(cnt-1);
			formVo.setRmk(rmk);
			// 결의서 생성
			formVo.setUnslip_no(this.creatDomTripSlip(vo.getTripAdVo(), vo.getAccntList()));
			formVo.setDecsn_ex("N");
		}
		
		//-----------------------------------------------------------------------
		// 2) 결재신청
		//-----------------------------------------------------------------------	
		// 자동통제유무 조회
		//long totAmt = 0;
		String accntRspns = "";
		String bugtCtrlPsns = "";	
		String autoCtrlYn = "Y";
		for(CtrDomAccntVo accntVo : accntList){
			//totAmt += accntVo.getTot_expns();			
			if(accntVo.getTot_expns() > 0 && !"FF030001".equals(accntVo.getAccnt_no())){				
				accntRspns += accntVo.getAccnt_respn_psn_syspayno() + ",";
				bugtCtrlPsns += accntVo.getBugt_ctrl_psn() + ",";
			}
			
			// 통제번호가 모두 있는 경우 자동통제
			if(accntVo.getBugt_ctrl_no() == null || StringUtils.isEmpty(accntVo.getBugt_ctrl_no().trim())){
				autoCtrlYn = "N";
			}
		}
		
		AutoBugtVo autoVo = null;	
		if(!"".equals(accntRspns)){
			autoVo = new AutoBugtVo();				
			autoVo.setAccnt_rspns(accntRspns.substring(0, accntRspns.lastIndexOf(",")));
			autoVo.setBugt_ctrl_psn(bugtCtrlPsns.substring(0, bugtCtrlPsns.lastIndexOf(",")));
			autoVo = finComService.getAccntAutoBugtPsn2(autoVo);
		}
		
		// 복명출장기간
		String prd = DateUtil.formatDate(formVo.getTruth_orign_ymd(), "-") + "~" 
						+ DateUtil.formatDate(formVo.getTruth_cls_ymd(), "-");
		String reqPrd = prd + " (" + String.valueOf(formVo.getBiztrip_nght()) + "박" + String.valueOf(formVo.getBiztrip_day()) + "일)";
		formVo.setReq_prd(reqPrd);
		
		AprVo aprVo = new AprVo();
		aprVo.setMainKey(formVo.getBiztrip_req_no());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(formVo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("C321");
		aprVo.setRegion(vo.getCompnList().get(0).getFomat_unit());
		
		String infoCd = formVo.getTruth_biztrip_goal() + "/" + prd + "/" + vo.getCompnList().get(0).getBiztrip_psn_nm();
		aprVo.setInfoCd(infoCd);
		
		if(autoVo != null){
			// 계정책임자 : 신청계정내역과 일치시 계정책임자 전문 제외	
			// 변경사유 변경없음이 아니면 계정책임자 전문 전송, 변경없음이면 계정책임자 공백	
			if(dao.selectNotDupAccntCnt(formVo.getReq_no()) > 0 || "FBQ990".equals(formVo.getChng_resn())){
				aprVo.setAccountCharger("");		
			}else{
				aprVo.setAccountCharger(autoVo.getAccnt_rspns());		
			}		
			aprVo.setBudgetController(autoVo.getBugt_ctrl_psn()); // 예산통제자			
			aprVo.setAutoControlYn(autoCtrlYn); // 자동통제여부
		}
		// 당일출장여부
		aprVo.setOneDay((formVo.getBiztrip_nght() == 0)? "Y":"N");
		// 출장변경없음
		aprVo.setChgnYn(("FBQ990".equals(formVo.getChng_resn()))?"N" :"Y");		
		
		// 출장증빙
		if(!"".equals(formVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(formVo.getAttach_file_no()));
		}	
		// 복명서 증빙
		if(!"".equals(formVo.getEvid_attach_file_no())){
			vo.setEvidFileList(attachDao.selectListAttach(formVo.getEvid_attach_file_no()));
		}
		
		//====================================== 공통코드 ======================================//
		// 변경사유
		formVo.setChng_resn(CodeCacheManager.getInstance().getCode("FBQ", formVo.getChng_resn()).getComNm());		
		// 출장목적(FBV920는 공통코드에서 use_ex='N'으로 되어있어서 캐시에 값이 없음)
		String bizTripGoal = ("FBV920".equals(formVo.getTruth_biztrip_goal_cd()))?"현장출장(기술)" : CodeCacheManager.getInstance().getCode("FBV", formVo.getTruth_biztrip_goal_cd()).getComNm();
		formVo.setTruth_biztrip_goal("[" + bizTripGoal + "]" + formVo.getTruth_biztrip_goal());
		// 차량사용
		formVo.setCar_use_yn(CodeCacheManager.getInstance().getCode("FDO", formVo.getCar_use_yn()).getComNm());		
		
		apprFuncService.approvalRequest(aprVo, vo);		
	}
	
	/**
    * 국내출장 결의생성
    * @param CtrDomAdFormVo, List<CtrDomAccntVo>
    * @return String unslipNo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.18.
    */
	private String creatDomTripSlip(CtrDomAdFormVo formVo, List<CtrDomAccntVo> accntList) throws Exception{
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = null;	
		
		// 0-1) 국내출장 예산통제 모듈 삭제(결재신청 시점에 삭제한다.)
		//this.deleteBudEnfrcMnt(formVo.getBiztrip_req_no(), "");		
		
		// 출장정산번호 중복체크 로직 추가 -이민기선임 요청2021/12/29
		String unslipNo = formVo.getUnslip_no().trim();
		CtrTripAdSrcVo srcVo = new CtrTripAdSrcVo();
		srcVo.setUnslip_no(unslipNo);
		srcVo.setReq_no(formVo.getReq_no());		
		
		List<ComReqVo> dupList = dao.selectTripAdSlipDupCnt(srcVo);
		if(dupList != null && dupList.size() > 0){
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.ui.ccs.029", new String[]{dupList.get(0).getUnslip_no()});
		}
				
		if(StringUtils.isEmpty(formVo.getSlip_ymd())){
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.co.com.0001", new String[]{"결의일자"});
		}
		
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //				
		String rmk_1 = formVo.getTruth_biztrip_form() + "/" 
						+ DateUtil.formatDate(formVo.getTruth_orign_ymd(), "-") + "~" 
						+ DateUtil.formatDate(formVo.getTruth_cls_ymd(), "-");
		String[] rmks = formVo.getRmk().split(",");		
		
		FspSlipHVo hVo = new FspSlipHVo();
		hVo.setSlip_ymd(formVo.getSlip_ymd());
		hVo.setSlip_typ_cd("126");
		hVo.setRmk(rmk_1);
		
		unslipNo = slipService.saveAutoSlipH(formVo.getReq_no(), hVo);
		formVo.setRmk(rmk_1); // 결재신청위해 셋팅	
		formVo.setUnslip_no(unslipNo);	
		
		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("F203");
		inftaVo.setAprState("XAD020");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		apprComService.putXomxintfatab(inftaVo);
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //	
		FspSlipDVo dVo = null;
		int seq = -1;
		for(CtrDomAccntVo accntVo : accntList){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());			
			
			dVo = new FspSlipDVo();
			seq = seq+2;
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no(accntVo.getAccnt_no());
			dVo.setAccnt_rspns(accntVo.getAccnt_respn_psn_syspayno());
			dVo.setFomat_unit(accntVo.getFomat_unit());
			dVo.setAccnt_cd(accntVo.getAccnt_cd());
			dVo.setExpns_cd(accntVo.getExpns_cd());
			dVo.setUnslip_amt(accntVo.getTot_expns());
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(rmk_1);
			dVo.setRmk_2(rmks[0]);
			dVo.setReq_no(formVo.getReq_no());
			
			slipVo.setSlipDVo(dVo);
			
			this.enfrcComBugt(formVo, accntVo, seq);
			
			// 관리항목
			Map<String, String> map2 = new HashMap<String,String>();
			map2.put("unslip_no", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", dVo.getAccnt_cd());
			map2.put("base_debit_cr", dVo.getBase_debit_cr());			
			map2.put("req_no", formVo.getReq_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 결의생성 호출
			slipService.saveAutoSlip(slipVo);			
		}
		
		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //	
		// 3-1. 원차량 계정 저장
		seq = 0;
		if(!"FDO001".equals(formVo.getCar_use_yn())){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			
			seq = seq + 2;
			
			dVo = dao.selectCtrDomExpnsSum(formVo.getReq_no());
			if(dVo == null){
				throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.co.com.0002", new String[]{"원차량계정 내역조회"});
			}
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setEvid_cd("");
			dVo.setRmk_1("국내출장결의/차량관리비");			
			
			slipVo.setSlipDVo(dVo);
			// 결의생성 호출
			slipService.saveAutoSlip(slipVo);
		}
		
		// 3-2. 미지급당좌
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());
			
		dVo = dao.selectCtrDomAdPaySum(formVo.getReq_no());
		if(dVo == null){
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.co.com.0002", new String[]{"원차량계정 내역조회"});
		}
		
		seq = seq + 2;
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		dVo.setEvid_cd("");
		dVo.setRmk_1("국내출장(" + rmks[0] + ((Integer.parseInt(rmks[1]) == 0)?"" : " 외" + rmks[1]) + ")");
		dVo.setRmk_2(rmks[0]);
		
		slipVo.setSlipDVo(dVo);
		
		// ==================================================== //
		// 4. 결의서 관리항목
		// ==================================================== //	
		Map<String, String> map = new HashMap<String,String>();
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));
		map.put("occr_ymd", hVo.getSlip_ymd());
			
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// ==================================================== //
		// 5. 결의서 송금내역
		// ==================================================== //	
		List<CtrDomPayVo> payList = dao.selectCtrDomAdPayList(formVo.getReq_no());
		if(payList == null){
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.co.com.0002", new String[]{"지급내역조회"});
		}
		
		List<FspSendReqVo> sendList = new ArrayList<>();
		FspSendReqVo sendVo = null;
		seq = 1;
		for(CtrDomPayVo payVo : payList){
			sendVo = new FspSendReqVo();
			
			sendVo.setUnslip_no(unslipNo);
			sendVo.setUnslip_odr(1);
			sendVo.setSend_odr(seq);
			sendVo.setPay_clsf(payVo.getPay_clsf());
			sendVo.setSend_req_amt(payVo.getAdjst_amt());
			sendVo.setSend_amt(0);
			sendVo.setSyspayno(payVo.getBiztrip_psn_syspayno());
			sendVo.setBankaccnt_no(payVo.getBankaccnt_no());
			sendVo.setBank(payVo.getBank_cd());
			sendVo.setDepstr_nm(payVo.getDepstr());
			// eip2.0에서 출금결의시 vend_cd=null 인 경우 조회가 되지 않는 경우가 있어서 빈값처리
			sendVo.setVend_cd("");
			sendVo.setVend_nm("");
			
			sendList.add(sendVo);
			
			seq++;
		}
		if(sendList.size() > 0){
			slipVo.setSendList(sendList);
		}
		
		// 결의생성 호출
		slipService.saveAutoSlip(slipVo);
		
		// ==================================================== //
		// 6. ctrdomad- unslip_no 저장
		// ==================================================== //	
		dao.updateCtrDomAdUnslipNo(formVo);
		
		// ==================================================== //
		// 7. report 증빙 자동저장()
		//   - fspevidattach에 신청번호별로 이미 저장이 된경우에 결의번호만 업데이트가 필요할 경우 : attachService.updateFspEvidAttach
		//   - fspevidattach에 insert가 필요할 경우 : attachService.saveFspEvidAttach
		// ==================================================== //	
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setReq_no(formVo.getReq_no());
		updVo.setUnslip_no(unslipNo);
		updVo.setUnslip_odr(seq);
		attachService.updateFspEvidAttach(updVo);
		
		// 전자증빙(크리스피드)
		EvidAttachVo attachVo = new EvidAttachVo();			
		attachVo.setUnslip_no(unslipNo);	
		attachService.executeProcess(attachVo);
		
		return unslipNo;
	}
	
	/**
    * 국내출장 정산결의삭제
    * @param CtrTripAdSrcVo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.21.
    */
	private void cancelDomTripSlip(CtrTripAdSrcVo vo) throws KitechException{
		// 1) 분개유형이 자동결의외 존재유무 조회
		slipService.selectAutoSlipCnt(vo.getUnslip_no());
		
		// 2) 결의서 삭제
		slipService.deleteFspSlip(vo.getUnslip_no());
		
		// 3) 예산통제모듈 삭제
		this.deleteBudEnfrcMnt(vo.getReq_no(), "");		
		
		// 4) ctrdomad- unslip_no 초기화
		CtrDomAdFormVo formVo = new CtrDomAdFormVo();
		formVo.setUnslip_no("");
		formVo.setReq_no(vo.getReq_no());
		dao.updateCtrDomAdUnslipNo(formVo);	
		
		// 5) 전자증빙정보 삭제
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setReq_no(vo.getReq_no());
		updVo.setUnslip_no("");
		updVo.setRqst_no(vo.getUnslip_no());
		attachService.updateFspEvidAttach(updVo);
		
		// 6) 결재정보 삭제
		apprComService.deleteApr(vo.getUnslip_no(), true, true);
	}
	
	/**
    * 국내출장 정산 삭제
    * @param CtrTripAdSrcVo
    * @throws Exception
    * @author LeeYH
    * @since 2022.11.21.
    */
	public void deleteCtrDomTripAd(CtrTripAdSrcVo vo) throws KitechException{
		// 1) 결의서 삭제
		if(!StringUtils.isEmpty(vo.getUnslip_no())){
			this.cancelDomTripSlip(vo);
		}
		
		// 2) 국내출장 정산 삭제
		if(dao.deleteCtrDomTripAd(vo.getReq_no()) == 0){
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.xom.co.com.0002", new String[]{"출장정산내역 삭제"});
		}
		
		// 3) 전자증빙 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(vo.getReq_no());
		attachService.deleteFspAttchEvid(evidVo);
		
		// 4) 전자결재 삭제
		apprComService.deleteApr(vo.getReq_no());
	}
	
	/**
    * 국내출장 정산 삭제
    * @param CtrTripAdSrcVo
    * @throws Exception
    * @author LeeYH
    * @since 2023.02.23.
    */
	public void updateCtrDomAdMng(CtrDomAdFormVo vo) throws KitechException{
		// 복명서 수정
		dao.updateCtrDomRepMng(vo);
		
		// 정산서 수정
		if(!StringUtils.isEmpty(vo.getAttach_file_no())){
			dao.updateCtrDomAdMng(vo);
		}
	}
}
