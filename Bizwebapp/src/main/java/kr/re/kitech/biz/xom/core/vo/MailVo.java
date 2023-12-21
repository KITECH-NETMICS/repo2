package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메일 Vo")
public class MailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public MailVo(){
    }

    @ElDtoField(logicalName = "제목", physicalName = "subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String subject;

    @ElDtoField(logicalName = "내용", physicalName = "content", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String content;

    @ElDtoField(logicalName = "보낸사람주소", physicalName = "fromAddr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String fromAddr;

    @ElDtoField(logicalName = "받는사람", physicalName = "toAddr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String toAddr;

    @ElDtoField(logicalName = "참조", physicalName = "ccAddr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ccAddr;

    @ElDtoField(logicalName = "숨은참조", physicalName = "bccAddr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bccAddr;

    @ElDtoField(logicalName = "편지함저장여부", physicalName = "savesent", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "받은편지함 저장 여부", attr = "")
    private boolean savesent;

    @ElDtoField(logicalName = "일괄발송여부", physicalName = "onesend", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "일괄발송여부", attr = "")
    private boolean onesend;

    @ElDtoField(logicalName = "로그저장여부", physicalName = "logging", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "로그저장 여부", attr = "")
    private boolean logging;

    @ElDtoField(logicalName = "업무구분", physicalName = "business", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String business;

    @ElDtoField(logicalName = "템플릿경로", physicalName = "templatePath", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String templatePath;

    @ElDtoField(logicalName = "메일템플릿 Vo", physicalName = "templateVars", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.MailTemplateVo> templateVars;

    @ElVoField(physicalName = "subject")
    public String getSubject(){
        String ret = this.subject;
        return ret;
    }

    @ElVoField(physicalName = "subject")
    public void setSubject(String subject){
        this.subject = subject;
    }

    @ElVoField(physicalName = "content")
    public String getContent(){
        String ret = this.content;
        return ret;
    }

    @ElVoField(physicalName = "content")
    public void setContent(String content){
        this.content = content;
    }

    @ElVoField(physicalName = "fromAddr")
    public String getFromAddr(){
        String ret = this.fromAddr;
        return ret;
    }

    @ElVoField(physicalName = "fromAddr")
    public void setFromAddr(String fromAddr){
        this.fromAddr = fromAddr;
    }

    @ElVoField(physicalName = "toAddr")
    public String getToAddr(){
        String ret = this.toAddr;
        return ret;
    }

    @ElVoField(physicalName = "toAddr")
    public void setToAddr(String toAddr){
        this.toAddr = toAddr;
    }

    @ElVoField(physicalName = "ccAddr")
    public String getCcAddr(){
        String ret = this.ccAddr;
        return ret;
    }

    @ElVoField(physicalName = "ccAddr")
    public void setCcAddr(String ccAddr){
        this.ccAddr = ccAddr;
    }

    @ElVoField(physicalName = "bccAddr")
    public String getBccAddr(){
        String ret = this.bccAddr;
        return ret;
    }

    @ElVoField(physicalName = "bccAddr")
    public void setBccAddr(String bccAddr){
        this.bccAddr = bccAddr;
    }

    @ElVoField(physicalName = "savesent")
    public boolean isSavesent(){
        return savesent;
    }

    @ElVoField(physicalName = "savesent")
    public void setSavesent(boolean savesent){
        this.savesent = savesent;
    }

    @ElVoField(physicalName = "onesend")
    public boolean isOnesend(){
        return onesend;
    }

    @ElVoField(physicalName = "onesend")
    public void setOnesend(boolean onesend){
        this.onesend = onesend;
    }

    @ElVoField(physicalName = "logging")
    public boolean isLogging(){
        return logging;
    }

    @ElVoField(physicalName = "logging")
    public void setLogging(boolean logging){
        this.logging = logging;
    }

    @ElVoField(physicalName = "business")
    public String getBusiness(){
        String ret = this.business;
        return ret;
    }

    @ElVoField(physicalName = "business")
    public void setBusiness(String business){
        this.business = business;
    }

    @ElVoField(physicalName = "templatePath")
    public String getTemplatePath(){
        String ret = this.templatePath;
        return ret;
    }

    @ElVoField(physicalName = "templatePath")
    public void setTemplatePath(String templatePath){
        this.templatePath = templatePath;
    }

    @ElVoField(physicalName = "templateVars")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.MailTemplateVo> getTemplateVars(){
        return templateVars;
    }

    @ElVoField(physicalName = "templateVars")
    public void setTemplateVars(java.util.List<kr.re.kitech.biz.xom.core.vo.MailTemplateVo> templateVars){
        this.templateVars = templateVars;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailVo [");
        sb.append("subject").append("=").append(subject).append(",");
        sb.append("content").append("=").append(content).append(",");
        sb.append("fromAddr").append("=").append(fromAddr).append(",");
        sb.append("toAddr").append("=").append(toAddr).append(",");
        sb.append("ccAddr").append("=").append(ccAddr).append(",");
        sb.append("bccAddr").append("=").append(bccAddr).append(",");
        sb.append("savesent").append("=").append(savesent).append(",");
        sb.append("onesend").append("=").append(onesend).append(",");
        sb.append("logging").append("=").append(logging).append(",");
        sb.append("business").append("=").append(business).append(",");
        sb.append("templatePath").append("=").append(templatePath).append(",");
        sb.append("templateVars").append("=").append(templateVars);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; templateVars != null && i < templateVars.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.MailTemplateVo vo = (kr.re.kitech.biz.xom.core.vo.MailTemplateVo)templateVars.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; templateVars != null && i < templateVars.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.MailTemplateVo vo = (kr.re.kitech.biz.xom.core.vo.MailTemplateVo)templateVars.get(i);
            vo._xStreamDec();	 
        }
    }


}
