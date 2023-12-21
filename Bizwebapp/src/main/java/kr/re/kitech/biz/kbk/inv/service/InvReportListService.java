package kr.re.kitech.biz.kbk.inv.service;

import java.util.List;

import kr.re.kitech.biz.kbk.inv.vo.InvReportVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface InvReportListService {

	List<InvReportVo> selectReportList(InvReportVo vo) throws KitechException;

}
