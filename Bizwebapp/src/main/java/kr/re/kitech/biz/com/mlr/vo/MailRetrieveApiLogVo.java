package kr.re.kitech.biz.com.mlr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "MailRetrieveApiLogExp")
public class MailRetrieveApiLogVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public MailRetrieveApiLogVo(){
    }

    @ElDtoField(logicalName = "ymdStart", physicalName = "ymd_start", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd_start;

    @ElDtoField(logicalName = "ymdClose", physicalName = "ymd_close", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd_close;

    @ElDtoField(logicalName = "mailSubject", physicalName = "mail_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_subject;

    @ElDtoField(logicalName = "isMailRetrieve", physicalName = "is_mail_retrieve", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_mail_retrieve;

    @ElDtoField(logicalName = "seqNo", physicalName = "seq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq_no;

    @ElDtoField(logicalName = "subject", physicalName = "subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subject;

    @ElDtoField(logicalName = "fromAddress", physicalName = "from_address", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_address;

    @ElDtoField(logicalName = "toAddress", physicalName = "to_address", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_address;

    @ElDtoField(logicalName = "ccAddress", physicalName = "cc_address", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cc_address;

    @ElDtoField(logicalName = "bccAddress", physicalName = "bcc_address", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bcc_address;

    @ElDtoField(logicalName = "templatePath", physicalName = "template_path", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String template_path;

    @ElDtoField(logicalName = "isSuccess", physicalName = "is_success", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_success;

    @ElDtoField(logicalName = "sysclsfCd", physicalName = "sysclsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sysclsf_cd;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "mimemessageid", physicalName = "mimemessageid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mimemessageid;

    @ElDtoField(logicalName = "retrieveIsSuccess", physicalName = "retrieve_is_success", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrieve_is_success;

    @ElVoField(physicalName = "ymd_start")
    public String getYmd_start(){
        return ymd_start;
    }

    @ElVoField(physicalName = "ymd_start")
    public void setYmd_start(String ymd_start){
        this.ymd_start = ymd_start;
    }

    @ElVoField(physicalName = "ymd_close")
    public String getYmd_close(){
        return ymd_close;
    }

    @ElVoField(physicalName = "ymd_close")
    public void setYmd_close(String ymd_close){
        this.ymd_close = ymd_close;
    }

    @ElVoField(physicalName = "mail_subject")
    public String getMail_subject(){
        return mail_subject;
    }

    @ElVoField(physicalName = "mail_subject")
    public void setMail_subject(String mail_subject){
        this.mail_subject = mail_subject;
    }

    @ElVoField(physicalName = "is_mail_retrieve")
    public String getIs_mail_retrieve(){
        return is_mail_retrieve;
    }

    @ElVoField(physicalName = "is_mail_retrieve")
    public void setIs_mail_retrieve(String is_mail_retrieve){
        this.is_mail_retrieve = is_mail_retrieve;
    }

    @ElVoField(physicalName = "seq_no")
    public String getSeq_no(){
        return seq_no;
    }

    @ElVoField(physicalName = "seq_no")
    public void setSeq_no(String seq_no){
        this.seq_no = seq_no;
    }

    @ElVoField(physicalName = "subject")
    public String getSubject(){
        return subject;
    }

    @ElVoField(physicalName = "subject")
    public void setSubject(String subject){
        this.subject = subject;
    }

    @ElVoField(physicalName = "from_address")
    public String getFrom_address(){
        return from_address;
    }

    @ElVoField(physicalName = "from_address")
    public void setFrom_address(String from_address){
        this.from_address = from_address;
    }

    @ElVoField(physicalName = "to_address")
    public String getTo_address(){
        return to_address;
    }

    @ElVoField(physicalName = "to_address")
    public void setTo_address(String to_address){
        this.to_address = to_address;
    }

    @ElVoField(physicalName = "cc_address")
    public String getCc_address(){
        return cc_address;
    }

    @ElVoField(physicalName = "cc_address")
    public void setCc_address(String cc_address){
        this.cc_address = cc_address;
    }

    @ElVoField(physicalName = "bcc_address")
    public String getBcc_address(){
        return bcc_address;
    }

    @ElVoField(physicalName = "bcc_address")
    public void setBcc_address(String bcc_address){
        this.bcc_address = bcc_address;
    }

    @ElVoField(physicalName = "template_path")
    public String getTemplate_path(){
        return template_path;
    }

    @ElVoField(physicalName = "template_path")
    public void setTemplate_path(String template_path){
        this.template_path = template_path;
    }

    @ElVoField(physicalName = "is_success")
    public String getIs_success(){
        return is_success;
    }

    @ElVoField(physicalName = "is_success")
    public void setIs_success(String is_success){
        this.is_success = is_success;
    }

    @ElVoField(physicalName = "sysclsf_cd")
    public String getSysclsf_cd(){
        return sysclsf_cd;
    }

    @ElVoField(physicalName = "sysclsf_cd")
    public void setSysclsf_cd(String sysclsf_cd){
        this.sysclsf_cd = sysclsf_cd;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "mimemessageid")
    public String getMimemessageid(){
        return mimemessageid;
    }

    @ElVoField(physicalName = "mimemessageid")
    public void setMimemessageid(String mimemessageid){
        this.mimemessageid = mimemessageid;
    }

    @ElVoField(physicalName = "retrieve_is_success")
    public String getRetrieve_is_success(){
        return retrieve_is_success;
    }

    @ElVoField(physicalName = "retrieve_is_success")
    public void setRetrieve_is_success(String retrieve_is_success){
        this.retrieve_is_success = retrieve_is_success;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailRetrieveApiLogVo [");
        sb.append("ymd_start").append("=").append(ymd_start).append(",");
        sb.append("ymd_close").append("=").append(ymd_close).append(",");
        sb.append("mail_subject").append("=").append(mail_subject).append(",");
        sb.append("is_mail_retrieve").append("=").append(is_mail_retrieve).append(",");
        sb.append("seq_no").append("=").append(seq_no).append(",");
        sb.append("subject").append("=").append(subject).append(",");
        sb.append("from_address").append("=").append(from_address).append(",");
        sb.append("to_address").append("=").append(to_address).append(",");
        sb.append("cc_address").append("=").append(cc_address).append(",");
        sb.append("bcc_address").append("=").append(bcc_address).append(",");
        sb.append("template_path").append("=").append(template_path).append(",");
        sb.append("is_success").append("=").append(is_success).append(",");
        sb.append("sysclsf_cd").append("=").append(sysclsf_cd).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("mimemessageid").append("=").append(mimemessageid).append(",");
        sb.append("retrieve_is_success").append("=").append(retrieve_is_success);
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
