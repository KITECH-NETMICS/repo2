package kr.re.kitech.biz.pat.chr.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.pat.chr.dao.PatChrCasRegstDAO;
import kr.re.kitech.biz.pat.chr.service.PatChrCasRegstService;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasInfoVo;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstListVo;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo;
import kr.re.kitech.biz.pat.chr.vo.PatMastrVo;
import kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo;
import kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo;
import kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo;
import kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo;
import kr.re.kitech.biz.pat.chr.vo.PatSmitappVo;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("patChrCasRegstServiceImpl")
public class PatChrCasRegstServiceImpl extends EgovAbstractServiceImpl implements PatChrCasRegstService {

    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;

    @Resource(name = "patComService")
    private PatComService patComService;

    @Resource(name = "patChrCasRegstDAO")
    private PatChrCasRegstDAO chrDAO;

    /**
     * 우선권주장번호 조회
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public List < PatPrioritySmitappVo > selectList01(PatPrioritySmitappVo vo) throws ElException {
        List < PatPrioritySmitappVo > list = chrDAO.selectList01(vo);
        return list;
    }

    /**
     * 등록내역 조회
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatChrCasRegstVo selectChrCasRegst(PatChrCasRegstVo vo) throws ElException {
        PatChrCasRegstVo resultVO = chrDAO.selectChrCasRegst(vo);
        return resultVO;
    }

    /**
     * 상태값 조회
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatChrCasRegstVo selectItem02(PatChrCasRegstVo vo) throws ElException {
        PatChrCasRegstVo resultVO = chrDAO.selectItem02(vo);
        return resultVO;
    }

    /**
     * 등록확인
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatChrCasRegstVo selectItem03(PatChrCasRegstVo vo) throws ElException {
        PatChrCasRegstVo resultVO = chrDAO.selectItem03(vo);
        return resultVO;
    }

    /**
     * 사건조회 출원사항탭 소연심의결과
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatRneCmtVo selectItem04(PatRneCmtVo vo) throws ElException {
        PatRneCmtVo resultVO = chrDAO.selectItem04(vo);
        return resultVO;
    }

    /**
     * 사건조회 출원사항 출원지시정보
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatSmitappVo selectItem05(PatSmitappVo vo) throws ElException {
        PatSmitappVo resultVO = chrDAO.selectItem05(vo);
        return resultVO;
    }

    /**
     * 사건조회 출원사항탭 출원완료보고정보
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatMastrVo selectItem06(PatMastrVo vo) throws ElException {
        PatMastrVo resultVO = chrDAO.selectItem06(vo);
        return resultVO;
    }

    /**
     * 등록 삽입
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public int insertItem01(PatRegstInsertVo vo) throws ElException, IOException {
        int result = chrDAO.insertItem01(vo);
        return result;
    }

    /**
     * 발명신고서 수정
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public int updateItem01(PatChrCasRegstVo vo) throws Exception {
        int result = chrDAO.updateItem01(vo);
        return result;
    }

    /**
     * 특허마스터 수정
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public int updateItem02(PatChrCasRegstVo vo) throws Exception {
        int result = chrDAO.updateItem02(vo);
        return result;
    }

    /**
     * 등록 수정
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public int updateItem03(PatRegstUpdateVo vo) throws Exception {
        int result = chrDAO.updateItem03(vo);
        return result;
    }

    /**
     * 등록삭제
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public int deleteItem01(PatChrCasRegstVo vo) throws Exception {
        return chrDAO.deleteItem01(vo);
    }


    /**
     * 출원내역조회
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatChrCasInfoVo selectChrCasPatSmitappMaster(PatChrCasRegstListVo vo) throws Exception {
        PatChrCasInfoVo retVo = new PatChrCasInfoVo();
        PatRneCmtVo param01 = vo.getPatRneCmtVo();
        PatSmitappVo param02 = vo.getPatSmitappVo();
        PatMastrVo param03 = vo.getPatMastrVo();
        PatPrioritySmitappVo param04 = vo.getPatPrioritySmitappVo();

        // 사건조회_출원사항_소연심위
        retVo.setPatRneCmtVo(chrDAO.selectItem04(param01)); // kitech.pat.chr.xda.PatRneCmtSS03

        // 사건조회_출원사항_출원지시정보
        retVo.setPatSmitappVo(chrDAO.selectItem05(param02)); // kitech.pat.chr.xda.PatSmitappSS03

        // 사건조회_출원사항_출원완료보고정보
        retVo.setPatMastrVo(chrDAO.selectItem06(param03)); // kitech.pat.chr.xda.PatMastrSS02

        // 지재권 > 출원사항 > 우선권주장번호 다건 조회
        retVo.setPatPrioritySmitappList(chrDAO.selectList01(param04)); // kitech.pat.mnt.xda.PatPrioritySmitappMS01

        return retVo;
    }


    /**
     * 등록내역 저장 삭제
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatChrCasRegstVo savePatChrRegst(PatChrCasRegstListVo vo) throws Exception {
        int result = 0;
        PatChrCasRegstVo retVo = new PatChrCasRegstVo();
        PatChrCasRegstVo param = vo.getPatChrCasRegstVo();

        String prcsClsf = param.getPrcs_clsf();
        if ("delete".equals(prcsClsf)) {
            // 등록 삭제 : deletePatRegst
            result = deletePatRegst(vo);
        } else {
            // 등록저장 : savePatRegst
            result = savePatRegst(vo);
        }
        AppLog.info("result : " + result);
        return retVo;
    }

    public int deletePatRegst(PatChrCasRegstListVo vo) throws Exception {
        int result = 0;
        PatChrCasRegstVo param = vo.getPatChrCasRegstVo();
        PatTotAcdtHisVo historyParam = vo.getPatTotAcdtHisVo();

        // 등록삭제
        result = chrDAO.deleteItem01(param); // kitech.pat.com.xda.PatRegstSD01

        /**
         * 이력삭제
         * 전체사건내역 저장
         */
        historyParam.setCud_type("D");
        patComService.savePatTotAcdtHis(historyParam);


