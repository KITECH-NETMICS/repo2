package kr.re.kitech.biz.fin.com.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.spm.vo.FspEvidAttchListVo;

/**
 * 전자증빙 인터페이스
 *
 */
public interface FinComAttachService {
	/**
    * 전자증빙조회
    */
	public List<FspEvidAttachVo> selectFbaExpnsEvidList(FbaExpnsEvidVo vo);
	/**
    * 전자증빙조회
    */
	public List<FspEvidAttachVo> selectFbaExpnsEvidList(String docId, String autoYn);
	
	/**
    * 전자증빙팝업에서 저장 호출
    */
	public String saveFspEvidAttachPop(FspEvidAttchListVo voList);
	
	/**
    * 전자증빙 삭제
    */
	public void deleteFspAttchEvid(FbaExpnsEvidVo vo);
	/**
    * 전자증빙 삭제
    */
	public void deleteFspAttchEvid(String reqNo);
	/**
    * 전자증빙 삭제(크리스피드 호출시)
    */
	public void deleteFspAttchEvid(String reqNo, String rqstNo);
	
	/**
    * 전자증빙저장
    */
	public String saveFspEvidAttach(List<FspEvidAttachVo> voList);
	
	/**
    * 결의생성 또는 삭제시 결의번호 업데이트
    */
	public void updateFspEvidAttach(FinSpaSlipUpdVo vo);
	/**
    * 결의생성시 결의번호 업데이트
    */
	public void updateFspEvidAttachUnslipNo(String reqNo, String unslipNo, int unslipOdr);
	/**
    * 결의삭제시 결의번호 업데이트
    */
	public void updateFspEvidAttachUnslipNoDel(String reqNo, String unslipNo, String rqstNo);
	
	/**
    * 전자증빙 기준데이터 삭제 또는 처리(크리스피드)
    */
	public void executeProcess(EvidAttachVo vo);
}
