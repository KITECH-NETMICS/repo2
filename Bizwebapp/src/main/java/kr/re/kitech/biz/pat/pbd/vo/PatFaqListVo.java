package kr.re.kitech.biz.pat.pbd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatFaqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatFaqListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patFaqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatFaqVo> patFaqVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patFaq2Vo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pbd.vo.PatFaqVo patFaqVo;
  
  @ElVoField(physicalName = "patFaqVoList")
    public java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatFaqVo> getPatFaqVoList(){
      return patFaqVoList;
  }

  @ElVoField(physicalName = "patFaqVoList")
  public void setPatFaqVoList(java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatFaqVo> PatFaqVoList){
      this.patFaqVoList = PatFaqVoList;
  }

  @ElVoField(physicalName = "PatFaqVo")
    public kr.re.kitech.biz.pat.pbd.vo.PatFaqVo getpatFaq2Vo(){
      return patFaqVo;
  }

  @ElVoField(physicalName = "patFaq2Vo")
  public void setpatFaq2Vo(kr.re.kitech.biz.pat.pbd.vo.PatFaqVo patFaq2Vo){
      this.patFaqVo = patFaq2Vo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatFaqListVo [");
      sb.append("PatFaqVoList").append("=").append(patFaqVoList).append(",");
      sb.append("PatFaqVo").append("=").append(patFaqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }
    
  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patFaqVoList != null && i < patFaqVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatFaqVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatFaqVo)patFaqVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patFaqVo != null ) this.patFaqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patFaqVoList != null && i < patFaqVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatFaqVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatFaqVo)patFaqVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patFaqVo != null ) this.patFaqVo._xStreamDec();

  }
  
}
