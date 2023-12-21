package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class HumPotletGetDepartmentListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumPotletGetDepartmentListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "HumPotletGetDepartmentVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo> HumPotletGetDepartmentVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "HumPotletGetDepartmentVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo HumPotletGetDepartmentVo;
  
  @ElVoField(physicalName = "HumPotletGetDepartmentVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo> getHumPotletGetDepartmentVoList(){
      return HumPotletGetDepartmentVoList;
  }

  @ElVoField(physicalName = "HumPotletGetDepartmentVoList")
  public void setHumPotletGetDepartmentVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo> HumPotletGetDepartmentVoList){
      this.HumPotletGetDepartmentVoList = HumPotletGetDepartmentVoList;
  }

  @ElVoField(physicalName = "HumPotletGetDepartmentVo")
    public kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo getHumPotletGetDepartmentVo(){
      return HumPotletGetDepartmentVo;
  }

  @ElVoField(physicalName = "HumPotletGetDepartmentVo")
  public void setHumPotletGetDepartmentVo(kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo HumPotletGetDepartmentVo){
      this.HumPotletGetDepartmentVo = HumPotletGetDepartmentVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumPotletGetDepartmentListVo [");
      sb.append("HumPotletGetDepartmentVoList").append("=").append(HumPotletGetDepartmentVoList).append(",");
      sb.append("HumPotletGetDepartmentVo").append("=").append(HumPotletGetDepartmentVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; HumPotletGetDepartmentVoList != null && i < HumPotletGetDepartmentVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo vo = (kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo)HumPotletGetDepartmentVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.HumPotletGetDepartmentVo != null ) this.HumPotletGetDepartmentVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; HumPotletGetDepartmentVoList != null && i < HumPotletGetDepartmentVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo vo = (kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo)HumPotletGetDepartmentVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.HumPotletGetDepartmentVo != null ) this.HumPotletGetDepartmentVo._xStreamDec();

  }
  
}
