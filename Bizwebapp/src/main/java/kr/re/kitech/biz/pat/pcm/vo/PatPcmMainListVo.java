package kr.re.kitech.biz.pat.pcm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPcmMainListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPcmMainListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPcmMainVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo> patPcmMainVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPcmMainVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo patPcmMainVo;
  
  @ElVoField(physicalName = "patPcmMainVoList")
    public java.util.List<kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo> getPatPcmMainVoList(){
      return patPcmMainVoList;
  }

  @ElVoField(physicalName = "patPcmMainVoList")
  public void setPatPcmMainVoList(java.util.List<kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo> patPcmMainVoList){
      this.patPcmMainVoList = patPcmMainVoList;
  }

  @ElVoField(physicalName = "patPcmMainVo")
    public kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo getPatPcmMainVo(){
      return patPcmMainVo;
  }

  @ElVoField(physicalName = "patPcmMainVo")
  public void setPatPcmMainVo(kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo patPcmMainVo){
      this.patPcmMainVo = patPcmMainVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPcmMainListVo [");
      sb.append("patPcmMainVoList").append("=").append(patPcmMainVoList).append(",");
      sb.append("patPcmMainVo").append("=").append(patPcmMainVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPcmMainVoList != null && i < patPcmMainVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo vo = (kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo)patPcmMainVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPcmMainVo != null ) this.patPcmMainVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPcmMainVoList != null && i < patPcmMainVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo vo = (kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo)patPcmMainVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPcmMainVo != null ) this.patPcmMainVo._xStreamDec();

  }
  
}
