package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPrioritySmitappListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPrioritySmitappListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patPrioritySmitappVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo> patPrioritySmitappVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patPrioritySmitappVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo patPrioritySmitappVo;
  
  @ElVoField(physicalName = "patPrioritySmitappVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo> getPatPrioritySmitappVoList(){
      return patPrioritySmitappVoList;
  }

  @ElVoField(physicalName = "patPrioritySmitappVoList")
  public void setPatPrioritySmitappVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo> patPrioritySmitappVoList){
      this.patPrioritySmitappVoList = patPrioritySmitappVoList;
  }

  @ElVoField(physicalName = "patPrioritySmitappVo")
    public kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo getPatPrioritySmitappVo(){
      return patPrioritySmitappVo;
  }

  @ElVoField(physicalName = "patPrioritySmitappVo")
  public void setPatPrioritySmitappVo(kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo patPrioritySmitappVo){
      this.patPrioritySmitappVo = patPrioritySmitappVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPrioritySmitappListVo [");
      sb.append("patPrioritySmitappVoList").append("=").append(patPrioritySmitappVoList).append(",");
      sb.append("patPrioritySmitappVo").append("=").append(patPrioritySmitappVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPrioritySmitappVoList != null && i < patPrioritySmitappVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo vo = (kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo)patPrioritySmitappVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPrioritySmitappVo != null ) this.patPrioritySmitappVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPrioritySmitappVoList != null && i < patPrioritySmitappVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo vo = (kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo)patPrioritySmitappVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPrioritySmitappVo != null ) this.patPrioritySmitappVo._xStreamDec();

  }
  
}
