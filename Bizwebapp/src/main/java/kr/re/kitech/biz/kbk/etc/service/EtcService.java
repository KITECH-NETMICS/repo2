package kr.re.kitech.biz.kbk.etc.service;

import java.util.List;

import kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntSrcVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpyInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpySrcVo;

public interface EtcService {
	public List<EtcBookPurMntSrcVo> selectEtcBookPurMnt(EtcBookPurMntInpVo etcBookPurMntInpVo) throws Exception;
	public List<EtcOrgPprCpySrcVo> selectEtcOrgPprCpyMnt(EtcOrgPprCpyInpVo etcOrgPprCpyInpVo) throws Exception;
	public List<EtcOutUrlVo> selectOutUrl(EtcOutUrlVo vo) throws Exception;
}