package kr.re.kitech.biz.ass.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqVo;
import kr.re.kitech.biz.ass.app.vo.AssMastrVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 자산이동 > 인수인계신청
 * @Class Name : AssAppMoveReqDAO.java
 * @Description : 인수인계신청 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/08   이정호                  최초생성
 * 
 * @author LeeYh
 * @since 2023/07/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("assAppChaReqDAO")
public class AssAppChaReqDAO extends BizDefaultAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<AssAppChaReqVo> selectAssAppChaReqList(AssAppChaReqSrchVo vo) throws KitechException {    	
		return list("kr.re.kitech.biz.ass.app.selectAssAppChaReqList", vo);
	}

	@SuppressWarnings("unchecked")
	public List<AssAppChaReqDetailVo> selectAssAppChaReqDetailList(AssAppChaReqSrchVo vo) throws KitechException {
		// TODO Auto-generated method stub
		return list("kr.re.kitech.biz.ass.app.selectAssAppChaReqDetailList", vo);
	}

	public AssAppChaReqDetailVo selectAssAppChaReqRgstChk(AssAppChaReqDetailVo vo) throws KitechException {
		// TODO Auto-generated method stub
		return (AssAppChaReqDetailVo) selectByPk("kr.re.kitech.biz.ass.app.selectAssAppChaReqRgstChk", vo);
	}

	public AssAppChaReqDetailVo selectAssAppChaReqExstChk(AssAppChaReqDetailVo vo) throws KitechException {
		// TODO Auto-generated method stub
		return (AssAppChaReqDetailVo) selectByPk("kr.re.kitech.biz.ass.app.selectAssAppChaReqExstChk", vo);
	}

	public int insertAssAppChaReq(AssAppChaReqDetailVo vo) throws KitechException {
		// TODO Auto-generated method stub
		return insert("kr.re.kitech.biz.ass.app.insertAssAppChaReq", vo);
	}

	public int updateAssAppChaReq(AssAppChaReqDetailVo vo) throws KitechException {
		// TODO Auto-generated method stub
		return update("kr.re.kitech.biz.ass.app.updateAssAppChaReq", vo);
	}

	public void deleteAssAppChaReq(AssAppChaReqDetailVo vo) throws KitechException {
		delete("kr.re.kitech.biz.ass.app.deleteAssAppChaReq", vo);
	}

	public AssAppChaReqVo selectDeptManager(AssAppChaReqSrchVo vo) throws KitechException {
		return (AssAppChaReqVo) selectByPk("kr.re.kitech.biz.ass.app.selectDeptManager", vo);
	}

	public void updateAssReceiptTransPosi(AssAppChaReqDetailVo vo) throws KitechException {
		update("kr.re.kitech.biz.ass.app.updateAssReceiptTransPosi", vo);
	}
	
	public void updateCntReceptTransProc(AssAppChaReqDetailVo vo) throws KitechException {
		update("kr.re.kitech.biz.ass.app.updateCntReceptTransProc", vo);
	}
	
	/**
     * 자산 사용자 부서 및 관리주체 조회
     * @param String
     * @return String
     * @throws Exception
     */
	public String selectAssMngmtBody(String string) throws KitechException {
		return (String)selectByPk("kr.re.kitech.biz.ass.app.selectAssMngmtBody", string);
	}

	@SuppressWarnings("unchecked")
	public List<AssMastrVo> selectAssetList(AssMastrVo vo) throws KitechException {
		return list("kr.re.kitech.biz.ass.app.selectAssetList", vo);
	}
}
