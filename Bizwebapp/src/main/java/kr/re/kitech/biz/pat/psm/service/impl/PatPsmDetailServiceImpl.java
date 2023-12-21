package kr.re.kitech.biz.pat.psm.service.impl;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.psm.dao.PatPsmDetailDAO;
import kr.re.kitech.biz.pat.psm.service.PatPsmDetailService;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailListVo;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPsmDetailServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.08.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.08.
 * @version 1.0
 * @see
 * 
 */
@Service("patPsmDetailServiceImpl")
public class PatPsmDetailServiceImpl extends EgovAbstractServiceImpl implements PatPsmDetailService {
  @Resource(name="patPsmDetailDAO")
  private PatPsmDetailDAO psmDAO;
    
  /**
   * 소연심의 상세조회
   * 
   * @author Chris
   * @param PatPsmDetailVo
   * @return PatPsmDetailVo
   * @throws KitechException
   * @since 2023.11.08.
   */
  @Override
  public PatPsmDetailListVo retrieveExamDtl(PatPsmDetailVo vo) throws KitechException {
    PatPsmDetailListVo retVo = new PatPsmDetailListVo();

    String reqNo = vo.getReq_no().trim();
    if ("".equals(reqNo)) {
        // 소연심의 마스터
        retVo.setPatPsmExam(Optional.ofNullable(psmDAO.executeDynamicSelect("selectPatPsmDtlSS01", vo)).orElse(new PatPsmDetailVo()));
        // 대상 지역본부 조회
        retVo.setPatPsmExamArea(psmDAO.executeDynamicSelectList("selectPatPiiDtlSS03", vo));
        // 국내출원 심의대상 및 결과
        vo.setObj_exam_clsf("S01");
        retVo.setKrExam(psmDAO.executeDynamicSelectList("selectPatPsmDtlSS02", vo));
        // 자유발명 심의대상
        vo.setObj_exam_clsf("S02");
        retVo.setFreeExam(psmDAO.executeDynamicSelectList("selectPatPsmDtlSS03", vo));
        // 기타 심의대상
        vo.setObj_exam_clsf("S03");
        retVo.setEtcExam(psmDAO.executeDynamicSelectList("selectPatPsmDtlSS04", vo));
        // 프로그램 저작물(S/W) 등록 보고 대상
        vo.setObj_exam_clsf("S04");
        retVo.setProgramExam(psmDAO.executeDynamicSelectList("selectPatPsmDtlSS02", vo));
    } else {
        // 소연심의 마스터
        retVo.setPatPsmExam(Optional.ofNullable(psmDAO.executeDynamicSelect("selectResSmlRvewHSS01", vo)).orElse(new PatPsmDetailVo()));
        // 국내출원 심의대상 및 결과
        vo.setObj_exam_clsf("S01");
        retVo.setKrExam(psmDAO.executeDynamicSelectList("selectResSmlRvewDMS02", vo));
        // 자유발명 심의대상
        vo.setBiz_clsf("RBS006");
        retVo.setFreeExam(psmDAO.executeDynamicSelectList("selectResSmlRvewDMS02", vo));
        // 기타 심의대상
        vo.setBiz_clsf("RBS010");
        retVo.setEtcExam(psmDAO.executeDynamicSelectList("selectResSmlRvewDMS02", vo));
        // 프로그램 저작물(S/W) 등록 보고 대상
        vo.setBiz_clsf("RBS007");
        retVo.setProgramExam(psmDAO.executeDynamicSelectList("selectResSmlRvewDMS02", vo));
    }

    return retVo;
  }

  /**
   * 첨부파일 수정
   * 
   * @author Chris
   * @param PatPsmDetailVo
   * @return int
   * @throws KitechException
   * @since 2023.11.08.
   */
  @Override
	public int saveExamAttach(PatPsmDetailVo vo) throws KitechException {
    int result = psmDAO.executeDynamicUpdate("updatePatPiiMakLstSU02", vo);
    return result;
	}

  /**
   * 첨부파일 다운로드
   * 
   * @author Chris
   * @param PatPsmDetailVo
   * @return PatPsmDetailVo
   * @throws KitechException
   * @since 2023.11.08.
   */
  @Override
	public PatPsmDetailVo patFileSearch(PatPsmDetailVo vo) throws KitechException {
    PatPsmDetailVo retVo = psmDAO.executeDynamicSelect("selectPatPpoMasterFileSearch", vo);
    return retVo;
	}

}
