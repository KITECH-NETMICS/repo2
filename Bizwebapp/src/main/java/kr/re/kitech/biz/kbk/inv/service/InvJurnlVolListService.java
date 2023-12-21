package kr.re.kitech.biz.kbk.inv.service;

import java.util.List;

import kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface InvJurnlVolListService {

	public List<InvJurnlVolVo> selectJurnlVolList(InvJurnlVolVo vo) throws KitechException;

}
