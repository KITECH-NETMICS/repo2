package kr.re.kitech.biz.kbk.inv.service;

import java.util.List;

import kr.re.kitech.biz.kbk.inv.vo.InvJournalVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface InvJournalListService {

	public List<InvJournalVo> selectJournalList(InvJournalVo vo) throws KitechException;

}
