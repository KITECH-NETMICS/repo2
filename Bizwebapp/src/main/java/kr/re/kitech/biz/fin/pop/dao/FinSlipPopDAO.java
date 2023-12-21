package kr.re.kitech.biz.fin.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.fin.com.vo.FcpPrmsntVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.pop.vo.AccntCdVo;
import kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo;
import kr.re.kitech.biz.fin.pop.vo.FinPopSearchVo;
import kr.re.kitech.biz.fin.pop.vo.FspMeetMntPopVo;
import kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo;
import kr.re.kitech.biz.fin.pop.vo.KtxIssuMstrCntVo;
import kr.re.kitech.biz.fin.pop.vo.TransSlipVo;
import kr.re.kitech.biz.fin.pop.vo.XomxDelHistoryVo;
import kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.std.vo.StdFbaCardVo;
import kr.re.kitech.biz.fin.std.vo.XodfExpnsVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 결의생성 팝업 DAO
 * @Class Name : FinSlipPopDAO.java
 * @Description : 결의생성 팝업 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/25   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/04/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
 @Repository("finSlipPopDAO")
public class FinSlipPopDAO extends BizDefaultAbstractDAO{
	 
	 /**
     * On-Line 가수반제 회계코드 조회
     * @param FinPopSearchVo
     * @return List<FspRamtCreatVo>
     * @throws Exception
     */
	 @SuppressWarnings("unchecked")
	public List<FspRamtCreatVo> selectFspRamtCreatList(FinPopSearchVo vo) throws ElException{
		 return list("kr.re.kitech.biz.fin.pop.selectFspRamtCreatList", vo);
	}
	
	 /**
     * 카드정보 조회
     * @param FinPopSearchVo
     * @return List<StdFbaCardVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<StdFbaCardVo> selectFbaCardPopList(FinPopSearchVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectFbaCardPopList", vo);
	}
	
	/**
     * 연구장비집행확인 조회
     * @param ResEquipFeeReqVo
     * @return List<ResEquipFeeReqVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ResEquipFeeReqVo> selectAssReqEquipFeeReqList(ResEquipFeeReqVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectAssReqEquipFeeReqList", vo);
	}
	
	/**
    * 연구장비집행확인 저장
    * @param ResEquipFeeReqVo
    * @return int
    * @author LeeYH
    */
	public int insertAssResEquipFeeReq(ResEquipFeeReqVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ass.eqip.insertAssResEquipFeeReq", vo);
	}
	
	/**
    * 연구장비집행확인 수정
    * @param ResEquipFeeReqVo
    * @return int
    * @author LeeYH
    */
	public int updateAssResEquipFeeReq(ResEquipFeeReqVo vo) throws ElException{
		return update("kr.re.kitech.biz.ass.eqip.updateAssResEquipFeeReq", vo);
	}
	
	/**
    * 거래증빙등록 팝업 조회
    * @param KtxIssuMstrComVo
    * @return KtxIssuMstrInVo
    * @author LeeYH
    */
	public KtxIssuMstrVo selectKtxIssuMstrPop(KtxIssuMstrComVo vo) throws ElException{
		return (KtxIssuMstrVo)selectByPk("kr.re.kitech.biz.fin.pop.selectKtxIssuMstrPop", vo);
	}
	
	/**
    * 거래증빙등록(팝업화면)
    * @param KtxIssuMstrInVo
    * @return int
    * @author LeeYH
    */
	public int insertKtxIssuMstr(KtxIssuMstrVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.pop.insertKtxIssuMstr", vo);
	}
	
	/**
    * 거래증빙 수정(팝업화면)
    * @param KtxIssuMstrInVo
    * @return int
    * @author LeeYH
    */
	public int updateKtxIssuMstr(KtxIssuMstrVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.pop.updateKtxIssuMstr", vo);
	}
	
	/**
    * 거래증빙 삭제전 결의생성, 부가세신고여부 체크(팝업화면)
    * @param KtxIssuMstrComVo
    * @return KtxIssuMstrComVo
    * @author LeeYH
    */
	public KtxIssuMstrComVo selectKtxIssuMstrChk(KtxIssuMstrComVo vo) throws ElException{
		return (KtxIssuMstrComVo)selectByPk("kr.re.kitech.biz.fin.pop.selectKtxIssuMstrChk", vo);
	}
	
	/**
    * 계산서 삭제
    * @param KtxIssuMstrComVo
    * @return int
    * @author LeeYH
    */
	public int deleteKtxIssuMstr(KtxIssuMstrComVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.pop.deleteKtxIssuMstr", vo);
	}
	
