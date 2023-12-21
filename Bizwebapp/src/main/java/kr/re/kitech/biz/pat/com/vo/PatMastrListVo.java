package kr.re.kitech.biz.pat.com.vo;

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

  @ElDtoField(logicalName = "List Vo", physicalName = "PatMastrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.com.vo.PatMastrVo> PatMastrVoList;

  @ElDtoField(logicalName = "Single Vo", physicalName = "PatMastrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.com.vo.PatMastrVo PatMastrVo;

  @ElDtoField(logicalName = "Single Vo", physicalName = "PatRightMntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.com.vo.PatRightMntVo PatRightMntVo;

  @ElDtoField(logicalName = "Single Vo", physicalName = "PatTotAcdtHisVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo PatTotAcdtHisVo;

  @ElVoField(physicalName = "PatMastrVoList")
    public java.util.List<kr.re.kitech.biz.pat.com.vo.PatMastrVo> getPatMastrVoList(){
      return PatMastrVoList;
  }

  @ElVoField(physicalName = "PatMastrVoList")
  public void setPatMastrVoList(java.util.List<kr.re.kitech.biz.pat.com.vo.PatMastrVo> PatMastrVoList){
      this.PatMastrVoList = PatMastrVoList;
  }

  @ElVoField(physicalName = "PatMastrVo")
    public kr.re.kitech.biz.pat.com.vo.PatMastrVo getPatMastrVo(){
      return PatMastrVo;
  }

  @ElVoField(physicalName = "PatMastrVo")
  public void setPatMastrVo(kr.re.kitech.biz.pat.com.vo.PatMastrVo PatMastrVo){
      this.PatMastrVo = PatMastrVo;
  }

  @ElVoField(physicalName = "PatRightMntVo")
    public kr.re.kitech.biz.pat.com.vo.PatRightMntVo getPatRightMntVo(){
      return PatRightMntVo;
  }

  @ElVoField(physicalName = "PatRightMntVo")
  public void setPatRightMntVo(kr.re.kitech.biz.pat.com.vo.PatRightMntVo PatRightMntVo){
      this.PatRightMntVo = PatRightMntVo;
  }

  @ElVoField(physicalName = "PatTotAcdtHisVo")
    public kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo getPatTotAcdtHisVo(){
      return PatTotAcdtHisVo;
  }

  @ElVoField(physicalName = "PatTotAcdtHisVo")
  public void setPatTotAcdtHisVo(kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo PatTotAcdtHisVo){
      this.PatTotAcdtHisVo = PatTotAcdtHisVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatMastrListVo [");
      sb.append("PatMastrVoList").append("=").append(PatMastrVoList).append(",");
      sb.append("PatMastrVo").append("=").append(PatMastrVo).append(",");
      sb.append("PatRightMntVo").append("=").append(PatRightMntVo).append(",");
      sb.append("PatTotAcdtHisVo").append("=").append(PatTotAcdtHisVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; PatMastrVoList != null && i < PatMastrVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.com.vo.PatMastrVo vo = (kr.re.kitech.biz.pat.com.vo.PatMastrVo)PatMastrVoList.get(i);
        vo._xStreamEnc();
    }
    if( this.PatMastrVo != null ) this.PatMastrVo._xStreamEnc();
    if( this.PatRightMntVo != null ) this.PatRightMntVo._xStreamEnc();
    if( this.PatTotAcdtHisVo != null ) this.PatTotAcdtHisVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; PatMastrVoList != null && i < PatMastrVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.com.vo.PatMastrVo vo = (kr.re.kitech.biz.pat.com.vo.PatMastrVo)PatMastrVoList.get(i);
        vo._xStreamDec();
    }
    if( this.PatMastrVo != null ) this.PatMastrVo._xStreamDec();
    if( this.PatRightMntVo != null ) this.PatRightMntVo._xStreamDec();
    if( this.PatTotAcdtHisVo != null ) this.PatTotAcdtHisVo._xStreamDec();

  }

}
