
package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo;

public interface CgsDormReqService {
	
	public List<CgsDormReqVo> selectListCgsDormReq(CgsDormReqVo cgsDormReqVo) throws ElException;
	
	public CgsDormReqVo selectHoliyday(CgsDormReqVo cgsDormReqVo) throws ElException;

	public List<CgsDormVo> selectListCgsDorm(CgsDormVo cgsDormVo) throws ElException;
	
	public List<CgsDormVo> selectListCgsDormNo(CgsDormVo cgsDormVo) throws ElException;
	
	public List<CgsDormReqVo> selectListCgsDormApprovDate(CgsDormReqVo cgsDormReqVo) throws ElException;
	
	public List<CgsDormReqVo> selectListHoliday(CgsDormReqVo cgsDormReqVo) throws ElException;
	
	public List<CgsDormReqVo> selectListPosi() throws ElException;
	
	public int insertCgsDorm(CgsDormReqVo cgsDormReqVo) throws Exception;
	
	public int insertCgsDormStand(CgsDormReqVo cgsDormReqVo) throws Exception;
	
	public int deleteCgsDorm(CgsDormReqVo cgsDormReqVo) throws Exception;
	
	public void cgsMailSend(CgsDormReqVo cgsDormReqVo) throws ElException;

}