package kr.re.kitech.biz.com.mlr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("MailRetrieveApiLogDAO")
public class MailRetrieveApiLogDAO extends BizDefaultAbstractDAO {
  
  public List<MailRetrieveApiLogVo> selectListItem(MailRetrieveApiLogVo vo) throws ElException {
    return (List<MailRetrieveApiLogVo>)list("kr.re.kitech.biz.com.mlr.selectListItemMailRetrieveApiLog", vo);
  }

  public int insertItem(MailRetrieveApiLogVo vo) throws ElException {
    return insert("kr.re.kitech.biz.com.mlr.insertListItemMailRetrieveApiLog", vo);
  }
}
