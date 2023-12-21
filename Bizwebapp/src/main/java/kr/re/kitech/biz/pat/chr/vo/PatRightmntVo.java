package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatRightmntExp")
public class PatRightmntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRightmntVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "mntSeq", physicalName = "mnt_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mnt_seq;
  
    @ElDtoField(logicalName = "thsyearEvyearfeePayCloseYmd", physicalName = "thsyear_evyearfee_pay_close_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thsyear_evyearfee_pay_close_ymd;
  
    @ElDtoField(logicalName = "rightmntDiv", physicalName = "rightmnt_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rightmnt_div;
  
    @ElDtoField(logicalName = "rightmntDivNm", physicalName = "rightmnt_div_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rightmnt_div_nm;
  
    @ElDtoField(logicalName = "thsyearEvyearfeePayYmd", physicalName = "thsyear_evyearfee_pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thsyear_evyearfee_pay_ymd;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "unusualItem", physicalName = "unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unusual_item;
  
    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;
  
    @ElDtoField(logicalName = "governpayFee", physicalName = "governpay_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String governpay_fee;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;
  
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
  
    @ElVoField(physicalName = "mnt_seq")
    public String getMnt_seq(){
        return mnt_seq;
    }
  
    @ElVoField(physicalName = "mnt_seq")
    public void setMnt_seq(String mnt_seq){
        this.mnt_seq = mnt_seq;
    }
  
    @ElVoField(physicalName = "thsyear_evyearfee_pay_close_ymd")
    public String getThsyear_evyearfee_pay_close_ymd(){
        return thsyear_evyearfee_pay_close_ymd;
    }
  
    @ElVoField(physicalName = "thsyear_evyearfee_pay_close_ymd")
    public void setThsyear_evyearfee_pay_close_ymd(String thsyear_evyearfee_pay_close_ymd){
        this.thsyear_evyearfee_pay_close_ymd = thsyear_evyearfee_pay_close_ymd;
    }
  
    @ElVoField(physicalName = "rightmnt_div")
    public String getRightmnt_div(){
        return rightmnt_div;
    }
  
    @ElVoField(physicalName = "rightmnt_div")
    public void setRightmnt_div(String rightmnt_div){
        this.rightmnt_div = rightmnt_div;
    }
  
    @ElVoField(physicalName = "rightmnt_div_nm")
    public String getRightmnt_div_nm(){
        return rightmnt_div_nm;
    }
  
    @ElVoField(physicalName = "rightmnt_div_nm")
    public void setRightmnt_div_nm(String rightmnt_div_nm){
        this.rightmnt_div_nm = rightmnt_div_nm;
    }
  
    @ElVoField(physicalName = "thsyear_evyearfee_pay_ymd")
    public String getThsyear_evyearfee_pay_ymd(){
        return thsyear_evyearfee_pay_ymd;
    }
  
    @ElVoField(physicalName = "thsyear_evyearfee_pay_ymd")
    public void setThsyear_evyearfee_pay_ymd(String thsyear_evyearfee_pay_ymd){
        this.thsyear_evyearfee_pay_ymd = thsyear_evyearfee_pay_ymd;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "unusual_item")
    public String getUnusual_item(){
        return unusual_item;
    }
  
    @ElVoField(physicalName = "unusual_item")
    public void setUnusual_item(String unusual_item){
        this.unusual_item = unusual_item;
    }
  
    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }
  
    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }
  
    @ElVoField(physicalName = "governpay_fee")
    public String getGovernpay_fee(){
        return governpay_fee;
    }
  
    @ElVoField(physicalName = "governpay_fee")
    public void setGovernpay_fee(String governpay_fee){
        this.governpay_fee = governpay_fee;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }
  
    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRightmntVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("mnt_seq").append("=").append(mnt_seq).append(",");
      sb.append("thsyear_evyearfee_pay_close_ymd").append("=").append(thsyear_evyearfee_pay_close_ymd).append(",");
      sb.append("rightmnt_div").append("=").append(rightmnt_div).append(",");
      sb.append("rightmnt_div_nm").append("=").append(rightmnt_div_nm).append(",");
      sb.append("thsyear_evyearfee_pay_ymd").append("=").append(thsyear_evyearfee_pay_ymd).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("unusual_item").append("=").append(unusual_item).append(",");
      sb.append("state").append("=").append(state).append(",");
      sb.append("governpay_fee").append("=").append(governpay_fee).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("cnt").append("=").append(cnt);
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