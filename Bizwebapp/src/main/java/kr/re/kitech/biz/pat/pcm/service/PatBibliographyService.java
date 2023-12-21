package kr.re.kitech.biz.pat.pcm.service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo;

public interface PatBibliographyService {
  

  /**
    * 선행기술조사서 단건 조회
    * @author Chris
    * @since 2023.08.01.
    */
  public PatBibliographyVo selectSingle(PatBibliographyVo vo) throws ElException;

  
}
