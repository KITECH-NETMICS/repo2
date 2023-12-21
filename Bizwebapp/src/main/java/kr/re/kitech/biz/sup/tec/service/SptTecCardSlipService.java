package kr.re.kitech.biz.sup.tec.service;

import java.util.List;

import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptCardSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipCrtVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;

public interface SptTecCardSlipService {
	/**
	* 카드처리내역 조회
	*/
	public List<SptTranTableVo> selectSptTranCardPrcs(SptCardSlipSrcVo vo);
	/**
	* 카드처리내역 접수번호 수정
	*/
	public void updateSptTranCard(SptTranTableVo vo);
	/**
	* 기술지원카드 미수(취소)결의생성 조회
	*/
	public List<SptTecCardSlipVo> selectSptTecCardSlip(SptCardSlipSrcVo vo);
	/**
	* 기술지원카드 미수(취소)결의생성
	*/
	public String saveSptTecCardSlip(SptTecCardSlipCrtVo vo);
	/**
	* 기술지원카드결의삭제
	*/
	public void deleteSptTecCardSlip(SptTecSlipSrcVo vo);
	/**
	* 기술지원카드정산결의생성 조회
	*/
	public List<SptTecCardSlipVo> selectSptCardAdjstSlip(SptCardSlipSrcVo vo);
	/**
	* 기술지원카드정산결의생성
	*/
	public String saveSptTecCardAdjstSlip(SptTecCardSlipCrtVo vo);
	/**
	* 기술지원 카드수수료결의 목록 조회
	*/
	public List<SptTecCardSlipVo> selectSptTecCardFeeSlip(SptCardSlipSrcVo vo);
	/**
	* 기술지원 카드수수료결의 생성
	*/
	public String saveSptTecCardFeeSlip(SptTecCardSlipCrtVo vo);
	/**
	* 기술지원 카드수수료결의 삭제
	*/
	public void deleteSptTecCardFeeSlip(SptCardSlipSrcVo vo);
}
