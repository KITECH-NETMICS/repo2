package kr.re.kitech.biz.sup.tec.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.sup.tec.dao.SupTecDepstReqDAO;
import kr.re.kitech.biz.sup.tec.service.SupTecDepstReqService;
import kr.re.kitech.biz.sup.tec.vo.SptFtxBillHVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecBillInitInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptBillVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDemndVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRepayReqInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원입금의뢰
 * @Class Name SupTecDepstReqServiceImpl.java
 * @Description 기술지원입금의뢰 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/23   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/05/23
 * @version 1
 * @see
 * 
 */
@Service("supTecDepstReqService")
public class SupTecDepstReqServiceImpl extends EgovAbstractServiceImpl implements SupTecDepstReqService {
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;	
	
	@Resource(name="supTecDepstReqDAO")
	private SupTecDepstReqDAO dao;
	/**
     * 외부기술지원 입금의뢰(계산서발행) 목록 조회
     * @param SptTecSrcVo
     * @return List<SptTecDepstVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.23.
     */
	@Override
	public List<SptTecDepstVo> selectSptTechRcptDepstList(SptTecSrcVo vo) throws KitechException{
		return dao.selectSptTechRcptDepstList(vo);
	}
	
	/**
     * 외부기술지원 계산서 신규발행시 디테일 및 공급받는자 정보 조회
     * @param SptTecSrcVo
     * @return SptTecBillInitInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.25.
     */
	public SptTecBillInitInfoVo selectSptTechBillInitInfo(SptTecSrcVo vo) throws KitechException{
		SptTecBillInitInfoVo retVo = new SptTecBillInitInfoVo();
		// 계산서 디테일정보 조회
		retVo.setBillDList(dao.selectSptTecRcptInfoBillD(vo));
		
		// 공급받는자 정보 조회(xodfvendjob)
		// 2023.10.04. 유연화님 요청으로 기술지원접수 고객정보에서 가지고 가도록 수정(XC220230249E)
		retVo.setChrgList(dao.selectSptCtiCunslBuyrChrg(vo.getTech_supt_req_no()));
		return retVo;
	}
	
	/**
     * 일반사용자 전자발행 요청저장(매출계산서 발행)
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.30.
     */
	public void updateSptTecRcptInfoPrcsState(SptTecRcptInfoVo vo) throws KitechException{
		dao.updateSptTecRcptInfoBill(vo);
	}
	
	/**
     * 외부기술지원 입금의뢰 저장
     * @param FcpDepstReqVo
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.30.
     */
	public String saveSptTecDepstReq(List<FcpDepstReqVo> depstList) throws KitechException{
		// 기술지원 입금관리번호 
		String depstMngmtNo = "";
		if("C".equals(depstList.get(0).getCud_type())){
			depstMngmtNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "S25");
		}
		
		String reqNo = "";
		for(FcpDepstReqVo vo : depstList){
			reqNo = vo.getReq_no();
			if("C".equals(vo.getCud_type())){
				reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "S03");
				vo.setReq_no(reqNo);
			}
			
			// 01.입금의뢰(fcpdepstreq) 저장
			vo.setDepst_ymd(vo.getAcct_txday());
			vo.setDepst_schdl_seq(1);
			vo.setDepst_schdl_detls_seq(1);
			
			depstService.saveDepstReq(vo);			
			
