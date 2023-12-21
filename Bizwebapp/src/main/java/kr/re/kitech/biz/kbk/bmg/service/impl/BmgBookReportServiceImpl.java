package kr.re.kitech.biz.kbk.bmg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.dao.BmgBookReportDAO;
import kr.re.kitech.biz.kbk.bmg.service.BmgBookReportService;
import kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo;
import kr.re.kitech.biz.kbk.bmg.vo.BmgSearchVo;

@Service("bmgBookReportServiceImpl")
public class BmgBookReportServiceImpl implements BmgBookReportService {

	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
    @Resource(name="bmgBookReportDAO")
    private BmgBookReportDAO bmgBookReportDAO;
    
	@Override
	public List<BmgBookReportVo> selectListBookReport(BmgSearchVo searchVo) throws ElException {
		
		List<BmgBookReportVo> returnVo = null;
		
		if (searchVo.getData_clsf().equals("KAD001")) {
			returnVo =  bmgBookReportDAO.selectBook(searchVo);
		} else if (searchVo.getData_clsf().equals("KAD002")) {
			returnVo =  bmgBookReportDAO.selectReport(searchVo);
		} else {
			returnVo =  bmgBookReportDAO.selectBookReport(searchVo);
		}
		
		return returnVo;
	}
	
	@Override
	public void updateBookReportReserve(BmgSearchVo searchVo) throws ElException {
		bmgBookReportDAO.updateBookReportReserve(searchVo);
	}
	
}
