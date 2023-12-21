package kr.re.kitech.biz.sup.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.sup.com.dao.SptComDAO;
import kr.re.kitech.biz.sup.com.service.SptComService;
import kr.re.kitech.biz.sup.com.vo.SptComCodeVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**  
 * @ClassSubJect 기술지원공통처리 DAO
 * @Class Name SptComDAO.java
 * @Description 기술지원공통 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/04   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/08/04
 * @version 1
 * @see
 * 
 */
@Service("sptComService")
public class SptComServiceImpl extends EgovAbstractServiceImpl implements SptComService {
	@Resource(name="sptComDAO")
	private SptComDAO dao;
	
	/**
     * 기술지원 공통코드 조회
     * @param SptComCodeVo
     * @return List<SptComCodeVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.04.
     */
	@Override
	public List<SptComCodeVo> selectSptComCode(SptComCodeVo vo) throws KitechException{
		return dao.selectSptComCode(vo);
	}

}
