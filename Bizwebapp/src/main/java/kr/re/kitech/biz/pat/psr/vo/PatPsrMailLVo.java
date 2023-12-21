package kr.re.kitech.biz.pat.psr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPsrMailLExp")
public class PatPsrMailLVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPsrMailLVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "mailId", physicalName = "mail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_id;
  
    @ElDtoField(logicalName = "sendName", physicalName = "send_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_name;
  
    @ElDtoField(logicalName = "mailSubject", physicalName = "mail_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_subject;
  
    @ElDtoField(logicalName = "sendDate", physicalName = "send_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_date;
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "mail_id")
    public String getMail_id(){
        return mail_id;
    }
  
    @ElVoField(physicalName = "mail_id")
    public void setMail_id(String mail_id){
        this.mail_id = mail_id;
    }
  
    @ElVoField(physicalName = "send_name")
    public String getSend_name(){
        return send_name;
    }
  
    @ElVoField(physicalName = "send_name")
    public void setSend_name(String send_name){
        this.send_name = send_name;
    }
  
    @ElVoField(physicalName = "mail_subject")
    public String getMail_subject(){
        return mail_subject;
    }
  
    @ElVoField(physicalName = "mail_subject")
    public void setMail_subject(String mail_subject){
        this.mail_subject = mail_subject;
    }
  
    @ElVoField(physicalName = "send_date")
    public String getSend_date(){
        return send_date;
    }
  
    @ElVoField(physicalName = "send_date")
    public void setSend_date(String send_date){
        this.send_date = send_date;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPsrMailLVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("mail_id").append("=").append(mail_id).append(",");
      sb.append("send_name").append("=").append(send_name).append(",");
      sb.append("mail_subject").append("=").append(mail_subject).append(",");
      sb.append("send_date").append("=").append(send_date);
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