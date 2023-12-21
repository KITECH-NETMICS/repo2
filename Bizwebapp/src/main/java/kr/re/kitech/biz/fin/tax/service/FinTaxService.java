package kr.re.kitech.biz.fin.tax.service;

import java.util.List;

import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillExcelVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillHVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillInfoVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsInfoVo;

/**
 * 세무관리 인터페이스
 * @author LeeYH
 * @since 2022.08.12
 */
public interface FinTaxService {
	/*
     * 매출계산서 목록조회
     */
	public List<FtxBillHVo> selectFtxBillHList(FinTaxSearchVo vo);
	/*
	* 매출계산서(관) 엑셀 다운로드
	*/
	public List<FtxBillHVo> selectFtxBillHExcelDown(FinTaxSearchVo vo);
	
	/*
     * 매출계산서 조회
     */
	public FtxBillInfoVo selectFtxBillH(FinTaxSearchVo vo);
	
	/*
     * 전자계산서 발송현황(팝업)
     */
	public FtxBillSendPrcsInfoVo selectFtxBillSendPrcs(FinTaxSearchVo vo);
	/*
     * 매출계산서 저장
     */
	public String saveFtxBillInfo(FtxBillInfoVo vo);
	/*
     * 매출계산서 전자발행(FtxBillh저장 및 국세청 전송)
     */
	public String saveFtxBillSend(FtxBillInfoVo vo);
	/*
     * 매출 수정계산서 발행(저장 및 국세청전송) 
     */
	public String saveAmndFtxBill(FtxBillInfoVo vo);
	/*
     * 매출 계산서 재전송
     */
	public void saveResendData(FtxBillHVo vo);
	/*
     * 매출계산서 이관대상 조회
     */
	public List<FtxBillHVo> selectItisIssuMstNotFtx(FinTaxSearchVo vo);
	/*
     * 매출계산서 이관
     */
	public void moveItisToFtx(List<FtxBillHVo> billList);
	/*
     * 국세청발행계산서 수정
     */
	public void updateFtxBillH(FtxBillHVo vo);
	/*
     * 매출계산서 삭제 또는 복구
     */
	public void deleteFtxBill(FtxBillHVo vo);
	/*
	* 매출계산서(관) 엑셀내리기
	*/
	public List<FtxBillExcelVo> selectFtxBillHExcel(FinTaxSearchVo vo);
	/*
	* 매출계산서(관) 헤더 수정(계정번호,계산서구분,비고,결의번호 등)
	*/
	public void saveFtxBillMnt(FtxBillHVo vo);
	/*
	* 매출계산서(관) 미확인 조회
	*/
	public List<FinBillUnConfirmVo> selectFtxBillUnConfirm(FinTaxSearchVo vo);
}
