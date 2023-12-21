package kr.re.kitech.biz.pat.dft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.dft.dao.PatFreeInventionDAO;
import kr.re.kitech.biz.pat.dft.service.PatFreeInventionService;
import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionListVo;
import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : PatFreeInventionServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.10.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.10.
 * @version 1.0
 * @see
 * 
 */
@Service("patFreeInventionServiceImpl")
public class PatFreeInventionServiceImpl extends EgovAbstractServiceImpl implements PatFreeInventionService {
  @Resource(name="patFreeInventionDAO")
  private PatFreeInventionDAO dftDAO;

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;

  @Resource(name="apprCommonServiceImpl")
  private ApprCommonService aprComService;

  @Resource(name="apprFuncServiceImpl")
  private ApprFuncService apprFuncService;

  @Resource(name="generationServiceImpl")
  private GenerationService genService;

  
  /**
   * 발명 신고서 작성 조회
   * 
   * @author Chris
   * @param PatFreeInventionListVo
   * @return PatFreeInventionVo
   * @throws KitechException
   * @since 2023.11.13.
   */
  @Override
  public PatFreeInventionListVo selectPatAppFreeInvnt(PatFreeInventionVo vo) throws KitechException {
    PatFreeInventionListVo retVo = new PatFreeInventionListVo();

    PatFreeInventionVo form = dftDAO.executeDynamicSelect("selectPatAppMastrSS03", vo); // 자유/외부발명신고서 작성 단건 조회
    if(form != null){
      retVo.setFormVo(form); 
      retVo.setVendList(dftDAO.executeDynamicSelectList("selectPatAppCosmitAppVendMS01", vo)); // 결재 공동출원업체 다건 조회
      retVo.setInvntpsnList(dftDAO.executeDynamicSelectList("selectPatAppCoinvntPsnMS01", vo)); // 결재 공동발명자 다건 조회
  
      // 디자인 첨부파일조회
      if("PAT040".equals(form.getPat_clsf())){
        vo.setAttach_clsf("ATT002");
        retVo.setAttachtab2List(dftDAO.executeDynamicSelectList("selectPatAppAttachMS01", vo)); // 결재 디자인 첨부파일 다건 조회
      }
    }
    return retVo;
  }


