package kr.re.kitech.biz.epu.req.service;

import java.util.List;

import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo;
import kr.re.kitech.biz.epu.req.vo.PurReqInfoVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrMngVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrVo;
import kr.re.kitech.biz.epu.req.vo.PurSrcVo;

/**
 * @author LeeYH-PC
 * 구매요구관리 인터페이스
 */
public interface PurDomReqService {
	/**
	 * 구매요구관리 조회
	 */
	public List<PurReqMastrMngVo> selectPurReqMastrList(PurSrcVo vo);
	
	/**
	 * 내자구매요구 조회
	 */
	public PurReqInfoVo selectPurReqDomInfo(PurSrcVo vo);
	
	/**
	 * 특정구매사유서 저장
	 */
	public String savePurReqSpcfic(PurReqSpcficVo vo) throws Exception;
	
	/**
	 * 구매요구 저장
	 */
	public String savePurReqInfo(PurReqInfoVo vo) throws Exception;
	
	/**
	 * 구매요구 삭제
	 */
	public void deletePurReqInfo(PurSrcVo vo);
	
	/**
	 * 계속연차확인서 저장
	 */
	public void savePurContAnnlReq(PurContAnnlReqVo vo) throws Exception;
	
	/**
	 * 계속연차확인서 삭제
	 */
	public void deletePurContAnnlReq(PurContAnnlReqVo vo);
	
	/**
	 * 특정물품구매사유서 삭제
	 */
	public void deletePurReqSpcfic(PurSrcVo vo);
	/**
	 * 사전안전성검토 구매번호(소액물품검수번호) 업데이트
	 */
	public void updateSfcChmclsSafeDcdfprInfo(String reqNo, String purReqNo);
	/**
	 * 사전안전성검토 구매번호(소액물품검수번호) 초기화
	 */
	public void updateSfcChmclsSafeDcdfprInfoDel(String purReqNo);
	/**
	 * 결재 후 담당자 저장
	 */
	public void updatePurReqMastrPostApr(PurReqMastrVo vo);
}
