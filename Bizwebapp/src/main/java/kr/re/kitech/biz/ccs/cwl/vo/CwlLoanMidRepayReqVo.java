package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "상조회 대출중도상환신청")
public class CwlLoanMidRepayReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwlLoanMidRepayReqVo(){
    }

    @ElDtoField(logicalName = "조회시작일자", physicalName = "req_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_start_ymd;

    @ElDtoField(logicalName = "조회종료일자", physicalName = "req_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_end_ymd;

    @ElDtoField(logicalName = "신청자개인번호", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자사원번호", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "신청자전화번호", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "신청자이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "신청자부서코드", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "신청자부서명", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "센터명", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "신청자부서신설일자", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElDtoField(logicalName = "중도상환신청일자", physicalName = "req_midway_repay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_midway_repay_ymd;

    @ElDtoField(logicalName = "중도상환일자", physicalName = "midway_repay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_ymd;

    @ElDtoField(logicalName = "중도상환금액", physicalName = "midway_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_amt;

    @ElDtoField(logicalName = "중도상환이자", physicalName = "midway_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_intrst;

    @ElDtoField(logicalName = "공제구분", physicalName = "dedct_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_clsf;

    @ElDtoField(logicalName = "공제구분명", physicalName = "dedct_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_clsf_nm;

    @ElDtoField(logicalName = "대출이자", physicalName = "loan_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_rts;

    @ElDtoField(logicalName = "중도상환후잔액", physicalName = "midway_repay_aft_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_aft_amt;

    @ElDtoField(logicalName = "업무상태코드", physicalName = "biz_proc_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_proc_cd;

    @ElDtoField(logicalName = "업무상태명", physicalName = "biz_proc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_proc_nm;

    @ElDtoField(logicalName = "대출코드", physicalName = "loan_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_cd;

    @ElDtoField(logicalName = "대출명", physicalName = "loan_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_nm;

    @ElDtoField(logicalName = "대출일자", physicalName = "loan_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_ymd;

    @ElDtoField(logicalName = "대출자시스템개인번호", physicalName = "loan_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_syspayno;

    @ElDtoField(logicalName = "대출자명", physicalName = "loan_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_nm;

    @ElDtoField(logicalName = "대출금액", physicalName = "loan_tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_tot_amt;

    @ElDtoField(logicalName = "대출잔액", physicalName = "loan_ramt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_ramt;

    @ElDtoField(logicalName = "대출상환금액", physicalName = "loan_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_repay_amt;

    @ElDtoField(logicalName = "총상환금액", physicalName = "tot_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_repay_amt;

    @ElDtoField(logicalName = "총상환이자금액", physicalName = "tot_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_repay_intrst;

    @ElDtoField(logicalName = "총중도상환금액", physicalName = "tot_midway_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_midway_repay_amt;

    @ElDtoField(logicalName = "총중동상환이자금액", physicalName = "tot_midway_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_midway_repay_intrst;

    @ElDtoField(logicalName = "대출상환총액", physicalName = "sum_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_repay_amt;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "확정일자", physicalName = "cofm_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cofm_ymd;

    @ElDtoField(logicalName = "확정자개인시스템번호", physicalName = "cofm_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cofm_syspayno;

    @ElDtoField(logicalName = "확정자명", physicalName = "cofm_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cofm_psn_nm;

    @ElDtoField(logicalName = "중도상환일자", physicalName = "pre_midway_repay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_midway_repay_ymd;

    @ElDtoField(logicalName = "중도상환회수", physicalName = "midway_repay_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_times;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "결재상태코드", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "상환 후 잔액", physicalName = "afRepayLoanAmt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String afRepayLoanAmt;

    @ElDtoField(logicalName = "상환일 이전의 이자", physicalName = "bfRepayIntrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bfRepayIntrst;

    @ElDtoField(logicalName = "상환일 이후의 월 예상이자", physicalName = "afRepayIntrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String afRepayIntrst;

    @ElDtoField(logicalName = "", physicalName = "dDay_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int dDay_cnt;

    @ElDtoField(logicalName = "", physicalName = "sDay_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int sDay_cnt;

    @ElDtoField(logicalName = "반려의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;

    @ElVoField(physicalName = "req_start_ymd")
    public String getReq_start_ymd(){
        return req_start_ymd;
    }

    @ElVoField(physicalName = "req_start_ymd")
    public void setReq_start_ymd(String req_start_ymd){
        this.req_start_ymd = req_start_ymd;
    }

    @ElVoField(physicalName = "req_end_ymd")
    public String getReq_end_ymd(){
        return req_end_ymd;
    }

    @ElVoField(physicalName = "req_end_ymd")
    public void setReq_end_ymd(String req_end_ymd){
        this.req_end_ymd = req_end_ymd;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
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

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public String getCentr_nm(){
        return centr_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public void setCentr_nm(String centr_nm){
        this.centr_nm = centr_nm;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public String getReq_dept_new_ymd(){
        return req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public void setReq_dept_new_ymd(String req_dept_new_ymd){
        this.req_dept_new_ymd = req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_midway_repay_ymd")
    public String getReq_midway_repay_ymd(){
        return req_midway_repay_ymd;
    }

    @ElVoField(physicalName = "req_midway_repay_ymd")
    public void setReq_midway_repay_ymd(String req_midway_repay_ymd){
        this.req_midway_repay_ymd = req_midway_repay_ymd;
    }

    @ElVoField(physicalName = "midway_repay_ymd")
    public String getMidway_repay_ymd(){
        return midway_repay_ymd;
    }

    @ElVoField(physicalName = "midway_repay_ymd")
    public void setMidway_repay_ymd(String midway_repay_ymd){
        this.midway_repay_ymd = midway_repay_ymd;
    }

    @ElVoField(physicalName = "midway_repay_amt")
    public String getMidway_repay_amt(){
        return midway_repay_amt;
    }

    @ElVoField(physicalName = "midway_repay_amt")
    public void setMidway_repay_amt(String midway_repay_amt){
        this.midway_repay_amt = midway_repay_amt;
    }

    @ElVoField(physicalName = "midway_repay_intrst")
    public String getMidway_repay_intrst(){
        return midway_repay_intrst;
    }

    @ElVoField(physicalName = "midway_repay_intrst")
    public void setMidway_repay_intrst(String midway_repay_intrst){
        this.midway_repay_intrst = midway_repay_intrst;
    }

    @ElVoField(physicalName = "dedct_clsf")
    public String getDedct_clsf(){
        return dedct_clsf;
    }

    @ElVoField(physicalName = "dedct_clsf")
    public void setDedct_clsf(String dedct_clsf){
        this.dedct_clsf = dedct_clsf;
    }

    @ElVoField(physicalName = "dedct_clsf_nm")
    public String getDedct_clsf_nm(){
        return dedct_clsf_nm;
    }

    @ElVoField(physicalName = "dedct_clsf_nm")
    public void setDedct_clsf_nm(String dedct_clsf_nm){
        this.dedct_clsf_nm = dedct_clsf_nm;
    }

    @ElVoField(physicalName = "loan_rts")
    public String getLoan_rts(){
        return loan_rts;
    }

    @ElVoField(physicalName = "loan_rts")
    public void setLoan_rts(String loan_rts){
        this.loan_rts = loan_rts;
    }

    @ElVoField(physicalName = "midway_repay_aft_amt")
    public String getMidway_repay_aft_amt(){
        return midway_repay_aft_amt;
    }

    @ElVoField(physicalName = "midway_repay_aft_amt")
    public void setMidway_repay_aft_amt(String midway_repay_aft_amt){
        this.midway_repay_aft_amt = midway_repay_aft_amt;
    }

    @ElVoField(physicalName = "biz_proc_cd")
    public String getBiz_proc_cd(){
        return biz_proc_cd;
    }

    @ElVoField(physicalName = "biz_proc_cd")
    public void setBiz_proc_cd(String biz_proc_cd){
        this.biz_proc_cd = biz_proc_cd;
    }

    @ElVoField(physicalName = "biz_proc_nm")
    public String getBiz_proc_nm(){
        return biz_proc_nm;
    }

    @ElVoField(physicalName = "biz_proc_nm")
    public void setBiz_proc_nm(String biz_proc_nm){
        this.biz_proc_nm = biz_proc_nm;
    }

    @ElVoField(physicalName = "loan_cd")
    public String getLoan_cd(){
        return loan_cd;
    }

    @ElVoField(physicalName = "loan_cd")
    public void setLoan_cd(String loan_cd){
        this.loan_cd = loan_cd;
    }

    @ElVoField(physicalName = "loan_nm")
    public String getLoan_nm(){
        return loan_nm;
    }

    @ElVoField(physicalName = "loan_nm")
    public void setLoan_nm(String loan_nm){
        this.loan_nm = loan_nm;
    }

    @ElVoField(physicalName = "loan_ymd")
    public String getLoan_ymd(){
        return loan_ymd;
    }

    @ElVoField(physicalName = "loan_ymd")
    public void setLoan_ymd(String loan_ymd){
        this.loan_ymd = loan_ymd;
    }

    @ElVoField(physicalName = "loan_syspayno")
    public String getLoan_syspayno(){
        return loan_syspayno;
    }

    @ElVoField(physicalName = "loan_syspayno")
    public void setLoan_syspayno(String loan_syspayno){
        this.loan_syspayno = loan_syspayno;
    }

    @ElVoField(physicalName = "loan_psn_nm")
    public String getLoan_psn_nm(){
        return loan_psn_nm;
    }

    @ElVoField(physicalName = "loan_psn_nm")
    public void setLoan_psn_nm(String loan_psn_nm){
        this.loan_psn_nm = loan_psn_nm;
    }

    @ElVoField(physicalName = "loan_tot_amt")
    public String getLoan_tot_amt(){
        return loan_tot_amt;
    }

    @ElVoField(physicalName = "loan_tot_amt")
    public void setLoan_tot_amt(String loan_tot_amt){
        this.loan_tot_amt = loan_tot_amt;
    }

    @ElVoField(physicalName = "loan_ramt")
    public String getLoan_ramt(){
        return loan_ramt;
    }

    @ElVoField(physicalName = "loan_ramt")
    public void setLoan_ramt(String loan_ramt){
        this.loan_ramt = loan_ramt;
    }

    @ElVoField(physicalName = "loan_repay_amt")
    public String getLoan_repay_amt(){
        return loan_repay_amt;
    }

    @ElVoField(physicalName = "loan_repay_amt")
    public void setLoan_repay_amt(String loan_repay_amt){
        this.loan_repay_amt = loan_repay_amt;
    }

    @ElVoField(physicalName = "tot_repay_amt")
    public String getTot_repay_amt(){
        return tot_repay_amt;
    }

    @ElVoField(physicalName = "tot_repay_amt")
    public void setTot_repay_amt(String tot_repay_amt){
        this.tot_repay_amt = tot_repay_amt;
    }

    @ElVoField(physicalName = "tot_repay_intrst")
    public String getTot_repay_intrst(){
        return tot_repay_intrst;
    }

    @ElVoField(physicalName = "tot_repay_intrst")
    public void setTot_repay_intrst(String tot_repay_intrst){
        this.tot_repay_intrst = tot_repay_intrst;
    }

    @ElVoField(physicalName = "tot_midway_repay_amt")
    public String getTot_midway_repay_amt(){
        return tot_midway_repay_amt;
    }

    @ElVoField(physicalName = "tot_midway_repay_amt")
    public void setTot_midway_repay_amt(String tot_midway_repay_amt){
        this.tot_midway_repay_amt = tot_midway_repay_amt;
    }

    @ElVoField(physicalName = "tot_midway_repay_intrst")
    public String getTot_midway_repay_intrst(){
        return tot_midway_repay_intrst;
    }

    @ElVoField(physicalName = "tot_midway_repay_intrst")
    public void setTot_midway_repay_intrst(String tot_midway_repay_intrst){
        this.tot_midway_repay_intrst = tot_midway_repay_intrst;
    }

    @ElVoField(physicalName = "sum_repay_amt")
    public String getSum_repay_amt(){
        return sum_repay_amt;
    }

    @ElVoField(physicalName = "sum_repay_amt")
    public void setSum_repay_amt(String sum_repay_amt){
        this.sum_repay_amt = sum_repay_amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cofm_ymd")
    public String getCofm_ymd(){
        return cofm_ymd;
    }

    @ElVoField(physicalName = "cofm_ymd")
    public void setCofm_ymd(String cofm_ymd){
        this.cofm_ymd = cofm_ymd;
    }

    @ElVoField(physicalName = "cofm_syspayno")
    public String getCofm_syspayno(){
        return cofm_syspayno;
    }

    @ElVoField(physicalName = "cofm_syspayno")
    public void setCofm_syspayno(String cofm_syspayno){
        this.cofm_syspayno = cofm_syspayno;
    }

    @ElVoField(physicalName = "cofm_psn_nm")
    public String getCofm_psn_nm(){
        return cofm_psn_nm;
    }

    @ElVoField(physicalName = "cofm_psn_nm")
    public void setCofm_psn_nm(String cofm_psn_nm){
        this.cofm_psn_nm = cofm_psn_nm;
    }

    @ElVoField(physicalName = "pre_midway_repay_ymd")
    public String getPre_midway_repay_ymd(){
        return pre_midway_repay_ymd;
    }

    @ElVoField(physicalName = "pre_midway_repay_ymd")
    public void setPre_midway_repay_ymd(String pre_midway_repay_ymd){
        this.pre_midway_repay_ymd = pre_midway_repay_ymd;
    }

    @ElVoField(physicalName = "midway_repay_times")
    public String getMidway_repay_times(){
        return midway_repay_times;
    }

    @ElVoField(physicalName = "midway_repay_times")
    public void setMidway_repay_times(String midway_repay_times){
        this.midway_repay_times = midway_repay_times;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "afRepayLoanAmt")
    public String getAfRepayLoanAmt(){
        return afRepayLoanAmt;
    }

    @ElVoField(physicalName = "afRepayLoanAmt")
    public void setAfRepayLoanAmt(String afRepayLoanAmt){
        this.afRepayLoanAmt = afRepayLoanAmt;
    }

    @ElVoField(physicalName = "bfRepayIntrst")
    public String getBfRepayIntrst(){
        return bfRepayIntrst;
    }

    @ElVoField(physicalName = "bfRepayIntrst")
    public void setBfRepayIntrst(String bfRepayIntrst){
        this.bfRepayIntrst = bfRepayIntrst;
    }

    @ElVoField(physicalName = "afRepayIntrst")
    public String getAfRepayIntrst(){
        return afRepayIntrst;
    }

    @ElVoField(physicalName = "afRepayIntrst")
    public void setAfRepayIntrst(String afRepayIntrst){
        this.afRepayIntrst = afRepayIntrst;
    }

    @ElVoField(physicalName = "dDay_cnt")
    public int getDDay_cnt(){
        return dDay_cnt;
    }

    @ElVoField(physicalName = "dDay_cnt")
    public void setDDay_cnt(int dDay_cnt){
        this.dDay_cnt = dDay_cnt;
    }

    @ElVoField(physicalName = "sDay_cnt")
    public int getSDay_cnt(){
        return sDay_cnt;
    }

    @ElVoField(physicalName = "sDay_cnt")
    public void setSDay_cnt(int sDay_cnt){
        this.sDay_cnt = sDay_cnt;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwlLoanMidRepayReqVo [");
        sb.append("req_start_ymd").append("=").append(req_start_ymd).append(",");
        sb.append("req_end_ymd").append("=").append(req_end_ymd).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd).append(",");
        sb.append("req_midway_repay_ymd").append("=").append(req_midway_repay_ymd).append(",");
        sb.append("midway_repay_ymd").append("=").append(midway_repay_ymd).append(",");
        sb.append("midway_repay_amt").append("=").append(midway_repay_amt).append(",");
        sb.append("midway_repay_intrst").append("=").append(midway_repay_intrst).append(",");
        sb.append("dedct_clsf").append("=").append(dedct_clsf).append(",");
        sb.append("dedct_clsf_nm").append("=").append(dedct_clsf_nm).append(",");
        sb.append("loan_rts").append("=").append(loan_rts).append(",");
        sb.append("midway_repay_aft_amt").append("=").append(midway_repay_aft_amt).append(",");
        sb.append("biz_proc_cd").append("=").append(biz_proc_cd).append(",");
        sb.append("biz_proc_nm").append("=").append(biz_proc_nm).append(",");
        sb.append("loan_cd").append("=").append(loan_cd).append(",");
        sb.append("loan_nm").append("=").append(loan_nm).append(",");
        sb.append("loan_ymd").append("=").append(loan_ymd).append(",");
        sb.append("loan_syspayno").append("=").append(loan_syspayno).append(",");
        sb.append("loan_psn_nm").append("=").append(loan_psn_nm).append(",");
        sb.append("loan_tot_amt").append("=").append(loan_tot_amt).append(",");
        sb.append("loan_ramt").append("=").append(loan_ramt).append(",");
        sb.append("loan_repay_amt").append("=").append(loan_repay_amt).append(",");
        sb.append("tot_repay_amt").append("=").append(tot_repay_amt).append(",");
        sb.append("tot_repay_intrst").append("=").append(tot_repay_intrst).append(",");
        sb.append("tot_midway_repay_amt").append("=").append(tot_midway_repay_amt).append(",");
        sb.append("tot_midway_repay_intrst").append("=").append(tot_midway_repay_intrst).append(",");
        sb.append("sum_repay_amt").append("=").append(sum_repay_amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cofm_ymd").append("=").append(cofm_ymd).append(",");
        sb.append("cofm_syspayno").append("=").append(cofm_syspayno).append(",");
        sb.append("cofm_psn_nm").append("=").append(cofm_psn_nm).append(",");
        sb.append("pre_midway_repay_ymd").append("=").append(pre_midway_repay_ymd).append(",");
        sb.append("midway_repay_times").append("=").append(midway_repay_times).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("afRepayLoanAmt").append("=").append(afRepayLoanAmt).append(",");
        sb.append("bfRepayIntrst").append("=").append(bfRepayIntrst).append(",");
        sb.append("afRepayIntrst").append("=").append(afRepayIntrst).append(",");
        sb.append("dDay_cnt").append("=").append(dDay_cnt).append(",");
        sb.append("sDay_cnt").append("=").append(sDay_cnt).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("odr").append("=").append(odr);
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
