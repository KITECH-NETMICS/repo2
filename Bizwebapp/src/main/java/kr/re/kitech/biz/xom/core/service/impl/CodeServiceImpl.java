package kr.re.kitech.biz.xom.core.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.CodeRepository;
import kr.re.kitech.biz.xom.core.service.CodeService;
import kr.re.kitech.biz.xom.core.vo.CodeScVo;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

@Service("codeServiceImpl")
public class CodeServiceImpl implements CodeService {

	@Resource(name="codeRepository")
	CodeRepository codeRepository;

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.CodeService#selectCodesByCdClsf(kr.re.kitech.biz.xom.core.vo.CodeScVo)
	 */
	@Override
	public List<CodeVo> selectCodesByCdClsf(CodeScVo vo) throws KitechException {
		return codeRepository.findCodesByUse(vo.getGrpCd());
	}
	
	@Override
	public Map<String, List<CodeVo>> selectCodesByCdClsfList(List<String> grpCdList, String dataPrefix) throws KitechException {
		if (grpCdList == null) {
			return null;
		}
		
		Map<String, List<CodeVo>> retMap = new HashMap<String, List<CodeVo>>();
		
		for (int i = 0; i < grpCdList.size(); i++) {
			String grpCd = grpCdList.get(i);
			if (StringUtils.isBlank(grpCd)) {
				continue;
			}
			
			retMap.put(dataPrefix + grpCd, codeRepository.findCodesByUse(grpCd));
		}
		
		return retMap;
	}
}
