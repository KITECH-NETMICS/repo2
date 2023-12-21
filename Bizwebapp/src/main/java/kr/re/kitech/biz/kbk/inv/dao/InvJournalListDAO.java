package kr.re.kitech.biz.kbk.inv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.inv.vo.InvJournalVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("invJournalListDAO")
public class InvJournalListDAO extends BizDefaultAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<InvJournalVo> selectJournalList(InvJournalVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectJournalList", vo);
	}

}
