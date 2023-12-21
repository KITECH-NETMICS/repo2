package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouDomTabListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouDomTabListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouDomTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo> lcpMouDomTabVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpMouDomTabVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo lcpMouDomTabVo;
  
  @ElVoField(physicalName = "lcpMouDomTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo> getLcpMouDomTabVoList(){
      return lcpMouDomTabVoList;
  }

  @ElVoField(physicalName = "lcpMouDomTabVoList")
  public void setLcpMouDomTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo> lcpMouDomTabVoList){
      this.lcpMouDomTabVoList = lcpMouDomTabVoList;
  }

  @ElVoField(physicalName = "lcpMouDomTabVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo getLcpMouDomTabVo(){
      return lcpMouDomTabVo;
  }

  @ElVoField(physicalName = "lcpMouDomTabVo")
  public void setLcpMouDomTabVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo lcpMouDomTabVo){
      this.lcpMouDomTabVo = lcpMouDomTabVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouDomTabListVo [");
      sb.append("lcpMouDomTabVoList").append("=").append(lcpMouDomTabVoList).append(",");
      sb.append("lcpMouDomTabVo").append("=").append(lcpMouDomTabVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpMouDomTabVoList != null && i < lcpMouDomTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo)lcpMouDomTabVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpMouDomTabVo != null ) this.lcpMouDomTabVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpMouDomTabVoList != null && i < lcpMouDomTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo)lcpMouDomTabVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpMouDomTabVo != null ) this.lcpMouDomTabVo._xStreamDec();

  }
  
}
