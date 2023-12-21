package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직금중간정산신청정보")
public class HumApyMidSvrInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyMidSvrInfoVo(){
    }

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "reqYmdFrom", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "reqYmdTo", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "entrYmd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "retireHopeYmd", physicalName = "retire_hope_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_hope_ymd;

    @ElDtoField(logicalName = "coleYn", physicalName = "cole_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cole_yn;

    @ElDtoField(logicalName = "conctYmd", physicalName = "conct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conct_ymd;

    @ElDtoField(logicalName = "middleAdjstTyp", physicalName = "middle_adjst_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_adjst_typ;

    @ElDtoField(logicalName = "middleAdjstResn", physicalName = "middle_adjst_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_adjst_resn;

    @ElDtoField(logicalName = "fBankaccntNo", physicalName = "f_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String f_bankaccnt_no;

    @ElDtoField(logicalName = "aBankaccntNo", physicalName = "a_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String a_bankaccnt_no;

    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "longwkCntfrYmd", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "bankaccntTyp", physicalName = "bankaccnt_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_typ;

    @ElDtoField(logicalName = "bankaccntTypNm", physicalName = "bankaccnt_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_typ_nm;

    @ElDtoField(logicalName = "bankaccntNo", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "lastExecuteTim", physicalName = "last_execute_tim", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String last_execute_tim;

    @ElDtoField(logicalName = "retireAppro", physicalName = "retire_appro", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_appro;

    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "middleAdjstYn", physicalName = "middle_adjst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_adjst_yn;

    @ElDtoField(logicalName = "equalInYn", physicalName = "equal_id_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equal_id_yn;

    @ElDtoField(logicalName = "mainYrSchdlYmd", physicalName = "main_yr_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_yr_schdl_ymd;

    @ElDtoField(logicalName = "contrctClsYmd", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

    @ElDtoField(logicalName = "retireResn", physicalName = "retire_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_resn;

    @ElDtoField(logicalName = "transTyp", physicalName = "trans_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_typ;

    @ElDtoField(logicalName = "postmtNo", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElDtoField(logicalName = "baseAddr", physicalName = "base_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_addr;

    @ElDtoField(logicalName = "detlsAddr", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "homeTel", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "transAgncyNm", physicalName = "trans_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_agncy_nm;

    @ElDtoField(logicalName = "psnNoSyspayno", physicalName = "psn_no_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_syspayno;

    @ElDtoField(logicalName = "psnNoDeptCd", physicalName = "psn_no_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_dept_cd;

    @ElDtoField(logicalName = "psnNoDeptNewYmd", physicalName = "psn_no_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_dept_new_ymd;

    @ElDtoField(logicalName = "dataEssenYn", physicalName = "data_essen_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_essen_yn;

    @ElDtoField(logicalName = "dataOptYn", physicalName = "data_opt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_opt_yn;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "docId", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "serviceId", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "belngYrmon", physicalName = "belng_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String belng_yrmon;

    @ElDtoField(logicalName = "bBelngYy", physicalName = "b_belng_yy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String b_belng_yy;

    @ElDtoField(logicalName = "retireApproPre", physicalName = "retire_appro_pre", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_appro_pre;

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

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "retire_hope_ymd")
    public String getRetire_hope_ymd(){
        return retire_hope_ymd;
    }

    @ElVoField(physicalName = "retire_hope_ymd")
    public void setRetire_hope_ymd(String retire_hope_ymd){
        this.retire_hope_ymd = retire_hope_ymd;
    }

    @ElVoField(physicalName = "cole_yn")
    public String getCole_yn(){
        return cole_yn;
    }

    @ElVoField(physicalName = "cole_yn")
    public void setCole_yn(String cole_yn){
        this.cole_yn = cole_yn;
    }

    @ElVoField(physicalName = "conct_ymd")
    public String getConct_ymd(){
        return conct_ymd;
    }

    @ElVoField(physicalName = "conct_ymd")
    public void setConct_ymd(String conct_ymd){
        this.conct_ymd = conct_ymd;
    }

    @ElVoField(physicalName = "middle_adjst_typ")
    public String getMiddle_adjst_typ(){
        return middle_adjst_typ;
    }

    @ElVoField(physicalName = "middle_adjst_typ")
    public void setMiddle_adjst_typ(String middle_adjst_typ){
        this.middle_adjst_typ = middle_adjst_typ;
    }

    @ElVoField(physicalName = "middle_adjst_resn")
    public String getMiddle_adjst_resn(){
        return middle_adjst_resn;
    }

    @ElVoField(physicalName = "middle_adjst_resn")
    public void setMiddle_adjst_resn(String middle_adjst_resn){
        this.middle_adjst_resn = middle_adjst_resn;
    }

    @ElVoField(physicalName = "f_bankaccnt_no")
    public String getF_bankaccnt_no(){
        return f_bankaccnt_no;
    }

    @ElVoField(physicalName = "f_bankaccnt_no")
    public void setF_bankaccnt_no(String f_bankaccnt_no){
        this.f_bankaccnt_no = f_bankaccnt_no;
    }

    @ElVoField(physicalName = "a_bankaccnt_no")
    public String getA_bankaccnt_no(){
        return a_bankaccnt_no;
    }

    @ElVoField(physicalName = "a_bankaccnt_no")
    public void setA_bankaccnt_no(String a_bankaccnt_no){
        this.a_bankaccnt_no = a_bankaccnt_no;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "bankaccnt_typ")
    public String getBankaccnt_typ(){
        return bankaccnt_typ;
    }

    @ElVoField(physicalName = "bankaccnt_typ")
    public void setBankaccnt_typ(String bankaccnt_typ){
        this.bankaccnt_typ = bankaccnt_typ;
    }

    @ElVoField(physicalName = "bankaccnt_typ_nm")
    public String getBankaccnt_typ_nm(){
        return bankaccnt_typ_nm;
    }

    @ElVoField(physicalName = "bankaccnt_typ_nm")
    public void setBankaccnt_typ_nm(String bankaccnt_typ_nm){
        this.bankaccnt_typ_nm = bankaccnt_typ_nm;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "last_execute_tim")
    public String getLast_execute_tim(){
        return last_execute_tim;
    }

    @ElVoField(physicalName = "last_execute_tim")
    public void setLast_execute_tim(String last_execute_tim){
        this.last_execute_tim = last_execute_tim;
    }

    @ElVoField(physicalName = "retire_appro")
    public String getRetire_appro(){
        return retire_appro;
    }

    @ElVoField(physicalName = "retire_appro")
    public void setRetire_appro(String retire_appro){
        this.retire_appro = retire_appro;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "middle_adjst_yn")
    public String getMiddle_adjst_yn(){
        return middle_adjst_yn;
    }

    @ElVoField(physicalName = "middle_adjst_yn")
    public void setMiddle_adjst_yn(String middle_adjst_yn){
        this.middle_adjst_yn = middle_adjst_yn;
    }

    @ElVoField(physicalName = "equal_id_yn")
    public String getEqual_id_yn(){
        return equal_id_yn;
    }

    @ElVoField(physicalName = "equal_id_yn")
    public void setEqual_id_yn(String equal_id_yn){
        this.equal_id_yn = equal_id_yn;
    }

    @ElVoField(physicalName = "main_yr_schdl_ymd")
    public String getMain_yr_schdl_ymd(){
        return main_yr_schdl_ymd;
    }

    @ElVoField(physicalName = "main_yr_schdl_ymd")
    public void setMain_yr_schdl_ymd(String main_yr_schdl_ymd){
        this.main_yr_schdl_ymd = main_yr_schdl_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @ElVoField(physicalName = "retire_resn")
    public String getRetire_resn(){
        return retire_resn;
    }

    @ElVoField(physicalName = "retire_resn")
    public void setRetire_resn(String retire_resn){
        this.retire_resn = retire_resn;
    }

    @ElVoField(physicalName = "trans_typ")
    public String getTrans_typ(){
        return trans_typ;
    }

    @ElVoField(physicalName = "trans_typ")
    public void setTrans_typ(String trans_typ){
        this.trans_typ = trans_typ;
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

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "trans_agncy_nm")
    public String getTrans_agncy_nm(){
        return trans_agncy_nm;
    }

    @ElVoField(physicalName = "trans_agncy_nm")
    public void setTrans_agncy_nm(String trans_agncy_nm){
        this.trans_agncy_nm = trans_agncy_nm;
    }

    @ElVoField(physicalName = "psn_no_syspayno")
    public String getPsn_no_syspayno(){
        return psn_no_syspayno;
    }

    @ElVoField(physicalName = "psn_no_syspayno")
    public void setPsn_no_syspayno(String psn_no_syspayno){
        this.psn_no_syspayno = psn_no_syspayno;
    }

    @ElVoField(physicalName = "psn_no_dept_cd")
    public String getPsn_no_dept_cd(){
        return psn_no_dept_cd;
    }

    @ElVoField(physicalName = "psn_no_dept_cd")
    public void setPsn_no_dept_cd(String psn_no_dept_cd){
        this.psn_no_dept_cd = psn_no_dept_cd;
    }

    @ElVoField(physicalName = "psn_no_dept_new_ymd")
    public String getPsn_no_dept_new_ymd(){
        return psn_no_dept_new_ymd;
    }

    @ElVoField(physicalName = "psn_no_dept_new_ymd")
    public void setPsn_no_dept_new_ymd(String psn_no_dept_new_ymd){
        this.psn_no_dept_new_ymd = psn_no_dept_new_ymd;
    }

    @ElVoField(physicalName = "data_essen_yn")
    public String getData_essen_yn(){
        return data_essen_yn;
    }

    @ElVoField(physicalName = "data_essen_yn")
    public void setData_essen_yn(String data_essen_yn){
        this.data_essen_yn = data_essen_yn;
    }

    @ElVoField(physicalName = "data_opt_yn")
    public String getData_opt_yn(){
        return data_opt_yn;
    }

    @ElVoField(physicalName = "data_opt_yn")
    public void setData_opt_yn(String data_opt_yn){
        this.data_opt_yn = data_opt_yn;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public String getBelng_yrmon(){
        return belng_yrmon;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public void setBelng_yrmon(String belng_yrmon){
        this.belng_yrmon = belng_yrmon;
    }

    @ElVoField(physicalName = "b_belng_yy")
    public String getB_belng_yy(){
        return b_belng_yy;
    }

    @ElVoField(physicalName = "b_belng_yy")
    public void setB_belng_yy(String b_belng_yy){
        this.b_belng_yy = b_belng_yy;
    }

    @ElVoField(physicalName = "retire_appro_pre")
    public String getRetire_appro_pre(){
        return retire_appro_pre;
    }

    @ElVoField(physicalName = "retire_appro_pre")
    public void setRetire_appro_pre(String retire_appro_pre){
        this.retire_appro_pre = retire_appro_pre;
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
        sb.append("HumApyMidSvrInfoVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("retire_hope_ymd").append("=").append(retire_hope_ymd).append(",");
        sb.append("cole_yn").append("=").append(cole_yn).append(",");
        sb.append("conct_ymd").append("=").append(conct_ymd).append(",");
        sb.append("middle_adjst_typ").append("=").append(middle_adjst_typ).append(",");
        sb.append("middle_adjst_resn").append("=").append(middle_adjst_resn).append(",");
        sb.append("f_bankaccnt_no").append("=").append(f_bankaccnt_no).append(",");
        sb.append("a_bankaccnt_no").append("=").append(a_bankaccnt_no).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("bankaccnt_typ").append("=").append(bankaccnt_typ).append(",");
        sb.append("bankaccnt_typ_nm").append("=").append(bankaccnt_typ_nm).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("last_execute_tim").append("=").append(last_execute_tim).append(",");
        sb.append("retire_appro").append("=").append(retire_appro).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("middle_adjst_yn").append("=").append(middle_adjst_yn).append(",");
        sb.append("equal_id_yn").append("=").append(equal_id_yn).append(",");
        sb.append("main_yr_schdl_ymd").append("=").append(main_yr_schdl_ymd).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("retire_resn").append("=").append(retire_resn).append(",");
        sb.append("trans_typ").append("=").append(trans_typ).append(",");
        sb.append("postmt_no").append("=").append(postmt_no).append(",");
        sb.append("base_addr").append("=").append(base_addr).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("trans_agncy_nm").append("=").append(trans_agncy_nm).append(",");
        sb.append("psn_no_syspayno").append("=").append(psn_no_syspayno).append(",");
        sb.append("psn_no_dept_cd").append("=").append(psn_no_dept_cd).append(",");
        sb.append("psn_no_dept_new_ymd").append("=").append(psn_no_dept_new_ymd).append(",");
        sb.append("data_essen_yn").append("=").append(data_essen_yn).append(",");
        sb.append("data_opt_yn").append("=").append(data_opt_yn).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("belng_yrmon").append("=").append(belng_yrmon).append(",");
        sb.append("b_belng_yy").append("=").append(b_belng_yy).append(",");
        sb.append("retire_appro_pre").append("=").append(retire_appro_pre).append(",");
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
