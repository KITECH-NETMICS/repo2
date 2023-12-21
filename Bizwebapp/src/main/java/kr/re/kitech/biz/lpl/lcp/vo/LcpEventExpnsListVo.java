package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpEventExpnsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpEventExpnsListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpEventExpnsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo> lcpEventExpnsVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpEventExpnsVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo lcpEventExpnsVo;
  
  @ElVoField(physicalName = "lcpEventExpnsVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo> getLcpEventExpnsVoList(){
      return lcpEventExpnsVoList;
  }

  @ElVoField(physicalName = "lcpEventExpnsVoList")
  public void setLcpEventExpnsVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo> lcpEventExpnsVoList){
      this.lcpEventExpnsVoList = lcpEventExpnsVoList;
  }

  @ElVoField(physicalName = "lcpEventExpnsVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo getLcpEventExpnsVo(){
      return lcpEventExpnsVo;
  }

  @ElVoField(physicalName = "lcpEventExpnsVo")
  public void setLcpEventExpnsVo(kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo lcpEventExpnsVo){
      this.lcpEventExpnsVo = lcpEventExpnsVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpEventExpnsListVo [");
      sb.append("lcpEventExpnsVoList").append("=").append(lcpEventExpnsVoList).append(",");
      sb.append("lcpEventExpnsVo").append("=").append(lcpEventExpnsVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpEventExpnsVoList != null && i < lcpEventExpnsVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo)lcpEventExpnsVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpEventExpnsVo != null ) this.lcpEventExpnsVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpEventExpnsVoList != null && i < lcpEventExpnsVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo)lcpEventExpnsVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpEventExpnsVo != null ) this.lcpEventExpnsVo._xStreamDec();

  }
  
}
