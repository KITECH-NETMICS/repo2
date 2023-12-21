package kr.re.kitech.biz.pat.pcm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.pcm.dao.PatBibliographyDAO;
import kr.re.kitech.biz.pat.pcm.service.PatBibliographyService;
import kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo;

@Service("patBibliographyServiceImpl")
public class PatBibliographyServiceImpl  extends EgovAbstractServiceImpl implements PatBibliographyService {
  @Resource(name="patBibliographyDAO")
  private PatBibliographyDAO pcmDAO;

  /**
    * 선행기술조사서 단건 조회
    * @author Chris
    * @since 2023.08.01.
    */
  @Override
  public PatBibliographyVo selectSingle(PatBibliographyVo vo) throws ElException {
    PatBibliographyVo resultVO = pcmDAO.selectSingle(vo);			
      return resultVO;
  }

}
