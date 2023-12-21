package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatRneCmtListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRneCmtListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patRneCmtVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo> patRneCmtVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patRneCmtVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo patRneCmtVo;
  
  @ElVoField(physicalName = "patRneCmtVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo> getPatRneCmtVoList(){
      return patRneCmtVoList;
  }

  @ElVoField(physicalName = "patRneCmtVoList")
  public void setPatRneCmtVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo> patRneCmtVoList){
      this.patRneCmtVoList = patRneCmtVoList;
  }

  @ElVoField(physicalName = "patRneCmtVo")
    public kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo getPatRneCmtVo(){
      return patRneCmtVo;
  }

  @ElVoField(physicalName = "patRneCmtVo")
  public void setPatRneCmtVo(kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo patRneCmtVo){
      this.patRneCmtVo = patRneCmtVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRneCmtListVo [");
      sb.append("patRneCmtVoList").append("=").append(patRneCmtVoList).append(",");
      sb.append("patRneCmtVo").append("=").append(patRneCmtVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patRneCmtVoList != null && i < patRneCmtVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo)patRneCmtVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patRneCmtVo != null ) this.patRneCmtVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patRneCmtVoList != null && i < patRneCmtVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRneCmtVo)patRneCmtVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patRneCmtVo != null ) this.patRneCmtVo._xStreamDec();

  }
  
}
