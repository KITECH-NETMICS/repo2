package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class SendRcmsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SendRcmsListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "SendRcmsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo> SendRcmsVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "SendRcmsVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo SendRcmsVo;
  
  @ElVoField(physicalName = "SendRcmsVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo> getSendRcmsVoList(){
      return SendRcmsVoList;
  }

  @ElVoField(physicalName = "SendRcmsVoList")
  public void setSendRcmsVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo> SendRcmsVoList){
      this.SendRcmsVoList = SendRcmsVoList;
  }

  @ElVoField(physicalName = "SendRcmsVo")
    public kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo getSendRcmsVo(){
      return SendRcmsVo;
  }

  @ElVoField(physicalName = "SendRcmsVo")
  public void setSendRcmsVo(kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo SendRcmsVo){
      this.SendRcmsVo = SendRcmsVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SendRcmsListVo [");
      sb.append("SendRcmsVoList").append("=").append(SendRcmsVoList).append(",");
      sb.append("SendRcmsVo").append("=").append(SendRcmsVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; SendRcmsVoList != null && i < SendRcmsVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo vo = (kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo)SendRcmsVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.SendRcmsVo != null ) this.SendRcmsVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; SendRcmsVoList != null && i < SendRcmsVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo vo = (kr.re.kitech.biz.fin.rcms.vo.SendRcmsVo)SendRcmsVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.SendRcmsVo != null ) this.SendRcmsVo._xStreamDec();

  }
  
}
