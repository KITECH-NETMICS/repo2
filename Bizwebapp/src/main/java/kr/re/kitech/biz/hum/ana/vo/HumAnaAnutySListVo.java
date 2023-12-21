package kr.re.kitech.biz.hum.ana.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class HumAnaAnutySListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumAnaAnutySListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "humAnaAnutySVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo> humAnaAnutySVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "humAnaAnutySVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo humAnaAnutySVo;
  
  @ElVoField(physicalName = "humAnaAnutySVoList")
    public java.util.List<kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo> getHumAnaAnutySVoList(){
      return humAnaAnutySVoList;
  }

  @ElVoField(physicalName = "humAnaAnutySVoList")
  public void setHumAnaAnutySVoList(java.util.List<kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo> humAnaAnutySVoList){
      this.humAnaAnutySVoList = humAnaAnutySVoList;
  }

  @ElVoField(physicalName = "humAnaAnutySVo")
    public kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo getHumAnaAnutySVo(){
      return humAnaAnutySVo;
  }

  @ElVoField(physicalName = "humAnaAnutySVo")
  public void setHumAnaAnutySVo(kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo humAnaAnutySVo){
      this.humAnaAnutySVo = humAnaAnutySVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumAnaAnutySListVo [");
      sb.append("humAnaAnutySVoList").append("=").append(humAnaAnutySVoList).append(",");
      sb.append("humAnaAnutySVo").append("=").append(humAnaAnutySVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; humAnaAnutySVoList != null && i < humAnaAnutySVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo vo = (kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo)humAnaAnutySVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.humAnaAnutySVo != null ) this.humAnaAnutySVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; humAnaAnutySVoList != null && i < humAnaAnutySVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo vo = (kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo)humAnaAnutySVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.humAnaAnutySVo != null ) this.humAnaAnutySVo._xStreamDec();

  }
  
}
