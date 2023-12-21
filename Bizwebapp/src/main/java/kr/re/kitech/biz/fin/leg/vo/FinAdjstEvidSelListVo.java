package kr.re.kitech.biz.fin.leg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinAdjstEvidSelListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinAdjstEvidSelListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "finAdjstEvidSelVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo> finAdjstEvidSelVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "finAdjstEvidSelVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo finAdjstEvidSelVo;
  
  @ElVoField(physicalName = "finAdjstEvidSelVoList")
    public java.util.List<kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo> getFinAdjstEvidSelVoList(){
      return finAdjstEvidSelVoList;
  }

  @ElVoField(physicalName = "finAdjstEvidSelVoList")
  public void setFinAdjstEvidSelVoList(java.util.List<kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo> finAdjstEvidSelVoList){
      this.finAdjstEvidSelVoList = finAdjstEvidSelVoList;
  }

  @ElVoField(physicalName = "finAdjstEvidSelVo")
    public kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo getFinAdjstEvidSelVo(){
      return finAdjstEvidSelVo;
  }

  @ElVoField(physicalName = "finAdjstEvidSelVo")
  public void setFinAdjstEvidSelVo(kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo finAdjstEvidSelVo){
      this.finAdjstEvidSelVo = finAdjstEvidSelVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinAdjstEvidSelListVo [");
      sb.append("finAdjstEvidSelVoList").append("=").append(finAdjstEvidSelVoList).append(",");
      sb.append("finAdjstEvidSelVo").append("=").append(finAdjstEvidSelVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; finAdjstEvidSelVoList != null && i < finAdjstEvidSelVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo vo = (kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo)finAdjstEvidSelVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.finAdjstEvidSelVo != null ) this.finAdjstEvidSelVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; finAdjstEvidSelVoList != null && i < finAdjstEvidSelVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo vo = (kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo)finAdjstEvidSelVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.finAdjstEvidSelVo != null ) this.finAdjstEvidSelVo._xStreamDec();

  }
  
}
