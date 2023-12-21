/**
 * 
 */
package kr.re.kitech.biz.ass.eqip.service;

import java.util.List;

import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;

/**
 * @author LeeYH-PC
 *
 */
public interface AssResEquipFeeService {
		
	/*
	 * 연구실정장비비집행요청 목록 조회
	 */
	public List<ResEquipFeeReqVo> selectAssResEquipFeeReqList(ResEquipFeeReqVo vo);
	
	/*
	 * 연구실정장비비집행요청 상세 조회
	 */
	public ResEquipFeeReqVo selectAssResEquipFeeReq(ResEquipFeeReqVo vo);
	
	/*
	 * 연구실정장비비집행요청 연구책임자 보유계정 조회
	 */
	public ResEquipFeeReqVo selectResEquipFeeAccnt(ResEquipFeeReqVo vo);
	
	/*
	 * 연구실정장비비집행요청 상세 수정
	 */
	public String saveAssResEquipFeeReq(ResEquipFeeReqVo vo);
	
	/*
	 * 연구실정장비비집행요청 상세 삭제
	 */
	public void deleteAssResEquipFeeReq(ResEquipFeeReqVo vo);
	
	
	/*
	 * 연구실정장비비집행요청 결재신청
	 */
	public void saveAssResEquipFeeReqApr(ResEquipFeeReqVo vo);
}
