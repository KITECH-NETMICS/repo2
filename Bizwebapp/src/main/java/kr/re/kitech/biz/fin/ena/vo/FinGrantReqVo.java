package kr.re.kitech.biz.fin.ena.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinGrantReqExp")
public class FinGrantReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinGrantReqVo(){
    }

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "bsnsyear", physicalName = "bsnsyear", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsnsyear;

    @ElDtoField(logicalName = "ddtlbz_id", physicalName = "ddtlbz_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddtlbz_id;

    @ElDtoField(logicalName = "dvrq_odr", physicalName = "dvrq_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dvrq_odr;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "wrte_psn", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn;

    @ElDtoField(logicalName = "bank", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "bankaccnt_no", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "depstr_nm", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "rmk_2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "slip_ymd", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "bank_nm", physicalName = "bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_nm;

    @ElDtoField(logicalName = "unslip_amt", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElDtoField(logicalName = "unslip_no_seq", physicalName = "unslip_no_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no_seq;

    @ElDtoField(logicalName = "slip_typ_cd", physicalName = "slip_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ_cd;

    @ElDtoField(logicalName = "cancel_slip", physicalName = "cancel_slip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cancel_slip;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "reqst_sj_nm", physicalName = "reqst_sj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_sj_nm;

    @ElDtoField(logicalName = "reqst_de_st", physicalName = "reqst_de_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_de_st;

    @ElDtoField(logicalName = "reqst_de_ed", physicalName = "reqst_de_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_de_ed;

    @ElDtoField(logicalName = "req_yn", physicalName = "req_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_yn;

    @ElDtoField(logicalName = "reqst_instt_nm", physicalName = "reqst_instt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_instt_nm;

    @ElDtoField(logicalName = "ddtlbz_nm", physicalName = "ddtlbz_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddtlbz_nm;

    @ElDtoField(logicalName = "biz_prd", physicalName = "biz_prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_prd;

    @ElDtoField(logicalName = "reqst_de", physicalName = "reqst_de", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_de;

    @ElDtoField(logicalName = "dvrq_amount", physicalName = "dvrq_amount", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dvrq_amount;

    @ElDtoField(logicalName = "reqst_matter", physicalName = "reqst_matter", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_matter;

    @ElDtoField(logicalName = "exc_instt_nm", physicalName = "exc_instt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exc_instt_nm;

    @ElDtoField(logicalName = "dev_goal", physicalName = "dev_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dev_goal;

    @ElDtoField(logicalName = "resch_contnt", physicalName = "resch_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_contnt;

    @ElDtoField(logicalName = "gov_subsidy", physicalName = "gov_subsidy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gov_subsidy;

    @ElDtoField(logicalName = "self_share", physicalName = "self_share", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String self_share;

    @ElDtoField(logicalName = "area_share_wide", physicalName = "area_share_wide", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String area_share_wide;

    @ElDtoField(logicalName = "area_share_base", physicalName = "area_share_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String area_share_base;

    @ElDtoField(logicalName = "subsidy_sum", physicalName = "subsidy_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subsidy_sum;

    @ElDtoField(logicalName = "dpstg_acnut_no", physicalName = "dpstg_acnut_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dpstg_acnut_no;

    @ElDtoField(logicalName = "dpstg_rcpmny_idntfc_code", physicalName = "dpstg_rcpmny_idntfc_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dpstg_rcpmny_idntfc_code;

    @ElDtoField(logicalName = "rcpmny_dpstr_nm", physicalName = "rcpmny_dpstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpmny_dpstr_nm;

    @ElDtoField(logicalName = "dpstg_bank_nm", physicalName = "dpstg_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dpstg_bank_nm;

    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "req_psn_no", physicalName = "req_psn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_no;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "dvdc_instt_nm", physicalName = "dvdc_instt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dvdc_instt_nm;

    @ElDtoField(logicalName = "delvry_purps_cn", physicalName = "delvry_purps_cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvry_purps_cn;

    @ElDtoField(logicalName = "dvdc_amount", physicalName = "dvdc_amount", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dvdc_amount;

    @ElDtoField(logicalName = "dvdc_de", physicalName = "dvdc_de", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dvdc_de;

    @ElDtoField(logicalName = "decsn_ex", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "postmt_no", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "reprs_psn_nm", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "wrte_ymd", physicalName = "wrte_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_ymd;

    @ElDtoField(logicalName = "wrte_dept", physicalName = "wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "bsnsyear")
    public String getBsnsyear(){
        return bsnsyear;
    }

    @ElVoField(physicalName = "bsnsyear")
    public void setBsnsyear(String bsnsyear){
        this.bsnsyear = bsnsyear;
    }

    @ElVoField(physicalName = "ddtlbz_id")
    public String getDdtlbz_id(){
        return ddtlbz_id;
    }

    @ElVoField(physicalName = "ddtlbz_id")
    public void setDdtlbz_id(String ddtlbz_id){
        this.ddtlbz_id = ddtlbz_id;
    }

    @ElVoField(physicalName = "dvrq_odr")
    public String getDvrq_odr(){
        return dvrq_odr;
    }

    @ElVoField(physicalName = "dvrq_odr")
    public void setDvrq_odr(String dvrq_odr){
        this.dvrq_odr = dvrq_odr;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "bank_nm")
    public String getBank_nm(){
        return bank_nm;
    }

    @ElVoField(physicalName = "bank_nm")
    public void setBank_nm(String bank_nm){
        this.bank_nm = bank_nm;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "unslip_no_seq")
    public String getUnslip_no_seq(){
        return unslip_no_seq;
    }

    @ElVoField(physicalName = "unslip_no_seq")
    public void setUnslip_no_seq(String unslip_no_seq){
        this.unslip_no_seq = unslip_no_seq;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public String getSlip_typ_cd(){
        return slip_typ_cd;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public void setSlip_typ_cd(String slip_typ_cd){
        this.slip_typ_cd = slip_typ_cd;
    }

    @ElVoField(physicalName = "cancel_slip")
    public String getCancel_slip(){
        return cancel_slip;
    }

    @ElVoField(physicalName = "cancel_slip")
    public void setCancel_slip(String cancel_slip){
        this.cancel_slip = cancel_slip;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "reqst_sj_nm")
    public String getReqst_sj_nm(){
        return reqst_sj_nm;
    }

    @ElVoField(physicalName = "reqst_sj_nm")
    public void setReqst_sj_nm(String reqst_sj_nm){
        this.reqst_sj_nm = reqst_sj_nm;
    }

    @ElVoField(physicalName = "reqst_de_st")
    public String getReqst_de_st(){
        return reqst_de_st;
    }

    @ElVoField(physicalName = "reqst_de_st")
    public void setReqst_de_st(String reqst_de_st){
        this.reqst_de_st = reqst_de_st;
    }

    @ElVoField(physicalName = "reqst_de_ed")
    public String getReqst_de_ed(){
        return reqst_de_ed;
    }

    @ElVoField(physicalName = "reqst_de_ed")
    public void setReqst_de_ed(String reqst_de_ed){
        this.reqst_de_ed = reqst_de_ed;
    }

    @ElVoField(physicalName = "req_yn")
    public String getReq_yn(){
        return req_yn;
    }

    @ElVoField(physicalName = "req_yn")
    public void setReq_yn(String req_yn){
        this.req_yn = req_yn;
    }

    @ElVoField(physicalName = "reqst_instt_nm")
    public String getReqst_instt_nm(){
        return reqst_instt_nm;
    }

    @ElVoField(physicalName = "reqst_instt_nm")
    public void setReqst_instt_nm(String reqst_instt_nm){
        this.reqst_instt_nm = reqst_instt_nm;
    }

    @ElVoField(physicalName = "ddtlbz_nm")
    public String getDdtlbz_nm(){
        return ddtlbz_nm;
    }

    @ElVoField(physicalName = "ddtlbz_nm")
    public void setDdtlbz_nm(String ddtlbz_nm){
        this.ddtlbz_nm = ddtlbz_nm;
    }

    @ElVoField(physicalName = "biz_prd")
    public String getBiz_prd(){
        return biz_prd;
    }

    @ElVoField(physicalName = "biz_prd")
    public void setBiz_prd(String biz_prd){
        this.biz_prd = biz_prd;
    }

    @ElVoField(physicalName = "reqst_de")
    public String getReqst_de(){
        return reqst_de;
    }

    @ElVoField(physicalName = "reqst_de")
    public void setReqst_de(String reqst_de){
        this.reqst_de = reqst_de;
    }

    @ElVoField(physicalName = "dvrq_amount")
    public String getDvrq_amount(){
        return dvrq_amount;
    }

    @ElVoField(physicalName = "dvrq_amount")
    public void setDvrq_amount(String dvrq_amount){
        this.dvrq_amount = dvrq_amount;
    }

    @ElVoField(physicalName = "reqst_matter")
    public String getReqst_matter(){
        return reqst_matter;
    }

    @ElVoField(physicalName = "reqst_matter")
    public void setReqst_matter(String reqst_matter){
        this.reqst_matter = reqst_matter;
    }

    @ElVoField(physicalName = "exc_instt_nm")
    public String getExc_instt_nm(){
        return exc_instt_nm;
    }

    @ElVoField(physicalName = "exc_instt_nm")
    public void setExc_instt_nm(String exc_instt_nm){
        this.exc_instt_nm = exc_instt_nm;
    }

    @ElVoField(physicalName = "dev_goal")
    public String getDev_goal(){
        return dev_goal;
    }

    @ElVoField(physicalName = "dev_goal")
    public void setDev_goal(String dev_goal){
        this.dev_goal = dev_goal;
    }

    @ElVoField(physicalName = "resch_contnt")
    public String getResch_contnt(){
        return resch_contnt;
    }

    @ElVoField(physicalName = "resch_contnt")
    public void setResch_contnt(String resch_contnt){
        this.resch_contnt = resch_contnt;
    }

    @ElVoField(physicalName = "gov_subsidy")
    public String getGov_subsidy(){
        return gov_subsidy;
    }

    @ElVoField(physicalName = "gov_subsidy")
    public void setGov_subsidy(String gov_subsidy){
        this.gov_subsidy = gov_subsidy;
    }

    @ElVoField(physicalName = "self_share")
    public String getSelf_share(){
        return self_share;
    }

    @ElVoField(physicalName = "self_share")
    public void setSelf_share(String self_share){
        this.self_share = self_share;
    }

    @ElVoField(physicalName = "area_share_wide")
    public String getArea_share_wide(){
        return area_share_wide;
    }

    @ElVoField(physicalName = "area_share_wide")
    public void setArea_share_wide(String area_share_wide){
        this.area_share_wide = area_share_wide;
    }

    @ElVoField(physicalName = "area_share_base")
    public String getArea_share_base(){
        return area_share_base;
    }

    @ElVoField(physicalName = "area_share_base")
    public void setArea_share_base(String area_share_base){
        this.area_share_base = area_share_base;
    }

    @ElVoField(physicalName = "subsidy_sum")
    public String getSubsidy_sum(){
        return subsidy_sum;
    }

    @ElVoField(physicalName = "subsidy_sum")
    public void setSubsidy_sum(String subsidy_sum){
        this.subsidy_sum = subsidy_sum;
    }

    @ElVoField(physicalName = "dpstg_acnut_no")
    public String getDpstg_acnut_no(){
        return dpstg_acnut_no;
    }

    @ElVoField(physicalName = "dpstg_acnut_no")
    public void setDpstg_acnut_no(String dpstg_acnut_no){
        this.dpstg_acnut_no = dpstg_acnut_no;
    }

    @ElVoField(physicalName = "dpstg_rcpmny_idntfc_code")
    public String getDpstg_rcpmny_idntfc_code(){
        return dpstg_rcpmny_idntfc_code;
    }

    @ElVoField(physicalName = "dpstg_rcpmny_idntfc_code")
    public void setDpstg_rcpmny_idntfc_code(String dpstg_rcpmny_idntfc_code){
        this.dpstg_rcpmny_idntfc_code = dpstg_rcpmny_idntfc_code;
    }

    @ElVoField(physicalName = "rcpmny_dpstr_nm")
    public String getRcpmny_dpstr_nm(){
        return rcpmny_dpstr_nm;
    }

    @ElVoField(physicalName = "rcpmny_dpstr_nm")
    public void setRcpmny_dpstr_nm(String rcpmny_dpstr_nm){
        this.rcpmny_dpstr_nm = rcpmny_dpstr_nm;
    }

    @ElVoField(physicalName = "dpstg_bank_nm")
    public String getDpstg_bank_nm(){
        return dpstg_bank_nm;
    }

    @ElVoField(physicalName = "dpstg_bank_nm")
    public void setDpstg_bank_nm(String dpstg_bank_nm){
        this.dpstg_bank_nm = dpstg_bank_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_no")
    public String getReq_psn_no(){
        return req_psn_no;
    }

    @ElVoField(physicalName = "req_psn_no")
    public void setReq_psn_no(String req_psn_no){
        this.req_psn_no = req_psn_no;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "dvdc_instt_nm")
    public String getDvdc_instt_nm(){
        return dvdc_instt_nm;
    }

    @ElVoField(physicalName = "dvdc_instt_nm")
    public void setDvdc_instt_nm(String dvdc_instt_nm){
        this.dvdc_instt_nm = dvdc_instt_nm;
    }

    @ElVoField(physicalName = "delvry_purps_cn")
    public String getDelvry_purps_cn(){
        return delvry_purps_cn;
    }

    @ElVoField(physicalName = "delvry_purps_cn")
    public void setDelvry_purps_cn(String delvry_purps_cn){
        this.delvry_purps_cn = delvry_purps_cn;
    }

    @ElVoField(physicalName = "dvdc_amount")
    public String getDvdc_amount(){
        return dvdc_amount;
    }

    @ElVoField(physicalName = "dvdc_amount")
    public void setDvdc_amount(String dvdc_amount){
        this.dvdc_amount = dvdc_amount;
    }

    @ElVoField(physicalName = "dvdc_de")
    public String getDvdc_de(){
        return dvdc_de;
    }

    @ElVoField(physicalName = "dvdc_de")
    public void setDvdc_de(String dvdc_de){
        this.dvdc_de = dvdc_de;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "postmt_no")
    public String getPostmt_no(){
        return postmt_no;
    }

    @ElVoField(physicalName = "postmt_no")
    public void setPostmt_no(String postmt_no){
        this.postmt_no = postmt_no;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public String getWrte_ymd(){
        return wrte_ymd;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public void setWrte_ymd(String wrte_ymd){
        this.wrte_ymd = wrte_ymd;
    }

    @ElVoField(physicalName = "wrte_dept")
    public String getWrte_dept(){
        return wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept")
    public void setWrte_dept(String wrte_dept){
        this.wrte_dept = wrte_dept;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinGrantReqVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("bsnsyear").append("=").append(bsnsyear).append(",");
        sb.append("ddtlbz_id").append("=").append(ddtlbz_id).append(",");
        sb.append("dvrq_odr").append("=").append(dvrq_odr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("bank_nm").append("=").append(bank_nm).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("unslip_no_seq").append("=").append(unslip_no_seq).append(",");
        sb.append("slip_typ_cd").append("=").append(slip_typ_cd).append(",");
        sb.append("cancel_slip").append("=").append(cancel_slip).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("reqst_sj_nm").append("=").append(reqst_sj_nm).append(",");
        sb.append("reqst_de_st").append("=").append(reqst_de_st).append(",");
        sb.append("reqst_de_ed").append("=").append(reqst_de_ed).append(",");
        sb.append("req_yn").append("=").append(req_yn).append(",");
        sb.append("reqst_instt_nm").append("=").append(reqst_instt_nm).append(",");
        sb.append("ddtlbz_nm").append("=").append(ddtlbz_nm).append(",");
        sb.append("biz_prd").append("=").append(biz_prd).append(",");
        sb.append("reqst_de").append("=").append(reqst_de).append(",");
        sb.append("dvrq_amount").append("=").append(dvrq_amount).append(",");
        sb.append("reqst_matter").append("=").append(reqst_matter).append(",");
        sb.append("exc_instt_nm").append("=").append(exc_instt_nm).append(",");
        sb.append("dev_goal").append("=").append(dev_goal).append(",");
        sb.append("resch_contnt").append("=").append(resch_contnt).append(",");
        sb.append("gov_subsidy").append("=").append(gov_subsidy).append(",");
        sb.append("self_share").append("=").append(self_share).append(",");
        sb.append("area_share_wide").append("=").append(area_share_wide).append(",");
        sb.append("area_share_base").append("=").append(area_share_base).append(",");
        sb.append("subsidy_sum").append("=").append(subsidy_sum).append(",");
        sb.append("dpstg_acnut_no").append("=").append(dpstg_acnut_no).append(",");
        sb.append("dpstg_rcpmny_idntfc_code").append("=").append(dpstg_rcpmny_idntfc_code).append(",");
        sb.append("rcpmny_dpstr_nm").append("=").append(rcpmny_dpstr_nm).append(",");
        sb.append("dpstg_bank_nm").append("=").append(dpstg_bank_nm).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_psn_no").append("=").append(req_psn_no).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("dvdc_instt_nm").append("=").append(dvdc_instt_nm).append(",");
        sb.append("delvry_purps_cn").append("=").append(delvry_purps_cn).append(",");
        sb.append("dvdc_amount").append("=").append(dvdc_amount).append(",");
        sb.append("dvdc_de").append("=").append(dvdc_de).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("postmt_no").append("=").append(postmt_no).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("wrte_ymd").append("=").append(wrte_ymd).append(",");
        sb.append("wrte_dept").append("=").append(wrte_dept);
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
