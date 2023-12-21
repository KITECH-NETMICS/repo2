package kr.re.kitech.biz.fin.ena.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspEnaSliphExp")
public class FspEnaSliphVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspEnaSliphVo(){
  }

    @ElDtoField(logicalName = "unslipNoYm", physicalName = "unslip_no_ym", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no_ym;
  
    @ElDtoField(logicalName = "slipTypCd", physicalName = "slip_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ_cd;
  
    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;
  
    @ElVoField(physicalName = "unslip_no_ym")
    public String getUnslip_no_ym(){
        return unslip_no_ym;
    }
  
    @ElVoField(physicalName = "unslip_no_ym")
    public void setUnslip_no_ym(String unslip_no_ym){
        this.unslip_no_ym = unslip_no_ym;
    }
  
    @ElVoField(physicalName = "slip_typ_cd")
    public String getSlip_typ_cd(){
        return slip_typ_cd;
    }
  
    @ElVoField(physicalName = "slip_typ_cd")
    public void setSlip_typ_cd(String slip_typ_cd){
        this.slip_typ_cd = slip_typ_cd;
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
      sb.append("FspEnaSliphVo [");
      sb.append("unslip_no_ym").append("=").append(unslip_no_ym).append(",");
      sb.append("slip_typ_cd").append("=").append(slip_typ_cd).append(",");
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