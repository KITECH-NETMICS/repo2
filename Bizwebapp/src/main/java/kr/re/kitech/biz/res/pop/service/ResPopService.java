package kr.re.kitech.biz.res.pop.service;

import java.util.List;

import kr.re.kitech.biz.res.app.vo.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.res.pop.vo.ResPopSrcVo;

public interface ResPopService {
	/*
     * 사업신청 사업조정회의조회 팝업 
	 */
	public List<ResAppBsnsAdjstVo> selectResAppBsnsAdjst(ResPopSrcVo vo);
}
