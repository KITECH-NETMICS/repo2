package kr.re.kitech.biz.pat.ppe.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPpeReqInvListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPpeReqInvListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPpeReqInvVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo> patPpeReqInvVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPpeReqInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo patPpeReqInvVo;
  
  @ElVoField(physicalName = "patPpeReqInvVoList")
    public java.util.List<kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo> getPatPpeReqInvVoList(){
      return patPpeReqInvVoList;
  }

  @ElVoField(physicalName = "patPpeReqInvVoList")
  public void setPatPpeReqInvVoList(java.util.List<kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo> patPpeReqInvVoList){
      this.patPpeReqInvVoList = patPpeReqInvVoList;
  }

  @ElVoField(physicalName = "patPpeReqInvVo")
    public kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo getPatPpeReqInvVo(){
      return patPpeReqInvVo;
  }

  @ElVoField(physicalName = "patPpeReqInvVo")
  public void setPatPpeReqInvVo(kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo patPpeReqInvVo){
      this.patPpeReqInvVo = patPpeReqInvVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPpeReqInvListVo [");
      sb.append("patPpeReqInvVoList").append("=").append(patPpeReqInvVoList).append(",");
      sb.append("patPpeReqInvVo").append("=").append(patPpeReqInvVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPpeReqInvVoList != null && i < patPpeReqInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo vo = (kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo)patPpeReqInvVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPpeReqInvVo != null ) this.patPpeReqInvVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPpeReqInvVoList != null && i < patPpeReqInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo vo = (kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo)patPpeReqInvVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPpeReqInvVo != null ) this.patPpeReqInvVo._xStreamDec();

  }
  
}
