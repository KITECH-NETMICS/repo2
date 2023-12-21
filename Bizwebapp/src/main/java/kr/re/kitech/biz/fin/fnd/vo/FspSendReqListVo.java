package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspSendReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspSendReqListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FspSendReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo> FspSendReqVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FspSendReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo FspSendReqVo;
  
  @ElVoField(physicalName = "FspSendReqVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo> getFspSendReqVoList(){
      return FspSendReqVoList;
  }

  @ElVoField(physicalName = "FspSendReqVoList")
  public void setFspSendReqVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo> FspSendReqVoList){
      this.FspSendReqVoList = FspSendReqVoList;
  }

  @ElVoField(physicalName = "FspSendReqVo")
    public kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo getFspSendReqVo(){
      return FspSendReqVo;
  }

  @ElVoField(physicalName = "FspSendReqVo")
  public void setFspSendReqVo(kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo FspSendReqVo){
      this.FspSendReqVo = FspSendReqVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FspSendReqListVo [");
      sb.append("FspSendReqVoList").append("=").append(FspSendReqVoList).append(",");
      sb.append("FspSendReqVo").append("=").append(FspSendReqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FspSendReqVoList != null && i < FspSendReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo)FspSendReqVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FspSendReqVo != null ) this.FspSendReqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FspSendReqVoList != null && i < FspSendReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo)FspSendReqVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FspSendReqVo != null ) this.FspSendReqVo._xStreamDec();

  }
  
}
