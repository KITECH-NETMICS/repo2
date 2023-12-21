package kr.re.kitech.biz.pat.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 메일 수신자 Vo")
public class PatMailRecvVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatMailRecvVo(){
    }

    @ElDtoField(logicalName = "메일 ID", physicalName = "mail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_id;

    @ElDtoField(logicalName = "순번", physicalName = "recv_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int recv_seq;

    @ElDtoField(logicalName = "수신타입", physicalName = "recv_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_type;

    @ElDtoField(logicalName = "수신자 메일", physicalName = "recv_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_addr;

    @ElDtoField(logicalName = "수신자 성명", physicalName = "recv_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_name;

    @ElDtoField(logicalName = "수신자 id", physicalName = "recv_person_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_person_id;

    @ElVoField(physicalName = "mail_id")
    public String getMail_id(){
        return mail_id;
    }

    @ElVoField(physicalName = "mail_id")
    public void setMail_id(String mail_id){
        this.mail_id = mail_id;
    }

    @ElVoField(physicalName = "recv_seq")
    public int getRecv_seq(){
        return recv_seq;
    }

    @ElVoField(physicalName = "recv_seq")
    public void setRecv_seq(int recv_seq){
        this.recv_seq = recv_seq;
    }

    @ElVoField(physicalName = "recv_type")
    public String getRecv_type(){
        return recv_type;
    }

    @ElVoField(physicalName = "recv_type")
    public void setRecv_type(String recv_type){
        this.recv_type = recv_type;
    }

    @ElVoField(physicalName = "recv_addr")
    public String getRecv_addr(){
        return recv_addr;
    }

    @ElVoField(physicalName = "recv_addr")
    public void setRecv_addr(String recv_addr){
        this.recv_addr = recv_addr;
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
        sb.append("PatMailRecvVo [");
        sb.append("mail_id").append("=").append(mail_id).append(",");
        sb.append("recv_seq").append("=").append(recv_seq).append(",");
        sb.append("recv_type").append("=").append(recv_type).append(",");
        sb.append("recv_addr").append("=").append(recv_addr).append(",");
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
