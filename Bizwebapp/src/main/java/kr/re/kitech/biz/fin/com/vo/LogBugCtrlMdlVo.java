package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예산통제모듈 로그 Vo")
public class LogBugCtrlMdlVo extends kr.re.kitech.biz.fin.com.vo.BblenfrcVo {
    private static final long serialVersionUID = 1L;

    public LogBugCtrlMdlVo(){
    }

    @ElDtoField(logicalName = "업무구분", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "업무명", physicalName = "job_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_nm;

    @ElDtoField(logicalName = "함수명", physicalName = "fun_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fun_nm;

    @ElDtoField(logicalName = "예실구분", physicalName = "bugt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_clsf;

    @ElDtoField(logicalName = "이전신청금액", physicalName = "befr_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long befr_req_amt;

    @ElDtoField(logicalName = "이전통제금액", physicalName = "befr_cause_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long befr_cause_amt;

    @ElDtoField(logicalName = "이전결의금액", physicalName = "befr_slip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long befr_slip_amt;

    @ElDtoField(logicalName = "이전대체금액", physicalName = "befr_trans_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long befr_trans_amt;

    @ElDtoField(logicalName = "예실신청금액", physicalName = "curr_req_tot_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long curr_req_tot_amt;

    @ElDtoField(logicalName = "예실원인금액", physicalName = "curr_cause_tot_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long curr_cause_tot_amt;

    @ElDtoField(logicalName = "예실예산금액", physicalName = "curr_bugt_tot_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long curr_bugt_tot_amt;

    @ElDtoField(logicalName = "예실집행금액", physicalName = "curr_enfrc_tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_enfrc_tot_amt;

    @ElDtoField(logicalName = "원인행위금액", physicalName = "cause_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cause_amt;

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "job_nm")
    public String getJob_nm(){
        return job_nm;
    }

    @ElVoField(physicalName = "job_nm")
    public void setJob_nm(String job_nm){
        this.job_nm = job_nm;
    }

    @ElVoField(physicalName = "fun_nm")
    public String getFun_nm(){
        return fun_nm;
    }

    @ElVoField(physicalName = "fun_nm")
    public void setFun_nm(String fun_nm){
        this.fun_nm = fun_nm;
    }

    @ElVoField(physicalName = "bugt_clsf")
    public String getBugt_clsf(){
        return bugt_clsf;
    }

    @ElVoField(physicalName = "bugt_clsf")
    public void setBugt_clsf(String bugt_clsf){
        this.bugt_clsf = bugt_clsf;
    }

    @ElVoField(physicalName = "befr_req_amt")
    public long getBefr_req_amt(){
        return befr_req_amt;
    }

    @ElVoField(physicalName = "befr_req_amt")
    public void setBefr_req_amt(long befr_req_amt){
        this.befr_req_amt = befr_req_amt;
    }

    @ElVoField(physicalName = "befr_cause_amt")
    public long getBefr_cause_amt(){
        return befr_cause_amt;
    }

    @ElVoField(physicalName = "befr_cause_amt")
    public void setBefr_cause_amt(long befr_cause_amt){
        this.befr_cause_amt = befr_cause_amt;
    }

    @ElVoField(physicalName = "befr_slip_amt")
    public long getBefr_slip_amt(){
        return befr_slip_amt;
    }

    @ElVoField(physicalName = "befr_slip_amt")
    public void setBefr_slip_amt(long befr_slip_amt){
        this.befr_slip_amt = befr_slip_amt;
    }

    @ElVoField(physicalName = "befr_trans_amt")
    public long getBefr_trans_amt(){
        return befr_trans_amt;
    }

    @ElVoField(physicalName = "befr_trans_amt")
    public void setBefr_trans_amt(long befr_trans_amt){
        this.befr_trans_amt = befr_trans_amt;
    }

    @ElVoField(physicalName = "curr_req_tot_amt")
    public long getCurr_req_tot_amt(){
        return curr_req_tot_amt;
    }

    @ElVoField(physicalName = "curr_req_tot_amt")
    public void setCurr_req_tot_amt(long curr_req_tot_amt){
        this.curr_req_tot_amt = curr_req_tot_amt;
    }

    @ElVoField(physicalName = "curr_cause_tot_amt")
    public long getCurr_cause_tot_amt(){
        return curr_cause_tot_amt;
    }

    @ElVoField(physicalName = "curr_cause_tot_amt")
    public void setCurr_cause_tot_amt(long curr_cause_tot_amt){
        this.curr_cause_tot_amt = curr_cause_tot_amt;
    }

    @ElVoField(physicalName = "curr_bugt_tot_amt")
    public long getCurr_bugt_tot_amt(){
        return curr_bugt_tot_amt;
    }

    @ElVoField(physicalName = "curr_bugt_tot_amt")
    public void setCurr_bugt_tot_amt(long curr_bugt_tot_amt){
        this.curr_bugt_tot_amt = curr_bugt_tot_amt;
    }

    @ElVoField(physicalName = "curr_enfrc_tot_amt")
    public String getCurr_enfrc_tot_amt(){
        return curr_enfrc_tot_amt;
    }

    @ElVoField(physicalName = "curr_enfrc_tot_amt")
    public void setCurr_enfrc_tot_amt(String curr_enfrc_tot_amt){
        this.curr_enfrc_tot_amt = curr_enfrc_tot_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public long getCause_amt(){
        return cause_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public void setCause_amt(long cause_amt){
        this.cause_amt = cause_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogBugCtrlMdlVo [");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("job_nm").append("=").append(job_nm).append(",");
        sb.append("fun_nm").append("=").append(fun_nm).append(",");
        sb.append("bugt_clsf").append("=").append(bugt_clsf).append(",");
        sb.append("befr_req_amt").append("=").append(befr_req_amt).append(",");
        sb.append("befr_cause_amt").append("=").append(befr_cause_amt).append(",");
        sb.append("befr_slip_amt").append("=").append(befr_slip_amt).append(",");
        sb.append("befr_trans_amt").append("=").append(befr_trans_amt).append(",");
        sb.append("curr_req_tot_amt").append("=").append(curr_req_tot_amt).append(",");
        sb.append("curr_cause_tot_amt").append("=").append(curr_cause_tot_amt).append(",");
        sb.append("curr_bugt_tot_amt").append("=").append(curr_bugt_tot_amt).append(",");
        sb.append("curr_enfrc_tot_amt").append("=").append(curr_enfrc_tot_amt).append(",");
        sb.append("cause_amt").append("=").append(cause_amt);
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
