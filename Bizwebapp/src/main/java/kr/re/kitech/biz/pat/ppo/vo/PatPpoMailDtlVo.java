package kr.re.kitech.biz.pat.ppo.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPpoMailDtlExp")
public class PatPpoMailDtlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPpoMailDtlVo(){
  }

    @ElDtoField(logicalName = "mailId", physicalName = "mail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_id;
  
    @ElDtoField(logicalName = "mailSubject", physicalName = "mail_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_subject;
  
    @ElDtoField(logicalName = "mailContents", physicalName = "mail_contents", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_contents;
  
    @ElDtoField(logicalName = "mailRecvId", physicalName = "mail_recv_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_recv_id;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;
  
    @ElVoField(physicalName = "mail_id")
    public String getMail_id(){
        return mail_id;
    }
  
    @ElVoField(physicalName = "mail_id")
    public void setMail_id(String mail_id){
        this.mail_id = mail_id;
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
  
    @ElVoField(physicalName = "mail_recv_id")
    public String getMail_recv_id(){
        return mail_recv_id;
    }
  
    @ElVoField(physicalName = "mail_recv_id")
    public void setMail_recv_id(String mail_recv_id){
        this.mail_recv_id = mail_recv_id;
    }
  
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }
  
    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }
  
    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPpoMailDtlVo [");
      sb.append("mail_id").append("=").append(mail_id).append(",");
      sb.append("mail_subject").append("=").append(mail_subject).append(",");
      sb.append("mail_contents").append("=").append(mail_contents).append(",");
      sb.append("mail_recv_id").append("=").append(mail_recv_id).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("email").append("=").append(email).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("mobile").append("=").append(mobile);
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