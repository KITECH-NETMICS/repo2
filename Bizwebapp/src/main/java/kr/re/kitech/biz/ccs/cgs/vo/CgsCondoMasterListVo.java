package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CgsCondoMasterListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CgsCondoMasterListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "cgsCondoMasterVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo> cgsCondoMasterVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "cgsCondoMasterVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo cgsCondoMasterVo;
  
  @ElVoField(physicalName = "cgsCondoMasterVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo> getCgsCondoMasterVoList(){
      return cgsCondoMasterVoList;
  }

  @ElVoField(physicalName = "cgsCondoMasterVoList")
  public void setCgsCondoMasterVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo> cgsCondoMasterVoList){
      this.cgsCondoMasterVoList = cgsCondoMasterVoList;
  }

  @ElVoField(physicalName = "cgsCondoMasterVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo getCgsCondoMasterVo(){
      return cgsCondoMasterVo;
  }

  @ElVoField(physicalName = "cgsCondoMasterVo")
  public void setCgsCondoMasterVo(kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo cgsCondoMasterVo){
      this.cgsCondoMasterVo = cgsCondoMasterVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CgsCondoMasterListVo [");
      sb.append("cgsCondoMasterVoList").append("=").append(cgsCondoMasterVoList).append(",");
      sb.append("cgsCondoMasterVo").append("=").append(cgsCondoMasterVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; cgsCondoMasterVoList != null && i < cgsCondoMasterVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo)cgsCondoMasterVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.cgsCondoMasterVo != null ) this.cgsCondoMasterVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; cgsCondoMasterVoList != null && i < cgsCondoMasterVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo)cgsCondoMasterVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.cgsCondoMasterVo != null ) this.cgsCondoMasterVo._xStreamDec();

  }
  
}
