package kr.re.kitech.biz.uss.ath.service;

import java.util.List;

import kr.re.kitech.biz.uss.ath.vo.UserSrcVo;
import kr.re.kitech.biz.xom.core.vo.RoleVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

public interface UssAthRoleMntService {
	/*
	* 롤관리 및 사용자관리 시스템 구분 조회
	*/
	public List<ServiceVo> findServiceTopDivCode(ServiceVo vo);
	/*
	* 롤관리 및 사용자관리 사용자(콤보박스) 조회
	*/
	public List<UserVo> findUsers(UserSrcVo vo);
	/*
	* 사용자별 롤등록관리 사용자리스트 조회
	*/
	public List<UserVo> findUserList(UserSrcVo vo);
	/*
	* 사용자별 롤등록관리 사용자별 롤 등록리스트 조회
	*/
	public List<RoleVo> findUserRoleList(UserSrcVo vo);
	/*
	* 사용자별 롤등록관리 - 롤 조회
	*/
	public List<RoleVo> findRoleList(UserSrcVo vo);
	/*
	* 사용자별 롤등록관리 - 사용자롤 저장
	*/
	public void saveUserRole(UserVo vo) throws Exception;
}
