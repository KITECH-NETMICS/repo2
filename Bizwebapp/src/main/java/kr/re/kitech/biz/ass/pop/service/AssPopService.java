package kr.re.kitech.biz.ass.pop.service;

import java.util.List;

import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;

public interface AssPopService {
	/*
	* 자산정보조회(팝업)
	*/
	public List<AssMastrHPopVo> selectAssMastrH(AssMastrHPopVo vo);
}
