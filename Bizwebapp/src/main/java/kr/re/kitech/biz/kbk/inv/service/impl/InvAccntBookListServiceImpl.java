package kr.re.kitech.biz.kbk.inv.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.inv.dao.InvAccntBookListDAO;
import kr.re.kitech.biz.kbk.inv.service.InvAccntBookListService;
import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("invAccntBookListServiceImpl")
public class InvAccntBookListServiceImpl implements InvAccntBookListService {

	@Resource(name="invAccntBookListDAO")
	InvAccntBookListDAO invAccntBookListDao;

	@Override
	public List<InvAccntBookVo> selectBookList1(InvAccntBookVo vo) throws KitechException {
		return invAccntBookListDao.selectBookList1(vo);
	}
	
	@Override
	public List<InvAccntBookVo> selectBookList2(InvAccntBookVo vo) throws KitechException {
		return invAccntBookListDao.selectBookList2(vo);
	}

}
