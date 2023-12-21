package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "XodpExchExp")
public class XodpExchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public XodpExchVo(){
  }

    @ElDtoField(logicalName = "cd", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;
  
    @ElDtoField(logicalName = "exchgrYmd", physicalName = "exchgr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exchgr_ymd;
  
    @ElDtoField(logicalName = "curncyUnitCd", physicalName = "curncy_unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit_cd;
  
    @ElDtoField(logicalName = "cashPurRt", physicalName = "cash_pur_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_pur_rt;
  
    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }
  
    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }
  
    @ElVoField(physicalName = "exchgr_ymd")
    public String getExchgr_ymd(){
        return exchgr_ymd;
    }
  
    @ElVoField(physicalName = "exchgr_ymd")
    public void setExchgr_ymd(String exchgr_ymd){
        this.exchgr_ymd = exchgr_ymd;
    }
  
    @ElVoField(physicalName = "curncy_unit_cd")
    public String getCurncy_unit_cd(){
        return curncy_unit_cd;
    }
  
    @ElVoField(physicalName = "curncy_unit_cd")
    public void setCurncy_unit_cd(String curncy_unit_cd){
        this.curncy_unit_cd = curncy_unit_cd;
    }
  
    @ElVoField(physicalName = "cash_pur_rt")
    public String getCash_pur_rt(){
        return cash_pur_rt;
    }
  
    @ElVoField(physicalName = "cash_pur_rt")
    public void setCash_pur_rt(String cash_pur_rt){
        this.cash_pur_rt = cash_pur_rt;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("XodpExchVo [");
      sb.append("cd").append("=").append(cd).append(",");
      sb.append("exchgr_ymd").append("=").append(exchgr_ymd).append(",");
      sb.append("curncy_unit_cd").append("=").append(curncy_unit_cd).append(",");
      sb.append("cash_pur_rt").append("=").append(cash_pur_rt);
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