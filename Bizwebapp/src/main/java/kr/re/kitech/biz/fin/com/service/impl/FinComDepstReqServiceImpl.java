package kr.re.kitech.biz.fin.com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.com.dao.FinComDepstReqDAO;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.com.vo.FinDepstSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatChkVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillUpdVo;
import kr.re.kitech.biz.res.com.vo.ResDepstAccntVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * FinDepstReqMntServiceImpl
 * 입금의뢰 공통 ServiceImpl
 * @author LeeYH-PC
 * @since 2022.03.22.
 */
@Service("finComDepstReqService")
public class FinComDepstReqServiceImpl extends EgovAbstractServiceImpl implements FinComDepstReqService {
	@Resource(name="comDepstReqDAO")
	private FinComDepstReqDAO depstDao;	
		
	/**
    * 반제금액 수정
    * @param FcpDepstReqVo
    * @author LeeYH
    * @since 2022.03.31.
    */
	public void updateFspRamtCreatRepayAmt(FcpDepstReqVo vo) throws KitechException{
		if(vo.getSlip_no() == null || "".equals(vo.getSlip_no())){
		    // 01. 잔액생성 확정결의번호 조회
			FspRamtCreatVo ramtVo = depstDao.selectDepstReqSlipNo(vo.getReq_no());
			if(ramtVo == null || ramtVo.getSlip_no() == null || "".equals(ramtVo.getSlip_no())){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0030", new String[]{vo.getReq_no()});
			}
			
			vo.setSlip_no(ramtVo.getSlip_no());
			vo.setSlip_odr(ramtVo.getSlip_odr());
		}
		
		// 입금의뢰 삭제시 반제금액 초기화
		if("D".equals(vo.getCud_type())){
			FcpDepstReqVo delVo = new FcpDepstReqVo();
			delVo.setSlip_no(vo.getSlip_no());
			delVo.setSlip_odr(vo.getSlip_odr());
			delVo.setBf_depst_liq(vo.getDepst_liq());
			delVo.setDepst_liq(0);
			
			if(depstDao.updateFspRamtCreatForReq(delVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"반제금액수정"});
			}
			
		}else{
			// 반제금액 수정
			if(depstDao.updateFspRamtCreatForReq(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"반제금액수정"});
			}
			
