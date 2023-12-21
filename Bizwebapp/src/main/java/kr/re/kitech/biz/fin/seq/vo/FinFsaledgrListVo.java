package kr.re.kitech.biz.fin.seq.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinFsaledgrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinFsaledgrListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "finFsaledgrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo> finFsaledgrVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "finFsaledgrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo finFsaledgrVo;
  
  @ElVoField(physicalName = "finFsaledgrVoList")
    public java.util.List<kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo> getFinFsaledgrVoList(){
      return finFsaledgrVoList;
  }

  @ElVoField(physicalName = "finFsaledgrVoList")
  public void setFinFsaledgrVoList(java.util.List<kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo> finFsaledgrVoList){
      this.finFsaledgrVoList = finFsaledgrVoList;
  }

  @ElVoField(physicalName = "finFsaledgrVo")
    public kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo getFinFsaledgrVo(){
      return finFsaledgrVo;
  }

  @ElVoField(physicalName = "finFsaledgrVo")
  public void setFinFsaledgrVo(kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo finFsaledgrVo){
      this.finFsaledgrVo = finFsaledgrVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinFsaledgrListVo [");
      sb.append("finFsaledgrVoList").append("=").append(finFsaledgrVoList).append(",");
      sb.append("finFsaledgrVo").append("=").append(finFsaledgrVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; finFsaledgrVoList != null && i < finFsaledgrVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo vo = (kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo)finFsaledgrVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.finFsaledgrVo != null ) this.finFsaledgrVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; finFsaledgrVoList != null && i < finFsaledgrVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo vo = (kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo)finFsaledgrVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.finFsaledgrVo != null ) this.finFsaledgrVo._xStreamDec();

  }
  
}
