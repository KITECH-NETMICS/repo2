package kr.re.kitech.biz.kbk.bmg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.dao.BmgJurnlNoDAO;
import kr.re.kitech.biz.kbk.bmg.service.BmgJurnlService;
import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlContntVo;
import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlNoVo;

@Service("bmgJurnlService")
public class BmgJurnlServiceImpl implements BmgJurnlService {
	
	@Resource(name="bmgJurnlNoDAO")
    private BmgJurnlNoDAO bmgJurnlNoDAO;
	
	
	@Override
	public List<KbkJurnlNoVo> selectKbkBmgJurnlNo(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
		return bmgJurnlNoDAO.selectKbkBmgJurnlNo(kbkJurnlNoVo);
	}
	
	@Override
	public List<KbkJurnlContntVo> selectKbkBmgJurnlNoList(KbkJurnlContntVo kbkJurnlContntVo) throws ElException {
    	return bmgJurnlNoDAO.selectKbkBmgJurnlNoList(kbkJurnlContntVo);
    }
    
    @Override
	public KbkJurnlNoVo selectKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	return bmgJurnlNoDAO.selectKbkJurnlNoReg(kbkJurnlNoVo);
    }
    
    @Override
    public void insertKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	bmgJurnlNoDAO.insertKbkJurnlNoReg(kbkJurnlNoVo);
    }
    
    @Override
    public void updateKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	bmgJurnlNoDAO.updateKbkJurnlNoReg(kbkJurnlNoVo);
    }
    
    @Override
    public void deleteKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	bmgJurnlNoDAO.deleteKbkJurnlNoReg(kbkJurnlNoVo);
    }
}