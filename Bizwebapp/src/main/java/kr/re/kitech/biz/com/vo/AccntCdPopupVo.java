package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회계코드")
public class AccntCdPopupVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AccntCdPopupVo(){
    }

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "회계코드약명", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "예산통제유무", physicalName = "bugt_ctrl_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_ex;

    @ElDtoField(logicalName = "회계코드구분", physicalName = "accnt_cd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_clsf;

    @ElDtoField(logicalName = "채권채무구분", physicalName = "bond_debt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bond_debt_clsf;

    @ElDtoField(logicalName = "건별정산유무", physicalName = "caseby_adjst_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String caseby_adjst_ex;

    @ElDtoField(logicalName = "예산항목사용유무", physicalName = "bugt_item_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_use_ex;

    @ElDtoField(logicalName = "잔액관리유무", physicalName = "ramt_mngmt_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_ex;

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "bugt_ctrl_ex")
    public String getBugt_ctrl_ex(){
        return bugt_ctrl_ex;
    }

    @ElVoField(physicalName = "bugt_ctrl_ex")
    public void setBugt_ctrl_ex(String bugt_ctrl_ex){
        this.bugt_ctrl_ex = bugt_ctrl_ex;
    }

    @ElVoField(physicalName = "accnt_cd_clsf")
    public String getAccnt_cd_clsf(){
        return accnt_cd_clsf;
    }

    @ElVoField(physicalName = "accnt_cd_clsf")
    public void setAccnt_cd_clsf(String accnt_cd_clsf){
        this.accnt_cd_clsf = accnt_cd_clsf;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public String getBond_debt_clsf(){
        return bond_debt_clsf;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public void setBond_debt_clsf(String bond_debt_clsf){
        this.bond_debt_clsf = bond_debt_clsf;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public String getCaseby_adjst_ex(){
        return caseby_adjst_ex;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public void setCaseby_adjst_ex(String caseby_adjst_ex){
        this.caseby_adjst_ex = caseby_adjst_ex;
    }

    @ElVoField(physicalName = "bugt_item_use_ex")
    public String getBugt_item_use_ex(){
        return bugt_item_use_ex;
    }

    @ElVoField(physicalName = "bugt_item_use_ex")
    public void setBugt_item_use_ex(String bugt_item_use_ex){
        this.bugt_item_use_ex = bugt_item_use_ex;
    }

    @ElVoField(physicalName = "ramt_mngmt_ex")
    public String getRamt_mngmt_ex(){
        return ramt_mngmt_ex;
    }

    @ElVoField(physicalName = "ramt_mngmt_ex")
    public void setRamt_mngmt_ex(String ramt_mngmt_ex){
        this.ramt_mngmt_ex = ramt_mngmt_ex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccntCdPopupVo [");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("bugt_ctrl_ex").append("=").append(bugt_ctrl_ex).append(",");
        sb.append("accnt_cd_clsf").append("=").append(accnt_cd_clsf).append(",");
        sb.append("bond_debt_clsf").append("=").append(bond_debt_clsf).append(",");
        sb.append("caseby_adjst_ex").append("=").append(caseby_adjst_ex).append(",");
        sb.append("bugt_item_use_ex").append("=").append(bugt_item_use_ex).append(",");
        sb.append("ramt_mngmt_ex").append("=").append(ramt_mngmt_ex);
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
