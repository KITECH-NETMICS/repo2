package kr.re.kitech.biz.pat.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 메일 Vo")
public class PatMailVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatMailVo(){
    }

    @ElDtoField(logicalName = "메일 ID", physicalName = "mail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_id;

    @ElDtoField(logicalName = "발송 인원 ID", physicalName = "send_person_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_person_id;

    @ElDtoField(logicalName = "발송 주소", physicalName = "send_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_addr;

    @ElDtoField(logicalName = "발송 이름", physicalName = "send_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_name;

    @ElDtoField(logicalName = "발송 구분", physicalName = "send_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_clsf;

    @ElDtoField(logicalName = "메일 제목", physicalName = "mail_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_subject;

    @ElDtoField(logicalName = "메일 내용", physicalName = "mail_contents", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_contents;

    @ElVoField(physicalName = "mail_id")
    public String getMail_id(){
        return mail_id;
    }

    @ElVoField(physicalName = "mail_id")
    public void setMail_id(String mail_id){
        this.mail_id = mail_id;
    }

    @ElVoField(physicalName = "send_person_id")
    public String getSend_person_id(){
        return send_person_id;
    }

    @ElVoField(physicalName = "send_person_id")
    public void setSend_person_id(String send_person_id){
        this.send_person_id = send_person_id;
    }

    @ElVoField(physicalName = "send_addr")
    public String getSend_addr(){
        return send_addr;
    }

    @ElVoField(physicalName = "send_addr")
    public void setSend_addr(String send_addr){
        this.send_addr = send_addr;
    }

    @ElVoField(physicalName = "send_name")
    public String getSend_name(){
        return send_name;
    }

    @ElVoField(physicalName = "send_name")
    public void setSend_name(String send_name){
        this.send_name = send_name;
    }

    @ElVoField(physicalName = "send_clsf")
    public String getSend_clsf(){
        return send_clsf;
    }

    @ElVoField(physicalName = "send_clsf")
    public void setSend_clsf(String send_clsf){
        this.send_clsf = send_clsf;
    }

    @ElVoField(physicalName = "mail_subject")
    public String getMail_subject(){
        return mail_subject;
    }

    @ElVoField(physicalName = "mail_subject")
    public void setMail_subject(String mail_subject){
        this.mail_subject = mail_subject;
    }

    @ElVoField(physicalName = "mail_contents")
    public String getMail_contents(){
        return mail_contents;
    }

    @ElVoField(physicalName = "mail_contents")
    public void setMail_contents(String mail_contents){
        this.mail_contents = mail_contents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatMailVo [");
        sb.append("mail_id").append("=").append(mail_id).append(",");
        sb.append("send_person_id").append("=").append(send_person_id).append(",");
        sb.append("send_addr").append("=").append(send_addr).append(",");
        sb.append("send_name").append("=").append(send_name).append(",");
        sb.append("send_clsf").append("=").append(send_clsf).append(",");
        sb.append("mail_subject").append("=").append(mail_subject).append(",");
        sb.append("mail_contents").append("=").append(mail_contents);
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
