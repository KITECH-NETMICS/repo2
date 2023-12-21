package kr.re.kitech.biz.pat.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.app.dao.PatAppChangeDAO;
import kr.re.kitech.biz.pat.app.service.PatAppChangeService;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeListVo;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : PatAppChangeServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
@Service("patAppChangeServiceImpl")
public class PatAppChangeServiceImpl extends EgovAbstractServiceImpl implements PatAppChangeService {
    @Resource(name = "patAppChangeDAO")
    private PatAppChangeDAO appDAO;

    @Resource(name = "attachDAO")
    private AttachDAO attachDAO;

    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;

    @Resource(name = "apprCommonServiceImpl")
    private ApprCommonService aprComService;

    @Resource(name = "generationServiceImpl")
    private GenerationService genService;

    /**
     * 변경신청 조회
     * 
     * @author Chris
     * @param PatAppChangeVo
     * @return List<PatAppChangeVo>
     * @throws KitechException
     * @since 2023.11.21.
     */
    @Override
    public List < PatAppChangeVo > selectChangeList(PatAppChangeVo vo) throws KitechException {
        List < PatAppChangeVo > list = appDAO.executeDynamicSelectList("selectPatChngReqMS01", vo);
        return list;
    }

    /**
     * 변경신청 상세 조회
     * 
     * @author Chris
     * @param PatAppChangeVo
     * @return PatAppChangeListVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    @Override
    public PatAppChangeListVo selectChngInfo(PatAppChangeVo vo) throws KitechException {

        PatAppChangeListVo retListVo = new PatAppChangeListVo();

        String skateClsf = vo.getSkate_clsf();
        if ("PAS099".equals(skateClsf)) {

            // 현재차수 변경내역 조회
            List < PatAppChangeVo > srcList = appDAO.executeDynamicSelectList("selectPatRelatReschPrjHisMS02", vo); // 계정변경 이력 또는 변경신청 다건

            if (srcList.isEmpty()) {
                throw new KitechException(Exceptions.ERROR, Business.RSP, "message.xom.co.com.0002", new String[] { "계정변경, 변경신청 조회" }); // {0}에 실패하였습니다.
            }
            retListVo.setAfter(srcList);
            PatAppChangeVo srcVo = srcList.get(0);
            int hisSeq = Integer.parseInt(srcVo.getSeq());

            vo.setReq_no(srcVo.getReq_no());
            vo.setElecapp_docu_no("");
            vo.setSeq(String.valueOf(hisSeq - 1));
            retListVo.setBefore(appDAO.executeDynamicSelectList("selectPatRelatReschPrjHisMS02", vo)); // 계정변경 이력 또는 변경신청 다건
        } else {
            // 현재차수 변경내역 조회
            List < PatAppChangeVo > srcList = appDAO.executeDynamicSelectList("selectAppPatSkateRtHisMS01", vo); // 변경신청 저장 후 조회

            if (srcList.isEmpty()) {
                throw new KitechException(Exceptions.ERROR, Business.RSP, "message.xom.co.com.0002", new String[] { "변경신청 조회" }); // {0}에 실패하였습니다.
            }
            PatAppChangeVo srcVo = srcList.get(0);
            int hisSeq = srcVo.getHis_seq();
            retListVo.setAfter(srcList);

            //이전 차수 변경내역 조회
            vo.setReq_no(srcVo.getReq_no());
            vo.setMngmt_no(srcVo.getMngmt_no());
            vo.setElecapp_docu_no("");
            vo.setHis_seq(hisSeq - 1);
            retListVo.setBefore(appDAO.executeDynamicSelectList("selectAppPatSkateRtHisMS01", vo));
        }

        List<PatAppChangeVo> tempList = retListVo.getAfter();
        PatAppChangeVo temp = tempList.get(0);
        if(temp.getReq_no() != null){
        	IntfatabVo aprRetVo = aprComService.getXomxintfatab(temp.getReq_no());
            if(aprRetVo == null) aprRetVo = new IntfatabVo();
        	PatAppChangeVo sendVo = new PatAppChangeVo();
        	sendVo.setApr_state(aprRetVo.getAprState());
        	
            retListVo.setPatAppChangeVo( sendVo );
        }

        return retListVo;
    }

    /**
     * 공동발명자, 출원인, 연구과제 변경신청 저장
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    @Override
    public PatAppChangeVo savePatChngHis(PatAppChangeListVo vo) throws KitechException {
        PatAppChangeVo result = new PatAppChangeVo();
        PatAppChangeVo saveVo = vo.getSave();

        String scrnClsf = saveVo.getScrn_clsf();
        String skateClsf = saveVo.getSkate_clsf();

        if ("mgr".equals(scrnClsf)) {
            if ("PAS099".equals(skateClsf)) { // 연구과제  
                result = savePatRelatReschPrj(vo);
            } else if ("PAS010".equals(skateClsf)) { // 공동발명자
                result = savePatCoInvntPsn(vo);
            } else { //공동출원인
                result = savePatCoSmitAppVend(vo);
            }
        }
        if ("PAS099".equals(skateClsf)) {
            result = savePatRelatReschPrjHis(vo);
        } else {
            result = savePatSkateRtHis(vo);
        }

        return result;

    }

    /**
     * 관리자화면에서 연구과제 변경이력 저장 후 지식재산권 연구과제 생성
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    public PatAppChangeVo savePatRelatReschPrj(PatAppChangeListVo vo) throws KitechException {
        PatAppChangeVo retVo = new PatAppChangeVo();
        int result = 0;

        PatAppChangeVo saveVo = vo.getSave();
        List < PatAppChangeVo > saveList = vo.getSaveList();

        String sysPayNo = saveVo.getSyspayno();
        String reqNo = saveVo.getReq_no(); // 발명신고서 신청번호

        //지식재산권 연구과제 삭제
        result = appDAO.executeDynamicDelete("deletePatRelatReschPrjSD01", saveVo);

        for (PatAppChangeVo list: saveList) {
            list.setReq_no(reqNo);
            list.setRegst_syspayno(sysPayNo);
            appDAO.executeDynamicInsert("insertPatRelatReschPrjSI01", list);
        }
        AppLog.debug(String.valueOf(result));
        return retVo;
    }

    /**
     * 관리자화면에서 공동발명자 변경이력 저장 후 지식재산권 공동발명자생성
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    public PatAppChangeVo savePatCoInvntPsn(PatAppChangeListVo vo) throws KitechException {
        PatAppChangeVo retVo = new PatAppChangeVo();
        int result = 0;

        PatAppChangeVo saveVo = vo.getSave();
        List < PatAppChangeVo > saveList = vo.getSaveList();

        String sysPayNo = saveVo.getSyspayno();
        String reqNo = saveVo.getReq_no(); // 발명신고서 신청번호
        String mngmtNo = saveVo.getMngmt_no(); // 지재권 관리번호
        String attachFileNo = saveVo.getAttach_file_no();

        //공동발명자 삭제
        result = appDAO.executeDynamicDelete("deletePatCoInvntPsnSD01", saveVo);

        for (PatAppChangeVo list: saveList) {
            list.setReq_no(reqNo);
            list.setMngmt_no(mngmtNo);
            list.setAttach_file_no(attachFileNo);
            list.setRegst_syspayno(sysPayNo);
            list.setStake_dept(list.getInvnt_psn_clsf());

            result = appDAO.executeDynamicInsert("insertPatCoInvntPsnSI01", list);

            //patmastr 주발명자 수정
            list.getInvnt_psn_clsf();
            if ("1".equals(list.getInvnt_psn_clsf())) {
                PatAppChangeVo param = new PatAppChangeVo();
                param.setReq_no(reqNo);
                param.setMngmt_no(mngmtNo);
                param.setInvnt_syspayno(list.getSyspayno());
                result = appDAO.executeDynamicUpdate("updatePatMastrSU01", param);
            }
        }
        AppLog.debug(String.valueOf(result));
        return retVo;
    }

    /**
     * 관리자화면에서 공동출원인 변경이력 저장 후 지식재산권 공동출원인 생성
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    public PatAppChangeVo savePatCoSmitAppVend(PatAppChangeListVo vo) throws KitechException {
        PatAppChangeVo retVo = new PatAppChangeVo();
        int result = 0;

        PatAppChangeVo saveVo = vo.getSave();
        List < PatAppChangeVo > saveList = vo.getSaveList();

        String sysPayNo = saveVo.getSyspayno();
        String reqNo = saveVo.getReq_no(); // 발명신고서 신청번호
        String mngmtNo = saveVo.getMngmt_no(); // 지재권 관리번호
        String attachFileNo = saveVo.getAttach_file_no();

        //지식재산권 공동출원인 삭제
        result = appDAO.executeDynamicDelete("deletePatCoSmitappVendSD01", saveVo);

        for (PatAppChangeVo list: saveList) {
            list.setReq_no(reqNo);
            list.setMngmt_no(mngmtNo);
            list.setAttach_file_no(attachFileNo);
            list.setRegst_syspayno(sysPayNo);

            result = appDAO.executeDynamicInsert("insertPatCoSmitappVendSI01", list);
        }

        //patmastr 공동발명여부 수정
        String coSmitappEx = "N";
        if (saveList.size() > 1) coSmitappEx = "Y";

        PatAppChangeVo param = new PatAppChangeVo();
        param.setReq_no(reqNo);
        param.setMngmt_no(mngmtNo);
        param.setCo_smitapp_ex(coSmitappEx);

        result = appDAO.executeDynamicUpdate("updatePatMastrSU01", param);
        
        AppLog.debug(String.valueOf(result));
        return retVo;
    }


    /**
     * 연구과제 변경신청 저장
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    public PatAppChangeVo savePatRelatReschPrjHis(PatAppChangeListVo vo) throws KitechException {

        PatAppChangeVo retVo = new PatAppChangeVo();

        int result = 0;

        PatAppChangeVo saveVo = vo.getSave();
        List < PatAppChangeVo > saveList = vo.getSaveList();
        List < PatAppChangeVo > bfSaveList = vo.getBfSaveList();


        String saveClsf = saveVo.getSave_clsf();
        String sysPayNo = saveVo.getSyspayno();
        String chngCause = saveVo.getChng_cause(); // 변경사유
        String reqNo = saveVo.getReq_no(); // 발명신고서 신청번호
        String appReqNo = saveVo.getApp_req_no();
        String bfSeq = saveVo.getBf_seq(); // 변경차수
        String hisSeq = String.valueOf(saveVo.getHis_seq()); // 변경차수

        if ("".equals(hisSeq.trim())) {
            PatAppChangeVo rVo = appDAO.executeDynamicSelect("selectPatRelatReschPrjSS02", saveVo);
            if (rVo == null) {
                throw new KitechException(Exceptions.ERROR, Business.RSP, "message.xom.co.com.0002", new String[] { "seq 조회" }); // {0}에 실패하였습니다.
            }
            hisSeq = rVo.getSeq();
        }

        String inputYmd = saveVo.getInput_ymd();

        if ("I".equals(saveClsf)) {
            String serviceId = saveVo.getUi_id();
            appReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I09");
            // 인터페이스 테이블 저장
            aprComService.createAprInterface(appReqNo, serviceId, KitechContextUtil.getUserId());
        }

        // patrelatreschprjhis 모두 삭제
        saveVo.setSeq(hisSeq);
        result = appDAO.executeDynamicDelete("deletePatRelatReschPrjHisSD01", saveVo);

        String attachFileNo = saveVo.getAttach_file_no();

        // patrelatreschprjhis 저장
        for (PatAppChangeVo list: saveList) {
            list.setReq_no(reqNo);
            list.setElecapp_docu_no(appReqNo);
            list.setInput_ymd(inputYmd);
            list.setAcdt_unusual_item(chngCause);
            list.setAttach_file_no(attachFileNo);
            list.setSeq(hisSeq);
            list.setRegst_syspayno(sysPayNo);

            result = appDAO.executeDynamicInsert("insertPatRelatReschPrjHisSI01", list);
        }

        PatAppChangeVo saveParam = new PatAppChangeVo();

        if (bfSeq.equals("0")) {

            if (bfSaveList.size() > 0) {

                saveVo.setSeq("0");
                result = appDAO.executeDynamicDelete("deletePatRelatReschPrjHisSD01", saveVo);

                saveParam = bfSaveList.get(0);

                saveParam.setReq_no(reqNo);
                saveParam.setElecapp_docu_no("");
                saveParam.setInput_ymd(inputYmd);
                saveParam.setAcdt_unusual_item(chngCause);
                saveParam.setAttach_file_no("");
                saveParam.setSeq("0");
                saveParam.setRegst_syspayno(sysPayNo);

            } else {
                saveParam.setReq_no(reqNo);
                saveParam.setElecapp_docu_no("");
                saveParam.setInput_ymd(inputYmd);
                saveParam.setAcdt_unusual_item(chngCause);
                saveParam.setAttach_file_no("");
                saveParam.setSeq("0");
                saveParam.setRegst_syspayno(sysPayNo);
            }
            result = appDAO.executeDynamicInsert("insertPatRelatReschPrjHisSI01", saveParam);
        }
        
        AppLog.debug(String.valueOf(result));
        retVo.setApp_req_no(appReqNo);
        return retVo;
    }


    /**
     * 공동발명자, 출원인 변경신청 저장
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    public PatAppChangeVo savePatSkateRtHis(PatAppChangeListVo vo) throws KitechException {

        PatAppChangeVo retVo = new PatAppChangeVo();

        int result = 0;

        PatAppChangeVo saveVo = vo.getSave();
        List < PatAppChangeVo > saveList = vo.getSaveList();
        List < PatAppChangeVo > bfSaveList = vo.getBfSaveList();
        List < PatAppChangeVo > deleteList = vo.getDeleteList();

        String skateClsf = saveVo.getSkate_clsf();
        String scrnClsf = saveVo.getScrn_clsf();

        String saveClsf = saveVo.getSave_clsf();
        String sysPayNo = saveVo.getSyspayno();
        String chngCause = saveVo.getChng_cause(); // 변경사유
        String reqNo = saveVo.getReq_no(); // 발명신고서 신청번호
        String mngmtNo = saveVo.getMngmt_no(); // 지재권 관리번호
        String inputYmd = saveVo.getInput_ymd();
        String appReqNo = saveVo.getApp_req_no();
        int hisSeq = -1;
        hisSeq = saveVo.getHis_seq(); // 변경차수

        if (hisSeq < 0) {
            PatAppChangeVo rVo = appDAO.executeDynamicSelect("selectPatSkatertHisSS03", saveVo);
            hisSeq = rVo.getHis_seq();
        }

        if ("I".equals(saveClsf)) {
            String docId = "I07"; // 발명자
            if ("PAS020".equals(skateClsf)) {
                docId = "I08"; // 출원인
            }
            appReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), docId);

            if ("".equals(scrnClsf)) {
                // 인터페이스 테이블 저장
                String serviceId = saveVo.getUi_id();
                aprComService.createAprInterface(appReqNo, serviceId, KitechContextUtil.getUserId());
            }
        }

        String attachFileNo = saveVo.getAttach_file_no();

        if (!bfSaveList.isEmpty()) {
            for (PatAppChangeVo list: bfSaveList) {

                list.setReq_no(reqNo);
                list.setMngmt_no(mngmtNo);
                if ("PAS020".equals(skateClsf)) { //출원업체
                    list.setBlong_clsf(list.getVend_type());
                }
                list.setSkate_clsf(skateClsf);
                list.setInput_ymd(inputYmd);
                list.setAcdt_unusual_item(chngCause);
                list.setHis_seq(0);
                list.setRegst_syspayno(sysPayNo);
                result = appDAO.executeDynamicInsert("insertPatSkatertHisSI01", list);
            }
        }
        // patskaterthis 삭제
        if (!deleteList.isEmpty()) {
            for (PatAppChangeVo list: deleteList) {
                result = appDAO.executeDynamicDelete("deletePatSkatertHisSD01", list);
            }
        }

        // patskaterthis 저장
        for (PatAppChangeVo list: saveList) {

            String cudType = list.getRowStatus();

            list.setReq_no(reqNo);
            list.setMngmt_no(mngmtNo);
            list.setElecapp_docu_no(appReqNo);

            if ("PAS020".equals(skateClsf)) { //출원업체
                list.setBlong_clsf(saveVo.getVend_type());
            }
            list.setSkate_clsf(skateClsf);
            list.setInput_ymd(inputYmd);
            list.setAcdt_unusual_item(chngCause);
            list.setAttach_file_no(attachFileNo);
            list.setHis_seq(hisSeq);

            if ("C".equals(cudType)) {
                list.setRegst_syspayno(sysPayNo);
                result = appDAO.executeDynamicInsert("insertPatSkatertHisSI01", list);
            } else {
                list.setUpdt_syspayno(sysPayNo);
                result = appDAO.executeDynamicUpdate("updatePatSkatertHisSU01", list);
            }
        }
        
        AppLog.debug(String.valueOf(result));

        retVo.setApp_req_no(appReqNo);
        return retVo;
    }


    /**
     * 변경이력 삭제
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return int
     * @throws KitechException
     * @since 2023.11.22.
     */
    @Override
    public int deletePatChngHis(PatAppChangeVo vo) throws KitechException {
        int result = 0;
        // 스냅샷삭제
        String reqNo = vo.getReq_no();
        aprComService.deleteApr(reqNo);

        String skateClsf = vo.getSkate_clsf();

        if ("PAS099".equals(skateClsf)) {
            result = appDAO.executeDynamicDelete("deletePatRelatReschPrjHisSD02", vo);
        } else {

            result = appDAO.executeDynamicDelete("deletePatSkatertHisSD02", vo);
        }

        return result;
    }

