package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatRightmntListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRightmntListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "PatRightmntVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRightmntVo> PatRightmntVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatRightmntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatRightmntVo PatRightmntVo;
  
  @ElVoField(physicalName = "PatRightmntVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRightmntVo> getPatRightmntVoList(){
      return PatRightmntVoList;
  }

  @ElVoField(physicalName = "PatRightmntVoList")
  public void setPatRightmntVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatRightmntVo> PatRightmntVoList){
      this.PatRightmntVoList = PatRightmntVoList;
  }

  @ElVoField(physicalName = "PatRightmntVo")
    public kr.re.kitech.biz.pat.chr.vo.PatRightmntVo getPatRightmntVo(){
      return PatRightmntVo;
  }

  @ElVoField(physicalName = "PatRightmntVo")
  public void setPatRightmntVo(kr.re.kitech.biz.pat.chr.vo.PatRightmntVo PatRightmntVo){
      this.PatRightmntVo = PatRightmntVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRightmntListVo [");
      sb.append("PatRightmntVoList").append("=").append(PatRightmntVoList).append(",");
      sb.append("PatRightmntVo").append("=").append(PatRightmntVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; PatRightmntVoList != null && i < PatRightmntVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRightmntVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRightmntVo)PatRightmntVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.PatRightmntVo != null ) this.PatRightmntVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; PatRightmntVoList != null && i < PatRightmntVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatRightmntVo vo = (kr.re.kitech.biz.pat.chr.vo.PatRightmntVo)PatRightmntVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.PatRightmntVo != null ) this.PatRightmntVo._xStreamDec();

  }
  
}
