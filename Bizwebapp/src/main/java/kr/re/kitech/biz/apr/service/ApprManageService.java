package kr.re.kitech.biz.apr.service;

import kr.re.kitech.biz.apr.vo.AprMngVo;

/**
 * 관리자 전자결재 처리 서비스
 * @author 이영희
 * @since 2022.10.04.
 */
public interface ApprManageService {
	/*
	 * Bpm 삭제
     */
	public void removeBpmProcInst(String name);
	
	/*
	 * Bpm 삭제(구매 통제금액 정리시 호출)
     */
	public void removeBpmProcInst(AprMngVo vo);
	/*
	 * Bpm 건수 조회
     */
	public int selectBpmProcInstCnt(String name);
}
