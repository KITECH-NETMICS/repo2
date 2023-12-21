package kr.re.kitech.biz.fin.leg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.leg.dao.FinAdjstEvidSelDAO;
import kr.re.kitech.biz.fin.leg.service.FinAdjstEvidSelService;
import kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : FinAdjstEvidSelServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일               수정자            수정내용
 *  -----------   ---------   ---------
 *  2023.09.15.     김정환            최초생성
 * 
 * @author 김정환
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
@Service("finAdjstEvidSelServiceImpl")
public class FinAdjstEvidSelServiceImpl  extends EgovAbstractServiceImpl implements FinAdjstEvidSelService {
  @Resource(name="finAdjstEvidSelDAO")
  private FinAdjstEvidSelDAO legDAO;
   

  /**
   * 다건 조회
   * 
   * @author 김정환
   * @param FinAdjstEvidSelVo
   * @return List<FinAdjstEvidSelVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  @Override
  public List<FinAdjstEvidSelVo> selectList(FinAdjstEvidSelVo vo) throws KitechException {
    List<FinAdjstEvidSelVo> list = legDAO.selectList(vo);	
    return list;
  }
}
