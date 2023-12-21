package kr.re.kitech.biz.ccs.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "상조회대출금마스터팝업")
public class CwlLoanPopVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwlLoanPopVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "조회시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "조회종료일자", physicalName = "end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_ymd;

    @ElDtoField(logicalName = "신청자", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

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

    @ElDtoField(logicalName = "중도상환일자", physicalName = "pre_midway_repay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_midway_repay_ymd;

    @ElDtoField(logicalName = "총중도상환금액", physicalName = "tot_midway_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_midway_repay_amt;

    @ElDtoField(logicalName = "총중도상환이자", physicalName = "tot_midway_repay_intrst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_midway_repay_intrst;

    @ElDtoField(logicalName = "중도상환회수", physicalName = "midway_repay_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midway_repay_times;

    @ElDtoField(logicalName = "공제진행상태", physicalName = "dedct_progrss_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_progrss_state;

    @ElDtoField(logicalName = "대출상환총액", physicalName = "sum_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_repay_amt;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public String getEnd_ymd(){
        return end_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public void setEnd_ymd(String end_ymd){
        this.end_ymd = end_ymd;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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

    @ElVoField(physicalName = "pre_midway_repay_ymd")
    public String getPre_midway_repay_ymd(){
        return pre_midway_repay_ymd;
    }

    @ElVoField(physicalName = "pre_midway_repay_ymd")
    public void setPre_midway_repay_ymd(String pre_midway_repay_ymd){
        this.pre_midway_repay_ymd = pre_midway_repay_ymd;
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

    @ElVoField(physicalName = "dedct_progrss_state")
    public String getDedct_progrss_state(){
        return dedct_progrss_state;
    }

    @ElVoField(physicalName = "dedct_progrss_state")
    public void setDedct_progrss_state(String dedct_progrss_state){
        this.dedct_progrss_state = dedct_progrss_state;
    }

    @ElVoField(physicalName = "sum_repay_amt")
    public String getSum_repay_amt(){
        return sum_repay_amt;
    }

    @ElVoField(physicalName = "sum_repay_amt")
    public void setSum_repay_amt(String sum_repay_amt){
        this.sum_repay_amt = sum_repay_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwlLoanPopVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("end_ymd").append("=").append(end_ymd).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("loan_cd").append("=").append(loan_cd).append(",");
        sb.append("loan_nm").append("=").append(loan_nm).append(",");
        sb.append("loan_ymd").append("=").append(loan_ymd).append(",");
        sb.append("loan_tot_liq").append("=").append(loan_tot_liq).append(",");
        sb.append("loan_ramt").append("=").append(loan_ramt).append(",");
        sb.append("loan_rts").append("=").append(loan_rts).append(",");
        sb.append("tot_repay_amt").append("=").append(tot_repay_amt).append(",");
        sb.append("tot_repay_intrst").append("=").append(tot_repay_intrst).append(",");
        sb.append("pre_midway_repay_ymd").append("=").append(pre_midway_repay_ymd).append(",");
        sb.append("tot_midway_repay_amt").append("=").append(tot_midway_repay_amt).append(",");
        sb.append("tot_midway_repay_intrst").append("=").append(tot_midway_repay_intrst).append(",");
        sb.append("midway_repay_times").append("=").append(midway_repay_times).append(",");
        sb.append("dedct_progrss_state").append("=").append(dedct_progrss_state).append(",");
        sb.append("sum_repay_amt").append("=").append(sum_repay_amt);
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
