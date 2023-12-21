package kr.re.kitech.biz.fin.fnd.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerListVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo;

public interface FspSlipHService {
  
  /**
    * 출금 결의 현황 조회
    * @author 
    * @since 2023.08.04.
    */
  public List<FspSlipHVo> selectList(FspSlipHVo vo) throws ElException;

  /**
    * 출금 결의 현황 결재 조회
    * @author 
    * @since 2023.08.08.
    */
  public List<FspSlipHVo> selectFspSlipDetail(FspSlipHVo vo) throws ElException;

  /**
    * 출금결의 지불장 신청 저장
    * @author 
    * @since 2023.08.08.
    */
  public FspSlipHMerVo insertItem(FspSlipHMerListVo vo) throws Exception;

  /**
    * 출금결의 지불장 삭제
    * @author 
    * @since 2023.08.09.
    */
  public FspSlipHVo deleteItem(FspSlipHVo vo) throws Exception;

  /**
    * 출금 결의 현황 엑셀 내리기
    * @author 
    * @since 2023.08.04.
    */
	public List<FspSendReqVo> selectFspSlipExel(FspSendReqVo vo);
	
  /**
    * 출금 결의 현황 엑셀 내리기 은행코드 포함
    * @author 
    * @since 2023.08.07.
    */
	public List<FspSendReqVo> selectFspSlipBankExel(FspSendReqVo vo);

}
