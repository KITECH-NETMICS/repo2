package kr.re.kitech.biz.kbk.inv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("invAccntBookListDAO")
public class InvAccntBookListDAO extends BizDefaultAbstractDAO {
	
	public List<InvAccntBookVo> selectBookList1(InvAccntBookVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectAccntBookList1", vo);
	}
	
	public List<InvAccntBookVo> selectBookList2(InvAccntBookVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectAccntBookList2", vo);
	}
	
}
