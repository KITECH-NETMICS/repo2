package kr.re.kitech.biz.res.exc.service;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.res.com.vo.ResPrjInfoVo;
import kr.re.kitech.biz.res.exc.vo.ResDemndSlipVo;
import kr.re.kitech.biz.res.exc.vo.ResRepaySlipVo;

/**
 * 연구비입금관리 및 결의서 Interface
 * @author LeeYH
 * @since 2022.07.13.
 */
public interface ResDepstReqService {
	/*
    * 연구비, 기술료 청구결의서 삭제
    */
	public void deleteDemndReqSlipMnt(String unslipNo, String reqNo);
	
	/*
    * 연구비, 기술료 입금결의서 삭제
    */
	public void deleteDepstReqSlipMnt(String unslipNo, String reqNo);	
	/*
	 * 연구비청구의뢰 결의생성
	 */
	 public String createResDemndSlip(ResDemndSlipVo demndVo, ResPrjInfoVo prjVo);
	/*
     * 연구비반제신청 저장
     */
	 public void saveFcpDepstReq(FcpDepstReqVo vo);
	/*
	 * 입금의뢰 반제금액 수정
	 */
	 public void updateUnslipRepayAmt(String slipNo, int slipOdr, long depstLiq, long bfDepstLiq, String cudType);
	/*
	 * 연구비 미수반제 결의생성
	 */
	 public String createResRepayReqSlip(ResRepaySlipVo vo);
	/*
	 * 연구비입금의뢰 또는 결재완료 후 결의번호, 입금상태 업데이트
	 */
	 public void updateResBgRectlDepstState(String reqNo, String depstState, String unslipNo);
	 /*
	 * 입금의뢰 결의서 및 잔액정산 데이터 삭제
	 */
	 public void deleteDepstSlipAndReq(String unslipNo);
	 /*
	 * 입금의뢰 삭제, 반제금액 수정
	 */
	 public void deleteDepstReq(FcpDepstReqVo vo);
	 /*
	 * 연구비 입금의뢰 결의생성
	 */
	 public String createResDepstReqSlip(ResPrjInfoVo prjVo, ResRepaySlipVo vo);
}
