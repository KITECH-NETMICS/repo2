package kr.re.kitech.biz.pat.ipd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.ipd.dao.PatIpdRightDivDAO;
import kr.re.kitech.biz.pat.ipd.service.PatIpdRightDivService;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivListVo;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : PatIpdRightDivServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.29.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.29.
 * @version 1.0
 * @see
 * 
 */
@Service("patIpdRightDivServiceImpl")
public class PatIpdRightDivServiceImpl extends EgovAbstractServiceImpl implements PatIpdRightDivService {
  @Resource(name="patIpdRightDivDAO")
  private PatIpdRightDivDAO ipdDAO;

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;

  @Resource(name="apprFuncServiceImpl")
  private ApprFuncService apprFuncService;

  @Resource(name = "apprCommonServiceImpl")
  private ApprCommonService aprComService;

  @Resource(name="generationServiceImpl")
  private GenerationService genService;
    
  /**
   * 우선권/분할 신청서 조회
   * 
   * @author Chris
   * @param PatIpdRightDivVo
   * @return List<PatIpdRightDivVo>
   * @throws KitechException
   * @since 2023.11.29.
   */
  @Override
  public List<PatIpdRightDivVo> patIpdRightDivSelectList(PatIpdRightDivVo vo) throws KitechException {
    return ipdDAO.executeDynamicSelectList("selectPatIpdLst01", vo);
  }  
  
  /**
   * 우선권/분할 신청서 조회
   * 
   * @author Chris
   * @param PatIpdRightDivVo
   * @return PatIpdRightDivListVo
   * @throws KitechException
   * @since 2023.11.29.
   */
  @Override
  public PatIpdRightDivListVo retrieveDraftInfo(PatIpdRightDivVo vo) throws KitechException {
    PatIpdRightDivListVo retVo = new PatIpdRightDivListVo();

    String queryId01 = "selectPatIpdSS01";
    String queryId02 = "selectPatIpdSS02";

    retVo.setDraftInfo(ipdDAO.executeDynamicSelect(queryId01, vo));
    retVo.setSmipAppLst(ipdDAO.executeDynamicSelectList(queryId02, vo));

    return retVo;
  }

  /**
   * 우선권/분할 신청서 임시저장
   * 
   * @author Chris
   * @param PatIpdRightDivListVo
   * @return PatIpdRightDivVo
   * @throws KitechException
   * @since 2023.11.29.
   */
  @Override
  public PatIpdRightDivVo patIpdtempSave(PatIpdRightDivListVo vo) throws KitechException {

    PatIpdRightDivVo retVo = new PatIpdRightDivVo();
    
    String insertId01 = "insertPatIpdTempSaveSI01";
    String insertId02 = "insertPatIpdTempSaveSI02";
    String updateId01 = "updatePatIpdTempSaveSU01";
    String updateId02 = "updatePatIpdTempSaveSU02";
    String deleteId01 = "deletePatIpdTempSaveSD01";

    PatIpdRightDivVo draftInfo = vo.getPatIpdRightDivVo();
    List<PatIpdRightDivVo> patIpdList = vo.getPatIpdList(); // msgPatIpdSS02

    String dp_req_no = draftInfo.getDp_req_no();
    
    // 신규
    if ("".equals(dp_req_no)) {
        // 채번
        dp_req_no = genService.getGenNumber(Numberings.DOCUMENT.getName(), draftInfo.getDocu_clsf());

        draftInfo.setDp_req_no(dp_req_no);
        ipdDAO.executeDynamicInsert(insertId01, draftInfo);
    
        // 인터페이스 테이블 저장(결재 임시저장)
        aprComService.createAprInterface(dp_req_no);
        
    } else {
        ipdDAO.executeDynamicUpdate(updateId01, draftInfo);
    }
    
    String apprYn = draftInfo.getApprYn();
    
    if ("Y".equals(apprYn)) {
        ipdDAO.executeDynamicUpdate(updateId02, draftInfo);
    }

    ipdDAO.executeDynamicDelete(deleteId01, draftInfo);
    
    if (!patIpdList.isEmpty()) {
      for (PatIpdRightDivVo list: patIpdList) {
        list.setDp_req_no(dp_req_no);
        list.setSyspayno(draftInfo.getSyspayno());

        // 선출원 목록 저장
        ipdDAO.executeDynamicInsert(insertId02, list);
      }
    }

    retVo.setDp_req_no(dp_req_no);
    return retVo;
  }

  /**
   * 신청서 삭제
   * 
   * @author Chris
   * @param PatIpdRightDivVo
   * @return int
   * @throws KitechException
   * @since 2023.11.29.
   */
  @Override
	public int deletePatAprInfo(PatIpdRightDivVo vo) throws KitechException {
    int result = 0;
    // 결재 삭제
    String reqNo = vo.getReq_no();
    aprComService.deleteApr(reqNo);

    String docuClsf = vo.getDocu_clsf();
    if ("I02".equals(docuClsf)) {
      result =ipdDAO.executeDynamicDelete("deletePatGiveUpSD01", vo);
    } else if ("I05".equals(docuClsf)) {
      // 우선심사신청서
      result = ipdDAO.executeDynamicDelete("deletePatPrityEvalReqSD01", vo);
    } else if ("I06".equals(docuClsf)) {
      // 우선권/분할
      result = ipdDAO.executeDynamicDelete("deletePatIpdTempSaveSD01", vo);
      result = ipdDAO.executeDynamicDelete("deletePatIpdTempSaveSD02", vo);
    }
    return result;
	}

  /**
   * 우선권/분할 결재 신청
   * 
   * @author Chris
   * @param PatIpdRightDivListVo
   * @return PatIpdRightDivVo
   * @throws KitechException
   * @since 2023.11.29.
   */
  @Override
  public PatIpdRightDivVo approval(PatIpdRightDivListVo vo) throws KitechException {
    PatIpdRightDivVo retVo = new PatIpdRightDivVo();
    PatIpdRightDivVo core = vo.getCore();
    List<PatIpdRightDivVo> smipAppLst = vo.getSmipAppLst();

    AprVo aprVo = new AprVo();
    aprVo.setLoginUserId(core.getLogin_user_id());
    aprVo.setReqNo(core.getReq_no());
    aprVo.setReporterId(core.getReporter_id());
    aprVo.setUiId(core.getUi_id());
    aprVo.setAprState(core.getApr_state());
    aprVo.setManager(core.getManager_id());
    aprVo.setInfoCd(core.getInfo_cd());
    aprVo.setExt1Cd(core.getExt1_cd());
    aprVo.setExt2Cd(core.getExt2_cd());
    aprVo.setMainKey(core.getMain_key());
    aprVo.setResearcher(core.getResearcher_id());
    aprVo.setEndpoint(core.getLogin_user_id());

    core.setAttachVo1(attachDAO.selectListAttach(core.getFileList_A()));
    core.setSmipAppLst(smipAppLst);

    apprFuncService.approvalRequest(aprVo, core);

    retVo.setReq_no(aprVo.getReqNo());

    return retVo;
  }

}
