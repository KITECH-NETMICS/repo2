package kr.re.kitech.biz.kbk.bmg.dao;

import java.util.List;

import javax.el.ELException;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo;
import kr.re.kitech.biz.kbk.bmg.vo.BmgSearchVo;

@Repository("bmgBookReportDAO")
public class BmgBookReportDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {
	
	public List<BmgBookReportVo> selectBookReport(BmgSearchVo searchVo) throws ELException {	
		List<BmgBookReportVo> result = (List<BmgBookReportVo>)list("kr.re.kitech.biz.kbk.bmg.selectBookReport", searchVo);
		
		return result;
	}
	
	public List<BmgBookReportVo> selectBook(BmgSearchVo searchVo) throws ELException {	
		List<BmgBookReportVo> result = (List<BmgBookReportVo>)list("kr.re.kitech.biz.kbk.bmg.selectBook", searchVo);
		
		return result;
	}
	
	public List<BmgBookReportVo> selectReport(BmgSearchVo searchVo) throws ELException {	
		List<BmgBookReportVo> result = (List<BmgBookReportVo>)list("kr.re.kitech.biz.kbk.bmg.selectReport", searchVo);
		
		return result;
	}
	
	public void updateBookReportReserve(BmgSearchVo searchVo) throws ElException {
		update("kr.re.kitech.biz.kbk.bmg.updateBookReserve", searchVo);
	}
	
}
