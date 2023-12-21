package kr.re.kitech.biz.kbk.inv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.inv.vo.InvReportVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("invReportListDao")
public class InvReportListDAO extends BizDefaultAbstractDAO {
	
	public List<InvReportVo> selectReportList(InvReportVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectReportList", vo);
	}
	
}
