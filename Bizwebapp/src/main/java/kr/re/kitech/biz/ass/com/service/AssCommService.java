package kr.re.kitech.biz.ass.com.service;

import java.util.List;

import kr.re.kitech.biz.ass.app.vo.AssUnUseSrcVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;
import kr.re.kitech.biz.ass.com.vo.AssCommSrchVo;
import kr.re.kitech.biz.ass.com.vo.AssCommVo;

public interface AssCommService {
	/*
	 * 자산위치별 건물, 층수 검색
	 */
	public List<AssCommVo> selectBuilding(AssCommSrchVo vo);
}
