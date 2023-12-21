package kr.re.kitech.biz.epu.ord.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.api.server.vo.biz.ApiEpuVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdCheckVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdDelVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdLstVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdMastrVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdSrcVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAccntVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 발주계획관리
 * @Class Name EpuOrdPlanDAO
 * @Description 발주계획관리 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/08/07      이영희             수정작성
 * 
 * @author 이영희
 * @since 2023/08/07 
 * @version 1.0
 * @see
 * 
 */
 
@Repository("epuOrdPlanDAO")
public class EpuOrdPlanDAO extends BizDefaultAbstractDAO {
	/**
     * 발주계획관리 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdLstVo>
     * @throws Exception
     */     
	@SuppressWarnings("unchecked")
	public List<EpuOrdLstVo> selectEpuOrdMastrList(EpuOrdSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.epu.ord.selectEpuOrdMastrList", vo);
	}
	
	/**
     * G2b Id 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdLstVo>
     * @throws Exception
     */   
	public String selectG2bId(String sysPayNo) throws KitechException {
		return (String) selectByPk("kr.re.kitech.biz.epu.ord.selectG2bId", sysPayNo);
	}
  
	/**
     * 발주계획조회
     * @param EpuOrdSrcVo
     * @return EpuOrdMastrVo
     * @throws Exception
     */  
	public EpuOrdMastrVo selectEpuOrdMastr(EpuOrdSrcVo vo) throws KitechException {
		return (EpuOrdMastrVo) selectByPk("kr.re.kitech.biz.epu.ord.selectEpuOrdMastr", vo);
	}
  
	/**
     * 발주계획 - 구매의뢰내역 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdPlanReqVo>
     * @throws Exception
     */  
	@SuppressWarnings("unchecked")
	public List<EpuOrdReqItemVo> selecEpuOrdReqItem(EpuOrdSrcVo vo) throws KitechException {
		return (List<EpuOrdReqItemVo>)list("kr.re.kitech.biz.epu.ord.selecEpuOrdReqItem", vo);
	}
	
	/**
     * 발주계획 지명업체 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrnomVendVo>
     * @throws Exception
     */  
	@SuppressWarnings("unchecked")
	public List<EpuOrnomVendVo> selectEpuOrnomVend(EpuOrdSrcVo vo) throws KitechException {
		return (List<EpuOrnomVendVo>)list("kr.re.kitech.biz.epu.ord.selectEpuOrnomVend", vo);
	}
	
	/**
     * 발주계획 지역제한 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdLimitAreaVo>
     * @throws Exception
     */ 
	@SuppressWarnings("unchecked")
	public List<EpuOrdLimitAreaVo> selectOrdLimitArea(EpuOrdSrcVo vo) throws KitechException {
		return (List<EpuOrdLimitAreaVo>)list("kr.re.kitech.biz.epu.ord.selectOrdLimitArea", vo);
	}
	
	/**
     * 발주계획 업종제한 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdLimitAreaVo>
     * @throws Exception
     */ 
	@SuppressWarnings("unchecked")
	public List<EpuOrdLimitClsfVo> selectEpuOrdLimitClsf(EpuOrdSrcVo vo) throws KitechException {
		return (List<EpuOrdLimitClsfVo>)list("kr.re.kitech.biz.epu.ord.selectEpuOrdLimitClsf", vo);
	}
	
	/**
     *  구매 계정내역 조회(발주계획 결재시필요)
     * @param EpuOrdSrcVo
     * @return List<PurReqAccntVo>
     * @throws Exception
     */ 
	@SuppressWarnings("unchecked")
	public List<PurReqAccntVo> selectPurReqAccntApr(EpuOrdSrcVo vo) throws KitechException {
		return (List<PurReqAccntVo>)list("kr.re.kitech.biz.epu.ord.selectPurReqAccntApr", vo);
	}
	
	/**
     * 통합발주유무 조회(발주계획 결재시필요)
     * @param EpuOrdSrcVo
     * @return List<PurReqAccntVo>
     * @throws Exception
     */ 
	public EpuOrdCheckVo selectCombBidOrdYn(EpuOrdSrcVo vo) throws KitechException {
		return (EpuOrdCheckVo) selectByPk("kr.re.kitech.biz.epu.ord.selectCombBidOrdYn", vo);
	}
	/**
     * 구매요구품목 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdReqItemVo>
     * @throws Exception
     */ 
	@SuppressWarnings("unchecked")
	public List<EpuOrdReqItemVo> selectPurReqItemOrdPlan(EpuOrdSrcVo vo) throws KitechException {
		return list("kr.re.kitech.biz.epu.ord.selectPurReqItemOrdPlan", vo);
	}

	/**
     * 발주계획마스터 저장
     * @param EpuOrdMastrVo
     * @return int
     * @throws Exception
     */ 
	public int insertEpuOrdMastr(EpuOrdMastrVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.epu.ord.insertEpuOrdMastr", vo);
	}
	
