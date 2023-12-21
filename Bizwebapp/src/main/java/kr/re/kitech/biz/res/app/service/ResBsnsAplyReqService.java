package kr.re.kitech.biz.res.app.service;

import java.util.List;

import kr.re.kitech.biz.res.app.vo.ResAppBsnsAppRetVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsReqVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsThreeFiveVo;
import kr.re.kitech.biz.res.app.vo.ResAppBugtVo;
import kr.re.kitech.biz.res.app.vo.ResAppMastVo;
import kr.re.kitech.biz.res.app.vo.ResAppPareVo;
import kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo;
import kr.re.kitech.biz.res.app.vo.ResAppSrcVo;
import kr.re.kitech.biz.res.app.vo.ResBsnsReqEtcVo;
import kr.re.kitech.biz.res.app.vo.ResPareMngmtMstrVo;

/**
 * @author 홍성민
 * 사업신청 인터페이스
 */
public interface ResBsnsAplyReqService {
	/**
	 * 사업 신청 목록(사용자) 조회
	 */
	public List<ResAppBsnsReqVo> selectBsnsAppUserList(ResAppSrcVo vo);
	/**
	 * 사업 신청 디테일 조회
	 */
	public ResAppBsnsAppRetVo selectBsnsApp(ResAppSrcVo vo);
	/**
	 * 사업 신청 연구비 템플릿 조회
	 */
	public List<ResAppBugtVo> selectBugtTemplate(ResAppSrcVo vo);
	/**
	 * 사업 신청 간접비 비율 및 연구원 구분 조회
	 */
	public ResBsnsReqEtcVo selectAppIndrc(ResBsnsReqEtcVo vo);
	/**
	 * 사전 사업 내역 조회
	 */
	public List<ResAppPrePrjVo> selectResAppPrePrjList(ResAppPrePrjVo vo);
	/**
	 * 사업신청전 참여연구원 사전등록 목록 조회
	 */
	public List<ResPareMngmtMstrVo> selectResPareMngmtMstrList(ResPareMngmtMstrVo vo);
	/**
	 * 사업신청 참여연구원 조회
	 */
	public List<ResAppPareVo> selectResAppPareList(ResPareMngmtMstrVo vo);
	/**
	 * 3책5공 제외사업기준 조회
	 */
	public List<ResAppBsnsThreeFiveVo> selectBsnsAplyThreeFive(ResAppBsnsThreeFiveVo vo);
	/**
	 * 사업 신청 목록(관리자) 조회
	 */
	public List<ResAppBsnsReqVo> selectBsnsAppList(ResAppSrcVo vo);
	/**
	 * 사업 신청 저장
	 */
	public String saveResBsnsAplyReq(ResAppBsnsAppRetVo vo) throws Exception;
	
	/**
	 * 사업 신청 선정결과 저장
	 */
	public String saveBsnsAplySeltRst(ResAppMastVo vo);
	
	/**
	 * 사업 신청 삭제
	 */
	public void deleteResBsnsReq(ResAppSrcVo vo);
}
