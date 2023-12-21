package kr.re.kitech.biz.sup.pop.service;

import java.util.List;

import kr.re.kitech.biz.sup.pop.vo.EasyPayInfoVo;
import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;

public interface SptTecPopService {
	/*
	* 카드처리내역 팝업 조회(외부기술지원(유상))
	*/
	public List<SptTranTableVo> selectSptTranTable(SptTranTableVo vo);
	/*
	* SMS결제 팝업 조회
	*/
	public EasyPayInfoVo selectEasyPayInfoPop(SptTecSrcVo vo);
}
