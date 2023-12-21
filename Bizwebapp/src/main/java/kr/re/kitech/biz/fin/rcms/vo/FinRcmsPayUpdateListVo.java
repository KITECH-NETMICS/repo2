package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinRcmsPayUpdateListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinRcmsPayUpdateListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FinRcmsPayUpdateVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo> FinRcmsPayUpdateVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FinRcmsPayUpdateVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo FinRcmsPayUpdateVo;
  
  @ElVoField(physicalName = "FinRcmsPayUpdateVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo> getFinRcmsPayUpdateVoList(){
      return FinRcmsPayUpdateVoList;
  }

  @ElVoField(physicalName = "FinRcmsPayUpdateVoList")
  public void setFinRcmsPayUpdateVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo> FinRcmsPayUpdateVoList){
      this.FinRcmsPayUpdateVoList = FinRcmsPayUpdateVoList;
  }

  @ElVoField(physicalName = "FinRcmsPayUpdateVo")
    public kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo getFinRcmsPayUpdateVo(){
      return FinRcmsPayUpdateVo;
  }

  @ElVoField(physicalName = "FinRcmsPayUpdateVo")
  public void setFinRcmsPayUpdateVo(kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo FinRcmsPayUpdateVo){
      this.FinRcmsPayUpdateVo = FinRcmsPayUpdateVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinRcmsPayUpdateListVo [");
      sb.append("FinRcmsPayUpdateVoList").append("=").append(FinRcmsPayUpdateVoList).append(",");
      sb.append("FinRcmsPayUpdateVo").append("=").append(FinRcmsPayUpdateVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FinRcmsPayUpdateVoList != null && i < FinRcmsPayUpdateVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo vo = (kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo)FinRcmsPayUpdateVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FinRcmsPayUpdateVo != null ) this.FinRcmsPayUpdateVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FinRcmsPayUpdateVoList != null && i < FinRcmsPayUpdateVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo vo = (kr.re.kitech.biz.fin.rcms.vo.FinRcmsPayUpdateVo)FinRcmsPayUpdateVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FinRcmsPayUpdateVo != null ) this.FinRcmsPayUpdateVo._xStreamDec();

  }
  
}
