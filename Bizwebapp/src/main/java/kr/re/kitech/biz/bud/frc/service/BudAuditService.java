package kr.re.kitech.biz.bud.frc.service;

import java.util.List;

import kr.re.kitech.biz.bud.frc.vo.BudAuditVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface BudAuditService {
	
	/**
	*
	* selectBudAuditList
	* @param vo BudAuditVo 검색조건
	* @author HongSeongmin
	* @return List&lt;BudAuditVo&gt; 검색결과
	* @throws KitechException 검색 중 오류
	 */
	public List<BudAuditVo> selectBudAuditList(BudAuditVo vo) throws KitechException;
	
			/**
	*
	* selectBudAuditList
	* @param vo BudAuditVo 집계 정보
	* @author HongSeongmin
	* @throws KitechException 집계 중 오류
	 */
	public void aggregateAuditDetls(BudAuditVo vo) throws KitechException;
}
