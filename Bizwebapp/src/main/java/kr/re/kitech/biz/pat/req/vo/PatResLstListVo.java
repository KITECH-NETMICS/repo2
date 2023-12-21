package kr.re.kitech.biz.pat.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatResLstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatResLstListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patResLstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.req.vo.PatResLstVo> patResLstVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patResLstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.req.vo.PatResLstVo patResLstVo;
  
  @ElVoField(physicalName = "patResLstVoList")
    public java.util.List<kr.re.kitech.biz.pat.req.vo.PatResLstVo> getPatResLstVoList(){
      return patResLstVoList;
  }

  @ElVoField(physicalName = "patResLstVoList")
  public void setPatResLstVoList(java.util.List<kr.re.kitech.biz.pat.req.vo.PatResLstVo> patResLstVoList){
      this.patResLstVoList = patResLstVoList;
  }

  @ElVoField(physicalName = "patResLstVo")
    public kr.re.kitech.biz.pat.req.vo.PatResLstVo getPatResLstVo(){
      return patResLstVo;
  }

  @ElVoField(physicalName = "patResLstVo")
  public void setPatResLstVo(kr.re.kitech.biz.pat.req.vo.PatResLstVo patResLstVo){
      this.patResLstVo = patResLstVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatResLstListVo [");
      sb.append("patResLstVoList").append("=").append(patResLstVoList).append(",");
      sb.append("patResLstVo").append("=").append(patResLstVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patResLstVoList != null && i < patResLstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.req.vo.PatResLstVo vo = (kr.re.kitech.biz.pat.req.vo.PatResLstVo)patResLstVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patResLstVo != null ) this.patResLstVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patResLstVoList != null && i < patResLstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.req.vo.PatResLstVo vo = (kr.re.kitech.biz.pat.req.vo.PatResLstVo)patResLstVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patResLstVo != null ) this.patResLstVo._xStreamDec();

  }
  
}
