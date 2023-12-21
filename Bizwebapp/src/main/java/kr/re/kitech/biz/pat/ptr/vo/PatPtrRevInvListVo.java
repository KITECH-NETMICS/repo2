package kr.re.kitech.biz.pat.ptr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPtrRevInvListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPtrRevInvListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPtrRevInvVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo> patPtrRevInvVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPtrRevInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo patPtrRevInvVo;
  
  @ElVoField(physicalName = "patPtrRevInvVoList")
    public java.util.List<kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo> getPatPtrRevInvVoList(){
      return patPtrRevInvVoList;
  }

  @ElVoField(physicalName = "patPtrRevInvVoList")
  public void setPatPtrRevInvVoList(java.util.List<kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo> patPtrRevInvVoList){
      this.patPtrRevInvVoList = patPtrRevInvVoList;
  }

  @ElVoField(physicalName = "patPtrRevInvVo")
    public kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo getPatPtrRevInvVo(){
      return patPtrRevInvVo;
  }

  @ElVoField(physicalName = "patPtrRevInvVo")
  public void setPatPtrRevInvVo(kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo patPtrRevInvVo){
      this.patPtrRevInvVo = patPtrRevInvVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPtrRevInvListVo [");
      sb.append("patPtrRevInvVoList").append("=").append(patPtrRevInvVoList).append(",");
      sb.append("patPtrRevInvVo").append("=").append(patPtrRevInvVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPtrRevInvVoList != null && i < patPtrRevInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo vo = (kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo)patPtrRevInvVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPtrRevInvVo != null ) this.patPtrRevInvVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPtrRevInvVoList != null && i < patPtrRevInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo vo = (kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo)patPtrRevInvVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPtrRevInvVo != null ) this.patPtrRevInvVo._xStreamDec();

  }
  
}
