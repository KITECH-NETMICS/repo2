package kr.re.kitech.biz.epu.com.service;

import java.util.List;

import kr.re.kitech.biz.api.server.vo.biz.ApiEpuVo;
import kr.re.kitech.biz.epu.cnt.vo.BblenfrcVo;
import kr.re.kitech.biz.epu.cnt.vo.CtrlAmtProcVo;
import kr.re.kitech.biz.epu.com.vo.EpuComCodeG2bVo;
import kr.re.kitech.biz.epu.com.vo.PurAprVo;

public interface EpuComService {
	/**
    * 구매 통제금액 조회
    */
	public List<BblenfrcVo> selectBblenfrcChngAmt(BblenfrcVo vo);
	
	/**
    * 구매 원인행위금액 정리
    */
	public void processCauseAmt(CtrlAmtProcVo vo);
	
	/**
    * 재공고시 신규공고 상태로 되돌리도록 프로세스를 수정
    */
	public void processPurApr(PurAprVo vo) throws Exception;
	/**
    * G2b 공통코드 조회
    */
	public List<EpuComCodeG2bVo> selectEpuComCodeG2b(EpuComCodeG2bVo vo);
	/**
    * 구매담당자 부서정보 조회
    */
	public ApiEpuVo selectChrgPsnDeptInfo(String sysPayNo);
}
