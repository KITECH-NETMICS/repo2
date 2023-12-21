package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CgsSealUseListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CgsSealUseListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "cgsSealUseVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo> cgsSealUseVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "cgsSealUseVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo cgsSealUseVo;
  
  @ElVoField(physicalName = "cgsSealUseVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo> getCgsSealUseVoList(){
      return cgsSealUseVoList;
  }

  @ElVoField(physicalName = "cgsSealUseVoList")
  public void setCgsSealUseVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo> cgsSealUseVoList){
      this.cgsSealUseVoList = cgsSealUseVoList;
  }

  @ElVoField(physicalName = "cgsSealUseVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo getCgsSealUseVo(){
      return cgsSealUseVo;
  }

  @ElVoField(physicalName = "cgsSealUseVo")
  public void setCgsSealUseVo(kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo cgsSealUseVo){
      this.cgsSealUseVo = cgsSealUseVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CgsSealUseListVo [");
      sb.append("cgsSealUseVoList").append("=").append(cgsSealUseVoList).append(",");
      sb.append("cgsSealUseVo").append("=").append(cgsSealUseVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; cgsSealUseVoList != null && i < cgsSealUseVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo)cgsSealUseVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.cgsSealUseVo != null ) this.cgsSealUseVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; cgsSealUseVoList != null && i < cgsSealUseVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo)cgsSealUseVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.cgsSealUseVo != null ) this.cgsSealUseVo._xStreamDec();

  }
  
}
