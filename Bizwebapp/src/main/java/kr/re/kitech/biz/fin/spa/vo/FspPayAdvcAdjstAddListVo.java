package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspPayAdvcAdjstAddListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspPayAdvcAdjstAddListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "fspPayAdvcAdjstAddVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo> fspPayAdvcAdjstAddVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "fspPayAdvcAdjstAddVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo fspPayAdvcAdjstAddVo;
  
  @ElVoField(physicalName = "fspPayAdvcAdjstAddVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo> getFspPayAdvcAdjstAddVoList(){
      return fspPayAdvcAdjstAddVoList;
  }

  @ElVoField(physicalName = "fspPayAdvcAdjstAddVoList")
  public void setFspPayAdvcAdjstAddVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo> fspPayAdvcAdjstAddVoList){
      this.fspPayAdvcAdjstAddVoList = fspPayAdvcAdjstAddVoList;
  }

  @ElVoField(physicalName = "fspPayAdvcAdjstAddVo")
    public kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo getFspPayAdvcAdjstAddVo(){
      return fspPayAdvcAdjstAddVo;
  }

  @ElVoField(physicalName = "fspPayAdvcAdjstAddVo")
  public void setFspPayAdvcAdjstAddVo(kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo fspPayAdvcAdjstAddVo){
      this.fspPayAdvcAdjstAddVo = fspPayAdvcAdjstAddVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FspPayAdvcAdjstAddListVo [");
      sb.append("fspPayAdvcAdjstAddVoList").append("=").append(fspPayAdvcAdjstAddVoList).append(",");
      sb.append("fspPayAdvcAdjstAddVo").append("=").append(fspPayAdvcAdjstAddVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; fspPayAdvcAdjstAddVoList != null && i < fspPayAdvcAdjstAddVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo)fspPayAdvcAdjstAddVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.fspPayAdvcAdjstAddVo != null ) this.fspPayAdvcAdjstAddVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; fspPayAdvcAdjstAddVoList != null && i < fspPayAdvcAdjstAddVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo)fspPayAdvcAdjstAddVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.fspPayAdvcAdjstAddVo != null ) this.fspPayAdvcAdjstAddVo._xStreamDec();

  }
  
}
