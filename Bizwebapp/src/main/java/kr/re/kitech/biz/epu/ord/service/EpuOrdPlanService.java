package kr.re.kitech.biz.epu.ord.service;

import java.util.List;

import kr.re.kitech.biz.epu.ord.vo.EpuOrdLstVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanInfoVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdSrcVo;

public interface EpuOrdPlanService {
	/*
	* 발주계획관리 목록조회
	*/
	public List<EpuOrdLstVo> selectEpuOrdMastrList(EpuOrdSrcVo vo);
	/*
	* G2B ID 조회
	*/
	public String selectG2bId(EpuOrdSrcVo vo);
	/*
 	* 발주계획 조회
	*/
	public EpuOrdPlanInfoVo selectOrderPlans(EpuOrdSrcVo vo);
	/*
 	* 구매요구품목 조회(구매요구번호 클릭해서 발주계획화면 이동시)
	*/
	public List<EpuOrdReqItemVo> selectPurReqItemOrdPlan(EpuOrdSrcVo vo);

  	/* 
  	* 발주계획 등록
	*/
  	public EpuOrdSrcVo saveEpuOrdPlan(EpuOrdPlanInfoVo vo) throws Exception;

  	/* 
  	* 발주계획 삭제
	*/
  	public void deleteEpuOrderPlan(EpuOrdPlanInfoVo vo);

//  // 결재신청
//  public String excuteApproval(EpuOrdMastrVo vo) throws ElException, IOException;
  
}
