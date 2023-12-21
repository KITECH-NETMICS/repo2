package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatSmitappListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatSmitappListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patSmitappVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatSmitappVo> patSmitappVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patSmitappVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatSmitappVo patSmitappVo;
  
  @ElVoField(physicalName = "patSmitappVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatSmitappVo> getPatSmitappVoList(){
      return patSmitappVoList;
  }

  @ElVoField(physicalName = "patSmitappVoList")
  public void setPatSmitappVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatSmitappVo> patSmitappVoList){
      this.patSmitappVoList = patSmitappVoList;
  }

  @ElVoField(physicalName = "patSmitappVo")
    public kr.re.kitech.biz.pat.chr.vo.PatSmitappVo getPatSmitappVo(){
      return patSmitappVo;
  }

  @ElVoField(physicalName = "patSmitappVo")
  public void setPatSmitappVo(kr.re.kitech.biz.pat.chr.vo.PatSmitappVo patSmitappVo){
      this.patSmitappVo = patSmitappVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatSmitappListVo [");
      sb.append("patSmitappVoList").append("=").append(patSmitappVoList).append(",");
      sb.append("patSmitappVo").append("=").append(patSmitappVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patSmitappVoList != null && i < patSmitappVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatSmitappVo vo = (kr.re.kitech.biz.pat.chr.vo.PatSmitappVo)patSmitappVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patSmitappVo != null ) this.patSmitappVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patSmitappVoList != null && i < patSmitappVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatSmitappVo vo = (kr.re.kitech.biz.pat.chr.vo.PatSmitappVo)patSmitappVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patSmitappVo != null ) this.patSmitappVo._xStreamDec();

  }
  
}
