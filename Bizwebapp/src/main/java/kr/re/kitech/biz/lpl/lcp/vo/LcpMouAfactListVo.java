package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouAfactListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouAfactListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouAfactVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo> lcpMouAfactVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpMouAfactVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo lcpMouAfactVo;
  
  @ElVoField(physicalName = "lcpMouAfactVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo> getLcpMouAfactVoList(){
      return lcpMouAfactVoList;
  }

  @ElVoField(physicalName = "lcpMouAfactVoList")
  public void setLcpMouAfactVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo> lcpMouAfactVoList){
      this.lcpMouAfactVoList = lcpMouAfactVoList;
  }

  @ElVoField(physicalName = "lcpMouAfactVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo getLcpMouAfactVo(){
      return lcpMouAfactVo;
  }

  @ElVoField(physicalName = "lcpMouAfactVo")
  public void setLcpMouAfactVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo lcpMouAfactVo){
      this.lcpMouAfactVo = lcpMouAfactVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouAfactListVo [");
      sb.append("lcpMouAfactVoList").append("=").append(lcpMouAfactVoList).append(",");
      sb.append("lcpMouAfactVo").append("=").append(lcpMouAfactVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpMouAfactVoList != null && i < lcpMouAfactVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo)lcpMouAfactVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpMouAfactVo != null ) this.lcpMouAfactVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpMouAfactVoList != null && i < lcpMouAfactVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo)lcpMouAfactVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpMouAfactVo != null ) this.lcpMouAfactVo._xStreamDec();

  }
  
}
