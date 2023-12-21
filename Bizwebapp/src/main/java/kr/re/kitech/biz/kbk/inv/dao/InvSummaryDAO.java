package kr.re.kitech.biz.kbk.inv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("invSummaryDao")
public class InvSummaryDAO extends BizDefaultAbstractDAO {

	public List<InvSummaryVo> selectBookSummary() throws KitechException {
		return (List<InvSummaryVo>)list("kr.re.kitech.biz.kbk.inv.selectBookSummary"); 
	}
	
	public List<InvSummaryVo> selectReportSummary() throws KitechException {
		return (List<InvSummaryVo>)list("kr.re.kitech.biz.kbk.inv.selectReportSummary"); 
	}
	
	public List<InvSummaryVo> selectJourSummary() throws KitechException {
		return (List<InvSummaryVo>)list("kr.re.kitech.biz.kbk.inv.selectJourSummary"); 
	}

}
