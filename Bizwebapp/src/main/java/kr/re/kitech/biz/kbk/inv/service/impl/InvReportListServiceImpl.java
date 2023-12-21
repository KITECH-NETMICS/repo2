package kr.re.kitech.biz.kbk.inv.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.inv.dao.InvReportListDAO;
import kr.re.kitech.biz.kbk.inv.service.InvReportListService;
import kr.re.kitech.biz.kbk.inv.vo.InvReportVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("invReportListServiceImpl")
public class InvReportListServiceImpl implements InvReportListService {

	@Resource(name="invReportListDao")
	InvReportListDAO invReportListDao;

	@Override
	public List<InvReportVo> selectReportList(InvReportVo vo) throws KitechException {
		return invReportListDao.selectReportList(vo);
	}

}
