package kr.re.kitech.biz.kbk.inv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.inv.vo.InvPaperVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("invPaperListDAO")
public class InvPaperListDAO extends BizDefaultAbstractDAO {
	
	public List<InvPaperVo> selectPaperList(InvPaperVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectPaperList", vo);
	}
}