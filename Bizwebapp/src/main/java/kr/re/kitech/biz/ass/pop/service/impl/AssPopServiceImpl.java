package kr.re.kitech.biz.ass.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ass.pop.dao.AssPopDAO;
import kr.re.kitech.biz.ass.pop.service.AssPopService;
import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 자산관리 팝업 ServiceImpl
 * @Class Name AssPopServiceImpl.java
 * @Description 자산관리 팝업 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/14   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/14
 * @version 1
 * @see
 * 
 */
@Service("assPopService")
public class AssPopServiceImpl extends EgovAbstractServiceImpl implements AssPopService {
	@Resource(name="assPopDAO")
	private AssPopDAO dao;
	
	/**
     * 자산정보조회(팝업)
     * @param AssMastrHPopVo
     * @return List<AssMastrHPopVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.14.
     */
	@Override
	public List<AssMastrHPopVo> selectAssMastrH(AssMastrHPopVo vo) throws KitechException{
		return dao.selectAssMastrH(vo);
	}

}
