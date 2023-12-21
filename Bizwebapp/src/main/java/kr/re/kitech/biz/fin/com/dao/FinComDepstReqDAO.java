package kr.re.kitech.biz.fin.com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.com.vo.FibkAcctHisVo;
import kr.re.kitech.biz.fin.com.vo.FinDepstSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatChkVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillUpdVo;
import kr.re.kitech.biz.res.com.vo.ResDepstAccntVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 입금의뢰관리
 * @Class Name : FinDepstReqDAO.java
 * @Description : 입금의뢰관리 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/22   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/03/22
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
 @Repository("comDepstReqDAO")
public class FinComDepstReqDAO extends BizDefaultAbstractDAO {
	 
	 /**
     * 입금현황조회(기술료, 연구비입금의뢰, 기술지원)
     * @param map
     * @return FibkAcctHisVo
     * @throws Exception
     */
	 public FibkAcctHisVo selectFibkAcctHis(Map<String, String> map) throws ElException{
		 return (FibkAcctHisVo)selectByPk("kr.re.kitech.biz.fin.com.selectFibkAcctHis", map);
	 }
	 
	 /**
     * 입금의뢰저장
     * @param FcpDepstReqVo
     * @return int
     * @throws Exception
     */
	 public int insertFcpDepstReq(FcpDepstReqVo vo) throws ElException{
		 return insert("kr.re.kitech.biz.fin.com.insertFcpDepstReq", vo);
	 }
	 
	 /**
     * 계산서헤더 신청번호 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
	 public int updateFtxBillHIssuReq(FtxBillUpdVo vo) throws ElException{
		 return update("kr.re.kitech.biz.fin.com.updateFtxBillHIssuReq", vo);
	 }
	 
	 /**
     * 입금의뢰수정
     * @param FcpDepstReqVo
     * @return int
     * @throws Exception
     */
	 public int updateFcpDepstReq(FcpDepstReqVo vo) throws ElException{
		 return update("kr.re.kitech.biz.fin.com.updateFcpDepstReq", vo);
	 }
	 
	 /**
     * 결의번호 업데이트
     * @param FinDepstSlipVo
     * @return int
     * @throws Exception
     */
	public int updateFcpDepstReqUnslipNo(FinDepstSlipVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFcpDepstReqUnslipNo", vo);
	}
	 
	 /**
     * 결의취소시 입금의뢰테이블 결의번호 초기화 
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	 public int updateFcpDepstReqDel(FinSpaSlipUpdVo vo) throws ElException{
		 return update("kr.re.kitech.biz.fin.com.updateFcpDepstReqDel", vo);
	 }
	 
	 /**
     * 입금의뢰삭제
     * @param String
     * @return int
     * @throws Exception
     */
	 public int deleteFcpDepstReq(String reqNo) throws ElException{
		 return delete("kr.re.kitech.biz.fin.com.deleteFcpDepstReq", reqNo);
	 }
	 
	 /**
     * 반제금액 수정을 위한 slip_no 조회
     * @param req_no
     * @return map
     * @return int
     * @throws Exception
     */
	 public FspRamtCreatVo selectDepstReqSlipNo(String reqNo) throws ElException{
		 return (FspRamtCreatVo) selectByPk("kr.re.kitech.biz.fin.com.selectDepstReqSlipNo", reqNo);
	 }
	 
	 /**
     * 반제금액 수정
     * @param FcpDepstReqVo
     * @return int
     * @throws Exception
     */
	 public int updateFspRamtCreatForReq(FcpDepstReqVo vo) throws ElException{
		 return update("kr.re.kitech.biz.fin.com.updateFspRamtCreatForReq", vo);
	 }
	 
	 /**
     * 입금의뢰 후 반제금액 체크
     * @param FcpDepstReqVo
     * @return map
     * @throws Exception
     */
	public FspRamtCreatChkVo selectRamtCreatRepayAmtChk(FcpDepstReqVo vo) throws ElException{
		 return (FspRamtCreatChkVo) selectByPk("kr.re.kitech.biz.fin.com.selectRamtCreatRepayAmtChk", vo);
	 }
	 	
	/**
     * 결의번호로 잔액정산 삭제
     * @param unslip_no
     * @return int
     * @throws Exception
     */
	public int deleteFspRamtAdjst2(String unslipNo) throws ElException{ 
		return delete("kr.re.kitech.biz.fin.com.deleteFspRamtAdjst2", unslipNo);
	}
	
	/**
     * 입금의뢰 삭제 시 결의서삭제 후 잔액생성을 수정위한 slip_no,slip_odr 조회
     * @param unslip_no
     * @return List<FspRamtCreatVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FspRamtCreatVo> selectFspRamtAdjstList(String unslipNo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectFspRamtAdjstList", unslipNo);
	}
	
	/**
     * 결의삭제 후 결의번호 초기화
     * @param map
     * @return int
     * @throws Exception
     */
	 public int updateFtxBillHDel(FinSpaSlipUpdVo vo) throws ElException{
		 return update("kr.re.kitech.biz.fin.com.updateFtxBillHDel", vo);
	 }
	
