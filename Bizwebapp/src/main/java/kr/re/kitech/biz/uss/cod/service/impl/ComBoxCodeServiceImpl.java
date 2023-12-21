package kr.re.kitech.biz.uss.cod.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.uss.cod.dao.ComBoxCodeDAO;
import kr.re.kitech.biz.uss.cod.service.ComBoxCodeService;
import kr.re.kitech.biz.uss.cod.vo.ComBoxCodeVo;
import kr.re.kitech.biz.uss.cod.vo.ComBoxSrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect selectBox 코드 조회
 * @ClassName  ComBoxCodeServiceImpl.java
 * @Description selectBox 코드 조회 ServiceImpl
 * @Modification :   
 *     수정일           수정자     수정내용
 *  ----------- ------- ---------
 *  2023.09.20.  이영희       최초생성
 * 
 * @author 
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
@Service("comBoxCodeService")
public class ComBoxCodeServiceImpl extends EgovAbstractServiceImpl implements ComBoxCodeService {
	@Resource(name="comBoxCodeDAO")
	private ComBoxCodeDAO dao;
	
	/**
     * selectBox 코드 조회
     * @param ComBoxSrcVo
     * @return List<ComBoxCodeVo>
     * @throws Exception
     */
	@Override
	public List<ComBoxCodeVo> selectComBoxCode(ComBoxSrcVo vo) throws KitechException{
		if("DEPTH".equals(vo.getClsf())){
			return dao.selectDeptHeadQrtr(vo);
		}else if("DIVSN_DEPT".equals(vo.getClsf())){
			return dao.selectDivsnDept(vo);
		}else if("ASS_DEPT".equals(vo.getClsf())){
			return dao.selectAssDeptInfo(vo);
		}else{
			return null;
		}
	}
}
