package kr.re.kitech.biz.fin.tax.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.std.vo.XodfVendComVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendJobVo;
import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillCntVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillDVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillExcelVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillHVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillUpdVo;
import kr.re.kitech.biz.fin.tax.vo.ItisBizMailVo;
import kr.re.kitech.biz.fin.tax.vo.ItisIssuDetailVo;
import kr.re.kitech.biz.fin.tax.vo.ItisIssuMstrVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 세무관리
 * @Class Name : FinTaxDAO.java
 * @Description : 세무관리 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/12   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/08/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finTaxDAO")
public class FinTaxDAO extends BizDefaultAbstractDAO {
	/**
     * 매출계산서 목록 조회
     * @param FinTaxSearchVo
     * @return List<FtxBillHInfoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxBillHVo> selectFtxBillHList(FinTaxSearchVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.fin.tax.selectFtxBillHList", vo);
    }
    
    /**
     * 매출계산서(관) 엑셀 다운로드
     * @param FinTaxSearchVo
     * @return List<FtxBillHInfoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxBillHVo> selectFtxBillHExcelDown(FinTaxSearchVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.fin.tax.selectFtxBillHExcelDown", vo);
    }
    
    /**
     * 매출계산서 조회(팝업)
     * @param String taxBillNo
     * @return FtxBillHInfoVo
     * @throws Exception
     */
    public FtxBillHVo selectFtxBillH(String taxBillNo) throws KitechException{
    	return (FtxBillHVo)selectByPk("kr.re.kitech.biz.fin.tax.selectFtxBillH", taxBillNo);
    }
    
     /**
     * 매출 계산서 세부내역 조회
     * @param String taxBillNo
     * @return List<FtxBillDVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxBillDVo> selectFtxBillDList(String taxBillNo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectFtxBillDList", taxBillNo);
    }
    
    /**
     * 수정발행 시 해당 세금계산서에 대한 기존, 수정 세금계산서 카운트 조회 
     * @param String taxBillNo
     * @return FtxBillCntVo
     * @throws Exception
     */
    public FtxBillCntVo selectFtxBillCnt(String taxBillNo) throws KitechException{
    	return (FtxBillCntVo)selectByPk("kr.re.kitech.biz.fin.tax.selectFtxBillCnt", taxBillNo);
    }
    
    /**
     * 전자계산서 발송현황 조회
     * @param String taxBillNo
     * @return FtxBillSendPrcsVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxBillSendPrcsVo> selectFtxBillSendPrcs(String taxBillNo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectFtxBillSendPrcs", taxBillNo);
    }
    
    /**
     * 전자계산서 재전송 현황 조회
     * @param String taxBillNo
     * @return FtxBillReSendVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxBillReSendVo> selectFtxBillReSend(String taxBillNo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectFtxBillReSend", taxBillNo);
    }
    
    /**
     * 계산서 폐기여부 조회
     * @param String taxBillNo
     * @return int
     * @throws Exception
     */
    public int selectFtxBillHCnt(String taxBillNo) throws KitechException{
    	return (int)selectByPk("kr.re.kitech.biz.fin.tax.selectFtxBillHCnt", taxBillNo);
    }
    
    /**
     * 매출계산서 헤더 저장
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int insertFtxBillH(FtxBillHVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertFtxBillH", vo);
    }
    
    /**
     * 매출계산서 헤더 수정
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int updateFtxBillH(FtxBillHVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateFtxBillH", vo);
    }
    
    /**
     * 계산서 수정발행시 기존계산서 업데이트
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int updateFtxBillHPrcsClsf(FtxBillHVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateFtxBillHPrcsClsf", vo);
    }
    
     /**
     * 매출계산서 내역 삭제
     * @param String taxBillNo
     * @return int
     * @throws Exception
     */
    public int deleteFtxBillD(String taxBillNo) throws KitechException{
    	return delete("kr.re.kitech.biz.fin.tax.deleteFtxBillD", taxBillNo);
    }
    
    /**
     * 매출계산서 내역 저장
     * @param FtxBillDVo
     * @return int
     * @throws Exception
     */
    public int insertFtxBillD(FtxBillDVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertFtxBillD", vo);
    }
    
    /**
     * 매출 전자세금계산서 원장 저장
     * @param ItisIssuMstrVo
     * @return int
     * @throws Exception
     */
    public int insertItisIssuMstr(ItisIssuMstrVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertItisIssuMstr", vo);
    }
    
    /**
     * 거래처 단건 조회
     * @param String vendCd
     * @return XodfVendComVo
     * @throws Exception
     */
    public XodfVendComVo selectXodfVend(String vendCd) throws KitechException{
    	return (XodfVendComVo)selectByPk("kr.re.kitech.biz.com.selectXodfVend", vendCd);
    }
    
