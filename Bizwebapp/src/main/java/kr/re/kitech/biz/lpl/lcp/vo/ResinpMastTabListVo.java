package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class ResinpMastTabListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResinpMastTabListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "resinpMastTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo> resinpMastTabVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "resinpMastTabVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo resinpMastTabVo;
  
  @ElVoField(physicalName = "resinpMastTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo> getResinpMastTabVoList(){
      return resinpMastTabVoList;
  }

  @ElVoField(physicalName = "resinpMastTabVoList")
  public void setResinpMastTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo> resinpMastTabVoList){
      this.resinpMastTabVoList = resinpMastTabVoList;
  }

  @ElVoField(physicalName = "resinpMastTabVo")
    public kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo getResinpMastTabVo(){
      return resinpMastTabVo;
  }

  @ElVoField(physicalName = "resinpMastTabVo")
  public void setResinpMastTabVo(kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo resinpMastTabVo){
      this.resinpMastTabVo = resinpMastTabVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResinpMastTabListVo [");
      sb.append("resinpMastTabVoList").append("=").append(resinpMastTabVoList).append(",");
      sb.append("resinpMastTabVo").append("=").append(resinpMastTabVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; resinpMastTabVoList != null && i < resinpMastTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo)resinpMastTabVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.resinpMastTabVo != null ) this.resinpMastTabVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; resinpMastTabVoList != null && i < resinpMastTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo)resinpMastTabVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.resinpMastTabVo != null ) this.resinpMastTabVo._xStreamDec();

  }
  
}
