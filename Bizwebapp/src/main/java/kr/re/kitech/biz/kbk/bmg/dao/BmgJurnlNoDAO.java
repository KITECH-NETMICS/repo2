package kr.re.kitech.biz.kbk.bmg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlContntVo;
import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlNoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("bmgJurnlNoDAO")
public class BmgJurnlNoDAO extends BizDefaultAbstractDAO {
	
	/**
     * 저널 조회
     * @param KbkJurnlNoVo
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<KbkJurnlNoVo> selectKbkBmgJurnlNo(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
		return (List<KbkJurnlNoVo>)list("kr.re.kitech.biz.kbk.bmg.selectKbkBmgJurnlNo", kbkJurnlNoVo);
	}
	
	/**
     * 저널권호 조회
     * @param KbkJurnlContntVo
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<KbkJurnlContntVo> selectKbkBmgJurnlNoList(KbkJurnlContntVo kbkJurnlContntVo) throws ElException {
		return (List<KbkJurnlContntVo>)list("kr.re.kitech.biz.kbk.bmg.selectKbkBmgJurnlNoList", kbkJurnlContntVo);
	}
	
	/**
     * 저널기본정보 조회
     * @param KbkJurnlNoVo
     * @return List
     * @throws Exception
     */
	public KbkJurnlNoVo selectKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	return (KbkJurnlNoVo)selectByPk("kr.re.kitech.biz.kbk.bmg.selectKbkJurnlNoReg", kbkJurnlNoVo);
    }
    
    /**
     * 저널기본정보 등록
     * @param KbkJurnlNoVo
     * @return void
     * @throws Exception
     */
	public void insertKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	update("kr.re.kitech.biz.kbk.bmg.insertKbkJurnlNoReg", kbkJurnlNoVo);
    }
    
    /**
     * 저널기본정보 수정
     * @param KbkJurnlNoVo
     * @return void
     * @throws Exception
     */
	public void updateKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	update("kr.re.kitech.biz.kbk.bmg.updateKbkJurnlNoReg", kbkJurnlNoVo);
    }
    
    /**
     * 저널기본정보 삭제
     * @param KbkJurnlNoVo
     * @return void
     * @throws Exception
     */
	public void deleteKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	update("kr.re.kitech.biz.kbk.bmg.deleteKbkJurnlNoReg", kbkJurnlNoVo);
    }
}