package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinRcmsPaySendListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinRcmsPaySendListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FinRcmsPaySendVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo> FinRcmsPaySendVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FinRcmsPaySendVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo FinRcmsPaySendVo;
  
  @ElVoField(physicalName = "FinRcmsPaySendVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo> getFinRcmsPaySendVoList(){
      return FinRcmsPaySendVoList;
  }

  @ElVoField(physicalName = "FinRcmsPaySendVoList")
  public void setFinRcmsPaySendVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo> FinRcmsPaySendVoList){
      this.FinRcmsPaySendVoList = FinRcmsPaySendVoList;
  }

  @ElVoField(physicalName = "FinRcmsPaySendVo")
    public kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo getFinRcmsPaySendVo(){
      return FinRcmsPaySendVo;
  }

  @ElVoField(physicalName = "FinRcmsPaySendVo")
  public void setFinRcmsPaySendVo(kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo FinRcmsPaySendVo){
      this.FinRcmsPaySendVo = FinRcmsPaySendVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinRcmsPaySendListVo [");
      sb.append("FinRcmsPaySendVoList").append("=").append(FinRcmsPaySendVoList).append(",");
      sb.append("FinRcmsPaySendVo").append("=").append(FinRcmsPaySendVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FinRcmsPaySendVoList != null && i < FinRcmsPaySendVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo vo = (kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo)FinRcmsPaySendVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FinRcmsPaySendVo != null ) this.FinRcmsPaySendVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FinRcmsPaySendVoList != null && i < FinRcmsPaySendVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo vo = (kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo)FinRcmsPaySendVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FinRcmsPaySendVo != null ) this.FinRcmsPaySendVo._xStreamDec();

  }
  
}
