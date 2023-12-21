package kr.re.kitech.biz.pat.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatAppRightListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatAppRightListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "patAppRightVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.req.vo.PatAppRightVo> patAppRightVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "patAppRightVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.req.vo.PatAppRightVo patAppRightVo;
  
  @ElVoField(physicalName = "patAppRightVoList")
    public java.util.List<kr.re.kitech.biz.pat.req.vo.PatAppRightVo> getPatAppRightVoList(){
      return patAppRightVoList;
  }

  @ElVoField(physicalName = "patAppRightVoList")
  public void setPatAppRightVoList(java.util.List<kr.re.kitech.biz.pat.req.vo.PatAppRightVo> patAppRightVoList){
      this.patAppRightVoList = patAppRightVoList;
  }

  @ElVoField(physicalName = "patAppRightVo")
    public kr.re.kitech.biz.pat.req.vo.PatAppRightVo getPatAppRightVo(){
      return patAppRightVo;
  }

  @ElVoField(physicalName = "patAppRightVo")
  public void setPatAppRightVo(kr.re.kitech.biz.pat.req.vo.PatAppRightVo patAppRightVo){
      this.patAppRightVo = patAppRightVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatAppRightListVo [");
      sb.append("patAppRightVoList").append("=").append(patAppRightVoList).append(",");
      sb.append("patAppRightVo").append("=").append(patAppRightVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patAppRightVoList != null && i < patAppRightVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.req.vo.PatAppRightVo vo = (kr.re.kitech.biz.pat.req.vo.PatAppRightVo)patAppRightVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patAppRightVo != null ) this.patAppRightVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patAppRightVoList != null && i < patAppRightVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.req.vo.PatAppRightVo vo = (kr.re.kitech.biz.pat.req.vo.PatAppRightVo)patAppRightVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patAppRightVo != null ) this.patAppRightVo._xStreamDec();

  }
  
}
