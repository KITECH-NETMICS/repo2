package kr.re.kitech.biz.ass.app.service;

import java.util.List;

import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqListVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqVo;

public interface AssAppMoveReqService {

	/**
	 * 자산 이동신청 목록 조회
	 */
	public List<AssAppMoveReqVo> selectAssAppMoveReqList(AssAppMoveReqSrchVo vo) throws Exception;

	/**
	 * 자산 이동신청 상세 조회
	 */
	public List<AssAppMoveReqDetailVo> selectAssAppMoveReqDetail(AssAppMoveReqVo vo) throws Exception;

	/**
	 * 자산 이동신청 저장
	 */
	public String saveAssetMove(AssAppMoveReqListVo vo) throws Exception;

	/**
	 * 자산 이동신청서 삭제
	 */
	public void deleteAssMove(AssAppMoveReqDetailVo vo);

	/**
	 * 자산 신청서 삭제
	 */
	public void deleteAssAprInfo(AssAppMoveReqDetailVo vo);

}
