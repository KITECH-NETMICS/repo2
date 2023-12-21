package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouDomFormListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouDomFormListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouDomFormVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo> lcpMouDomFormVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpMouDomFormVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo lcpMouDomFormVo;
  
  @ElVoField(physicalName = "lcpMouDomFormVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo> getLcpMouDomFormVoList(){
      return lcpMouDomFormVoList;
  }

  @ElVoField(physicalName = "lcpMouDomFormVoList")
  public void setLcpMouDomFormVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo> lcpMouDomFormVoList){
      this.lcpMouDomFormVoList = lcpMouDomFormVoList;
  }

  @ElVoField(physicalName = "lcpMouDomFormVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo getLcpMouDomFormVo(){
      return lcpMouDomFormVo;
  }

  @ElVoField(physicalName = "lcpMouDomFormVo")
  public void setLcpMouDomFormVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo lcpMouDomFormVo){
      this.lcpMouDomFormVo = lcpMouDomFormVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouDomFormListVo [");
      sb.append("lcpMouDomFormVoList").append("=").append(lcpMouDomFormVoList).append(",");
      sb.append("lcpMouDomFormVo").append("=").append(lcpMouDomFormVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpMouDomFormVoList != null && i < lcpMouDomFormVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo)lcpMouDomFormVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpMouDomFormVo != null ) this.lcpMouDomFormVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpMouDomFormVoList != null && i < lcpMouDomFormVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo)lcpMouDomFormVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpMouDomFormVo != null ) this.lcpMouDomFormVo._xStreamDec();

  }
  
}
