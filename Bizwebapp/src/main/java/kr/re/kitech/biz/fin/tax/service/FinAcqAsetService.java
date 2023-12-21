package kr.re.kitech.biz.fin.tax.service;

import java.util.List;

import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanVo;

/**
 * 인수자산 수익관리 인터페이스
 * @author JeonJW
 * @since 2022.09.19
 */
public interface FinAcqAsetService {
	/*
     * 인수자산 리스트 조회
     */
	public List<FinAcqAsetPlanMstrVo> selectListFinAcqAset(FinAcqAsetPlanMstrVo finAcqAsetPlanMstrVo);
	
	/*
     * 인수자산 계획정보 조회
     */
	public FinAcqAsetPlanVo selectTaxAcqAset(FinAcqAsetPlanVo finAcqAsetPlanVo);
	
	/*
     * 인수자산 수익계획 생성
     */
	public FinAcqAsetPlanVo createTaxAcqAsetPlan(FinAcqAsetPlanVo finAcqAsetPlanVo);
	
	/*
     * 인수자산 수익 결의 리스트 조회
     */
	public List<FinAcqAsetPlanDtlVo> selectListFinAcqAsetPlan(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo);
	
	/*
     * 인수자산 부가세 결의생성
     */
	public void createSlip(List<FinAcqAsetPlanDtlVo> finAcqAsetPlanDtlListVo);
	
	/*
     * 계산서 번호 업데이트
     */
	public FinAcqAsetPlanDtlVo updateBillNo(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo);
	
	/*
     * 인수자산 부가세 결의취소
     */
	public void cancelSlip(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo);
}
