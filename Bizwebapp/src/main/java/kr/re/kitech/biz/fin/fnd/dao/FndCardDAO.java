package kr.re.kitech.biz.fin.fnd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("FndCardDAO")
public class FndCardDAO extends BizDefaultAbstractDAO {
  
  public List<FndCardVo> selectList(FndCardVo vo) throws ElException {
    List<FndCardVo> result = (List<FndCardVo>)list("kr.re.kitech.biz.fin.fnd.selectListItemFndCard", vo); 
    return result;
  }
  
  public List<FndCardUseSelectVo> selectFndCardNtSlip(FndCardUseSelectVo vo) throws ElException {	
	AppLog.debug("vo", vo);
    List<FndCardUseSelectVo> result = (List<FndCardUseSelectVo>)list("kr.re.kitech.biz.fin.fnd.selectFndCardNtSlip", vo);
    return result;
  }

  public FndCardVo selectSingleItem(FndCardVo vo) throws ElException {
    return (FndCardVo) selectByPk("kr.re.kitech.biz.fin.fnd.selectItemFndCard", vo);
  }

  public int insertItem(FndCardVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.fnd.insertItemFndCard", vo);
  }

  public int updateItem(FndCardVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.fnd.updateItemFndCard", vo);
  }

  public int deleteItem(FndCardVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.fnd.deleteItemFndCard", vo);
  }
  
  public int updateMailYn(FndCardVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.fnd.updateItemFndCardMailYn", vo);
  }


}
