package kr.re.kitech.biz.com.sms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.com.sms.vo.MsgSendLogVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("MsgSendLogDAO")
public class MsgSendLogDAO extends BizDefaultAbstractDAO {
  
  public List<MsgSendLogVo> selectList() throws ElException {
    List<MsgSendLogVo> result = (List<MsgSendLogVo>)list("kr.re.kitech.biz.com.sms.selectListMsgSendLog"); 
    return result;
  }

  public List<MsgSendLogVo> selectListItem(MsgSendLogVo vo) throws ElException {
    return (List<MsgSendLogVo>)list("kr.re.kitech.biz.com.sms.selectListItemMsgSendLog", vo);
  }

  public MsgSendLogVo selectSingleItem(MsgSendLogVo vo) throws ElException {
    return (MsgSendLogVo) selectByPk("kr.re.kitech.biz.com.sms.selectSingleItemMsgSendLog", vo);
  }

  public int insertItem(MsgSendLogVo vo) throws ElException {
    return insert("kr.re.kitech.biz.com.sms.insertItemMsgSendLog", vo);
  }

  public int updateItem(MsgSendLogVo vo) throws ElException {
    return update("kr.re.kitech.biz.com.sms.updateItemMsgSendLog", vo);
  }

  public int deleteItem(MsgSendLogVo vo) throws ElException {
    return update("kr.re.kitech.biz.com.sms.deleteItemMsgSendLog", vo);
  }

}
