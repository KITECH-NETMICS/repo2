package kr.re.kitech.biz.res.exc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillUpdVo;
import kr.re.kitech.biz.res.com.dao.ResCommDAO;
import kr.re.kitech.biz.res.com.vo.ResPrjInfoVo;
import kr.re.kitech.biz.res.exc.dao.ResDepstMntDAO;
import kr.re.kitech.biz.res.exc.service.ResDepstMntService;
import kr.re.kitech.biz.res.exc.service.ResDepstReqService;
import kr.re.kitech.biz.res.exc.vo.ResBgDepstMntVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRectlVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRecveVo;
import kr.re.kitech.biz.res.exc.vo.ResDemndReqVo;
import kr.re.kitech.biz.res.exc.vo.ResDepstAmtChkVo;
import kr.re.kitech.biz.res.exc.vo.ResDepstDetlVo;
import kr.re.kitech.biz.res.exc.vo.ResExcSlipCancelVo;
import kr.re.kitech.biz.res.exc.vo.ResExcSrcVo;
import kr.re.kitech.biz.res.exc.vo.ResRepaySlipVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**
 * @ClassSubJect 연구비입금관리 ServiceImpl
 * @Class Name ResDepstMntServiceImpl.java
 * @Description 연구비입금관리 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/04/25      이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/04/25
 * @version 1.0
 * @see
 * 
 */
