package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinRcmsPayUpdateExp")
public class FinRcmsPayUpdateVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinRcmsPayUpdateVo(){
  }

  @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String unslip_no;

  @ElDtoField(logicalName = "unslipOdr", physicalName = "unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String unslip_odr;

  @ElVoField(physicalName = "unslip_no")
  public String getUnslip_no(){
      return unslip_no;
  }

  @ElVoField(physicalName = "unslip_no")
  public void setUnslip_no(String unslip_no){
      this.unslip_no = unslip_no;
  }

  @ElVoField(physicalName = "unslip_odr")
  public String getUnslip_odr(){
      return unslip_odr;
  }

  @ElVoField(physicalName = "unslip_odr")
  public void setUnslip_odr(String unslip_odr){
      this.unslip_odr = unslip_odr;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinRcmsPayUpdateVo [");
      sb.append("unslip_no").append("=").append(unslip_no).append(",");
      sb.append("unslip_odr").append("=").append(unslip_odr);
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