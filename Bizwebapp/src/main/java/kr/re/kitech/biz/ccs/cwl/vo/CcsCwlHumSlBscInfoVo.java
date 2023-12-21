package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경조사비 계좌정보")
public class CcsCwlHumSlBscInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CcsCwlHumSlBscInfoVo(){
    }

    @ElDtoField(logicalName = "은행코드", physicalName = "salry_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_bank;

    @ElDtoField(logicalName = "은행명", physicalName = "salry_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_bank_nm;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "계좌주", physicalName = "depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr;

    @ElDtoField(logicalName = "계좌번호(예비)", physicalName = "oth_bankaccnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_bankaccnt;

    @ElDtoField(logicalName = "은행명(예비)", physicalName = "oth_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_bank;

    @ElDtoField(logicalName = "은행명(예비)", physicalName = "oth_salry_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_salry_bank_nm;

    @ElDtoField(logicalName = "계좌주(예비)", physicalName = "oth_depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oth_depstr;

    @ElVoField(physicalName = "salry_bank")
    public String getSalry_bank(){
        return salry_bank;
    }

    @ElVoField(physicalName = "salry_bank")
    public void setSalry_bank(String salry_bank){
        this.salry_bank = salry_bank;
    }

    @ElVoField(physicalName = "salry_bank_nm")
    public String getSalry_bank_nm(){
        return salry_bank_nm;
    }

    @ElVoField(physicalName = "salry_bank_nm")
    public void setSalry_bank_nm(String salry_bank_nm){
        this.salry_bank_nm = salry_bank_nm;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "depstr")
    public String getDepstr(){
        return depstr;
    }

    @ElVoField(physicalName = "depstr")
    public void setDepstr(String depstr){
        this.depstr = depstr;
    }

    @ElVoField(physicalName = "oth_bankaccnt")
    public String getOth_bankaccnt(){
        return oth_bankaccnt;
    }

    @ElVoField(physicalName = "oth_bankaccnt")
    public void setOth_bankaccnt(String oth_bankaccnt){
        this.oth_bankaccnt = oth_bankaccnt;
    }

    @ElVoField(physicalName = "oth_bank")
    public String getOth_bank(){
        return oth_bank;
    }

    @ElVoField(physicalName = "oth_bank")
    public void setOth_bank(String oth_bank){
        this.oth_bank = oth_bank;
    }

    @ElVoField(physicalName = "oth_salry_bank_nm")
    public String getOth_salry_bank_nm(){
        return oth_salry_bank_nm;
    }

    @ElVoField(physicalName = "oth_salry_bank_nm")
    public void setOth_salry_bank_nm(String oth_salry_bank_nm){
        this.oth_salry_bank_nm = oth_salry_bank_nm;
    }

    @ElVoField(physicalName = "oth_depstr")
    public String getOth_depstr(){
        return oth_depstr;
    }

    @ElVoField(physicalName = "oth_depstr")
    public void setOth_depstr(String oth_depstr){
        this.oth_depstr = oth_depstr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcsCwlHumSlBscInfoVo [");
        sb.append("salry_bank").append("=").append(salry_bank).append(",");
        sb.append("salry_bank_nm").append("=").append(salry_bank_nm).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr").append("=").append(depstr).append(",");
        sb.append("oth_bankaccnt").append("=").append(oth_bankaccnt).append(",");
        sb.append("oth_bank").append("=").append(oth_bank).append(",");
        sb.append("oth_salry_bank_nm").append("=").append(oth_salry_bank_nm).append(",");
        sb.append("oth_depstr").append("=").append(oth_depstr);
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
