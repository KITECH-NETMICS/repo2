package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "3책 5공 제외사업 기준 Vo")
public class ResAppBsnsThreeFiveVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAppBsnsThreeFiveVo(){
    }

    @ElDtoField(logicalName = "threefive_clsf", physicalName = "threefive_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String threefive_clsf;

    @ElDtoField(logicalName = "threefive_nm", physicalName = "threefive_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String threefive_nm;

    @ElDtoField(logicalName = "threefive_detail_nm", physicalName = "threefive_detail_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String threefive_detail_nm;

    @ElDtoField(logicalName = "cd_clsf", physicalName = "cd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_clsf;

    @ElVoField(physicalName = "threefive_clsf")
    public String getThreefive_clsf(){
        return threefive_clsf;
    }

    @ElVoField(physicalName = "threefive_clsf")
    public void setThreefive_clsf(String threefive_clsf){
        this.threefive_clsf = threefive_clsf;
    }

    @ElVoField(physicalName = "threefive_nm")
    public String getThreefive_nm(){
        return threefive_nm;
    }

    @ElVoField(physicalName = "threefive_nm")
    public void setThreefive_nm(String threefive_nm){
        this.threefive_nm = threefive_nm;
    }

    @ElVoField(physicalName = "threefive_detail_nm")
    public String getThreefive_detail_nm(){
        return threefive_detail_nm;
    }

    @ElVoField(physicalName = "threefive_detail_nm")
    public void setThreefive_detail_nm(String threefive_detail_nm){
        this.threefive_detail_nm = threefive_detail_nm;
    }

    @ElVoField(physicalName = "cd_clsf")
    public String getCd_clsf(){
        return cd_clsf;
    }

    @ElVoField(physicalName = "cd_clsf")
    public void setCd_clsf(String cd_clsf){
        this.cd_clsf = cd_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppBsnsThreeFiveVo [");
        sb.append("threefive_clsf").append("=").append(threefive_clsf).append(",");
        sb.append("threefive_nm").append("=").append(threefive_nm).append(",");
        sb.append("threefive_detail_nm").append("=").append(threefive_detail_nm).append(",");
        sb.append("cd_clsf").append("=").append(cd_clsf);
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
