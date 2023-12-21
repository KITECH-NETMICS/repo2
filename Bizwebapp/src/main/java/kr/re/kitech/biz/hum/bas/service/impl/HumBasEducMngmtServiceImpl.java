package kr.re.kitech.biz.hum.bas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.hum.bas.dao.HumBasEducMngmtDAO;
import kr.re.kitech.biz.hum.bas.service.HumBasEducMngmtService;
import kr.re.kitech.biz.hum.bas.vo.HumBasComCdListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo;
import kr.re.kitech.biz.hum.bas.vo.HumOccutypCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumPosiCdVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : HumBasEducMngmtServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Service("humBasEducMngmtServiceImpl")
public class HumBasEducMngmtServiceImpl  extends EgovAbstractServiceImpl implements HumBasEducMngmtService {
  @Resource(name="humBasEducMngmtDAO")
  private HumBasEducMngmtDAO basDAO;

  /**
   * 교육훈련통합 조회
   * 
   * @author 
   * @param 
   * @return List<HumBasEducMngmtVo>
   * @throws KitechException
   * @since 2023.09.13.   
   */
    @Override
	public List<HumBasEducMngmtVo> selectEducMngmtList(HumBasEducMngmtVo basVo) {
		return basDAO.selectEducMngmtList(basVo);
	}

  /**
   * 직종코드 조회
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return List<HumOccutypCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@Override
	public List<HumOccutypCdVo> selectHumOccutypCdList(HumBasEducMngmtVo basVo) {
		return basDAO.selectHumOccutypCdList(basVo);
	}
	
  /**
   * 직급코드 조회
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return List<HumPosiCdListVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@Override
	public List<HumPosiCdVo> selectHumPosiCdList(HumBasEducMngmtVo basVo) {
		return basDAO.selectHumPosiCdList(basVo);
	}

  /**
   * 교육훈련 조회
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@Override
	public List<HumBasComCdVo> selectHumComCdList(HumBasComCdVo basVo) {
		return basDAO.selectHumComCdList(basVo);
	}

  /**
   * 교육훈련 코드저장
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@Override
	public void selectHumComCdSave(HumBasComCdListVo basVo) {
		List<HumBasComCdVo> basComCdList = basVo.getBasComCdList();
    	for(HumBasComCdVo vo : basComCdList){    		
    		//vo.setRegst_syspayno(basVo.getCom);
    		//vo.setUpdt_syspayno(updt_syspayno);
    		if("C".equals(vo.getCud_type())){
    			basDAO.insertHumComCd(vo);
    		}else if("U".equals(vo.getCud_type())){
    			basDAO.updateHumComCd(vo);
    		}else if("D".equals(vo.getCud_type())){
    			basDAO.deleteHumComCd(vo);
    		}
    	}
	}

  /**
   * 교육구분, 교육명 비교
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@Override
	public List<HumBasEducMngmtVo> selectHumCmpCdInfo(HumBasEducMngmtVo basVo) {
		return basDAO.selectHumCmpCdInfo(basVo);
	}

  /**
   * 교육훈련 내역 저장
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.26.
   */
	@Override
	public void saveEducMngmtInfo(HumBasEducMngmtListVo basVo) {
		List<HumBasEducMngmtVo> basEducMngmtList = basVo.getBasEducMngmtList();
    	for(HumBasEducMngmtVo vo : basEducMngmtList){    		
    		if("C".equals(vo.getCud_type().trim())){
    			basDAO.insertEducMngmt(vo);
    		}else if("U".equals(vo.getCud_type().trim())){
    			basDAO.updateEducMngmt(vo);
    		}else if("D".equals(vo.getCud_type().trim())){
    			basDAO.deleteEducMngmt(vo);
    		}
    	}
	}

	@Override
	public List<HumBasEducMngmtVo> selectEducMngmtInfoExcel_1(HumBasEducMngmtVo basVo) {
		return basDAO.selectEducMngmtInfoExcel_1(basVo);
	}
	
	@Override
	public List<HumBasEducMngmtVo> selectEducMngmtInfoExcel_2(HumBasEducMngmtVo basVo) {
		return basDAO.selectEducMngmtInfoExcel_2(basVo);
	}
}
