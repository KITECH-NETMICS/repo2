package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.cgs.dao.CgsCondoMasterDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsCondoMasterService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 콘도기본정보 erviceImpl
 * @Class Name : CgsCondoMasterServiceImpl.java
 * @Description : 콘도기본정보 서비스 구현
 * @Modification :   
 *     수정일        lsh     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Service("cgsCondoMasterServiceImpl")
public class CgsCondoMasterServiceImpl  extends EgovAbstractServiceImpl implements CgsCondoMasterService {
	@Resource(name="cgsCondoMasterDAO")
  	private CgsCondoMasterDAO cgsDAO;
  
  	@Resource(name="generationServiceImpl")
	private GenerationService generationService;
	    
    /**
     * 콘도기본정보 목록 조회
  	 * 
  	 * @author lsh
     * @param CgsCondoMasterVo
     * @return List<CgsCondoMasterVo>
     * @throws KitechException
     * @since 2023.08.30.   
     */
    @Override
    public List<CgsCondoMasterVo> selectList(CgsCondoMasterVo vo) throws KitechException {
        List<CgsCondoMasterVo> list = cgsDAO.selectList(vo);	
        return list;
    }
    
    /**
     * 콘도기본정보 등록
  	 * 
  	 * @author lsh
     * @param CgsCondoMasterVo
     * @return int
     * @throws KitechException
     * @since 2023.08.30.   
     */
    @Override
	public void insertItem(CgsCondoMasterListVo listVo) throws KitechException {
    	for (CgsCondoMasterVo vo : listVo.getCgsCondoMasterVoList()) {
    		if("C".equals(vo.getCud_type())){ // 신규등록일때
    			vo.setCondo_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C59"));
    			
    			// 콘도기본정보 등록
    			cgsDAO.insertItem(vo);
    		}else{ // 수정일때
    			// 콘도기본정보 수정
    			cgsDAO.updateItem(vo);
    		}
		}
	}

    /**
     * 콘도명 셀렉트박스 목록 조회
  	 * 
  	 * @author lsh
     * @param CgsCondoMasterVo
     * @return List<CgsCondoMasterVo>
     * @throws KitechException
     * @since 2023.08.30.   
     */
	@Override
	public List<CgsCondoMasterVo> selectCondoList(CgsCondoMasterVo vo) throws KitechException {
		List<CgsCondoMasterVo> list = cgsDAO.selectCondoList(vo);
		return list;
	}

    /**
     * 지역명 셀렉트박스 목록 조회
  	 * 
  	 * @author lsh
     * @param CgsCondoMasterVo
     * @return List<CgsCondoMasterVo>
     * @throws KitechException
     * @since 2023.08.30.   
     */
	@Override
	public List<CgsCondoMasterVo> selectRegionList(CgsCondoMasterVo vo) throws KitechException {
		List<CgsCondoMasterVo> list = cgsDAO.selectRegionList(vo);
		return list;
	}

}
