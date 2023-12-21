package kr.re.kitech.biz.ccs.csf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.csf.dao.CsfSecrtEduDAO;
import kr.re.kitech.biz.ccs.csf.service.CsfSecrtEduService;
import kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduListVo;
import kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo;


/**
 * @ClassSubJect 
 * @ClassName : CsfSecrtEduServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.27.      author    최초생성
 * 
 * @author 
 * @since 2023.10.27.
 * @version 1.0
 * @see
 * 
 */
@Service("csfSecrtEduServiceImpl")
public class CsfSecrtEduServiceImpl  extends EgovAbstractServiceImpl implements CsfSecrtEduService {
  @Resource(name="csfSecrtEduDAO")
  private CsfSecrtEduDAO csfDAO;

	@Override
	public List<CsfSecrtEduVo> selectCsfSecrtEduList(CsfSecrtEduVo csfVo) {
		List<CsfSecrtEduVo> csfSecrtEduVoList = null;
		if(csfVo.getSearch_div().equals("1")){
			csfSecrtEduVoList = csfDAO.selectCsfSecrtEduList(csfVo);
		}else if(csfVo.getSearch_div().equals("2")){
			csfSecrtEduVoList = csfDAO.selectCsfSecrtEduList_2(csfVo);
		}
		
		return csfSecrtEduVoList;
	}

	@Override
	public List<CsfSecrtEduVo> selectEducTypCdList(CsfSecrtEduVo csfVo) {
		return csfDAO.selectEducTypCdList(csfVo);
	}

	@Override
	public List<CsfSecrtEduVo> selectEducKndCdList(CsfSecrtEduVo csfVo) {
		return csfDAO.selectEducKndCdList(csfVo);
	}

	@Override
	public void insertCsfSecrtEdu(CsfSecrtEduVo csfVo) {
		if(csfVo.getJob_flag().equals("new")){
			csfDAO.insertCsfSecrtEdu(csfVo);
		}else if(csfVo.getJob_flag().equals("update")){
			csfDAO.updateCsfSecrtEdu(csfVo);
		}
	}

	@Override
	public void deleteCsfSecrtEdu(CsfSecrtEduVo csfVo) {
		csfDAO.deleteCsfSecrtEdu(csfVo);
	}

	@Override
	public void insertsCsfSecrtEdu(CsfSecrtEduListVo csfVo) {
		List<CsfSecrtEduVo> csfSecrtEduVoList = csfVo.getCsfSecrtEduVoList();
		for(CsfSecrtEduVo vo : csfSecrtEduVoList){
			csfDAO.insertCsfSecrtEdu(vo);
		}
	}
}
