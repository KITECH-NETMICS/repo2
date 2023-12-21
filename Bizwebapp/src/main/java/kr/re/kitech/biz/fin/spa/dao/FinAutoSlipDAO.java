package kr.re.kitech.biz.fin.spa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.epu.giv.vo.PurPayReqAccntVo;
import kr.re.kitech.biz.epu.giv.vo.PurPayReqVendVo;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.spa.vo.BblenfrcSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.spa.vo.PurPayReqMastrVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRemtlVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 자동결의 결의생성 DAO
 * @Class Name FinAutoSlipDAO.java
 * @Description 자동결의 결의생성 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/13      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/13
 * @version 1.0
 * @see
 * 
 */
@Repository("finAutoSlipDAO")
public class FinAutoSlipDAO extends BizDefaultAbstractDAO {
	/**
     * 기술료인센티브 결의삭제를 위한 조회
     * @param String reqNo
     * @return List<Map<String,String>>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinSpaSlipUpdVo> selectResCrtPstpIctHDel(String unslipNo) throws ElException{
		return (List<FinSpaSlipUpdVo>)list("kr.re.kitech.biz.fin.spa.selectResCrtPstpIctHDel", unslipNo);
	}
	
	/**
     * 기술료 결의번호업데이트 (생성 또는 삭제시)
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateResCrtPstpIctH(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateResCrtPstpIctH", vo);
	}	
    
    /**
     * 연구비송금결의 삭제를 위한 조회
     * @param String reqNo
     * @return List<FinSpaSlipUpdVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResBgRemtlVo> selectResBgRemtlDel(String reqNo) throws ElException{
    	return (List<ResBgRemtlVo>)list("kr.re.kitech.biz.fin.spa.selectResBgRemtlDel", reqNo);
    }
    
    /**
     * 결의취소시 결의번호 초기화 및 결의금액 업데이트
     * @param String billNo
     * @return int
     * @throws Exception
     */
	public int updateKtxIssuMstrDel(String billNo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateKtxIssuMstrDel", billNo);
	}
	
	/**
     * 결의취소시 송금내역 결의번호 초기화
     * @param ResBgRemtlVo
     * @return int
     * @throws Exception
     */
	public int updateResBgRemtlDel(ResBgRemtlVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateResBgRemtlDel", vo);
	}
    
    /**
     * 결의취소시 집행내역 결의번호 초기화
     * @param ResBgRemtlVo
     * @return int
     * @throws Exception
     */
	public int updateBblenfrcDel(DelBblEnfrcVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateBblenfrcDel", vo);
	}
	
	/**
     * 결의취소시 결의번호로 구매내역 조회
     * @param String unslipNo
     * @return List<PurPayReqMastrVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PurPayReqMastrVo> selectPurPayReqMastrDel(String unslipNo) throws ElException{
		return (List<PurPayReqMastrVo>)list("kr.re.kitech.biz.fin.spa.selectPurPayReqMastrDel", unslipNo);
	}
	
	/**
     * 결의취소시 구매지급계정내역 조회
     * @param String reqNo
     * @return List<PurPayReqAccntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PurPayReqAccntVo> selectPurPayReqAccntDel(String reqNo) throws ElException{
		return (List<PurPayReqAccntVo>)list("kr.re.kitech.biz.fin.spa.selectPurPayReqAccntDel", reqNo);
	}
	
	/**
     * 결의취소시 집행내역 결의번호 초기화
     * @param PurPayReqAccntVo
     * @return int
     * @throws Exception
     */
	public int updateBblenFrcPurSlipDel(PurPayReqAccntVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateBblenFrcPurSlipDel", vo);
	}
	
	/**
     * 결의취소시 구매지급내역 조회
     * @param String reqNo
     * @return List<PurPayReqVendVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PurPayReqVendVo> selectPurPayReqVendDel(String reqNo) throws ElException{
		return (List<PurPayReqVendVo>)list("kr.re.kitech.biz.fin.spa.selectPurPayReqVendDel", reqNo);
	}
	
	/**
     * 구매지급결의시 결의번호, 누적금액 업데이트
     * @param ComReqVo
     * @return int
     * @throws Exception
     */
	public int updatePurPayReqMastrForSlip(ComReqVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updatePurPayReqMastrForSlip", vo);
	}
	
	/**
     * 가지급금신청 반려시 결의번호 초기화
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int updateFspPayAdvcReqDel(String reqNo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcReqDel", reqNo);
	}
	
	/**
     * 가지급금정산 집행내역 초기화를 위한 조회
     * @param String reqNo
     * @return List<ComReqVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ComReqVo> selectFspPayAdvcAdjstAccntDel(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.fin.spa.selectFspPayAdvcAdjstAccntDel", reqNo);
	}
	
	/**
     * 가지급금정산 결의생성 또는 취소시 집행내역 업데이트
     * @param BblenfrcSlipVo
     * @return int
     * @throws Exception
     */
	public int updateBblenFrcForSlip(BblenfrcSlipVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateBblenFrcForSlip", vo);
	}
	
	/**
     * 가지급금정산 결의취소시 가지급정산, 정산예정계정내역, 잔액입금내역, 추가계정 결의번호 초기화
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateFspPayAdvcAdjstDel(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateFspPayAdvcAdjstDel", vo);
	}
	
	/**
     * 내부기술지원신청헤드, 집행내역 초기화
     * @param ComReqVo
     * @return int
     * @throws Exception
     */
	public int updateFspTechSuphDel(ComReqVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateFspTechSuphDel", vo);
	}	
	
	/**
     * 출장비정산결의생성취소(국내출장정산가결의번호UPDATE)
     * @param ComReqVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAdDel(ComReqVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateCtrDomAdDel", vo);
	}
	
	/**
     * 출장비정산결의생성취소(해외출장정산가결의번호UPDATE)
     * @param ComReqVo
     * @return int
     * @throws Exception
     */
	public int updateCtrOverAdDel(ComReqVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateCtrOverAdDel", vo);
	}	
		
	/**
     * 근거리출장 결의생성시 집행내역 업데이트
     * @param FspSlipDVo
     * @return int
     * @throws Exception
     */
	public int updateBblenfrcAutoSlip(FspSlipDVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spa.updateBblenfrcAutoSlip", vo);
	}
}
