package kr.re.kitech.biz.kbk.inv.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.inv.dao.InvSummaryDAO;
import kr.re.kitech.biz.kbk.inv.service.InvSummaryService;
import kr.re.kitech.biz.kbk.inv.vo.InvAllSummaryVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("invSummaryServiceImpl")
public class InvSummaryServiceImpl implements InvSummaryService {

	@Resource(name="invSummaryDao")
	InvSummaryDAO invSummaryDao;

	@Override
	public InvAllSummaryVo selectAllSummary() throws KitechException {
		InvAllSummaryVo retVo = new InvAllSummaryVo();
		
		retVo.setInvBookSummaryVo(invSummaryDao.selectBookSummary());
		retVo.setInvReportSummaryVo(invSummaryDao.selectReportSummary());
		retVo.setInvJournalSummaryVo(invSummaryDao.selectJourSummary());
		
		return retVo;
	}

}
