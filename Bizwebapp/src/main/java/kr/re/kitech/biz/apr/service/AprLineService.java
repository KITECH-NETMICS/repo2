package kr.re.kitech.biz.apr.service;

import java.util.List;

import kr.re.kitech.biz.apr.vo.AprDeptVo;
import kr.re.kitech.biz.apr.vo.AprLineDescVo;
import kr.re.kitech.biz.apr.vo.AprLineVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 결재선관리 공통 서비스
 * @author 박병목
 * @since 2022. 6. 24.
 */
public interface AprLineService {

	/**
	 * 개인별 결재선 등록
	 *
	 * @param AprLineVo
	 * @return
	 */
	public void insertAprLine(AprLineVo vo, List<AprLineDescVo> listVo) throws KitechException;
	
	/**
	 * 개인별 결재선 수정
	 *
	 * @param AprLineVo
	 * @return
	 */
	public void updateAprLine(AprLineVo vo, List<AprLineDescVo> listVo) throws KitechException;
	
	/**
	 * 개인별 결재선 삭세
	 *
	 * @param AprLineVo
	 * @return
	 */
	public void deleteAprLine(AprLineVo vo) throws KitechException;
	
	/**
	 * 개인별 결재선 리스트 조회
	 *
	 * @param UserVo
	 * @return AprLineListVo
	 */
	public List<AprLineVo> selectAprLineList(AprUserVo vo) throws KitechException;
	
	/**
	 * 개인별 선택된 결재라인 조회
	 *
	 * @param AprLineVo
	 * @return AprLineDescVo
	 */
	public List<AprLineDescVo> selectAprLineDescList(AprLineVo vo) throws KitechException;
	
	/**
	 * 결재 사용자 조회
	 *
	 * @param AprUserVo
	 * @return List<AprUserVo>
	 */
	public List<AprUserVo> selectAprUserList(AprUserVo vo) throws KitechException;
	
	/**
	 * 개인별 초기 결재라인 세팅
	 *
	 * @param AprVo
	 * @return List<AprUserVo>
	 */
	public List<AprUserVo> selectBaseAprLine(AprVo vo) throws KitechException;
	
	/**
	 * 전결 결재라인 세팅
	 *
	 * @param AprVo, String
	 * @return List<AprUserVo>
	 */
	public List<AprUserVo> selectBaseAprLineAll(AprVo vo, String auditYn) throws KitechException;
	
	/**
	 * 수신결재 차상위자 세팅
	 *
	 * @param AprVo
	 * @return List<AprUserVo>
	 */
	public List<AprUserVo> selectSuSinAprLine(AprVo vo) throws KitechException;
	
	/**
	 * 부서 라인 세팅(APR)
	 *
	 * @param AprDeptVo
	 * @return List<AprDeptVo>
	 */
	public List<AprDeptVo> selectBaseDeptLine(AprDeptVo vo) throws KitechException;
	
	/**
	 * 부서별 사용자 세팅(APR)
	 *
	 * @param AprDeptVo
	 * @return AprUserListVo
	 */
	public List<AprUserVo> selectDeptToUserLine(AprDeptVo vo) throws KitechException;
}
