package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspTechSupdListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspTechSupdListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FspTechSupdVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo> FspTechSupdVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FspTechSupdVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo FspTechSupdVo;
  
  @ElVoField(physicalName = "FspTechSupdVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo> getFspTechSupdVoList(){
      return FspTechSupdVoList;
  }

  @ElVoField(physicalName = "FspTechSupdVoList")
  public void setFspTechSupdVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo> FspTechSupdVoList){
      this.FspTechSupdVoList = FspTechSupdVoList;
  }

  @ElVoField(physicalName = "FspTechSupdVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo getFspTechSupdVo(){
      return FspTechSupdVo;
  }

  @ElVoField(physicalName = "FspTechSupdVo")
  public void setFspTechSupdVo(kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo FspTechSupdVo){
      this.FspTechSupdVo = FspTechSupdVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FspTechSupdListVo [");
      sb.append("FspTechSupdVoList").append("=").append(FspTechSupdVoList).append(",");
      sb.append("FspTechSupdVo").append("=").append(FspTechSupdVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FspTechSupdVoList != null && i < FspTechSupdVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo)FspTechSupdVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FspTechSupdVo != null ) this.FspTechSupdVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FspTechSupdVoList != null && i < FspTechSupdVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo)FspTechSupdVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FspTechSupdVo != null ) this.FspTechSupdVo._xStreamDec();

  }
  
}
