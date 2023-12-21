package kr.re.kitech.biz.xom.core.service;

import java.util.List;

import kr.re.kitech.biz.xom.core.vo.ApprMapVo;
import kr.re.kitech.biz.xom.core.vo.ApprvConfigVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo;
import kr.re.kitech.biz.xom.core.vo.UserAppvConfigVo;

/**
 * user 환경설정 인터페이스
 * @author 이영희
 * @since 2022.08.16.
 */
public interface ApprvConfigService {
	/**
     * user 환경설정 조회
     */
	public UserAppvConfigVo selectApprvConfig(ApprvConfigVo vo);
	
	/**
     * user 환경설정 저장
     */
	public void saveApprvConfig(ApprvConfigVo vo);
	
	/**
     * 양식함 Tree 조회
     */
	public List<ApprMapVo> selectAppvMapList(ApprvConfigVo vo);
	
	/**
     * 대결설정 조회
     */
	public UserAppvConfigVo selectApprvDlgt(AppvDelegatorVo vo);
	
	/**
     * 대결설정 저장
     */
	public void saveAppvDelegator(UserAppvConfigVo vo);
	
	/**
     * 대결설정 저장 (사용자의 전체 대결목록 삭제 후 메인담당자 단건 저장) -> 퇴직신청시 사용.
     */
	public void saveAppvDelegator(AppvDelegatorVo dlgtVo);
	
	/**
     * 대결설정 삭제
     */
	public void deleteAppvDelegator(AppvDelegatorDetailVo vo);
	
	/**
     * 대결설정 삭제 (특정 사용자의 전체 대결설정 목록 삭제) -> 아이디발급시 사용.
     */
	public void deleteAppvDelegatorAll(String syspayno);
}
