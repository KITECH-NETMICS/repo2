package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptParBaseExp")
public class SptParBaseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptParBaseVo(){
  }

    @ElDtoField(logicalName = "appontNo", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;
  
    @ElDtoField(logicalName = "appontYmd", physicalName = "appont_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_ymd;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "joinEx", physicalName = "join_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_ex;
  
    @ElDtoField(logicalName = "evalDaytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;
  
    @ElDtoField(logicalName = "evalNm", physicalName = "eval_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_nm;
  
    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }
  
    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }
  
    @ElVoField(physicalName = "appont_ymd")
    public String getAppont_ymd(){
        return appont_ymd;
    }
  
    @ElVoField(physicalName = "appont_ymd")
    public void setAppont_ymd(String appont_ymd){
        this.appont_ymd = appont_ymd;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
  
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "join_ex")
    public String getJoin_ex(){
        return join_ex;
    }
  
    @ElVoField(physicalName = "join_ex")
    public void setJoin_ex(String join_ex){
        this.join_ex = join_ex;
    }
  
    @ElVoField(physicalName = "eval_daytm")
    public String getEval_daytm(){
        return eval_daytm;
    }
  
    @ElVoField(physicalName = "eval_daytm")
    public void setEval_daytm(String eval_daytm){
        this.eval_daytm = eval_daytm;
    }
  
    @ElVoField(physicalName = "eval_nm")
    public String getEval_nm(){
        return eval_nm;
    }
  
    @ElVoField(physicalName = "eval_nm")
    public void setEval_nm(String eval_nm){
        this.eval_nm = eval_nm;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptParBaseVo [");
      sb.append("appont_no").append("=").append(appont_no).append(",");
      sb.append("appont_ymd").append("=").append(appont_ymd).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("join_ex").append("=").append(join_ex).append(",");
      sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
      sb.append("eval_nm").append("=").append(eval_nm);
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