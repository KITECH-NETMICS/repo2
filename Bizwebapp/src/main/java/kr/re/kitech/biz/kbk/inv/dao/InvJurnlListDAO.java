package kr.re.kitech.biz.kbk.inv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("invJurnlListDAO")
public class InvJurnlListDAO extends BizDefaultAbstractDAO {
	
	public List<InvJurnlVolVo> selectJurnlList(InvJurnlVolVo vo) throws KitechException {
		return list("kr.re.kitech.biz.kbk.inv.selectJurnlList", vo);
	}
}