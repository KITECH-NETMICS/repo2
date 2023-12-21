package kr.re.kitech.biz.pat.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 메일 수신자 Vo")
public class PatSMSRecvVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatSMSRecvVo(){
    }

    @ElDtoField(logicalName = "SMS ID", physicalName = "sms_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sms_id;

    @ElDtoField(logicalName = "순번", physicalName = "recv_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int recv_seq;

    @ElDtoField(logicalName = "수신자 번호", physicalName = "recv_number", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_number;

    @ElDtoField(logicalName = "수신자 성명", physicalName = "recv_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_name;

    @ElDtoField(logicalName = "수신자 id", physicalName = "recv_person_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_person_id;

    @ElVoField(physicalName = "sms_id")
    public String getSms_id(){
        return sms_id;
    }

    @ElVoField(physicalName = "sms_id")
    public void setSms_id(String sms_id){
        this.sms_id = sms_id;
    }

    @ElVoField(physicalName = "recv_seq")
    public int getRecv_seq(){
        return recv_seq;
    }

    @ElVoField(physicalName = "recv_seq")
    public void setRecv_seq(int recv_seq){
        this.recv_seq = recv_seq;
    }

    @ElVoField(physicalName = "recv_number")
    public String getRecv_number(){
        return recv_number;
    }

    @ElVoField(physicalName = "recv_number")
    public void setRecv_number(String recv_number){
        this.recv_number = recv_number;
    }

    @ElVoField(physicalName = "recv_name")
    public String getRecv_name(){
        return recv_name;
    }

    @ElVoField(physicalName = "recv_name")
    public void setRecv_name(String recv_name){
        this.recv_name = recv_name;
    }

    @ElVoField(physicalName = "recv_person_id")
    public String getRecv_person_id(){
        return recv_person_id;
    }

    @ElVoField(physicalName = "recv_person_id")
    public void setRecv_person_id(String recv_person_id){
        this.recv_person_id = recv_person_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatSMSRecvVo [");
        sb.append("sms_id").append("=").append(sms_id).append(",");
        sb.append("recv_seq").append("=").append(recv_seq).append(",");
        sb.append("recv_number").append("=").append(recv_number).append(",");
        sb.append("recv_name").append("=").append(recv_name).append(",");
        sb.append("recv_person_id").append("=").append(recv_person_id);
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
