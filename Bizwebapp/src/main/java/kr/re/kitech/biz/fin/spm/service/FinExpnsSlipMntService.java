package kr.re.kitech.biz.fin.spm.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.FinSaveSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo;
import kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo;
import kr.re.kitech.biz.fin.spm.vo.CardInfoVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsSlipMngmtVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsSlipVo;
import kr.re.kitech.biz.fin.spm.vo.FinExpnsSlipNumVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo;
import kr.re.kitech.biz.fin.spm.vo.GenrlSlipVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo;
import kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo;
import kr.re.kitech.biz.fin.std.vo.XodfAccntVo;
/**
 * 경비결의 관리 interface
 */
public interface FinExpnsSlipMntService {
	/**
	* 경비결의 목록조회
	*/
	public List<FinSpmSlipVo> selectFinSlipList(FinSlipSearchVo vo);
	
	/**
	* 카드결의 결의대상 카드목록 조회
	*/
	public List<CardInfoVo> selectFinExpnsSlipCardList(FinSlipSearchVo vo);
	
	/**
	* 카드결의 관리항목 조회
	*/
	public List<FbaAccntMngmtVo> selectSlipMngmtList(FinSlipSearchVo vo);
	
	/**
	* 카드결의 헤더,디테일리스트, 비용합계 조회
	*/
	public ExpnsSlipVo selectExpnsCardSlip(FinSlipSearchVo vo);
	
	/**
	* 카드결의 관리항목 및 카드정보 조회
	*/
	public ExpnsSlipMngmtVo selectSlipMngmtAndCard(FinSlipSearchVo vo);
	
	/**
	* 경비결의(일반) 관리항목, 송금내역, 계산서정보 조회
	*/
	public ExpnsSlipMngmtVo selectSlipMngmtAndBill(FinSlipSearchVo vo);
	
	/**
	* 이지바로과제 증빙개수 조회 및 저장
	*/
	public FinExpnsSlipNumVo selectFspItmEvidDetlsCnt(FinSlipSearchVo vo);
	
	/**
	* 경비결의 계산서 정보 조회
	*/
	public List<KtxIssuMstrVo> selectKtxIssuMstrList(FinSlipSearchVo vo);
	
	/**
	* 경비결의(일반) 헤더,디테일리스트, 비용합계 조회
	*/
	public ExpnsSlipVo selectExpnsBillSlip(FinSlipSearchVo vo);
	
	/**
	* 일반결의(일반) 헤더,디테일 차변, 대변 리스트 조회
	*/
	public GenrlSlipVo selectGenrlSlip(FinSlipSearchVo vo);
	
	/**
	* 관리항목 조회(일반결의 결의내역 대체처리)
	*/
	public List<FspSlipMngmtVo> selectSlipMngmt(FinSlipSearchVo vo);
	
	/**
	* 일반결의 수입처리 회계코드 조회
	*/
	public XodfAccntVo selectAccntCdByFinBsnsClsf(FinSlipSearchVo vo);
	
	/**
	* 일반결의 관리항목, 송금내역, 계산서정보, 카드내역 조회
	*/
	public ExpnsSlipMngmtVo selectSlipMngmtAndEtc(FinSlipSearchVo vo);
	
	/**
	* 이지바로 과제 회의록 증빙 조회
	*/
	public List<FspItmEvidDetlsVo> selectFspItmEvidDetlsList(FinSlipSearchVo vo);
	
	/**
	* 이지바로 과제 회의록 등 증빙 저장
	*/
	public void insertFspItmEvidDetls(List<FspItmEvidDetlsVo> voList);
	
	/**
	* 이지바로 과제 회의록 등 증빙 삭제
	*/
	public void deleteFspItmEvidDetls(FspItmEvidDetlsVo vo);
	
	/**
	* 결의서 결재전 체크
	*/
	public List<PreAprCheckVo> selectPreApprvCheck(FinSlipSearchVo vo);	
	
	/**
	* 카드결의 생성을 위한 회의록 정보 조회
	*/
	public FspSlipDVo selectFspSlipMeetInfo(String reqNo);
	
	/**
	* 일반결의,경비결의 결의생성
	*/
	public FinSlipSearchVo saveFinExpnsSlip(FinSaveSlipVo vo);
	
	/**
	* 일반결의,경비결의 결의삭제
	*/
	public void deleteExpnsSlip(FspSlipDVo vo) throws Exception;
}
