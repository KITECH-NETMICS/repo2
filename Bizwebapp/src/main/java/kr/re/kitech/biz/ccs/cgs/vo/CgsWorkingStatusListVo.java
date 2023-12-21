package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CgsWorkingStatusListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CgsWorkingStatusListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "CgsWorkingStatusVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo> CgsWorkingStatusVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "CgsWorkingStatusVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo CgsWorkingStatusVo;
  
  @ElVoField(physicalName = "CgsWorkingStatusVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo> getCgsWorkingStatusVoList(){
      return CgsWorkingStatusVoList;
  }

  @ElVoField(physicalName = "CgsWorkingStatusVoList")
  public void setCgsWorkingStatusVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo> CgsWorkingStatusVoList){
      this.CgsWorkingStatusVoList = CgsWorkingStatusVoList;
  }

  @ElVoField(physicalName = "CgsWorkingStatusVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo getCgsWorkingStatusVo(){
      return CgsWorkingStatusVo;
  }

  @ElVoField(physicalName = "CgsWorkingStatusVo")
  public void setCgsWorkingStatusVo(kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo CgsWorkingStatusVo){
      this.CgsWorkingStatusVo = CgsWorkingStatusVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CgsWorkingStatusListVo [");
      sb.append("CgsWorkingStatusVoList").append("=").append(CgsWorkingStatusVoList).append(",");
      sb.append("CgsWorkingStatusVo").append("=").append(CgsWorkingStatusVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; CgsWorkingStatusVoList != null && i < CgsWorkingStatusVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo)CgsWorkingStatusVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.CgsWorkingStatusVo != null ) this.CgsWorkingStatusVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; CgsWorkingStatusVoList != null && i < CgsWorkingStatusVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo)CgsWorkingStatusVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.CgsWorkingStatusVo != null ) this.CgsWorkingStatusVo._xStreamDec();

  }
  
}
