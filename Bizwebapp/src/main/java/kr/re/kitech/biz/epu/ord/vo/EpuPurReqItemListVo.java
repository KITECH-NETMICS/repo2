package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class EpuPurReqItemListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public EpuPurReqItemListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "EpuPurReqItemVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo> EpuPurReqItemVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "EpuPurReqItemVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo EpuPurReqItemVo;
  
  @ElVoField(physicalName = "EpuPurReqItemVoList")
    public java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo> getEpuPurReqItemVoList(){
      return EpuPurReqItemVoList;
  }

  @ElVoField(physicalName = "EpuPurReqItemVoList")
  public void setEpuPurReqItemVoList(java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo> EpuPurReqItemVoList){
      this.EpuPurReqItemVoList = EpuPurReqItemVoList;
  }

  @ElVoField(physicalName = "EpuPurReqItemVo")
    public kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo getEpuPurReqItemVo(){
      return EpuPurReqItemVo;
  }

  @ElVoField(physicalName = "EpuPurReqItemVo")
  public void setEpuPurReqItemVo(kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo EpuPurReqItemVo){
      this.EpuPurReqItemVo = EpuPurReqItemVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("EpuPurReqItemListVo [");
      sb.append("EpuPurReqItemVoList").append("=").append(EpuPurReqItemVoList).append(",");
      sb.append("EpuPurReqItemVo").append("=").append(EpuPurReqItemVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; EpuPurReqItemVoList != null && i < EpuPurReqItemVoList.size() ; i++ ) {
        kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo)EpuPurReqItemVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.EpuPurReqItemVo != null ) this.EpuPurReqItemVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; EpuPurReqItemVoList != null && i < EpuPurReqItemVoList.size() ; i++ ) {
        kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuPurReqItemVo)EpuPurReqItemVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.EpuPurReqItemVo != null ) this.EpuPurReqItemVo._xStreamDec();

  }
  
}
