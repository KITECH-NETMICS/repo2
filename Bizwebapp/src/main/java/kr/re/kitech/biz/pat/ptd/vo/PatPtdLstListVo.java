package kr.re.kitech.biz.pat.ptd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPtdLstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPtdLstListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPtdLstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo> patPtdLstVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPtdLstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo patPtdLstVo;
  
  @ElVoField(physicalName = "patPtdLstVoList")
    public java.util.List<kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo> getPatPtdLstVoList(){
      return patPtdLstVoList;
  }

  @ElVoField(physicalName = "patPtdLstVoList")
  public void setPatPtdLstVoList(java.util.List<kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo> patPtdLstVoList){
      this.patPtdLstVoList = patPtdLstVoList;
  }

  @ElVoField(physicalName = "patPtdLstVo")
    public kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo getPatPtdLstVo(){
      return patPtdLstVo;
  }

  @ElVoField(physicalName = "patPtdLstVo")
  public void setPatPtdLstVo(kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo patPtdLstVo){
      this.patPtdLstVo = patPtdLstVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPtdLstListVo [");
      sb.append("patPtdLstVoList").append("=").append(patPtdLstVoList).append(",");
      sb.append("patPtdLstVo").append("=").append(patPtdLstVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPtdLstVoList != null && i < patPtdLstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo vo = (kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo)patPtdLstVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPtdLstVo != null ) this.patPtdLstVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPtdLstVoList != null && i < patPtdLstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo vo = (kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo)patPtdLstVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPtdLstVo != null ) this.patPtdLstVo._xStreamDec();

  }
  
}
