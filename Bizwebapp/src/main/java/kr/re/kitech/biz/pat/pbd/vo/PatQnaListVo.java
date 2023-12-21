package kr.re.kitech.biz.pat.pbd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatQnaListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatQnaListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patQnaVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatQnaVo> patQnaVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patQna2Vo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pbd.vo.PatQnaVo patFaqVo;
  
  @ElVoField(physicalName = "patQnaVoList")
    public java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatQnaVo> getPatQnaVoList(){
      return patQnaVoList;
  }

  @ElVoField(physicalName = "patQnaVoList")
  public void setPatQnaVoList(java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatQnaVo> PatQnaVoList){
      this.patQnaVoList = PatQnaVoList;
  }

  @ElVoField(physicalName = "PatQnaVo")
    public kr.re.kitech.biz.pat.pbd.vo.PatQnaVo getpatQna2Vo(){
      return patFaqVo;
  }

  @ElVoField(physicalName = "patQna2Vo")
  public void setpatQna2Vo(kr.re.kitech.biz.pat.pbd.vo.PatQnaVo patQna2Vo){
      this.patFaqVo = patQna2Vo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatQnaListVo [");
      sb.append("PatQnaVoList").append("=").append(patQnaVoList).append(",");
      sb.append("PatQnaVo").append("=").append(patFaqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }
    
  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patQnaVoList != null && i < patQnaVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatQnaVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatQnaVo)patQnaVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patFaqVo != null ) this.patFaqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patQnaVoList != null && i < patQnaVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatQnaVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatQnaVo)patQnaVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patFaqVo != null ) this.patFaqVo._xStreamDec();

  }
  
}
