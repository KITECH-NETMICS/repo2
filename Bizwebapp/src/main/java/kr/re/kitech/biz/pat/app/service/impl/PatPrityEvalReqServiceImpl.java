package kr.re.kitech.biz.pat.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.app.dao.PatPrityEvalReqDAO;
import kr.re.kitech.biz.pat.app.service.PatPrityEvalReqService;
import kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqListVo;
import kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : PatPrityEvalReqServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.17.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.17.
 * @version 1.0
 * @see
 * 
 */
@Service("patPrityEvalReqServiceImpl")
public class PatPrityEvalReqServiceImpl extends EgovAbstractServiceImpl implements PatPrityEvalReqService {

  @Resource(name="patPrityEvalReqDAO")
  private PatPrityEvalReqDAO appDAO;

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;

  @Resource(name="generationServiceImpl")
  private GenerationService genService;
  
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService;
    
  /**
   * 우선심사신청 리스트 조회
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return List<PatPrityEvalReqVo>
   * @throws KitechException
   * @since 2023.10.17.   
   */
  @Override
  public List<PatPrityEvalReqVo> selectList01(PatPrityEvalReqVo vo) throws KitechException {
    List<PatPrityEvalReqVo> list = appDAO.selectList01(vo);	
    return list;
  }


  /**
   * 우선심사청구 조회
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return PatPrityEvalReqListVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqListVo selectPatPrityEvalReq(PatPrityEvalReqVo vo) throws KitechException {

    PatPrityEvalReqListVo List = new PatPrityEvalReqListVo();

    String select01Id = "selectPatPrityEvalReqSS02"; // 우선심사청구
    String select02Id = "selectPatCoinvntPsnMS01"; // 공동발명자 조회
    String select03Id = "selectPatCasTechTransMS01"; // 기술이전 조회
    String mngmtNo = "";

    PatPrityEvalReqVo result01 = appDAO.executeDynamicSelect("kr.re.kitech.biz.pat.app." + select01Id, vo);

    if (result01 != null) {
        mngmtNo = result01.getMngmt_no();
        if ("".equals(mngmtNo)) throw new KitechException(Exceptions.ERROR, Business.RSP, "message.xom.co.com.0010", new String[] { "관리번호" }); // 관리번호가 조회되지 않았습니다.
    } else {
        throw new KitechException(Exceptions.ERROR, Business.RSP, "message.xom.co.com.0002", new String[] { "조회" });
        // 조회에 실패하였습니다.
    }
    List.setPatPrityEvalReqVo(result01); // patPrityEvalReqVo msgPatPrityEvalReq001

    vo.setMngmt_no(mngmtNo);

    List < PatPrityEvalReqVo > result02 = appDAO.executeDynamicMultiSelect("kr.re.kitech.biz.pat.app." + select02Id, vo);
    List.setPatPrityEvalReqVoList01(result02); // patPrityEvalReqVoList01 msgPatAppCoinvntPsnMS01

    List < PatPrityEvalReqVo > result03 = appDAO.executeDynamicMultiSelect("kr.re.kitech.biz.pat.app." + select03Id, vo);
    List.setPatPrityEvalReqVoList02(result03); // patPrityEvalReqVoList02 msgResPstPagrMS01

    return List;

  }

  /**
   * 우선심사청구 등록
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return PatPrityEvalReqVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqVo savePatPrityEvalReq(PatPrityEvalReqVo vo) throws KitechException {

    PatPrityEvalReqVo retVo = new PatPrityEvalReqVo();

    String insertId = "insertPatPrityEvalReqSI01"; // 등록
    String updateId = "updatePatPrityEvalReqSU01"; // 수정

    String cudType = vo.getCud_type();
    String reqNo = vo.getPrity_eval_req_no();
    String docuClsf = vo.getDocu_clsf();

    if ("C".equals(cudType)) {
        reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), docuClsf);
        vo.setPrity_eval_req_no(reqNo);
        
        appDAO.executeDynamicInsert(insertId, vo);

        // 인터페이스 테이블 저장
        vo.setReq_no(reqNo);
        vo.setMngmt_item_7("");
        appDAO.executeDynamicInsert("kr.re.kitech.biz.pat.app." + "insertXomxIntfaTabSI01", vo);
    } else {
        appDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.app." + updateId, vo);
    }
    retVo.setReq_no(reqNo);
    return retVo;

  }

  /**
   * 우선심사청구 결재
   * 
   * @author Chris
   * @param PatPrityEvalReqListVo
   * @return PatPrityEvalReqVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqVo sendApproval(PatPrityEvalReqListVo vo) throws KitechException {

    PatPrityEvalReqVo aprData = vo.getPatPrityEvalReqVo();
    List<PatPrityEvalReqVo> gridList = vo.getPatPrityEvalReqVoList01();

    PatPrityEvalReqVo retVo = new PatPrityEvalReqVo();

    AprVo aprVo = new AprVo();
    aprVo.setReqNo(aprData.getReq_no());
    aprVo.setLoginUserId(aprData.getLogin_user_id());
    aprVo.setReporterId(aprData.getReporter_id());
    aprVo.setUiId(aprData.getUi_id());
    aprVo.setAprState(aprData.getApr_state());
    aprVo.setManager(aprData.getManager_id());
    aprVo.setResult(aprData.getResult());
    aprVo.setInfoCd(aprData.getInfo_cd());
    aprVo.setExt2Cd(aprData.getExt2_cd());
    aprVo.setExt1Cd(aprData.getExt1_cd());
    aprVo.setMainKey(aprData.getMain_key());
    aprVo.setResearcher(aprData.getResearcher_id());
    aprVo.setEndpoint(aprData.getEndpoint());

    aprData.setAttachVo1(attachDAO.selectListAttach(aprData.getAttach_file_no()));
    aprData.setAprGrid01(gridList);

    apprFuncService.approvalRequest(aprVo, aprData);

    retVo.setReq_no(aprVo.getReqNo());
    return retVo;

  }

  /**
   * 우선심사청구 결재 삭제
   * 
   * @author Chris
   * @param PatPrityEvalReqListVo
   * @return PatPrityEvalReqVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqVo deleteApproval(PatPrityEvalReqVo vo) throws KitechException {

    PatPrityEvalReqVo retVo = new PatPrityEvalReqVo();
    appDAO.executeDynamicDelete("kr.re.kitech.biz.pat.app.deletePatPrityEvalReqSD01", vo);

    String reqNo = vo.getReq_no();
    apprFuncService.formRemove(reqNo);

    retVo.setReq_no(reqNo);
    return retVo;
  }

}
