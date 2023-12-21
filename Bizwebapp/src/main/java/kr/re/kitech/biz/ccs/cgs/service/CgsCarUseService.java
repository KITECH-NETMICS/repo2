
package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo;

public interface CgsCarUseService {
	
	public List<CgsCarUseVo> selectListArea() throws ElException;
	
	public List<CgsCarUseVo> selectListCar(CgsCarUseVo CgsVo) throws ElException;
	
	public CgsCarUseVo selectCarAdmin(CgsCarUseVo CgsVo) throws ElException;
	
	public List<CgsCarUseVo> selectListCgsCarUse(CgsCarUseVo CgsVo) throws ElException;
	
	public int insertCgsCarUse(CgsCarUseVo CgsVo) throws Exception;
	
	public CgsCarUseVo selectDetailCgsCarUse(CgsCarUseVo CgsVo) throws ElException;
	
	public int updateCgsCarUse(CgsCarUseVo CgsVo) throws Exception;
	
	public int deleteCgsCarUse(CgsCarUseVo CgsVo) throws Exception;
	
	public int updatBiz(CgsCarUseVo CgsVo) throws Exception;
	
	public CgsCarUseVo dupCheckCarUse(CgsCarUseVo CgsVo) throws ElException;
	
	public CgsCarUseVo dupCheckCarUse2(CgsCarUseVo CgsVo) throws ElException;
	
	public void cgsMailSend(CgsCarUseVo cgsVo) throws ElException;
	

}