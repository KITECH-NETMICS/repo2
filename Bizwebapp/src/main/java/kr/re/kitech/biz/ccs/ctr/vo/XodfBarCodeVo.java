package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "test")
public class XodfBarCodeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfBarCodeVo(){
    }

    @ElDtoField(logicalName = "관계부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "관계부처명", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;

    @ElDtoField(logicalName = "깊이", physicalName = "depth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depth;

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public String getBsns_cd_ofic_nm(){
        return bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public void setBsns_cd_ofic_nm(String bsns_cd_ofic_nm){
        this.bsns_cd_ofic_nm = bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "depth")
    public String getDepth(){
        return depth;
    }

    @ElVoField(physicalName = "depth")
    public void setDepth(String depth){
        this.depth = depth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfBarCodeVo [");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_cd_ofic_nm").append("=").append(bsns_cd_ofic_nm).append(",");
        sb.append("depth").append("=").append(depth);
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
