package kr.re.kitech.biz.sup.tec.service;

import java.util.List;

import kr.re.kitech.biz.api.client.vo.EasyPaySMSVo;
import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;
import kr.re.kitech.biz.sup.pop.vo.EasyPayInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptCardPaymntVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecChkVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptBillVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDetlVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptListVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptRegVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;

/**
* 기술지원 결의생성(S330)
*/
public interface SptTecMntService {
    /*
	* 기술지원 실험실 담당자 확인
	*/
	public SptTecChkVo selectSptLabHedcnt(String sysPayNo);
	/*
	* 외부기술지원(유상) 목록조회
	*/
	public List<SptTecRcptInfoVo> selectSptTecRcptInfoList(SptTecSrcVo vo);
	/*
	* 외부기술지원(유상) 내역등록 상세조회
	*/
	public SptTecRcptRegVo selectSptTecRcptInfo(SptTecSrcVo vo);
	/*
	* 제우스 예약현황 상세정보 조회
	*/
	public SptTecRcptRegVo selectSptZeusResvMst(SptTecSrcVo vo);
	/*
	* 청구세금계산서 발행내역
	*/
	public List<SptTecRcptBillVo> selectSptTecChrgBillInfo(SptTecSrcVo vo);
	/*
	* 기술지원내역등록-장비검색팝업 조회
	*/
	public List<AssMastrHPopVo> selectSptLabEquipInfoAsetPop(AssMastrHPopVo vo);
	/*
	* 기술지원내역등록 저장
	*/
	public String saveSptTecRcptInfo(SptTecRcptRegVo vo) throws Exception;
	/*
	* 외부기술지원 확정 저장
	*/
	public void saveSptTechRcptDecideYn(SptTecRcptDetlVo vo) throws Exception;
	/*
	* 바우처가입여부 조회
	*/
	public SptTecChkVo selectCustVoucherYn(String custNo);
	/*
	* 기술지원 내역등록 삭제
	*/
	public void deleteSptTecRcptInfo(SptTecRcptInfoVo vo);
	/*
	* 외부기술지원 기술지원 최소
	*/
	public void saveTechSuptCancel(SptTecSrcVo vo);
	/*
	* 외부기술지원 카드결제 저장
	*/
	public void saveCardPaymnt(SptCardPaymntVo vo) throws Exception;
	/*
	* 외부기술지원 기술내역 저장
	*/
	public void saveSptTecRcptInfoPost(SptTecRcptRegVo vo);
	/*
	* 이지페이 SMS결제요청
	*/
	public EasyPayInfoVo sendEasyPaySMS(EasyPaySMSVo vo);
	/*
	* 외부기술지원(유상)- 카드처리내역 팝업 저장
	*/
	public void updateSptTecRcptInfoCard(SptTecRcptInfoVo vo);
	/*
	* 외부기술지원(유상)- RPA 수행여부 Update
	*/
	public void updateRpaYn(SptTecRcptInfoVo vo);
	/*
	* 외부기술지원(유상) 엑셀내리기(장비)
	*/
	public List<SptTecRcptListVo> selectSptTecRcptExcelDown(SptTecSrcVo vo);
}
