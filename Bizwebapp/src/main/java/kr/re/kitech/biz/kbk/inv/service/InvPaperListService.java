package kr.re.kitech.biz.kbk.inv.service;

import java.util.List;

import kr.re.kitech.biz.kbk.inv.vo.InvPaperVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface InvPaperListService {

	public List<InvPaperVo> selectPaperList(InvPaperVo vo) throws KitechException;

}
