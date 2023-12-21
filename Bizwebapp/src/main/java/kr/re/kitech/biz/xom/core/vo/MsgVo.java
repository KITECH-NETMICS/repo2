package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메시지 Vo")
public class MsgVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public MsgVo(){
    }

    @ElDtoField(logicalName = "메시지타입", physicalName = "msgType", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int msgType;

    @ElDtoField(logicalName = "메시지ID", physicalName = "cmid", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long cmid;

    @ElDtoField(logicalName = "요청시각", physicalName = "requestTime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String requestTime;

    @ElDtoField(logicalName = "발송시각", physicalName = "sendTime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sendTime;

    @ElDtoField(logicalName = "수신자번호", physicalName = "destPhone", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String destPhone;

    @ElDtoField(logicalName = "수신자명", physicalName = "destName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String destName;

    @ElDtoField(logicalName = "수신자사번", physicalName = "destSyspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String destSyspayno;

    @ElDtoField(logicalName = "발신자번호", physicalName = "sendPhone", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sendPhone;

    @ElDtoField(logicalName = "발신자명", physicalName = "sendName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sendName;

    @ElDtoField(logicalName = "발신자사번", physicalName = "sendSyspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sendSyspayno;

    @ElDtoField(logicalName = "업무여부", physicalName = "businessYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String businessYn;

    @ElDtoField(logicalName = "제목", physicalName = "subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String subject;

    @ElDtoField(logicalName = "MMS첨부파일", physicalName = "attachedFile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attachedFile;

    @ElDtoField(logicalName = "본문", physicalName = "msgBody", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String msgBody;

    @ElDtoField(logicalName = "발신자키", physicalName = "senderKey", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String senderKey;

    @ElDtoField(logicalName = "국가코드", physicalName = "nationCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nationCode;

    @ElDtoField(logicalName = "템플릿코드", physicalName = "templateCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String templateCode;

    @ElDtoField(logicalName = "재발송타입", physicalName = "reType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reType;

    @ElDtoField(logicalName = "재발송본문", physicalName = "reBody", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reBody;

    @ElDtoField(logicalName = "업무구분", physicalName = "business", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String business;

    @ElDtoField(logicalName = "메시지구분", physicalName = "messages", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String messages;

    @ElDtoField(logicalName = "로그저장여부", physicalName = "logging", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "로그저장 여부", attr = "")
    private boolean logging;

    @ElDtoField(logicalName = "메시지템플릿 Vo", physicalName = "templateVars", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.MsgTemplateVo> templateVars;

    @ElVoField(physicalName = "msgType")
    public int getMsgType(){
        return msgType;
    }

    @ElVoField(physicalName = "msgType")
    public void setMsgType(int msgType){
        this.msgType = msgType;
    }

    @ElVoField(physicalName = "cmid")
    public long getCmid(){
        return cmid;
    }

    @ElVoField(physicalName = "cmid")
    public void setCmid(long cmid){
        this.cmid = cmid;
    }

    @ElVoField(physicalName = "requestTime")
    public String getRequestTime(){
        String ret = this.requestTime;
        return ret;
    }

    @ElVoField(physicalName = "requestTime")
    public void setRequestTime(String requestTime){
        this.requestTime = requestTime;
    }

    @ElVoField(physicalName = "sendTime")
    public String getSendTime(){
        String ret = this.sendTime;
        return ret;
    }

    @ElVoField(physicalName = "sendTime")
    public void setSendTime(String sendTime){
        this.sendTime = sendTime;
    }

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

    @ElVoField(physicalName = "sendPhone")
    public String getSendPhone(){
        String ret = this.sendPhone;
        return ret;
    }

    @ElVoField(physicalName = "sendPhone")
    public void setSendPhone(String sendPhone){
        this.sendPhone = sendPhone;
    }

    @ElVoField(physicalName = "sendName")
    public String getSendName(){
        String ret = this.sendName;
        return ret;
    }

    @ElVoField(physicalName = "sendName")
    public void setSendName(String sendName){
        this.sendName = sendName;
    }

    @ElVoField(physicalName = "sendSyspayno")
    public String getSendSyspayno(){
        String ret = this.sendSyspayno;
        return ret;
    }

    @ElVoField(physicalName = "sendSyspayno")
    public void setSendSyspayno(String sendSyspayno){
        this.sendSyspayno = sendSyspayno;
    }

    @ElVoField(physicalName = "businessYn")
    public String getBusinessYn(){
        String ret = this.businessYn;
        return ret;
    }

    @ElVoField(physicalName = "businessYn")
    public void setBusinessYn(String businessYn){
        this.businessYn = businessYn;
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

    @ElVoField(physicalName = "attachedFile")
    public String getAttachedFile(){
        String ret = this.attachedFile;
        return ret;
    }

    @ElVoField(physicalName = "attachedFile")
    public void setAttachedFile(String attachedFile){
        this.attachedFile = attachedFile;
    }

    @ElVoField(physicalName = "msgBody")
    public String getMsgBody(){
        String ret = this.msgBody;
        return ret;
    }

    @ElVoField(physicalName = "msgBody")
    public void setMsgBody(String msgBody){
        this.msgBody = msgBody;
    }

    @ElVoField(physicalName = "senderKey")
    public String getSenderKey(){
        String ret = this.senderKey;
        return ret;
    }

    @ElVoField(physicalName = "senderKey")
    public void setSenderKey(String senderKey){
        this.senderKey = senderKey;
    }

    @ElVoField(physicalName = "nationCode")
    public String getNationCode(){
        String ret = this.nationCode;
        return ret;
    }

    @ElVoField(physicalName = "nationCode")
    public void setNationCode(String nationCode){
        this.nationCode = nationCode;
    }

    @ElVoField(physicalName = "templateCode")
    public String getTemplateCode(){
        String ret = this.templateCode;
        return ret;
    }

    @ElVoField(physicalName = "templateCode")
    public void setTemplateCode(String templateCode){
        this.templateCode = templateCode;
    }

    @ElVoField(physicalName = "reType")
    public String getReType(){
        String ret = this.reType;
        return ret;
    }

    @ElVoField(physicalName = "reType")
    public void setReType(String reType){
        this.reType = reType;
    }

    @ElVoField(physicalName = "reBody")
    public String getReBody(){
        String ret = this.reBody;
        return ret;
    }

    @ElVoField(physicalName = "reBody")
    public void setReBody(String reBody){
        this.reBody = reBody;
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

    @ElVoField(physicalName = "messages")
    public String getMessages(){
        String ret = this.messages;
        return ret;
    }

    @ElVoField(physicalName = "messages")
    public void setMessages(String messages){
        this.messages = messages;
    }

    @ElVoField(physicalName = "logging")
    public boolean isLogging(){
        return logging;
    }

    @ElVoField(physicalName = "logging")
    public void setLogging(boolean logging){
        this.logging = logging;
    }

    @ElVoField(physicalName = "templateVars")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.MsgTemplateVo> getTemplateVars(){
        return templateVars;
    }

    @ElVoField(physicalName = "templateVars")
    public void setTemplateVars(java.util.List<kr.re.kitech.biz.xom.core.vo.MsgTemplateVo> templateVars){
        this.templateVars = templateVars;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MsgVo [");
        sb.append("msgType").append("=").append(msgType).append(",");
        sb.append("cmid").append("=").append(cmid).append(",");
        sb.append("requestTime").append("=").append(requestTime).append(",");
        sb.append("sendTime").append("=").append(sendTime).append(",");
        sb.append("destPhone").append("=").append(destPhone).append(",");
        sb.append("destName").append("=").append(destName).append(",");
        sb.append("destSyspayno").append("=").append(destSyspayno).append(",");
        sb.append("sendPhone").append("=").append(sendPhone).append(",");
        sb.append("sendName").append("=").append(sendName).append(",");
        sb.append("sendSyspayno").append("=").append(sendSyspayno).append(",");
        sb.append("businessYn").append("=").append(businessYn).append(",");
        sb.append("subject").append("=").append(subject).append(",");
        sb.append("attachedFile").append("=").append(attachedFile).append(",");
        sb.append("msgBody").append("=").append(msgBody).append(",");
        sb.append("senderKey").append("=").append(senderKey).append(",");
        sb.append("nationCode").append("=").append(nationCode).append(",");
        sb.append("templateCode").append("=").append(templateCode).append(",");
        sb.append("reType").append("=").append(reType).append(",");
        sb.append("reBody").append("=").append(reBody).append(",");
        sb.append("business").append("=").append(business).append(",");
        sb.append("messages").append("=").append(messages).append(",");
        sb.append("logging").append("=").append(logging).append(",");
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
            kr.re.kitech.biz.xom.core.vo.MsgTemplateVo vo = (kr.re.kitech.biz.xom.core.vo.MsgTemplateVo)templateVars.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; templateVars != null && i < templateVars.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.MsgTemplateVo vo = (kr.re.kitech.biz.xom.core.vo.MsgTemplateVo)templateVars.get(i);
            vo._xStreamDec();	 
        }
    }


}
