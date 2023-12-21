package kr.re.kitech.biz.pat.poa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPoaResInvListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPoaResInvListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPoaResInvVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo> patPoaResInvVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPoaResInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo patPoaResInvVo;
  
  @ElVoField(physicalName = "patPoaResInvVoList")
    public java.util.List<kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo> getPatPoaResInvVoList(){
      return patPoaResInvVoList;
  }

  @ElVoField(physicalName = "patPoaResInvVoList")
  public void setPatPoaResInvVoList(java.util.List<kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo> patPoaResInvVoList){
      this.patPoaResInvVoList = patPoaResInvVoList;
  }

  @ElVoField(physicalName = "patPoaResInvVo")
    public kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo getPatPoaResInvVo(){
      return patPoaResInvVo;
  }

  @ElVoField(physicalName = "patPoaResInvVo")
  public void setPatPoaResInvVo(kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo patPoaResInvVo){
      this.patPoaResInvVo = patPoaResInvVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPoaResInvListVo [");
      sb.append("patPoaResInvVoList").append("=").append(patPoaResInvVoList).append(",");
      sb.append("patPoaResInvVo").append("=").append(patPoaResInvVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPoaResInvVoList != null && i < patPoaResInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo vo = (kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo)patPoaResInvVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPoaResInvVo != null ) this.patPoaResInvVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPoaResInvVoList != null && i < patPoaResInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo vo = (kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo)patPoaResInvVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPoaResInvVo != null ) this.patPoaResInvVo._xStreamDec();

  }
  
}
