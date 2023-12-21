package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메시지 JSON")
public class ResourceVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResourceVo(){
    }

    @ElDtoField(logicalName = "데이터", physicalName = "data", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.Map data;

    @ElVoField(physicalName = "data")
    public java.util.Map getData(){
        return data;
    }

    @ElVoField(physicalName = "data")
    public void setData(java.util.Map data){
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceVo [");
        sb.append("data").append("=").append(data);
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
