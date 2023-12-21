package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메일템플릿 Vo")
public class MailTemplateVo extends com.inswave.elfw.core.CommVO {
    private static final long serialVersionUID = 1L;

    public MailTemplateVo(){
    }

    @ElDtoField(logicalName = "받는사람", physicalName = "toAddr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String toAddr;

    @ElDtoField(logicalName = "제목변수", physicalName = "subjectVar", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.Map subjectVar;

    @ElDtoField(logicalName = "내용변수", physicalName = "contentVar", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.Map contentVar;

    @ElVoField(physicalName = "toAddr")
    public String getToAddr(){
        String ret = this.toAddr;
        return ret;
    }

    @ElVoField(physicalName = "toAddr")
    public void setToAddr(String toAddr){
        this.toAddr = toAddr;
    }

    @ElVoField(physicalName = "subjectVar")
    public java.util.Map getSubjectVar(){
        return subjectVar;
    }

    @ElVoField(physicalName = "subjectVar")
    public void setSubjectVar(java.util.Map subjectVar){
        this.subjectVar = subjectVar;
    }

    @ElVoField(physicalName = "contentVar")
    public java.util.Map getContentVar(){
        return contentVar;
    }

    @ElVoField(physicalName = "contentVar")
    public void setContentVar(java.util.Map contentVar){
        this.contentVar = contentVar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailTemplateVo [");
        sb.append("toAddr").append("=").append(toAddr).append(",");
        sb.append("subjectVar").append("=").append(subjectVar).append(",");
        sb.append("contentVar").append("=").append(contentVar);
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
