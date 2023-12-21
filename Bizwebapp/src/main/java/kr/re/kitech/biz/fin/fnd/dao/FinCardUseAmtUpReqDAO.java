package kr.re.kitech.biz.fin.fnd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("finCardUseAmtUpReqDAO")
  public class FinCardUseAmtUpReqDAO extends BizDefaultAbstractDAO {
  

  /**
    * 법인카드 한도증액 신청 목록
    * @author 
    * @since 2023.08.08.
    */
  public List<FinCardUseAmtUpReqVo> selectList(FinCardUseAmtUpReqVo vo) throws ElException {
    return (List<FinCardUseAmtUpReqVo>)list("kr.re.kitech.biz.fin.fnd.selectFinCardUseAmtUpReq", vo);
  }

  /**
    * 법인카드 한도증액 신청에 상세정보
    * @author 
    * @since 2023.08.14.
    */
  public FinCardUseAmtUpReqVo selectSingle(FinCardUseAmtUpReqVo vo) throws ElException {
    return (FinCardUseAmtUpReqVo) selectByPk("kr.re.kitech.biz.fin.fnd.selectFinCardUseAmtUpSingleReq", vo);
  }

  /**
    * 법인카드 셀렉트 박스 조회
    * @author 
    * @since 2023.08.16.
    */
  public List<FndCardSelectVo> selectCardList(FndCardSelectVo vo) throws ElException {
    return (List<FndCardSelectVo>)list("kr.re.kitech.biz.fin.fnd.selectFndCard", vo);
  }

  /**
    * 법인카드 한도증액 신청 저장
    * @author 
    * @since 2023.08.16.
    */
  public int insertItem(FinCardUseAmtUpReqVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.fnd.insertFinCardUseAmtUpReq", vo);
  }

  /**
    * 법인카드 한도증액 신청 수정
    * @author 
    * @since 2023.08.16.
    */
  public int updateItem(FinCardUseAmtUpReqVo vo) throws ElException {
    return update("kr.re.kitech.biz.fin.fnd.updateFinCardUseAmtUpReq", vo);
  }

  /**
    * 법인카드 한도증액 신청 삭제
    * @author 
    * @since 2023.08.16.
    */
  public int deleteItem(FinCardUseAmtUpReqVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.fnd.deleteFinCardUseAmtUpReq", vo);
  }

}
