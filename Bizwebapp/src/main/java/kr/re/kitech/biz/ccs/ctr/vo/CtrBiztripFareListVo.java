package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CtrBiztripFareListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CtrBiztripFareListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "CtrBiztripFareVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo> CtrBiztripFareVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "CtrBiztripFareVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo CtrBiztripFareVo;
  
  @ElVoField(physicalName = "CtrBiztripFareVoList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo> getCtrBiztripFareVoList(){
      return CtrBiztripFareVoList;
  }

  @ElVoField(physicalName = "CtrBiztripFareVoList")
  public void setCtrBiztripFareVoList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo> CtrBiztripFareVoList){
      this.CtrBiztripFareVoList = CtrBiztripFareVoList;
  }

  @ElVoField(physicalName = "CtrBiztripFareVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo getCtrBiztripFareVo(){
      return CtrBiztripFareVo;
  }

  @ElVoField(physicalName = "CtrBiztripFareVo")
  public void setCtrBiztripFareVo(kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo CtrBiztripFareVo){
      this.CtrBiztripFareVo = CtrBiztripFareVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CtrBiztripFareListVo [");
      sb.append("CtrBiztripFareVoList").append("=").append(CtrBiztripFareVoList).append(",");
      sb.append("CtrBiztripFareVo").append("=").append(CtrBiztripFareVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; CtrBiztripFareVoList != null && i < CtrBiztripFareVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo)CtrBiztripFareVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.CtrBiztripFareVo != null ) this.CtrBiztripFareVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; CtrBiztripFareVoList != null && i < CtrBiztripFareVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo)CtrBiztripFareVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.CtrBiztripFareVo != null ) this.CtrBiztripFareVo._xStreamDec();

  }
  
}
