/**
 * 
 */
package kr.re.kitech.biz.ass.eqip.service;

import java.util.List;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.ass.eqip.vo.AssEquipSrcVo;
import kr.re.kitech.biz.ass.eqip.vo.AssSearchVo;
import kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo;
import kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo;

/**
 * @author mklee
 *
 */
public interface AssResEquipMgtService {
	
	/*
	 * 제우스장비번호 검색(외부장비)
	 */
	public NtisRegNoVo selectNtisRegNo(AssSearchVo vo);
	
	/*
	 * 제우스장비번호 검색(내부장비)
	 */
	public List<NtisRegNoVo> selectNtisRegNoList(AssSearchVo vo);
	
	/*
	 * 연구관리통합관리비 한도금액 업데이트
	 */
	public void updateResEquipFeeMgt(ApiBpmVo vo);
	
	/*
	 * 연구관리통합관리비 한도금액 조회
	 */
	public ResEquipFeeReqVo selectResEquipFeeMgt(ApiBpmVo vo);
	
	/*
	 * 연구관리통합관리비 기타예실 한도금액 추가
	 */
	public void updateBblBugtActRsltEtc(ResEquipFeeReqVo vo);
	
	/*
	 * 연구장비비 통합관리 한도금액 조회
	 */
	public List<ResEquipLimitAmtVo> selectResEquipLimitAmt(ResEquipLimitAmtVo vo);
	/*
	 * 통합관리계정 변경이력 목록 조회
	 */
	public List<ResBgAcctmHisVo> selectResBgAcctmHis(AssEquipSrcVo vo);
	/*
	* 통합관리계정 변경이력 저장
	*/
	public void saveAssIntgrAccntInfo(List<ResBgAcctmHisVo> hisList);
	/*
	* 통합관리계정 변경이력 단건 저장
	*/
	public void saveResBgAcctmHis(ResBgAcctmHisVo vo, boolean finYn);

	
}
