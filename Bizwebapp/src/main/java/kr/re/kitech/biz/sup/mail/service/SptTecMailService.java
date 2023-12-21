package kr.re.kitech.biz.sup.mail.service;

import java.util.List;

import kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo;

public interface SptTecMailService {
	/*
	* 미수수탁정산신청 이메일 발송
	*/
	public void sendSptUnpaidReq(List<SptTecAdjstSlipVo> slipList) throws Exception;
}
