package kr.re.kitech.biz.kbk.inv.service;

import java.util.List;

import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface InvAccntBookListService {

	List<InvAccntBookVo> selectBookList1(InvAccntBookVo vo) throws KitechException;
	List<InvAccntBookVo> selectBookList2(InvAccntBookVo vo) throws KitechException;

}
