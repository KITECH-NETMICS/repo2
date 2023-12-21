package kr.re.kitech.biz.sup.com.service;

import java.util.List;

import kr.re.kitech.biz.sup.com.vo.SptComCodeVo;

public interface SptComService {
	/*
	* 기술지원 공통코드 조회
	*/
	public List<SptComCodeVo> selectSptComCode(SptComCodeVo vo);
}
