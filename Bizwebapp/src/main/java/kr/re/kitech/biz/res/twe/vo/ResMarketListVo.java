package kr.re.kitech.biz.res.twe.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class ResMarketListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResMarketListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "resMarketVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.res.twe.vo.ResMarketVo> resMarketVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "resMarketVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.res.twe.vo.ResMarketVo resMarketVo;
  
  @ElVoField(physicalName = "resMarketVoList")
    public java.util.List<kr.re.kitech.biz.res.twe.vo.ResMarketVo> getResMarketVoList(){
      return resMarketVoList;
  }

  @ElVoField(physicalName = "resMarketVoList")
  public void setResMarketVoList(java.util.List<kr.re.kitech.biz.res.twe.vo.ResMarketVo> resMarketVoList){
      this.resMarketVoList = resMarketVoList;
  }

  @ElVoField(physicalName = "resMarketVo")
    public kr.re.kitech.biz.res.twe.vo.ResMarketVo getResMarketVo(){
      return resMarketVo;
  }

  @ElVoField(physicalName = "resMarketVo")
  public void setResMarketVo(kr.re.kitech.biz.res.twe.vo.ResMarketVo resMarketVo){
      this.resMarketVo = resMarketVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResMarketListVo [");
      sb.append("resMarketVoList").append("=").append(resMarketVoList).append(",");
      sb.append("resMarketVo").append("=").append(resMarketVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; resMarketVoList != null && i < resMarketVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.twe.vo.ResMarketVo vo = (kr.re.kitech.biz.res.twe.vo.ResMarketVo)resMarketVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.resMarketVo != null ) this.resMarketVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; resMarketVoList != null && i < resMarketVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.twe.vo.ResMarketVo vo = (kr.re.kitech.biz.res.twe.vo.ResMarketVo)resMarketVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.resMarketVo != null ) this.resMarketVo._xStreamDec();

  }
  
}
