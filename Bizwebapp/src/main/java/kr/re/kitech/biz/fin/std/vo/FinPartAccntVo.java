package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinPartAccntExp")
public class FinPartAccntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinPartAccntVo(){
    }

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "bankaccntNo", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "accntRspnsNm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "bugtAmt", physicalName = "bugt_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_amt;

    @ElDtoField(logicalName = "sunsuAmt", physicalName = "sunsu_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sunsu_amt;

    @ElDtoField(logicalName = "intrstAmt", physicalName = "intrst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrst_amt;

    @ElDtoField(logicalName = "enfrcAmt", physicalName = "enfrc_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_amt;

    @ElDtoField(logicalName = "ramtAmt", physicalName = "ramt_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_amt;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "accnt_state", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "bugt_amt")
    public String getBugt_amt(){
        return bugt_amt;
    }

    @ElVoField(physicalName = "bugt_amt")
    public void setBugt_amt(String bugt_amt){
        this.bugt_amt = bugt_amt;
    }

    @ElVoField(physicalName = "sunsu_amt")
    public String getSunsu_amt(){
        return sunsu_amt;
    }

    @ElVoField(physicalName = "sunsu_amt")
    public void setSunsu_amt(String sunsu_amt){
        this.sunsu_amt = sunsu_amt;
    }

    @ElVoField(physicalName = "intrst_amt")
    public String getIntrst_amt(){
        return intrst_amt;
    }

    @ElVoField(physicalName = "intrst_amt")
    public void setIntrst_amt(String intrst_amt){
        this.intrst_amt = intrst_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public String getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(String enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "ramt_amt")
    public String getRamt_amt(){
        return ramt_amt;
    }

    @ElVoField(physicalName = "ramt_amt")
    public void setRamt_amt(String ramt_amt){
        this.ramt_amt = ramt_amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinPartAccntVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("bugt_amt").append("=").append(bugt_amt).append(",");
        sb.append("sunsu_amt").append("=").append(sunsu_amt).append(",");
        sb.append("intrst_amt").append("=").append(intrst_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("ramt_amt").append("=").append(ramt_amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("accnt_state").append("=").append(accnt_state);
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
