package kr.re.kitech.biz.sup.cus.service;

import java.util.List;

import kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoMntVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustSrcVo;

public interface SptCustInfoRegService {
	/*
	* 고객정보 저장
	*/
	public String saveSptCustBaseInfo(SptCustBaseInfoVo vo);
	/*
	* 기술지원내역등록 고객정보조회
	*/
	public SptCustBaseInfoVo selectSptCustBaseInfo(SptCustSrcVo vo);
	/*
	* 기업정보관리 조회
	*/
	public List<SptCustBaseInfoMntVo> selectSptCustBaseInfoList(SptCustSrcVo vo);
}
