package kr.re.kitech.biz.sup.tlt.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstInfoVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstSaveVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstSrcVo;

/**  
 * @ClassSubJect 기업부담금입금의뢰 Service
 * @Class Name SptTltDepstInfoService.java
 * @Description 기업부담금입금의뢰 관련 처리를 담당하는 Service
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/22   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/22
 * @version 1
 * @see
 * 
 */
public interface SptTltDepstInfoService {
	/**
	 * 기업부담금관리 목록
	 */
	public List<SptTltDepstInfoVo> selectSptTltDepstInfoList(SptTltDepstSrcVo vo);
	/**
	 * 기업부담금 입금예정관리  조회
	 */
	public SptTltDepstSaveVo selectSptTltDepstInfoDetail(SptTltDepstSrcVo vo);
	/**
	* 기업부담금 입금예정관리 - 업체조회
	*/
	public SptTltDepstInfoVo selectSptCustBaseInfo(String custNo);
	/**
	 * 기업지원연구직 콤보박스
	 */
	public List<SptTltDepstItemVo> selectSptDisPatchPrCond(String mngmtNo);
	/**
	 * 기업부담금 입금예정관리 저장
	 */
	public String saveSptTltDepstInfo(SptTltDepstSaveVo vo);
	/**
	 * 기업부담금 입금예정관리 삭제
	 */
	public void deleteSptTltDepstInfo(SptTltDepstSrcVo vo);
	/**
	 * 기업부담금 입금의뢰 저장
	 */
	public String saveSptTltDepstReq(List<FcpDepstReqVo> depstList);
	
	/**
	 * 기업부담금 입금의뢰 삭제
	 */
	public void deleteSptTltDepstReq(List<FcpDepstReqVo> depstList);
	
	/**
	 * 기업부담금 입금의뢰 결재신청
	 */
	public void approvalSptTltDepstReq(SptTltDepstInfoVo vo);
}
