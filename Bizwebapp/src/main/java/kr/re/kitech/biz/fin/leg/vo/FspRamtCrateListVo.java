package kr.re.kitech.biz.fin.leg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspRamtCrateListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspRamtCrateListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "fspRamtCrateVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo> fspRamtCrateVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "fspRamtCrateVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo fspRamtCrateVo;
  
  @ElVoField(physicalName = "fspRamtCrateVoList")
    public java.util.List<kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo> getFspRamtCrateVoList(){
      return fspRamtCrateVoList;
  }

  @ElVoField(physicalName = "fspRamtCrateVoList")
  public void setFspRamtCrateVoList(java.util.List<kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo> fspRamtCrateVoList){
      this.fspRamtCrateVoList = fspRamtCrateVoList;
  }

  @ElVoField(physicalName = "fspRamtCrateVo")
    public kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo getFspRamtCrateVo(){
      return fspRamtCrateVo;
  }

  @ElVoField(physicalName = "fspRamtCrateVo")
  public void setFspRamtCrateVo(kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo fspRamtCrateVo){
      this.fspRamtCrateVo = fspRamtCrateVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FspRamtCrateListVo [");
      sb.append("fspRamtCrateVoList").append("=").append(fspRamtCrateVoList).append(",");
      sb.append("fspRamtCrateVo").append("=").append(fspRamtCrateVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; fspRamtCrateVoList != null && i < fspRamtCrateVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo vo = (kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo)fspRamtCrateVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.fspRamtCrateVo != null ) this.fspRamtCrateVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; fspRamtCrateVoList != null && i < fspRamtCrateVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo vo = (kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo)fspRamtCrateVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.fspRamtCrateVo != null ) this.fspRamtCrateVo._xStreamDec();

  }
  
}