			// 02. 기술지원 입금내역 저장
			vo.setDepst_mngmt_no(depstMngmtNo);
			dao.insertSptTecRcptDepst(vo);
		}
		
		// 03.매출계산서 헤더에 신청번호 업데이트 
		depstService.updateFtxBillHIssuReq(depstList.get(0).getRecv_bill_no(), depstMngmtNo, 1);
		
		// 03. 기술지원 접수정보 수정
		SptTecRcptInfoVo rcptVo = new SptTecRcptInfoVo();
		rcptVo.setReq_no(depstMngmtNo);
		rcptVo.setBill_no(depstList.get(0).getRecv_bill_no());
		rcptVo.setDepst_ymd(depstList.get(0).getAcct_txday());
		
		dao.updateSptTecRcptInfoBill(rcptVo);
		
		return depstMngmtNo;
	}
	
	/**
     * 외부기술지원 입금의뢰 삭제
     * @param FcpDepstReqVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.30.
     */
	public void deleteSptTecDepstReq(List<FcpDepstReqVo> depstList) throws KitechException{
		for(FcpDepstReqVo vo : depstList){
			// 01.입금의뢰 삭제
			depstService.deleteDepstReq(vo);			
		}
		
		// 02. 입금관리내역 삭제
		dao.deleteSptTecRcptDepst(depstList.get(0).getDepst_mngmt_no());
		
		// 03. 입금의뢰 삭제시 의뢰번호 초기화
		SptTecRcptInfoVo rcptVo = new SptTecRcptInfoVo();
		rcptVo.setReq_no(depstList.get(0).getDepst_mngmt_no());
		dao.updateSptTecRcptInfoDel(rcptVo);
	}
	
	/**
     * 외부기술지원 입금결의 삭제
     * @param FcpDepstReqVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.30.
     */
	public void deleteSptTecDepstSlip(FcpDepstReqVo vo) throws KitechException{
		String unslipNo = vo.getUnslip_no();
		
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		// 1-1) 전자증빙삭제(입금내역확인증)
		attachService.deleteFspAttchEvid(unslipNo, unslipNo);
		
		// 2) 잔액정산 삭제, 잔액생성 수정 - fspramtcreat.won_adjst_amt 초기화
		depstService.deleteFspRamtAdjst(unslipNo, false);		
	}
	
	/**
     * 청구계산서 발행관리 목록 조회
     * @param SptTecSrcVo
     * @return List<SptTecRcptDemndVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.11.
     */
	public List<SptTecRcptDemndVo> selectSptTecRcptDemndList(SptTecSrcVo vo) throws KitechException{
		return dao.selectSptTecRcptDemndList(vo);
	}
	
	/**
     * 청구계산서 발행일자 기준 1개월 이내에 미수수탁정산 미결의 건수 조회 
     * @param String suptTeam
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.11.
     */
	public int selectSptTecRcptUnRepayCnt(SptTecSrcVo vo) throws KitechException{
		return dao.selectSptTecRcptUnRepayCnt(vo.getSupt_team());
	}
	
	/**
     * 미수수탁 반제신청팝업 입금내역 조회
     * @param String depstMngmtNo
     * @return List<FcpDepstReqVo>
     * @throws Exception
     */
	public List<FcpDepstReqVo> selectFcpDepstReqSptRepay(SptTecSlipSrcVo vo) throws KitechException{
		// spttecrcptdepst 생성전 데이터는 계산서번호로 조회하기 위하여
		if(!"S25".equals(vo.getReq_no().substring(0, 3))){
			vo.setReq_no("");
		}
		return dao.selectFcpDepstReqSptRepay(vo);
	}
	
	/**
     * 미수수탁정산결의 입금의뢰 헤더조회 
     * @param String
     * @return SptFtxBillHVo
     * @throws Exception
	 * @author LeeYH
	 * @since 2023.07.25.
     */
	public SptFtxBillHVo selectFtxBillHForAdjstSlip(SptFtxBillHVo vo) throws KitechException{
		return dao.selectFtxBillHForAdjstSlip(vo.getTax_bill_no());
	}
	
	/**
     * 외부기술지원 미수수탁 반제시청
     * @param SptTecRepayReqInfoVo
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.28.
     */
	public String saveSptTecRepayReq(SptTecRepayReqInfoVo infoVo) throws KitechException{
		List<FcpDepstReqVo> depstList = infoVo.getDepstList();
		SptFtxBillHVo demndVo = infoVo.getDemndVo();
		
		// 기술지원 입금관리번호 
		String depstMngmtNo = "";
		if("C".equals(depstList.get(0).getCud_type())){
			if(depstList.get(0).getDepst_mngmt_no() != null)
			depstMngmtNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "S25");
		}else{
			depstMngmtNo = demndVo.getDepst_mngmt_no();
		}
		
		String reqNo = "";
		for(FcpDepstReqVo vo : depstList){
			reqNo = vo.getReq_no();
			if("C".equals(vo.getCud_type())){
				reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F42");
				vo.setReq_no(reqNo);
			}
			
			vo.setAccnt_no(demndVo.getAccnt_no());
			vo.setDemnd_bill_no(demndVo.getTax_bill_no());
			vo.setVend_cd(demndVo.getVend_cd());
			vo.setVend_abbr(demndVo.getVend_abbr());
			vo.setDepst_clsf("FBD021");			
			vo.setDepst_ymd(vo.getAcct_txday());
			vo.setDepst_schdl_seq(1);
			vo.setDepst_schdl_detls_seq(1);
			
			// 01.입금의뢰(fcpdepstreq) 저장
			depstService.saveDepstReq(vo);	
			
			// 02. 기술지원 입금내역 저장
			vo.setDepst_mngmt_no(depstMngmtNo);
			dao.insertSptTecRcptDepst(vo);
		}
		
		// 03. 미수반제 정보 수정
		demndVo.setDepst_mngmt_no(depstMngmtNo);
		demndVo.setDepst_unslip_no(depstList.get(0).getDepst_unslip_no());
		demndVo.setDepst_unslip_odr(depstList.get(0).getDepst_unslip_odr());
		demndVo.setWrte_syspayno(depstList.get(0).getReq_psn());
		demndVo.setWrte_dept_cd(depstList.get(0).getReq_dept());
		demndVo.setWrte_dept_new_ymd(depstList.get(0).getReq_dept_new_ymd());
		demndVo.setWrte_ymd(depstList.get(0).getReq_ymd());
		
		dao.updateFinUnpaidAdjstDepst(demndVo);
		
		return depstMngmtNo;
	}
	
	/**
     * 외부기술지원 미수수탁 반제시청 삭제
     * @param FcpDepstReqVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.30.
     */
	public void deleteSptTecRepayReq(SptTecRepayReqInfoVo infoVo) throws KitechException{
		List<FcpDepstReqVo> depstList = infoVo.getDepstList();
		for(FcpDepstReqVo vo : depstList){
			// 01.입금의뢰 삭제
			depstService.deleteDepstReq(vo);			
		}
		
		// 02. 입금관리내역 삭제
		SptFtxBillHVo demndVo = infoVo.getDemndVo();
		dao.deleteSptTecRcptDepst(depstList.get(0).getDepst_mngmt_no());
		
		// 03. 미수반제 정보 수정
		demndVo.setDepst_mngmt_no("");
		demndVo.setDepst_unslip_no("");
		demndVo.setDepst_unslip_odr(0);
		demndVo.setDepst_amt(0);
		dao.updateFinUnpaidAdjstDepst(demndVo);
	}
	
	/**
     * 기술지원 입금의뢰를 위한 기본사항 조회
     * @param SptTecRcptBillVo
     * @return SptFtxBillHVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.24.
     */
	public SptFtxBillHVo selectFtxBillHForDepst(SptTecRcptBillVo vo) throws KitechException{
		return dao.selectFtxBillHForDepst(vo.getTax_bill_no());
	}

}
