package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpEventTabListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpEventTabListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpEventTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo> lcpEventTabVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpEventTabVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo lcpEventTabVo;
  
  @ElVoField(physicalName = "lcpEventTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo> getLcpEventTabVoList(){
      return lcpEventTabVoList;
  }

  @ElVoField(physicalName = "lcpEventTabVoList")
  public void setLcpEventTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo> lcpEventTabVoList){
      this.lcpEventTabVoList = lcpEventTabVoList;
  }

  @ElVoField(physicalName = "lcpEventTabVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo getLcpEventTabVo(){
      return lcpEventTabVo;
  }

  @ElVoField(physicalName = "lcpEventTabVo")
  public void setLcpEventTabVo(kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo lcpEventTabVo){
      this.lcpEventTabVo = lcpEventTabVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpEventTabListVo [");
      sb.append("lcpEventTabVoList").append("=").append(lcpEventTabVoList).append(",");
      sb.append("lcpEventTabVo").append("=").append(lcpEventTabVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpEventTabVoList != null && i < lcpEventTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo)lcpEventTabVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpEventTabVo != null ) this.lcpEventTabVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpEventTabVoList != null && i < lcpEventTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo)lcpEventTabVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpEventTabVo != null ) this.lcpEventTabVo._xStreamDec();

  }
  
}
