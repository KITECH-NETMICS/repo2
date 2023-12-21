package kr.re.kitech.biz.ccs.ctr.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cgs.service.CgslappService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSubHoliVo;
import kr.re.kitech.biz.ccs.com.dao.CcsComDAO;
import kr.re.kitech.biz.ccs.com.vo.BizTripHoliCntVo;
import kr.re.kitech.biz.ccs.com.vo.WorkTimeVo;
import kr.re.kitech.biz.ccs.ctr.dao.CtrDomTripDAO;
import kr.re.kitech.biz.ccs.ctr.service.CtrDomTripService;
import kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo;
import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripCheckVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripReqVo;
import kr.re.kitech.biz.ccs.ctr.vo.DayOffInfoVo;
import kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo;
import kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo;
import kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

/**
 * @ClassSubJect 국내출장
 * @Class Name CtrDomTripServiceImpl.java
 * @Description 국내출장 관련 처리 ServiceImpl
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
@Service("ctrDomTripService")
public class CtrDomTripServiceImpl extends EgovAbstractServiceImpl implements CtrDomTripService {
	@Resource(name="ctrDomTripDAO")
	private CtrDomTripDAO tripDao;
	
	@Resource(name="ccsComDAO")
    private CcsComDAO ccsComDAO;
    
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name = "finComService")
	private FinComService finComService;
	
	@Resource(name="cgslappServiceImpl")
	private CgslappService lappService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	/**
    * 국내출장 신청 조회
    * @param CtrTripSrcVo
    * @return CtrTripReqVo
    * @author LeeYH
    * @since 2022.06.09.
    */
	public CtrTripReqVo selectCtrDomTrip(CtrTripSrcVo vo) throws ElException{
		CtrTripReqVo retVo = new CtrTripReqVo();
		// 1) 출장정보 조회
		CtrDomTripVo tripVo = tripDao.selectCtrDom(vo);
		// FBV110 학회참석(논문발표)
		if("FBV110".equals(tripVo.getBiztrip_goal_clsf())){
			tripVo.setPool_conf_nm(tripDao.selectPoolConfNm(vo.getReq_no()));
		}
		retVo.setTripVo(tripVo);			
		
		// 2) 현장출장일 경우 방문처 조회
		if("FBV920".equals(retVo.getTripVo().getBiztrip_goal_clsf())){
			retVo.setVstList(tripDao.selectSptCtrBizTripVendList(vo));
		}
		
		// 3) 동반자 조회
		boolean posiFlag = false;
		retVo.setCompnList(tripDao.selectCtrDomCompnList(vo.getReq_no()));
		for(CtrDomCompnVo psnVo : retVo.getCompnList()){
			if("FBH010".equals(psnVo.getPosi_clsf())){
				// 출장경로 운임비 조회위해 셋팅
				vo.setPosi_clsf(psnVo.getPosi_clsf()); 
			}
			
			if("C86".equals(vo.getReq_no().substring(0,3)) && "353010".equals(psnVo.getPosi_cd())){
				posiFlag = true;
			}
		}		
		
		// 4) 출장경로 조회
		List<CtrDomPathVo> pathList = tripDao.selectCtrDomPathList(vo);
		String startRegion = "";
		if(pathList != null && pathList.size() > 0){
			for(CtrDomPathVo pathVo : pathList){
				// 비고가 없을 경우 운임비 및 비고 조회
				if(pathVo.getRmk().length() == 0){
					vo.setStart_region(pathVo.getStart_region());
					vo.setArriv_region(pathVo.getArriv_region());
					
					CtrDomPathVo feeVo = tripDao.selectCtrDomPathTripFee(vo);
					if(feeVo != null){
						pathVo.setRmk(feeVo.getRmk());
						pathVo.setBiztrip_fee(feeVo.getBiztrip_fee());
					}
				}
				
				startRegion = pathVo.getStart_region();
			}
		}
		retVo.setPathList(pathList);		
		
		// 5) 활동내역 조회
		retVo.setSchdList(tripDao.selectCtrDomSchedList(vo));		
		
		// 6) 계정내역 조회
		retVo.setAccntList(tripDao.selectCtrDomAccntList(vo.getReq_no()));
		
		// 7) 기타경비조회
		vo.setPosi_clsf(retVo.getCompnList().get(0).getPosi_clsf());
		vo.setStart_region(startRegion);
		retVo.setFeeVo(tripDao.selectCtrBizTripFee(vo));
		
		// 8) (구)국내출장신청서 지급내역 조회
		if(!"C86".equals(vo.getReq_no().substring(0,3))){
			retVo.setPayList(tripDao.selectCtrDomPayList(vo));
		}else if(posiFlag){
			vo.setBiztrip_psn_syspayno("");
			vo.setFrom_ymd(retVo.getTripVo().getBiztrip_start_ymd());
			retVo.setPayList(tripDao.selectCtrDomPayPosi(vo));
		}
		
		return retVo;
	}
	
	/**
    * 국내출장 휴일내역 조회
    * @param CtrTripSrcVo
    * @return List<CtrBizTripRstVo>
    * @author LeeYH
    * @since 2022.06.21.
    */
	public DayOffInfoVo selectCtrBizTripRstList(CtrTripSrcVo vo) throws ElException{	
		DayOffInfoVo retVo = new DayOffInfoVo();
		retVo.setDtList(tripDao.selectXomDtMst(vo));
		retVo.setOffList(tripDao.selectCtrBizTripRstList(vo));
		
		if(retVo.getOffList().size() == 0){
			// 기존 대체휴가원 삭제
			lappService.deleteCgsLapp(vo.getReq_no());
			
			// 기존 출장 휴일 관리 항목 삭제
			tripDao.deleteCtrBiztripRst(vo.getReq_no());
		}
		return retVo;
	}
	
	/**
    * 국내출장 운임  조회
    * @param List<CtrDomPathVo>
    * @return List<CtrDomPathVo>
    * @author LeeYH
    * @since 2022.06.22.
    */
	public List<CtrDomPathVo> selectFareFee(List<CtrDomPathVo> pathList) throws ElException{
		// search vo
		CtrTripSrcVo vo = new CtrTripSrcVo();
		vo.setPosi_clsf(pathList.get(0).getPosi_clsf());
		
		for(CtrDomPathVo pathVo : pathList){
			vo.setStart_region(pathVo.getStart_region());
			vo.setArriv_region(pathVo.getArriv_region());	
			
			CtrDomPathVo feeVo = tripDao.selectCtrDomPathTripFee(vo);
			pathVo.setRmk(feeVo.getRmk());
			pathVo.setBiztrip_fee(feeVo.getBiztrip_fee());					
		}
		
		return pathList;
	}
	
	/**
    * 기타경비 조회
    * @param CtrTripSrcVo
    * @return CtrDomFeeVo
    * @author LeeYH
    * @since 2022.06.23.
    */
	public CtrDomFeeVo selectEtcFee(CtrTripSrcVo vo) throws ElException{
		return tripDao.selectCtrBizTripFee(vo);		
	}
	
	/**
    * 국내출장 저장
    * @param CtrTripReqVo
    * @return CtrTripSrcVo
    * @author LeeYH
    * @since 2022.06.27.
    */
	public CtrTripSrcVo saveDomTrip(CtrTripReqVo vo) throws Exception{
		// return vo
		CtrTripSrcVo srcVo = new CtrTripSrcVo();
		
		// ---------------------------------------------------------
		// 01. 국내출장 기본정보 저장
		// ---------------------------------------------------------
		CtrDomTripVo tripVo = vo.getTripVo();
		String reqNo = tripVo.getReq_no();
		if("C".equals(tripVo.getCud_type())){
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "C86");
			tripVo.setReq_no(reqNo);
			
			if(tripDao.insertCtrDom(tripVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 저장"});
			}
			
			// TODO 결재
			String infoCd = "[" + tripVo.getBiztrip_goal_clsf_nm() + "]"
						+ tripVo.getBiztrip_goal() + "/"
						+ DateUtil.formatDate(tripVo.getBiztrip_start_ymd(), "-") + "~" + DateUtil.formatDate(tripVo.getBiztrip_cls_ymd(), "-") + "/"
						+ tripVo.getBiztrip_region() + "/"
						+ vo.getCompnVo().getBiztrip_psn_nm()
						;
			// 기업현장출장 분기처리
			if("FBV920".equals(tripVo.getBiztrip_goal_clsf())){
				apprFuncService.formInit(reqNo, "S951", "", infoCd);
			}else{
				apprFuncService.formInit(reqNo, "C320", "", infoCd);
			}			
			
		}else{
			if(tripDao.updateCtrDom(tripVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 수정"});
			}
		}
		
		if("Y".equals(tripVo.getNo_trvel_expns())){
			// 계정내역 삭제
			Map<String,String> map = new HashMap<String,String>();
			map.put("req_no", tripVo.getReq_no());
			tripDao.deleteCtrDomAccnt(map);
			
			// 원인행위 삭제
//			DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
//			enfrcVo.setReq_no(tripVo.getReq_no());
//			finComService.deleteBudEnfrcMnt(enfrcVo);
		}		

		// ---------------------------------------------------------
		// 02. 동반자 저장
		// ---------------------------------------------------------
		// 동반자 삭제
		tripDao.deleteCtrDomCompn(reqNo);
		
		// 출장자 저장
		CtrDomCompnVo psnVo = vo.getCompnVo();
		psnVo.setReq_no(reqNo);
		psnVo.setReq_seq(1);
		psnVo.setBiztrip_day(tripVo.getBiztrip_day());
		psnVo.setBiztrip_nght(tripVo.getBiztrip_nght());
		if(tripDao.insertCtrDomCompn(psnVo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 출장자 저장"});
		}
		
		// 동반자 저장
		int cnt = 2;
		if(vo.getCompnList() != null && vo.getCompnList().size() > 0){
			for(CtrDomCompnVo compnVo : vo.getCompnList()){			
				compnVo.setReq_no(reqNo);
				compnVo.setReq_seq(cnt);
				compnVo.setBiztrip_day(tripVo.getBiztrip_day());
				compnVo.setBiztrip_nght(tripVo.getBiztrip_nght());
				
				if(tripDao.insertCtrDomCompn(compnVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 동반자 저장"});
				}
				cnt++;
			}
		}

		// ---------------------------------------------------------
		// 03. 활동내역 저장
		// ---------------------------------------------------------
		// 활동내역 삭제
		tripDao.deleteCtrDomSched(reqNo);
		
		CtrDomSchedVo schdVo = null;
		for(int i=0; i< vo.getSchdList().size(); i++){
			schdVo = vo.getSchdList().get(i);
			schdVo.setReq_no(reqNo);
			schdVo.setOrd(i+1);
			
			if(tripDao.insertCtrDomSched(schdVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 활동내역 저장"});
			}
		}

		// ---------------------------------------------------------
		// 04. 출장경로 저장
		// ---------------------------------------------------------
		tripDao.deleteCtrDomPath(reqNo);
		
		CtrDomPathVo pathVo = null;
		for(int i=0; i<vo.getPathList().size(); i++){
			pathVo = vo.getPathList().get(i);
			pathVo.setReq_no(reqNo);
			pathVo.setOdr(i+1);
			
			if(tripDao.insertCtrDomPath(pathVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 출장경로 저장"});
			}
		}

		// ---------------------------------------------------------
		// 05. 계정내역 저장
		// ---------------------------------------------------------
		for(CtrDomAccntVo accntVo : vo.getAccntList()){
			if("C".equals(accntVo.getCud_type())){
				accntVo.setReq_no(reqNo);
				String rmk = tripVo.getBiztrip_region() + "/" 
							+ psnVo.getBiztrip_psn_nm() + "/" 
							+ tripVo.getBiztrip_start_ymd().substring(4,8) + "~" + tripVo.getBiztrip_cls_ymd().substring(4,8) + "/" 
							+ reqNo;
				accntVo.setRmk(rmk);
				
				if(tripDao.insertCtrDomAccnt(accntVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 계정내역 저장"});
				}
				
				// 예산통제모듈 호출
//				accntVo.setCu_tot_expns(0);
//				this.enfrcComBugt(tripVo, accntVo);	
			}else if("U".equals(accntVo.getCud_type())){
				tripDao.updateCtrDomAccnt(accntVo);
				
				// 예산통제모듈 호출				
				//this.enfrcComBugt(tripVo, accntVo);	
				
			}else if("D".equals(accntVo.getCud_type())){
				Map<String,String> map = new HashMap<String,String>();
				map.put("req_no", reqNo);
				map.put("req_seq", String.valueOf(accntVo.getReq_seq()));
				tripDao.deleteCtrDomAccnt(map);
				
				// 예산통제모듈 삭제
//				DelBblEnfrcVo delVo = new DelBblEnfrcVo();
//				delVo.setReq_no(accntVo.getReq_no());
//				delVo.setReq_seq(String.valueOf(accntVo.getReq_seq()));
//				finComService.deleteBudEnfrcMnt(delVo);
			}
		}

		// ---------------------------------------------------------
		// 06. 기업현장출장일 경우 방문처 저장
		// ---------------------------------------------------------
		if("FBV920".equals(tripVo.getBiztrip_goal_clsf())){
			// 방문처 삭제
			tripDao.deleteSptCtrBiztripVend(reqNo);
			
			SptCtrBizTripVendVo vstVo = null;
			for(int i=0; i< vo.getVstList().size(); i++){
				vstVo =  vo.getVstList().get(i);
				
				vstVo.setReq_no(reqNo);
				vstVo.setSeq(i+1);
				if(tripDao.insertSptCtrBiztripVend(vstVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"기업현장출장 방문처 저장"});
				} 
			}
		}

		// ---------------------------------------------------------
		// 07. 전자증빙 저장
		// ---------------------------------------------------------
		// 당일출장건에 대해서만 증빙저장
		// 국내출장신청서는 증빙 필요없음(2023.02.22) - 출장정산에서 증빙생성
//		if(tripVo.getBiztrip_day() == 1){
//			this.saveFspEvidAttach(reqNo);
//		}

		// ---------------------------------------------------------
		// 08. 근태: 근무일내역 저장
		// ---------------------------------------------------------
		// 출장 휴일/휴무일 관리 그리드상태저장
		if(vo.getOffList() != null && vo.getOffList().size() > 0){			
			this.saveHoliInfo(reqNo, vo.getOffList());
		}
		
		// 결재신청
		if(tripVo.isApproval()){
			this.approvalDomTripReq(vo);
		}
		
		srcVo.setReq_no(reqNo);
		return srcVo;
	}
	
	/**
    * 국내출장 예산통제모듈 호출
    * @param CtrDomTripVo, CtrDomAccntVo
    * @author LeeYH
    * @since 2022.06.27.
    */
	private void enfrcComBugt(CtrDomTripVo mstVo, CtrDomAccntVo vo) throws ElException{
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
		
		finComService.budEnfrcMnt01(enfrcVo);
		
		// 국내출장 계정내역에 통제번호 업데이트
		tripDao.updateCtrDomAccntCtrlNo(enfrcVo);
	}
	
	/**
    * 국내출장 전자증빙 저장
    * @param String reqNo
    * @author LeeYH
    * @since 2022.06.27.
    */
//	private void saveFspEvidAttach(String reqNo) throws ElException{
//		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
//		paramVo.setDoc_id("C86");
//		paramVo.setReq_no(reqNo);
//		
//		List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
//		for(FspEvidAttachVo evidVo : evidVoList){
//		    evidVo.setKey_val(reqNo);
//		}
//		attachService.saveFspEvidAttach(evidVoList);
//	}
	
	/**
    * 출장 휴일/휴무일 관리 그리드상태저장
    * @param String reqNo, List<CtrBizTripRstVo>
    * @author LeeYH
    * @since 2022.06.27.
    */
	private void saveHoliInfo(String reqNo, List<CtrBizTripRstVo> offList) throws Exception{		
		// 기존 대체휴가원 삭제
		lappService.deleteCgsLapp(reqNo);
		
		// 기존 출장 휴일 관리 항목 삭제
		tripDao.deleteCtrBiztripRst(reqNo);
		
		// 대체휴일 저장을 위한 List
		List<CgsSubHoliVo> holiList = new ArrayList<CgsSubHoliVo>();
		// 휴일/휴무일 관리 등록
		for(CtrBizTripRstVo vo : offList){
			if("CTD010".equals(vo.getRest_cd()) && !"".equals(vo.getHoliday_alt_day())){
				vo.setReq_no(reqNo);
				tripDao.insertCtrBiztripRst(vo);
				
				// 대체휴가원 저장을 위하여
				CgsSubHoliVo holiVo = new CgsSubHoliVo();
				holiVo.setCtr_req_no(reqNo);
				holiVo.setSyspayno(vo.getBiztrip_syspayno());
				holiVo.setSubs_date(vo.getHoliday_alt_day());
				
				holiList.add(holiVo);
			}else {
				vo.setReq_no(reqNo);
				tripDao.insertCtrBiztripRst(vo);
			}
		}
		
		// 휴가원 service 호출 - 대체휴일 휴가원 저장
		if (holiList.size() > 0) {
			lappService.registerSubsHoliday(holiList);
		}
	}
	
	/**
    * 국내출장 삭제
    * @param CtrTripSrcVo
    * @author LeeYH
    * @since 2022.06.29.
    */
	public void deleteDomTrip(CtrTripSrcVo vo) throws Exception{
		String aprState = ccsComDAO.selectAprState(vo.getReq_no());
		
		// 삭제 전 출장정산서가 작성되었는지 체크
		if("Y".equals(vo.getDel_flag())){
			if(tripDao.selectCtrDomAdCnt(vo.getReq_no()) > 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.ctr.0001", new String[]{vo.getReq_no()});
			}
		}
		
		if(aprState.matches("XAD005|XAD010|XAD013|XAD015")){
			// 출장정보 삭제
			if(tripDao.deleteCtrDom(vo.getReq_no()) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장정보 삭제"});
			} 
			// 출장 동반자정보 삭제
			tripDao.deleteCtrDomCompn(vo.getReq_no());
			
			// 국내출장 활동내역 삭제
			tripDao.deleteCtrDomSched(vo.getReq_no());
			
			// 국내출장 경로 삭제
			if(tripDao.deleteCtrDomPath(vo.getReq_no()) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 경로 삭제"});
			}
			
			// 계정내역 삭제
			Map<String,String> map = new HashMap<String,String>();
			map.put("req_no", vo.getReq_no());
			tripDao.deleteCtrDomAccnt(map);
			
			// 학술대회정보 삭제
			tripDao.deleteResConfPoolReq(vo.getReq_no());
			
			// 기업현장출장 삭제
			if("S14".equals(vo.getReq_no().substring(0,3))){
				tripDao.deleteSptCtrBiztripVend(vo.getReq_no());
			}
			
			// 기존 대체휴가원 삭제
			lappService.deleteCgsLapp(vo.getReq_no());
		
			// 기존 출장 휴일 관리 항목 삭제
			tripDao.deleteCtrBiztripRst(vo.getReq_no());
			
			// 전자증빙 삭제
//			FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
//			evidVo.setReq_no(vo.getReq_no());
//			attachService.deleteFspAttchEvid(evidVo);
			
			// 원인행위 삭제
//			DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
//			enfrcVo.setReq_no(vo.getReq_no());
//			finComService.deleteBudEnfrcMnt(enfrcVo);
			
			// 결재정보 삭제
			apprFuncService.formRemove(vo.getReq_no());
		}
	}
	
	/**
    * 국내출장, 근거리출장, 국내출장정산 결재신청전 체크
    * @param CheckSrcVo
    * @return CtrDomTripCheckVo
    * @author LeeYH
    * @since 2022.06.29.
    */
	public CtrDomTripCheckVo checkCtrDomTrip(CheckSrcVo vo) throws KitechException{
		CtrDomTripCheckVo retVo = null;
		
		try{
			// return vo
			retVo = new CtrDomTripCheckVo();
			
			// 아래의 검증을 위해 psnList setting
			String[] psns = vo.getBiztrip_psn_syspayno().split(",");
			List<BiztripPsnVo> psnList = new ArrayList<BiztripPsnVo>();
			for(String psn : psns){
				BiztripPsnVo psnVo = new BiztripPsnVo();
				psnVo.setBiztrip_psn_syspayno(psn);
				psnList.add(psnVo);
			}
			vo.setPsnList(psnList);
			
			// 근거리 출장여부
			String reqNoSub = vo.getReq_no().substring(0,3);
			
			//----------------------------------------------------------
			// 국내출장, 정산, 근거리출장 모두 체크
			//----------------------------------------------------------
			// 1) 정부수탁과제 참여여부 확인 
			if(vo.getAccnt_no() != null && !"".equals(vo.getAccnt_no())){
				String [] accntNos = vo.getAccnt_no().split(",");
				List<NoJoinPsnVo> noJoinList = new ArrayList<NoJoinPsnVo>();
				for(String accntNo : accntNos){
					vo.setAccnt_no(accntNo);
					noJoinList.addAll(tripDao.selectAccntMember(vo));
				}
		
				// 참여연구원은 삭제
				int lsize = noJoinList.size() -1;
				for(int i=lsize; i>=0; i--){
					if("적합".equals(noJoinList.get(i).getMan_yn().trim())){
						noJoinList.remove(i);
					}
				}
				
				if(noJoinList.size() > 0){
					retVo.setNoJoinList(noJoinList);
					retVo.setRst_val("no_join");
					return retVo;
				}
			}
			
			//----------------------------------------------------------
			// 국내출장, 근거리 출장에서 체크
			//----------------------------------------------------------
			List<PeriodDupVo> dupList = null;
			if(reqNoSub.matches("C86|C76")){
				// 2) 기간중복오류 검증
				dupList = tripDao.selectPeriodDup(vo);
				if(dupList != null && dupList.size() > 0){
					retVo.setPrdDupList(dupList);
					retVo.setRst_val("prd_dup");
					return retVo;
				}
				
				// 3) 출장목적이 강연/강의일 때 타업종사 등록여부확인
				if("FBV080".equals(vo.getGoal_clsf())){
					dupList = tripDao.selectOtherWork(vo);
					if(dupList != null && dupList.size() > 0){
						retVo.setPrdDupList(dupList);
						retVo.setRst_val("othr_wrk");
						return retVo;
					}
				}				
			}
			
			//----------------------------------------------------------
			// 국내출장에서 체크
			//----------------------------------------------------------
			if("C86".equals(reqNoSub)){
				// 4) 복명서 확인여부 (근거리 출장일 경우 체크하지 않음)
				dupList = tripDao.selectValidRep(vo);
				if(dupList != null && dupList.size() > 0){
					retVo.setPrdDupList(dupList);
					retVo.setRst_val("no_rep");
					return retVo;
				}
				
				// 5) 국내 출장 근무일 체크 및 표준근무제 시간외근무 체크조회 (근거리 출장일 경우 체크하지 않음)
				this.searchCtrDomTimeChk(vo);
			}	
			
			//----------------------------------------------------------
			// 국내출장정산에서 체크
			//----------------------------------------------------------
			if("C87".equals(reqNoSub)){
				int cnt = tripDao.selectCtrAirMileUseCnt(vo.getReq_no());
				if(cnt != psns.length){
					retVo.setRst_val("air_mile");
				}
			}		
			
			retVo.setRst_val("success");
		}catch(KitechException e){
			retVo.setRst_val("error");
			throw e;
		}
		return retVo;
	}
	
	/**
    * 국내출장 결재신청
    * @param CtrTripReqVo
    * @author LeeYH
    * @since 2022.07.29.
    */
	private void approvalDomTripReq(CtrTripReqVo vo) throws Exception{
		CtrDomTripVo tripVo = vo.getTripVo();
		CodeVo codeVo = CodeCacheManager.getInstance().getCode("FDO", tripVo.getCar_use_yn());		
		tripVo.setCar_use_yn(codeVo.getComNm());
		
		// 동반자수
		tripVo.setCompn_cnt(vo.getCompnList().size());
		
		String reqNo = tripVo.getReq_no();		
		
		// 출장내역 조회(저장시 계정내역을 안가지고 오는 경우도 있어서 다시 조회)
		vo.setAccntList(tripDao.selectCtrDomAccntList(reqNo));
		List<CtrDomAccntVo> accntList = vo.getAccntList();
		
		List<String> accntNos = new ArrayList<String>();
		
		for(CtrDomAccntVo accntVo : accntList){
			if(accntVo.getTot_expns() > 0){
				accntNos.add(accntVo.getAccnt_no());				
			}
		}
		
		AutoBugtVo autoVo = null;
		if(accntNos.size() > 0){
			// 예산통제자 및 자동통제여부 조회
			autoVo = new AutoBugtVo();
			autoVo.setReq_no(reqNo);
			autoVo = finComService.getAccntAutoBugtPsn(autoVo);
		}
		
		// 출장 결재문서 제목
		String infoCd = "[" + tripVo.getBiztrip_goal_clsf_nm() + "]"
						+ tripVo.getBiztrip_goal() + "/"
						+ DateUtil.formatDate(tripVo.getBiztrip_start_ymd(), "-") + "~" + DateUtil.formatDate(tripVo.getBiztrip_cls_ymd(), "-") + "/"
						+ tripVo.getBiztrip_region() + "/"
						+ vo.getCompnVo().getBiztrip_psn_nm()
						;
		
		AprVo aprVo = new AprVo();
		aprVo.setMainKey(reqNo);
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(reqNo);
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		if("FBV920".equals(tripVo.getBiztrip_goal_clsf())){
			aprVo.setUiId("S951");
		}else{
			aprVo.setUiId("C320");
		}
		
		aprVo.setRegion(tripVo.getFomat_unit());
		// 출장비 없음 체크 해제 상태이고 1일 출장, 출장비 없음 체크 상태, 출장비 자체가 0원 => (Y), 나머지 경우 => (N)
		if("Y".equals(tripVo.getNo_trvel_expns()) || tripVo.getTot_expns() == 0){
			aprVo.setNoMoney("Y");
		}else{
			aprVo.setNoMoney("N");
		}
		aprVo.setInfoCd(infoCd);
		aprVo.setExt1Cd(String.join(",",  accntNos));
		aprVo.setAccountCharger((autoVo == null)?"": autoVo.getAccnt_rspns());
		//aprVo.setResearcher((autoVo == null)?"": autoVo.getAccnt_rspns()); // 계정책임자
		//aprVo.setBudgetController((autoVo == null)?"": autoVo.getBugt_ctrl_psn()); // 예산통제자
		//aprVo.setAutoControlYn((autoVo == null)?"": autoVo.getBugt_auto_yn()); // 예산자동통제유무
		// TODO
		aprVo.setBudgetController("");
		aprVo.setAutoControlYn("");		
		
		aprVo.setResearcher((autoVo == null)?"": autoVo.getAccnt_rspns()); // 계정책임자
		aprVo.setRuleType("ADR040"); // 전결구분: 금액기준
		
		// 출장기간 중 휴일에 업무가 포함되어 있다면 (Y) 그 외 (N)
		String holiDay = "N";
		List<CtrBizTripRstVo> offList = vo.getOffList();
		for(CtrBizTripRstVo offVo : offList){
			if("CTD010".equals(offVo.getRest_cd())){
				holiDay = "Y";
			}
		}
		aprVo.setHoliday(holiDay);
		// 업무:20, 업무미포함:10
		if("Y".equals(holiDay)){
			aprVo.setRuleMoney("20");
		}else{
			aprVo.setRuleMoney("10");
		}
		
		// 당일출장 여부
		aprVo.setOneDay((tripVo.getBiztrip_nght() > 0)? "N" : "Y");
		aprVo.setTripGoal(tripVo.getBiztrip_goal_clsf()); // 기업현장출장 결재구분으로 인해 출장목적 코드 추가
		
		if(!"".equals(tripVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(tripVo.getAttach_file_no()));
		}		
		apprFuncService.approvalRequest(aprVo, vo);		
	}
	
	/**
    * 출장자 중에 이공계인턴쉽이 있는경우 (posi_cd = 353010) 월중 출장비 지급내역
    * @param CtrTripReqVo
    * @return List<CtrDomPayVo>
    * @author LeeYH
    * @since 2022.08.03.
    */
	public List<CtrDomPayVo> selectCtrDomPayPosi(CtrTripSrcVo vo) throws ElException{
		return tripDao.selectCtrDomPayPosi(vo);
	}	
	
	/**
    * 국내 출장 근무일 체크 및 표준근무제 시간외근무 체크조회
    * @param CheckSrcVo
    * @author LeeYH
    * @since 2022.08.05.
    */
	private void searchCtrDomTimeChk(CheckSrcVo vo) throws ElException{
		List<CtrDomCompnVo> compnList = tripDao.selectCtrDomCompnList(vo.getReq_no());
		
		// 1) 국내 출장 근무일 체크
		//this.executeCtrDomeTripWorkTimeChk(vo, compnList);
		
		// 2) 표준근무제 시간외근무 체크조회
		for(CtrDomCompnVo compnVo : compnList){			
			if("HWT030".equals(compnVo.getCommute_cd())){ // HWT030 표준근무제
				vo.setBiztrip_psn_syspayno(compnVo.getBiztrip_psn_syspayno());
				
				if("t".equals(tripDao.selectStdWrkTimeChk(vo))){
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.ctr.0002"); //표준근무제 직원이 휴일에 업무로 출장을 가는 경우 \n시간외근무신청을 우선 상신하여야 합니다.
				}
			}
		}
	}
	
	/**
    * 국내 출장 근무일 체크
    * @param CheckSrcVo List<CtrDomCompnVo>
    * @author LeeYH
    * @since 2022.08.05.
    */
	private void executeCtrDomeTripWorkTimeChk(CheckSrcVo vo, List<CtrDomCompnVo> compnList) throws ElException{
		int holiDayCnt = 0;
		int totDayCnt = 0;		
		
		String toDay = DateUtil.getCurrentDate();
		if (!toDay.substring(6, 8).equals("01")) {
			toDay = DateUtil.addDay(toDay, -1);
			
			vo.setYmd(toDay);
		}
		
		// 휴무내역 조회
		CtrTripSrcVo srcVo = new CtrTripSrcVo();
		srcVo.setReq_no(vo.getReq_no());
		srcVo.setFrom_ymd(vo.getBiztrip_start_ymd());
		srcVo.setTo_ymd(vo.getBiztrip_cls_ymd());
		List<CtrBizTripRstVo> offList = tripDao.selectCtrBizTripRstList(srcVo);
		
		for(CtrDomCompnVo compnVo : compnList){
			boolean chkFlag = true;		
			
			if(compnVo.getCommute_cd().matches("HWT010|HWT040|HWT050")){ // HWT010 비관리, HWT040 시간선택제, HWT050 비상근근무제
				totDayCnt = 0;
			}else{
				vo.setCommute_cd(compnVo.getCommute_cd());
				// 전체일수, 휴무일수 조회
				BizTripHoliCntVo cntVo = ccsComDAO.selectBiztripHoliDayCnt(vo);
				holiDayCnt = cntVo.getHoliDayCnt();
				totDayCnt = cntVo.getTotCnt();
			}
			
			if(totDayCnt == 0) continue;			
			
			int offCnt = 0;
			for(CtrBizTripRstVo offVo : offList){
				if(offVo.getBiztrip_syspayno().equals(compnVo.getBiztrip_psn_syspayno()) && "CTD010".equals(offVo.getRest_cd())){
					offCnt++;
				}
			}
			
			// 근무시간현황 개괄 정보 조회
			vo.setSyspayno(compnVo.getBiztrip_psn_syspayno());
			WorkTimeVo timeVo = ccsComDAO.selectCwsWorkTimeStatus(vo);				
			
			if(timeVo == null) continue;
			
			if(timeVo.getCommute_cd().matches("HWT010|HWT050") && "HWGX02".equals(timeVo.getExcept_cd())){
				chkFlag = false;
			}
			
			if(totDayCnt - (holiDayCnt + offCnt) == 0){
				chkFlag = false;
			}
			
			if(!chkFlag) continue;
			
			int dayCnt = totDayCnt - holiDayCnt;
			int target_min = timeVo.getTarget_min() + timeVo.getExtend_min();
			int cur_work_min = timeVo.getCur_work_min() - timeVo.getCtr_extend_min();
			int total_min = 0;
			
			if("HWT020".equals(compnVo.getCommute_cd())){
				total_min = (dayCnt * 300) + (offCnt * 480) + cur_work_min + timeVo.getWll_remain_min();
			}else{
				total_min = (dayCnt * 480) + (offCnt * 480) + cur_work_min;
			}
			
			if(target_min < total_min) {
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.ctr.0003", new String[]{timeVo.getEmpnm()});
			}
		}		
	}
	
	/**
    * 국내출장 저장(결재 후 담당자 저장) - 출장신청 일부내용과 활동내역만 저장가능
    * @param CtrTripReqVo
    * @return CtrTripSrcVo
    * @author LeeYH
    * @since 2023.05.17.
    */
	public void saveDomTripPostApr(CtrTripReqVo vo) throws ElException{
		
		// ---------------------------------------------------------
		// 01. 국내출장 기본정보 저장
		// ---------------------------------------------------------
		CtrDomTripVo tripVo = vo.getTripVo();
		String reqNo = tripVo.getReq_no();
		tripDao.updateCtrDomPostApr(tripVo);		

		// ---------------------------------------------------------
		// 02. 활동내역 저장
		// ---------------------------------------------------------
		// 활동내역 삭제
		tripDao.deleteCtrDomSched(reqNo);
		
		CtrDomSchedVo schdVo = null;
		for(int i=0; i< vo.getSchdList().size(); i++){
			schdVo = vo.getSchdList().get(i);
			schdVo.setReq_no(reqNo);
			schdVo.setOrd(i+1);
			
			if(tripDao.insertCtrDomSched(schdVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"국내출장 활동내역 저장"});
			}
		}		
	}
}
