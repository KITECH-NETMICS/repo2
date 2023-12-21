package kr.re.kitech.biz.kbk.bmg.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.vo.KbkOutUrlVo;

public interface BmgOutUrlService {
	
	public List<KbkOutUrlVo> selectKbkOutUrlList(KbkOutUrlVo kbkOutUrlVo) throws ElException;
	
	public KbkOutUrlVo selectKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException;
	
	public void insertKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException;
	
	public void updateKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException;
	
	public void deleteKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException;
}