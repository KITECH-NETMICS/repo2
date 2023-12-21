package kr.re.kitech.biz.res.exp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class ResRsAllowanceRateListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResRsAllowanceRateListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "resRsAllowanceRateVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo> resRsAllowanceRateVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "resRsAllowanceRateVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo resRsAllowanceRateVo;
  
  @ElVoField(physicalName = "resRsAllowanceRateVoList")
    public java.util.List<kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo> getResRsAllowanceRateVoList(){
      return resRsAllowanceRateVoList;
  }

  @ElVoField(physicalName = "resRsAllowanceRateVoList")
  public void setResRsAllowanceRateVoList(java.util.List<kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo> resRsAllowanceRateVoList){
      this.resRsAllowanceRateVoList = resRsAllowanceRateVoList;
  }

  @ElVoField(physicalName = "resRsAllowanceRateVo")
    public kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo getResRsAllowanceRateVo(){
      return resRsAllowanceRateVo;
  }

  @ElVoField(physicalName = "resRsAllowanceRateVo")
  public void setResRsAllowanceRateVo(kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo resRsAllowanceRateVo){
      this.resRsAllowanceRateVo = resRsAllowanceRateVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResRsAllowanceRateListVo [");
      sb.append("resRsAllowanceRateVoList").append("=").append(resRsAllowanceRateVoList).append(",");
      sb.append("resRsAllowanceRateVo").append("=").append(resRsAllowanceRateVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; resRsAllowanceRateVoList != null && i < resRsAllowanceRateVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo vo = (kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo)resRsAllowanceRateVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.resRsAllowanceRateVo != null ) this.resRsAllowanceRateVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; resRsAllowanceRateVoList != null && i < resRsAllowanceRateVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo vo = (kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo)resRsAllowanceRateVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.resRsAllowanceRateVo != null ) this.resRsAllowanceRateVo._xStreamDec();

  }
  
}
