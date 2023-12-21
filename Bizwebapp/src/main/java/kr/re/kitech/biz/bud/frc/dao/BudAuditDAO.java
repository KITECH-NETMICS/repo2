package kr.re.kitech.biz.bud.frc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.bud.frc.vo.BudAuditVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("budAuditDAO")
public class BudAuditDAO extends BizDefaultAbstractDAO {
	
	/**
	*	감사내역 조회
	*/
	public List<BudAuditVo> selectBudAuditList(BudAuditVo vo) {
		return list("kr.re.kitech.biz.bud.frc.selectBudAuditList", vo);
	}

	/**
	*	감사전자결재관리
	*/	
	public List<BudAuditVo> selectBudAuditElecList(BudAuditVo vo) {
		return list("kr.re.kitech.biz.bud.frc.selectBudAuditElecList", vo);
	}
	
	/**
	*	감사전자결재관리(집계)
	*/	
	public List<BudAuditVo> selectBudAuditElecAgg01(BudAuditVo vo) {
		return list("kr.re.kitech.biz.bud.frc.selectBudAuditElecAgg01", vo);
	}
	
	/**
	*	감사전자결재관리(집계- 내부결재, 내부시행문, 외부시행문) 조회
	*/	
	public List<BudAuditVo> selectBudAuditElecAgg02(BudAuditVo vo) {
		return list("kr.re.kitech.biz.bud.frc.selectBudAuditElecAgg02", vo);
	}
	
	/**
	*	감사전자결재관리 delete
	*/	
	public int deleteBudAuditElec(BudAuditVo vo) {
		return delete("kr.re.kitech.biz.bud.frc.deleteBudAuditElec", vo);
	}
	
	/**
	*	감사전자결재집계 insert
	*/	
	public int insertBudAuditElec(BudAuditVo vo) {
		return insert("kr.re.kitech.biz.bud.frc.insertBudAuditElec", vo);
	}
}
