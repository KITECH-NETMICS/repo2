package kr.re.kitech.biz.kbk.lib.service;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import kr.re.kitech.biz.kbk.lib.vo.LibCopyVo;
import kr.re.kitech.biz.kbk.lib.vo.LibLoanVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface LibService {

	public List<LibCopyVo> selectCopyList(LibCopyVo vo) throws KitechException;
	public List<LibLoanVo> selectLoanList(LibLoanVo vo) throws KitechException;
	public void updateReserv(LibLoanVo vo) throws KitechException;
	public void selectKbkLibMailSend(LinkedList<LinkedHashMap<String, Object>> list) throws KitechException;

}
