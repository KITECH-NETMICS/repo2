package kr.re.kitech.biz.fin.seq.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinAccntBsnsSelListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinAccntBsnsSelListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "finAccntBsnsSelVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo> finAccntBsnsSelVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "finAccntBsnsSelVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo finAccntBsnsSelVo;
  
  @ElVoField(physicalName = "finAccntBsnsSelVoList")
    public java.util.List<kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo> getFinAccntBsnsSelVoList(){
      return finAccntBsnsSelVoList;
  }

  @ElVoField(physicalName = "finAccntBsnsSelVoList")
  public void setFinAccntBsnsSelVoList(java.util.List<kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo> finAccntBsnsSelVoList){
      this.finAccntBsnsSelVoList = finAccntBsnsSelVoList;
  }

  @ElVoField(physicalName = "finAccntBsnsSelVo")
    public kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo getFinAccntBsnsSelVo(){
      return finAccntBsnsSelVo;
  }

  @ElVoField(physicalName = "finAccntBsnsSelVo")
  public void setFinAccntBsnsSelVo(kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo finAccntBsnsSelVo){
      this.finAccntBsnsSelVo = finAccntBsnsSelVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinAccntBsnsSelListVo [");
      sb.append("finAccntBsnsSelVoList").append("=").append(finAccntBsnsSelVoList).append(",");
      sb.append("finAccntBsnsSelVo").append("=").append(finAccntBsnsSelVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; finAccntBsnsSelVoList != null && i < finAccntBsnsSelVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo vo = (kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo)finAccntBsnsSelVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.finAccntBsnsSelVo != null ) this.finAccntBsnsSelVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; finAccntBsnsSelVoList != null && i < finAccntBsnsSelVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo vo = (kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo)finAccntBsnsSelVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.finAccntBsnsSelVo != null ) this.finAccntBsnsSelVo._xStreamDec();

  }
  
}
