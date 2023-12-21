package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class EpuOrdPlanG2bIdListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public EpuOrdPlanG2bIdListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "EpuOrdPlanG2bIdVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo> EpuOrdPlanG2bIdVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "EpuOrdPlanG2bIdVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo EpuOrdPlanG2bIdVo;
  
  @ElVoField(physicalName = "EpuOrdPlanG2bIdVoList")
    public java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo> getEpuOrdPlanG2bIdVoList(){
      return EpuOrdPlanG2bIdVoList;
  }

  @ElVoField(physicalName = "EpuOrdPlanG2bIdVoList")
  public void setEpuOrdPlanG2bIdVoList(java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo> EpuOrdPlanG2bIdVoList){
      this.EpuOrdPlanG2bIdVoList = EpuOrdPlanG2bIdVoList;
  }

  @ElVoField(physicalName = "EpuOrdPlanG2bIdVo")
    public kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo getEpuOrdPlanG2bIdVo(){
      return EpuOrdPlanG2bIdVo;
  }

  @ElVoField(physicalName = "EpuOrdPlanG2bIdVo")
  public void setEpuOrdPlanG2bIdVo(kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo EpuOrdPlanG2bIdVo){
      this.EpuOrdPlanG2bIdVo = EpuOrdPlanG2bIdVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("EpuOrdPlanG2bIdListVo [");
      sb.append("EpuOrdPlanG2bIdVoList").append("=").append(EpuOrdPlanG2bIdVoList).append(",");
      sb.append("EpuOrdPlanG2bIdVo").append("=").append(EpuOrdPlanG2bIdVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; EpuOrdPlanG2bIdVoList != null && i < EpuOrdPlanG2bIdVoList.size() ; i++ ) {
        kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo)EpuOrdPlanG2bIdVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.EpuOrdPlanG2bIdVo != null ) this.EpuOrdPlanG2bIdVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; EpuOrdPlanG2bIdVoList != null && i < EpuOrdPlanG2bIdVoList.size() ; i++ ) {
        kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdPlanG2bIdVo)EpuOrdPlanG2bIdVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.EpuOrdPlanG2bIdVo != null ) this.EpuOrdPlanG2bIdVo._xStreamDec();

  }
  
}
