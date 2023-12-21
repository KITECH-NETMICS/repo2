package kr.re.kitech.biz.pat.pbd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("PatNoticeDAO")
public class PatNoticeDAO extends BizDefaultAbstractDAO{
	public List<PatNoticeVo> selectList(PatNoticeVo vo) throws ElException {
	    List<PatNoticeVo> result = (List<PatNoticeVo>)list("kr.re.kitech.biz.pat.pbd.selectNoticeBoard", vo); 
	    return result;
	}
	
	public PatNoticeVo selectSingleItem(PatNoticeVo vo) throws ElException {
		return (PatNoticeVo) selectByPk("kr.re.kitech.biz.pat.pbd.selectItemNoticeBoard", vo);
	}
	
	public int insertItem(PatNoticeVo vo) throws ElException {
		return insert("kr.re.kitech.biz.pat.pbd.insertItemNoticeBoard", vo);
	}

	public int updateItem(PatNoticeVo vo) throws ElException {
		return update("kr.re.kitech.biz.pat.pbd.updateItemNoticeBoard", vo);
	}

	public int deleteItem(PatNoticeVo vo) throws ElException {
		return delete("kr.re.kitech.biz.pat.pbd.deleteItemNoticeBoard", vo);
	}
}
