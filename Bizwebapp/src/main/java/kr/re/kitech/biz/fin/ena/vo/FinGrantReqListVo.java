package kr.re.kitech.biz.fin.ena.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinGrantReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinGrantReqListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "finGrantReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo> finGrantReqVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "finGrantReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo finGrantReqVo;
  
  @ElVoField(physicalName = "finGrantReqVoList")
    public java.util.List<kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo> getFinGrantReqVoList(){
      return finGrantReqVoList;
  }

  @ElVoField(physicalName = "finGrantReqVoList")
  public void setFinGrantReqVoList(java.util.List<kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo> finGrantReqVoList){
      this.finGrantReqVoList = finGrantReqVoList;
  }

  @ElVoField(physicalName = "finGrantReqVo")
    public kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo getFinGrantReqVo(){
      return finGrantReqVo;
  }

  @ElVoField(physicalName = "finGrantReqVo")
  public void setFinGrantReqVo(kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo finGrantReqVo){
      this.finGrantReqVo = finGrantReqVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinGrantReqListVo [");
      sb.append("finGrantReqVoList").append("=").append(finGrantReqVoList).append(",");
      sb.append("finGrantReqVo").append("=").append(finGrantReqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; finGrantReqVoList != null && i < finGrantReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo vo = (kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo)finGrantReqVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.finGrantReqVo != null ) this.finGrantReqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; finGrantReqVoList != null && i < finGrantReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo vo = (kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo)finGrantReqVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.finGrantReqVo != null ) this.finGrantReqVo._xStreamDec();

  }
  
}
