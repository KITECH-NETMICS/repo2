package kr.re.kitech.biz.res.twe.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class ResDownHistListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResDownHistListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "resDownHistVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.res.twe.vo.ResDownHistVo> resDownHistVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "resDownHistVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.res.twe.vo.ResDownHistVo resDownHistVo;
  
  @ElVoField(physicalName = "resDownHistVoList")
    public java.util.List<kr.re.kitech.biz.res.twe.vo.ResDownHistVo> getResDownHistVoList(){
      return resDownHistVoList;
  }

  @ElVoField(physicalName = "resDownHistVoList")
  public void setResDownHistVoList(java.util.List<kr.re.kitech.biz.res.twe.vo.ResDownHistVo> resDownHistVoList){
      this.resDownHistVoList = resDownHistVoList;
  }

  @ElVoField(physicalName = "resDownHistVo")
    public kr.re.kitech.biz.res.twe.vo.ResDownHistVo getResDownHistVo(){
      return resDownHistVo;
  }

  @ElVoField(physicalName = "resDownHistVo")
  public void setResDownHistVo(kr.re.kitech.biz.res.twe.vo.ResDownHistVo resDownHistVo){
      this.resDownHistVo = resDownHistVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResDownHistListVo [");
      sb.append("resDownHistVoList").append("=").append(resDownHistVoList).append(",");
      sb.append("resDownHistVo").append("=").append(resDownHistVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; resDownHistVoList != null && i < resDownHistVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.twe.vo.ResDownHistVo vo = (kr.re.kitech.biz.res.twe.vo.ResDownHistVo)resDownHistVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.resDownHistVo != null ) this.resDownHistVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; resDownHistVoList != null && i < resDownHistVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.twe.vo.ResDownHistVo vo = (kr.re.kitech.biz.res.twe.vo.ResDownHistVo)resDownHistVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.resDownHistVo != null ) this.resDownHistVo._xStreamDec();

  }
  
}
