package kr.re.kitech.biz.fin.std.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.std.dao.FinStdInfDAO;
import kr.re.kitech.biz.fin.std.service.FinStdVendMntService;
import kr.re.kitech.biz.fin.std.vo.XodfVendSaveVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 거래처관리 서비스
 * @Class Name FinStdVendMntServiceImpl.java
 * @Description 거래처관리 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/16   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/16
 * @version 1
 * @see
 * 
 */
@Service("finStdVendMntService")
public class FinStdVendMntServiceImpl extends EgovAbstractServiceImpl implements FinStdVendMntService {
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finStdInfDAO")
	private FinStdInfDAO dao;
	
	/**
     * 거래처정보 저장
     * @param XodfVendSaveVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.19.
     */
	public String saveXodfVend(XodfVendSaveVo vo) throws KitechException{
		XodfVendVo vendVo = vo.getVendVo();
		if(vendVo.getVend_cd() == null || "".equals(vendVo.getVend_cd())){
			vendVo.setVend_cd(genService.getVendCode());
			
			dao.insertXodfVend(vendVo);
		}
		
		return vendVo.getVend_cd();
	}
}
