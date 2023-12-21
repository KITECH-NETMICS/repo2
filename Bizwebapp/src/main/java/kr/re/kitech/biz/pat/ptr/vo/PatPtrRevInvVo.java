package kr.re.kitech.biz.pat.ptr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPtrRevInvVoExp")
public class PatPtrRevInvVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPtrRevInvVo(){
  }

    @ElDtoField(logicalName = "docu_clsf", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;
  
    @ElDtoField(logicalName = "ref_key", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "next_state_cd", physicalName = "next_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String next_state_cd;
  
    @ElDtoField(logicalName = "curr_state_cd", physicalName = "curr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_state_cd;
  
    @ElDtoField(logicalName = "srh_sn_cd", physicalName = "srh_sn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_sn_cd;
  
    @ElDtoField(logicalName = "srh_sn_nm", physicalName = "srh_sn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_sn_nm;
  
    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;
  
    @ElDtoField(logicalName = "eval_clsf_nm", physicalName = "eval_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_clsf_nm;
  
    @ElDtoField(logicalName = "re_rercpt_daytm", physicalName = "re_rercpt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rercpt_daytm;
  
    @ElDtoField(logicalName = "re_rercpt_psn_nm", physicalName = "re_rercpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rercpt_psn_nm;
  
    @ElDtoField(logicalName = "re_rercpt_wri_nm", physicalName = "re_rercpt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rercpt_wri_nm;
  
    @ElDtoField(logicalName = "re_rercpt_psn_id", physicalName = "re_rercpt_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rercpt_psn_id;
  
    @ElDtoField(logicalName = "re_rercpt_wri_id", physicalName = "re_rercpt_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rercpt_wri_id;
  
    @ElDtoField(logicalName = "re_rereq_comment", physicalName = "re_rereq_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_comment;
  
    @ElDtoField(logicalName = "re_rereq_daytm", physicalName = "re_rereq_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_daytm;
  
    @ElDtoField(logicalName = "re_rereq_psn_nm", physicalName = "re_rereq_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_psn_nm;
  
    @ElDtoField(logicalName = "re_rereq_psn_syspayno", physicalName = "re_rereq_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_psn_syspayno;
  
    @ElDtoField(logicalName = "eval_psn_nm", physicalName = "eval_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_nm;
  
    @ElDtoField(logicalName = "rercpt_daytm", physicalName = "rercpt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rercpt_daytm;
  
    @ElDtoField(logicalName = "re_rereq_psn_syspaynm", physicalName = "re_rereq_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_rereq_psn_syspaynm;
  
    @ElDtoField(logicalName = "rercpt_psn_nm", physicalName = "rercpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rercpt_psn_nm;
  
    @ElDtoField(logicalName = "rercpt_wri_nm", physicalName = "rercpt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rercpt_wri_nm;
  
    @ElDtoField(logicalName = "rercpt_psn_id", physicalName = "rercpt_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rercpt_psn_id;
  
    @ElDtoField(logicalName = "rercpt_wri_id", physicalName = "rercpt_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rercpt_wri_id;
  
    @ElDtoField(logicalName = "rereq_daytm", physicalName = "rereq_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_daytm;
  
    @ElDtoField(logicalName = "rereq_psn_nm", physicalName = "rereq_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_psn_nm;
  
    @ElDtoField(logicalName = "patofic_charg_nm", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;
  
    @ElDtoField(logicalName = "patofic_nm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;
  
    @ElDtoField(logicalName = "smitapp_natn_cd", physicalName = "smitapp_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_cd;
  
    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;
  
    @ElDtoField(logicalName = "psn_syspayno", physicalName = "psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_syspayno;
  
    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;
  
    @ElDtoField(logicalName = "rereq_psn_syspayno", physicalName = "rereq_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_psn_syspayno;
  
    @ElDtoField(logicalName = "eval_clsf", physicalName = "eval_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_clsf;
  
    @ElDtoField(logicalName = "eval_comment", physicalName = "eval_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_comment;
  
    @ElDtoField(logicalName = "rereq_comment", physicalName = "rereq_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rereq_comment;
  
    @ElDtoField(logicalName = "eval_result_scr", physicalName = "eval_result_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_result_scr;
  
    @ElDtoField(logicalName = "eval_service_scr", physicalName = "eval_service_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_service_scr;
  
    @ElDtoField(logicalName = "re_eval_clsf_nm", physicalName = "re_eval_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_eval_clsf_nm;
  
    @ElDtoField(logicalName = "re_eval_clsf", physicalName = "re_eval_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_eval_clsf;
  
    @ElDtoField(logicalName = "eval_daytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;
  
    @ElDtoField(logicalName = "eval_psn_syspaynm", physicalName = "eval_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspaynm;
  
    @ElDtoField(logicalName = "eval_psn_syspayno", physicalName = "eval_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspayno;
  
    @ElDtoField(logicalName = "rpt_announce_attach_file", physicalName = "rpt_announce_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_announce_attach_file;
  
    @ElDtoField(logicalName = "rpt_srh_attach_file", physicalName = "rpt_srh_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_srh_attach_file;
  
    @ElDtoField(logicalName = "rpt_search_clsf_nm", physicalName = "rpt_search_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_search_clsf_nm;
  
    @ElDtoField(logicalName = "rpt_search_clsf", physicalName = "rpt_search_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_search_clsf;
  
    @ElDtoField(logicalName = "rpt_attach_file", physicalName = "rpt_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_attach_file;
  
    @ElDtoField(logicalName = "rpt_comment", physicalName = "rpt_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_comment;
  
    @ElDtoField(logicalName = "rpt_daytm", physicalName = "rpt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_daytm;
  
    @ElDtoField(logicalName = "rpt_charg_psn_nm", physicalName = "rpt_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_charg_psn_nm;
  
    @ElDtoField(logicalName = "rpt_adm_nm", physicalName = "rpt_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_adm_nm;
  
    @ElDtoField(logicalName = "rpt_psn_nm", physicalName = "rpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_psn_nm;
  
    @ElDtoField(logicalName = "rpt_wri_nm", physicalName = "rpt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_wri_nm;
  
    @ElDtoField(logicalName = "rpt_charg_psn_id", physicalName = "rpt_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_charg_psn_id;
  
    @ElDtoField(logicalName = "rpt_adm_id", physicalName = "rpt_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_adm_id;
  
    @ElDtoField(logicalName = "rpt_psn_id", physicalName = "rpt_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_psn_id;
  
    @ElDtoField(logicalName = "rpt_wri_id", physicalName = "rpt_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_wri_id;
  
    @ElDtoField(logicalName = "rcpt_patofic_mng_no", physicalName = "rcpt_patofic_mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_patofic_mng_no;
  
    @ElDtoField(logicalName = "charg_psn_nm", physicalName = "charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_psn_nm;
  
    @ElDtoField(logicalName = "rcpt_charg_psn_id", physicalName = "rcpt_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_charg_psn_id;
  
    @ElDtoField(logicalName = "rcpt_daytm", physicalName = "rcpt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_daytm;
  
    @ElDtoField(logicalName = "rcpt_adm_nm", physicalName = "rcpt_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_adm_nm;
  
    @ElDtoField(logicalName = "rcpt_psn_nm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;
  
    @ElDtoField(logicalName = "rcpt_wri_nm", physicalName = "rcpt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_wri_nm;
  
    @ElDtoField(logicalName = "rcpt_adm_id", physicalName = "rcpt_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_adm_id;
  
    @ElDtoField(logicalName = "rcpt_psn_id", physicalName = "rcpt_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_id;
  
    @ElDtoField(logicalName = "rcpt_wri_id", physicalName = "rcpt_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_wri_id;
  
    @ElDtoField(logicalName = "req_attach_file_no", physicalName = "req_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_attach_file_no;
  
    @ElDtoField(logicalName = "req_comment", physicalName = "req_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_comment;
  
    @ElDtoField(logicalName = "req_due_date", physicalName = "req_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_due_date;
  
    @ElDtoField(logicalName = "hope_patofic_charg_nm", physicalName = "hope_patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_charg_nm;
  
    @ElDtoField(logicalName = "hope_patofic_charg_id", physicalName = "hope_patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_charg_id;
  
    @ElDtoField(logicalName = "req_patofic_nm", physicalName = "req_patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_patofic_nm;
  
    @ElDtoField(logicalName = "req_patofic_cd", physicalName = "req_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_patofic_cd;
  
    @ElDtoField(logicalName = "req_daytm", physicalName = "req_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_daytm;
  
    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;
  
    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;
  
    @ElDtoField(logicalName = "job_state_nm", physicalName = "job_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_nm;
  
    @ElDtoField(logicalName = "job_state_nm_detail", physicalName = "job_state_nm_detail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_nm_detail;
  
    @ElDtoField(logicalName = "job_state_cd", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;
  
    @ElDtoField(logicalName = "mngmt_no", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "srh_sn", physicalName = "srh_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_sn;
  
    @ElDtoField(logicalName = "srhres_id", physicalName = "srhres_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srhres_id;
  
    @ElDtoField(logicalName = "ref_id", physicalName = "ref_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_id;
  
    @ElDtoField(logicalName = "srh_id", physicalName = "srh_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_id;
  
    @ElDtoField(logicalName = "interview_yn", physicalName = "interview_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String interview_yn;
  
    @ElDtoField(logicalName = "patofic_full_nm", physicalName = "patofic_full_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_full_nm;
  
    @ElDtoField(logicalName = "smitapp_hope_natn_nm", physicalName = "smitapp_hope_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_nm;
  
    @ElDtoField(logicalName = "invnt_nm", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;
  
    @ElDtoField(logicalName = "invnt_syspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;
  
    @ElDtoField(logicalName = "invnt_krn_nm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;
  
    @ElDtoField(logicalName = "tech_clsf_nm", physicalName = "tech_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf_nm;
  
    @ElDtoField(logicalName = "tech_clsf", physicalName = "tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf;
  
    @ElDtoField(logicalName = "pat_clsf_nm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;
  
    @ElDtoField(logicalName = "pat_clsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;
  
    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElVoField(physicalName = "docu_clsf")
    public String getDocu_clsf(){
        return docu_clsf;
    }
  
    @ElVoField(physicalName = "docu_clsf")
    public void setDocu_clsf(String docu_clsf){
        this.docu_clsf = docu_clsf;
    }
  
    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }
  
    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
  
    @ElVoField(physicalName = "next_state_cd")
    public String getNext_state_cd(){
        return next_state_cd;
    }
  
    @ElVoField(physicalName = "next_state_cd")
    public void setNext_state_cd(String next_state_cd){
        this.next_state_cd = next_state_cd;
    }
  
    @ElVoField(physicalName = "curr_state_cd")
    public String getCurr_state_cd(){
        return curr_state_cd;
    }
  
    @ElVoField(physicalName = "curr_state_cd")
    public void setCurr_state_cd(String curr_state_cd){
        this.curr_state_cd = curr_state_cd;
    }
  
    @ElVoField(physicalName = "srh_sn_cd")
    public String getSrh_sn_cd(){
        return srh_sn_cd;
    }
  
    @ElVoField(physicalName = "srh_sn_cd")
    public void setSrh_sn_cd(String srh_sn_cd){
        this.srh_sn_cd = srh_sn_cd;
    }
  
    @ElVoField(physicalName = "srh_sn_nm")
    public String getSrh_sn_nm(){
        return srh_sn_nm;
    }
  
    @ElVoField(physicalName = "srh_sn_nm")
    public void setSrh_sn_nm(String srh_sn_nm){
        this.srh_sn_nm = srh_sn_nm;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }
  
    @ElVoField(physicalName = "eval_clsf_nm")
    public String getEval_clsf_nm(){
        return eval_clsf_nm;
    }
  
    @ElVoField(physicalName = "eval_clsf_nm")
    public void setEval_clsf_nm(String eval_clsf_nm){
        this.eval_clsf_nm = eval_clsf_nm;
    }
  
    @ElVoField(physicalName = "re_rercpt_daytm")
    public String getRe_rercpt_daytm(){
        return re_rercpt_daytm;
    }
  
    @ElVoField(physicalName = "re_rercpt_daytm")
    public void setRe_rercpt_daytm(String re_rercpt_daytm){
        this.re_rercpt_daytm = re_rercpt_daytm;
    }
  
    @ElVoField(physicalName = "re_rercpt_psn_nm")
    public String getRe_rercpt_psn_nm(){
        return re_rercpt_psn_nm;
    }
  
    @ElVoField(physicalName = "re_rercpt_psn_nm")
    public void setRe_rercpt_psn_nm(String re_rercpt_psn_nm){
        this.re_rercpt_psn_nm = re_rercpt_psn_nm;
    }
  
    @ElVoField(physicalName = "re_rercpt_wri_nm")
    public String getRe_rercpt_wri_nm(){
        return re_rercpt_wri_nm;
    }
  
    @ElVoField(physicalName = "re_rercpt_wri_nm")
    public void setRe_rercpt_wri_nm(String re_rercpt_wri_nm){
        this.re_rercpt_wri_nm = re_rercpt_wri_nm;
    }
  
    @ElVoField(physicalName = "re_rercpt_psn_id")
    public String getRe_rercpt_psn_id(){
        return re_rercpt_psn_id;
    }
  
    @ElVoField(physicalName = "re_rercpt_psn_id")
    public void setRe_rercpt_psn_id(String re_rercpt_psn_id){
        this.re_rercpt_psn_id = re_rercpt_psn_id;
    }
  
    @ElVoField(physicalName = "re_rercpt_wri_id")
    public String getRe_rercpt_wri_id(){
        return re_rercpt_wri_id;
    }
  
    @ElVoField(physicalName = "re_rercpt_wri_id")
    public void setRe_rercpt_wri_id(String re_rercpt_wri_id){
        this.re_rercpt_wri_id = re_rercpt_wri_id;
    }
  
    @ElVoField(physicalName = "re_rereq_comment")
    public String getRe_rereq_comment(){
        return re_rereq_comment;
    }
  
    @ElVoField(physicalName = "re_rereq_comment")
    public void setRe_rereq_comment(String re_rereq_comment){
        this.re_rereq_comment = re_rereq_comment;
    }
  
    @ElVoField(physicalName = "re_rereq_daytm")
    public String getRe_rereq_daytm(){
        return re_rereq_daytm;
    }
  
    @ElVoField(physicalName = "re_rereq_daytm")
    public void setRe_rereq_daytm(String re_rereq_daytm){
        this.re_rereq_daytm = re_rereq_daytm;
    }
  
    @ElVoField(physicalName = "re_rereq_psn_nm")
    public String getRe_rereq_psn_nm(){
        return re_rereq_psn_nm;
    }
  
    @ElVoField(physicalName = "re_rereq_psn_nm")
    public void setRe_rereq_psn_nm(String re_rereq_psn_nm){
        this.re_rereq_psn_nm = re_rereq_psn_nm;
    }
  
    @ElVoField(physicalName = "re_rereq_psn_syspayno")
    public String getRe_rereq_psn_syspayno(){
        return re_rereq_psn_syspayno;
    }
  
    @ElVoField(physicalName = "re_rereq_psn_syspayno")
    public void setRe_rereq_psn_syspayno(String re_rereq_psn_syspayno){
        this.re_rereq_psn_syspayno = re_rereq_psn_syspayno;
    }
  
    @ElVoField(physicalName = "eval_psn_nm")
    public String getEval_psn_nm(){
        return eval_psn_nm;
    }
  
    @ElVoField(physicalName = "eval_psn_nm")
    public void setEval_psn_nm(String eval_psn_nm){
        this.eval_psn_nm = eval_psn_nm;
    }
  
    @ElVoField(physicalName = "rercpt_daytm")
    public String getRercpt_daytm(){
        return rercpt_daytm;
    }
  
    @ElVoField(physicalName = "rercpt_daytm")
    public void setRercpt_daytm(String rercpt_daytm){
        this.rercpt_daytm = rercpt_daytm;
    }
  
    @ElVoField(physicalName = "re_rereq_psn_syspaynm")
    public String getRe_rereq_psn_syspaynm(){
        return re_rereq_psn_syspaynm;
    }
  
    @ElVoField(physicalName = "re_rereq_psn_syspaynm")
    public void setRe_rereq_psn_syspaynm(String re_rereq_psn_syspaynm){
        this.re_rereq_psn_syspaynm = re_rereq_psn_syspaynm;
    }
  
    @ElVoField(physicalName = "rercpt_psn_nm")
    public String getRercpt_psn_nm(){
        return rercpt_psn_nm;
    }
  
    @ElVoField(physicalName = "rercpt_psn_nm")
    public void setRercpt_psn_nm(String rercpt_psn_nm){
        this.rercpt_psn_nm = rercpt_psn_nm;
    }
  
    @ElVoField(physicalName = "rercpt_wri_nm")
    public String getRercpt_wri_nm(){
        return rercpt_wri_nm;
    }
  
    @ElVoField(physicalName = "rercpt_wri_nm")
    public void setRercpt_wri_nm(String rercpt_wri_nm){
        this.rercpt_wri_nm = rercpt_wri_nm;
    }
  
    @ElVoField(physicalName = "rercpt_psn_id")
    public String getRercpt_psn_id(){
        return rercpt_psn_id;
    }
  
    @ElVoField(physicalName = "rercpt_psn_id")
    public void setRercpt_psn_id(String rercpt_psn_id){
        this.rercpt_psn_id = rercpt_psn_id;
    }
  
    @ElVoField(physicalName = "rercpt_wri_id")
    public String getRercpt_wri_id(){
        return rercpt_wri_id;
    }
  
    @ElVoField(physicalName = "rercpt_wri_id")
    public void setRercpt_wri_id(String rercpt_wri_id){
        this.rercpt_wri_id = rercpt_wri_id;
    }
  
    @ElVoField(physicalName = "rereq_daytm")
    public String getRereq_daytm(){
        return rereq_daytm;
    }
  
    @ElVoField(physicalName = "rereq_daytm")
    public void setRereq_daytm(String rereq_daytm){
        this.rereq_daytm = rereq_daytm;
    }
  
    @ElVoField(physicalName = "rereq_psn_nm")
    public String getRereq_psn_nm(){
        return rereq_psn_nm;
    }
  
    @ElVoField(physicalName = "rereq_psn_nm")
    public void setRereq_psn_nm(String rereq_psn_nm){
        this.rereq_psn_nm = rereq_psn_nm;
    }
  
    @ElVoField(physicalName = "patofic_charg_nm")
    public String getPatofic_charg_nm(){
        return patofic_charg_nm;
    }
  
    @ElVoField(physicalName = "patofic_charg_nm")
    public void setPatofic_charg_nm(String patofic_charg_nm){
        this.patofic_charg_nm = patofic_charg_nm;
    }
  
    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }
  
    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }
  
    @ElVoField(physicalName = "smitapp_natn_cd")
    public String getSmitapp_natn_cd(){
        return smitapp_natn_cd;
    }
  
    @ElVoField(physicalName = "smitapp_natn_cd")
    public void setSmitapp_natn_cd(String smitapp_natn_cd){
        this.smitapp_natn_cd = smitapp_natn_cd;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }
  
    @ElVoField(physicalName = "psn_syspayno")
    public String getPsn_syspayno(){
        return psn_syspayno;
    }
  
    @ElVoField(physicalName = "psn_syspayno")
    public void setPsn_syspayno(String psn_syspayno){
        this.psn_syspayno = psn_syspayno;
    }
  
    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }
  
    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }
  
    @ElVoField(physicalName = "rereq_psn_syspayno")
    public String getRereq_psn_syspayno(){
        return rereq_psn_syspayno;
    }
  
    @ElVoField(physicalName = "rereq_psn_syspayno")
    public void setRereq_psn_syspayno(String rereq_psn_syspayno){
        this.rereq_psn_syspayno = rereq_psn_syspayno;
    }
  
    @ElVoField(physicalName = "eval_clsf")
    public String getEval_clsf(){
        return eval_clsf;
    }
  
    @ElVoField(physicalName = "eval_clsf")
    public void setEval_clsf(String eval_clsf){
        this.eval_clsf = eval_clsf;
    }
  
    @ElVoField(physicalName = "eval_comment")
    public String getEval_comment(){
        return eval_comment;
    }
  
    @ElVoField(physicalName = "eval_comment")
    public void setEval_comment(String eval_comment){
        this.eval_comment = eval_comment;
    }
  
    @ElVoField(physicalName = "rereq_comment")
    public String getRereq_comment(){
        return rereq_comment;
    }
  
    @ElVoField(physicalName = "rereq_comment")
    public void setRereq_comment(String rereq_comment){
        this.rereq_comment = rereq_comment;
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
  
    @ElVoField(physicalName = "re_eval_clsf_nm")
    public String getRe_eval_clsf_nm(){
        return re_eval_clsf_nm;
    }
  
    @ElVoField(physicalName = "re_eval_clsf_nm")
    public void setRe_eval_clsf_nm(String re_eval_clsf_nm){
        this.re_eval_clsf_nm = re_eval_clsf_nm;
    }
  
    @ElVoField(physicalName = "re_eval_clsf")
    public String getRe_eval_clsf(){
        return re_eval_clsf;
    }
  
    @ElVoField(physicalName = "re_eval_clsf")
    public void setRe_eval_clsf(String re_eval_clsf){
        this.re_eval_clsf = re_eval_clsf;
    }
  
    @ElVoField(physicalName = "eval_daytm")
    public String getEval_daytm(){
        return eval_daytm;
    }
  
    @ElVoField(physicalName = "eval_daytm")
    public void setEval_daytm(String eval_daytm){
        this.eval_daytm = eval_daytm;
    }
  
    @ElVoField(physicalName = "eval_psn_syspaynm")
    public String getEval_psn_syspaynm(){
        return eval_psn_syspaynm;
    }
  
    @ElVoField(physicalName = "eval_psn_syspaynm")
    public void setEval_psn_syspaynm(String eval_psn_syspaynm){
        this.eval_psn_syspaynm = eval_psn_syspaynm;
    }
  
    @ElVoField(physicalName = "eval_psn_syspayno")
    public String getEval_psn_syspayno(){
        return eval_psn_syspayno;
    }
  
    @ElVoField(physicalName = "eval_psn_syspayno")
    public void setEval_psn_syspayno(String eval_psn_syspayno){
        this.eval_psn_syspayno = eval_psn_syspayno;
    }
  
    @ElVoField(physicalName = "rpt_announce_attach_file")
    public String getRpt_announce_attach_file(){
        return rpt_announce_attach_file;
    }
  
    @ElVoField(physicalName = "rpt_announce_attach_file")
    public void setRpt_announce_attach_file(String rpt_announce_attach_file){
        this.rpt_announce_attach_file = rpt_announce_attach_file;
    }
  
    @ElVoField(physicalName = "rpt_srh_attach_file")
    public String getRpt_srh_attach_file(){
        return rpt_srh_attach_file;
    }
  
    @ElVoField(physicalName = "rpt_srh_attach_file")
    public void setRpt_srh_attach_file(String rpt_srh_attach_file){
        this.rpt_srh_attach_file = rpt_srh_attach_file;
    }
  
    @ElVoField(physicalName = "rpt_search_clsf_nm")
    public String getRpt_search_clsf_nm(){
        return rpt_search_clsf_nm;
    }
  
    @ElVoField(physicalName = "rpt_search_clsf_nm")
    public void setRpt_search_clsf_nm(String rpt_search_clsf_nm){
        this.rpt_search_clsf_nm = rpt_search_clsf_nm;
    }
  
    @ElVoField(physicalName = "rpt_search_clsf")
    public String getRpt_search_clsf(){
        return rpt_search_clsf;
    }
  
    @ElVoField(physicalName = "rpt_search_clsf")
    public void setRpt_search_clsf(String rpt_search_clsf){
        this.rpt_search_clsf = rpt_search_clsf;
    }
  
    @ElVoField(physicalName = "rpt_attach_file")
    public String getRpt_attach_file(){
        return rpt_attach_file;
    }
  
    @ElVoField(physicalName = "rpt_attach_file")
    public void setRpt_attach_file(String rpt_attach_file){
        this.rpt_attach_file = rpt_attach_file;
    }
  
    @ElVoField(physicalName = "rpt_comment")
    public String getRpt_comment(){
        return rpt_comment;
    }
  
    @ElVoField(physicalName = "rpt_comment")
    public void setRpt_comment(String rpt_comment){
        this.rpt_comment = rpt_comment;
    }
  
    @ElVoField(physicalName = "rpt_daytm")
    public String getRpt_daytm(){
        return rpt_daytm;
    }
  
    @ElVoField(physicalName = "rpt_daytm")
    public void setRpt_daytm(String rpt_daytm){
        this.rpt_daytm = rpt_daytm;
    }
  
    @ElVoField(physicalName = "rpt_charg_psn_nm")
    public String getRpt_charg_psn_nm(){
        return rpt_charg_psn_nm;
    }
  
    @ElVoField(physicalName = "rpt_charg_psn_nm")
    public void setRpt_charg_psn_nm(String rpt_charg_psn_nm){
        this.rpt_charg_psn_nm = rpt_charg_psn_nm;
    }
  
    @ElVoField(physicalName = "rpt_adm_nm")
    public String getRpt_adm_nm(){
        return rpt_adm_nm;
    }
  
    @ElVoField(physicalName = "rpt_adm_nm")
    public void setRpt_adm_nm(String rpt_adm_nm){
        this.rpt_adm_nm = rpt_adm_nm;
    }
  
    @ElVoField(physicalName = "rpt_psn_nm")
    public String getRpt_psn_nm(){
        return rpt_psn_nm;
    }
  
    @ElVoField(physicalName = "rpt_psn_nm")
    public void setRpt_psn_nm(String rpt_psn_nm){
        this.rpt_psn_nm = rpt_psn_nm;
    }
  
    @ElVoField(physicalName = "rpt_wri_nm")
    public String getRpt_wri_nm(){
        return rpt_wri_nm;
    }
  
    @ElVoField(physicalName = "rpt_wri_nm")
    public void setRpt_wri_nm(String rpt_wri_nm){
        this.rpt_wri_nm = rpt_wri_nm;
    }
  
    @ElVoField(physicalName = "rpt_charg_psn_id")
    public String getRpt_charg_psn_id(){
        return rpt_charg_psn_id;
    }
  
    @ElVoField(physicalName = "rpt_charg_psn_id")
    public void setRpt_charg_psn_id(String rpt_charg_psn_id){
        this.rpt_charg_psn_id = rpt_charg_psn_id;
    }
  
    @ElVoField(physicalName = "rpt_adm_id")
    public String getRpt_adm_id(){
        return rpt_adm_id;
    }
  
    @ElVoField(physicalName = "rpt_adm_id")
    public void setRpt_adm_id(String rpt_adm_id){
        this.rpt_adm_id = rpt_adm_id;
    }
  
    @ElVoField(physicalName = "rpt_psn_id")
    public String getRpt_psn_id(){
        return rpt_psn_id;
    }
  
    @ElVoField(physicalName = "rpt_psn_id")
    public void setRpt_psn_id(String rpt_psn_id){
        this.rpt_psn_id = rpt_psn_id;
    }
  
    @ElVoField(physicalName = "rpt_wri_id")
    public String getRpt_wri_id(){
        return rpt_wri_id;
    }
  
    @ElVoField(physicalName = "rpt_wri_id")
    public void setRpt_wri_id(String rpt_wri_id){
        this.rpt_wri_id = rpt_wri_id;
    }
  
    @ElVoField(physicalName = "rcpt_patofic_mng_no")
    public String getRcpt_patofic_mng_no(){
        return rcpt_patofic_mng_no;
    }
  
    @ElVoField(physicalName = "rcpt_patofic_mng_no")
    public void setRcpt_patofic_mng_no(String rcpt_patofic_mng_no){
        this.rcpt_patofic_mng_no = rcpt_patofic_mng_no;
    }
  
    @ElVoField(physicalName = "charg_psn_nm")
    public String getCharg_psn_nm(){
        return charg_psn_nm;
    }
  
    @ElVoField(physicalName = "charg_psn_nm")
    public void setCharg_psn_nm(String charg_psn_nm){
        this.charg_psn_nm = charg_psn_nm;
    }
  
    @ElVoField(physicalName = "rcpt_charg_psn_id")
    public String getRcpt_charg_psn_id(){
        return rcpt_charg_psn_id;
    }
  
    @ElVoField(physicalName = "rcpt_charg_psn_id")
    public void setRcpt_charg_psn_id(String rcpt_charg_psn_id){
        this.rcpt_charg_psn_id = rcpt_charg_psn_id;
    }
  
    @ElVoField(physicalName = "rcpt_daytm")
    public String getRcpt_daytm(){
        return rcpt_daytm;
    }
  
    @ElVoField(physicalName = "rcpt_daytm")
    public void setRcpt_daytm(String rcpt_daytm){
        this.rcpt_daytm = rcpt_daytm;
    }
  
    @ElVoField(physicalName = "rcpt_adm_nm")
    public String getRcpt_adm_nm(){
        return rcpt_adm_nm;
    }
  
    @ElVoField(physicalName = "rcpt_adm_nm")
    public void setRcpt_adm_nm(String rcpt_adm_nm){
        this.rcpt_adm_nm = rcpt_adm_nm;
    }
  
    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }
  
    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }
  
    @ElVoField(physicalName = "rcpt_wri_nm")
    public String getRcpt_wri_nm(){
        return rcpt_wri_nm;
    }
  
    @ElVoField(physicalName = "rcpt_wri_nm")
    public void setRcpt_wri_nm(String rcpt_wri_nm){
        this.rcpt_wri_nm = rcpt_wri_nm;
    }
  
    @ElVoField(physicalName = "rcpt_adm_id")
    public String getRcpt_adm_id(){
        return rcpt_adm_id;
    }
  
    @ElVoField(physicalName = "rcpt_adm_id")
    public void setRcpt_adm_id(String rcpt_adm_id){
        this.rcpt_adm_id = rcpt_adm_id;
    }
  
    @ElVoField(physicalName = "rcpt_psn_id")
    public String getRcpt_psn_id(){
        return rcpt_psn_id;
    }
  
    @ElVoField(physicalName = "rcpt_psn_id")
    public void setRcpt_psn_id(String rcpt_psn_id){
        this.rcpt_psn_id = rcpt_psn_id;
    }
  
    @ElVoField(physicalName = "rcpt_wri_id")
    public String getRcpt_wri_id(){
        return rcpt_wri_id;
    }
  
    @ElVoField(physicalName = "rcpt_wri_id")
    public void setRcpt_wri_id(String rcpt_wri_id){
        this.rcpt_wri_id = rcpt_wri_id;
    }
  
    @ElVoField(physicalName = "req_attach_file_no")
    public String getReq_attach_file_no(){
        return req_attach_file_no;
    }
  
    @ElVoField(physicalName = "req_attach_file_no")
    public void setReq_attach_file_no(String req_attach_file_no){
        this.req_attach_file_no = req_attach_file_no;
    }
  
    @ElVoField(physicalName = "req_comment")
    public String getReq_comment(){
        return req_comment;
    }
  
    @ElVoField(physicalName = "req_comment")
    public void setReq_comment(String req_comment){
        this.req_comment = req_comment;
    }
  
    @ElVoField(physicalName = "req_due_date")
    public String getReq_due_date(){
        return req_due_date;
    }
  
    @ElVoField(physicalName = "req_due_date")
    public void setReq_due_date(String req_due_date){
        this.req_due_date = req_due_date;
    }
  
    @ElVoField(physicalName = "hope_patofic_charg_nm")
    public String getHope_patofic_charg_nm(){
        return hope_patofic_charg_nm;
    }
  
    @ElVoField(physicalName = "hope_patofic_charg_nm")
    public void setHope_patofic_charg_nm(String hope_patofic_charg_nm){
        this.hope_patofic_charg_nm = hope_patofic_charg_nm;
    }
  
    @ElVoField(physicalName = "hope_patofic_charg_id")
    public String getHope_patofic_charg_id(){
        return hope_patofic_charg_id;
    }
  
    @ElVoField(physicalName = "hope_patofic_charg_id")
    public void setHope_patofic_charg_id(String hope_patofic_charg_id){
        this.hope_patofic_charg_id = hope_patofic_charg_id;
    }
  
    @ElVoField(physicalName = "req_patofic_nm")
    public String getReq_patofic_nm(){
        return req_patofic_nm;
    }
  
    @ElVoField(physicalName = "req_patofic_nm")
    public void setReq_patofic_nm(String req_patofic_nm){
        this.req_patofic_nm = req_patofic_nm;
    }
  
    @ElVoField(physicalName = "req_patofic_cd")
    public String getReq_patofic_cd(){
        return req_patofic_cd;
    }
  
    @ElVoField(physicalName = "req_patofic_cd")
    public void setReq_patofic_cd(String req_patofic_cd){
        this.req_patofic_cd = req_patofic_cd;
    }
  
    @ElVoField(physicalName = "req_daytm")
    public String getReq_daytm(){
        return req_daytm;
    }
  
    @ElVoField(physicalName = "req_daytm")
    public void setReq_daytm(String req_daytm){
        this.req_daytm = req_daytm;
    }
  
    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }
  
    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }
  
    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }
  
    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }
  
    @ElVoField(physicalName = "job_state_nm")
    public String getJob_state_nm(){
        return job_state_nm;
    }
  
    @ElVoField(physicalName = "job_state_nm")
    public void setJob_state_nm(String job_state_nm){
        this.job_state_nm = job_state_nm;
    }
  
    @ElVoField(physicalName = "job_state_nm_detail")
    public String getJob_state_nm_detail(){
        return job_state_nm_detail;
    }
  
    @ElVoField(physicalName = "job_state_nm_detail")
    public void setJob_state_nm_detail(String job_state_nm_detail){
        this.job_state_nm_detail = job_state_nm_detail;
    }
  
    @ElVoField(physicalName = "job_state_cd")
    public String getJob_state_cd(){
        return job_state_cd;
    }
  
    @ElVoField(physicalName = "job_state_cd")
    public void setJob_state_cd(String job_state_cd){
        this.job_state_cd = job_state_cd;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "srh_sn")
    public String getSrh_sn(){
        return srh_sn;
    }
  
    @ElVoField(physicalName = "srh_sn")
    public void setSrh_sn(String srh_sn){
        this.srh_sn = srh_sn;
    }
  
    @ElVoField(physicalName = "srhres_id")
    public String getSrhres_id(){
        return srhres_id;
    }
  
    @ElVoField(physicalName = "srhres_id")
    public void setSrhres_id(String srhres_id){
        this.srhres_id = srhres_id;
    }
  
    @ElVoField(physicalName = "ref_id")
    public String getRef_id(){
        return ref_id;
    }
  
    @ElVoField(physicalName = "ref_id")
    public void setRef_id(String ref_id){
        this.ref_id = ref_id;
    }
  
    @ElVoField(physicalName = "srh_id")
    public String getSrh_id(){
        return srh_id;
    }
  
    @ElVoField(physicalName = "srh_id")
    public void setSrh_id(String srh_id){
        this.srh_id = srh_id;
    }
  
    @ElVoField(physicalName = "interview_yn")
    public String getInterview_yn(){
        return interview_yn;
    }
  
    @ElVoField(physicalName = "interview_yn")
    public void setInterview_yn(String interview_yn){
        this.interview_yn = interview_yn;
    }
  
    @ElVoField(physicalName = "patofic_full_nm")
    public String getPatofic_full_nm(){
        return patofic_full_nm;
    }
  
    @ElVoField(physicalName = "patofic_full_nm")
    public void setPatofic_full_nm(String patofic_full_nm){
        this.patofic_full_nm = patofic_full_nm;
    }
  
    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public String getSmitapp_hope_natn_nm(){
        return smitapp_hope_natn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public void setSmitapp_hope_natn_nm(String smitapp_hope_natn_nm){
        this.smitapp_hope_natn_nm = smitapp_hope_natn_nm;
    }
  
    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }
  
    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "tech_clsf_nm")
    public String getTech_clsf_nm(){
        return tech_clsf_nm;
    }
  
    @ElVoField(physicalName = "tech_clsf_nm")
    public void setTech_clsf_nm(String tech_clsf_nm){
        this.tech_clsf_nm = tech_clsf_nm;
    }
  
    @ElVoField(physicalName = "tech_clsf")
    public String getTech_clsf(){
        return tech_clsf;
    }
  
    @ElVoField(physicalName = "tech_clsf")
    public void setTech_clsf(String tech_clsf){
        this.tech_clsf = tech_clsf;
    }
  
    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }
  
    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPtrRevInvVo [");
      sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
      sb.append("ref_key").append("=").append(ref_key).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("next_state_cd").append("=").append(next_state_cd).append(",");
      sb.append("curr_state_cd").append("=").append(curr_state_cd).append(",");
      sb.append("srh_sn_cd").append("=").append(srh_sn_cd).append(",");
      sb.append("srh_sn_nm").append("=").append(srh_sn_nm).append(",");
      sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
      sb.append("eval_clsf_nm").append("=").append(eval_clsf_nm).append(",");
      sb.append("re_rercpt_daytm").append("=").append(re_rercpt_daytm).append(",");
      sb.append("re_rercpt_psn_nm").append("=").append(re_rercpt_psn_nm).append(",");
      sb.append("re_rercpt_wri_nm").append("=").append(re_rercpt_wri_nm).append(",");
      sb.append("re_rercpt_psn_id").append("=").append(re_rercpt_psn_id).append(",");
      sb.append("re_rercpt_wri_id").append("=").append(re_rercpt_wri_id).append(",");
      sb.append("re_rereq_comment").append("=").append(re_rereq_comment).append(",");
      sb.append("re_rereq_daytm").append("=").append(re_rereq_daytm).append(",");
      sb.append("re_rereq_psn_nm").append("=").append(re_rereq_psn_nm).append(",");
      sb.append("re_rereq_psn_syspayno").append("=").append(re_rereq_psn_syspayno).append(",");
      sb.append("eval_psn_nm").append("=").append(eval_psn_nm).append(",");
      sb.append("rercpt_daytm").append("=").append(rercpt_daytm).append(",");
      sb.append("re_rereq_psn_syspaynm").append("=").append(re_rereq_psn_syspaynm).append(",");
      sb.append("rercpt_psn_nm").append("=").append(rercpt_psn_nm).append(",");
      sb.append("rercpt_wri_nm").append("=").append(rercpt_wri_nm).append(",");
      sb.append("rercpt_psn_id").append("=").append(rercpt_psn_id).append(",");
      sb.append("rercpt_wri_id").append("=").append(rercpt_wri_id).append(",");
      sb.append("rereq_daytm").append("=").append(rereq_daytm).append(",");
      sb.append("rereq_psn_nm").append("=").append(rereq_psn_nm).append(",");
      sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
      sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
      sb.append("smitapp_natn_cd").append("=").append(smitapp_natn_cd).append(",");
      sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
      sb.append("psn_syspayno").append("=").append(psn_syspayno).append(",");
      sb.append("state").append("=").append(state).append(",");
      sb.append("rereq_psn_syspayno").append("=").append(rereq_psn_syspayno).append(",");
      sb.append("eval_clsf").append("=").append(eval_clsf).append(",");
      sb.append("eval_comment").append("=").append(eval_comment).append(",");
      sb.append("rereq_comment").append("=").append(rereq_comment).append(",");
      sb.append("eval_result_scr").append("=").append(eval_result_scr).append(",");
      sb.append("eval_service_scr").append("=").append(eval_service_scr).append(",");
      sb.append("re_eval_clsf_nm").append("=").append(re_eval_clsf_nm).append(",");
      sb.append("re_eval_clsf").append("=").append(re_eval_clsf).append(",");
      sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
      sb.append("eval_psn_syspaynm").append("=").append(eval_psn_syspaynm).append(",");
      sb.append("eval_psn_syspayno").append("=").append(eval_psn_syspayno).append(",");
      sb.append("rpt_announce_attach_file").append("=").append(rpt_announce_attach_file).append(",");
      sb.append("rpt_srh_attach_file").append("=").append(rpt_srh_attach_file).append(",");
      sb.append("rpt_search_clsf_nm").append("=").append(rpt_search_clsf_nm).append(",");
      sb.append("rpt_search_clsf").append("=").append(rpt_search_clsf).append(",");
      sb.append("rpt_attach_file").append("=").append(rpt_attach_file).append(",");
      sb.append("rpt_comment").append("=").append(rpt_comment).append(",");
      sb.append("rpt_daytm").append("=").append(rpt_daytm).append(",");
      sb.append("rpt_charg_psn_nm").append("=").append(rpt_charg_psn_nm).append(",");
      sb.append("rpt_adm_nm").append("=").append(rpt_adm_nm).append(",");
      sb.append("rpt_psn_nm").append("=").append(rpt_psn_nm).append(",");
      sb.append("rpt_wri_nm").append("=").append(rpt_wri_nm).append(",");
      sb.append("rpt_charg_psn_id").append("=").append(rpt_charg_psn_id).append(",");
      sb.append("rpt_adm_id").append("=").append(rpt_adm_id).append(",");
      sb.append("rpt_psn_id").append("=").append(rpt_psn_id).append(",");
      sb.append("rpt_wri_id").append("=").append(rpt_wri_id).append(",");
      sb.append("rcpt_patofic_mng_no").append("=").append(rcpt_patofic_mng_no).append(",");
      sb.append("charg_psn_nm").append("=").append(charg_psn_nm).append(",");
      sb.append("rcpt_charg_psn_id").append("=").append(rcpt_charg_psn_id).append(",");
      sb.append("rcpt_daytm").append("=").append(rcpt_daytm).append(",");
      sb.append("rcpt_adm_nm").append("=").append(rcpt_adm_nm).append(",");
      sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
      sb.append("rcpt_wri_nm").append("=").append(rcpt_wri_nm).append(",");
      sb.append("rcpt_adm_id").append("=").append(rcpt_adm_id).append(",");
      sb.append("rcpt_psn_id").append("=").append(rcpt_psn_id).append(",");
      sb.append("rcpt_wri_id").append("=").append(rcpt_wri_id).append(",");
      sb.append("req_attach_file_no").append("=").append(req_attach_file_no).append(",");
      sb.append("req_comment").append("=").append(req_comment).append(",");
      sb.append("req_due_date").append("=").append(req_due_date).append(",");
      sb.append("hope_patofic_charg_nm").append("=").append(hope_patofic_charg_nm).append(",");
      sb.append("hope_patofic_charg_id").append("=").append(hope_patofic_charg_id).append(",");
      sb.append("req_patofic_nm").append("=").append(req_patofic_nm).append(",");
      sb.append("req_patofic_cd").append("=").append(req_patofic_cd).append(",");
      sb.append("req_daytm").append("=").append(req_daytm).append(",");
      sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
      sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
      sb.append("job_state_nm").append("=").append(job_state_nm).append(",");
      sb.append("job_state_nm_detail").append("=").append(job_state_nm_detail).append(",");
      sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("srh_sn").append("=").append(srh_sn).append(",");
      sb.append("srhres_id").append("=").append(srhres_id).append(",");
      sb.append("ref_id").append("=").append(ref_id).append(",");
      sb.append("srh_id").append("=").append(srh_id).append(",");
      sb.append("interview_yn").append("=").append(interview_yn).append(",");
      sb.append("patofic_full_nm").append("=").append(patofic_full_nm).append(",");
      sb.append("smitapp_hope_natn_nm").append("=").append(smitapp_hope_natn_nm).append(",");
      sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
      sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
      sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
      sb.append("tech_clsf_nm").append("=").append(tech_clsf_nm).append(",");
      sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
      sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
      sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
      sb.append("req_no").append("=").append(req_no);
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