  /**
   * 발명 신고서 작성 저장
   * 
   * @author Chris
   * @param PatFreeInventionListVo
   * @return PatFreeInventionVo
   * @throws KitechException
   * @since 2023.11.10.
   */
  @Override
  public PatFreeInventionVo savePatAppFreeInvnt(PatFreeInventionListVo vo) throws KitechException {

    PatFreeInventionVo retVo = new PatFreeInventionVo();
  
    PatFreeInventionVo formVo = vo.getFormVo();
    PatFreeInventionVo tabData = vo.getTabData();
    List<PatFreeInventionVo> vendList = vo.getVendList();
    List<PatFreeInventionVo> delvendList = vo.getDelvendList();
    List<PatFreeInventionVo> invntpsnList = vo.getInvntpsnList();
    List<PatFreeInventionVo> delpersonList = vo.getDelpersonList();
    List<PatFreeInventionVo> delattachList = vo.getDelattachList();
    List<PatFreeInventionVo> attachtab2List = vo.getAttachtab2List();
  
    // 자유발명신고서 상세 저장
    String reqNo = formVo.getReq_no();
  
    if("".equals(reqNo)){
      // 전자결재신청번호 채번
      reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I12");
      formVo.setReq_no(reqNo);
      
      // 결재 특허마스터 등록
      dftDAO.executeDynamicInsert("insertPatAppMastrSI01", formVo);
  
      // 인터페이스 테이블 저장
      aprComService.createAprInterface(reqNo, "I111", KitechContextUtil.getUserId());
    }else{
      // 결재 특허마스터 변경
      dftDAO.executeDynamicUpdate("updatePatAppMastrSU01", formVo);
    }
  
    // 출원인 저장
    for (PatFreeInventionVo list: vendList) {
      list.setReq_no(reqNo);
      list.setRegst_syspayno(formVo.getRegst_syspayno());
  
      // 자유발명신고서_출원인 저장
      dftDAO.executeDynamicUpdate("updatePatAppCoSmitappVendSI01", list);
    }
  
    // 출원인 삭제
    if(!delvendList.isEmpty()){
      for (PatFreeInventionVo list: delvendList) {
        list.setReq_no(reqNo);
        // 결재 공동출원업체 삭제
        dftDAO.executeDynamicDelete("deletePatAppCoSmitappVendSD01", list);
      }
    }
  
    // 자유발명자 저장
    for (PatFreeInventionVo list: invntpsnList) {
      list.setReq_no(reqNo);
      list.setRegst_syspayno(formVo.getRegst_syspayno());
  
      // 자유발명신고서_자유발명자 저장
      dftDAO.executeDynamicUpdate("updatePatAppCoInvntPsnSI01", list);
    }
  
    // 자유발명자 삭제
    if(!delpersonList.isEmpty()){
      for (PatFreeInventionVo list: delpersonList) {
        list.setReq_no(reqNo);
  
        // 결재 공동발명자 삭제
        dftDAO.executeDynamicDelete("deletePatAppCoInvntPsnSD01", list);
      }
    }
  
    // 상표 또는 디자인
    tabData.setRegst_syspayno(formVo.getRegst_syspayno());
    tabData.setUpdt_syspayno(formVo.getRegst_syspayno());
  
    if(tabData != null){
      if( "PAT030".equals(formVo.getPat_clsf()) ){ // 상표
        if( "".equals( tabData.getReq_no() ) ){
          tabData.setReq_no(reqNo);
          // 결재 상표발명서 등록
          dftDAO.executeDynamicInsert("insertPatAppTmInvntBookSI01", tabData);
        }else{
          // 결재 상표발명서 변경
          dftDAO.executeDynamicUpdate("updatePatAppTmInvntBookSU01", tabData);
        }
      }else if( "PAT040".equals( formVo.getPat_clsf() ) ){ // 디자인
        if( "".equals( tabData.getReq_no() ) ){
          tabData.setReq_no(reqNo);
          // 결재 디자인발명서 등록
          dftDAO.executeDynamicInsert("insertPatAppDesnInvntBookSI01", tabData);
        }else{
          // 결재 디자인발명서 변경
          dftDAO.executeDynamicUpdate("updatePatAppDesnInvntBookSU01", tabData);
        }

        // 디자인 첨부파일 그리드 저장
        if(!attachtab2List.isEmpty()){
          for (PatFreeInventionVo list: attachtab2List) {
            list.setReq_no(reqNo);
            list.setAttach_clsf("ATT002");
            list.setRegst_syspayno(formVo.getRegst_syspayno());
            dftDAO.executeDynamicUpdate("updatePatFreeInvention", list);
          }
        }
      }
    }
  
    // 디자인 첨부파일 그리드삭제
    if(!delattachList.isEmpty()){
      for (PatFreeInventionVo list: delattachList) {
        list.setReq_no(reqNo);
        // 첨부파일마스터 삭제
        dftDAO.executeDynamicDelete("deletePatAttchaMastrSD01", list);
      }
    }
  
    retVo.setReq_no(reqNo);
    return retVo;
  }


