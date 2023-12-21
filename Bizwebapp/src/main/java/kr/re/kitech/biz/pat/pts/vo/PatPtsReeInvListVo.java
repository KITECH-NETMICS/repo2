package kr.re.kitech.biz.pat.pts.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPtsReeInvListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPtsReeInvListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPtsReeInvVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo> patPtsReeInvVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPtsReeInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo patPtsReeInvVo;
  
  @ElVoField(physicalName = "patPtsReeInvVoList")
    public java.util.List<kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo> getPatPtsReeInvVoList(){
      return patPtsReeInvVoList;
  }

  @ElVoField(physicalName = "patPtsReeInvVoList")
  public void setPatPtsReeInvVoList(java.util.List<kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo> patPtsReeInvVoList){
      this.patPtsReeInvVoList = patPtsReeInvVoList;
  }

  @ElVoField(physicalName = "patPtsReeInvVo")
    public kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo getPatPtsReeInvVo(){
      return patPtsReeInvVo;
  }

  @ElVoField(physicalName = "patPtsReeInvVo")
  public void setPatPtsReeInvVo(kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo patPtsReeInvVo){
      this.patPtsReeInvVo = patPtsReeInvVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPtsReeInvListVo [");
      sb.append("patPtsReeInvVoList").append("=").append(patPtsReeInvVoList).append(",");
      sb.append("patPtsReeInvVo").append("=").append(patPtsReeInvVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPtsReeInvVoList != null && i < patPtsReeInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo vo = (kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo)patPtsReeInvVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPtsReeInvVo != null ) this.patPtsReeInvVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPtsReeInvVoList != null && i < patPtsReeInvVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo vo = (kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo)patPtsReeInvVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPtsReeInvVo != null ) this.patPtsReeInvVo._xStreamDec();

  }
  
}
