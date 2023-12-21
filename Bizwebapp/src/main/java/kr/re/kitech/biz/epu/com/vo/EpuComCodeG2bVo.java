package kr.re.kitech.biz.epu.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "EpuOrdPlanG2bCommstExp")
public class EpuComCodeG2bVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuComCodeG2bVo(){
    }

    @ElDtoField(logicalName = "upperCd", physicalName = "upper_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String upper_cd;

    @ElDtoField(logicalName = "cd", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "cdLevel", physicalName = "cd_level", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_level;

    @ElDtoField(logicalName = "cdNm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "useEx", physicalName = "use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ex;

    @ElDtoField(logicalName = "cd의 시작인덱스", physicalName = "str_index", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int str_index;

    @ElDtoField(logicalName = "cd의 길이", physicalName = "str_length", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int str_length;

    @ElVoField(physicalName = "upper_cd")
    public String getUpper_cd(){
        return upper_cd;
    }

    @ElVoField(physicalName = "upper_cd")
    public void setUpper_cd(String upper_cd){
        this.upper_cd = upper_cd;
    }

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "cd_level")
    public String getCd_level(){
        return cd_level;
    }

    @ElVoField(physicalName = "cd_level")
    public void setCd_level(String cd_level){
        this.cd_level = cd_level;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "use_ex")
    public String getUse_ex(){
        return use_ex;
    }

    @ElVoField(physicalName = "use_ex")
    public void setUse_ex(String use_ex){
        this.use_ex = use_ex;
    }

    @ElVoField(physicalName = "str_index")
    public int getStr_index(){
        return str_index;
    }

    @ElVoField(physicalName = "str_index")
    public void setStr_index(int str_index){
        this.str_index = str_index;
    }

    @ElVoField(physicalName = "str_length")
    public int getStr_length(){
        return str_length;
    }

    @ElVoField(physicalName = "str_length")
    public void setStr_length(int str_length){
        this.str_length = str_length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuComCodeG2bVo [");
        sb.append("upper_cd").append("=").append(upper_cd).append(",");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("cd_level").append("=").append(cd_level).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("use_ex").append("=").append(use_ex).append(",");
        sb.append("str_index").append("=").append(str_index).append(",");
        sb.append("str_length").append("=").append(str_length);
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
