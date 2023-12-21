package kr.re.kitech.biz.fin.std.service;

import kr.re.kitech.biz.fin.std.vo.XodfVendSaveVo;

public interface FinStdVendMntService {
	/*
	* 거래처정보 저장
	*/
	public String saveXodfVend(XodfVendSaveVo vo);
}
