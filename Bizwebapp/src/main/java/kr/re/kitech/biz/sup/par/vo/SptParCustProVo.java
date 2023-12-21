package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptParCustProExp")
public class SptParCustProVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptParCustProVo(){
  }

    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;
    
    @ElDtoField(logicalName = "program", physicalName = "program", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String program;

    @ElDtoField(logicalName = "utillO", physicalName = "utill_o", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String utill_o;

    @ElDtoField(logicalName = "utillX", physicalName = "utill_x", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String utill_x;
  
    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }
  
    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }
    
    @ElVoField(physicalName = "program")
    public String getProgram(){
    	return program;
    }
    
    @ElVoField(physicalName = "program")
    public void setProgram(String program){
    	this.program = program;
    }
    
    @ElVoField(physicalName = "utill_o")
    public String getUtill_o(){
    	return utill_o;
    }
    
    @ElVoField(physicalName = "utill_o")
    public void setUtill_o(String utill_o){
    	this.utill_o = utill_o;
    }
    
    @ElVoField(physicalName = "utill_x")
    public String getUtill_x(){
    	return utill_x;
    }
    
    @ElVoField(physicalName = "utill_x")
    public void setUtill_x(String utill_x){
    	this.utill_x = utill_x;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptParCustProVo [");
      sb.append("utill_x").append("=").append(utill_x).append(",");
      sb.append("utill_o").append("=").append(utill_o).append(",");
      sb.append("program").append("=").append(program).append(",");
      sb.append("cust_no").append("=").append(cust_no);
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