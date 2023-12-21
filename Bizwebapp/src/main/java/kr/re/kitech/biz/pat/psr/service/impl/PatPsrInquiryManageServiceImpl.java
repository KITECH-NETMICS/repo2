package kr.re.kitech.biz.pat.psr.service.impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.psr.dao.PatPsrInquiryManageDAO;
import kr.re.kitech.biz.pat.psr.service.PatPsrInquiryManageService;
import kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageListVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPsrInquiryManageServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.01.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.01.
 * @version 1.0
 * @see
 * 
 */
@Service("patPsrInquiryManageServiceImpl")
public class PatPsrInquiryManageServiceImpl  extends EgovAbstractServiceImpl implements PatPsrInquiryManageService {
  @Resource(name="patPsrInquiryManageDAO")
  private PatPsrInquiryManageDAO psrDAO;
    
  /**
   * 지재권 목록 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  @Override
  public List<PatPsrInquiryManageVo> selectPatPsrLst01(PatPsrInquiryManageVo vo) throws KitechException {
    List<PatPsrInquiryManageVo> list = psrDAO.selectPatPsrLst01(vo);	
    return list;
  }

  /**
   * 패밀리목록 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.07.   
   */
  @Override
  public List<PatPsrInquiryManageVo> retrieveList(PatPsrInquiryManageVo vo) throws KitechException {
    List<PatPsrInquiryManageVo> list = psrDAO.executeDynamicSelectList("selectPatPpoFamilyLstSS01" ,vo);	
    return list;
  }

  /**
   * 지식재산권 비용 정보 리스트 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.07.   
   */
  @Override
  public List<PatPsrInquiryManageVo> retrieveCostLst(PatPsrInquiryManageVo vo) throws KitechException {
    List<PatPsrInquiryManageVo> list = psrDAO.executeDynamicSelectList("selectPatPsrCostLstSS01" ,vo);	
    return list;
  }

  /**
   * 지식재산권 비용 정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageVo
   * @throws KitechException
   * @since 2023.11.07.
   */
  @Override
  public PatPsrInquiryManageVo retrieveCostInfo(PatPsrInquiryManageVo vo) throws KitechException {
    return Optional.ofNullable(psrDAO.executeDynamicSelect("selectPatPsrCostInfoSS01", vo)).orElse(new PatPsrInquiryManageVo());
  }

  /**
   * 지식재산권 상세 조회 사후관리
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageListVo
   * @throws KitechException
   * @since 2023.11.06.
   */
  @Override
  public PatPsrInquiryManageListVo patGridIA05(PatPsrInquiryManageVo vo) throws KitechException {
    PatPsrInquiryManageListVo retVo = new PatPsrInquiryManageListVo();
    retVo.setGrid01(psrDAO.executeDynamicSelectList("selectPatSkatertHisMS03", vo));
    retVo.setGrid02(psrDAO.executeDynamicSelectList("selectPatCasTechTransMS01", vo));
    retVo.setGrid03(psrDAO.executeDynamicSelectList("selectPatAcdtUnusualItrmMS02", vo));
    retVo.setGrid04(psrDAO.executeDynamicSelectList("selectPatPeeLstSS01", vo));
    retVo.setGrid05(psrDAO.executeDynamicSelectList("selectPatRelatReschPrjHisMS02", vo));
    return retVo;
  }

  /**
   * 지식재산권 기본정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageListVo
   * @throws KitechException
   * @since 2023.11.01.   
   */
  @Override
  public PatPsrInquiryManageListVo retrieveDefaultInfo(PatPsrInquiryManageVo vo) throws KitechException {
    PatPsrInquiryManageListVo retVo = new PatPsrInquiryManageListVo();
    retVo.setPatBasicInfo(Optional.ofNullable(psrDAO.executeDynamicSelect("selectPatPsrBasicInfoSS01", vo)).orElse(new PatPsrInquiryManageVo()));
    retVo.setPatManagerInfo(Optional.ofNullable(psrDAO.executeDynamicSelect("selectPatPsrBasicInfoSS02", vo)).orElse(new PatPsrInquiryManageVo()));
    retVo.setPatInventInfo(psrDAO.executeDynamicSelectList("selectPatPsrBasicInfoSS03", vo));
    retVo.setPatCoVendInfo(psrDAO.executeDynamicSelectList("selectPatPsrBasicInfoSS04", vo));
    retVo.setPatInventorInfo(psrDAO.executeDynamicSelectList("selectPatPsrBasicInfoSS05", vo));
    retVo.setPatPrjInfo(psrDAO.executeDynamicSelectList("selectPatPsrBasicInfoSS06", vo));
    retVo.setPatPriorInfo(psrDAO.executeDynamicSelectList("selectPatPsrBasicInfoSS07", vo));
    retVo.setPatDivdeInfo(psrDAO.executeDynamicSelectList("selectPatPsrBasicInfoSS08", vo));
    
    return retVo;
  }


