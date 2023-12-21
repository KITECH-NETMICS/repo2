package kr.re.kitech.biz.pat.itd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatItdLstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatItdLstListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patItdLstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.itd.vo.PatItdLstVo> patItdLstVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patItdLstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.itd.vo.PatItdLstVo patItdLstVo;
  
  @ElVoField(physicalName = "patItdLstVoList")
    public java.util.List<kr.re.kitech.biz.pat.itd.vo.PatItdLstVo> getPatItdLstVoList(){
      return patItdLstVoList;
  }

  @ElVoField(physicalName = "patItdLstVoList")
  public void setPatItdLstVoList(java.util.List<kr.re.kitech.biz.pat.itd.vo.PatItdLstVo> patItdLstVoList){
      this.patItdLstVoList = patItdLstVoList;
  }

  @ElVoField(physicalName = "patItdLstVo")
    public kr.re.kitech.biz.pat.itd.vo.PatItdLstVo getPatItdLstVo(){
      return patItdLstVo;
  }

  @ElVoField(physicalName = "patItdLstVo")
  public void setPatItdLstVo(kr.re.kitech.biz.pat.itd.vo.PatItdLstVo patItdLstVo){
      this.patItdLstVo = patItdLstVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatItdLstListVo [");
      sb.append("patItdLstVoList").append("=").append(patItdLstVoList).append(",");
      sb.append("patItdLstVo").append("=").append(patItdLstVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patItdLstVoList != null && i < patItdLstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.itd.vo.PatItdLstVo vo = (kr.re.kitech.biz.pat.itd.vo.PatItdLstVo)patItdLstVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patItdLstVo != null ) this.patItdLstVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patItdLstVoList != null && i < patItdLstVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.itd.vo.PatItdLstVo vo = (kr.re.kitech.biz.pat.itd.vo.PatItdLstVo)patItdLstVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patItdLstVo != null ) this.patItdLstVo._xStreamDec();

  }
  
}
