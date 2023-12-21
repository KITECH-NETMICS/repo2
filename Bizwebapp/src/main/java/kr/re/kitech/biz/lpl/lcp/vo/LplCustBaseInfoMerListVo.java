package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LplCustBaseInfoMerListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LplCustBaseInfoMerListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "lplCustBaseInfoMerVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo> lplCustBaseInfoMerVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "lplCustBaseInfoMerVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo lplCustBaseInfoMerVo;
  
  @ElVoField(physicalName = "lplCustBaseInfoMerVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo> getLplCustBaseInfoMerVoList(){
      return lplCustBaseInfoMerVoList;
  }

  @ElVoField(physicalName = "lplCustBaseInfoMerVoList")
  public void setLplCustBaseInfoMerVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo> lplCustBaseInfoMerVoList){
      this.lplCustBaseInfoMerVoList = lplCustBaseInfoMerVoList;
  }

  @ElVoField(physicalName = "lplCustBaseInfoMerVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo getLplCustBaseInfoMerVo(){
      return lplCustBaseInfoMerVo;
  }

  @ElVoField(physicalName = "lplCustBaseInfoMerVo")
  public void setLplCustBaseInfoMerVo(kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo lplCustBaseInfoMerVo){
      this.lplCustBaseInfoMerVo = lplCustBaseInfoMerVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LplCustBaseInfoMerListVo [");
      sb.append("lplCustBaseInfoMerVoList").append("=").append(lplCustBaseInfoMerVoList).append(",");
      sb.append("lplCustBaseInfoMerVo").append("=").append(lplCustBaseInfoMerVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; lplCustBaseInfoMerVoList != null && i < lplCustBaseInfoMerVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo)lplCustBaseInfoMerVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.lplCustBaseInfoMerVo != null ) this.lplCustBaseInfoMerVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; lplCustBaseInfoMerVoList != null && i < lplCustBaseInfoMerVoList.size() ; i++ ) {
        kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo)lplCustBaseInfoMerVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.lplCustBaseInfoMerVo != null ) this.lplCustBaseInfoMerVo._xStreamDec();

  }
  
}
