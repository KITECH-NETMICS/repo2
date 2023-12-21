package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "MsgSendLogExp")
public class FbaApartAccntReqVo extends kr.re.kitech.biz.fin.std.vo.FbaApartAccntVo {
    private static final long serialVersionUID = 1L;

    public FbaApartAccntReqVo(){
    }

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "salry_bank", physicalName = "salry_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_bank;

    @ElDtoField(logicalName = "bankaccnt_attach_file_no", physicalName = "bankaccnt_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_attach_file_no;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "depstr", physicalName = "depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "ret_yn", physicalName = "ret_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ret_yn;

    @ElDtoField(logicalName = "a_bankaccnt_no", physicalName = "a_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String a_bankaccnt_no;

    @ElDtoField(logicalName = "b_bankaccnt_no", physicalName = "b_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String b_bankaccnt_no;

    @ElDtoField(logicalName = "a_bankaccnt_nm", physicalName = "a_bankaccnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String a_bankaccnt_nm;

    @ElDtoField(logicalName = "b_bankaccnt_nm", physicalName = "b_bankaccnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String b_bankaccnt_nm;

    @ElDtoField(logicalName = "req_ymd_from", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "req_ymd_to", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "posi_cd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "entr_ymd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "salry_bank_nm", physicalName = "salry_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_bank_nm;

    @ElDtoField(logicalName = "nm_eng", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_eng;

    @ElDtoField(logicalName = "home_tel", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "addr_postmt_no", physicalName = "addr_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_postmt_no;

    @ElDtoField(logicalName = "addr_base", physicalName = "addr_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_base;

    @ElDtoField(logicalName = "addr_detls", physicalName = "addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_detls;

    @ElDtoField(logicalName = "longwk_cntfr_ymd", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "resid_no", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "sci_tech_anuty", physicalName = "sci_tech_anuty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_anuty;

    @ElDtoField(logicalName = "savng_shape_dedct", physicalName = "savng_shape_dedct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String savng_shape_dedct;

    @ElDtoField(logicalName = "job_clsf", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "job_clsf_nm", physicalName = "job_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf_nm;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "bankaccnt_no_1", physicalName = "bankaccnt_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no_1;

    @ElDtoField(logicalName = "depstr_nm", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "bank", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "bankaccnt_no", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "salry_bank")
    public String getSalry_bank(){
        return salry_bank;
    }

    @ElVoField(physicalName = "salry_bank")
    public void setSalry_bank(String salry_bank){
        this.salry_bank = salry_bank;
    }

    @ElVoField(physicalName = "bankaccnt_attach_file_no")
    public String getBankaccnt_attach_file_no(){
        return bankaccnt_attach_file_no;
    }

    @ElVoField(physicalName = "bankaccnt_attach_file_no")
    public void setBankaccnt_attach_file_no(String bankaccnt_attach_file_no){
        this.bankaccnt_attach_file_no = bankaccnt_attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "depstr")
    public String getDepstr(){
        return depstr;
    }

    @ElVoField(physicalName = "depstr")
    public void setDepstr(String depstr){
        this.depstr = depstr;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "ret_yn")
    public String getRet_yn(){
        return ret_yn;
    }

    @ElVoField(physicalName = "ret_yn")
    public void setRet_yn(String ret_yn){
        this.ret_yn = ret_yn;
    }

    @ElVoField(physicalName = "a_bankaccnt_no")
    public String getA_bankaccnt_no(){
        return a_bankaccnt_no;
    }

    @ElVoField(physicalName = "a_bankaccnt_no")
    public void setA_bankaccnt_no(String a_bankaccnt_no){
        this.a_bankaccnt_no = a_bankaccnt_no;
    }

    @ElVoField(physicalName = "b_bankaccnt_no")
    public String getB_bankaccnt_no(){
        return b_bankaccnt_no;
    }

    @ElVoField(physicalName = "b_bankaccnt_no")
    public void setB_bankaccnt_no(String b_bankaccnt_no){
        this.b_bankaccnt_no = b_bankaccnt_no;
    }

    @ElVoField(physicalName = "a_bankaccnt_nm")
    public String getA_bankaccnt_nm(){
        return a_bankaccnt_nm;
    }

    @ElVoField(physicalName = "a_bankaccnt_nm")
    public void setA_bankaccnt_nm(String a_bankaccnt_nm){
        this.a_bankaccnt_nm = a_bankaccnt_nm;
    }

    @ElVoField(physicalName = "b_bankaccnt_nm")
    public String getB_bankaccnt_nm(){
        return b_bankaccnt_nm;
    }

    @ElVoField(physicalName = "b_bankaccnt_nm")
    public void setB_bankaccnt_nm(String b_bankaccnt_nm){
        this.b_bankaccnt_nm = b_bankaccnt_nm;
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

    @ElVoField(physicalName = "salry_bank_nm")
    public String getSalry_bank_nm(){
        return salry_bank_nm;
    }

    @ElVoField(physicalName = "salry_bank_nm")
    public void setSalry_bank_nm(String salry_bank_nm){
        this.salry_bank_nm = salry_bank_nm;
    }

    @ElVoField(physicalName = "nm_eng")
    public String getNm_eng(){
        return nm_eng;
    }

    @ElVoField(physicalName = "nm_eng")
    public void setNm_eng(String nm_eng){
        this.nm_eng = nm_eng;
    }

    @ElVoField(physicalName = "home_tel")
    public String getHome_tel(){
        return home_tel;
    }

    @ElVoField(physicalName = "home_tel")
    public void setHome_tel(String home_tel){
        this.home_tel = home_tel;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
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

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public String getSci_tech_anuty(){
        return sci_tech_anuty;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public void setSci_tech_anuty(String sci_tech_anuty){
        this.sci_tech_anuty = sci_tech_anuty;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public String getSavng_shape_dedct(){
        return savng_shape_dedct;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public void setSavng_shape_dedct(String savng_shape_dedct){
        this.savng_shape_dedct = savng_shape_dedct;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public String getJob_clsf_nm(){
        return job_clsf_nm;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public void setJob_clsf_nm(String job_clsf_nm){
        this.job_clsf_nm = job_clsf_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "bankaccnt_no_1")
    public String getBankaccnt_no_1(){
        return bankaccnt_no_1;
    }

    @ElVoField(physicalName = "bankaccnt_no_1")
    public void setBankaccnt_no_1(String bankaccnt_no_1){
        this.bankaccnt_no_1 = bankaccnt_no_1;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaApartAccntReqVo [");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("salry_bank").append("=").append(salry_bank).append(",");
        sb.append("bankaccnt_attach_file_no").append("=").append(bankaccnt_attach_file_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("depstr").append("=").append(depstr).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("ret_yn").append("=").append(ret_yn).append(",");
        sb.append("a_bankaccnt_no").append("=").append(a_bankaccnt_no).append(",");
        sb.append("b_bankaccnt_no").append("=").append(b_bankaccnt_no).append(",");
        sb.append("a_bankaccnt_nm").append("=").append(a_bankaccnt_nm).append(",");
        sb.append("b_bankaccnt_nm").append("=").append(b_bankaccnt_nm).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("salry_bank_nm").append("=").append(salry_bank_nm).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("addr_postmt_no").append("=").append(addr_postmt_no).append(",");
        sb.append("addr_base").append("=").append(addr_base).append(",");
        sb.append("addr_detls").append("=").append(addr_detls).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("sci_tech_anuty").append("=").append(sci_tech_anuty).append(",");
        sb.append("savng_shape_dedct").append("=").append(savng_shape_dedct).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("job_clsf_nm").append("=").append(job_clsf_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("bankaccnt_no_1").append("=").append(bankaccnt_no_1).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("rmk").append("=").append(rmk);
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
