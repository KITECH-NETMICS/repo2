package kr.re.kitech.biz.res.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.res.pop.dao.ResPopDAO;
import kr.re.kitech.biz.res.pop.service.ResPopService;
import kr.re.kitech.biz.res.pop.vo.ResPopSrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 연구관리 팝업
 * @Class Name : ResPopServiceImpl.java
 * @Description : 연구관리 팝업 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/12   이영희                최초생성
 * 
 * @author 이영희
 * @since 2023/01/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */ 
@Service("resPopService")
public class ResPopServiceImpl extends EgovAbstractServiceImpl implements ResPopService {
	@Resource(name="resPopDAO")
	private ResPopDAO dao;
	
	/**
     * 사업신청 사업조정회의조회 팝업 
     * @param ResPopSrcVo
     * @return List<ResAppBsnsAdjstVo>
     * @throws KitechException
     * @author LeeYoungHee
     * @since 2023.01.12.
     */
	public List<ResAppBsnsAdjstVo> selectResAppBsnsAdjst(ResPopSrcVo vo) throws KitechException {
		return dao.selectResAppBsnsAdjst(vo);
	}
}
