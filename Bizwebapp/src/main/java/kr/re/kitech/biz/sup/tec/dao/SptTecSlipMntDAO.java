package kr.re.kitech.biz.sup.tec.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.FinDepstSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.sup.tec.vo.ResAdxReqmVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원결의생성 DAO
 * @Class Name SptTecSlipMntDAO.java
 * @Description 기술지원결의생성 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/02   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/02
 * @version 1
 * @see
 * 
 */
@Repository("sptTecSlipMntDAO")
public class SptTecSlipMntDAO extends BizDefaultAbstractDAO {
	/**
     * 기술지원결의생성(기술지원)
     * @param SptTecSrcVo
     * @return List<SptTecSlipMntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecSlipMntVo> selectFcpDepstReqSlip(SptTecSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectFcpDepstReqSlip", vo);
	}
	
	/**
     * 기술지원결의생성(바우처)
     * @param SptTecSrcVo
     * @return List<SptTecSlipMntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecSlipMntVo> selectSptTecRcptInfoVcr(SptTecSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecRcptInfoVcr", vo);
	}
	
	/**
     * 기술지원결의생성(성적서)
     * @param SptTecSrcVo
     * @return List<SptTecSlipMntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecSlipMntVo> selectFcpDepstReqRst(SptTecSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectFcpDepstReqRst", vo);
	}
	
	/**
     * 결의생성 헤더 적요조회
     * @param String taxBillNo
     * @return String
     * @throws Exception
     */
	public String selectFtxBilldRmk(String taxBillNo) throws KitechException{
		return (String)selectByPk("kr.re.kitech.biz.sup.tec.selectFtxBilldRmk", taxBillNo);
	}
	
	/**
     * 경상비지원 계정조회
     * @param ResAdxReqmVo
     * @return ResAdxReqmVo
     * @throws Exception
     */
	public ResAdxReqmVo selectResAdxReqm(ResAdxReqmVo vo) throws KitechException{
		return (ResAdxReqmVo)selectByPk("kr.re.kitech.biz.sup.tec.selectResAdxReqm", vo);
	}
	
	/**
     * 성적서재발행 결의번호 업데이트
     * @param SptTecSlipMntVo
     * @return int
     * @throws Exception
     */
	public int updateSptRstBookUnslipNo(SptTecSlipMntVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptRstBookUnslipNo", vo);
	}
	
	/**
     * 바우처, 카드결의 결의번호 업데이트
     * @param SptTecSlipMntVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoUnslipNoVcr(SptTecSlipMntVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoUnslipNoVcr", vo);
	}
	
	/**
     * 기술지원 결의번호 업데이트
     * @param SptTecSlipMntVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoUnslipNo(SptTecSlipMntVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoUnslipNo", vo);
	}
	
	/**
     * 통합프로세스 처리를 위한 의뢰번호 조회
     * @param String unslipNo
     * @return List<String>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<String> selectTechSuptReqNoByBill(String unslipNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectTechSuptReqNoByBill", unslipNo);
	}
	
	/**
     * 기술지원결의 대변생성을 위한 조회
     * @param String unslipNo
     * @return List<SptTecSlipMntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecSlipMntVo> selectFcpDepstReqForSlipCr(String unslipNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectFcpDepstReqForSlipCr", unslipNo);
	}
	
	/**
     * 결의취소로 인한 기술지원접수 결의번호 초기화 
     * @param SptTecSlipSrcVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoSlipDel(SptTecSlipSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoSlipDel", vo);
	}
	
	/**
     * 결의취소로 인한 성적서 결의번호 초기화 
     * @param SptTecSlipSrcVo
     * @return int
     * @throws Exception
     */
	public int updateSptRstBookSlipDel(SptTecSlipSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptRstBookSlipDel", vo);
	}	
	
	/**
     * 청구결의 후 미수정산내역 입력
     * @param SptTecSlipMntVo
     * @return int
     * @throws Exception
     */
	public int insertFinUnPaidAdjst(SptTecSlipMntVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertFinUnPaidAdjst", vo);
	}
	
	/**
     * 미수정산 내역 삭제
     * @param String unslipNo
     * @return int
     * @throws Exception
     */
	public int deleteFinUnpaidAdjst(String unslipNo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tec.deleteFinUnpaidAdjst", unslipNo);
	}
	
	/**
     * 미수수탁 정산결의 목록 조회
     * @param SptTecSlipSrcVo
     * @return List<SptTecAdjstSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecAdjstSlipVo> selectFinUnPaidAdjst(SptTecSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectFinUnPaidAdjst", vo);
	}
	
	/**
     * 미수수탁정산 차변저장을 위한 조회
     * @param String depstMngmtNo
     * @return List<FinDepstSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinDepstSlipVo> selectSptTecRcptDepstForDr(String depstMngmtNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecRcptDepstForDr", depstMngmtNo);
	}
	
	/**
     * 미수수탁 정산결의 생성 후 결의번호 업데이트
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateFinUnpaidAdjstSlipNo(FinSpaSlipUpdVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateFinUnpaidAdjstSlipNo", vo);
	}
	
	/**
     * 결의삭제시 미수정산 결의번호 초기화
     * @param SptTecSlipSrcVo
     * @return int
     * @throws Exception
     */
	public int updateFinUnpaidAdjstSlipDel(SptTecSlipSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateFinUnpaidAdjstSlipDel", vo);
	}	
	
	public int insertSptTecRcpddepstTemp(SptTecSlipSrcVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptTecRcpddepstTemp", vo);
	}
	
	public int insertSptTecRcpddepstTemp2(SptTecSlipSrcVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptTecRcpddepstTemp2", vo);
	}
}
