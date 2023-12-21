package kr.re.kitech.biz.pat.pap.service.impl;

import java.util.Objects;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.pap.dao.PatPapManReqInvDAO;
import kr.re.kitech.biz.pat.pap.service.PatPapManReqInvService;
import kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPapManReqInvServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      Chris    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Service("patPapManReqInvServiceImpl")
public class PatPapManReqInvServiceImpl  extends EgovAbstractServiceImpl implements PatPapManReqInvService {
  @Resource(name="patPapManReqInvDAO")
  private PatPapManReqInvDAO papDAO;

  @Resource(name = "patComWFService")
  private PatComWFService patComService;

  @Resource(name = "generationServiceImpl")
  private GenerationService genService;

  /**
   * 출원지시 요청 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  @Override
  public PatPapManReqInvVo selectItem01(PatPapManReqInvVo vo) throws KitechException {
    PatPapManReqInvVo resultVO = papDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * 출원지시 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  @Override
  public PatPapManReqInvVo selectItem02(PatPapManReqInvVo vo) throws KitechException {
    PatPapManReqInvVo resultVO = papDAO.selectItem02(vo);			
      return resultVO;
  }

  /**
   * 출원지시 의뢰 결과 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  @Override
  public PatPapManReqInvVo selectItem03(PatPapManReqInvVo vo) throws KitechException {
    PatPapManReqInvVo resultVO = papDAO.selectItem03(vo);			
      return resultVO;
  }

  /**
   * 출원지시 의뢰 등록
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws Exception 
   * @since 2023.09.13.   
   */
  @Override
	public int insertPapReqInv(PatPapManReqInvVo vo) throws Exception {
    int result = 0;

    String update01Id = "updatePatPapReqSI01"; // 출원지시 의뢰 등록
    String update02Id = "updatePatMastrSU04"; // 특허마스터 상태변경
    
    //선행기술조사 의뢰 등록
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update01Id, vo);
    
    //특허 마스터 상태변경
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update02Id, vo);
 
    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());
    
    patComService.executePatComWFBiz(param);

    return result;
  }

 
  /**
   * 출원지시 요청 등록
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws Exception 
   * @since 2023.09.13.   
   */
  @Override
	public int insertPapManReqInv(PatPapManReqInvVo vo) throws Exception {
    int result = 0;
    String app_id = "";                           // 출원지시 의뢰번호
    String insert011d = "insertPatPapManReqSI01"; // 출원지시 요청 등록
    String update01Id = "updatePatMastrSU01"; // 특허마스터 상태변경
    String update02Id = "updatePatPapManReqSU01"; // 출원지시 요청 등록

    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd("P3211");
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());

    //patComService.executePatComWFBiz(param);

    if (vo.getApp_id().equals("") && vo.getApp_id() != null) {
        app_id = vo.getApp_id();
        result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update02Id, vo);
        param.setRef_key(vo.getRef_key());
    } else {
        app_id = genService.getGenNumber(Numberings.DOCUMENT.getName(), vo.getDocu_clsf());
        vo.setApp_id(app_id);
        result = papDAO.executeDynamicInsert("kr.re.kitech.biz.pat.pap." + insert011d, vo);
        param.setRef_key(app_id);
    }
    vo.setState("P0510");
    //특허 마스터 상태변경
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update01Id, vo);
    vo.setBf_state("P0416");
    patComService.executePatComWFBiz(param);
    
    return result;
	}

  /**
   * 출원지시 검토결과 등록
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws Exception 
   * @since 2023.09.13.   
   */
  @Override
	public int insertPapReeInv(PatPapManReqInvVo vo) throws Exception {
    int result = 0;
    String update01Id = "updatePatPapReeInvSU01"; // 출원지시검토 결과 등록
    String update02Id = "updatePatMastrSU02"; // 특허마스터 상태변경
    String update03Id = "insertPatPapHistorySI01"; // 출원지시 요청 이력 등록
    String insert01Id = "insertPatPapReeSI01"; // 출원지시검토 결과작성 완료 후 심사청구 등록
    String update04Id = "updatePatMastrSU03"; // 특허마스터 상태변경

    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update01Id, vo);
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update02Id, vo);
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update03Id, vo);

    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());

    patComService.executePatComWFBiz(param);


    String reqClaimYn = vo.getReq_claim_yn();
    String mngmtNo = vo.getMngmt_no();

    if (Objects.equals(reqClaimYn, "Y") && (mngmtNo != null && mngmtNo.length() >= 2 && !mngmtNo.substring(0, 2).equals("PC"))) {
        String demnd_id = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I15");
        vo.setDemnd_id(demnd_id);
        vo.setJob_state_cd("P1111");
        vo.setState("P1111");
        vo.setAsk_psn_syspayno(vo.getSyspayno());
        vo.setReq_patofic_cd(vo.getCom_patofic_cd());
        vo.setHope_patofic_charg_id(vo.getCom_patofic_charg_id());
        vo.setRegst_syspayno(vo.getSyspayno());
        vo.setEval_demnd_ex("Y");

        result = papDAO.executeDynamicInsert("kr.re.kitech.biz.pat.pap." + insert01Id, vo);
        result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update04Id, vo);

        param.setCurr_state_cd("");
        param.setNext_state_cd("P1111");
        param.setSyspayno(vo.getSyspayno());
        param.setInit("Y");
        param.setRef_key(demnd_id);
        patComService.executePatComWFBiz(param);
    }
    return result;
  }

  /**
   * 출원지시 검토결과 등록 (오류 강제 진행)
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws Exception 
   * @since 2023.09.13.   
   */
  @Override
	public int insertPapReeInvTemp(PatPapManReqInvVo vo) throws Exception {
    int result = 0;
    String update01Id = "updatePatPapReeInvSU01"; // 출원지시검토 결과 등록
    String update02Id = "updatePatMastrSU02"; // 특허마스터 상태변경
    String update03Id = "insertPatPapHistorySI01"; // 출원지시 요청 이력 등록
    String insert01Id = "insertPatPapReeSI01"; // 출원지시검토 결과작성 완료 후 심사청구 등록
    String update04Id = "updatePatMastrSU03"; // 특허마스터 상태변경
    
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update01Id, vo);
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update02Id, vo);
    result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update03Id, vo);
    
    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());
    
    //patComService.executePatComWFBiz(param);
    
    String reqClaimYn = vo.getReq_claim_yn();
    String mngmtNo = vo.getMngmt_no();
    
    if (Objects.equals(reqClaimYn, "Y") && (mngmtNo != null && mngmtNo.length() >= 2 && !mngmtNo.substring(0, 2).equals("PC"))) {
        String demnd_id = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I15");
        vo.setDemnd_id(demnd_id);
        vo.setJob_state_cd("P1111");
        vo.setState("P1111");
        vo.setAsk_psn_syspayno(vo.getSyspayno());
        vo.setReq_patofic_cd(vo.getCom_patofic_cd());
        vo.setHope_patofic_charg_id(vo.getCom_patofic_charg_id());
        vo.setRegst_syspayno(vo.getSyspayno());
        vo.setEval_demnd_ex("Y");
    
        result = papDAO.executeDynamicInsert("kr.re.kitech.biz.pat.pap." + insert01Id, vo);
        result = papDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pap." + update04Id, vo);
    
        param.setCurr_state_cd("");
        param.setNext_state_cd("P1111");
        param.setSyspayno(vo.getSyspayno());
        param.setInit("Y");
        param.setRef_key(demnd_id);
        patComService.executePatComWFBiz(param);
    }
    
    return result;
  }

}
