package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpVipAudencListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpVipAudencListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpVipAudencVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo> lcpVipAudencVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpVipAudencVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo lcpVipAudencVo;
  
  @ElVoField(physicalName = "lcpVipAudencVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo> getLcpVipAudencVoList(){
      return lcpVipAudencVoList;
  }

  @ElVoField(physicalName = "lcpVipAudencVoList")
  public void setLcpVipAudencVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo> lcpVipAudencVoList){
      this.lcpVipAudencVoList = lcpVipAudencVoList;
  }

  @ElVoField(physicalName = "lcpVipAudencVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo getLcpVipAudencVo(){
      return lcpVipAudencVo;
  }

  @ElVoField(physicalName = "lcpVipAudencVo")
  public void setLcpVipAudencVo(kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo lcpVipAudencVo){
      this.lcpVipAudencVo = lcpVipAudencVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpVipAudencListVo [");
      sb.append("lcpVipAudencVoList").append("=").append(lcpVipAudencVoList).append(",");
      sb.append("lcpVipAudencVo").append("=").append(lcpVipAudencVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpVipAudencVoList != null && i < lcpVipAudencVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo)lcpVipAudencVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpVipAudencVo != null ) this.lcpVipAudencVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpVipAudencVoList != null && i < lcpVipAudencVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo)lcpVipAudencVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpVipAudencVo != null ) this.lcpVipAudencVo._xStreamDec();

  }
  
}
