package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회계코드 Vo")
public class XodfAccntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfAccntVo(){
    }

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "재무사업구분", physicalName = "fin_bsns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fin_bsns_clsf;

    @ElDtoField(logicalName = "건별정산유무", physicalName = "caseby_adjst_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String caseby_adjst_ex;

    @ElDtoField(logicalName = "채권채무구분", physicalName = "bond_debt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bond_debt_clsf;

    @ElDtoField(logicalName = "관리항목1", physicalName = "mngmt_item_cd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_cd_1;

    @ElDtoField(logicalName = "관리항목2", physicalName = "mngmt_item_cd_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_cd_2;

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

    @ElVoField(physicalName = "fin_bsns_clsf")
    public String getFin_bsns_clsf(){
        return fin_bsns_clsf;
    }

    @ElVoField(physicalName = "fin_bsns_clsf")
    public void setFin_bsns_clsf(String fin_bsns_clsf){
        this.fin_bsns_clsf = fin_bsns_clsf;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public String getCaseby_adjst_ex(){
        return caseby_adjst_ex;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public void setCaseby_adjst_ex(String caseby_adjst_ex){
        this.caseby_adjst_ex = caseby_adjst_ex;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public String getBond_debt_clsf(){
        return bond_debt_clsf;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public void setBond_debt_clsf(String bond_debt_clsf){
        this.bond_debt_clsf = bond_debt_clsf;
    }

    @ElVoField(physicalName = "mngmt_item_cd_1")
    public String getMngmt_item_cd_1(){
        return mngmt_item_cd_1;
    }

    @ElVoField(physicalName = "mngmt_item_cd_1")
    public void setMngmt_item_cd_1(String mngmt_item_cd_1){
        this.mngmt_item_cd_1 = mngmt_item_cd_1;
    }

    @ElVoField(physicalName = "mngmt_item_cd_2")
    public String getMngmt_item_cd_2(){
        return mngmt_item_cd_2;
    }

    @ElVoField(physicalName = "mngmt_item_cd_2")
    public void setMngmt_item_cd_2(String mngmt_item_cd_2){
        this.mngmt_item_cd_2 = mngmt_item_cd_2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfAccntVo [");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("fin_bsns_clsf").append("=").append(fin_bsns_clsf).append(",");
        sb.append("caseby_adjst_ex").append("=").append(caseby_adjst_ex).append(",");
        sb.append("bond_debt_clsf").append("=").append(bond_debt_clsf).append(",");
        sb.append("mngmt_item_cd_1").append("=").append(mngmt_item_cd_1).append(",");
        sb.append("mngmt_item_cd_2").append("=").append(mngmt_item_cd_2);
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
