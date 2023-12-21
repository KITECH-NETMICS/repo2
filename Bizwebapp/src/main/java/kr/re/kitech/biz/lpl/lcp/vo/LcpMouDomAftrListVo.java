package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouDomAftrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouDomAftrListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouDomAftrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo> lcpMouDomAftrVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpMouDomAftrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo lcpMouDomAftrVo;
  
  @ElVoField(physicalName = "lcpMouDomAftrVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo> getLcpMouDomAftrVoList(){
      return lcpMouDomAftrVoList;
  }

  @ElVoField(physicalName = "lcpMouDomAftrVoList")
  public void setLcpMouDomAftrVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo> lcpMouDomAftrVoList){
      this.lcpMouDomAftrVoList = lcpMouDomAftrVoList;
  }

  @ElVoField(physicalName = "lcpMouDomAftrVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo getLcpMouDomAftrVo(){
      return lcpMouDomAftrVo;
  }

  @ElVoField(physicalName = "lcpMouDomAftrVo")
  public void setLcpMouDomAftrVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo lcpMouDomAftrVo){
      this.lcpMouDomAftrVo = lcpMouDomAftrVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouDomAftrListVo [");
      sb.append("lcpMouDomAftrVoList").append("=").append(lcpMouDomAftrVoList).append(",");
      sb.append("lcpMouDomAftrVo").append("=").append(lcpMouDomAftrVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpMouDomAftrVoList != null && i < lcpMouDomAftrVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo)lcpMouDomAftrVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpMouDomAftrVo != null ) this.lcpMouDomAftrVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpMouDomAftrVoList != null && i < lcpMouDomAftrVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo)lcpMouDomAftrVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpMouDomAftrVo != null ) this.lcpMouDomAftrVo._xStreamDec();

  }
  
}
