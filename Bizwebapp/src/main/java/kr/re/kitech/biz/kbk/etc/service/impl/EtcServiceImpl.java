package kr.re.kitech.biz.kbk.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.kbk.etc.dao.EtcDAO;
import kr.re.kitech.biz.kbk.etc.service.EtcService;
import kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntSrcVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpyInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpySrcVo;

@Service("etcService")
public class EtcServiceImpl implements EtcService {
	
	@Resource(name="etcDAO")
	EtcDAO etcDAO;
	
	@Override
	public List<EtcBookPurMntSrcVo> selectEtcBookPurMnt(EtcBookPurMntInpVo etcBookPurMntInpVo) throws Exception {
		return etcDAO.selectEtcBookPurMnt(etcBookPurMntInpVo);
	}
	
	@Override
	public List<EtcOrgPprCpySrcVo> selectEtcOrgPprCpyMnt(EtcOrgPprCpyInpVo etcOrgPprCpyInpVo) throws Exception {
		return etcDAO.selectEtcOrgPprCpyMnt(etcOrgPprCpyInpVo);
	}
	
	@Override
	public List<EtcOutUrlVo> selectOutUrl(EtcOutUrlVo vo) throws Exception {
		return etcDAO.selectOutUrl(vo);
	}
}