	/**
     * 입금의뢰 대변생성을 위한 조회
     * @param String reqNolist
     * @return List<FinDepstSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinDepstSlipVo> selectFcpDepstSlipCrList(String reqNolist) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectFcpDepstSlipCrList", reqNolist);
	}
	
	/**
     * 입금결의에서 회계코드 조회(연구비)
     * @param ResDepstAccntVo
     * @return accnt_cd
     * @throws Exception
     */
	public String selectDepstSlipAccntCd01(ResDepstAccntVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectDepstSlipAccntCd01", vo);
	}
	
	/**
     * 입금결의에서 회계코드 조회(불인정연구비, 참여기관연구비잔액)
     * @param ResDepstAccntVo
     * @return accnt_cd
     * @throws Exception
     */
	public String selectDepstSlipAccntCd02(ResDepstAccntVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectDepstSlipAccntCd02", vo);
	}
	
	/**
     * 입금결의에서 회계코드 조회(기술료, 수혜기업부담금)
     * @param ResDepstAccntVo
     * @return accnt_cd
     * @throws Exception
     */
	public String selectDepstSlipAccntCd03(ResDepstAccntVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectDepstSlipAccntCd03", vo);
	}
	
	/**
     * 입금결의에서 회계코드 조회(참여기관연구비, 청정사업비 등)
     * @param ResDepstAccntVo
     * @return accnt_cd
     * @throws Exception
     */
	public String selectDepstSlipAccntCd04(ResDepstAccntVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectDepstSlipAccntCd04", vo);
	}
	
	/**
     * 기술지원 입금결의에서 회계코드 조회( 기술지원비)
     * @param ResDepstAccntVo
     * @return accnt_cd
     * @throws Exception
     */
	public String selectDepstSlipAccntCd05(ResDepstAccntVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectDepstSlipAccntCd05", vo);
	}
	
	/**
     * 기술료 입금결의생성시 모계정조회
     * @param req_no
     * @return main_accnt_no
     * @throws Exception
     */
	public String selectTechFeeMainAccntNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectTechFeeMainAccntNo", reqNo);
	}
	
	/**
     * 삭제시 잔액생성 데이터 수정(일반결의,경비결의)
     * @param FspRamtCreatVo
     * @return int
     * @throws Exception
     */
	public int updateFspRamtCreatDel(FspRamtCreatVo vo ) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspRamtCreatDel", vo);
	}
	
	/**
     * 삭제시 잔액생성 데이터 수정(입금신청 자동결의)
     * @param FspRamtCreatVo
     * @return int
     * @throws Exception
     */
	public int updateFspRamtCreatDel2(FspRamtCreatVo vo ) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspRamtCreatDel2", vo);
	}
	
	/**
     * 잔액정산 삭제
     * @param FspRamtCreatVo
     * @return int
     * @throws Exception
     */
	public int deleteFspRamtAdjst(FspRamtCreatVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspRamtAdjst", vo);
	}
	
	/**
     * 잔액생성 정보를 조회한다.
     * @param Map
     * @return FspRamtCreatVo
     * @throws Exception
     */
	public FspRamtCreatVo selectFspRamtCreat(FspRamtCreatVo vo) throws ElException{
		return (FspRamtCreatVo)selectByPk("kr.re.kitech.biz.fin.com.selectFspRamtCreat", vo);
	}
	
	/**
     * 잔액정산 정보 저장
     * @param FspRamtCreatVo
     * @return int
     * @throws Exception
     */
	public int insertFspRamtAdjst(FspRamtCreatVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.com.insertFspRamtAdjst", vo);
	}
	
	/**
     * 잔액정산 데이터 수정
     * @param FspRamtCreatVo
     * @return int
     * @throws Exception
     */
	public int updateFspRamtAdjst(FspRamtCreatVo vo ) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspRamtAdjst", vo);
	}
	
	/**
     * 잔액생성 데이터 수정
     * @param FspRamtCreatVo
     * @return int
     * @throws Exception
     */
	public int updateFspRamtCreat(FspRamtCreatVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspRamtCreat", vo);
	}
	
	/**
     * 입금결의 잔액생성 데이터 수정
     * @param FspRamtCreatVo
     * @return int
     * @throws Exception
     */
	public int updateFspRamtCreat2(FspRamtCreatVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspRamtCreat2", vo);
	}
	
	/**
     * 잔액생성 정산금액과 잔액정산 합계금액 비교체크
     * @param FspRamtCreatVo
     * @return FspRamtCreatChkVo
     * @throws Exception
     */
	public FspRamtCreatChkVo selectFspRamtCreatChk(FspRamtCreatVo vo) throws ElException{
		return (FspRamtCreatChkVo)selectByPk("kr.re.kitech.biz.fin.com.selectFspRamtCreatChk", vo);
	}	
	
	/**
     * 결의생성 후 결의번호 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
	 public int updateFtxBillHUnslipNo(FtxBillUpdVo vo) throws ElException{
		 return update("kr.re.kitech.biz.fin.com.updateFtxBillHUnslipNo", vo);
	 }
	 
	 	
	/**
     * 입금결의를 위한 조회
     * @param reqNo
     * @return List<FinDepstSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinDepstSlipVo> selectFcpDepstSlipList(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectFcpDepstSlipList", reqNo);
	}
	
	/**
     * 입금결의시 전자계산서발행여부체크
     * @param bill_no
     * @return Map
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String,String> selectFtxBillHChk(String billNo) throws ElException{
		return (Map<String,String>)selectByPk("kr.re.kitech.biz.fin.com.selectFtxBillHChk", billNo);
	}
}
