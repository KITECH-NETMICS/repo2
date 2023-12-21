package kr.re.kitech.biz.pat.pse.service.impl;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.pse.dao.PatPseDetailDAO;
import kr.re.kitech.biz.pat.pse.service.PatPseDetailService;
import kr.re.kitech.biz.pat.pse.vo.PatPseDetailListVo;
import kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPseDetailServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.09.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.09.
 * @version 1.0
 * @see
 * 
 */
@Service("patPseDetailServiceImpl")
public class PatPseDetailServiceImpl extends EgovAbstractServiceImpl implements PatPseDetailService {
  @Resource(name="patPseDetailDAO")
  private PatPseDetailDAO pseDAO;
    
  /**
   * 지심의 조회
   * 
   * @author Chris
   * @param PatPseDetailVo
   * @return PatPseDetailListVo
   * @throws KitechException
   * @since 2023.11.09.
   */
  @Override
  public PatPseDetailListVo retrieveExamDtl(PatPseDetailVo vo) throws KitechException {
    PatPseDetailListVo retVo = new PatPseDetailListVo();
    retVo.setPatPseExam(Optional.ofNullable(pseDAO.executeDynamicSelect("selectPatPseDtlSS01", vo)).orElse(new PatPseDetailVo()));
    vo.setObj_exam_clsf("J01");
    retVo.setOutSideExam(pseDAO.executeDynamicSelectList("selectPatPseDtlSS02", vo));
    vo.setObj_exam_clsf("J02");
    retVo.setJointExam(pseDAO.executeDynamicSelectList("selectPatPseDtlSS02", vo));
    vo.setObj_exam_clsf("J03");
    retVo.setGiveUpExam(pseDAO.executeDynamicSelectList("selectPatPseDtlSS02", vo));


    return retVo;
  }

}
