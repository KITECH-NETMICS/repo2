package kr.re.kitech.biz.kbk.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcBookPurMntSrcVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpyInpVo;
import kr.re.kitech.biz.kbk.etc.vo.EtcOrgPprCpySrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("etcDAO")
public class EtcDAO extends BizDefaultAbstractDAO {
	
	/**
     * 도서구입관리 조회
     * @param EtcBookPurMntInpVo
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<EtcBookPurMntSrcVo> selectEtcBookPurMnt(EtcBookPurMntInpVo etcBookPurMntInpVo) throws Exception {
        return list("kr.re.kitech.biz.kbk.etc.selectEtcBookPurMnt", etcBookPurMntInpVo);
    }
    
    /**
     * 원문복사관리 조회
     * @param EtcOrgPprCpyInpVo
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<EtcOrgPprCpySrcVo> selectEtcOrgPprCpyMnt(EtcOrgPprCpyInpVo etcOrgPprCpyInpVo) throws Exception {
        return list("kr.re.kitech.biz.kbk.etc.selectEtcOrgPprCpyMnt", etcOrgPprCpyInpVo);
    }
    
	/**
     * 전자정보관리 조회
     * @param EtcOutUrlVo
     * @return List
     * @throws Exception소
     */
	@SuppressWarnings("unchecked")
	public List<EtcOutUrlVo> selectOutUrl(EtcOutUrlVo vo) throws Exception {
        return list("kr.re.kitech.biz.kbk.etc.selectOutUrl", vo);
    }
}