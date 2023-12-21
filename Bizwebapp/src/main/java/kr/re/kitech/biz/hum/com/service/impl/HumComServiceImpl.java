package kr.re.kitech.biz.hum.com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.hum.com.dao.HumComDAO;
import kr.re.kitech.biz.hum.com.service.HumComService;
import kr.re.kitech.biz.hum.com.vo.HumPrtLogVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : humComServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.23.    mklee      최초생성
 * 
 * @author 
 * @since 2023.11.23.
 * @version 1.0
 * @see
 * 
 */
@Service("humComServiceImpl")
public class HumComServiceImpl  extends EgovAbstractServiceImpl implements HumComService {
  @Resource(name="humComDAO") 
  private HumComDAO comDAO;
    
/**
     * 인사증명서 인쇄 로그 단건등록
     * @param HumPrtLogVo
     * @return int
     * @throws Exception
     */
  public void insertHumPrtLogData(HumPrtLogVo vo)  throws KitechException {
	  comDAO.insertHumPrtLogData(vo);	     
  }
 
}
