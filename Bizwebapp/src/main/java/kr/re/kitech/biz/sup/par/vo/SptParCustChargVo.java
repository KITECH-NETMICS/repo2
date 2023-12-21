package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptCustChargExp")
public class SptParCustChargVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptParCustChargVo(){
  }

    @ElDtoField(logicalName = "appontNo", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;
    
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElDtoField(logicalName = "affairRespnPsn", physicalName = "affair_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn;
  
    @ElDtoField(logicalName = "affairRespnPsnDept", physicalName = "affair_respn_psn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_dept;
  
    @ElDtoField(logicalName = "affairRespnPsnTel", physicalName = "affair_respn_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_tel;
  
    @ElDtoField(logicalName = "affairRespnPsnMobileNo", physicalName = "affair_respn_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_mobile_no;
  
    @ElDtoField(logicalName = "affairRespnPsnEmail", physicalName = "affair_respn_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_email;
  
    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;
  
    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }
  
    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }
    
    @ElVoField(physicalName = "seq")
    public String getSeq(){
    	return seq;
    }
    
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
    	this.seq = seq;
    }
  
    @ElVoField(physicalName = "affair_respn_psn")
    public String getAffair_respn_psn(){
        return affair_respn_psn;
    }
  
    @ElVoField(physicalName = "affair_respn_psn")
    public void setAffair_respn_psn(String affair_respn_psn){
        this.affair_respn_psn = affair_respn_psn;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_dept")
    public String getAffair_respn_psn_dept(){
        return affair_respn_psn_dept;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_dept")
    public void setAffair_respn_psn_dept(String affair_respn_psn_dept){
        this.affair_respn_psn_dept = affair_respn_psn_dept;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_tel")
    public String getAffair_respn_psn_tel(){
        return affair_respn_psn_tel;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_tel")
    public void setAffair_respn_psn_tel(String affair_respn_psn_tel){
        this.affair_respn_psn_tel = affair_respn_psn_tel;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_mobile_no")
    public String getAffair_respn_psn_mobile_no(){
        return affair_respn_psn_mobile_no;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_mobile_no")
    public void setAffair_respn_psn_mobile_no(String affair_respn_psn_mobile_no){
        this.affair_respn_psn_mobile_no = affair_respn_psn_mobile_no;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_email")
    public String getAffair_respn_psn_email(){
        return affair_respn_psn_email;
    }
  
    @ElVoField(physicalName = "affair_respn_psn_email")
    public void setAffair_respn_psn_email(String affair_respn_psn_email){
        this.affair_respn_psn_email = affair_respn_psn_email;
    }
  
    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }
  
    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptCustChargVo [");
      sb.append("appont_no").append("=").append(appont_no).append(",");
      sb.append("seq").append("=").append(seq).append(",");
      sb.append("cust_no").append("=").append(cust_no).append(",");
      sb.append("affair_respn_psn").append("=").append(affair_respn_psn).append(",");
      sb.append("affair_respn_psn_dept").append("=").append(affair_respn_psn_dept).append(",");
      sb.append("affair_respn_psn_tel").append("=").append(affair_respn_psn_tel).append(",");
      sb.append("affair_respn_psn_mobile_no").append("=").append(affair_respn_psn_mobile_no).append(",");
      sb.append("affair_respn_psn_email").append("=").append(affair_respn_psn_email);
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