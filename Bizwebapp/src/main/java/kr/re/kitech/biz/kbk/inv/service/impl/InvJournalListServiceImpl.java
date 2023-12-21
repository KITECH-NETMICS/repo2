package kr.re.kitech.biz.kbk.inv.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.inv.dao.InvJournalListDAO;
import kr.re.kitech.biz.kbk.inv.service.InvJournalListService;
import kr.re.kitech.biz.kbk.inv.vo.InvJournalVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("invJournalListServiceImpl")
public class InvJournalListServiceImpl implements InvJournalListService {

	@Resource(name="invJournalListDAO")
	InvJournalListDAO invJournalListDAO;

	@Override
	public List<InvJournalVo> selectJournalList(InvJournalVo vo) throws KitechException {

		return invJournalListDAO.selectJournalList(vo);
	}

}
