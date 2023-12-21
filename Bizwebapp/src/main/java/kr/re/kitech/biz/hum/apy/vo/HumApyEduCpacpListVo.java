package kr.re.kitech.biz.hum.apy.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class HumApyEduCpacpListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumApyEduCpacpListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "humApyEduCpacpVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo> humApyEduCpacpVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "humApyEduCpacpVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo humApyEduCpacpVo;
  
  @ElVoField(physicalName = "humApyEduCpacpVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo> getHumApyEduCpacpVoList(){
      return humApyEduCpacpVoList;
  }

  @ElVoField(physicalName = "humApyEduCpacpVoList")
  public void setHumApyEduCpacpVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo> humApyEduCpacpVoList){
      this.humApyEduCpacpVoList = humApyEduCpacpVoList;
  }

  @ElVoField(physicalName = "humApyEduCpacpVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo getHumApyEduCpacpVo(){
      return humApyEduCpacpVo;
  }

  @ElVoField(physicalName = "humApyEduCpacpVo")
  public void setHumApyEduCpacpVo(kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo humApyEduCpacpVo){
      this.humApyEduCpacpVo = humApyEduCpacpVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumApyEduCpacpListVo [");
      sb.append("humApyEduCpacpVoList").append("=").append(humApyEduCpacpVoList).append(",");
      sb.append("humApyEduCpacpVo").append("=").append(humApyEduCpacpVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; humApyEduCpacpVoList != null && i < humApyEduCpacpVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo)humApyEduCpacpVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.humApyEduCpacpVo != null ) this.humApyEduCpacpVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; humApyEduCpacpVoList != null && i < humApyEduCpacpVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo)humApyEduCpacpVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.humApyEduCpacpVo != null ) this.humApyEduCpacpVo._xStreamDec();

  }
  
}
