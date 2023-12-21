package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "재무공통 금액 체크 Vo")
public class FinComAmtChkVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinComAmtChkVo(){
    }

    @ElDtoField(logicalName = "잔액", physicalName = "ramt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ramt_amt;

    @ElDtoField(logicalName = "원인행위금액", physicalName = "enfrc_amt_cause", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long enfrc_amt_cause;

    @ElDtoField(logicalName = "결의금액", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElDtoField(logicalName = "차변금액", physicalName = "dr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dr_amt;

    @ElDtoField(logicalName = "대변금액", physicalName = "cr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cr_amt;

    @ElDtoField(logicalName = "이전신청금액", physicalName = "old_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long old_req_amt;

    @ElDtoField(logicalName = "신청금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "예실원인행위금액", physicalName = "cause_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cause_amt;

    @ElDtoField(logicalName = "이전 예실원인행위금액", physicalName = "old_cause_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long old_cause_amt;

    @ElDtoField(logicalName = "예산년도", physicalName = "bugt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_yr;

    @ElDtoField(logicalName = "개인번호", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "부분전체구분", physicalName = "part_all_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_all_clsf;

    @ElVoField(physicalName = "ramt_amt")
    public long getRamt_amt(){
        return ramt_amt;
    }

    @ElVoField(physicalName = "ramt_amt")
    public void setRamt_amt(long ramt_amt){
        this.ramt_amt = ramt_amt;
    }

    @ElVoField(physicalName = "enfrc_amt_cause")
    public long getEnfrc_amt_cause(){
        return enfrc_amt_cause;
    }

    @ElVoField(physicalName = "enfrc_amt_cause")
    public void setEnfrc_amt_cause(long enfrc_amt_cause){
        this.enfrc_amt_cause = enfrc_amt_cause;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "dr_amt")
    public long getDr_amt(){
        return dr_amt;
    }

    @ElVoField(physicalName = "dr_amt")
    public void setDr_amt(long dr_amt){
        this.dr_amt = dr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public long getCr_amt(){
        return cr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public void setCr_amt(long cr_amt){
        this.cr_amt = cr_amt;
    }

    @ElVoField(physicalName = "old_req_amt")
    public long getOld_req_amt(){
        return old_req_amt;
    }

    @ElVoField(physicalName = "old_req_amt")
    public void setOld_req_amt(long old_req_amt){
        this.old_req_amt = old_req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public long getCause_amt(){
        return cause_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public void setCause_amt(long cause_amt){
        this.cause_amt = cause_amt;
    }

    @ElVoField(physicalName = "old_cause_amt")
    public long getOld_cause_amt(){
        return old_cause_amt;
    }

    @ElVoField(physicalName = "old_cause_amt")
    public void setOld_cause_amt(long old_cause_amt){
        this.old_cause_amt = old_cause_amt;
    }

    @ElVoField(physicalName = "bugt_yr")
    public String getBugt_yr(){
        return bugt_yr;
    }

    @ElVoField(physicalName = "bugt_yr")
    public void setBugt_yr(String bugt_yr){
        this.bugt_yr = bugt_yr;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public String getPart_all_clsf(){
        return part_all_clsf;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public void setPart_all_clsf(String part_all_clsf){
        this.part_all_clsf = part_all_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinComAmtChkVo [");
        sb.append("ramt_amt").append("=").append(ramt_amt).append(",");
        sb.append("enfrc_amt_cause").append("=").append(enfrc_amt_cause).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("dr_amt").append("=").append(dr_amt).append(",");
        sb.append("cr_amt").append("=").append(cr_amt).append(",");
        sb.append("old_req_amt").append("=").append(old_req_amt).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("cause_amt").append("=").append(cause_amt).append(",");
        sb.append("old_cause_amt").append("=").append(old_cause_amt).append(",");
        sb.append("bugt_yr").append("=").append(bugt_yr).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("part_all_clsf").append("=").append(part_all_clsf);
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