    /**
     * 전자발행데이터 존재유무 조회
     * @param String issuSeqno
     * @return int
     * @throws Exception
     */
    public int selectItisIssuMstrCnt(String issuSeqno) throws KitechException{
    	return (int)selectByPk("kr.re.kitech.biz.fin.tax.selectItisIssuMstrCnt", issuSeqno);
    }
    
    /**
     * 매출 전자세금계산서 품목 저장
     * @param ItisIssuDetailVo
     * @return int
     * @throws Exception
     */
    public int insertItisIssuDetail(ItisIssuDetailVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertItisIssuDetail", vo);
    }
    
    /**
     * 마이너스 계산서 발행 헤더 저장
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int insertMinusFtxBillH(FtxBillHVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertMinusFtxBillH", vo);
    }
    
    /**
     * 마이너스 계산서 발행 디테일 저장
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int insertMinusFtxBillD(FtxBillHVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertMinusFtxBillD", vo);
    }
    
    /**
     * 재전송시 공급받는자 담당자 수정
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int updateFtxBillHBuyrChrg(FtxBillHVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateFtxBillHBuyrChrg", vo);
    }
    
    /**
     * 재발행을 위한 전자계산서 조회
     * @param String issuSeqno
     * @return List<ItisIssuMstrVo>
     * @throws Exception
     */
	public ItisBizMailVo selectItisIssuMstrReSend(String issuSeqno) throws KitechException{
    	return (ItisBizMailVo)selectByPk("kr.re.kitech.biz.fin.tax.selectItisIssuMstrReSend", issuSeqno);
    }
    
    /**
     * 전자 계산서 이메일 전송
     * @param ItisBizMailVo
     * @return int
     * @throws Exception
     */
    public int insertItisBizMail(ItisBizMailVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertItisBizMail", vo);
    }
    
    /**
     * 매출계산서 삭제시 처리구분 업데이트
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int updateFtxBillHDel(FtxBillHVo vo) throws KitechException{
    	return delete("kr.re.kitech.biz.fin.tax.updateFtxBillHDel", vo);
    }
    
    /**
     * 계산서 삭제 또는 발행시 연구비 청구 계산서번호 초기화 또는 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int updateResDemndReqBill(FtxBillUpdVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateResDemndReqBill", vo);
    }
    
    /**
     * 매출계산서 폐기 또는 발행 후 입금상세에서 계산서번호 초기화 또는 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int updateResBgRectlBill(FtxBillUpdVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateResBgRectlBill", vo);
    }
    
    /**
     * 매출계산서 폐기로 인한 전자세금계산서 원장 요청상태코드 업데이트
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int updateItisIssuMstrDel(FtxBillHVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateItisIssuMstrDel", vo);
    }
    
    /**
     * 매출계산서 폐기로 인한 기업부담금입금의뢰 계산서번호 초기화
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int updateSptTltDeptstDetlsBillDel(FtxBillUpdVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateSptTltDeptstDetlsBillDel", vo);
    }
    
    /**
     * 계산서 삭제 또는 발행시 입금의뢰테이블 계산서번호 초기화 또는 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int updateFcpDepstReqBill(FtxBillUpdVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateFcpDepstReqBill", vo);
    }
    
    /**
     * 수정계산서 발행시 기술료 입금테이블 계산서번호 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int updateResCrtPsRectlBill(FtxBillUpdVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateResCrtPsRectlBill", vo);
    }
    
    /**
     * 계산서 삭제가능 여부 체크
     * @param String
     * @return String
     * @throws Exception
     */
    public String selectFtxBillDelYn(String taxBillNo) throws KitechException{
    	return (String)selectByPk("kr.re.kitech.biz.fin.tax.selectFtxBillDelYn", taxBillNo);
    }
    
    /**
     * 매출계산서 이관대상 조회
     * @param FinTaxSearchVo
     * @return List<FtxBillHVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxBillHVo> selectItisIssuMstNotFtx(FinTaxSearchVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectItisIssuMstNotFtx", vo);
    }
    
    /**
     * 매출계산서 이관 품목내역 저장
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int insertFtxBillDByItis(FtxBillUpdVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertFtxBillDByItis", vo);
    }
    
    /**
     * 국세청발행계산서 수정(계정번호,계산서구분 등)
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int updateFtxBillHMove(FtxBillHVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateFtxBillHMove", vo);
    }
    
    /**
     * 계산서 폐기시 시험성적서 발행여부 체크
     * @param FtxBillUpdVo
     * @return String
     * @throws Exception
     */
    public String selectSptRstBookIssuChk(FtxBillUpdVo vo) throws KitechException{
    	return (String)selectByPk("kr.re.kitech.biz.fin.tax.selectSptRstBookIssuChk", vo);
    }
    
