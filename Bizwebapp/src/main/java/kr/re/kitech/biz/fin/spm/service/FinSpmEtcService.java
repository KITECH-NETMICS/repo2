package kr.re.kitech.biz.fin.spm.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetDetlInfoVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo;
/**
 * 결의제외 재무관리 interface
 */
public interface FinSpmEtcService {
	/**
	* 회의록 목록조회
	*/
	public List<FspMeetVo> selectMeetList(FspMeetSearchVo vo);
	
	/**
	* 회의록 부서 코드 조회
	*/
	public List<FinCodeNmVo> selectDeptCodeList(FinCodeNmVo vo);
	
	/**
	* 회의록 상세 내용 조회
	*/
	public FspMeetDetlInfoVo selectMeetDetls(FspMeetSearchVo vo);
	
	/**
	* 회의록 작성시 참석자 재택근무정보 조회
	*/
	public List<FspMeetWorkTimeVo> selectHomeWorkInfo(FspMeetSearchVo vo);
	
	/**
	* 회의참석자 근태정보 조회
	*/
	public List<FspMeetWorkTimeVo> selectCwsWorkTime(FspMeetSearchVo vo);
	
	/**
	* 외부인 회의 참석 조회
	*/
	public List<FspMeetAttendVo> selectOutMeetPrsn(FspMeetSearchVo vo);
	
	/**
	* 회의록 저장
	*/
	public String saveMeetDetls(FspMeetDetlInfoVo vo);
	
	/**
	* 회의록 삭제
	*/
	public void deletMeetDetls(FspMeetSearchVo vo);
	
	/**
	* 회의참석자 과제참여 여부 조회
	*/
	public int selectMeetPrjAttendYn(FspMeetSearchVo vo);
	/**
	* 회의록 결의생성
	*/
	public String saveMeetSlip(FspMeetDetlInfoVo vo) throws Exception;
	/**
	* 회의록 계정의 국내출장계정과의 일치여부
	*/
	public List<FspMeetVo> selectCtrToMeetAccnt(FspMeetSearchVo vo);
	/**
	* 회의참석자 근태 재조회
	*/
	public List<FspMeetAttendVo> selectMeetAttend(FspMeetSearchVo vo);
}
