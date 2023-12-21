package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통 채번 파라미터")
public class GenerationParamVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public GenerationParamVo(){
    }

    @ElDtoField(logicalName = "구분", physicalName = "numbering", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String numbering;

    @ElDtoField(logicalName = "프리픽스", physicalName = "prefix", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prefix;

    @ElDtoField(logicalName = "년도", physicalName = "yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String yr;

    @ElDtoField(logicalName = "월", physicalName = "mon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mon;

    @ElVoField(physicalName = "numbering")
    public String getNumbering(){
        String ret = this.numbering;
        return ret;
    }

    @ElVoField(physicalName = "numbering")
    public void setNumbering(String numbering){
        this.numbering = numbering;
    }

    @ElVoField(physicalName = "prefix")
    public String getPrefix(){
        String ret = this.prefix;
        return ret;
    }

    @ElVoField(physicalName = "prefix")
    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    @ElVoField(physicalName = "yr")
    public String getYr(){
        String ret = this.yr;
        return ret;
    }

    @ElVoField(physicalName = "yr")
    public void setYr(String yr){
        this.yr = yr;
    }

    @ElVoField(physicalName = "mon")
    public String getMon(){
        String ret = this.mon;
        return ret;
    }

    @ElVoField(physicalName = "mon")
    public void setMon(String mon){
        this.mon = mon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerationParamVo [");
        sb.append("numbering").append("=").append(numbering).append(",");
        sb.append("prefix").append("=").append(prefix).append(",");
        sb.append("yr").append("=").append(yr).append(",");
        sb.append("mon").append("=").append(mon);
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
