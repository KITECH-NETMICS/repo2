package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메시지템플릿 Vo")
public class MsgTemplateVo extends com.inswave.elfw.core.CommVO {
    private static final long serialVersionUID = 1L;

    public MsgTemplateVo(){
    }

    @ElDtoField(logicalName = "수신자번호", physicalName = "destPhone", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String destPhone;

    @ElDtoField(logicalName = "수신자명", physicalName = "destName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String destName;

    @ElDtoField(logicalName = "수신자사번", physicalName = "destSyspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String destSyspayno;

    @ElDtoField(logicalName = "제목", physicalName = "subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String subject;

    @ElDtoField(logicalName = "내용변수", physicalName = "contentVar", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.Map contentVar;

    @ElVoField(physicalName = "destPhone")
    public String getDestPhone(){
        String ret = this.destPhone;
        return ret;
    }

    @ElVoField(physicalName = "destPhone")
    public void setDestPhone(String destPhone){
        this.destPhone = destPhone;
    }

    @ElVoField(physicalName = "destName")
    public String getDestName(){
        String ret = this.destName;
        return ret;
    }

    @ElVoField(physicalName = "destName")
    public void setDestName(String destName){
        this.destName = destName;
    }

    @ElVoField(physicalName = "destSyspayno")
    public String getDestSyspayno(){
        String ret = this.destSyspayno;
        return ret;
    }

    @ElVoField(physicalName = "destSyspayno")
    public void setDestSyspayno(String destSyspayno){
        this.destSyspayno = destSyspayno;
    }

    @ElVoField(physicalName = "subject")
    public String getSubject(){
        String ret = this.subject;
        return ret;
    }

    @ElVoField(physicalName = "subject")
    public void setSubject(String subject){
        this.subject = subject;
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
        sb.append("MsgTemplateVo [");
        sb.append("destPhone").append("=").append(destPhone).append(",");
        sb.append("destName").append("=").append(destName).append(",");
        sb.append("destSyspayno").append("=").append(destSyspayno).append(",");
        sb.append("subject").append("=").append(subject).append(",");
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
