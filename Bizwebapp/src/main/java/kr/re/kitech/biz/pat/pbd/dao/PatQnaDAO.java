package kr.re.kitech.biz.pat.pbd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pbd.vo.PatQnaVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("PatQnaDAO")
public class PatQnaDAO extends BizDefaultAbstractDAO{
	public List<PatQnaVo> selectList(PatQnaVo vo) throws ElException {
	    List<PatQnaVo> result = (List<PatQnaVo>)list("kr.re.kitech.biz.pat.pbd.selectQnaBoard", vo); 
	    return result;
	}
	
	public PatQnaVo selectSingleItem(PatQnaVo vo) throws ElException {
		return (PatQnaVo) selectByPk("kr.re.kitech.biz.pat.pbd.selectItemQnaBoard", vo);
	}
	
	public PatQnaVo selectreqUserInfo(PatQnaVo vo) throws ElException {
		return (PatQnaVo) selectByPk("kr.re.kitech.biz.pat.pbd.selectreqUserInfo", vo);
	}	
	
	public int insertItem(PatQnaVo vo) throws ElException {
		return insert("kr.re.kitech.biz.pat.pbd.insertItemQnaBoard", vo);
	}
	
	public int insertPatQna(PatQnaVo vo) throws ElException {
		return insert("kr.re.kitech.biz.pat.pbd.insertPatQna", vo);
	}
	
	public int insertPatQnaDetail(PatQnaVo vo) throws ElException {
		return insert("kr.re.kitech.biz.pat.pbd.insertPatQnaDetail", vo);
	}		

	public int updateItem(PatQnaVo vo) throws ElException {
		return update("kr.re.kitech.biz.pat.pbd.updateItemQnaBoard", vo);
	}
	
	public int updatePatPbdQnaDtl(PatQnaVo vo) throws ElException {
		return update("kr.re.kitech.biz.pat.pbd.updatePatPbdQnaDtl", vo);
	}	

	public int deleteItem(PatQnaVo vo) throws ElException {
		return delete("kr.re.kitech.biz.pat.pbd.deleteItemQnaBoard", vo);
	}
}
