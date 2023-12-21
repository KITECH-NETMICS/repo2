package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpAgncyMstFormListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpAgncyMstFormListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpAgncyMstFormVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo> lcpAgncyMstFormVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpAgncyMstFormVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo lcpAgncyMstFormVo;
  
  @ElVoField(physicalName = "lcpAgncyMstFormVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo> getLcpAgncyMstFormVoList(){
      return lcpAgncyMstFormVoList;
  }

  @ElVoField(physicalName = "lcpAgncyMstFormVoList")
  public void setLcpAgncyMstFormVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo> lcpAgncyMstFormVoList){
      this.lcpAgncyMstFormVoList = lcpAgncyMstFormVoList;
  }

  @ElVoField(physicalName = "lcpAgncyMstFormVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo getLcpAgncyMstFormVo(){
      return lcpAgncyMstFormVo;
  }

  @ElVoField(physicalName = "lcpAgncyMstFormVo")
  public void setLcpAgncyMstFormVo(kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo lcpAgncyMstFormVo){
      this.lcpAgncyMstFormVo = lcpAgncyMstFormVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpAgncyMstFormListVo [");
      sb.append("lcpAgncyMstFormVoList").append("=").append(lcpAgncyMstFormVoList).append(",");
      sb.append("lcpAgncyMstFormVo").append("=").append(lcpAgncyMstFormVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpAgncyMstFormVoList != null && i < lcpAgncyMstFormVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo)lcpAgncyMstFormVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpAgncyMstFormVo != null ) this.lcpAgncyMstFormVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpAgncyMstFormVoList != null && i < lcpAgncyMstFormVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo)lcpAgncyMstFormVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpAgncyMstFormVo != null ) this.lcpAgncyMstFormVo._xStreamDec();

  }
  
}
