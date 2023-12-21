package kr.re.kitech.biz.fin.pop.service;

import java.util.List;

import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.fin.com.vo.FcpPrmsntVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.pop.vo.AccntCdVo;
import kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo;
import kr.re.kitech.biz.fin.pop.vo.FinPopSearchVo;
import kr.re.kitech.biz.fin.pop.vo.FspMeetMntPopVo;
import kr.re.kitech.biz.fin.pop.vo.KtxIssuMstrDetlVo;
import kr.re.kitech.biz.fin.pop.vo.TransSlipVo;
import kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.std.vo.StdFbaCardVo;
import kr.re.kitech.biz.fin.std.vo.XodfExpnsVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;

/**
 * 결의생성 팝업 조회 interface
 */
public interface FinSlipPopService {
	/**
	 * On-Line 가수반제 회계코드 조회
	 */
	public List<FspRamtCreatVo> selectFspRamtCreatList(FinPopSearchVo vo);
	
	/**
	 * 카드정보 조회
	 */
	public List<StdFbaCardVo> selectFbaCardPopList(FinPopSearchVo vo);
	
	/**
	 * 연구장비집행확인 조회
	 */
	public List<ResEquipFeeReqVo> selectAssReqEquipFeeReqList(ResEquipFeeReqVo vo);
	
	/**
	 * 연구장비집행확인 저장
	 */
	public ResEquipFeeReqVo saveAssResEquipFeeReq(ResEquipFeeReqVo vo);
	
	/**
	 * 거래증빙등록 팝업 조회
	 */
	public KtxIssuMstrVo selectKtxIssuMstrPop(KtxIssuMstrComVo vo);
	
	/**
	 * 거래증빙(계산서) 저장(팝업 화면)
	 */
	public KtxIssuMstrComVo saveKtxIssuMstr(KtxIssuMstrVo vo);
	
	/**
	 * 전자세금계산서 등록팝업 계산서 정보 저장
	 */
	public void saveKtxIssuMstr(KtxIssuMstrDetlVo vo);
	
	/**
	 * 거래증빙(계산서) 삭제(팝업 화면)
	 */
	public void deleteKtxIssuMstr(KtxIssuMstrComVo vo);
	
	/**
	 * 비용코드검색
	 */
	public List<XodfExpnsVo> selectXodfExpnsList(FinPopSearchVo vo);
	
	/**
	 * 일반결의 결의내역 대체처리 검색 팝업
	 */
	public List<TransSlipVo> selectTransSlipInfoList(FinPopSearchVo vo);
	
	/**
	 * 일반결의 통제내역결의처리 검색 팝업
	 */
	public List<CtrlSlipVo> selectBblEnfrcForSlip(FinPopSearchVo vo);
	
	/**
	 * 일반결의 채무반제처리, On-Line가수반제 팝업 회계코드 조회
	 */
	public List<AccntCdVo> selectXodfAccntCdForDebt(FinCodeNmVo vo);
	
	/**
	 * 전자세금계산서 팝업 조회
	 */
	public KtxIssuMstrDetlVo selectKtxIssuMstr(KtxIssuMstrComVo vo);
	
	/**
	 * 전자세금계산서 등록팝업에서 거래선 정보 조회
	 */
	public List<XodfVendVo> selectXodfVendList(XodfVendVo vo);	
	
	/**
	 * 어음번호 조회
	 */
	public List<FcpPrmsntVo> selectFcpPrmsntList(FcpPrmsntVo vo);
	
	/**
	 * 회의록조회(팝업 F244)
	 */
	public List<FspMeetMntPopVo> selectFspMeetPopList(FinPopSearchVo vo);
	
	/**
	 * 이지바로과제일 경우 과학기술인번호가 없는 회의 참여자 조회
	 */
	public String selectNoSciTechNoPsn(String reqNo);
	
	/**
	* 매입계산서(관) 팝업호출시 결의번호 업데이트
	*/
	public void updateKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo);
	
	/**
	* 매입계산서(관) 팝업호출시 결의번호 삭제
	*/
	public void deleteKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo);
}
