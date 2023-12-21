package kr.re.kitech.biz.ass.app.service;

import java.util.List;

import kr.re.kitech.biz.ass.app.vo.AssMastrBVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseListVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseSrcVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;

public interface AssAppUnUseService {
	/*
	* 불용신청 상세조회
	*/
	public List<AssUnUseVo> selectAssUnUseList(AssUnUseVo vo);
	/*
	* 불용신청 목록조회
	*/
	public List<AssUnUseVo> selectListAssUnUseList(AssUnUseSrcVo vo);
	/*
	* 불용신청 자산목록조회
	*/
	public List<AssMastrBVo> selectAssUnUseCList(AssMastrBVo vo);
	/*
	* 불용신청 저장
	*/
	public String saveAsetUnUse(AssUnUseListVo vo) throws Exception;
	
	/*
	* 불용신청 삭제
	*/
	public void deleteAsetUnUse(AssUnUseVo vo);
	
	/*
	* 불용신청 상세내역 조회
	*/
	public AssUnUseDetailVo selectAssUnUseDtl(AssUnUseDetailVo vo);
	
	/*
	* 불용신청 상세내역 저장
	*/
	public void updateAsetUnUseDtl(AssUnUseListVo vo) throws Exception;
	
	/*
	 * 신청구분 수정 (불용 -> 환원)
	 */
	public void updateRstrt(AssUnUseVo vo);
}
