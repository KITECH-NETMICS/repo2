package kr.re.kitech.biz.sup.tlt.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTltActivMonthRptExp")
public class SptTltActivMonthRptVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptTltActivMonthRptVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElDtoField(logicalName = "thatMonthDiv", physicalName = "that_month_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String that_month_div;
  
    @ElDtoField(logicalName = "thatMonthGoal", physicalName = "that_month_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String that_month_goal;
  
    @ElDtoField(logicalName = "thatMonthResult", physicalName = "that_month_result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String that_month_result;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
    @ElVoField(physicalName = "that_month_div")
    public String getThat_month_div(){
        return that_month_div;
    }
  
    @ElVoField(physicalName = "that_month_div")
    public void setThat_month_div(String that_month_div){
        this.that_month_div = that_month_div;
    }
  
    @ElVoField(physicalName = "that_month_goal")
    public String getThat_month_goal(){
        return that_month_goal;
    }
  
    @ElVoField(physicalName = "that_month_goal")
    public void setThat_month_goal(String that_month_goal){
        this.that_month_goal = that_month_goal;
    }
  
    @ElVoField(physicalName = "that_month_result")
    public String getThat_month_result(){
        return that_month_result;
    }
  
    @ElVoField(physicalName = "that_month_result")
    public void setThat_month_result(String that_month_result){
        this.that_month_result = that_month_result;
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
      sb.append("SptTltActivRptVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("seq").append("=").append(seq).append(",");
      sb.append("that_month_div").append("=").append(that_month_div).append(",");
      sb.append("that_month_goal").append("=").append(that_month_goal).append(",");
      sb.append("that_month_result").append("=").append(that_month_result).append(",");
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