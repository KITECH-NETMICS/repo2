package kr.re.kitech.biz.apr.service;

import java.util.List;

import org.w3c.dom.Document;

import kr.re.kitech.biz.apr.vo.BugtCtrlInfoVo;
import kr.re.kitech.biz.apr.vo.BugtCtrlSrcVo;

/**
 * 예산통제 인터페이스
 * @author LeeYH-PC
 * @since 2022.08.25.
 */
public interface AprBugtCtrlService {
	/**
	 * 예산통제자 결재목록 조회
	 */
	public List<BugtCtrlInfoVo> selectBblEnfrcCtrlList(BugtCtrlSrcVo vo);
	
	/**
	 * 스냅샷 수정
	 */
	public Document getSnapShotDoc(String reqNo);
	
	/**
	 * 예산통제자 승인/반려
	 */
	public void updateDecsnReject(String reqNo, String aprYn);
}
