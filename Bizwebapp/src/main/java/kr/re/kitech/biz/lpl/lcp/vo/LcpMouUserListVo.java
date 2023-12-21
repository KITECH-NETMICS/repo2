package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouUserListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouUserListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouUserVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo> lcpMouUserVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpMouUserVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo lcpMouUserVo;
  
  @ElVoField(physicalName = "lcpMouUserVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo> getLcpMouUserVoList(){
      return lcpMouUserVoList;
  }

  @ElVoField(physicalName = "lcpMouUserVoList")
  public void setLcpMouUserVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo> lcpMouUserVoList){
      this.lcpMouUserVoList = lcpMouUserVoList;
  }

  @ElVoField(physicalName = "lcpMouUserVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo getLcpMouUserVo(){
      return lcpMouUserVo;
  }

  @ElVoField(physicalName = "lcpMouUserVo")
  public void setLcpMouUserVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo lcpMouUserVo){
      this.lcpMouUserVo = lcpMouUserVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouUserListVo [");
      sb.append("lcpMouUserVoList").append("=").append(lcpMouUserVoList).append(",");
      sb.append("lcpMouUserVo").append("=").append(lcpMouUserVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpMouUserVoList != null && i < lcpMouUserVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo)lcpMouUserVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpMouUserVo != null ) this.lcpMouUserVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpMouUserVoList != null && i < lcpMouUserVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo)lcpMouUserVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpMouUserVo != null ) this.lcpMouUserVo._xStreamDec();

  }
  
}
