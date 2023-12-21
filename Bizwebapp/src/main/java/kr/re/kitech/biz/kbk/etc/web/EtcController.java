package kr.re.kitech.biz.kbk.etc.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.kbk.etc.service.EtcService;
import kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlListVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntSrcVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpyInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpySrcVo;

@Controller
public class EtcController {
	
	@Resource(name="etcService")
	EtcService etcService;
	
	/**
     * 도서구입관리 조회
     * @param EtcBookPurMntInpVo
     * @return List
     * @throws Exception
     */
	@ElService(key = "SvcKBKETCPURL01")
	@RequestMapping(value="SvcKBKETCPURL01")
	@ElDescription(sub = "도서구입관리 조회", desc = "도서구입관리 조회")
	public List<EtcBookPurMntSrcVo> selectEtcBookPurMnt(EtcBookPurMntInpVo etcBookPurMntInpVo) throws Exception {
		return etcService.selectEtcBookPurMnt(etcBookPurMntInpVo);
	}

    /**
     * 원문복사관리 조회
     * @param EtcOrgPprCpyInpVo
     * @return List
     * @throws Exception
     */
	@ElService(key = "SvcKBKETCOPCL01")
	@RequestMapping(value="SvcKBKETCOPCL01")
	@ElDescription(sub = "원문복사관리 조회", desc = "원문복사관리 조회")
	public List<EtcOrgPprCpySrcVo> selectEtcOrgPprCpyMnt(EtcOrgPprCpyInpVo etcOrgPprCpyInpVo) throws Exception {
		return etcService.selectEtcOrgPprCpyMnt(etcOrgPprCpyInpVo);
	}
    
    /**
     * 전자정보관리 조회
     * @param EtcOutUrlVo
     * @return List
     * @throws Exception
     */
    @ElService(key = "SvcKBKETCOURL01")
    @RequestMapping(value="SvcKBKETCOURL01")
    @ElDescription(sub = "전자정보관리 조회", desc = "전자정보관리 조회")
    public EtcOutUrlListVo selectOutUrl(EtcOutUrlVo vo) throws Exception {
    	EtcOutUrlListVo ret = new EtcOutUrlListVo();
    	ret.setEtcOutUrlVoList(etcService.selectOutUrl(vo));
    	
    	return ret;
    }
}