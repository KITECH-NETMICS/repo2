package kr.re.kitech.biz.fin.spa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.spa.vo.CtrLocalSlipDVo;
import kr.re.kitech.biz.fin.spa.vo.CtrLocalSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FinAutoSlipCrtVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 근거리출장 결의생성 DAO
 * @Class Name FinLocalTripSlipDAO.java
 * @Description 근거리출장 결의생성 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/03/21      이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/03/21
 * @version 1.0
 * @see
 * 
 */
@Repository("finLocalTripSlipDAO")
public class FinLocalTripSlipDAO extends BizDefaultAbstractDAO{
	/**
     * 근거리 출장 결의생성 목록 조회
     * @param FinSpaSrcVo
     * @return List<CtrLocalSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrLocalSlipVo> selectCtrLocalSlip(FinSpaSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spa.selectCtrLocalSlip", vo);
	}
	
	/**
     * 근거리 출장결의 차변생성을 위한 조회
     * @param FinAutoSlipCrtVo
     * @return List<CtrLocalSlipDVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrLocalSlipDVo> selectCtrLocalSlipDr(FinAutoSlipCrtVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spa.selectCtrLocalSlipDr", vo);
	}
	
	/**
     * 근거리출장 송금내역 생성을 위한 조회
     * @param String
     * @return List<FspSendReqVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FspSendReqVo> selectCtrLocalSendReq(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spa.selectCtrLocalSendReq", reqNo);
	}
	
	/**
     * 근거리출장 결의번호 업데이트
     * @param FspSlipDVo
     * @return int
     * @throws Exception
     */
	public int updateCtrLocalUnslipNo(FspSlipDVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spa.updateCtrLocalUnslipNo", vo);
	}
	
	/**
     * 근거리 출장결의 대변생성을 위한 조회
     * @param FinAutoSlipCrtVo
     * @return List<FspSlipDVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FspSlipDVo> selectCtrLocalSlipCr(FinAutoSlipCrtVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spa.selectCtrLocalSlipCr", vo);
	}
	
	/**
     * 근거리출장 결의취소 후 결의번호 초기화
     * @param String
     * @return
     * @throws Exception
     */
	public int updateCtrLocalSlipDel(String unslipNo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spa.updateCtrLocalSlipDel", unslipNo);
	}
}
