package kr.re.kitech.biz.sup.tec.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptCardSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원카드결의 DAO
 * @Class Name SptTecCardSlipDAO.java
 * @Description 기술지원카드결의 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/12/04   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/12/04
 * @version 1
 * @see
 * 
 */
@Repository("sptTecCardSlipDAO")
public class SptTecCardSlipDAO extends BizDefaultAbstractDAO {
	/**
     * 카드처리내역 조회 
     * @param SptCardSlipSrcVo
     * @return List<SptTranTableVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTranTableVo> selectSptTranCardPrcs(SptCardSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTranCardPrcs", vo);
	}
	
	/**
     * 카드처리내역 접수번호 수정
     * @param SptTranTableVo
     * @return int
     * @throws Exception
     */
	public int updateSptTranTable(SptTranTableVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTranTable", vo);
	}
	
	/**
     * 기술지원카드 미수(취소)결의생성 조회 
     * @param SptCardSlipSrcVo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecCardSlipVo> selectSptTecCardSlip(SptCardSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecCardSlip", vo);
	}
	
	/**
     * 카드결의 생성 후 결의번호 업데이트
     * @param SptTecCardSlipVo
     * @return int
     * @throws Exception
     */
	public int updateSptTranCardSlipNo(SptTecCardSlipVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTranCardSlipNo", vo);
	}
	
	/**
     * 결의삭제 후 결의번호 초기화 
     * @param SptCardSlipSrcVo
     * @return int
     * @throws Exception
     */
	public int updateSptTranCardSlipDel(SptTecSlipSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTranCardSlipDel", vo);
	}
	
	/**
     * 취소결의시 미수결의내역 조회
     * @param SptTecSlipSrcVo
     * @return List<FspSlipDVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FspSlipDVo> selectSptTecCardMisuSlip(SptTecSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecCardMisuSlip", vo);
	}
	
	/**
     * 취소결의 삭제시 미수결의정보 조회
     * @param String unslipNo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecCardSlipVo> selectSptTranTableMisu(String unslipNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTranTableMisu", unslipNo);
	}
	
	/**
     * 기술지원카드정산결의 조회 
     * @param SptCardSlipSrcVo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecCardSlipVo> selectSptCardAdjstSlip(SptCardSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptCardAdjstSlip", vo);
	}
	
	/**
     * 카드정산결의시 미수 또는 취소결의내역 조회
     * @param SptCardSlipSrcVo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecCardSlipVo> selectSptCardAdjstSlipDetl(SptCardSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptCardAdjstSlipDetl", vo);
	}
	
	/**
     * 정산결의번호 업데이트
     * @param SptTecCardSlipVo
     * @return int
     * @throws Exception
     */
	public int updateSptProvTableUnslipNo(SptTecCardSlipVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptProvTableUnslipNo", vo);
	}
	
	/**
     * 카드정산결의 취소시 결의번호 초기화
     * @param SptCardSlipSrcVo
     * @return int
     * @throws Exception
     */
	public int updateSptProvTableSlipDel(SptTecSlipSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptProvTableSlipDel", vo);
	}
	
	/**
     * 기술지원 카드수수료 결의 목록 조회
     * @param SptCardSlipSrcVo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecCardSlipVo> selectSptTecCardFeeSlip(SptCardSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecCardFeeSlip", vo);
	}
	
	/**
     * 카드수수료결의 취소시 결의번호 초기화
     * @param String unslipNo
     * @return int
     * @throws Exception
     */
	public int updateSptProvFeeSlipDel(String unslipNo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptProvFeeSlipDel", unslipNo);
	}
}
