package kr.re.kitech.biz.kbk.inv.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.inv.dao.InvPaperListDAO;
import kr.re.kitech.biz.kbk.inv.service.InvPaperListService;
import kr.re.kitech.biz.kbk.inv.vo.InvPaperVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("invPaperListServiceImpl")
public class InvPaperListServiceImpl implements InvPaperListService {

	@Resource(name="invPaperListDAO")
	InvPaperListDAO invPaperListDAO;

	@Override
	public List<InvPaperVo> selectPaperList(InvPaperVo vo) throws KitechException {
	
		return invPaperListDAO.selectPaperList(vo);
	}
}