package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatRegstUpdateListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRegstUpdateListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patRegstUpdateVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo> patRegstUpdateVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patRegstUpdateVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo patRegstUpdateVo;
  
  @ElVoField(physicalName = "patRegstUpdateVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo> getPatRegstUpdateVoList(){
      return patRegstUpdateVoList;
  }

  @ElVoField(physicalName = "patRegstUpdateVoList")
  public void setPatRegstUpdateVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo> patRegstUpdateVoList){
      this.patRegstUpdateVoList = patRegstUpdateVoList;
  }

  @ElVoField(physicalName = "patRegstUpdateVo")
    public kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo getPatRegstUpdateVo(){
      return patRegstUpdateVo;
  }

  @ElVoField(physicalName = "patRegstUpdateVo")
  public void setPatRegstUpdateVo(kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo patRegstUpdateVo){
      this.patRegstUpdateVo = patRegstUpdateVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRegstUpdateListVo [");
      sb.append("patRegstUpdateVoList").append("=").append(patRegstUpdateVoList).append(",");
      sb.append("patRegstUpdateVo").append("=").append(patRegstUpdateVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patRegstUpdateVoList != null && i < patRegstUpdateVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo)patRegstUpdateVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patRegstUpdateVo != null ) this.patRegstUpdateVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patRegstUpdateVoList != null && i < patRegstUpdateVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo)patRegstUpdateVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patRegstUpdateVo != null ) this.patRegstUpdateVo._xStreamDec();

  }
  
}
