package kr.re.kitech.biz.fin.tax.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 인수자산 수익관리
 * @Class Name : FinAcqAsetDAO.java
 * @Description : 인수자산 수익관리 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/19		전재우		최초생성
 * 
 * @author JeonJW
 * @since 2022/09/19
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finAcqAsetDAO")
public class FinAcqAsetDAO extends BizDefaultAbstractDAO {
	/**
     * 인수자산 수익관리 리스트 조회
     * @param FinAcqAsetPlanMstrVo
     * @return List<FinAcqAsetPlanMstrVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FinAcqAsetPlanMstrVo> selectListFinAcqAset(FinAcqAsetPlanMstrVo finAcqAsetPlanMstrVo) throws KitechException{
    	 return list("kr.re.kitech.biz.fin.tax.selectListFinAcqAset", finAcqAsetPlanMstrVo);
    }
    
    /**
     * 인수자산 계획 마스터 조회
     * @param FinAcqAsetPlanMstrVo
     * @return FinAcqAsetPlanMstrVo
     * @throws Exception
     */
    public FinAcqAsetPlanMstrVo selectTaxAcqAset(FinAcqAsetPlanMstrVo finAcqAsetPlanMstrVo) throws KitechException{
    	 return (FinAcqAsetPlanMstrVo)selectByPk("kr.re.kitech.biz.fin.tax.selectTaxAcqAset", finAcqAsetPlanMstrVo);
    }
    
    /**
     * 인수자산 계획 마스터 추가
     * @param FinAcqAsetPlanMstrVo
     * @return int
     * @throws Exception
     */
	public int insertPlanMstr(FinAcqAsetPlanMstrVo planMstrVo) {
		return insert("kr.re.kitech.biz.fin.tax.insertPlanMstr", planMstrVo);
	}
	
	/**
     * 인수자산 계획 디테일 추가
     * @param FinAcqAsetPlanDtlVo
     * @return int
     * @throws Exception
     */
	public int insertPlanDtl(FinAcqAsetPlanDtlVo planDtlVo) {
		return insert("kr.re.kitech.biz.fin.tax.insertPlanDtl", planDtlVo);
	}
	
	/**
     * 인수자산 계획 디테일 조회
     * @param reqNo
     * @return int
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinAcqAsetPlanDtlVo> selectPlanDtlList(String planReqNo) {
		return (List<FinAcqAsetPlanDtlVo>)list("kr.re.kitech.biz.fin.tax.selectPlanDtlList", planReqNo);
	}
	
	/**
     * 인수자산 계획 마스터 삭제
     * @param reqNo
     * @return int
     * @throws Exception
     */
	public int deletePlanMstr(String planReqNo) {
		return delete("kr.re.kitech.biz.fin.tax.deletePlanMstr", planReqNo);
	}
	
	/**
     * 인수자산 계획 디테일 삭제
     * @param reqNo
     * @return int
     * @throws Exception
     */
	public int deletePlanDtl(String planReqNo) {
		return delete("kr.re.kitech.biz.fin.tax.deletePlanDtl", planReqNo);
	}
	
	/**
     * 인수자산 계획 디테일 삭제
     * @param reqNo
     * @return int
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinAcqAsetPlanDtlVo> selectListFinAcqAsetPlan(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		return list("kr.re.kitech.biz.fin.tax.selectListFinAcqAsetPlan", finAcqAsetPlanDtlVo);
	}

	public int updateFtxBillHUnslipNo(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		return update("kr.re.kitech.biz.fin.com.updateFtxBillHUnslipNo", finAcqAsetPlanDtlVo);
	}

	public int updateBillNo(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		return update("kr.re.kitech.biz.fin.tax.updateBillNo", finAcqAsetPlanDtlVo);
	}
	
	public int updateCancelSlip(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		return update("kr.re.kitech.biz.fin.tax.updateCancelSlip", finAcqAsetPlanDtlVo);
	}
}
