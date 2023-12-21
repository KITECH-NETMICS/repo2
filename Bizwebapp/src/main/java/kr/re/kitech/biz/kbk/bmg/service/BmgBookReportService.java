package kr.re.kitech.biz.kbk.bmg.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo;
import kr.re.kitech.biz.kbk.bmg.vo.BmgSearchVo;

public interface BmgBookReportService {
	public List<BmgBookReportVo> selectListBookReport(BmgSearchVo searchVo) throws ElException;
	public void updateBookReportReserve(BmgSearchVo searchVo) throws ElException;
}
