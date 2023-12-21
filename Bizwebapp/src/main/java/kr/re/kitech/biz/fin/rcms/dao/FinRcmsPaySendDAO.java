package kr.re.kitech.biz.fin.rcms.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.rcms.vo.BeaipaVo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo;
import kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo;
import kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo;
import kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("FinRcmsPaySendDAO")
public class FinRcmsPaySendDAO extends BizDefaultAbstractDAO {
  
  @SuppressWarnings("unchecked")
  public List<FinRcmsPaySendVo> selectListItem(FinRcmsPaySendVo vo) throws ElException {
    return (List<FinRcmsPaySendVo>)list("kr.re.kitech.biz.fin.rcms.selectListItemFinRcmsPaySend01", vo);
  }
  
  @SuppressWarnings("unchecked")
  public List<FinRcmsPaySendVo> selectErrorListItem(FinRcmsPaySendVo vo) throws ElException {
    return (List<FinRcmsPaySendVo>)list("kr.re.kitech.biz.fin.rcms.selectListItemFinRcmsPaySend02", vo);
  }
  
  @SuppressWarnings("unchecked")
  public List<FinRcmsPaySendVo> selectListBeitpaMs(FinRcmsPaySendVo vo) throws ElException {
    return (List<FinRcmsPaySendVo>)list("kr.re.kitech.biz.fin.rcms.selectListBeitpaMs", vo);
  }  
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListBeaipaMs(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListBeaipaMs", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListBeaipaMs02(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListBeaipaMs02", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListBeaipaMs03(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListBeaipaMs03", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListBeaipaMs04(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListBeaipaMs04", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListResInpPareMS01(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListResInpPareMS01", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListResbglcostMS01(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListResbglcostMS01", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListHumApyArCostMS07(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListHumApyArCostMS07", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListResBglStuCostMS01(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListResBglStuCostMS01", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListRcmsResbglcostMS01(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListRcmsResbglcostMS01", param);
  }
  
  @SuppressWarnings("unchecked")
  public List<BeaipaVo> selectListResbglcostMS02(Map<String, Object> param) throws ElException {
    return (List<BeaipaVo>)list("kr.re.kitech.biz.fin.rcms.selectListResbglcostMS02", param);
  }

  @SuppressWarnings("unchecked")
  public List<FinRcmsPaySend04Vo> selectReturnList(FinRcmsPaySend04Vo vo) throws ElException {
    return (List<FinRcmsPaySend04Vo>)list("kr.re.kitech.biz.fin.rcms.selectListItemFinRcmsPaySend04", vo);
  }

  @SuppressWarnings("unchecked")
  public List<ResBgacCtmVo> selectAccountPopup(ResBgacCtmVo vo) throws ElException {
    return (List<ResBgacCtmVo>)list("kr.re.kitech.biz.fin.rcms.selectListItemResBgacCtm", vo);
  }

  public int updateUnsentForced(FinRcmsPaySendVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.updateListItemFinRcmsPay", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem01(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem02(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend02", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem03(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend03", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem04(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend04", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem05(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend05", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem06(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend06", vo);
  }
  
  public KtxIssuMstrVo selectSingleItem07(FinRcmsPaySendVo vo) throws ElException {
    return (KtxIssuMstrVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend07", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem08(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend08", vo);
  }
  
  public FinRcmsPaySendVo selectSingleItem09(Map<String, Object> param) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend09", param);
  }
  
  public FinRcmsPaySendVo selectSingleItem10(Map<String, Object> param) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend10", param);
  }
  
  public FinRcmsPaySendVo selectSingleItem11(Map<String, Object> param) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend11", param);
  }
  
  public FinRcmsPaySendVo selectSingleItem12(Map<String, Object> param) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItemFinRcmsPaySend12", param);
  }
  
  public RndBietpaVo selectSingleItem13(Map<String, Object> param) throws ElException {
    return (RndBietpaVo) selectByPk("kr.re.kitech.biz.fin.rcms.selectSingleItem13", param);
  }
  
  public int updateSingleItem01(FinRcmsPaySendVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.updateSingleItem01", vo);
  }
  
  public int updateSingleItem02(FinRcmsPaySendVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.updateSingleItem02", vo);
  }
  
  public int updateSingleItem03(Map<String, Object> param) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.updateSingleItem03", param);
  }
  
  public int updateSingleItem04(SaveBeitpaVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.updateSingleItem04", vo);
  }
  
  public int updateSingleItem05(Map<String, Object> param) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.updateSingleItem05", param);
  }
  
  public int updateSingleItem06(Map<String, Object> param) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.updateSingleItem06", param);
  }
  
  public int mergeItem01(FinRcmsPaySendVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.mergeItem01", vo);
  }
  
  public int mergeItem02(SaveBeitpaVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.mergeItem02", vo);
  }
  
  public int mergeItem03(BeaipaVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.mergeItem03", vo);
  }
  
  public int mergeItem04(Map<String, Object> param) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.mergeItem04", param);
  }
  
  public FinRcmsPaySendVo cancelFinRcmsPaySend01(FinRcmsPaySendVo vo) throws ElException {
    return (FinRcmsPaySendVo) selectByPk("kr.re.kitech.biz.fin.rcms.cancelFinRcmsPaySend01", vo);
  }
  
  public int cancelFinRcmsPaySendDelete(FinRcmsPaySendVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.rcms.cancelFinRcmsPaySendDelete", vo);
  }
  
  public int cancelFinRcmsPaySendUpdate(FinRcmsPaySendVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.rcms.cancelFinRcmsPaySendUpdate", vo);
  } 
  
}
