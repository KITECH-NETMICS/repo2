package kr.re.kitech.biz.ccs.ctr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("CtrBiztripFareDAO")
public class CtrBiztripFareDAO extends BizDefaultAbstractDAO {
  
/*  public List<CtrBiztripFareVo> selectList() throws ElException {
    List<CtrBiztripFareVo> result = (List<CtrBiztripFareVo>)list("kr.re.kitech.biz.ccs.ctr.selectListCtrBiztripFare"); 
    return result;
  }*/

  public List<CtrBiztripFareVo> selectListCtrBiztripFare(CtrBiztripFareVo ctrBiztripFareVo) throws ElException {
	System.out.println("dao");  
    return list("kr.re.kitech.biz.ccs.ctr.selectListCtrBiztripFare", ctrBiztripFareVo);
  }
  
  public int insertItem01(CtrBiztripFareVo vo) throws ElException {
    return insert("kr.re.kitech.biz.ccs.ctr.insertItem01", vo);
  }

  public CtrBiztripFareVo selectSingleItem(CtrBiztripFareVo vo) throws ElException {
    return (CtrBiztripFareVo) selectByPk("kr.re.kitech.biz.ccs.ctr.selectSingleItemCtrBiztripFare", vo);
  }

  public int insertItem(CtrBiztripFareVo vo) throws ElException {
    return insert("kr.re.kitech.biz.ccs.ctr.insertItemCtrBiztripFare", vo);
  }

  public int updateItem(CtrBiztripFareVo vo) throws ElException {
    return update("kr.re.kitech.biz.ccs.ctr.updateItemCtrBiztripFare", vo);
  }

  public int deleteItem(CtrBiztripFareVo vo) throws ElException {
    return update("kr.re.kitech.biz.ccs.ctr.deleteItemCtrBiztripFare", vo);
  }

}
