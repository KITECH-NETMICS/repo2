package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class AprAppNameListListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public AprAppNameListListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "AprAppNameListVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.apr.vo.AprAppNameListVo> AprAppNameListVoList;

  @ElDtoField(logicalName = "Single Vo", physicalName = "AprAppNameListVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.apr.vo.AprAppNameListVo AprAppNameListVo;

  @ElVoField(physicalName = "AprAppNameListVoList")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprAppNameListVo> getAprAppNameListVoList(){
      return AprAppNameListVoList;
  }

  @ElVoField(physicalName = "AprAppNameListVoList")
  public void setAprAppNameListVoList(java.util.List<kr.re.kitech.biz.apr.vo.AprAppNameListVo> AprAppNameListVoList){
      this.AprAppNameListVoList = AprAppNameListVoList;
  }

  @ElVoField(physicalName = "AprAppNameListVo")
    public kr.re.kitech.biz.apr.vo.AprAppNameListVo getAprAppNameListVo(){
      return AprAppNameListVo;
  }

  @ElVoField(physicalName = "AprAppNameListVo")
  public void setAprAppNameListVo(kr.re.kitech.biz.apr.vo.AprAppNameListVo AprAppNameListVo){
      this.AprAppNameListVo = AprAppNameListVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("AprAppNameListListVo [");
      sb.append("AprAppNameListVoList").append("=").append(AprAppNameListVoList).append(",");
      sb.append("AprAppNameListVo").append("=").append(AprAppNameListVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; AprAppNameListVoList != null && i < AprAppNameListVoList.size() ; i++ ) {
        kr.re.kitech.biz.apr.vo.AprAppNameListVo vo = (kr.re.kitech.biz.apr.vo.AprAppNameListVo)AprAppNameListVoList.get(i);
        vo._xStreamEnc();
    }
    if( this.AprAppNameListVo != null ) this.AprAppNameListVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; AprAppNameListVoList != null && i < AprAppNameListVoList.size() ; i++ ) {
        kr.re.kitech.biz.apr.vo.AprAppNameListVo vo = (kr.re.kitech.biz.apr.vo.AprAppNameListVo)AprAppNameListVoList.get(i);
        vo._xStreamDec();
    }
    if( this.AprAppNameListVo != null ) this.AprAppNameListVo._xStreamDec();

  }

}
