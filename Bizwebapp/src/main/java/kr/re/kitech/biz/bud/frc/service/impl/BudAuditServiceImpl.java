package kr.re.kitech.biz.bud.frc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import kr.re.kitech.biz.bud.frc.dao.BudAuditDAO;
import kr.re.kitech.biz.bud.frc.service.BudAuditService;
import kr.re.kitech.biz.bud.frc.vo.BudAuditVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("budAuditServiceImpl")
public class BudAuditServiceImpl implements BudAuditService {

	@Resource(name = "budAuditDAO")
	BudAuditDAO budAuditDao;

	/**
	*
	* selectBudAuditList
	* @param vo BudAuditVo 검색조건
	* @author HongSeongmin
	* @return List&lt;BudAuditVo&gt; 검색결과
	* @throws KitechException 검색 중 오류
	 */	
	@Override
	public List<BudAuditVo> selectBudAuditList(BudAuditVo vo) throws KitechException {
		List<BudAuditVo> retList = null;
		
		// elec 일 경우 감사전자결재내역 조회
		if (StringUtils.equals(vo.getWrk_clsf(), "elec")) {
			retList = budAuditDao.selectBudAuditElecList(vo);
		} else {
			retList = budAuditDao.selectBudAuditList(vo);
		}
	
		return retList;
	}
	
		/**
	*
	* aggregateAuditDetls
	* @param vo BudAuditListVo 집계 정보
	* @author HongSeongmin
	* @throws KitechException 집계 중 오류
	 */
	@Override
	public void aggregateAuditDetls(BudAuditVo vo) throws KitechException {
		budAuditDao.deleteBudAuditElec(vo);
		
		try {
			insertAggregateAudit(budAuditDao.selectBudAuditElecAgg01(vo)); //감사전자결재관리(집계)
			insertAggregateAudit(budAuditDao.selectBudAuditElecAgg02(vo)); //내부결재, 내부시행문, 외부시행문 조회
		} catch (Exception e) {
			throw new KitechException(Exceptions.ERROR, Business.BUD, "message.error.bud.frc.0001", e);
		}
	}
	
	private void insertAggregateAudit(List<BudAuditVo> elecList) throws KitechException {
		if (elecList == null) return;
		
		for (BudAuditVo vo : elecList) {
			vo.setRegst_syspayno(KitechContextUtil.getSyspayno());
			
			budAuditDao.insertBudAuditElec(vo);
		}
	}
	
}
