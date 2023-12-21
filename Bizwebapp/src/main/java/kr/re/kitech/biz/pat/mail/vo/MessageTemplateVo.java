package kr.re.kitech.biz.pat.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메세지 Vo")
public class MessageTemplateVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public MessageTemplateVo(){
    }

    @ElDtoField(logicalName = "template_code", physicalName = "template_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String template_code;

    @ElDtoField(logicalName = "send_profile", physicalName = "send_profile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_profile;

    @ElDtoField(logicalName = "템플릿 상태", physicalName = "template_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String template_status;

    @ElDtoField(logicalName = "템플릿 이름", physicalName = "template_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String template_name;

    @ElDtoField(logicalName = "템플릿 내용", physicalName = "template_cont", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String template_cont;

    @ElDtoField(logicalName = "롤코드", physicalName = "role_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String role_code;

    @ElDtoField(logicalName = "업무분류", physicalName = "biz_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_kind;

    @ElVoField(physicalName = "template_code")
    public String getTemplate_code(){
        return template_code;
    }

    @ElVoField(physicalName = "template_code")
    public void setTemplate_code(String template_code){
        this.template_code = template_code;
    }

    @ElVoField(physicalName = "send_profile")
    public String getSend_profile(){
        return send_profile;
    }

    @ElVoField(physicalName = "send_profile")
    public void setSend_profile(String send_profile){
        this.send_profile = send_profile;
    }

    @ElVoField(physicalName = "template_status")
    public String getTemplate_status(){
        return template_status;
    }

    @ElVoField(physicalName = "template_status")
    public void setTemplate_status(String template_status){
        this.template_status = template_status;
    }

    @ElVoField(physicalName = "template_name")
    public String getTemplate_name(){
        return template_name;
    }

    @ElVoField(physicalName = "template_name")
    public void setTemplate_name(String template_name){
        this.template_name = template_name;
    }

    @ElVoField(physicalName = "template_cont")
    public String getTemplate_cont(){
        return template_cont;
    }

    @ElVoField(physicalName = "template_cont")
    public void setTemplate_cont(String template_cont){
        this.template_cont = template_cont;
    }

    @ElVoField(physicalName = "role_code")
    public String getRole_code(){
        return role_code;
    }

    @ElVoField(physicalName = "role_code")
    public void setRole_code(String role_code){
        this.role_code = role_code;
    }

    @ElVoField(physicalName = "biz_kind")
    public String getBiz_kind(){
        return biz_kind;
    }

    @ElVoField(physicalName = "biz_kind")
    public void setBiz_kind(String biz_kind){
        this.biz_kind = biz_kind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageTemplateVo [");
        sb.append("template_code").append("=").append(template_code).append(",");
        sb.append("send_profile").append("=").append(send_profile).append(",");
        sb.append("template_status").append("=").append(template_status).append(",");
        sb.append("template_name").append("=").append(template_name).append(",");
        sb.append("template_cont").append("=").append(template_cont).append(",");
        sb.append("role_code").append("=").append(role_code).append(",");
        sb.append("biz_kind").append("=").append(biz_kind);
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