    /**
     * 변경(공동발명자 지분율)내역 조회
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeListVo
     * @throws KitechException
     * @since 2023.11.22.
     */
    @Override
    public PatAppChangeListVo selectHisResult(PatAppChangeVo vo) throws KitechException {
        PatAppChangeListVo retVo = new PatAppChangeListVo();
        PatAppChangeVo hisdata = new PatAppChangeVo();

        String skateClsf = vo.getSkate_clsf();
        String hisSeqMax = "";

        if( "PAS099".equals(skateClsf) ){
            PatAppChangeVo retVo1 = appDAO.executeDynamicSelect("selectPatRelatReschPrjHisSS01", vo);
            hisSeqMax = retVo1.getHis_seq_max();
        }else{
            PatAppChangeVo retVo2 = appDAO.executeDynamicSelect("selectPatSkatertHisMS07", vo);
            hisSeqMax = retVo2.getHis_seq_max();
        }

        if( "PAS010".equals(skateClsf) ){
            retVo.setPatAppChangeVoList(appDAO.executeDynamicSelectList("selectPatSkatertHisMS01", vo)); // 공동발명자
        }else if("PAS020".equals(skateClsf)){
            retVo.setPatAppChangeVoList(appDAO.executeDynamicSelectList("selectPatSkatertHisMS02", vo)); // 공동출원인
        }else {
            retVo.setPatAppChangeVoList(appDAO.executeDynamicSelectList("selectPatRelatResChprjMS01", vo)); // 계정번호
        }
        // his_seq_max
        hisdata.setHis_seq_max(hisSeqMax);
        retVo.setHisdata(hisdata);

        return retVo;
    }

