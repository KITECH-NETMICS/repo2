package kr.re.kitech.biz.pat.ptl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.ptl.dao.PatPtlResWorkDAO;
import kr.re.kitech.biz.pat.ptl.service.PatPtlResWorkService;
import kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : PatPtlResWorkServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.12.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.12.
 * @version 1.0
 * @see
 * 
 */
@Service("patPtlResWorkServiceImpl")
public class PatPtlResWorkServiceImpl  extends EgovAbstractServiceImpl implements PatPtlResWorkService {
  @Resource(name="patPtlResWorkDAO")
  private PatPtlResWorkDAO ptlDAO;
  
  @Resource(name = "patComWFService")
    private PatComWFService patComService;
    
  /**
   * 번역 제출보고 조회
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return PatPtlResWorkVo
   * @throws KitechException
   * @since 2023.09.12.   
   */
  @Override
  public PatPtlResWorkVo selectItem01(PatPtlResWorkVo vo) throws KitechException {
    PatPtlResWorkVo resultVO = ptlDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * 번역 제출보고 상세 조회
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return PatPtlResWorkVo
   * @throws KitechException
   * @since 2023.09.12.   
   */
  @Override
  public PatPtlResWorkVo selectItem02(PatPtlResWorkVo vo) throws KitechException {
    PatPtlResWorkVo resultVO = ptlDAO.selectItem02(vo);			
      return resultVO;
  }

  /**
   * 번역 제출보고 결과검토 등록
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return int
   * @throws Exception 
   * @since 2023.09.12.
   */
  @Override
  public int updatePtlResInv(PatPtlResWorkVo vo) throws Exception {
    int result = 0;
    
    result = ptlDAO.updatePatPtlResCrtSU01(vo);

    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd("P3211");
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setTodo_auth(vo.getTodo_auth());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());

    patComService.executePatComWFBiz(param);

    return result;
  }

}
