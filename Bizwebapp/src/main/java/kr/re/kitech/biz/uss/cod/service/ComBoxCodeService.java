package kr.re.kitech.biz.uss.cod.service;

import java.util.List;

import kr.re.kitech.biz.uss.cod.vo.ComBoxCodeVo;
import kr.re.kitech.biz.uss.cod.vo.ComBoxSrcVo;

public interface ComBoxCodeService {
	/*
	* selectBox 코드 조회
	*/
	public List<ComBoxCodeVo> selectComBoxCode(ComBoxSrcVo vo);
}
