package kr.re.kitech.biz.sup.edu.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTechEducReqdBugtExp")
public class SptTechEducReqdBugtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptTechEducReqdBugtVo(){
  }

    @ElDtoField(logicalName = "bizClsf", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "bizClsfNm", physicalName = "biz_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf_nm;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "accntNoNm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;
  
    @ElDtoField(logicalName = "reqdAmt", physicalName = "reqd_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqd_amt;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }
  
    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "biz_clsf_nm")
    public String getBiz_clsf_nm(){
        return biz_clsf_nm;
    }
  
    @ElVoField(physicalName = "biz_clsf_nm")
    public void setBiz_clsf_nm(String biz_clsf_nm){
        this.biz_clsf_nm = biz_clsf_nm;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }
  
    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }
  
    @ElVoField(physicalName = "reqd_amt")
    public String getReqd_amt(){
        return reqd_amt;
    }
  
    @ElVoField(physicalName = "reqd_amt")
    public void setReqd_amt(String reqd_amt){
        this.reqd_amt = reqd_amt;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptTechEducReqdBugtVo [");
      sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("biz_clsf_nm").append("=").append(biz_clsf_nm).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
      sb.append("reqd_amt").append("=").append(reqd_amt).append(",");
      sb.append("rmk").append("=").append(rmk);
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