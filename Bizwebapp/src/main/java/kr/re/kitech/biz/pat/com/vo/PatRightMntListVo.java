package kr.re.kitech.biz.pat.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatRightMntListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRightMntListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "PatRightMntVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.com.vo.PatRightMntVo> PatRightMntVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatRightMntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.com.vo.PatRightMntVo PatRightMntVo;
  
  @ElVoField(physicalName = "PatRightMntVoList")
    public java.util.List<kr.re.kitech.biz.pat.com.vo.PatRightMntVo> getPatRightMntVoList(){
      return PatRightMntVoList;
  }

  @ElVoField(physicalName = "PatRightMntVoList")
  public void setPatRightMntVoList(java.util.List<kr.re.kitech.biz.pat.com.vo.PatRightMntVo> PatRightMntVoList){
      this.PatRightMntVoList = PatRightMntVoList;
  }

  @ElVoField(physicalName = "PatRightMntVo")
    public kr.re.kitech.biz.pat.com.vo.PatRightMntVo getPatRightMntVo(){
      return PatRightMntVo;
  }

  @ElVoField(physicalName = "PatRightMntVo")
  public void setPatRightMntVo(kr.re.kitech.biz.pat.com.vo.PatRightMntVo PatRightMntVo){
      this.PatRightMntVo = PatRightMntVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRightMntListVo [");
      sb.append("PatRightMntVoList").append("=").append(PatRightMntVoList).append(",");
      sb.append("PatRightMntVo").append("=").append(PatRightMntVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; PatRightMntVoList != null && i < PatRightMntVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.com.vo.PatRightMntVo vo = (kr.re.kitech.biz.pat.com.vo.PatRightMntVo)PatRightMntVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.PatRightMntVo != null ) this.PatRightMntVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; PatRightMntVoList != null && i < PatRightMntVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.com.vo.PatRightMntVo vo = (kr.re.kitech.biz.pat.com.vo.PatRightMntVo)PatRightMntVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.PatRightMntVo != null ) this.PatRightMntVo._xStreamDec();

  }
  
}
