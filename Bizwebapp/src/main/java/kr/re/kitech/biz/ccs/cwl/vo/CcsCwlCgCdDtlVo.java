package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경조사비 상세조회")
public class CcsCwlCgCdDtlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CcsCwlCgCdDtlVo(){
    }

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "req_psn_dept_cd", physicalName = "req_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_cd;

    @ElDtoField(logicalName = "req_psn_dept_new_ymd", physicalName = "req_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_new_ymd;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "dept_tel", physicalName = "dept_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_tel;

    @ElDtoField(logicalName = "fam_relat", physicalName = "fam_relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fam_relat;

    @ElDtoField(logicalName = "cgncd_clsf_nm", physicalName = "cgncd_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_clsf_nm;

    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "emp_no", physicalName = "emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_no;

    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "expns_amt", physicalName = "expns_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_amt;

    @ElDtoField(logicalName = "cgncd_detls", physicalName = "cgncd_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_detls;

    @ElDtoField(logicalName = "progrss_state", physicalName = "progrss_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progrss_state;

    @ElDtoField(logicalName = "pay_amt", physicalName = "pay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_amt;

    @ElDtoField(logicalName = "pay_ymd", physicalName = "pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_ymd;

    @ElDtoField(logicalName = "depst_bankaccnt_no", physicalName = "depst_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bankaccnt_no;

    @ElDtoField(logicalName = "depst_bank_cd", physicalName = "depst_bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bank_cd;

    @ElDtoField(logicalName = "depst_bank_nm", physicalName = "depst_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bank_nm;

    @ElDtoField(logicalName = "depstr_nm", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "reject_resn", physicalName = "reject_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reject_resn;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "cgncd_clsf", physicalName = "cgncd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_clsf;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public String getReq_psn_dept_cd(){
        return req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public void setReq_psn_dept_cd(String req_psn_dept_cd){
        this.req_psn_dept_cd = req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public String getReq_psn_dept_new_ymd(){
        return req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public void setReq_psn_dept_new_ymd(String req_psn_dept_new_ymd){
        this.req_psn_dept_new_ymd = req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dept_tel")
    public String getDept_tel(){
        return dept_tel;
    }

    @ElVoField(physicalName = "dept_tel")
    public void setDept_tel(String dept_tel){
        this.dept_tel = dept_tel;
    }

    @ElVoField(physicalName = "fam_relat")
    public String getFam_relat(){
        return fam_relat;
    }

    @ElVoField(physicalName = "fam_relat")
    public void setFam_relat(String fam_relat){
        this.fam_relat = fam_relat;
    }

    @ElVoField(physicalName = "cgncd_clsf_nm")
    public String getCgncd_clsf_nm(){
        return cgncd_clsf_nm;
    }

    @ElVoField(physicalName = "cgncd_clsf_nm")
    public void setCgncd_clsf_nm(String cgncd_clsf_nm){
        this.cgncd_clsf_nm = cgncd_clsf_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "emp_no")
    public String getEmp_no(){
        return emp_no;
    }

    @ElVoField(physicalName = "emp_no")
    public void setEmp_no(String emp_no){
        this.emp_no = emp_no;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "expns_amt")
    public String getExpns_amt(){
        return expns_amt;
    }

    @ElVoField(physicalName = "expns_amt")
    public void setExpns_amt(String expns_amt){
        this.expns_amt = expns_amt;
    }

    @ElVoField(physicalName = "cgncd_detls")
    public String getCgncd_detls(){
        return cgncd_detls;
    }

    @ElVoField(physicalName = "cgncd_detls")
    public void setCgncd_detls(String cgncd_detls){
        this.cgncd_detls = cgncd_detls;
    }

    @ElVoField(physicalName = "progrss_state")
    public String getProgrss_state(){
        return progrss_state;
    }

    @ElVoField(physicalName = "progrss_state")
    public void setProgrss_state(String progrss_state){
        this.progrss_state = progrss_state;
    }

    @ElVoField(physicalName = "pay_amt")
    public String getPay_amt(){
        return pay_amt;
    }

    @ElVoField(physicalName = "pay_amt")
    public void setPay_amt(String pay_amt){
        this.pay_amt = pay_amt;
    }

    @ElVoField(physicalName = "pay_ymd")
    public String getPay_ymd(){
        return pay_ymd;
    }

    @ElVoField(physicalName = "pay_ymd")
    public void setPay_ymd(String pay_ymd){
        this.pay_ymd = pay_ymd;
    }

    @ElVoField(physicalName = "depst_bankaccnt_no")
    public String getDepst_bankaccnt_no(){
        return depst_bankaccnt_no;
    }

    @ElVoField(physicalName = "depst_bankaccnt_no")
    public void setDepst_bankaccnt_no(String depst_bankaccnt_no){
        this.depst_bankaccnt_no = depst_bankaccnt_no;
    }

    @ElVoField(physicalName = "depst_bank_cd")
    public String getDepst_bank_cd(){
        return depst_bank_cd;
    }

    @ElVoField(physicalName = "depst_bank_cd")
    public void setDepst_bank_cd(String depst_bank_cd){
        this.depst_bank_cd = depst_bank_cd;
    }

    @ElVoField(physicalName = "depst_bank_nm")
    public String getDepst_bank_nm(){
        return depst_bank_nm;
    }

    @ElVoField(physicalName = "depst_bank_nm")
    public void setDepst_bank_nm(String depst_bank_nm){
        this.depst_bank_nm = depst_bank_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "reject_resn")
    public String getReject_resn(){
        return reject_resn;
    }

    @ElVoField(physicalName = "reject_resn")
    public void setReject_resn(String reject_resn){
        this.reject_resn = reject_resn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public String getCgncd_clsf(){
        return cgncd_clsf;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public void setCgncd_clsf(String cgncd_clsf){
        this.cgncd_clsf = cgncd_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcsCwlCgCdDtlVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn_dept_cd").append("=").append(req_psn_dept_cd).append(",");
        sb.append("req_psn_dept_new_ymd").append("=").append(req_psn_dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_tel").append("=").append(dept_tel).append(",");
        sb.append("fam_relat").append("=").append(fam_relat).append(",");
        sb.append("cgncd_clsf_nm").append("=").append(cgncd_clsf_nm).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("emp_no").append("=").append(emp_no).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("expns_amt").append("=").append(expns_amt).append(",");
        sb.append("cgncd_detls").append("=").append(cgncd_detls).append(",");
        sb.append("progrss_state").append("=").append(progrss_state).append(",");
        sb.append("pay_amt").append("=").append(pay_amt).append(",");
        sb.append("pay_ymd").append("=").append(pay_ymd).append(",");
        sb.append("depst_bankaccnt_no").append("=").append(depst_bankaccnt_no).append(",");
        sb.append("depst_bank_cd").append("=").append(depst_bank_cd).append(",");
        sb.append("depst_bank_nm").append("=").append(depst_bank_nm).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("reject_resn").append("=").append(reject_resn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("cgncd_clsf").append("=").append(cgncd_clsf);
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
