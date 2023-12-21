package kr.re.kitech.biz.kbk.inv.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.inv.dao.InvBookListDAO;
import kr.re.kitech.biz.kbk.inv.service.InvBookListService;
import kr.re.kitech.biz.kbk.inv.vo.InvBookSearchVo;
import kr.re.kitech.biz.kbk.inv.vo.InvBookVo;
import kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("invBookListServiceImpl")
public class InvBookListServiceImpl implements InvBookListService {


	@Resource(name="invBookListDao")
	InvBookListDAO invBookListDao;

	@Override
	public List<InvBookVo> selectBookList(InvBookSearchVo vo) throws KitechException {
		return invBookListDao.selectBookList(vo);
	}

	@Override
	public List<InvTransBookVo> selectTransBookList(InvTransBookVo vo) throws KitechException {
		return invBookListDao.selectTransBookList(vo);
	}

}
