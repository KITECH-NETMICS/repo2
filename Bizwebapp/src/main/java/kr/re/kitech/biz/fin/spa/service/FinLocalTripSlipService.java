package kr.re.kitech.biz.fin.spa.service;

import java.util.List;

import kr.re.kitech.biz.fin.spa.vo.CtrLocalSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FinAutoSlipCrtVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSrcVo;

/**
 * 근거리출장 결의생성 SERVICE
 * @author LeeYH
 * @since 2023.03.21.
 */
public interface FinLocalTripSlipService {
	/*
    * 근거리 출장 결의생성 목록 조회
    */
	public List<CtrLocalSlipVo> selectCtrLocalSlip(FinSpaSrcVo vo);
	/*
    * 근거리 출장 결의생성
    */
	public String saveLocalTripSlip(FinAutoSlipCrtVo vo);
	/*
    * 근거리 출장 결의취소
    */
	public void deleteLocalTripSlip(FinAutoSlipCrtVo vo);
}
