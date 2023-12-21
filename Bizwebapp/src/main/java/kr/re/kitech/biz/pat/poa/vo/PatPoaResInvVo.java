package kr.re.kitech.biz.pat.poa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPoaResInvExp")
public class PatPoaResInvVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPoaResInvVo(){
    }

    @ElDtoField(logicalName = "oaId", physicalName = "oa_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_id;

    @ElDtoField(logicalName = "oaSn", physicalName = "oa_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_sn;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "jobStateCd", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;

    @ElDtoField(logicalName = "rpnWriId", physicalName = "rpn_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_wri_id;

    @ElDtoField(logicalName = "rpnPsnId", physicalName = "rpn_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_psn_id;

    @ElDtoField(logicalName = "rpnAdmId", physicalName = "rpn_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_adm_id;

    @ElDtoField(logicalName = "rpnWriNm", physicalName = "rpn_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_wri_nm;

    @ElDtoField(logicalName = "rpnPsnNm", physicalName = "rpn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_psn_nm;

    @ElDtoField(logicalName = "rpnAdmNm", physicalName = "rpn_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_adm_nm;

    @ElDtoField(logicalName = "rpnChargPsnNm", physicalName = "rpn_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_charg_psn_nm;

    @ElDtoField(logicalName = "rpnDaytm", physicalName = "rpn_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_daytm;

    @ElDtoField(logicalName = "rpnClsf", physicalName = "rpn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_clsf;

    @ElDtoField(logicalName = "rpnClsfNm", physicalName = "rpn_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_clsf_nm;

    @ElDtoField(logicalName = "rpnComment", physicalName = "rpn_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_comment;

    @ElDtoField(logicalName = "rpnAttachFile", physicalName = "rpn_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpn_attach_file;

    @ElDtoField(logicalName = "evalPsnSyspayno", physicalName = "eval_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspayno;

    @ElDtoField(logicalName = "evalPsnSyspaynm", physicalName = "eval_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspaynm;

    @ElDtoField(logicalName = "evalDaytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;

    @ElDtoField(logicalName = "evalComment", physicalName = "eval_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_comment;

    @ElDtoField(logicalName = "evalResClsf", physicalName = "eval_res_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_res_clsf;

    @ElDtoField(logicalName = "evalResClsfNm", physicalName = "eval_res_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_res_clsf_nm;

    @ElDtoField(logicalName = "rpePsnSyspayno", physicalName = "rpe_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpe_psn_syspayno;

    @ElDtoField(logicalName = "rpeServiceScr", physicalName = "rpe_service_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpe_service_scr;

    @ElDtoField(logicalName = "rpeResultScr", physicalName = "rpe_result_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpe_result_scr;

    @ElDtoField(logicalName = "rpeComment", physicalName = "rpe_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpe_comment;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "oaresSn", physicalName = "oares_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oares_sn;

    @ElDtoField(logicalName = "rcptWriNm", physicalName = "rcpt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_wri_nm;

    @ElDtoField(logicalName = "rcptPsnNm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcptChargPsnNm", physicalName = "rcpt_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_charg_psn_nm;

    @ElDtoField(logicalName = "rcptDaytm", physicalName = "rcpt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_daytm;

    @ElDtoField(logicalName = "rcptClsfNm", physicalName = "rcpt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_clsf_nm;

    @ElDtoField(logicalName = "rcptNoticeNm", physicalName = "rcpt_notice_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_notice_nm;

    @ElDtoField(logicalName = "rcptOaDate", physicalName = "rcpt_oa_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_oa_date;

    @ElDtoField(logicalName = "rcptDueDate", physicalName = "rcpt_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_due_date;

    @ElDtoField(logicalName = "rcptComment", physicalName = "rcpt_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_comment;

    @ElDtoField(logicalName = "rcptAttachFile", physicalName = "rcpt_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_attach_file;

    @ElDtoField(logicalName = "resWriNm", physicalName = "res_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_wri_nm;

    @ElDtoField(logicalName = "resPsnNm", physicalName = "res_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_psn_nm;

    @ElDtoField(logicalName = "resChargPsnNm", physicalName = "res_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_charg_psn_nm;

    @ElDtoField(logicalName = "resDaytm", physicalName = "res_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_daytm;

    @ElDtoField(logicalName = "resClsf", physicalName = "res_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_clsf;

    @ElDtoField(logicalName = "resClsfNm", physicalName = "res_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_clsf_nm;

    @ElDtoField(logicalName = "resComment", physicalName = "res_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_comment;

    @ElDtoField(logicalName = "resFile", physicalName = "res_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_file;

    @ElDtoField(logicalName = "resAttachFile", physicalName = "res_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_attach_file;

    @ElDtoField(logicalName = "rereqComment", physicalName = "rereq_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_comment;

    @ElDtoField(logicalName = "rereqPsnSyspaynm", physicalName = "rereq_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_psn_syspaynm;

    @ElDtoField(logicalName = "rereqDaytm", physicalName = "rereq_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_daytm;

    @ElDtoField(logicalName = "reRereqComment", physicalName = "re_rereq_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_comment;

    @ElDtoField(logicalName = "reResClsfNm", physicalName = "re_res_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_clsf_nm;

    @ElDtoField(logicalName = "rpePsnSyspaynm", physicalName = "rpe_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpe_psn_syspaynm;

    @ElDtoField(logicalName = "rpeDaytm", physicalName = "rpe_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpe_daytm;

    @ElDtoField(logicalName = "rcptQuoteYn", physicalName = "rcpt_quote_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_quote_yn;

    @ElDtoField(logicalName = "rcptRsn", physicalName = "rcpt_rsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_rsn;

    @ElDtoField(logicalName = "oaSnNm", physicalName = "oa_sn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_sn_nm;

    @ElDtoField(logicalName = "oaSnCd", physicalName = "oa_sn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_sn_cd;

    @ElDtoField(logicalName = "jobStateNmDetail", physicalName = "job_state_nm_detail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_nm_detail;

    @ElDtoField(logicalName = "jobStateNm", physicalName = "job_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_nm;

    @ElDtoField(logicalName = "rcptWriId", physicalName = "rcpt_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_wri_id;

    @ElDtoField(logicalName = "rcptPsnId", physicalName = "rcpt_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_id;

    @ElDtoField(logicalName = "rcptAdmId", physicalName = "rcpt_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_adm_id;

    @ElDtoField(logicalName = "rcptAdmNm", physicalName = "rcpt_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_adm_nm;

    @ElDtoField(logicalName = "rcptChargPsnId", physicalName = "rcpt_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_charg_psn_id;

    @ElDtoField(logicalName = "rcptClsf", physicalName = "rcpt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_clsf;

    @ElDtoField(logicalName = "rcptNotice", physicalName = "rcpt_notice", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_notice;

    @ElDtoField(logicalName = "oaresId", physicalName = "oares_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oares_id;

    @ElDtoField(logicalName = "resWriId", physicalName = "res_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_wri_id;

    @ElDtoField(logicalName = "resPsnId", physicalName = "res_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_psn_id;

    @ElDtoField(logicalName = "resAdmId", physicalName = "res_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_adm_id;

    @ElDtoField(logicalName = "resAdmNm", physicalName = "res_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_adm_nm;

    @ElDtoField(logicalName = "resChargPsnId", physicalName = "res_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_charg_psn_id;

    @ElDtoField(logicalName = "resDivClsf", physicalName = "res_div_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_div_clsf;

    @ElDtoField(logicalName = "resDivClsfNm", physicalName = "res_div_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_div_clsf_nm;

    @ElDtoField(logicalName = "reOaresId", physicalName = "re_oares_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_oares_id;

    @ElDtoField(logicalName = "reOaresSn", physicalName = "re_oares_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_oares_sn;

    @ElDtoField(logicalName = "reResWriId", physicalName = "re_res_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_wri_id;

    @ElDtoField(logicalName = "reResPsnId", physicalName = "re_res_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_psn_id;

    @ElDtoField(logicalName = "reResAdmId", physicalName = "re_res_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_adm_id;

    @ElDtoField(logicalName = "reResWriNm", physicalName = "re_res_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_wri_nm;

    @ElDtoField(logicalName = "reResPsnNm", physicalName = "re_res_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_psn_nm;

    @ElDtoField(logicalName = "reResAdmNm", physicalName = "re_res_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_adm_nm;

    @ElDtoField(logicalName = "reResDaytm", physicalName = "re_res_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_daytm;

    @ElDtoField(logicalName = "reResChargPsnId", physicalName = "re_res_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_charg_psn_id;

    @ElDtoField(logicalName = "reResChargPsnNm", physicalName = "re_res_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_charg_psn_nm;

    @ElDtoField(logicalName = "reResClsf", physicalName = "re_res_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_clsf;

    @ElDtoField(logicalName = "reResDivClsf", physicalName = "re_res_div_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_div_clsf;

    @ElDtoField(logicalName = "reResDivClsfNm", physicalName = "re_res_div_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_div_clsf_nm;

    @ElDtoField(logicalName = "reResComment", physicalName = "re_res_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_comment;

    @ElDtoField(logicalName = "reResFile", physicalName = "re_res_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_file;

    @ElDtoField(logicalName = "reResAttachFile", physicalName = "re_res_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_res_attach_file;

    @ElDtoField(logicalName = "reRereqPsnSyspayno", physicalName = "re_rereq_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_psn_syspayno;

    @ElDtoField(logicalName = "reRereqDaytm", physicalName = "re_rereq_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_daytm;

    @ElDtoField(logicalName = "reRereqPsnSyspaynm", physicalName = "re_rereq_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_psn_syspaynm;

    @ElDtoField(logicalName = "rereqPsnSyspayno", physicalName = "rereq_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_psn_syspayno;

    @ElDtoField(logicalName = "evalResultScr", physicalName = "eval_result_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_result_scr;

    @ElDtoField(logicalName = "evalServiceScr", physicalName = "eval_service_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_service_scr;

    @ElDtoField(logicalName = "psnSyspayno", physicalName = "psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_syspayno;

    @ElDtoField(logicalName = "actSn", physicalName = "act_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_sn;

    @ElDtoField(logicalName = "bfState", physicalName = "bf_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bf_state;

    @ElDtoField(logicalName = "actBlongClsf", physicalName = "act_blong_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_blong_clsf;

    @ElDtoField(logicalName = "curr_state_cd", physicalName = "curr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_state_cd;

    @ElDtoField(logicalName = "next_state_cd", physicalName = "next_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String next_state_cd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "ref_key", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElVoField(physicalName = "oa_id")
    public String getOa_id(){
        return oa_id;
    }

    @ElVoField(physicalName = "oa_id")
    public void setOa_id(String oa_id){
        this.oa_id = oa_id;
    }

    @ElVoField(physicalName = "oa_sn")
    public String getOa_sn(){
        return oa_sn;
    }

    @ElVoField(physicalName = "oa_sn")
    public void setOa_sn(String oa_sn){
        this.oa_sn = oa_sn;
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

    @ElVoField(physicalName = "rpn_wri_id")
    public String getRpn_wri_id(){
        return rpn_wri_id;
    }

    @ElVoField(physicalName = "rpn_wri_id")
    public void setRpn_wri_id(String rpn_wri_id){
        this.rpn_wri_id = rpn_wri_id;
    }

    @ElVoField(physicalName = "rpn_psn_id")
    public String getRpn_psn_id(){
        return rpn_psn_id;
    }

    @ElVoField(physicalName = "rpn_psn_id")
    public void setRpn_psn_id(String rpn_psn_id){
        this.rpn_psn_id = rpn_psn_id;
    }

    @ElVoField(physicalName = "rpn_adm_id")
    public String getRpn_adm_id(){
        return rpn_adm_id;
    }

    @ElVoField(physicalName = "rpn_adm_id")
    public void setRpn_adm_id(String rpn_adm_id){
        this.rpn_adm_id = rpn_adm_id;
    }

    @ElVoField(physicalName = "rpn_wri_nm")
    public String getRpn_wri_nm(){
        return rpn_wri_nm;
    }

    @ElVoField(physicalName = "rpn_wri_nm")
    public void setRpn_wri_nm(String rpn_wri_nm){
        this.rpn_wri_nm = rpn_wri_nm;
    }

    @ElVoField(physicalName = "rpn_psn_nm")
    public String getRpn_psn_nm(){
        return rpn_psn_nm;
    }

    @ElVoField(physicalName = "rpn_psn_nm")
    public void setRpn_psn_nm(String rpn_psn_nm){
        this.rpn_psn_nm = rpn_psn_nm;
    }

    @ElVoField(physicalName = "rpn_adm_nm")
    public String getRpn_adm_nm(){
        return rpn_adm_nm;
    }

    @ElVoField(physicalName = "rpn_adm_nm")
    public void setRpn_adm_nm(String rpn_adm_nm){
        this.rpn_adm_nm = rpn_adm_nm;
    }

    @ElVoField(physicalName = "rpn_charg_psn_nm")
    public String getRpn_charg_psn_nm(){
        return rpn_charg_psn_nm;
    }

    @ElVoField(physicalName = "rpn_charg_psn_nm")
    public void setRpn_charg_psn_nm(String rpn_charg_psn_nm){
        this.rpn_charg_psn_nm = rpn_charg_psn_nm;
    }

    @ElVoField(physicalName = "rpn_daytm")
    public String getRpn_daytm(){
        return rpn_daytm;
    }

    @ElVoField(physicalName = "rpn_daytm")
    public void setRpn_daytm(String rpn_daytm){
        this.rpn_daytm = rpn_daytm;
    }

    @ElVoField(physicalName = "rpn_clsf")
    public String getRpn_clsf(){
        return rpn_clsf;
    }

    @ElVoField(physicalName = "rpn_clsf")
    public void setRpn_clsf(String rpn_clsf){
        this.rpn_clsf = rpn_clsf;
    }

    @ElVoField(physicalName = "rpn_clsf_nm")
    public String getRpn_clsf_nm(){
        return rpn_clsf_nm;
    }

    @ElVoField(physicalName = "rpn_clsf_nm")
    public void setRpn_clsf_nm(String rpn_clsf_nm){
        this.rpn_clsf_nm = rpn_clsf_nm;
    }

    @ElVoField(physicalName = "rpn_comment")
    public String getRpn_comment(){
        return rpn_comment;
    }

    @ElVoField(physicalName = "rpn_comment")
    public void setRpn_comment(String rpn_comment){
        this.rpn_comment = rpn_comment;
    }

    @ElVoField(physicalName = "rpn_attach_file")
    public String getRpn_attach_file(){
        return rpn_attach_file;
    }

    @ElVoField(physicalName = "rpn_attach_file")
    public void setRpn_attach_file(String rpn_attach_file){
        this.rpn_attach_file = rpn_attach_file;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public String getEval_psn_syspayno(){
        return eval_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public void setEval_psn_syspayno(String eval_psn_syspayno){
        this.eval_psn_syspayno = eval_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_psn_syspaynm")
    public String getEval_psn_syspaynm(){
        return eval_psn_syspaynm;
    }

    @ElVoField(physicalName = "eval_psn_syspaynm")
    public void setEval_psn_syspaynm(String eval_psn_syspaynm){
        this.eval_psn_syspaynm = eval_psn_syspaynm;
    }

    @ElVoField(physicalName = "eval_daytm")
    public String getEval_daytm(){
        return eval_daytm;
    }

    @ElVoField(physicalName = "eval_daytm")
    public void setEval_daytm(String eval_daytm){
        this.eval_daytm = eval_daytm;
    }

    @ElVoField(physicalName = "eval_comment")
    public String getEval_comment(){
        return eval_comment;
    }

    @ElVoField(physicalName = "eval_comment")
    public void setEval_comment(String eval_comment){
        this.eval_comment = eval_comment;
    }

    @ElVoField(physicalName = "eval_res_clsf")
    public String getEval_res_clsf(){
        return eval_res_clsf;
    }

    @ElVoField(physicalName = "eval_res_clsf")
    public void setEval_res_clsf(String eval_res_clsf){
        this.eval_res_clsf = eval_res_clsf;
    }

    @ElVoField(physicalName = "eval_res_clsf_nm")
    public String getEval_res_clsf_nm(){
        return eval_res_clsf_nm;
    }

    @ElVoField(physicalName = "eval_res_clsf_nm")
    public void setEval_res_clsf_nm(String eval_res_clsf_nm){
        this.eval_res_clsf_nm = eval_res_clsf_nm;
    }

    @ElVoField(physicalName = "rpe_psn_syspayno")
    public String getRpe_psn_syspayno(){
        return rpe_psn_syspayno;
    }

    @ElVoField(physicalName = "rpe_psn_syspayno")
    public void setRpe_psn_syspayno(String rpe_psn_syspayno){
        this.rpe_psn_syspayno = rpe_psn_syspayno;
    }

    @ElVoField(physicalName = "rpe_service_scr")
    public String getRpe_service_scr(){
        return rpe_service_scr;
    }

    @ElVoField(physicalName = "rpe_service_scr")
    public void setRpe_service_scr(String rpe_service_scr){
        this.rpe_service_scr = rpe_service_scr;
    }

    @ElVoField(physicalName = "rpe_result_scr")
    public String getRpe_result_scr(){
        return rpe_result_scr;
    }

    @ElVoField(physicalName = "rpe_result_scr")
    public void setRpe_result_scr(String rpe_result_scr){
        this.rpe_result_scr = rpe_result_scr;
    }

    @ElVoField(physicalName = "rpe_comment")
    public String getRpe_comment(){
        return rpe_comment;
    }

    @ElVoField(physicalName = "rpe_comment")
    public void setRpe_comment(String rpe_comment){
        this.rpe_comment = rpe_comment;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "oares_sn")
    public String getOares_sn(){
        return oares_sn;
    }

    @ElVoField(physicalName = "oares_sn")
    public void setOares_sn(String oares_sn){
        this.oares_sn = oares_sn;
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

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public String getRcpt_charg_psn_nm(){
        return rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public void setRcpt_charg_psn_nm(String rcpt_charg_psn_nm){
        this.rcpt_charg_psn_nm = rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_daytm")
    public String getRcpt_daytm(){
        return rcpt_daytm;
    }

    @ElVoField(physicalName = "rcpt_daytm")
    public void setRcpt_daytm(String rcpt_daytm){
        this.rcpt_daytm = rcpt_daytm;
    }

    @ElVoField(physicalName = "rcpt_clsf_nm")
    public String getRcpt_clsf_nm(){
        return rcpt_clsf_nm;
    }

    @ElVoField(physicalName = "rcpt_clsf_nm")
    public void setRcpt_clsf_nm(String rcpt_clsf_nm){
        this.rcpt_clsf_nm = rcpt_clsf_nm;
    }

    @ElVoField(physicalName = "rcpt_notice_nm")
    public String getRcpt_notice_nm(){
        return rcpt_notice_nm;
    }

    @ElVoField(physicalName = "rcpt_notice_nm")
    public void setRcpt_notice_nm(String rcpt_notice_nm){
        this.rcpt_notice_nm = rcpt_notice_nm;
    }

    @ElVoField(physicalName = "rcpt_oa_date")
    public String getRcpt_oa_date(){
        return rcpt_oa_date;
    }

    @ElVoField(physicalName = "rcpt_oa_date")
    public void setRcpt_oa_date(String rcpt_oa_date){
        this.rcpt_oa_date = rcpt_oa_date;
    }

    @ElVoField(physicalName = "rcpt_due_date")
    public String getRcpt_due_date(){
        return rcpt_due_date;
    }

    @ElVoField(physicalName = "rcpt_due_date")
    public void setRcpt_due_date(String rcpt_due_date){
        this.rcpt_due_date = rcpt_due_date;
    }

    @ElVoField(physicalName = "rcpt_comment")
    public String getRcpt_comment(){
        return rcpt_comment;
    }

    @ElVoField(physicalName = "rcpt_comment")
    public void setRcpt_comment(String rcpt_comment){
        this.rcpt_comment = rcpt_comment;
    }

    @ElVoField(physicalName = "rcpt_attach_file")
    public String getRcpt_attach_file(){
        return rcpt_attach_file;
    }

    @ElVoField(physicalName = "rcpt_attach_file")
    public void setRcpt_attach_file(String rcpt_attach_file){
        this.rcpt_attach_file = rcpt_attach_file;
    }

    @ElVoField(physicalName = "res_wri_nm")
    public String getRes_wri_nm(){
        return res_wri_nm;
    }

    @ElVoField(physicalName = "res_wri_nm")
    public void setRes_wri_nm(String res_wri_nm){
        this.res_wri_nm = res_wri_nm;
    }

    @ElVoField(physicalName = "res_psn_nm")
    public String getRes_psn_nm(){
        return res_psn_nm;
    }

    @ElVoField(physicalName = "res_psn_nm")
    public void setRes_psn_nm(String res_psn_nm){
        this.res_psn_nm = res_psn_nm;
    }

    @ElVoField(physicalName = "res_charg_psn_nm")
    public String getRes_charg_psn_nm(){
        return res_charg_psn_nm;
    }

    @ElVoField(physicalName = "res_charg_psn_nm")
    public void setRes_charg_psn_nm(String res_charg_psn_nm){
        this.res_charg_psn_nm = res_charg_psn_nm;
    }

    @ElVoField(physicalName = "res_daytm")
    public String getRes_daytm(){
        return res_daytm;
    }

    @ElVoField(physicalName = "res_daytm")
    public void setRes_daytm(String res_daytm){
        this.res_daytm = res_daytm;
    }

    @ElVoField(physicalName = "res_clsf")
    public String getRes_clsf(){
        return res_clsf;
    }

    @ElVoField(physicalName = "res_clsf")
    public void setRes_clsf(String res_clsf){
        this.res_clsf = res_clsf;
    }

    @ElVoField(physicalName = "res_clsf_nm")
    public String getRes_clsf_nm(){
        return res_clsf_nm;
    }

    @ElVoField(physicalName = "res_clsf_nm")
    public void setRes_clsf_nm(String res_clsf_nm){
        this.res_clsf_nm = res_clsf_nm;
    }

    @ElVoField(physicalName = "res_comment")
    public String getRes_comment(){
        return res_comment;
    }

    @ElVoField(physicalName = "res_comment")
    public void setRes_comment(String res_comment){
        this.res_comment = res_comment;
    }

    @ElVoField(physicalName = "res_file")
    public String getRes_file(){
        return res_file;
    }

    @ElVoField(physicalName = "res_file")
    public void setRes_file(String res_file){
        this.res_file = res_file;
    }

    @ElVoField(physicalName = "res_attach_file")
    public String getRes_attach_file(){
        return res_attach_file;
    }

    @ElVoField(physicalName = "res_attach_file")
    public void setRes_attach_file(String res_attach_file){
        this.res_attach_file = res_attach_file;
    }

    @ElVoField(physicalName = "rereq_comment")
    public String getRereq_comment(){
        return rereq_comment;
    }

    @ElVoField(physicalName = "rereq_comment")
    public void setRereq_comment(String rereq_comment){
        this.rereq_comment = rereq_comment;
    }

    @ElVoField(physicalName = "rereq_psn_syspaynm")
    public String getRereq_psn_syspaynm(){
        return rereq_psn_syspaynm;
    }

    @ElVoField(physicalName = "rereq_psn_syspaynm")
    public void setRereq_psn_syspaynm(String rereq_psn_syspaynm){
        this.rereq_psn_syspaynm = rereq_psn_syspaynm;
    }

    @ElVoField(physicalName = "rereq_daytm")
    public String getRereq_daytm(){
        return rereq_daytm;
    }

    @ElVoField(physicalName = "rereq_daytm")
    public void setRereq_daytm(String rereq_daytm){
        this.rereq_daytm = rereq_daytm;
    }

    @ElVoField(physicalName = "re_rereq_comment")
    public String getRe_rereq_comment(){
        return re_rereq_comment;
    }

    @ElVoField(physicalName = "re_rereq_comment")
    public void setRe_rereq_comment(String re_rereq_comment){
        this.re_rereq_comment = re_rereq_comment;
    }

    @ElVoField(physicalName = "re_res_clsf_nm")
    public String getRe_res_clsf_nm(){
        return re_res_clsf_nm;
    }

    @ElVoField(physicalName = "re_res_clsf_nm")
    public void setRe_res_clsf_nm(String re_res_clsf_nm){
        this.re_res_clsf_nm = re_res_clsf_nm;
    }

    @ElVoField(physicalName = "rpe_psn_syspaynm")
    public String getRpe_psn_syspaynm(){
        return rpe_psn_syspaynm;
    }

    @ElVoField(physicalName = "rpe_psn_syspaynm")
    public void setRpe_psn_syspaynm(String rpe_psn_syspaynm){
        this.rpe_psn_syspaynm = rpe_psn_syspaynm;
    }

    @ElVoField(physicalName = "rpe_daytm")
    public String getRpe_daytm(){
        return rpe_daytm;
    }

    @ElVoField(physicalName = "rpe_daytm")
    public void setRpe_daytm(String rpe_daytm){
        this.rpe_daytm = rpe_daytm;
    }

    @ElVoField(physicalName = "rcpt_quote_yn")
    public String getRcpt_quote_yn(){
        return rcpt_quote_yn;
    }

    @ElVoField(physicalName = "rcpt_quote_yn")
    public void setRcpt_quote_yn(String rcpt_quote_yn){
        this.rcpt_quote_yn = rcpt_quote_yn;
    }

    @ElVoField(physicalName = "rcpt_rsn")
    public String getRcpt_rsn(){
        return rcpt_rsn;
    }

    @ElVoField(physicalName = "rcpt_rsn")
    public void setRcpt_rsn(String rcpt_rsn){
        this.rcpt_rsn = rcpt_rsn;
    }

    @ElVoField(physicalName = "oa_sn_nm")
    public String getOa_sn_nm(){
        return oa_sn_nm;
    }

    @ElVoField(physicalName = "oa_sn_nm")
    public void setOa_sn_nm(String oa_sn_nm){
        this.oa_sn_nm = oa_sn_nm;
    }

    @ElVoField(physicalName = "oa_sn_cd")
    public String getOa_sn_cd(){
        return oa_sn_cd;
    }

    @ElVoField(physicalName = "oa_sn_cd")
    public void setOa_sn_cd(String oa_sn_cd){
        this.oa_sn_cd = oa_sn_cd;
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

    @ElVoField(physicalName = "rcpt_adm_nm")
    public String getRcpt_adm_nm(){
        return rcpt_adm_nm;
    }

    @ElVoField(physicalName = "rcpt_adm_nm")
    public void setRcpt_adm_nm(String rcpt_adm_nm){
        this.rcpt_adm_nm = rcpt_adm_nm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_id")
    public String getRcpt_charg_psn_id(){
        return rcpt_charg_psn_id;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_id")
    public void setRcpt_charg_psn_id(String rcpt_charg_psn_id){
        this.rcpt_charg_psn_id = rcpt_charg_psn_id;
    }

    @ElVoField(physicalName = "rcpt_clsf")
    public String getRcpt_clsf(){
        return rcpt_clsf;
    }

    @ElVoField(physicalName = "rcpt_clsf")
    public void setRcpt_clsf(String rcpt_clsf){
        this.rcpt_clsf = rcpt_clsf;
    }

    @ElVoField(physicalName = "rcpt_notice")
    public String getRcpt_notice(){
        return rcpt_notice;
    }

    @ElVoField(physicalName = "rcpt_notice")
    public void setRcpt_notice(String rcpt_notice){
        this.rcpt_notice = rcpt_notice;
    }

    @ElVoField(physicalName = "oares_id")
    public String getOares_id(){
        return oares_id;
    }

    @ElVoField(physicalName = "oares_id")
    public void setOares_id(String oares_id){
        this.oares_id = oares_id;
    }

    @ElVoField(physicalName = "res_wri_id")
    public String getRes_wri_id(){
        return res_wri_id;
    }

    @ElVoField(physicalName = "res_wri_id")
    public void setRes_wri_id(String res_wri_id){
        this.res_wri_id = res_wri_id;
    }

    @ElVoField(physicalName = "res_psn_id")
    public String getRes_psn_id(){
        return res_psn_id;
    }

    @ElVoField(physicalName = "res_psn_id")
    public void setRes_psn_id(String res_psn_id){
        this.res_psn_id = res_psn_id;
    }

    @ElVoField(physicalName = "res_adm_id")
    public String getRes_adm_id(){
        return res_adm_id;
    }

    @ElVoField(physicalName = "res_adm_id")
    public void setRes_adm_id(String res_adm_id){
        this.res_adm_id = res_adm_id;
    }

    @ElVoField(physicalName = "res_adm_nm")
    public String getRes_adm_nm(){
        return res_adm_nm;
    }

    @ElVoField(physicalName = "res_adm_nm")
    public void setRes_adm_nm(String res_adm_nm){
        this.res_adm_nm = res_adm_nm;
    }

    @ElVoField(physicalName = "res_charg_psn_id")
    public String getRes_charg_psn_id(){
        return res_charg_psn_id;
    }

    @ElVoField(physicalName = "res_charg_psn_id")
    public void setRes_charg_psn_id(String res_charg_psn_id){
        this.res_charg_psn_id = res_charg_psn_id;
    }

    @ElVoField(physicalName = "res_div_clsf")
    public String getRes_div_clsf(){
        return res_div_clsf;
    }

    @ElVoField(physicalName = "res_div_clsf")
    public void setRes_div_clsf(String res_div_clsf){
        this.res_div_clsf = res_div_clsf;
    }

    @ElVoField(physicalName = "res_div_clsf_nm")
    public String getRes_div_clsf_nm(){
        return res_div_clsf_nm;
    }

    @ElVoField(physicalName = "res_div_clsf_nm")
    public void setRes_div_clsf_nm(String res_div_clsf_nm){
        this.res_div_clsf_nm = res_div_clsf_nm;
    }

    @ElVoField(physicalName = "re_oares_id")
    public String getRe_oares_id(){
        return re_oares_id;
    }

    @ElVoField(physicalName = "re_oares_id")
    public void setRe_oares_id(String re_oares_id){
        this.re_oares_id = re_oares_id;
    }

    @ElVoField(physicalName = "re_oares_sn")
    public String getRe_oares_sn(){
        return re_oares_sn;
    }

    @ElVoField(physicalName = "re_oares_sn")
    public void setRe_oares_sn(String re_oares_sn){
        this.re_oares_sn = re_oares_sn;
    }

    @ElVoField(physicalName = "re_res_wri_id")
    public String getRe_res_wri_id(){
        return re_res_wri_id;
    }

    @ElVoField(physicalName = "re_res_wri_id")
    public void setRe_res_wri_id(String re_res_wri_id){
        this.re_res_wri_id = re_res_wri_id;
    }

    @ElVoField(physicalName = "re_res_psn_id")
    public String getRe_res_psn_id(){
        return re_res_psn_id;
    }

    @ElVoField(physicalName = "re_res_psn_id")
    public void setRe_res_psn_id(String re_res_psn_id){
        this.re_res_psn_id = re_res_psn_id;
    }

    @ElVoField(physicalName = "re_res_adm_id")
    public String getRe_res_adm_id(){
        return re_res_adm_id;
    }

    @ElVoField(physicalName = "re_res_adm_id")
    public void setRe_res_adm_id(String re_res_adm_id){
        this.re_res_adm_id = re_res_adm_id;
    }

    @ElVoField(physicalName = "re_res_wri_nm")
    public String getRe_res_wri_nm(){
        return re_res_wri_nm;
    }

    @ElVoField(physicalName = "re_res_wri_nm")
    public void setRe_res_wri_nm(String re_res_wri_nm){
        this.re_res_wri_nm = re_res_wri_nm;
    }

    @ElVoField(physicalName = "re_res_psn_nm")
    public String getRe_res_psn_nm(){
        return re_res_psn_nm;
    }

    @ElVoField(physicalName = "re_res_psn_nm")
    public void setRe_res_psn_nm(String re_res_psn_nm){
        this.re_res_psn_nm = re_res_psn_nm;
    }

    @ElVoField(physicalName = "re_res_adm_nm")
    public String getRe_res_adm_nm(){
        return re_res_adm_nm;
    }

    @ElVoField(physicalName = "re_res_adm_nm")
    public void setRe_res_adm_nm(String re_res_adm_nm){
        this.re_res_adm_nm = re_res_adm_nm;
    }

    @ElVoField(physicalName = "re_res_daytm")
    public String getRe_res_daytm(){
        return re_res_daytm;
    }

    @ElVoField(physicalName = "re_res_daytm")
    public void setRe_res_daytm(String re_res_daytm){
        this.re_res_daytm = re_res_daytm;
    }

    @ElVoField(physicalName = "re_res_charg_psn_id")
    public String getRe_res_charg_psn_id(){
        return re_res_charg_psn_id;
    }

    @ElVoField(physicalName = "re_res_charg_psn_id")
    public void setRe_res_charg_psn_id(String re_res_charg_psn_id){
        this.re_res_charg_psn_id = re_res_charg_psn_id;
    }

    @ElVoField(physicalName = "re_res_charg_psn_nm")
    public String getRe_res_charg_psn_nm(){
        return re_res_charg_psn_nm;
    }

    @ElVoField(physicalName = "re_res_charg_psn_nm")
    public void setRe_res_charg_psn_nm(String re_res_charg_psn_nm){
        this.re_res_charg_psn_nm = re_res_charg_psn_nm;
    }

    @ElVoField(physicalName = "re_res_clsf")
    public String getRe_res_clsf(){
        return re_res_clsf;
    }

    @ElVoField(physicalName = "re_res_clsf")
    public void setRe_res_clsf(String re_res_clsf){
        this.re_res_clsf = re_res_clsf;
    }

    @ElVoField(physicalName = "re_res_div_clsf")
    public String getRe_res_div_clsf(){
        return re_res_div_clsf;
    }

    @ElVoField(physicalName = "re_res_div_clsf")
    public void setRe_res_div_clsf(String re_res_div_clsf){
        this.re_res_div_clsf = re_res_div_clsf;
    }

    @ElVoField(physicalName = "re_res_div_clsf_nm")
    public String getRe_res_div_clsf_nm(){
        return re_res_div_clsf_nm;
    }

    @ElVoField(physicalName = "re_res_div_clsf_nm")
    public void setRe_res_div_clsf_nm(String re_res_div_clsf_nm){
        this.re_res_div_clsf_nm = re_res_div_clsf_nm;
    }

    @ElVoField(physicalName = "re_res_comment")
    public String getRe_res_comment(){
        return re_res_comment;
    }

    @ElVoField(physicalName = "re_res_comment")
    public void setRe_res_comment(String re_res_comment){
        this.re_res_comment = re_res_comment;
    }

    @ElVoField(physicalName = "re_res_file")
    public String getRe_res_file(){
        return re_res_file;
    }

    @ElVoField(physicalName = "re_res_file")
    public void setRe_res_file(String re_res_file){
        this.re_res_file = re_res_file;
    }

    @ElVoField(physicalName = "re_res_attach_file")
    public String getRe_res_attach_file(){
        return re_res_attach_file;
    }

    @ElVoField(physicalName = "re_res_attach_file")
    public void setRe_res_attach_file(String re_res_attach_file){
        this.re_res_attach_file = re_res_attach_file;
    }

    @ElVoField(physicalName = "re_rereq_psn_syspayno")
    public String getRe_rereq_psn_syspayno(){
        return re_rereq_psn_syspayno;
    }

    @ElVoField(physicalName = "re_rereq_psn_syspayno")
    public void setRe_rereq_psn_syspayno(String re_rereq_psn_syspayno){
        this.re_rereq_psn_syspayno = re_rereq_psn_syspayno;
    }

    @ElVoField(physicalName = "re_rereq_daytm")
    public String getRe_rereq_daytm(){
        return re_rereq_daytm;
    }

    @ElVoField(physicalName = "re_rereq_daytm")
    public void setRe_rereq_daytm(String re_rereq_daytm){
        this.re_rereq_daytm = re_rereq_daytm;
    }

    @ElVoField(physicalName = "re_rereq_psn_syspaynm")
    public String getRe_rereq_psn_syspaynm(){
        return re_rereq_psn_syspaynm;
    }

    @ElVoField(physicalName = "re_rereq_psn_syspaynm")
    public void setRe_rereq_psn_syspaynm(String re_rereq_psn_syspaynm){
        this.re_rereq_psn_syspaynm = re_rereq_psn_syspaynm;
    }

    @ElVoField(physicalName = "rereq_psn_syspayno")
    public String getRereq_psn_syspayno(){
        return rereq_psn_syspayno;
    }

    @ElVoField(physicalName = "rereq_psn_syspayno")
    public void setRereq_psn_syspayno(String rereq_psn_syspayno){
        this.rereq_psn_syspayno = rereq_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_result_scr")
    public String getEval_result_scr(){
        return eval_result_scr;
    }

    @ElVoField(physicalName = "eval_result_scr")
    public void setEval_result_scr(String eval_result_scr){
        this.eval_result_scr = eval_result_scr;
    }

    @ElVoField(physicalName = "eval_service_scr")
    public String getEval_service_scr(){
        return eval_service_scr;
    }

    @ElVoField(physicalName = "eval_service_scr")
    public void setEval_service_scr(String eval_service_scr){
        this.eval_service_scr = eval_service_scr;
    }

    @ElVoField(physicalName = "psn_syspayno")
    public String getPsn_syspayno(){
        return psn_syspayno;
    }

    @ElVoField(physicalName = "psn_syspayno")
    public void setPsn_syspayno(String psn_syspayno){
        this.psn_syspayno = psn_syspayno;
    }

    @ElVoField(physicalName = "act_sn")
    public String getAct_sn(){
        return act_sn;
    }

    @ElVoField(physicalName = "act_sn")
    public void setAct_sn(String act_sn){
        this.act_sn = act_sn;
    }

    @ElVoField(physicalName = "bf_state")
    public String getBf_state(){
        return bf_state;
    }

    @ElVoField(physicalName = "bf_state")
    public void setBf_state(String bf_state){
        this.bf_state = bf_state;
    }

    @ElVoField(physicalName = "act_blong_clsf")
    public String getAct_blong_clsf(){
        return act_blong_clsf;
    }

    @ElVoField(physicalName = "act_blong_clsf")
    public void setAct_blong_clsf(String act_blong_clsf){
        this.act_blong_clsf = act_blong_clsf;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public String getCurr_state_cd(){
        return curr_state_cd;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public void setCurr_state_cd(String curr_state_cd){
        this.curr_state_cd = curr_state_cd;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPoaResInvVo [");
        sb.append("oa_id").append("=").append(oa_id).append(",");
        sb.append("oa_sn").append("=").append(oa_sn).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
        sb.append("rpn_wri_id").append("=").append(rpn_wri_id).append(",");
        sb.append("rpn_psn_id").append("=").append(rpn_psn_id).append(",");
        sb.append("rpn_adm_id").append("=").append(rpn_adm_id).append(",");
        sb.append("rpn_wri_nm").append("=").append(rpn_wri_nm).append(",");
        sb.append("rpn_psn_nm").append("=").append(rpn_psn_nm).append(",");
        sb.append("rpn_adm_nm").append("=").append(rpn_adm_nm).append(",");
        sb.append("rpn_charg_psn_nm").append("=").append(rpn_charg_psn_nm).append(",");
        sb.append("rpn_daytm").append("=").append(rpn_daytm).append(",");
        sb.append("rpn_clsf").append("=").append(rpn_clsf).append(",");
        sb.append("rpn_clsf_nm").append("=").append(rpn_clsf_nm).append(",");
        sb.append("rpn_comment").append("=").append(rpn_comment).append(",");
        sb.append("rpn_attach_file").append("=").append(rpn_attach_file).append(",");
        sb.append("eval_psn_syspayno").append("=").append(eval_psn_syspayno).append(",");
        sb.append("eval_psn_syspaynm").append("=").append(eval_psn_syspaynm).append(",");
        sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
        sb.append("eval_comment").append("=").append(eval_comment).append(",");
        sb.append("eval_res_clsf").append("=").append(eval_res_clsf).append(",");
        sb.append("eval_res_clsf_nm").append("=").append(eval_res_clsf_nm).append(",");
        sb.append("rpe_psn_syspayno").append("=").append(rpe_psn_syspayno).append(",");
        sb.append("rpe_service_scr").append("=").append(rpe_service_scr).append(",");
        sb.append("rpe_result_scr").append("=").append(rpe_result_scr).append(",");
        sb.append("rpe_comment").append("=").append(rpe_comment).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("oares_sn").append("=").append(oares_sn).append(",");
        sb.append("rcpt_wri_nm").append("=").append(rcpt_wri_nm).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_charg_psn_nm").append("=").append(rcpt_charg_psn_nm).append(",");
        sb.append("rcpt_daytm").append("=").append(rcpt_daytm).append(",");
        sb.append("rcpt_clsf_nm").append("=").append(rcpt_clsf_nm).append(",");
        sb.append("rcpt_notice_nm").append("=").append(rcpt_notice_nm).append(",");
        sb.append("rcpt_oa_date").append("=").append(rcpt_oa_date).append(",");
        sb.append("rcpt_due_date").append("=").append(rcpt_due_date).append(",");
        sb.append("rcpt_comment").append("=").append(rcpt_comment).append(",");
        sb.append("rcpt_attach_file").append("=").append(rcpt_attach_file).append(",");
        sb.append("res_wri_nm").append("=").append(res_wri_nm).append(",");
        sb.append("res_psn_nm").append("=").append(res_psn_nm).append(",");
        sb.append("res_charg_psn_nm").append("=").append(res_charg_psn_nm).append(",");
        sb.append("res_daytm").append("=").append(res_daytm).append(",");
        sb.append("res_clsf").append("=").append(res_clsf).append(",");
        sb.append("res_clsf_nm").append("=").append(res_clsf_nm).append(",");
        sb.append("res_comment").append("=").append(res_comment).append(",");
        sb.append("res_file").append("=").append(res_file).append(",");
        sb.append("res_attach_file").append("=").append(res_attach_file).append(",");
        sb.append("rereq_comment").append("=").append(rereq_comment).append(",");
        sb.append("rereq_psn_syspaynm").append("=").append(rereq_psn_syspaynm).append(",");
        sb.append("rereq_daytm").append("=").append(rereq_daytm).append(",");
        sb.append("re_rereq_comment").append("=").append(re_rereq_comment).append(",");
        sb.append("re_res_clsf_nm").append("=").append(re_res_clsf_nm).append(",");
        sb.append("rpe_psn_syspaynm").append("=").append(rpe_psn_syspaynm).append(",");
        sb.append("rpe_daytm").append("=").append(rpe_daytm).append(",");
        sb.append("rcpt_quote_yn").append("=").append(rcpt_quote_yn).append(",");
        sb.append("rcpt_rsn").append("=").append(rcpt_rsn).append(",");
        sb.append("oa_sn_nm").append("=").append(oa_sn_nm).append(",");
        sb.append("oa_sn_cd").append("=").append(oa_sn_cd).append(",");
        sb.append("job_state_nm_detail").append("=").append(job_state_nm_detail).append(",");
        sb.append("job_state_nm").append("=").append(job_state_nm).append(",");
        sb.append("rcpt_wri_id").append("=").append(rcpt_wri_id).append(",");
        sb.append("rcpt_psn_id").append("=").append(rcpt_psn_id).append(",");
        sb.append("rcpt_adm_id").append("=").append(rcpt_adm_id).append(",");
        sb.append("rcpt_adm_nm").append("=").append(rcpt_adm_nm).append(",");
        sb.append("rcpt_charg_psn_id").append("=").append(rcpt_charg_psn_id).append(",");
        sb.append("rcpt_clsf").append("=").append(rcpt_clsf).append(",");
        sb.append("rcpt_notice").append("=").append(rcpt_notice).append(",");
        sb.append("oares_id").append("=").append(oares_id).append(",");
        sb.append("res_wri_id").append("=").append(res_wri_id).append(",");
        sb.append("res_psn_id").append("=").append(res_psn_id).append(",");
        sb.append("res_adm_id").append("=").append(res_adm_id).append(",");
        sb.append("res_adm_nm").append("=").append(res_adm_nm).append(",");
        sb.append("res_charg_psn_id").append("=").append(res_charg_psn_id).append(",");
        sb.append("res_div_clsf").append("=").append(res_div_clsf).append(",");
        sb.append("res_div_clsf_nm").append("=").append(res_div_clsf_nm).append(",");
        sb.append("re_oares_id").append("=").append(re_oares_id).append(",");
        sb.append("re_oares_sn").append("=").append(re_oares_sn).append(",");
        sb.append("re_res_wri_id").append("=").append(re_res_wri_id).append(",");
        sb.append("re_res_psn_id").append("=").append(re_res_psn_id).append(",");
        sb.append("re_res_adm_id").append("=").append(re_res_adm_id).append(",");
        sb.append("re_res_wri_nm").append("=").append(re_res_wri_nm).append(",");
        sb.append("re_res_psn_nm").append("=").append(re_res_psn_nm).append(",");
        sb.append("re_res_adm_nm").append("=").append(re_res_adm_nm).append(",");
        sb.append("re_res_daytm").append("=").append(re_res_daytm).append(",");
        sb.append("re_res_charg_psn_id").append("=").append(re_res_charg_psn_id).append(",");
        sb.append("re_res_charg_psn_nm").append("=").append(re_res_charg_psn_nm).append(",");
        sb.append("re_res_clsf").append("=").append(re_res_clsf).append(",");
        sb.append("re_res_div_clsf").append("=").append(re_res_div_clsf).append(",");
        sb.append("re_res_div_clsf_nm").append("=").append(re_res_div_clsf_nm).append(",");
        sb.append("re_res_comment").append("=").append(re_res_comment).append(",");
        sb.append("re_res_file").append("=").append(re_res_file).append(",");
        sb.append("re_res_attach_file").append("=").append(re_res_attach_file).append(",");
        sb.append("re_rereq_psn_syspayno").append("=").append(re_rereq_psn_syspayno).append(",");
        sb.append("re_rereq_daytm").append("=").append(re_rereq_daytm).append(",");
        sb.append("re_rereq_psn_syspaynm").append("=").append(re_rereq_psn_syspaynm).append(",");
        sb.append("rereq_psn_syspayno").append("=").append(rereq_psn_syspayno).append(",");
        sb.append("eval_result_scr").append("=").append(eval_result_scr).append(",");
        sb.append("eval_service_scr").append("=").append(eval_service_scr).append(",");
        sb.append("psn_syspayno").append("=").append(psn_syspayno).append(",");
        sb.append("act_sn").append("=").append(act_sn).append(",");
        sb.append("bf_state").append("=").append(bf_state).append(",");
        sb.append("act_blong_clsf").append("=").append(act_blong_clsf).append(",");
        sb.append("curr_state_cd").append("=").append(curr_state_cd).append(",");
        sb.append("next_state_cd").append("=").append(next_state_cd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("ref_key").append("=").append(ref_key);
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