        // 상태값조회
        PatChrCasRegstVo resultVO = chrDAO.selectItem02(param);
        String state = resultVO.getState();

        // 발명신고서 수정     
        PatChrCasRegstVo updateAppMastr = new PatChrCasRegstVo();
        updateAppMastr.setReq_no(param.getReq_no());
        updateAppMastr.setState(state);
        updateAppMastr.setApp_yn("N"); // 발명신고서외에서 수정 N, 발명신고서 수정 Y
        updateAppMastr.setUpdt_syspayno(param.getUpdt_syspayno());
        result = chrDAO.updateItem01(updateAppMastr); // kitech.pat.com.xda.PatAppMastrSU02


        // 특허마스터 수정
        PatChrCasRegstVo updateMastr = new PatChrCasRegstVo();
        updateMastr.setMngmt_no(param.getMngmt_no());
        updateMastr.setRegst_no("");
        updateMastr.setRegst_ymd("");
        updateMastr.setRegst_reg_ymd("");
        result = chrDAO.updateItem02(updateMastr); // kitech.pat.com.xda.PatMastrSU03

        return result;
    }


    public int savePatRegst(PatChrCasRegstListVo vo) throws Exception {
        int result = 0;
        PatChrCasRegstVo param01 = vo.getPatChrCasRegstVo();
        PatRegstInsertVo param02 = vo.getPatRegstInsertVo();
        PatRegstUpdateVo param03 = vo.getPatRegstUpdateVo();
        PatTotAcdtHisVo historyParam = vo.getPatTotAcdtHisVo();

        String reqNo = param01.getReq_no();
        String mngmtNo = param01.getMngmt_no();

        // ==========================================================
        // 01. 등록저장
        // ==========================================================

        // 등록확인
        PatChrCasRegstVo resultVO = chrDAO.selectItem03(param01); // kitech.pat.com.xda.PatRegstSS01

        if (resultVO == null) {
            // 등록 삽입
            result = chrDAO.insertItem01(param02); // kitech.pat.com.xda.PatRegstSI01
        } else {
            // 등록 수정
            result = chrDAO.updateItem03(param03); // kitech.pat.com.xda.PatRegstSU01
        }
        // ==========================================================
        // 02. 이력저장
        // ==========================================================
        patComService.savePatTotAcdtHis(historyParam);

        // ==========================================================
        // 03. 발명신고서 수정
        // ==========================================================
        PatChrCasRegstVo updateAppMastr = new PatChrCasRegstVo();
        updateAppMastr.setReq_no(param01.getReq_no());
        updateAppMastr.setState(param01.getState());
        updateAppMastr.setApp_yn("N"); // 발명신고서외에서 수정 N, 발명신고서 수정 Y
        updateAppMastr.setUpdt_syspayno(param01.getUpdt_syspayno());
        result = chrDAO.updateItem01(updateAppMastr); // kitech.pat.com.xda.PatAppMastrSU02


        // ==========================================================
        // 04. 특허마스터 수정
        // ==========================================================
        PatChrCasRegstVo updateMastr = new PatChrCasRegstVo();
        updateMastr.setMngmt_no(param01.getMngmt_no());
        updateMastr.setRegst_no(param01.getRegst_no());
        updateMastr.setRegst_ymd(param01.getRegst_ymd());
        updateMastr.setRegst_reg_ymd(param01.getRegst_reg_ymd());
        result = chrDAO.updateItem02(updateMastr); // kitech.pat.com.xda.PatMastrSU03

        return result;
    }



    /**
     * 등록 결재신청
     * @author 
     * @since 2023.08.21.
     */
    @Override
    public PatChrCasRegstVo excuteApproval(PatChrCasRegstListVo vo) throws Exception {

        PatChrCasRegstVo aprDoc = vo.getPatChrCasRegstVo();
        PatChrCasRegstVo retVo = new PatChrCasRegstVo();

        AprVo aprVo = new AprVo();
        aprVo.setReqNo(aprDoc.getReq_no());
        aprVo.setMainKey(aprDoc.getMain_key());
        aprVo.setDomOverseaClsf(aprDoc.getDom_oversea_clsf_cd());
        aprVo.setReporterId(aprDoc.getReporter_id());
        aprVo.setUiId(aprDoc.getUi_id());
        aprVo.setEndpoint(KitechContextUtil.getUserId());
        apprFuncService.approvalScreen(aprVo);

        retVo.setReqNo(aprDoc.getReq_no());
        return retVo;
    }

}