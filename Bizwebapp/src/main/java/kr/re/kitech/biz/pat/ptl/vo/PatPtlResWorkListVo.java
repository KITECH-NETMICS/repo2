package kr.re.kitech.biz.pat.ptl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPtlResWorkListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPtlResWorkListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPtlResWorkVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo> patPtlResWorkVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPtlResWorkVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo patPtlResWorkVo;
  
  @ElVoField(physicalName = "patPtlResWorkVoList")
    public java.util.List<kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo> getPatPtlResWorkVoList(){
      return patPtlResWorkVoList;
  }

  @ElVoField(physicalName = "patPtlResWorkVoList")
  public void setPatPtlResWorkVoList(java.util.List<kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo> patPtlResWorkVoList){
      this.patPtlResWorkVoList = patPtlResWorkVoList;
  }

  @ElVoField(physicalName = "patPtlResWorkVo")
    public kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo getPatPtlResWorkVo(){
      return patPtlResWorkVo;
  }

  @ElVoField(physicalName = "patPtlResWorkVo")
  public void setPatPtlResWorkVo(kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo patPtlResWorkVo){
      this.patPtlResWorkVo = patPtlResWorkVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPtlResWorkListVo [");
      sb.append("patPtlResWorkVoList").append("=").append(patPtlResWorkVoList).append(",");
      sb.append("patPtlResWorkVo").append("=").append(patPtlResWorkVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPtlResWorkVoList != null && i < patPtlResWorkVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo vo = (kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo)patPtlResWorkVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPtlResWorkVo != null ) this.patPtlResWorkVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPtlResWorkVoList != null && i < patPtlResWorkVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo vo = (kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo)patPtlResWorkVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPtlResWorkVo != null ) this.patPtlResWorkVo._xStreamDec();

  }
  
}
