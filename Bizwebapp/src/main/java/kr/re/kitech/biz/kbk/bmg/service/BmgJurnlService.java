package kr.re.kitech.biz.kbk.bmg.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlContntVo;
import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlNoVo;

public interface BmgJurnlService {
	
	public List<KbkJurnlNoVo> selectKbkBmgJurnlNo(KbkJurnlNoVo kbkJurnlNoVo) throws ElException;
	
	public List<KbkJurnlContntVo> selectKbkBmgJurnlNoList(KbkJurnlContntVo kbkJurnlContntVo) throws ElException;
	
	public KbkJurnlNoVo selectKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException;
	
	public void insertKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException;
	
	public void updateKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException;
	
	public void deleteKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException;
}