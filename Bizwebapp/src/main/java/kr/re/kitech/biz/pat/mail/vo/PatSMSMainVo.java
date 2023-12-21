package kr.re.kitech.biz.pat.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 메일 Vo")
public class PatSMSMainVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatSMSMainVo(){
    }

    @ElDtoField(logicalName = "SMA ID", physicalName = "sms_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sms_id;

    @ElDtoField(logicalName = "발송 인원 ID", physicalName = "send_person_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_person_id;

    @ElDtoField(logicalName = "발송 번호", physicalName = "send_number", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_number;

    @ElDtoField(logicalName = "발송 이름", physicalName = "send_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_name;

    @ElDtoField(logicalName = "발송 상태", physicalName = "send_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_status;

    @ElDtoField(logicalName = "발송 제목", physicalName = "send_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_subject;

    @ElDtoField(logicalName = "발송 내용", physicalName = "send_contents", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_contents;

    @ElVoField(physicalName = "sms_id")
    public String getSms_id(){
        return sms_id;
    }

    @ElVoField(physicalName = "sms_id")
    public void setSms_id(String sms_id){
        this.sms_id = sms_id;
    }

    @ElVoField(physicalName = "send_person_id")
    public String getSend_person_id(){
        return send_person_id;
    }

    @ElVoField(physicalName = "send_person_id")
    public void setSend_person_id(String send_person_id){
        this.send_person_id = send_person_id;
    }

    @ElVoField(physicalName = "send_number")
    public String getSend_number(){
        return send_number;
    }

    @ElVoField(physicalName = "send_number")
    public void setSend_number(String send_number){
        this.send_number = send_number;
    }

    @ElVoField(physicalName = "send_name")
    public String getSend_name(){
        return send_name;
    }

    @ElVoField(physicalName = "send_name")
    public void setSend_name(String send_name){
        this.send_name = send_name;
    }

    @ElVoField(physicalName = "send_status")
    public String getSend_status(){
        return send_status;
    }

    @ElVoField(physicalName = "send_status")
    public void setSend_status(String send_status){
        this.send_status = send_status;
    }

    @ElVoField(physicalName = "send_subject")
    public String getSend_subject(){
        return send_subject;
    }

    @ElVoField(physicalName = "send_subject")
    public void setSend_subject(String send_subject){
        this.send_subject = send_subject;
    }

    @ElVoField(physicalName = "send_contents")
    public String getSend_contents(){
        return send_contents;
    }

    @ElVoField(physicalName = "send_contents")
    public void setSend_contents(String send_contents){
        this.send_contents = send_contents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatSMSMainVo [");
        sb.append("sms_id").append("=").append(sms_id).append(",");
        sb.append("send_person_id").append("=").append(send_person_id).append(",");
        sb.append("send_number").append("=").append(send_number).append(",");
        sb.append("send_name").append("=").append(send_name).append(",");
        sb.append("send_status").append("=").append(send_status).append(",");
        sb.append("send_subject").append("=").append(send_subject).append(",");
        sb.append("send_contents").append("=").append(send_contents);
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
