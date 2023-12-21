package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatChrCasInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatChrCasInfoVo(){
  }

  @ElDtoField(logicalName = "patRneCmtVo", physicalName = "patRneCmtVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo patRneCmtVo;

  @ElDtoField(logicalName = "patSmitappVo", physicalName = "patSmitappVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatSmitappVo patSmitappVo;

  @ElDtoField(logicalName = "patMastrVo", physicalName = "patMastrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatMastrVo patMastrVo;

  @ElDtoField(logicalName = "patPrioritySmitappList", physicalName = "patPrioritySmitappList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo> patPrioritySmitappList;

  @ElVoField(physicalName = "patRneCmtVo")
    public kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo getPatRneCmtVo(){
      return patRneCmtVo;
  }

  @ElVoField(physicalName = "patRneCmtVo")
  public void setPatRneCmtVo(kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo patRneCmtVo){
      this.patRneCmtVo = patRneCmtVo;
  }

  @ElVoField(physicalName = "patSmitappVo")
    public kr.re.kitech.biz.pat.chr.vo.PatSmitappVo getPatSmitappVo(){
      return patSmitappVo;
  }

  @ElVoField(physicalName = "patSmitappVo")
  public void setPatSmitappVo(kr.re.kitech.biz.pat.chr.vo.PatSmitappVo patSmitappVo){
      this.patSmitappVo = patSmitappVo;
  }

  @ElVoField(physicalName = "patMastrVo")
    public kr.re.kitech.biz.pat.chr.vo.PatMastrVo getPatMastrVo(){
      return patMastrVo;
  }

  @ElVoField(physicalName = "patMastrVo")
  public void setPatMastrVo(kr.re.kitech.biz.pat.chr.vo.PatMastrVo patMastrVo){
      this.patMastrVo = patMastrVo;
  }

  @ElVoField(physicalName = "patPrioritySmitappList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo> getPatPrioritySmitappList(){
      return patPrioritySmitappList;
  }

  @ElVoField(physicalName = "patPrioritySmitappList")
  public void setPatPrioritySmitappList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo> patPrioritySmitappList){
      this.patPrioritySmitappList = patPrioritySmitappList;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatChrCasInfoVo [");
      sb.append("patRneCmtVo").append("=").append(patRneCmtVo).append(",");
      sb.append("patSmitappVo").append("=").append(patSmitappVo).append(",");
      sb.append("patMastrVo").append("=").append(patMastrVo).append(",");
      sb.append("patPrioritySmitappList").append("=").append(patPrioritySmitappList);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    if( this.patRneCmtVo != null ) this.patRneCmtVo._xStreamEnc();
    if( this.patSmitappVo != null ) this.patSmitappVo._xStreamEnc();
    if( this.patMastrVo != null ) this.patMastrVo._xStreamEnc();
    for( int i=0 ; patPrioritySmitappList != null && i < patPrioritySmitappList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo vo = (kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo)patPrioritySmitappList.get(i);
        vo._xStreamEnc();
    }

  }


  @Override
  public void _xStreamDec() {
    if( this.patRneCmtVo != null ) this.patRneCmtVo._xStreamDec();
    if( this.patSmitappVo != null ) this.patSmitappVo._xStreamDec();
    if( this.patMastrVo != null ) this.patMastrVo._xStreamDec();
    for( int i=0 ; patPrioritySmitappList != null && i < patPrioritySmitappList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo vo = (kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo)patPrioritySmitappList.get(i);
        vo._xStreamDec();
    }

  }

}
