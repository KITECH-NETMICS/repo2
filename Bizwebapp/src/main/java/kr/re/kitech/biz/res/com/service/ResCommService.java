package kr.re.kitech.biz.res.com.service;

import java.util.List;

import kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthListVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeSearchVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeVo;
import kr.re.kitech.biz.res.com.vo.ResIndTeccVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;
import kr.re.kitech.biz.res.std.vo.XodrResManVo;

public interface ResCommService {
	public ResBsnsCodeDepthListVo selectBsnsCodeDepthList(ResBsnsCodeSearchVo vo);
	public List<ResBsnsCodeVo> selectRbaCodeListNoDepth(ResBsnsCodeSearchVo vo);
	public List<ResBsnsCodeVo> selectXodrBaCodePop(ResBsnsCodeSearchVo vo);
	/*
     * 연구관리담당자 조회
     */
	public XodrResManVo selectXodrResMan(XodrResManVo vo);
	/*
     * 산업기술분류표 대분류 조회
     */
	public List<ResIndTeccVo> selectResIndTeccBigClsf(ResIndTeccVo vo);
	
	/*
     * 산업기술분류표 중분류 조회
     */
	public List<ResIndTeccVo> selectResIndTeccMidClsf(ResIndTeccVo vo);
	
	/*
     * 산업기술분류표 소분류 조회
     */
	public List<ResIndTeccVo> selectResIndTeccSmlClsf(ResIndTeccVo vo);
	
	/*
     * 중분류검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)
     */
	public List<XodxCommstVo> selectXodxCommstMidClsf(XodxCommstVo vo);
	
	/*
     * 코드검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)
     */
	public List<XodxCommstVo> selectXodxCommstMngmt(XodxCommstVo vo);
}