  /**
   * 발명 신고서 삭제 (결재 중)
   * 
   * @author Chris
   * @param PatFreeInventionListVo
   * @return int
   * @throws KitechException
   * @since 2023.11.13.
   */
  @Override
  public int deletePatDftInfo(PatFreeInventionVo vo) throws KitechException {
    int result = 0;

  	String deleteId01 = "deletePatAppMastrSD01"; // XDA ID : 결재 마스터삭제
    String deleteId02 = "deletePatAppCoInvntPsnSD01"; // XDA ID : 결재 공동발명자 삭제
    String deleteId03 = "deletePatAppCoSmitappVendSD01"; // XDA ID : 결재 공동출원업체 삭제
    String deleteId04 = "deletePatAppRelatReschPrjSD01"; // XDA ID : 결재 관련연구과제 삭제
    String deleteId05 = "deletePatAppRelatAccntSD01"; // XDA ID : 결재 관련계정 삭제
    String deleteId07 = "deletePatAppTmInvntBookSD01"; // XDA ID : 결재상표발명서 삭제
    String deleteId08 = "deletePatAppDesnInvntbookSD01"; // XDA ID : 결재 디자인발명서 삭제
    String deleteId09 = "deletePatAppPgmInvnibookSD01"; // XDA ID : 결재 프로그램발명서삭제

    // 인터페이스테이블 및 스냅샷 삭제
    String reqNo = vo.getReq_no();
    aprComService.deleteApr(reqNo);

    result = dftDAO.executeDynamicDelete(deleteId02, vo);
    result = dftDAO.executeDynamicDelete(deleteId03, vo);

    if (!reqNo.startsWith("I12")) { // 자유발명이 아닐 경우에만 삭제(2021.11.09. 이영희)
      result = dftDAO.executeDynamicDelete(deleteId04, vo); // 연구과제
      result = dftDAO.executeDynamicDelete(deleteId05, vo); // 관련계정
      result = dftDAO.executeDynamicDelete(deleteId09, vo); // 프로그램
    }
    result = dftDAO.executeDynamicDelete(deleteId07, vo);
    result = dftDAO.executeDynamicDelete(deleteId08, vo);
    result = dftDAO.executeDynamicDelete(deleteId01, vo);

    return result;
  }


  /**
   * 직무발명자 기본정보 조회
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return List<PatFreeInventionVo>
   * @throws KitechException
   * @since 2023.11.13.
   */
  @Override
  public List<PatFreeInventionVo> getInvntPsn(PatFreeInventionVo vo) throws KitechException {
    return dftDAO.executeDynamicSelectList("selectPatDftInfoMS01", vo);
  }

  
  /**
   * 자유발명신고서 조회
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return List<PatFreeInventionVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  @Override
  public List<PatFreeInventionVo> getGridResult(PatFreeInventionVo vo) throws KitechException {
    return dftDAO.executeDynamicSelectList("selectPatMastrMS02", vo);
  }


/**
 * 구매 검수 권한 담당자 조회
 * 
 * @author Chris
 * @param PatFreeInventionVo
 * @return PatFreeInventionVo
 * @throws KitechException
 * @since 2023.11.13.
 */
  @Override
  public PatFreeInventionVo getDeptToManager(PatFreeInventionVo vo) throws KitechException {
    return dftDAO.executeDynamicSelect("selectXodrEpuManSS02", vo);
  }


/**
 * 발명 신고서 결재 신청
 * 
 * @author Chris
 * @param PatFreeInventionListVo
 * @return PatFreeInventionVo
 * @throws KitechException
 * @since 2023.11.13.
 */
  @Override
  public PatFreeInventionVo approval(PatFreeInventionListVo vo) throws KitechException {
    PatFreeInventionVo retVo = new PatFreeInventionVo();

    PatFreeInventionVo core = vo.getCore();

    AprVo aprVo = new AprVo();
    aprVo.setReqNo(core.getReq_no());
    aprVo.setLoginUserId(core.getLogin_user_id());
    aprVo.setReporterId(core.getReporter_id());
    aprVo.setUiId(core.getUi_id());
    aprVo.setAprState(core.getApr_state());
    aprVo.setManager(core.getManager_id());
    aprVo.setEndpoint(core.getEndpoint());
    aprVo.setExt1Cd(core.getExt1_cd());
    aprVo.setExt2Cd(core.getExt2_cd());
    aprVo.setExt3Cd(core.getExt3_cd());

    core.setAttachVo1(attachDAO.selectListAttach(core.getFileList_A()));
    core.setAttachVo2(attachDAO.selectListAttach(core.getFileList_B()));
    core.setAttachVo3(attachDAO.selectListAttach(core.getFileList_C()));
    core.setAttachVo4(attachDAO.selectListAttach(core.getFileList_D()));
    core.setAttachVo5(attachDAO.selectListAttach(core.getFileList_E()));

    core.setTabData(vo.getTabData());
    
    // 출원인
    core.setVendList(vo.getVendList());

    // 자유발명자
    core.setInvntpsnList(vo.getInvntpsnList());

    // 발명내용 첨부파일
    core.setAttachtab2List(vo.getAttachtab2List());    
    
    apprFuncService.approvalRequest(aprVo, core);

    retVo.setReq_no(aprVo.getReqNo());
    return retVo;
  }


}
