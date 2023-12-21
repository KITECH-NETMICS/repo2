package kr.re.kitech.biz.kbk.bmg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.dao.BmgOutUrlDAO;
import kr.re.kitech.biz.kbk.bmg.service.BmgOutUrlService;
import kr.re.kitech.biz.kbk.bmg.vo.KbkOutUrlVo;

@Service("bmgOutUrlService")
public class BmgOutUrlServiceImpl implements BmgOutUrlService {
	
	@Resource(name="bmgOutUrlDAO")
    private BmgOutUrlDAO bmgOutUrlDAO;
	
	
	@Override
	public List<KbkOutUrlVo> selectKbkOutUrlList(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		return bmgOutUrlDAO.selectKbkOutUrlList(kbkOutUrlVo);
	}
	
	@Override
	public KbkOutUrlVo selectKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		return bmgOutUrlDAO.selectKbkOutUrlReg(kbkOutUrlVo);
	}

	@Override
	public void insertKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		bmgOutUrlDAO.insertKbkOutUrlReg(kbkOutUrlVo);
	}
	
	@Override
	public void updateKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		bmgOutUrlDAO.updateKbkOutUrlReg(kbkOutUrlVo);
	}
	
	@Override
	public void deleteKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		bmgOutUrlDAO.deleteKbkOutUrlReg(kbkOutUrlVo);
	}
}