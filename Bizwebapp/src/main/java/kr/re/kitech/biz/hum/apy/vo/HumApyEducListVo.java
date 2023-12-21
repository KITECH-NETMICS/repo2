package kr.re.kitech.biz.hum.apy.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumApyEducListVo")
public class HumApyEducListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumApyEducListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "humApyEducVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEducVo> humApyEducVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "humApyEducVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.hum.apy.vo.HumApyEducVo humApyEducVo;
  
  @ElVoField(physicalName = "humApyEducVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEducVo> getHumApyEducVoList(){
      return humApyEducVoList;
  }

  @ElVoField(physicalName = "humApyEducVoList")
  public void setHumApyEducVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEducVo> humApyEducVoList){
      this.humApyEducVoList = humApyEducVoList;
  }

  @ElVoField(physicalName = "humApyEducVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyEducVo getHumApyEducVo(){
      return humApyEducVo;
  }

  @ElVoField(physicalName = "humApyEducVo")
  public void setHumApyEducVo(kr.re.kitech.biz.hum.apy.vo.HumApyEducVo humApyEducVo){
      this.humApyEducVo = humApyEducVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumApyEducListVo [");
      sb.append("humApyEducVoList").append("=").append(humApyEducVoList).append(",");
      sb.append("humApyEducVo").append("=").append(humApyEducVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; humApyEducVoList != null && i < humApyEducVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyEducVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEducVo)humApyEducVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.humApyEducVo != null ) this.humApyEducVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; humApyEducVoList != null && i < humApyEducVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyEducVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEducVo)humApyEducVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.humApyEducVo != null ) this.humApyEducVo._xStreamDec();

  }
  
}
