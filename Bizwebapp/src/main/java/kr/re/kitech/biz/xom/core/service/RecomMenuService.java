package kr.re.kitech.biz.xom.core.service;

import java.util.List;

import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

public interface RecomMenuService {
	public List<ServiceVo> selectRecommendMenuList() throws KitechException;
}
