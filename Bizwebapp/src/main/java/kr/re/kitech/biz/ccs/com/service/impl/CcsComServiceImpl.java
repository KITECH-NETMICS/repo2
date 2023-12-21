package kr.re.kitech.biz.ccs.com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.com.dao.CcsComDAO;
import kr.re.kitech.biz.ccs.com.service.CcsComService;
import kr.re.kitech.biz.ccs.com.vo.CwsCommVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 총무보안 공통 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CcsComServiceImpl.java
 * @Description 총무보안 공통 관련  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
@Service("ccsComService")
public class CcsComServiceImpl  extends EgovAbstractServiceImpl implements CcsComService {

    @Resource(name="ccsComDAO")
    private CcsComDAO dao;
	
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
	
	@Override
	public Object selectAuth(Object cwsCommVo) throws KitechException{
		return dao.selectAuth((CwsCommVo)cwsCommVo);
	}
	
	/**
     * 휴가원 증빙자료 결재 저장
     * @param AprVo
     * @throws ElException
     * @author LeeYH
     * @since 2022.09.14.
     */
	public void saveApr(AprVo vo) throws KitechException {		
		apprFuncService.formAccept(vo);
	}
	
	/**
     * 휴가원 증빙자료 반려
     * @param AprScVo
     * @throws ElException
     * @author LeeYH
     * @since 2022.09.14.
     */
	public void saveAprReject(AprScVo vo) throws KitechException {		
		apprFuncService.formReject(vo);
	}
	
	/**
     * 담당자 반려
     * @param AprScVo
     * @throws ElException
     * @author LeeYH
     * @since 2023.03.31.
     */
	public void saveAprAuthReject(AprScVo vo) throws KitechException {	
		vo.setEndpoint("system");
		apprFuncService.formAuthReject(vo);
	}
}
