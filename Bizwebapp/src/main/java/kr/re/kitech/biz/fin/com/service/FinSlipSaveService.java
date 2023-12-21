package kr.re.kitech.biz.fin.com.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FinSaveSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.SlipBaseVo;
import kr.re.kitech.biz.fin.spm.vo.CardInfoVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;

/**
* 결의생성 인터페이스 FinSlipSaveService
* @author LeeYH
* @since 2022.03.07.
*/
public interface FinSlipSaveService {	
	/**
    * 결의서 생성
    */
	public FinSlipSearchVo saveSlip(FinSaveSlipVo slipVo);
	
	/**
    * 결의서 헤더 저장
    */
	public String saveSlipH(FspSlipHVo slipHVo);
	
	/**
    * 결의서 삭제
    */
	public void deleteSlip(FspSlipDVo vo) throws Exception ;
	
	/**
    * 자동결의생성
    */
	public void saveAutoSlip(FinComSlipVo vo);		
	
	/**
    * 결의번호로 결의서 전체 삭제
    */
	public void deleteFspSlip(String unslipNo);	
	
	/**
    * 자동결의외의 분개항목이 있는지 여부 조회
    */
	public void selectAutoSlipCnt(String unslipNo);
	
	/**
    * 카드결의정보 삭제
    */
	public void deleteCardSlipInfo(FspSlipDVo vo);
	
	/**
    * 계산서정보 삭제
    */
	public void deleteKtxIssuMstrSlip(SlipBaseVo vo);
	
	/**
    * 결의서 디테일 카드정보 누락시 다시 조회
    */
	public CardInfoVo selectCardInfo(FspSlipDVo vo);
	
	/**
    * 자동결의서 헤더저장(신청번호 단건일 경우)
    */
	public String saveAutoSlipH(String reqNo, FspSlipHVo hVo);
	
	/**
    * 자동결의서 헤더저장(신청번호 단건 또는 다건 일 경우)
    */
	public String saveAutoSlipH(String reqNo, List<ComReqVo> reqNoList, FspSlipHVo hVo);
	
	/**
    * 자동결의서 삭제시 카드 정보 또는 계산서 정보에 결의번호 초기화
    */
	public void deleteCardOrBillInfo(FspSlipDVo vo);
	/**
    * 결의번호로 결의서삭제 및 계산서초기화, 예산통제모듈 삭제
    */
	public void deleteFspSlip(String unslipNo, String billNo, boolean ctrlYn);
	
}
