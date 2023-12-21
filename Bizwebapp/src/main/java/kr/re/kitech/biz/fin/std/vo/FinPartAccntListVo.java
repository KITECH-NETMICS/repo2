package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinPartAccntListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinPartAccntListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "finPartAccntVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.std.vo.FinPartAccntVo> finPartAccntVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "finPartAccntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.std.vo.FinPartAccntVo finPartAccntVo;
  
  @ElVoField(physicalName = "finPartAccntVoList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.FinPartAccntVo> getFinPartAccntVoList(){
      return finPartAccntVoList;
  }

  @ElVoField(physicalName = "finPartAccntVoList")
  public void setFinPartAccntVoList(java.util.List<kr.re.kitech.biz.fin.std.vo.FinPartAccntVo> finPartAccntVoList){
      this.finPartAccntVoList = finPartAccntVoList;
  }

  @ElVoField(physicalName = "finPartAccntVo")
    public kr.re.kitech.biz.fin.std.vo.FinPartAccntVo getFinPartAccntVo(){
      return finPartAccntVo;
  }

  @ElVoField(physicalName = "finPartAccntVo")
  public void setFinPartAccntVo(kr.re.kitech.biz.fin.std.vo.FinPartAccntVo finPartAccntVo){
      this.finPartAccntVo = finPartAccntVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinPartAccntListVo [");
      sb.append("finPartAccntVoList").append("=").append(finPartAccntVoList).append(",");
      sb.append("finPartAccntVo").append("=").append(finPartAccntVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; finPartAccntVoList != null && i < finPartAccntVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.std.vo.FinPartAccntVo vo = (kr.re.kitech.biz.fin.std.vo.FinPartAccntVo)finPartAccntVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.finPartAccntVo != null ) this.finPartAccntVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; finPartAccntVoList != null && i < finPartAccntVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.std.vo.FinPartAccntVo vo = (kr.re.kitech.biz.fin.std.vo.FinPartAccntVo)finPartAccntVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.finPartAccntVo != null ) this.finPartAccntVo._xStreamDec();

  }
  
}