	/**
     * 발주계획마스터 수정
     * @param EpuOrdMastrVo
     * @return int
     * @throws Exception
     */ 
	public int updateEpuOrdMastr(EpuOrdMastrVo vo) throws KitechException {
		return update("kr.re.kitech.biz.epu.ord.updateEpuOrdMastr", vo);
	}
	
	/**
     * 발주계획(구매품목내역 등록)
     * @param EpuOrdReqItemVo
     * @return int
     * @throws Exception
     */ 
	public int insertEpuOrdReqItem(EpuOrdReqItemVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.epu.ord.insertEpuOrdReqItem", vo);
	}
	
	/**
     * 발주계획(구매품목내역 수정)
     * @param EpuOrdReqItemVo
     * @return int
     * @throws Exception
     */ 
	public int updateEpuOrdReqItem(EpuOrdReqItemVo vo) throws KitechException {
		return update("kr.re.kitech.biz.epu.ord.updateEpuOrdReqItem", vo);
	}
	
	/**
     * 발주계획(구매품목내역 삭제)
     * @param EpuOrdReqItemVo
     * @return int
     * @throws Exception
     */ 
	public int deleteEpuOrdReqItem(EpuOrdDelVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.epu.ord.deleteEpuOrdReqItem", vo);
	}
	
	/**
     *발주등록시 구매요구상태 수정
     * @param EpuOrdReqItemVo
     * @return int
     * @throws Exception
     */ 
	public int updatePurreqItemOrderCd(EpuOrdReqItemVo vo) throws KitechException {
		return update("kr.re.kitech.biz.epu.ord.updatePurreqItemOrderCd", vo);
	}
	
	/**
     * 구매담당자 수정
     * @param EpuOrdReqItemVo
     * @return int
     * @throws Exception
     */ 
	public int updatePurchaseManager(ApiEpuVo vo) throws KitechException {
		return update("kr.re.kitech.biz.epu.ord.updatePurchaseManager", vo);
	}

	/**
     * 지명업체 등록
     * @param EpuOrnomVendVo
     * @return int
     * @throws Exception
     */ 
	public int insertEpuOrnomVend(EpuOrnomVendVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.epu.ord.insertEpuOrnomVend", vo);
	}
	
	/**
     * 지명업체 삭제
     * @param EpuOrnomVendVo
     * @return int
     * @throws Exception
     */ 
	public int deleteEpuOrnomVend(EpuOrdDelVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.epu.ord.deleteEpuOrnomVend", vo);
	}
	
	/**
     * 지역제한 등록
     * @param EpuOrdLimitAreaVo
     * @return int
     * @throws Exception
     */ 
	public int insertEpuOrdLimitArea(EpuOrdLimitAreaVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.epu.ord.insertEpuOrdLimitArea", vo);
	}
  
    /**
     * 지역제한 삭제
     * @param EpuOrdLimitAreaVo
     * @return int
     * @throws Exception
     */ 
	public int deleteEpuOrdLimitArea(EpuOrdDelVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.epu.ord.deleteEpuOrdLimitArea", vo);
	}

	 /**
     * 업종제한 저장
     * @param EpuOrdLimitClsfVo
     * @return int
     * @throws Exception
     */ 
	public int insertEpuOrdLimitClsf(EpuOrdLimitClsfVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.epu.ord.insertEpuOrdLimitClsf", vo);
	}
	
	/**
     * 업종제한 삭제
     * @param EpuOrdLimitClsfVo
     * @return int
     * @throws Exception
     */ 
	public int deleteEpuOrdLimitClsf(EpuOrdDelVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.epu.ord.deleteEpuOrdLimitClsf", vo);
	}
	
	/**
     * 발주계획 삭제
     * @param EpuOrdDelVo
     * @return int
     * @throws Exception
     */
	public int deleteEpuOrdMastr(EpuOrdDelVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.epu.ord.deleteEpuOrdMastr", vo);
	}
	
	/**
     * 수수료지급신청 여부 체크
     * @param EpuOrdDelVo
     * @return int
     * @throws Exception
     */
	public int selectPurPayReqMastrCnt(EpuOrdDelVo vo) throws KitechException {
		return (int)selectByPk("kr.re.kitech.biz.epu.ord.selectPurPayReqMastrCnt", vo);
	}
	
	/**
     * 공종별 전체 지분율 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdLimitConstClsfVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<EpuOrdLimitConstClsfVo> selectEpuOrdLimitConstClsf(EpuOrdSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.epu.ord.selectEpuOrdLimitConstClsf", vo);
	}
	
	/**
     * 공종별 전체 지분율 저장
     * @param EpuOrdLimitConstClsfVo
     * @return int
     * @throws Exception
     */
	public int insertEpuOrdLimitConstClsf(EpuOrdLimitConstClsfVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.epu.ord.insertEpuOrdLimitConstClsf", vo);
	}

	/**
     * 공종별 전체 지분율 삭제
     * @param EpuOrdDelVo
     * @return int
     * @throws Exception
     */
	public int deleteEpuOrdLimitConstClsf(EpuOrdDelVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.epu.ord.deleteEpuOrdLimitConstClsf", vo);
	}
}
