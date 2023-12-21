package kr.re.kitech.biz.pat.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatTotAcdtHisListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatTotAcdtHisListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "PatTotAcdtHisVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo> PatTotAcdtHisVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatTotAcdtHisVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo PatTotAcdtHisVo;
  
  @ElVoField(physicalName = "PatTotAcdtHisVoList")
    public java.util.List<kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo> getPatTotAcdtHisVoList(){
      return PatTotAcdtHisVoList;
  }

  @ElVoField(physicalName = "PatTotAcdtHisVoList")
  public void setPatTotAcdtHisVoList(java.util.List<kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo> PatTotAcdtHisVoList){
      this.PatTotAcdtHisVoList = PatTotAcdtHisVoList;
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
      sb.append("PatTotAcdtHisListVo [");
      sb.append("PatTotAcdtHisVoList").append("=").append(PatTotAcdtHisVoList).append(",");
      sb.append("PatTotAcdtHisVo").append("=").append(PatTotAcdtHisVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; PatTotAcdtHisVoList != null && i < PatTotAcdtHisVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo vo = (kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo)PatTotAcdtHisVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.PatTotAcdtHisVo != null ) this.PatTotAcdtHisVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; PatTotAcdtHisVoList != null && i < PatTotAcdtHisVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo vo = (kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo)PatTotAcdtHisVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.PatTotAcdtHisVo != null ) this.PatTotAcdtHisVo._xStreamDec();

  }
  
}
