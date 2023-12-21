package kr.re.kitech.biz.ass.rpt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ass.rpt.dao.AssRptDAO;
import kr.re.kitech.biz.ass.rpt.service.AssRptService;
import kr.re.kitech.biz.ass.rpt.vo.AssRptVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : AssRptServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일                 수정자            수정내용
 *  -----------   ---------    ---------
 *  2023.10.16.      김정환            최초생성
 * 
 * @author 
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Service("assRptServiceImpl")
public class AssRptServiceImpl  extends EgovAbstractServiceImpl implements AssRptService {
  @Resource(name="assRptDAO")
  private AssRptDAO rptDAO;
    
  /**
   * 다건 조회
   * 
   * @author 
   * @param AssRptVo
   * @return List<AssRptVo>
   * @throws KitechException
   * @since 2023.10.16.   
   */
  @Override
  public List<AssRptVo> selectAssRptList(AssRptVo vo) throws KitechException {
	  return rptDAO.selectAssRptList(vo);
  }

}
