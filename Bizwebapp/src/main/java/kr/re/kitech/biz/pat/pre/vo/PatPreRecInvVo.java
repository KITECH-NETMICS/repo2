package kr.re.kitech.biz.pat.pre.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPreRecInvExp")
public class PatPreRecInvVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPreRecInvVo(){
    }

    @ElDtoField(logicalName = "regId", physicalName = "reg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_id;

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

    @ElDtoField(logicalName = "reqWriId", physicalName = "req_wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_wri_id;

    @ElDtoField(logicalName = "reqPsnId", physicalName = "req_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_id;

    @ElDtoField(logicalName = "reqAdmId", physicalName = "req_adm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_adm_id;

    @ElDtoField(logicalName = "reqWriNm", physicalName = "req_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_wri_nm;

    @ElDtoField(logicalName = "reqPsnNm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "reqAdmNm", physicalName = "req_adm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_adm_nm;

    @ElDtoField(logicalName = "reqDaytm", physicalName = "req_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_daytm;

    @ElDtoField(logicalName = "reqChargPsnId", physicalName = "req_charg_psn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_charg_psn_id;

    @ElDtoField(logicalName = "reqChargPsnNm", physicalName = "req_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_charg_psn_nm;

    @ElDtoField(logicalName = "reqRegDate", physicalName = "req_reg_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_reg_date;

    @ElDtoField(logicalName = "reqDueDate", physicalName = "req_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_due_date;

    @ElDtoField(logicalName = "reqComment", physicalName = "req_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_comment;

    @ElDtoField(logicalName = "reqAttachFile", physicalName = "req_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_attach_file;

    @ElDtoField(logicalName = "comPsnSyspayno", physicalName = "com_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_psn_syspayno;

    @ElDtoField(logicalName = "comPsnSyspaynm", physicalName = "com_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_psn_syspaynm;

    @ElDtoField(logicalName = "comDaytm", physicalName = "com_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_daytm;

    @ElDtoField(logicalName = "comPatoficCd", physicalName = "com_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_cd;

    @ElDtoField(logicalName = "comPatoficNm", physicalName = "com_patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_nm;

    @ElDtoField(logicalName = "comPatoficChargId", physicalName = "com_patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_charg_id;

    @ElDtoField(logicalName = "comPatoficChargNm", physicalName = "com_patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_patofic_charg_nm;

    @ElDtoField(logicalName = "comDueDate", physicalName = "com_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_due_date;

    @ElDtoField(logicalName = "comComment", physicalName = "com_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_comment;

    @ElDtoField(logicalName = "comAttachFile", physicalName = "com_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_attach_file;

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

    @ElDtoField(logicalName = "prtRegNo", physicalName = "prt_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_no;

    @ElDtoField(logicalName = "prtRegDate", physicalName = "prt_reg_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_date;

    @ElDtoField(logicalName = "prtIndepCnt", physicalName = "prt_indep_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_indep_cnt;

    @ElDtoField(logicalName = "prtDepenCnt", physicalName = "prt_depen_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_depen_cnt;

    @ElDtoField(logicalName = "prtSpecCnt", physicalName = "prt_spec_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_spec_cnt;

    @ElDtoField(logicalName = "prtDrawCnt", physicalName = "prt_draw_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_draw_cnt;

    @ElDtoField(logicalName = "prtKoRegTitle", physicalName = "prt_ko_reg_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_ko_reg_title;

    @ElDtoField(logicalName = "prtEnRegTitle", physicalName = "prt_en_reg_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_en_reg_title;

    @ElDtoField(logicalName = "prtComment", physicalName = "prt_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_comment;

    @ElDtoField(logicalName = "prtRegistAttachFile", physicalName = "prt_regist_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_regist_attach_file;

    @ElDtoField(logicalName = "prtRegOrgAttachFile", physicalName = "prt_reg_org_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_org_attach_file;

    @ElDtoField(logicalName = "prtRegAttachFile", physicalName = "prt_reg_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_attach_file;

    @ElDtoField(logicalName = "prtAttachFile", physicalName = "prt_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_attach_file;

    @ElDtoField(logicalName = "evalPsnSyspaynm", physicalName = "eval_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspaynm;

    @ElDtoField(logicalName = "evalDaytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;

    @ElDtoField(logicalName = "evalResultScr", physicalName = "eval_result_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_result_scr;

    @ElDtoField(logicalName = "evalServiceScr", physicalName = "eval_service_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_service_scr;

    @ElDtoField(logicalName = "evalComment", physicalName = "eval_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_comment;

    @ElDtoField(logicalName = "patoficCd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "evalYearMonth", physicalName = "eval_year_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_year_month;

    @ElDtoField(logicalName = "keepMngmtOffcNm", physicalName = "keep_mngmt_offc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_mngmt_offc_nm;

    @ElDtoField(logicalName = "rightExpirYmd", physicalName = "right_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_expir_ymd;

    @ElDtoField(logicalName = "eval_annual_patofic_cd", physicalName = "eval_annual_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_annual_patofic_cd;

    @ElDtoField(logicalName = "eval_psn_syspayno", physicalName = "eval_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspayno;

    @ElDtoField(logicalName = "curr_state_cd", physicalName = "curr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_state_cd;

    @ElDtoField(logicalName = "next_state_cd", physicalName = "next_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String next_state_cd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "ref_key", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "result", physicalName = "result", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int result;

    @ElVoField(physicalName = "reg_id")
    public String getReg_id(){
        return reg_id;
    }

    @ElVoField(physicalName = "reg_id")
    public void setReg_id(String reg_id){
        this.reg_id = reg_id;
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

    @ElVoField(physicalName = "req_wri_id")
    public String getReq_wri_id(){
        return req_wri_id;
    }

    @ElVoField(physicalName = "req_wri_id")
    public void setReq_wri_id(String req_wri_id){
        this.req_wri_id = req_wri_id;
    }

    @ElVoField(physicalName = "req_psn_id")
    public String getReq_psn_id(){
        return req_psn_id;
    }

    @ElVoField(physicalName = "req_psn_id")
    public void setReq_psn_id(String req_psn_id){
        this.req_psn_id = req_psn_id;
    }

    @ElVoField(physicalName = "req_adm_id")
    public String getReq_adm_id(){
        return req_adm_id;
    }

    @ElVoField(physicalName = "req_adm_id")
    public void setReq_adm_id(String req_adm_id){
        this.req_adm_id = req_adm_id;
    }

    @ElVoField(physicalName = "req_wri_nm")
    public String getReq_wri_nm(){
        return req_wri_nm;
    }

    @ElVoField(physicalName = "req_wri_nm")
    public void setReq_wri_nm(String req_wri_nm){
        this.req_wri_nm = req_wri_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_adm_nm")
    public String getReq_adm_nm(){
        return req_adm_nm;
    }

    @ElVoField(physicalName = "req_adm_nm")
    public void setReq_adm_nm(String req_adm_nm){
        this.req_adm_nm = req_adm_nm;
    }

    @ElVoField(physicalName = "req_daytm")
    public String getReq_daytm(){
        return req_daytm;
    }

    @ElVoField(physicalName = "req_daytm")
    public void setReq_daytm(String req_daytm){
        this.req_daytm = req_daytm;
    }

    @ElVoField(physicalName = "req_charg_psn_id")
    public String getReq_charg_psn_id(){
        return req_charg_psn_id;
    }

    @ElVoField(physicalName = "req_charg_psn_id")
    public void setReq_charg_psn_id(String req_charg_psn_id){
        this.req_charg_psn_id = req_charg_psn_id;
    }

    @ElVoField(physicalName = "req_charg_psn_nm")
    public String getReq_charg_psn_nm(){
        return req_charg_psn_nm;
    }

    @ElVoField(physicalName = "req_charg_psn_nm")
    public void setReq_charg_psn_nm(String req_charg_psn_nm){
        this.req_charg_psn_nm = req_charg_psn_nm;
    }

    @ElVoField(physicalName = "req_reg_date")
    public String getReq_reg_date(){
        return req_reg_date;
    }

    @ElVoField(physicalName = "req_reg_date")
    public void setReq_reg_date(String req_reg_date){
        this.req_reg_date = req_reg_date;
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

    @ElVoField(physicalName = "com_psn_syspayno")
    public String getCom_psn_syspayno(){
        return com_psn_syspayno;
    }

    @ElVoField(physicalName = "com_psn_syspayno")
    public void setCom_psn_syspayno(String com_psn_syspayno){
        this.com_psn_syspayno = com_psn_syspayno;
    }

    @ElVoField(physicalName = "com_psn_syspaynm")
    public String getCom_psn_syspaynm(){
        return com_psn_syspaynm;
    }

    @ElVoField(physicalName = "com_psn_syspaynm")
    public void setCom_psn_syspaynm(String com_psn_syspaynm){
        this.com_psn_syspaynm = com_psn_syspaynm;
    }

    @ElVoField(physicalName = "com_daytm")
    public String getCom_daytm(){
        return com_daytm;
    }

    @ElVoField(physicalName = "com_daytm")
    public void setCom_daytm(String com_daytm){
        this.com_daytm = com_daytm;
    }

    @ElVoField(physicalName = "com_patofic_cd")
    public String getCom_patofic_cd(){
        return com_patofic_cd;
    }

    @ElVoField(physicalName = "com_patofic_cd")
    public void setCom_patofic_cd(String com_patofic_cd){
        this.com_patofic_cd = com_patofic_cd;
    }

    @ElVoField(physicalName = "com_patofic_nm")
    public String getCom_patofic_nm(){
        return com_patofic_nm;
    }

    @ElVoField(physicalName = "com_patofic_nm")
    public void setCom_patofic_nm(String com_patofic_nm){
        this.com_patofic_nm = com_patofic_nm;
    }

    @ElVoField(physicalName = "com_patofic_charg_id")
    public String getCom_patofic_charg_id(){
        return com_patofic_charg_id;
    }

    @ElVoField(physicalName = "com_patofic_charg_id")
    public void setCom_patofic_charg_id(String com_patofic_charg_id){
        this.com_patofic_charg_id = com_patofic_charg_id;
    }

    @ElVoField(physicalName = "com_patofic_charg_nm")
    public String getCom_patofic_charg_nm(){
        return com_patofic_charg_nm;
    }

    @ElVoField(physicalName = "com_patofic_charg_nm")
    public void setCom_patofic_charg_nm(String com_patofic_charg_nm){
        this.com_patofic_charg_nm = com_patofic_charg_nm;
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

    @ElVoField(physicalName = "prt_reg_no")
    public String getPrt_reg_no(){
        return prt_reg_no;
    }

    @ElVoField(physicalName = "prt_reg_no")
    public void setPrt_reg_no(String prt_reg_no){
        this.prt_reg_no = prt_reg_no;
    }

    @ElVoField(physicalName = "prt_reg_date")
    public String getPrt_reg_date(){
        return prt_reg_date;
    }

    @ElVoField(physicalName = "prt_reg_date")
    public void setPrt_reg_date(String prt_reg_date){
        this.prt_reg_date = prt_reg_date;
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

    @ElVoField(physicalName = "prt_ko_reg_title")
    public String getPrt_ko_reg_title(){
        return prt_ko_reg_title;
    }

    @ElVoField(physicalName = "prt_ko_reg_title")
    public void setPrt_ko_reg_title(String prt_ko_reg_title){
        this.prt_ko_reg_title = prt_ko_reg_title;
    }

    @ElVoField(physicalName = "prt_en_reg_title")
    public String getPrt_en_reg_title(){
        return prt_en_reg_title;
    }

    @ElVoField(physicalName = "prt_en_reg_title")
    public void setPrt_en_reg_title(String prt_en_reg_title){
        this.prt_en_reg_title = prt_en_reg_title;
    }

    @ElVoField(physicalName = "prt_comment")
    public String getPrt_comment(){
        return prt_comment;
    }

    @ElVoField(physicalName = "prt_comment")
    public void setPrt_comment(String prt_comment){
        this.prt_comment = prt_comment;
    }

    @ElVoField(physicalName = "prt_regist_attach_file")
    public String getPrt_regist_attach_file(){
        return prt_regist_attach_file;
    }

    @ElVoField(physicalName = "prt_regist_attach_file")
    public void setPrt_regist_attach_file(String prt_regist_attach_file){
        this.prt_regist_attach_file = prt_regist_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_org_attach_file")
    public String getPrt_reg_org_attach_file(){
        return prt_reg_org_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_org_attach_file")
    public void setPrt_reg_org_attach_file(String prt_reg_org_attach_file){
        this.prt_reg_org_attach_file = prt_reg_org_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_attach_file")
    public String getPrt_reg_attach_file(){
        return prt_reg_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_attach_file")
    public void setPrt_reg_attach_file(String prt_reg_attach_file){
        this.prt_reg_attach_file = prt_reg_attach_file;
    }

    @ElVoField(physicalName = "prt_attach_file")
    public String getPrt_attach_file(){
        return prt_attach_file;
    }

    @ElVoField(physicalName = "prt_attach_file")
    public void setPrt_attach_file(String prt_attach_file){
        this.prt_attach_file = prt_attach_file;
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

    @ElVoField(physicalName = "eval_comment")
    public String getEval_comment(){
        return eval_comment;
    }

    @ElVoField(physicalName = "eval_comment")
    public void setEval_comment(String eval_comment){
        this.eval_comment = eval_comment;
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

    @ElVoField(physicalName = "eval_year_month")
    public String getEval_year_month(){
        return eval_year_month;
    }

    @ElVoField(physicalName = "eval_year_month")
    public void setEval_year_month(String eval_year_month){
        this.eval_year_month = eval_year_month;
    }

    @ElVoField(physicalName = "keep_mngmt_offc_nm")
    public String getKeep_mngmt_offc_nm(){
        return keep_mngmt_offc_nm;
    }

    @ElVoField(physicalName = "keep_mngmt_offc_nm")
    public void setKeep_mngmt_offc_nm(String keep_mngmt_offc_nm){
        this.keep_mngmt_offc_nm = keep_mngmt_offc_nm;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public String getRight_expir_ymd(){
        return right_expir_ymd;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public void setRight_expir_ymd(String right_expir_ymd){
        this.right_expir_ymd = right_expir_ymd;
    }

    @ElVoField(physicalName = "eval_annual_patofic_cd")
    public String getEval_annual_patofic_cd(){
        return eval_annual_patofic_cd;
    }

    @ElVoField(physicalName = "eval_annual_patofic_cd")
    public void setEval_annual_patofic_cd(String eval_annual_patofic_cd){
        this.eval_annual_patofic_cd = eval_annual_patofic_cd;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public String getEval_psn_syspayno(){
        return eval_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public void setEval_psn_syspayno(String eval_psn_syspayno){
        this.eval_psn_syspayno = eval_psn_syspayno;
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

    @ElVoField(physicalName = "result")
    public int getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(int result){
        this.result = result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPreRecInvVo [");
        sb.append("reg_id").append("=").append(reg_id).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
        sb.append("job_state_nm_detail").append("=").append(job_state_nm_detail).append(",");
        sb.append("job_state_nm").append("=").append(job_state_nm).append(",");
        sb.append("req_wri_id").append("=").append(req_wri_id).append(",");
        sb.append("req_psn_id").append("=").append(req_psn_id).append(",");
        sb.append("req_adm_id").append("=").append(req_adm_id).append(",");
        sb.append("req_wri_nm").append("=").append(req_wri_nm).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_adm_nm").append("=").append(req_adm_nm).append(",");
        sb.append("req_daytm").append("=").append(req_daytm).append(",");
        sb.append("req_charg_psn_id").append("=").append(req_charg_psn_id).append(",");
        sb.append("req_charg_psn_nm").append("=").append(req_charg_psn_nm).append(",");
        sb.append("req_reg_date").append("=").append(req_reg_date).append(",");
        sb.append("req_due_date").append("=").append(req_due_date).append(",");
        sb.append("req_comment").append("=").append(req_comment).append(",");
        sb.append("req_attach_file").append("=").append(req_attach_file).append(",");
        sb.append("com_psn_syspayno").append("=").append(com_psn_syspayno).append(",");
        sb.append("com_psn_syspaynm").append("=").append(com_psn_syspaynm).append(",");
        sb.append("com_daytm").append("=").append(com_daytm).append(",");
        sb.append("com_patofic_cd").append("=").append(com_patofic_cd).append(",");
        sb.append("com_patofic_nm").append("=").append(com_patofic_nm).append(",");
        sb.append("com_patofic_charg_id").append("=").append(com_patofic_charg_id).append(",");
        sb.append("com_patofic_charg_nm").append("=").append(com_patofic_charg_nm).append(",");
        sb.append("com_due_date").append("=").append(com_due_date).append(",");
        sb.append("com_comment").append("=").append(com_comment).append(",");
        sb.append("com_attach_file").append("=").append(com_attach_file).append(",");
        sb.append("prt_wri_id").append("=").append(prt_wri_id).append(",");
        sb.append("prt_psn_id").append("=").append(prt_psn_id).append(",");
        sb.append("prt_adm_id").append("=").append(prt_adm_id).append(",");
        sb.append("prt_wri_nm").append("=").append(prt_wri_nm).append(",");
        sb.append("prt_psn_nm").append("=").append(prt_psn_nm).append(",");
        sb.append("prt_adm_nm").append("=").append(prt_adm_nm).append(",");
        sb.append("prt_daytm").append("=").append(prt_daytm).append(",");
        sb.append("prt_charg_psn_id").append("=").append(prt_charg_psn_id).append(",");
        sb.append("prt_charg_psn_nm").append("=").append(prt_charg_psn_nm).append(",");
        sb.append("prt_reg_no").append("=").append(prt_reg_no).append(",");
        sb.append("prt_reg_date").append("=").append(prt_reg_date).append(",");
        sb.append("prt_indep_cnt").append("=").append(prt_indep_cnt).append(",");
        sb.append("prt_depen_cnt").append("=").append(prt_depen_cnt).append(",");
        sb.append("prt_spec_cnt").append("=").append(prt_spec_cnt).append(",");
        sb.append("prt_draw_cnt").append("=").append(prt_draw_cnt).append(",");
        sb.append("prt_ko_reg_title").append("=").append(prt_ko_reg_title).append(",");
        sb.append("prt_en_reg_title").append("=").append(prt_en_reg_title).append(",");
        sb.append("prt_comment").append("=").append(prt_comment).append(",");
        sb.append("prt_regist_attach_file").append("=").append(prt_regist_attach_file).append(",");
        sb.append("prt_reg_org_attach_file").append("=").append(prt_reg_org_attach_file).append(",");
        sb.append("prt_reg_attach_file").append("=").append(prt_reg_attach_file).append(",");
        sb.append("prt_attach_file").append("=").append(prt_attach_file).append(",");
        sb.append("eval_psn_syspaynm").append("=").append(eval_psn_syspaynm).append(",");
        sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
        sb.append("eval_result_scr").append("=").append(eval_result_scr).append(",");
        sb.append("eval_service_scr").append("=").append(eval_service_scr).append(",");
        sb.append("eval_comment").append("=").append(eval_comment).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("eval_year_month").append("=").append(eval_year_month).append(",");
        sb.append("keep_mngmt_offc_nm").append("=").append(keep_mngmt_offc_nm).append(",");
        sb.append("right_expir_ymd").append("=").append(right_expir_ymd).append(",");
        sb.append("eval_annual_patofic_cd").append("=").append(eval_annual_patofic_cd).append(",");
        sb.append("eval_psn_syspayno").append("=").append(eval_psn_syspayno).append(",");
        sb.append("curr_state_cd").append("=").append(curr_state_cd).append(",");
        sb.append("next_state_cd").append("=").append(next_state_cd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("result").append("=").append(result);
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
