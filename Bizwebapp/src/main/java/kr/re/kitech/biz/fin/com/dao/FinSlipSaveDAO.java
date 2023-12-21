package kr.re.kitech.biz.fin.com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.FcpPrmsntVo;
import kr.re.kitech.biz.fin.com.vo.FinComAmtChkVo;
import kr.re.kitech.biz.fin.com.vo.FinComBillCheckVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDCrVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo;
import kr.re.kitech.biz.fin.com.vo.SlipBaseVo;
import kr.re.kitech.biz.fin.spa.vo.FinAutoSlipCrtVo;
import kr.re.kitech.biz.fin.spm.vo.CardInfoVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillHVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 결의서 생성
 * @Class Name : FinSlipSaveDAO.java
 * @Description : 결의서를 생성하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/08   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/03/08
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finSlipSaveDAO")
public class FinSlipSaveDAO extends BizDefaultAbstractDAO{
	
	/**
     * 결의서헤더를 저장한다.
     * @param vo 결의서헤더 vo
     * @return int 입력결과
     * @throws Exception
     */
	public int insertFspSlipH(FspSlipHVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.com.insertFspSlipH", vo);
	}
	
	/**
     * 결의서헤더를 수정한다.
     * @param vo 결의서헤더 vo
     * @return int 수정결과
     * @throws Exception
     */
	public int updateFspSlipH(FspSlipHVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspSlipH", vo);
	}	
	
	/**
     * 결의서디테일을 저장한다.
     * @param vo 결의서디테일 vo
     * @return int 입력결과
     * @throws Exception
     */
	public int insertFspSlipD(FspSlipDVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.com.insertFspSlipD", vo);
	}
	
	/**
     * 결의서디테일을 수정한다.
     * @param vo 결의서디테일 vo
     * @return int 수정결과
     * @throws Exception
     */
	public int updateFspSlipD(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspSlipD", vo);
	}
	
	/**
     * 결의순번 조회
     * @param FinSlipSearchVo
     * @return int 결의순번
     * @throws Exception
     */
	public int selectUnslipOdr(FinSlipSearchVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectUnslipOdr", vo);
	}
	
	/**
     * 경비결의(결의순번조회) - 과제계정 홀수, 부가세 짝수
     * @param FinSlipSearchVo
     * @return int 결의순번
     * @throws Exception
     */
	public int selectExpnsUnslipOdr(FinSlipSearchVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectExpnsUnslipOdr", vo);
	}
	
