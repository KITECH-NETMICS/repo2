package kr.re.kitech.biz.sup.tec.service;

import java.util.List;

import kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;

/**
* 기술지원 결의생성(S330)
*/
public interface SptTecSlipMntService {
    /*
	* 기술지원결의생성 목록조회
	*/
	public List<SptTecSlipMntVo> selectSptTecSlipMnt(SptTecSlipSrcVo vo);
	/*
	* 기술지원결의생성(영수결의)
	*/
	public String saveTecRcptDepstSlip(SptTecSlipInfoVo vo) throws Exception;
	/*
	* 기술지원 영수결의 취소
	*/	
	public void deleteSptTecDepstSlip(SptTecSlipSrcVo vo);
	/*
	* 기술지원 결의생성(청구결의)
	*/
	public String saveTecRcptDemndSlip(SptTecSlipInfoVo vo) throws Exception;
	/*
	* 기술지원 청구결의 취소
	*/	
	public void deleteSptTecDemndSlip(SptTecSlipSrcVo vo);
	/*
	* 미수수탁 정산결의 목록 조회
	*/
	public List<SptTecAdjstSlipVo> selectFinUnPaidAdjst(SptTecSlipSrcVo vo);
	/*
	* 미수수탁 정산결의생성
	*/
	public String saveTecRcptRepaySlip(SptTecSlipInfoVo vo);
	/*
	* 기술지원 미수수탁결의 취소
	*/
	public void deleteTecRcptRepaySlip(SptTecSlipSrcVo vo);
}
