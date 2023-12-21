package kr.re.kitech.biz.pat.mnt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo;
import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo;
import kr.re.kitech.biz.pat.app.vo.PatSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 지식재산권 관리 DAO
 * @Class Name PatIprMngmtDAO.java
 * @Description 지식재산권 관리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/27   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/01/27
 * @version 1
 * @see
 * 
 */
@Repository("patIprMngmtDAO")
public class PatIprMngmtDAO extends BizDefaultAbstractDAO{
	/**
     * 지재권 공통발명자 조회
     * @param PatSrcVo
     * @return List<PatCoinvntPsnVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatCoinvntPsnVo> selectPatCoInvntPsnList(PatSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.mnt.selectPatCoInvntPsnList", vo);
	}
	
	/**
     * 지재권 출원인 조회
     * @param PatSrcVo
     * @return List<PatCoSmitappVendVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatCoSmitappVendVo> selectPatCoSmitappVendList(PatSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.mnt.selectPatCoSmitappVendList", vo);
	}
	
	/**
     * 지재권 관련연구과제 조회
     * @param PatSrcVo
     * @return List<PatRelatReschPrjVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatRelatReschPrjVo> selectPatRelatReschPrjList(PatSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.mnt.selectPatRelatReschPrjList", vo);
	}
}
