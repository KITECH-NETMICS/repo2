package kr.re.kitech.biz.xom.core.service;

import java.util.List;
import java.util.Map;

import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.CodeScVo;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

public interface CodeService {
	public List<CodeVo> selectCodesByCdClsf(CodeScVo vo) throws KitechException;
	public Map<String, List<CodeVo>> selectCodesByCdClsfList(List<String> grpCdList, String dataPrefix) throws KitechException;
}
