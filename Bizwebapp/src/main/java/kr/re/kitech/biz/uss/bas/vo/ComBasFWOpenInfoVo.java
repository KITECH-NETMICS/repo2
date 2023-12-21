package kr.re.kitech.biz.uss.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "방화벽오픈신청정보")
public class ComBasFWOpenInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ComBasFWOpenInfoVo(){
    }

    @ElDtoField(logicalName = "aply_no", physicalName = "aply_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_no;

    @ElDtoField(logicalName = "aply_docu_clsf", physicalName = "aply_docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_docu_clsf;

    @ElDtoField(logicalName = "aply_clsf", physicalName = "aply_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_clsf;

    @ElDtoField(logicalName = "comp_charg_nm", physicalName = "comp_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_charg_nm;

    @ElDtoField(logicalName = "comp_charg_sys_pay_no", physicalName = "comp_charg_sys_pay_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_charg_sys_pay_no;

    @ElDtoField(logicalName = "aply_dept_cd", physicalName = "aply_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_dept_cd;

    @ElDtoField(logicalName = "aply_syspayno", physicalName = "aply_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_syspayno;

    @ElDtoField(logicalName = "bizwrk_prcs_state", physicalName = "bizwrk_prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_prcs_state;

    @ElDtoField(logicalName = "bizwrk_prcs_state_nm", physicalName = "bizwrk_prcs_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_prcs_state_nm;

    @ElDtoField(logicalName = "apprvl_prcs_state", physicalName = "apprvl_prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_prcs_state;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "apprvl_ymd", physicalName = "apprvl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_ymd;

    @ElDtoField(logicalName = "apprvl_state", physicalName = "apprvl_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_state;

    @ElDtoField(logicalName = "apprvl_state_nm", physicalName = "apprvl_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_state_nm;

    @ElDtoField(logicalName = "agncy_cd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;

    @ElDtoField(logicalName = "agncy_nm", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;

    @ElDtoField(logicalName = "agncy_charg_psn", physicalName = "agncy_charg_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_charg_psn;

    @ElDtoField(logicalName = "agncy_contec_tel", physicalName = "agncy_contec_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_contec_tel;

    @ElDtoField(logicalName = "in_out_clsf", physicalName = "in_out_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String in_out_clsf;

    @ElDtoField(logicalName = "etc", physicalName = "etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc;

    @ElDtoField(logicalName = "rcpt_ymd", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "rcpt_ymd_from", physicalName = "rcpt_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd_from;

    @ElDtoField(logicalName = "rcpt_ymd_to", physicalName = "rcpt_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd_to;

    @ElDtoField(logicalName = "blong_divsn", physicalName = "blong_divsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_divsn;

    @ElDtoField(logicalName = "blong_dept", physicalName = "blong_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_dept;

    @ElDtoField(logicalName = "blong_ofic", physicalName = "blong_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_ofic;

    @ElDtoField(logicalName = "comp_charg_sys_psn_no", physicalName = "comp_charg_sys_psn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_charg_sys_psn_no;

    @ElDtoField(logicalName = "aply_dept_nm", physicalName = "aply_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_dept_nm;

    @ElDtoField(logicalName = "aply_syspayno_nm", physicalName = "aply_syspayno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_syspayno_nm;

    @ElDtoField(logicalName = "aply_ymd", physicalName = "aply_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_ymd;

    @ElDtoField(logicalName = "user_id", physicalName = "user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_id;

    @ElDtoField(logicalName = "aply_sys_psn_no", physicalName = "aply_sys_psn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_sys_psn_no;

    @ElDtoField(logicalName = "aply_pns_posi", physicalName = "aply_pns_posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_pns_posi;

    @ElDtoField(logicalName = "aply_psn_mobile_no", physicalName = "aply_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_psn_mobile_no;

    @ElDtoField(logicalName = "aply_psn_krchar_nm", physicalName = "aply_psn_krchar_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_psn_krchar_nm;

    @ElDtoField(logicalName = "start_loc_ip", physicalName = "start_loc_ip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_loc_ip;

    @ElDtoField(logicalName = "destin_loc_ip", physicalName = "destin_loc_ip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String destin_loc_ip;

    @ElDtoField(logicalName = "linkn_port", physicalName = "linkn_port", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String linkn_port;

    @ElDtoField(logicalName = "unusual_item", physicalName = "unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unusual_item;

    @ElDtoField(logicalName = "link_goal", physicalName = "link_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String link_goal;

    @ElDtoField(logicalName = "link_addr", physicalName = "link_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String link_addr;

    @ElDtoField(logicalName = "link_ymd_from", physicalName = "link_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String link_ymd_from;

    @ElDtoField(logicalName = "link_ymd_to", physicalName = "link_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String link_ymd_to;

    @ElDtoField(logicalName = "link_time_to", physicalName = "link_time_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String link_time_to;

    @ElDtoField(logicalName = "link_time_from", physicalName = "link_time_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String link_time_from;

    @ElDtoField(logicalName = "ymd_link_yn", physicalName = "ymd_link_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd_link_yn;

    @ElDtoField(logicalName = "bizwrk_ymd", physicalName = "bizwrk_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_ymd;

    @ElDtoField(logicalName = "search_date", physicalName = "search_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String search_date;

    @ElDtoField(logicalName = "comp_charg_sys_pay_nm", physicalName = "comp_charg_sys_pay_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_charg_sys_pay_nm;

    @ElDtoField(logicalName = "last_execute_tim", physicalName = "last_execute_tim", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String last_execute_tim;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "serviceId", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "docId", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "endPoint", physicalName = "end_point", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_point;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "supervisor_uid", physicalName = "supervisor_uid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supervisor_uid;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElVoField(physicalName = "aply_no")
    public String getAply_no(){
        return aply_no;
    }

    @ElVoField(physicalName = "aply_no")
    public void setAply_no(String aply_no){
        this.aply_no = aply_no;
    }

    @ElVoField(physicalName = "aply_docu_clsf")
    public String getAply_docu_clsf(){
        return aply_docu_clsf;
    }

    @ElVoField(physicalName = "aply_docu_clsf")
    public void setAply_docu_clsf(String aply_docu_clsf){
        this.aply_docu_clsf = aply_docu_clsf;
    }

    @ElVoField(physicalName = "aply_clsf")
    public String getAply_clsf(){
        return aply_clsf;
    }

    @ElVoField(physicalName = "aply_clsf")
    public void setAply_clsf(String aply_clsf){
        this.aply_clsf = aply_clsf;
    }

    @ElVoField(physicalName = "comp_charg_nm")
    public String getComp_charg_nm(){
        return comp_charg_nm;
    }

    @ElVoField(physicalName = "comp_charg_nm")
    public void setComp_charg_nm(String comp_charg_nm){
        this.comp_charg_nm = comp_charg_nm;
    }

    @ElVoField(physicalName = "comp_charg_sys_pay_no")
    public String getComp_charg_sys_pay_no(){
        return comp_charg_sys_pay_no;
    }

    @ElVoField(physicalName = "comp_charg_sys_pay_no")
    public void setComp_charg_sys_pay_no(String comp_charg_sys_pay_no){
        this.comp_charg_sys_pay_no = comp_charg_sys_pay_no;
    }

    @ElVoField(physicalName = "aply_dept_cd")
    public String getAply_dept_cd(){
        return aply_dept_cd;
    }

    @ElVoField(physicalName = "aply_dept_cd")
    public void setAply_dept_cd(String aply_dept_cd){
        this.aply_dept_cd = aply_dept_cd;
    }

    @ElVoField(physicalName = "aply_syspayno")
    public String getAply_syspayno(){
        return aply_syspayno;
    }

    @ElVoField(physicalName = "aply_syspayno")
    public void setAply_syspayno(String aply_syspayno){
        this.aply_syspayno = aply_syspayno;
    }

    @ElVoField(physicalName = "bizwrk_prcs_state")
    public String getBizwrk_prcs_state(){
        return bizwrk_prcs_state;
    }

    @ElVoField(physicalName = "bizwrk_prcs_state")
    public void setBizwrk_prcs_state(String bizwrk_prcs_state){
        this.bizwrk_prcs_state = bizwrk_prcs_state;
    }

    @ElVoField(physicalName = "bizwrk_prcs_state_nm")
    public String getBizwrk_prcs_state_nm(){
        return bizwrk_prcs_state_nm;
    }

    @ElVoField(physicalName = "bizwrk_prcs_state_nm")
    public void setBizwrk_prcs_state_nm(String bizwrk_prcs_state_nm){
        this.bizwrk_prcs_state_nm = bizwrk_prcs_state_nm;
    }

    @ElVoField(physicalName = "apprvl_prcs_state")
    public String getApprvl_prcs_state(){
        return apprvl_prcs_state;
    }

    @ElVoField(physicalName = "apprvl_prcs_state")
    public void setApprvl_prcs_state(String apprvl_prcs_state){
        this.apprvl_prcs_state = apprvl_prcs_state;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apprvl_ymd")
    public String getApprvl_ymd(){
        return apprvl_ymd;
    }

    @ElVoField(physicalName = "apprvl_ymd")
    public void setApprvl_ymd(String apprvl_ymd){
        this.apprvl_ymd = apprvl_ymd;
    }

    @ElVoField(physicalName = "apprvl_state")
    public String getApprvl_state(){
        return apprvl_state;
    }

    @ElVoField(physicalName = "apprvl_state")
    public void setApprvl_state(String apprvl_state){
        this.apprvl_state = apprvl_state;
    }

    @ElVoField(physicalName = "apprvl_state_nm")
    public String getApprvl_state_nm(){
        return apprvl_state_nm;
    }

    @ElVoField(physicalName = "apprvl_state_nm")
    public void setApprvl_state_nm(String apprvl_state_nm){
        this.apprvl_state_nm = apprvl_state_nm;
    }

    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }

    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }

    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }

    @ElVoField(physicalName = "agncy_charg_psn")
    public String getAgncy_charg_psn(){
        return agncy_charg_psn;
    }

    @ElVoField(physicalName = "agncy_charg_psn")
    public void setAgncy_charg_psn(String agncy_charg_psn){
        this.agncy_charg_psn = agncy_charg_psn;
    }

    @ElVoField(physicalName = "agncy_contec_tel")
    public String getAgncy_contec_tel(){
        return agncy_contec_tel;
    }

    @ElVoField(physicalName = "agncy_contec_tel")
    public void setAgncy_contec_tel(String agncy_contec_tel){
        this.agncy_contec_tel = agncy_contec_tel;
    }

    @ElVoField(physicalName = "in_out_clsf")
    public String getIn_out_clsf(){
        return in_out_clsf;
    }

    @ElVoField(physicalName = "in_out_clsf")
    public void setIn_out_clsf(String in_out_clsf){
        this.in_out_clsf = in_out_clsf;
    }

    @ElVoField(physicalName = "etc")
    public String getEtc(){
        return etc;
    }

    @ElVoField(physicalName = "etc")
    public void setEtc(String etc){
        this.etc = etc;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd_from")
    public String getRcpt_ymd_from(){
        return rcpt_ymd_from;
    }

    @ElVoField(physicalName = "rcpt_ymd_from")
    public void setRcpt_ymd_from(String rcpt_ymd_from){
        this.rcpt_ymd_from = rcpt_ymd_from;
    }

    @ElVoField(physicalName = "rcpt_ymd_to")
    public String getRcpt_ymd_to(){
        return rcpt_ymd_to;
    }

    @ElVoField(physicalName = "rcpt_ymd_to")
    public void setRcpt_ymd_to(String rcpt_ymd_to){
        this.rcpt_ymd_to = rcpt_ymd_to;
    }

    @ElVoField(physicalName = "blong_divsn")
    public String getBlong_divsn(){
        return blong_divsn;
    }

    @ElVoField(physicalName = "blong_divsn")
    public void setBlong_divsn(String blong_divsn){
        this.blong_divsn = blong_divsn;
    }

    @ElVoField(physicalName = "blong_dept")
    public String getBlong_dept(){
        return blong_dept;
    }

    @ElVoField(physicalName = "blong_dept")
    public void setBlong_dept(String blong_dept){
        this.blong_dept = blong_dept;
    }

    @ElVoField(physicalName = "blong_ofic")
    public String getBlong_ofic(){
        return blong_ofic;
    }

    @ElVoField(physicalName = "blong_ofic")
    public void setBlong_ofic(String blong_ofic){
        this.blong_ofic = blong_ofic;
    }

    @ElVoField(physicalName = "comp_charg_sys_psn_no")
    public String getComp_charg_sys_psn_no(){
        return comp_charg_sys_psn_no;
    }

    @ElVoField(physicalName = "comp_charg_sys_psn_no")
    public void setComp_charg_sys_psn_no(String comp_charg_sys_psn_no){
        this.comp_charg_sys_psn_no = comp_charg_sys_psn_no;
    }

    @ElVoField(physicalName = "aply_dept_nm")
    public String getAply_dept_nm(){
        return aply_dept_nm;
    }

    @ElVoField(physicalName = "aply_dept_nm")
    public void setAply_dept_nm(String aply_dept_nm){
        this.aply_dept_nm = aply_dept_nm;
    }

    @ElVoField(physicalName = "aply_syspayno_nm")
    public String getAply_syspayno_nm(){
        return aply_syspayno_nm;
    }

    @ElVoField(physicalName = "aply_syspayno_nm")
    public void setAply_syspayno_nm(String aply_syspayno_nm){
        this.aply_syspayno_nm = aply_syspayno_nm;
    }

    @ElVoField(physicalName = "aply_ymd")
    public String getAply_ymd(){
        return aply_ymd;
    }

    @ElVoField(physicalName = "aply_ymd")
    public void setAply_ymd(String aply_ymd){
        this.aply_ymd = aply_ymd;
    }

    @ElVoField(physicalName = "user_id")
    public String getUser_id(){
        return user_id;
    }

    @ElVoField(physicalName = "user_id")
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    @ElVoField(physicalName = "aply_sys_psn_no")
    public String getAply_sys_psn_no(){
        return aply_sys_psn_no;
    }

    @ElVoField(physicalName = "aply_sys_psn_no")
    public void setAply_sys_psn_no(String aply_sys_psn_no){
        this.aply_sys_psn_no = aply_sys_psn_no;
    }

    @ElVoField(physicalName = "aply_pns_posi")
    public String getAply_pns_posi(){
        return aply_pns_posi;
    }

    @ElVoField(physicalName = "aply_pns_posi")
    public void setAply_pns_posi(String aply_pns_posi){
        this.aply_pns_posi = aply_pns_posi;
    }

    @ElVoField(physicalName = "aply_psn_mobile_no")
    public String getAply_psn_mobile_no(){
        return aply_psn_mobile_no;
    }

    @ElVoField(physicalName = "aply_psn_mobile_no")
    public void setAply_psn_mobile_no(String aply_psn_mobile_no){
        this.aply_psn_mobile_no = aply_psn_mobile_no;
    }

    @ElVoField(physicalName = "aply_psn_krchar_nm")
    public String getAply_psn_krchar_nm(){
        return aply_psn_krchar_nm;
    }

    @ElVoField(physicalName = "aply_psn_krchar_nm")
    public void setAply_psn_krchar_nm(String aply_psn_krchar_nm){
        this.aply_psn_krchar_nm = aply_psn_krchar_nm;
    }

    @ElVoField(physicalName = "start_loc_ip")
    public String getStart_loc_ip(){
        return start_loc_ip;
    }

    @ElVoField(physicalName = "start_loc_ip")
    public void setStart_loc_ip(String start_loc_ip){
        this.start_loc_ip = start_loc_ip;
    }

    @ElVoField(physicalName = "destin_loc_ip")
    public String getDestin_loc_ip(){
        return destin_loc_ip;
    }

    @ElVoField(physicalName = "destin_loc_ip")
    public void setDestin_loc_ip(String destin_loc_ip){
        this.destin_loc_ip = destin_loc_ip;
    }

    @ElVoField(physicalName = "linkn_port")
    public String getLinkn_port(){
        return linkn_port;
    }

    @ElVoField(physicalName = "linkn_port")
    public void setLinkn_port(String linkn_port){
        this.linkn_port = linkn_port;
    }

    @ElVoField(physicalName = "unusual_item")
    public String getUnusual_item(){
        return unusual_item;
    }

    @ElVoField(physicalName = "unusual_item")
    public void setUnusual_item(String unusual_item){
        this.unusual_item = unusual_item;
    }

    @ElVoField(physicalName = "link_goal")
    public String getLink_goal(){
        return link_goal;
    }

    @ElVoField(physicalName = "link_goal")
    public void setLink_goal(String link_goal){
        this.link_goal = link_goal;
    }

    @ElVoField(physicalName = "link_addr")
    public String getLink_addr(){
        return link_addr;
    }

    @ElVoField(physicalName = "link_addr")
    public void setLink_addr(String link_addr){
        this.link_addr = link_addr;
    }

    @ElVoField(physicalName = "link_ymd_from")
    public String getLink_ymd_from(){
        return link_ymd_from;
    }

    @ElVoField(physicalName = "link_ymd_from")
    public void setLink_ymd_from(String link_ymd_from){
        this.link_ymd_from = link_ymd_from;
    }

    @ElVoField(physicalName = "link_ymd_to")
    public String getLink_ymd_to(){
        return link_ymd_to;
    }

    @ElVoField(physicalName = "link_ymd_to")
    public void setLink_ymd_to(String link_ymd_to){
        this.link_ymd_to = link_ymd_to;
    }

    @ElVoField(physicalName = "link_time_to")
    public String getLink_time_to(){
        return link_time_to;
    }

    @ElVoField(physicalName = "link_time_to")
    public void setLink_time_to(String link_time_to){
        this.link_time_to = link_time_to;
    }

    @ElVoField(physicalName = "link_time_from")
    public String getLink_time_from(){
        return link_time_from;
    }

    @ElVoField(physicalName = "link_time_from")
    public void setLink_time_from(String link_time_from){
        this.link_time_from = link_time_from;
    }

    @ElVoField(physicalName = "ymd_link_yn")
    public String getYmd_link_yn(){
        return ymd_link_yn;
    }

    @ElVoField(physicalName = "ymd_link_yn")
    public void setYmd_link_yn(String ymd_link_yn){
        this.ymd_link_yn = ymd_link_yn;
    }

    @ElVoField(physicalName = "bizwrk_ymd")
    public String getBizwrk_ymd(){
        return bizwrk_ymd;
    }

    @ElVoField(physicalName = "bizwrk_ymd")
    public void setBizwrk_ymd(String bizwrk_ymd){
        this.bizwrk_ymd = bizwrk_ymd;
    }

    @ElVoField(physicalName = "search_date")
    public String getSearch_date(){
        return search_date;
    }

    @ElVoField(physicalName = "search_date")
    public void setSearch_date(String search_date){
        this.search_date = search_date;
    }

    @ElVoField(physicalName = "comp_charg_sys_pay_nm")
    public String getComp_charg_sys_pay_nm(){
        return comp_charg_sys_pay_nm;
    }

    @ElVoField(physicalName = "comp_charg_sys_pay_nm")
    public void setComp_charg_sys_pay_nm(String comp_charg_sys_pay_nm){
        this.comp_charg_sys_pay_nm = comp_charg_sys_pay_nm;
    }

    @ElVoField(physicalName = "last_execute_tim")
    public String getLast_execute_tim(){
        return last_execute_tim;
    }

    @ElVoField(physicalName = "last_execute_tim")
    public void setLast_execute_tim(String last_execute_tim){
        this.last_execute_tim = last_execute_tim;
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

    @ElVoField(physicalName = "end_point")
    public String getEnd_point(){
        return end_point;
    }

    @ElVoField(physicalName = "end_point")
    public void setEnd_point(String end_point){
        this.end_point = end_point;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "supervisor_uid")
    public String getSupervisor_uid(){
        return supervisor_uid;
    }

    @ElVoField(physicalName = "supervisor_uid")
    public void setSupervisor_uid(String supervisor_uid){
        this.supervisor_uid = supervisor_uid;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComBasFWOpenInfoVo [");
        sb.append("aply_no").append("=").append(aply_no).append(",");
        sb.append("aply_docu_clsf").append("=").append(aply_docu_clsf).append(",");
        sb.append("aply_clsf").append("=").append(aply_clsf).append(",");
        sb.append("comp_charg_nm").append("=").append(comp_charg_nm).append(",");
        sb.append("comp_charg_sys_pay_no").append("=").append(comp_charg_sys_pay_no).append(",");
        sb.append("aply_dept_cd").append("=").append(aply_dept_cd).append(",");
        sb.append("aply_syspayno").append("=").append(aply_syspayno).append(",");
        sb.append("bizwrk_prcs_state").append("=").append(bizwrk_prcs_state).append(",");
        sb.append("bizwrk_prcs_state_nm").append("=").append(bizwrk_prcs_state_nm).append(",");
        sb.append("apprvl_prcs_state").append("=").append(apprvl_prcs_state).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apprvl_ymd").append("=").append(apprvl_ymd).append(",");
        sb.append("apprvl_state").append("=").append(apprvl_state).append(",");
        sb.append("apprvl_state_nm").append("=").append(apprvl_state_nm).append(",");
        sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
        sb.append("agncy_nm").append("=").append(agncy_nm).append(",");
        sb.append("agncy_charg_psn").append("=").append(agncy_charg_psn).append(",");
        sb.append("agncy_contec_tel").append("=").append(agncy_contec_tel).append(",");
        sb.append("in_out_clsf").append("=").append(in_out_clsf).append(",");
        sb.append("etc").append("=").append(etc).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("rcpt_ymd_from").append("=").append(rcpt_ymd_from).append(",");
        sb.append("rcpt_ymd_to").append("=").append(rcpt_ymd_to).append(",");
        sb.append("blong_divsn").append("=").append(blong_divsn).append(",");
        sb.append("blong_dept").append("=").append(blong_dept).append(",");
        sb.append("blong_ofic").append("=").append(blong_ofic).append(",");
        sb.append("comp_charg_sys_psn_no").append("=").append(comp_charg_sys_psn_no).append(",");
        sb.append("aply_dept_nm").append("=").append(aply_dept_nm).append(",");
        sb.append("aply_syspayno_nm").append("=").append(aply_syspayno_nm).append(",");
        sb.append("aply_ymd").append("=").append(aply_ymd).append(",");
        sb.append("user_id").append("=").append(user_id).append(",");
        sb.append("aply_sys_psn_no").append("=").append(aply_sys_psn_no).append(",");
        sb.append("aply_pns_posi").append("=").append(aply_pns_posi).append(",");
        sb.append("aply_psn_mobile_no").append("=").append(aply_psn_mobile_no).append(",");
        sb.append("aply_psn_krchar_nm").append("=").append(aply_psn_krchar_nm).append(",");
        sb.append("start_loc_ip").append("=").append(start_loc_ip).append(",");
        sb.append("destin_loc_ip").append("=").append(destin_loc_ip).append(",");
        sb.append("linkn_port").append("=").append(linkn_port).append(",");
        sb.append("unusual_item").append("=").append(unusual_item).append(",");
        sb.append("link_goal").append("=").append(link_goal).append(",");
        sb.append("link_addr").append("=").append(link_addr).append(",");
        sb.append("link_ymd_from").append("=").append(link_ymd_from).append(",");
        sb.append("link_ymd_to").append("=").append(link_ymd_to).append(",");
        sb.append("link_time_to").append("=").append(link_time_to).append(",");
        sb.append("link_time_from").append("=").append(link_time_from).append(",");
        sb.append("ymd_link_yn").append("=").append(ymd_link_yn).append(",");
        sb.append("bizwrk_ymd").append("=").append(bizwrk_ymd).append(",");
        sb.append("search_date").append("=").append(search_date).append(",");
        sb.append("comp_charg_sys_pay_nm").append("=").append(comp_charg_sys_pay_nm).append(",");
        sb.append("last_execute_tim").append("=").append(last_execute_tim).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("end_point").append("=").append(end_point).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("supervisor_uid").append("=").append(supervisor_uid).append(",");
        sb.append("empno").append("=").append(empno);
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
