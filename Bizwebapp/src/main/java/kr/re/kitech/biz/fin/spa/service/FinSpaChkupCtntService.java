package kr.re.kitech.biz.fin.spa.service;

import java.util.List;

import kr.re.kitech.biz.fin.spa.vo.FinCheckUpSrcVo;
import kr.re.kitech.biz.fin.spa.vo.FinCheckupSlipInfoVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaChkupCtntVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmCheckupSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmChkUpInfoVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmInstlRegionVo;

public interface FinSpaChkupCtntService {
	/**
    * 소액물품검수관리 조회
    */
	public List<FinSpaChkupCtntVo> selectChkupCtntList(FinCheckUpSrcVo vo);
	/**
    * 소액물품검수신청 조회
    */
	public FspSmlItmChkUpInfoVo selectSmlItemCheckupReq(FinCheckUpSrcVo vo);
	/**
    * 소액물품검수신청 저장(모바일)
    */
	public String saveChkupCtntMob(FinSpaChkupCtntVo vo);
	/**
    * 최근 소액물품 설치지역 조회
    */
	public List<FspSmlItmInstlRegionVo> selectRecntInstlRegion(FspSmlItmInstlRegionVo vo);
	/**
    * 소액물품검수신청 저장
    */
	public FinCheckUpSrcVo saveFinSmlItemCheckup(FspSmlItmChkUpInfoVo vo) throws Exception;
	/**
    * 소액물품검수신청 삭제
    */
	public void deleteFspSmlItmCheckup(FinCheckUpSrcVo vo);
	/**
    * 소액물품 검수결의 조회
    */
	public FinCheckupSlipInfoVo selectFinSmlItmCheckupSlip(FinCheckUpSrcVo vo);
	/**
    * 소액물품 검수결의 생성
    */
	public String saveFinSmlItmCheckupSlip(FinCheckupSlipInfoVo vo);
	/**
    * 소액물품 검수결의 삭제
    */
	public void deleteSmpItemCheckupSlip(FspSmlItmCheckupSlipVo vo);
	/**
    * 소액물품 검수신청 결재후 담당자저장
    */
	public void postSaveFinSmlItemCheckup(FinSpaChkupCtntVo vo);
}
