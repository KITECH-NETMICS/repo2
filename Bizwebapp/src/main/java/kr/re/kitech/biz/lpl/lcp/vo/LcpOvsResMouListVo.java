package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpOvsResMouListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpOvsResMouListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lcpOvsResMouVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo> lcpOvsResMouVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lcpOvsResMouVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo lcpOvsResMouVo;
  
  @ElVoField(physicalName = "lcpOvsResMouVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo> getLcpOvsResMouVoList(){
      return lcpOvsResMouVoList;
  }

  @ElVoField(physicalName = "lcpOvsResMouVoList")
  public void setLcpOvsResMouVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo> lcpOvsResMouVoList){
      this.lcpOvsResMouVoList = lcpOvsResMouVoList;
  }

  @ElVoField(physicalName = "lcpOvsResMouVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo getLcpOvsResMouVo(){
      return lcpOvsResMouVo;
  }

  @ElVoField(physicalName = "lcpOvsResMouVo")
  public void setLcpOvsResMouVo(kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo lcpOvsResMouVo){
      this.lcpOvsResMouVo = lcpOvsResMouVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpOvsResMouListVo [");
      sb.append("lcpOvsResMouVoList").append("=").append(lcpOvsResMouVoList).append(",");
      sb.append("lcpOvsResMouVo").append("=").append(lcpOvsResMouVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lcpOvsResMouVoList != null && i < lcpOvsResMouVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo)lcpOvsResMouVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lcpOvsResMouVo != null ) this.lcpOvsResMouVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lcpOvsResMouVoList != null && i < lcpOvsResMouVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo)lcpOvsResMouVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lcpOvsResMouVo != null ) this.lcpOvsResMouVo._xStreamDec();

  }
  
}
