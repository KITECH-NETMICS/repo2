package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspPayAdvcAdjstExp")
public class FspPayAdvcAdjstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspPayAdvcAdjstVo(){
    }

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "req_amt", physicalName = "req_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_amt;

    @ElDtoField(logicalName = "req_cause", physicalName = "req_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_cause;

    @ElDtoField(logicalName = "req_dept_nm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "recv_ymd", physicalName = "recv_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_ymd;

    @ElDtoField(logicalName = "recv_amt", physicalName = "recv_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long recv_amt;

    @ElDtoField(logicalName = "req_slip_no", physicalName = "req_slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_slip_no;

    @ElDtoField(logicalName = "adjst_ymd", physicalName = "adjst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_ymd;

    @ElDtoField(logicalName = "adjst_psn", physicalName = "adjst_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_psn;

    @ElDtoField(logicalName = "adjst_emp_no", physicalName = "adjst_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_emp_no;

    @ElDtoField(logicalName = "adjst_psn_nm", physicalName = "adjst_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_psn_nm;

    @ElDtoField(logicalName = "adjst_dept_nm", physicalName = "adjst_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_dept_nm;

    @ElDtoField(logicalName = "adjst_dept", physicalName = "adjst_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_dept;

    @ElDtoField(logicalName = "adjst_detls", physicalName = "adjst_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_detls;

    @ElDtoField(logicalName = "adjst_amt", physicalName = "adjst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long adjst_amt;

    @ElDtoField(logicalName = "adjst_req_no", physicalName = "adjst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_req_no;

    @ElDtoField(logicalName = "adjst_req_odr", physicalName = "adjst_req_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_req_odr;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "org_req_amt", physicalName = "org_req_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_req_amt;

    @ElDtoField(logicalName = "bank", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "bank_nm", physicalName = "bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_nm;

    @ElDtoField(logicalName = "bankaccnt_no", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "depstr_nm", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "vend_cd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "attach_file_no1", physicalName = "attach_file_no1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no1;

    @ElDtoField(logicalName = "attach_file_no2", physicalName = "attach_file_no2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no2;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "adjst_no", physicalName = "adjst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_no;

    @ElDtoField(logicalName = "req_from_ymd", physicalName = "req_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_from_ymd;

    @ElDtoField(logicalName = "req_to_ymd", physicalName = "req_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_to_ymd;

    @ElDtoField(logicalName = "adjst_from_ymd", physicalName = "adjst_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_from_ymd;

    @ElDtoField(logicalName = "adjst_to_ymd", physicalName = "adjst_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_to_ymd;

    @ElDtoField(logicalName = "req_clsf", physicalName = "req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "req_dept", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accnt_no_nm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accnt_cd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "accnt_cd_abbr", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "expns_cd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "expns_cd_nm", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "pay_demnd_ymd", physicalName = "pay_demnd_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_demnd_ymd;

    @ElDtoField(logicalName = "unslip_odr", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "ctrl_no", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "unslip_no_seq", physicalName = "unslip_no_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no_seq;

    @ElDtoField(logicalName = "wrte_dept", physicalName = "wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "req_wrte_dept", physicalName = "req_wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_wrte_dept;

    @ElDtoField(logicalName = "chacount", physicalName = "chacount", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int chacount;

    @ElDtoField(logicalName = "rmk_daecount", physicalName = "rmk_daecount", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int rmk_daecount;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "fomat_unit", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "unslip_chk", physicalName = "unslip_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_chk;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_amt")
    public String getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(String req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "req_cause")
    public String getReq_cause(){
        return req_cause;
    }

    @ElVoField(physicalName = "req_cause")
    public void setReq_cause(String req_cause){
        this.req_cause = req_cause;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "recv_ymd")
    public String getRecv_ymd(){
        return recv_ymd;
    }

    @ElVoField(physicalName = "recv_ymd")
    public void setRecv_ymd(String recv_ymd){
        this.recv_ymd = recv_ymd;
    }

    @ElVoField(physicalName = "recv_amt")
    public long getRecv_amt(){
        return recv_amt;
    }

    @ElVoField(physicalName = "recv_amt")
    public void setRecv_amt(long recv_amt){
        this.recv_amt = recv_amt;
    }

    @ElVoField(physicalName = "req_slip_no")
    public String getReq_slip_no(){
        return req_slip_no;
    }

    @ElVoField(physicalName = "req_slip_no")
    public void setReq_slip_no(String req_slip_no){
        this.req_slip_no = req_slip_no;
    }

    @ElVoField(physicalName = "adjst_ymd")
    public String getAdjst_ymd(){
        return adjst_ymd;
    }

    @ElVoField(physicalName = "adjst_ymd")
    public void setAdjst_ymd(String adjst_ymd){
        this.adjst_ymd = adjst_ymd;
    }

    @ElVoField(physicalName = "adjst_psn")
    public String getAdjst_psn(){
        return adjst_psn;
    }

    @ElVoField(physicalName = "adjst_psn")
    public void setAdjst_psn(String adjst_psn){
        this.adjst_psn = adjst_psn;
    }

    @ElVoField(physicalName = "adjst_emp_no")
    public String getAdjst_emp_no(){
        return adjst_emp_no;
    }

    @ElVoField(physicalName = "adjst_emp_no")
    public void setAdjst_emp_no(String adjst_emp_no){
        this.adjst_emp_no = adjst_emp_no;
    }

    @ElVoField(physicalName = "adjst_psn_nm")
    public String getAdjst_psn_nm(){
        return adjst_psn_nm;
    }

    @ElVoField(physicalName = "adjst_psn_nm")
    public void setAdjst_psn_nm(String adjst_psn_nm){
        this.adjst_psn_nm = adjst_psn_nm;
    }

    @ElVoField(physicalName = "adjst_dept_nm")
    public String getAdjst_dept_nm(){
        return adjst_dept_nm;
    }

    @ElVoField(physicalName = "adjst_dept_nm")
    public void setAdjst_dept_nm(String adjst_dept_nm){
        this.adjst_dept_nm = adjst_dept_nm;
    }

    @ElVoField(physicalName = "adjst_dept")
    public String getAdjst_dept(){
        return adjst_dept;
    }

    @ElVoField(physicalName = "adjst_dept")
    public void setAdjst_dept(String adjst_dept){
        this.adjst_dept = adjst_dept;
    }

    @ElVoField(physicalName = "adjst_detls")
    public String getAdjst_detls(){
        return adjst_detls;
    }

    @ElVoField(physicalName = "adjst_detls")
    public void setAdjst_detls(String adjst_detls){
        this.adjst_detls = adjst_detls;
    }

    @ElVoField(physicalName = "adjst_amt")
    public long getAdjst_amt(){
        return adjst_amt;
    }

    @ElVoField(physicalName = "adjst_amt")
    public void setAdjst_amt(long adjst_amt){
        this.adjst_amt = adjst_amt;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public String getAdjst_req_no(){
        return adjst_req_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public void setAdjst_req_no(String adjst_req_no){
        this.adjst_req_no = adjst_req_no;
    }

    @ElVoField(physicalName = "adjst_req_odr")
    public String getAdjst_req_odr(){
        return adjst_req_odr;
    }

    @ElVoField(physicalName = "adjst_req_odr")
    public void setAdjst_req_odr(String adjst_req_odr){
        this.adjst_req_odr = adjst_req_odr;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "org_req_amt")
    public String getOrg_req_amt(){
        return org_req_amt;
    }

    @ElVoField(physicalName = "org_req_amt")
    public void setOrg_req_amt(String org_req_amt){
        this.org_req_amt = org_req_amt;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "bank_nm")
    public String getBank_nm(){
        return bank_nm;
    }

    @ElVoField(physicalName = "bank_nm")
    public void setBank_nm(String bank_nm){
        this.bank_nm = bank_nm;
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

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "attach_file_no1")
    public String getAttach_file_no1(){
        return attach_file_no1;
    }

    @ElVoField(physicalName = "attach_file_no1")
    public void setAttach_file_no1(String attach_file_no1){
        this.attach_file_no1 = attach_file_no1;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public String getAttach_file_no2(){
        return attach_file_no2;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public void setAttach_file_no2(String attach_file_no2){
        this.attach_file_no2 = attach_file_no2;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "adjst_no")
    public String getAdjst_no(){
        return adjst_no;
    }

    @ElVoField(physicalName = "adjst_no")
    public void setAdjst_no(String adjst_no){
        this.adjst_no = adjst_no;
    }

    @ElVoField(physicalName = "req_from_ymd")
    public String getReq_from_ymd(){
        return req_from_ymd;
    }

    @ElVoField(physicalName = "req_from_ymd")
    public void setReq_from_ymd(String req_from_ymd){
        this.req_from_ymd = req_from_ymd;
    }

    @ElVoField(physicalName = "req_to_ymd")
    public String getReq_to_ymd(){
        return req_to_ymd;
    }

    @ElVoField(physicalName = "req_to_ymd")
    public void setReq_to_ymd(String req_to_ymd){
        this.req_to_ymd = req_to_ymd;
    }

    @ElVoField(physicalName = "adjst_from_ymd")
    public String getAdjst_from_ymd(){
        return adjst_from_ymd;
    }

    @ElVoField(physicalName = "adjst_from_ymd")
    public void setAdjst_from_ymd(String adjst_from_ymd){
        this.adjst_from_ymd = adjst_from_ymd;
    }

    @ElVoField(physicalName = "adjst_to_ymd")
    public String getAdjst_to_ymd(){
        return adjst_to_ymd;
    }

    @ElVoField(physicalName = "adjst_to_ymd")
    public void setAdjst_to_ymd(String adjst_to_ymd){
        this.adjst_to_ymd = adjst_to_ymd;
    }

    @ElVoField(physicalName = "req_clsf")
    public String getReq_clsf(){
        return req_clsf;
    }

    @ElVoField(physicalName = "req_clsf")
    public void setReq_clsf(String req_clsf){
        this.req_clsf = req_clsf;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "req_dept")
    public String getReq_dept(){
        return req_dept;
    }

    @ElVoField(physicalName = "req_dept")
    public void setReq_dept(String req_dept){
        this.req_dept = req_dept;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "pay_demnd_ymd")
    public String getPay_demnd_ymd(){
        return pay_demnd_ymd;
    }

    @ElVoField(physicalName = "pay_demnd_ymd")
    public void setPay_demnd_ymd(String pay_demnd_ymd){
        this.pay_demnd_ymd = pay_demnd_ymd;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "unslip_no_seq")
    public String getUnslip_no_seq(){
        return unslip_no_seq;
    }

    @ElVoField(physicalName = "unslip_no_seq")
    public void setUnslip_no_seq(String unslip_no_seq){
        this.unslip_no_seq = unslip_no_seq;
    }

    @ElVoField(physicalName = "wrte_dept")
    public String getWrte_dept(){
        return wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept")
    public void setWrte_dept(String wrte_dept){
        this.wrte_dept = wrte_dept;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "req_wrte_dept")
    public String getReq_wrte_dept(){
        return req_wrte_dept;
    }

    @ElVoField(physicalName = "req_wrte_dept")
    public void setReq_wrte_dept(String req_wrte_dept){
        this.req_wrte_dept = req_wrte_dept;
    }

    @ElVoField(physicalName = "chacount")
    public int getChacount(){
        return chacount;
    }

    @ElVoField(physicalName = "chacount")
    public void setChacount(int chacount){
        this.chacount = chacount;
    }

    @ElVoField(physicalName = "rmk_daecount")
    public int getRmk_daecount(){
        return rmk_daecount;
    }

    @ElVoField(physicalName = "rmk_daecount")
    public void setRmk_daecount(int rmk_daecount){
        this.rmk_daecount = rmk_daecount;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "unslip_chk")
    public String getUnslip_chk(){
        return unslip_chk;
    }

    @ElVoField(physicalName = "unslip_chk")
    public void setUnslip_chk(String unslip_chk){
        this.unslip_chk = unslip_chk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspPayAdvcAdjstVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("req_cause").append("=").append(req_cause).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("recv_ymd").append("=").append(recv_ymd).append(",");
        sb.append("recv_amt").append("=").append(recv_amt).append(",");
        sb.append("req_slip_no").append("=").append(req_slip_no).append(",");
        sb.append("adjst_ymd").append("=").append(adjst_ymd).append(",");
        sb.append("adjst_psn").append("=").append(adjst_psn).append(",");
        sb.append("adjst_emp_no").append("=").append(adjst_emp_no).append(",");
        sb.append("adjst_psn_nm").append("=").append(adjst_psn_nm).append(",");
        sb.append("adjst_dept_nm").append("=").append(adjst_dept_nm).append(",");
        sb.append("adjst_dept").append("=").append(adjst_dept).append(",");
        sb.append("adjst_detls").append("=").append(adjst_detls).append(",");
        sb.append("adjst_amt").append("=").append(adjst_amt).append(",");
        sb.append("adjst_req_no").append("=").append(adjst_req_no).append(",");
        sb.append("adjst_req_odr").append("=").append(adjst_req_odr).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("org_req_amt").append("=").append(org_req_amt).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("bank_nm").append("=").append(bank_nm).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("attach_file_no1").append("=").append(attach_file_no1).append(",");
        sb.append("attach_file_no2").append("=").append(attach_file_no2).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("adjst_no").append("=").append(adjst_no).append(",");
        sb.append("req_from_ymd").append("=").append(req_from_ymd).append(",");
        sb.append("req_to_ymd").append("=").append(req_to_ymd).append(",");
        sb.append("adjst_from_ymd").append("=").append(adjst_from_ymd).append(",");
        sb.append("adjst_to_ymd").append("=").append(adjst_to_ymd).append(",");
        sb.append("req_clsf").append("=").append(req_clsf).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("pay_demnd_ymd").append("=").append(pay_demnd_ymd).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("unslip_no_seq").append("=").append(unslip_no_seq).append(",");
        sb.append("wrte_dept").append("=").append(wrte_dept).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("req_wrte_dept").append("=").append(req_wrte_dept).append(",");
        sb.append("chacount").append("=").append(chacount).append(",");
        sb.append("rmk_daecount").append("=").append(rmk_daecount).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("unslip_chk").append("=").append(unslip_chk);
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
