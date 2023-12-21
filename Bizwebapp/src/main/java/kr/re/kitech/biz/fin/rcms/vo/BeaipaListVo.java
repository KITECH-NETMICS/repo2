package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class BeaipaListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public BeaipaListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "BeaipaVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.BeaipaVo> BeaipaVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "BeaipaVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.BeaipaVo BeaipaVo;
  
  @ElVoField(physicalName = "BeaipaVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.BeaipaVo> getBeaipaVoList(){
      return BeaipaVoList;
  }

  @ElVoField(physicalName = "BeaipaVoList")
  public void setBeaipaVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.BeaipaVo> BeaipaVoList){
      this.BeaipaVoList = BeaipaVoList;
  }

  @ElVoField(physicalName = "BeaipaVo")
    public kr.re.kitech.biz.fin.rcms.vo.BeaipaVo getBeaipaVo(){
      return BeaipaVo;
  }

  @ElVoField(physicalName = "BeaipaVo")
  public void setBeaipaVo(kr.re.kitech.biz.fin.rcms.vo.BeaipaVo BeaipaVo){
      this.BeaipaVo = BeaipaVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("BeaipaListVo [");
      sb.append("BeaipaVoList").append("=").append(BeaipaVoList).append(",");
      sb.append("BeaipaVo").append("=").append(BeaipaVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; BeaipaVoList != null && i < BeaipaVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.BeaipaVo vo = (kr.re.kitech.biz.fin.rcms.vo.BeaipaVo)BeaipaVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.BeaipaVo != null ) this.BeaipaVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; BeaipaVoList != null && i < BeaipaVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.BeaipaVo vo = (kr.re.kitech.biz.fin.rcms.vo.BeaipaVo)BeaipaVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.BeaipaVo != null ) this.BeaipaVo._xStreamDec();

  }
  
}
