package kr.re.kitech.biz.fin.tax.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrExcelVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuTaxExcelVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**  
 * @ClassSubJect 세무관리 매입계산서
 * @Class Name : FinPurTaxDAO.java
 * @Description : 세무관리 매입계산서 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/23   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2023/05/23
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finPurTaxDAO")
public class FinPurTaxDAO extends BizDefaultAbstractDAO {
	/**
     * 매입계산서 목록 조회
     * @param FinTaxSearchVo
     * @return List<FtxBillHInfoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrVo> selectKtxIssuMstrList(FinPurTaxSrcVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.fin.tax.selectKtxIssuMstrList", vo);
    }
    
    /**
     * 매입계산서(관) 엑셀다운로드 목록 조회
     * @param FinTaxSearchVo
     * @return List<FtxBillHInfoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrVo> selectKtxIssuMstrListExcel(FinPurTaxSrcVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.fin.tax.selectKtxIssuMstrListExcel", vo);
    }
    
    /**
     * 매입계산서(관) 미확인 조회
     * @param FinPurTaxSrcVo
     * @return List<FinBillUnConfirmVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FinBillUnConfirmVo> selectKtxBillUnConfirm(FinPurTaxSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectKtxBillUnConfirm", vo);
    }
    
    /**
     * 매출/매입계산서 확인 저장
     * @param FinBillUnConfirmVo
     * @return int
     * @throws Exception
     */
    public int updateFspSlipDecsnHConfirmYn(FinBillUnConfirmVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateFspSlipDecsnHConfirmYn", vo);
    }
    
    /**
     * 매입계산서(관) 신고파일
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrExcelVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrExcelVo> selectKtxIssuMstrForReport(FinPurTaxSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectKtxIssuMstrForReport", vo);
    }
    
     /**
     * 매입계산서(관) 부가세대급금엑셀
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuTaxExcelVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuTaxExcelVo> selectKtxIssuMstrForTax(FinPurTaxSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectKtxIssuMstrForTax", vo);
    }
    
    /**
     * 미확인계산서반송 조회
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrVo> selectKtxIssuMstrRetnMail(FinPurTaxSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectKtxIssuMstrRetnMail", vo);
    }
    
    /**
     * 매입계산서 부가세신고 확인 저장
     * @param FinPurTaxSrcVo
     * @return int
     * @throws Exception
     */
    public int updateKtxTaxReturnsYn(FinPurTaxSrcVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateKtxTaxReturnsYn", vo);
    }
    
    /**
     * 매입계산서(관) 등록자 변경이력 저장
     * @param KtxIssuMstrComVo
     * @return int
     * @throws Exception
     */
    public int insertFspTaxRpsnHis(KtxIssuMstrComVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertFspTaxRpsnHis", vo);
    }
    
    /**
     * 매입계산서(관) 등록자 변경
     * @param KtxIssuMstrComVo
     * @return int
     * @throws Exception
     */
    public int updateKtxIssuMstrWrtePsn(KtxIssuMstrComVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateKtxIssuMstrWrtePsn", vo);
    }
    
    /**
     * 등록자 변경이력 건수 조회
     * @param String issuSeqno
     * @return int
     * @throws Exception
     */
    public int selectFspTaxRpsnHisCnt(String issuSeqno) throws KitechException{
    	return (int)selectByPk("kr.re.kitech.biz.fin.tax.selectFspTaxRpsnHisCnt", issuSeqno);
    }
    
    /**
     * 등록자 변경이력 조회
     * @param String issuSeqno
     * @return List<KtxIssuMstrComVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrComVo> selectFspTaxRpsnHis(String issuSeqno) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectFspTaxRpsnHis", issuSeqno);
    }
    
    /**
     * 자동대사 국세청 데이터 조회
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrVo> selectKtxAattDetb(FinPurTaxSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectKtxAattDetb", vo);
    }
    
    /**
     * 자동대사 내부자료 조회
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrVo> selectKtxIssuMstrMove(FinPurTaxSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectKtxIssuMstrMove", vo);
    }
    
    /**
     * 자동(수동) 대사 후 내부자료 수정
     * @param KtxIssuMstrVo
     * @return int
     * @throws Exception
     */
    public int updateKtxIssuMstrCopy(KtxIssuMstrVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateKtxIssuMstrCopy", vo);
    }
    
    /**
     * 자동대사 전체이관(buyr_chrg_email1)
     * @param FinPurTaxSrcVo
     * @return int
     * @throws Exception
     */
    public int insertKtxIssuMstrMoveAll(FinPurTaxSrcVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertKtxIssuMstrMoveAll", vo);
    }
    
    /**
     * 자동대사 전체이관(buyr_chrg_email2)
     * @param FinPurTaxSrcVo
     * @return int
     * @throws Exception
     */
    public int insertKtxIssuMstrMoveAll2(FinPurTaxSrcVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertKtxIssuMstrMoveAll2", vo);
    }
    
    /**
     * 자동대사 전체이관(이메일 없는 건) 또는 선택이관
     * @param FinPurTaxSrcVo
     * @return int
     * @throws Exception
     */
    public int insertKtxIssuMstrMove(FinPurTaxSrcVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertKtxIssuMstrMove", vo);
    }
    
    /**
     * 자동대사 전체이관 품목내역
     * @param FinPurTaxSrcVo
     * @return int
     * @throws Exception
     */
    public int insertKtxIssuDetailMove(FinPurTaxSrcVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertKtxIssuDetailMove", vo);
    }
}
