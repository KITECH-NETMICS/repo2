package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경조사비 금액정보")
public class CcsCwlCgCdFeeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CcsCwlCgCdFeeVo(){
    }

    @ElDtoField(logicalName = "가족관계 구분코드", physicalName = "fam_relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fam_relat;

    @ElDtoField(logicalName = "경조사 구분코드", physicalName = "cgncd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_clsf;

    @ElDtoField(logicalName = "경조금액", physicalName = "cgncd_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_fee;

    @ElVoField(physicalName = "fam_relat")
    public String getFam_relat(){
        return fam_relat;
    }

    @ElVoField(physicalName = "fam_relat")
    public void setFam_relat(String fam_relat){
        this.fam_relat = fam_relat;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public String getCgncd_clsf(){
        return cgncd_clsf;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public void setCgncd_clsf(String cgncd_clsf){
        this.cgncd_clsf = cgncd_clsf;
    }

    @ElVoField(physicalName = "cgncd_fee")
    public String getCgncd_fee(){
        return cgncd_fee;
    }

    @ElVoField(physicalName = "cgncd_fee")
    public void setCgncd_fee(String cgncd_fee){
        this.cgncd_fee = cgncd_fee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcsCwlCgCdFeeVo [");
        sb.append("fam_relat").append("=").append(fam_relat).append(",");
        sb.append("cgncd_clsf").append("=").append(cgncd_clsf).append(",");
        sb.append("cgncd_fee").append("=").append(cgncd_fee);
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
