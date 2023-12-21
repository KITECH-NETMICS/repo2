package kr.re.kitech.biz.res.exc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.res.com.vo.ResDepstAccntVo;
import kr.re.kitech.biz.res.exc.vo.ResDemndSlipVo;
import kr.re.kitech.biz.res.exc.vo.ResRepaySlipVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 입금의뢰 및 입금결의(연구비,기술료,기업지원)
 * @Class Name ResDepstReqDAO.java
 * @Description 입금의뢰 결의생성 DAO
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
@Repository("resDepstReqDAO")
public class ResDepstReqDAO extends BizDefaultAbstractDAO{	
	/**
     * 연구비입금의뢰 또는 결재완료 후 결의번호 및 입금상태 업데이트
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateResBgRectlDepstState(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.exc.updateResBgRectlDepstState", vo);
	}
	
	/**
     * 연구비청구결의취소 시 결의번호 초기화
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateResDemndReqDel(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.exc.updateResDemndReqDel", vo);
	}
	
	/**
     * 기술료입금결의취소 시 결의번호 초기화
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateResCrtPsRectlDel(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.exc.updateResCrtPsRectlDel", vo);
	}  
    	
	/**
     * 입금구분 조회
     * @param String unslipNo
     * @return String
     * @throws Exception
     */
	public String selectDepstClsf(String unslipNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.res.exc.selectDepstClsf", unslipNo);
	}
	
	/**
     * 기업부담금 결의번호 초기화
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateSptTltDepstDetlsDel(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.exc.updateSptTltDepstDetlsDel", vo);
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
	
	/**
     * 결의생성후 청구의뢰 결의번호 업데이트
     * @param ResDemndReqVo
     * @return int
     * @throws Exception
     */
	 public int updateResDemndReqUnslipNo(ResDemndSlipVo vo) throws ElException{
		 return update("kr.re.kitech.biz.res.exc.updateResDemndReqUnslipNo", vo);
	 }
	 
	 /**
     * 연구비 입금관리 대변 회계코드 조회
     * @param ResDepstAccntVo
     * @return String
     * @throws Exception
     */
    public String selectDepstMntAccntCd(ResDepstAccntVo vo) throws KitechException{
    	return (String)selectByPk("kr.re.kitech.biz.res.com.selectDepstMntAccntCd", vo);
    }
    
    /**
     * 연구비 미수반제 결의생성(대변)을 위한 조회
     * @param String
     * @return List<FcpDepstReqVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResRepaySlipVo> selectResDemndForRepaySlip(String reqNo) throws KitechException{
    	return list("kr.re.kitech.biz.res.exc.selectResDemndForRepaySlip", reqNo);
    }
    
    /**
     * 연구비 입금결의 대변생성을 위한 조회
     * @param String
     * @return List<FcpDepstReqVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FcpDepstReqVo> selectFcpDepstReqForSlip(String reqNo) throws KitechException{
    	return list("kr.re.kitech.biz.res.exc.selectFcpDepstReqForSlip", reqNo);
    }    
}
