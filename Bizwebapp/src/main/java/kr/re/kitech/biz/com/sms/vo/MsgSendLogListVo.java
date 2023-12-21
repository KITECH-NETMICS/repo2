package kr.re.kitech.biz.com.sms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class MsgSendLogListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public MsgSendLogListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "MsgSendLogVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.com.sms.vo.MsgSendLogVo> MsgSendLogVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "MsgSendLogVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.com.sms.vo.MsgSendLogVo MsgSendLogVo;
  
  @ElVoField(physicalName = "MsgSendLogVoList")
    public java.util.List<kr.re.kitech.biz.com.sms.vo.MsgSendLogVo> getMsgSendLogVoList(){
      return MsgSendLogVoList;
  }

  @ElVoField(physicalName = "MsgSendLogVoList")
  public void setMsgSendLogVoList(java.util.List<kr.re.kitech.biz.com.sms.vo.MsgSendLogVo> MsgSendLogVoList){
      this.MsgSendLogVoList = MsgSendLogVoList;
  }

  @ElVoField(physicalName = "MsgSendLogVo")
    public kr.re.kitech.biz.com.sms.vo.MsgSendLogVo getMsgSendLogVo(){
      return MsgSendLogVo;
  }

  @ElVoField(physicalName = "MsgSendLogVo")
  public void setMsgSendLogVo(kr.re.kitech.biz.com.sms.vo.MsgSendLogVo MsgSendLogVo){
      this.MsgSendLogVo = MsgSendLogVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("MsgSendLogListVo [");
      sb.append("MsgSendLogVoList").append("=").append(MsgSendLogVoList).append(",");
      sb.append("MsgSendLogVo").append("=").append(MsgSendLogVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; MsgSendLogVoList != null && i < MsgSendLogVoList.size() ; i++ ) {
        kr.re.kitech.biz.com.sms.vo.MsgSendLogVo vo = (kr.re.kitech.biz.com.sms.vo.MsgSendLogVo)MsgSendLogVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.MsgSendLogVo != null ) this.MsgSendLogVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; MsgSendLogVoList != null && i < MsgSendLogVoList.size() ; i++ ) {
        kr.re.kitech.biz.com.sms.vo.MsgSendLogVo vo = (kr.re.kitech.biz.com.sms.vo.MsgSendLogVo)MsgSendLogVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.MsgSendLogVo != null ) this.MsgSendLogVo._xStreamDec();

  }
  
}
