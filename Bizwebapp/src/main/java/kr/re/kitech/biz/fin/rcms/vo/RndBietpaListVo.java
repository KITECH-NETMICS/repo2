package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class RndBietpaListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public RndBietpaListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "RndBietpaVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo> RndBietpaVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "RndBietpaVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo RndBietpaVo;
  
  @ElVoField(physicalName = "RndBietpaVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo> getRndBietpaVoList(){
      return RndBietpaVoList;
  }

  @ElVoField(physicalName = "RndBietpaVoList")
  public void setRndBietpaVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo> RndBietpaVoList){
      this.RndBietpaVoList = RndBietpaVoList;
  }

  @ElVoField(physicalName = "RndBietpaVo")
    public kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo getRndBietpaVo(){
      return RndBietpaVo;
  }

  @ElVoField(physicalName = "RndBietpaVo")
  public void setRndBietpaVo(kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo RndBietpaVo){
      this.RndBietpaVo = RndBietpaVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("RndBietpaListVo [");
      sb.append("RndBietpaVoList").append("=").append(RndBietpaVoList).append(",");
      sb.append("RndBietpaVo").append("=").append(RndBietpaVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; RndBietpaVoList != null && i < RndBietpaVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo vo = (kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo)RndBietpaVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.RndBietpaVo != null ) this.RndBietpaVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; RndBietpaVoList != null && i < RndBietpaVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo vo = (kr.re.kitech.biz.fin.rcms.vo.RndBietpaVo)RndBietpaVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.RndBietpaVo != null ) this.RndBietpaVo._xStreamDec();

  }
  
}