    /**
     * 출원인 변경신청시 공동발명자 조회
     * 
     * @author Chris
     * @param PatAppChangeVo
     * @return List<PatAppChangeVo>
     * @throws KitechException
     * @since 2023.11.21.
     */
    @Override
    public List<PatAppChangeVo> getInvenPsn(PatAppChangeVo vo) throws KitechException {
        List <PatAppChangeVo> list = appDAO.executeDynamicSelectList("selectPatSkatertHisMS01", vo);
        return list;
    }

    /**
     * 연구과제 변경신청시 주발명자 조회
     * 
     * @author Chris
     * @param PatAppChangeVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    @Override
    public PatAppChangeVo getMainInvenPsn(PatAppChangeVo vo) throws KitechException {
        return appDAO.executeDynamicSelect("selectPatCoInvntPsnSS01", vo);
    }

    /**
     * 변경 결재 신청
     * 
     * @author Chris
     * @param PatAppChangeListVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.21.
     */
    @Override
    public PatAppChangeVo approval(PatAppChangeListVo vo) throws KitechException {
        PatAppChangeVo retVo = new PatAppChangeVo();

        PatAppChangeVo core = vo.getCore();
        List<PatAppChangeVo> after = vo.getAfter();
        List<PatAppChangeVo> before = vo.getBefore();

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
        aprVo.setInfoCd(core.getInfo_cd());
        aprVo.setResearcher(core.getResearcher_id());
        aprVo.setMainResearcher(core.getMain_researcher_id());
        aprVo.setApplyYn(core.getApply_yn_cd());

        core.setAttachVo1(attachDAO.selectListAttach(core.getFileList_A()));

        core.setAfter(after);
        core.setBefore(before);
        
        apprFuncService.approvalRequest(aprVo, core);

        retVo.setReq_no(aprVo.getReqNo());
        return retVo;
    }

    /**
     * 지재권 기본 정보 조회
     * 
     * @author Chris
     * @param PatAppChangeVo
     * @return PatAppChangeVo
     * @throws KitechException
     * @since 2023.11.23.
     */
    @Override
    public PatAppChangeVo selectBasicInfo(PatAppChangeVo vo) throws KitechException {
        return appDAO.executeDynamicSelect("selectPatPsrBasicInfoSS01", vo);
    }
        

}