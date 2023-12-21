package kr.re.kitech.biz.fin.tax.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.pop.service.FinSlipPopService;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.tax.dao.FinPurTaxDAO;
import kr.re.kitech.biz.fin.tax.service.FinPurTaxService;
import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrExcelVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.tax.vo.KtxIssuTaxExcelVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**  
 * @ClassSubJect 세무관리 매입계산서
 * @Class Name : FinPurTaxServiceImpl.java
 * @Description : 세무관리 매입계산서 ServiceImpl
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
@Service("finPurTaxService")
public class FinPurTaxServiceImpl extends EgovAbstractServiceImpl implements FinPurTaxService {
	@Resource(name="finPurTaxDAO")
	private FinPurTaxDAO dao;
	
	@Resource(name="finSlipPopService")
	private FinSlipPopService finPopService;
	
	/**
     * 매입계산서 목록 조회
     * @param FinTaxSearchVo
     * @return List<FtxBillHInfoVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.23.
     */
	@Override
	public List<KtxIssuMstrVo> selectKtxIssuMstrList(FinPurTaxSrcVo vo) throws KitechException {
		return dao.selectKtxIssuMstrList(vo);
	}
	
	/**
     * 매입계산서(관) 엑셀다운로드 목록 조회
     * @param FinTaxSearchVo
     * @return List<FtxBillHInfoVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.23.
     */
	@Override
	public List<KtxIssuMstrVo> selectKtxIssuMstrListExcel(FinPurTaxSrcVo vo) throws KitechException {
		return dao.selectKtxIssuMstrListExcel(vo);
	}
	
	/**
     * 매입계산서(관) 미확인 조회
     * @param FinPurTaxSrcVo
     * @return List<FinBillUnConfirmVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.04.
     */
	public List<FinBillUnConfirmVo> selectKtxBillUnConfirm(FinPurTaxSrcVo vo) throws KitechException{
		return dao.selectKtxBillUnConfirm(vo);
	}
	
	/**
     * 매출/매입계산서 확인 저장
     * @param FinBillUnConfirmVo
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.04.
     */
    public void updateFspSlipDecsnHConfirmYn(FinBillUnConfirmVo vo) throws KitechException{
    	dao.updateFspSlipDecsnHConfirmYn(vo);
    }
    
    /**
     * 매입계산서(관) 신고파일
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrExcelVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.06.
     */
	public List<KtxIssuMstrExcelVo> selectKtxIssuMstrForReport(FinPurTaxSrcVo vo) throws KitechException{
		return dao.selectKtxIssuMstrForReport(vo);
	}
	
	/**
     * 매입계산서(관) 부가세대급금엑셀
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuTaxExcelVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.10.
     */
	public List<KtxIssuTaxExcelVo> selectKtxIssuMstrForTax(FinPurTaxSrcVo vo) throws KitechException{
		return dao.selectKtxIssuMstrForTax(vo);
	}
	
	/**
     * 미확인계산서반송 조회
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.10.
     */
	public List<KtxIssuMstrVo> selectKtxIssuMstrRetnMail(FinPurTaxSrcVo vo) throws KitechException{
		return dao.selectKtxIssuMstrRetnMail(vo);
	}
	
	/**
     * 매입계산서 부가세신고 확인 저장
     * @param FinPurTaxSrcVo
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.10.
     */
    public void updateKtxTaxReturnsYn(FinPurTaxSrcVo vo) throws KitechException{
    	dao.updateKtxTaxReturnsYn(vo);
    }
    
    /**
    * 거래증빙 다건 삭제(매입계산서(관))
    * @param List<KtxIssuMstrComVo>
    * @throws Exception
    * @author LeeYoungHee
	* @since 2023.10.10.
    */
	public void deleteKtxIssuMstrMulti(List<KtxIssuMstrComVo> delList) throws KitechException{
		for(KtxIssuMstrComVo vo : delList){
			//AppLog.info("\n ------------- deleteKtxIssuMstrMulti :" + vo);
			finPopService.deleteKtxIssuMstr(vo);
		}
	}
	
	/**
    * 매입계산서(관) 등록자 변경
    * @param List<KtxIssuMstrComVo>
    * @throws Exception
    * @author LeeYoungHee
	* @since 2023.10.11.
    */
	public void saveKtxIssuWrtePsn(List<KtxIssuMstrComVo> saveList) throws KitechException{
		for(KtxIssuMstrComVo vo : saveList){
			// 이력 저장
			dao.insertFspTaxRpsnHis(vo);
			
			// 등록자 변경
			vo.setWrte_psn(vo.getPur_con_user_id());
			vo.setWrte_dept(vo.getPur_con_org_code());
			
			dao.updateKtxIssuMstrWrtePsn(vo);
		}
	}
	
	/**
     * 등록자 변경이력 건수 조회
     * @param String issuSeqno
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.13.
     */
    public int selectFspTaxRpsnHisCnt(String issuSeqno) throws KitechException{
    	return dao.selectFspTaxRpsnHisCnt(issuSeqno);
    }
    
    /**
     * 등록자 변경이력 조회
     * @param String issuSeqno
     * @return List<KtxIssuMstrComVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.13.
     */
	public List<KtxIssuMstrComVo> selectFspTaxRpsnHis(String issuSeqno) throws KitechException{
		return dao.selectFspTaxRpsnHis(issuSeqno);
	}
	
	/**
     * 자동대사 국세청 데이터 조회
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.16.
     */
	public List<KtxIssuMstrVo> selectKtxAattDetb(FinPurTaxSrcVo vo) throws KitechException{
    	return dao.selectKtxAattDetb(vo);
    }
    
    /**
     * 자동대사 매입계산서 데이터 조회
     * @param FinPurTaxSrcVo
     * @return List<KtxIssuMstrVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.16.
     */
	public List<KtxIssuMstrVo> selectKtxIssuMstrMove(FinPurTaxSrcVo vo) throws KitechException{
    	return dao.selectKtxIssuMstrMove(vo);
    }
    
    /**
     * 대사 후 매입계산서 저장(2023.10.17. 더이상 사용하지 않음)
     * @param List<KtxIssuMstrVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.16.
     */
    public void updateKtxIssuMstr(List<KtxIssuMstrVo> saveList) throws KitechException{
    	for(KtxIssuMstrVo vo : saveList){
    		dao.updateKtxIssuMstrCopy(vo);
    	}
    }
    
    /**
     * 자동대사 전체이관
     * @param FinPurTaxSrcVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.17.
     */
    public void moveDetIssuToKtx(FinPurTaxSrcVo vo) throws KitechException{
    	if("A".equals(vo.getInqr_clsf())){
	    	// 01. 전체이관(buyr_chrg_email1)
	    	dao.insertKtxIssuMstrMoveAll(vo);
	    	
	    	// 02. 전체이관(buyr_chrg_email2)
	    	dao.insertKtxIssuMstrMoveAll2(vo);
	    	
	    	// 03. 전체이관(이메일 없는 건)
	    	dao.insertKtxIssuMstrMove(vo);
	    }else{
	    	// 선택이관
	    	dao.insertKtxIssuMstrMove(vo);
	    }
    	
    	// 04. 자동대사 품목내역 이관
    	dao.insertKtxIssuDetailMove(vo);
    }
}
