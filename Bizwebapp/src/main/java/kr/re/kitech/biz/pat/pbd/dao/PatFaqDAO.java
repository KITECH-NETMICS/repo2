package kr.re.kitech.biz.pat.pbd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pbd.vo.PatFaqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("PatFaqDAO")
public class PatFaqDAO extends BizDefaultAbstractDAO{
	public List<PatFaqVo> selectList(PatFaqVo vo) throws ElException {
	    List<PatFaqVo> result = (List<PatFaqVo>)list("kr.re.kitech.biz.pat.pbd.selectFaqBoard", vo); 
	    return result;
	}
	
	public PatFaqVo selectSingleItem(PatFaqVo vo) throws ElException {
		return (PatFaqVo) selectByPk("kr.re.kitech.biz.pat.pbd.selectItemFaqBoard", vo);
	}
	
	public int insertItem(PatFaqVo vo) throws ElException {
		return insert("kr.re.kitech.biz.pat.pbd.insertItemFaqBoard", vo);
	}

	public int updateItem(PatFaqVo vo) throws ElException {
		return update("kr.re.kitech.biz.pat.pbd.updateItemFaqBoard", vo);
	}

	public int deleteItem(PatFaqVo vo) throws ElException {
		return delete("kr.re.kitech.biz.pat.pbd.deleteItemFaqBoard", vo);
	}
}
