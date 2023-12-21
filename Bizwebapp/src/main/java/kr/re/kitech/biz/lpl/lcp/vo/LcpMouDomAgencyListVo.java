package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouDomAgencyListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouDomAgencyListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouDomAgencyVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> lcpMouDomAgencyVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpMouDomAgencyVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo lcpMouDomAgencyVo;
  
  @ElVoField(physicalName = "lcpMouDomAgencyVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> getLcpMouDomAgencyVoList(){
      return lcpMouDomAgencyVoList;
  }

  @ElVoField(physicalName = "lcpMouDomAgencyVoList")
  public void setLcpMouDomAgencyVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> lcpMouDomAgencyVoList){
      this.lcpMouDomAgencyVoList = lcpMouDomAgencyVoList;
  }

  @ElVoField(physicalName = "lcpMouDomAgencyVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo getLcpMouDomAgencyVo(){
      return lcpMouDomAgencyVo;
  }

  @ElVoField(physicalName = "lcpMouDomAgencyVo")
  public void setLcpMouDomAgencyVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo lcpMouDomAgencyVo){
      this.lcpMouDomAgencyVo = lcpMouDomAgencyVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouDomAgencyListVo [");
      sb.append("lcpMouDomAgencyVoList").append("=").append(lcpMouDomAgencyVoList).append(",");
      sb.append("lcpMouDomAgencyVo").append("=").append(lcpMouDomAgencyVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpMouDomAgencyVoList != null && i < lcpMouDomAgencyVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo)lcpMouDomAgencyVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpMouDomAgencyVo != null ) this.lcpMouDomAgencyVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpMouDomAgencyVoList != null && i < lcpMouDomAgencyVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo)lcpMouDomAgencyVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpMouDomAgencyVo != null ) this.lcpMouDomAgencyVo._xStreamDec();

  }
  
}
