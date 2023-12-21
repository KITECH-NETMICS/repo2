package kr.re.kitech.biz.fin.com.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.com.vo.FinDepstSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;

/**
* 입금의뢰 인터페이스 FinDepstReqMntService
* @author LeeYH
* @since 2022.03.22.
*/
public interface FinComDepstReqService {
	/**
	* 임금의뢰 저장
	*/
	public void saveDepstReq(FcpDepstReqVo vo);	
	
	/**
    * 잔액정산 삭제
    */
	public int deleteRamtAdjst(FspRamtCreatVo vo);
	
	/**
    * 일반, 경비결의 잔액정산 저장 및 잔액생성 수정
    */
	public void saveRamtAdjst(FspRamtCreatVo vo);
	
	/**
    * 입금의뢰 자동결의 잔액정산 저장
    */
	public void saveRamtAdjstForDepst(FspRamtCreatVo vo);
	
	/**
    * 잔액정산 삭제 및 잔액생성 수정
    */
	public void deleteFspRamtAdjst(String unslipNo, boolean updYn);
	
	/**
    * 매출계산서 헤더에 신청번호 업데이트
    */
	public void updateFtxBillHIssuReq(String billNo, String reqNo, int depstOdr);
	/**
	* 결의생성 후 매출계산서 헤더에 결의번호 업데이트
	*/
	public void updateFtxBillHUnslipNo(String billNo, String unslipNo);
	/**
	* 연구비입금결의 회계코드 조회
	*/
	public String getDepstMntAccntCd(String depstClsf, String accntNo, String slipYmd);
	/**
	* 입금의뢰시 반제금액 수정
	*/
	public void updateFspRamtCreatRepayAmt(FcpDepstReqVo vo);
	/**
	* 결의생성 후 입금의뢰 결의번호 업데이트
	*/
	public void updateFcpDepstReqUnslipNo(String unslipNo, int unslipOdr, String reqNo);
	/**
	* 입금의뢰 삭제 및 반제금액 수정
	*/
	public void deleteDepstReq(FcpDepstReqVo vo);
	
	/**
	* 입금결의를 위한 조회
	*/
	public List<FinDepstSlipVo> selectFcpDepstSlipList(String reqNo);
	
	/**
	* 입금의뢰 대변생성을 위한 조회
	*/
	public List<FinDepstSlipVo> selectFcpDepstSlipCrList(String reqNolist);
}
