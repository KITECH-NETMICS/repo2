package kr.re.kitech.biz.pat.pap.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPapManReqInvListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPapManReqInvListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPapManReqInvVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo> patPapManReqInvVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPapManReqInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo patPapManReqInvVo;
  
  @ElVoField(physicalName = "patPapManReqInvVoList")
    public java.util.List<kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo> getPatPapManReqInvVoList(){
      return patPapManReqInvVoList;
  }

  @ElVoField(physicalName = "patPapManReqInvVoList")
  public void setPatPapManReqInvVoList(java.util.List<kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo> patPapManReqInvVoList){
      this.patPapManReqInvVoList = patPapManReqInvVoList;
  }

  @ElVoField(physicalName = "patPapManReqInvVo")
    public kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo getPatPapManReqInvVo(){
      return patPapManReqInvVo;
  }

  @ElVoField(physicalName = "patPapManReqInvVo")
  public void setPatPapManReqInvVo(kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo patPapManReqInvVo){
      this.patPapManReqInvVo = patPapManReqInvVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPapManReqInvListVo [");
      sb.append("patPapManReqInvVoList").append("=").append(patPapManReqInvVoList).append(",");
      sb.append("patPapManReqInvVo").append("=").append(patPapManReqInvVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPapManReqInvVoList != null && i < patPapManReqInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo vo = (kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo)patPapManReqInvVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPapManReqInvVo != null ) this.patPapManReqInvVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPapManReqInvVoList != null && i < patPapManReqInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo vo = (kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo)patPapManReqInvVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPapManReqInvVo != null ) this.patPapManReqInvVo._xStreamDec();

  }
  
}
