package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouDomExcelListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouDomExcelListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouDomExcelVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo> lcpMouDomExcelVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpMouDomExcelVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo lcpMouDomExcelVo;
  
  @ElVoField(physicalName = "lcpMouDomExcelVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo> getLcpMouDomExcelVoList(){
      return lcpMouDomExcelVoList;
  }

  @ElVoField(physicalName = "lcpMouDomExcelVoList")
  public void setLcpMouDomExcelVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo> lcpMouDomExcelVoList){
      this.lcpMouDomExcelVoList = lcpMouDomExcelVoList;
  }

  @ElVoField(physicalName = "lcpMouDomExcelVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo getLcpMouDomExcelVo(){
      return lcpMouDomExcelVo;
  }

  @ElVoField(physicalName = "lcpMouDomExcelVo")
  public void setLcpMouDomExcelVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo lcpMouDomExcelVo){
      this.lcpMouDomExcelVo = lcpMouDomExcelVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouDomExcelListVo [");
      sb.append("lcpMouDomExcelVoList").append("=").append(lcpMouDomExcelVoList).append(",");
      sb.append("lcpMouDomExcelVo").append("=").append(lcpMouDomExcelVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpMouDomExcelVoList != null && i < lcpMouDomExcelVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo)lcpMouDomExcelVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpMouDomExcelVo != null ) this.lcpMouDomExcelVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpMouDomExcelVoList != null && i < lcpMouDomExcelVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo)lcpMouDomExcelVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpMouDomExcelVo != null ) this.lcpMouDomExcelVo._xStreamDec();

  }
  
}
