package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspTechSuphExcelListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FspTechSuphExcelListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "fspTechSuphExcelVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo> fspTechSuphExcelVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "fspTechSuphExcelVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo fspTechSuphExcelVo;
  
  @ElVoField(physicalName = "fspTechSuphExcelVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo> getFspTechSuphExcelVoList(){
      return fspTechSuphExcelVoList;
  }

  @ElVoField(physicalName = "fspTechSuphExcelVoList")
  public void setFspTechSuphExcelVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo> fspTechSuphExcelVoList){
      this.fspTechSuphExcelVoList = fspTechSuphExcelVoList;
  }

  @ElVoField(physicalName = "fspTechSuphExcelVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo getFspTechSuphExcelVo(){
      return fspTechSuphExcelVo;
  }

  @ElVoField(physicalName = "fspTechSuphExcelVo")
  public void setFspTechSuphExcelVo(kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo fspTechSuphExcelVo){
      this.fspTechSuphExcelVo = fspTechSuphExcelVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FspTechSuphExcelListVo [");
      sb.append("fspTechSuphExcelVoList").append("=").append(fspTechSuphExcelVoList).append(",");
      sb.append("fspTechSuphExcelVo").append("=").append(fspTechSuphExcelVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; fspTechSuphExcelVoList != null && i < fspTechSuphExcelVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo)fspTechSuphExcelVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.fspTechSuphExcelVo != null ) this.fspTechSuphExcelVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; fspTechSuphExcelVoList != null && i < fspTechSuphExcelVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo)fspTechSuphExcelVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.fspTechSuphExcelVo != null ) this.fspTechSuphExcelVo._xStreamDec();

  }
  
}
