package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "상조회대출신청")
public class CwlFwLoanReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwlFwLoanReqVo(){
    }

    @ElDtoField(logicalName = "조회시작일자", physicalName = "req_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd1;

    @ElDtoField(logicalName = "조회종료일자", physicalName = "req_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd2;

    @ElDtoField(logicalName = "조회신청번호", physicalName = "inputReq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inputReq_no;

    @ElDtoField(logicalName = "조회사원번호", physicalName = "inputEmp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inputEmp_no;

    @ElDtoField(logicalName = "결재상태코드", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서신설일자", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "센터명", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "센터코드", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "부서전화번호", physicalName = "dept_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_tel;

    @ElDtoField(logicalName = "대출금액", physicalName = "loan_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int loan_amt;

    @ElDtoField(logicalName = "신청사유", physicalName = "req_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_cause;

    @ElDtoField(logicalName = "월공제금액", physicalName = "month_dedct_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int month_dedct_amt;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "신청상태명", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "지급금액", physicalName = "pay_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int pay_amt;

    @ElDtoField(logicalName = "지급일자", physicalName = "pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_ymd;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "입금계좌번호", physicalName = "depst_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bankaccnt_no;

    @ElDtoField(logicalName = "입금은행코드", physicalName = "depst_bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bank_cd;

    @ElDtoField(logicalName = "입금은행명", physicalName = "depst_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bank_nm;

    @ElDtoField(logicalName = "예금주명", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "상환월", physicalName = "repay_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repay_month;

    @ElDtoField(logicalName = "확정상환월", physicalName = "fix_repay_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fix_repay_month;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "과학기술연금여부", physicalName = "sci_tech_anuty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_anuty;

    @ElDtoField(logicalName = "입사일", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "지급은행코드", physicalName = "pay_bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_bank_cd;

    @ElDtoField(logicalName = "지급은행명", physicalName = "pay_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_bank_nm;

    @ElDtoField(logicalName = "지급계좌번호", physicalName = "pay_bankaccnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_bankaccnt;

    @ElDtoField(logicalName = "지급예금주", physicalName = "pay_depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_depstr;

    @ElDtoField(logicalName = "별도계좌번호", physicalName = "oth_bankaccnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_bankaccnt;

    @ElDtoField(logicalName = "별도은행코드", physicalName = "oth_bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_bank_cd;

    @ElDtoField(logicalName = "별도은행명", physicalName = "oth_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_bank_nm;

    @ElDtoField(logicalName = "별도예금주", physicalName = "oth_depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_depstr;

    @ElDtoField(logicalName = "총대출잔액", physicalName = "loan_ramt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int loan_ramt;

    @ElDtoField(logicalName = "상조회대출잔액", physicalName = "aid_loan_ramt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int aid_loan_ramt;

    @ElDtoField(logicalName = "대학융자금잔액", physicalName = "univ_loan_ramt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int univ_loan_ramt;

    @ElDtoField(logicalName = "퇴직금", physicalName = "retire_appro", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int retire_appro;

    @ElDtoField(logicalName = "전별금", physicalName = "avail_sum", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int avail_sum;

    @ElDtoField(logicalName = "저장구분", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "결재처리요청구분", physicalName = "req_action", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_action;

    @ElDtoField(logicalName = "반려의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElVoField(physicalName = "req_ymd1")
    public String getReq_ymd1(){
        return req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd1")
    public void setReq_ymd1(String req_ymd1){
        this.req_ymd1 = req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd2")
    public String getReq_ymd2(){
        return req_ymd2;
    }

    @ElVoField(physicalName = "req_ymd2")
    public void setReq_ymd2(String req_ymd2){
        this.req_ymd2 = req_ymd2;
    }

    @ElVoField(physicalName = "inputReq_no")
    public String getInputReq_no(){
        return inputReq_no;
    }

    @ElVoField(physicalName = "inputReq_no")
    public void setInputReq_no(String inputReq_no){
        this.inputReq_no = inputReq_no;
    }

    @ElVoField(physicalName = "inputEmp_no")
    public String getInputEmp_no(){
        return inputEmp_no;
    }

    @ElVoField(physicalName = "inputEmp_no")
    public void setInputEmp_no(String inputEmp_no){
        this.inputEmp_no = inputEmp_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public String getCentr_nm(){
        return centr_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public void setCentr_nm(String centr_nm){
        this.centr_nm = centr_nm;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "dept_tel")
    public String getDept_tel(){
        return dept_tel;
    }

    @ElVoField(physicalName = "dept_tel")
    public void setDept_tel(String dept_tel){
        this.dept_tel = dept_tel;
    }

    @ElVoField(physicalName = "loan_amt")
    public int getLoan_amt(){
        return loan_amt;
    }

    @ElVoField(physicalName = "loan_amt")
    public void setLoan_amt(int loan_amt){
        this.loan_amt = loan_amt;
    }

    @ElVoField(physicalName = "req_cause")
    public String getReq_cause(){
        return req_cause;
    }

    @ElVoField(physicalName = "req_cause")
    public void setReq_cause(String req_cause){
        this.req_cause = req_cause;
    }

    @ElVoField(physicalName = "month_dedct_amt")
    public int getMonth_dedct_amt(){
        return month_dedct_amt;
    }

    @ElVoField(physicalName = "month_dedct_amt")
    public void setMonth_dedct_amt(int month_dedct_amt){
        this.month_dedct_amt = month_dedct_amt;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "pay_amt")
    public int getPay_amt(){
        return pay_amt;
    }

    @ElVoField(physicalName = "pay_amt")
    public void setPay_amt(int pay_amt){
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

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
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

    @ElVoField(physicalName = "repay_month")
    public String getRepay_month(){
        return repay_month;
    }

    @ElVoField(physicalName = "repay_month")
    public void setRepay_month(String repay_month){
        this.repay_month = repay_month;
    }

    @ElVoField(physicalName = "fix_repay_month")
    public String getFix_repay_month(){
        return fix_repay_month;
    }

    @ElVoField(physicalName = "fix_repay_month")
    public void setFix_repay_month(String fix_repay_month){
        this.fix_repay_month = fix_repay_month;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public String getSci_tech_anuty(){
        return sci_tech_anuty;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public void setSci_tech_anuty(String sci_tech_anuty){
        this.sci_tech_anuty = sci_tech_anuty;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "pay_bank_cd")
    public String getPay_bank_cd(){
        return pay_bank_cd;
    }

    @ElVoField(physicalName = "pay_bank_cd")
    public void setPay_bank_cd(String pay_bank_cd){
        this.pay_bank_cd = pay_bank_cd;
    }

    @ElVoField(physicalName = "pay_bank_nm")
    public String getPay_bank_nm(){
        return pay_bank_nm;
    }

    @ElVoField(physicalName = "pay_bank_nm")
    public void setPay_bank_nm(String pay_bank_nm){
        this.pay_bank_nm = pay_bank_nm;
    }

    @ElVoField(physicalName = "pay_bankaccnt")
    public String getPay_bankaccnt(){
        return pay_bankaccnt;
    }

    @ElVoField(physicalName = "pay_bankaccnt")
    public void setPay_bankaccnt(String pay_bankaccnt){
        this.pay_bankaccnt = pay_bankaccnt;
    }

    @ElVoField(physicalName = "pay_depstr")
    public String getPay_depstr(){
        return pay_depstr;
    }

    @ElVoField(physicalName = "pay_depstr")
    public void setPay_depstr(String pay_depstr){
        this.pay_depstr = pay_depstr;
    }

    @ElVoField(physicalName = "oth_bankaccnt")
    public String getOth_bankaccnt(){
        return oth_bankaccnt;
    }

    @ElVoField(physicalName = "oth_bankaccnt")
    public void setOth_bankaccnt(String oth_bankaccnt){
        this.oth_bankaccnt = oth_bankaccnt;
    }

    @ElVoField(physicalName = "oth_bank_cd")
    public String getOth_bank_cd(){
        return oth_bank_cd;
    }

    @ElVoField(physicalName = "oth_bank_cd")
    public void setOth_bank_cd(String oth_bank_cd){
        this.oth_bank_cd = oth_bank_cd;
    }

    @ElVoField(physicalName = "oth_bank_nm")
    public String getOth_bank_nm(){
        return oth_bank_nm;
    }

    @ElVoField(physicalName = "oth_bank_nm")
    public void setOth_bank_nm(String oth_bank_nm){
        this.oth_bank_nm = oth_bank_nm;
    }

    @ElVoField(physicalName = "oth_depstr")
    public String getOth_depstr(){
        return oth_depstr;
    }

    @ElVoField(physicalName = "oth_depstr")
    public void setOth_depstr(String oth_depstr){
        this.oth_depstr = oth_depstr;
    }

    @ElVoField(physicalName = "loan_ramt")
    public int getLoan_ramt(){
        return loan_ramt;
    }

    @ElVoField(physicalName = "loan_ramt")
    public void setLoan_ramt(int loan_ramt){
        this.loan_ramt = loan_ramt;
    }

    @ElVoField(physicalName = "aid_loan_ramt")
    public int getAid_loan_ramt(){
        return aid_loan_ramt;
    }

    @ElVoField(physicalName = "aid_loan_ramt")
    public void setAid_loan_ramt(int aid_loan_ramt){
        this.aid_loan_ramt = aid_loan_ramt;
    }

    @ElVoField(physicalName = "univ_loan_ramt")
    public int getUniv_loan_ramt(){
        return univ_loan_ramt;
    }

    @ElVoField(physicalName = "univ_loan_ramt")
    public void setUniv_loan_ramt(int univ_loan_ramt){
        this.univ_loan_ramt = univ_loan_ramt;
    }

    @ElVoField(physicalName = "retire_appro")
    public int getRetire_appro(){
        return retire_appro;
    }

    @ElVoField(physicalName = "retire_appro")
    public void setRetire_appro(int retire_appro){
        this.retire_appro = retire_appro;
    }

    @ElVoField(physicalName = "avail_sum")
    public int getAvail_sum(){
        return avail_sum;
    }

    @ElVoField(physicalName = "avail_sum")
    public void setAvail_sum(int avail_sum){
        this.avail_sum = avail_sum;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "req_action")
    public String getReq_action(){
        return req_action;
    }

    @ElVoField(physicalName = "req_action")
    public void setReq_action(String req_action){
        this.req_action = req_action;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwlFwLoanReqVo [");
        sb.append("req_ymd1").append("=").append(req_ymd1).append(",");
        sb.append("req_ymd2").append("=").append(req_ymd2).append(",");
        sb.append("inputReq_no").append("=").append(inputReq_no).append(",");
        sb.append("inputEmp_no").append("=").append(inputEmp_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("dept_tel").append("=").append(dept_tel).append(",");
        sb.append("loan_amt").append("=").append(loan_amt).append(",");
        sb.append("req_cause").append("=").append(req_cause).append(",");
        sb.append("month_dedct_amt").append("=").append(month_dedct_amt).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("pay_amt").append("=").append(pay_amt).append(",");
        sb.append("pay_ymd").append("=").append(pay_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("depst_bankaccnt_no").append("=").append(depst_bankaccnt_no).append(",");
        sb.append("depst_bank_cd").append("=").append(depst_bank_cd).append(",");
        sb.append("depst_bank_nm").append("=").append(depst_bank_nm).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("repay_month").append("=").append(repay_month).append(",");
        sb.append("fix_repay_month").append("=").append(fix_repay_month).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("sci_tech_anuty").append("=").append(sci_tech_anuty).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("pay_bank_cd").append("=").append(pay_bank_cd).append(",");
        sb.append("pay_bank_nm").append("=").append(pay_bank_nm).append(",");
        sb.append("pay_bankaccnt").append("=").append(pay_bankaccnt).append(",");
        sb.append("pay_depstr").append("=").append(pay_depstr).append(",");
        sb.append("oth_bankaccnt").append("=").append(oth_bankaccnt).append(",");
        sb.append("oth_bank_cd").append("=").append(oth_bank_cd).append(",");
        sb.append("oth_bank_nm").append("=").append(oth_bank_nm).append(",");
        sb.append("oth_depstr").append("=").append(oth_depstr).append(",");
        sb.append("loan_ramt").append("=").append(loan_ramt).append(",");
        sb.append("aid_loan_ramt").append("=").append(aid_loan_ramt).append(",");
        sb.append("univ_loan_ramt").append("=").append(univ_loan_ramt).append(",");
        sb.append("retire_appro").append("=").append(retire_appro).append(",");
        sb.append("avail_sum").append("=").append(avail_sum).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("req_action").append("=").append(req_action).append(",");
        sb.append("comments").append("=").append(comments);
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
