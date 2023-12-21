package kr.re.kitech.biz.res.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = " 산업기술대분류VO")
public class ResIndTeccVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResIndTeccVo(){
    }

    @ElDtoField(logicalName = "대분류", physicalName = "bigcls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bigcls;

    @ElDtoField(logicalName = "코드", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "구분", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "중분류", physicalName = "mid_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mid_clsf;

    @ElDtoField(logicalName = "소분류", physicalName = "smalclsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smalclsf;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "three_mid_clsf", physicalName = "three_mid_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String three_mid_clsf;

    @ElVoField(physicalName = "bigcls")
    public String getBigcls(){
        return bigcls;
    }

    @ElVoField(physicalName = "bigcls")
    public void setBigcls(String bigcls){
        this.bigcls = bigcls;
    }

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "mid_clsf")
    public String getMid_clsf(){
        return mid_clsf;
    }

    @ElVoField(physicalName = "mid_clsf")
    public void setMid_clsf(String mid_clsf){
        this.mid_clsf = mid_clsf;
    }

    @ElVoField(physicalName = "smalclsf")
    public String getSmalclsf(){
        return smalclsf;
    }

    @ElVoField(physicalName = "smalclsf")
    public void setSmalclsf(String smalclsf){
        this.smalclsf = smalclsf;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "three_mid_clsf")
    public String getThree_mid_clsf(){
        return three_mid_clsf;
    }

    @ElVoField(physicalName = "three_mid_clsf")
    public void setThree_mid_clsf(String three_mid_clsf){
        this.three_mid_clsf = three_mid_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResIndTeccVo [");
        sb.append("bigcls").append("=").append(bigcls).append(",");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("mid_clsf").append("=").append(mid_clsf).append(",");
        sb.append("smalclsf").append("=").append(smalclsf).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("three_mid_clsf").append("=").append(three_mid_clsf);
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
