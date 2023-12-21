package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatMastrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatMastrListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patMastrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.chr.vo.PatMastrVo> patMastrVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patMastrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.chr.vo.PatMastrVo patMastrVo;
  
  @ElVoField(physicalName = "patMastrVoList")
    public java.util.List<kr.re.kitech.biz.pat.chr.vo.PatMastrVo> getPatMastrVoList(){
      return patMastrVoList;
  }

  @ElVoField(physicalName = "patMastrVoList")
  public void setPatMastrVoList(java.util.List<kr.re.kitech.biz.pat.chr.vo.PatMastrVo> patMastrVoList){
      this.patMastrVoList = patMastrVoList;
  }

  @ElVoField(physicalName = "patMastrVo")
    public kr.re.kitech.biz.pat.chr.vo.PatMastrVo getPatMastrVo(){
      return patMastrVo;
  }

  @ElVoField(physicalName = "patMastrVo")
  public void setPatMastrVo(kr.re.kitech.biz.pat.chr.vo.PatMastrVo patMastrVo){
      this.patMastrVo = patMastrVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatMastrListVo [");
      sb.append("patMastrVoList").append("=").append(patMastrVoList).append(",");
      sb.append("patMastrVo").append("=").append(patMastrVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patMastrVoList != null && i < patMastrVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatMastrVo vo = (kr.re.kitech.biz.pat.chr.vo.PatMastrVo)patMastrVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patMastrVo != null ) this.patMastrVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patMastrVoList != null && i < patMastrVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.chr.vo.PatMastrVo vo = (kr.re.kitech.biz.pat.chr.vo.PatMastrVo)patMastrVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patMastrVo != null ) this.patMastrVo._xStreamDec();

  }
  
}
