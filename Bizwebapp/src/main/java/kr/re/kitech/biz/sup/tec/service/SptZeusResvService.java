package kr.re.kitech.biz.sup.tec.service;

import kr.re.kitech.biz.sup.tec.vo.SptZeusResvDtlVo;

public interface SptZeusResvService {
	/*
	* 제우스 장비예약 상세 정보 확인
	*/
	public SptZeusResvDtlVo selectZeusResvMng(String resvNo);
	/*
	* 제우스에 상태 및 데이타 전송 로직(상태 : 이용승인, 분석완료, 결제완료, 이용취소)
	*/
	public void sendResrvData(SptZeusResvDtlVo vo) throws Exception;
}
