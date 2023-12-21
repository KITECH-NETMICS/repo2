package kr.re.kitech.biz.fin.tax.service;

import java.util.List;

import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrExcelVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuTaxExcelVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 세무관리 매입계산서 인터페이스
 * @author LeeYH
 * @since 2023.05.23
 */
public interface FinPurTaxService {
	/**
     * 매입계산서 목록조회
     */
	public List<KtxIssuMstrVo> selectKtxIssuMstrList(FinPurTaxSrcVo vo);
	/**
     * 매입계산서(관) 미확인 조회
     */
	public List<FinBillUnConfirmVo> selectKtxBillUnConfirm(FinPurTaxSrcVo vo);
	/*
	* 매출/매입계산서 확인 저장
	*/
	public void updateFspSlipDecsnHConfirmYn(FinBillUnConfirmVo vo);
	/*
	* 매입계산서(관) 신고파일
	*/
	public List<KtxIssuMstrExcelVo> selectKtxIssuMstrForReport(FinPurTaxSrcVo vo);
	/*
	* 매입계산서(관) 부가세대급금엑셀
	*/
	public List<KtxIssuTaxExcelVo> selectKtxIssuMstrForTax(FinPurTaxSrcVo vo);
	/*
	* 미확인계산서반송 조회
	*/
	public List<KtxIssuMstrVo> selectKtxIssuMstrRetnMail(FinPurTaxSrcVo vo);
	/*
	* 매입계산서 부가세신고 확인 저장
	*/
	public void updateKtxTaxReturnsYn(FinPurTaxSrcVo vo);
	
	/*
	* 거래증빙 다건 삭제(매입계산서(관))
	*/
	public void deleteKtxIssuMstrMulti(List<KtxIssuMstrComVo> delList);
	/*
	* 매입계산서(관) 등록자 변경
	*/
	public void saveKtxIssuWrtePsn(List<KtxIssuMstrComVo> saveList);
	/*
	* 등록자 변경이력 건수 조회
	*/
	public int selectFspTaxRpsnHisCnt(String issuSeqno);
	/*
	* 등록자 변경이력 조회
	*/
	public List<KtxIssuMstrComVo> selectFspTaxRpsnHis(String issuSeqno);
	/*
	* 자동대사 국세청 데이터 조회
	*/
	public List<KtxIssuMstrVo> selectKtxAattDetb(FinPurTaxSrcVo vo);
	/*
	* 자동대사 매입계산서 데이터 조회
	*/
	public List<KtxIssuMstrVo> selectKtxIssuMstrMove(FinPurTaxSrcVo vo);
	/*
	* 자동대사 전체이관
	*/
	public void moveDetIssuToKtx(FinPurTaxSrcVo vo);
	/*
	* 매입계산서(관) 엑셀바로내리기 목록 조회
	*/
	public List<KtxIssuMstrVo> selectKtxIssuMstrListExcel(FinPurTaxSrcVo vo) throws KitechException;
}
