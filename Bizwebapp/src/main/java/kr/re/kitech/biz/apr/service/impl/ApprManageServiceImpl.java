package kr.re.kitech.biz.apr.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.dao.ApprManagerDAO;
import kr.re.kitech.biz.apr.service.ApprManageService;
import kr.re.kitech.biz.apr.vo.AprMngVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 관리자 전자결재 처리 ServiceImpl
 * @Class Name ApprManageServiceImpl.java
 * @Description 관리자 전자결재 처리 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/10/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/10/04
 * @version 1.0
 * @see
 * 
 */
@Service("apprManagerService")
public class ApprManageServiceImpl extends EgovAbstractServiceImpl implements ApprManageService {
	@Resource(name="apprManagerDAO")
	private ApprManagerDAO mngDao;

	/**
    * Bpm 삭제
    * @param String name
    * @author LeeYH
    * @since 2022.10.04.
    */
	@Override
	public void removeBpmProcInst(String name) throws KitechException{
		AprMngVo mngVo = new AprMngVo();
		mngVo.setName(name);
		mngDao.updateBpmProcInst(mngVo);
	}
	
	/**
    * Bpm 삭제(구매 통제금액 정리시 호출)
    * @param AprMngVo
    * @author LeeYH
    * @since 2023.02.10.
    */
	public void removeBpmProcInst(AprMngVo vo) throws KitechException{
		mngDao.updateBpmProcInst(vo);
	}
	
	/**
     * Bpm 건수 조회
     * @param String
     * @return int
     * @throws Exception
     * @author LeeYH
     * @since 2023.02.13.
     */
	public int selectBpmProcInstCnt(String name) throws KitechException{
		return mngDao.selectBpmProcInstCnt(name);
	}

}
