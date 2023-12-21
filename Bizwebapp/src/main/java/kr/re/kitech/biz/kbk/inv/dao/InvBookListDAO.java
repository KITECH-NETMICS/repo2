package kr.re.kitech.biz.kbk.inv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.inv.vo.InvBookSearchVo;
import kr.re.kitech.biz.kbk.inv.vo.InvBookVo;
import kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("invBookListDao")
public class InvBookListDAO extends BizDefaultAbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<InvBookVo> selectBookList(InvBookSearchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectBookList", vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<InvTransBookVo> selectTransBookList(InvTransBookVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectTransBookList", vo);
	}
	
}
