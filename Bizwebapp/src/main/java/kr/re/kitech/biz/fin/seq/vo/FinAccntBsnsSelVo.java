package kr.re.kitech.biz.fin.seq.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinAccntBsnsSelExp")
public class FinAccntBsnsSelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinAccntBsnsSelVo(){
  }

    @ElDtoField(logicalName = "accntYmd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;
  
    @ElDtoField(logicalName = "accntGu", physicalName = "accnt_gu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_gu;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "accntNoNm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;
  
    @ElDtoField(logicalName = "accntRespnNm", physicalName = "accnt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_nm;
  
    @ElDtoField(logicalName = "accntRespnNo", physicalName = "accnt_respn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_no;
  
    @ElDtoField(logicalName = "period", physicalName = "period", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String period;
  
    @ElDtoField(logicalName = "bugtAmt", physicalName = "bugt_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_amt;
  
    @ElDtoField(logicalName = "lyearAmt", physicalName = "lyear_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lyear_amt;
  
    @ElDtoField(logicalName = "yearAmt", physicalName = "year_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_amt;
  
    @ElDtoField(logicalName = "totAmt", physicalName = "tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_amt;
  
    @ElDtoField(logicalName = "resAmt", physicalName = "res_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_amt;
  
    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }
  
    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }
  
    @ElVoField(physicalName = "accnt_gu")
    public String getAccnt_gu(){
        return accnt_gu;
    }
  
    @ElVoField(physicalName = "accnt_gu")
    public void setAccnt_gu(String accnt_gu){
        this.accnt_gu = accnt_gu;
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
  
    @ElVoField(physicalName = "accnt_respn_nm")
    public String getAccnt_respn_nm(){
        return accnt_respn_nm;
    }
  
    @ElVoField(physicalName = "accnt_respn_nm")
    public void setAccnt_respn_nm(String accnt_respn_nm){
        this.accnt_respn_nm = accnt_respn_nm;
    }
  
    @ElVoField(physicalName = "accnt_respn_no")
    public String getAccnt_respn_no(){
        return accnt_respn_no;
    }
  
    @ElVoField(physicalName = "accnt_respn_no")
    public void setAccnt_respn_no(String accnt_respn_no){
        this.accnt_respn_no = accnt_respn_no;
    }
  
    @ElVoField(physicalName = "period")
    public String getPeriod(){
        return period;
    }
  
    @ElVoField(physicalName = "period")
    public void setPeriod(String period){
        this.period = period;
    }
  
    @ElVoField(physicalName = "bugt_amt")
    public String getBugt_amt(){
        return bugt_amt;
    }
  
    @ElVoField(physicalName = "bugt_amt")
    public void setBugt_amt(String bugt_amt){
        this.bugt_amt = bugt_amt;
    }
  
    @ElVoField(physicalName = "lyear_amt")
    public String getLyear_amt(){
        return lyear_amt;
    }
  
    @ElVoField(physicalName = "lyear_amt")
    public void setLyear_amt(String lyear_amt){
        this.lyear_amt = lyear_amt;
    }
  
    @ElVoField(physicalName = "year_amt")
    public String getYear_amt(){
        return year_amt;
    }
  
    @ElVoField(physicalName = "year_amt")
    public void setYear_amt(String year_amt){
        this.year_amt = year_amt;
    }
  
    @ElVoField(physicalName = "tot_amt")
    public String getTot_amt(){
        return tot_amt;
    }
  
    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(String tot_amt){
        this.tot_amt = tot_amt;
    }
  
    @ElVoField(physicalName = "res_amt")
    public String getRes_amt(){
        return res_amt;
    }
  
    @ElVoField(physicalName = "res_amt")
    public void setRes_amt(String res_amt){
        this.res_amt = res_amt;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinAccntBsnsSelVo [");
      sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
      sb.append("accnt_gu").append("=").append(accnt_gu).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
      sb.append("accnt_respn_nm").append("=").append(accnt_respn_nm).append(",");
      sb.append("accnt_respn_no").append("=").append(accnt_respn_no).append(",");
      sb.append("period").append("=").append(period).append(",");
      sb.append("bugt_amt").append("=").append(bugt_amt).append(",");
      sb.append("lyear_amt").append("=").append(lyear_amt).append(",");
      sb.append("year_amt").append("=").append(year_amt).append(",");
      sb.append("tot_amt").append("=").append(tot_amt).append(",");
      sb.append("res_amt").append("=").append(res_amt);
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