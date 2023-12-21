package kr.re.kitech.biz.sup.tec.service;

import kr.re.kitech.biz.sup.tec.vo.SptRstBookVo;

/**
* 외부기술지원 시험성적서 인터페이스
*/
public interface SupTecRstBookService {
	/**
	* 성적서 계산서 발행시 발행업체와 기술지원요청 업체가 다를 경우 계산서 발행업체 저장
	*/
	public void saveBillIssuInfo(SptRstBookVo vo);
}
