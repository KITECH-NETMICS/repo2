package kr.re.kitech.biz.fin.fnd.service;

import java.util.List;

import kr.re.kitech.biz.com.vo.FibkAccntHisVo;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;

/**
* 재무 입금의뢰 인터페이스 FcpDepstReqMntService
* @author LeeYH
* @since 2022.03.31.
*/
public interface FndDepstReqMntService {
	/*
	* 예금입금의뢰 Ⅱ 목록 조회
	*/
	public List<FibkAccntHisVo> selectFibkAcctHisList(FndDepstSrcVo vo);
	/**
    * 예금입금의뢰등록팝업 조회
    */
	public List<FcpDepstReqVo> selectFcpDepstReqInfo(FndDepstSrcVo vo);
	
	/*
    * 예금입금의뢰2 저장
    */ 
	public String saveFcpDepstReq(FcpDepstReqVo vo) throws Exception;
	/*
    * 예금입금의뢰2 삭제
    */ 
	public void deleteFinDepstReq(FcpDepstReqVo vo);
	/*
    * 연구비 입금결의 생성(기술료, 예금입금의뢰2)
    */ 
	public String saveDepstReqSlipMnt(FcpDepstReqVo vo);
}
