package kr.re.kitech.biz.xom.base.model;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통 검색 VO")
public class BizScVO extends com.inswave.elfw.core.CommVO {
    private static final long serialVersionUID = 1L;

    public BizScVO(){
    }

    @ElDtoField(logicalName = "검색항목", physicalName = "scType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scType;

    @ElDtoField(logicalName = "검색키워드", physicalName = "scKeyword", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scKeyword;

    @ElDtoField(logicalName = "검색일시", physicalName = "startDt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String startDt;

    @ElDtoField(logicalName = "종료일시", physicalName = "closeDt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String closeDt;

    @ElVoField(physicalName = "scType")
    public String getScType(){
        String ret = this.scType;
        return ret;
    }

    @ElVoField(physicalName = "scType")
    public void setScType(String scType){
        this.scType = scType;
    }

    @ElVoField(physicalName = "scKeyword")
    public String getScKeyword(){
        String ret = this.scKeyword;
        return ret;
    }

    @ElVoField(physicalName = "scKeyword")
    public void setScKeyword(String scKeyword){
        this.scKeyword = scKeyword;
    }

    @ElVoField(physicalName = "startDt")
    public String getStartDt(){
        String ret = this.startDt;
        return ret;
    }

    @ElVoField(physicalName = "startDt")
    public void setStartDt(String startDt){
        this.startDt = startDt;
    }

    @ElVoField(physicalName = "closeDt")
    public String getCloseDt(){
        String ret = this.closeDt;
        return ret;
    }

    @ElVoField(physicalName = "closeDt")
    public void setCloseDt(String closeDt){
        this.closeDt = closeDt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BizScVO [");
        sb.append("scType").append("=").append(scType).append(",");
        sb.append("scKeyword").append("=").append(scKeyword).append(",");
        sb.append("startDt").append("=").append(startDt).append(",");
        sb.append("closeDt").append("=").append(closeDt);
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
