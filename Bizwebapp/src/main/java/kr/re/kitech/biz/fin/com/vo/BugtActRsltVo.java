package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예실적용Vo")
public class BugtActRsltVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BugtActRsltVo(){
    }

    @ElDtoField(logicalName = "이전신청금액", physicalName = "old_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long old_req_amt;

    @ElDtoField(logicalName = "신청금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long req_amt;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "예산년도", physicalName = "bugt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bugt_yr;

    @ElDtoField(logicalName = "개인번호", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String relat_no;

    @ElDtoField(logicalName = "이전원인행위금액", physicalName = "old_cause_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long old_cause_amt;

    @ElDtoField(logicalName = "원인행위금액", physicalName = "cause_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long cause_amt;

    @ElDtoField(logicalName = "계정번호명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "예산", physicalName = "bugt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long bugt_amt;

    @ElDtoField(logicalName = "전년집행", physicalName = "preyr_enfrc_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long preyr_enfrc_amt;

    @ElDtoField(logicalName = "집행계", physicalName = "enfrc_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long enfrc_amt;

    @ElDtoField(logicalName = "잔액", physicalName = "ramt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long ramt;

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

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        String ret = this.accnt_no;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        String ret = this.accnt_cd;
        return ret;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "bugt_yr")
    public String getBugt_yr(){
        String ret = this.bugt_yr;
        return ret;
    }

    @ElVoField(physicalName = "bugt_yr")
    public void setBugt_yr(String bugt_yr){
        this.bugt_yr = bugt_yr;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        String ret = this.relat_no;
        return ret;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "old_cause_amt")
    public long getOld_cause_amt(){
        return old_cause_amt;
    }

    @ElVoField(physicalName = "old_cause_amt")
    public void setOld_cause_amt(long old_cause_amt){
        this.old_cause_amt = old_cause_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public long getCause_amt(){
        return cause_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public void setCause_amt(long cause_amt){
        this.cause_amt = cause_amt;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        String ret = this.accnt_no_nm;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "bugt_amt")
    public long getBugt_amt(){
        return bugt_amt;
    }

    @ElVoField(physicalName = "bugt_amt")
    public void setBugt_amt(long bugt_amt){
        this.bugt_amt = bugt_amt;
    }

    @ElVoField(physicalName = "preyr_enfrc_amt")
    public long getPreyr_enfrc_amt(){
        return preyr_enfrc_amt;
    }

    @ElVoField(physicalName = "preyr_enfrc_amt")
    public void setPreyr_enfrc_amt(long preyr_enfrc_amt){
        this.preyr_enfrc_amt = preyr_enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public long getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(long enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "ramt")
    public long getRamt(){
        return ramt;
    }

    @ElVoField(physicalName = "ramt")
    public void setRamt(long ramt){
        this.ramt = ramt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BugtActRsltVo [");
        sb.append("old_req_amt").append("=").append(old_req_amt).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("bugt_yr").append("=").append(bugt_yr).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("old_cause_amt").append("=").append(old_cause_amt).append(",");
        sb.append("cause_amt").append("=").append(cause_amt).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("bugt_amt").append("=").append(bugt_amt).append(",");
        sb.append("preyr_enfrc_amt").append("=").append(preyr_enfrc_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("ramt").append("=").append(ramt);
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
