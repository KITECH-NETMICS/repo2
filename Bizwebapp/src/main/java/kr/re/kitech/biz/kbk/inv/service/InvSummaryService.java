package kr.re.kitech.biz.kbk.inv.service;

import kr.re.kitech.biz.kbk.inv.vo.InvAllSummaryVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface InvSummaryService {

	InvAllSummaryVo selectAllSummary() throws KitechException;

}
