package kr.re.kitech.biz.kbk.inv.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.inv.dao.InvJurnlListDAO;
import kr.re.kitech.biz.kbk.inv.service.InvJurnlVolListService;
import kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("invJurnlVolListServiceImpl")
public class InvJurnlVolListServiceImpl implements InvJurnlVolListService {

	@Resource(name="invJurnlListDAO")
	InvJurnlListDAO invJurnlListDAO;

	@Override
	public List<InvJurnlVolVo> selectJurnlVolList(InvJurnlVolVo vo) throws KitechException {
	
		return invJurnlListDAO.selectJurnlList(vo);
	}
}