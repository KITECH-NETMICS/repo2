/**
 * 
 */
package kr.re.kitech.biz.epu.pop.service;

import java.util.List;

import kr.re.kitech.biz.epu.pop.vo.EpuContrctChngVo;
import kr.re.kitech.biz.epu.pop.vo.ProdItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurAccntRemainDayVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlInfoVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqCostVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqDelyVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqEvalListVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqNotiStatusVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqProgrsVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpecVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqUsgVo;
import kr.re.kitech.biz.epu.pop.vo.ResInpPacoVo;
import kr.re.kitech.biz.epu.pop.vo.XodpExchVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAccntVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrMngVo;
import kr.re.kitech.biz.epu.req.vo.PurSrcVo;

/**  
 * @ClassSubJect 구매팝업 조회를 담당하는 인터페이스
 * @Class Name : EpuPopService.java
 * @Description : 구매팝업 조회를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/27   이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/05/27
 * @version 1.0
 * @see
 * 
 */
public interface EpuPopService {
	/**
    * 품목코드조회
    */
	public List<ProdItemVo> selectListProdItem(ProdItemVo vo);	
	/**
    * 하위 품목코드조회
    */
	public List<ProdItemVo> selectListProdItemCell(ProdItemVo vo);	
	/**
    * 검색된 품목코드조회
    */
	public List<ProdItemVo> selectListSchProdItem(ProdItemVo vo);	
	/**
    * 구매요구번호 물품 단건 조회
    */
	public PurItemVo selectPurItem(PurItemVo vo);	
	/**
    * 구매요구 사양서 조회
    */
	public PurReqSpecVo selectPurReqSpec(PurReqSpecVo vo);	
	/**
    * 구매요구 사양서 저장
    */
	public void savePurReqSpec(PurReqSpecVo vo);	
	/**
    * 구매요구 견적서 조회
    */
	public List<PurReqEvalVo> selectPurReqEval(PurSrcVo vo);	
	/**
    * 구매요구 견적서 저장
    */
	public void savePurReqEval(PurReqEvalListVo evalList);	
	/**
    * 구매요구 용도설명서 조회
    */
	public PurReqUsgVo selectPurReqUsg(PurReqUsgVo vo);	
	/**
    * 구매요구 용도설명서 저장
    */
	public void savePurReqUsg(PurReqUsgVo vo);	
	/**
    * 특정구매요구서 조회
    */
	public PurReqSpcficVo selectPurReqSpcfic(PurReqSpcficVo vo);	
	/**
    * 구매요구번호 조회
    */
	public List<PurReqMastrMngVo> selectPurReqPopList(PurSrcVo vo);	
	/**
    * 긴급구매사유서/시방서/사업계획서, 내부결재품의/과업지시서 조회
    */
	public PurReqDelyVo selectPurReqDely(PurReqDelyVo vo);	
	/**
    * 긴급구매사유서/시방서/사업계획서, 내부결재품의/과업지시서 저장
    */
	public void savePurReqDely(PurReqDelyVo vo);	
	/**
    * 원가계산서 조회
    */
	public PurReqCostVo selectPurReqCost(PurReqCostVo vo);	
	/**
    * 원가계산서 저장
    */
	public void savePurReqCost(PurReqCostVo vo);	
	/**
    * 계속연차확인서 조회
    */
	public PurContAnnlInfoVo selectPurContAnnlInfo(PurContAnnlReqVo vo);	
	/**
    * 구매 계정번호 잔여일수 조회
    */
	public PurAccntRemainDayVo selectPurAccntRemainDay(PurAccntRemainDayVo vo);	
	/**
    * 구매공고 상태 리스트 조회
    */
	public List<PurReqNotiStatusVo> selectPurReqNotiList(String purReqNo);	
	/**
    * 구매 조달 진행상태 조회
    */
	public PurReqProgrsVo selectPurReqProgrs(PurSrcVo vo);
	/**
    * 연구장비심의 등록 팝업 조회
    */
	public List<PurReqAccntVo> selectPurReqAccntMate(PurSrcVo vo);
	/**
    * 구매요구관리 최근 환율정보 조회
    */
	public XodpExchVo selectCurncyUnit(XodpExchVo vo);
	/**
    * 연구장비심의 저장
    */
	public void saveResEquipConsttn(List<PurReqAccntVo> accntList);
	/**
	 * 참여업체현황 팝업 조회
	 */
	public List<ResInpPacoVo> selectResInpPacoPop(ResInpPacoVo vo);
	/**
	 * 계약변경신청 내역 조회(팝업)
	 */
	public List<EpuContrctChngVo> selectEpuContrctChngPop(EpuContrctChngVo vo);
	/**
	 * 부서정보에서 편성구분(fomat_unit) 및 관리주체(ARB) 조회
	 */
	public EpuContrctChngVo selectDeptFomatUn(EpuContrctChngVo vo);
}
