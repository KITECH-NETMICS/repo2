package kr.re.kitech.biz.sup.tec.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.sup.tec.vo.SptFtxBillHVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecBillInitInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptBillVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDemndVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRepayReqInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
/**
* 외부기술지원 입금의뢰 인터페이스
*/
public interface SupTecDepstReqService {
	/**
	 * 외부기술지원 입금의뢰(계산서발행) 목록 조회
	 */
	public List<SptTecDepstVo> selectSptTechRcptDepstList(SptTecSrcVo vo);
	/**
	 * 외부기술지원 계산서 신규발행시 디테일 및 공급받는자 정보 조회
	 */
	public SptTecBillInitInfoVo selectSptTechBillInitInfo(SptTecSrcVo vo);
	/**
	 * 일반사용자 전자발행 요청저장(매출계산서 발행)
	 */
	public void updateSptTecRcptInfoPrcsState(SptTecRcptInfoVo vo);
	/**
	 * 외부기술지원 입금의뢰 저장
	 */
	public String saveSptTecDepstReq(List<FcpDepstReqVo> vo);
	/**
	 * 외부기술지원 입금의뢰 삭제
	 */
	public void deleteSptTecDepstReq(List<FcpDepstReqVo> vo);
	/**
	 * 청구계산서 발행관리 목록 조회
	 */
	public List<SptTecRcptDemndVo> selectSptTecRcptDemndList(SptTecSrcVo vo);
	/*
	* 청구계산서 발행일자 기준 1개월 이내에 미수수탁정산 미결의 건수 조회 
	*/
	public int selectSptTecRcptUnRepayCnt(SptTecSrcVo vo);	
	/*
	* 미수수탁 반제신청팝업 입금내역 조회
	*/
	public List<FcpDepstReqVo> selectFcpDepstReqSptRepay(SptTecSlipSrcVo vo);
	/*
	* 미수수탁정산결의 입금의뢰 헤더조회 
	*/
	public SptFtxBillHVo selectFtxBillHForAdjstSlip(SptFtxBillHVo vo);
	/*
	* 외부기술지원 미수수탁 반제시청
	*/
	public String saveSptTecRepayReq(SptTecRepayReqInfoVo infoVo);
	
	/*
	* 기술지원 입금의뢰를 위한 기본사항 조회
	*/
	public SptFtxBillHVo selectFtxBillHForDepst(SptTecRcptBillVo vo);
	/*
	* 외부기술지원 미수수탁 반제시청 삭제
	*/
	public void deleteSptTecRepayReq(SptTecRepayReqInfoVo vo);
}
