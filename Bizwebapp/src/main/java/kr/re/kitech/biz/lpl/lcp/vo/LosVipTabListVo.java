package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LosVipTabListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LosVipTabListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "losVipTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo> losVipTabVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "losVipTabVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo losVipTabVo;
  
  @ElVoField(physicalName = "losVipTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo> getLosVipTabVoList(){
      return losVipTabVoList;
  }

  @ElVoField(physicalName = "losVipTabVoList")
  public void setLosVipTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo> losVipTabVoList){
      this.losVipTabVoList = losVipTabVoList;
  }

  @ElVoField(physicalName = "losVipTabVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo getLosVipTabVo(){
      return losVipTabVo;
  }

  @ElVoField(physicalName = "losVipTabVo")
  public void setLosVipTabVo(kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo losVipTabVo){
      this.losVipTabVo = losVipTabVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LosVipTabListVo [");
      sb.append("losVipTabVoList").append("=").append(losVipTabVoList).append(",");
      sb.append("losVipTabVo").append("=").append(losVipTabVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; losVipTabVoList != null && i < losVipTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo)losVipTabVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.losVipTabVo != null ) this.losVipTabVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; losVipTabVoList != null && i < losVipTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo)losVipTabVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.losVipTabVo != null ) this.losVipTabVo._xStreamDec();

  }
  
}
