package kr.re.kitech.biz.sup.tlt.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptDisPatchPrcondExp")
public class SptDisPatchPrcondVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptDisPatchPrcondVo(){
  }

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;
  
    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;
    
    @ElDtoField(logicalName = "destSyspayno", physicalName = "dest_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dest_syspayno;
  
    @ElDtoField(logicalName = "destNm", physicalName = "dest_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dest_nm;
  
    @ElDtoField(logicalName = "destPhone", physicalName = "dest_phone", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dest_phone;
  
    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;
    
    @ElDtoField(logicalName = "sendType_01", physicalName = "send_type_01", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean send_type_01 = false;
    
    @ElDtoField(logicalName = "sendType_02", physicalName = "send_type_02", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean send_type_02 = false;
    
    @ElDtoField(logicalName = "sendType_03", physicalName = "send_type_03", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean send_type_03 = false;
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
  
    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }
  
    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "dest_syspayno")
    public String getDest_syspayno(){
        return dest_syspayno;
    }
  
    @ElVoField(physicalName = "dest_syspayno")
    public void setDest_syspayno(String dest_syspayno){
        this.dest_syspayno = dest_syspayno;
    }
  
    @ElVoField(physicalName = "dest_nm")
    public String getDest_nm(){
        return dest_nm;
    }
  
    @ElVoField(physicalName = "dest_nm")
    public void setDest_nm(String dest_nm){
        this.dest_nm = dest_nm;
    }
  
    @ElVoField(physicalName = "dest_phone")
    public String getDest_phone(){
        return dest_phone;
    }
  
    @ElVoField(physicalName = "dest_phone")
    public void setDest_phone(String dest_phone){
        this.dest_phone = dest_phone;
    }
  
    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }
  
    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }
    
    @ElVoField(physicalName = "send_type_01")
    public boolean getSend_type_01(){
    	return send_type_01;
    }
    
    @ElVoField(physicalName = "send_type_01")
    public void setSend_type_01(boolean send_type_01){
    	this.send_type_01 = send_type_01;
    }
    
    @ElVoField(physicalName = "send_type_02")
    public boolean getSend_type_02(){
    	return send_type_02;
    }
    
    @ElVoField(physicalName = "send_type_02")
    public void setSend_type_02(boolean send_type_02){
    	this.send_type_02 = send_type_02;
    }
    
    @ElVoField(physicalName = "send_type_03")
    public boolean getSend_type_03(){
    	return send_type_03;
    }
    
    @ElVoField(physicalName = "send_type_03")
    public void setSend_type_03(boolean send_type_03){
    	this.send_type_03 = send_type_03;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptDisPatchPrcondVo [");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("cust_no").append("=").append(cust_no).append(",");
      sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
      sb.append("dest_syspayno").append("=").append(dest_syspayno).append(",");
      sb.append("dest_nm").append("=").append(dest_nm).append(",");
      sb.append("dest_phone").append("=").append(dest_phone).append(",");
      sb.append("email").append("=").append(email).append(",");
      sb.append("send_type_01").append("=").append(email).append(",");
      sb.append("send_type_02").append("=").append(email).append(",");
      sb.append("send_type_03").append("=").append(email);
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