package kr.re.kitech.biz.pat.poa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPoaPrdChngReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPoaPrdChngReqListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPoaPrdChngReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo> patPoaPrdChngReqVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPoaPrdChngReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo patPoaPrdChngReqVo;
  
  @ElVoField(physicalName = "patPoaPrdChngReqVoList")
    public java.util.List<kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo> getPatPoaPrdChngReqVoList(){
      return patPoaPrdChngReqVoList;
  }

  @ElVoField(physicalName = "patPoaPrdChngReqVoList")
  public void setPatPoaPrdChngReqVoList(java.util.List<kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo> patPoaPrdChngReqVoList){
      this.patPoaPrdChngReqVoList = patPoaPrdChngReqVoList;
  }

  @ElVoField(physicalName = "patPoaPrdChngReqVo")
    public kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo getPatPoaPrdChngReqVo(){
      return patPoaPrdChngReqVo;
  }

  @ElVoField(physicalName = "patPoaPrdChngReqVo")
  public void setPatPoaPrdChngReqVo(kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo patPoaPrdChngReqVo){
      this.patPoaPrdChngReqVo = patPoaPrdChngReqVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPoaPrdChngReqListVo [");
      sb.append("patPoaPrdChngReqVoList").append("=").append(patPoaPrdChngReqVoList).append(",");
      sb.append("patPoaPrdChngReqVo").append("=").append(patPoaPrdChngReqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPoaPrdChngReqVoList != null && i < patPoaPrdChngReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo vo = (kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo)patPoaPrdChngReqVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPoaPrdChngReqVo != null ) this.patPoaPrdChngReqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPoaPrdChngReqVoList != null && i < patPoaPrdChngReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo vo = (kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo)patPoaPrdChngReqVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPoaPrdChngReqVo != null ) this.patPoaPrdChngReqVo._xStreamDec();

  }
  
}
