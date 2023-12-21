package kr.re.kitech.biz.pat.pbd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pbd.vo.PatFrmVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("PatFrmDAO")
public class PatFrmDAO extends BizDefaultAbstractDAO{
	public List<PatFrmVo> selectList(PatFrmVo vo) throws ElException {
	    List<PatFrmVo> result = (List<PatFrmVo>)list("kr.re.kitech.biz.pat.pbd.selectFrmBoard", vo); 
	    return result;
	}
	
	public PatFrmVo selectSingleItem(PatFrmVo vo) throws ElException {
		return (PatFrmVo) selectByPk("kr.re.kitech.biz.pat.pbd.selectItemFrmBoard", vo);
	}
	
	public int insertItem(PatFrmVo vo) throws ElException {
		return insert("kr.re.kitech.biz.pat.pbd.insertItemFrmBoard", vo);
	}

	public int updateItem(PatFrmVo vo) throws ElException {
		return update("kr.re.kitech.biz.pat.pbd.updateItemFrmBoard", vo);
	}

	public int deleteItem(PatFrmVo vo) throws ElException {
		return delete("kr.re.kitech.biz.pat.pbd.deleteItemFrmBoard", vo);
	}
}
