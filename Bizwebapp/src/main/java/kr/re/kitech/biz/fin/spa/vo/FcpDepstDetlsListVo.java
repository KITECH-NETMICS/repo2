package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FcpDepstDetlsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FcpDepstDetlsListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "fcpDepstDetlsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo> fcpDepstDetlsVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "fcpDepstDetlsVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo fcpDepstDetlsVo;
  
  @ElVoField(physicalName = "fcpDepstDetlsVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo> getFcpDepstDetlsVoList(){
      return fcpDepstDetlsVoList;
  }

  @ElVoField(physicalName = "fcpDepstDetlsVoList")
  public void setFcpDepstDetlsVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo> fcpDepstDetlsVoList){
      this.fcpDepstDetlsVoList = fcpDepstDetlsVoList;
  }

  @ElVoField(physicalName = "fcpDepstDetlsVo")
    public kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo getFcpDepstDetlsVo(){
      return fcpDepstDetlsVo;
  }

  @ElVoField(physicalName = "fcpDepstDetlsVo")
  public void setFcpDepstDetlsVo(kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo fcpDepstDetlsVo){
      this.fcpDepstDetlsVo = fcpDepstDetlsVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FcpDepstDetlsListVo [");
      sb.append("fcpDepstDetlsVoList").append("=").append(fcpDepstDetlsVoList).append(",");
      sb.append("fcpDepstDetlsVo").append("=").append(fcpDepstDetlsVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; fcpDepstDetlsVoList != null && i < fcpDepstDetlsVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo vo = (kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo)fcpDepstDetlsVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.fcpDepstDetlsVo != null ) this.fcpDepstDetlsVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; fcpDepstDetlsVoList != null && i < fcpDepstDetlsVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo vo = (kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo)fcpDepstDetlsVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.fcpDepstDetlsVo != null ) this.fcpDepstDetlsVo._xStreamDec();

  }
  
}
