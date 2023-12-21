package kr.re.kitech.biz.kbk.bmg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.vo.KbkOutUrlVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("bmgOutUrlDAO")
public class BmgOutUrlDAO extends BizDefaultAbstractDAO {
	
	/**
     * 전자정보 조회
     * @param KbkOutUrlVo
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<KbkOutUrlVo> selectKbkOutUrlList(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		return list("kr.re.kitech.biz.kbk.bmg.selectKbkOutUrlList", kbkOutUrlVo);
	}
	
	/**
     * 전자정보관리 조회
     * @param KbkOutUrlVo
     * @return KbkOutUrlVo
     * @throws Exception
     */
	public KbkOutUrlVo selectKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		return (KbkOutUrlVo)selectByPk("kr.re.kitech.biz.kbk.bmg.selectKbkOutUrlReg", kbkOutUrlVo);
	}
	
	/**
     * 전자정보관리 등록
     * @param KbkOutUrlVo
     * @return
     * @throws Exception
     */
	public void insertKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		update("kr.re.kitech.biz.kbk.bmg.insertKbkOutUrlReg", kbkOutUrlVo);
	}
	
	/**
     * 전자정보관리 등록
     * @param KbkOutUrlVo
     * @return
     * @throws Exception
     */
	public void updateKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		update("kr.re.kitech.biz.kbk.bmg.updateKbkOutUrlReg", kbkOutUrlVo);
	}
	
	/**
     * 전자정보관리 등록
     * @param KbkOutUrlVo
     * @return
     * @throws Exception
     */
	public void deleteKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
		delete("kr.re.kitech.biz.kbk.bmg.deleteKbkOutUrlReg", kbkOutUrlVo);
	}
}