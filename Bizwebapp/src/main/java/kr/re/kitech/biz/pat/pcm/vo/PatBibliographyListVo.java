package kr.re.kitech.biz.pat.pcm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatBibliographyListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatBibliographyListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "PatBibliographyVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo> PatBibliographyVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatBibliographyVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo PatBibliographyVo;
  
  @ElVoField(physicalName = "PatBibliographyVoList")
    public java.util.List<kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo> getPatBibliographyVoList(){
      return PatBibliographyVoList;
  }

  @ElVoField(physicalName = "PatBibliographyVoList")
  public void setPatBibliographyVoList(java.util.List<kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo> PatBibliographyVoList){
      this.PatBibliographyVoList = PatBibliographyVoList;
  }

  @ElVoField(physicalName = "PatBibliographyVo")
    public kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo getPatBibliographyVo(){
      return PatBibliographyVo;
  }

  @ElVoField(physicalName = "PatBibliographyVo")
  public void setPatBibliographyVo(kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo PatBibliographyVo){
      this.PatBibliographyVo = PatBibliographyVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatBibliographyListVo [");
      sb.append("PatBibliographyVoList").append("=").append(PatBibliographyVoList).append(",");
      sb.append("PatBibliographyVo").append("=").append(PatBibliographyVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; PatBibliographyVoList != null && i < PatBibliographyVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo vo = (kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo)PatBibliographyVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.PatBibliographyVo != null ) this.PatBibliographyVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; PatBibliographyVoList != null && i < PatBibliographyVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo vo = (kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo)PatBibliographyVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.PatBibliographyVo != null ) this.PatBibliographyVo._xStreamDec();

  }
  
}
