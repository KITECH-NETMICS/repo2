package kr.re.kitech.biz.pat.pbd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatFrmListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatFrmListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patFrmVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatFrmVo> patFrmVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patFrm2Vo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pbd.vo.PatFrmVo patFaqVo;
  
  @ElVoField(physicalName = "patFrmVoList")
    public java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatFrmVo> getPatFrmVoList(){
      return patFrmVoList;
  }

  @ElVoField(physicalName = "patFrmVoList")
  public void setPatFrmVoList(java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatFrmVo> PatFrmVoList){
      this.patFrmVoList = PatFrmVoList;
  }

  @ElVoField(physicalName = "PatFrmVo")
    public kr.re.kitech.biz.pat.pbd.vo.PatFrmVo getpatFrm2Vo(){
      return patFaqVo;
  }

  @ElVoField(physicalName = "patFrm2Vo")
  public void setpatFrm2Vo(kr.re.kitech.biz.pat.pbd.vo.PatFrmVo patFrm2Vo){
      this.patFaqVo = patFrm2Vo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatFrmListVo [");
      sb.append("PatFrmVoList").append("=").append(patFrmVoList).append(",");
      sb.append("PatFrmVo").append("=").append(patFaqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }
    
  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patFrmVoList != null && i < patFrmVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatFrmVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatFrmVo)patFrmVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patFaqVo != null ) this.patFaqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patFrmVoList != null && i < patFrmVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatFrmVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatFrmVo)patFrmVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patFaqVo != null ) this.patFaqVo._xStreamDec();

  }
  
}
