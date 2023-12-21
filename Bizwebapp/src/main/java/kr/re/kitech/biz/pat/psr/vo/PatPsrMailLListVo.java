package kr.re.kitech.biz.pat.psr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPsrMailLListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPsrMailLListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPsrMailLVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo> patPsrMailLVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPsrMailLVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo patPsrMailLVo;
  
  @ElVoField(physicalName = "patPsrMailLVoList")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo> getPatPsrMailLVoList(){
      return patPsrMailLVoList;
  }

  @ElVoField(physicalName = "patPsrMailLVoList")
  public void setPatPsrMailLVoList(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo> patPsrMailLVoList){
      this.patPsrMailLVoList = patPsrMailLVoList;
  }

  @ElVoField(physicalName = "patPsrMailLVo")
    public kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo getPatPsrMailLVo(){
      return patPsrMailLVo;
  }

  @ElVoField(physicalName = "patPsrMailLVo")
  public void setPatPsrMailLVo(kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo patPsrMailLVo){
      this.patPsrMailLVo = patPsrMailLVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPsrMailLListVo [");
      sb.append("patPsrMailLVoList").append("=").append(patPsrMailLVoList).append(",");
      sb.append("patPsrMailLVo").append("=").append(patPsrMailLVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPsrMailLVoList != null && i < patPsrMailLVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo)patPsrMailLVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPsrMailLVo != null ) this.patPsrMailLVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPsrMailLVoList != null && i < patPsrMailLVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo)patPsrMailLVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPsrMailLVo != null ) this.patPsrMailLVo._xStreamDec();

  }
  
}
