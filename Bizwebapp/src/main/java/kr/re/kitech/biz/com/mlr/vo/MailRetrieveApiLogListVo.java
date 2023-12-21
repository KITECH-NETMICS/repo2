package kr.re.kitech.biz.com.mlr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class MailRetrieveApiLogListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public MailRetrieveApiLogListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "MailRetrieveApiLogVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo> MailRetrieveApiLogVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "MailRetrieveApiLogVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo MailRetrieveApiLogVo;
  
  @ElVoField(physicalName = "MailRetrieveApiLogVoList")
    public java.util.List<kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo> getMailRetrieveApiLogVoList(){
      return MailRetrieveApiLogVoList;
  }

  @ElVoField(physicalName = "MailRetrieveApiLogVoList")
  public void setMailRetrieveApiLogVoList(java.util.List<kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo> MailRetrieveApiLogVoList){
      this.MailRetrieveApiLogVoList = MailRetrieveApiLogVoList;
  }

  @ElVoField(physicalName = "MailRetrieveApiLogVo")
    public kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo getMailRetrieveApiLogVo(){
      return MailRetrieveApiLogVo;
  }

  @ElVoField(physicalName = "MailRetrieveApiLogVo")
  public void setMailRetrieveApiLogVo(kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo MailRetrieveApiLogVo){
      this.MailRetrieveApiLogVo = MailRetrieveApiLogVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("MailRetrieveApiLogListVo [");
      sb.append("MailRetrieveApiLogVoList").append("=").append(MailRetrieveApiLogVoList).append(",");
      sb.append("MailRetrieveApiLogVo").append("=").append(MailRetrieveApiLogVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; MailRetrieveApiLogVoList != null && i < MailRetrieveApiLogVoList.size() ; i++ ) {
        kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo vo = (kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo)MailRetrieveApiLogVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.MailRetrieveApiLogVo != null ) this.MailRetrieveApiLogVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; MailRetrieveApiLogVoList != null && i < MailRetrieveApiLogVoList.size() ; i++ ) {
        kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo vo = (kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo)MailRetrieveApiLogVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.MailRetrieveApiLogVo != null ) this.MailRetrieveApiLogVo._xStreamDec();

  }
  
}
