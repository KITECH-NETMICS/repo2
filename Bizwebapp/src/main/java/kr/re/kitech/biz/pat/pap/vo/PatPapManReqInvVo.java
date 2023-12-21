package kr.re.kitech.biz.pat.pap.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPapManReqInvExp")
public class PatPapManReqInvVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPapManReqInvVo(){
    }

    @ElDtoField(logicalName = "appId", physicalName = "app_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_id;

    @ElDtoField(logicalName = "refId", physicalName = "ref_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_id;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "jobStateCd", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;

    @ElDtoField(logicalName = "jobStateNmDetail", physicalName = "job_state_nm_detail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_nm_detail;

    @ElDtoField(logicalName = "jobStateNm", physicalName = "job_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_nm;

    @ElDtoField(logicalName = "reqPsnSyspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "reqPsnNm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "reqDaytm", physicalName = "req_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_daytm;

    @ElDtoField(logicalName = "reqAppClsf", physicalName = "req_app_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_app_clsf;

    @ElDtoField(logicalName = "reqAppClsfNm", physicalName = "req_app_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_app_clsf_nm;

    @ElDtoField(logicalName = "reqPubYn", physicalName = "req_pub_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_pub_yn;

    @ElDtoField(logicalName = "reqPubYnNm", physicalName = "req_pub_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_pub_yn_nm;

    @ElDtoField(logicalName = "reqClaimYn", physicalName = "req_claim_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_claim_yn;

    @ElDtoField(logicalName = "reqClaimYnNm", physicalName = "req_claim_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_claim_yn_nm;

    @ElDtoField(logicalName = "reqDueDate", physicalName = "req_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_due_date;

    @ElDtoField(logicalName = "reqComment", physicalName = "req_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_comment;

    @ElDtoField(logicalName = "reqAttachFile", physicalName = "req_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_attach_file;

    @ElDtoField(logicalName = "patoficCd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "patoficChargId", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "patoficChargNm", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "reqNtisNo", physicalName = "req_ntis_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ntis_no;

    @ElDtoField(logicalName = "comPatoficCd", physicalName = "com_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_cd;

    @ElDtoField(logicalName = "comPatoficChargId", physicalName = "com_patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_charg_id;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "comPsnSyspayno", physicalName = "com_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_psn_syspayno;

    @ElDtoField(logicalName = "comDueDate", physicalName = "com_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_due_date;

    @ElDtoField(logicalName = "comComment", physicalName = "com_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_comment;

    @ElDtoField(logicalName = "comAttachFile", physicalName = "com_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_attach_file;

    @ElDtoField(logicalName = "comPsnNm", physicalName = "com_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_psn_nm;

    @ElDtoField(logicalName = "comDaytm", physicalName = "com_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_daytm;

    @ElDtoField(logicalName = "comPatoficNm", physicalName = "com_patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_nm;

    @ElDtoField(logicalName = "comPatoficChargNm", physicalName = "com_patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_charg_nm;

    @ElDtoField(logicalName = "psnSyspayno", physicalName = "psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_syspayno;

    @ElDtoField(logicalName = "rcptWriId", physicalName = "rcpt_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_wri_id;

    @ElDtoField(logicalName = "rcptPsnId", physicalName = "rcpt_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_id;

    @ElDtoField(logicalName = "rcptAdmId", physicalName = "rcpt_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_adm_id;

    @ElDtoField(logicalName = "rcptWriNm", physicalName = "rcpt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_wri_nm;

    @ElDtoField(logicalName = "rcptPsnNm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcptAdmNm", physicalName = "rcpt_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_adm_nm;

    @ElDtoField(logicalName = "rcptDaytm", physicalName = "rcpt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_daytm;

    @ElDtoField(logicalName = "rcptChargPsnId", physicalName = "rcpt_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_charg_psn_id;

    @ElDtoField(logicalName = "rcptChargPsnNm", physicalName = "rcpt_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_charg_psn_nm;

    @ElDtoField(logicalName = "rcptPatoficMngNo", physicalName = "rcpt_patofic_mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_patofic_mng_no;

    @ElDtoField(logicalName = "prtWriId", physicalName = "prt_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_wri_id;

    @ElDtoField(logicalName = "prtPsnId", physicalName = "prt_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_psn_id;

    @ElDtoField(logicalName = "prtAdmId", physicalName = "prt_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_adm_id;

    @ElDtoField(logicalName = "prtWriNm", physicalName = "prt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_wri_nm;

    @ElDtoField(logicalName = "prtPsnNm", physicalName = "prt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_psn_nm;

    @ElDtoField(logicalName = "prtAdmNm", physicalName = "prt_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_adm_nm;

    @ElDtoField(logicalName = "prtDaytm", physicalName = "prt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_daytm;

    @ElDtoField(logicalName = "prtChargPsnId", physicalName = "prt_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_charg_psn_id;

    @ElDtoField(logicalName = "prtChargPsnNm", physicalName = "prt_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_charg_psn_nm;

    @ElDtoField(logicalName = "prtAppNo", physicalName = "prt_app_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_app_no;

    @ElDtoField(logicalName = "prtAppDate", physicalName = "prt_app_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_app_date;

    @ElDtoField(logicalName = "prtIndepCnt", physicalName = "prt_indep_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_indep_cnt;

    @ElDtoField(logicalName = "prtDepenCnt", physicalName = "prt_depen_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_depen_cnt;

    @ElDtoField(logicalName = "prtSpecCnt", physicalName = "prt_spec_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_spec_cnt;

    @ElDtoField(logicalName = "prtDrawCnt", physicalName = "prt_draw_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_draw_cnt;

    @ElDtoField(logicalName = "prtKoAppTitle", physicalName = "prt_ko_app_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_ko_app_title;

    @ElDtoField(logicalName = "prtEnAppTitle", physicalName = "prt_en_app_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_en_app_title;

    @ElDtoField(logicalName = "prtComment", physicalName = "prt_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_comment;

    @ElDtoField(logicalName = "prtAppAttachFile", physicalName = "prt_app_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_app_attach_file;

    @ElDtoField(logicalName = "prtAttachFile", physicalName = "prt_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_attach_file;

    @ElDtoField(logicalName = "evalPsnSyspayno", physicalName = "eval_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspayno;

    @ElDtoField(logicalName = "evalPsnNm", physicalName = "eval_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_nm;

    @ElDtoField(logicalName = "evalDaytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;

    @ElDtoField(logicalName = "evalServiceScr", physicalName = "eval_service_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_service_scr;

    @ElDtoField(logicalName = "evalResultScr", physicalName = "eval_result_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_result_scr;

    @ElDtoField(logicalName = "evalComment", physicalName = "eval_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_comment;

    @ElDtoField(logicalName = "evalExpirYmd", physicalName = "eval_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_expir_ymd;

    @ElDtoField(logicalName = "smitappRegYmd", physicalName = "smitapp_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_reg_ymd;

    @ElDtoField(logicalName = "demndId", physicalName = "demnd_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_id;

    @ElDtoField(logicalName = "askPsnSyspayno", physicalName = "ask_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ask_psn_syspayno;

    @ElDtoField(logicalName = "reqPatoficCd", physicalName = "req_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_patofic_cd;

    @ElDtoField(logicalName = "hopePatoficChargId", physicalName = "hope_patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_charg_id;

    @ElDtoField(logicalName = "actNo", physicalName = "act_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_no;

    @ElDtoField(logicalName = "actCd", physicalName = "act_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_cd;

    @ElDtoField(logicalName = "actSyspayno", physicalName = "act_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_syspayno;

    @ElDtoField(logicalName = "next_state_cd", physicalName = "next_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String next_state_cd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "ref_key", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "docu_clsf", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;

    @ElDtoField(logicalName = "bf_state", physicalName = "bf_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bf_state;

    @ElDtoField(logicalName = "curr_state_cd", physicalName = "curr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_state_cd;

    @ElDtoField(logicalName = "eval_demnd_ex", physicalName = "eval_demnd_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_demnd_ex;

    @ElVoField(physicalName = "app_id")
    public String getApp_id(){
        return app_id;
    }

    @ElVoField(physicalName = "app_id")
    public void setApp_id(String app_id){
        this.app_id = app_id;
    }

    @ElVoField(physicalName = "ref_id")
    public String getRef_id(){
        return ref_id;
    }

    @ElVoField(physicalName = "ref_id")
    public void setRef_id(String ref_id){
        this.ref_id = ref_id;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "job_state_cd")
    public String getJob_state_cd(){
        return job_state_cd;
    }

    @ElVoField(physicalName = "job_state_cd")
    public void setJob_state_cd(String job_state_cd){
        this.job_state_cd = job_state_cd;
    }

    @ElVoField(physicalName = "job_state_nm_detail")
    public String getJob_state_nm_detail(){
        return job_state_nm_detail;
    }

    @ElVoField(physicalName = "job_state_nm_detail")
    public void setJob_state_nm_detail(String job_state_nm_detail){
        this.job_state_nm_detail = job_state_nm_detail;
    }

    @ElVoField(physicalName = "job_state_nm")
    public String getJob_state_nm(){
        return job_state_nm;
    }

    @ElVoField(physicalName = "job_state_nm")
    public void setJob_state_nm(String job_state_nm){
        this.job_state_nm = job_state_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_daytm")
    public String getReq_daytm(){
        return req_daytm;
    }

    @ElVoField(physicalName = "req_daytm")
    public void setReq_daytm(String req_daytm){
        this.req_daytm = req_daytm;
    }

    @ElVoField(physicalName = "req_app_clsf")
    public String getReq_app_clsf(){
        return req_app_clsf;
    }

    @ElVoField(physicalName = "req_app_clsf")
    public void setReq_app_clsf(String req_app_clsf){
        this.req_app_clsf = req_app_clsf;
    }

    @ElVoField(physicalName = "req_app_clsf_nm")
    public String getReq_app_clsf_nm(){
        return req_app_clsf_nm;
    }

    @ElVoField(physicalName = "req_app_clsf_nm")
    public void setReq_app_clsf_nm(String req_app_clsf_nm){
        this.req_app_clsf_nm = req_app_clsf_nm;
    }

    @ElVoField(physicalName = "req_pub_yn")
    public String getReq_pub_yn(){
        return req_pub_yn;
    }

    @ElVoField(physicalName = "req_pub_yn")
    public void setReq_pub_yn(String req_pub_yn){
        this.req_pub_yn = req_pub_yn;
    }

    @ElVoField(physicalName = "req_pub_yn_nm")
    public String getReq_pub_yn_nm(){
        return req_pub_yn_nm;
    }

    @ElVoField(physicalName = "req_pub_yn_nm")
    public void setReq_pub_yn_nm(String req_pub_yn_nm){
        this.req_pub_yn_nm = req_pub_yn_nm;
    }

    @ElVoField(physicalName = "req_claim_yn")
    public String getReq_claim_yn(){
        return req_claim_yn;
    }

    @ElVoField(physicalName = "req_claim_yn")
    public void setReq_claim_yn(String req_claim_yn){
        this.req_claim_yn = req_claim_yn;
    }

    @ElVoField(physicalName = "req_claim_yn_nm")
    public String getReq_claim_yn_nm(){
        return req_claim_yn_nm;
    }

    @ElVoField(physicalName = "req_claim_yn_nm")
    public void setReq_claim_yn_nm(String req_claim_yn_nm){
        this.req_claim_yn_nm = req_claim_yn_nm;
    }

    @ElVoField(physicalName = "req_due_date")
    public String getReq_due_date(){
        return req_due_date;
    }

    @ElVoField(physicalName = "req_due_date")
    public void setReq_due_date(String req_due_date){
        this.req_due_date = req_due_date;
    }

    @ElVoField(physicalName = "req_comment")
    public String getReq_comment(){
        return req_comment;
    }

    @ElVoField(physicalName = "req_comment")
    public void setReq_comment(String req_comment){
        this.req_comment = req_comment;
    }

    @ElVoField(physicalName = "req_attach_file")
    public String getReq_attach_file(){
        return req_attach_file;
    }

    @ElVoField(physicalName = "req_attach_file")
    public void setReq_attach_file(String req_attach_file){
        this.req_attach_file = req_attach_file;
    }

    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }

    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public String getPatofic_charg_id(){
        return patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public void setPatofic_charg_id(String patofic_charg_id){
        this.patofic_charg_id = patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public String getPatofic_charg_nm(){
        return patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public void setPatofic_charg_nm(String patofic_charg_nm){
        this.patofic_charg_nm = patofic_charg_nm;
    }

    @ElVoField(physicalName = "req_ntis_no")
    public String getReq_ntis_no(){
        return req_ntis_no;
    }

    @ElVoField(physicalName = "req_ntis_no")
    public void setReq_ntis_no(String req_ntis_no){
        this.req_ntis_no = req_ntis_no;
    }

    @ElVoField(physicalName = "com_patofic_cd")
    public String getCom_patofic_cd(){
        return com_patofic_cd;
    }

    @ElVoField(physicalName = "com_patofic_cd")
    public void setCom_patofic_cd(String com_patofic_cd){
        this.com_patofic_cd = com_patofic_cd;
    }

    @ElVoField(physicalName = "com_patofic_charg_id")
    public String getCom_patofic_charg_id(){
        return com_patofic_charg_id;
    }

    @ElVoField(physicalName = "com_patofic_charg_id")
    public void setCom_patofic_charg_id(String com_patofic_charg_id){
        this.com_patofic_charg_id = com_patofic_charg_id;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "com_psn_syspayno")
    public String getCom_psn_syspayno(){
        return com_psn_syspayno;
    }

    @ElVoField(physicalName = "com_psn_syspayno")
    public void setCom_psn_syspayno(String com_psn_syspayno){
        this.com_psn_syspayno = com_psn_syspayno;
    }

    @ElVoField(physicalName = "com_due_date")
    public String getCom_due_date(){
        return com_due_date;
    }

    @ElVoField(physicalName = "com_due_date")
    public void setCom_due_date(String com_due_date){
        this.com_due_date = com_due_date;
    }

    @ElVoField(physicalName = "com_comment")
    public String getCom_comment(){
        return com_comment;
    }

    @ElVoField(physicalName = "com_comment")
    public void setCom_comment(String com_comment){
        this.com_comment = com_comment;
    }

    @ElVoField(physicalName = "com_attach_file")
    public String getCom_attach_file(){
        return com_attach_file;
    }

    @ElVoField(physicalName = "com_attach_file")
    public void setCom_attach_file(String com_attach_file){
        this.com_attach_file = com_attach_file;
    }

    @ElVoField(physicalName = "com_psn_nm")
    public String getCom_psn_nm(){
        return com_psn_nm;
    }

    @ElVoField(physicalName = "com_psn_nm")
    public void setCom_psn_nm(String com_psn_nm){
        this.com_psn_nm = com_psn_nm;
    }

    @ElVoField(physicalName = "com_daytm")
    public String getCom_daytm(){
        return com_daytm;
    }

    @ElVoField(physicalName = "com_daytm")
    public void setCom_daytm(String com_daytm){
        this.com_daytm = com_daytm;
    }

    @ElVoField(physicalName = "com_patofic_nm")
    public String getCom_patofic_nm(){
        return com_patofic_nm;
    }

    @ElVoField(physicalName = "com_patofic_nm")
    public void setCom_patofic_nm(String com_patofic_nm){
        this.com_patofic_nm = com_patofic_nm;
    }

    @ElVoField(physicalName = "com_patofic_charg_nm")
    public String getCom_patofic_charg_nm(){
        return com_patofic_charg_nm;
    }

    @ElVoField(physicalName = "com_patofic_charg_nm")
    public void setCom_patofic_charg_nm(String com_patofic_charg_nm){
        this.com_patofic_charg_nm = com_patofic_charg_nm;
    }

    @ElVoField(physicalName = "psn_syspayno")
    public String getPsn_syspayno(){
        return psn_syspayno;
    }

    @ElVoField(physicalName = "psn_syspayno")
    public void setPsn_syspayno(String psn_syspayno){
        this.psn_syspayno = psn_syspayno;
    }

    @ElVoField(physicalName = "rcpt_wri_id")
    public String getRcpt_wri_id(){
        return rcpt_wri_id;
    }

    @ElVoField(physicalName = "rcpt_wri_id")
    public void setRcpt_wri_id(String rcpt_wri_id){
        this.rcpt_wri_id = rcpt_wri_id;
    }

    @ElVoField(physicalName = "rcpt_psn_id")
    public String getRcpt_psn_id(){
        return rcpt_psn_id;
    }

    @ElVoField(physicalName = "rcpt_psn_id")
    public void setRcpt_psn_id(String rcpt_psn_id){
        this.rcpt_psn_id = rcpt_psn_id;
    }

    @ElVoField(physicalName = "rcpt_adm_id")
    public String getRcpt_adm_id(){
        return rcpt_adm_id;
    }

    @ElVoField(physicalName = "rcpt_adm_id")
    public void setRcpt_adm_id(String rcpt_adm_id){
        this.rcpt_adm_id = rcpt_adm_id;
    }

    @ElVoField(physicalName = "rcpt_wri_nm")
    public String getRcpt_wri_nm(){
        return rcpt_wri_nm;
    }

    @ElVoField(physicalName = "rcpt_wri_nm")
    public void setRcpt_wri_nm(String rcpt_wri_nm){
        this.rcpt_wri_nm = rcpt_wri_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_adm_nm")
    public String getRcpt_adm_nm(){
        return rcpt_adm_nm;
    }

    @ElVoField(physicalName = "rcpt_adm_nm")
    public void setRcpt_adm_nm(String rcpt_adm_nm){
        this.rcpt_adm_nm = rcpt_adm_nm;
    }

    @ElVoField(physicalName = "rcpt_daytm")
    public String getRcpt_daytm(){
        return rcpt_daytm;
    }

    @ElVoField(physicalName = "rcpt_daytm")
    public void setRcpt_daytm(String rcpt_daytm){
        this.rcpt_daytm = rcpt_daytm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_id")
    public String getRcpt_charg_psn_id(){
        return rcpt_charg_psn_id;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_id")
    public void setRcpt_charg_psn_id(String rcpt_charg_psn_id){
        this.rcpt_charg_psn_id = rcpt_charg_psn_id;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public String getRcpt_charg_psn_nm(){
        return rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public void setRcpt_charg_psn_nm(String rcpt_charg_psn_nm){
        this.rcpt_charg_psn_nm = rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_patofic_mng_no")
    public String getRcpt_patofic_mng_no(){
        return rcpt_patofic_mng_no;
    }

    @ElVoField(physicalName = "rcpt_patofic_mng_no")
    public void setRcpt_patofic_mng_no(String rcpt_patofic_mng_no){
        this.rcpt_patofic_mng_no = rcpt_patofic_mng_no;
    }

    @ElVoField(physicalName = "prt_wri_id")
    public String getPrt_wri_id(){
        return prt_wri_id;
    }

    @ElVoField(physicalName = "prt_wri_id")
    public void setPrt_wri_id(String prt_wri_id){
        this.prt_wri_id = prt_wri_id;
    }

    @ElVoField(physicalName = "prt_psn_id")
    public String getPrt_psn_id(){
        return prt_psn_id;
    }

    @ElVoField(physicalName = "prt_psn_id")
    public void setPrt_psn_id(String prt_psn_id){
        this.prt_psn_id = prt_psn_id;
    }

    @ElVoField(physicalName = "prt_adm_id")
    public String getPrt_adm_id(){
        return prt_adm_id;
    }

    @ElVoField(physicalName = "prt_adm_id")
    public void setPrt_adm_id(String prt_adm_id){
        this.prt_adm_id = prt_adm_id;
    }

    @ElVoField(physicalName = "prt_wri_nm")
    public String getPrt_wri_nm(){
        return prt_wri_nm;
    }

    @ElVoField(physicalName = "prt_wri_nm")
    public void setPrt_wri_nm(String prt_wri_nm){
        this.prt_wri_nm = prt_wri_nm;
    }

    @ElVoField(physicalName = "prt_psn_nm")
    public String getPrt_psn_nm(){
        return prt_psn_nm;
    }

    @ElVoField(physicalName = "prt_psn_nm")
    public void setPrt_psn_nm(String prt_psn_nm){
        this.prt_psn_nm = prt_psn_nm;
    }

    @ElVoField(physicalName = "prt_adm_nm")
    public String getPrt_adm_nm(){
        return prt_adm_nm;
    }

    @ElVoField(physicalName = "prt_adm_nm")
    public void setPrt_adm_nm(String prt_adm_nm){
        this.prt_adm_nm = prt_adm_nm;
    }

    @ElVoField(physicalName = "prt_daytm")
    public String getPrt_daytm(){
        return prt_daytm;
    }

    @ElVoField(physicalName = "prt_daytm")
    public void setPrt_daytm(String prt_daytm){
        this.prt_daytm = prt_daytm;
    }

    @ElVoField(physicalName = "prt_charg_psn_id")
    public String getPrt_charg_psn_id(){
        return prt_charg_psn_id;
    }

    @ElVoField(physicalName = "prt_charg_psn_id")
    public void setPrt_charg_psn_id(String prt_charg_psn_id){
        this.prt_charg_psn_id = prt_charg_psn_id;
    }

    @ElVoField(physicalName = "prt_charg_psn_nm")
    public String getPrt_charg_psn_nm(){
        return prt_charg_psn_nm;
    }

    @ElVoField(physicalName = "prt_charg_psn_nm")
    public void setPrt_charg_psn_nm(String prt_charg_psn_nm){
        this.prt_charg_psn_nm = prt_charg_psn_nm;
    }

    @ElVoField(physicalName = "prt_app_no")
    public String getPrt_app_no(){
        return prt_app_no;
    }

    @ElVoField(physicalName = "prt_app_no")
    public void setPrt_app_no(String prt_app_no){
        this.prt_app_no = prt_app_no;
    }

    @ElVoField(physicalName = "prt_app_date")
    public String getPrt_app_date(){
        return prt_app_date;
    }

    @ElVoField(physicalName = "prt_app_date")
    public void setPrt_app_date(String prt_app_date){
        this.prt_app_date = prt_app_date;
    }

    @ElVoField(physicalName = "prt_indep_cnt")
    public String getPrt_indep_cnt(){
        return prt_indep_cnt;
    }

    @ElVoField(physicalName = "prt_indep_cnt")
    public void setPrt_indep_cnt(String prt_indep_cnt){
        this.prt_indep_cnt = prt_indep_cnt;
    }

    @ElVoField(physicalName = "prt_depen_cnt")
    public String getPrt_depen_cnt(){
        return prt_depen_cnt;
    }

    @ElVoField(physicalName = "prt_depen_cnt")
    public void setPrt_depen_cnt(String prt_depen_cnt){
        this.prt_depen_cnt = prt_depen_cnt;
    }

    @ElVoField(physicalName = "prt_spec_cnt")
    public String getPrt_spec_cnt(){
        return prt_spec_cnt;
    }

    @ElVoField(physicalName = "prt_spec_cnt")
    public void setPrt_spec_cnt(String prt_spec_cnt){
        this.prt_spec_cnt = prt_spec_cnt;
    }

    @ElVoField(physicalName = "prt_draw_cnt")
    public String getPrt_draw_cnt(){
        return prt_draw_cnt;
    }

    @ElVoField(physicalName = "prt_draw_cnt")
    public void setPrt_draw_cnt(String prt_draw_cnt){
        this.prt_draw_cnt = prt_draw_cnt;
    }

    @ElVoField(physicalName = "prt_ko_app_title")
    public String getPrt_ko_app_title(){
        return prt_ko_app_title;
    }

    @ElVoField(physicalName = "prt_ko_app_title")
    public void setPrt_ko_app_title(String prt_ko_app_title){
        this.prt_ko_app_title = prt_ko_app_title;
    }

    @ElVoField(physicalName = "prt_en_app_title")
    public String getPrt_en_app_title(){
        return prt_en_app_title;
    }

    @ElVoField(physicalName = "prt_en_app_title")
    public void setPrt_en_app_title(String prt_en_app_title){
        this.prt_en_app_title = prt_en_app_title;
    }

    @ElVoField(physicalName = "prt_comment")
    public String getPrt_comment(){
        return prt_comment;
    }

    @ElVoField(physicalName = "prt_comment")
    public void setPrt_comment(String prt_comment){
        this.prt_comment = prt_comment;
    }

    @ElVoField(physicalName = "prt_app_attach_file")
    public String getPrt_app_attach_file(){
        return prt_app_attach_file;
    }

    @ElVoField(physicalName = "prt_app_attach_file")
    public void setPrt_app_attach_file(String prt_app_attach_file){
        this.prt_app_attach_file = prt_app_attach_file;
    }

    @ElVoField(physicalName = "prt_attach_file")
    public String getPrt_attach_file(){
        return prt_attach_file;
    }

    @ElVoField(physicalName = "prt_attach_file")
    public void setPrt_attach_file(String prt_attach_file){
        this.prt_attach_file = prt_attach_file;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public String getEval_psn_syspayno(){
        return eval_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public void setEval_psn_syspayno(String eval_psn_syspayno){
        this.eval_psn_syspayno = eval_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_psn_nm")
    public String getEval_psn_nm(){
        return eval_psn_nm;
    }

    @ElVoField(physicalName = "eval_psn_nm")
    public void setEval_psn_nm(String eval_psn_nm){
        this.eval_psn_nm = eval_psn_nm;
    }

    @ElVoField(physicalName = "eval_daytm")
    public String getEval_daytm(){
        return eval_daytm;
    }

    @ElVoField(physicalName = "eval_daytm")
    public void setEval_daytm(String eval_daytm){
        this.eval_daytm = eval_daytm;
    }

    @ElVoField(physicalName = "eval_service_scr")
    public String getEval_service_scr(){
        return eval_service_scr;
    }

    @ElVoField(physicalName = "eval_service_scr")
    public void setEval_service_scr(String eval_service_scr){
        this.eval_service_scr = eval_service_scr;
    }

    @ElVoField(physicalName = "eval_result_scr")
    public String getEval_result_scr(){
        return eval_result_scr;
    }

    @ElVoField(physicalName = "eval_result_scr")
    public void setEval_result_scr(String eval_result_scr){
        this.eval_result_scr = eval_result_scr;
    }

    @ElVoField(physicalName = "eval_comment")
    public String getEval_comment(){
        return eval_comment;
    }

    @ElVoField(physicalName = "eval_comment")
    public void setEval_comment(String eval_comment){
        this.eval_comment = eval_comment;
    }

    @ElVoField(physicalName = "eval_expir_ymd")
    public String getEval_expir_ymd(){
        return eval_expir_ymd;
    }

    @ElVoField(physicalName = "eval_expir_ymd")
    public void setEval_expir_ymd(String eval_expir_ymd){
        this.eval_expir_ymd = eval_expir_ymd;
    }

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public String getSmitapp_reg_ymd(){
        return smitapp_reg_ymd;
    }

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public void setSmitapp_reg_ymd(String smitapp_reg_ymd){
        this.smitapp_reg_ymd = smitapp_reg_ymd;
    }

    @ElVoField(physicalName = "demnd_id")
    public String getDemnd_id(){
        return demnd_id;
    }

    @ElVoField(physicalName = "demnd_id")
    public void setDemnd_id(String demnd_id){
        this.demnd_id = demnd_id;
    }

    @ElVoField(physicalName = "ask_psn_syspayno")
    public String getAsk_psn_syspayno(){
        return ask_psn_syspayno;
    }

    @ElVoField(physicalName = "ask_psn_syspayno")
    public void setAsk_psn_syspayno(String ask_psn_syspayno){
        this.ask_psn_syspayno = ask_psn_syspayno;
    }

    @ElVoField(physicalName = "req_patofic_cd")
    public String getReq_patofic_cd(){
        return req_patofic_cd;
    }

    @ElVoField(physicalName = "req_patofic_cd")
    public void setReq_patofic_cd(String req_patofic_cd){
        this.req_patofic_cd = req_patofic_cd;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public String getHope_patofic_charg_id(){
        return hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public void setHope_patofic_charg_id(String hope_patofic_charg_id){
        this.hope_patofic_charg_id = hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "act_no")
    public String getAct_no(){
        return act_no;
    }

    @ElVoField(physicalName = "act_no")
    public void setAct_no(String act_no){
        this.act_no = act_no;
    }

    @ElVoField(physicalName = "act_cd")
    public String getAct_cd(){
        return act_cd;
    }

    @ElVoField(physicalName = "act_cd")
    public void setAct_cd(String act_cd){
        this.act_cd = act_cd;
    }

    @ElVoField(physicalName = "act_syspayno")
    public String getAct_syspayno(){
        return act_syspayno;
    }

    @ElVoField(physicalName = "act_syspayno")
    public void setAct_syspayno(String act_syspayno){
        this.act_syspayno = act_syspayno;
    }

    @ElVoField(physicalName = "next_state_cd")
    public String getNext_state_cd(){
        return next_state_cd;
    }

    @ElVoField(physicalName = "next_state_cd")
    public void setNext_state_cd(String next_state_cd){
        this.next_state_cd = next_state_cd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }

    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
    }

    @ElVoField(physicalName = "docu_clsf")
    public String getDocu_clsf(){
        return docu_clsf;
    }

    @ElVoField(physicalName = "docu_clsf")
    public void setDocu_clsf(String docu_clsf){
        this.docu_clsf = docu_clsf;
    }

    @ElVoField(physicalName = "bf_state")
    public String getBf_state(){
        return bf_state;
    }

    @ElVoField(physicalName = "bf_state")
    public void setBf_state(String bf_state){
        this.bf_state = bf_state;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public String getCurr_state_cd(){
        return curr_state_cd;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public void setCurr_state_cd(String curr_state_cd){
        this.curr_state_cd = curr_state_cd;
    }

    @ElVoField(physicalName = "eval_demnd_ex")
    public String getEval_demnd_ex(){
        return eval_demnd_ex;
    }

    @ElVoField(physicalName = "eval_demnd_ex")
    public void setEval_demnd_ex(String eval_demnd_ex){
        this.eval_demnd_ex = eval_demnd_ex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPapManReqInvVo [");
        sb.append("app_id").append("=").append(app_id).append(",");
        sb.append("ref_id").append("=").append(ref_id).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
        sb.append("job_state_nm_detail").append("=").append(job_state_nm_detail).append(",");
        sb.append("job_state_nm").append("=").append(job_state_nm).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_daytm").append("=").append(req_daytm).append(",");
        sb.append("req_app_clsf").append("=").append(req_app_clsf).append(",");
        sb.append("req_app_clsf_nm").append("=").append(req_app_clsf_nm).append(",");
        sb.append("req_pub_yn").append("=").append(req_pub_yn).append(",");
        sb.append("req_pub_yn_nm").append("=").append(req_pub_yn_nm).append(",");
        sb.append("req_claim_yn").append("=").append(req_claim_yn).append(",");
        sb.append("req_claim_yn_nm").append("=").append(req_claim_yn_nm).append(",");
        sb.append("req_due_date").append("=").append(req_due_date).append(",");
        sb.append("req_comment").append("=").append(req_comment).append(",");
        sb.append("req_attach_file").append("=").append(req_attach_file).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("req_ntis_no").append("=").append(req_ntis_no).append(",");
        sb.append("com_patofic_cd").append("=").append(com_patofic_cd).append(",");
        sb.append("com_patofic_charg_id").append("=").append(com_patofic_charg_id).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("com_psn_syspayno").append("=").append(com_psn_syspayno).append(",");
        sb.append("com_due_date").append("=").append(com_due_date).append(",");
        sb.append("com_comment").append("=").append(com_comment).append(",");
        sb.append("com_attach_file").append("=").append(com_attach_file).append(",");
        sb.append("com_psn_nm").append("=").append(com_psn_nm).append(",");
        sb.append("com_daytm").append("=").append(com_daytm).append(",");
        sb.append("com_patofic_nm").append("=").append(com_patofic_nm).append(",");
        sb.append("com_patofic_charg_nm").append("=").append(com_patofic_charg_nm).append(",");
        sb.append("psn_syspayno").append("=").append(psn_syspayno).append(",");
        sb.append("rcpt_wri_id").append("=").append(rcpt_wri_id).append(",");
        sb.append("rcpt_psn_id").append("=").append(rcpt_psn_id).append(",");
        sb.append("rcpt_adm_id").append("=").append(rcpt_adm_id).append(",");
        sb.append("rcpt_wri_nm").append("=").append(rcpt_wri_nm).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_adm_nm").append("=").append(rcpt_adm_nm).append(",");
        sb.append("rcpt_daytm").append("=").append(rcpt_daytm).append(",");
        sb.append("rcpt_charg_psn_id").append("=").append(rcpt_charg_psn_id).append(",");
        sb.append("rcpt_charg_psn_nm").append("=").append(rcpt_charg_psn_nm).append(",");
        sb.append("rcpt_patofic_mng_no").append("=").append(rcpt_patofic_mng_no).append(",");
        sb.append("prt_wri_id").append("=").append(prt_wri_id).append(",");
        sb.append("prt_psn_id").append("=").append(prt_psn_id).append(",");
        sb.append("prt_adm_id").append("=").append(prt_adm_id).append(",");
        sb.append("prt_wri_nm").append("=").append(prt_wri_nm).append(",");
        sb.append("prt_psn_nm").append("=").append(prt_psn_nm).append(",");
        sb.append("prt_adm_nm").append("=").append(prt_adm_nm).append(",");
        sb.append("prt_daytm").append("=").append(prt_daytm).append(",");
        sb.append("prt_charg_psn_id").append("=").append(prt_charg_psn_id).append(",");
        sb.append("prt_charg_psn_nm").append("=").append(prt_charg_psn_nm).append(",");
        sb.append("prt_app_no").append("=").append(prt_app_no).append(",");
        sb.append("prt_app_date").append("=").append(prt_app_date).append(",");
        sb.append("prt_indep_cnt").append("=").append(prt_indep_cnt).append(",");
        sb.append("prt_depen_cnt").append("=").append(prt_depen_cnt).append(",");
        sb.append("prt_spec_cnt").append("=").append(prt_spec_cnt).append(",");
        sb.append("prt_draw_cnt").append("=").append(prt_draw_cnt).append(",");
        sb.append("prt_ko_app_title").append("=").append(prt_ko_app_title).append(",");
        sb.append("prt_en_app_title").append("=").append(prt_en_app_title).append(",");
        sb.append("prt_comment").append("=").append(prt_comment).append(",");
        sb.append("prt_app_attach_file").append("=").append(prt_app_attach_file).append(",");
        sb.append("prt_attach_file").append("=").append(prt_attach_file).append(",");
        sb.append("eval_psn_syspayno").append("=").append(eval_psn_syspayno).append(",");
        sb.append("eval_psn_nm").append("=").append(eval_psn_nm).append(",");
        sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
        sb.append("eval_service_scr").append("=").append(eval_service_scr).append(",");
        sb.append("eval_result_scr").append("=").append(eval_result_scr).append(",");
        sb.append("eval_comment").append("=").append(eval_comment).append(",");
        sb.append("eval_expir_ymd").append("=").append(eval_expir_ymd).append(",");
        sb.append("smitapp_reg_ymd").append("=").append(smitapp_reg_ymd).append(",");
        sb.append("demnd_id").append("=").append(demnd_id).append(",");
        sb.append("ask_psn_syspayno").append("=").append(ask_psn_syspayno).append(",");
        sb.append("req_patofic_cd").append("=").append(req_patofic_cd).append(",");
        sb.append("hope_patofic_charg_id").append("=").append(hope_patofic_charg_id).append(",");
        sb.append("act_no").append("=").append(act_no).append(",");
        sb.append("act_cd").append("=").append(act_cd).append(",");
        sb.append("act_syspayno").append("=").append(act_syspayno).append(",");
        sb.append("next_state_cd").append("=").append(next_state_cd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
        sb.append("bf_state").append("=").append(bf_state).append(",");
        sb.append("curr_state_cd").append("=").append(curr_state_cd).append(",");
        sb.append("eval_demnd_ex").append("=").append(eval_demnd_ex);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