@Service("resDepstMntService")
public class ResDepstMntServiceImpl extends EgovAbstractServiceImpl implements ResDepstMntService {
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="resDepstReqService")
	private ResDepstReqService resDepstService;
	
	@Resource(name="resDepstMntDAO")
	private ResDepstMntDAO dao;
	
	@Resource(name="resCommDAO")
	private ResCommDAO comDao;
	
	@Resource(name="attachDAO")
	private AttachDAO attachDao;
	
	/**
     * 연구비 입금관리 목록 조회
     * @param ResExcSrcVo
     * @return List<ResBgDepstMntVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.19.
     */
	public List<ResBgDepstMntVo> selectResBgDepstMntList(ResExcSrcVo vo) throws KitechException{
		return dao.selectResBgDepstMntList(vo);
	}
	
	/**
     * 연구비 입금관리 상세조회(과제정보 및 입금예정관리 조회)
     * @param ResExcSrcVo
     * @return ResDepstDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.19.
     */
	public ResDepstDetlVo selectResDepstDetlInfo(ResExcSrcVo vo) throws KitechException{
		ResDepstDetlVo retVo = new ResDepstDetlVo();
		// 입금 결재신청번호로 조회시 먼저 계정번호를 찾는다.
		if(vo.getReq_no() != null && !"".equals(vo.getReq_no())){
			vo = dao.selectResBgRectlAccntNo(vo.getReq_no());
			
			retVo.setRectlList(dao.selectResBgRectlList(vo));
		}
		// 01.계정정보 조회
		retVo.setPrjVo(this.getResDepstPrjInfo(vo.getAccnt_no()));
		
		// 02. 입금예정정보 조회
		retVo.setRecvList(dao.selectResBgRecveList(vo.getAccnt_no()));
		
		return retVo;
	}
	
	/**
     * 연구비 입금관리 과제정보 조회
     * @param String
     * @return ResPrjInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.19.
     */
	private ResPrjInfoVo getResDepstPrjInfo(String accntNo) throws KitechException{
		ResPrjInfoVo prjVo = comDao.selectResComPrjInfo(accntNo);
		
		// 입금연구비(부가세포함) 계산
		long totReschCashAmt = prjVo.getTot_resch_cash_amt();
		if("FTX001".equals(prjVo.getTax_cd())){ // 과세계정인 경우
			if(prjVo.getTot_goods_amt() == 0){
				totReschCashAmt += prjVo.getTax_amt();
			}else{
				totReschCashAmt += Math.round(prjVo.getTot_resch_cash_amt() * 0.1);
			}
		}
		// 통합이지바로과제 협약예산(위탁연구비) 조회
		if("FAJ007".equals(prjVo.getCard_use_ex())){		
			long agreeAmt = dao.selectResBgAgreeTotAmt(prjVo);
			totReschCashAmt = totReschCashAmt - agreeAmt; // 현금(부가세포함)연구비 - 위탁연구비
		}
		prjVo.setTot_resch_cash_tax_amt(totReschCashAmt);
		
		return prjVo;
	}
	
	/**
     * 연구비입금내역정보 조회
     * @param ResExcSrcVo
     * @return List<ResBgRectlVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.20.
     */
	public List<ResBgRectlVo> selectResBgRectlList(ResExcSrcVo vo) throws KitechException{
		return dao.selectResBgRectlList(vo);
	}
	
	/**
     * 연구비입금관리 상세 저장
     * @param ResDepstDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.21.
     */
	public void saveResBgRecvDetail(ResDepstDetlVo vo) throws KitechException{
		// 01.입금예정내역
		List<ResBgRecveVo> recvList = vo.getRecvList();		
		if(recvList != null && recvList.size() > 0){
			for(ResBgRecveVo recVo : recvList){
				if("D".equals(recVo.getCud_type())){
					if(dao.selectResBgRectlDelYn(recVo) > 0){
						throw new KitechException(Exceptions.ALERT, Business.RES, "message.alert.res.exc.0001");
					}
					
					dao.deleteResBgRecve(recVo);
				}else{
					// 입금예정내역 저장 					
					dao.mergeResBgRecve(recVo);
				}
			}
		}
		
		// 02.입금상세내역
		List<ResBgRectlVo> rectlList =vo.getRectlList();
		if(rectlList != null && rectlList.size() > 0){
			for(ResBgRectlVo rectlVo : rectlList){
				if("C".equals(rectlVo.getCud_type())){
					dao.insertResBgRectl(rectlVo);
				}else if("U".equals(rectlVo.getCud_type())){
					dao.updateResBgRectl(rectlVo);
				}else if("D".equals(rectlVo.getCud_type())){
					dao.deleteResBgRectl(rectlVo);
				}
			}
		}
	}
	
	/**
     * 연구비청구의뢰 조회
     * @param ResExcSrcVo
	 * @return ResDepstDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.21.
     */
	public ResDepstDetlVo selectResDemndReq(ResExcSrcVo vo) throws KitechException{
		ResDepstDetlVo retVo = new ResDepstDetlVo();
		// 청구의뢰 조회
		retVo.setDemndVo(dao.selectResDemndReq(vo));
		if(vo.getReq_no() != null && !"".equals(vo.getReq_no())){	
			vo.setAccnt_no(retVo.getDemndVo().getAccnt_no());
		}
		
		// 계정정보 조회
		retVo.setPrjVo(this.getResDepstPrjInfo(vo.getAccnt_no()));
		
		return retVo;
	}

	/**
     * 연구비청구의뢰 저장
     * @param ResDemndReqVo
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.25.
     */
	public String saveResDemndReq(ResDemndReqVo vo) throws Exception{
		String reqNo = vo.getReq_no();
		// 01. 청구의뢰 저장
		if(reqNo == null || "".equals(reqNo)){
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "R08");
			vo.setReq_no(reqNo);
			
			dao.insertResDemndReq(vo);
			
			// 인터페이스 저장
			apprFuncService.formInit(reqNo, "RF42", KitechContextUtil.getUserId(), vo.getAccnt_no_nm());	
			
			// 전자증빙
			List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList("R08", ""); 
			
			for(FspEvidAttachVo attachVo : evidVoList){
				attachVo.setReq_no(reqNo);
			    attachVo.setKey_val(reqNo);
			}
			attachService.saveFspEvidAttach(evidVoList);
			
		}else{
			dao.updateResDemndReq(vo);
		}
		
		// 02. 입금상세 수정
		dao.updateResBgRectlDemnd(vo);
		
		// 03. 계산서테이블에 신청번호 저장
		FtxBillUpdVo updVo = new FtxBillUpdVo();
		updVo.setBill_no(vo.getBill_no());
		updVo.setReq_no(reqNo);
		updVo.setDepst_odr(vo.getDepst_odr());
		dao.updateFtxBillHIssuReq(updVo);
		
		// 결재신청
		if(vo.isApproval()){			
			// 결의번호가 있을 경우 삭제
			if(vo.getUnslip_no() != null && !"".equals(vo.getUnslip_no())){
				resDepstService.deleteDemndReqSlipMnt(vo.getUnslip_no(), vo.getReq_no());
			}			
			this.approvalResDemndReq(vo);
		}
		
		return reqNo;
	}
	
	/**
     * 연구비청구의뢰 저장
     * @param ResDemndReqVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.25.
     */
	public void deleteResDemndReq(ResDemndReqVo vo) throws KitechException{
		// 01. 결의서 삭제
		if(vo.getUnslip_no() != null && !"".equals(vo.getUnslip_no())){
			resDepstService.deleteDemndReqSlipMnt(vo.getUnslip_no(), vo.getReq_no());
		}
		
		// 02. 연구비 청구의뢰 삭제
		dao.deleteResDemndReq(vo.getReq_no());
		
		// 03. 연구비입금상세 청구의뢰내용 초기화
		vo.setReq_no("");
		vo.setBill_no("");
		dao.updateResBgRectlDemnd(vo);
		
		// 04. 전자증빙 삭제
		attachService.deleteFspAttchEvid(vo.getReq_no());
	}	
	
	/**
     * 연구비청구의뢰 결재신청
     * @param ResDemndReqVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private void approvalResDemndReq(ResDemndReqVo reqVo) throws Exception{
		ResDepstDetlVo vo = new ResDepstDetlVo();
		vo.setDemndVo(reqVo);
		
		// 계정정보
		ResPrjInfoVo prjVo = this.getResDepstPrjInfo(reqVo.getAccnt_no());
		vo.setPrjVo(prjVo);
		
		// 결의생성
		resDepstService.createResDemndSlip(reqVo, prjVo);		
		
		// 첨부파일
		if(reqVo.getAttach_file_no() != null && !"".equals(reqVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(reqVo.getAttach_file_no()));
		}
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(reqVo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setUiId("RF42");
		aprVo.setResearchCharger(prjVo.getCurr_resch_rspns());
		aprVo.setInfoCd(prjVo.getAccnt_no_nm());
		aprVo.setExt1Cd(prjVo.getAccnt_no());
		
		// 결재프로세스 호출
		apprFuncService.approvalRequest(aprVo, vo);
	}	
	
	/**
     * 미수반제신청 조회
     * @param ResExcSrcVo
	 * @return ResDepstDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	public ResDepstDetlVo selectResRepayReq(ResExcSrcVo vo) throws KitechException{
		ResDepstDetlVo retVo = new ResDepstDetlVo();
		if((vo.getReq_no() != null && !"".equals(vo.getReq_no())) || (vo.getDepst_req_no() != null && !"".equals(vo.getDepst_req_no()))){
			List<FcpDepstReqVo> depstList = dao.selectFcpDepstReqList(vo);
			
			vo.setDemnd_req_no(depstList.get(0).getDemnd_req_no());
			
			retVo.setDepstList(depstList);
		}		
		
		// 청구의뢰정보조회
		retVo.setDemndVo(dao.selectResDemndForRepay(vo));
		return retVo;
	}
	
	/**
     * 연구비 반제신청 저장
     * @param ResDepstDetlVo
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.09.
     */
	public String saveRepayReqMnt(ResDepstDetlVo vo) throws KitechException{
		// 청구정보
		ResDemndReqVo demndVo = vo.getDemndVo();
		List<FcpDepstReqVo> depstList = vo.getDepstList();
		String reqNo = "";

		for(FcpDepstReqVo depstVo : depstList){	
			
			if("C".equals(depstVo.getCud_type())){
				reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F42");
				
				depstVo.setAccnt_no(demndVo.getAccnt_no());				
				depstVo.setDemnd_bill_no(demndVo.getBill_no());
				depstVo.setDepst_ymd(depstVo.getAcct_txday());
				depstVo.setDepst_clsf(demndVo.getDepst_clsf());
			
				depstVo.setReq_no(reqNo);	
				
			}else{
				reqNo = depstVo.getReq_no();
			}
			
			// 입금의뢰(fcpdepstreq) 저장
			resDepstService.saveFcpDepstReq(depstVo);	
			
			// 연구비 입금상세내역(resbgrectl) 수정	
			depstVo.setDemnd_req_no(demndVo.getReq_no());	
			dao.mergeResBgRectl(depstVo);		
		}
		
		// 입금관리(resbgrecve) 수정
		ResBgRecveVo recVo = new ResBgRecveVo();
		recVo.setAccnt_no(demndVo.getAccnt_no());
		recVo.setDepst_odr(demndVo.getDepst_odr());
		recVo.setOfic_depst_ymd(depstList.get(0).getDepst_ymd());
		dao.updateResBgRecve(recVo);
		
		// 청구의뢰 반제금액 수정 // 2023.10.26. 주석(굳이 반제금액 입력 필요하지 않을듯)
		// resDepstService.updateUnslipRepayAmt(demndVo.getSlip_no(), demndVo.getSlip_odr(), depstLiqSum, bfDepstLiqSum, "");
		
		return reqNo;
	}
	
	/**
     * 연구비 반제신청,입금의뢰 결재신청
     * @param ResDepstDetlVo
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.09.
     */
	public String approvalResDepstReq(ResDepstDetlVo vo) throws Exception{
		List<ResBgRectlVo> rectlList = vo.getRectlList();
		ResPrjInfoVo prjVo = vo.getPrjVo();
		
		String reqNo = rectlList.get(0).getReq_no();
		String demndReqNo = rectlList.get(0).getDemnd_req_no();
		
		// 과세 계정일 경우 연구비 공급가액, 세액과의 일치 체크
		if("FTX001".equals(prjVo.getTax_cd())){
			ResDepstAmtChkVo chkVo = dao.selectDepstAmtCheck(prjVo.getAccnt_no());
			if(chkVo != null){
				if(prjVo.getTot_resch_cash_amt() - chkVo.getSuply_value() < 1000){
					if(prjVo.getTot_resch_cash_amt() != chkVo.getSuply_value() || prjVo.getTax_amt() != chkVo.getTaxamt()){
						throw new KitechException(Exceptions.ALERT, Business.RES, "message.alert.res.exc.0005", new String[]{String.valueOf(prjVo.getTot_resch_cash_amt()), String.valueOf(chkVo.getSuply_value())});
					}
				}
			}
		}
		
		//=============================================================		
		// 신청번호가 없을 경우 신청번호를 가져오고, 결재인터페이스를 저장한다.
		//=============================================================		
		if(reqNo == null || "".equals(reqNo)){
			// R09 미수반제신청, R05 입금의뢰 결재신청번호
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), (demndReqNo == null || "".equals(demndReqNo.trim()))? "R05": "R09");
			// 01. 결재 인터페이스 저장
			apprFuncService.formInit(reqNo, "RF44", KitechContextUtil.getUserId(), prjVo.getAccnt_no_nm());			
			
			// 02. 전자증빙	
			String docId = reqNo.substring(0,3);
			List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList(docId, "");
			for(FspEvidAttachVo attachVo : attachList){
				switch(attachVo.getEvid_item_cd()){
					case "F080" : // 계정원장상세
						attachVo.setReq_no(reqNo);
						// accnt_cd,accnt_no,start_ymd,end_ymd, ramt_mngmt(2023.12.08. 추가)
						attachVo.setKey_val("11117010," + prjVo.getAccnt_no() + "," + rectlList.get(0).getAccnt_ymd() + "," + rectlList.get(0).getAccnt_ymd() + "," + prjVo.getAccnt_no());
						break;
					case "R012" : // 미수반제신청/연구비미수반제신청
						attachVo.setReq_no(reqNo);
						attachVo.setKey_val(reqNo);
						break;
					case "R007" : // 연구비입금의뢰서
						attachVo.setReq_no(reqNo);
						attachVo.setKey_val(reqNo);
						break;
				}
			}
			
			attachService.saveFspEvidAttach(attachList);
		}
		
		// 02. 입금상세내역 결재신청번호
		for(ResBgRectlVo rectlVo : rectlList){
			rectlVo.setReq_no(reqNo);
			dao.updateResBgRectl(rectlVo);
		}			
		
		//=============================================================		
		// 03. 연구비반제 결재신청 청구정보 조회
		//=============================================================
		boolean lastDepstYn = false;	
		ResExcSrcVo srcVo = new ResExcSrcVo();
		if("R09".equals(reqNo.substring(0,3))){
			srcVo.setReq_no(reqNo);
			srcVo.setDemnd_req_no(demndReqNo);
			vo.setDemndVo(dao.selectResRepayDemndApr(srcVo));
			// 통프 종료여부
			AppLog.info("\n ------------------- 연구비입금의뢰 결재 getDemndVo : " + vo.getDemndVo());
			if(vo.getDemndVo().getDepst_odr() == vo.getDemndVo().getMax_depst_odr()){
				lastDepstYn = true;
			}
		}else{
			srcVo.setReq_no(reqNo);
			srcVo.setAccnt_no(prjVo.getAccnt_no());
			srcVo.setDepst_odr(rectlList.get(0).getDepst_odr());
			vo.setRecVo(dao.selectResBgRecveApr(srcVo));
			AppLog.info("\n ------------------- 연구비입금의뢰 결재 resbgrecve : " + vo.getRecVo());
			if(vo.getRecVo().getDepst_odr() == vo.getRecVo().getMax_depst_odr()){
				lastDepstYn = true;
			}
		}
		
		String unslipNo = rectlList.get(0).getUnslip_no();
		String slipYmd = rectlList.get(0).getSlip_ymd();
		
		//=============================================================		
		// 04. 결의생성
		//=============================================================
		// 결의서가 존재하는 경우 결의서 삭제를 먼저 한다.
		if(unslipNo != null && !"".equals(unslipNo.trim()) ){
			resDepstService.deleteDepstReqSlipMnt(unslipNo, reqNo);
		}
			
		ResRepaySlipVo slipVo = new ResRepaySlipVo();
		slipVo.setReq_no(reqNo);
		slipVo.setSlip_ymd(slipYmd);
		if("R09".equals(reqNo.substring(0,3))){
			slipVo.setRmk("연구비청구입금" + "/" + prjVo.getAccnt_no());
			unslipNo = resDepstService.createResRepayReqSlip(slipVo);
		}else{
			slipVo.setRmk("연구비입금");
			unslipNo = resDepstService.createResDepstReqSlip(prjVo, slipVo);
		}
		
		for(ResBgRectlVo rectlVo : rectlList){
			rectlVo.setUnslip_no(unslipNo);
			
			// 결재를 위해 입금구분(RDE)명 셋팅
			rectlVo.setDepst_clsf(CodeCacheManager.getInstance().getCode("RDE", rectlVo.getDepst_clsf()).getComNm());
		}	
		
		//=============================================================		
		// 05. 결재신청
		//=============================================================		
		// 05-1. 첨부파일 셋팅
		List<AttachVo> fileList = new ArrayList<>();
		for(ResBgRectlVo rectlVo : rectlList){			
			if(rectlVo.getAttach_file() != null && !"".equals(rectlVo.getAttach_file())){
				if(fileList.size() == 0){
					fileList = attachDao.selectListAttach(rectlVo.getAttach_file());
				}else{
					fileList.addAll(attachDao.selectListAttach(rectlVo.getAttach_file()));
				}
			}
		}		
		vo.setFileList(fileList);
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(reqNo);
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setUiId("RF44");
		aprVo.setResearchCharger(prjVo.getCurr_resch_rspns());
		// resbgrecve의 마지막 입금건일 경우에만 통프종료(2023.07.21.)
		AppLog.info("\n ------------------- 연구비입금의뢰 결재 lastDepstYn : " + lastDepstYn);
		AppLog.info("\n ------------------- 연구비입금의뢰 결재 bsns_req_no : " + prjVo.getBsns_req_no());
		if(lastDepstYn){
			aprVo.setMainKey(prjVo.getBsns_req_no());
		}
		aprVo.setInfoCd(prjVo.getAccnt_no_nm());
		aprVo.setExt1Cd(prjVo.getAccnt_no());
		aprVo.setExt1Cd(prjVo.getCurr_resch_rspns());
		
		apprFuncService.approvalRequest(aprVo, vo);
		
		return reqNo;
	}	
	
	/**
     * 연구비 반제신청 삭제
     * @param ResDepstDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.09.
     */
	public void deleteRepayReqMnt(ResDepstDetlVo vo) throws KitechException{
		// 청구정보
		ResDemndReqVo demndVo = vo.getDemndVo();
		List<FcpDepstReqVo> depstList = vo.getDepstList();
		
		// 결재신청번호
		String aprReqNo = depstList.get(0).getApr_req_no();		
		// 01. 결의서, 잔액정산, 인터페이스 삭제
		String unslipNo = depstList.get(0).getUnslip_no();	
		if(unslipNo != null && !"".equals(unslipNo.trim())){
			resDepstService.deleteDepstSlipAndReq(unslipNo);
		}else{
			// 청구의뢰 반제금액 수정(청구의뢰 중 위탁기관일 경우 공급가는 rcms, 부가세만 연구비로 반제하는 경우가 있어서 반제금액을 청구금액 -> 입금의뢰금액으로 변경)
			// 2023.11.21. 청구금액은 반제없이 결의생성시 바로 정산하도록 수정해서 아래로직 필요없어 주석처리
//			long repayAmt = 0;
//			for(FcpDepstReqVo depstVo : depstList){	
//				repayAmt += depstVo.getDepst_liq();
//			}
//			resDepstService.updateUnslipRepayAmt(demndVo.getSlip_no(), demndVo.getSlip_odr(), repayAmt, 0, "D");
		}
		
		// 02. 입금의뢰 삭제
		int cnt = 0;
		ResBgRectlVo rectlVo = null;
		for(FcpDepstReqVo depstVo : depstList){	
			resDepstService.deleteDepstReq(depstVo);	
			
			// 03. 입금상세 수정
			rectlVo = new ResBgRectlVo();
			rectlVo.setAccnt_no(depstVo.getAccnt_no());
			rectlVo.setDepst_odr(depstVo.getDepst_schdl_seq());	
			rectlVo.setOdr(depstVo.getDepst_schdl_detls_seq());
			
			if(cnt == 0){
				rectlVo.setOfic_depst_amt(0);
				rectlVo.setOfic_depst_ymd("");
				rectlVo.setBankaccnt_no("");
				rectlVo.setUnslip_no("");
				rectlVo.setDepst_req_no("");
				rectlVo.setReq_no("");
				rectlVo.setDepst_state("RDF002");
				
				dao.updateResBgRectl(rectlVo);	
			}else{
				// 입금상세 순번이 1인것만 빼고 모두 삭제한다.(같은 청구번호일때)
				dao.deleteResBgRectl(rectlVo);
			}	
			cnt++;
		}
		
		// 04. 입금관리(resbgrecve) 수정
		ResBgRecveVo recVo = new ResBgRecveVo();
		recVo.setAccnt_no(demndVo.getAccnt_no());
		recVo.setDepst_odr(demndVo.getDepst_odr());
		dao.updateResBgRecve(recVo);		
		
		// 05. 결재스냅샷 삭제
		if(aprReqNo != null && !"".equals(aprReqNo.trim())){
			// 05-1. 전자증빙삭제
			attachService.deleteFspAttchEvid(aprReqNo);
		
			apprFuncService.formRemove(aprReqNo);
		}
	}
	
	/**
     * 연구비 입금의뢰 저장
     * @param FcpDepstReqVo
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.18.
     */
	public String saveResDepstReq(List<FcpDepstReqVo> depstList) throws KitechException{
		String reqNo = "";
		for(FcpDepstReqVo vo : depstList){
			reqNo = vo.getReq_no();
			if("C".equals(vo.getCud_type())){
				reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "R01");
				vo.setReq_no(reqNo);
			}
			
			// 01.입금의뢰(fcpdepstreq) 저장
			vo.setDepst_ymd(vo.getAcct_txday());
			resDepstService.saveFcpDepstReq(vo);	
			
			// 02. 입금관리상세 수정
			dao.mergeResBgRectl(vo);
		}
		
		// 03.입금관리(resbgrecve) 수정
		ResBgRecveVo recVo = new ResBgRecveVo();
		recVo.setAccnt_no(depstList.get(0).getAccnt_no());
		recVo.setDepst_odr(depstList.get(0).getDepst_schdl_seq());
		recVo.setOfic_depst_ymd(depstList.get(0).getDepst_ymd());
		dao.updateResBgRecve(recVo);
		
		return reqNo;
	}
	
	/**
     * 연구비 입금의뢰 삭제
     * @param ResDepstDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.09.
     */
	public void deleteResDepstReq(List<FcpDepstReqVo> depstList) throws KitechException{
		// 결재신청번호
		String aprReqNo = depstList.get(0).getApr_req_no();		
		// 01. 결의서, 잔액정산, 인터페이스 삭제
		String unslipNo = depstList.get(0).getUnslip_no();	
		if(unslipNo != null && !"".equals(unslipNo.trim())){
			resDepstService.deleteDepstSlipAndReq(unslipNo);
		}
		
		// 02. 입금의뢰 삭제
		int cnt = 0;
		ResBgRectlVo rectlVo = null;
		for(FcpDepstReqVo depstVo : depstList){	
			if(!"".equals(depstVo.getRecv_bill_no())){
				throw new KitechException(Exceptions.ALERT, Business.RES, "message.alert.res.exc.0004");
			}
			resDepstService.deleteDepstReq(depstVo);	
			
			// 03. 입금상세 수정
			rectlVo = new ResBgRectlVo();
			rectlVo.setAccnt_no(depstVo.getAccnt_no());
			rectlVo.setDepst_odr(depstVo.getDepst_schdl_seq());	
			rectlVo.setOdr(depstVo.getDepst_schdl_detls_seq());
			
			if(cnt == 0){
				rectlVo.setOfic_depst_amt(0);
				rectlVo.setOfic_depst_ymd("");
				rectlVo.setBankaccnt_no("");
				rectlVo.setUnslip_no("");
				rectlVo.setDepst_req_no("");
				rectlVo.setReq_no("");
				rectlVo.setDepst_state("RDF002");
				
				dao.updateResBgRectl(rectlVo);	
			}else{
				// 입금상세 순번이 1인것만 빼고 모두 삭제한다.(같은 청구번호일때)
				dao.deleteResBgRectl(rectlVo);
			}	
			cnt++;
		}
		
		// 04. 입금관리(resbgrecve) 수정
		ResBgRecveVo recVo = new ResBgRecveVo();
		recVo.setAccnt_no(depstList.get(0).getAccnt_no());
		recVo.setDepst_odr(depstList.get(0).getDepst_schdl_seq());
		dao.updateResBgRecve(recVo);		
		
		// 05. 결재스냅샷 삭제
		if(aprReqNo != null && !"".equals(aprReqNo.trim())){
			// 05-1. 전자증빙삭제
			attachService.deleteFspAttchEvid(aprReqNo);
		
			apprFuncService.formRemove(aprReqNo);
		}
	}
	
	/**
     * 연구비 입금 또는 청구 결의취소(수정발행이 필요할 경우 결의취소만 해야 해서 추가)
     * @param ResExcSlipCancelVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.07.
     */
	public void deleteResExcSlipMnt(ResExcSlipCancelVo vo) throws KitechException{
		if("R05".equals(vo.getReq_no().substring(0, 3))){ // 입금의뢰
			resDepstService.deleteDepstReqSlipMnt(vo.getUnslip_no(), vo.getReq_no());
			
		}else if("R08".equals(vo.getReq_no().substring(0, 3))){ // 연구비 청구
			resDepstService.deleteDemndReqSlipMnt(vo.getUnslip_no(), vo.getReq_no());
		}
	}
	
}
