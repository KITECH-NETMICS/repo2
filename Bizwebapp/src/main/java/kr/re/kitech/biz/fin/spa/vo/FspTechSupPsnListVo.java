package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspTechSupPsnListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspTechSupPsnListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FspTechSupPsnVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo> FspTechSupPsnVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FspTechSupPsnVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo FspTechSupPsnVo;
  
  @ElVoField(physicalName = "FspTechSupPsnVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo> getFspTechSupPsnVoList(){
      return FspTechSupPsnVoList;
  }

  @ElVoField(physicalName = "FspTechSupPsnVoList")
  public void setFspTechSupPsnVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo> FspTechSupPsnVoList){
      this.FspTechSupPsnVoList = FspTechSupPsnVoList;
  }

  @ElVoField(physicalName = "FspTechSupPsnVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo getFspTechSupPsnVo(){
      return FspTechSupPsnVo;
  }

  @ElVoField(physicalName = "FspTechSupPsnVo")
  public void setFspTechSupPsnVo(kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo FspTechSupPsnVo){
      this.FspTechSupPsnVo = FspTechSupPsnVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FspTechSupPsnListVo [");
      sb.append("FspTechSupPsnVoList").append("=").append(FspTechSupPsnVoList).append(",");
      sb.append("FspTechSupPsnVo").append("=").append(FspTechSupPsnVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FspTechSupPsnVoList != null && i < FspTechSupPsnVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo)FspTechSupPsnVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FspTechSupPsnVo != null ) this.FspTechSupPsnVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FspTechSupPsnVoList != null && i < FspTechSupPsnVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo)FspTechSupPsnVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FspTechSupPsnVo != null ) this.FspTechSupPsnVo._xStreamDec();

  }
  
}
