package kr.re.kitech.biz.res.twe.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.res.twe.vo.ResDownHistVo;
import kr.re.kitech.biz.res.twe.vo.ResMarketVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("ResMarketDAO")
public class ResMarketDAO extends BizDefaultAbstractDAO{
	public List<ResMarketVo> selectList(ResMarketVo vo) throws ElException {
	    List<ResMarketVo> result = (List<ResMarketVo>)list("kr.re.kitech.biz.res.twe.selectMarket", vo); 
	    return result;
	}
	
	public List<ResDownHistVo> selectDownHistList(ResDownHistVo vo) throws ElException {
	    List<ResDownHistVo> result = (List<ResDownHistVo>)list("kr.re.kitech.biz.res.twe.selectDownHist", vo); 
	    return result;
	}
	
	public ResMarketVo selectSingleItem(ResMarketVo vo) throws ElException {
		return (ResMarketVo) selectByPk("kr.re.kitech.biz.res.twe.selectItemMarket", vo);
	}
	
	public int insertItem(ResMarketVo vo) throws ElException {
		return insert("kr.re.kitech.biz.res.twe.insertItemMarket", vo);
	}

	public int updateItem(ResMarketVo vo) throws ElException {
		return update("kr.re.kitech.biz.res.twe.updateItemMarket", vo);
	}
	
	public int insertDownHistItem(ResDownHistVo vo) throws ElException {
		return insert("kr.re.kitech.biz.res.twe.insertItemDownHist", vo);
	}

	public int updateDownHistItem(ResDownHistVo vo) throws ElException {
		return update("kr.re.kitech.biz.res.twe.updateItemDownHist", vo);
	}

	public int deleteItem(ResMarketVo vo) throws ElException {
		return delete("kr.re.kitech.biz.res.twe.deleteItemMarket", vo);
	}
}
