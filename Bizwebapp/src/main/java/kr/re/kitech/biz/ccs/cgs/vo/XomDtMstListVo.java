package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class XomDtMstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public XomDtMstListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "XomDtMstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo> XomDtMstVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "XomDtMstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo XomDtMstVo;
  
  @ElVoField(physicalName = "XomDtMstVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo> getXomDtMstVoList(){
      return XomDtMstVoList;
  }

  @ElVoField(physicalName = "XomDtMstVoList")
  public void setXomDtMstVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo> XomDtMstVoList){
      this.XomDtMstVoList = XomDtMstVoList;
  }

  @ElVoField(physicalName = "XomDtMstVo")
    public kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo getXomDtMstVo(){
      return XomDtMstVo;
  }

  @ElVoField(physicalName = "XomDtMstVo")
  public void setXomDtMstVo(kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo XomDtMstVo){
      this.XomDtMstVo = XomDtMstVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("XomDtMstListVo [");
      sb.append("XomDtMstVoList").append("=").append(XomDtMstVoList).append(",");
      sb.append("XomDtMstVo").append("=").append(XomDtMstVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; XomDtMstVoList != null && i < XomDtMstVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo vo = (kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo)XomDtMstVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.XomDtMstVo != null ) this.XomDtMstVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; XomDtMstVoList != null && i < XomDtMstVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo vo = (kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo)XomDtMstVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.XomDtMstVo != null ) this.XomDtMstVo._xStreamDec();

  }
  
}
