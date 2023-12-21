package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CgsCertfUseListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CgsCertfUseListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "cgsCertfUseVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo> cgsCertfUseVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "cgsCertfUseVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo cgsCertfUseVo;
  
  @ElVoField(physicalName = "cgsCertfUseVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo> getCgsCertfUseVoList(){
      return cgsCertfUseVoList;
  }

  @ElVoField(physicalName = "cgsCertfUseVoList")
  public void setCgsCertfUseVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo> cgsCertfUseVoList){
      this.cgsCertfUseVoList = cgsCertfUseVoList;
  }

  @ElVoField(physicalName = "cgsCertfUseVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo getCgsCertfUseVo(){
      return cgsCertfUseVo;
  }

  @ElVoField(physicalName = "cgsCertfUseVo")
  public void setCgsCertfUseVo(kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo cgsCertfUseVo){
      this.cgsCertfUseVo = cgsCertfUseVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CgsCertfUseListVo [");
      sb.append("cgsCertfUseVoList").append("=").append(cgsCertfUseVoList).append(",");
      sb.append("cgsCertfUseVo").append("=").append(cgsCertfUseVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; cgsCertfUseVoList != null && i < cgsCertfUseVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo)cgsCertfUseVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.cgsCertfUseVo != null ) this.cgsCertfUseVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; cgsCertfUseVoList != null && i < cgsCertfUseVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo)cgsCertfUseVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.cgsCertfUseVo != null ) this.cgsCertfUseVo._xStreamDec();

  }
  
}