	/**
     * 계정대체사유서 조회
     * @param String 결의번호
     * @return int 결의순번
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String,Object> selectFspAccntTransResson(String unslipNo) throws ElException{
		return (Map<String,Object>)selectByPk("kr.re.kitech.biz.fin.com.selectFspAccntTransResson", unslipNo);
	}
	
	/**
     * 일반결의, 카드결의시 자계좌이체가능여부 조회
     * @param Map (accnt_expns_cd, accnt_no)
     * @return map
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String,Object> selectFrcmsItm(Map<String, String> map) throws ElException{
		return (Map<String,Object>)selectByPk("kr.re.kitech.biz.fin.com.selectFrcmsItm", map);
	}
	
	/**
     * RCMS집행전송(117인데 선집행 정보 조회)
     * @param Map (계정번호, 카드번호)
     * @return int 개수
     * @throws Exception
     */
	public int selectIfRndCbaeLA02(Map<String, String> map) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectIfRndCbaeLA02", map);
	}
	
	/**
     * 일반,경비결의 계산서내역 결의번호 Update
     * @param FspSlipDVo 
     * @return int 개수
     * @throws Exception
     */
	public int updateKtxIssuMstr(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateKtxIssuMstr", vo);
	}
	
	/**
     * 일반경비결의 계산서내역 결의번호 Update(삭제시)
     * @param Map 
     * @return int 개수
     * @throws Exception
     */
	public int updateKixIssuMstrForDel(SlipBaseVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateKixIssuMstrForDel", vo);
	}
	
	/**
     * 잔액관리항목 조회
     * @param String 회게코드
     * @return map
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String,String> selectRamtMngmtItem(String accntCd) throws ElException{
		return (Map<String,String>)selectByPk("kr.re.kitech.biz.fin.com.selectRamtMngmtItem", accntCd);
	}
	
	/**
     * 결의서 관리항목 저장
     * @param FspSlipMngmtVo 
     * @return int 개수
     * @throws Exception
     */
	public int insertFspSlipMngmt(FspSlipMngmtVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.com.insertFspSlipMngmt", vo);
	}
	
	/**
     * 결의서 관리항목 수정
     * @param FspSlipMngmtVo 
     * @return int 개수
     * @throws Exception
     */
	public int updateFspSlipMngmt(FspSlipMngmtVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspSlipMngmt", vo);
	}
	
	/**
     * 결의디테일 수정 시, 부가세등록여부 체크
     * @param map 
     * @return int 개수
     * @throws Exception
     */
	public int selectFspSlipDCnt(SlipBaseVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectFspSlipDCnt", vo);
	}
	
	/**
     * 결의서 헤더 삭제
     * @param map 
     * @return int 개수
     * @throws Exception
     */
	public int deleteFspSlipH(SlipBaseVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspSlipH", vo);
	}
	
	/**
     * 결의서 디테일 삭제
     * @param map 
     * @return int 개수
     * @throws Exception
     */
	public int deleteFspSlipD(SlipBaseVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspSlipD", vo);
	}
	
	/**
     * 결의서 관리항목 삭제
     * @param map 
     * @return int 개수
     * @throws Exception
     */
	public int deleteFspSlipMngmt(SlipBaseVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspSlipMngmt", vo);
	}
	
	
	/**
     * 결의서 송금내역 삭제
     * @param FspSendReqVo 
     * @return int 
     * @throws Exception
     */
	public int deleteFspSendReq(SlipBaseVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspSendReq", vo);
	}
	
	/**
     * 결의서 송금내역 저장
     * @param FspSendReqVo 
     * @return int 개수
     * @throws Exception
     */
	public int insertFspSendReq(FspSendReqVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.com.insertFspSendReq", vo);
	}
	
	/**
     * 결의서 송금내역 수정
     * @param FspSendReqVo 
     * @return int 개수
     * @throws Exception
     */
	public int updateFspSendReq(FspSendReqVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspSendReq", vo);
	}
	
	/**
     * 회계코드 조회(분개유형별 회계코드 체크-일반결의, 경비결의)
     * @param String accntCd
     * @return map
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String, String>selectXodfAccntChk(String accntCd) throws ElException{
		return(Map<String, String>)selectByPk("kr.re.kitech.biz.fin.com.selectXodfAccntChk", accntCd);
	}
	
	/**
     * 일반결의처리(일반결의수정시 증빙내역 총금액 체크)
     * @param String billNo
     * @return map
     * @throws Exception
     */
	public FinComBillCheckVo selectKtxIssuMstrChk(FspSlipDVo vo) throws ElException{
		return(FinComBillCheckVo)selectByPk("kr.re.kitech.biz.fin.com.selectKtxIssuMstrChk", vo);
	}
	
	/**
     * 결의확정테이블 수정 - 일반결의(결의내역대체처리)
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateFspSlipDecsnd(Map<String, Object> map) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspSlipDecsnd", map);
	}
	
	/**
     * 결의확정테이블 삭제 - 일반결의(결의내역대체처리)
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateFspSlipDecsndDel(Map<String, Object> map) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspSlipDecsndDel", map);
	}
	
	/**
     * 일반결의(통제내역결의처리 신규입력시 예산집행내역 UPDATE)
     * @param FspSlipDVo
     * @return int
     * @throws Exception
     */
	public int updateBblEnfrc(FspSlipDVo vo)throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblEnfrc", vo);
	}
	
	/**
     * 일반결의(통제내역결의처리 삭제시 예산집행내역 UPDATE)
     * @param FspSlipDVo
     * @return int
     * @throws Exception
     */
	public int updateBblEnfrcDel(FspSlipDVo vo)throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblEnfrcDel", vo);
	}
	
	/**
     * 통제내역결의처리 잔액체크
     * @param FspSlipDVo
     * @return map
     * @throws Exception
     */
	public FinComAmtChkVo selectBblEnfrcChk(FspSlipDVo vo) throws ElException{
		return (FinComAmtChkVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblEnfrcChk", vo);
	}
	
	/**
     * 결의서 디테일 삭제 후 건수 조회(헤더 삭제여부 판단)
     * @param map
     * @return String (decsn_ex)
     * @throws Exception
     */	
	public int selectFspSlipDTCnt(SlipBaseVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectFspSlipDTCnt", vo);
	}
		
	/**
     * 법인카드 결의금액 업데이트
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateFbcRecogn(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFbcRecogn", vo);
	}
	
	/**
     * 결의삭제시 법인카드 결의금액 초기화
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateFbcRecognDel(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFbcRecognDel", vo);
	}
	
	/**
     * 연구비BC카드 결의금액 업데이트
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateFbcRndAuth(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFbcRndAuth", vo);
	}
	
	/**
     * 결의삭제시 연구비BC카드 결의금액 초기화
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateFbcRndAuthDel(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFbcRndAuthDel", vo);
	}
	
	/**
     * 연구비신한카드 결의금액 업데이트
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateFlgRndRecogn(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFlgRndRecogn", vo);
	}
	
	/**
     * 결의삭제시 연구비신한카드 결의금액 초기화
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateFlgRndRecognDel(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFlgRndRecognDel", vo);
	}
	
	/**
     * 연구비 통합이지바로카드 결의금액 업데이트
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateEzCardOrgn(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateEzCardOrgn", vo);
	}
	
	/**
     * 결의삭제시 연구비 통합이지바로카드 결의금액 초기화
     * @param FspSendReqVo
     * @return int
     * @throws Exception
     */	
	public int updateEzCardOrgnDel(FspSlipDVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateEzCardOrgnDel", vo);
	}
	
	/**
     * 어음결의처리 어음내역 조회
     * @param String(어음번호)
     * @return FcpPrmsntVo
     * @throws Exception
     */	
	public FcpPrmsntVo selectFcpPrmsnt(String prmsntNo) throws ElException{
		return (FcpPrmsntVo)selectByPk("kr.re.kitech.biz.fin.com.selectFcpPrmsnt", prmsntNo);
	}
	
	/**
     * 어음결의처리 어음내역에 가결의대변금액 업데이트
     * @param FcpPrmsntVo
     * @return int
     * @throws Exception
     */	
	public int updateFcpprmsnt(FcpPrmsntVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFcpprmsnt", vo);
	}
	
	/**
     * 결의삭제시 (구)이지바로 과제 증빙여부 조회
     * @param Map
     * @return int
     * @throws Exception
     */	
	public int selectFspItmEvidDetlsCnt(SlipBaseVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectFspItmEvidDetlsCnt", vo);
	}
	
	/**
     * (구)이지바로 과제 증빙여부 삭제
     * @param Map
     * @return int
     * @throws Exception
     */	
	public int deleteFspItmEvidDetls (SlipBaseVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspItmEvidDetls", vo);
	}
	
	/**
     * 경비결의 삭제시 같은 증빙으로 대변내역 존재여부 조회
     * @param Map
     * @return int
     * @throws Exception
     */	
	public int selectFspSlipDBillNoCnt(SlipBaseVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectFspSlipDBillNoCnt", vo);
	}
	
	/**
     * 경비결의 일반 대변생성을 위한 조회(998,999)
     * @param String
     * @return List<FspSlipDCrVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<FspSlipDCrVo> selectExpnsSlipDForCr(String unslipNo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectExpnsSlipDForCr", unslipNo);
	}
	
	/**
     * 경비결의 카드 대변생성을 위한 조회(996,997,998,999)
     * @param String
     * @return List<FspSlipDCrVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<FspSlipDCrVo> selectExpnsSlipCardCr(Map<String,String> map) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectExpnsSlipCardCr", map);
	}
	
	/**
     * 카드결의 잔액 체크
     * @param FspSlipDVo
     * @return Map
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public Map<String,String> selectCardUseCheck(FspSlipDVo vo) throws ElException{
		return(Map<String,String>)selectByPk("kr.re.kitech.biz.fin.com.selectCardUseCheck", vo);
	}
	
	/**
     * 예산통제모듈 호출 후 통제번호 수정
     * @param FspSlipDVo
     * @return BblenfrcVo
     * @throws Exception
     */	
	public int updateFspSlipDCtrlNo(BblenfrcVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspSlipDCtrlNo", vo);
	}	
	
	/**
     * 카드결의 대변 자동생성 후 대변금액 체크
     * @param String unslip_no
     * @return FinComAmtChkVo
     * @throws Exception
     */
	public FinComAmtChkVo selectCrUnslipAmtChk(String unslipNo) throws ElException{
		return (FinComAmtChkVo)selectByPk("kr.re.kitech.biz.fin.com.selectCrUnslipAmtChk", unslipNo);
	}
	
	/**
     * 결의서 확정여부 조회
     * @param String unslipNo
     * @return Map<String, String>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public Map<String, String> selectFspSlipHDecsnEx(String unslipNo) throws ElException{
		return (Map<String, String>)selectByPk("kr.re.kitech.biz.fin.com.selectFspSlipHDecsnEx", unslipNo);
	}
	
	/**
     * 자동결의 여부조회
     * @param String unslipNo
     * @return int
     * @throws Exception
     */	
	public int selectAutoSlipCnt(String unslipNo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectAutoSlipCnt", unslipNo);
	}
	
	/**
     * 일반결의에서 비용코드 99A일 경우 매출계산서에 결의번호 업데이트
     * @param FtxBillHVo
     * @return int
     * @throws Exception
     */	
	public int updateFtxBillHUnslipNo(FtxBillHVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.tax.updateFtxBillHUnslipNo", vo);
	}
	
	/**
     * 첨부파일 번호가 공백으로 업데이트되는 오류가 있어서 첨부파일 번호 재조회
     * @param FspSlipDVo
     * @return String
     * @throws Exception
     * @author LeeYH
     * @since 2022.11.14.
     */	
	public String selectSlipAttachFileNo(FspSlipDVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectSlipAttachFileNo", vo);
	}
	
	/**
     * 결의서 디테일 카드정보 누락시 다시 조회
     * @param FspSlipDVo
     * @return CardInfoVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.02.
     */	
	public CardInfoVo selectCardInfo(FspSlipDVo vo) throws ElException{
		return (CardInfoVo)selectByPk("kr.re.kitech.biz.fin.com.selectCardInfo", vo);
	}
	
	/**
     * 자동결의서 중복 생성 체크
     * @param SlipBaseVo
     * @return SlipBaseVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.02.02.
     */	
	public FinAutoSlipCrtVo selectDupSlipCrtCnt(FinAutoSlipCrtVo vo) throws ElException{
		return (FinAutoSlipCrtVo)selectByPk("kr.re.kitech.biz.fin.com.selectDupSlipCrtCnt", vo);
	}
	
	/**
     * 이지바로 과제 증빙(회의록) 저장
     * @param FinSlipSearchVo
     * @return int
     * @throws Exception
     */
    public int insertFspItmEvidDetlsBySel(FinSlipSearchVo vo) throws ElException{
    	return insert("kr.re.kitech.biz.fin.spm.insertFspItmEvidDetlsBySel", vo);
    }
    
    /**
     * 결의서 삭제시 회의록 결의번호 초기화
     * @param FspSlipDVo
     * @return int
     * @throws Exception
     */
    public int updateFspMeetEvidDel(FspSlipDVo vo) throws ElException{
    	return update("kr.re.kitech.biz.fin.spm.updateFspMeetEvidDel", vo);
    }
    
    /**
     * 결의서 삭제시 회의록 결의번호 초기화
     * @param FspSlipDVo
     * @return int
     * @throws Exception
     */
    public int updateKixIssuMstrAutoDel(String unslipNo) throws ElException{
    	return update("kr.re.kitech.biz.fin.com.updateKixIssuMstrAutoDel", unslipNo);
    }
}
