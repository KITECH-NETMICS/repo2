package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatRegstInsertListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRegstInsertListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patRegstInsertVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo> patRegstInsertVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patRegstInsertVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo patRegstInsertVo;
  
  @ElVoField(physicalName = "patRegstInsertVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo> getPatRegstInsertVoList(){
      return patRegstInsertVoList;
  }

  @ElVoField(physicalName = "patRegstInsertVoList")
  public void setPatRegstInsertVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo> patRegstInsertVoList){
      this.patRegstInsertVoList = patRegstInsertVoList;
  }

  @ElVoField(physicalName = "patRegstInsertVo")
    public kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo getPatRegstInsertVo(){
      return patRegstInsertVo;
  }

  @ElVoField(physicalName = "patRegstInsertVo")
  public void setPatRegstInsertVo(kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo patRegstInsertVo){
      this.patRegstInsertVo = patRegstInsertVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRegstInsertListVo [");
      sb.append("patRegstInsertVoList").append("=").append(patRegstInsertVoList).append(",");
      sb.append("patRegstInsertVo").append("=").append(patRegstInsertVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patRegstInsertVoList != null && i < patRegstInsertVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo)patRegstInsertVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patRegstInsertVo != null ) this.patRegstInsertVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patRegstInsertVoList != null && i < patRegstInsertVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo)patRegstInsertVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patRegstInsertVo != null ) this.patRegstInsertVo._xStreamDec();

  }
  
}