     /**
     * 계산서 발행 후  기술지원접수정보 계산서 번호 업데이트
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
    public int updateSptTecRcptInfoBillNo(SptTecRcptInfoVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateSptTecRcptInfoBillNo", vo);
    }
    
    /**
     * 거래처 담당자정보 유무 조회
     * @param String vendCd
     * @return int
     * @throws Exception
     */
    public int selectXodfVendJobCnt(String vendCd) throws KitechException{
    	return (int)selectByPk("kr.re.kitech.biz.fin.tax.selectXodfVendJobCnt", vendCd);
    }
    
    /**
     * 거래처 담당자정보 삭제
     * @param String vendCd
     * @return int
     * @throws Exception
     */
    public int deleteXodfVendJob(String vendCd) throws KitechException{
    	return delete("kr.re.kitech.biz.fin.tax.deleteXodfVendJob", vendCd);
    }
    
    /**
     * 거래처 담당자 정보 저장
     * @param XodfVendJobVo
     * @return int
     * @throws Exception
     */
	public int updateXodfVendJob(XodfVendJobVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.std.updateXodfVendJob", vo);
	}	
	
	/**
     * 계산서 삭제시 기술지원 접수 업데이트
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoBillDel(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.tax.updateSptTecRcptInfoBillDel", vo);
	}	
	
	/**
     * 계산서 삭제시 입금의뢰, 연구비입금상세 계산서 번호 초기화
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateFcpDepstReqBillDel(FtxBillUpdVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.tax.updateFcpDepstReqBillDel", vo);
	}	
	
	/**
     * 매출계산서 이관 저장(itis_issu_mstr)
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
	public int insertItisIssuMstrMove(FtxBillUpdVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.fin.tax.insertItisIssuMstrMove", vo);
	}
	
	/**
     * 매출계산서 이관 저장(itis_issu_detail)
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int insertItisIssuDetailMove(FtxBillUpdVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertItisIssuDetailMove", vo);
    }
    
    /**
     * 이관여부 조회
     * @param String decsnNo
     * @return int
     * @throws Exception
     */
    public int selectFtxBillHMoveCnt(String decsnNo) throws KitechException{
    	return (int)selectByPk("kr.re.kitech.biz.fin.tax.selectFtxBillHMoveCnt", decsnNo);
    }
    
     /**
     * 계산서 폐기 시 통프제어를 위한 기술지원번호 조회
     * @param String billNo
     * @return List<String>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<String> selectTechSuptReqNoByBill(String billNo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectTechSuptReqNoByBill", billNo);
    }
    
     /**
     * 매출계산서(관) 엑셀내리기
     * @param FinTaxSearchVo
     * @return List<FtxBillExcelVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxBillExcelVo> selectFtxBillHExcel(FinTaxSearchVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectFtxBillHExcel", vo);
    }
    
    /**
     * 매출계산서(관) 헤더 수정(계정번호,계산서구분,비고,결의번호 등)
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */
    public int updateFtxBillHMnt(FtxBillHVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateFtxBillHMnt", vo);
    }
    
    /**
     * 매출계산서(관) 미확인 조회
     * @param FinTaxSearchVo
     * @return List<FinBillUnConfirmVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FinBillUnConfirmVo> selectFtxBillUnConfirm(FinTaxSearchVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.tax.selectFtxBillUnConfirm", vo);
    }
    
    /**
     * 거래명세서 포함일 경우 거래명서세 원장 저장
     * @param ItisIssuMstrVo
     * @return int
     * @throws Exception
     */
    public int insertItisStsMstr(ItisIssuMstrVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertItisStsMstr", vo);
    }
    
    /**
     * 거래명세서 포함일 경우 거래명서세 상세품목 저장
     * @param ItisIssuDetailVo
     * @return int
     * @throws Exception
     */
    public int insertItisStsDetail(ItisIssuDetailVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.fin.tax.insertItisStsDetail", vo);
    }
    
    /**
     * 수정계산서 발행시 입금의뢰 계산서 번호 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
    public int updateSptTecRcptDepst(FtxBillUpdVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.tax.updateSptTecRcptDepst", vo);
    }
    
    /**
     * 기술지원 진행상태 업데이트
     * @param SptTecSrcVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoPrcsState(SptTecSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoPrcsState", vo);
	}
}
