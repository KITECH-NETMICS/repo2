package kr.re.kitech.biz.apr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.apr.vo.AprAppNameListVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("AprAppNameListDAO")
public class AprAppNameListDAO extends BizDefaultAbstractDAO {

  public List<AprAppNameListVo> selectAppListItem(AprAppNameListVo vo) throws ElException {
    return (List<AprAppNameListVo>)list("kr.re.kitech.biz.apr.selectListItemAprAppNameList", vo);
  }

}
