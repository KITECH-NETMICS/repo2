package kr.re.kitech.biz.pat.psm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPsmDetailListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPsmDetailListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPsmDetailVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> patPsmDetailVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPsmDetailVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo patPsmDetailVo;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPsmExam", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo patPsmExam;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "patPsmExamArea", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> patPsmExamArea;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "krExam", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> krExam;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "freeExam", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> freeExam;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "etcExam", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> etcExam;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "programExam", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> programExam;
  
  @ElVoField(physicalName = "patPsmDetailVoList")
    public java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> getPatPsmDetailVoList(){
      return patPsmDetailVoList;
  }

  @ElVoField(physicalName = "patPsmDetailVoList")
  public void setPatPsmDetailVoList(java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> patPsmDetailVoList){
      this.patPsmDetailVoList = patPsmDetailVoList;
  }

  @ElVoField(physicalName = "patPsmDetailVo")
    public kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo getPatPsmDetailVo(){
      return patPsmDetailVo;
  }

  @ElVoField(physicalName = "patPsmDetailVo")
  public void setPatPsmDetailVo(kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo patPsmDetailVo){
      this.patPsmDetailVo = patPsmDetailVo;
  }

  @ElVoField(physicalName = "patPsmExam")
    public kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo getPatPsmExam(){
      return patPsmExam;
  }

  @ElVoField(physicalName = "patPsmExam")
  public void setPatPsmExam(kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo patPsmExam){
      this.patPsmExam = patPsmExam;
  }

  @ElVoField(physicalName = "patPsmExamArea")
    public java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> getPatPsmExamArea(){
      return patPsmExamArea;
  }

  @ElVoField(physicalName = "patPsmExamArea")
  public void setPatPsmExamArea(java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> patPsmExamArea){
      this.patPsmExamArea = patPsmExamArea;
  }

  @ElVoField(physicalName = "krExam")
    public java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> getKrExam(){
      return krExam;
  }

  @ElVoField(physicalName = "krExam")
  public void setKrExam(java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> krExam){
      this.krExam = krExam;
  }

  @ElVoField(physicalName = "freeExam")
    public java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> getFreeExam(){
      return freeExam;
  }

  @ElVoField(physicalName = "freeExam")
  public void setFreeExam(java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> freeExam){
      this.freeExam = freeExam;
  }

  @ElVoField(physicalName = "etcExam")
    public java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> getEtcExam(){
      return etcExam;
  }

  @ElVoField(physicalName = "etcExam")
  public void setEtcExam(java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> etcExam){
      this.etcExam = etcExam;
  }

  @ElVoField(physicalName = "programExam")
    public java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> getProgramExam(){
      return programExam;
  }

  @ElVoField(physicalName = "programExam")
  public void setProgramExam(java.util.List<kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo> programExam){
      this.programExam = programExam;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPsmDetailListVo [");
      sb.append("patPsmDetailVoList").append("=").append(patPsmDetailVoList).append(",");
      sb.append("patPsmDetailVo").append("=").append(patPsmDetailVo).append(",");
      sb.append("patPsmExam").append("=").append(patPsmExam).append(",");
      sb.append("patPsmExamArea").append("=").append(patPsmExamArea).append(",");
      sb.append("krExam").append("=").append(krExam).append(",");
      sb.append("freeExam").append("=").append(freeExam).append(",");
      sb.append("etcExam").append("=").append(etcExam).append(",");
      sb.append("programExam").append("=").append(programExam);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPsmDetailVoList != null && i < patPsmDetailVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)patPsmDetailVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPsmDetailVo != null ) this.patPsmDetailVo._xStreamEnc();
    if( this.patPsmExam != null ) this.patPsmExam._xStreamEnc();
    for( int i=0 ; patPsmExamArea != null && i < patPsmExamArea.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)patPsmExamArea.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; krExam != null && i < krExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)krExam.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; freeExam != null && i < freeExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)freeExam.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; etcExam != null && i < etcExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)etcExam.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; programExam != null && i < programExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)programExam.get(i);
        vo._xStreamEnc();	 
    }

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPsmDetailVoList != null && i < patPsmDetailVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)patPsmDetailVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPsmDetailVo != null ) this.patPsmDetailVo._xStreamDec();
    if( this.patPsmExam != null ) this.patPsmExam._xStreamDec();
    for( int i=0 ; patPsmExamArea != null && i < patPsmExamArea.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)patPsmExamArea.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; krExam != null && i < krExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)krExam.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; freeExam != null && i < freeExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)freeExam.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; etcExam != null && i < etcExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)etcExam.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; programExam != null && i < programExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo vo = (kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo)programExam.get(i);
        vo._xStreamDec();	 
    }

  }
  
}
