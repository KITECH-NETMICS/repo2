package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "상조회대출금마스터")
public class CwlLoanMasterVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwlLoanMasterVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "개인시스템번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "직종명", physicalName = "occutyp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "근무구분명", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "대출코드", physicalName = "loan_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_cd;

    @ElDtoField(logicalName = "대출명", physicalName = "loan_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_nm;

    @ElDtoField(logicalName = "대출일자", physicalName = "loan_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_ymd;

    @ElDtoField(logicalName = "대출총액", physicalName = "loan_tot_liq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_tot_liq;

    @ElDtoField(logicalName = "대출잔액", physicalName = "loan_ramt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_ramt;

    @ElDtoField(logicalName = "대출이율", physicalName = "loan_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_rts;

    @ElDtoField(logicalName = "총상환금액", physicalName = "tot_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_repay_amt;

    @ElDtoField(logicalName = "총상환이자", physicalName = "tot_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_repay_intrst;

    @ElDtoField(logicalName = "월상환금액", physicalName = "month_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_repay_amt;

    @ElDtoField(logicalName = "상환이자", physicalName = "midway_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_intrst;

    @ElDtoField(logicalName = "당월이자금액", physicalName = "thmon_intrst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thmon_intrst_amt;

    @ElDtoField(logicalName = "상환예정총횟수", physicalName = "repay_schdl_tot_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repay_schdl_tot_times;

    @ElDtoField(logicalName = "상환횟수", physicalName = "repay_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repay_times;

    @ElDtoField(logicalName = "공제시작일자", physicalName = "dedct_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_start_ymd;

    @ElDtoField(logicalName = "중도상환일자", physicalName = "midway_repay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_ymd;

    @ElDtoField(logicalName = "최종공제일자", physicalName = "final_dedct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_dedct_ymd;

    @ElDtoField(logicalName = "총중도상환금액", physicalName = "tot_midway_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_midway_repay_amt;

    @ElDtoField(logicalName = "총중도상환이자", physicalName = "tot_midway_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_midway_repay_intrst;

    @ElDtoField(logicalName = "중도상환회수", physicalName = "midway_repay_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_times;

    @ElDtoField(logicalName = "당월중도상환이자금액", physicalName = "thmon_midway_repay_intrst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thmon_midway_repay_intrst_amt;

    @ElDtoField(logicalName = "공제진행상태", physicalName = "dedct_progrss_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_progrss_state;

    @ElDtoField(logicalName = "공제진행상태명", physicalName = "dedct_progrss_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_progrss_nm;

    @ElDtoField(logicalName = "defIntrst", physicalName = "def_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String def_intrst;

    @ElDtoField(logicalName = "상환이자", physicalName = "repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repay_intrst;

    @ElDtoField(logicalName = "총이자금액", physicalName = "tot_intrst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_intrst_amt;

    @ElDtoField(logicalName = "확정일", physicalName = "confirm_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String confirm_day;

    @ElDtoField(logicalName = "reqDefer", physicalName = "req_defer", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_defer;

    @ElDtoField(logicalName = "reqRepay", physicalName = "req_repay", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_repay;

    @ElDtoField(logicalName = "reqRepayMonth", physicalName = "req_repay_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_repay_month;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "등록자개인시스템번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "", physicalName = "max_midway_repay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String max_midway_repay_ymd;

    @ElDtoField(logicalName = "", physicalName = "sum_midway_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_midway_repay_amt;

    @ElDtoField(logicalName = "", physicalName = "sum_midway_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_midway_repay_intrst;

    @ElDtoField(logicalName = "", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public String getOccutyp_nm(){
        return occutyp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public void setOccutyp_nm(String occutyp_nm){
        this.occutyp_nm = occutyp_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public String getWork_clsf_nm(){
        return work_clsf_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public void setWork_clsf_nm(String work_clsf_nm){
        this.work_clsf_nm = work_clsf_nm;
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

    @ElVoField(physicalName = "loan_tot_liq")
    public String getLoan_tot_liq(){
        return loan_tot_liq;
    }

    @ElVoField(physicalName = "loan_tot_liq")
    public void setLoan_tot_liq(String loan_tot_liq){
        this.loan_tot_liq = loan_tot_liq;
    }

    @ElVoField(physicalName = "loan_ramt")
    public String getLoan_ramt(){
        return loan_ramt;
    }

    @ElVoField(physicalName = "loan_ramt")
    public void setLoan_ramt(String loan_ramt){
        this.loan_ramt = loan_ramt;
    }

    @ElVoField(physicalName = "loan_rts")
    public String getLoan_rts(){
        return loan_rts;
    }

    @ElVoField(physicalName = "loan_rts")
    public void setLoan_rts(String loan_rts){
        this.loan_rts = loan_rts;
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

    @ElVoField(physicalName = "month_repay_amt")
    public String getMonth_repay_amt(){
        return month_repay_amt;
    }

    @ElVoField(physicalName = "month_repay_amt")
    public void setMonth_repay_amt(String month_repay_amt){
        this.month_repay_amt = month_repay_amt;
    }

    @ElVoField(physicalName = "midway_repay_intrst")
    public String getMidway_repay_intrst(){
        return midway_repay_intrst;
    }

    @ElVoField(physicalName = "midway_repay_intrst")
    public void setMidway_repay_intrst(String midway_repay_intrst){
        this.midway_repay_intrst = midway_repay_intrst;
    }

    @ElVoField(physicalName = "thmon_intrst_amt")
    public String getThmon_intrst_amt(){
        return thmon_intrst_amt;
    }

    @ElVoField(physicalName = "thmon_intrst_amt")
    public void setThmon_intrst_amt(String thmon_intrst_amt){
        this.thmon_intrst_amt = thmon_intrst_amt;
    }

    @ElVoField(physicalName = "repay_schdl_tot_times")
    public String getRepay_schdl_tot_times(){
        return repay_schdl_tot_times;
    }

    @ElVoField(physicalName = "repay_schdl_tot_times")
    public void setRepay_schdl_tot_times(String repay_schdl_tot_times){
        this.repay_schdl_tot_times = repay_schdl_tot_times;
    }

    @ElVoField(physicalName = "repay_times")
    public String getRepay_times(){
        return repay_times;
    }

    @ElVoField(physicalName = "repay_times")
    public void setRepay_times(String repay_times){
        this.repay_times = repay_times;
    }

    @ElVoField(physicalName = "dedct_start_ymd")
    public String getDedct_start_ymd(){
        return dedct_start_ymd;
    }

    @ElVoField(physicalName = "dedct_start_ymd")
    public void setDedct_start_ymd(String dedct_start_ymd){
        this.dedct_start_ymd = dedct_start_ymd;
    }

    @ElVoField(physicalName = "midway_repay_ymd")
    public String getMidway_repay_ymd(){
        return midway_repay_ymd;
    }

    @ElVoField(physicalName = "midway_repay_ymd")
    public void setMidway_repay_ymd(String midway_repay_ymd){
        this.midway_repay_ymd = midway_repay_ymd;
    }

    @ElVoField(physicalName = "final_dedct_ymd")
    public String getFinal_dedct_ymd(){
        return final_dedct_ymd;
    }

    @ElVoField(physicalName = "final_dedct_ymd")
    public void setFinal_dedct_ymd(String final_dedct_ymd){
        this.final_dedct_ymd = final_dedct_ymd;
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

    @ElVoField(physicalName = "midway_repay_times")
    public String getMidway_repay_times(){
        return midway_repay_times;
    }

    @ElVoField(physicalName = "midway_repay_times")
    public void setMidway_repay_times(String midway_repay_times){
        this.midway_repay_times = midway_repay_times;
    }

    @ElVoField(physicalName = "thmon_midway_repay_intrst_amt")
    public String getThmon_midway_repay_intrst_amt(){
        return thmon_midway_repay_intrst_amt;
    }

    @ElVoField(physicalName = "thmon_midway_repay_intrst_amt")
    public void setThmon_midway_repay_intrst_amt(String thmon_midway_repay_intrst_amt){
        this.thmon_midway_repay_intrst_amt = thmon_midway_repay_intrst_amt;
    }

    @ElVoField(physicalName = "dedct_progrss_state")
    public String getDedct_progrss_state(){
        return dedct_progrss_state;
    }

    @ElVoField(physicalName = "dedct_progrss_state")
    public void setDedct_progrss_state(String dedct_progrss_state){
        this.dedct_progrss_state = dedct_progrss_state;
    }

    @ElVoField(physicalName = "dedct_progrss_nm")
    public String getDedct_progrss_nm(){
        return dedct_progrss_nm;
    }

    @ElVoField(physicalName = "dedct_progrss_nm")
    public void setDedct_progrss_nm(String dedct_progrss_nm){
        this.dedct_progrss_nm = dedct_progrss_nm;
    }

    @ElVoField(physicalName = "def_intrst")
    public String getDef_intrst(){
        return def_intrst;
    }

    @ElVoField(physicalName = "def_intrst")
    public void setDef_intrst(String def_intrst){
        this.def_intrst = def_intrst;
    }

    @ElVoField(physicalName = "repay_intrst")
    public String getRepay_intrst(){
        return repay_intrst;
    }

    @ElVoField(physicalName = "repay_intrst")
    public void setRepay_intrst(String repay_intrst){
        this.repay_intrst = repay_intrst;
    }

    @ElVoField(physicalName = "tot_intrst_amt")
    public String getTot_intrst_amt(){
        return tot_intrst_amt;
    }

    @ElVoField(physicalName = "tot_intrst_amt")
    public void setTot_intrst_amt(String tot_intrst_amt){
        this.tot_intrst_amt = tot_intrst_amt;
    }

    @ElVoField(physicalName = "confirm_day")
    public String getConfirm_day(){
        return confirm_day;
    }

    @ElVoField(physicalName = "confirm_day")
    public void setConfirm_day(String confirm_day){
        this.confirm_day = confirm_day;
    }

    @ElVoField(physicalName = "req_defer")
    public String getReq_defer(){
        return req_defer;
    }

    @ElVoField(physicalName = "req_defer")
    public void setReq_defer(String req_defer){
        this.req_defer = req_defer;
    }

    @ElVoField(physicalName = "req_repay")
    public String getReq_repay(){
        return req_repay;
    }

    @ElVoField(physicalName = "req_repay")
    public void setReq_repay(String req_repay){
        this.req_repay = req_repay;
    }

    @ElVoField(physicalName = "req_repay_month")
    public String getReq_repay_month(){
        return req_repay_month;
    }

    @ElVoField(physicalName = "req_repay_month")
    public void setReq_repay_month(String req_repay_month){
        this.req_repay_month = req_repay_month;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "max_midway_repay_ymd")
    public String getMax_midway_repay_ymd(){
        return max_midway_repay_ymd;
    }

    @ElVoField(physicalName = "max_midway_repay_ymd")
    public void setMax_midway_repay_ymd(String max_midway_repay_ymd){
        this.max_midway_repay_ymd = max_midway_repay_ymd;
    }

    @ElVoField(physicalName = "sum_midway_repay_amt")
    public String getSum_midway_repay_amt(){
        return sum_midway_repay_amt;
    }

    @ElVoField(physicalName = "sum_midway_repay_amt")
    public void setSum_midway_repay_amt(String sum_midway_repay_amt){
        this.sum_midway_repay_amt = sum_midway_repay_amt;
    }

    @ElVoField(physicalName = "sum_midway_repay_intrst")
    public String getSum_midway_repay_intrst(){
        return sum_midway_repay_intrst;
    }

    @ElVoField(physicalName = "sum_midway_repay_intrst")
    public void setSum_midway_repay_intrst(String sum_midway_repay_intrst){
        this.sum_midway_repay_intrst = sum_midway_repay_intrst;
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
        sb.append("CwlLoanMasterVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("occutyp_nm").append("=").append(occutyp_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("loan_cd").append("=").append(loan_cd).append(",");
        sb.append("loan_nm").append("=").append(loan_nm).append(",");
        sb.append("loan_ymd").append("=").append(loan_ymd).append(",");
        sb.append("loan_tot_liq").append("=").append(loan_tot_liq).append(",");
        sb.append("loan_ramt").append("=").append(loan_ramt).append(",");
        sb.append("loan_rts").append("=").append(loan_rts).append(",");
        sb.append("tot_repay_amt").append("=").append(tot_repay_amt).append(",");
        sb.append("tot_repay_intrst").append("=").append(tot_repay_intrst).append(",");
        sb.append("month_repay_amt").append("=").append(month_repay_amt).append(",");
        sb.append("midway_repay_intrst").append("=").append(midway_repay_intrst).append(",");
        sb.append("thmon_intrst_amt").append("=").append(thmon_intrst_amt).append(",");
        sb.append("repay_schdl_tot_times").append("=").append(repay_schdl_tot_times).append(",");
        sb.append("repay_times").append("=").append(repay_times).append(",");
        sb.append("dedct_start_ymd").append("=").append(dedct_start_ymd).append(",");
        sb.append("midway_repay_ymd").append("=").append(midway_repay_ymd).append(",");
        sb.append("final_dedct_ymd").append("=").append(final_dedct_ymd).append(",");
        sb.append("tot_midway_repay_amt").append("=").append(tot_midway_repay_amt).append(",");
        sb.append("tot_midway_repay_intrst").append("=").append(tot_midway_repay_intrst).append(",");
        sb.append("midway_repay_times").append("=").append(midway_repay_times).append(",");
        sb.append("thmon_midway_repay_intrst_amt").append("=").append(thmon_midway_repay_intrst_amt).append(",");
        sb.append("dedct_progrss_state").append("=").append(dedct_progrss_state).append(",");
        sb.append("dedct_progrss_nm").append("=").append(dedct_progrss_nm).append(",");
        sb.append("def_intrst").append("=").append(def_intrst).append(",");
        sb.append("repay_intrst").append("=").append(repay_intrst).append(",");
        sb.append("tot_intrst_amt").append("=").append(tot_intrst_amt).append(",");
        sb.append("confirm_day").append("=").append(confirm_day).append(",");
        sb.append("req_defer").append("=").append(req_defer).append(",");
        sb.append("req_repay").append("=").append(req_repay).append(",");
        sb.append("req_repay_month").append("=").append(req_repay_month).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("max_midway_repay_ymd").append("=").append(max_midway_repay_ymd).append(",");
        sb.append("sum_midway_repay_amt").append("=").append(sum_midway_repay_amt).append(",");
        sb.append("sum_midway_repay_intrst").append("=").append(sum_midway_repay_intrst).append(",");
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
