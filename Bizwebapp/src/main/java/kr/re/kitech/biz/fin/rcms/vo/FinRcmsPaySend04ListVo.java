package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinRcmsPaySend04ListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinRcmsPaySend04ListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FinRcmsPaySend04VoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo> FinRcmsPaySend04VoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FinRcmsPaySend04Vo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo FinRcmsPaySend04Vo;
  
  @ElVoField(physicalName = "FinRcmsPaySend04VoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo> getFinRcmsPaySend04VoList(){
      return FinRcmsPaySend04VoList;
  }

  @ElVoField(physicalName = "FinRcmsPaySend04VoList")
  public void setFinRcmsPaySend04VoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo> FinRcmsPaySend04VoList){
      this.FinRcmsPaySend04VoList = FinRcmsPaySend04VoList;
  }

  @ElVoField(physicalName = "FinRcmsPaySend04Vo")
    public kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo getFinRcmsPaySend04Vo(){
      return FinRcmsPaySend04Vo;
  }

  @ElVoField(physicalName = "FinRcmsPaySend04Vo")
  public void setFinRcmsPaySend04Vo(kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo FinRcmsPaySend04Vo){
      this.FinRcmsPaySend04Vo = FinRcmsPaySend04Vo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinRcmsPaySend04ListVo [");
      sb.append("FinRcmsPaySend04VoList").append("=").append(FinRcmsPaySend04VoList).append(",");
      sb.append("FinRcmsPaySend04Vo").append("=").append(FinRcmsPaySend04Vo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FinRcmsPaySend04VoList != null && i < FinRcmsPaySend04VoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo vo = (kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo)FinRcmsPaySend04VoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FinRcmsPaySend04Vo != null ) this.FinRcmsPaySend04Vo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FinRcmsPaySend04VoList != null && i < FinRcmsPaySend04VoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo vo = (kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo)FinRcmsPaySend04VoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FinRcmsPaySend04Vo != null ) this.FinRcmsPaySend04Vo._xStreamDec();

  }
  
}
