package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FbaApartAccntReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FbaApartAccntReqListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "FbaApartAccntReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo> FbaApartAccntReqVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "FbaApartAccntReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo FbaApartAccntReqVo;
  
  @ElVoField(physicalName = "FbaApartAccntReqVoList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo> getFbaApartAccntReqVoList(){
      return FbaApartAccntReqVoList;
  }

  @ElVoField(physicalName = "FbaApartAccntReqVoList")
  public void setFbaApartAccntReqVoList(java.util.List<kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo> FbaApartAccntReqVoList){
      this.FbaApartAccntReqVoList = FbaApartAccntReqVoList;
  }

  @ElVoField(physicalName = "FbaApartAccntReqVo")
    public kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo getFbaApartAccntReqVo(){
      return FbaApartAccntReqVo;
  }

  @ElVoField(physicalName = "FbaApartAccntReqVo")
  public void setFbaApartAccntReqVo(kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo FbaApartAccntReqVo){
      this.FbaApartAccntReqVo = FbaApartAccntReqVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FbaApartAccntReqListVo [");
      sb.append("FbaApartAccntReqVoList").append("=").append(FbaApartAccntReqVoList).append(",");
      sb.append("FbaApartAccntReqVo").append("=").append(FbaApartAccntReqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; FbaApartAccntReqVoList != null && i < FbaApartAccntReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo vo = (kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo)FbaApartAccntReqVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.FbaApartAccntReqVo != null ) this.FbaApartAccntReqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; FbaApartAccntReqVoList != null && i < FbaApartAccntReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo vo = (kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo)FbaApartAccntReqVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.FbaApartAccntReqVo != null ) this.FbaApartAccntReqVo._xStreamDec();

  }
  
}
