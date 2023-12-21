package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatChrCasRegstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatChrCasRegstListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patChrCasRegstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo> patChrCasRegstVoList;

  @ElDtoField(logicalName = "Vo", physicalName = "patChrCasRegstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo patChrCasRegstVo;

  @ElDtoField(logicalName = "Vo", physicalName = "patRneCmtVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo patRneCmtVo;

  @ElDtoField(logicalName = "Vo", physicalName = "patSmitappVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatSmitappVo patSmitappVo;

  @ElDtoField(logicalName = "Vo", physicalName = "patMastrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatMastrVo patMastrVo;

  @ElDtoField(logicalName = "Vo", physicalName = "patPrioritySmitappVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo patPrioritySmitappVo;

  @ElDtoField(logicalName = "Vo", physicalName = "patTotAcdtHisVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo patTotAcdtHisVo;

  @ElDtoField(logicalName = "Vo", physicalName = "patRegstInsertVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo patRegstInsertVo;

  @ElDtoField(logicalName = "Vo", physicalName = "patRegstUpdateVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRegstUpdateVo patRegstUpdateVo;

  @ElVoField(physicalName = "patChrCasRegstVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo> getPatChrCasRegstVoList(){
      return patChrCasRegstVoList;
  }

  @ElVoField(physicalName = "patChrCasRegstVoList")
  public void setPatChrCasRegstVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo> patChrCasRegstVoList){
      this.patChrCasRegstVoList = patChrCasRegstVoList;
  }

  @ElVoField(physicalName = "patChrCasRegstVo")
    public kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo getPatChrCasRegstVo(){
      return patChrCasRegstVo;
  }

  @ElVoField(physicalName = "patChrCasRegstVo")
  public void setPatChrCasRegstVo(kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo patChrCasRegstVo){
      this.patChrCasRegstVo = patChrCasRegstVo;
  }

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

  @ElVoField(physicalName = "patPrioritySmitappVo")
    public kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo getPatPrioritySmitappVo(){
      return patPrioritySmitappVo;
  }

  @ElVoField(physicalName = "patPrioritySmitappVo")
  public void setPatPrioritySmitappVo(kr.re.kitech.biz.pat.chr.vo.PatPrioritySmitappVo patPrioritySmitappVo){
      this.patPrioritySmitappVo = patPrioritySmitappVo;
  }

  @ElVoField(physicalName = "patTotAcdtHisVo")
    public kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo getPatTotAcdtHisVo(){
      return patTotAcdtHisVo;
  }

  @ElVoField(physicalName = "patTotAcdtHisVo")
  public void setPatTotAcdtHisVo(kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo patTotAcdtHisVo){
      this.patTotAcdtHisVo = patTotAcdtHisVo;
  }

  @ElVoField(physicalName = "patRegstInsertVo")
    public kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo getPatRegstInsertVo(){
      return patRegstInsertVo;
  }

  @ElVoField(physicalName = "patRegstInsertVo")
  public void setPatRegstInsertVo(kr.re.kitech.biz.pat.chr.vo.PatRegstInsertVo patRegstInsertVo){
      this.patRegstInsertVo = patRegstInsertVo;
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
      sb.append("PatChrCasRegstListVo [");
      sb.append("patChrCasRegstVoList").append("=").append(patChrCasRegstVoList).append(",");
      sb.append("patChrCasRegstVo").append("=").append(patChrCasRegstVo).append(",");
      sb.append("patRneCmtVo").append("=").append(patRneCmtVo).append(",");
      sb.append("patSmitappVo").append("=").append(patSmitappVo).append(",");
      sb.append("patMastrVo").append("=").append(patMastrVo).append(",");
      sb.append("patPrioritySmitappVo").append("=").append(patPrioritySmitappVo).append(",");
      sb.append("patTotAcdtHisVo").append("=").append(patTotAcdtHisVo).append(",");
      sb.append("patRegstInsertVo").append("=").append(patRegstInsertVo).append(",");
      sb.append("patRegstUpdateVo").append("=").append(patRegstUpdateVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patChrCasRegstVoList != null && i < patChrCasRegstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo vo = (kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo)patChrCasRegstVoList.get(i);
        vo._xStreamEnc();
    }
    if( this.patChrCasRegstVo != null ) this.patChrCasRegstVo._xStreamEnc();
    if( this.patRneCmtVo != null ) this.patRneCmtVo._xStreamEnc();
    if( this.patSmitappVo != null ) this.patSmitappVo._xStreamEnc();
    if( this.patMastrVo != null ) this.patMastrVo._xStreamEnc();
    if( this.patPrioritySmitappVo != null ) this.patPrioritySmitappVo._xStreamEnc();
    if( this.patTotAcdtHisVo != null ) this.patTotAcdtHisVo._xStreamEnc();
    if( this.patRegstInsertVo != null ) this.patRegstInsertVo._xStreamEnc();
    if( this.patRegstUpdateVo != null ) this.patRegstUpdateVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patChrCasRegstVoList != null && i < patChrCasRegstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo vo = (kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo)patChrCasRegstVoList.get(i);
        vo._xStreamDec();
    }
    if( this.patChrCasRegstVo != null ) this.patChrCasRegstVo._xStreamDec();
    if( this.patRneCmtVo != null ) this.patRneCmtVo._xStreamDec();
    if( this.patSmitappVo != null ) this.patSmitappVo._xStreamDec();
    if( this.patMastrVo != null ) this.patMastrVo._xStreamDec();
    if( this.patPrioritySmitappVo != null ) this.patPrioritySmitappVo._xStreamDec();
    if( this.patTotAcdtHisVo != null ) this.patTotAcdtHisVo._xStreamDec();
    if( this.patRegstInsertVo != null ) this.patRegstInsertVo._xStreamDec();
    if( this.patRegstUpdateVo != null ) this.patRegstUpdateVo._xStreamDec();

  }

}
