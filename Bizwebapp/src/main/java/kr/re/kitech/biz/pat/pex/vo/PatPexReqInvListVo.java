package kr.re.kitech.biz.pat.pex.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPexReqInvListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPexReqInvListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPexReqInvVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo> patPexReqInvVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPexReqInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo patPexReqInvVo;
  
  @ElVoField(physicalName = "patPexReqInvVoList")
    public java.util.List<kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo> getPatPexReqInvVoList(){
      return patPexReqInvVoList;
  }

  @ElVoField(physicalName = "patPexReqInvVoList")
  public void setPatPexReqInvVoList(java.util.List<kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo> patPexReqInvVoList){
      this.patPexReqInvVoList = patPexReqInvVoList;
  }

  @ElVoField(physicalName = "patPexReqInvVo")
    public kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo getPatPexReqInvVo(){
      return patPexReqInvVo;
  }

  @ElVoField(physicalName = "patPexReqInvVo")
  public void setPatPexReqInvVo(kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo patPexReqInvVo){
      this.patPexReqInvVo = patPexReqInvVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPexReqInvListVo [");
      sb.append("patPexReqInvVoList").append("=").append(patPexReqInvVoList).append(",");
      sb.append("patPexReqInvVo").append("=").append(patPexReqInvVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPexReqInvVoList != null && i < patPexReqInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo vo = (kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo)patPexReqInvVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPexReqInvVo != null ) this.patPexReqInvVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPexReqInvVoList != null && i < patPexReqInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo vo = (kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo)patPexReqInvVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPexReqInvVo != null ) this.patPexReqInvVo._xStreamDec();

  }
  
}
