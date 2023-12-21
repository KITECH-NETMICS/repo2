/**
 * 
 */
package kr.re.kitech.biz.ass.eqip.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.ass.eqip.vo.AssEquipSrcVo;
import kr.re.kitech.biz.ass.eqip.vo.AssSearchVo;
import kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo;
import kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @author LeeYH-PC
 *
 */
 @Repository("assResEquipDAO")
public class AssResEquipMgtDAO extends BizDefaultAbstractDAO {
	
	
	/**
    * 연구시설장비비집행요청 목록
    * @param ResEquipFeeReqVo"
    * @return List<ResEquipFeeReqVo">
    * @author mklee
    */	
	public ResEquipFeeReqVo selectAssResEquipFeeReq(ResEquipFeeReqVo vo) throws KitechException{
		return (ResEquipFeeReqVo)selectByPk("kr.re.kitech.biz.ass.eqip.selectAssResEquipFeeReq", vo);
	}
	
	/**
    * 연구시설장비비집행요청 상세
    * @param ResEquipFeeReqVo"
    * @return List<ResEquipFeeReqVo">
    * @author mklee
    */
	@SuppressWarnings("unchecked")
	public List<ResEquipFeeReqVo> selectAssResEquipFeeReqList(ResEquipFeeReqVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ass.eqip.selectAssResEquipFeeReqList", vo);
	}
	
	/**
    * 제우스장비번호 검색(내부장비)
    * @param FinPopSearchVo
    * @return List<ResEquipFeeReqVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<NtisRegNoVo> selectNtisRegNoList(AssSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ass.eqip.selectNtisRegNoList", vo);
	}
	
	/**
    * 연구장비통합관리비 한도금액 업데이트
    * @param ApiBpmVo
	* @return int
    * @author JeonJW
    */
	public int updateResEquipFeeMgt(ApiBpmVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ass.eqip.updateResEquipFeeMgt", vo);
	}
	
	/**
    * 연구장비통합관리비 한도금액 조회
    * @param ApiBpmVo
    * @return ResEquipFeeReqVo
    * @author JeonJW
    */
	public ResEquipFeeReqVo selectResEquipFeeMgt(ApiBpmVo vo) throws KitechException{
		return (ResEquipFeeReqVo) selectByPk("kr.re.kitech.biz.ass.eqip.selectResEquipFeeMgt", vo);
	}
	
	/**
    * 연구장비통합관리비 기타예실 한도금액 추가
    * @param ResEquipFeeReqVo
	* @return int
    * @author JeonJW
    */
	public int updateBblBugtActRsltEtc(ResEquipFeeReqVo vo) throws KitechException {
		return update("kr.re.kitech.biz.ass.eqip.updateBblBugtActRsltEtc", vo);
	}
	
	/**
    * 연구장비통합관리비 공동활용시설 계정번호 조회
    * @param ResEquipLimitAmtVo
	* @return ResEquipLimitAmtVo
    * @author JeonJW
    */
	public ResEquipLimitAmtVo selectResbgacctm(ResEquipLimitAmtVo vo) throws KitechException{
		return (ResEquipLimitAmtVo) selectByPk("kr.re.kitech.biz.ass.eqip.selectResbgacctm", vo);
	}
	
	/**
    * 연구장비통합관리비 한도금액 조회
    * @param ResEquipLimitAmtVo
	* @return ResEquipLimitAmtVo
    * @author JeonJW
    */
	public ResEquipLimitAmtVo selectResEquipLimtAmt(ResEquipLimitAmtVo vo) throws KitechException {
		return (ResEquipLimitAmtVo)selectByPk("kr.re.kitech.biz.ass.eqip.selectResEquipLimtAmt", vo);
	}
	
	/**
    * 통합관리계정 변경이력 목록 조회
    * @param AssEquipSrcVo
	* @return List<ResBgAcctmHisVo>
    * @throws Exception
    */
	@SuppressWarnings("unchecked")
	public List<ResBgAcctmHisVo> selectResBgAcctmHis(AssEquipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ass.eqip.selectResBgAcctmHis", vo);
	}
	
	/**
    * 계정번호 변경 이력 저장
    * @param ResBgAcctmHisVo
	* @return int
    * @throws Exception
    */
	public int mergeResBgAcctmHis(ResBgAcctmHisVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ass.eqip.mergeResBgAcctmHis", vo);
	}
	
	/**
    * 통합계정변경이력 수정 후 계정마스터 수정
    * @param ResBgAcctmHisVo
	* @return int
    * @throws Exception
    */
	public int updateResBgAcctmPsn(ResBgAcctmHisVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ass.eqip.updateResBgAcctmPsn", vo);
	}
	
	/**
    * 연구장비비요청 데이터 수정
    * @param ResEquipFeeReqVo
	* @return int
    * @throws Exception
    */
	public int updateAssResEquipFeeReq(ResEquipFeeReqVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ass.eqip.updateAssResEquipFeeReq", vo);
	}
	
	/**
    * 연구장비비요청 데이터 삭제
    * @param ResEquipFeeReqVo
	* @return int
    * @throws Exception
    */
	public void deleteAssResEquipFeeReq(ResEquipFeeReqVo vo) throws KitechException{
		delete("kr.re.kitech.biz.ass.eqip.deleteAssResEquipFeeReq", vo);
	}
	
	/**
    * 연구장비비요청 데이터 등록
    * @param ResEquipFeeReqVo
	* @return int
    * @throws Exception
    */
	public int insertAssResEquipFeeReq(ResEquipFeeReqVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ass.eqip.insertAssResEquipFeeReq", vo);
	}
	
	/**
    * 연구시설장비비 연구책임자 계정 보유 조회
    * @param ResEquipFeeReqVo
	* @return ResEquipFeeReqVo
    * @author mklee
    */
	public ResEquipFeeReqVo selectResEquipFeeAccnt(ResEquipFeeReqVo vo) throws KitechException{
		return (ResEquipFeeReqVo) selectByPk("kr.re.kitech.biz.ass.eqip.selectResEquipFeeAccnt", vo);
	}
	
}