	/**
    * 삭제이력 저장
    * @param XomxDelHistoryVo
    * @return int
    * @author LeeYH
    */
	public int insertXomxDelHistory(XomxDelHistoryVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.pop.insertXomxDelHistory", vo);
	}	
	
	/**
    * 삭제이력 저장
    * @param FinPopSearchVo
    * @return List<XodfExpnsVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<XodfExpnsVo> selectXodfExpnsList(FinPopSearchVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectXodfExpnsList", vo);
	}
	
	/**
    * 일반결의 결의내역 대체처리 검색 팝업
    * @param FinPopSearchVo
    * @return List<TransSlipVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<TransSlipVo> selectTransSlipInfoList(FinPopSearchVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectTransSlipInfoList", vo);
	}
	
	/**
    * 일반결의 통제내역결의처리 검색 팝업
    * @param FinPopSearchVo
    * @return List<CtrlSlipVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<CtrlSlipVo> selectBblEnfrcForSlip(FinPopSearchVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectBblEnfrcForSlip", vo);
	}
	
	/**
    * 일반결의 채무반제처리, On-Line가수반제 팝업 회계코드 조회
    * @param FinCodeNmVo
    * @return List<XodfAccntVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<AccntCdVo> selectXodfAccntCdForDebt(FinCodeNmVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectXodfAccntCdForDebt", vo);
	}
	
	/**
    * 전자세금계산서 품목내역 조회
    * @param KtxIssuMstrComVo
    * @return List<KtxIssuDetailVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<KtxIssuDetailVo> selectKtxIssuDetailList(KtxIssuMstrComVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectKtxIssuDetailList", vo);
	}
	
	/**
    * 전자세금계산서 등록팝업에서 거래선 정보 조회
    * @param String
    * @return List<XodfVendVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<XodfVendVo> selectXodfVendList(String bsnsPsnRegstNo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectXodfVendList", bsnsPsnRegstNo);
	}
	
	/**
    * 전자세금계산서 등록팝업에서 품목내역 저장
    * @param KtxIssuDetailVo
    * @return int
    * @author LeeYH
    */
	public int insertKtxIssuDetail(KtxIssuDetailVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.pop.insertKtxIssuDetail", vo);
	}
	
	/**
    * 어음번호 조회
    * @param FcpPrmsntVo
    * @return List<FcpPrmsntVo>
    * @author LeeYH
    * @since 2022.08.17.
    */
	@SuppressWarnings("unchecked")
	public List<FcpPrmsntVo> selectFcpPrmsntList(FcpPrmsntVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectFcpPrmsntList", vo);
	}
	
	/**
    * 회의록조회(팝업)
    * @param FinPopSearchVo
    * @return List<FspMeetMntPopVo>
    * @author LeeYH
    * @since 2022.09.27.
    */
	@SuppressWarnings("unchecked")
	public List<FspMeetMntPopVo> selectFspMeetPopList(FinPopSearchVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectFspMeetPopList", vo);
	}
	
	/**
    * 이지바로과제일 경우 과학기술인번호가 없는 회의 참여자 조회
    * @param String reqNo
    * @return String
    * @author LeeYH
    * @since 2022.09.27.
    */
	public String selectNoSciTechNoPsn(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.pop.selectNoSciTechNoPsn", reqNo);
	}
	
	/**
    * 전자세금계산서 등록여부 체크
    * @param String issuId
    * @return KtxIssuMstrCntVo
    * @author LeeYH
    * @since 2022.10.19.
    */
	public KtxIssuMstrCntVo selectKtxIssuMstrCnt(String issuId) throws ElException{
		return(KtxIssuMstrCntVo)selectByPk("kr.re.kitech.biz.fin.pop.selectKtxIssuMstrCnt", issuId);
	}
	
	/**
    * 전자세금계산서 등록자 수정
    * @param KtxIssuMstrVo
    * @return int
    * @author LeeYH
    * @since 2022.10.19.
    */
	public int updateKtxIssuMstrPsn(KtxIssuMstrVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.pop.updateKtxIssuMstrPsn", vo);
	}
	
	/**
    * 매입계산서(관) 팝업호출시 결의번호 업데이트
    * @param KtxIssuMstrComVo
    * @return int
    */
	public int updateKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.pop.updateKtxIssuMstrUnslipNo", vo);
	}
	
	/**
    * 매입계산서(관) 팝업호출시 결의번호 삭제
    * @param KtxIssuMstrComVo
    * @return int
    */
	public int deleteKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.pop.deleteKtxIssuMstrUnslipNo", vo);
	}
}
