package kr.re.kitech.biz.pat.psr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPsrStaListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPsrStaListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPsrStaVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo> patPsrStaVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPsrStaVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo patPsrStaVo;
  
  @ElVoField(physicalName = "patPsrStaVoList")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo> getPatPsrStaVoList(){
      return patPsrStaVoList;
  }

  @ElVoField(physicalName = "patPsrStaVoList")
  public void setPatPsrStaVoList(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo> patPsrStaVoList){
      this.patPsrStaVoList = patPsrStaVoList;
  }

  @ElVoField(physicalName = "patPsrStaVo")
    public kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo getPatPsrStaVo(){
      return patPsrStaVo;
  }

  @ElVoField(physicalName = "patPsrStaVo")
  public void setPatPsrStaVo(kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo patPsrStaVo){
      this.patPsrStaVo = patPsrStaVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPsrStaListVo [");
      sb.append("patPsrStaVoList").append("=").append(patPsrStaVoList).append(",");
      sb.append("patPsrStaVo").append("=").append(patPsrStaVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPsrStaVoList != null && i < patPsrStaVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo)patPsrStaVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPsrStaVo != null ) this.patPsrStaVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPsrStaVoList != null && i < patPsrStaVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo)patPsrStaVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPsrStaVo != null ) this.patPsrStaVo._xStreamDec();

  }
  
}