  /**
   * 지식재산권 출원 정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageListVo
   * @throws KitechException
   * @since 2023.11.06.
   */
  @Override
  public PatPsrInquiryManageListVo retrieveAppInfo(PatPsrInquiryManageVo vo) throws KitechException {
    PatPsrInquiryManageListVo retVo = new PatPsrInquiryManageListVo();   
    retVo.setPatAppInfo(Optional.ofNullable(psrDAO.executeDynamicSelect("selectPatPsrAppInfoSS01", vo)).orElse(new PatPsrInquiryManageVo()));
    retVo.setPatAppHistory(psrDAO.executeDynamicSelectList("selectPatPsrAppInfoSS02", vo));
    
    return retVo;
  }

  /**
   * 지식재산권 등록 정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageListVo
   * @throws KitechException
   * @since 2023.11.06.
   */
  @Override
  public PatPsrInquiryManageListVo retrieveRegInfo(PatPsrInquiryManageVo vo) throws KitechException {
    PatPsrInquiryManageListVo retVo = new PatPsrInquiryManageListVo();   
    retVo.setPatRegInfo(Optional.ofNullable(psrDAO.executeDynamicSelect("selectPatPsrRegInfoSS01", vo)).orElse(new PatPsrInquiryManageVo()));
    retVo.setPatDemndLst(psrDAO.executeDynamicSelectList("selectPatPsrRegInfoSS02", vo));
    retVo.setPatOaLst(psrDAO.executeDynamicSelectList("selectPatPsrRegInfoSS03", vo));
    
    return retVo;
  }

  /**
   * 지식 재산권 등록 후 patmastr 수정 및 소연심 안건등록
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.
   */
  @Override
	public int updatePatMastr(PatPsrInquiryManageVo vo) throws KitechException {
    int result = 0;
    // patmastr 수정(출원일자)
    if ("smitapp".equals(vo.getClsf())) {
      psrDAO.executeDynamicUpdate("updatePatmastrSU01", vo);
    }
    // patmastr 수정(등록일자)
    if ("regst".equals(vo.getClsf())) {
      psrDAO.executeDynamicUpdate("updatePatmastrSU02", vo);
    }

    // 소연심 등록을 위한 조회
    PatPsrInquiryManageVo srcVo = psrDAO.executeDynamicSelect("selectPatAppMastrSS02", vo);
    if(srcVo != null){
      // 권리구분
      String patClsf = srcVo.getPat_clsf();

      if ("PAT050".equals(patClsf) || "PAT040".equals(patClsf) || "PAT030".equals(patClsf)) { // 프로그램, 디자인, 상표

        srcVo.setKey_1(vo.getReq_no());
        srcVo.setKey_2(vo.getMngmt_no());
        srcVo.setBiz_clsf("RBS007");
        srcVo.setItem_clsf("LBL001");
        srcVo.setRegst_syspayno(vo.getSyspayno());

        result = psrDAO.executeDynamicUpdate("selectResSmlRvewDSI01", srcVo);
      }
    }else{
      throw new KitechException(Exceptions.ERROR, Business.RSP, "message.xom.co.com.0007", new String[]{"소연심 데이터"}); // {0}가 존재하지 않습니다.
    }
    return result;
	}

  /**
   * 출원 데이터 변경
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.
   */
  @Override
	public int setPatAppSave(PatPsrInquiryManageVo vo) throws KitechException {
    int result = 0;
    result = psrDAO.executeDynamicUpdate("updatePatAppReqSU01", vo);
    return result;
  }

  /**
   * 지식재산권 결재 유무 변경
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.
   */
  @Override
	public int updatePatmastrBpmYn(PatPsrInquiryManageVo vo) throws KitechException {
    int result = 0;
    result = psrDAO.executeDynamicUpdate("updatePatmastrBpmYnSU01", vo);
    return result;
  }

}
