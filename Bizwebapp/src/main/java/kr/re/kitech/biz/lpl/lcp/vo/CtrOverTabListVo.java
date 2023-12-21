package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CtrOverTabListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CtrOverTabListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "ctrOverTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo> ctrOverTabVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "ctrOverTabVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo ctrOverTabVo;
  
  @ElVoField(physicalName = "ctrOverTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo> getCtrOverTabVoList(){
      return ctrOverTabVoList;
  }

  @ElVoField(physicalName = "ctrOverTabVoList")
  public void setCtrOverTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo> ctrOverTabVoList){
      this.ctrOverTabVoList = ctrOverTabVoList;
  }

  @ElVoField(physicalName = "ctrOverTabVo")
    public kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo getCtrOverTabVo(){
      return ctrOverTabVo;
  }

  @ElVoField(physicalName = "ctrOverTabVo")
  public void setCtrOverTabVo(kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo ctrOverTabVo){
      this.ctrOverTabVo = ctrOverTabVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CtrOverTabListVo [");
      sb.append("ctrOverTabVoList").append("=").append(ctrOverTabVoList).append(",");
      sb.append("ctrOverTabVo").append("=").append(ctrOverTabVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; ctrOverTabVoList != null && i < ctrOverTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo)ctrOverTabVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.ctrOverTabVo != null ) this.ctrOverTabVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; ctrOverTabVoList != null && i < ctrOverTabVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo)ctrOverTabVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.ctrOverTabVo != null ) this.ctrOverTabVo._xStreamDec();

  }
  
}
