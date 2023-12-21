package kr.re.kitech.biz.kbk.inv.service;

import java.util.List;

import kr.re.kitech.biz.kbk.inv.vo.InvBookSearchVo;
import kr.re.kitech.biz.kbk.inv.vo.InvBookVo;
import kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface InvBookListService {

	List<InvBookVo> selectBookList(InvBookSearchVo vo) throws KitechException;
	List<InvTransBookVo> selectTransBookList(InvTransBookVo vo) throws KitechException;

}