			// 반제금액 체크
			FspRamtCreatChkVo chkVo = depstDao.selectRamtCreatRepayAmtChk(vo);
			if("N".equals(chkVo.getRslt_chk())){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0038", new String[]{vo.getSlip_no(), String.valueOf(vo.getSlip_odr())});
			}
		}
	}	
	
	/**
    * 잔액정산 저장 및 잔액생성 수정(경비결의,일반결의)
    * @param FspRamtCreatVo
    * @author LeeYH
    * @since 2022.03.14.
    */
	public void saveRamtAdjst(FspRamtCreatVo vo) throws KitechException {
		int result = 0;
		
		if("C".equals(vo.getCud_type())){
			// 2018.04.03 잔액정산 가능금액 조회
			//AppLog.info("\n ############### vo : " + vo.toString());
			FspRamtCreatVo rstVo = depstDao.selectFspRamtCreat(vo);
			if(vo.getUnslip_amt() > rstVo.getChk_unadjst_amt()){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0015");
			}
			
			// 반제금액 또는 정산금액이 음수일 경우 exception
			if(rstVo.getUnslip_repay_amt() < 0 || rstVo.getWon_adjst_amt() < 0){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0016");
			}
			
			// 01.정산테이블 입력	
			vo.setMngmt_item_1(rstVo.getMngmt_item_1());
			vo.setMngmt_item_2(rstVo.getMngmt_item_2());
			vo.setMngmt_item_nm_1(rstVo.getMngmt_item_nm_1());
			vo.setMngmt_item_nm_2(rstVo.getMngmt_item_nm_2());
			
			result = depstDao.insertFspRamtAdjst(vo);
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액정산데이터 저장"});
			}
		}else{
			// 01.잔액정산테이블 수정
			result = depstDao.updateFspRamtAdjst(vo);
			if(result == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액정산데이터 수정"});
			}
		}
		
		// 02.잔액생성 테이블 수정
		result = depstDao.updateFspRamtCreat(vo);
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액생성데이터 수정 "});
		}
		
		// 03.잔액생성 정산금액과 잔액정산 won_occr_amt의 합 일치여부 체크
		FspRamtCreatChkVo chkVo = depstDao.selectFspRamtCreatChk(vo);
		if("N".equals(chkVo.getRslt_chk())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0015");
		}
	}
	
	/**
    * 잔액정산 삭제(일반결의,경비결의)
    * @param FspRamtCreatVo
    * @author LeeYH
    * @since 2022.03.14.
    */
	public int deleteRamtAdjst(FspRamtCreatVo vo) throws KitechException {
		// 잔액생성 수정
		int result = depstDao.updateFspRamtCreatDel(vo);
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액생성데이터 수정 "});
		}
		
		// 잔액정산 삭제
		result = depstDao.deleteFspRamtAdjst(vo);
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액정산데이터 삭제 "});
		}
		
		return result;
	}
	
	//////////////////////////////////////////// 입금의뢰 및 입금결의 자동
	/**
    * 입금의뢰 저장
    * @param FcpDepstReqVo
    * @author LeeYH
    * @since 2022.03.31.
    */
	@Override
	public void saveDepstReq(FcpDepstReqVo vo) throws KitechException{		
		// 기술지원업무 일 경우 영수계산서가 있을 경우 계산서 전자발행상태 체크(2023.11.28.)
		if("S03".equals(vo.getReq_no().substring(0, 3)) && vo.getRecv_bill_no() != null && !"".equals(vo.getRecv_bill_no())){
			Map<String, String> map = depstDao.selectFtxBillHChk(vo.getRecv_bill_no());
			
			if("X".equals(map.get("issu_seqno")) || "N".equals(map.get("issu_state").trim())){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "전자발행후 입금의뢰해 주시기 바랍니다.");
			}			
			
			if("U".equals(map.get("prcs_clsf"))){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "해당계산서[" + vo.getRecv_bill_no() + "]는 수정발행된 계산서가 존재합니다.");
			}
			
			if("D".equals(map.get("prcs_clsf"))){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "해당계산서[" + vo.getRecv_bill_no() + "]는 폐기된 계산서이므로 입금의뢰시 사용할 수 없습니다.");
			}
		}
		
		if("C".equals(vo.getCud_type())){
			if(depstDao.insertFcpDepstReq(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"입금내역 생성"});
			}
			
			// 잔액생성 반제금액 수정
			if(!"FBD099".equals(vo.getDepst_clsf())){ // 가지급금정산, 해외출장정산시 반제금액 수정필요없음
				vo.setBf_depst_liq(0);
				this.updateFspRamtCreatRepayAmt(vo);
			}
		}else if("U".equals(vo.getCud_type())){
			if(depstDao.updateFcpDepstReq(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"입금내역 수정"});
			}
			
			// 잔액생성 반제금액 수정
			if(vo.getDepst_liq() != vo.getBf_depst_liq() && !"FBD099".equals(vo.getDepst_clsf())){
				this.updateFspRamtCreatRepayAmt(vo);
			}
		}
		
		// 영수계산서가 있을 경우 ftxbillh.issu_req_no 업데이트
		if(vo.getRecv_bill_no() != null && !"".equals(vo.getRecv_bill_no())){
			this.updateFtxBillHIssuReq(vo.getRecv_bill_no(), vo.getReq_no(), vo.getDepst_schdl_seq());
		}
	}	
	
	/**
    * 입금의뢰 삭제
    * @param String reqNo
    * @author LeeYH
    * @since 2022.03.31.
    */
	public void deleteDepstReq(FcpDepstReqVo vo) throws KitechException{
		// 01. 반제금액 수정
		if(vo.getUnslip_no() == null || "".equals(vo.getUnslip_no().trim())){
			vo.setCud_type("D");
			this.updateFspRamtCreatRepayAmt(vo);
		}	
		
	    // 02. 입금의뢰 삭제
		depstDao.deleteFcpDepstReq(vo.getReq_no());	
	}
	
	/**
    * 입금결의 잔액정산 저장 및 잔액생성 수정
    * @param FspRamtCreatVo
    * @author LeeYH
    * @since 2022.04.05.
    */
	public void saveRamtAdjstForDepst(FspRamtCreatVo vo) throws KitechException {
		int result = 0;
		// 잔액생성 테이블 조회
		FspRamtCreatVo ramtVo = depstDao.selectFspRamtCreat(vo);
		vo.setMngmt_item_1(ramtVo.getMngmt_item_1());
		vo.setMngmt_item_2(ramtVo.getMngmt_item_2());
		vo.setMngmt_item_nm_1(ramtVo.getMngmt_item_nm_1());
		vo.setMngmt_item_nm_2(ramtVo.getMngmt_item_nm_2());
		vo.setWon_occr_amt(vo.getUnslip_amt());
		
		// 01.잔액정산 테이블 입력
		if(depstDao.insertFspRamtAdjst(vo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액정산데이터 저장"});
		}		
		
		// 02.잔액생성 테이블 수정
		// 미수수탁정산에서 청구결의 반제시 unslip_repay_amt 수정필요없음(청구의뢰없이 바로 결의생성하므로) - 2023.08.01. 이영희
		// 가지급금정산, 해외출장정산 결의시 unslip_repay_amt 수정필요없음
		if(!vo.isUnslip_repay_upd_yn()){ 
			result = depstDao.updateFspRamtCreat(vo); 
		}else{
			result = depstDao.updateFspRamtCreat2(vo);
		}
		
		if(result == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액생성데이터 수정 "});
		}
		
		// 03.잔액생성 정산금액과 잔액정산 won_occr_amt의 합 일치여부 체크
		FspRamtCreatChkVo chkVo = depstDao.selectFspRamtCreatChk(vo);
		AppLog.info("\n ----------------------- chkVo : " + chkVo);
		if("N".equals(chkVo.getRslt_chk())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.com.0015");
		}
	}
	
	/**
    * 잔액정산 삭제 및 잔액정산 수정(자동결의에서 호출)
    * 반제금액 수정시
    * @param String unslipNo, boolean updYn(unslip_repay_amt수정할 경우 true)
    * @author LeeYH
    * @since 2022.07.14.
    */
	public void deleteFspRamtAdjst(String unslipNo, boolean updYn) throws KitechException{		
		//==========================================================
		// 01. 잔액정산 삭제 및 fspramtcreat 업데이트
		//==========================================================
		List<FspRamtCreatVo> ramtList = depstDao.selectFspRamtAdjstList(unslipNo);
		
		if(ramtList.size() > 0){
			for(FspRamtCreatVo ramtVo : ramtList){			
				ramtVo.setUnslip_amt(ramtVo.getWon_occr_amt());
				
				if(updYn){ // 청구의뢰는 반제금액 업데이트 없이 바로 정산금액 수정하므로 반제금액 수정필요 없음
					if(unslipNo.substring(0, 3).matches("427|165") && "2".equals(ramtVo.getBase_debit_cr())){
						ramtVo.setUnslip_repay_amt(0);
					}else{
						ramtVo.setUnslip_repay_amt(ramtVo.getWon_occr_amt());
					}
				}else{
					ramtVo.setUnslip_repay_amt(0);
				}
				
				if(depstDao.updateFspRamtCreatDel2(ramtVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액생성데이터 수정 "});
				}	
			}
			
			// 잔액정산 삭제
			if(depstDao.deleteFspRamtAdjst2(unslipNo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"잔액정산데이터 삭제 "});
			}
		}
		
		//==========================================================
		// 02. 계산서 테이블 결의번호 삭제
		//==========================================================
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		// 연구비 미수반제신청, 미수수탁정산결의 경우 계산서 없음
		if(!unslipNo.substring(0,  3).matches("428|427|230")){
			updVo.setUnslip_no(unslipNo);
			depstDao.updateFtxBillHDel(updVo);
		}
		
		//==========================================================
		// 03. 입금의뢰테이블(fcpdepstreq) 결의번호 초기화
		//==========================================================
		updVo.setUnslip_no(unslipNo);
		depstDao.updateFcpDepstReqDel(updVo);
	}
	
	/**
    * 매출계산서 헤더에 신청번호 업데이트
    * @param String billNo, String reqNo, int depstOdr
    * @author LeeYH
    * @since 2023.04.25.
    */
	public void updateFtxBillHIssuReq(String billNo, String reqNo, int depstOdr) throws KitechException{
		FtxBillUpdVo updVo = new FtxBillUpdVo();
		updVo.setBill_no(billNo);
		updVo.setReq_no(reqNo);
		updVo.setDepst_odr(depstOdr);
		
		depstDao.updateFtxBillHIssuReq(updVo);
	}
	
	/**
    * 결의생성 후 매출계산서 헤더에 결의번호 업데이트
    * @param String billNo, String unslipNo
    * @author LeeYH
    * @since 2023.04.27.
    */
	public void updateFtxBillHUnslipNo(String billNo, String unslipNo) throws KitechException{
		Map<String, String> map = depstDao.selectFtxBillHChk(billNo);
		if("X".equals(map.get("issu_seqno"))){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0029"); // 전자 발행 후 결의 작성해 주시기 바랍니다.
		}
		
		if("N".equals(map.get("issu_state").trim())){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0030"); // 전송완료된 계산서가 아닙니다. 전송완료 후 결의 작성해 주시기 바랍니다.
		}
		
		if("U".equals(map.get("prcs_clsf"))){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "해당계산서[" + billNo + "]는 수정발행된 계산서가 존재합니다.");
		}
		
		if("D".equals(map.get("prcs_clsf"))){
			throw new KitechException(Exceptions.ALERT, Business.FIN, "해당계산서[" + billNo + "]는 폐기된 계산서이므로 결의서에서 사용할 수 없습니다.");
		}
		
		FtxBillUpdVo updVo = new FtxBillUpdVo();
		updVo.setUnslip_no(unslipNo);
		updVo.setBill_no(billNo);
		depstDao.updateFtxBillHUnslipNo(updVo);
	}
	
	/**
    * 연구비입금결의 회계코드 조회
    * @param String billNo, String unslipNo
    * @author LeeYH
    * @since 2023.04.27.
    */
	public String getDepstMntAccntCd(String depstClsf, String accntNo, String slipYmd) throws KitechException{
		ResDepstAccntVo acntVo = new ResDepstAccntVo();
		acntVo.setAccnt_no(accntNo);
		acntVo.setSlip_ymd(slipYmd);
		acntVo.setDepst_clsf(depstClsf);
		
		String accntCd = "";
	    switch(depstClsf){
	    	case "FBD011" : // 연구비
	    		accntCd = depstDao.selectDepstSlipAccntCd01(acntVo);
	    		break;
	    	case "FBD013" : // 참여기관연구비잔액
	    	case "FBD014" : // 불인정연구비
	    		accntCd = depstDao.selectDepstSlipAccntCd02(acntVo);
	    		break;
	    	case "FBD032" : // 정액기술료
	    	case "FBD033" : // 기술료
	    	case "FBD034" : // 기술료청구
	    	case "FBD015" : // 수혜기업부담금
	    		accntCd = depstDao.selectDepstSlipAccntCd03(acntVo);
	    		break;
	    	case "FBD021" : // 기술지원비
	    		accntCd = depstDao.selectDepstSlipAccntCd05(acntVo);
	    		break;
	    	case "FBD084" : accntCd = "21017921"; break;
	    }
	    
	    // FBD012 참여기관연구비, FBD016 기업부설연구비, FBD081 통근버스급여공제, FBD082 기업부담금, FBD083 교육비환급, FBD100 청정사업비, FBD101 지경부기술료사업 ~ FBD112 자원생산성기반구축사업
	    if(depstClsf.matches("FBD012|FBD016|FBD061|FBD081|FBD082|FBD083|FBD100|FBD101|FBD102|FBD103|FBD104|FBD105|FBD106|FBD107|FBD108|FBD109|FBD110|FBD111|FBD112")){
	    	accntCd = depstDao.selectDepstSlipAccntCd04(acntVo);
	    }
	    
	    if(accntCd == null || "".equals(accntCd)){
	    	throw new KitechException(Exceptions.ALERT, Business.RES, "message.alert.res.exc.0003",new String[]{accntNo});
	    }
		
		return accntCd;
	}
	
	/**
    * 결의생성 후 입금의뢰테이블 결의번호 업데이트
    * @param String unslipNo, int unslipOdr, String reqNo
    * @author LeeYH
    * @since 2023.05.12.
    */
	public void updateFcpDepstReqUnslipNo(String unslipNo, int unslipOdr, String reqNo) throws KitechException{
		FinDepstSlipVo vo = new FinDepstSlipVo();
		vo.setUnslip_no(unslipNo);
		vo.setUnslip_odr(unslipOdr);
		vo.setDepst_req_no(reqNo);
		
		depstDao.updateFcpDepstReqUnslipNo(vo);
	}
	
	/**
     * 입금결의를 위한 조회(차변)
     * @param reqNo
     * @return List<FinDepstSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.11.14.
     */
	public List<FinDepstSlipVo> selectFcpDepstSlipList(String reqNo) throws KitechException{
		return depstDao.selectFcpDepstSlipList(reqNo);
	}
	
	/**
     * 입금의뢰 대변생성을 위한 조회
     * @param Map
     * @return List<FinDepstSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.11.14.
     */
	public List<FinDepstSlipVo> selectFcpDepstSlipCrList(String reqNolist) throws KitechException{
		return depstDao.selectFcpDepstSlipCrList(reqNolist);
	}
}
