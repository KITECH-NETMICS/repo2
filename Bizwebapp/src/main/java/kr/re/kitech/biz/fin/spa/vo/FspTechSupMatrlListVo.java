package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspTechSupMatrlListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspTechSupMatrlListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FspTechSupMatrlVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo> FspTechSupMatrlVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FspTechSupMatrlVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo FspTechSupMatrlVo;
  
  @ElVoField(physicalName = "FspTechSupMatrlVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo> getFspTechSupMatrlVoList(){
      return FspTechSupMatrlVoList;
  }

  @ElVoField(physicalName = "FspTechSupMatrlVoList")
  public void setFspTechSupMatrlVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo> FspTechSupMatrlVoList){
      this.FspTechSupMatrlVoList = FspTechSupMatrlVoList;
  }

  @ElVoField(physicalName = "FspTechSupMatrlVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo getFspTechSupMatrlVo(){
      return FspTechSupMatrlVo;
  }

  @ElVoField(physicalName = "FspTechSupMatrlVo")
  public void setFspTechSupMatrlVo(kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo FspTechSupMatrlVo){
      this.FspTechSupMatrlVo = FspTechSupMatrlVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FspTechSupMatrlListVo [");
      sb.append("FspTechSupMatrlVoList").append("=").append(FspTechSupMatrlVoList).append(",");
      sb.append("FspTechSupMatrlVo").append("=").append(FspTechSupMatrlVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FspTechSupMatrlVoList != null && i < FspTechSupMatrlVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo)FspTechSupMatrlVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FspTechSupMatrlVo != null ) this.FspTechSupMatrlVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FspTechSupMatrlVoList != null && i < FspTechSupMatrlVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo)FspTechSupMatrlVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FspTechSupMatrlVo != null ) this.FspTechSupMatrlVo._xStreamDec();

  }
  
}
