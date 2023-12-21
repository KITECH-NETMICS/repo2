package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class ResBgacCtmListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResBgacCtmListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "ResBgacCtmVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo> ResBgacCtmVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "ResBgacCtmVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo ResBgacCtmVo;
  
  @ElVoField(physicalName = "ResBgacCtmVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo> getResBgacCtmVoList(){
      return ResBgacCtmVoList;
  }

  @ElVoField(physicalName = "ResBgacCtmVoList")
  public void setResBgacCtmVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo> ResBgacCtmVoList){
      this.ResBgacCtmVoList = ResBgacCtmVoList;
  }

  @ElVoField(physicalName = "ResBgacCtmVo")
    public kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo getResBgacCtmVo(){
      return ResBgacCtmVo;
  }

  @ElVoField(physicalName = "ResBgacCtmVo")
  public void setResBgacCtmVo(kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo ResBgacCtmVo){
      this.ResBgacCtmVo = ResBgacCtmVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResBgacCtmListVo [");
      sb.append("ResBgacCtmVoList").append("=").append(ResBgacCtmVoList).append(",");
      sb.append("ResBgacCtmVo").append("=").append(ResBgacCtmVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; ResBgacCtmVoList != null && i < ResBgacCtmVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo vo = (kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo)ResBgacCtmVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.ResBgacCtmVo != null ) this.ResBgacCtmVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; ResBgacCtmVoList != null && i < ResBgacCtmVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo vo = (kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo)ResBgacCtmVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.ResBgacCtmVo != null ) this.ResBgacCtmVo._xStreamDec();

  }
  
}
