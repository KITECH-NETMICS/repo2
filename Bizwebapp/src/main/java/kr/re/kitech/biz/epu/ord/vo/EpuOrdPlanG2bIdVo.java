package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "EpuOrdPlanG2bIdExp")
public class EpuOrdPlanG2bIdVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public EpuOrdPlanG2bIdVo(){
  }

  @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String syspayno;

  @ElDtoField(logicalName = "g2bRegstId", physicalName = "g2b_regst_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String g2b_regst_id;

  @ElVoField(physicalName = "syspayno")
  public String getSyspayno(){
      return syspayno;
  }

  @ElVoField(physicalName = "syspayno")
  public void setSyspayno(String syspayno){
      this.syspayno = syspayno;
  }

  @ElVoField(physicalName = "g2b_regst_id")
  public String getG2b_regst_id(){
      return g2b_regst_id;
  }

  @ElVoField(physicalName = "g2b_regst_id")
  public void setG2b_regst_id(String g2b_regst_id){
      this.g2b_regst_id = g2b_regst_id;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("EpuOrdPlanG2bIdVo [");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("g2b_regst_id").append("=").append(g2b_regst_id);
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