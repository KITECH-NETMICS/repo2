package kr.re.kitech.biz.uss.bas.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo;
import kr.re.kitech.biz.uss.bas.vo.ComBasIPReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("comBasIPReqDAO")
public class ComBasIPReqDAO extends BizDefaultAbstractDAO {

	public ComBasIPReqVo selectItemXomBasIPAply(ComBasIPReqVo vo) throws KitechException {
		return (ComBasIPReqVo) selectByPk("kr.re.kitech.biz.com.bas.selectItemXomBasIPAply", vo);
	}
	
	public List<ComBasIPReqAssVo> selectListItemXomBasAssInfo(ComBasIPReqVo vo) throws KitechException {
		return list("kr.re.kitech.biz.com.bas.selectListItemXomBasAss", vo);
	}
}
