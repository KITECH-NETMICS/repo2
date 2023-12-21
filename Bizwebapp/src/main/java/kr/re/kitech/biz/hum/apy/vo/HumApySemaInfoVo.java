package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "적립형공제신청정보")
public class HumApySemaInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApySemaInfoVo(){
    }

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "req_typ", physicalName = "req_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "req_ymd_from", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "req_ymd_to", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "req_typ_nm", physicalName = "req_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ_nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posi_cd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "incrdecr_bankaccnt_no", physicalName = "incrdecr_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incrdecr_bankaccnt_no;

    @ElDtoField(logicalName = "incrdecr_amt", physicalName = "incrdecr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incrdecr_amt;

    @ElDtoField(logicalName = "tot_bankaccnt_no", physicalName = "tot_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bankaccnt_no;

    @ElDtoField(logicalName = "tot_amt", physicalName = "tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_amt;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "total_sema_amt", physicalName = "total_sema_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int total_sema_amt;

    @ElDtoField(logicalName = "calc_base", physicalName = "calc_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String calc_base;

    @ElDtoField(logicalName = "fretax_amt", physicalName = "fretax_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_amt;

    @ElDtoField(logicalName = "calc_base_2", physicalName = "calc_base_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String calc_base_2;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "postmt_no", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElDtoField(logicalName = "base_addr", physicalName = "base_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_addr;

    @ElDtoField(logicalName = "detls_addr", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "cmpy_postmt_no", physicalName = "cmpy_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_postmt_no;

    @ElDtoField(logicalName = "cmpy_base_addr", physicalName = "cmpy_base_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_base_addr;

    @ElDtoField(logicalName = "cmpy_detls_addr", physicalName = "cmpy_detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_detls_addr;

    @ElDtoField(logicalName = "home_tel", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "req_befr_bankaccnt_no", physicalName = "req_befr_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_befr_bankaccnt_no;

    @ElDtoField(logicalName = "req_cause", physicalName = "req_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_cause;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "entr_ymd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "resid_no", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "addr_postmt_no", physicalName = "addr_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_postmt_no;

    @ElDtoField(logicalName = "addr_base", physicalName = "addr_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_base;

    @ElDtoField(logicalName = "addr_detls", physicalName = "addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_detls;

    @ElDtoField(logicalName = "cole_yn", physicalName = "cole_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cole_yn;

    @ElDtoField(logicalName = "savng_shape_dedct", physicalName = "savng_shape_dedct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String savng_shape_dedct;

    @ElDtoField(logicalName = "appont_contrct_ymd", physicalName = "appont_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_contrct_ymd;

    @ElDtoField(logicalName = "appont_cls_ymd", physicalName = "appont_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_cls_ymd;

    @ElDtoField(logicalName = "longwk_cntfr_ymd", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "sci_tech_anuty", physicalName = "sci_tech_anuty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_anuty;

    @ElDtoField(logicalName = "own_driv_sub_pay", physicalName = "own_driv_sub_pay", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String own_driv_sub_pay;

    @ElDtoField(logicalName = "sema_mm", physicalName = "sema_mm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sema_mm;

    @ElDtoField(logicalName = "occutyp_cd", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "occugrp_cd", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "card_keeper", physicalName = "card_keeper", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_keeper;

    @ElDtoField(logicalName = "contrct_cls_ymd", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

    @ElDtoField(logicalName = "carmdl", physicalName = "carmdl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String carmdl;

    @ElDtoField(logicalName = "car_no", physicalName = "car_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_no;

    @ElDtoField(logicalName = "car_clr", physicalName = "car_clr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_clr;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "service_id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "doc_id", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "count", physicalName = "count", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int count;

    @ElDtoField(logicalName = "base_ymd", physicalName = "base_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_ymd;

    @ElDtoField(logicalName = "salry_cd", physicalName = "salry_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_cd;

    @ElDtoField(logicalName = "salry_bank", physicalName = "salry_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_bank;

    @ElDtoField(logicalName = "bankaccnt_no", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "depstr", physicalName = "depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr;

    @ElDtoField(logicalName = "add_pay_amt", physicalName = "add_pay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_pay_amt;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "req_typ")
    public String getReq_typ(){
        return req_typ;
    }

    @ElVoField(physicalName = "req_typ")
    public void setReq_typ(String req_typ){
        this.req_typ = req_typ;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public String getReq_ymd_from(){
        return req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public void setReq_ymd_from(String req_ymd_from){
        this.req_ymd_from = req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public String getReq_ymd_to(){
        return req_ymd_to;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public void setReq_ymd_to(String req_ymd_to){
        this.req_ymd_to = req_ymd_to;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_typ_nm")
    public String getReq_typ_nm(){
        return req_typ_nm;
    }

    @ElVoField(physicalName = "req_typ_nm")
    public void setReq_typ_nm(String req_typ_nm){
        this.req_typ_nm = req_typ_nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "incrdecr_bankaccnt_no")
    public String getIncrdecr_bankaccnt_no(){
        return incrdecr_bankaccnt_no;
    }

    @ElVoField(physicalName = "incrdecr_bankaccnt_no")
    public void setIncrdecr_bankaccnt_no(String incrdecr_bankaccnt_no){
        this.incrdecr_bankaccnt_no = incrdecr_bankaccnt_no;
    }

    @ElVoField(physicalName = "incrdecr_amt")
    public String getIncrdecr_amt(){
        return incrdecr_amt;
    }

    @ElVoField(physicalName = "incrdecr_amt")
    public void setIncrdecr_amt(String incrdecr_amt){
        this.incrdecr_amt = incrdecr_amt;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public String getTot_bankaccnt_no(){
        return tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public void setTot_bankaccnt_no(String tot_bankaccnt_no){
        this.tot_bankaccnt_no = tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "tot_amt")
    public String getTot_amt(){
        return tot_amt;
    }

    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(String tot_amt){
        this.tot_amt = tot_amt;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "total_sema_amt")
    public int getTotal_sema_amt(){
        return total_sema_amt;
    }

    @ElVoField(physicalName = "total_sema_amt")
    public void setTotal_sema_amt(int total_sema_amt){
        this.total_sema_amt = total_sema_amt;
    }

    @ElVoField(physicalName = "calc_base")
    public String getCalc_base(){
        return calc_base;
    }

    @ElVoField(physicalName = "calc_base")
    public void setCalc_base(String calc_base){
        this.calc_base = calc_base;
    }

    @ElVoField(physicalName = "fretax_amt")
    public String getFretax_amt(){
        return fretax_amt;
    }

    @ElVoField(physicalName = "fretax_amt")
    public void setFretax_amt(String fretax_amt){
        this.fretax_amt = fretax_amt;
    }

    @ElVoField(physicalName = "calc_base_2")
    public String getCalc_base_2(){
        return calc_base_2;
    }

    @ElVoField(physicalName = "calc_base_2")
    public void setCalc_base_2(String calc_base_2){
        this.calc_base_2 = calc_base_2;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "postmt_no")
    public String getPostmt_no(){
        return postmt_no;
    }

    @ElVoField(physicalName = "postmt_no")
    public void setPostmt_no(String postmt_no){
        this.postmt_no = postmt_no;
    }

    @ElVoField(physicalName = "base_addr")
    public String getBase_addr(){
        return base_addr;
    }

    @ElVoField(physicalName = "base_addr")
    public void setBase_addr(String base_addr){
        this.base_addr = base_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }

    @ElVoField(physicalName = "cmpy_postmt_no")
    public String getCmpy_postmt_no(){
        return cmpy_postmt_no;
    }

    @ElVoField(physicalName = "cmpy_postmt_no")
    public void setCmpy_postmt_no(String cmpy_postmt_no){
        this.cmpy_postmt_no = cmpy_postmt_no;
    }

    @ElVoField(physicalName = "cmpy_base_addr")
    public String getCmpy_base_addr(){
        return cmpy_base_addr;
    }

    @ElVoField(physicalName = "cmpy_base_addr")
    public void setCmpy_base_addr(String cmpy_base_addr){
        this.cmpy_base_addr = cmpy_base_addr;
    }

    @ElVoField(physicalName = "cmpy_detls_addr")
    public String getCmpy_detls_addr(){
        return cmpy_detls_addr;
    }

    @ElVoField(physicalName = "cmpy_detls_addr")
    public void setCmpy_detls_addr(String cmpy_detls_addr){
        this.cmpy_detls_addr = cmpy_detls_addr;
    }

    @ElVoField(physicalName = "home_tel")
    public String getHome_tel(){
        return home_tel;
    }

    @ElVoField(physicalName = "home_tel")
    public void setHome_tel(String home_tel){
        this.home_tel = home_tel;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "req_befr_bankaccnt_no")
    public String getReq_befr_bankaccnt_no(){
        return req_befr_bankaccnt_no;
    }

    @ElVoField(physicalName = "req_befr_bankaccnt_no")
    public void setReq_befr_bankaccnt_no(String req_befr_bankaccnt_no){
        this.req_befr_bankaccnt_no = req_befr_bankaccnt_no;
    }

    @ElVoField(physicalName = "req_cause")
    public String getReq_cause(){
        return req_cause;
    }

    @ElVoField(physicalName = "req_cause")
    public void setReq_cause(String req_cause){
        this.req_cause = req_cause;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "addr_postmt_no")
    public String getAddr_postmt_no(){
        return addr_postmt_no;
    }

    @ElVoField(physicalName = "addr_postmt_no")
    public void setAddr_postmt_no(String addr_postmt_no){
        this.addr_postmt_no = addr_postmt_no;
    }

    @ElVoField(physicalName = "addr_base")
    public String getAddr_base(){
        return addr_base;
    }

    @ElVoField(physicalName = "addr_base")
    public void setAddr_base(String addr_base){
        this.addr_base = addr_base;
    }

    @ElVoField(physicalName = "addr_detls")
    public String getAddr_detls(){
        return addr_detls;
    }

    @ElVoField(physicalName = "addr_detls")
    public void setAddr_detls(String addr_detls){
        this.addr_detls = addr_detls;
    }

    @ElVoField(physicalName = "cole_yn")
    public String getCole_yn(){
        return cole_yn;
    }

    @ElVoField(physicalName = "cole_yn")
    public void setCole_yn(String cole_yn){
        this.cole_yn = cole_yn;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public String getSavng_shape_dedct(){
        return savng_shape_dedct;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public void setSavng_shape_dedct(String savng_shape_dedct){
        this.savng_shape_dedct = savng_shape_dedct;
    }

    @ElVoField(physicalName = "appont_contrct_ymd")
    public String getAppont_contrct_ymd(){
        return appont_contrct_ymd;
    }

    @ElVoField(physicalName = "appont_contrct_ymd")
    public void setAppont_contrct_ymd(String appont_contrct_ymd){
        this.appont_contrct_ymd = appont_contrct_ymd;
    }

    @ElVoField(physicalName = "appont_cls_ymd")
    public String getAppont_cls_ymd(){
        return appont_cls_ymd;
    }

    @ElVoField(physicalName = "appont_cls_ymd")
    public void setAppont_cls_ymd(String appont_cls_ymd){
        this.appont_cls_ymd = appont_cls_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public String getSci_tech_anuty(){
        return sci_tech_anuty;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public void setSci_tech_anuty(String sci_tech_anuty){
        this.sci_tech_anuty = sci_tech_anuty;
    }

    @ElVoField(physicalName = "own_driv_sub_pay")
    public String getOwn_driv_sub_pay(){
        return own_driv_sub_pay;
    }

    @ElVoField(physicalName = "own_driv_sub_pay")
    public void setOwn_driv_sub_pay(String own_driv_sub_pay){
        this.own_driv_sub_pay = own_driv_sub_pay;
    }

    @ElVoField(physicalName = "sema_mm")
    public String getSema_mm(){
        return sema_mm;
    }

    @ElVoField(physicalName = "sema_mm")
    public void setSema_mm(String sema_mm){
        this.sema_mm = sema_mm;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public String getOccutyp_cd(){
        return occutyp_cd;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public void setOccutyp_cd(String occutyp_cd){
        this.occutyp_cd = occutyp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public String getOccugrp_cd(){
        return occugrp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public void setOccugrp_cd(String occugrp_cd){
        this.occugrp_cd = occugrp_cd;
    }

    @ElVoField(physicalName = "card_keeper")
    public String getCard_keeper(){
        return card_keeper;
    }

    @ElVoField(physicalName = "card_keeper")
    public void setCard_keeper(String card_keeper){
        this.card_keeper = card_keeper;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @ElVoField(physicalName = "carmdl")
    public String getCarmdl(){
        return carmdl;
    }

    @ElVoField(physicalName = "carmdl")
    public void setCarmdl(String carmdl){
        this.carmdl = carmdl;
    }

    @ElVoField(physicalName = "car_no")
    public String getCar_no(){
        return car_no;
    }

    @ElVoField(physicalName = "car_no")
    public void setCar_no(String car_no){
        this.car_no = car_no;
    }

    @ElVoField(physicalName = "car_clr")
    public String getCar_clr(){
        return car_clr;
    }

    @ElVoField(physicalName = "car_clr")
    public void setCar_clr(String car_clr){
        this.car_clr = car_clr;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "count")
    public int getCount(){
        return count;
    }

    @ElVoField(physicalName = "count")
    public void setCount(int count){
        this.count = count;
    }

    @ElVoField(physicalName = "base_ymd")
    public String getBase_ymd(){
        return base_ymd;
    }

    @ElVoField(physicalName = "base_ymd")
    public void setBase_ymd(String base_ymd){
        this.base_ymd = base_ymd;
    }

    @ElVoField(physicalName = "salry_cd")
    public String getSalry_cd(){
        return salry_cd;
    }

    @ElVoField(physicalName = "salry_cd")
    public void setSalry_cd(String salry_cd){
        this.salry_cd = salry_cd;
    }

    @ElVoField(physicalName = "salry_bank")
    public String getSalry_bank(){
        return salry_bank;
    }

    @ElVoField(physicalName = "salry_bank")
    public void setSalry_bank(String salry_bank){
        this.salry_bank = salry_bank;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "depstr")
    public String getDepstr(){
        return depstr;
    }

    @ElVoField(physicalName = "depstr")
    public void setDepstr(String depstr){
        this.depstr = depstr;
    }

    @ElVoField(physicalName = "add_pay_amt")
    public String getAdd_pay_amt(){
        return add_pay_amt;
    }

    @ElVoField(physicalName = "add_pay_amt")
    public void setAdd_pay_amt(String add_pay_amt){
        this.add_pay_amt = add_pay_amt;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApySemaInfoVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("req_typ").append("=").append(req_typ).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_typ_nm").append("=").append(req_typ_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("incrdecr_bankaccnt_no").append("=").append(incrdecr_bankaccnt_no).append(",");
        sb.append("incrdecr_amt").append("=").append(incrdecr_amt).append(",");
        sb.append("tot_bankaccnt_no").append("=").append(tot_bankaccnt_no).append(",");
        sb.append("tot_amt").append("=").append(tot_amt).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("total_sema_amt").append("=").append(total_sema_amt).append(",");
        sb.append("calc_base").append("=").append(calc_base).append(",");
        sb.append("fretax_amt").append("=").append(fretax_amt).append(",");
        sb.append("calc_base_2").append("=").append(calc_base_2).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("postmt_no").append("=").append(postmt_no).append(",");
        sb.append("base_addr").append("=").append(base_addr).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("cmpy_postmt_no").append("=").append(cmpy_postmt_no).append(",");
        sb.append("cmpy_base_addr").append("=").append(cmpy_base_addr).append(",");
        sb.append("cmpy_detls_addr").append("=").append(cmpy_detls_addr).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("req_befr_bankaccnt_no").append("=").append(req_befr_bankaccnt_no).append(",");
        sb.append("req_cause").append("=").append(req_cause).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("addr_postmt_no").append("=").append(addr_postmt_no).append(",");
        sb.append("addr_base").append("=").append(addr_base).append(",");
        sb.append("addr_detls").append("=").append(addr_detls).append(",");
        sb.append("cole_yn").append("=").append(cole_yn).append(",");
        sb.append("savng_shape_dedct").append("=").append(savng_shape_dedct).append(",");
        sb.append("appont_contrct_ymd").append("=").append(appont_contrct_ymd).append(",");
        sb.append("appont_cls_ymd").append("=").append(appont_cls_ymd).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("sci_tech_anuty").append("=").append(sci_tech_anuty).append(",");
        sb.append("own_driv_sub_pay").append("=").append(own_driv_sub_pay).append(",");
        sb.append("sema_mm").append("=").append(sema_mm).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("card_keeper").append("=").append(card_keeper).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("carmdl").append("=").append(carmdl).append(",");
        sb.append("car_no").append("=").append(car_no).append(",");
        sb.append("car_clr").append("=").append(car_clr).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("count").append("=").append(count).append(",");
        sb.append("base_ymd").append("=").append(base_ymd).append(",");
        sb.append("salry_cd").append("=").append(salry_cd).append(",");
        sb.append("salry_bank").append("=").append(salry_bank).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr").append("=").append(depstr).append(",");
        sb.append("add_pay_amt").append("=").append(add_pay_amt).append(",");
        sb.append("info_cd").append("=").append(info_cd);
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
