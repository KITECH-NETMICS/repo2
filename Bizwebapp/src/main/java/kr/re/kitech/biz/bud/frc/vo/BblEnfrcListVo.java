package kr.re.kitech.biz.bud.frc.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class BblEnfrcListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public BblEnfrcListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "bblEnfrcVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo> bblEnfrcVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "bblEnfrcVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo bblEnfrcVo;
  
  @ElVoField(physicalName = "bblEnfrcVoList")
    public java.util.List<kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo> getBblEnfrcVoList(){
      return bblEnfrcVoList;
  }

  @ElVoField(physicalName = "bblEnfrcVoList")
  public void setBblEnfrcVoList(java.util.List<kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo> bblEnfrcVoList){
      this.bblEnfrcVoList = bblEnfrcVoList;
  }

  @ElVoField(physicalName = "bblEnfrcVo")
    public kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo getBblEnfrcVo(){
      return bblEnfrcVo;
  }

  @ElVoField(physicalName = "bblEnfrcVo")
  public void setBblEnfrcVo(kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo bblEnfrcVo){
      this.bblEnfrcVo = bblEnfrcVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("BblEnfrcListVo [");
      sb.append("bblEnfrcVoList").append("=").append(bblEnfrcVoList).append(",");
      sb.append("bblEnfrcVo").append("=").append(bblEnfrcVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; bblEnfrcVoList != null && i < bblEnfrcVoList.size() ; i++ ) {
        kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo vo = (kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo)bblEnfrcVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.bblEnfrcVo != null ) this.bblEnfrcVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; bblEnfrcVoList != null && i < bblEnfrcVoList.size() ; i++ ) {
        kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo vo = (kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo)bblEnfrcVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.bblEnfrcVo != null ) this.bblEnfrcVo._xStreamDec();

  }
  
}
