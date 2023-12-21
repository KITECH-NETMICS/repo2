package kr.re.kitech.biz.fin.fnd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

  @Repository("fspSlipHDAO")
  public class FspSlipHDAO extends BizDefaultAbstractDAO {
  
  /**
    * 출금 결의 현황 조회
    * @author 
    * @since 2023.08.04.
    */
  public List<FspSlipHVo> selectList(FspSlipHVo vo) throws ElException {
    return (List<FspSlipHVo>)list("kr.re.kitech.biz.fin.fnd.selectFspSlipH", vo);
  }

  /**
    * 출금 결의 현황 결재 조회
    * @author 
    * @since 2023.08.08.
    */
  public List<FspSlipHVo> selectFspSlipDetail(FspSlipHVo vo) throws ElException {
    return (List<FspSlipHVo>) list("kr.re.kitech.biz.fin.fnd.selectFspSlipDetail", vo);
  }

  /**
    * 출금결의 지불장 신청 저장
    * @author 
    * @since 2023.08.08.
    */
  public int insertItem(FspSlipHVo vo) throws ElException {
    return insert("kr.re.kitech.biz.fin.fnd.updateFspSlipHMer", vo);
  }

  /**
    * 출금결의 지불장 삭제
    * @author 
    * @since 2023.08.09.
    */
  public int deleteItem(FspSlipHVo vo) throws ElException {
    return delete("kr.re.kitech.biz.fin.fnd.deleteFspSlipH", vo);
  }

	/**
     * 출금결의현황-송금내역 엑셀내리기
     * @param FspSendReqVo
     * @return List<FspSendReqVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FspSendReqVo> selectFspSlipExel(FspSendReqVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.fnd.selectFspSlipExel", vo);
	}

	/**
     * 출금결의현황-송금내역 엑셀내리기 은행코드 포함
     * @param FspSendReqVo
     * @return List<FspSendReqVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FspSendReqVo> selectFspSlipBankExel(FspSendReqVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.fnd.selectFspSlipBankExel", vo);
	}

}
