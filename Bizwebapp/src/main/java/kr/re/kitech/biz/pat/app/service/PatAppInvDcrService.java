package kr.re.kitech.biz.pat.app.service;

import java.util.List;

import kr.re.kitech.biz.pat.app.vo.PatAppInvDcrInfoVo;
import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatDftInvDcrListVo;
import kr.re.kitech.biz.pat.app.vo.PatSrcVo;

public interface PatAppInvDcrService {
	/*
     * 발명신고서 목록 조회
     */
	public List<PatDftInvDcrListVo> selectPatAppMastrList(PatDftInvDcrListVo vo);
	/*
     * 발명신고서 상세 조회
     */
	public PatAppInvDcrInfoVo selectPatAppInvDcr(PatSrcVo vo);
	/*
     * 발명신고서 저장
     */
	public String savePatAppInvDcr(PatAppInvDcrInfoVo vo) throws Exception;
	
	/*
     * 발명신고서 양도인 승인 또는 반려
     */
	public void updatePatAppCoInvntPsnApr(PatCoinvntPsnVo vo);
	/*
     * 발명신고서 삭제
     */
	public void deletePatAppInvDcr(PatSrcVo vo);
}
